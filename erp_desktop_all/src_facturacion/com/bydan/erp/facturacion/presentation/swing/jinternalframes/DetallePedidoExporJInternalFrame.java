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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.DetallePedidoExporConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class DetallePedidoExporJInternalFrame extends DetallePedidoExporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePedidoExpor;
	
	protected JMenuBar jmenuBarDetallePedidoExpor;
	
	protected JMenu jmenuDetallePedidoExpor;
	protected JMenu jmenuDatosDetallePedidoExpor;
	protected JMenu jmenuArchivoDetallePedidoExpor;
	protected JMenu jmenuAccionesDetallePedidoExpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedidoExpor;	
	protected GridBagConstraints gridBagConstraintsDetallePedidoExpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePedidoExporDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePedidoExpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePedidoExpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePedidoExpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

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

	protected PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidoexpor="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EstadoDetallePedidoBeanSwingJInternalFrame estadodetallepedidoexporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallepedidoexpor="";
	
	public DetallePedidoExporSessionBean detallepedidoexporSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public PedidoExporSessionBean pedidoexporSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EstadoDetallePedidoSessionBean estadodetallepedidoexporSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePedidoExpor> detallepedidoexpors;		
	public List<DetallePedidoExpor> detallepedidoexporsEliminados;	
	public List<DetallePedidoExpor> detallepedidoexporsAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetallePedidoExpor;		
	protected JButton jButtonAbrirTotalesDetallePedidoExpor;		
	
	/*
	protected JPanel jPanelTotalesDetallePedidoExpor;
	public JScrollPane jScrollPanelTotalesDetallePedidoExpor;	
	protected JButton jButtonCerrarTotalesDetallePedidoExpor;
	*/
	
	public List<DetallePedidoExpor> detallepedidoexporsTotal= new ArrayList<DetallePedidoExpor>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePedidoExpor;		
	protected JButton jButtonAbrirOrderByDetallePedidoExpor;
	
	
	//protected JPanel jPanelOrderByDetallePedidoExpor;
	//public JScrollPane jScrollPanelOrderByDetallePedidoExpor;	
	//protected JButton jButtonCerrarOrderByDetallePedidoExpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePedidoExporLogic detallepedidoexporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePedidoExpor;
	public JScrollPane jScrollPanelDatosEdicionDetallePedidoExpor;
	public JScrollPane jScrollPanelDatosGeneralDetallePedidoExpor;
    //public JScrollPane jScrollPanelDatosDetallePedidoExporTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetallePedidoExporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePedidoExpor;
	//public JScrollPane jScrollPanelImportacionDetallePedidoExpor;
	
	
	
	protected JPanel jPanelAccionesDetallePedidoExpor;
	
    protected JPanel jPanelPaginacionDetallePedidoExpor;
    protected JPanel jPanelParametrosReportesDetallePedidoExpor;
	protected JPanel jPanelParametrosReportesAccionesDetallePedidoExpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePedidoExpor;
	protected JPanel jPanelParametrosAuxiliar2DetallePedidoExpor;
	protected JPanel jPanelParametrosAuxiliar3DetallePedidoExpor;
	protected JPanel jPanelParametrosAuxiliar4DetallePedidoExpor;
	//protected JPanel jPanelParametrosAuxiliar5DetallePedidoExpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePedidoExpor;
	//protected JPanel jPanelImportacionDetallePedidoExpor;
	
	
	public JTable jTableDatosDetallePedidoExpor;
	//public JTable jTableDatosDetallePedidoExporTotales;
	
	
	//public JTable jTableDatosDetallePedidoExporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePedidoExpor;
	protected JButton jButtonDuplicarDetallePedidoExpor;
	protected JButton jButtonCopiarDetallePedidoExpor;
	protected JButton jButtonVerFormDetallePedidoExpor;
	protected JButton jButtonNuevoRelacionesDetallePedidoExpor;
	protected JButton jButtonModificarDetallePedidoExpor;
	
    protected JButton jButtonGuardarCambiosTablaDetallePedidoExpor;
	protected JButton jButtonCerrarDetallePedidoExpor;
	
	
	protected JButton jButtonRecargarInformacionDetallePedidoExpor;
	protected JButton jButtonProcesarInformacionDetallePedidoExpor;
	
	
	protected JButton jButtonAnterioresDetallePedidoExpor;
	protected JButton jButtonSiguientesDetallePedidoExpor;
	protected JButton jButtonNuevoGuardarCambiosDetallePedidoExpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePedidoExpor;
	//protected JButton jButtonCerrarReporteDinamicoDetallePedidoExpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePedidoExpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePedidoExpor;
	//protected JButton jButtonGenerarImportacionDetallePedidoExpor;
	//protected JButton jButtonCerrarImportacionDetallePedidoExpor;
	//protected JFileChooser jFileChooserImportacionDetallePedidoExpor;
	//protected File fileImportacionDetallePedidoExpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedidoExpor;
	protected JButton jButtonDuplicarToolBarDetallePedidoExpor;
	protected JButton jButtonNuevoRelacionesToolBarDetallePedidoExpor;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePedidoExpor;
	protected JButton jButtonCopiarToolBarDetallePedidoExpor;
	protected JButton jButtonVerFormToolBarDetallePedidoExpor;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePedidoExpor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedidoExpor;
	protected JButton jButtonCerrarToolBarDetallePedidoExpor;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePedidoExpor;
	protected JButton jButtonProcesarInformacionToolBarDetallePedidoExpor;
	protected JButton jButtonAnterioresToolBarDetallePedidoExpor;
	protected JButton jButtonSiguientesToolBarDetallePedidoExpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePedidoExpor;
	protected JButton jButtonAbrirOrderByToolBarDetallePedidoExpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedidoExpor;
	protected JMenuItem jMenuItemDuplicarDetallePedidoExpor;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePedidoExpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePedidoExpor;
	protected JMenuItem jMenuItemCopiarDetallePedidoExpor;
	protected JMenuItem jMenuItemVerFormDetallePedidoExpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedidoExpor;
	protected JMenuItem jMenuItemCerrarDetallePedidoExpor;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedidoExpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePedidoExpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedidoExpor;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePedidoExpor;
	protected JMenuItem jMenuItemProcesarInformacionDetallePedidoExpor;
	protected JMenuItem jMenuItemAnterioresDetallePedidoExpor;
	protected JMenuItem jMenuItemSiguientesDetallePedidoExpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedidoExpor;
	protected JMenuItem jMenuItemAbrirOrderByDetallePedidoExpor;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedidoExpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedidoExpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePedidoExpor;
	protected JCheckBox jCheckBoxSeleccionadosDetallePedidoExpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePedidoExpor;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePedidoExpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePedidoExpor;
	protected JTextField jTextFieldValorCampoGeneralDetallePedidoExpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePedidoExpor;
	//public JList<Reporte> jListColumnasSelectReporteDetallePedidoExpor;
	//public JScrollPane jScrollColumnasSelectReporteDetallePedidoExpor;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePedidoExpor;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePedidoExpor;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePedidoExpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePedidoExpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePedidoExpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePedidoExpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePedidoExpor;
	
		
	//public JLabel jLabelArchivoImportacionDetallePedidoExpor;	
	//public JLabel jLabelPathArchivoImportacionDetallePedidoExpor;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePedidoExpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePedidoExpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePedidoExpor;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePedidoExpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePedidoExpor;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePedidoExpor;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePedidoExpor;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePedidoExpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePedidoExpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePedidoExpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePedidoExpor;
	public JPanel jPanelFK_IdBodegaDetallePedidoExpor;
	public JButton jButtonFK_IdBodegaDetallePedidoExpor;
	public JPanel jPanelFK_IdEstadoDetallePedidoExporDetallePedidoExpor;
	public JButton jButtonFK_IdEstadoDetallePedidoExporDetallePedidoExpor;
	public JPanel jPanelFK_IdPedidoExporDetallePedidoExpor;
	public JButton jButtonFK_IdPedidoExporDetallePedidoExpor;
	public JPanel jPanelFK_IdProductoDetallePedidoExpor;
	public JButton jButtonFK_IdProductoDetallePedidoExpor;
	public JPanel jPanelFK_IdUnidadDetallePedidoExpor;
	public JButton jButtonFK_IdUnidadDetallePedidoExpor;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetallePedidoExpor;
	public JLabel jLabelid_bodegaFK_IdBodegaDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetallePedidoExpor;
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor;
	public JLabel jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor;
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor;
	public JLabel jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_exporFK_IdPedidoExporDetallePedidoExpor;
	public JButton jButtonid_pedido_exporFK_IdPedidoExporDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_pedido_exporFK_IdPedidoExporDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_pedido_exporFK_IdPedidoExporDetallePedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetallePedidoExpor;
	public JLabel jLabelid_productoFK_IdProductoDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetallePedidoExpor;
	public JButton jButtonid_productoFK_IdProductoDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoExporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetallePedidoExpor;
	public JLabel jLabelid_unidadFK_IdUnidadDetallePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetallePedidoExpor;
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoExpor= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoExporBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetallePedidoExporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoExporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoExporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoExporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePedidoExpor)	{
		this.jButtonRecargarInformacionDetallePedidoExpor = jButtonRecargarInformacionDetallePedidoExpor;
	}
	
	public JButton getjButtonProcesarInformacionDetallePedidoExpor() {
		return this.jButtonProcesarInformacionDetallePedidoExpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedidoExpor)	{
		this.jButtonProcesarInformacionDetallePedidoExpor = jButtonProcesarInformacionDetallePedidoExpor;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePedidoExpor() {
		return this.jButtonRecargarInformacionDetallePedidoExpor;
	}
	
	
	public List<DetallePedidoExpor> getdetallepedidoexpors() {
		return this.detallepedidoexpors;
	}

	public void setdetallepedidoexpors(List<DetallePedidoExpor> detallepedidoexpors) {
		this.detallepedidoexpors = detallepedidoexpors;
	}
	
	public List<DetallePedidoExpor> getdetallepedidoexporsAux() {
		return this.detallepedidoexporsAux;
	}

	public void setdetallepedidoexporsAux(List<DetallePedidoExpor> detallepedidoexporsAux) {
		this.detallepedidoexporsAux = detallepedidoexporsAux;
	}
	
	public List<DetallePedidoExpor> getdetallepedidoexporsEliminados() {
		return this.detallepedidoexporsEliminados;
	}

	public void setDetallePedidoExporsEliminados(List<DetallePedidoExpor> detallepedidoexporsEliminados) {
		this.detallepedidoexporsEliminados = detallepedidoexporsEliminados;
	}
	
	public List<DetallePedidoExpor> getdetallepedidoexporsTotal() {
		return this.detallepedidoexporsTotal;
	}

	public void setdetallepedidoexporsTotal(List<DetallePedidoExpor> detallepedidoexporsTotal) {
		this.detallepedidoexporsTotal = detallepedidoexporsTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePedidoExpor() {
		return jComboBoxTiposSeleccionarDetallePedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePedidoExpor(
			JComboBox jComboBoxTiposSeleccionarDetallePedidoExpor) {
		this.jComboBoxTiposSeleccionarDetallePedidoExpor = jComboBoxTiposSeleccionarDetallePedidoExpor;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePedidoExpor() {
		return jTextFieldValorCampoGeneralDetallePedidoExpor;
	}

	public void setjTextFieldValorCampoGeneralDetallePedidoExpor(
			JTextField jTextFieldValorCampoGeneralDetallePedidoExpor) {
		this.jTextFieldValorCampoGeneralDetallePedidoExpor = jTextFieldValorCampoGeneralDetallePedidoExpor;
	}

	public void setBorderResaltarValorCampoGeneralDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePedidoExpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePedidoExpor() {
		return this.jCheckBoxSeleccionarTodosDetallePedidoExpor;
	}

	public void setjCheckBoxSeleccionarTodosDetallePedidoExpor(
			JCheckBox jCheckBoxSeleccionarTodosDetallePedidoExpor) {
		this.jCheckBoxSeleccionarTodosDetallePedidoExpor = jCheckBoxSeleccionarTodosDetallePedidoExpor;
	}

	public void setBorderResaltarSeleccionarTodosDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePedidoExpor() {
		return this.jCheckBoxSeleccionadosDetallePedidoExpor;
	}

	public void setjCheckBoxSeleccionadosDetallePedidoExpor(
			JCheckBox jCheckBoxSeleccionadosDetallePedidoExpor) {
		this.jCheckBoxSeleccionadosDetallePedidoExpor = jCheckBoxSeleccionadosDetallePedidoExpor;
	}
	
	public void setBorderResaltarSeleccionadosDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePedidoExpor() {
		return this.jComboBoxTiposArchivosReportesDetallePedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePedidoExpor(
			JComboBox jComboBoxTiposArchivosReportesDetallePedidoExpor) {
		this.jComboBoxTiposArchivosReportesDetallePedidoExpor = jComboBoxTiposArchivosReportesDetallePedidoExpor;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePedidoExpor() {
		return this.jComboBoxTiposReportesDetallePedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePedidoExpor(
			JComboBox jComboBoxTiposReportesDetallePedidoExpor) {
		this.jComboBoxTiposReportesDetallePedidoExpor = jComboBoxTiposReportesDetallePedidoExpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePedidoExpor() {
	//	return jComboBoxTiposReportesDinamicoDetallePedidoExpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePedidoExpor(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePedidoExpor) {
	//	this.jComboBoxTiposReportesDinamicoDetallePedidoExpor = jComboBoxTiposReportesDinamicoDetallePedidoExpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor = jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor;
	//}
	
	public void setBorderResaltarTiposReportesDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePedidoExpor() {
		return this.jComboBoxTiposGraficosReportesDetallePedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePedidoExpor(
			JComboBox jComboBoxTiposGraficosReportesDetallePedidoExpor) {
		this.jComboBoxTiposGraficosReportesDetallePedidoExpor = jComboBoxTiposGraficosReportesDetallePedidoExpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePedidoExpor() {
		return this.jComboBoxTiposPaginacionDetallePedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePedidoExpor(
			JComboBox jComboBoxTiposPaginacionDetallePedidoExpor) {
		this.jComboBoxTiposPaginacionDetallePedidoExpor = jComboBoxTiposPaginacionDetallePedidoExpor;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePedidoExpor() {
		return this.jComboBoxTiposRelacionesDetallePedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedidoExpor() {
		return this.jComboBoxTiposAccionesDetallePedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedidoExpor(
			JComboBox jComboBoxTiposRelacionesDetallePedidoExpor) {
		this.jComboBoxTiposRelacionesDetallePedidoExpor = jComboBoxTiposRelacionesDetallePedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedidoExpor(
			JComboBox jComboBoxTiposAccionesDetallePedidoExpor) {
		this.jComboBoxTiposAccionesDetallePedidoExpor = jComboBoxTiposAccionesDetallePedidoExpor;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePedidoExpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePedidoExpor() {
	//	return jCheckBoxConGraficoDinamicoDetallePedidoExpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePedidoExpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePedidoExpor) {
	//	this.jCheckBoxConGraficoDinamicoDetallePedidoExpor = jCheckBoxConGraficoDinamicoDetallePedidoExpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePedidoExpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePedidoExpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePedidoExpor .setBorder(borderResaltar);		
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
		this.detallepedidoexporSessionBean=new DetallePedidoExporSessionBean();
		
		this.detallepedidoexporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidoexporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidoexporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoExporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido Exportacion MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoExpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"nuevo","nuevo","Nuevo"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"duplicar","duplicar","Duplicar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"copiar","copiar","Copiar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"ver_form","ver_form","Ver"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"recargar","recargar","Recargar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"cerrar","cerrar","Salir"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePedidoExpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePedidoExpor;
			
				this.jButtonProcesarInformacionToolBarDetallePedidoExpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePedidoExpor;
				
		//protected JButton jButtonModificarToolBarDetallePedidoExpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePedidoExpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePedidoExpor=new JMenuMe("General");
		this.jmenuArchivoDetallePedidoExpor=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePedidoExpor=new JMenuMe("Acciones");
		this.jmenuDatosDetallePedidoExpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedidoExpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedidoExpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedidoExpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePedidoExpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePedidoExpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePedidoExpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePedidoExpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePedidoExpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePedidoExpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePedidoExpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedidoExpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedidoExpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePedidoExpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePedidoExpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePedidoExpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePedidoExpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePedidoExpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePedidoExpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePedidoExpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePedidoExpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePedidoExpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedidoExpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedidoExpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedidoExpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePedidoExpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePedidoExpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePedidoExpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePedidoExpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePedidoExpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePedidoExpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePedidoExpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePedidoExpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePedidoExpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePedidoExpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePedidoExpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePedidoExpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePedidoExpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePedidoExpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePedidoExpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedidoExpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedidoExpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedidoExpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePedidoExpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePedidoExpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePedidoExpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedidoExpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedidoExpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedidoExpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePedidoExpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePedidoExpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePedidoExpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePedidoExpor.add(this.jMenuItemCerrarDetallePedidoExpor);
			
			this.jmenuAccionesDetallePedidoExpor.add(this.jMenuItemNuevoDetallePedidoExpor);
			this.jmenuAccionesDetallePedidoExpor.add(this.jMenuItemNuevoGuardarCambiosDetallePedidoExpor);
			this.jmenuAccionesDetallePedidoExpor.add(this.jMenuItemNuevoRelacionesDetallePedidoExpor);
			this.jmenuAccionesDetallePedidoExpor.add(this.jMenuItemGuardarCambiosTablaDetallePedidoExpor);		
			this.jmenuAccionesDetallePedidoExpor.add(this.jMenuItemDuplicarDetallePedidoExpor);		
			this.jmenuAccionesDetallePedidoExpor.add(this.jMenuItemCopiarDetallePedidoExpor);		
			this.jmenuAccionesDetallePedidoExpor.add(this.jMenuItemVerFormDetallePedidoExpor);		
			
			this.jmenuDatosDetallePedidoExpor.add(this.jMenuItemRecargarInformacionDetallePedidoExpor);				
			this.jmenuDatosDetallePedidoExpor.add(this.jMenuItemAnterioresDetallePedidoExpor);				
			this.jmenuDatosDetallePedidoExpor.add(this.jMenuItemSiguientesDetallePedidoExpor);				
			this.jmenuDatosDetallePedidoExpor.add(this.jMenuItemAbrirOrderByDetallePedidoExpor);				
			this.jmenuDatosDetallePedidoExpor.add(this.jMenuItemMostrarOcultarDetallePedidoExpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePedidoExpor.add(this.jMenuItemGuardarCambiosDetallePedidoExpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoExpor.add(this.jmenuArchivoDetallePedidoExpor);		
			this.jmenuBarDetallePedidoExpor.add(this.jmenuAccionesDetallePedidoExpor);		
			this.jmenuBarDetallePedidoExpor.add(this.jmenuDatosDetallePedidoExpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePedidoExpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePedidoExpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetallePedidoExpor.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetallePedidoExpor= new JButtonMe();
		this.jButtonFK_IdBodegaDetallePedidoExpor.setText("Buscar");
		this.jButtonFK_IdBodegaDetallePedidoExpor.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetallePedidoExpor,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetallePedidoExpor = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetallePedidoExpor.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetallePedidoExpor.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetallePedidoExporDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetallePedidoExporDetallePedidoExpor= new JButtonMe();
		this.jButtonFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setText("Buscar");
		this.jButtonFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetallePedidoExporDetallePedidoExpor,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetallePedidoExporDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor = new JLabelMe();
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setText("Estado :");
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setToolTipText("Estado");
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPedidoExporDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoExporDetallePedidoExpor.setToolTipText("Buscar Por Pedido Exportacion ");
		this.jButtonFK_IdPedidoExporDetallePedidoExpor= new JButtonMe();
		this.jButtonFK_IdPedidoExporDetallePedidoExpor.setText("Buscar");
		this.jButtonFK_IdPedidoExporDetallePedidoExpor.setToolTipText("Buscar Por Pedido Exportacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoExporDetallePedidoExpor,"buscar_button","Buscar Por Pedido Exportacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoExporDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor = new JLabelMe();
		jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor.setText("Pedido Exportacion :");
		jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor.setToolTipText("Pedido Exportacion");
		jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedido_exporFK_IdPedidoExporDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_pedido_exporFK_IdPedidoExporDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_exporFK_IdPedidoExporDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_exporFK_IdPedidoExporDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_exporFK_IdPedidoExporDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetallePedidoExpor.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetallePedidoExpor= new JButtonMe();
		this.jButtonFK_IdProductoDetallePedidoExpor.setText("Buscar");
		this.jButtonFK_IdProductoDetallePedidoExpor.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetallePedidoExpor,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetallePedidoExpor = new JLabelMe();
		jLabelid_productoFK_IdProductoDetallePedidoExpor.setText("Producto :");
		jLabelid_productoFK_IdProductoDetallePedidoExpor.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor.setFocusable(false);

		this.jPanelFK_IdUnidadDetallePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetallePedidoExpor.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetallePedidoExpor= new JButtonMe();
		this.jButtonFK_IdUnidadDetallePedidoExpor.setText("Buscar");
		this.jButtonFK_IdUnidadDetallePedidoExpor.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetallePedidoExpor,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetallePedidoExpor = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetallePedidoExpor.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetallePedidoExpor.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetallePedidoExpor= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetallePedidoExpor=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePedidoExpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedidoExpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedidoExpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePedidoExpor = new DetallePedidoExporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Pedido Exportacion DATOS");
			this.jInternalFrameDetalleFormDetallePedidoExpor = new DetallePedidoExporDetalleFormJInternalFrame(jDesktopPane,this.detallepedidoexporSessionBean.getConGuardarRelaciones(),this.detallepedidoexporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePedidoExpor = null;//new DetallePedidoExporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedidoExpor= new GridBagLayout();
		
		
		this.jTableDatosDetallePedidoExpor = new JTableMe();      
		
		String sToolTipDetallePedidoExpor="";
		sToolTipDetallePedidoExpor=DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedidoExpor+="(Facturacion.DetallePedidoExpor)";
		}
		
		if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedidoExpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePedidoExpor.setToolTipText(sToolTipDetallePedidoExpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePedidoExpor);
		this.jTableDatosDetallePedidoExpor.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePedidoExpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePedidoExpor.setRowSelectionAllowed(true);
		this.jTableDatosDetallePedidoExpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetallePedidoExporTotales = new JTableMe();        
		//this.jTableDatosDetallePedidoExporTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetallePedidoExporTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedidoExpor = new JButtonMe();
		this.jButtonDuplicarDetallePedidoExpor = new JButtonMe();
		this.jButtonCopiarDetallePedidoExpor = new JButtonMe();
		this.jButtonVerFormDetallePedidoExpor = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePedidoExpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoExpor = new JButtonMe();
		this.jButtonCerrarDetallePedidoExpor = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedidoExpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePedidoExpor = new JScrollPane();
		
		//this.jScrollPanelDatosDetallePedidoExporTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido Exportacion";
		
		if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Exportacions" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetallePedidoExporTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedidoExpor.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedidoExpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePedidoExpor=new ReporteDinamicoJInternalFrame(DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePedidoExpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePedidoExpor=new ImportacionJInternalFrame(DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePedidoExpor();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetallePedidoExpor = new JButtonMe();
		
		this.jButtonAbrirTotalesDetallePedidoExpor.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetallePedidoExpor,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetallePedidoExpor=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetallePedidoExpor,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetallePedidoExpor();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePedidoExpor = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePedidoExpor.setText("Orden");
		this.jButtonAbrirOrderByDetallePedidoExpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedidoExpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedidoExpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoExpor,false,this);
			
			//this.cargarOrderByDetallePedidoExpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedidoExpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoExpor,true,this);
			
			//this.cargarOrderByDetallePedidoExpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePedidoExpor.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosDetallePedidoExpor.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosDetallePedidoExpor.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosDetallePedidoExpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedidoExpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedidoExpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePedidoExpor.setText("Nuevo");
		this.jButtonDuplicarDetallePedidoExpor.setText("Duplicar");
		this.jButtonCopiarDetallePedidoExpor.setText("Copiar");
		this.jButtonVerFormDetallePedidoExpor.setText("Ver");
		this.jButtonNuevoRelacionesDetallePedidoExpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoExpor.setText("Guardar");
		this.jButtonCerrarDetallePedidoExpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedidoExpor,"nuevo_button","Nuevo",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePedidoExpor,"duplicar_button","Duplicar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePedidoExpor,"copiar_button","Copiar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePedidoExpor,"ver_form","Ver",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePedidoExpor,"nuevorelaciones_button","Nuevo Rel",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedidoExpor,"guardarcambiostabla_button","Guardar",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedidoExpor,"cerrar_button","Salir",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedidoExpor.setToolTipText("Nuevo"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePedidoExpor.setToolTipText("Duplicar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePedidoExpor.setToolTipText("Copiar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePedidoExpor.setToolTipText("Ver"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePedidoExpor.setToolTipText("Nuevo Rel"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoExpor.setToolTipText("Guardar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedidoExpor.setToolTipText("Salir"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedidoExpor";
		inputMap = this.jButtonNuevoDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedidoExpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePedidoExpor";
		inputMap = this.jButtonDuplicarDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePedidoExpor"));
		
		//COPIAR
		sMapKey = "CopiarDetallePedidoExpor";
		inputMap = this.jButtonCopiarDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePedidoExpor"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePedidoExpor";
		inputMap = this.jButtonVerFormDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePedidoExpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePedidoExpor";
		inputMap = this.jButtonNuevoRelacionesDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePedidoExpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePedidoExpor";
		inputMap = this.jButtonModificarDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePedidoExpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePedidoExpor";
		inputMap = this.jButtonCerrarDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedidoExpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedidoExpor";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedidoExpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePedidoExpor.setName("jPanelParametrosReportesDetallePedidoExpor"); 
		
		this.jPanelParametrosReportesAccionesDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePedidoExpor.setName("jPanelParametrosReportesAccionesDetallePedidoExpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePedidoExpor = new JButtonMe();
		this.jButtonRecargarInformacionDetallePedidoExpor.setText("Recargar");
		this.jButtonRecargarInformacionDetallePedidoExpor.setToolTipText("Recargar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePedidoExpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetallePedidoExpor = new JButtonMe();
		this.jButtonProcesarInformacionDetallePedidoExpor.setText("Procesar");
		this.jButtonProcesarInformacionDetallePedidoExpor.setToolTipText("Procesar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePedidoExpor.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePedidoExpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedidoExpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedidoExpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoExpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePedidoExpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoExpor.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePedidoExpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoExpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePedidoExpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePedidoExpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePedidoExpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePedidoExpor.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePedidoExpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedidoExpor.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedidoExpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePedidoExpor.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePedidoExpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePedidoExpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePedidoExpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedidoExpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedidoExpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePedidoExpor = new JLabelMe();
		
		this.jLabelAccionesDetallePedidoExpor.setText("Acciones");		
		this.jLabelAccionesDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePedidoExpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePedidoExpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePedidoExpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePedidoExpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePedidoExpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePedidoExpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePedidoExpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePedidoExpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePedidoExpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePedidoExpor = new JButtonMe();
		//this.jButtonAnterioresDetallePedidoExpor.setText("<<");
        this.jButtonAnterioresDetallePedidoExpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePedidoExpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePedidoExpor = new JButtonMe();
		//this.jButtonSiguientesDetallePedidoExpor.setText(">>");
        this.jButtonSiguientesDetallePedidoExpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePedidoExpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePedidoExpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePedidoExpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePedidoExpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePedidoExpor,"nuevoguardarcambios_button","Nue",this.detallepedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePedidoExpor";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePedidoExpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePedidoExpor";
		inputMap = this.jButtonRecargarInformacionDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePedidoExpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePedidoExpor";
		inputMap = this.jButtonSiguientesDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePedidoExpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePedidoExpor";
		inputMap = this.jButtonAnterioresDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePedidoExpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePedidoExpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePedidoExpor.setMinimumSize(new Dimension(this.getWidth(),DetallePedidoExporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoExporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePedidoExpor.setMaximumSize(new Dimension(this.getWidth(),DetallePedidoExporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoExporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePedidoExpor.setPreferredSize(new Dimension(this.getWidth(),DetallePedidoExporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoExporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePedidoExpor = new GridBagLayout();

			this.jPanelPaginacionDetallePedidoExpor.setLayout(gridaBagLayoutPaginacionDetallePedidoExpor);						
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonAnterioresDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
					
						
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
			
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonNuevoGuardarCambiosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
						
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonSiguientesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonAbrirTotalesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonNuevoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
						
			
			
			if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePedidoExpor.gridy = 1;
				this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonGuardarCambiosTablaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			}
			
			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonDuplicarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonCopiarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonVerFormDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePedidoExpor.add(this.jButtonCerrarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		
		
		this.jButtonRecargarInformacionDetallePedidoExpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedidoExpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedidoExpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePedidoExpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedidoExpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedidoExpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePedidoExpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedidoExpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedidoExpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePedidoExpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedidoExpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedidoExpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePedidoExpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedidoExpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedidoExpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePedidoExpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedidoExpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedidoExpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePedidoExpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoExpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoExpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePedidoExpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedidoExpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedidoExpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePedidoExpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedidoExpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedidoExpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePedidoExpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedidoExpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedidoExpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePedidoExpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedidoExpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedidoExpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePedidoExpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePedidoExpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePedidoExpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePedidoExpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePedidoExpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePedidoExpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePedidoExpor.setLayout(gridaBagParametrosReportesDetallePedidoExpor);
			this.jPanelParametrosReportesAccionesDetallePedidoExpor.setLayout(gridaBagParametrosReportesAccionesDetallePedidoExpor);
			
			
			this.jPanelParametrosAuxiliar1DetallePedidoExpor.setLayout(gridaBagParametrosAuxiliar1DetallePedidoExpor);
			this.jPanelParametrosAuxiliar2DetallePedidoExpor.setLayout(gridaBagParametrosAuxiliar2DetallePedidoExpor);
			this.jPanelParametrosAuxiliar3DetallePedidoExpor.setLayout(gridaBagParametrosAuxiliar3DetallePedidoExpor);
			this.jPanelParametrosAuxiliar4DetallePedidoExpor.setLayout(gridaBagParametrosAuxiliar4DetallePedidoExpor);
			//this.jPanelParametrosAuxiliar5DetallePedidoExpor.setLayout(gridaBagParametrosAuxiliar2DetallePedidoExpor);			
			
			
			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jButtonRecargarInformacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoExpor.add(this.jComboBoxTiposPaginacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoExpor.add(this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoExpor.add(this.jComboBoxTiposArchivosReportesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jPanelParametrosAuxiliar1DetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePedidoExpor.add(this.jComboBoxTiposReportesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);																		
			
			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePedidoExpor.add(this.jComboBoxTiposGraficosReportesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jPanelParametrosAuxiliar4DetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jComboBoxTiposReportesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jCheckBoxGenerarReporteDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jPanelParametrosAuxiliar2DetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jLabelAccionesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePedidoExpor.add(this.jButtonAbrirOrderByDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jComboBoxTiposSeleccionarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
			
			
			/*
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jCheckBoxSeleccionarTodosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jCheckBoxConGraficoReporteDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoExpor.add(this.jCheckBoxSeleccionarTodosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);															
				
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoExpor.add(this.jCheckBoxSeleccionadosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);															
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoExpor.add(this.jCheckBoxConGraficoReporteDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jPanelParametrosAuxiliar3DetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jComboBoxTiposAccionesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
	
				
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoExpor.add(this.jTextFieldValorCampoGeneralDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePedidoExpor = new GridBagLayout();

			this.jScrollPanelDatosDetallePedidoExpor.setLayout(gridaBagLayoutDatosDetallePedidoExpor);
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
			this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
			
			this.jScrollPanelDatosDetallePedidoExpor.add(this.jTableDatosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePedidoExpor.setViewportView(this.jTableDatosDetallePedidoExpor);
		this.jTableDatosDetallePedidoExpor.setFillsViewportHeight(true);
		this.jTableDatosDetallePedidoExpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetallePedidoExporTotales.setViewportView(this.jTableDatosDetallePedidoExporTotales);
		//this.jTableDatosDetallePedidoExporTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetallePedidoExporTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePedidoExpor= new GridBagLayout();
		this.jPanelAccionesDetallePedidoExpor.setLayout(gridaBagLayoutAccionesDetallePedidoExpor);
		
		
		/*	
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
			
		this.jPanelAccionesDetallePedidoExpor.add(this.jButtonNuevoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetallePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetallePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetallePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetallePedidoExpor.setLayout(gridaBagLayoutFK_IdBodegaDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 0;
		jPanelFK_IdBodegaDetallePedidoExpor.add(jLabelid_bodegaFK_IdBodegaDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 1;
		jPanelFK_IdBodegaDetallePedidoExpor.add(jComboBoxid_bodegaFK_IdBodegaDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 1;
		gridBagConstraintsDetallePedidoExpor.gridx =1;
		jPanelFK_IdBodegaDetallePedidoExpor.add(jButtonFK_IdBodegaDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		jTabbedPaneBusquedasDetallePedidoExpor.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetallePedidoExpor);
		jTabbedPaneBusquedasDetallePedidoExpor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetallePedidoExporDetallePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetallePedidoExporDetallePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetallePedidoExporDetallePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetallePedidoExporDetallePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetallePedidoExporDetallePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetallePedidoExporDetallePedidoExpor.setLayout(gridaBagLayoutFK_IdEstadoDetallePedidoExporDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 0;
		jPanelFK_IdEstadoDetallePedidoExporDetallePedidoExpor.add(jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 1;
		jPanelFK_IdEstadoDetallePedidoExporDetallePedidoExpor.add(jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExporDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 1;
		gridBagConstraintsDetallePedidoExpor.gridx =1;
		jPanelFK_IdEstadoDetallePedidoExporDetallePedidoExpor.add(jButtonFK_IdEstadoDetallePedidoExporDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		jTabbedPaneBusquedasDetallePedidoExpor.addTab("2.-Por Estado ", jPanelFK_IdEstadoDetallePedidoExporDetallePedidoExpor);
		jTabbedPaneBusquedasDetallePedidoExpor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPedidoExporDetallePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoExporDetallePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoExporDetallePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoExporDetallePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoExporDetallePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoExporDetallePedidoExpor.setLayout(gridaBagLayoutFK_IdPedidoExporDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 0;
		jPanelFK_IdPedidoExporDetallePedidoExpor.add(jLabelid_pedido_exporFK_IdPedidoExporDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 1;
		jPanelFK_IdPedidoExporDetallePedidoExpor.add(jComboBoxid_pedido_exporFK_IdPedidoExporDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 1;
		gridBagConstraintsDetallePedidoExpor.gridx =1;
		jPanelFK_IdPedidoExporDetallePedidoExpor.add(jButtonFK_IdPedidoExporDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		jTabbedPaneBusquedasDetallePedidoExpor.addTab("3.-Por Pedido Exportacion ", jPanelFK_IdPedidoExporDetallePedidoExpor);
		jTabbedPaneBusquedasDetallePedidoExpor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoDetallePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetallePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetallePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetallePedidoExpor.setLayout(gridaBagLayoutFK_IdProductoDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 0;
		jPanelFK_IdProductoDetallePedidoExpor.add(jLabelid_productoFK_IdProductoDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 1;
		jPanelFK_IdProductoDetallePedidoExpor.add(jComboBoxid_productoFK_IdProductoDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);


		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 0;
		jPanelFK_IdProductoDetallePedidoExpor.add(this.jButtonBuscarFK_IdProductoid_productoDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 1;
		gridBagConstraintsDetallePedidoExpor.gridx =1;
		jPanelFK_IdProductoDetallePedidoExpor.add(jButtonFK_IdProductoDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		jTabbedPaneBusquedasDetallePedidoExpor.addTab("4.-Por Producto ", jPanelFK_IdProductoDetallePedidoExpor);
		jTabbedPaneBusquedasDetallePedidoExpor.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetallePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetallePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetallePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetallePedidoExpor.setLayout(gridaBagLayoutFK_IdUnidadDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 0;
		jPanelFK_IdUnidadDetallePedidoExpor.add(jLabelid_unidadFK_IdUnidadDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 0;
		gridBagConstraintsDetallePedidoExpor.gridx = 1;
		jPanelFK_IdUnidadDetallePedidoExpor.add(jComboBoxid_unidadFK_IdUnidadDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoExpor.gridy = 1;
		gridBagConstraintsDetallePedidoExpor.gridx =1;
		jPanelFK_IdUnidadDetallePedidoExpor.add(jButtonFK_IdUnidadDetallePedidoExpor, gridBagConstraintsDetallePedidoExpor);

		jTabbedPaneBusquedasDetallePedidoExpor.addTab("5.-Por Unidad ", jPanelFK_IdUnidadDetallePedidoExpor);
		jTabbedPaneBusquedasDetallePedidoExpor.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedidoExpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedidoExpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoExpor.gridx = 0;		
			//this.gridBagConstraintsDetallePedidoExpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedidoExpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;		
		//this.gridBagConstraintsDetallePedidoExpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePedidoExpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePedidoExpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoExpor.gridx = 0;		
			this.gridBagConstraintsDetallePedidoExpor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePedidoExpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);								
		
		
		/*
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		*/		
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoExpor.gridx =0;
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedidoExpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
				
		//this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetallePedidoExpor.gridx =0;
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetallePedidoExpor.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetallePedidoExporTotales/*this.jTableDatosDetallePedidoExporTotales*/, this.gridBagConstraintsDetallePedidoExpor);				
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePedidoExporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedidoExpor = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePedidoExpor.setLayout(gridaBagLayoutBusquedasParametrosDetallePedidoExpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePedidoExpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedidoExpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoExpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoExpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
			
			
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
			
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoExpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePedidoExpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePedidoExpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePedidoExpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePedidoExpor.setName("jPanelReporteDinamicoDetallePedidoExpor"); 
		
		this.jPanelReporteDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePedidoExpor.setLayout(gridaBagLayoutReporteDinamicoDetallePedidoExpor);
		
		
		this.jInternalFrameReporteDinamicoDetallePedidoExpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePedidoExpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoExpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePedidoExpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePedidoExpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePedidoExpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePedidoExpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePedidoExpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePedidoExpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Exportacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePedidoExpor = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePedidoExpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jLabelColumnasSelectReporteDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePedidoExpor = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePedidoExpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePedidoExpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePedidoExpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedidoExpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedidoExpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePedidoExpor=new JScrollPane(this.jListColumnasSelectReporteDetallePedidoExpor);
			
			this.jScrollColumnasSelectReporteDetallePedidoExpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedidoExpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedidoExpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jListColumnasSelectReporteDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jScrollColumnasSelectReporteDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePedidoExpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePedidoExpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePedidoExpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePedidoExpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePedidoExpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePedidoExpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedidoExpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedidoExpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePedidoExpor=new JScrollPane(this.jListRelacionesSelectReporteDetallePedidoExpor);
			
			this.jScrollRelacionesSelectReporteDetallePedidoExpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedidoExpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedidoExpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePedidoExpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePedidoExpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePedidoExpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePedidoExpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePedidoExpor = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePedidoExpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jLabelConGraficoDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePedidoExpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePedidoExpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePedidoExpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jCheckBoxConGraficoDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePedidoExpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePedidoExpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jLabelColumnaCategoriaGraficoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePedidoExpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePedidoExpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jLabelColumnaCategoriaValorDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePedidoExpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePedidoExpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePedidoExpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedidoExpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedidoExpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jComboBoxColumnaCategoriaValorDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePedidoExpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePedidoExpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jLabelColumnasValoresGraficoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePedidoExpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePedidoExpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePedidoExpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePedidoExpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedidoExpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedidoExpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePedidoExpor=new JScrollPane(this.jListColumnasValoresGraficoDetallePedidoExpor);
			
			this.jScrollColumnasValoresGraficoDetallePedidoExpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedidoExpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedidoExpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jListColumnasSelectReporteDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jScrollColumnasValoresGraficoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoExpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePedidoExpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jLabelTiposGraficosReportesDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoExpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedidoExpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoExpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoExpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePedidoExpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jLabelGenerarExcelReporteDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoExpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoExpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePedidoExpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoExpor.setToolTipText("Generar EXCEL"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jButtonGenerarExcelReporteDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jComboBoxTiposReportesDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoExpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePedidoExpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jLabelTiposArchivoReporteDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePedidoExpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePedidoExpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePedidoExpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePedidoExpor.setToolTipText("Generar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jButtonGenerarReporteDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePedidoExpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePedidoExpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePedidoExpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePedidoExpor.setToolTipText("Cancelar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoExpor.add(this.jButtonCerrarReporteDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePedidoExpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePedidoExpor= new JScrollPane(jPanelReporteDinamicoDetallePedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePedidoExpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedidoExpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedidoExpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Exportacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoExpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePedidoExpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePedidoExpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePedidoExpor);
		this.jInternalFrameReporteDinamicoDetallePedidoExpor.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePedidoExpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePedidoExpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePedidoExpor.setName("jPanelImportacionDetallePedidoExpor"); 
		
		this.jPanelImportacionDetallePedidoExpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedidoExpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedidoExpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePedidoExpor.setLayout(gridaBagLayoutImportacionDetallePedidoExpor);
		
		
		this.jInternalFrameImportacionDetallePedidoExpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePedidoExpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePedidoExpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoExpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedidoExpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedidoExpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePedidoExpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedidoExpor.setResizable(true);
	    this.jInternalFrameImportacionDetallePedidoExpor.setClosable(true);
	    this.jInternalFrameImportacionDetallePedidoExpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedidoExpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedidoExpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePedidoExpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedidoExpor.setResizable(true);
	    this.jInternalFrameImportacionDetallePedidoExpor.setClosable(true);
	    this.jInternalFrameImportacionDetallePedidoExpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePedidoExpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedidoExpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedidoExpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Exportacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePedidoExpor = new JLabelMe();

		this.jLabelArchivoImportacionDetallePedidoExpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedidoExpor.add(this.jLabelArchivoImportacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePedidoExpor = new JFileChooser();		
		this.jFileChooserImportacionDetallePedidoExpor.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePedidoExpor = new JButtonMe();
		this.jButtonAbrirImportacionDetallePedidoExpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePedidoExpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePedidoExpor.setToolTipText("Generar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoExpor.add(this.jButtonAbrirImportacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePedidoExpor = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePedidoExpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedidoExpor.add(this.jLabelPathArchivoImportacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePedidoExpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePedidoExpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedidoExpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedidoExpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoExpor.add(this.jTextFieldPathArchivoImportacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePedidoExpor = new JButtonMe();
		this.jButtonGenerarImportacionDetallePedidoExpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePedidoExpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePedidoExpor.setToolTipText("Generar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoExpor.add(this.jButtonGenerarImportacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePedidoExpor = new JButtonMe();
		this.jButtonCerrarImportacionDetallePedidoExpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePedidoExpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePedidoExpor.setToolTipText("Cancelar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoExpor.add(this.jButtonCerrarImportacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePedidoExpor = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePedidoExpor= new JScrollPane(jPanelImportacionDetallePedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePedidoExpor.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePedidoExpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePedidoExpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePedidoExpor);
		this.jInternalFrameImportacionDetallePedidoExpor.getContentPane().add(this.jScrollPanelImportacionDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetallePedidoExpor() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetallePedidoExpor = new JButtonMe();
		this.jButtonAbrirTotalesDetallePedidoExpor.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetallePedidoExpor,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetallePedidoExpor = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetallePedidoExpor.setName("jPanelTotalesDetallePedidoExpor"); 
		
		this.jPanelTotalesDetallePedidoExpor.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetallePedidoExpor.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetallePedidoExpor.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetallePedidoExpor.setLayout(gridaBagLayoutTotalesDetallePedidoExpor);
		
		
		this.jInternalFrameTotalesDetallePedidoExpor= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetallePedidoExpor= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetallePedidoExpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoExpor= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetallePedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetallePedidoExpor.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetallePedidoExpor.setTitle("Totales");
	    this.jInternalFrameTotalesDetallePedidoExpor.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetallePedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetallePedidoExpor.setResizable(true);
	    this.jInternalFrameTotalesDetallePedidoExpor.setClosable(true);
	    this.jInternalFrameTotalesDetallePedidoExpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetallePedidoExpor.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetallePedidoExpor.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetallePedidoExpor.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Exportacions"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy =iPosYTotales++;
		this.gridBagConstraintsDetallePedidoExpor.gridx =iPosXTotales;
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetallePedidoExpor.ipady =150;
		
		this.jPanelTotalesDetallePedidoExpor.add(jScrollPanelDatosDetallePedidoExporTotales, this.gridBagConstraintsDetallePedidoExpor);//this.jTableDatosDetallePedidoExporTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetallePedidoExpor = new JButtonMe();
		this.jButtonCerrarTotalesDetallePedidoExpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetallePedidoExpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetallePedidoExpor.setToolTipText("Cancelar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYTotales++;
		this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXTotales;
							
		this.jPanelTotalesDetallePedidoExpor.add(this.jButtonCerrarTotalesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetallePedidoExpor = new GridBagLayout();
		
		this.jScrollPanelTotalesDetallePedidoExpor= new JScrollPane(jPanelTotalesDetallePedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoExpor.gridy =iPosYTotales;
		this.gridBagConstraintsDetallePedidoExpor.gridx =iPosXTotales;
		this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetallePedidoExpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetallePedidoExpor.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetallePedidoExpor);
		this.jInternalFrameTotalesDetallePedidoExpor.getContentPane().add(this.jScrollPanelTotalesDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetallePedidoExpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePedidoExpor = new JButtonMe();
			this.jButtonAbrirOrderByDetallePedidoExpor.setText("Orden");
			this.jButtonAbrirOrderByDetallePedidoExpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedidoExpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePedidoExpor";
			inputMap = this.jButtonAbrirOrderByDetallePedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePedidoExpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePedidoExpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePedidoExpor.setName("jPanelOrderByDetallePedidoExpor"); 
			
			this.jPanelOrderByDetallePedidoExpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedidoExpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedidoExpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePedidoExpor.setLayout(gridaBagLayoutOrderByDetallePedidoExpor);
			
			
			this.jTableDatosDetallePedidoExporOrderBy = new JTableMe();        
			this.jTableDatosDetallePedidoExporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePedidoExporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePedidoExporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePedidoExporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePedidoExporOrderBy.setViewportView(this.jTableDatosDetallePedidoExporOrderBy);
			this.jTableDatosDetallePedidoExporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePedidoExporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePedidoExpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePedidoExpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePedidoExpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePedidoExpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePedidoExpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePedidoExpor.setTitle("Orden");
			this.jInternalFrameOrderByDetallePedidoExpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePedidoExpor.setResizable(true);
			this.jInternalFrameOrderByDetallePedidoExpor.setClosable(true);
			this.jInternalFrameOrderByDetallePedidoExpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePedidoExpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedidoExpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedidoExpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Exportacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePedidoExpor.ipady =150;
				
			this.jPanelOrderByDetallePedidoExpor.add(jScrollPanelDatosDetallePedidoExporOrderBy, this.gridBagConstraintsDetallePedidoExpor);//this.jTableDatosDetallePedidoExporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePedidoExpor = new JButtonMe();
			this.jButtonCerrarOrderByDetallePedidoExpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePedidoExpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePedidoExpor.setToolTipText("Cancelar"+" "+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoExpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePedidoExpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePedidoExpor.add(this.jButtonCerrarOrderByDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePedidoExpor = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePedidoExpor= new JScrollPane(jPanelOrderByDetallePedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoExpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePedidoExpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedidoExpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePedidoExpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePedidoExpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePedidoExpor);
			
			this.jInternalFrameOrderByDetallePedidoExpor.getContentPane().add(this.jScrollPanelOrderByDetallePedidoExpor, this.gridBagConstraintsDetallePedidoExpor);			
		
		} else {
			this.jButtonAbrirOrderByDetallePedidoExpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallepedidoexporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetallePedidoExpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePedidoExpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePedidoExpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetallePedidoExpor.getRowHeight();//DetallePedidoExporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePedidoExporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor.isSelected()) {
					iHeightTable=DetallePedidoExporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoExporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoExporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePedidoExporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedidoExpor.isSelected()) {
					iHeightTable=DetallePedidoExporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoExporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoExporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePedidoExpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedidoExpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedidoExpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePedidoExpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedidoExpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedidoExpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetallePedidoExpor!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetallePedidoExpor.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetallePedidoExpor.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetallePedidoExpor.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetallePedidoExpor.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetallePedidoExpor.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetallePedidoExpor.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetallePedidoExpor.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePedidoExpor!=null && this.jInternalFrameOrderByDetallePedidoExpor.getjTableDatosOrderBy()!=null) {
			//if(!this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePedidoExpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePedidoExpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePedidoExpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePedidoExpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePedidoExpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePedidoExpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePedidoExpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePedidoExpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedidoExpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedidoExpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetallePedidoExpor!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetallePedidoExpor.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetallePedidoExpor.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetallePedidoExpor.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetallePedidoExpor.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetallePedidoExpor.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetallePedidoExpor.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetallePedidoExpor.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepedidoexporLogic.getDetallePedidoExpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepedidoexpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePedidoExpor> TraerDetallePedidoExporBeans(List<DetallePedidoExpor> detallepedidoexpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePedidoExpor detallepedidoexpor:detallepedidoexpors) {
					
				if(!(DetallePedidoExporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePedidoExporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallepedidoexpor.setsDetalleGeneralEntityReporte(DetallePedidoExporConstantesFunciones.getDetallePedidoExporDescripcion(detallepedidoexpor));
										
						
					
						
					
				} else  {
							
					//detallepedidoexpor.setsDetalleGeneralEntityReporte(detallepedidoexpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallepedidoexporbeans.add(detallepedidoexporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallepedidoexpors;
    }
	//PARA REPORTES FIN
}
