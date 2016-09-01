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
import com.bydan.erp.inventario.util.report.ProductosServiciosDisponiblesConstantesFunciones;

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
public class ProductosServiciosDisponiblesJInternalFrame extends ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductosServiciosDisponibles;
	
	protected JMenuBar jmenuBarProductosServiciosDisponibles;
	
	protected JMenu jmenuProductosServiciosDisponibles;
	protected JMenu jmenuDatosProductosServiciosDisponibles;
	protected JMenu jmenuArchivoProductosServiciosDisponibles;
	protected JMenu jmenuAccionesProductosServiciosDisponibles;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosServiciosDisponibles;	
	protected GridBagConstraints gridBagConstraintsProductosServiciosDisponibles;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosServiciosDisponiblesDetalleFormJInternalFrame jInternalFrameDetalleFormProductosServiciosDisponibles;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductosServiciosDisponibles;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductosServiciosDisponibles;	
	
	
	
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
	
	public ProductosServiciosDisponiblesSessionBean productosserviciosdisponiblesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductosServiciosDisponibles> productosserviciosdisponibless;		
	public List<ProductosServiciosDisponibles> productosserviciosdisponiblessEliminados;	
	public List<ProductosServiciosDisponibles> productosserviciosdisponiblessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductosServiciosDisponibles;		
	protected JButton jButtonAbrirOrderByProductosServiciosDisponibles;
	
	
	//protected JPanel jPanelOrderByProductosServiciosDisponibles;
	//public JScrollPane jScrollPanelOrderByProductosServiciosDisponibles;	
	//protected JButton jButtonCerrarOrderByProductosServiciosDisponibles;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosServiciosDisponiblesLogic productosserviciosdisponiblesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductosServiciosDisponibles;
	public JScrollPane jScrollPanelDatosEdicionProductosServiciosDisponibles;
	public JScrollPane jScrollPanelDatosGeneralProductosServiciosDisponibles;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosServiciosDisponiblesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductosServiciosDisponibles;
	//public JScrollPane jScrollPanelImportacionProductosServiciosDisponibles;
	
	
	
	protected JPanel jPanelAccionesProductosServiciosDisponibles;
	
    protected JPanel jPanelPaginacionProductosServiciosDisponibles;
    protected JPanel jPanelParametrosReportesProductosServiciosDisponibles;
	protected JPanel jPanelParametrosReportesAccionesProductosServiciosDisponibles;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductosServiciosDisponibles;
	protected JPanel jPanelParametrosAuxiliar2ProductosServiciosDisponibles;
	protected JPanel jPanelParametrosAuxiliar3ProductosServiciosDisponibles;
	protected JPanel jPanelParametrosAuxiliar4ProductosServiciosDisponibles;
	//protected JPanel jPanelParametrosAuxiliar5ProductosServiciosDisponibles;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductosServiciosDisponibles;
	//protected JPanel jPanelImportacionProductosServiciosDisponibles;
	
	
	public JTable jTableDatosProductosServiciosDisponibles;
	
	
	
	//public JTable jTableDatosProductosServiciosDisponiblesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductosServiciosDisponibles;
	protected JButton jButtonDuplicarProductosServiciosDisponibles;
	protected JButton jButtonCopiarProductosServiciosDisponibles;
	protected JButton jButtonVerFormProductosServiciosDisponibles;
	protected JButton jButtonNuevoRelacionesProductosServiciosDisponibles;
	protected JButton jButtonModificarProductosServiciosDisponibles;
	
    protected JButton jButtonGuardarCambiosTablaProductosServiciosDisponibles;
	protected JButton jButtonCerrarProductosServiciosDisponibles;
	
	
	protected JButton jButtonRecargarInformacionProductosServiciosDisponibles;
	protected JButton jButtonProcesarInformacionProductosServiciosDisponibles;
	
	
	protected JButton jButtonAnterioresProductosServiciosDisponibles;
	protected JButton jButtonSiguientesProductosServiciosDisponibles;
	protected JButton jButtonNuevoGuardarCambiosProductosServiciosDisponibles;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductosServiciosDisponibles;
	//protected JButton jButtonCerrarReporteDinamicoProductosServiciosDisponibles;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductosServiciosDisponibles;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductosServiciosDisponibles;
	//protected JButton jButtonGenerarImportacionProductosServiciosDisponibles;
	//protected JButton jButtonCerrarImportacionProductosServiciosDisponibles;
	//protected JFileChooser jFileChooserImportacionProductosServiciosDisponibles;
	//protected File fileImportacionProductosServiciosDisponibles;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosServiciosDisponibles;
	protected JButton jButtonDuplicarToolBarProductosServiciosDisponibles;
	protected JButton jButtonNuevoRelacionesToolBarProductosServiciosDisponibles;
	
	
	public JButton jButtonGuardarCambiosToolBarProductosServiciosDisponibles;
	protected JButton jButtonCopiarToolBarProductosServiciosDisponibles;
	protected JButton jButtonVerFormToolBarProductosServiciosDisponibles;
	public JButton jButtonGuardarCambiosTablaToolBarProductosServiciosDisponibles;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosServiciosDisponibles;
	protected JButton jButtonCerrarToolBarProductosServiciosDisponibles;
	
	protected JButton jButtonRecargarInformacionToolBarProductosServiciosDisponibles;
	protected JButton jButtonProcesarInformacionToolBarProductosServiciosDisponibles;
	protected JButton jButtonAnterioresToolBarProductosServiciosDisponibles;
	protected JButton jButtonSiguientesToolBarProductosServiciosDisponibles;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductosServiciosDisponibles;
	protected JButton jButtonAbrirOrderByToolBarProductosServiciosDisponibles;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosServiciosDisponibles;
	protected JMenuItem jMenuItemDuplicarProductosServiciosDisponibles;
	protected JMenuItem jMenuItemNuevoRelacionesProductosServiciosDisponibles;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductosServiciosDisponibles;
	protected JMenuItem jMenuItemCopiarProductosServiciosDisponibles;
	protected JMenuItem jMenuItemVerFormProductosServiciosDisponibles;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosServiciosDisponibles;
	protected JMenuItem jMenuItemCerrarProductosServiciosDisponibles;
	protected JMenuItem jMenuItemDetalleCerrarProductosServiciosDisponibles;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductosServiciosDisponibles;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosServiciosDisponibles;
	
	protected JMenuItem jMenuItemRecargarInformacionProductosServiciosDisponibles;
	protected JMenuItem jMenuItemProcesarInformacionProductosServiciosDisponibles;
	protected JMenuItem jMenuItemAnterioresProductosServiciosDisponibles;
	protected JMenuItem jMenuItemSiguientesProductosServiciosDisponibles;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles;
	protected JMenuItem jMenuItemAbrirOrderByProductosServiciosDisponibles;
	protected JMenuItem jMenuItemMostrarOcultarProductosServiciosDisponibles;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosServiciosDisponibles;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductosServiciosDisponibles;
	protected JCheckBox jCheckBoxSeleccionadosProductosServiciosDisponibles;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles;
	protected JCheckBox jCheckBoxConGraficoReporteProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductosServiciosDisponibles;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductosServiciosDisponibles;
	protected JTextField jTextFieldValorCampoGeneralProductosServiciosDisponibles;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductosServiciosDisponibles;
	//public JList<Reporte> jListColumnasSelectReporteProductosServiciosDisponibles;
	//public JScrollPane jScrollColumnasSelectReporteProductosServiciosDisponibles;
	
	//public JLabel jLabelRelacionesSelectReporteProductosServiciosDisponibles;
	//public JList<Reporte> jListRelacionesSelectReporteProductosServiciosDisponibles;
	//public JScrollPane jScrollRelacionesSelectReporteProductosServiciosDisponibles;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductosServiciosDisponibles;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductosServiciosDisponibles;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductosServiciosDisponibles;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductosServiciosDisponibles;
	
		
	//public JLabel jLabelArchivoImportacionProductosServiciosDisponibles;	
	//public JLabel jLabelPathArchivoImportacionProductosServiciosDisponibles;
	//protected JTextField jTextFieldPathArchivoImportacionProductosServiciosDisponibles;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductosServiciosDisponibles;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles;
	
	//public JLabel jLabelColumnaCategoriaValorProductosServiciosDisponibles;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductosServiciosDisponibles;
	
	//public JLabel jLabelColumnasValoresGraficoProductosServiciosDisponibles;
	//public JList<Reporte> jListColumnasValoresGraficoProductosServiciosDisponibles;
	//public JScrollPane jScrollColumnasValoresGraficoProductosServiciosDisponibles;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductosServiciosDisponibles;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductosServiciosDisponibles;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductosServiciosDisponibles;
	public JPanel jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JButton jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	
	public JPanel jPanelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JLabel jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JButton jButtonid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JLabel jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JButton jButtonid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JLabel jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JLabel jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JLabel jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JLabel jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles;
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=740;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductosServiciosDisponiblesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosDisponiblesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosDisponiblesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosDisponiblesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductosServiciosDisponibles)	{
		this.jButtonRecargarInformacionProductosServiciosDisponibles = jButtonRecargarInformacionProductosServiciosDisponibles;
	}
	
	public JButton getjButtonProcesarInformacionProductosServiciosDisponibles() {
		return this.jButtonProcesarInformacionProductosServiciosDisponibles;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosServiciosDisponibles)	{
		this.jButtonProcesarInformacionProductosServiciosDisponibles = jButtonProcesarInformacionProductosServiciosDisponibles;
	}
	
	
	public JButton getjButtonRecargarInformacionProductosServiciosDisponibles() {
		return this.jButtonRecargarInformacionProductosServiciosDisponibles;
	}
	
	
	public List<ProductosServiciosDisponibles> getproductosserviciosdisponibless() {
		return this.productosserviciosdisponibless;
	}

	public void setproductosserviciosdisponibless(List<ProductosServiciosDisponibles> productosserviciosdisponibless) {
		this.productosserviciosdisponibless = productosserviciosdisponibless;
	}
	
	public List<ProductosServiciosDisponibles> getproductosserviciosdisponiblessAux() {
		return this.productosserviciosdisponiblessAux;
	}

	public void setproductosserviciosdisponiblessAux(List<ProductosServiciosDisponibles> productosserviciosdisponiblessAux) {
		this.productosserviciosdisponiblessAux = productosserviciosdisponiblessAux;
	}
	
	public List<ProductosServiciosDisponibles> getproductosserviciosdisponiblessEliminados() {
		return this.productosserviciosdisponiblessEliminados;
	}

	public void setProductosServiciosDisponiblessEliminados(List<ProductosServiciosDisponibles> productosserviciosdisponiblessEliminados) {
		this.productosserviciosdisponiblessEliminados = productosserviciosdisponiblessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductosServiciosDisponibles() {
		return jComboBoxTiposSeleccionarProductosServiciosDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductosServiciosDisponibles(
			JComboBox jComboBoxTiposSeleccionarProductosServiciosDisponibles) {
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles = jComboBoxTiposSeleccionarProductosServiciosDisponibles;
	}
	
	public void setBorderResaltarTiposSeleccionarProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductosServiciosDisponibles() {
		return jTextFieldValorCampoGeneralProductosServiciosDisponibles;
	}

	public void setjTextFieldValorCampoGeneralProductosServiciosDisponibles(
			JTextField jTextFieldValorCampoGeneralProductosServiciosDisponibles) {
		this.jTextFieldValorCampoGeneralProductosServiciosDisponibles = jTextFieldValorCampoGeneralProductosServiciosDisponibles;
	}

	public void setBorderResaltarValorCampoGeneralProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductosServiciosDisponibles .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductosServiciosDisponibles() {
		return this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles;
	}

	public void setjCheckBoxSeleccionarTodosProductosServiciosDisponibles(
			JCheckBox jCheckBoxSeleccionarTodosProductosServiciosDisponibles) {
		this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles = jCheckBoxSeleccionarTodosProductosServiciosDisponibles;
	}

	public void setBorderResaltarSeleccionarTodosProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductosServiciosDisponibles() {
		return this.jCheckBoxSeleccionadosProductosServiciosDisponibles;
	}

	public void setjCheckBoxSeleccionadosProductosServiciosDisponibles(
			JCheckBox jCheckBoxSeleccionadosProductosServiciosDisponibles) {
		this.jCheckBoxSeleccionadosProductosServiciosDisponibles = jCheckBoxSeleccionadosProductosServiciosDisponibles;
	}
	
	public void setBorderResaltarSeleccionadosProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductosServiciosDisponibles() {
		return this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductosServiciosDisponibles(
			JComboBox jComboBoxTiposArchivosReportesProductosServiciosDisponibles) {
		this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles = jComboBoxTiposArchivosReportesProductosServiciosDisponibles;
	}

	public void setBorderResaltarTiposArchivosReportesProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductosServiciosDisponibles() {
		return this.jComboBoxTiposReportesProductosServiciosDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductosServiciosDisponibles(
			JComboBox jComboBoxTiposReportesProductosServiciosDisponibles) {
		this.jComboBoxTiposReportesProductosServiciosDisponibles = jComboBoxTiposReportesProductosServiciosDisponibles;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductosServiciosDisponibles() {
	//	return jComboBoxTiposReportesDinamicoProductosServiciosDisponibles;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductosServiciosDisponibles(
	//		JComboBox jComboBoxTiposReportesDinamicoProductosServiciosDisponibles) {
	//	this.jComboBoxTiposReportesDinamicoProductosServiciosDisponibles = jComboBoxTiposReportesDinamicoProductosServiciosDisponibles;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles = jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles;
	//}
	
	public void setBorderResaltarTiposReportesProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductosServiciosDisponibles() {
		return this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductosServiciosDisponibles(
			JComboBox jComboBoxTiposGraficosReportesProductosServiciosDisponibles) {
		this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles = jComboBoxTiposGraficosReportesProductosServiciosDisponibles;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductosServiciosDisponibles() {
		return this.jComboBoxTiposPaginacionProductosServiciosDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductosServiciosDisponibles(
			JComboBox jComboBoxTiposPaginacionProductosServiciosDisponibles) {
		this.jComboBoxTiposPaginacionProductosServiciosDisponibles = jComboBoxTiposPaginacionProductosServiciosDisponibles;
	}
	
	public void setBorderResaltarTiposPaginacionProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductosServiciosDisponibles() {
		return this.jComboBoxTiposRelacionesProductosServiciosDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosServiciosDisponibles() {
		return this.jComboBoxTiposAccionesProductosServiciosDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosServiciosDisponibles(
			JComboBox jComboBoxTiposRelacionesProductosServiciosDisponibles) {
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles = jComboBoxTiposRelacionesProductosServiciosDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosServiciosDisponibles(
			JComboBox jComboBoxTiposAccionesProductosServiciosDisponibles) {
		this.jComboBoxTiposAccionesProductosServiciosDisponibles = jComboBoxTiposAccionesProductosServiciosDisponibles;
	}
	
	public void setBorderResaltarTiposRelacionesProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductosServiciosDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductosServiciosDisponibles .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductosServiciosDisponibles() {
	//	return jCheckBoxConGraficoDinamicoProductosServiciosDisponibles;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductosServiciosDisponibles(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductosServiciosDisponibles) {
	//	this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles = jCheckBoxConGraficoDinamicoProductosServiciosDisponibles;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductosServiciosDisponibles() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductosServiciosDisponibles.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles .setBorder(borderResaltar);		
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
		this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
		
		this.productosserviciosdisponiblesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciosdisponiblesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosServiciosDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosServiciosDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosServiciosDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosServiciosDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosServiciosDisponiblesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Servicios Disponibles MANTENIMIENTO"));
		
		
		if(iWidth > 2450) {
			iWidth=2450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosServiciosDisponiblesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductosServiciosDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductosServiciosDisponibles= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"nuevo","nuevo","Nuevo"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"duplicar","duplicar","Duplicar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"copiar","copiar","Copiar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"ver_form","ver_form","Ver"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"recargar","recargar","Buscar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductosServiciosDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,
							"cerrar","cerrar","Salir"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductosServiciosDisponibles=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductosServiciosDisponibles;
			
				this.jButtonProcesarInformacionToolBarProductosServiciosDisponibles=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductosServiciosDisponibles;
				
		//protected JButton jButtonModificarToolBarProductosServiciosDisponibles;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductosServiciosDisponibles=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductosServiciosDisponibles=new JMenuMe("General");
		this.jmenuArchivoProductosServiciosDisponibles=new JMenuMe("Archivo");
		this.jmenuAccionesProductosServiciosDisponibles=new JMenuMe("Acciones");
		this.jmenuDatosProductosServiciosDisponibles=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosServiciosDisponibles= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosServiciosDisponibles.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosServiciosDisponibles,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductosServiciosDisponibles= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductosServiciosDisponibles.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductosServiciosDisponibles,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductosServiciosDisponibles= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductosServiciosDisponibles.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductosServiciosDisponibles,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductosServiciosDisponibles= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosServiciosDisponibles.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosServiciosDisponibles,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductosServiciosDisponibles= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductosServiciosDisponibles.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductosServiciosDisponibles,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductosServiciosDisponibles= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductosServiciosDisponibles.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductosServiciosDisponibles,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosServiciosDisponibles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosServiciosDisponibles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosServiciosDisponibles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductosServiciosDisponibles= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductosServiciosDisponibles.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductosServiciosDisponibles,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductosServiciosDisponibles= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductosServiciosDisponibles.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductosServiciosDisponibles,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductosServiciosDisponibles= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductosServiciosDisponibles.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductosServiciosDisponibles,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductosServiciosDisponibles= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductosServiciosDisponibles.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductosServiciosDisponibles,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductosServiciosDisponibles= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductosServiciosDisponibles.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductosServiciosDisponibles,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosServiciosDisponibles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosServiciosDisponibles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosServiciosDisponibles,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductosServiciosDisponibles= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductosServiciosDisponibles.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductosServiciosDisponibles,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductosServiciosDisponibles.add(this.jMenuItemCerrarProductosServiciosDisponibles);
			
			this.jmenuAccionesProductosServiciosDisponibles.add(this.jMenuItemNuevoProductosServiciosDisponibles);
			this.jmenuAccionesProductosServiciosDisponibles.add(this.jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles);
			this.jmenuAccionesProductosServiciosDisponibles.add(this.jMenuItemNuevoRelacionesProductosServiciosDisponibles);
			this.jmenuAccionesProductosServiciosDisponibles.add(this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles);		
			this.jmenuAccionesProductosServiciosDisponibles.add(this.jMenuItemDuplicarProductosServiciosDisponibles);		
			this.jmenuAccionesProductosServiciosDisponibles.add(this.jMenuItemCopiarProductosServiciosDisponibles);		
			this.jmenuAccionesProductosServiciosDisponibles.add(this.jMenuItemVerFormProductosServiciosDisponibles);		
			
			this.jmenuDatosProductosServiciosDisponibles.add(this.jMenuItemRecargarInformacionProductosServiciosDisponibles);				
			this.jmenuDatosProductosServiciosDisponibles.add(this.jMenuItemAnterioresProductosServiciosDisponibles);				
			this.jmenuDatosProductosServiciosDisponibles.add(this.jMenuItemSiguientesProductosServiciosDisponibles);				
			this.jmenuDatosProductosServiciosDisponibles.add(this.jMenuItemAbrirOrderByProductosServiciosDisponibles);				
			this.jmenuDatosProductosServiciosDisponibles.add(this.jMenuItemMostrarOcultarProductosServiciosDisponibles);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductosServiciosDisponibles.add(this.jMenuItemGuardarCambiosProductosServiciosDisponibles);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductosServiciosDisponibles.add(this.jmenuArchivoProductosServiciosDisponibles);		
			this.jmenuBarProductosServiciosDisponibles.add(this.jmenuAccionesProductosServiciosDisponibles);		
			this.jmenuBarProductosServiciosDisponibles.add(this.jmenuDatosProductosServiciosDisponibles);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductosServiciosDisponibles);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductosServiciosDisponibles() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");
		this.jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JButtonMe();
		this.jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setText("Buscar");
		this.jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,"buscar_button","Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles = new JLabelMe();
		jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setText("Bodega :");
		jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles = new JLabelMe();
		jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setText("Linea :");
		jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setToolTipText("Linea");
		jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles = new JLabelMe();
		jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles = new JLabelMe();
		jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles = new JLabelMe();
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setText("Tipo Producto Servicio :");
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setToolTipText("Tipo Producto Servicio");
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductosServiciosDisponibles=new JTabbedPane();


		this.jTabbedPaneBusquedasProductosServiciosDisponibles.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProductosServiciosDisponibles.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProductosServiciosDisponibles.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductosServiciosDisponibles = new ProductosServiciosDisponiblesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos Servicios Disponibles DATOS");
			this.jInternalFrameDetalleFormProductosServiciosDisponibles = new ProductosServiciosDisponiblesDetalleFormJInternalFrame(jDesktopPane,this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones(),this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles = null;//new ProductosServiciosDisponiblesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosServiciosDisponibles= new GridBagLayout();
		
		
		this.jTableDatosProductosServiciosDisponibles = new JTableMe();      
		
		String sToolTipProductosServiciosDisponibles="";
		sToolTipProductosServiciosDisponibles=ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosServiciosDisponibles+="(Inventario.ProductosServiciosDisponibles)";
		}
		
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosServiciosDisponibles+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductosServiciosDisponibles.setToolTipText(sToolTipProductosServiciosDisponibles);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductosServiciosDisponibles);
		this.jTableDatosProductosServiciosDisponibles.setAutoCreateRowSorter(true);
		this.jTableDatosProductosServiciosDisponibles.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductosServiciosDisponibles.setRowSelectionAllowed(true);
		this.jTableDatosProductosServiciosDisponibles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductosServiciosDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductosServiciosDisponibles = new JButtonMe();
		this.jButtonDuplicarProductosServiciosDisponibles = new JButtonMe();
		this.jButtonCopiarProductosServiciosDisponibles = new JButtonMe();
		this.jButtonVerFormProductosServiciosDisponibles = new JButtonMe();
		this.jButtonNuevoRelacionesProductosServiciosDisponibles = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles = new JButtonMe();
		this.jButtonCerrarProductosServiciosDisponibles = new JButtonMe();
		
		this.jScrollPanelDatosProductosServiciosDisponibles = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductosServiciosDisponibles = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Servicios Disponibles";
		
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Disponibleses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosServiciosDisponibles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosServiciosDisponibles.setToolTipText("Acciones");
        this.jPanelAccionesProductosServiciosDisponibles.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductosServiciosDisponibles=new ReporteDinamicoJInternalFrame(ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductosServiciosDisponibles();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductosServiciosDisponibles=new ImportacionJInternalFrame(ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductosServiciosDisponibles();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductosServiciosDisponibles = new JButtonMe();
		
		this.jButtonAbrirOrderByProductosServiciosDisponibles.setText("Orden");
		this.jButtonAbrirOrderByProductosServiciosDisponibles.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosServiciosDisponibles,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosServiciosDisponibles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosDisponibles,false,this);
			
			//this.cargarOrderByProductosServiciosDisponibles(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosServiciosDisponibles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosDisponibles,true,this);
			
			//this.cargarOrderByProductosServiciosDisponibles(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductosServiciosDisponibles.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosProductosServiciosDisponibles.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosProductosServiciosDisponibles.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosProductosServiciosDisponibles.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosServiciosDisponibles.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosServiciosDisponibles.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductosServiciosDisponibles.setText("Nuevo");
		this.jButtonDuplicarProductosServiciosDisponibles.setText("Duplicar");
		this.jButtonCopiarProductosServiciosDisponibles.setText("Copiar");
		this.jButtonVerFormProductosServiciosDisponibles.setText("Ver");
		this.jButtonNuevoRelacionesProductosServiciosDisponibles.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.setText("Guardar");
		this.jButtonCerrarProductosServiciosDisponibles.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosServiciosDisponibles,"nuevo_button","Nuevo",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductosServiciosDisponibles,"duplicar_button","Duplicar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductosServiciosDisponibles,"copiar_button","Copiar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductosServiciosDisponibles,"ver_form","Ver",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductosServiciosDisponibles,"nuevorelaciones_button","Nuevo Rel",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosServiciosDisponibles,"guardarcambiostabla_button","Guardar",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosServiciosDisponibles,"cerrar_button","Salir",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductosServiciosDisponibles.setToolTipText("Nuevo"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductosServiciosDisponibles.setToolTipText("Duplicar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductosServiciosDisponibles.setToolTipText("Copiar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductosServiciosDisponibles.setToolTipText("Ver"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductosServiciosDisponibles.setToolTipText("Nuevo Rel"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.setToolTipText("Guardar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosServiciosDisponibles.setToolTipText("Salir"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosServiciosDisponibles";
		inputMap = this.jButtonNuevoProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosServiciosDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosServiciosDisponibles"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductosServiciosDisponibles";
		inputMap = this.jButtonDuplicarProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductosServiciosDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductosServiciosDisponibles"));
		
		//COPIAR
		sMapKey = "CopiarProductosServiciosDisponibles";
		inputMap = this.jButtonCopiarProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductosServiciosDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductosServiciosDisponibles"));
		
		//VEr FORM
		sMapKey = "VerFormProductosServiciosDisponibles";
		inputMap = this.jButtonVerFormProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductosServiciosDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductosServiciosDisponibles"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductosServiciosDisponibles";
		inputMap = this.jButtonNuevoRelacionesProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductosServiciosDisponibles"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductosServiciosDisponibles";
		inputMap = this.jButtonModificarProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductosServiciosDisponibles"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductosServiciosDisponibles";
		inputMap = this.jButtonCerrarProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosServiciosDisponibles"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosServiciosDisponibles";
		inputMap = this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosServiciosDisponibles"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductosServiciosDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductosServiciosDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductosServiciosDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductosServiciosDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductosServiciosDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductosServiciosDisponibles.setName("jPanelParametrosReportesProductosServiciosDisponibles"); 
		
		this.jPanelParametrosReportesAccionesProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductosServiciosDisponibles.setName("jPanelParametrosReportesAccionesProductosServiciosDisponibles"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductosServiciosDisponibles = new JButtonMe();
		this.jButtonRecargarInformacionProductosServiciosDisponibles.setText("Buscar");
		this.jButtonRecargarInformacionProductosServiciosDisponibles.setToolTipText("Buscar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductosServiciosDisponibles,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductosServiciosDisponibles.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductosServiciosDisponibles = new JButtonMe();
		this.jButtonProcesarInformacionProductosServiciosDisponibles.setText("Procesar");
		this.jButtonProcesarInformacionProductosServiciosDisponibles.setToolTipText("Procesar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductosServiciosDisponibles.setVisible(false);
			
		this.jButtonProcesarInformacionProductosServiciosDisponibles.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosServiciosDisponibles.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosServiciosDisponibles.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.setText("TIPO");       
		this.jComboBoxTiposReportesProductosServiciosDisponibles.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductosServiciosDisponibles.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductosServiciosDisponibles.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductosServiciosDisponibles.setText("Accion");
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosServiciosDisponibles.setText("Accion");
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.setText("Accion");
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductosServiciosDisponibles=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductosServiciosDisponibles.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosServiciosDisponibles.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosServiciosDisponibles.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductosServiciosDisponibles = new JLabelMe();
		
		this.jLabelAccionesProductosServiciosDisponibles.setText("Acciones");		
		this.jLabelAccionesProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductosServiciosDisponibles = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductosServiciosDisponibles.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductosServiciosDisponibles.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductosServiciosDisponibles = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductosServiciosDisponibles.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductosServiciosDisponibles.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductosServiciosDisponibles = new JButtonMe();
		//this.jButtonAnterioresProductosServiciosDisponibles.setText("<<");
        this.jButtonAnterioresProductosServiciosDisponibles.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductosServiciosDisponibles,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductosServiciosDisponibles = new JButtonMe();
		//this.jButtonSiguientesProductosServiciosDisponibles.setText(">>");
        this.jButtonSiguientesProductosServiciosDisponibles.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductosServiciosDisponibles,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles,"nuevoguardarcambios_button","Nue",this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductosServiciosDisponibles";
		inputMap = this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductosServiciosDisponibles"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductosServiciosDisponibles";
		inputMap = this.jButtonRecargarInformacionProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductosServiciosDisponibles"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductosServiciosDisponibles";
		inputMap = this.jButtonSiguientesProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductosServiciosDisponibles"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductosServiciosDisponibles";
		inputMap = this.jButtonAnterioresProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductosServiciosDisponibles"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductosServiciosDisponibles();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductosServiciosDisponibles.setMinimumSize(new Dimension(this.getWidth(),ProductosServiciosDisponiblesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosDisponiblesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosServiciosDisponibles.setMaximumSize(new Dimension(this.getWidth(),ProductosServiciosDisponiblesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosDisponiblesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosServiciosDisponibles.setPreferredSize(new Dimension(this.getWidth(),ProductosServiciosDisponiblesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosDisponiblesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductosServiciosDisponibles = new GridBagLayout();

			this.jPanelPaginacionProductosServiciosDisponibles.setLayout(gridaBagLayoutPaginacionProductosServiciosDisponibles);						
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonAnterioresProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
					
						
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
			
			this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
						
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
			this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonSiguientesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 1;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonNuevoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
						
			
			
			if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductosServiciosDisponibles.gridy = 1;
				this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonGuardarCambiosTablaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			}
			
			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 1;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonDuplicarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 1;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonCopiarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 1;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonVerFormProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 1;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductosServiciosDisponibles.add(this.jButtonCerrarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		
		
		this.jButtonRecargarInformacionProductosServiciosDisponibles.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosServiciosDisponibles.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosServiciosDisponibles.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductosServiciosDisponibles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosServiciosDisponibles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosServiciosDisponibles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductosServiciosDisponibles.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosServiciosDisponibles.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosServiciosDisponibles.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductosServiciosDisponibles.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosServiciosDisponibles.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosServiciosDisponibles.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductosServiciosDisponibles.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosServiciosDisponibles.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosServiciosDisponibles.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductosServiciosDisponibles = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductosServiciosDisponibles = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductosServiciosDisponibles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductosServiciosDisponibles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductosServiciosDisponibles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductosServiciosDisponibles = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductosServiciosDisponibles.setLayout(gridaBagParametrosReportesProductosServiciosDisponibles);
			this.jPanelParametrosReportesAccionesProductosServiciosDisponibles.setLayout(gridaBagParametrosReportesAccionesProductosServiciosDisponibles);
			
			
			this.jPanelParametrosAuxiliar1ProductosServiciosDisponibles.setLayout(gridaBagParametrosAuxiliar1ProductosServiciosDisponibles);
			this.jPanelParametrosAuxiliar2ProductosServiciosDisponibles.setLayout(gridaBagParametrosAuxiliar2ProductosServiciosDisponibles);
			this.jPanelParametrosAuxiliar3ProductosServiciosDisponibles.setLayout(gridaBagParametrosAuxiliar3ProductosServiciosDisponibles);
			this.jPanelParametrosAuxiliar4ProductosServiciosDisponibles.setLayout(gridaBagParametrosAuxiliar4ProductosServiciosDisponibles);
			//this.jPanelParametrosAuxiliar5ProductosServiciosDisponibles.setLayout(gridaBagParametrosAuxiliar2ProductosServiciosDisponibles);			
			
			
			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jButtonRecargarInformacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosDisponibles.add(this.jComboBoxTiposPaginacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosDisponibles.add(this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosDisponibles.add(this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jPanelParametrosAuxiliar1ProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductosServiciosDisponibles.add(this.jComboBoxTiposReportesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);																		
			
			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductosServiciosDisponibles.add(this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jPanelParametrosAuxiliar4ProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jComboBoxTiposReportesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jCheckBoxGenerarReporteProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jPanelParametrosAuxiliar2ProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jLabelAccionesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jButtonAbrirOrderByProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jComboBoxTiposSeleccionarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);			
			
			
			/*
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jCheckBoxConGraficoReporteProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosDisponibles.add(this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);															
				
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosDisponibles.add(this.jCheckBoxSeleccionadosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);															
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosDisponibles.add(this.jCheckBoxConGraficoReporteProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jPanelParametrosAuxiliar3ProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosDisponibles.add(this.jComboBoxTiposAccionesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductosServiciosDisponibles = new GridBagLayout();

			this.jScrollPanelDatosProductosServiciosDisponibles.setLayout(gridaBagLayoutDatosProductosServiciosDisponibles);
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
			
			this.jScrollPanelDatosProductosServiciosDisponibles.add(this.jTableDatosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductosServiciosDisponibles.setViewportView(this.jTableDatosProductosServiciosDisponibles);
		this.jTableDatosProductosServiciosDisponibles.setFillsViewportHeight(true);
		this.jTableDatosProductosServiciosDisponibles.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductosServiciosDisponibles= new GridBagLayout();
		this.jPanelAccionesProductosServiciosDisponibles.setLayout(gridaBagLayoutAccionesProductosServiciosDisponibles);
		
		
		/*	
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
			
		this.jPanelAccionesProductosServiciosDisponibles.add(this.jButtonNuevoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles= new GridBagLayout();
		gridaBagLayoutBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setLayout(gridaBagLayoutBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);

		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jLabelid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);

		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 0;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);


		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 1;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jLabelid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);

		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 1;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);


		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 2;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jLabelid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);

		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 2;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);


		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 3;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jLabelid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);

		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 3;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);


		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 4;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jLabelid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);

		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 4;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);


		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 5;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jLabelid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);

		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 5;
		gridBagConstraintsProductosServiciosDisponibles.gridx = 1;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);

		gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosDisponibles.gridy = 6;
		gridBagConstraintsProductosServiciosDisponibles.gridx =1;
		jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.add(jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles, gridBagConstraintsProductosServiciosDisponibles);

		jTabbedPaneBusquedasProductosServiciosDisponibles.addTab("1.-Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ", jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
		jTabbedPaneBusquedasProductosServiciosDisponibles.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosServiciosDisponibles = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosServiciosDisponibles);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();						
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;		
			//this.gridBagConstraintsProductosServiciosDisponibles.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;		
		//this.gridBagConstraintsProductosServiciosDisponibles.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductosServiciosDisponibles);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;		
			this.gridBagConstraintsProductosServiciosDisponibles.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductosServiciosDisponibles.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);								
		
		
		/*
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		*/		
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx =0;
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosServiciosDisponibles.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
				
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductosServiciosDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosServiciosDisponibles = new GridBagLayout();
			this.jPanelBusquedasParametrosProductosServiciosDisponibles.setLayout(gridaBagLayoutBusquedasParametrosProductosServiciosDisponibles);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductosServiciosDisponibles=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
			
			
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
			
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductosServiciosDisponibles;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductosServiciosDisponibles() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductosServiciosDisponibles = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductosServiciosDisponibles.setName("jPanelReporteDinamicoProductosServiciosDisponibles"); 
		
		this.jPanelReporteDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductosServiciosDisponibles.setLayout(gridaBagLayoutReporteDinamicoProductosServiciosDisponibles);
		
		
		this.jInternalFrameReporteDinamicoProductosServiciosDisponibles= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductosServiciosDisponibles = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosServiciosDisponibles= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Disponibleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductosServiciosDisponibles = new JLabelMe();

		this.jLabelColumnasSelectReporteProductosServiciosDisponibles.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jLabelColumnasSelectReporteProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductosServiciosDisponibles = new JList<Reporte>();
		this.jListColumnasSelectReporteProductosServiciosDisponibles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductosServiciosDisponibles.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductosServiciosDisponibles.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosServiciosDisponibles.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosServiciosDisponibles.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductosServiciosDisponibles=new JScrollPane(this.jListColumnasSelectReporteProductosServiciosDisponibles);
			
			this.jScrollColumnasSelectReporteProductosServiciosDisponibles.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosServiciosDisponibles.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosServiciosDisponibles.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jListColumnasSelectReporteProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jScrollColumnasSelectReporteProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductosServiciosDisponibles = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductosServiciosDisponibles.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductosServiciosDisponibles = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductosServiciosDisponibles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductosServiciosDisponibles.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductosServiciosDisponibles.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosServiciosDisponibles.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosServiciosDisponibles.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductosServiciosDisponibles=new JScrollPane(this.jListRelacionesSelectReporteProductosServiciosDisponibles);
			
			this.jScrollRelacionesSelectReporteProductosServiciosDisponibles.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosServiciosDisponibles.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosServiciosDisponibles.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductosServiciosDisponibles = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductosServiciosDisponibles = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductosServiciosDisponibles.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductosServiciosDisponibles = new JLabelMe();

		this.jLabelConGraficoDinamicoProductosServiciosDisponibles.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jLabelConGraficoDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jCheckBoxConGraficoDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductosServiciosDisponibles = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductosServiciosDisponibles.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jLabelColumnaCategoriaGraficoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductosServiciosDisponibles = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductosServiciosDisponibles.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jLabelColumnaCategoriaValorProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductosServiciosDisponibles.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductosServiciosDisponibles.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductosServiciosDisponibles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosServiciosDisponibles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosServiciosDisponibles.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jComboBoxColumnaCategoriaValorProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductosServiciosDisponibles = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductosServiciosDisponibles.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jLabelColumnasValoresGraficoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductosServiciosDisponibles = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductosServiciosDisponibles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductosServiciosDisponibles.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductosServiciosDisponibles.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosServiciosDisponibles.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosServiciosDisponibles.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductosServiciosDisponibles=new JScrollPane(this.jListColumnasValoresGraficoProductosServiciosDisponibles);
			
			this.jScrollColumnasValoresGraficoProductosServiciosDisponibles.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosServiciosDisponibles.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosServiciosDisponibles.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jListColumnasSelectReporteProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jScrollColumnasValoresGraficoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosDisponibles = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductosServiciosDisponibles.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jLabelTiposGraficosReportesDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosDisponibles = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosServiciosDisponibles.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosDisponibles.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosDisponibles = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductosServiciosDisponibles.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jLabelGenerarExcelReporteDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosDisponibles = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosDisponibles.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductosServiciosDisponibles,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosDisponibles.setToolTipText("Generar EXCEL"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jButtonGenerarExcelReporteDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jComboBoxTiposReportesDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosDisponibles = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductosServiciosDisponibles.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jLabelTiposArchivoReporteDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductosServiciosDisponibles = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductosServiciosDisponibles.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductosServiciosDisponibles,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductosServiciosDisponibles.setToolTipText("Generar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jButtonGenerarReporteDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductosServiciosDisponibles = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductosServiciosDisponibles.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductosServiciosDisponibles,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductosServiciosDisponibles.setToolTipText("Cancelar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosDisponibles.add(this.jButtonCerrarReporteDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductosServiciosDisponibles = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductosServiciosDisponibles= new JScrollPane(jPanelReporteDinamicoProductosServiciosDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Disponibleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductosServiciosDisponibles);
		this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getContentPane().add(this.jScrollPanelReporteDinamicoProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductosServiciosDisponibles() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductosServiciosDisponibles = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductosServiciosDisponibles.setName("jPanelImportacionProductosServiciosDisponibles"); 
		
		this.jPanelImportacionProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductosServiciosDisponibles.setLayout(gridaBagLayoutImportacionProductosServiciosDisponibles);
		
		
		this.jInternalFrameImportacionProductosServiciosDisponibles= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductosServiciosDisponibles= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductosServiciosDisponibles = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosServiciosDisponibles= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductosServiciosDisponibles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosServiciosDisponibles.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosServiciosDisponibles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setResizable(true);
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setClosable(true);
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductosServiciosDisponibles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosServiciosDisponibles.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosServiciosDisponibles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setResizable(true);
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setClosable(true);
	    this.jInternalFrameImportacionProductosServiciosDisponibles.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Disponibleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductosServiciosDisponibles = new JLabelMe();

		this.jLabelArchivoImportacionProductosServiciosDisponibles.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosServiciosDisponibles.add(this.jLabelArchivoImportacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductosServiciosDisponibles = new JFileChooser();		
		this.jFileChooserImportacionProductosServiciosDisponibles.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductosServiciosDisponibles = new JButtonMe();
		this.jButtonAbrirImportacionProductosServiciosDisponibles.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductosServiciosDisponibles,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductosServiciosDisponibles.setToolTipText("Generar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosDisponibles.add(this.jButtonAbrirImportacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductosServiciosDisponibles = new JLabelMe();

		this.jLabelPathArchivoImportacionProductosServiciosDisponibles.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductosServiciosDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosServiciosDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosServiciosDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosServiciosDisponibles.add(this.jLabelPathArchivoImportacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductosServiciosDisponibles=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductosServiciosDisponibles.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosServiciosDisponibles.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosServiciosDisponibles.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosDisponibles.add(this.jTextFieldPathArchivoImportacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductosServiciosDisponibles = new JButtonMe();
		this.jButtonGenerarImportacionProductosServiciosDisponibles.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductosServiciosDisponibles,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductosServiciosDisponibles.setToolTipText("Generar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosDisponibles.add(this.jButtonGenerarImportacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductosServiciosDisponibles = new JButtonMe();
		this.jButtonCerrarImportacionProductosServiciosDisponibles.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductosServiciosDisponibles,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductosServiciosDisponibles.setToolTipText("Cancelar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosDisponibles.add(this.jButtonCerrarImportacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductosServiciosDisponibles = new GridBagLayout();
		
		this.jScrollPanelImportacionProductosServiciosDisponibles= new JScrollPane(jPanelImportacionProductosServiciosDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosDisponibles.gridy =iPosYImportacion;
		this.gridBagConstraintsProductosServiciosDisponibles.gridx =iPosXImportacion;
		this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductosServiciosDisponibles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductosServiciosDisponibles.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductosServiciosDisponibles);
		this.jInternalFrameImportacionProductosServiciosDisponibles.getContentPane().add(this.jScrollPanelImportacionProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductosServiciosDisponibles(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductosServiciosDisponibles = new JButtonMe();
			this.jButtonAbrirOrderByProductosServiciosDisponibles.setText("Orden");
			this.jButtonAbrirOrderByProductosServiciosDisponibles.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosServiciosDisponibles,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductosServiciosDisponibles";
			inputMap = this.jButtonAbrirOrderByProductosServiciosDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductosServiciosDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductosServiciosDisponibles"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductosServiciosDisponibles = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductosServiciosDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductosServiciosDisponibles.setName("jPanelOrderByProductosServiciosDisponibles"); 
			
			this.jPanelOrderByProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductosServiciosDisponibles.setLayout(gridaBagLayoutOrderByProductosServiciosDisponibles);
			
			
			this.jTableDatosProductosServiciosDisponiblesOrderBy = new JTableMe();        
			this.jTableDatosProductosServiciosDisponiblesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosServiciosDisponiblesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosServiciosDisponiblesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosServiciosDisponiblesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosServiciosDisponiblesOrderBy.setViewportView(this.jTableDatosProductosServiciosDisponiblesOrderBy);
			this.jTableDatosProductosServiciosDisponiblesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosServiciosDisponiblesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductosServiciosDisponibles= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductosServiciosDisponibles= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductosServiciosDisponibles = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductosServiciosDisponibles= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductosServiciosDisponibles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductosServiciosDisponibles.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductosServiciosDisponibles.setTitle("Orden");
			this.jInternalFrameOrderByProductosServiciosDisponibles.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductosServiciosDisponibles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductosServiciosDisponibles.setResizable(true);
			this.jInternalFrameOrderByProductosServiciosDisponibles.setClosable(true);
			this.jInternalFrameOrderByProductosServiciosDisponibles.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductosServiciosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Disponibleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductosServiciosDisponibles.ipady =150;
				
			this.jPanelOrderByProductosServiciosDisponibles.add(jScrollPanelDatosProductosServiciosDisponiblesOrderBy, this.gridBagConstraintsProductosServiciosDisponibles);//this.jTableDatosProductosServiciosDisponiblesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductosServiciosDisponibles = new JButtonMe();
			this.jButtonCerrarOrderByProductosServiciosDisponibles.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductosServiciosDisponibles,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductosServiciosDisponibles.setToolTipText("Cancelar"+" "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductosServiciosDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosDisponibles.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductosServiciosDisponibles.add(this.jButtonCerrarOrderByProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductosServiciosDisponibles = new GridBagLayout();
			
			this.jScrollPanelOrderByProductosServiciosDisponibles= new JScrollPane(jPanelOrderByProductosServiciosDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductosServiciosDisponibles = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosDisponibles.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductosServiciosDisponibles.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosServiciosDisponibles.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductosServiciosDisponibles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductosServiciosDisponibles.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductosServiciosDisponibles);
			
			this.jInternalFrameOrderByProductosServiciosDisponibles.getContentPane().add(this.jScrollPanelOrderByProductosServiciosDisponibles, this.gridBagConstraintsProductosServiciosDisponibles);			
		
		} else {
			this.jButtonAbrirOrderByProductosServiciosDisponibles = new JButtonMe();
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
		int iWidthTableCalculado=0;//4330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductosServiciosDisponibles.getRowHeight();//ProductosServiciosDisponiblesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosServiciosDisponiblesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles.isSelected()) {
					iHeightTable=ProductosServiciosDisponiblesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosServiciosDisponiblesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosServiciosDisponiblesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosServiciosDisponiblesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosServiciosDisponibles.isSelected()) {
					iHeightTable=ProductosServiciosDisponiblesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosServiciosDisponiblesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosServiciosDisponiblesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductosServiciosDisponibles!=null && this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy()!=null) {
			//if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductosServiciosDisponibles.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductosServiciosDisponibles.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductosServiciosDisponibles.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductosServiciosDisponibles.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosServiciosDisponibles.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosServiciosDisponibles.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciosdisponibless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductosServiciosDisponibles> TraerProductosServiciosDisponiblesBeans(List<ProductosServiciosDisponibles> productosserviciosdisponibless,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponibless) {
					
				if(!(ProductosServiciosDisponiblesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosServiciosDisponiblesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productosserviciosdisponibles.setsDetalleGeneralEntityReporte(ProductosServiciosDisponiblesConstantesFunciones.getProductosServiciosDisponiblesDescripcion(productosserviciosdisponibles));
										
						
					
						
					
				} else  {
							
					//productosserviciosdisponibles.setsDetalleGeneralEntityReporte(productosserviciosdisponibles.getsDetalleGeneralEntityReporte());
										
				}
				
				//productosserviciosdisponiblesbeans.add(productosserviciosdisponiblesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productosserviciosdisponibless;
    }
	//PARA REPORTES FIN
}
