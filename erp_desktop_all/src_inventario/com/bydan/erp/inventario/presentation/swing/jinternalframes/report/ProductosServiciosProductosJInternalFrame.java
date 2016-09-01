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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.inventario.util.report.ProductosServiciosProductosConstantesFunciones;

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
public class ProductosServiciosProductosJInternalFrame extends ProductosServiciosProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductosServiciosProductos;
	
	protected JMenuBar jmenuBarProductosServiciosProductos;
	
	protected JMenu jmenuProductosServiciosProductos;
	protected JMenu jmenuDatosProductosServiciosProductos;
	protected JMenu jmenuArchivoProductosServiciosProductos;
	protected JMenu jmenuAccionesProductosServiciosProductos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosServiciosProductos;	
	protected GridBagConstraints gridBagConstraintsProductosServiciosProductos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosServiciosProductosDetalleFormJInternalFrame jInternalFrameDetalleFormProductosServiciosProductos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductosServiciosProductos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductosServiciosProductos;	
	
	
	
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

	protected TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicio="";
	
	public ProductosServiciosProductosSessionBean productosserviciosproductosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductosServiciosProductos> productosserviciosproductoss;		
	public List<ProductosServiciosProductos> productosserviciosproductossEliminados;	
	public List<ProductosServiciosProductos> productosserviciosproductossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductosServiciosProductos;		
	protected JButton jButtonAbrirOrderByProductosServiciosProductos;
	
	
	//protected JPanel jPanelOrderByProductosServiciosProductos;
	//public JScrollPane jScrollPanelOrderByProductosServiciosProductos;	
	//protected JButton jButtonCerrarOrderByProductosServiciosProductos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosServiciosProductosLogic productosserviciosproductosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductosServiciosProductos;
	public JScrollPane jScrollPanelDatosEdicionProductosServiciosProductos;
	public JScrollPane jScrollPanelDatosGeneralProductosServiciosProductos;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosServiciosProductosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductosServiciosProductos;
	//public JScrollPane jScrollPanelImportacionProductosServiciosProductos;
	
	
	
	protected JPanel jPanelAccionesProductosServiciosProductos;
	
    protected JPanel jPanelPaginacionProductosServiciosProductos;
    protected JPanel jPanelParametrosReportesProductosServiciosProductos;
	protected JPanel jPanelParametrosReportesAccionesProductosServiciosProductos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductosServiciosProductos;
	protected JPanel jPanelParametrosAuxiliar2ProductosServiciosProductos;
	protected JPanel jPanelParametrosAuxiliar3ProductosServiciosProductos;
	protected JPanel jPanelParametrosAuxiliar4ProductosServiciosProductos;
	//protected JPanel jPanelParametrosAuxiliar5ProductosServiciosProductos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductosServiciosProductos;
	//protected JPanel jPanelImportacionProductosServiciosProductos;
	
	
	public JTable jTableDatosProductosServiciosProductos;
	
	
	
	//public JTable jTableDatosProductosServiciosProductosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductosServiciosProductos;
	protected JButton jButtonDuplicarProductosServiciosProductos;
	protected JButton jButtonCopiarProductosServiciosProductos;
	protected JButton jButtonVerFormProductosServiciosProductos;
	protected JButton jButtonNuevoRelacionesProductosServiciosProductos;
	protected JButton jButtonModificarProductosServiciosProductos;
	
    protected JButton jButtonGuardarCambiosTablaProductosServiciosProductos;
	protected JButton jButtonCerrarProductosServiciosProductos;
	
	
	protected JButton jButtonRecargarInformacionProductosServiciosProductos;
	protected JButton jButtonProcesarInformacionProductosServiciosProductos;
	
	
	protected JButton jButtonAnterioresProductosServiciosProductos;
	protected JButton jButtonSiguientesProductosServiciosProductos;
	protected JButton jButtonNuevoGuardarCambiosProductosServiciosProductos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductosServiciosProductos;
	//protected JButton jButtonCerrarReporteDinamicoProductosServiciosProductos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductosServiciosProductos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductosServiciosProductos;
	//protected JButton jButtonGenerarImportacionProductosServiciosProductos;
	//protected JButton jButtonCerrarImportacionProductosServiciosProductos;
	//protected JFileChooser jFileChooserImportacionProductosServiciosProductos;
	//protected File fileImportacionProductosServiciosProductos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosServiciosProductos;
	protected JButton jButtonDuplicarToolBarProductosServiciosProductos;
	protected JButton jButtonNuevoRelacionesToolBarProductosServiciosProductos;
	
	
	public JButton jButtonGuardarCambiosToolBarProductosServiciosProductos;
	protected JButton jButtonCopiarToolBarProductosServiciosProductos;
	protected JButton jButtonVerFormToolBarProductosServiciosProductos;
	public JButton jButtonGuardarCambiosTablaToolBarProductosServiciosProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosServiciosProductos;
	protected JButton jButtonCerrarToolBarProductosServiciosProductos;
	
	protected JButton jButtonRecargarInformacionToolBarProductosServiciosProductos;
	protected JButton jButtonProcesarInformacionToolBarProductosServiciosProductos;
	protected JButton jButtonAnterioresToolBarProductosServiciosProductos;
	protected JButton jButtonSiguientesToolBarProductosServiciosProductos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductosServiciosProductos;
	protected JButton jButtonAbrirOrderByToolBarProductosServiciosProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosServiciosProductos;
	protected JMenuItem jMenuItemDuplicarProductosServiciosProductos;
	protected JMenuItem jMenuItemNuevoRelacionesProductosServiciosProductos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductosServiciosProductos;
	protected JMenuItem jMenuItemCopiarProductosServiciosProductos;
	protected JMenuItem jMenuItemVerFormProductosServiciosProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosServiciosProductos;
	protected JMenuItem jMenuItemCerrarProductosServiciosProductos;
	protected JMenuItem jMenuItemDetalleCerrarProductosServiciosProductos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductosServiciosProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosServiciosProductos;
	
	protected JMenuItem jMenuItemRecargarInformacionProductosServiciosProductos;
	protected JMenuItem jMenuItemProcesarInformacionProductosServiciosProductos;
	protected JMenuItem jMenuItemAnterioresProductosServiciosProductos;
	protected JMenuItem jMenuItemSiguientesProductosServiciosProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosServiciosProductos;
	protected JMenuItem jMenuItemAbrirOrderByProductosServiciosProductos;
	protected JMenuItem jMenuItemMostrarOcultarProductosServiciosProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosServiciosProductos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductosServiciosProductos;
	protected JCheckBox jCheckBoxSeleccionadosProductosServiciosProductos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductosServiciosProductos;
	protected JCheckBox jCheckBoxConGraficoReporteProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductosServiciosProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductosServiciosProductos;
	protected JTextField jTextFieldValorCampoGeneralProductosServiciosProductos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductosServiciosProductos;
	//public JList<Reporte> jListColumnasSelectReporteProductosServiciosProductos;
	//public JScrollPane jScrollColumnasSelectReporteProductosServiciosProductos;
	
	//public JLabel jLabelRelacionesSelectReporteProductosServiciosProductos;
	//public JList<Reporte> jListRelacionesSelectReporteProductosServiciosProductos;
	//public JScrollPane jScrollRelacionesSelectReporteProductosServiciosProductos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductosServiciosProductos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductosServiciosProductos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductosServiciosProductos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductosServiciosProductos;
	
		
	//public JLabel jLabelArchivoImportacionProductosServiciosProductos;	
	//public JLabel jLabelPathArchivoImportacionProductosServiciosProductos;
	//protected JTextField jTextFieldPathArchivoImportacionProductosServiciosProductos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductosServiciosProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductosServiciosProductos;
	
	//public JLabel jLabelColumnaCategoriaValorProductosServiciosProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductosServiciosProductos;
	
	//public JLabel jLabelColumnasValoresGraficoProductosServiciosProductos;
	//public JList<Reporte> jListColumnasValoresGraficoProductosServiciosProductos;
	//public JScrollPane jScrollColumnasValoresGraficoProductosServiciosProductos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductosServiciosProductos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductosServiciosProductos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductosServiciosProductos;
	public JPanel jPanelBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JButton jButtonBusquedaProductosServiciosProductosProductosServiciosProductos;
	
	public JPanel jPanelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JLabel jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JButton jButtonid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JLabel jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JButton jButtonid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosServiciosProductosProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosServiciosProductosProductosServiciosProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JLabel jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JLabel jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JLabel jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JLabel jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos;
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductosServiciosProductosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosProductosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosProductosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosProductosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductosServiciosProductos)	{
		this.jButtonRecargarInformacionProductosServiciosProductos = jButtonRecargarInformacionProductosServiciosProductos;
	}
	
	public JButton getjButtonProcesarInformacionProductosServiciosProductos() {
		return this.jButtonProcesarInformacionProductosServiciosProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosServiciosProductos)	{
		this.jButtonProcesarInformacionProductosServiciosProductos = jButtonProcesarInformacionProductosServiciosProductos;
	}
	
	
	public JButton getjButtonRecargarInformacionProductosServiciosProductos() {
		return this.jButtonRecargarInformacionProductosServiciosProductos;
	}
	
	
	public List<ProductosServiciosProductos> getproductosserviciosproductoss() {
		return this.productosserviciosproductoss;
	}

	public void setproductosserviciosproductoss(List<ProductosServiciosProductos> productosserviciosproductoss) {
		this.productosserviciosproductoss = productosserviciosproductoss;
	}
	
	public List<ProductosServiciosProductos> getproductosserviciosproductossAux() {
		return this.productosserviciosproductossAux;
	}

	public void setproductosserviciosproductossAux(List<ProductosServiciosProductos> productosserviciosproductossAux) {
		this.productosserviciosproductossAux = productosserviciosproductossAux;
	}
	
	public List<ProductosServiciosProductos> getproductosserviciosproductossEliminados() {
		return this.productosserviciosproductossEliminados;
	}

	public void setProductosServiciosProductossEliminados(List<ProductosServiciosProductos> productosserviciosproductossEliminados) {
		this.productosserviciosproductossEliminados = productosserviciosproductossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductosServiciosProductos() {
		return jComboBoxTiposSeleccionarProductosServiciosProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductosServiciosProductos(
			JComboBox jComboBoxTiposSeleccionarProductosServiciosProductos) {
		this.jComboBoxTiposSeleccionarProductosServiciosProductos = jComboBoxTiposSeleccionarProductosServiciosProductos;
	}
	
	public void setBorderResaltarTiposSeleccionarProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductosServiciosProductos() {
		return jTextFieldValorCampoGeneralProductosServiciosProductos;
	}

	public void setjTextFieldValorCampoGeneralProductosServiciosProductos(
			JTextField jTextFieldValorCampoGeneralProductosServiciosProductos) {
		this.jTextFieldValorCampoGeneralProductosServiciosProductos = jTextFieldValorCampoGeneralProductosServiciosProductos;
	}

	public void setBorderResaltarValorCampoGeneralProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductosServiciosProductos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductosServiciosProductos() {
		return this.jCheckBoxSeleccionarTodosProductosServiciosProductos;
	}

	public void setjCheckBoxSeleccionarTodosProductosServiciosProductos(
			JCheckBox jCheckBoxSeleccionarTodosProductosServiciosProductos) {
		this.jCheckBoxSeleccionarTodosProductosServiciosProductos = jCheckBoxSeleccionarTodosProductosServiciosProductos;
	}

	public void setBorderResaltarSeleccionarTodosProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductosServiciosProductos() {
		return this.jCheckBoxSeleccionadosProductosServiciosProductos;
	}

	public void setjCheckBoxSeleccionadosProductosServiciosProductos(
			JCheckBox jCheckBoxSeleccionadosProductosServiciosProductos) {
		this.jCheckBoxSeleccionadosProductosServiciosProductos = jCheckBoxSeleccionadosProductosServiciosProductos;
	}
	
	public void setBorderResaltarSeleccionadosProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductosServiciosProductos() {
		return this.jComboBoxTiposArchivosReportesProductosServiciosProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductosServiciosProductos(
			JComboBox jComboBoxTiposArchivosReportesProductosServiciosProductos) {
		this.jComboBoxTiposArchivosReportesProductosServiciosProductos = jComboBoxTiposArchivosReportesProductosServiciosProductos;
	}

	public void setBorderResaltarTiposArchivosReportesProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductosServiciosProductos() {
		return this.jComboBoxTiposReportesProductosServiciosProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductosServiciosProductos(
			JComboBox jComboBoxTiposReportesProductosServiciosProductos) {
		this.jComboBoxTiposReportesProductosServiciosProductos = jComboBoxTiposReportesProductosServiciosProductos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductosServiciosProductos() {
	//	return jComboBoxTiposReportesDinamicoProductosServiciosProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductosServiciosProductos(
	//		JComboBox jComboBoxTiposReportesDinamicoProductosServiciosProductos) {
	//	this.jComboBoxTiposReportesDinamicoProductosServiciosProductos = jComboBoxTiposReportesDinamicoProductosServiciosProductos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos = jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos;
	//}
	
	public void setBorderResaltarTiposReportesProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductosServiciosProductos() {
		return this.jComboBoxTiposGraficosReportesProductosServiciosProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductosServiciosProductos(
			JComboBox jComboBoxTiposGraficosReportesProductosServiciosProductos) {
		this.jComboBoxTiposGraficosReportesProductosServiciosProductos = jComboBoxTiposGraficosReportesProductosServiciosProductos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductosServiciosProductos() {
		return this.jComboBoxTiposPaginacionProductosServiciosProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductosServiciosProductos(
			JComboBox jComboBoxTiposPaginacionProductosServiciosProductos) {
		this.jComboBoxTiposPaginacionProductosServiciosProductos = jComboBoxTiposPaginacionProductosServiciosProductos;
	}
	
	public void setBorderResaltarTiposPaginacionProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductosServiciosProductos() {
		return this.jComboBoxTiposRelacionesProductosServiciosProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosServiciosProductos() {
		return this.jComboBoxTiposAccionesProductosServiciosProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosServiciosProductos(
			JComboBox jComboBoxTiposRelacionesProductosServiciosProductos) {
		this.jComboBoxTiposRelacionesProductosServiciosProductos = jComboBoxTiposRelacionesProductosServiciosProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosServiciosProductos(
			JComboBox jComboBoxTiposAccionesProductosServiciosProductos) {
		this.jComboBoxTiposAccionesProductosServiciosProductos = jComboBoxTiposAccionesProductosServiciosProductos;
	}
	
	public void setBorderResaltarTiposRelacionesProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductosServiciosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductosServiciosProductos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductosServiciosProductos() {
	//	return jCheckBoxConGraficoDinamicoProductosServiciosProductos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductosServiciosProductos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductosServiciosProductos) {
	//	this.jCheckBoxConGraficoDinamicoProductosServiciosProductos = jCheckBoxConGraficoDinamicoProductosServiciosProductos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductosServiciosProductos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductosServiciosProductos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductosServiciosProductos .setBorder(borderResaltar);		
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
		this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
		
		this.productosserviciosproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciosproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosserviciosproductosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosServiciosProductosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosServiciosProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosServiciosProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosServiciosProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosServiciosProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Servicios Productos MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosServiciosProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductosServiciosProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductosServiciosProductos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"nuevo","nuevo","Nuevo"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"duplicar","duplicar","Duplicar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"copiar","copiar","Copiar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"ver_form","ver_form","Ver"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"recargar","recargar","Buscar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductosServiciosProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,
							"cerrar","cerrar","Salir"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductosServiciosProductos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductosServiciosProductos;
			
				this.jButtonProcesarInformacionToolBarProductosServiciosProductos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductosServiciosProductos;
				
		//protected JButton jButtonModificarToolBarProductosServiciosProductos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductosServiciosProductos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductosServiciosProductos=new JMenuMe("General");
		this.jmenuArchivoProductosServiciosProductos=new JMenuMe("Archivo");
		this.jmenuAccionesProductosServiciosProductos=new JMenuMe("Acciones");
		this.jmenuDatosProductosServiciosProductos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosServiciosProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosServiciosProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosServiciosProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductosServiciosProductos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductosServiciosProductos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductosServiciosProductos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductosServiciosProductos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductosServiciosProductos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductosServiciosProductos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductosServiciosProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosServiciosProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosServiciosProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductosServiciosProductos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductosServiciosProductos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductosServiciosProductos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductosServiciosProductos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductosServiciosProductos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductosServiciosProductos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductosServiciosProductos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductosServiciosProductos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductosServiciosProductos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosServiciosProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosServiciosProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosServiciosProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductosServiciosProductos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductosServiciosProductos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductosServiciosProductos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductosServiciosProductos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductosServiciosProductos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductosServiciosProductos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductosServiciosProductos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductosServiciosProductos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductosServiciosProductos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductosServiciosProductos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductosServiciosProductos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductosServiciosProductos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductosServiciosProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductosServiciosProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductosServiciosProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosServiciosProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosServiciosProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosServiciosProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductosServiciosProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductosServiciosProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductosServiciosProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosServiciosProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosServiciosProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosServiciosProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductosServiciosProductos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductosServiciosProductos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductosServiciosProductos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductosServiciosProductos.add(this.jMenuItemCerrarProductosServiciosProductos);
			
			this.jmenuAccionesProductosServiciosProductos.add(this.jMenuItemNuevoProductosServiciosProductos);
			this.jmenuAccionesProductosServiciosProductos.add(this.jMenuItemNuevoGuardarCambiosProductosServiciosProductos);
			this.jmenuAccionesProductosServiciosProductos.add(this.jMenuItemNuevoRelacionesProductosServiciosProductos);
			this.jmenuAccionesProductosServiciosProductos.add(this.jMenuItemGuardarCambiosTablaProductosServiciosProductos);		
			this.jmenuAccionesProductosServiciosProductos.add(this.jMenuItemDuplicarProductosServiciosProductos);		
			this.jmenuAccionesProductosServiciosProductos.add(this.jMenuItemCopiarProductosServiciosProductos);		
			this.jmenuAccionesProductosServiciosProductos.add(this.jMenuItemVerFormProductosServiciosProductos);		
			
			this.jmenuDatosProductosServiciosProductos.add(this.jMenuItemRecargarInformacionProductosServiciosProductos);				
			this.jmenuDatosProductosServiciosProductos.add(this.jMenuItemAnterioresProductosServiciosProductos);				
			this.jmenuDatosProductosServiciosProductos.add(this.jMenuItemSiguientesProductosServiciosProductos);				
			this.jmenuDatosProductosServiciosProductos.add(this.jMenuItemAbrirOrderByProductosServiciosProductos);				
			this.jmenuDatosProductosServiciosProductos.add(this.jMenuItemMostrarOcultarProductosServiciosProductos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductosServiciosProductos.add(this.jMenuItemGuardarCambiosProductosServiciosProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductosServiciosProductos.add(this.jmenuArchivoProductosServiciosProductos);		
			this.jmenuBarProductosServiciosProductos.add(this.jmenuAccionesProductosServiciosProductos);		
			this.jmenuBarProductosServiciosProductos.add(this.jmenuDatosProductosServiciosProductos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductosServiciosProductos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductosServiciosProductos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosServiciosProductosProductosServiciosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");
		this.jButtonBusquedaProductosServiciosProductosProductosServiciosProductos= new JButtonMe();
		this.jButtonBusquedaProductosServiciosProductosProductosServiciosProductos.setText("Buscar");
		this.jButtonBusquedaProductosServiciosProductosProductosServiciosProductos.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosServiciosProductosProductosServiciosProductos,"buscar_button","Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosServiciosProductosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos = new JLabelMe();
		jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setText("Bodega :");
		jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos = new JLabelMe();
		jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setText("Linea :");
		jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setToolTipText("Linea");
		jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos = new JLabelMe();
		jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos = new JLabelMe();
		jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos = new JLabelMe();
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setText("Tipo Producto Servicio :");
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setToolTipText("Tipo Producto Servicio");
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductosServiciosProductos=new JTabbedPane();


		this.jTabbedPaneBusquedasProductosServiciosProductos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProductosServiciosProductos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProductosServiciosProductos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductosServiciosProductos = new ProductosServiciosProductosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos Servicios Productos DATOS");
			this.jInternalFrameDetalleFormProductosServiciosProductos = new ProductosServiciosProductosDetalleFormJInternalFrame(jDesktopPane,this.productosserviciosproductosSessionBean.getConGuardarRelaciones(),this.productosserviciosproductosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductosServiciosProductos = null;//new ProductosServiciosProductosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosServiciosProductos= new GridBagLayout();
		
		
		this.jTableDatosProductosServiciosProductos = new JTableMe();      
		
		String sToolTipProductosServiciosProductos="";
		sToolTipProductosServiciosProductos=ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosServiciosProductos+="(Inventario.ProductosServiciosProductos)";
		}
		
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosServiciosProductos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductosServiciosProductos.setToolTipText(sToolTipProductosServiciosProductos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductosServiciosProductos);
		this.jTableDatosProductosServiciosProductos.setAutoCreateRowSorter(true);
		this.jTableDatosProductosServiciosProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductosServiciosProductos.setRowSelectionAllowed(true);
		this.jTableDatosProductosServiciosProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductosServiciosProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductosServiciosProductos = new JButtonMe();
		this.jButtonDuplicarProductosServiciosProductos = new JButtonMe();
		this.jButtonCopiarProductosServiciosProductos = new JButtonMe();
		this.jButtonVerFormProductosServiciosProductos = new JButtonMe();
		this.jButtonNuevoRelacionesProductosServiciosProductos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosProductos = new JButtonMe();
		this.jButtonCerrarProductosServiciosProductos = new JButtonMe();
		
		this.jScrollPanelDatosProductosServiciosProductos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductosServiciosProductos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Servicios Productos";
		
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosServiciosProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosServiciosProductos.setToolTipText("Acciones");
        this.jPanelAccionesProductosServiciosProductos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductosServiciosProductos=new ReporteDinamicoJInternalFrame(ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductosServiciosProductos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductosServiciosProductos=new ImportacionJInternalFrame(ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductosServiciosProductos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductosServiciosProductos = new JButtonMe();
		
		this.jButtonAbrirOrderByProductosServiciosProductos.setText("Orden");
		this.jButtonAbrirOrderByProductosServiciosProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosServiciosProductos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosServiciosProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosProductos,false,this);
			
			//this.cargarOrderByProductosServiciosProductos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosServiciosProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosProductos,true,this);
			
			//this.cargarOrderByProductosServiciosProductos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductosServiciosProductos.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosProductosServiciosProductos.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosProductosServiciosProductos.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosProductosServiciosProductos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosServiciosProductos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosServiciosProductos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductosServiciosProductos.setText("Nuevo");
		this.jButtonDuplicarProductosServiciosProductos.setText("Duplicar");
		this.jButtonCopiarProductosServiciosProductos.setText("Copiar");
		this.jButtonVerFormProductosServiciosProductos.setText("Ver");
		this.jButtonNuevoRelacionesProductosServiciosProductos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.setText("Guardar");
		this.jButtonCerrarProductosServiciosProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosServiciosProductos,"nuevo_button","Nuevo",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductosServiciosProductos,"duplicar_button","Duplicar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductosServiciosProductos,"copiar_button","Copiar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductosServiciosProductos,"ver_form","Ver",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductosServiciosProductos,"nuevorelaciones_button","Nuevo Rel",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosServiciosProductos,"guardarcambiostabla_button","Guardar",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosServiciosProductos,"cerrar_button","Salir",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductosServiciosProductos.setToolTipText("Nuevo"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductosServiciosProductos.setToolTipText("Duplicar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductosServiciosProductos.setToolTipText("Copiar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductosServiciosProductos.setToolTipText("Ver"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductosServiciosProductos.setToolTipText("Nuevo Rel"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.setToolTipText("Guardar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosServiciosProductos.setToolTipText("Salir"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosServiciosProductos";
		inputMap = this.jButtonNuevoProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosServiciosProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosServiciosProductos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductosServiciosProductos";
		inputMap = this.jButtonDuplicarProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductosServiciosProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductosServiciosProductos"));
		
		//COPIAR
		sMapKey = "CopiarProductosServiciosProductos";
		inputMap = this.jButtonCopiarProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductosServiciosProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductosServiciosProductos"));
		
		//VEr FORM
		sMapKey = "VerFormProductosServiciosProductos";
		inputMap = this.jButtonVerFormProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductosServiciosProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductosServiciosProductos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductosServiciosProductos";
		inputMap = this.jButtonNuevoRelacionesProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductosServiciosProductos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductosServiciosProductos";
		inputMap = this.jButtonModificarProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductosServiciosProductos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductosServiciosProductos";
		inputMap = this.jButtonCerrarProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosServiciosProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosServiciosProductos";
		inputMap = this.jButtonGuardarCambiosTablaProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosServiciosProductos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductosServiciosProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductosServiciosProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductosServiciosProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductosServiciosProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductosServiciosProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductosServiciosProductos.setName("jPanelParametrosReportesProductosServiciosProductos"); 
		
		this.jPanelParametrosReportesAccionesProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductosServiciosProductos.setName("jPanelParametrosReportesAccionesProductosServiciosProductos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductosServiciosProductos = new JButtonMe();
		this.jButtonRecargarInformacionProductosServiciosProductos.setText("Buscar");
		this.jButtonRecargarInformacionProductosServiciosProductos.setToolTipText("Buscar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductosServiciosProductos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductosServiciosProductos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductosServiciosProductos = new JButtonMe();
		this.jButtonProcesarInformacionProductosServiciosProductos.setText("Procesar");
		this.jButtonProcesarInformacionProductosServiciosProductos.setToolTipText("Procesar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductosServiciosProductos.setVisible(false);
			
		this.jButtonProcesarInformacionProductosServiciosProductos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosServiciosProductos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosServiciosProductos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosProductos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductosServiciosProductos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosProductos.setText("TIPO");       
		this.jComboBoxTiposReportesProductosServiciosProductos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosProductos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductosServiciosProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductosServiciosProductos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductosServiciosProductos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductosServiciosProductos.setText("Accion");
		this.jComboBoxTiposRelacionesProductosServiciosProductos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosServiciosProductos.setText("Accion");
		this.jComboBoxTiposAccionesProductosServiciosProductos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductosServiciosProductos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductosServiciosProductos.setText("Accion");
		this.jComboBoxTiposSeleccionarProductosServiciosProductos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductosServiciosProductos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductosServiciosProductos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosServiciosProductos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosServiciosProductos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductosServiciosProductos = new JLabelMe();
		
		this.jLabelAccionesProductosServiciosProductos.setText("Acciones");		
		this.jLabelAccionesProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductosServiciosProductos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductosServiciosProductos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductosServiciosProductos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductosServiciosProductos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductosServiciosProductos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductosServiciosProductos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductosServiciosProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductosServiciosProductos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductosServiciosProductos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductosServiciosProductos = new JButtonMe();
		//this.jButtonAnterioresProductosServiciosProductos.setText("<<");
        this.jButtonAnterioresProductosServiciosProductos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductosServiciosProductos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductosServiciosProductos = new JButtonMe();
		//this.jButtonSiguientesProductosServiciosProductos.setText(">>");
        this.jButtonSiguientesProductosServiciosProductos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductosServiciosProductos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductosServiciosProductos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductosServiciosProductos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductosServiciosProductos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductosServiciosProductos,"nuevoguardarcambios_button","Nue",this.productosserviciosproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductosServiciosProductos";
		inputMap = this.jButtonNuevoGuardarCambiosProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductosServiciosProductos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductosServiciosProductos";
		inputMap = this.jButtonRecargarInformacionProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductosServiciosProductos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductosServiciosProductos";
		inputMap = this.jButtonSiguientesProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductosServiciosProductos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductosServiciosProductos";
		inputMap = this.jButtonAnterioresProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductosServiciosProductos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductosServiciosProductos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductosServiciosProductos.setMinimumSize(new Dimension(this.getWidth(),ProductosServiciosProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosServiciosProductos.setMaximumSize(new Dimension(this.getWidth(),ProductosServiciosProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosServiciosProductos.setPreferredSize(new Dimension(this.getWidth(),ProductosServiciosProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosProductosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductosServiciosProductos = new GridBagLayout();

			this.jPanelPaginacionProductosServiciosProductos.setLayout(gridaBagLayoutPaginacionProductosServiciosProductos);						
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonAnterioresProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
					
						
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
			
			this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonNuevoGuardarCambiosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
						
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
			this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonSiguientesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 1;
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonNuevoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
						
			
			
			if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductosServiciosProductos.gridy = 1;
				this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonGuardarCambiosTablaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			}
			
			
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 1;
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonDuplicarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 1;
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonCopiarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 1;
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonVerFormProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 1;
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductosServiciosProductos.add(this.jButtonCerrarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
		
		
		this.jButtonRecargarInformacionProductosServiciosProductos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosServiciosProductos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosServiciosProductos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductosServiciosProductos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosServiciosProductos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosServiciosProductos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductosServiciosProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosServiciosProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosServiciosProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductosServiciosProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosServiciosProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosServiciosProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductosServiciosProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosServiciosProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosServiciosProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductosServiciosProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosServiciosProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosServiciosProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductosServiciosProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductosServiciosProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosServiciosProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosServiciosProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductosServiciosProductos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosServiciosProductos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosServiciosProductos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductosServiciosProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosServiciosProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosServiciosProductos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductosServiciosProductos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosServiciosProductos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosServiciosProductos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductosServiciosProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductosServiciosProductos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductosServiciosProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductosServiciosProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductosServiciosProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductosServiciosProductos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductosServiciosProductos.setLayout(gridaBagParametrosReportesProductosServiciosProductos);
			this.jPanelParametrosReportesAccionesProductosServiciosProductos.setLayout(gridaBagParametrosReportesAccionesProductosServiciosProductos);
			
			
			this.jPanelParametrosAuxiliar1ProductosServiciosProductos.setLayout(gridaBagParametrosAuxiliar1ProductosServiciosProductos);
			this.jPanelParametrosAuxiliar2ProductosServiciosProductos.setLayout(gridaBagParametrosAuxiliar2ProductosServiciosProductos);
			this.jPanelParametrosAuxiliar3ProductosServiciosProductos.setLayout(gridaBagParametrosAuxiliar3ProductosServiciosProductos);
			this.jPanelParametrosAuxiliar4ProductosServiciosProductos.setLayout(gridaBagParametrosAuxiliar4ProductosServiciosProductos);
			//this.jPanelParametrosAuxiliar5ProductosServiciosProductos.setLayout(gridaBagParametrosAuxiliar2ProductosServiciosProductos);			
			
			
			
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jButtonRecargarInformacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosProductos.add(this.jComboBoxTiposPaginacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosProductos.add(this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosProductos.add(this.jComboBoxTiposArchivosReportesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jPanelParametrosAuxiliar1ProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductosServiciosProductos.add(this.jComboBoxTiposReportesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jPanelParametrosAuxiliar4ProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jComboBoxTiposReportesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jCheckBoxGenerarReporteProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jPanelParametrosAuxiliar2ProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jLabelAccionesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductosServiciosProductos.add(this.jButtonAbrirOrderByProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jComboBoxTiposSeleccionarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);			
			
			
			/*
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jCheckBoxSeleccionarTodosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosProductos.add(this.jCheckBoxSeleccionarTodosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);															
				
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosProductos.add(this.jCheckBoxSeleccionadosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jPanelParametrosAuxiliar3ProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosProductos.add(this.jComboBoxTiposAccionesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductosServiciosProductos = new GridBagLayout();

			this.jScrollPanelDatosProductosServiciosProductos.setLayout(gridaBagLayoutDatosProductosServiciosProductos);
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
			this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
			
			this.jScrollPanelDatosProductosServiciosProductos.add(this.jTableDatosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductosServiciosProductos.setViewportView(this.jTableDatosProductosServiciosProductos);
		this.jTableDatosProductosServiciosProductos.setFillsViewportHeight(true);
		this.jTableDatosProductosServiciosProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductosServiciosProductos= new GridBagLayout();
		this.jPanelAccionesProductosServiciosProductos.setLayout(gridaBagLayoutAccionesProductosServiciosProductos);
		
		
		/*	
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = 0;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
			
		this.jPanelAccionesProductosServiciosProductos.add(this.jButtonNuevoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosServiciosProductosProductosServiciosProductos= new GridBagLayout();
		gridaBagLayoutBusquedaProductosServiciosProductosProductosServiciosProductos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosServiciosProductosProductosServiciosProductos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosServiciosProductosProductosServiciosProductos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosServiciosProductosProductosServiciosProductos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.setLayout(gridaBagLayoutBusquedaProductosServiciosProductosProductosServiciosProductos);

		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 0;
		gridBagConstraintsProductosServiciosProductos.gridx = 0;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jLabelid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);

		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 0;
		gridBagConstraintsProductosServiciosProductos.gridx = 1;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);


		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 1;
		gridBagConstraintsProductosServiciosProductos.gridx = 0;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jLabelid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);

		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 1;
		gridBagConstraintsProductosServiciosProductos.gridx = 1;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);


		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 2;
		gridBagConstraintsProductosServiciosProductos.gridx = 0;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jLabelid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);

		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 2;
		gridBagConstraintsProductosServiciosProductos.gridx = 1;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);


		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 3;
		gridBagConstraintsProductosServiciosProductos.gridx = 0;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jLabelid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);

		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 3;
		gridBagConstraintsProductosServiciosProductos.gridx = 1;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);


		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 4;
		gridBagConstraintsProductosServiciosProductos.gridx = 0;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jLabelid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);

		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 4;
		gridBagConstraintsProductosServiciosProductos.gridx = 1;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);


		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 5;
		gridBagConstraintsProductosServiciosProductos.gridx = 0;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jLabelid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);

		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 5;
		gridBagConstraintsProductosServiciosProductos.gridx = 1;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);

		gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosProductos.gridy = 6;
		gridBagConstraintsProductosServiciosProductos.gridx =1;
		jPanelBusquedaProductosServiciosProductosProductosServiciosProductos.add(jButtonBusquedaProductosServiciosProductosProductosServiciosProductos, gridBagConstraintsProductosServiciosProductos);

		jTabbedPaneBusquedasProductosServiciosProductos.addTab("1.-Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ", jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);
		jTabbedPaneBusquedasProductosServiciosProductos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosServiciosProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosServiciosProductos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();						
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosProductos.gridx = 0;		
			//this.gridBagConstraintsProductosServiciosProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosServiciosProductos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;		
		//this.gridBagConstraintsProductosServiciosProductos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductosServiciosProductos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductosServiciosProductos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosProductos.gridx = 0;		
			this.gridBagConstraintsProductosServiciosProductos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductosServiciosProductos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);								
		
		
		/*
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		*/		
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosProductos.gridx =0;
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosServiciosProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
				
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductosServiciosProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosServiciosProductos = new GridBagLayout();
			this.jPanelBusquedasParametrosProductosServiciosProductos.setLayout(gridaBagLayoutBusquedasParametrosProductosServiciosProductos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductosServiciosProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosServiciosProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
			
			
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
			
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductosServiciosProductos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductosServiciosProductos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductosServiciosProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductosServiciosProductos.setName("jPanelReporteDinamicoProductosServiciosProductos"); 
		
		this.jPanelReporteDinamicoProductosServiciosProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosServiciosProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosServiciosProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductosServiciosProductos.setLayout(gridaBagLayoutReporteDinamicoProductosServiciosProductos);
		
		
		this.jInternalFrameReporteDinamicoProductosServiciosProductos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductosServiciosProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosServiciosProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductosServiciosProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductosServiciosProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductosServiciosProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductosServiciosProductos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductosServiciosProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductosServiciosProductos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductosServiciosProductos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductosServiciosProductos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductosServiciosProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosServiciosProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosServiciosProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Productoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductosServiciosProductos = new JLabelMe();

		this.jLabelColumnasSelectReporteProductosServiciosProductos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jLabelColumnasSelectReporteProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductosServiciosProductos = new JList<Reporte>();
		this.jListColumnasSelectReporteProductosServiciosProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductosServiciosProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductosServiciosProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosServiciosProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosServiciosProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductosServiciosProductos=new JScrollPane(this.jListColumnasSelectReporteProductosServiciosProductos);
			
			this.jScrollColumnasSelectReporteProductosServiciosProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosServiciosProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosServiciosProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jListColumnasSelectReporteProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jScrollColumnasSelectReporteProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductosServiciosProductos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductosServiciosProductos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductosServiciosProductos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductosServiciosProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductosServiciosProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductosServiciosProductos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosServiciosProductos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosServiciosProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductosServiciosProductos=new JScrollPane(this.jListRelacionesSelectReporteProductosServiciosProductos);
			
			this.jScrollRelacionesSelectReporteProductosServiciosProductos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosServiciosProductos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosServiciosProductos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductosServiciosProductos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosProductos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductosServiciosProductos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductosServiciosProductos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductosServiciosProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductosServiciosProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosServiciosProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosServiciosProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosProductos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductosServiciosProductos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jLabelGenerarExcelReporteDinamicoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosProductos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosProductos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductosServiciosProductos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosProductos.setToolTipText("Generar EXCEL"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jButtonGenerarExcelReporteDinamicoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jComboBoxTiposReportesDinamicoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosProductos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductosServiciosProductos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jLabelTiposArchivoReporteDinamicoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductosServiciosProductos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductosServiciosProductos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductosServiciosProductos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductosServiciosProductos.setToolTipText("Generar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jButtonGenerarReporteDinamicoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductosServiciosProductos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductosServiciosProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductosServiciosProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductosServiciosProductos.setToolTipText("Cancelar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosProductos.add(this.jButtonCerrarReporteDinamicoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductosServiciosProductos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductosServiciosProductos= new JScrollPane(jPanelReporteDinamicoProductosServiciosProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductosServiciosProductos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosServiciosProductos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosServiciosProductos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Productoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosProductos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductosServiciosProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductosServiciosProductos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductosServiciosProductos);
		this.jInternalFrameReporteDinamicoProductosServiciosProductos.getContentPane().add(this.jScrollPanelReporteDinamicoProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductosServiciosProductos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductosServiciosProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductosServiciosProductos.setName("jPanelImportacionProductosServiciosProductos"); 
		
		this.jPanelImportacionProductosServiciosProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosServiciosProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosServiciosProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductosServiciosProductos.setLayout(gridaBagLayoutImportacionProductosServiciosProductos);
		
		
		this.jInternalFrameImportacionProductosServiciosProductos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductosServiciosProductos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductosServiciosProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosServiciosProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductosServiciosProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosServiciosProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosServiciosProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductosServiciosProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosServiciosProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosServiciosProductos.setResizable(true);
	    this.jInternalFrameImportacionProductosServiciosProductos.setClosable(true);
	    this.jInternalFrameImportacionProductosServiciosProductos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductosServiciosProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosServiciosProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosServiciosProductos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductosServiciosProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosServiciosProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosServiciosProductos.setResizable(true);
	    this.jInternalFrameImportacionProductosServiciosProductos.setClosable(true);
	    this.jInternalFrameImportacionProductosServiciosProductos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductosServiciosProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosServiciosProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosServiciosProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Productoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductosServiciosProductos = new JLabelMe();

		this.jLabelArchivoImportacionProductosServiciosProductos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosServiciosProductos.add(this.jLabelArchivoImportacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductosServiciosProductos = new JFileChooser();		
		this.jFileChooserImportacionProductosServiciosProductos.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductosServiciosProductos = new JButtonMe();
		this.jButtonAbrirImportacionProductosServiciosProductos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductosServiciosProductos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductosServiciosProductos.setToolTipText("Generar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosProductos.add(this.jButtonAbrirImportacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductosServiciosProductos = new JLabelMe();

		this.jLabelPathArchivoImportacionProductosServiciosProductos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductosServiciosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosServiciosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosServiciosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosServiciosProductos.add(this.jLabelPathArchivoImportacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductosServiciosProductos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductosServiciosProductos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosServiciosProductos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosServiciosProductos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosProductos.add(this.jTextFieldPathArchivoImportacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductosServiciosProductos = new JButtonMe();
		this.jButtonGenerarImportacionProductosServiciosProductos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductosServiciosProductos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductosServiciosProductos.setToolTipText("Generar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosProductos.add(this.jButtonGenerarImportacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductosServiciosProductos = new JButtonMe();
		this.jButtonCerrarImportacionProductosServiciosProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductosServiciosProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductosServiciosProductos.setToolTipText("Cancelar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosProductos.add(this.jButtonCerrarImportacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductosServiciosProductos = new GridBagLayout();
		
		this.jScrollPanelImportacionProductosServiciosProductos= new JScrollPane(jPanelImportacionProductosServiciosProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosProductos.gridy =iPosYImportacion;
		this.gridBagConstraintsProductosServiciosProductos.gridx =iPosXImportacion;
		this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductosServiciosProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductosServiciosProductos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductosServiciosProductos);
		this.jInternalFrameImportacionProductosServiciosProductos.getContentPane().add(this.jScrollPanelImportacionProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductosServiciosProductos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductosServiciosProductos = new JButtonMe();
			this.jButtonAbrirOrderByProductosServiciosProductos.setText("Orden");
			this.jButtonAbrirOrderByProductosServiciosProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosServiciosProductos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductosServiciosProductos";
			inputMap = this.jButtonAbrirOrderByProductosServiciosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductosServiciosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductosServiciosProductos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductosServiciosProductos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductosServiciosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductosServiciosProductos.setName("jPanelOrderByProductosServiciosProductos"); 
			
			this.jPanelOrderByProductosServiciosProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosServiciosProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosServiciosProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductosServiciosProductos.setLayout(gridaBagLayoutOrderByProductosServiciosProductos);
			
			
			this.jTableDatosProductosServiciosProductosOrderBy = new JTableMe();        
			this.jTableDatosProductosServiciosProductosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosServiciosProductosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosServiciosProductosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosServiciosProductosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosServiciosProductosOrderBy.setViewportView(this.jTableDatosProductosServiciosProductosOrderBy);
			this.jTableDatosProductosServiciosProductosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosServiciosProductosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductosServiciosProductos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductosServiciosProductos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductosServiciosProductos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductosServiciosProductos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductosServiciosProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductosServiciosProductos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductosServiciosProductos.setTitle("Orden");
			this.jInternalFrameOrderByProductosServiciosProductos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductosServiciosProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductosServiciosProductos.setResizable(true);
			this.jInternalFrameOrderByProductosServiciosProductos.setClosable(true);
			this.jInternalFrameOrderByProductosServiciosProductos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductosServiciosProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosServiciosProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosServiciosProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductosServiciosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Productoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductosServiciosProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductosServiciosProductos.ipady =150;
				
			this.jPanelOrderByProductosServiciosProductos.add(jScrollPanelDatosProductosServiciosProductosOrderBy, this.gridBagConstraintsProductosServiciosProductos);//this.jTableDatosProductosServiciosProductosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductosServiciosProductos = new JButtonMe();
			this.jButtonCerrarOrderByProductosServiciosProductos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductosServiciosProductos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductosServiciosProductos.setToolTipText("Cancelar"+" "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductosServiciosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosProductos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductosServiciosProductos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductosServiciosProductos.add(this.jButtonCerrarOrderByProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductosServiciosProductos = new GridBagLayout();
			
			this.jScrollPanelOrderByProductosServiciosProductos= new JScrollPane(jPanelOrderByProductosServiciosProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductosServiciosProductos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosProductos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductosServiciosProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosServiciosProductos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductosServiciosProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductosServiciosProductos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductosServiciosProductos);
			
			this.jInternalFrameOrderByProductosServiciosProductos.getContentPane().add(this.jScrollPanelOrderByProductosServiciosProductos, this.gridBagConstraintsProductosServiciosProductos);			
		
		} else {
			this.jButtonAbrirOrderByProductosServiciosProductos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productosserviciosproductosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductosServiciosProductos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductosServiciosProductos.getRowHeight();//ProductosServiciosProductosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosServiciosProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos.isSelected()) {
					iHeightTable=ProductosServiciosProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosServiciosProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosServiciosProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosServiciosProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosServiciosProductos.isSelected()) {
					iHeightTable=ProductosServiciosProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosServiciosProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosServiciosProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductosServiciosProductos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosServiciosProductos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosServiciosProductos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductosServiciosProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosServiciosProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosServiciosProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductosServiciosProductos!=null && this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy()!=null) {
			//if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductosServiciosProductos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductosServiciosProductos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductosServiciosProductos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductosServiciosProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosServiciosProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosServiciosProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=productosserviciosproductosLogic.getProductosServiciosProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciosproductoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductosServiciosProductos> TraerProductosServiciosProductosBeans(List<ProductosServiciosProductos> productosserviciosproductoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductoss) {
					
				if(!(ProductosServiciosProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosServiciosProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productosserviciosproductos.setsDetalleGeneralEntityReporte(ProductosServiciosProductosConstantesFunciones.getProductosServiciosProductosDescripcion(productosserviciosproductos));
										
						
					
						
					
				} else  {
							
					//productosserviciosproductos.setsDetalleGeneralEntityReporte(productosserviciosproductos.getsDetalleGeneralEntityReporte());
										
				}
				
				//productosserviciosproductosbeans.add(productosserviciosproductosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productosserviciosproductoss;
    }
	//PARA REPORTES FIN
}
