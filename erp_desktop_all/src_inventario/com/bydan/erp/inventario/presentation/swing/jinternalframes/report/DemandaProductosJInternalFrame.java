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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

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
public class DemandaProductosJInternalFrame extends DemandaProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDemandaProductos;
	
	protected JMenuBar jmenuBarDemandaProductos;
	
	protected JMenu jmenuDemandaProductos;
	protected JMenu jmenuDatosDemandaProductos;
	protected JMenu jmenuArchivoDemandaProductos;
	protected JMenu jmenuAccionesDemandaProductos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDemandaProductos;	
	protected GridBagConstraints gridBagConstraintsDemandaProductos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DemandaProductosDetalleFormJInternalFrame jInternalFrameDetalleFormDemandaProductos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDemandaProductos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDemandaProductos;	
	
	
	
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
	
	//protected JDesktopPane jDesktopPane;
	public List<DemandaProductos> demandaproductoss;		
	public List<DemandaProductos> demandaproductossEliminados;	
	public List<DemandaProductos> demandaproductossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDemandaProductos;		
	protected JButton jButtonAbrirOrderByDemandaProductos;
	
	
	//protected JPanel jPanelOrderByDemandaProductos;
	//public JScrollPane jScrollPanelOrderByDemandaProductos;	
	//protected JButton jButtonCerrarOrderByDemandaProductos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DemandaProductosLogic demandaproductosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDemandaProductos;
	public JScrollPane jScrollPanelDatosEdicionDemandaProductos;
	public JScrollPane jScrollPanelDatosGeneralDemandaProductos;
    
	
	
	//public JScrollPane jScrollPanelDatosDemandaProductosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDemandaProductos;
	//public JScrollPane jScrollPanelImportacionDemandaProductos;
	
	
	
	protected JPanel jPanelAccionesDemandaProductos;
	
    protected JPanel jPanelPaginacionDemandaProductos;
    protected JPanel jPanelParametrosReportesDemandaProductos;
	protected JPanel jPanelParametrosReportesAccionesDemandaProductos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DemandaProductos;
	protected JPanel jPanelParametrosAuxiliar2DemandaProductos;
	protected JPanel jPanelParametrosAuxiliar3DemandaProductos;
	protected JPanel jPanelParametrosAuxiliar4DemandaProductos;
	//protected JPanel jPanelParametrosAuxiliar5DemandaProductos;
	
	
	
	//protected JPanel jPanelReporteDinamicoDemandaProductos;
	//protected JPanel jPanelImportacionDemandaProductos;
	
	
	public JTable jTableDatosDemandaProductos;
	
	
	
	//public JTable jTableDatosDemandaProductosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDemandaProductos;
	protected JButton jButtonDuplicarDemandaProductos;
	protected JButton jButtonCopiarDemandaProductos;
	protected JButton jButtonVerFormDemandaProductos;
	protected JButton jButtonNuevoRelacionesDemandaProductos;
	protected JButton jButtonModificarDemandaProductos;
	
    protected JButton jButtonGuardarCambiosTablaDemandaProductos;
	protected JButton jButtonCerrarDemandaProductos;
	
	
	protected JButton jButtonRecargarInformacionDemandaProductos;
	protected JButton jButtonProcesarInformacionDemandaProductos;
	
	
	protected JButton jButtonAnterioresDemandaProductos;
	protected JButton jButtonSiguientesDemandaProductos;
	protected JButton jButtonNuevoGuardarCambiosDemandaProductos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDemandaProductos;
	//protected JButton jButtonCerrarReporteDinamicoDemandaProductos;
	//protected JButton jButtonGenerarExcelReporteDinamicoDemandaProductos;	
	
	
	
	//protected JButton jButtonAbrirImportacionDemandaProductos;
	//protected JButton jButtonGenerarImportacionDemandaProductos;
	//protected JButton jButtonCerrarImportacionDemandaProductos;
	//protected JFileChooser jFileChooserImportacionDemandaProductos;
	//protected File fileImportacionDemandaProductos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDemandaProductos;
	protected JButton jButtonDuplicarToolBarDemandaProductos;
	protected JButton jButtonNuevoRelacionesToolBarDemandaProductos;
	
	
	public JButton jButtonGuardarCambiosToolBarDemandaProductos;
	protected JButton jButtonCopiarToolBarDemandaProductos;
	protected JButton jButtonVerFormToolBarDemandaProductos;
	public JButton jButtonGuardarCambiosTablaToolBarDemandaProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarDemandaProductos;
	protected JButton jButtonCerrarToolBarDemandaProductos;
	
	protected JButton jButtonRecargarInformacionToolBarDemandaProductos;
	protected JButton jButtonProcesarInformacionToolBarDemandaProductos;
	protected JButton jButtonAnterioresToolBarDemandaProductos;
	protected JButton jButtonSiguientesToolBarDemandaProductos;
	protected JButton jButtonNuevoGuardarCambiosToolBarDemandaProductos;
	protected JButton jButtonAbrirOrderByToolBarDemandaProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDemandaProductos;
	protected JMenuItem jMenuItemDuplicarDemandaProductos;
	protected JMenuItem jMenuItemNuevoRelacionesDemandaProductos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDemandaProductos;
	protected JMenuItem jMenuItemCopiarDemandaProductos;
	protected JMenuItem jMenuItemVerFormDemandaProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaDemandaProductos;
	protected JMenuItem jMenuItemCerrarDemandaProductos;
	protected JMenuItem jMenuItemDetalleCerrarDemandaProductos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDemandaProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarDemandaProductos;
	
	protected JMenuItem jMenuItemRecargarInformacionDemandaProductos;
	protected JMenuItem jMenuItemProcesarInformacionDemandaProductos;
	protected JMenuItem jMenuItemAnterioresDemandaProductos;
	protected JMenuItem jMenuItemSiguientesDemandaProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDemandaProductos;
	protected JMenuItem jMenuItemAbrirOrderByDemandaProductos;
	protected JMenuItem jMenuItemMostrarOcultarDemandaProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDemandaProductos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDemandaProductos;
	protected JCheckBox jCheckBoxSeleccionadosDemandaProductos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDemandaProductos;
	protected JCheckBox jCheckBoxConGraficoReporteDemandaProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDemandaProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDemandaProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDemandaProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDemandaProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDemandaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDemandaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDemandaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDemandaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDemandaProductos;
	protected JTextField jTextFieldValorCampoGeneralDemandaProductos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDemandaProductos;
	//public JList<Reporte> jListColumnasSelectReporteDemandaProductos;
	//public JScrollPane jScrollColumnasSelectReporteDemandaProductos;
	
	//public JLabel jLabelRelacionesSelectReporteDemandaProductos;
	//public JList<Reporte> jListRelacionesSelectReporteDemandaProductos;
	//public JScrollPane jScrollRelacionesSelectReporteDemandaProductos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDemandaProductos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDemandaProductos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDemandaProductos;
	//public JLabel jLabelTiposArchivoReporteDinamicoDemandaProductos;
	
		
	//public JLabel jLabelArchivoImportacionDemandaProductos;	
	//public JLabel jLabelPathArchivoImportacionDemandaProductos;
	//protected JTextField jTextFieldPathArchivoImportacionDemandaProductos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDemandaProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDemandaProductos;
	
	//public JLabel jLabelColumnaCategoriaValorDemandaProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDemandaProductos;
	
	//public JLabel jLabelColumnasValoresGraficoDemandaProductos;
	//public JList<Reporte> jListColumnasValoresGraficoDemandaProductos;
	//public JScrollPane jScrollColumnasValoresGraficoDemandaProductos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDemandaProductos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDemandaProductos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDemandaProductos;
	public JPanel jPanelBusquedaDemandaProductosDemandaProductos;
	public JButton jButtonBusquedaDemandaProductosDemandaProductos;
	
	public JPanel jPanelid_bodegaBusquedaDemandaProductosDemandaProductos;
	public JLabel jLabelid_bodegaBusquedaDemandaProductosDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos;
	public JButton jButtonid_bodegaBusquedaDemandaProductosDemandaProductos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaDemandaProductosDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaDemandaProductosDemandaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaDemandaProductosDemandaProductos;
	public JLabel jLabelid_productoBusquedaDemandaProductosDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaDemandaProductosDemandaProductos;
	public JButton jButtonid_productoBusquedaDemandaProductosDemandaProductos= new JButtonMe();
	public JButton jButtonid_productoBusquedaDemandaProductosDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaDemandaProductosDemandaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaDemandaProductosDemandaProductos;
	public JLabel jLabelid_lineaBusquedaDemandaProductosDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos;
	public JButton jButtonid_lineaBusquedaDemandaProductosDemandaProductos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaDemandaProductosDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaDemandaProductosDemandaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaDemandaProductosDemandaProductos;
	public JLabel jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos;
	public JButton jButtonid_linea_grupoBusquedaDemandaProductosDemandaProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaDemandaProductosDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaDemandaProductosDemandaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaDemandaProductosDemandaProductos;
	public JLabel jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos;
	public JButton jButtonid_linea_categoriaBusquedaDemandaProductosDemandaProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaDemandaProductosDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaDemandaProductosDemandaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaDemandaProductosDemandaProductos;
	public JLabel jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos;
	public JButton jButtonid_linea_marcaBusquedaDemandaProductosDemandaProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaDemandaProductosDemandaProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaDemandaProductosDemandaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos;
	public JLabel jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos;
	public JButton jButtonfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=535;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DemandaProductosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DemandaProductosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DemandaProductosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DemandaProductosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDemandaProductos)	{
		this.jButtonRecargarInformacionDemandaProductos = jButtonRecargarInformacionDemandaProductos;
	}
	
	public JButton getjButtonProcesarInformacionDemandaProductos() {
		return this.jButtonProcesarInformacionDemandaProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDemandaProductos)	{
		this.jButtonProcesarInformacionDemandaProductos = jButtonProcesarInformacionDemandaProductos;
	}
	
	
	public JButton getjButtonRecargarInformacionDemandaProductos() {
		return this.jButtonRecargarInformacionDemandaProductos;
	}
	
	
	public List<DemandaProductos> getdemandaproductoss() {
		return this.demandaproductoss;
	}

	public void setdemandaproductoss(List<DemandaProductos> demandaproductoss) {
		this.demandaproductoss = demandaproductoss;
	}
	
	public List<DemandaProductos> getdemandaproductossAux() {
		return this.demandaproductossAux;
	}

	public void setdemandaproductossAux(List<DemandaProductos> demandaproductossAux) {
		this.demandaproductossAux = demandaproductossAux;
	}
	
	public List<DemandaProductos> getdemandaproductossEliminados() {
		return this.demandaproductossEliminados;
	}

	public void setDemandaProductossEliminados(List<DemandaProductos> demandaproductossEliminados) {
		this.demandaproductossEliminados = demandaproductossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDemandaProductos() {
		return jComboBoxTiposSeleccionarDemandaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDemandaProductos(
			JComboBox jComboBoxTiposSeleccionarDemandaProductos) {
		this.jComboBoxTiposSeleccionarDemandaProductos = jComboBoxTiposSeleccionarDemandaProductos;
	}
	
	public void setBorderResaltarTiposSeleccionarDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDemandaProductos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDemandaProductos() {
		return jTextFieldValorCampoGeneralDemandaProductos;
	}

	public void setjTextFieldValorCampoGeneralDemandaProductos(
			JTextField jTextFieldValorCampoGeneralDemandaProductos) {
		this.jTextFieldValorCampoGeneralDemandaProductos = jTextFieldValorCampoGeneralDemandaProductos;
	}

	public void setBorderResaltarValorCampoGeneralDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDemandaProductos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDemandaProductos() {
		return this.jCheckBoxSeleccionarTodosDemandaProductos;
	}

	public void setjCheckBoxSeleccionarTodosDemandaProductos(
			JCheckBox jCheckBoxSeleccionarTodosDemandaProductos) {
		this.jCheckBoxSeleccionarTodosDemandaProductos = jCheckBoxSeleccionarTodosDemandaProductos;
	}

	public void setBorderResaltarSeleccionarTodosDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDemandaProductos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDemandaProductos() {
		return this.jCheckBoxSeleccionadosDemandaProductos;
	}

	public void setjCheckBoxSeleccionadosDemandaProductos(
			JCheckBox jCheckBoxSeleccionadosDemandaProductos) {
		this.jCheckBoxSeleccionadosDemandaProductos = jCheckBoxSeleccionadosDemandaProductos;
	}
	
	public void setBorderResaltarSeleccionadosDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDemandaProductos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDemandaProductos() {
		return this.jComboBoxTiposArchivosReportesDemandaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDemandaProductos(
			JComboBox jComboBoxTiposArchivosReportesDemandaProductos) {
		this.jComboBoxTiposArchivosReportesDemandaProductos = jComboBoxTiposArchivosReportesDemandaProductos;
	}

	public void setBorderResaltarTiposArchivosReportesDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDemandaProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDemandaProductos() {
		return this.jComboBoxTiposReportesDemandaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDemandaProductos(
			JComboBox jComboBoxTiposReportesDemandaProductos) {
		this.jComboBoxTiposReportesDemandaProductos = jComboBoxTiposReportesDemandaProductos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDemandaProductos() {
	//	return jComboBoxTiposReportesDinamicoDemandaProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDemandaProductos(
	//		JComboBox jComboBoxTiposReportesDinamicoDemandaProductos) {
	//	this.jComboBoxTiposReportesDinamicoDemandaProductos = jComboBoxTiposReportesDinamicoDemandaProductos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDemandaProductos() {
	//	return jComboBoxTiposArchivosReportesDinamicoDemandaProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDemandaProductos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDemandaProductos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDemandaProductos = jComboBoxTiposArchivosReportesDinamicoDemandaProductos;
	//}
	
	public void setBorderResaltarTiposReportesDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDemandaProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDemandaProductos() {
		return this.jComboBoxTiposGraficosReportesDemandaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDemandaProductos(
			JComboBox jComboBoxTiposGraficosReportesDemandaProductos) {
		this.jComboBoxTiposGraficosReportesDemandaProductos = jComboBoxTiposGraficosReportesDemandaProductos;
	}
	
	public void setBorderResaltarTiposGraficosReportesDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDemandaProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDemandaProductos() {
		return this.jComboBoxTiposPaginacionDemandaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDemandaProductos(
			JComboBox jComboBoxTiposPaginacionDemandaProductos) {
		this.jComboBoxTiposPaginacionDemandaProductos = jComboBoxTiposPaginacionDemandaProductos;
	}
	
	public void setBorderResaltarTiposPaginacionDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDemandaProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDemandaProductos() {
		return this.jComboBoxTiposRelacionesDemandaProductos;
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
	
	public void setBorderResaltarTiposRelacionesDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDemandaProductos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDemandaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDemandaProductos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDemandaProductos() {
	//	return jCheckBoxConGraficoDinamicoDemandaProductos;
	//}

	//public void setjCheckBoxConGraficoDinamicoDemandaProductos(
	//		JCheckBox jCheckBoxConGraficoDinamicoDemandaProductos) {
	//	this.jCheckBoxConGraficoDinamicoDemandaProductos = jCheckBoxConGraficoDinamicoDemandaProductos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDemandaProductos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDemandaProductos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDemandaProductos .setBorder(borderResaltar);		
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
		this.demandaproductosSessionBean=new DemandaProductosSessionBean();
		
		this.demandaproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.demandaproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.demandaproductosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DemandaProductosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DemandaProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
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
		
		//super("DemandaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDemandaProductos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"nuevo","nuevo","Nuevo"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"duplicar","duplicar","Duplicar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"copiar","copiar","Copiar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"ver_form","ver_form","Ver"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"recargar","recargar","Buscar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDemandaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDemandaProductos,this.jTtoolBarDemandaProductos,
							"cerrar","cerrar","Salir"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDemandaProductos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDemandaProductos;
			
				this.jButtonProcesarInformacionToolBarDemandaProductos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDemandaProductos;
				
		//protected JButton jButtonModificarToolBarDemandaProductos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDemandaProductos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDemandaProductos=new JMenuMe("General");
		this.jmenuArchivoDemandaProductos=new JMenuMe("Archivo");
		this.jmenuAccionesDemandaProductos=new JMenuMe("Acciones");
		this.jmenuDatosDemandaProductos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDemandaProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDemandaProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDemandaProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDemandaProductos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDemandaProductos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDemandaProductos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDemandaProductos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDemandaProductos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDemandaProductos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDemandaProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDemandaProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDemandaProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDemandaProductos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDemandaProductos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDemandaProductos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDemandaProductos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDemandaProductos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDemandaProductos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDemandaProductos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDemandaProductos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDemandaProductos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDemandaProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDemandaProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDemandaProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDemandaProductos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDemandaProductos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDemandaProductos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDemandaProductos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDemandaProductos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDemandaProductos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDemandaProductos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDemandaProductos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDemandaProductos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDemandaProductos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDemandaProductos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDemandaProductos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDemandaProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDemandaProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDemandaProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDemandaProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDemandaProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDemandaProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDemandaProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDemandaProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDemandaProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDemandaProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDemandaProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDemandaProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDemandaProductos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDemandaProductos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDemandaProductos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDemandaProductos.add(this.jMenuItemCerrarDemandaProductos);
			
			this.jmenuAccionesDemandaProductos.add(this.jMenuItemNuevoDemandaProductos);
			this.jmenuAccionesDemandaProductos.add(this.jMenuItemNuevoGuardarCambiosDemandaProductos);
			this.jmenuAccionesDemandaProductos.add(this.jMenuItemNuevoRelacionesDemandaProductos);
			this.jmenuAccionesDemandaProductos.add(this.jMenuItemGuardarCambiosTablaDemandaProductos);		
			this.jmenuAccionesDemandaProductos.add(this.jMenuItemDuplicarDemandaProductos);		
			this.jmenuAccionesDemandaProductos.add(this.jMenuItemCopiarDemandaProductos);		
			this.jmenuAccionesDemandaProductos.add(this.jMenuItemVerFormDemandaProductos);		
			
			this.jmenuDatosDemandaProductos.add(this.jMenuItemRecargarInformacionDemandaProductos);				
			this.jmenuDatosDemandaProductos.add(this.jMenuItemAnterioresDemandaProductos);				
			this.jmenuDatosDemandaProductos.add(this.jMenuItemSiguientesDemandaProductos);				
			this.jmenuDatosDemandaProductos.add(this.jMenuItemAbrirOrderByDemandaProductos);				
			this.jmenuDatosDemandaProductos.add(this.jMenuItemMostrarOcultarDemandaProductos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDemandaProductos.add(this.jMenuItemGuardarCambiosDemandaProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDemandaProductos.add(this.jmenuArchivoDemandaProductos);		
			this.jmenuBarDemandaProductos.add(this.jmenuAccionesDemandaProductos);		
			this.jmenuBarDemandaProductos.add(this.jmenuDatosDemandaProductos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDemandaProductos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDemandaProductos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaDemandaProductosDemandaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaDemandaProductosDemandaProductos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		this.jButtonBusquedaDemandaProductosDemandaProductos= new JButtonMe();
		this.jButtonBusquedaDemandaProductosDemandaProductos.setText("Buscar");
		this.jButtonBusquedaDemandaProductosDemandaProductos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaDemandaProductosDemandaProductos,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaDemandaProductosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaDemandaProductosDemandaProductos = new JLabelMe();
		jLabelid_bodegaBusquedaDemandaProductosDemandaProductos.setText("Bodega :");
		jLabelid_bodegaBusquedaDemandaProductosDemandaProductos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaDemandaProductosDemandaProductos = new JLabelMe();
		jLabelid_productoBusquedaDemandaProductosDemandaProductos.setText("Producto :");
		jLabelid_productoBusquedaDemandaProductosDemandaProductos.setToolTipText("Producto");
		jLabelid_productoBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaDemandaProductosDemandaProductos= new JComboBoxMe();
		jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaDemandaProductosDemandaProductos = new JLabelMe();
		jLabelid_lineaBusquedaDemandaProductosDemandaProductos.setText("Linea :");
		jLabelid_lineaBusquedaDemandaProductosDemandaProductos.setToolTipText("Linea");
		jLabelid_lineaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos = new JLabelMe();
		jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos = new JLabelMe();
		jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos = new JLabelMe();
		jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setText("Fecha Ultima Venta Hasta :");
		jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setToolTipText("Fecha Ultima Venta Hasta");
		jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasDemandaProductos=new JTabbedPane();


		this.jTabbedPaneBusquedasDemandaProductos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasDemandaProductos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasDemandaProductos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDemandaProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDemandaProductos = new DemandaProductosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Demanda Productos DATOS");
			this.jInternalFrameDetalleFormDemandaProductos = new DemandaProductosDetalleFormJInternalFrame(jDesktopPane,this.demandaproductosSessionBean.getConGuardarRelaciones(),this.demandaproductosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDemandaProductos = null;//new DemandaProductosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDemandaProductos= new GridBagLayout();
		
		
		this.jTableDatosDemandaProductos = new JTableMe();      
		
		String sToolTipDemandaProductos="";
		sToolTipDemandaProductos=DemandaProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDemandaProductos+="(Inventario.DemandaProductos)";
		}
		
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipDemandaProductos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDemandaProductos.setToolTipText(sToolTipDemandaProductos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDemandaProductos);
		this.jTableDatosDemandaProductos.setAutoCreateRowSorter(true);
		this.jTableDatosDemandaProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDemandaProductos.setRowSelectionAllowed(true);
		this.jTableDatosDemandaProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDemandaProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDemandaProductos = new JButtonMe();
		this.jButtonDuplicarDemandaProductos = new JButtonMe();
		this.jButtonCopiarDemandaProductos = new JButtonMe();
		this.jButtonVerFormDemandaProductos = new JButtonMe();
		this.jButtonNuevoRelacionesDemandaProductos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDemandaProductos = new JButtonMe();
		this.jButtonCerrarDemandaProductos = new JButtonMe();
		
		this.jScrollPanelDatosDemandaProductos = new JScrollPane();   
        this.jScrollPanelDatosGeneralDemandaProductos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Demanda Productos";
		
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Demanda Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosDemandaProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDemandaProductos.setToolTipText("Acciones");
        this.jPanelAccionesDemandaProductos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDemandaProductos=new ReporteDinamicoJInternalFrame(DemandaProductosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDemandaProductos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDemandaProductos=new ImportacionJInternalFrame(DemandaProductosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDemandaProductos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDemandaProductos = new JButtonMe();
		
		this.jButtonAbrirOrderByDemandaProductos.setText("Orden");
		this.jButtonAbrirOrderByDemandaProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDemandaProductos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDemandaProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDemandaProductos,false,this);
			
			//this.cargarOrderByDemandaProductos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDemandaProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDemandaProductos,true,this);
			
			//this.cargarOrderByDemandaProductos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDemandaProductos.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosDemandaProductos.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosDemandaProductos.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosDemandaProductos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDemandaProductos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDemandaProductos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDemandaProductos.setText("Nuevo");
		this.jButtonDuplicarDemandaProductos.setText("Duplicar");
		this.jButtonCopiarDemandaProductos.setText("Copiar");
		this.jButtonVerFormDemandaProductos.setText("Ver");
		this.jButtonNuevoRelacionesDemandaProductos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDemandaProductos.setText("Guardar");
		this.jButtonCerrarDemandaProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDemandaProductos,"nuevo_button","Nuevo",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDemandaProductos,"duplicar_button","Duplicar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDemandaProductos,"copiar_button","Copiar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDemandaProductos,"ver_form","Ver",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDemandaProductos,"nuevorelaciones_button","Nuevo Rel",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDemandaProductos,"guardarcambiostabla_button","Guardar",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDemandaProductos,"cerrar_button","Salir",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDemandaProductos.setToolTipText("Nuevo"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDemandaProductos.setToolTipText("Duplicar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDemandaProductos.setToolTipText("Copiar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDemandaProductos.setToolTipText("Ver"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDemandaProductos.setToolTipText("Nuevo Rel"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
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
		//String sMapKey = "";
		//InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoDemandaProductos";
		inputMap = this.jButtonNuevoDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDemandaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDemandaProductos"));
		
		//DUPLICAR
		sMapKey = "DuplicarDemandaProductos";
		inputMap = this.jButtonDuplicarDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDemandaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDemandaProductos"));
		
		//COPIAR
		sMapKey = "CopiarDemandaProductos";
		inputMap = this.jButtonCopiarDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDemandaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDemandaProductos"));
		
		//VEr FORM
		sMapKey = "VerFormDemandaProductos";
		inputMap = this.jButtonVerFormDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDemandaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDemandaProductos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDemandaProductos";
		inputMap = this.jButtonNuevoRelacionesDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDemandaProductos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDemandaProductos";
		inputMap = this.jButtonModificarDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDemandaProductos"));
		*/
		
		
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
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DemandaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DemandaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DemandaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DemandaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DemandaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDemandaProductos.setName("jPanelParametrosReportesDemandaProductos"); 
		
		this.jPanelParametrosReportesAccionesDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDemandaProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDemandaProductos.setName("jPanelParametrosReportesAccionesDemandaProductos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDemandaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDemandaProductos = new JButtonMe();
		this.jButtonRecargarInformacionDemandaProductos.setText("Buscar");
		this.jButtonRecargarInformacionDemandaProductos.setToolTipText("Buscar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDemandaProductos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDemandaProductos.setVisible(false);
		
		
		this.jButtonProcesarInformacionDemandaProductos = new JButtonMe();
		this.jButtonProcesarInformacionDemandaProductos.setText("Procesar");
		this.jButtonProcesarInformacionDemandaProductos.setToolTipText("Procesar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDemandaProductos.setVisible(false);
			
		this.jButtonProcesarInformacionDemandaProductos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDemandaProductos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDemandaProductos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDemandaProductos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDemandaProductos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDemandaProductos.setText("TIPO");       
		this.jComboBoxTiposReportesDemandaProductos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDemandaProductos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDemandaProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDemandaProductos.setText("Paginacion");
		this.jComboBoxTiposPaginacionDemandaProductos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDemandaProductos.setText("Accion");
		this.jComboBoxTiposRelacionesDemandaProductos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDemandaProductos.setText("Accion");
		this.jComboBoxTiposAccionesDemandaProductos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDemandaProductos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDemandaProductos.setText("Accion");
		this.jComboBoxTiposSeleccionarDemandaProductos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDemandaProductos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDemandaProductos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDemandaProductos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDemandaProductos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDemandaProductos = new JLabelMe();
		
		this.jLabelAccionesDemandaProductos.setText("Acciones");		
		this.jLabelAccionesDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDemandaProductos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDemandaProductos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDemandaProductos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDemandaProductos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDemandaProductos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDemandaProductos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDemandaProductos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDemandaProductos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDemandaProductos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDemandaProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDemandaProductos.setText("Graf.");
		this.jCheckBoxConGraficoReporteDemandaProductos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDemandaProductos = new JButtonMe();
		//this.jButtonAnterioresDemandaProductos.setText("<<");
        this.jButtonAnterioresDemandaProductos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDemandaProductos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDemandaProductos = new JButtonMe();
		//this.jButtonSiguientesDemandaProductos.setText(">>");
        this.jButtonSiguientesDemandaProductos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDemandaProductos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDemandaProductos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDemandaProductos.setText("Nue");
        this.jButtonNuevoGuardarCambiosDemandaProductos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDemandaProductos,"nuevoguardarcambios_button","Nue",this.demandaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDemandaProductos";
		inputMap = this.jButtonNuevoGuardarCambiosDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDemandaProductos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDemandaProductos";
		inputMap = this.jButtonRecargarInformacionDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDemandaProductos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDemandaProductos";
		inputMap = this.jButtonSiguientesDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDemandaProductos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDemandaProductos";
		inputMap = this.jButtonAnterioresDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDemandaProductos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDemandaProductos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDemandaProductos.setMinimumSize(new Dimension(this.getWidth(),DemandaProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DemandaProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDemandaProductos.setMaximumSize(new Dimension(this.getWidth(),DemandaProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DemandaProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDemandaProductos.setPreferredSize(new Dimension(this.getWidth(),DemandaProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DemandaProductosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDemandaProductos = new GridBagLayout();

			this.jPanelPaginacionDemandaProductos.setLayout(gridaBagLayoutPaginacionDemandaProductos);						
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = 0;
			this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDemandaProductos.add(this.jButtonAnterioresDemandaProductos, this.gridBagConstraintsDemandaProductos);
					
						
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDemandaProductos.gridy = 0;
			
			this.jPanelPaginacionDemandaProductos.add(this.jButtonNuevoGuardarCambiosDemandaProductos, this.gridBagConstraintsDemandaProductos);
						
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDemandaProductos.gridy = 0;
			this.jPanelPaginacionDemandaProductos.add(this.jButtonSiguientesDemandaProductos, this.gridBagConstraintsDemandaProductos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = 1;
			this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDemandaProductos.add(this.jButtonNuevoDemandaProductos, this.gridBagConstraintsDemandaProductos);
						
			
			
			if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
				this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDemandaProductos.gridy = 1;
				this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDemandaProductos.add(this.jButtonGuardarCambiosTablaDemandaProductos, this.gridBagConstraintsDemandaProductos);
			}
			
			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = 1;
			this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDemandaProductos.add(this.jButtonDuplicarDemandaProductos, this.gridBagConstraintsDemandaProductos);
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = 1;
			this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDemandaProductos.add(this.jButtonCopiarDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = 1;
			this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDemandaProductos.add(this.jButtonVerFormDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = 1;
			this.gridBagConstraintsDemandaProductos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDemandaProductos.add(this.jButtonCerrarDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		
		
		this.jButtonRecargarInformacionDemandaProductos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDemandaProductos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDemandaProductos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDemandaProductos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDemandaProductos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDemandaProductos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDemandaProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDemandaProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDemandaProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDemandaProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDemandaProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDemandaProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDemandaProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDemandaProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDemandaProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDemandaProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDemandaProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDemandaProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDemandaProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDemandaProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDemandaProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDemandaProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDemandaProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDemandaProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDemandaProductos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDemandaProductos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDemandaProductos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDemandaProductos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDemandaProductos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDemandaProductos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDemandaProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDemandaProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDemandaProductos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDemandaProductos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDemandaProductos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDemandaProductos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDemandaProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDemandaProductos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DemandaProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DemandaProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DemandaProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DemandaProductos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDemandaProductos.setLayout(gridaBagParametrosReportesDemandaProductos);
			this.jPanelParametrosReportesAccionesDemandaProductos.setLayout(gridaBagParametrosReportesAccionesDemandaProductos);
			
			
			this.jPanelParametrosAuxiliar1DemandaProductos.setLayout(gridaBagParametrosAuxiliar1DemandaProductos);
			this.jPanelParametrosAuxiliar2DemandaProductos.setLayout(gridaBagParametrosAuxiliar2DemandaProductos);
			this.jPanelParametrosAuxiliar3DemandaProductos.setLayout(gridaBagParametrosAuxiliar3DemandaProductos);
			this.jPanelParametrosAuxiliar4DemandaProductos.setLayout(gridaBagParametrosAuxiliar4DemandaProductos);
			//this.jPanelParametrosAuxiliar5DemandaProductos.setLayout(gridaBagParametrosAuxiliar2DemandaProductos);			
			
			
			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDemandaProductos.add(this.jButtonRecargarInformacionDemandaProductos, this.gridBagConstraintsDemandaProductos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DemandaProductos.add(this.jComboBoxTiposPaginacionDemandaProductos, this.gridBagConstraintsDemandaProductos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DemandaProductos.add(this.jCheckBoxConAltoMaximoTablaDemandaProductos, this.gridBagConstraintsDemandaProductos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DemandaProductos.add(this.jComboBoxTiposArchivosReportesDemandaProductos, this.gridBagConstraintsDemandaProductos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDemandaProductos.add(this.jPanelParametrosAuxiliar1DemandaProductos, this.gridBagConstraintsDemandaProductos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DemandaProductos.add(this.jComboBoxTiposReportesDemandaProductos, this.gridBagConstraintsDemandaProductos);																		
			
			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DemandaProductos.add(this.jComboBoxTiposGraficosReportesDemandaProductos, this.gridBagConstraintsDemandaProductos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDemandaProductos.add(this.jPanelParametrosAuxiliar4DemandaProductos, this.gridBagConstraintsDemandaProductos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDemandaProductos.add(this.jComboBoxTiposReportesDemandaProductos, this.gridBagConstraintsDemandaProductos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDemandaProductos.add(this.jCheckBoxGenerarReporteDemandaProductos, this.gridBagConstraintsDemandaProductos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDemandaProductos.add(this.jPanelParametrosAuxiliar2DemandaProductos, this.gridBagConstraintsDemandaProductos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDemandaProductos.add(this.jLabelAccionesDemandaProductos, this.gridBagConstraintsDemandaProductos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
				this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDemandaProductos.add(this.jButtonAbrirOrderByDemandaProductos, this.gridBagConstraintsDemandaProductos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDemandaProductos.add(this.jComboBoxTiposSeleccionarDemandaProductos, this.gridBagConstraintsDemandaProductos);			
			
			
			/*
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDemandaProductos.add(this.jCheckBoxSeleccionarTodosDemandaProductos, this.gridBagConstraintsDemandaProductos);
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDemandaProductos.add(this.jCheckBoxConGraficoReporteDemandaProductos, this.gridBagConstraintsDemandaProductos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DemandaProductos.add(this.jCheckBoxSeleccionarTodosDemandaProductos, this.gridBagConstraintsDemandaProductos);															
				
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DemandaProductos.add(this.jCheckBoxSeleccionadosDemandaProductos, this.gridBagConstraintsDemandaProductos);															
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDemandaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DemandaProductos.add(this.jCheckBoxConGraficoReporteDemandaProductos, this.gridBagConstraintsDemandaProductos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDemandaProductos.add(this.jPanelParametrosAuxiliar3DemandaProductos, this.gridBagConstraintsDemandaProductos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDemandaProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDemandaProductos.add(this.jComboBoxTiposAccionesDemandaProductos, this.gridBagConstraintsDemandaProductos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDemandaProductos = new GridBagLayout();

			this.jScrollPanelDatosDemandaProductos.setLayout(gridaBagLayoutDatosDemandaProductos);
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = 0;
			this.gridBagConstraintsDemandaProductos.gridx = 0;
			
			this.jScrollPanelDatosDemandaProductos.add(this.jTableDatosDemandaProductos, this.gridBagConstraintsDemandaProductos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDemandaProductos.setViewportView(this.jTableDatosDemandaProductos);
		this.jTableDatosDemandaProductos.setFillsViewportHeight(true);
		this.jTableDatosDemandaProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDemandaProductos= new GridBagLayout();
		this.jPanelAccionesDemandaProductos.setLayout(gridaBagLayoutAccionesDemandaProductos);
		
		
		/*	
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = 0;
		this.gridBagConstraintsDemandaProductos.gridx = 0;
			
		this.jPanelAccionesDemandaProductos.add(this.jButtonNuevoDemandaProductos, this.gridBagConstraintsDemandaProductos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaDemandaProductosDemandaProductos= new GridBagLayout();
		gridaBagLayoutBusquedaDemandaProductosDemandaProductos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaDemandaProductosDemandaProductos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaDemandaProductosDemandaProductos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaDemandaProductosDemandaProductos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaDemandaProductosDemandaProductos.setLayout(gridaBagLayoutBusquedaDemandaProductosDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 0;
		gridBagConstraintsDemandaProductos.gridx = 0;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jLabelid_bodegaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 0;
		gridBagConstraintsDemandaProductos.gridx = 1;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);


		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 1;
		gridBagConstraintsDemandaProductos.gridx = 0;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jLabelid_productoBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 1;
		gridBagConstraintsDemandaProductos.gridx = 1;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jComboBoxid_productoBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);


		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 2;
		gridBagConstraintsDemandaProductos.gridx = 0;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jLabelid_lineaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 2;
		gridBagConstraintsDemandaProductos.gridx = 1;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);


		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 3;
		gridBagConstraintsDemandaProductos.gridx = 0;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jLabelid_linea_grupoBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 3;
		gridBagConstraintsDemandaProductos.gridx = 1;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);


		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 4;
		gridBagConstraintsDemandaProductos.gridx = 0;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jLabelid_linea_categoriaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 4;
		gridBagConstraintsDemandaProductos.gridx = 1;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);


		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 5;
		gridBagConstraintsDemandaProductos.gridx = 0;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jLabelid_linea_marcaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 5;
		gridBagConstraintsDemandaProductos.gridx = 1;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);


		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 6;
		gridBagConstraintsDemandaProductos.gridx = 0;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jLabelfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 6;
		gridBagConstraintsDemandaProductos.gridx = 1;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		gridBagConstraintsDemandaProductos = new GridBagConstraints();
		gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDemandaProductos.gridy = 7;
		gridBagConstraintsDemandaProductos.gridx =1;
		jPanelBusquedaDemandaProductosDemandaProductos.add(jButtonBusquedaDemandaProductosDemandaProductos, gridBagConstraintsDemandaProductos);

		jTabbedPaneBusquedasDemandaProductos.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ", jPanelBusquedaDemandaProductosDemandaProductos);
		jTabbedPaneBusquedasDemandaProductos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
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
				
			this.jContentPane.add(this.jTtoolBarDemandaProductos, this.gridBagConstraintsDemandaProductos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDemandaProductos.gridx = 0;		
		//this.gridBagConstraintsDemandaProductos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDemandaProductos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDemandaProductos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDemandaProductos.gridx = 0;		
			this.gridBagConstraintsDemandaProductos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDemandaProductos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDemandaProductos, this.gridBagConstraintsDemandaProductos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDemandaProductos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDemandaProductos, this.gridBagConstraintsDemandaProductos);								
		
		
		/*
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDemandaProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDemandaProductos, this.gridBagConstraintsDemandaProductos);
		*/		
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDemandaProductos.gridx =0;
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDemandaProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDemandaProductos, this.gridBagConstraintsDemandaProductos);
				
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDemandaProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDemandaProductos, this.gridBagConstraintsDemandaProductos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DemandaProductosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDemandaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDemandaProductos = new GridBagLayout();
			this.jPanelBusquedasParametrosDemandaProductos.setLayout(gridaBagLayoutBusquedasParametrosDemandaProductos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDemandaProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDemandaProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDemandaProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDemandaProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			
			
			
			
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
		
		
		
		return this.jScrollPanelDatosGeneralDemandaProductos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDemandaProductos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDemandaProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDemandaProductos.setName("jPanelReporteDinamicoDemandaProductos"); 
		
		this.jPanelReporteDinamicoDemandaProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDemandaProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDemandaProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDemandaProductos.setLayout(gridaBagLayoutReporteDinamicoDemandaProductos);
		
		
		this.jInternalFrameReporteDinamicoDemandaProductos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDemandaProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDemandaProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDemandaProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDemandaProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDemandaProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDemandaProductos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDemandaProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDemandaProductos.setResizable(true);
	    this.jInternalFrameReporteDinamicoDemandaProductos.setClosable(true);
	    this.jInternalFrameReporteDinamicoDemandaProductos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDemandaProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDemandaProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDemandaProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Demanda Productoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDemandaProductos = new JLabelMe();

		this.jLabelColumnasSelectReporteDemandaProductos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDemandaProductos.add(this.jLabelColumnasSelectReporteDemandaProductos, this.gridBagConstraintsDemandaProductos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDemandaProductos = new JList<Reporte>();
		this.jListColumnasSelectReporteDemandaProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDemandaProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDemandaProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDemandaProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDemandaProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDemandaProductos=new JScrollPane(this.jListColumnasSelectReporteDemandaProductos);
			
			this.jScrollColumnasSelectReporteDemandaProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDemandaProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDemandaProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDemandaProductos.add(this.jListColumnasSelectReporteDemandaProductos, this.gridBagConstraintsDemandaProductos);
		this.jPanelReporteDinamicoDemandaProductos.add(this.jScrollColumnasSelectReporteDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDemandaProductos = new JLabelMe();

		this.jLabelRelacionesSelectReporteDemandaProductos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDemandaProductos = new JList<Reporte>();
		this.jListRelacionesSelectReporteDemandaProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDemandaProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDemandaProductos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDemandaProductos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDemandaProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDemandaProductos=new JScrollPane(this.jListRelacionesSelectReporteDemandaProductos);
			
			this.jScrollRelacionesSelectReporteDemandaProductos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDemandaProductos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDemandaProductos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDemandaProductos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDemandaProductos = new JComboBoxMe();
		this.jListColumnasValoresGraficoDemandaProductos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDemandaProductos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDemandaProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDemandaProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDemandaProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDemandaProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDemandaProductos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDemandaProductos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDemandaProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDemandaProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDemandaProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDemandaProductos = new JLabelMe();

		this.jLabelConGraficoDinamicoDemandaProductos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDemandaProductos.add(this.jLabelConGraficoDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDemandaProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDemandaProductos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDemandaProductos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDemandaProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDemandaProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDemandaProductos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDemandaProductos.add(this.jCheckBoxConGraficoDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDemandaProductos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDemandaProductos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDemandaProductos.add(this.jLabelColumnaCategoriaGraficoDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDemandaProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDemandaProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDemandaProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDemandaProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDemandaProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDemandaProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDemandaProductos.add(this.jComboBoxColumnaCategoriaGraficoDemandaProductos, this.gridBagConstraintsDemandaProductos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDemandaProductos = new JLabelMe();

		this.jLabelColumnaCategoriaValorDemandaProductos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDemandaProductos.add(this.jLabelColumnaCategoriaValorDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDemandaProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDemandaProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDemandaProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDemandaProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDemandaProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDemandaProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDemandaProductos.add(this.jComboBoxColumnaCategoriaValorDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDemandaProductos = new JLabelMe();

		this.jLabelColumnasValoresGraficoDemandaProductos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDemandaProductos.add(this.jLabelColumnasValoresGraficoDemandaProductos, this.gridBagConstraintsDemandaProductos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDemandaProductos = new JList<Reporte>();
		this.jListColumnasValoresGraficoDemandaProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDemandaProductos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDemandaProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDemandaProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDemandaProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDemandaProductos=new JScrollPane(this.jListColumnasValoresGraficoDemandaProductos);
			
			this.jScrollColumnasValoresGraficoDemandaProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDemandaProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDemandaProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDemandaProductos.add(this.jListColumnasSelectReporteDemandaProductos, this.gridBagConstraintsDemandaProductos);
		this.jPanelReporteDinamicoDemandaProductos.add(this.jScrollColumnasValoresGraficoDemandaProductos, this.gridBagConstraintsDemandaProductos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDemandaProductos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDemandaProductos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDemandaProductos.add(this.jLabelTiposGraficosReportesDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDemandaProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDemandaProductos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDemandaProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDemandaProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDemandaProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDemandaProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDemandaProductos.add(this.jComboBoxTiposGraficosReportesDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDemandaProductos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDemandaProductos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDemandaProductos.add(this.jLabelGenerarExcelReporteDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDemandaProductos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDemandaProductos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDemandaProductos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDemandaProductos.setToolTipText("Generar EXCEL"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		//this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDemandaProductos.add(this.jButtonGenerarExcelReporteDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDemandaProductos.add(this.jComboBoxTiposReportesDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDemandaProductos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDemandaProductos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDemandaProductos.add(this.jLabelTiposArchivoReporteDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDemandaProductos.add(this.jComboBoxTiposArchivosReportesDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDemandaProductos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDemandaProductos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDemandaProductos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDemandaProductos.setToolTipText("Generar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDemandaProductos.add(this.jButtonGenerarReporteDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDemandaProductos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDemandaProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDemandaProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDemandaProductos.setToolTipText("Cancelar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDemandaProductos.add(this.jButtonCerrarReporteDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDemandaProductos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDemandaProductos= new JScrollPane(jPanelReporteDinamicoDemandaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDemandaProductos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDemandaProductos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDemandaProductos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Demanda Productoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDemandaProductos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDemandaProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDemandaProductos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDemandaProductos);
		this.jInternalFrameReporteDinamicoDemandaProductos.getContentPane().add(this.jScrollPanelReporteDinamicoDemandaProductos, this.gridBagConstraintsDemandaProductos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDemandaProductos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDemandaProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDemandaProductos.setName("jPanelImportacionDemandaProductos"); 
		
		this.jPanelImportacionDemandaProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDemandaProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDemandaProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDemandaProductos.setLayout(gridaBagLayoutImportacionDemandaProductos);
		
		
		this.jInternalFrameImportacionDemandaProductos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDemandaProductos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDemandaProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDemandaProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDemandaProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDemandaProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDemandaProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDemandaProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDemandaProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDemandaProductos.setResizable(true);
	    this.jInternalFrameImportacionDemandaProductos.setClosable(true);
	    this.jInternalFrameImportacionDemandaProductos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDemandaProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDemandaProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDemandaProductos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDemandaProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDemandaProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDemandaProductos.setResizable(true);
	    this.jInternalFrameImportacionDemandaProductos.setClosable(true);
	    this.jInternalFrameImportacionDemandaProductos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDemandaProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDemandaProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDemandaProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Demanda Productoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDemandaProductos = new JLabelMe();

		this.jLabelArchivoImportacionDemandaProductos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDemandaProductos.add(this.jLabelArchivoImportacionDemandaProductos, this.gridBagConstraintsDemandaProductos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDemandaProductos = new JFileChooser();		
		this.jFileChooserImportacionDemandaProductos.setToolTipText("ESCOGER ARCHIVO"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDemandaProductos = new JButtonMe();
		this.jButtonAbrirImportacionDemandaProductos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDemandaProductos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDemandaProductos.setToolTipText("Generar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDemandaProductos.add(this.jButtonAbrirImportacionDemandaProductos, this.gridBagConstraintsDemandaProductos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDemandaProductos = new JLabelMe();

		this.jLabelPathArchivoImportacionDemandaProductos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDemandaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDemandaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDemandaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsDemandaProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDemandaProductos.add(this.jLabelPathArchivoImportacionDemandaProductos, this.gridBagConstraintsDemandaProductos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDemandaProductos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDemandaProductos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDemandaProductos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDemandaProductos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDemandaProductos.add(this.jTextFieldPathArchivoImportacionDemandaProductos, this.gridBagConstraintsDemandaProductos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDemandaProductos = new JButtonMe();
		this.jButtonGenerarImportacionDemandaProductos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDemandaProductos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDemandaProductos.setToolTipText("Generar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDemandaProductos.add(this.jButtonGenerarImportacionDemandaProductos, this.gridBagConstraintsDemandaProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDemandaProductos = new JButtonMe();
		this.jButtonCerrarImportacionDemandaProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDemandaProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDemandaProductos.setToolTipText("Cancelar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDemandaProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsDemandaProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDemandaProductos.add(this.jButtonCerrarImportacionDemandaProductos, this.gridBagConstraintsDemandaProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDemandaProductos = new GridBagLayout();
		
		this.jScrollPanelImportacionDemandaProductos= new JScrollPane(jPanelImportacionDemandaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
		this.gridBagConstraintsDemandaProductos.gridy =iPosYImportacion;
		this.gridBagConstraintsDemandaProductos.gridx =iPosXImportacion;
		this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDemandaProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDemandaProductos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDemandaProductos);
		this.jInternalFrameImportacionDemandaProductos.getContentPane().add(this.jScrollPanelImportacionDemandaProductos, this.gridBagConstraintsDemandaProductos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDemandaProductos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDemandaProductos = new JButtonMe();
			this.jButtonAbrirOrderByDemandaProductos.setText("Orden");
			this.jButtonAbrirOrderByDemandaProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDemandaProductos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDemandaProductos";
			inputMap = this.jButtonAbrirOrderByDemandaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDemandaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDemandaProductos"));
		
		
			GridBagLayout gridaBagLayoutOrderByDemandaProductos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDemandaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDemandaProductos.setName("jPanelOrderByDemandaProductos"); 
			
			this.jPanelOrderByDemandaProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDemandaProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDemandaProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDemandaProductos.setLayout(gridaBagLayoutOrderByDemandaProductos);
			
			
			this.jTableDatosDemandaProductosOrderBy = new JTableMe();        
			this.jTableDatosDemandaProductosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDemandaProductosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDemandaProductosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDemandaProductosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDemandaProductosOrderBy.setViewportView(this.jTableDatosDemandaProductosOrderBy);
			this.jTableDatosDemandaProductosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDemandaProductosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDemandaProductos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDemandaProductos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDemandaProductos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDemandaProductos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDemandaProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDemandaProductos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDemandaProductos.setTitle("Orden");
			this.jInternalFrameOrderByDemandaProductos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDemandaProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDemandaProductos.setResizable(true);
			this.jInternalFrameOrderByDemandaProductos.setClosable(true);
			this.jInternalFrameOrderByDemandaProductos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDemandaProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDemandaProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDemandaProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDemandaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Demanda Productoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDemandaProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDemandaProductos.ipady =150;
				
			this.jPanelOrderByDemandaProductos.add(jScrollPanelDatosDemandaProductosOrderBy, this.gridBagConstraintsDemandaProductos);//this.jTableDatosDemandaProductosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDemandaProductos = new JButtonMe();
			this.jButtonCerrarOrderByDemandaProductos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDemandaProductos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDemandaProductos.setToolTipText("Cancelar"+" "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDemandaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDemandaProductos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDemandaProductos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDemandaProductos.add(this.jButtonCerrarOrderByDemandaProductos, this.gridBagConstraintsDemandaProductos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDemandaProductos = new GridBagLayout();
			
			this.jScrollPanelOrderByDemandaProductos= new JScrollPane(jPanelOrderByDemandaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDemandaProductos = new GridBagConstraints();
			this.gridBagConstraintsDemandaProductos.gridy =iPosYOrderBy;
			this.gridBagConstraintsDemandaProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsDemandaProductos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDemandaProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDemandaProductos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDemandaProductos);
			
			this.jInternalFrameOrderByDemandaProductos.getContentPane().add(this.jScrollPanelOrderByDemandaProductos, this.gridBagConstraintsDemandaProductos);			
		
		} else {
			this.jButtonAbrirOrderByDemandaProductos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.demandaproductosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDemandaProductos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDemandaProductos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDemandaProductos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDemandaProductos.getRowHeight();//DemandaProductosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DemandaProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDemandaProductos.isSelected()) {
					iHeightTable=DemandaProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DemandaProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DemandaProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DemandaProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDemandaProductos.isSelected()) {
					iHeightTable=DemandaProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DemandaProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DemandaProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDemandaProductos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDemandaProductos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDemandaProductos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDemandaProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDemandaProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDemandaProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDemandaProductos!=null && this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy()!=null) {
			//if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDemandaProductos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDemandaProductos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDemandaProductos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDemandaProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDemandaProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDemandaProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=demandaproductosLogic.getDemandaProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=demandaproductoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DemandaProductos> TraerDemandaProductosBeans(List<DemandaProductos> demandaproductoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(DemandaProductos demandaproductos:demandaproductoss) {
					
				if(!(DemandaProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DemandaProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					demandaproductos.setsDetalleGeneralEntityReporte(DemandaProductosConstantesFunciones.getDemandaProductosDescripcion(demandaproductos));
										
						
					
						
					
				} else  {
							
					//demandaproductos.setsDetalleGeneralEntityReporte(demandaproductos.getsDetalleGeneralEntityReporte());
										
				}
				
				//demandaproductosbeans.add(demandaproductosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return demandaproductoss;
    }
	//PARA REPORTES FIN
}
