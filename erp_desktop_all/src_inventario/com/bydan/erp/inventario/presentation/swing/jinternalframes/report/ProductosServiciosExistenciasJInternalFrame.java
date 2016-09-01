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
import com.bydan.erp.inventario.util.report.ProductosServiciosExistenciasConstantesFunciones;

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
public class ProductosServiciosExistenciasJInternalFrame extends ProductosServiciosExistenciasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductosServiciosExistencias;
	
	protected JMenuBar jmenuBarProductosServiciosExistencias;
	
	protected JMenu jmenuProductosServiciosExistencias;
	protected JMenu jmenuDatosProductosServiciosExistencias;
	protected JMenu jmenuArchivoProductosServiciosExistencias;
	protected JMenu jmenuAccionesProductosServiciosExistencias;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosServiciosExistencias;	
	protected GridBagConstraints gridBagConstraintsProductosServiciosExistencias;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosServiciosExistenciasDetalleFormJInternalFrame jInternalFrameDetalleFormProductosServiciosExistencias;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductosServiciosExistencias;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductosServiciosExistencias;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

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
	
	public ProductosServiciosExistenciasSessionBean productosserviciosexistenciasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductosServiciosExistencias> productosserviciosexistenciass;		
	public List<ProductosServiciosExistencias> productosserviciosexistenciassEliminados;	
	public List<ProductosServiciosExistencias> productosserviciosexistenciassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductosServiciosExistencias;		
	protected JButton jButtonAbrirOrderByProductosServiciosExistencias;
	
	
	//protected JPanel jPanelOrderByProductosServiciosExistencias;
	//public JScrollPane jScrollPanelOrderByProductosServiciosExistencias;	
	//protected JButton jButtonCerrarOrderByProductosServiciosExistencias;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosServiciosExistenciasLogic productosserviciosexistenciasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductosServiciosExistencias;
	public JScrollPane jScrollPanelDatosEdicionProductosServiciosExistencias;
	public JScrollPane jScrollPanelDatosGeneralProductosServiciosExistencias;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosServiciosExistenciasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductosServiciosExistencias;
	//public JScrollPane jScrollPanelImportacionProductosServiciosExistencias;
	
	
	
	protected JPanel jPanelAccionesProductosServiciosExistencias;
	
    protected JPanel jPanelPaginacionProductosServiciosExistencias;
    protected JPanel jPanelParametrosReportesProductosServiciosExistencias;
	protected JPanel jPanelParametrosReportesAccionesProductosServiciosExistencias;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductosServiciosExistencias;
	protected JPanel jPanelParametrosAuxiliar2ProductosServiciosExistencias;
	protected JPanel jPanelParametrosAuxiliar3ProductosServiciosExistencias;
	protected JPanel jPanelParametrosAuxiliar4ProductosServiciosExistencias;
	//protected JPanel jPanelParametrosAuxiliar5ProductosServiciosExistencias;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductosServiciosExistencias;
	//protected JPanel jPanelImportacionProductosServiciosExistencias;
	
	
	public JTable jTableDatosProductosServiciosExistencias;
	
	
	
	//public JTable jTableDatosProductosServiciosExistenciasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductosServiciosExistencias;
	protected JButton jButtonDuplicarProductosServiciosExistencias;
	protected JButton jButtonCopiarProductosServiciosExistencias;
	protected JButton jButtonVerFormProductosServiciosExistencias;
	protected JButton jButtonNuevoRelacionesProductosServiciosExistencias;
	protected JButton jButtonModificarProductosServiciosExistencias;
	
    protected JButton jButtonGuardarCambiosTablaProductosServiciosExistencias;
	protected JButton jButtonCerrarProductosServiciosExistencias;
	
	
	protected JButton jButtonRecargarInformacionProductosServiciosExistencias;
	protected JButton jButtonProcesarInformacionProductosServiciosExistencias;
	
	
	protected JButton jButtonAnterioresProductosServiciosExistencias;
	protected JButton jButtonSiguientesProductosServiciosExistencias;
	protected JButton jButtonNuevoGuardarCambiosProductosServiciosExistencias;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductosServiciosExistencias;
	//protected JButton jButtonCerrarReporteDinamicoProductosServiciosExistencias;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductosServiciosExistencias;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductosServiciosExistencias;
	//protected JButton jButtonGenerarImportacionProductosServiciosExistencias;
	//protected JButton jButtonCerrarImportacionProductosServiciosExistencias;
	//protected JFileChooser jFileChooserImportacionProductosServiciosExistencias;
	//protected File fileImportacionProductosServiciosExistencias;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosServiciosExistencias;
	protected JButton jButtonDuplicarToolBarProductosServiciosExistencias;
	protected JButton jButtonNuevoRelacionesToolBarProductosServiciosExistencias;
	
	
	public JButton jButtonGuardarCambiosToolBarProductosServiciosExistencias;
	protected JButton jButtonCopiarToolBarProductosServiciosExistencias;
	protected JButton jButtonVerFormToolBarProductosServiciosExistencias;
	public JButton jButtonGuardarCambiosTablaToolBarProductosServiciosExistencias;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosServiciosExistencias;
	protected JButton jButtonCerrarToolBarProductosServiciosExistencias;
	
	protected JButton jButtonRecargarInformacionToolBarProductosServiciosExistencias;
	protected JButton jButtonProcesarInformacionToolBarProductosServiciosExistencias;
	protected JButton jButtonAnterioresToolBarProductosServiciosExistencias;
	protected JButton jButtonSiguientesToolBarProductosServiciosExistencias;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductosServiciosExistencias;
	protected JButton jButtonAbrirOrderByToolBarProductosServiciosExistencias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosServiciosExistencias;
	protected JMenuItem jMenuItemDuplicarProductosServiciosExistencias;
	protected JMenuItem jMenuItemNuevoRelacionesProductosServiciosExistencias;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductosServiciosExistencias;
	protected JMenuItem jMenuItemCopiarProductosServiciosExistencias;
	protected JMenuItem jMenuItemVerFormProductosServiciosExistencias;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosServiciosExistencias;
	protected JMenuItem jMenuItemCerrarProductosServiciosExistencias;
	protected JMenuItem jMenuItemDetalleCerrarProductosServiciosExistencias;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductosServiciosExistencias;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosServiciosExistencias;
	
	protected JMenuItem jMenuItemRecargarInformacionProductosServiciosExistencias;
	protected JMenuItem jMenuItemProcesarInformacionProductosServiciosExistencias;
	protected JMenuItem jMenuItemAnterioresProductosServiciosExistencias;
	protected JMenuItem jMenuItemSiguientesProductosServiciosExistencias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosServiciosExistencias;
	protected JMenuItem jMenuItemAbrirOrderByProductosServiciosExistencias;
	protected JMenuItem jMenuItemMostrarOcultarProductosServiciosExistencias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosServiciosExistencias;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductosServiciosExistencias;
	protected JCheckBox jCheckBoxSeleccionadosProductosServiciosExistencias;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductosServiciosExistencias;
	protected JCheckBox jCheckBoxConGraficoReporteProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductosServiciosExistencias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductosServiciosExistencias;
	protected JTextField jTextFieldValorCampoGeneralProductosServiciosExistencias;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductosServiciosExistencias;
	//public JList<Reporte> jListColumnasSelectReporteProductosServiciosExistencias;
	//public JScrollPane jScrollColumnasSelectReporteProductosServiciosExistencias;
	
	//public JLabel jLabelRelacionesSelectReporteProductosServiciosExistencias;
	//public JList<Reporte> jListRelacionesSelectReporteProductosServiciosExistencias;
	//public JScrollPane jScrollRelacionesSelectReporteProductosServiciosExistencias;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductosServiciosExistencias;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductosServiciosExistencias;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductosServiciosExistencias;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductosServiciosExistencias;
	
		
	//public JLabel jLabelArchivoImportacionProductosServiciosExistencias;	
	//public JLabel jLabelPathArchivoImportacionProductosServiciosExistencias;
	//protected JTextField jTextFieldPathArchivoImportacionProductosServiciosExistencias;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductosServiciosExistencias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias;
	
	//public JLabel jLabelColumnaCategoriaValorProductosServiciosExistencias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductosServiciosExistencias;
	
	//public JLabel jLabelColumnasValoresGraficoProductosServiciosExistencias;
	//public JList<Reporte> jListColumnasValoresGraficoProductosServiciosExistencias;
	//public JScrollPane jScrollColumnasValoresGraficoProductosServiciosExistencias;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductosServiciosExistencias;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductosServiciosExistencias;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductosServiciosExistencias;
	public JPanel jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JButton jButtonBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	
	public JPanel jPanelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JLabel jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JButton jButtonid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JLabel jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JButton jButtonid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JLabel jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JButton jButtonid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JLabel jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JLabel jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JLabel jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JLabel jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias;
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistenciasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistenciasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=755;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductosServiciosExistenciasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosExistenciasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosExistenciasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosExistenciasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductosServiciosExistencias)	{
		this.jButtonRecargarInformacionProductosServiciosExistencias = jButtonRecargarInformacionProductosServiciosExistencias;
	}
	
	public JButton getjButtonProcesarInformacionProductosServiciosExistencias() {
		return this.jButtonProcesarInformacionProductosServiciosExistencias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosServiciosExistencias)	{
		this.jButtonProcesarInformacionProductosServiciosExistencias = jButtonProcesarInformacionProductosServiciosExistencias;
	}
	
	
	public JButton getjButtonRecargarInformacionProductosServiciosExistencias() {
		return this.jButtonRecargarInformacionProductosServiciosExistencias;
	}
	
	
	public List<ProductosServiciosExistencias> getproductosserviciosexistenciass() {
		return this.productosserviciosexistenciass;
	}

	public void setproductosserviciosexistenciass(List<ProductosServiciosExistencias> productosserviciosexistenciass) {
		this.productosserviciosexistenciass = productosserviciosexistenciass;
	}
	
	public List<ProductosServiciosExistencias> getproductosserviciosexistenciassAux() {
		return this.productosserviciosexistenciassAux;
	}

	public void setproductosserviciosexistenciassAux(List<ProductosServiciosExistencias> productosserviciosexistenciassAux) {
		this.productosserviciosexistenciassAux = productosserviciosexistenciassAux;
	}
	
	public List<ProductosServiciosExistencias> getproductosserviciosexistenciassEliminados() {
		return this.productosserviciosexistenciassEliminados;
	}

	public void setProductosServiciosExistenciassEliminados(List<ProductosServiciosExistencias> productosserviciosexistenciassEliminados) {
		this.productosserviciosexistenciassEliminados = productosserviciosexistenciassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductosServiciosExistencias() {
		return jComboBoxTiposSeleccionarProductosServiciosExistencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductosServiciosExistencias(
			JComboBox jComboBoxTiposSeleccionarProductosServiciosExistencias) {
		this.jComboBoxTiposSeleccionarProductosServiciosExistencias = jComboBoxTiposSeleccionarProductosServiciosExistencias;
	}
	
	public void setBorderResaltarTiposSeleccionarProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductosServiciosExistencias() {
		return jTextFieldValorCampoGeneralProductosServiciosExistencias;
	}

	public void setjTextFieldValorCampoGeneralProductosServiciosExistencias(
			JTextField jTextFieldValorCampoGeneralProductosServiciosExistencias) {
		this.jTextFieldValorCampoGeneralProductosServiciosExistencias = jTextFieldValorCampoGeneralProductosServiciosExistencias;
	}

	public void setBorderResaltarValorCampoGeneralProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductosServiciosExistencias .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductosServiciosExistencias() {
		return this.jCheckBoxSeleccionarTodosProductosServiciosExistencias;
	}

	public void setjCheckBoxSeleccionarTodosProductosServiciosExistencias(
			JCheckBox jCheckBoxSeleccionarTodosProductosServiciosExistencias) {
		this.jCheckBoxSeleccionarTodosProductosServiciosExistencias = jCheckBoxSeleccionarTodosProductosServiciosExistencias;
	}

	public void setBorderResaltarSeleccionarTodosProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductosServiciosExistencias() {
		return this.jCheckBoxSeleccionadosProductosServiciosExistencias;
	}

	public void setjCheckBoxSeleccionadosProductosServiciosExistencias(
			JCheckBox jCheckBoxSeleccionadosProductosServiciosExistencias) {
		this.jCheckBoxSeleccionadosProductosServiciosExistencias = jCheckBoxSeleccionadosProductosServiciosExistencias;
	}
	
	public void setBorderResaltarSeleccionadosProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductosServiciosExistencias() {
		return this.jComboBoxTiposArchivosReportesProductosServiciosExistencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductosServiciosExistencias(
			JComboBox jComboBoxTiposArchivosReportesProductosServiciosExistencias) {
		this.jComboBoxTiposArchivosReportesProductosServiciosExistencias = jComboBoxTiposArchivosReportesProductosServiciosExistencias;
	}

	public void setBorderResaltarTiposArchivosReportesProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductosServiciosExistencias() {
		return this.jComboBoxTiposReportesProductosServiciosExistencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductosServiciosExistencias(
			JComboBox jComboBoxTiposReportesProductosServiciosExistencias) {
		this.jComboBoxTiposReportesProductosServiciosExistencias = jComboBoxTiposReportesProductosServiciosExistencias;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductosServiciosExistencias() {
	//	return jComboBoxTiposReportesDinamicoProductosServiciosExistencias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductosServiciosExistencias(
	//		JComboBox jComboBoxTiposReportesDinamicoProductosServiciosExistencias) {
	//	this.jComboBoxTiposReportesDinamicoProductosServiciosExistencias = jComboBoxTiposReportesDinamicoProductosServiciosExistencias;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias = jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias;
	//}
	
	public void setBorderResaltarTiposReportesProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductosServiciosExistencias() {
		return this.jComboBoxTiposGraficosReportesProductosServiciosExistencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductosServiciosExistencias(
			JComboBox jComboBoxTiposGraficosReportesProductosServiciosExistencias) {
		this.jComboBoxTiposGraficosReportesProductosServiciosExistencias = jComboBoxTiposGraficosReportesProductosServiciosExistencias;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductosServiciosExistencias() {
		return this.jComboBoxTiposPaginacionProductosServiciosExistencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductosServiciosExistencias(
			JComboBox jComboBoxTiposPaginacionProductosServiciosExistencias) {
		this.jComboBoxTiposPaginacionProductosServiciosExistencias = jComboBoxTiposPaginacionProductosServiciosExistencias;
	}
	
	public void setBorderResaltarTiposPaginacionProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductosServiciosExistencias() {
		return this.jComboBoxTiposRelacionesProductosServiciosExistencias;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosServiciosExistencias() {
		return this.jComboBoxTiposAccionesProductosServiciosExistencias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosServiciosExistencias(
			JComboBox jComboBoxTiposRelacionesProductosServiciosExistencias) {
		this.jComboBoxTiposRelacionesProductosServiciosExistencias = jComboBoxTiposRelacionesProductosServiciosExistencias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosServiciosExistencias(
			JComboBox jComboBoxTiposAccionesProductosServiciosExistencias) {
		this.jComboBoxTiposAccionesProductosServiciosExistencias = jComboBoxTiposAccionesProductosServiciosExistencias;
	}
	
	public void setBorderResaltarTiposRelacionesProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductosServiciosExistencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductosServiciosExistencias .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductosServiciosExistencias() {
	//	return jCheckBoxConGraficoDinamicoProductosServiciosExistencias;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductosServiciosExistencias(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductosServiciosExistencias) {
	//	this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias = jCheckBoxConGraficoDinamicoProductosServiciosExistencias;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductosServiciosExistencias() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductosServiciosExistencias.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias .setBorder(borderResaltar);		
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
		this.productosserviciosexistenciasSessionBean=new ProductosServiciosExistenciasSessionBean();
		
		this.productosserviciosexistenciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciosexistenciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosServiciosExistenciasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosServiciosExistenciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosServiciosExistenciasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosServiciosExistenciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosServiciosExistenciasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Servicios Existencias MANTENIMIENTO"));
		
		
		if(iWidth > 2550) {
			iWidth=2550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosServiciosExistenciasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductosServiciosExistencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductosServiciosExistencias= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"nuevo","nuevo","Nuevo"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"duplicar","duplicar","Duplicar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"copiar","copiar","Copiar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"ver_form","ver_form","Ver"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"recargar","recargar","Buscar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductosServiciosExistencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductosServiciosExistencias,this.jTtoolBarProductosServiciosExistencias,
							"cerrar","cerrar","Salir"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductosServiciosExistencias=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductosServiciosExistencias;
			
				this.jButtonProcesarInformacionToolBarProductosServiciosExistencias=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductosServiciosExistencias;
				
		//protected JButton jButtonModificarToolBarProductosServiciosExistencias;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductosServiciosExistencias=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductosServiciosExistencias=new JMenuMe("General");
		this.jmenuArchivoProductosServiciosExistencias=new JMenuMe("Archivo");
		this.jmenuAccionesProductosServiciosExistencias=new JMenuMe("Acciones");
		this.jmenuDatosProductosServiciosExistencias=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosServiciosExistencias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosServiciosExistencias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosServiciosExistencias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductosServiciosExistencias= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductosServiciosExistencias.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductosServiciosExistencias,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductosServiciosExistencias= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductosServiciosExistencias.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductosServiciosExistencias,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductosServiciosExistencias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosServiciosExistencias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosServiciosExistencias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductosServiciosExistencias= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductosServiciosExistencias.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductosServiciosExistencias,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductosServiciosExistencias= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductosServiciosExistencias.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductosServiciosExistencias,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductosServiciosExistencias= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductosServiciosExistencias.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductosServiciosExistencias,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosServiciosExistencias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosServiciosExistencias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosServiciosExistencias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductosServiciosExistencias= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductosServiciosExistencias.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductosServiciosExistencias,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductosServiciosExistencias= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductosServiciosExistencias.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductosServiciosExistencias,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductosServiciosExistencias= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductosServiciosExistencias.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductosServiciosExistencias,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductosServiciosExistencias= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductosServiciosExistencias.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductosServiciosExistencias,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductosServiciosExistencias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductosServiciosExistencias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductosServiciosExistencias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosServiciosExistencias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosServiciosExistencias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosServiciosExistencias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductosServiciosExistencias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductosServiciosExistencias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductosServiciosExistencias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductosServiciosExistencias= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductosServiciosExistencias.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductosServiciosExistencias,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductosServiciosExistencias.add(this.jMenuItemCerrarProductosServiciosExistencias);
			
			this.jmenuAccionesProductosServiciosExistencias.add(this.jMenuItemNuevoProductosServiciosExistencias);
			this.jmenuAccionesProductosServiciosExistencias.add(this.jMenuItemNuevoGuardarCambiosProductosServiciosExistencias);
			this.jmenuAccionesProductosServiciosExistencias.add(this.jMenuItemNuevoRelacionesProductosServiciosExistencias);
			this.jmenuAccionesProductosServiciosExistencias.add(this.jMenuItemGuardarCambiosTablaProductosServiciosExistencias);		
			this.jmenuAccionesProductosServiciosExistencias.add(this.jMenuItemDuplicarProductosServiciosExistencias);		
			this.jmenuAccionesProductosServiciosExistencias.add(this.jMenuItemCopiarProductosServiciosExistencias);		
			this.jmenuAccionesProductosServiciosExistencias.add(this.jMenuItemVerFormProductosServiciosExistencias);		
			
			this.jmenuDatosProductosServiciosExistencias.add(this.jMenuItemRecargarInformacionProductosServiciosExistencias);				
			this.jmenuDatosProductosServiciosExistencias.add(this.jMenuItemAnterioresProductosServiciosExistencias);				
			this.jmenuDatosProductosServiciosExistencias.add(this.jMenuItemSiguientesProductosServiciosExistencias);				
			this.jmenuDatosProductosServiciosExistencias.add(this.jMenuItemAbrirOrderByProductosServiciosExistencias);				
			this.jmenuDatosProductosServiciosExistencias.add(this.jMenuItemMostrarOcultarProductosServiciosExistencias);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductosServiciosExistencias.add(this.jMenuItemGuardarCambiosProductosServiciosExistencias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductosServiciosExistencias.add(this.jmenuArchivoProductosServiciosExistencias);		
			this.jmenuBarProductosServiciosExistencias.add(this.jmenuAccionesProductosServiciosExistencias);		
			this.jmenuBarProductosServiciosExistencias.add(this.jmenuDatosProductosServiciosExistencias);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductosServiciosExistencias);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductosServiciosExistencias() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");
		this.jButtonBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JButtonMe();
		this.jButtonBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setText("Buscar");
		this.jButtonBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosServiciosExistenciasProductosServiciosExistencias,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosServiciosExistenciasProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias = new JLabelMe();
		jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setText("Bodega :");
		jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias = new JLabelMe();
		jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setText("Producto :");
		jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Producto");
		jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias = new JLabelMe();
		jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setText("Linea :");
		jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Linea");
		jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias = new JLabelMe();
		jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias = new JLabelMe();
		jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias = new JLabelMe();
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setText("Tipo Producto Servicio :");
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setToolTipText("Tipo Producto Servicio");
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductosServiciosExistencias=new JTabbedPane();


		this.jTabbedPaneBusquedasProductosServiciosExistencias.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasProductosServiciosExistencias.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasProductosServiciosExistencias.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductosServiciosExistencias = new ProductosServiciosExistenciasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos Servicios Existencias DATOS");
			this.jInternalFrameDetalleFormProductosServiciosExistencias = new ProductosServiciosExistenciasDetalleFormJInternalFrame(jDesktopPane,this.productosserviciosexistenciasSessionBean.getConGuardarRelaciones(),this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductosServiciosExistencias = null;//new ProductosServiciosExistenciasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosServiciosExistencias= new GridBagLayout();
		
		
		this.jTableDatosProductosServiciosExistencias = new JTableMe();      
		
		String sToolTipProductosServiciosExistencias="";
		sToolTipProductosServiciosExistencias=ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosServiciosExistencias+="(Inventario.ProductosServiciosExistencias)";
		}
		
		if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosServiciosExistencias+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductosServiciosExistencias.setToolTipText(sToolTipProductosServiciosExistencias);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductosServiciosExistencias);
		this.jTableDatosProductosServiciosExistencias.setAutoCreateRowSorter(true);
		this.jTableDatosProductosServiciosExistencias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductosServiciosExistencias.setRowSelectionAllowed(true);
		this.jTableDatosProductosServiciosExistencias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductosServiciosExistencias,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductosServiciosExistencias = new JButtonMe();
		this.jButtonDuplicarProductosServiciosExistencias = new JButtonMe();
		this.jButtonCopiarProductosServiciosExistencias = new JButtonMe();
		this.jButtonVerFormProductosServiciosExistencias = new JButtonMe();
		this.jButtonNuevoRelacionesProductosServiciosExistencias = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosExistencias = new JButtonMe();
		this.jButtonCerrarProductosServiciosExistencias = new JButtonMe();
		
		this.jScrollPanelDatosProductosServiciosExistencias = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductosServiciosExistencias = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Servicios Existencias";
		
		if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Existenciases" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosServiciosExistencias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosServiciosExistencias.setToolTipText("Acciones");
        this.jPanelAccionesProductosServiciosExistencias.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductosServiciosExistencias=new ReporteDinamicoJInternalFrame(ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductosServiciosExistencias();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductosServiciosExistencias=new ImportacionJInternalFrame(ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductosServiciosExistencias();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductosServiciosExistencias = new JButtonMe();
		
		this.jButtonAbrirOrderByProductosServiciosExistencias.setText("Orden");
		this.jButtonAbrirOrderByProductosServiciosExistencias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosServiciosExistencias,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosServiciosExistencias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosExistencias,false,this);
			
			//this.cargarOrderByProductosServiciosExistencias(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosServiciosExistencias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosExistencias,true,this);
			
			//this.cargarOrderByProductosServiciosExistencias(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductosServiciosExistencias.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosProductosServiciosExistencias.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosProductosServiciosExistencias.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosProductosServiciosExistencias.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosServiciosExistencias.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosServiciosExistencias.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductosServiciosExistencias.setText("Nuevo");
		this.jButtonDuplicarProductosServiciosExistencias.setText("Duplicar");
		this.jButtonCopiarProductosServiciosExistencias.setText("Copiar");
		this.jButtonVerFormProductosServiciosExistencias.setText("Ver");
		this.jButtonNuevoRelacionesProductosServiciosExistencias.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosExistencias.setText("Guardar");
		this.jButtonCerrarProductosServiciosExistencias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosServiciosExistencias,"nuevo_button","Nuevo",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductosServiciosExistencias,"duplicar_button","Duplicar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductosServiciosExistencias,"copiar_button","Copiar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductosServiciosExistencias,"ver_form","Ver",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductosServiciosExistencias,"nuevorelaciones_button","Nuevo Rel",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosServiciosExistencias,"guardarcambiostabla_button","Guardar",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosServiciosExistencias,"cerrar_button","Salir",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductosServiciosExistencias.setToolTipText("Nuevo"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductosServiciosExistencias.setToolTipText("Duplicar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductosServiciosExistencias.setToolTipText("Copiar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductosServiciosExistencias.setToolTipText("Ver"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductosServiciosExistencias.setToolTipText("Nuevo Rel"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosExistencias.setToolTipText("Guardar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosServiciosExistencias.setToolTipText("Salir"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosServiciosExistencias";
		inputMap = this.jButtonNuevoProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosServiciosExistencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosServiciosExistencias"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductosServiciosExistencias";
		inputMap = this.jButtonDuplicarProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductosServiciosExistencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductosServiciosExistencias"));
		
		//COPIAR
		sMapKey = "CopiarProductosServiciosExistencias";
		inputMap = this.jButtonCopiarProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductosServiciosExistencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductosServiciosExistencias"));
		
		//VEr FORM
		sMapKey = "VerFormProductosServiciosExistencias";
		inputMap = this.jButtonVerFormProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductosServiciosExistencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductosServiciosExistencias"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductosServiciosExistencias";
		inputMap = this.jButtonNuevoRelacionesProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductosServiciosExistencias"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductosServiciosExistencias";
		inputMap = this.jButtonModificarProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductosServiciosExistencias"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductosServiciosExistencias";
		inputMap = this.jButtonCerrarProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosServiciosExistencias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosServiciosExistencias";
		inputMap = this.jButtonGuardarCambiosTablaProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosServiciosExistencias"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductosServiciosExistencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductosServiciosExistencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductosServiciosExistencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductosServiciosExistencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductosServiciosExistencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductosServiciosExistencias.setName("jPanelParametrosReportesProductosServiciosExistencias"); 
		
		this.jPanelParametrosReportesAccionesProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductosServiciosExistencias.setName("jPanelParametrosReportesAccionesProductosServiciosExistencias"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductosServiciosExistencias = new JButtonMe();
		this.jButtonRecargarInformacionProductosServiciosExistencias.setText("Buscar");
		this.jButtonRecargarInformacionProductosServiciosExistencias.setToolTipText("Buscar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductosServiciosExistencias,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductosServiciosExistencias.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductosServiciosExistencias = new JButtonMe();
		this.jButtonProcesarInformacionProductosServiciosExistencias.setText("Procesar");
		this.jButtonProcesarInformacionProductosServiciosExistencias.setToolTipText("Procesar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductosServiciosExistencias.setVisible(false);
			
		this.jButtonProcesarInformacionProductosServiciosExistencias.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosServiciosExistencias.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosServiciosExistencias.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosExistencias.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductosServiciosExistencias.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosExistencias.setText("TIPO");       
		this.jComboBoxTiposReportesProductosServiciosExistencias.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosExistencias.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductosServiciosExistencias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductosServiciosExistencias.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductosServiciosExistencias.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductosServiciosExistencias.setText("Accion");
		this.jComboBoxTiposRelacionesProductosServiciosExistencias.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosServiciosExistencias.setText("Accion");
		this.jComboBoxTiposAccionesProductosServiciosExistencias.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductosServiciosExistencias.setText("Accion");
		this.jComboBoxTiposSeleccionarProductosServiciosExistencias.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductosServiciosExistencias=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductosServiciosExistencias.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosServiciosExistencias.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosServiciosExistencias.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductosServiciosExistencias = new JLabelMe();
		
		this.jLabelAccionesProductosServiciosExistencias.setText("Acciones");		
		this.jLabelAccionesProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductosServiciosExistencias = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductosServiciosExistencias.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductosServiciosExistencias.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductosServiciosExistencias = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductosServiciosExistencias.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductosServiciosExistencias.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductosServiciosExistencias = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductosServiciosExistencias.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductosServiciosExistencias.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductosServiciosExistencias = new JButtonMe();
		//this.jButtonAnterioresProductosServiciosExistencias.setText("<<");
        this.jButtonAnterioresProductosServiciosExistencias.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductosServiciosExistencias,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductosServiciosExistencias = new JButtonMe();
		//this.jButtonSiguientesProductosServiciosExistencias.setText(">>");
        this.jButtonSiguientesProductosServiciosExistencias.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductosServiciosExistencias,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductosServiciosExistencias = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductosServiciosExistencias.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductosServiciosExistencias.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductosServiciosExistencias,"nuevoguardarcambios_button","Nue",this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductosServiciosExistencias";
		inputMap = this.jButtonNuevoGuardarCambiosProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductosServiciosExistencias"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductosServiciosExistencias";
		inputMap = this.jButtonRecargarInformacionProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductosServiciosExistencias"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductosServiciosExistencias";
		inputMap = this.jButtonSiguientesProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductosServiciosExistencias"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductosServiciosExistencias";
		inputMap = this.jButtonAnterioresProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductosServiciosExistencias"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductosServiciosExistencias();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductosServiciosExistencias.setMinimumSize(new Dimension(this.getWidth(),ProductosServiciosExistenciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosExistenciasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosServiciosExistencias.setMaximumSize(new Dimension(this.getWidth(),ProductosServiciosExistenciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosExistenciasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosServiciosExistencias.setPreferredSize(new Dimension(this.getWidth(),ProductosServiciosExistenciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosExistenciasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductosServiciosExistencias = new GridBagLayout();

			this.jPanelPaginacionProductosServiciosExistencias.setLayout(gridaBagLayoutPaginacionProductosServiciosExistencias);						
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonAnterioresProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
					
						
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
			
			this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonNuevoGuardarCambiosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
						
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
			this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonSiguientesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 1;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonNuevoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
						
			
			
			if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductosServiciosExistencias.gridy = 1;
				this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonGuardarCambiosTablaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			}
			
			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 1;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonDuplicarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 1;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonCopiarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 1;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonVerFormProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 1;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductosServiciosExistencias.add(this.jButtonCerrarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		
		
		this.jButtonRecargarInformacionProductosServiciosExistencias.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosServiciosExistencias.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosServiciosExistencias.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductosServiciosExistencias.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosServiciosExistencias.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosServiciosExistencias.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductosServiciosExistencias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosServiciosExistencias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosServiciosExistencias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductosServiciosExistencias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosServiciosExistencias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosServiciosExistencias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductosServiciosExistencias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosServiciosExistencias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosServiciosExistencias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductosServiciosExistencias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosServiciosExistencias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosServiciosExistencias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductosServiciosExistencias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosExistencias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosExistencias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductosServiciosExistencias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosServiciosExistencias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosServiciosExistencias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductosServiciosExistencias.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosServiciosExistencias.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosServiciosExistencias.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductosServiciosExistencias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosServiciosExistencias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosServiciosExistencias.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductosServiciosExistencias.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosServiciosExistencias.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosServiciosExistencias.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductosServiciosExistencias = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductosServiciosExistencias = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductosServiciosExistencias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductosServiciosExistencias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductosServiciosExistencias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductosServiciosExistencias = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductosServiciosExistencias.setLayout(gridaBagParametrosReportesProductosServiciosExistencias);
			this.jPanelParametrosReportesAccionesProductosServiciosExistencias.setLayout(gridaBagParametrosReportesAccionesProductosServiciosExistencias);
			
			
			this.jPanelParametrosAuxiliar1ProductosServiciosExistencias.setLayout(gridaBagParametrosAuxiliar1ProductosServiciosExistencias);
			this.jPanelParametrosAuxiliar2ProductosServiciosExistencias.setLayout(gridaBagParametrosAuxiliar2ProductosServiciosExistencias);
			this.jPanelParametrosAuxiliar3ProductosServiciosExistencias.setLayout(gridaBagParametrosAuxiliar3ProductosServiciosExistencias);
			this.jPanelParametrosAuxiliar4ProductosServiciosExistencias.setLayout(gridaBagParametrosAuxiliar4ProductosServiciosExistencias);
			//this.jPanelParametrosAuxiliar5ProductosServiciosExistencias.setLayout(gridaBagParametrosAuxiliar2ProductosServiciosExistencias);			
			
			
			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jButtonRecargarInformacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosExistencias.add(this.jComboBoxTiposPaginacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosExistencias.add(this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosExistencias.add(this.jComboBoxTiposArchivosReportesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jPanelParametrosAuxiliar1ProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductosServiciosExistencias.add(this.jComboBoxTiposReportesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);																		
			
			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductosServiciosExistencias.add(this.jComboBoxTiposGraficosReportesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jPanelParametrosAuxiliar4ProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jComboBoxTiposReportesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jCheckBoxGenerarReporteProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jPanelParametrosAuxiliar2ProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jLabelAccionesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jButtonAbrirOrderByProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jComboBoxTiposSeleccionarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);			
			
			
			/*
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jCheckBoxSeleccionarTodosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jCheckBoxConGraficoReporteProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosExistencias.add(this.jCheckBoxSeleccionarTodosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);															
				
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosExistencias.add(this.jCheckBoxSeleccionadosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);															
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosExistencias.add(this.jCheckBoxConGraficoReporteProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jPanelParametrosAuxiliar3ProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosExistencias.add(this.jComboBoxTiposAccionesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductosServiciosExistencias = new GridBagLayout();

			this.jScrollPanelDatosProductosServiciosExistencias.setLayout(gridaBagLayoutDatosProductosServiciosExistencias);
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
			
			this.jScrollPanelDatosProductosServiciosExistencias.add(this.jTableDatosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductosServiciosExistencias.setViewportView(this.jTableDatosProductosServiciosExistencias);
		this.jTableDatosProductosServiciosExistencias.setFillsViewportHeight(true);
		this.jTableDatosProductosServiciosExistencias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductosServiciosExistencias= new GridBagLayout();
		this.jPanelAccionesProductosServiciosExistencias.setLayout(gridaBagLayoutAccionesProductosServiciosExistencias);
		
		
		/*	
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
			
		this.jPanelAccionesProductosServiciosExistencias.add(this.jButtonNuevoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosServiciosExistenciasProductosServiciosExistencias= new GridBagLayout();
		gridaBagLayoutBusquedaProductosServiciosExistenciasProductosServiciosExistencias.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosServiciosExistenciasProductosServiciosExistencias.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosServiciosExistenciasProductosServiciosExistencias.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosServiciosExistenciasProductosServiciosExistencias.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.setLayout(gridaBagLayoutBusquedaProductosServiciosExistenciasProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jLabelid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 0;
		gridBagConstraintsProductosServiciosExistencias.gridx = 1;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jComboBoxid_bodegaBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);


		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 1;
		gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jLabelid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 1;
		gridBagConstraintsProductosServiciosExistencias.gridx = 1;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jComboBoxid_productoBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);


		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 2;
		gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jLabelid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 2;
		gridBagConstraintsProductosServiciosExistencias.gridx = 1;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jComboBoxid_lineaBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);


		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 3;
		gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jLabelid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 3;
		gridBagConstraintsProductosServiciosExistencias.gridx = 1;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jComboBoxid_linea_grupoBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);


		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 4;
		gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jLabelid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 4;
		gridBagConstraintsProductosServiciosExistencias.gridx = 1;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jComboBoxid_linea_categoriaBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);


		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 5;
		gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jLabelid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 5;
		gridBagConstraintsProductosServiciosExistencias.gridx = 1;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jComboBoxid_linea_marcaBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);


		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 6;
		gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jLabelid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 6;
		gridBagConstraintsProductosServiciosExistencias.gridx = 1;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosExistencias.gridy = 7;
		gridBagConstraintsProductosServiciosExistencias.gridx =1;
		jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias.add(jButtonBusquedaProductosServiciosExistenciasProductosServiciosExistencias, gridBagConstraintsProductosServiciosExistencias);

		jTabbedPaneBusquedasProductosServiciosExistencias.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio ", jPanelBusquedaProductosServiciosExistenciasProductosServiciosExistencias);
		jTabbedPaneBusquedasProductosServiciosExistencias.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosServiciosExistencias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosServiciosExistencias);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();						
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;		
			//this.gridBagConstraintsProductosServiciosExistencias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosServiciosExistencias.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;		
		//this.gridBagConstraintsProductosServiciosExistencias.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductosServiciosExistencias.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductosServiciosExistencias);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;		
			this.gridBagConstraintsProductosServiciosExistencias.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductosServiciosExistencias.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);								
		
		
		/*
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		*/		
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosExistencias.gridx =0;
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosServiciosExistencias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
				
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosServiciosExistenciasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductosServiciosExistencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosServiciosExistencias = new GridBagLayout();
			this.jPanelBusquedasParametrosProductosServiciosExistencias.setLayout(gridaBagLayoutBusquedasParametrosProductosServiciosExistencias);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductosServiciosExistencias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
			
			
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
			
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductosServiciosExistencias;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductosServiciosExistencias() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductosServiciosExistencias = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductosServiciosExistencias.setName("jPanelReporteDinamicoProductosServiciosExistencias"); 
		
		this.jPanelReporteDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductosServiciosExistencias.setLayout(gridaBagLayoutReporteDinamicoProductosServiciosExistencias);
		
		
		this.jInternalFrameReporteDinamicoProductosServiciosExistencias= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductosServiciosExistencias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosServiciosExistencias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Existenciases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductosServiciosExistencias = new JLabelMe();

		this.jLabelColumnasSelectReporteProductosServiciosExistencias.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jLabelColumnasSelectReporteProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductosServiciosExistencias = new JList<Reporte>();
		this.jListColumnasSelectReporteProductosServiciosExistencias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductosServiciosExistencias.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductosServiciosExistencias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosServiciosExistencias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosServiciosExistencias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductosServiciosExistencias=new JScrollPane(this.jListColumnasSelectReporteProductosServiciosExistencias);
			
			this.jScrollColumnasSelectReporteProductosServiciosExistencias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosServiciosExistencias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosServiciosExistencias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jListColumnasSelectReporteProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jScrollColumnasSelectReporteProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductosServiciosExistencias = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductosServiciosExistencias.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductosServiciosExistencias = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductosServiciosExistencias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductosServiciosExistencias.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductosServiciosExistencias.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosServiciosExistencias.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosServiciosExistencias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductosServiciosExistencias=new JScrollPane(this.jListRelacionesSelectReporteProductosServiciosExistencias);
			
			this.jScrollRelacionesSelectReporteProductosServiciosExistencias.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosServiciosExistencias.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosServiciosExistencias.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductosServiciosExistencias = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductosServiciosExistencias = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductosServiciosExistencias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductosServiciosExistencias = new JLabelMe();

		this.jLabelConGraficoDinamicoProductosServiciosExistencias.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jLabelConGraficoDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jCheckBoxConGraficoDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductosServiciosExistencias = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductosServiciosExistencias.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jLabelColumnaCategoriaGraficoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductosServiciosExistencias = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductosServiciosExistencias.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jLabelColumnaCategoriaValorProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductosServiciosExistencias.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductosServiciosExistencias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductosServiciosExistencias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosServiciosExistencias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosServiciosExistencias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jComboBoxColumnaCategoriaValorProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductosServiciosExistencias = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductosServiciosExistencias.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jLabelColumnasValoresGraficoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductosServiciosExistencias = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductosServiciosExistencias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductosServiciosExistencias.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductosServiciosExistencias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosServiciosExistencias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosServiciosExistencias.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductosServiciosExistencias=new JScrollPane(this.jListColumnasValoresGraficoProductosServiciosExistencias);
			
			this.jScrollColumnasValoresGraficoProductosServiciosExistencias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosServiciosExistencias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosServiciosExistencias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jListColumnasSelectReporteProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jScrollColumnasValoresGraficoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosExistencias = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductosServiciosExistencias.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jLabelTiposGraficosReportesDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosExistencias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosServiciosExistencias.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosExistencias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosExistencias = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductosServiciosExistencias.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jLabelGenerarExcelReporteDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosExistencias = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosExistencias.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductosServiciosExistencias,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosExistencias.setToolTipText("Generar EXCEL"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jButtonGenerarExcelReporteDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jComboBoxTiposReportesDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosExistencias = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductosServiciosExistencias.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jLabelTiposArchivoReporteDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductosServiciosExistencias = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductosServiciosExistencias.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductosServiciosExistencias,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductosServiciosExistencias.setToolTipText("Generar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jButtonGenerarReporteDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductosServiciosExistencias = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductosServiciosExistencias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductosServiciosExistencias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductosServiciosExistencias.setToolTipText("Cancelar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosExistencias.add(this.jButtonCerrarReporteDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductosServiciosExistencias = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductosServiciosExistencias= new JScrollPane(jPanelReporteDinamicoProductosServiciosExistencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Existenciases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosExistencias.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductosServiciosExistencias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductosServiciosExistencias.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductosServiciosExistencias);
		this.jInternalFrameReporteDinamicoProductosServiciosExistencias.getContentPane().add(this.jScrollPanelReporteDinamicoProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductosServiciosExistencias() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductosServiciosExistencias = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductosServiciosExistencias.setName("jPanelImportacionProductosServiciosExistencias"); 
		
		this.jPanelImportacionProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductosServiciosExistencias.setLayout(gridaBagLayoutImportacionProductosServiciosExistencias);
		
		
		this.jInternalFrameImportacionProductosServiciosExistencias= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductosServiciosExistencias= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductosServiciosExistencias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosServiciosExistencias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductosServiciosExistencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosServiciosExistencias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosServiciosExistencias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductosServiciosExistencias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosServiciosExistencias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosServiciosExistencias.setResizable(true);
	    this.jInternalFrameImportacionProductosServiciosExistencias.setClosable(true);
	    this.jInternalFrameImportacionProductosServiciosExistencias.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductosServiciosExistencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosServiciosExistencias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosServiciosExistencias.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductosServiciosExistencias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosServiciosExistencias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosServiciosExistencias.setResizable(true);
	    this.jInternalFrameImportacionProductosServiciosExistencias.setClosable(true);
	    this.jInternalFrameImportacionProductosServiciosExistencias.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Existenciases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductosServiciosExistencias = new JLabelMe();

		this.jLabelArchivoImportacionProductosServiciosExistencias.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosServiciosExistencias.add(this.jLabelArchivoImportacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductosServiciosExistencias = new JFileChooser();		
		this.jFileChooserImportacionProductosServiciosExistencias.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductosServiciosExistencias = new JButtonMe();
		this.jButtonAbrirImportacionProductosServiciosExistencias.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductosServiciosExistencias,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductosServiciosExistencias.setToolTipText("Generar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosExistencias.add(this.jButtonAbrirImportacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductosServiciosExistencias = new JLabelMe();

		this.jLabelPathArchivoImportacionProductosServiciosExistencias.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductosServiciosExistencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosServiciosExistencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosServiciosExistencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosServiciosExistencias.add(this.jLabelPathArchivoImportacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductosServiciosExistencias=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductosServiciosExistencias.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosServiciosExistencias.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosServiciosExistencias.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosExistencias.add(this.jTextFieldPathArchivoImportacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductosServiciosExistencias = new JButtonMe();
		this.jButtonGenerarImportacionProductosServiciosExistencias.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductosServiciosExistencias,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductosServiciosExistencias.setToolTipText("Generar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosExistencias.add(this.jButtonGenerarImportacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductosServiciosExistencias = new JButtonMe();
		this.jButtonCerrarImportacionProductosServiciosExistencias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductosServiciosExistencias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductosServiciosExistencias.setToolTipText("Cancelar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosExistencias.add(this.jButtonCerrarImportacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductosServiciosExistencias = new GridBagLayout();
		
		this.jScrollPanelImportacionProductosServiciosExistencias= new JScrollPane(jPanelImportacionProductosServiciosExistencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosExistencias.gridy =iPosYImportacion;
		this.gridBagConstraintsProductosServiciosExistencias.gridx =iPosXImportacion;
		this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductosServiciosExistencias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductosServiciosExistencias.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductosServiciosExistencias);
		this.jInternalFrameImportacionProductosServiciosExistencias.getContentPane().add(this.jScrollPanelImportacionProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductosServiciosExistencias(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductosServiciosExistencias = new JButtonMe();
			this.jButtonAbrirOrderByProductosServiciosExistencias.setText("Orden");
			this.jButtonAbrirOrderByProductosServiciosExistencias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosServiciosExistencias,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductosServiciosExistencias";
			inputMap = this.jButtonAbrirOrderByProductosServiciosExistencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductosServiciosExistencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductosServiciosExistencias"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductosServiciosExistencias = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductosServiciosExistencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductosServiciosExistencias.setName("jPanelOrderByProductosServiciosExistencias"); 
			
			this.jPanelOrderByProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductosServiciosExistencias.setLayout(gridaBagLayoutOrderByProductosServiciosExistencias);
			
			
			this.jTableDatosProductosServiciosExistenciasOrderBy = new JTableMe();        
			this.jTableDatosProductosServiciosExistenciasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosServiciosExistenciasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosServiciosExistenciasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosServiciosExistenciasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosServiciosExistenciasOrderBy.setViewportView(this.jTableDatosProductosServiciosExistenciasOrderBy);
			this.jTableDatosProductosServiciosExistenciasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosServiciosExistenciasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductosServiciosExistencias= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductosServiciosExistencias= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductosServiciosExistencias = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductosServiciosExistencias= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductosServiciosExistencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductosServiciosExistencias.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductosServiciosExistencias.setTitle("Orden");
			this.jInternalFrameOrderByProductosServiciosExistencias.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductosServiciosExistencias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductosServiciosExistencias.setResizable(true);
			this.jInternalFrameOrderByProductosServiciosExistencias.setClosable(true);
			this.jInternalFrameOrderByProductosServiciosExistencias.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductosServiciosExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Existenciases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductosServiciosExistencias.ipady =150;
				
			this.jPanelOrderByProductosServiciosExistencias.add(jScrollPanelDatosProductosServiciosExistenciasOrderBy, this.gridBagConstraintsProductosServiciosExistencias);//this.jTableDatosProductosServiciosExistenciasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductosServiciosExistencias = new JButtonMe();
			this.jButtonCerrarOrderByProductosServiciosExistencias.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductosServiciosExistencias,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductosServiciosExistencias.setToolTipText("Cancelar"+" "+ProductosServiciosExistenciasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductosServiciosExistencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosExistencias.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductosServiciosExistencias.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductosServiciosExistencias.add(this.jButtonCerrarOrderByProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductosServiciosExistencias = new GridBagLayout();
			
			this.jScrollPanelOrderByProductosServiciosExistencias= new JScrollPane(jPanelOrderByProductosServiciosExistencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductosServiciosExistencias = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosExistencias.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductosServiciosExistencias.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosServiciosExistencias.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductosServiciosExistencias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductosServiciosExistencias.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductosServiciosExistencias);
			
			this.jInternalFrameOrderByProductosServiciosExistencias.getContentPane().add(this.jScrollPanelOrderByProductosServiciosExistencias, this.gridBagConstraintsProductosServiciosExistencias);			
		
		} else {
			this.jButtonAbrirOrderByProductosServiciosExistencias = new JButtonMe();
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
		int iWidthTableCalculado=0;//4430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productosserviciosexistenciasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductosServiciosExistencias.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductosServiciosExistencias.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductosServiciosExistencias.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductosServiciosExistencias.getRowHeight();//ProductosServiciosExistenciasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosServiciosExistenciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias.isSelected()) {
					iHeightTable=ProductosServiciosExistenciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosServiciosExistenciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosServiciosExistenciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosServiciosExistenciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosServiciosExistencias.isSelected()) {
					iHeightTable=ProductosServiciosExistenciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosServiciosExistenciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosServiciosExistenciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductosServiciosExistencias!=null && this.jInternalFrameOrderByProductosServiciosExistencias.getjTableDatosOrderBy()!=null) {
			//if(!this.productosserviciosexistenciasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductosServiciosExistencias.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductosServiciosExistencias.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductosServiciosExistencias.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductosServiciosExistencias.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductosServiciosExistencias.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductosServiciosExistencias.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductosServiciosExistencias.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductosServiciosExistencias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosServiciosExistencias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosServiciosExistencias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=productosserviciosexistenciasLogic.getProductosServiciosExistenciass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciosexistenciass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductosServiciosExistencias> TraerProductosServiciosExistenciasBeans(List<ProductosServiciosExistencias> productosserviciosexistenciass,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductosServiciosExistencias productosserviciosexistencias:productosserviciosexistenciass) {
					
				if(!(ProductosServiciosExistenciasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosServiciosExistenciasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productosserviciosexistencias.setsDetalleGeneralEntityReporte(ProductosServiciosExistenciasConstantesFunciones.getProductosServiciosExistenciasDescripcion(productosserviciosexistencias));
										
						
					
						
					
				} else  {
							
					//productosserviciosexistencias.setsDetalleGeneralEntityReporte(productosserviciosexistencias.getsDetalleGeneralEntityReporte());
										
				}
				
				//productosserviciosexistenciasbeans.add(productosserviciosexistenciasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productosserviciosexistenciass;
    }
	//PARA REPORTES FIN
}
