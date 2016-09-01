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
import com.bydan.erp.inventario.util.report.PedidosComprasConstantesFunciones;

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
public class PedidosComprasJInternalFrame extends PedidosComprasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedidosCompras;
	
	protected JMenuBar jmenuBarPedidosCompras;
	
	protected JMenu jmenuPedidosCompras;
	protected JMenu jmenuDatosPedidosCompras;
	protected JMenu jmenuArchivoPedidosCompras;
	protected JMenu jmenuAccionesPedidosCompras;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidosCompras;	
	protected GridBagConstraints gridBagConstraintsPedidosCompras;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidosComprasDetalleFormJInternalFrame jInternalFrameDetalleFormPedidosCompras;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedidosCompras;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedidosCompras;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

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
	
	public PedidosComprasSessionBean pedidoscomprasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PedidosCompras> pedidoscomprass;		
	public List<PedidosCompras> pedidoscomprassEliminados;	
	public List<PedidosCompras> pedidoscomprassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedidosCompras;		
	protected JButton jButtonAbrirOrderByPedidosCompras;
	
	
	//protected JPanel jPanelOrderByPedidosCompras;
	//public JScrollPane jScrollPanelOrderByPedidosCompras;	
	//protected JButton jButtonCerrarOrderByPedidosCompras;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidosComprasLogic pedidoscomprasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedidosCompras;
	public JScrollPane jScrollPanelDatosEdicionPedidosCompras;
	public JScrollPane jScrollPanelDatosGeneralPedidosCompras;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidosComprasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedidosCompras;
	//public JScrollPane jScrollPanelImportacionPedidosCompras;
	
	
	
	protected JPanel jPanelAccionesPedidosCompras;
	
    protected JPanel jPanelPaginacionPedidosCompras;
    protected JPanel jPanelParametrosReportesPedidosCompras;
	protected JPanel jPanelParametrosReportesAccionesPedidosCompras;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PedidosCompras;
	protected JPanel jPanelParametrosAuxiliar2PedidosCompras;
	protected JPanel jPanelParametrosAuxiliar3PedidosCompras;
	protected JPanel jPanelParametrosAuxiliar4PedidosCompras;
	//protected JPanel jPanelParametrosAuxiliar5PedidosCompras;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedidosCompras;
	//protected JPanel jPanelImportacionPedidosCompras;
	
	
	public JTable jTableDatosPedidosCompras;
	
	
	
	//public JTable jTableDatosPedidosComprasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedidosCompras;
	protected JButton jButtonDuplicarPedidosCompras;
	protected JButton jButtonCopiarPedidosCompras;
	protected JButton jButtonVerFormPedidosCompras;
	protected JButton jButtonNuevoRelacionesPedidosCompras;
	protected JButton jButtonModificarPedidosCompras;
	
    protected JButton jButtonGuardarCambiosTablaPedidosCompras;
	protected JButton jButtonCerrarPedidosCompras;
	
	
	protected JButton jButtonRecargarInformacionPedidosCompras;
	protected JButton jButtonProcesarInformacionPedidosCompras;
	
	
	protected JButton jButtonAnterioresPedidosCompras;
	protected JButton jButtonSiguientesPedidosCompras;
	protected JButton jButtonNuevoGuardarCambiosPedidosCompras;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedidosCompras;
	//protected JButton jButtonCerrarReporteDinamicoPedidosCompras;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedidosCompras;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedidosCompras;
	//protected JButton jButtonGenerarImportacionPedidosCompras;
	//protected JButton jButtonCerrarImportacionPedidosCompras;
	//protected JFileChooser jFileChooserImportacionPedidosCompras;
	//protected File fileImportacionPedidosCompras;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidosCompras;
	protected JButton jButtonDuplicarToolBarPedidosCompras;
	protected JButton jButtonNuevoRelacionesToolBarPedidosCompras;
	
	
	public JButton jButtonGuardarCambiosToolBarPedidosCompras;
	protected JButton jButtonCopiarToolBarPedidosCompras;
	protected JButton jButtonVerFormToolBarPedidosCompras;
	public JButton jButtonGuardarCambiosTablaToolBarPedidosCompras;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidosCompras;
	protected JButton jButtonCerrarToolBarPedidosCompras;
	
	protected JButton jButtonRecargarInformacionToolBarPedidosCompras;
	protected JButton jButtonProcesarInformacionToolBarPedidosCompras;
	protected JButton jButtonAnterioresToolBarPedidosCompras;
	protected JButton jButtonSiguientesToolBarPedidosCompras;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedidosCompras;
	protected JButton jButtonAbrirOrderByToolBarPedidosCompras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidosCompras;
	protected JMenuItem jMenuItemDuplicarPedidosCompras;
	protected JMenuItem jMenuItemNuevoRelacionesPedidosCompras;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedidosCompras;
	protected JMenuItem jMenuItemCopiarPedidosCompras;
	protected JMenuItem jMenuItemVerFormPedidosCompras;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidosCompras;
	protected JMenuItem jMenuItemCerrarPedidosCompras;
	protected JMenuItem jMenuItemDetalleCerrarPedidosCompras;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedidosCompras;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidosCompras;
	
	protected JMenuItem jMenuItemRecargarInformacionPedidosCompras;
	protected JMenuItem jMenuItemProcesarInformacionPedidosCompras;
	protected JMenuItem jMenuItemAnterioresPedidosCompras;
	protected JMenuItem jMenuItemSiguientesPedidosCompras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidosCompras;
	protected JMenuItem jMenuItemAbrirOrderByPedidosCompras;
	protected JMenuItem jMenuItemMostrarOcultarPedidosCompras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidosCompras;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedidosCompras;
	protected JCheckBox jCheckBoxSeleccionadosPedidosCompras;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedidosCompras;
	protected JCheckBox jCheckBoxConGraficoReportePedidosCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedidosCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedidosCompras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedidosCompras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedidosCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedidosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedidosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedidosCompras;
	protected JTextField jTextFieldValorCampoGeneralPedidosCompras;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedidosCompras;
	//public JList<Reporte> jListColumnasSelectReportePedidosCompras;
	//public JScrollPane jScrollColumnasSelectReportePedidosCompras;
	
	//public JLabel jLabelRelacionesSelectReportePedidosCompras;
	//public JList<Reporte> jListRelacionesSelectReportePedidosCompras;
	//public JScrollPane jScrollRelacionesSelectReportePedidosCompras;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedidosCompras;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedidosCompras;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedidosCompras;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedidosCompras;
	
		
	//public JLabel jLabelArchivoImportacionPedidosCompras;	
	//public JLabel jLabelPathArchivoImportacionPedidosCompras;
	//protected JTextField jTextFieldPathArchivoImportacionPedidosCompras;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedidosCompras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedidosCompras;
	
	//public JLabel jLabelColumnaCategoriaValorPedidosCompras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedidosCompras;
	
	//public JLabel jLabelColumnasValoresGraficoPedidosCompras;
	//public JList<Reporte> jListColumnasValoresGraficoPedidosCompras;
	//public JScrollPane jScrollColumnasValoresGraficoPedidosCompras;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedidosCompras;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedidosCompras;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedidosCompras;
	public JPanel jPanelBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonBusquedaPedidosComprasPedidosCompras;
	
	public JPanel jPanelid_productoBusquedaPedidosComprasPedidosCompras;
	public JLabel jLabelid_productoBusquedaPedidosComprasPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonid_productoBusquedaPedidosComprasPedidosCompras= new JButtonMe();
	public JButton jButtonid_productoBusquedaPedidosComprasPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaPedidosComprasPedidosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaPedidosComprasPedidosCompras;
	public JLabel jLabelid_lineaBusquedaPedidosComprasPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonid_lineaBusquedaPedidosComprasPedidosCompras= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPedidosComprasPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPedidosComprasPedidosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaPedidosComprasPedidosCompras;
	public JLabel jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonid_linea_grupoBusquedaPedidosComprasPedidosCompras= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPedidosComprasPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPedidosComprasPedidosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaPedidosComprasPedidosCompras;
	public JLabel jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonid_linea_categoriaBusquedaPedidosComprasPedidosCompras= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPedidosComprasPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPedidosComprasPedidosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaPedidosComprasPedidosCompras;
	public JLabel jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonid_linea_marcaBusquedaPedidosComprasPedidosCompras= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPedidosComprasPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPedidosComprasPedidosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras;
	public JLabel jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaPedidosComprasPedidosComprasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaPedidosComprasPedidosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras;
	public JLabel jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonfecha_emision_desdeBusquedaPedidosComprasPedidosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras;
	public JLabel jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras;
	public JButton jButtonfecha_emision_hastaBusquedaPedidosComprasPedidosComprasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PedidosComprasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosComprasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosComprasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosComprasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedidosCompras)	{
		this.jButtonRecargarInformacionPedidosCompras = jButtonRecargarInformacionPedidosCompras;
	}
	
	public JButton getjButtonProcesarInformacionPedidosCompras() {
		return this.jButtonProcesarInformacionPedidosCompras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidosCompras)	{
		this.jButtonProcesarInformacionPedidosCompras = jButtonProcesarInformacionPedidosCompras;
	}
	
	
	public JButton getjButtonRecargarInformacionPedidosCompras() {
		return this.jButtonRecargarInformacionPedidosCompras;
	}
	
	
	public List<PedidosCompras> getpedidoscomprass() {
		return this.pedidoscomprass;
	}

	public void setpedidoscomprass(List<PedidosCompras> pedidoscomprass) {
		this.pedidoscomprass = pedidoscomprass;
	}
	
	public List<PedidosCompras> getpedidoscomprassAux() {
		return this.pedidoscomprassAux;
	}

	public void setpedidoscomprassAux(List<PedidosCompras> pedidoscomprassAux) {
		this.pedidoscomprassAux = pedidoscomprassAux;
	}
	
	public List<PedidosCompras> getpedidoscomprassEliminados() {
		return this.pedidoscomprassEliminados;
	}

	public void setPedidosComprassEliminados(List<PedidosCompras> pedidoscomprassEliminados) {
		this.pedidoscomprassEliminados = pedidoscomprassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedidosCompras() {
		return jComboBoxTiposSeleccionarPedidosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedidosCompras(
			JComboBox jComboBoxTiposSeleccionarPedidosCompras) {
		this.jComboBoxTiposSeleccionarPedidosCompras = jComboBoxTiposSeleccionarPedidosCompras;
	}
	
	public void setBorderResaltarTiposSeleccionarPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedidosCompras .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedidosCompras() {
		return jTextFieldValorCampoGeneralPedidosCompras;
	}

	public void setjTextFieldValorCampoGeneralPedidosCompras(
			JTextField jTextFieldValorCampoGeneralPedidosCompras) {
		this.jTextFieldValorCampoGeneralPedidosCompras = jTextFieldValorCampoGeneralPedidosCompras;
	}

	public void setBorderResaltarValorCampoGeneralPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedidosCompras .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedidosCompras() {
		return this.jCheckBoxSeleccionarTodosPedidosCompras;
	}

	public void setjCheckBoxSeleccionarTodosPedidosCompras(
			JCheckBox jCheckBoxSeleccionarTodosPedidosCompras) {
		this.jCheckBoxSeleccionarTodosPedidosCompras = jCheckBoxSeleccionarTodosPedidosCompras;
	}

	public void setBorderResaltarSeleccionarTodosPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedidosCompras .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedidosCompras() {
		return this.jCheckBoxSeleccionadosPedidosCompras;
	}

	public void setjCheckBoxSeleccionadosPedidosCompras(
			JCheckBox jCheckBoxSeleccionadosPedidosCompras) {
		this.jCheckBoxSeleccionadosPedidosCompras = jCheckBoxSeleccionadosPedidosCompras;
	}
	
	public void setBorderResaltarSeleccionadosPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedidosCompras .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedidosCompras() {
		return this.jComboBoxTiposArchivosReportesPedidosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedidosCompras(
			JComboBox jComboBoxTiposArchivosReportesPedidosCompras) {
		this.jComboBoxTiposArchivosReportesPedidosCompras = jComboBoxTiposArchivosReportesPedidosCompras;
	}

	public void setBorderResaltarTiposArchivosReportesPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedidosCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedidosCompras() {
		return this.jComboBoxTiposReportesPedidosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedidosCompras(
			JComboBox jComboBoxTiposReportesPedidosCompras) {
		this.jComboBoxTiposReportesPedidosCompras = jComboBoxTiposReportesPedidosCompras;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedidosCompras() {
	//	return jComboBoxTiposReportesDinamicoPedidosCompras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedidosCompras(
	//		JComboBox jComboBoxTiposReportesDinamicoPedidosCompras) {
	//	this.jComboBoxTiposReportesDinamicoPedidosCompras = jComboBoxTiposReportesDinamicoPedidosCompras;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedidosCompras() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedidosCompras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedidosCompras(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedidosCompras) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedidosCompras = jComboBoxTiposArchivosReportesDinamicoPedidosCompras;
	//}
	
	public void setBorderResaltarTiposReportesPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedidosCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedidosCompras() {
		return this.jComboBoxTiposGraficosReportesPedidosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedidosCompras(
			JComboBox jComboBoxTiposGraficosReportesPedidosCompras) {
		this.jComboBoxTiposGraficosReportesPedidosCompras = jComboBoxTiposGraficosReportesPedidosCompras;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedidosCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedidosCompras() {
		return this.jComboBoxTiposPaginacionPedidosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedidosCompras(
			JComboBox jComboBoxTiposPaginacionPedidosCompras) {
		this.jComboBoxTiposPaginacionPedidosCompras = jComboBoxTiposPaginacionPedidosCompras;
	}
	
	public void setBorderResaltarTiposPaginacionPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedidosCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedidosCompras() {
		return this.jComboBoxTiposRelacionesPedidosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidosCompras() {
		return this.jComboBoxTiposAccionesPedidosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidosCompras(
			JComboBox jComboBoxTiposRelacionesPedidosCompras) {
		this.jComboBoxTiposRelacionesPedidosCompras = jComboBoxTiposRelacionesPedidosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidosCompras(
			JComboBox jComboBoxTiposAccionesPedidosCompras) {
		this.jComboBoxTiposAccionesPedidosCompras = jComboBoxTiposAccionesPedidosCompras;
	}
	
	public void setBorderResaltarTiposRelacionesPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedidosCompras .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedidosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedidosCompras .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedidosCompras() {
	//	return jCheckBoxConGraficoDinamicoPedidosCompras;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedidosCompras(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedidosCompras) {
	//	this.jCheckBoxConGraficoDinamicoPedidosCompras = jCheckBoxConGraficoDinamicoPedidosCompras;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedidosCompras() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedidosCompras.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedidosCompras .setBorder(borderResaltar);		
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
		this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
		
		this.pedidoscomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoscomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidoscomprasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidosComprasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidosComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidosComprasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidosComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidosComprasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedidos Compras MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidosComprasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PedidosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedidosCompras= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"nuevo","nuevo","Nuevo"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"duplicar","duplicar","Duplicar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"copiar","copiar","Copiar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"ver_form","ver_form","Ver"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"recargar","recargar","Buscar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedidosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedidosCompras,this.jTtoolBarPedidosCompras,
							"cerrar","cerrar","Salir"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedidosCompras=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedidosCompras;
			
				this.jButtonProcesarInformacionToolBarPedidosCompras=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedidosCompras;
				
		//protected JButton jButtonModificarToolBarPedidosCompras;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedidosCompras=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedidosCompras=new JMenuMe("General");
		this.jmenuArchivoPedidosCompras=new JMenuMe("Archivo");
		this.jmenuAccionesPedidosCompras=new JMenuMe("Acciones");
		this.jmenuDatosPedidosCompras=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidosCompras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidosCompras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidosCompras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedidosCompras= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedidosCompras.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedidosCompras,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedidosCompras= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedidosCompras.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedidosCompras,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedidosCompras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidosCompras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidosCompras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedidosCompras= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedidosCompras.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedidosCompras,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedidosCompras= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedidosCompras.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedidosCompras,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedidosCompras= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedidosCompras.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedidosCompras,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidosCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidosCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidosCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedidosCompras= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedidosCompras.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedidosCompras,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedidosCompras= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedidosCompras.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedidosCompras,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedidosCompras= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedidosCompras.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedidosCompras,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedidosCompras= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedidosCompras.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedidosCompras,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedidosCompras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedidosCompras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedidosCompras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidosCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidosCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidosCompras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedidosCompras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedidosCompras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedidosCompras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidosCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidosCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidosCompras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedidosCompras= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedidosCompras.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedidosCompras,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedidosCompras.add(this.jMenuItemCerrarPedidosCompras);
			
			this.jmenuAccionesPedidosCompras.add(this.jMenuItemNuevoPedidosCompras);
			this.jmenuAccionesPedidosCompras.add(this.jMenuItemNuevoGuardarCambiosPedidosCompras);
			this.jmenuAccionesPedidosCompras.add(this.jMenuItemNuevoRelacionesPedidosCompras);
			this.jmenuAccionesPedidosCompras.add(this.jMenuItemGuardarCambiosTablaPedidosCompras);		
			this.jmenuAccionesPedidosCompras.add(this.jMenuItemDuplicarPedidosCompras);		
			this.jmenuAccionesPedidosCompras.add(this.jMenuItemCopiarPedidosCompras);		
			this.jmenuAccionesPedidosCompras.add(this.jMenuItemVerFormPedidosCompras);		
			
			this.jmenuDatosPedidosCompras.add(this.jMenuItemRecargarInformacionPedidosCompras);				
			this.jmenuDatosPedidosCompras.add(this.jMenuItemAnterioresPedidosCompras);				
			this.jmenuDatosPedidosCompras.add(this.jMenuItemSiguientesPedidosCompras);				
			this.jmenuDatosPedidosCompras.add(this.jMenuItemAbrirOrderByPedidosCompras);				
			this.jmenuDatosPedidosCompras.add(this.jMenuItemMostrarOcultarPedidosCompras);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedidosCompras.add(this.jMenuItemGuardarCambiosPedidosCompras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedidosCompras.add(this.jmenuArchivoPedidosCompras);		
			this.jmenuBarPedidosCompras.add(this.jmenuAccionesPedidosCompras);		
			this.jmenuBarPedidosCompras.add(this.jmenuDatosPedidosCompras);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedidosCompras);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedidosCompras() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPedidosComprasPedidosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPedidosComprasPedidosCompras.setToolTipText("Buscar Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaPedidosComprasPedidosCompras= new JButtonMe();
		this.jButtonBusquedaPedidosComprasPedidosCompras.setText("Buscar");
		this.jButtonBusquedaPedidosComprasPedidosCompras.setToolTipText("Buscar Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPedidosComprasPedidosCompras,"buscar_button","Buscar Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPedidosComprasPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoBusquedaPedidosComprasPedidosCompras = new JLabelMe();
		jLabelid_productoBusquedaPedidosComprasPedidosCompras.setText("Producto :");
		jLabelid_productoBusquedaPedidosComprasPedidosCompras.setToolTipText("Producto");
		jLabelid_productoBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaPedidosComprasPedidosCompras= new JComboBoxMe();
		jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaPedidosComprasPedidosCompras = new JLabelMe();
		jLabelid_lineaBusquedaPedidosComprasPedidosCompras.setText("Linea :");
		jLabelid_lineaBusquedaPedidosComprasPedidosCompras.setToolTipText("Linea");
		jLabelid_lineaBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras= new JComboBoxMe();
		jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras = new JLabelMe();
		jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras = new JLabelMe();
		jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras = new JLabelMe();
		jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras = new JLabelMe();
		jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setText("Tipo Producto Servicio :");
		jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setToolTipText("Tipo Producto Servicio");
		jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasPedidosCompras=new JTabbedPane();


		this.jTabbedPaneBusquedasPedidosCompras.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));
		this.jTabbedPaneBusquedasPedidosCompras.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));
		this.jTabbedPaneBusquedasPedidosCompras.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));

		//this.jTabbedPaneBusquedasPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedidosCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePedidosCompras = new PedidosComprasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedidos Compras DATOS");
			this.jInternalFrameDetalleFormPedidosCompras = new PedidosComprasDetalleFormJInternalFrame(jDesktopPane,this.pedidoscomprasSessionBean.getConGuardarRelaciones(),this.pedidoscomprasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedidosCompras = null;//new PedidosComprasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidosCompras= new GridBagLayout();
		
		
		this.jTableDatosPedidosCompras = new JTableMe();      
		
		String sToolTipPedidosCompras="";
		sToolTipPedidosCompras=PedidosComprasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidosCompras+="(Inventario.PedidosCompras)";
		}
		
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidosCompras+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedidosCompras.setToolTipText(sToolTipPedidosCompras);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedidosCompras);
		this.jTableDatosPedidosCompras.setAutoCreateRowSorter(true);
		this.jTableDatosPedidosCompras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedidosCompras.setRowSelectionAllowed(true);
		this.jTableDatosPedidosCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedidosCompras,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedidosCompras = new JButtonMe();
		this.jButtonDuplicarPedidosCompras = new JButtonMe();
		this.jButtonCopiarPedidosCompras = new JButtonMe();
		this.jButtonVerFormPedidosCompras = new JButtonMe();
		this.jButtonNuevoRelacionesPedidosCompras = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedidosCompras = new JButtonMe();
		this.jButtonCerrarPedidosCompras = new JButtonMe();
		
		this.jScrollPanelDatosPedidosCompras = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedidosCompras = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pedidos Compras";
		
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos Comprases" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidosCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidosCompras.setToolTipText("Acciones");
        this.jPanelAccionesPedidosCompras.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPedidosCompras=new ReporteDinamicoJInternalFrame(PedidosComprasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedidosCompras();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedidosCompras=new ImportacionJInternalFrame(PedidosComprasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedidosCompras();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedidosCompras = new JButtonMe();
		
		this.jButtonAbrirOrderByPedidosCompras.setText("Orden");
		this.jButtonAbrirOrderByPedidosCompras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidosCompras,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidosCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidosCompras,false,this);
			
			//this.cargarOrderByPedidosCompras(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidosCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidosCompras,true,this);
			
			//this.cargarOrderByPedidosCompras(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedidosCompras.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosPedidosCompras.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosPedidosCompras.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosPedidosCompras.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidosCompras.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidosCompras.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedidosCompras.setText("Nuevo");
		this.jButtonDuplicarPedidosCompras.setText("Duplicar");
		this.jButtonCopiarPedidosCompras.setText("Copiar");
		this.jButtonVerFormPedidosCompras.setText("Ver");
		this.jButtonNuevoRelacionesPedidosCompras.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedidosCompras.setText("Guardar");
		this.jButtonCerrarPedidosCompras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidosCompras,"nuevo_button","Nuevo",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedidosCompras,"duplicar_button","Duplicar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedidosCompras,"copiar_button","Copiar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedidosCompras,"ver_form","Ver",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedidosCompras,"nuevorelaciones_button","Nuevo Rel",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidosCompras,"guardarcambiostabla_button","Guardar",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidosCompras,"cerrar_button","Salir",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedidosCompras.setToolTipText("Nuevo"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedidosCompras.setToolTipText("Duplicar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedidosCompras.setToolTipText("Copiar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedidosCompras.setToolTipText("Ver"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedidosCompras.setToolTipText("Nuevo Rel"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedidosCompras.setToolTipText("Guardar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidosCompras.setToolTipText("Salir"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidosCompras";
		inputMap = this.jButtonNuevoPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidosCompras"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedidosCompras";
		inputMap = this.jButtonDuplicarPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedidosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedidosCompras"));
		
		//COPIAR
		sMapKey = "CopiarPedidosCompras";
		inputMap = this.jButtonCopiarPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedidosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedidosCompras"));
		
		//VEr FORM
		sMapKey = "VerFormPedidosCompras";
		inputMap = this.jButtonVerFormPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedidosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedidosCompras"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedidosCompras";
		inputMap = this.jButtonNuevoRelacionesPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedidosCompras"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedidosCompras";
		inputMap = this.jButtonModificarPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedidosCompras"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedidosCompras";
		inputMap = this.jButtonCerrarPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidosCompras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidosCompras";
		inputMap = this.jButtonGuardarCambiosTablaPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidosCompras"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PedidosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PedidosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PedidosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PedidosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PedidosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedidosCompras.setName("jPanelParametrosReportesPedidosCompras"); 
		
		this.jPanelParametrosReportesAccionesPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedidosCompras.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedidosCompras.setName("jPanelParametrosReportesAccionesPedidosCompras"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedidosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedidosCompras = new JButtonMe();
		this.jButtonRecargarInformacionPedidosCompras.setText("Buscar");
		this.jButtonRecargarInformacionPedidosCompras.setToolTipText("Buscar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedidosCompras,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPedidosCompras.setVisible(false);
		
		
		this.jButtonProcesarInformacionPedidosCompras = new JButtonMe();
		this.jButtonProcesarInformacionPedidosCompras.setText("Procesar");
		this.jButtonProcesarInformacionPedidosCompras.setToolTipText("Procesar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedidosCompras.setVisible(false);
			
		this.jButtonProcesarInformacionPedidosCompras.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidosCompras.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidosCompras.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidosCompras.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedidosCompras.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidosCompras.setText("TIPO");       
		this.jComboBoxTiposReportesPedidosCompras.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidosCompras.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedidosCompras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedidosCompras.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedidosCompras.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedidosCompras.setText("Accion");
		this.jComboBoxTiposRelacionesPedidosCompras.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidosCompras.setText("Accion");
		this.jComboBoxTiposAccionesPedidosCompras.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedidosCompras = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedidosCompras.setText("Accion");
		this.jComboBoxTiposSeleccionarPedidosCompras.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedidosCompras=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedidosCompras.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidosCompras.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidosCompras.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedidosCompras = new JLabelMe();
		
		this.jLabelAccionesPedidosCompras.setText("Acciones");		
		this.jLabelAccionesPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedidosCompras = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedidosCompras.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedidosCompras.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedidosCompras = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedidosCompras.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedidosCompras.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedidosCompras = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedidosCompras.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedidosCompras.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedidosCompras = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedidosCompras.setText("Graf.");
		this.jCheckBoxConGraficoReportePedidosCompras.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedidosCompras = new JButtonMe();
		//this.jButtonAnterioresPedidosCompras.setText("<<");
        this.jButtonAnterioresPedidosCompras.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedidosCompras,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedidosCompras = new JButtonMe();
		//this.jButtonSiguientesPedidosCompras.setText(">>");
        this.jButtonSiguientesPedidosCompras.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedidosCompras,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedidosCompras = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedidosCompras.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedidosCompras.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedidosCompras,"nuevoguardarcambios_button","Nue",this.pedidoscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedidosCompras";
		inputMap = this.jButtonNuevoGuardarCambiosPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedidosCompras"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedidosCompras";
		inputMap = this.jButtonRecargarInformacionPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedidosCompras"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedidosCompras";
		inputMap = this.jButtonSiguientesPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedidosCompras"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedidosCompras";
		inputMap = this.jButtonAnterioresPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedidosCompras"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedidosCompras();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedidosCompras.setMinimumSize(new Dimension(this.getWidth(),PedidosComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidosComprasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidosCompras.setMaximumSize(new Dimension(this.getWidth(),PedidosComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidosComprasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidosCompras.setPreferredSize(new Dimension(this.getWidth(),PedidosComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidosComprasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedidosCompras = new GridBagLayout();

			this.jPanelPaginacionPedidosCompras.setLayout(gridaBagLayoutPaginacionPedidosCompras);						
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = 0;
			this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedidosCompras.add(this.jButtonAnterioresPedidosCompras, this.gridBagConstraintsPedidosCompras);
					
						
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidosCompras.gridy = 0;
			
			this.jPanelPaginacionPedidosCompras.add(this.jButtonNuevoGuardarCambiosPedidosCompras, this.gridBagConstraintsPedidosCompras);
						
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidosCompras.gridy = 0;
			this.jPanelPaginacionPedidosCompras.add(this.jButtonSiguientesPedidosCompras, this.gridBagConstraintsPedidosCompras);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = 1;
			this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidosCompras.add(this.jButtonNuevoPedidosCompras, this.gridBagConstraintsPedidosCompras);
						
			
			
			if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
				this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidosCompras.gridy = 1;
				this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPedidosCompras.add(this.jButtonGuardarCambiosTablaPedidosCompras, this.gridBagConstraintsPedidosCompras);
			}
			
			
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = 1;
			this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidosCompras.add(this.jButtonDuplicarPedidosCompras, this.gridBagConstraintsPedidosCompras);
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = 1;
			this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidosCompras.add(this.jButtonCopiarPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = 1;
			this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidosCompras.add(this.jButtonVerFormPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = 1;
			this.gridBagConstraintsPedidosCompras.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedidosCompras.add(this.jButtonCerrarPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
		
		
		this.jButtonRecargarInformacionPedidosCompras.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidosCompras.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidosCompras.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedidosCompras.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidosCompras.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidosCompras.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedidosCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidosCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidosCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedidosCompras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidosCompras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidosCompras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedidosCompras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidosCompras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidosCompras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedidosCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidosCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidosCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedidosCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidosCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidosCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedidosCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidosCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidosCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedidosCompras.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidosCompras.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidosCompras.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedidosCompras.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidosCompras.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidosCompras.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedidosCompras.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidosCompras.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidosCompras.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedidosCompras.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidosCompras.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidosCompras.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedidosCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedidosCompras = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PedidosCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PedidosCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PedidosCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PedidosCompras = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedidosCompras.setLayout(gridaBagParametrosReportesPedidosCompras);
			this.jPanelParametrosReportesAccionesPedidosCompras.setLayout(gridaBagParametrosReportesAccionesPedidosCompras);
			
			
			this.jPanelParametrosAuxiliar1PedidosCompras.setLayout(gridaBagParametrosAuxiliar1PedidosCompras);
			this.jPanelParametrosAuxiliar2PedidosCompras.setLayout(gridaBagParametrosAuxiliar2PedidosCompras);
			this.jPanelParametrosAuxiliar3PedidosCompras.setLayout(gridaBagParametrosAuxiliar3PedidosCompras);
			this.jPanelParametrosAuxiliar4PedidosCompras.setLayout(gridaBagParametrosAuxiliar4PedidosCompras);
			//this.jPanelParametrosAuxiliar5PedidosCompras.setLayout(gridaBagParametrosAuxiliar2PedidosCompras);			
			
			
			
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidosCompras.add(this.jButtonRecargarInformacionPedidosCompras, this.gridBagConstraintsPedidosCompras);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidosCompras.add(this.jComboBoxTiposPaginacionPedidosCompras, this.gridBagConstraintsPedidosCompras);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidosCompras.add(this.jCheckBoxConAltoMaximoTablaPedidosCompras, this.gridBagConstraintsPedidosCompras);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidosCompras.add(this.jComboBoxTiposArchivosReportesPedidosCompras, this.gridBagConstraintsPedidosCompras);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidosCompras.add(this.jPanelParametrosAuxiliar1PedidosCompras, this.gridBagConstraintsPedidosCompras);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidosCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PedidosCompras.add(this.jComboBoxTiposReportesPedidosCompras, this.gridBagConstraintsPedidosCompras);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidosCompras.add(this.jPanelParametrosAuxiliar4PedidosCompras, this.gridBagConstraintsPedidosCompras);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidosCompras.add(this.jComboBoxTiposReportesPedidosCompras, this.gridBagConstraintsPedidosCompras);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidosCompras.add(this.jCheckBoxGenerarReportePedidosCompras, this.gridBagConstraintsPedidosCompras);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidosCompras.add(this.jPanelParametrosAuxiliar2PedidosCompras, this.gridBagConstraintsPedidosCompras);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidosCompras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidosCompras.add(this.jLabelAccionesPedidosCompras, this.gridBagConstraintsPedidosCompras);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
				this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedidosCompras.add(this.jButtonAbrirOrderByPedidosCompras, this.gridBagConstraintsPedidosCompras);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidosCompras.add(this.jComboBoxTiposSeleccionarPedidosCompras, this.gridBagConstraintsPedidosCompras);			
			
			
			/*
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidosCompras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidosCompras.add(this.jCheckBoxSeleccionarTodosPedidosCompras, this.gridBagConstraintsPedidosCompras);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidosCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidosCompras.add(this.jCheckBoxSeleccionarTodosPedidosCompras, this.gridBagConstraintsPedidosCompras);															
				
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidosCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidosCompras.add(this.jCheckBoxSeleccionadosPedidosCompras, this.gridBagConstraintsPedidosCompras);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidosCompras.add(this.jPanelParametrosAuxiliar3PedidosCompras, this.gridBagConstraintsPedidosCompras);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidosCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidosCompras.add(this.jComboBoxTiposAccionesPedidosCompras, this.gridBagConstraintsPedidosCompras);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedidosCompras = new GridBagLayout();

			this.jScrollPanelDatosPedidosCompras.setLayout(gridaBagLayoutDatosPedidosCompras);
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = 0;
			this.gridBagConstraintsPedidosCompras.gridx = 0;
			
			this.jScrollPanelDatosPedidosCompras.add(this.jTableDatosPedidosCompras, this.gridBagConstraintsPedidosCompras);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedidosCompras.setViewportView(this.jTableDatosPedidosCompras);
		this.jTableDatosPedidosCompras.setFillsViewportHeight(true);
		this.jTableDatosPedidosCompras.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidosCompras= new GridBagLayout();
		this.jPanelAccionesPedidosCompras.setLayout(gridaBagLayoutAccionesPedidosCompras);
		
		
		/*	
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = 0;
		this.gridBagConstraintsPedidosCompras.gridx = 0;
			
		this.jPanelAccionesPedidosCompras.add(this.jButtonNuevoPedidosCompras, this.gridBagConstraintsPedidosCompras);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPedidosComprasPedidosCompras= new GridBagLayout();
		gridaBagLayoutBusquedaPedidosComprasPedidosCompras.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPedidosComprasPedidosCompras.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPedidosComprasPedidosCompras.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPedidosComprasPedidosCompras.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPedidosComprasPedidosCompras.setLayout(gridaBagLayoutBusquedaPedidosComprasPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 0;
		gridBagConstraintsPedidosCompras.gridx = 0;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jLabelid_productoBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 0;
		gridBagConstraintsPedidosCompras.gridx = 1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jComboBoxid_productoBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);


		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 1;
		gridBagConstraintsPedidosCompras.gridx = 0;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jLabelid_lineaBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 1;
		gridBagConstraintsPedidosCompras.gridx = 1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);


		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 2;
		gridBagConstraintsPedidosCompras.gridx = 0;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jLabelid_linea_grupoBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 2;
		gridBagConstraintsPedidosCompras.gridx = 1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);


		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 3;
		gridBagConstraintsPedidosCompras.gridx = 0;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jLabelid_linea_categoriaBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 3;
		gridBagConstraintsPedidosCompras.gridx = 1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);


		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 4;
		gridBagConstraintsPedidosCompras.gridx = 0;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jLabelid_linea_marcaBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 4;
		gridBagConstraintsPedidosCompras.gridx = 1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);


		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 5;
		gridBagConstraintsPedidosCompras.gridx = 0;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jLabelid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 5;
		gridBagConstraintsPedidosCompras.gridx = 1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);


		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 6;
		gridBagConstraintsPedidosCompras.gridx = 0;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jLabelfecha_emision_desdeBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 6;
		gridBagConstraintsPedidosCompras.gridx = 1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);


		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 7;
		gridBagConstraintsPedidosCompras.gridx = 0;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jLabelfecha_emision_hastaBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 7;
		gridBagConstraintsPedidosCompras.gridx = 1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		gridBagConstraintsPedidosCompras = new GridBagConstraints();
		gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidosCompras.gridy = 8;
		gridBagConstraintsPedidosCompras.gridx =1;
		jPanelBusquedaPedidosComprasPedidosCompras.add(jButtonBusquedaPedidosComprasPedidosCompras, gridBagConstraintsPedidosCompras);

		jTabbedPaneBusquedasPedidosCompras.addTab("1.-Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaPedidosComprasPedidosCompras);
		jTabbedPaneBusquedasPedidosCompras.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidosCompras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidosCompras);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();						
			this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidosCompras.gridx = 0;		
			//this.gridBagConstraintsPedidosCompras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidosCompras.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedidosCompras, this.gridBagConstraintsPedidosCompras);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedidosCompras.gridx = 0;		
		//this.gridBagConstraintsPedidosCompras.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedidosCompras.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedidosCompras);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidosCompras.gridx = 0;		
			this.gridBagConstraintsPedidosCompras.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedidosCompras.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedidosCompras, this.gridBagConstraintsPedidosCompras);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedidosCompras, this.gridBagConstraintsPedidosCompras);								
		
		
		/*
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedidosCompras, this.gridBagConstraintsPedidosCompras);
		*/		
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidosCompras.gridx =0;
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidosCompras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidosCompras, this.gridBagConstraintsPedidosCompras);
				
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedidosCompras, this.gridBagConstraintsPedidosCompras);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PedidosComprasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedidosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidosCompras = new GridBagLayout();
			this.jPanelBusquedasParametrosPedidosCompras.setLayout(gridaBagLayoutBusquedasParametrosPedidosCompras);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedidosCompras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidosCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidosCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidosCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidosCompras, this.gridBagConstraintsPedidosCompras);
			
			
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
			
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidosCompras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidosCompras, this.gridBagConstraintsPedidosCompras);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedidosCompras;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedidosCompras() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedidosCompras = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedidosCompras.setName("jPanelReporteDinamicoPedidosCompras"); 
		
		this.jPanelReporteDinamicoPedidosCompras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidosCompras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidosCompras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedidosCompras.setLayout(gridaBagLayoutReporteDinamicoPedidosCompras);
		
		
		this.jInternalFrameReporteDinamicoPedidosCompras= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedidosCompras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidosCompras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedidosCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedidosCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedidosCompras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedidosCompras.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedidosCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedidosCompras.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedidosCompras.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedidosCompras.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedidosCompras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidosCompras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidosCompras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos Comprases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedidosCompras = new JLabelMe();

		this.jLabelColumnasSelectReportePedidosCompras.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidosCompras.add(this.jLabelColumnasSelectReportePedidosCompras, this.gridBagConstraintsPedidosCompras);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedidosCompras = new JList<Reporte>();
		this.jListColumnasSelectReportePedidosCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedidosCompras.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedidosCompras.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidosCompras.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidosCompras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedidosCompras=new JScrollPane(this.jListColumnasSelectReportePedidosCompras);
			
			this.jScrollColumnasSelectReportePedidosCompras.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidosCompras.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidosCompras.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidosCompras.add(this.jListColumnasSelectReportePedidosCompras, this.gridBagConstraintsPedidosCompras);
		this.jPanelReporteDinamicoPedidosCompras.add(this.jScrollColumnasSelectReportePedidosCompras, this.gridBagConstraintsPedidosCompras);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedidosCompras = new JLabelMe();

		this.jLabelRelacionesSelectReportePedidosCompras.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedidosCompras = new JList<Reporte>();
		this.jListRelacionesSelectReportePedidosCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedidosCompras.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedidosCompras.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidosCompras.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidosCompras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedidosCompras=new JScrollPane(this.jListRelacionesSelectReportePedidosCompras);
			
			this.jScrollRelacionesSelectReportePedidosCompras.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidosCompras.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidosCompras.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPedidosCompras = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedidosCompras = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedidosCompras = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedidosCompras = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedidosCompras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedidosCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidosCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidosCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedidosCompras = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedidosCompras.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedidosCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidosCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidosCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedidosCompras = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedidosCompras.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidosCompras.add(this.jLabelGenerarExcelReporteDinamicoPedidosCompras, this.gridBagConstraintsPedidosCompras);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedidosCompras = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedidosCompras.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedidosCompras,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedidosCompras.setToolTipText("Generar EXCEL"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedidosCompras.add(this.jButtonGenerarExcelReporteDinamicoPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidosCompras.add(this.jComboBoxTiposReportesDinamicoPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedidosCompras = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedidosCompras.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidosCompras.add(this.jLabelTiposArchivoReporteDinamicoPedidosCompras, this.gridBagConstraintsPedidosCompras);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidosCompras.add(this.jComboBoxTiposArchivosReportesDinamicoPedidosCompras, this.gridBagConstraintsPedidosCompras);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedidosCompras = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedidosCompras.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedidosCompras,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedidosCompras.setToolTipText("Generar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidosCompras.add(this.jButtonGenerarReporteDinamicoPedidosCompras, this.gridBagConstraintsPedidosCompras);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedidosCompras = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedidosCompras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedidosCompras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedidosCompras.setToolTipText("Cancelar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidosCompras.add(this.jButtonCerrarReporteDinamicoPedidosCompras, this.gridBagConstraintsPedidosCompras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedidosCompras = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedidosCompras= new JScrollPane(jPanelReporteDinamicoPedidosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedidosCompras.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidosCompras.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidosCompras.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos Comprases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedidosCompras.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedidosCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedidosCompras.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedidosCompras);
		this.jInternalFrameReporteDinamicoPedidosCompras.getContentPane().add(this.jScrollPanelReporteDinamicoPedidosCompras, this.gridBagConstraintsPedidosCompras);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedidosCompras() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedidosCompras = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedidosCompras.setName("jPanelImportacionPedidosCompras"); 
		
		this.jPanelImportacionPedidosCompras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidosCompras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidosCompras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedidosCompras.setLayout(gridaBagLayoutImportacionPedidosCompras);
		
		
		this.jInternalFrameImportacionPedidosCompras= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedidosCompras= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedidosCompras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidosCompras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedidosCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidosCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidosCompras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedidosCompras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidosCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidosCompras.setResizable(true);
	    this.jInternalFrameImportacionPedidosCompras.setClosable(true);
	    this.jInternalFrameImportacionPedidosCompras.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedidosCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidosCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidosCompras.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedidosCompras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidosCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidosCompras.setResizable(true);
	    this.jInternalFrameImportacionPedidosCompras.setClosable(true);
	    this.jInternalFrameImportacionPedidosCompras.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedidosCompras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidosCompras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidosCompras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos Comprases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedidosCompras = new JLabelMe();

		this.jLabelArchivoImportacionPedidosCompras.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidosCompras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidosCompras.add(this.jLabelArchivoImportacionPedidosCompras, this.gridBagConstraintsPedidosCompras);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedidosCompras = new JFileChooser();		
		this.jFileChooserImportacionPedidosCompras.setToolTipText("ESCOGER ARCHIVO"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedidosCompras = new JButtonMe();
		this.jButtonAbrirImportacionPedidosCompras.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedidosCompras,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedidosCompras.setToolTipText("Generar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidosCompras.add(this.jButtonAbrirImportacionPedidosCompras, this.gridBagConstraintsPedidosCompras);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedidosCompras = new JLabelMe();

		this.jLabelPathArchivoImportacionPedidosCompras.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedidosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidosCompras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidosCompras.add(this.jLabelPathArchivoImportacionPedidosCompras, this.gridBagConstraintsPedidosCompras);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedidosCompras=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedidosCompras.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidosCompras.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidosCompras.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidosCompras.add(this.jTextFieldPathArchivoImportacionPedidosCompras, this.gridBagConstraintsPedidosCompras);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedidosCompras = new JButtonMe();
		this.jButtonGenerarImportacionPedidosCompras.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedidosCompras,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedidosCompras.setToolTipText("Generar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidosCompras.add(this.jButtonGenerarImportacionPedidosCompras, this.gridBagConstraintsPedidosCompras);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedidosCompras = new JButtonMe();
		this.jButtonCerrarImportacionPedidosCompras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedidosCompras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedidosCompras.setToolTipText("Cancelar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidosCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidosCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidosCompras.add(this.jButtonCerrarImportacionPedidosCompras, this.gridBagConstraintsPedidosCompras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedidosCompras = new GridBagLayout();
		
		this.jScrollPanelImportacionPedidosCompras= new JScrollPane(jPanelImportacionPedidosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
		this.gridBagConstraintsPedidosCompras.gridy =iPosYImportacion;
		this.gridBagConstraintsPedidosCompras.gridx =iPosXImportacion;
		this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedidosCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedidosCompras.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedidosCompras);
		this.jInternalFrameImportacionPedidosCompras.getContentPane().add(this.jScrollPanelImportacionPedidosCompras, this.gridBagConstraintsPedidosCompras);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedidosCompras(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedidosCompras = new JButtonMe();
			this.jButtonAbrirOrderByPedidosCompras.setText("Orden");
			this.jButtonAbrirOrderByPedidosCompras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidosCompras,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedidosCompras";
			inputMap = this.jButtonAbrirOrderByPedidosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedidosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedidosCompras"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedidosCompras = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedidosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedidosCompras.setName("jPanelOrderByPedidosCompras"); 
			
			this.jPanelOrderByPedidosCompras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidosCompras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidosCompras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedidosCompras.setLayout(gridaBagLayoutOrderByPedidosCompras);
			
			
			this.jTableDatosPedidosComprasOrderBy = new JTableMe();        
			this.jTableDatosPedidosComprasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidosComprasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidosComprasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidosComprasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidosComprasOrderBy.setViewportView(this.jTableDatosPedidosComprasOrderBy);
			this.jTableDatosPedidosComprasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidosComprasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedidosCompras= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedidosCompras= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedidosCompras = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedidosCompras= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedidosCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedidosCompras.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedidosCompras.setTitle("Orden");
			this.jInternalFrameOrderByPedidosCompras.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedidosCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedidosCompras.setResizable(true);
			this.jInternalFrameOrderByPedidosCompras.setClosable(true);
			this.jInternalFrameOrderByPedidosCompras.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedidosCompras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidosCompras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidosCompras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedidosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos Comprases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedidosCompras.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedidosCompras.ipady =150;
				
			this.jPanelOrderByPedidosCompras.add(jScrollPanelDatosPedidosComprasOrderBy, this.gridBagConstraintsPedidosCompras);//this.jTableDatosPedidosComprasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedidosCompras = new JButtonMe();
			this.jButtonCerrarOrderByPedidosCompras.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedidosCompras,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedidosCompras.setToolTipText("Cancelar"+" "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedidosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidosCompras.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedidosCompras.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedidosCompras.add(this.jButtonCerrarOrderByPedidosCompras, this.gridBagConstraintsPedidosCompras);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedidosCompras = new GridBagLayout();
			
			this.jScrollPanelOrderByPedidosCompras= new JScrollPane(jPanelOrderByPedidosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedidosCompras = new GridBagConstraints();
			this.gridBagConstraintsPedidosCompras.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedidosCompras.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidosCompras.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedidosCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedidosCompras.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedidosCompras);
			
			this.jInternalFrameOrderByPedidosCompras.getContentPane().add(this.jScrollPanelOrderByPedidosCompras, this.gridBagConstraintsPedidosCompras);			
		
		} else {
			this.jButtonAbrirOrderByPedidosCompras = new JButtonMe();
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
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.pedidoscomprasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPedidosCompras.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedidosCompras.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedidosCompras.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPedidosCompras.getRowHeight();//PedidosComprasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidosComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidosCompras.isSelected()) {
					iHeightTable=PedidosComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidosComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidosComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidosComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidosCompras.isSelected()) {
					iHeightTable=PedidosComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidosComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidosComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedidosCompras.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidosCompras.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidosCompras.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedidosCompras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidosCompras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidosCompras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedidosCompras!=null && this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedidosCompras.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedidosCompras.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedidosCompras.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedidosCompras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidosCompras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidosCompras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=pedidoscomprasLogic.getPedidosComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoscomprass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PedidosCompras> TraerPedidosComprasBeans(List<PedidosCompras> pedidoscomprass,ArrayList<Classe> classes)throws Exception {
		try {
			for(PedidosCompras pedidoscompras:pedidoscomprass) {
					
				if(!(PedidosComprasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidosComprasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedidoscompras.setsDetalleGeneralEntityReporte(PedidosComprasConstantesFunciones.getPedidosComprasDescripcion(pedidoscompras));
										
						
					
						
					
				} else  {
							
					//pedidoscompras.setsDetalleGeneralEntityReporte(pedidoscompras.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidoscomprasbeans.add(pedidoscomprasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidoscomprass;
    }
	//PARA REPORTES FIN
}
