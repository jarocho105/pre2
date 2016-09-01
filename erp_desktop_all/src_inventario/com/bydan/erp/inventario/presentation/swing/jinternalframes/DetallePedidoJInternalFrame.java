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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DetallePedidoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DetallePedidoJInternalFrame extends DetallePedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePedido;
	
	protected JMenuBar jmenuBarDetallePedido;
	
	protected JMenu jmenuDetallePedido;
	protected JMenu jmenuDatosDetallePedido;
	protected JMenu jmenuArchivoDetallePedido;
	protected JMenu jmenuAccionesDetallePedido;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedido;	
	protected GridBagConstraints gridBagConstraintsDetallePedido;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePedidoDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePedido;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePedido;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePedido;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedido="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EstadoDetallePedidoBeanSwingJInternalFrame estadodetallepedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallepedido="";
	
	public DetallePedidoSessionBean detallepedidoSessionBean;
		
	
	
	public PedidoSessionBean pedidoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ProductoSessionBean productoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePedido> detallepedidos;		
	public List<DetallePedido> detallepedidosEliminados;	
	public List<DetallePedido> detallepedidosAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetallePedido;		
	protected JButton jButtonAbrirTotalesDetallePedido;		
	
	/*
	protected JPanel jPanelTotalesDetallePedido;
	public JScrollPane jScrollPanelTotalesDetallePedido;	
	protected JButton jButtonCerrarTotalesDetallePedido;
	*/
	
	public List<DetallePedido> detallepedidosTotal= new ArrayList<DetallePedido>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePedido;		
	protected JButton jButtonAbrirOrderByDetallePedido;
	
	
	//protected JPanel jPanelOrderByDetallePedido;
	//public JScrollPane jScrollPanelOrderByDetallePedido;	
	//protected JButton jButtonCerrarOrderByDetallePedido;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePedidoLogic detallepedidoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePedido;
	public JScrollPane jScrollPanelDatosEdicionDetallePedido;
	public JScrollPane jScrollPanelDatosGeneralDetallePedido;
    //public JScrollPane jScrollPanelDatosDetallePedidoTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetallePedidoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePedido;
	//public JScrollPane jScrollPanelImportacionDetallePedido;
	
	
	
	protected JPanel jPanelAccionesDetallePedido;
	
    protected JPanel jPanelPaginacionDetallePedido;
    protected JPanel jPanelParametrosReportesDetallePedido;
	protected JPanel jPanelParametrosReportesAccionesDetallePedido;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePedido;
	protected JPanel jPanelParametrosAuxiliar2DetallePedido;
	protected JPanel jPanelParametrosAuxiliar3DetallePedido;
	protected JPanel jPanelParametrosAuxiliar4DetallePedido;
	//protected JPanel jPanelParametrosAuxiliar5DetallePedido;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePedido;
	//protected JPanel jPanelImportacionDetallePedido;
	
	
	public JTable jTableDatosDetallePedido;
	//public JTable jTableDatosDetallePedidoTotales;
	
	
	//public JTable jTableDatosDetallePedidoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePedido;
	protected JButton jButtonDuplicarDetallePedido;
	protected JButton jButtonCopiarDetallePedido;
	protected JButton jButtonVerFormDetallePedido;
	protected JButton jButtonNuevoRelacionesDetallePedido;
	protected JButton jButtonModificarDetallePedido;
	
    protected JButton jButtonGuardarCambiosTablaDetallePedido;
	protected JButton jButtonCerrarDetallePedido;
	
	
	protected JButton jButtonRecargarInformacionDetallePedido;
	protected JButton jButtonProcesarInformacionDetallePedido;
	
	
	protected JButton jButtonAnterioresDetallePedido;
	protected JButton jButtonSiguientesDetallePedido;
	protected JButton jButtonNuevoGuardarCambiosDetallePedido;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePedido;
	//protected JButton jButtonCerrarReporteDinamicoDetallePedido;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePedido;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePedido;
	//protected JButton jButtonGenerarImportacionDetallePedido;
	//protected JButton jButtonCerrarImportacionDetallePedido;
	//protected JFileChooser jFileChooserImportacionDetallePedido;
	//protected File fileImportacionDetallePedido;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedido;
	protected JButton jButtonDuplicarToolBarDetallePedido;
	protected JButton jButtonNuevoRelacionesToolBarDetallePedido;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePedido;
	protected JButton jButtonCopiarToolBarDetallePedido;
	protected JButton jButtonVerFormToolBarDetallePedido;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePedido;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedido;
	protected JButton jButtonCerrarToolBarDetallePedido;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePedido;
	protected JButton jButtonProcesarInformacionToolBarDetallePedido;
	protected JButton jButtonAnterioresToolBarDetallePedido;
	protected JButton jButtonSiguientesToolBarDetallePedido;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePedido;
	protected JButton jButtonAbrirOrderByToolBarDetallePedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedido;
	protected JMenuItem jMenuItemDuplicarDetallePedido;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePedido;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePedido;
	protected JMenuItem jMenuItemCopiarDetallePedido;
	protected JMenuItem jMenuItemVerFormDetallePedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedido;
	protected JMenuItem jMenuItemCerrarDetallePedido;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedido;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedido;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePedido;
	protected JMenuItem jMenuItemProcesarInformacionDetallePedido;
	protected JMenuItem jMenuItemAnterioresDetallePedido;
	protected JMenuItem jMenuItemSiguientesDetallePedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedido;
	protected JMenuItem jMenuItemAbrirOrderByDetallePedido;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedido;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePedido;
	protected JCheckBox jCheckBoxSeleccionadosDetallePedido;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePedido;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePedido;
	protected JTextField jTextFieldValorCampoGeneralDetallePedido;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePedido;
	//public JList<Reporte> jListColumnasSelectReporteDetallePedido;
	//public JScrollPane jScrollColumnasSelectReporteDetallePedido;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePedido;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePedido;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePedido;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePedido;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePedido;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePedido;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePedido;
	
		
	//public JLabel jLabelArchivoImportacionDetallePedido;	
	//public JLabel jLabelPathArchivoImportacionDetallePedido;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePedido;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePedido;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePedido;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePedido;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePedido;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePedido;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePedido;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePedido;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePedido;
	public JPanel jPanelFK_IdBodegaDetallePedido;
	public JButton jButtonFK_IdBodegaDetallePedido;
	public JPanel jPanelFK_IdEstadoDetallePedidoDetallePedido;
	public JButton jButtonFK_IdEstadoDetallePedidoDetallePedido;
	public JPanel jPanelFK_IdPedidoDetallePedido;
	public JButton jButtonFK_IdPedidoDetallePedido;
	public JPanel jPanelFK_IdProductoDetallePedido;
	public JButton jButtonFK_IdProductoDetallePedido;
	public JPanel jPanelFK_IdUnidadDetallePedido;
	public JButton jButtonFK_IdUnidadDetallePedido;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetallePedido;
	public JLabel jLabelid_bodegaFK_IdBodegaDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetallePedido;
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedido= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido;
	public JLabel jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido;
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedidoFK_IdPedidoDetallePedido;
	public JLabel jLabelid_pedidoFK_IdPedidoDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedidoFK_IdPedidoDetallePedido;
	public JButton jButtonid_pedidoFK_IdPedidoDetallePedido= new JButtonMe();
	public JButton jButtonid_pedidoFK_IdPedidoDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_pedidoFK_IdPedidoDetallePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetallePedido;
	public JLabel jLabelid_productoFK_IdProductoDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetallePedido;
	public JButton jButtonid_productoFK_IdProductoDetallePedido= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetallePedido;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetallePedido;
	public JLabel jLabelid_unidadFK_IdUnidadDetallePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetallePedido;
	public JButton jButtonid_unidadFK_IdUnidadDetallePedido= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public DetallePedidoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePedido)	{
		this.jButtonRecargarInformacionDetallePedido = jButtonRecargarInformacionDetallePedido;
	}
	
	public JButton getjButtonProcesarInformacionDetallePedido() {
		return this.jButtonProcesarInformacionDetallePedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedido)	{
		this.jButtonProcesarInformacionDetallePedido = jButtonProcesarInformacionDetallePedido;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePedido() {
		return this.jButtonRecargarInformacionDetallePedido;
	}
	
	
	public List<DetallePedido> getdetallepedidos() {
		return this.detallepedidos;
	}

	public void setdetallepedidos(List<DetallePedido> detallepedidos) {
		this.detallepedidos = detallepedidos;
	}
	
	public List<DetallePedido> getdetallepedidosAux() {
		return this.detallepedidosAux;
	}

	public void setdetallepedidosAux(List<DetallePedido> detallepedidosAux) {
		this.detallepedidosAux = detallepedidosAux;
	}
	
	public List<DetallePedido> getdetallepedidosEliminados() {
		return this.detallepedidosEliminados;
	}

	public void setDetallePedidosEliminados(List<DetallePedido> detallepedidosEliminados) {
		this.detallepedidosEliminados = detallepedidosEliminados;
	}
	
	public List<DetallePedido> getdetallepedidosTotal() {
		return this.detallepedidosTotal;
	}

	public void setdetallepedidosTotal(List<DetallePedido> detallepedidosTotal) {
		this.detallepedidosTotal = detallepedidosTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePedido() {
		return jComboBoxTiposSeleccionarDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePedido(
			JComboBox jComboBoxTiposSeleccionarDetallePedido) {
		this.jComboBoxTiposSeleccionarDetallePedido = jComboBoxTiposSeleccionarDetallePedido;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePedido .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePedido() {
		return jTextFieldValorCampoGeneralDetallePedido;
	}

	public void setjTextFieldValorCampoGeneralDetallePedido(
			JTextField jTextFieldValorCampoGeneralDetallePedido) {
		this.jTextFieldValorCampoGeneralDetallePedido = jTextFieldValorCampoGeneralDetallePedido;
	}

	public void setBorderResaltarValorCampoGeneralDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePedido .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePedido() {
		return this.jCheckBoxSeleccionarTodosDetallePedido;
	}

	public void setjCheckBoxSeleccionarTodosDetallePedido(
			JCheckBox jCheckBoxSeleccionarTodosDetallePedido) {
		this.jCheckBoxSeleccionarTodosDetallePedido = jCheckBoxSeleccionarTodosDetallePedido;
	}

	public void setBorderResaltarSeleccionarTodosDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePedido .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePedido() {
		return this.jCheckBoxSeleccionadosDetallePedido;
	}

	public void setjCheckBoxSeleccionadosDetallePedido(
			JCheckBox jCheckBoxSeleccionadosDetallePedido) {
		this.jCheckBoxSeleccionadosDetallePedido = jCheckBoxSeleccionadosDetallePedido;
	}
	
	public void setBorderResaltarSeleccionadosDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePedido .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePedido() {
		return this.jComboBoxTiposArchivosReportesDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePedido(
			JComboBox jComboBoxTiposArchivosReportesDetallePedido) {
		this.jComboBoxTiposArchivosReportesDetallePedido = jComboBoxTiposArchivosReportesDetallePedido;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePedido() {
		return this.jComboBoxTiposReportesDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePedido(
			JComboBox jComboBoxTiposReportesDetallePedido) {
		this.jComboBoxTiposReportesDetallePedido = jComboBoxTiposReportesDetallePedido;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePedido() {
	//	return jComboBoxTiposReportesDinamicoDetallePedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePedido(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePedido) {
	//	this.jComboBoxTiposReportesDinamicoDetallePedido = jComboBoxTiposReportesDinamicoDetallePedido;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePedido() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePedido(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedido) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePedido = jComboBoxTiposArchivosReportesDinamicoDetallePedido;
	//}
	
	public void setBorderResaltarTiposReportesDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePedido() {
		return this.jComboBoxTiposGraficosReportesDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePedido(
			JComboBox jComboBoxTiposGraficosReportesDetallePedido) {
		this.jComboBoxTiposGraficosReportesDetallePedido = jComboBoxTiposGraficosReportesDetallePedido;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePedido() {
		return this.jComboBoxTiposPaginacionDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePedido(
			JComboBox jComboBoxTiposPaginacionDetallePedido) {
		this.jComboBoxTiposPaginacionDetallePedido = jComboBoxTiposPaginacionDetallePedido;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePedido() {
		return this.jComboBoxTiposRelacionesDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedido() {
		return this.jComboBoxTiposAccionesDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedido(
			JComboBox jComboBoxTiposRelacionesDetallePedido) {
		this.jComboBoxTiposRelacionesDetallePedido = jComboBoxTiposRelacionesDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedido(
			JComboBox jComboBoxTiposAccionesDetallePedido) {
		this.jComboBoxTiposAccionesDetallePedido = jComboBoxTiposAccionesDetallePedido;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePedido .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePedido .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePedido() {
	//	return jCheckBoxConGraficoDinamicoDetallePedido;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePedido(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePedido) {
	//	this.jCheckBoxConGraficoDinamicoDetallePedido = jCheckBoxConGraficoDinamicoDetallePedido;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePedido() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePedido.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePedido .setBorder(borderResaltar);		
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
		this.detallepedidoSessionBean=new DetallePedidoSessionBean();
		
		this.detallepedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedido= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"nuevo","nuevo","Nuevo"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"duplicar","duplicar","Duplicar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"copiar","copiar","Copiar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"ver_form","ver_form","Ver"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"recargar","recargar","Recargar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePedido,this.jTtoolBarDetallePedido,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePedido,this.jTtoolBarDetallePedido,
							"cerrar","cerrar","Salir"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePedido=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePedido;
			
				this.jButtonProcesarInformacionToolBarDetallePedido=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePedido;
				
		//protected JButton jButtonModificarToolBarDetallePedido;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePedido=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePedido=new JMenuMe("General");
		this.jmenuArchivoDetallePedido=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePedido=new JMenuMe("Acciones");
		this.jmenuDatosDetallePedido=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePedido= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePedido.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePedido,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePedido= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePedido.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePedido,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePedido= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePedido.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePedido,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePedido= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePedido.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePedido,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePedido= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePedido.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePedido,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePedido= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePedido.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePedido,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePedido= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePedido.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePedido,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePedido= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePedido.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePedido,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePedido= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePedido.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePedido,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePedido= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePedido.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePedido,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePedido.add(this.jMenuItemCerrarDetallePedido);
			
			this.jmenuAccionesDetallePedido.add(this.jMenuItemNuevoDetallePedido);
			this.jmenuAccionesDetallePedido.add(this.jMenuItemNuevoGuardarCambiosDetallePedido);
			this.jmenuAccionesDetallePedido.add(this.jMenuItemNuevoRelacionesDetallePedido);
			this.jmenuAccionesDetallePedido.add(this.jMenuItemGuardarCambiosTablaDetallePedido);		
			this.jmenuAccionesDetallePedido.add(this.jMenuItemDuplicarDetallePedido);		
			this.jmenuAccionesDetallePedido.add(this.jMenuItemCopiarDetallePedido);		
			this.jmenuAccionesDetallePedido.add(this.jMenuItemVerFormDetallePedido);		
			
			this.jmenuDatosDetallePedido.add(this.jMenuItemRecargarInformacionDetallePedido);				
			this.jmenuDatosDetallePedido.add(this.jMenuItemAnterioresDetallePedido);				
			this.jmenuDatosDetallePedido.add(this.jMenuItemSiguientesDetallePedido);				
			this.jmenuDatosDetallePedido.add(this.jMenuItemAbrirOrderByDetallePedido);				
			this.jmenuDatosDetallePedido.add(this.jMenuItemMostrarOcultarDetallePedido);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePedido.add(this.jMenuItemGuardarCambiosDetallePedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedido.add(this.jmenuArchivoDetallePedido);		
			this.jmenuBarDetallePedido.add(this.jmenuAccionesDetallePedido);		
			this.jmenuBarDetallePedido.add(this.jmenuDatosDetallePedido);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePedido);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePedido() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetallePedido.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetallePedido= new JButtonMe();
		this.jButtonFK_IdBodegaDetallePedido.setText("Buscar");
		this.jButtonFK_IdBodegaDetallePedido.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetallePedido,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetallePedido = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetallePedido.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetallePedido.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetallePedido= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetallePedidoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetallePedidoDetallePedido.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetallePedidoDetallePedido= new JButtonMe();
		this.jButtonFK_IdEstadoDetallePedidoDetallePedido.setText("Buscar");
		this.jButtonFK_IdEstadoDetallePedidoDetallePedido.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetallePedidoDetallePedido,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetallePedidoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido = new JLabelMe();
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido.setText("Estado :");
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido.setToolTipText("Estado");
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido= new JComboBoxMe();
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPedidoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoDetallePedido.setToolTipText("Buscar Por Pedido ");
		this.jButtonFK_IdPedidoDetallePedido= new JButtonMe();
		this.jButtonFK_IdPedidoDetallePedido.setText("Buscar");
		this.jButtonFK_IdPedidoDetallePedido.setToolTipText("Buscar Por Pedido ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoDetallePedido,"buscar_button","Buscar Por Pedido ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedidoFK_IdPedidoDetallePedido = new JLabelMe();
		jLabelid_pedidoFK_IdPedidoDetallePedido.setText("Pedido :");
		jLabelid_pedidoFK_IdPedidoDetallePedido.setToolTipText("Pedido");
		jLabelid_pedidoFK_IdPedidoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedidoFK_IdPedidoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedidoFK_IdPedidoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pedidoFK_IdPedidoDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedidoFK_IdPedidoDetallePedido= new JComboBoxMe();
		jComboBoxid_pedidoFK_IdPedidoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoFK_IdPedidoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoFK_IdPedidoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedidoFK_IdPedidoDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetallePedido.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetallePedido= new JButtonMe();
		this.jButtonFK_IdProductoDetallePedido.setText("Buscar");
		this.jButtonFK_IdProductoDetallePedido.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetallePedido,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetallePedido = new JLabelMe();
		jLabelid_productoFK_IdProductoDetallePedido.setText("Producto :");
		jLabelid_productoFK_IdProductoDetallePedido.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetallePedido= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetallePedido= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetallePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetallePedido.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedido.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedido.setFocusable(false);

		this.jPanelFK_IdUnidadDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetallePedido.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetallePedido= new JButtonMe();
		this.jButtonFK_IdUnidadDetallePedido.setText("Buscar");
		this.jButtonFK_IdUnidadDetallePedido.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetallePedido,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetallePedido = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetallePedido.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetallePedido.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetallePedido= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetallePedido=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePedido.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedido.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedido.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePedido = new DetallePedidoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Pedido DATOS");
			this.jInternalFrameDetalleFormDetallePedido = new DetallePedidoDetalleFormJInternalFrame(jDesktopPane,this.detallepedidoSessionBean.getConGuardarRelaciones(),this.detallepedidoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePedido = null;//new DetallePedidoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedido= new GridBagLayout();
		
		
		this.jTableDatosDetallePedido = new JTableMe();      
		
		String sToolTipDetallePedido="";
		sToolTipDetallePedido=DetallePedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedido+="(Inventario.DetallePedido)";
		}
		
		if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedido+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePedido.setToolTipText(sToolTipDetallePedido);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePedido);
		this.jTableDatosDetallePedido.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePedido.setRowSelectionAllowed(true);
		this.jTableDatosDetallePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetallePedidoTotales = new JTableMe();        
		//this.jTableDatosDetallePedidoTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetallePedidoTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedido = new JButtonMe();
		this.jButtonDuplicarDetallePedido = new JButtonMe();
		this.jButtonCopiarDetallePedido = new JButtonMe();
		this.jButtonVerFormDetallePedido = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePedido = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePedido = new JButtonMe();
		this.jButtonCerrarDetallePedido = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedido = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePedido = new JScrollPane();
		
		//this.jScrollPanelDatosDetallePedidoTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido";
		
		if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetallePedidoTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedido.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedido.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePedido=new ReporteDinamicoJInternalFrame(DetallePedidoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePedido();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePedido=new ImportacionJInternalFrame(DetallePedidoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePedido();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetallePedido = new JButtonMe();
		
		this.jButtonAbrirTotalesDetallePedido.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetallePedido,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetallePedido=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetallePedido,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetallePedido();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePedido = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePedido.setText("Orden");
		this.jButtonAbrirOrderByDetallePedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedido,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedido,false,this);
			
			//this.cargarOrderByDetallePedido(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedido,true,this);
			
			//this.cargarOrderByDetallePedido(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePedido.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosDetallePedido.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosDetallePedido.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosDetallePedido.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedido.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedido.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePedido.setText("Nuevo");
		this.jButtonDuplicarDetallePedido.setText("Duplicar");
		this.jButtonCopiarDetallePedido.setText("Copiar");
		this.jButtonVerFormDetallePedido.setText("Ver");
		this.jButtonNuevoRelacionesDetallePedido.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePedido.setText("Guardar");
		this.jButtonCerrarDetallePedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedido,"nuevo_button","Nuevo",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePedido,"duplicar_button","Duplicar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePedido,"copiar_button","Copiar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePedido,"ver_form","Ver",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePedido,"nuevorelaciones_button","Nuevo Rel",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedido,"guardarcambiostabla_button","Guardar",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedido,"cerrar_button","Salir",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedido.setToolTipText("Nuevo"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePedido.setToolTipText("Duplicar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePedido.setToolTipText("Copiar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePedido.setToolTipText("Ver"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePedido.setToolTipText("Nuevo Rel"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePedido.setToolTipText("Guardar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedido.setToolTipText("Salir"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedido";
		inputMap = this.jButtonNuevoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedido"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePedido";
		inputMap = this.jButtonDuplicarDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePedido"));
		
		//COPIAR
		sMapKey = "CopiarDetallePedido";
		inputMap = this.jButtonCopiarDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePedido"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePedido";
		inputMap = this.jButtonVerFormDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePedido"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePedido";
		inputMap = this.jButtonNuevoRelacionesDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePedido"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePedido";
		inputMap = this.jButtonModificarDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePedido"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePedido";
		inputMap = this.jButtonCerrarDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedido";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedido"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePedido.setName("jPanelParametrosReportesDetallePedido"); 
		
		this.jPanelParametrosReportesAccionesDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePedido.setName("jPanelParametrosReportesAccionesDetallePedido"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePedido = new JButtonMe();
		this.jButtonRecargarInformacionDetallePedido.setText("Recargar");
		this.jButtonRecargarInformacionDetallePedido.setToolTipText("Recargar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePedido,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetallePedido = new JButtonMe();
		this.jButtonProcesarInformacionDetallePedido.setText("Procesar");
		this.jButtonProcesarInformacionDetallePedido.setToolTipText("Procesar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePedido.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePedido.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedido.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedido.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedido.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePedido.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedido.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePedido.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedido.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePedido.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePedido.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePedido.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePedido.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedido.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedido.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePedido.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePedido.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePedido=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePedido.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedido.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedido.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePedido = new JLabelMe();
		
		this.jLabelAccionesDetallePedido.setText("Acciones");		
		this.jLabelAccionesDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePedido = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePedido.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePedido.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePedido = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePedido.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePedido.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePedido = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePedido.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePedido.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePedido.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePedido.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePedido = new JButtonMe();
		//this.jButtonAnterioresDetallePedido.setText("<<");
        this.jButtonAnterioresDetallePedido.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePedido,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePedido = new JButtonMe();
		//this.jButtonSiguientesDetallePedido.setText(">>");
        this.jButtonSiguientesDetallePedido.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePedido,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePedido = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePedido.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePedido.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePedido,"nuevoguardarcambios_button","Nue",this.detallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePedido";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePedido"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePedido";
		inputMap = this.jButtonRecargarInformacionDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePedido"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePedido";
		inputMap = this.jButtonSiguientesDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePedido"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePedido";
		inputMap = this.jButtonAnterioresDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePedido"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePedido();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePedido.setMinimumSize(new Dimension(this.getWidth(),DetallePedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePedido.setMaximumSize(new Dimension(this.getWidth(),DetallePedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePedido.setPreferredSize(new Dimension(this.getWidth(),DetallePedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePedido = new GridBagLayout();

			this.jPanelPaginacionDetallePedido.setLayout(gridaBagLayoutPaginacionDetallePedido);						
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = 0;
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedido.add(this.jButtonAnterioresDetallePedido, this.gridBagConstraintsDetallePedido);
					
						
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedido.gridy = 0;
			
			this.jPanelPaginacionDetallePedido.add(this.jButtonNuevoGuardarCambiosDetallePedido, this.gridBagConstraintsDetallePedido);
						
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedido.gridy = 0;
			this.jPanelPaginacionDetallePedido.add(this.jButtonSiguientesDetallePedido, this.gridBagConstraintsDetallePedido);
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = 0;
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedido.add(this.jButtonAbrirTotalesDetallePedido, this.gridBagConstraintsDetallePedido);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = 1;
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedido.add(this.jButtonNuevoDetallePedido, this.gridBagConstraintsDetallePedido);
						
			
			
			if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePedido = new GridBagConstraints();
				this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePedido.gridy = 1;
				this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePedido.add(this.jButtonGuardarCambiosTablaDetallePedido, this.gridBagConstraintsDetallePedido);
			}
			
			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = 1;
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedido.add(this.jButtonDuplicarDetallePedido, this.gridBagConstraintsDetallePedido);
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = 1;
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedido.add(this.jButtonCopiarDetallePedido, this.gridBagConstraintsDetallePedido);
		
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = 1;
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedido.add(this.jButtonVerFormDetallePedido, this.gridBagConstraintsDetallePedido);
		
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = 1;
			this.gridBagConstraintsDetallePedido.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePedido.add(this.jButtonCerrarDetallePedido, this.gridBagConstraintsDetallePedido);
		
		
		
		this.jButtonRecargarInformacionDetallePedido.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedido.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedido.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePedido.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedido.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedido.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePedido.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedido.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedido.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePedido.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedido.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedido.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedido.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePedido.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedido.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedido.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePedido = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePedido = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePedido.setLayout(gridaBagParametrosReportesDetallePedido);
			this.jPanelParametrosReportesAccionesDetallePedido.setLayout(gridaBagParametrosReportesAccionesDetallePedido);
			
			
			this.jPanelParametrosAuxiliar1DetallePedido.setLayout(gridaBagParametrosAuxiliar1DetallePedido);
			this.jPanelParametrosAuxiliar2DetallePedido.setLayout(gridaBagParametrosAuxiliar2DetallePedido);
			this.jPanelParametrosAuxiliar3DetallePedido.setLayout(gridaBagParametrosAuxiliar3DetallePedido);
			this.jPanelParametrosAuxiliar4DetallePedido.setLayout(gridaBagParametrosAuxiliar4DetallePedido);
			//this.jPanelParametrosAuxiliar5DetallePedido.setLayout(gridaBagParametrosAuxiliar2DetallePedido);			
			
			
			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedido.add(this.jButtonRecargarInformacionDetallePedido, this.gridBagConstraintsDetallePedido);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedido.add(this.jComboBoxTiposPaginacionDetallePedido, this.gridBagConstraintsDetallePedido);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedido.add(this.jCheckBoxConAltoMaximoTablaDetallePedido, this.gridBagConstraintsDetallePedido);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedido.add(this.jComboBoxTiposArchivosReportesDetallePedido, this.gridBagConstraintsDetallePedido);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedido.add(this.jPanelParametrosAuxiliar1DetallePedido, this.gridBagConstraintsDetallePedido);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePedido.add(this.jComboBoxTiposReportesDetallePedido, this.gridBagConstraintsDetallePedido);																		
			
			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePedido.add(this.jComboBoxTiposGraficosReportesDetallePedido, this.gridBagConstraintsDetallePedido);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedido.add(this.jPanelParametrosAuxiliar4DetallePedido, this.gridBagConstraintsDetallePedido);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedido.add(this.jComboBoxTiposReportesDetallePedido, this.gridBagConstraintsDetallePedido);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedido.add(this.jCheckBoxGenerarReporteDetallePedido, this.gridBagConstraintsDetallePedido);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedido.add(this.jPanelParametrosAuxiliar2DetallePedido, this.gridBagConstraintsDetallePedido);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedido.add(this.jLabelAccionesDetallePedido, this.gridBagConstraintsDetallePedido);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePedido = new GridBagConstraints();
				this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePedido.add(this.jButtonAbrirOrderByDetallePedido, this.gridBagConstraintsDetallePedido);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedido.add(this.jComboBoxTiposSeleccionarDetallePedido, this.gridBagConstraintsDetallePedido);			
			
			
			/*
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedido.add(this.jCheckBoxSeleccionarTodosDetallePedido, this.gridBagConstraintsDetallePedido);
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedido.add(this.jCheckBoxConGraficoReporteDetallePedido, this.gridBagConstraintsDetallePedido);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedido.add(this.jCheckBoxSeleccionarTodosDetallePedido, this.gridBagConstraintsDetallePedido);															
				
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedido.add(this.jCheckBoxSeleccionadosDetallePedido, this.gridBagConstraintsDetallePedido);															
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedido.add(this.jCheckBoxConGraficoReporteDetallePedido, this.gridBagConstraintsDetallePedido);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedido.add(this.jPanelParametrosAuxiliar3DetallePedido, this.gridBagConstraintsDetallePedido);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedido.add(this.jComboBoxTiposAccionesDetallePedido, this.gridBagConstraintsDetallePedido);
	
				
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedido.add(this.jTextFieldValorCampoGeneralDetallePedido, this.gridBagConstraintsDetallePedido);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePedido = new GridBagLayout();

			this.jScrollPanelDatosDetallePedido.setLayout(gridaBagLayoutDatosDetallePedido);
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = 0;
			this.gridBagConstraintsDetallePedido.gridx = 0;
			
			this.jScrollPanelDatosDetallePedido.add(this.jTableDatosDetallePedido, this.gridBagConstraintsDetallePedido);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePedido.setViewportView(this.jTableDatosDetallePedido);
		this.jTableDatosDetallePedido.setFillsViewportHeight(true);
		this.jTableDatosDetallePedido.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetallePedidoTotales.setViewportView(this.jTableDatosDetallePedidoTotales);
		//this.jTableDatosDetallePedidoTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetallePedidoTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePedido= new GridBagLayout();
		this.jPanelAccionesDetallePedido.setLayout(gridaBagLayoutAccionesDetallePedido);
		
		
		/*	
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = 0;
		this.gridBagConstraintsDetallePedido.gridx = 0;
			
		this.jPanelAccionesDetallePedido.add(this.jButtonNuevoDetallePedido, this.gridBagConstraintsDetallePedido);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetallePedido= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetallePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetallePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetallePedido.setLayout(gridaBagLayoutFK_IdBodegaDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 0;
		jPanelFK_IdBodegaDetallePedido.add(jLabelid_bodegaFK_IdBodegaDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 1;
		jPanelFK_IdBodegaDetallePedido.add(jComboBoxid_bodegaFK_IdBodegaDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 1;
		gridBagConstraintsDetallePedido.gridx =1;
		jPanelFK_IdBodegaDetallePedido.add(jButtonFK_IdBodegaDetallePedido, gridBagConstraintsDetallePedido);

		jTabbedPaneBusquedasDetallePedido.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetallePedido);
		jTabbedPaneBusquedasDetallePedido.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetallePedidoDetallePedido= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetallePedidoDetallePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetallePedidoDetallePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetallePedidoDetallePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetallePedidoDetallePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetallePedidoDetallePedido.setLayout(gridaBagLayoutFK_IdEstadoDetallePedidoDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 0;
		jPanelFK_IdEstadoDetallePedidoDetallePedido.add(jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 1;
		jPanelFK_IdEstadoDetallePedidoDetallePedido.add(jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 1;
		gridBagConstraintsDetallePedido.gridx =1;
		jPanelFK_IdEstadoDetallePedidoDetallePedido.add(jButtonFK_IdEstadoDetallePedidoDetallePedido, gridBagConstraintsDetallePedido);

		jTabbedPaneBusquedasDetallePedido.addTab("2.-Por Estado ", jPanelFK_IdEstadoDetallePedidoDetallePedido);
		jTabbedPaneBusquedasDetallePedido.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPedidoDetallePedido= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoDetallePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoDetallePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoDetallePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoDetallePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoDetallePedido.setLayout(gridaBagLayoutFK_IdPedidoDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 0;
		jPanelFK_IdPedidoDetallePedido.add(jLabelid_pedidoFK_IdPedidoDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 1;
		jPanelFK_IdPedidoDetallePedido.add(jComboBoxid_pedidoFK_IdPedidoDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 1;
		gridBagConstraintsDetallePedido.gridx =1;
		jPanelFK_IdPedidoDetallePedido.add(jButtonFK_IdPedidoDetallePedido, gridBagConstraintsDetallePedido);

		jTabbedPaneBusquedasDetallePedido.addTab("3.-Por Pedido ", jPanelFK_IdPedidoDetallePedido);
		jTabbedPaneBusquedasDetallePedido.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoDetallePedido= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetallePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetallePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetallePedido.setLayout(gridaBagLayoutFK_IdProductoDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 0;
		jPanelFK_IdProductoDetallePedido.add(jLabelid_productoFK_IdProductoDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 1;
		jPanelFK_IdProductoDetallePedido.add(jComboBoxid_productoFK_IdProductoDetallePedido, gridBagConstraintsDetallePedido);


		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 0;
		jPanelFK_IdProductoDetallePedido.add(this.jButtonBuscarFK_IdProductoid_productoDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 1;
		gridBagConstraintsDetallePedido.gridx =1;
		jPanelFK_IdProductoDetallePedido.add(jButtonFK_IdProductoDetallePedido, gridBagConstraintsDetallePedido);

		jTabbedPaneBusquedasDetallePedido.addTab("4.-Por Producto ", jPanelFK_IdProductoDetallePedido);
		jTabbedPaneBusquedasDetallePedido.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetallePedido= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetallePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetallePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetallePedido.setLayout(gridaBagLayoutFK_IdUnidadDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 0;
		jPanelFK_IdUnidadDetallePedido.add(jLabelid_unidadFK_IdUnidadDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 0;
		gridBagConstraintsDetallePedido.gridx = 1;
		jPanelFK_IdUnidadDetallePedido.add(jComboBoxid_unidadFK_IdUnidadDetallePedido, gridBagConstraintsDetallePedido);

		gridBagConstraintsDetallePedido = new GridBagConstraints();
		gridBagConstraintsDetallePedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedido.gridy = 1;
		gridBagConstraintsDetallePedido.gridx =1;
		jPanelFK_IdUnidadDetallePedido.add(jButtonFK_IdUnidadDetallePedido, gridBagConstraintsDetallePedido);

		jTabbedPaneBusquedasDetallePedido.addTab("5.-Por Unidad ", jPanelFK_IdUnidadDetallePedido);
		jTabbedPaneBusquedasDetallePedido.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedido);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedido.gridx = 0;		
			//this.gridBagConstraintsDetallePedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedido.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePedido, this.gridBagConstraintsDetallePedido);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePedido.gridx = 0;		
		//this.gridBagConstraintsDetallePedido.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePedido.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePedido);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedido.gridx = 0;		
			this.gridBagConstraintsDetallePedido.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePedido.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePedido, this.gridBagConstraintsDetallePedido);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePedido, this.gridBagConstraintsDetallePedido);								
		
		
		/*
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePedido, this.gridBagConstraintsDetallePedido);
		*/		
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedido.gridx =0;
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedido, this.gridBagConstraintsDetallePedido);
				
		//this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetallePedido.gridx =0;
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetallePedido.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetallePedidoTotales/*this.jTableDatosDetallePedidoTotales*/, this.gridBagConstraintsDetallePedido);				
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePedido, this.gridBagConstraintsDetallePedido);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePedidoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedido = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePedido.setLayout(gridaBagLayoutBusquedasParametrosDetallePedido);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedido, this.gridBagConstraintsDetallePedido);
			
			
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedido, this.gridBagConstraintsDetallePedido);
		
			
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedido, this.gridBagConstraintsDetallePedido);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePedido;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePedido() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePedido = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePedido.setName("jPanelReporteDinamicoDetallePedido"); 
		
		this.jPanelReporteDinamicoDetallePedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePedido.setLayout(gridaBagLayoutReporteDinamicoDetallePedido);
		
		
		this.jInternalFrameReporteDinamicoDetallePedido= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePedido.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePedido.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePedido.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePedido.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePedido.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePedido = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePedido.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedido.add(this.jLabelColumnasSelectReporteDetallePedido, this.gridBagConstraintsDetallePedido);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePedido = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePedido=new JScrollPane(this.jListColumnasSelectReporteDetallePedido);
			
			this.jScrollColumnasSelectReporteDetallePedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePedido.add(this.jListColumnasSelectReporteDetallePedido, this.gridBagConstraintsDetallePedido);
		this.jPanelReporteDinamicoDetallePedido.add(this.jScrollColumnasSelectReporteDetallePedido, this.gridBagConstraintsDetallePedido);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePedido = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePedido.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePedido = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePedido.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedido.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePedido=new JScrollPane(this.jListRelacionesSelectReporteDetallePedido);
			
			this.jScrollRelacionesSelectReporteDetallePedido.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedido.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedido.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePedido = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePedido = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePedido = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePedido = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedido = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedido.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePedido = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePedido.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedido.add(this.jLabelConGraficoDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePedido.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePedido.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedido.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedido.add(this.jCheckBoxConGraficoDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePedido = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePedido.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedido.add(this.jLabelColumnaCategoriaGraficoDetallePedido, this.gridBagConstraintsDetallePedido);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePedido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedido.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePedido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePedido.add(this.jComboBoxColumnaCategoriaGraficoDetallePedido, this.gridBagConstraintsDetallePedido);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePedido = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePedido.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedido.add(this.jLabelColumnaCategoriaValorDetallePedido, this.gridBagConstraintsDetallePedido);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePedido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePedido.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePedido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePedido.add(this.jComboBoxColumnaCategoriaValorDetallePedido, this.gridBagConstraintsDetallePedido);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePedido = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePedido.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedido.add(this.jLabelColumnasValoresGraficoDetallePedido, this.gridBagConstraintsDetallePedido);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePedido = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePedido.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePedido=new JScrollPane(this.jListColumnasValoresGraficoDetallePedido);
			
			this.jScrollColumnasValoresGraficoDetallePedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePedido.add(this.jListColumnasSelectReporteDetallePedido, this.gridBagConstraintsDetallePedido);
		this.jPanelReporteDinamicoDetallePedido.add(this.jScrollColumnasValoresGraficoDetallePedido, this.gridBagConstraintsDetallePedido);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePedido = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePedido.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedido.add(this.jLabelTiposGraficosReportesDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedido.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedido.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePedido = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePedido.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedido.add(this.jLabelGenerarExcelReporteDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePedido = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePedido.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePedido,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePedido.setToolTipText("Generar EXCEL"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePedido.add(this.jButtonGenerarExcelReporteDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedido.add(this.jComboBoxTiposReportesDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePedido = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePedido.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedido.add(this.jLabelTiposArchivoReporteDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedido.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePedido = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePedido.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePedido,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePedido.setToolTipText("Generar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedido.add(this.jButtonGenerarReporteDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePedido = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePedido.setToolTipText("Cancelar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedido.add(this.jButtonCerrarReporteDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePedido = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePedido= new JScrollPane(jPanelReporteDinamicoDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePedido.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedido.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedido.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedido.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePedido.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePedido);
		this.jInternalFrameReporteDinamicoDetallePedido.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePedido, this.gridBagConstraintsDetallePedido);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePedido() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePedido = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePedido.setName("jPanelImportacionDetallePedido"); 
		
		this.jPanelImportacionDetallePedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePedido.setLayout(gridaBagLayoutImportacionDetallePedido);
		
		
		this.jInternalFrameImportacionDetallePedido= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePedido= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedido.setResizable(true);
	    this.jInternalFrameImportacionDetallePedido.setClosable(true);
	    this.jInternalFrameImportacionDetallePedido.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedido.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedido.setResizable(true);
	    this.jInternalFrameImportacionDetallePedido.setClosable(true);
	    this.jInternalFrameImportacionDetallePedido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePedido = new JLabelMe();

		this.jLabelArchivoImportacionDetallePedido.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedido.add(this.jLabelArchivoImportacionDetallePedido, this.gridBagConstraintsDetallePedido);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePedido = new JFileChooser();		
		this.jFileChooserImportacionDetallePedido.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePedido = new JButtonMe();
		this.jButtonAbrirImportacionDetallePedido.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePedido,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePedido.setToolTipText("Generar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedido.add(this.jButtonAbrirImportacionDetallePedido, this.gridBagConstraintsDetallePedido);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePedido = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePedido.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedido.add(this.jLabelPathArchivoImportacionDetallePedido, this.gridBagConstraintsDetallePedido);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePedido=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePedido.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedido.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedido.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedido.add(this.jTextFieldPathArchivoImportacionDetallePedido, this.gridBagConstraintsDetallePedido);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePedido = new JButtonMe();
		this.jButtonGenerarImportacionDetallePedido.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePedido,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePedido.setToolTipText("Generar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedido.add(this.jButtonGenerarImportacionDetallePedido, this.gridBagConstraintsDetallePedido);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePedido = new JButtonMe();
		this.jButtonCerrarImportacionDetallePedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePedido.setToolTipText("Cancelar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedido.add(this.jButtonCerrarImportacionDetallePedido, this.gridBagConstraintsDetallePedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePedido = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePedido= new JScrollPane(jPanelImportacionDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePedido.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePedido.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePedido);
		this.jInternalFrameImportacionDetallePedido.getContentPane().add(this.jScrollPanelImportacionDetallePedido, this.gridBagConstraintsDetallePedido);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetallePedido() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetallePedido = new JButtonMe();
		this.jButtonAbrirTotalesDetallePedido.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetallePedido,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetallePedido = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetallePedido.setName("jPanelTotalesDetallePedido"); 
		
		this.jPanelTotalesDetallePedido.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetallePedido.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetallePedido.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetallePedido.setLayout(gridaBagLayoutTotalesDetallePedido);
		
		
		this.jInternalFrameTotalesDetallePedido= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetallePedido= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetallePedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedido= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetallePedido.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetallePedido.setTitle("Totales");
	    this.jInternalFrameTotalesDetallePedido.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetallePedido.setResizable(true);
	    this.jInternalFrameTotalesDetallePedido.setClosable(true);
	    this.jInternalFrameTotalesDetallePedido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetallePedido.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetallePedido.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetallePedido.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy =iPosYTotales++;
		this.gridBagConstraintsDetallePedido.gridx =iPosXTotales;
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetallePedido.ipady =150;
		
		this.jPanelTotalesDetallePedido.add(jScrollPanelDatosDetallePedidoTotales, this.gridBagConstraintsDetallePedido);//this.jTableDatosDetallePedidoTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetallePedido = new JButtonMe();
		this.jButtonCerrarTotalesDetallePedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetallePedido,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetallePedido.setToolTipText("Cancelar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedido.gridy = iPosYTotales++;
		this.gridBagConstraintsDetallePedido.gridx = iPosXTotales;
							
		this.jPanelTotalesDetallePedido.add(this.jButtonCerrarTotalesDetallePedido, this.gridBagConstraintsDetallePedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetallePedido = new GridBagLayout();
		
		this.jScrollPanelTotalesDetallePedido= new JScrollPane(jPanelTotalesDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsDetallePedido.gridy =iPosYTotales;
		this.gridBagConstraintsDetallePedido.gridx =iPosXTotales;
		this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetallePedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetallePedido.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetallePedido);
		this.jInternalFrameTotalesDetallePedido.getContentPane().add(this.jScrollPanelTotalesDetallePedido, this.gridBagConstraintsDetallePedido);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetallePedido(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePedido = new JButtonMe();
			this.jButtonAbrirOrderByDetallePedido.setText("Orden");
			this.jButtonAbrirOrderByDetallePedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedido,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePedido";
			inputMap = this.jButtonAbrirOrderByDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePedido"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePedido = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePedido.setName("jPanelOrderByDetallePedido"); 
			
			this.jPanelOrderByDetallePedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePedido.setLayout(gridaBagLayoutOrderByDetallePedido);
			
			
			this.jTableDatosDetallePedidoOrderBy = new JTableMe();        
			this.jTableDatosDetallePedidoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePedidoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePedidoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePedidoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePedidoOrderBy.setViewportView(this.jTableDatosDetallePedidoOrderBy);
			this.jTableDatosDetallePedidoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePedidoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePedido= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePedido= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePedido = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePedido= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePedido.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePedido.setTitle("Orden");
			this.jInternalFrameOrderByDetallePedido.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePedido.setResizable(true);
			this.jInternalFrameOrderByDetallePedido.setClosable(true);
			this.jInternalFrameOrderByDetallePedido.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePedido.ipady =150;
				
			this.jPanelOrderByDetallePedido.add(jScrollPanelDatosDetallePedidoOrderBy, this.gridBagConstraintsDetallePedido);//this.jTableDatosDetallePedidoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePedido = new JButtonMe();
			this.jButtonCerrarOrderByDetallePedido.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePedido,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePedido.setToolTipText("Cancelar"+" "+DetallePedidoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedido.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePedido.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePedido.add(this.jButtonCerrarOrderByDetallePedido, this.gridBagConstraintsDetallePedido);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePedido = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePedido= new JScrollPane(jPanelOrderByDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsDetallePedido.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedido.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePedido.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePedido);
			
			this.jInternalFrameOrderByDetallePedido.getContentPane().add(this.jScrollPanelOrderByDetallePedido, this.gridBagConstraintsDetallePedido);			
		
		} else {
			this.jButtonAbrirOrderByDetallePedido = new JButtonMe();
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
		int iWidthTableCalculado=0;//3530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallepedidoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetallePedido.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePedido.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePedido.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetallePedido.getRowHeight();//DetallePedidoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedido.isSelected()) {
					iHeightTable=DetallePedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedido.isSelected()) {
					iHeightTable=DetallePedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePedido.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedido.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedido.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetallePedido!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetallePedido.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetallePedido.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetallePedido.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetallePedido.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetallePedido.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetallePedido.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetallePedido.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePedido!=null && this.jInternalFrameOrderByDetallePedido.getjTableDatosOrderBy()!=null) {
			//if(!this.detallepedidoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePedido.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePedido.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePedido.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePedido.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePedido.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePedido.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePedido.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
	
	public void redimensionarTablaTotales() {
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetallePedido!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetallePedido.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetallePedido.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetallePedido.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetallePedido.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetallePedido.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetallePedido.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetallePedido.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepedidoLogic.getDetallePedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepedidos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePedido> TraerDetallePedidoBeans(List<DetallePedido> detallepedidos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePedido detallepedido:detallepedidos) {
					
				if(!(DetallePedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallepedido.setsDetalleGeneralEntityReporte(DetallePedidoConstantesFunciones.getDetallePedidoDescripcion(detallepedido));
										
						
					
						
					
				} else  {
							
					//detallepedido.setsDetalleGeneralEntityReporte(detallepedido.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallepedidobeans.add(detallepedidobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallepedidos;
    }
	//PARA REPORTES FIN
}
