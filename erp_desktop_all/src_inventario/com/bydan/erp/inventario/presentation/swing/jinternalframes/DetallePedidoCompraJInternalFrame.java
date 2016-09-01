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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


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
import com.bydan.erp.inventario.util.DetallePedidoCompraConstantesFunciones;

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
public class DetallePedidoCompraJInternalFrame extends DetallePedidoCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePedidoCompra;
	
	protected JMenuBar jmenuBarDetallePedidoCompra;
	
	protected JMenu jmenuDetallePedidoCompra;
	protected JMenu jmenuDatosDetallePedidoCompra;
	protected JMenu jmenuArchivoDetallePedidoCompra;
	protected JMenu jmenuAccionesDetallePedidoCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedidoCompra;	
	protected GridBagConstraints gridBagConstraintsDetallePedidoCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePedidoCompraDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePedidoCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePedidoCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePedidoCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidocompra="";

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

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetallePedidoCompraSessionBean detallepedidocompraSessionBean;
		
	
	
	public PedidoCompraSessionBean pedidocompraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePedidoCompra> detallepedidocompras;		
	public List<DetallePedidoCompra> detallepedidocomprasEliminados;	
	public List<DetallePedidoCompra> detallepedidocomprasAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetallePedidoCompra;		
	protected JButton jButtonAbrirTotalesDetallePedidoCompra;		
	
	/*
	protected JPanel jPanelTotalesDetallePedidoCompra;
	public JScrollPane jScrollPanelTotalesDetallePedidoCompra;	
	protected JButton jButtonCerrarTotalesDetallePedidoCompra;
	*/
	
	public List<DetallePedidoCompra> detallepedidocomprasTotal= new ArrayList<DetallePedidoCompra>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePedidoCompra;		
	protected JButton jButtonAbrirOrderByDetallePedidoCompra;
	
	
	//protected JPanel jPanelOrderByDetallePedidoCompra;
	//public JScrollPane jScrollPanelOrderByDetallePedidoCompra;	
	//protected JButton jButtonCerrarOrderByDetallePedidoCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePedidoCompraLogic detallepedidocompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePedidoCompra;
	public JScrollPane jScrollPanelDatosEdicionDetallePedidoCompra;
	public JScrollPane jScrollPanelDatosGeneralDetallePedidoCompra;
    //public JScrollPane jScrollPanelDatosDetallePedidoCompraTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetallePedidoCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePedidoCompra;
	//public JScrollPane jScrollPanelImportacionDetallePedidoCompra;
	
	
	
	protected JPanel jPanelAccionesDetallePedidoCompra;
	
    protected JPanel jPanelPaginacionDetallePedidoCompra;
    protected JPanel jPanelParametrosReportesDetallePedidoCompra;
	protected JPanel jPanelParametrosReportesAccionesDetallePedidoCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePedidoCompra;
	protected JPanel jPanelParametrosAuxiliar2DetallePedidoCompra;
	protected JPanel jPanelParametrosAuxiliar3DetallePedidoCompra;
	protected JPanel jPanelParametrosAuxiliar4DetallePedidoCompra;
	//protected JPanel jPanelParametrosAuxiliar5DetallePedidoCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePedidoCompra;
	//protected JPanel jPanelImportacionDetallePedidoCompra;
	
	
	public JTable jTableDatosDetallePedidoCompra;
	//public JTable jTableDatosDetallePedidoCompraTotales;
	
	
	//public JTable jTableDatosDetallePedidoCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePedidoCompra;
	protected JButton jButtonDuplicarDetallePedidoCompra;
	protected JButton jButtonCopiarDetallePedidoCompra;
	protected JButton jButtonVerFormDetallePedidoCompra;
	protected JButton jButtonNuevoRelacionesDetallePedidoCompra;
	protected JButton jButtonModificarDetallePedidoCompra;
	
    protected JButton jButtonGuardarCambiosTablaDetallePedidoCompra;
	protected JButton jButtonCerrarDetallePedidoCompra;
	
	
	protected JButton jButtonRecargarInformacionDetallePedidoCompra;
	protected JButton jButtonProcesarInformacionDetallePedidoCompra;
	
	
	protected JButton jButtonAnterioresDetallePedidoCompra;
	protected JButton jButtonSiguientesDetallePedidoCompra;
	protected JButton jButtonNuevoGuardarCambiosDetallePedidoCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePedidoCompra;
	//protected JButton jButtonCerrarReporteDinamicoDetallePedidoCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePedidoCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePedidoCompra;
	//protected JButton jButtonGenerarImportacionDetallePedidoCompra;
	//protected JButton jButtonCerrarImportacionDetallePedidoCompra;
	//protected JFileChooser jFileChooserImportacionDetallePedidoCompra;
	//protected File fileImportacionDetallePedidoCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedidoCompra;
	protected JButton jButtonDuplicarToolBarDetallePedidoCompra;
	protected JButton jButtonNuevoRelacionesToolBarDetallePedidoCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePedidoCompra;
	protected JButton jButtonCopiarToolBarDetallePedidoCompra;
	protected JButton jButtonVerFormToolBarDetallePedidoCompra;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePedidoCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedidoCompra;
	protected JButton jButtonCerrarToolBarDetallePedidoCompra;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePedidoCompra;
	protected JButton jButtonProcesarInformacionToolBarDetallePedidoCompra;
	protected JButton jButtonAnterioresToolBarDetallePedidoCompra;
	protected JButton jButtonSiguientesToolBarDetallePedidoCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePedidoCompra;
	protected JButton jButtonAbrirOrderByToolBarDetallePedidoCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedidoCompra;
	protected JMenuItem jMenuItemDuplicarDetallePedidoCompra;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePedidoCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePedidoCompra;
	protected JMenuItem jMenuItemCopiarDetallePedidoCompra;
	protected JMenuItem jMenuItemVerFormDetallePedidoCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedidoCompra;
	protected JMenuItem jMenuItemCerrarDetallePedidoCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedidoCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePedidoCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedidoCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePedidoCompra;
	protected JMenuItem jMenuItemProcesarInformacionDetallePedidoCompra;
	protected JMenuItem jMenuItemAnterioresDetallePedidoCompra;
	protected JMenuItem jMenuItemSiguientesDetallePedidoCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedidoCompra;
	protected JMenuItem jMenuItemAbrirOrderByDetallePedidoCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedidoCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedidoCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePedidoCompra;
	protected JCheckBox jCheckBoxSeleccionadosDetallePedidoCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePedidoCompra;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePedidoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePedidoCompra;
	protected JTextField jTextFieldValorCampoGeneralDetallePedidoCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePedidoCompra;
	//public JList<Reporte> jListColumnasSelectReporteDetallePedidoCompra;
	//public JScrollPane jScrollColumnasSelectReporteDetallePedidoCompra;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePedidoCompra;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePedidoCompra;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePedidoCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePedidoCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePedidoCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePedidoCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePedidoCompra;
	
		
	//public JLabel jLabelArchivoImportacionDetallePedidoCompra;	
	//public JLabel jLabelPathArchivoImportacionDetallePedidoCompra;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePedidoCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePedidoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePedidoCompra;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePedidoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePedidoCompra;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePedidoCompra;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePedidoCompra;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePedidoCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePedidoCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePedidoCompra;
	public JPanel jPanelFK_IdBodegaDetallePedidoCompra;
	public JButton jButtonFK_IdBodegaDetallePedidoCompra;
	public JPanel jPanelFK_IdCentroCostoDetallePedidoCompra;
	public JButton jButtonFK_IdCentroCostoDetallePedidoCompra;
	public JPanel jPanelFK_IdPedidoCompraDetallePedidoCompra;
	public JButton jButtonFK_IdPedidoCompraDetallePedidoCompra;
	public JPanel jPanelFK_IdProductoDetallePedidoCompra;
	public JButton jButtonFK_IdProductoDetallePedidoCompra;
	public JPanel jPanelFK_IdUnidadDetallePedidoCompra;
	public JButton jButtonFK_IdUnidadDetallePedidoCompra;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetallePedidoCompra;
	public JLabel jLabelid_bodegaFK_IdBodegaDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompra;
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetallePedidoCompra;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompra;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetallePedidoCompraBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetallePedidoCompraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra;
	
	public JPanel jPanelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra;
	public JLabel jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra;
	public JButton jButtonid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_pedido_compraFK_IdPedidoCompraDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_pedido_compraFK_IdPedidoCompraDetallePedidoCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetallePedidoCompra;
	public JLabel jLabelid_productoFK_IdProductoDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetallePedidoCompra;
	public JButton jButtonid_productoFK_IdProductoDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetallePedidoCompra;
	public JLabel jLabelid_unidadFK_IdUnidadDetallePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetallePedidoCompra;
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoCompra= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoCompraBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetallePedidoCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePedidoCompra)	{
		this.jButtonRecargarInformacionDetallePedidoCompra = jButtonRecargarInformacionDetallePedidoCompra;
	}
	
	public JButton getjButtonProcesarInformacionDetallePedidoCompra() {
		return this.jButtonProcesarInformacionDetallePedidoCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedidoCompra)	{
		this.jButtonProcesarInformacionDetallePedidoCompra = jButtonProcesarInformacionDetallePedidoCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePedidoCompra() {
		return this.jButtonRecargarInformacionDetallePedidoCompra;
	}
	
	
	public List<DetallePedidoCompra> getdetallepedidocompras() {
		return this.detallepedidocompras;
	}

	public void setdetallepedidocompras(List<DetallePedidoCompra> detallepedidocompras) {
		this.detallepedidocompras = detallepedidocompras;
	}
	
	public List<DetallePedidoCompra> getdetallepedidocomprasAux() {
		return this.detallepedidocomprasAux;
	}

	public void setdetallepedidocomprasAux(List<DetallePedidoCompra> detallepedidocomprasAux) {
		this.detallepedidocomprasAux = detallepedidocomprasAux;
	}
	
	public List<DetallePedidoCompra> getdetallepedidocomprasEliminados() {
		return this.detallepedidocomprasEliminados;
	}

	public void setDetallePedidoComprasEliminados(List<DetallePedidoCompra> detallepedidocomprasEliminados) {
		this.detallepedidocomprasEliminados = detallepedidocomprasEliminados;
	}
	
	public List<DetallePedidoCompra> getdetallepedidocomprasTotal() {
		return this.detallepedidocomprasTotal;
	}

	public void setdetallepedidocomprasTotal(List<DetallePedidoCompra> detallepedidocomprasTotal) {
		this.detallepedidocomprasTotal = detallepedidocomprasTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePedidoCompra() {
		return jComboBoxTiposSeleccionarDetallePedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePedidoCompra(
			JComboBox jComboBoxTiposSeleccionarDetallePedidoCompra) {
		this.jComboBoxTiposSeleccionarDetallePedidoCompra = jComboBoxTiposSeleccionarDetallePedidoCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePedidoCompra() {
		return jTextFieldValorCampoGeneralDetallePedidoCompra;
	}

	public void setjTextFieldValorCampoGeneralDetallePedidoCompra(
			JTextField jTextFieldValorCampoGeneralDetallePedidoCompra) {
		this.jTextFieldValorCampoGeneralDetallePedidoCompra = jTextFieldValorCampoGeneralDetallePedidoCompra;
	}

	public void setBorderResaltarValorCampoGeneralDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePedidoCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePedidoCompra() {
		return this.jCheckBoxSeleccionarTodosDetallePedidoCompra;
	}

	public void setjCheckBoxSeleccionarTodosDetallePedidoCompra(
			JCheckBox jCheckBoxSeleccionarTodosDetallePedidoCompra) {
		this.jCheckBoxSeleccionarTodosDetallePedidoCompra = jCheckBoxSeleccionarTodosDetallePedidoCompra;
	}

	public void setBorderResaltarSeleccionarTodosDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePedidoCompra() {
		return this.jCheckBoxSeleccionadosDetallePedidoCompra;
	}

	public void setjCheckBoxSeleccionadosDetallePedidoCompra(
			JCheckBox jCheckBoxSeleccionadosDetallePedidoCompra) {
		this.jCheckBoxSeleccionadosDetallePedidoCompra = jCheckBoxSeleccionadosDetallePedidoCompra;
	}
	
	public void setBorderResaltarSeleccionadosDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePedidoCompra() {
		return this.jComboBoxTiposArchivosReportesDetallePedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePedidoCompra(
			JComboBox jComboBoxTiposArchivosReportesDetallePedidoCompra) {
		this.jComboBoxTiposArchivosReportesDetallePedidoCompra = jComboBoxTiposArchivosReportesDetallePedidoCompra;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePedidoCompra() {
		return this.jComboBoxTiposReportesDetallePedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePedidoCompra(
			JComboBox jComboBoxTiposReportesDetallePedidoCompra) {
		this.jComboBoxTiposReportesDetallePedidoCompra = jComboBoxTiposReportesDetallePedidoCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePedidoCompra() {
	//	return jComboBoxTiposReportesDinamicoDetallePedidoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePedidoCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePedidoCompra) {
	//	this.jComboBoxTiposReportesDinamicoDetallePedidoCompra = jComboBoxTiposReportesDinamicoDetallePedidoCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra = jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra;
	//}
	
	public void setBorderResaltarTiposReportesDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePedidoCompra() {
		return this.jComboBoxTiposGraficosReportesDetallePedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePedidoCompra(
			JComboBox jComboBoxTiposGraficosReportesDetallePedidoCompra) {
		this.jComboBoxTiposGraficosReportesDetallePedidoCompra = jComboBoxTiposGraficosReportesDetallePedidoCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePedidoCompra() {
		return this.jComboBoxTiposPaginacionDetallePedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePedidoCompra(
			JComboBox jComboBoxTiposPaginacionDetallePedidoCompra) {
		this.jComboBoxTiposPaginacionDetallePedidoCompra = jComboBoxTiposPaginacionDetallePedidoCompra;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePedidoCompra() {
		return this.jComboBoxTiposRelacionesDetallePedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedidoCompra() {
		return this.jComboBoxTiposAccionesDetallePedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedidoCompra(
			JComboBox jComboBoxTiposRelacionesDetallePedidoCompra) {
		this.jComboBoxTiposRelacionesDetallePedidoCompra = jComboBoxTiposRelacionesDetallePedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedidoCompra(
			JComboBox jComboBoxTiposAccionesDetallePedidoCompra) {
		this.jComboBoxTiposAccionesDetallePedidoCompra = jComboBoxTiposAccionesDetallePedidoCompra;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePedidoCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePedidoCompra() {
	//	return jCheckBoxConGraficoDinamicoDetallePedidoCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePedidoCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePedidoCompra) {
	//	this.jCheckBoxConGraficoDinamicoDetallePedidoCompra = jCheckBoxConGraficoDinamicoDetallePedidoCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePedidoCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePedidoCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePedidoCompra .setBorder(borderResaltar);		
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
		this.detallepedidocompraSessionBean=new DetallePedidoCompraSessionBean();
		
		this.detallepedidocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidocompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePedidoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"nuevo","nuevo","Nuevo"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"duplicar","duplicar","Duplicar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"copiar","copiar","Copiar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"ver_form","ver_form","Ver"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"recargar","recargar","Recargar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"cerrar","cerrar","Salir"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePedidoCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePedidoCompra;
			
				this.jButtonProcesarInformacionToolBarDetallePedidoCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePedidoCompra;
				
		//protected JButton jButtonModificarToolBarDetallePedidoCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePedidoCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePedidoCompra=new JMenuMe("General");
		this.jmenuArchivoDetallePedidoCompra=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePedidoCompra=new JMenuMe("Acciones");
		this.jmenuDatosDetallePedidoCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedidoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedidoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedidoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePedidoCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePedidoCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePedidoCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePedidoCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePedidoCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePedidoCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePedidoCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedidoCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedidoCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePedidoCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePedidoCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePedidoCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePedidoCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePedidoCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePedidoCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePedidoCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePedidoCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePedidoCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePedidoCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePedidoCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePedidoCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePedidoCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePedidoCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePedidoCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePedidoCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePedidoCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePedidoCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePedidoCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePedidoCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePedidoCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePedidoCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePedidoCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePedidoCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePedidoCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePedidoCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePedidoCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePedidoCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePedidoCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePedidoCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePedidoCompra.add(this.jMenuItemCerrarDetallePedidoCompra);
			
			this.jmenuAccionesDetallePedidoCompra.add(this.jMenuItemNuevoDetallePedidoCompra);
			this.jmenuAccionesDetallePedidoCompra.add(this.jMenuItemNuevoGuardarCambiosDetallePedidoCompra);
			this.jmenuAccionesDetallePedidoCompra.add(this.jMenuItemNuevoRelacionesDetallePedidoCompra);
			this.jmenuAccionesDetallePedidoCompra.add(this.jMenuItemGuardarCambiosTablaDetallePedidoCompra);		
			this.jmenuAccionesDetallePedidoCompra.add(this.jMenuItemDuplicarDetallePedidoCompra);		
			this.jmenuAccionesDetallePedidoCompra.add(this.jMenuItemCopiarDetallePedidoCompra);		
			this.jmenuAccionesDetallePedidoCompra.add(this.jMenuItemVerFormDetallePedidoCompra);		
			
			this.jmenuDatosDetallePedidoCompra.add(this.jMenuItemRecargarInformacionDetallePedidoCompra);				
			this.jmenuDatosDetallePedidoCompra.add(this.jMenuItemAnterioresDetallePedidoCompra);				
			this.jmenuDatosDetallePedidoCompra.add(this.jMenuItemSiguientesDetallePedidoCompra);				
			this.jmenuDatosDetallePedidoCompra.add(this.jMenuItemAbrirOrderByDetallePedidoCompra);				
			this.jmenuDatosDetallePedidoCompra.add(this.jMenuItemMostrarOcultarDetallePedidoCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePedidoCompra.add(this.jMenuItemGuardarCambiosDetallePedidoCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoCompra.add(this.jmenuArchivoDetallePedidoCompra);		
			this.jmenuBarDetallePedidoCompra.add(this.jmenuAccionesDetallePedidoCompra);		
			this.jmenuBarDetallePedidoCompra.add(this.jmenuDatosDetallePedidoCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePedidoCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePedidoCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetallePedidoCompra.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetallePedidoCompra= new JButtonMe();
		this.jButtonFK_IdBodegaDetallePedidoCompra.setText("Buscar");
		this.jButtonFK_IdBodegaDetallePedidoCompra.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetallePedidoCompra,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompra = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompra.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompra.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetallePedidoCompra.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetallePedidoCompra= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetallePedidoCompra.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetallePedidoCompra.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetallePedidoCompra,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra.setFocusable(false);

		this.jPanelFK_IdPedidoCompraDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoCompraDetallePedidoCompra.setToolTipText("Buscar Por Pedido Compra ");
		this.jButtonFK_IdPedidoCompraDetallePedidoCompra= new JButtonMe();
		this.jButtonFK_IdPedidoCompraDetallePedidoCompra.setText("Buscar");
		this.jButtonFK_IdPedidoCompraDetallePedidoCompra.setToolTipText("Buscar Por Pedido Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoCompraDetallePedidoCompra,"buscar_button","Buscar Por Pedido Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoCompraDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra = new JLabelMe();
		jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra.setText("Pedido Compra :");
		jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra.setToolTipText("Pedido Compra");
		jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetallePedidoCompra.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetallePedidoCompra= new JButtonMe();
		this.jButtonFK_IdProductoDetallePedidoCompra.setText("Buscar");
		this.jButtonFK_IdProductoDetallePedidoCompra.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetallePedidoCompra,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetallePedidoCompra = new JLabelMe();
		jLabelid_productoFK_IdProductoDetallePedidoCompra.setText("Producto :");
		jLabelid_productoFK_IdProductoDetallePedidoCompra.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra.setFocusable(false);

		this.jPanelFK_IdUnidadDetallePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetallePedidoCompra.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetallePedidoCompra= new JButtonMe();
		this.jButtonFK_IdUnidadDetallePedidoCompra.setText("Buscar");
		this.jButtonFK_IdUnidadDetallePedidoCompra.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetallePedidoCompra,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetallePedidoCompra = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetallePedidoCompra.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetallePedidoCompra.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetallePedidoCompra= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetallePedidoCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePedidoCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedidoCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedidoCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePedidoCompra = new DetallePedidoCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Pedido Compra DATOS");
			this.jInternalFrameDetalleFormDetallePedidoCompra = new DetallePedidoCompraDetalleFormJInternalFrame(jDesktopPane,this.detallepedidocompraSessionBean.getConGuardarRelaciones(),this.detallepedidocompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePedidoCompra = null;//new DetallePedidoCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedidoCompra= new GridBagLayout();
		
		
		this.jTableDatosDetallePedidoCompra = new JTableMe();      
		
		String sToolTipDetallePedidoCompra="";
		sToolTipDetallePedidoCompra=DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedidoCompra+="(Inventario.DetallePedidoCompra)";
		}
		
		if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedidoCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePedidoCompra.setToolTipText(sToolTipDetallePedidoCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePedidoCompra);
		this.jTableDatosDetallePedidoCompra.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePedidoCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePedidoCompra.setRowSelectionAllowed(true);
		this.jTableDatosDetallePedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetallePedidoCompraTotales = new JTableMe();        
		//this.jTableDatosDetallePedidoCompraTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetallePedidoCompraTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedidoCompra = new JButtonMe();
		this.jButtonDuplicarDetallePedidoCompra = new JButtonMe();
		this.jButtonCopiarDetallePedidoCompra = new JButtonMe();
		this.jButtonVerFormDetallePedidoCompra = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePedidoCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompra = new JButtonMe();
		this.jButtonCerrarDetallePedidoCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedidoCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePedidoCompra = new JScrollPane();
		
		//this.jScrollPanelDatosDetallePedidoCompraTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido Compra";
		
		if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetallePedidoCompraTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedidoCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePedidoCompra=new ReporteDinamicoJInternalFrame(DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePedidoCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePedidoCompra=new ImportacionJInternalFrame(DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePedidoCompra();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetallePedidoCompra = new JButtonMe();
		
		this.jButtonAbrirTotalesDetallePedidoCompra.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetallePedidoCompra,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetallePedidoCompra=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetallePedidoCompra,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetallePedidoCompra();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePedidoCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePedidoCompra.setText("Orden");
		this.jButtonAbrirOrderByDetallePedidoCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedidoCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedidoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoCompra,false,this);
			
			//this.cargarOrderByDetallePedidoCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedidoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoCompra,true,this);
			
			//this.cargarOrderByDetallePedidoCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePedidoCompra.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosDetallePedidoCompra.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosDetallePedidoCompra.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosDetallePedidoCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedidoCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedidoCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePedidoCompra.setText("Nuevo");
		this.jButtonDuplicarDetallePedidoCompra.setText("Duplicar");
		this.jButtonCopiarDetallePedidoCompra.setText("Copiar");
		this.jButtonVerFormDetallePedidoCompra.setText("Ver");
		this.jButtonNuevoRelacionesDetallePedidoCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompra.setText("Guardar");
		this.jButtonCerrarDetallePedidoCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedidoCompra,"nuevo_button","Nuevo",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePedidoCompra,"duplicar_button","Duplicar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePedidoCompra,"copiar_button","Copiar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePedidoCompra,"ver_form","Ver",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePedidoCompra,"nuevorelaciones_button","Nuevo Rel",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedidoCompra,"guardarcambiostabla_button","Guardar",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedidoCompra,"cerrar_button","Salir",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedidoCompra.setToolTipText("Nuevo"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePedidoCompra.setToolTipText("Duplicar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePedidoCompra.setToolTipText("Copiar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePedidoCompra.setToolTipText("Ver"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePedidoCompra.setToolTipText("Nuevo Rel"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompra.setToolTipText("Guardar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedidoCompra.setToolTipText("Salir"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedidoCompra";
		inputMap = this.jButtonNuevoDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedidoCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePedidoCompra";
		inputMap = this.jButtonDuplicarDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePedidoCompra"));
		
		//COPIAR
		sMapKey = "CopiarDetallePedidoCompra";
		inputMap = this.jButtonCopiarDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePedidoCompra"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePedidoCompra";
		inputMap = this.jButtonVerFormDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePedidoCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePedidoCompra";
		inputMap = this.jButtonNuevoRelacionesDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePedidoCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePedidoCompra";
		inputMap = this.jButtonModificarDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePedidoCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePedidoCompra";
		inputMap = this.jButtonCerrarDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedidoCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedidoCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedidoCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePedidoCompra.setName("jPanelParametrosReportesDetallePedidoCompra"); 
		
		this.jPanelParametrosReportesAccionesDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePedidoCompra.setName("jPanelParametrosReportesAccionesDetallePedidoCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePedidoCompra = new JButtonMe();
		this.jButtonRecargarInformacionDetallePedidoCompra.setText("Recargar");
		this.jButtonRecargarInformacionDetallePedidoCompra.setToolTipText("Recargar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePedidoCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetallePedidoCompra = new JButtonMe();
		this.jButtonProcesarInformacionDetallePedidoCompra.setText("Procesar");
		this.jButtonProcesarInformacionDetallePedidoCompra.setToolTipText("Procesar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePedidoCompra.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePedidoCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedidoCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedidoCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePedidoCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoCompra.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePedidoCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePedidoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePedidoCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePedidoCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePedidoCompra.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePedidoCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedidoCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedidoCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePedidoCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePedidoCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePedidoCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePedidoCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedidoCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedidoCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePedidoCompra = new JLabelMe();
		
		this.jLabelAccionesDetallePedidoCompra.setText("Acciones");		
		this.jLabelAccionesDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePedidoCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePedidoCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePedidoCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePedidoCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePedidoCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePedidoCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePedidoCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePedidoCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePedidoCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePedidoCompra = new JButtonMe();
		//this.jButtonAnterioresDetallePedidoCompra.setText("<<");
        this.jButtonAnterioresDetallePedidoCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePedidoCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePedidoCompra = new JButtonMe();
		//this.jButtonSiguientesDetallePedidoCompra.setText(">>");
        this.jButtonSiguientesDetallePedidoCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePedidoCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePedidoCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePedidoCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePedidoCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePedidoCompra,"nuevoguardarcambios_button","Nue",this.detallepedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePedidoCompra";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePedidoCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePedidoCompra";
		inputMap = this.jButtonRecargarInformacionDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePedidoCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePedidoCompra";
		inputMap = this.jButtonSiguientesDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePedidoCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePedidoCompra";
		inputMap = this.jButtonAnterioresDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePedidoCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePedidoCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePedidoCompra.setMinimumSize(new Dimension(this.getWidth(),DetallePedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetallePedidoCompra.setMaximumSize(new Dimension(this.getWidth(),DetallePedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetallePedidoCompra.setPreferredSize(new Dimension(this.getWidth(),DetallePedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePedidoCompra = new GridBagLayout();

			this.jPanelPaginacionDetallePedidoCompra.setLayout(gridaBagLayoutPaginacionDetallePedidoCompra);						
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonAnterioresDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
					
						
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
			
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonNuevoGuardarCambiosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
						
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonSiguientesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonAbrirTotalesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonNuevoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
						
			
			
			if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePedidoCompra.gridy = 1;
				this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonGuardarCambiosTablaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			}
			
			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonDuplicarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonCopiarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonVerFormDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePedidoCompra.add(this.jButtonCerrarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		
		
		this.jButtonRecargarInformacionDetallePedidoCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedidoCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedidoCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePedidoCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedidoCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedidoCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePedidoCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedidoCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedidoCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePedidoCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedidoCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedidoCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePedidoCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedidoCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedidoCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePedidoCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedidoCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedidoCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePedidoCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedidoCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedidoCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePedidoCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePedidoCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePedidoCompra.setLayout(gridaBagParametrosReportesDetallePedidoCompra);
			this.jPanelParametrosReportesAccionesDetallePedidoCompra.setLayout(gridaBagParametrosReportesAccionesDetallePedidoCompra);
			
			
			this.jPanelParametrosAuxiliar1DetallePedidoCompra.setLayout(gridaBagParametrosAuxiliar1DetallePedidoCompra);
			this.jPanelParametrosAuxiliar2DetallePedidoCompra.setLayout(gridaBagParametrosAuxiliar2DetallePedidoCompra);
			this.jPanelParametrosAuxiliar3DetallePedidoCompra.setLayout(gridaBagParametrosAuxiliar3DetallePedidoCompra);
			this.jPanelParametrosAuxiliar4DetallePedidoCompra.setLayout(gridaBagParametrosAuxiliar4DetallePedidoCompra);
			//this.jPanelParametrosAuxiliar5DetallePedidoCompra.setLayout(gridaBagParametrosAuxiliar2DetallePedidoCompra);			
			
			
			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jButtonRecargarInformacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoCompra.add(this.jComboBoxTiposPaginacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoCompra.add(this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoCompra.add(this.jComboBoxTiposArchivosReportesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jPanelParametrosAuxiliar1DetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePedidoCompra.add(this.jComboBoxTiposReportesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);																		
			
			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePedidoCompra.add(this.jComboBoxTiposGraficosReportesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jPanelParametrosAuxiliar4DetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jComboBoxTiposReportesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jCheckBoxGenerarReporteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jPanelParametrosAuxiliar2DetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jLabelAccionesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePedidoCompra.add(this.jButtonAbrirOrderByDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jComboBoxTiposSeleccionarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
			
			
			/*
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jCheckBoxSeleccionarTodosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jCheckBoxConGraficoReporteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoCompra.add(this.jCheckBoxSeleccionarTodosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);															
				
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoCompra.add(this.jCheckBoxSeleccionadosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);															
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoCompra.add(this.jCheckBoxConGraficoReporteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jPanelParametrosAuxiliar3DetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jComboBoxTiposAccionesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
	
				
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoCompra.add(this.jTextFieldValorCampoGeneralDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePedidoCompra = new GridBagLayout();

			this.jScrollPanelDatosDetallePedidoCompra.setLayout(gridaBagLayoutDatosDetallePedidoCompra);
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
			this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
			
			this.jScrollPanelDatosDetallePedidoCompra.add(this.jTableDatosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePedidoCompra.setViewportView(this.jTableDatosDetallePedidoCompra);
		this.jTableDatosDetallePedidoCompra.setFillsViewportHeight(true);
		this.jTableDatosDetallePedidoCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetallePedidoCompraTotales.setViewportView(this.jTableDatosDetallePedidoCompraTotales);
		//this.jTableDatosDetallePedidoCompraTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetallePedidoCompraTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePedidoCompra= new GridBagLayout();
		this.jPanelAccionesDetallePedidoCompra.setLayout(gridaBagLayoutAccionesDetallePedidoCompra);
		
		
		/*	
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
			
		this.jPanelAccionesDetallePedidoCompra.add(this.jButtonNuevoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetallePedidoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetallePedidoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedidoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedidoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetallePedidoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetallePedidoCompra.setLayout(gridaBagLayoutFK_IdBodegaDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 0;
		jPanelFK_IdBodegaDetallePedidoCompra.add(jLabelid_bodegaFK_IdBodegaDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 1;
		jPanelFK_IdBodegaDetallePedidoCompra.add(jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 1;
		gridBagConstraintsDetallePedidoCompra.gridx =1;
		jPanelFK_IdBodegaDetallePedidoCompra.add(jButtonFK_IdBodegaDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		jTabbedPaneBusquedasDetallePedidoCompra.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetallePedidoCompra);
		jTabbedPaneBusquedasDetallePedidoCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetallePedidoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetallePedidoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetallePedidoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetallePedidoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetallePedidoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetallePedidoCompra.setLayout(gridaBagLayoutFK_IdCentroCostoDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 0;
		jPanelFK_IdCentroCostoDetallePedidoCompra.add(jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 1;
		jPanelFK_IdCentroCostoDetallePedidoCompra.add(jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);


		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 0;
		jPanelFK_IdCentroCostoDetallePedidoCompra.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 1;
		gridBagConstraintsDetallePedidoCompra.gridx =1;
		jPanelFK_IdCentroCostoDetallePedidoCompra.add(jButtonFK_IdCentroCostoDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		jTabbedPaneBusquedasDetallePedidoCompra.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetallePedidoCompra);
		jTabbedPaneBusquedasDetallePedidoCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPedidoCompraDetallePedidoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoCompraDetallePedidoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoCompraDetallePedidoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoCompraDetallePedidoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoCompraDetallePedidoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoCompraDetallePedidoCompra.setLayout(gridaBagLayoutFK_IdPedidoCompraDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 0;
		jPanelFK_IdPedidoCompraDetallePedidoCompra.add(jLabelid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 1;
		jPanelFK_IdPedidoCompraDetallePedidoCompra.add(jComboBoxid_pedido_compraFK_IdPedidoCompraDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 1;
		gridBagConstraintsDetallePedidoCompra.gridx =1;
		jPanelFK_IdPedidoCompraDetallePedidoCompra.add(jButtonFK_IdPedidoCompraDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		jTabbedPaneBusquedasDetallePedidoCompra.addTab("3.-Por Pedido Compra ", jPanelFK_IdPedidoCompraDetallePedidoCompra);
		jTabbedPaneBusquedasDetallePedidoCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoDetallePedidoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetallePedidoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedidoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedidoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetallePedidoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetallePedidoCompra.setLayout(gridaBagLayoutFK_IdProductoDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 0;
		jPanelFK_IdProductoDetallePedidoCompra.add(jLabelid_productoFK_IdProductoDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 1;
		jPanelFK_IdProductoDetallePedidoCompra.add(jComboBoxid_productoFK_IdProductoDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);


		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 0;
		jPanelFK_IdProductoDetallePedidoCompra.add(this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 1;
		gridBagConstraintsDetallePedidoCompra.gridx =1;
		jPanelFK_IdProductoDetallePedidoCompra.add(jButtonFK_IdProductoDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		jTabbedPaneBusquedasDetallePedidoCompra.addTab("4.-Por Producto ", jPanelFK_IdProductoDetallePedidoCompra);
		jTabbedPaneBusquedasDetallePedidoCompra.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetallePedidoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetallePedidoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedidoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedidoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetallePedidoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetallePedidoCompra.setLayout(gridaBagLayoutFK_IdUnidadDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 0;
		jPanelFK_IdUnidadDetallePedidoCompra.add(jLabelid_unidadFK_IdUnidadDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 0;
		gridBagConstraintsDetallePedidoCompra.gridx = 1;
		jPanelFK_IdUnidadDetallePedidoCompra.add(jComboBoxid_unidadFK_IdUnidadDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompra.gridy = 1;
		gridBagConstraintsDetallePedidoCompra.gridx =1;
		jPanelFK_IdUnidadDetallePedidoCompra.add(jButtonFK_IdUnidadDetallePedidoCompra, gridBagConstraintsDetallePedidoCompra);

		jTabbedPaneBusquedasDetallePedidoCompra.addTab("5.-Por Unidad ", jPanelFK_IdUnidadDetallePedidoCompra);
		jTabbedPaneBusquedasDetallePedidoCompra.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedidoCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedidoCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoCompra.gridx = 0;		
			//this.gridBagConstraintsDetallePedidoCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedidoCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;		
		//this.gridBagConstraintsDetallePedidoCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePedidoCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePedidoCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoCompra.gridx = 0;		
			this.gridBagConstraintsDetallePedidoCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePedidoCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);								
		
		
		/*
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		*/		
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoCompra.gridx =0;
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedidoCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
				
		//this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetallePedidoCompra.gridx =0;
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetallePedidoCompra.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetallePedidoCompraTotales/*this.jTableDatosDetallePedidoCompraTotales*/, this.gridBagConstraintsDetallePedidoCompra);				
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePedidoCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedidoCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePedidoCompra.setLayout(gridaBagLayoutBusquedasParametrosDetallePedidoCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePedidoCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
			
			
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
			
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePedidoCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePedidoCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePedidoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePedidoCompra.setName("jPanelReporteDinamicoDetallePedidoCompra"); 
		
		this.jPanelReporteDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePedidoCompra.setLayout(gridaBagLayoutReporteDinamicoDetallePedidoCompra);
		
		
		this.jInternalFrameReporteDinamicoDetallePedidoCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePedidoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePedidoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePedidoCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePedidoCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePedidoCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePedidoCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePedidoCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePedidoCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jLabelColumnasSelectReporteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePedidoCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePedidoCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePedidoCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedidoCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedidoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePedidoCompra=new JScrollPane(this.jListColumnasSelectReporteDetallePedidoCompra);
			
			this.jScrollColumnasSelectReporteDetallePedidoCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedidoCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedidoCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jListColumnasSelectReporteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jScrollColumnasSelectReporteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePedidoCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePedidoCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePedidoCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePedidoCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePedidoCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedidoCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedidoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePedidoCompra=new JScrollPane(this.jListRelacionesSelectReporteDetallePedidoCompra);
			
			this.jScrollRelacionesSelectReporteDetallePedidoCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedidoCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedidoCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePedidoCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePedidoCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePedidoCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePedidoCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jLabelConGraficoDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePedidoCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePedidoCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePedidoCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jCheckBoxConGraficoDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePedidoCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePedidoCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jLabelColumnaCategoriaGraficoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePedidoCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePedidoCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jLabelColumnaCategoriaValorDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePedidoCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePedidoCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedidoCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jComboBoxColumnaCategoriaValorDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePedidoCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePedidoCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jLabelColumnasValoresGraficoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePedidoCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePedidoCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePedidoCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedidoCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedidoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePedidoCompra=new JScrollPane(this.jListColumnasValoresGraficoDetallePedidoCompra);
			
			this.jScrollColumnasValoresGraficoDetallePedidoCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedidoCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedidoCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jListColumnasSelectReporteDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jScrollColumnasValoresGraficoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompra.setToolTipText("Generar EXCEL"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jComboBoxTiposReportesDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePedidoCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePedidoCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePedidoCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePedidoCompra.setToolTipText("Generar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jButtonGenerarReporteDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePedidoCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePedidoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePedidoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePedidoCompra.setToolTipText("Cancelar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoCompra.add(this.jButtonCerrarReporteDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePedidoCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePedidoCompra= new JScrollPane(jPanelReporteDinamicoDetallePedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePedidoCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePedidoCompra);
		this.jInternalFrameReporteDinamicoDetallePedidoCompra.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePedidoCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePedidoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePedidoCompra.setName("jPanelImportacionDetallePedidoCompra"); 
		
		this.jPanelImportacionDetallePedidoCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedidoCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedidoCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePedidoCompra.setLayout(gridaBagLayoutImportacionDetallePedidoCompra);
		
		
		this.jInternalFrameImportacionDetallePedidoCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePedidoCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePedidoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedidoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePedidoCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedidoCompra.setResizable(true);
	    this.jInternalFrameImportacionDetallePedidoCompra.setClosable(true);
	    this.jInternalFrameImportacionDetallePedidoCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedidoCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePedidoCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedidoCompra.setResizable(true);
	    this.jInternalFrameImportacionDetallePedidoCompra.setClosable(true);
	    this.jInternalFrameImportacionDetallePedidoCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePedidoCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedidoCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedidoCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePedidoCompra = new JLabelMe();

		this.jLabelArchivoImportacionDetallePedidoCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedidoCompra.add(this.jLabelArchivoImportacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePedidoCompra = new JFileChooser();		
		this.jFileChooserImportacionDetallePedidoCompra.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePedidoCompra = new JButtonMe();
		this.jButtonAbrirImportacionDetallePedidoCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePedidoCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePedidoCompra.setToolTipText("Generar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoCompra.add(this.jButtonAbrirImportacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePedidoCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePedidoCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedidoCompra.add(this.jLabelPathArchivoImportacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePedidoCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePedidoCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedidoCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedidoCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoCompra.add(this.jTextFieldPathArchivoImportacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePedidoCompra = new JButtonMe();
		this.jButtonGenerarImportacionDetallePedidoCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePedidoCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePedidoCompra.setToolTipText("Generar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoCompra.add(this.jButtonGenerarImportacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePedidoCompra = new JButtonMe();
		this.jButtonCerrarImportacionDetallePedidoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePedidoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePedidoCompra.setToolTipText("Cancelar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoCompra.add(this.jButtonCerrarImportacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePedidoCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePedidoCompra= new JScrollPane(jPanelImportacionDetallePedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePedidoCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePedidoCompra);
		this.jInternalFrameImportacionDetallePedidoCompra.getContentPane().add(this.jScrollPanelImportacionDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetallePedidoCompra() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetallePedidoCompra = new JButtonMe();
		this.jButtonAbrirTotalesDetallePedidoCompra.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetallePedidoCompra,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetallePedidoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetallePedidoCompra.setName("jPanelTotalesDetallePedidoCompra"); 
		
		this.jPanelTotalesDetallePedidoCompra.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetallePedidoCompra.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetallePedidoCompra.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetallePedidoCompra.setLayout(gridaBagLayoutTotalesDetallePedidoCompra);
		
		
		this.jInternalFrameTotalesDetallePedidoCompra= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetallePedidoCompra= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetallePedidoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoCompra= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetallePedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetallePedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetallePedidoCompra.setTitle("Totales");
	    this.jInternalFrameTotalesDetallePedidoCompra.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetallePedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetallePedidoCompra.setResizable(true);
	    this.jInternalFrameTotalesDetallePedidoCompra.setClosable(true);
	    this.jInternalFrameTotalesDetallePedidoCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetallePedidoCompra.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetallePedidoCompra.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetallePedidoCompra.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy =iPosYTotales++;
		this.gridBagConstraintsDetallePedidoCompra.gridx =iPosXTotales;
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetallePedidoCompra.ipady =150;
		
		this.jPanelTotalesDetallePedidoCompra.add(jScrollPanelDatosDetallePedidoCompraTotales, this.gridBagConstraintsDetallePedidoCompra);//this.jTableDatosDetallePedidoCompraTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetallePedidoCompra = new JButtonMe();
		this.jButtonCerrarTotalesDetallePedidoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetallePedidoCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetallePedidoCompra.setToolTipText("Cancelar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYTotales++;
		this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXTotales;
							
		this.jPanelTotalesDetallePedidoCompra.add(this.jButtonCerrarTotalesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetallePedidoCompra = new GridBagLayout();
		
		this.jScrollPanelTotalesDetallePedidoCompra= new JScrollPane(jPanelTotalesDetallePedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompra.gridy =iPosYTotales;
		this.gridBagConstraintsDetallePedidoCompra.gridx =iPosXTotales;
		this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetallePedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetallePedidoCompra.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetallePedidoCompra);
		this.jInternalFrameTotalesDetallePedidoCompra.getContentPane().add(this.jScrollPanelTotalesDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetallePedidoCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePedidoCompra = new JButtonMe();
			this.jButtonAbrirOrderByDetallePedidoCompra.setText("Orden");
			this.jButtonAbrirOrderByDetallePedidoCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedidoCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePedidoCompra";
			inputMap = this.jButtonAbrirOrderByDetallePedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePedidoCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePedidoCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePedidoCompra.setName("jPanelOrderByDetallePedidoCompra"); 
			
			this.jPanelOrderByDetallePedidoCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedidoCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedidoCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePedidoCompra.setLayout(gridaBagLayoutOrderByDetallePedidoCompra);
			
			
			this.jTableDatosDetallePedidoCompraOrderBy = new JTableMe();        
			this.jTableDatosDetallePedidoCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePedidoCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePedidoCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePedidoCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePedidoCompraOrderBy.setViewportView(this.jTableDatosDetallePedidoCompraOrderBy);
			this.jTableDatosDetallePedidoCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePedidoCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePedidoCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePedidoCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePedidoCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePedidoCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePedidoCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePedidoCompra.setTitle("Orden");
			this.jInternalFrameOrderByDetallePedidoCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePedidoCompra.setResizable(true);
			this.jInternalFrameOrderByDetallePedidoCompra.setClosable(true);
			this.jInternalFrameOrderByDetallePedidoCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePedidoCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedidoCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedidoCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePedidoCompra.ipady =150;
				
			this.jPanelOrderByDetallePedidoCompra.add(jScrollPanelDatosDetallePedidoCompraOrderBy, this.gridBagConstraintsDetallePedidoCompra);//this.jTableDatosDetallePedidoCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePedidoCompra = new JButtonMe();
			this.jButtonCerrarOrderByDetallePedidoCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePedidoCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePedidoCompra.setToolTipText("Cancelar"+" "+DetallePedidoCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePedidoCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePedidoCompra.add(this.jButtonCerrarOrderByDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePedidoCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePedidoCompra= new JScrollPane(jPanelOrderByDetallePedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePedidoCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedidoCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePedidoCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePedidoCompra);
			
			this.jInternalFrameOrderByDetallePedidoCompra.getContentPane().add(this.jScrollPanelOrderByDetallePedidoCompra, this.gridBagConstraintsDetallePedidoCompra);			
		
		} else {
			this.jButtonAbrirOrderByDetallePedidoCompra = new JButtonMe();
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
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallepedidocompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetallePedidoCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePedidoCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePedidoCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetallePedidoCompra.getRowHeight();//DetallePedidoCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra.isSelected()) {
					iHeightTable=DetallePedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedidoCompra.isSelected()) {
					iHeightTable=DetallePedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePedidoCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedidoCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedidoCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePedidoCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedidoCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedidoCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetallePedidoCompra!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetallePedidoCompra.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetallePedidoCompra.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetallePedidoCompra.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetallePedidoCompra.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetallePedidoCompra.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetallePedidoCompra.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetallePedidoCompra.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePedidoCompra!=null && this.jInternalFrameOrderByDetallePedidoCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePedidoCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePedidoCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePedidoCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePedidoCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePedidoCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePedidoCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePedidoCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePedidoCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedidoCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedidoCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetallePedidoCompra!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetallePedidoCompra.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetallePedidoCompra.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetallePedidoCompra.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetallePedidoCompra.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetallePedidoCompra.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetallePedidoCompra.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetallePedidoCompra.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepedidocompraLogic.getDetallePedidoCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepedidocompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePedidoCompra> TraerDetallePedidoCompraBeans(List<DetallePedidoCompra> detallepedidocompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePedidoCompra detallepedidocompra:detallepedidocompras) {
					
				if(!(DetallePedidoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePedidoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallepedidocompra.setsDetalleGeneralEntityReporte(DetallePedidoCompraConstantesFunciones.getDetallePedidoCompraDescripcion(detallepedidocompra));
										
						
					
						
					
				} else  {
							
					//detallepedidocompra.setsDetalleGeneralEntityReporte(detallepedidocompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallepedidocomprabeans.add(detallepedidocomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallepedidocompras;
    }
	//PARA REPORTES FIN
}
