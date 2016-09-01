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
import com.bydan.erp.inventario.util.DetalleRequisicionCompraConstantesFunciones;

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
public class DetalleRequisicionCompraJInternalFrame extends DetalleRequisicionCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleRequisicionCompra;
	
	protected JMenuBar jmenuBarDetalleRequisicionCompra;
	
	protected JMenu jmenuDetalleRequisicionCompra;
	protected JMenu jmenuDatosDetalleRequisicionCompra;
	protected JMenu jmenuArchivoDetalleRequisicionCompra;
	protected JMenu jmenuAccionesDetalleRequisicionCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleRequisicionCompra;	
	protected GridBagConstraints gridBagConstraintsDetalleRequisicionCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleRequisicionCompraDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleRequisicionCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleRequisicionCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleRequisicionCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_requisicioncompra="";

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
	
	public DetalleRequisicionCompraSessionBean detallerequisicioncompraSessionBean;
		
	
	
	public RequisicionCompraSessionBean requisicioncompraSessionBean;
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
	public List<DetalleRequisicionCompra> detallerequisicioncompras;		
	public List<DetalleRequisicionCompra> detallerequisicioncomprasEliminados;	
	public List<DetalleRequisicionCompra> detallerequisicioncomprasAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleRequisicionCompra;		
	protected JButton jButtonAbrirTotalesDetalleRequisicionCompra;		
	
	/*
	protected JPanel jPanelTotalesDetalleRequisicionCompra;
	public JScrollPane jScrollPanelTotalesDetalleRequisicionCompra;	
	protected JButton jButtonCerrarTotalesDetalleRequisicionCompra;
	*/
	
	public List<DetalleRequisicionCompra> detallerequisicioncomprasTotal= new ArrayList<DetalleRequisicionCompra>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleRequisicionCompra;		
	protected JButton jButtonAbrirOrderByDetalleRequisicionCompra;
	
	
	//protected JPanel jPanelOrderByDetalleRequisicionCompra;
	//public JScrollPane jScrollPanelOrderByDetalleRequisicionCompra;	
	//protected JButton jButtonCerrarOrderByDetalleRequisicionCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleRequisicionCompraLogic detallerequisicioncompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleRequisicionCompra;
	public JScrollPane jScrollPanelDatosEdicionDetalleRequisicionCompra;
	public JScrollPane jScrollPanelDatosGeneralDetalleRequisicionCompra;
    //public JScrollPane jScrollPanelDatosDetalleRequisicionCompraTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetalleRequisicionCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleRequisicionCompra;
	//public JScrollPane jScrollPanelImportacionDetalleRequisicionCompra;
	
	
	
	protected JPanel jPanelAccionesDetalleRequisicionCompra;
	
    protected JPanel jPanelPaginacionDetalleRequisicionCompra;
    protected JPanel jPanelParametrosReportesDetalleRequisicionCompra;
	protected JPanel jPanelParametrosReportesAccionesDetalleRequisicionCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleRequisicionCompra;
	protected JPanel jPanelParametrosAuxiliar2DetalleRequisicionCompra;
	protected JPanel jPanelParametrosAuxiliar3DetalleRequisicionCompra;
	protected JPanel jPanelParametrosAuxiliar4DetalleRequisicionCompra;
	//protected JPanel jPanelParametrosAuxiliar5DetalleRequisicionCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleRequisicionCompra;
	//protected JPanel jPanelImportacionDetalleRequisicionCompra;
	
	
	public JTable jTableDatosDetalleRequisicionCompra;
	//public JTable jTableDatosDetalleRequisicionCompraTotales;
	
	
	//public JTable jTableDatosDetalleRequisicionCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleRequisicionCompra;
	protected JButton jButtonDuplicarDetalleRequisicionCompra;
	protected JButton jButtonCopiarDetalleRequisicionCompra;
	protected JButton jButtonVerFormDetalleRequisicionCompra;
	protected JButton jButtonNuevoRelacionesDetalleRequisicionCompra;
	protected JButton jButtonModificarDetalleRequisicionCompra;
	
    protected JButton jButtonGuardarCambiosTablaDetalleRequisicionCompra;
	protected JButton jButtonCerrarDetalleRequisicionCompra;
	
	
	protected JButton jButtonRecargarInformacionDetalleRequisicionCompra;
	protected JButton jButtonProcesarInformacionDetalleRequisicionCompra;
	
	
	protected JButton jButtonAnterioresDetalleRequisicionCompra;
	protected JButton jButtonSiguientesDetalleRequisicionCompra;
	protected JButton jButtonNuevoGuardarCambiosDetalleRequisicionCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleRequisicionCompra;
	//protected JButton jButtonCerrarReporteDinamicoDetalleRequisicionCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleRequisicionCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleRequisicionCompra;
	//protected JButton jButtonGenerarImportacionDetalleRequisicionCompra;
	//protected JButton jButtonCerrarImportacionDetalleRequisicionCompra;
	//protected JFileChooser jFileChooserImportacionDetalleRequisicionCompra;
	//protected File fileImportacionDetalleRequisicionCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleRequisicionCompra;
	protected JButton jButtonDuplicarToolBarDetalleRequisicionCompra;
	protected JButton jButtonNuevoRelacionesToolBarDetalleRequisicionCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleRequisicionCompra;
	protected JButton jButtonCopiarToolBarDetalleRequisicionCompra;
	protected JButton jButtonVerFormToolBarDetalleRequisicionCompra;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleRequisicionCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleRequisicionCompra;
	protected JButton jButtonCerrarToolBarDetalleRequisicionCompra;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleRequisicionCompra;
	protected JButton jButtonProcesarInformacionToolBarDetalleRequisicionCompra;
	protected JButton jButtonAnterioresToolBarDetalleRequisicionCompra;
	protected JButton jButtonSiguientesToolBarDetalleRequisicionCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleRequisicionCompra;
	protected JButton jButtonAbrirOrderByToolBarDetalleRequisicionCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleRequisicionCompra;
	protected JMenuItem jMenuItemDuplicarDetalleRequisicionCompra;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleRequisicionCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleRequisicionCompra;
	protected JMenuItem jMenuItemCopiarDetalleRequisicionCompra;
	protected JMenuItem jMenuItemVerFormDetalleRequisicionCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleRequisicionCompra;
	protected JMenuItem jMenuItemCerrarDetalleRequisicionCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetalleRequisicionCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleRequisicionCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleRequisicionCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleRequisicionCompra;
	protected JMenuItem jMenuItemProcesarInformacionDetalleRequisicionCompra;
	protected JMenuItem jMenuItemAnterioresDetalleRequisicionCompra;
	protected JMenuItem jMenuItemSiguientesDetalleRequisicionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleRequisicionCompra;
	protected JMenuItem jMenuItemAbrirOrderByDetalleRequisicionCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetalleRequisicionCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleRequisicionCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleRequisicionCompra;
	protected JCheckBox jCheckBoxSeleccionadosDetalleRequisicionCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleRequisicionCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleRequisicionCompra;
	protected JTextField jTextFieldValorCampoGeneralDetalleRequisicionCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleRequisicionCompra;
	//public JList<Reporte> jListColumnasSelectReporteDetalleRequisicionCompra;
	//public JScrollPane jScrollColumnasSelectReporteDetalleRequisicionCompra;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleRequisicionCompra;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleRequisicionCompra;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleRequisicionCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleRequisicionCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleRequisicionCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleRequisicionCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleRequisicionCompra;
	
		
	//public JLabel jLabelArchivoImportacionDetalleRequisicionCompra;	
	//public JLabel jLabelPathArchivoImportacionDetalleRequisicionCompra;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleRequisicionCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleRequisicionCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleRequisicionCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleRequisicionCompra;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleRequisicionCompra;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleRequisicionCompra;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleRequisicionCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleRequisicionCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleRequisicionCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleRequisicionCompra;
	public JPanel jPanelFK_IdBodegaDetalleRequisicionCompra;
	public JButton jButtonFK_IdBodegaDetalleRequisicionCompra;
	public JPanel jPanelFK_IdCentroCostoDetalleRequisicionCompra;
	public JButton jButtonFK_IdCentroCostoDetalleRequisicionCompra;
	public JPanel jPanelFK_IdProductoDetalleRequisicionCompra;
	public JButton jButtonFK_IdProductoDetalleRequisicionCompra;
	public JPanel jPanelFK_IdRequisicionCompraDetalleRequisicionCompra;
	public JButton jButtonFK_IdRequisicionCompraDetalleRequisicionCompra;
	public JPanel jPanelFK_IdUnidadDetalleRequisicionCompra;
	public JButton jButtonFK_IdUnidadDetalleRequisicionCompra;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleRequisicionCompra;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleRequisicionCompra;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleRequisicionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleRequisicionCompraBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleRequisicionCompraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra;
	
	public JPanel jPanelid_productoFK_IdProductoDetalleRequisicionCompra;
	public JLabel jLabelid_productoFK_IdProductoDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleRequisicionCompra;
	public JButton jButtonid_productoFK_IdProductoDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra;
	
	public JPanel jPanelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra;
	public JLabel jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra;
	public JButton jButtonid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleRequisicionCompra;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleRequisicionCompra;
	public JButton jButtonid_unidadFK_IdUnidadDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleRequisicionCompraBusqueda= new JButtonMe();

	
	
	
	
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
	public DetalleRequisicionCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleRequisicionCompra)	{
		this.jButtonRecargarInformacionDetalleRequisicionCompra = jButtonRecargarInformacionDetalleRequisicionCompra;
	}
	
	public JButton getjButtonProcesarInformacionDetalleRequisicionCompra() {
		return this.jButtonProcesarInformacionDetalleRequisicionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleRequisicionCompra)	{
		this.jButtonProcesarInformacionDetalleRequisicionCompra = jButtonProcesarInformacionDetalleRequisicionCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleRequisicionCompra() {
		return this.jButtonRecargarInformacionDetalleRequisicionCompra;
	}
	
	
	public List<DetalleRequisicionCompra> getdetallerequisicioncompras() {
		return this.detallerequisicioncompras;
	}

	public void setdetallerequisicioncompras(List<DetalleRequisicionCompra> detallerequisicioncompras) {
		this.detallerequisicioncompras = detallerequisicioncompras;
	}
	
	public List<DetalleRequisicionCompra> getdetallerequisicioncomprasAux() {
		return this.detallerequisicioncomprasAux;
	}

	public void setdetallerequisicioncomprasAux(List<DetalleRequisicionCompra> detallerequisicioncomprasAux) {
		this.detallerequisicioncomprasAux = detallerequisicioncomprasAux;
	}
	
	public List<DetalleRequisicionCompra> getdetallerequisicioncomprasEliminados() {
		return this.detallerequisicioncomprasEliminados;
	}

	public void setDetalleRequisicionComprasEliminados(List<DetalleRequisicionCompra> detallerequisicioncomprasEliminados) {
		this.detallerequisicioncomprasEliminados = detallerequisicioncomprasEliminados;
	}
	
	public List<DetalleRequisicionCompra> getdetallerequisicioncomprasTotal() {
		return this.detallerequisicioncomprasTotal;
	}

	public void setdetallerequisicioncomprasTotal(List<DetalleRequisicionCompra> detallerequisicioncomprasTotal) {
		this.detallerequisicioncomprasTotal = detallerequisicioncomprasTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleRequisicionCompra() {
		return jComboBoxTiposSeleccionarDetalleRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleRequisicionCompra(
			JComboBox jComboBoxTiposSeleccionarDetalleRequisicionCompra) {
		this.jComboBoxTiposSeleccionarDetalleRequisicionCompra = jComboBoxTiposSeleccionarDetalleRequisicionCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleRequisicionCompra() {
		return jTextFieldValorCampoGeneralDetalleRequisicionCompra;
	}

	public void setjTextFieldValorCampoGeneralDetalleRequisicionCompra(
			JTextField jTextFieldValorCampoGeneralDetalleRequisicionCompra) {
		this.jTextFieldValorCampoGeneralDetalleRequisicionCompra = jTextFieldValorCampoGeneralDetalleRequisicionCompra;
	}

	public void setBorderResaltarValorCampoGeneralDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleRequisicionCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleRequisicionCompra() {
		return this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra;
	}

	public void setjCheckBoxSeleccionarTodosDetalleRequisicionCompra(
			JCheckBox jCheckBoxSeleccionarTodosDetalleRequisicionCompra) {
		this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra = jCheckBoxSeleccionarTodosDetalleRequisicionCompra;
	}

	public void setBorderResaltarSeleccionarTodosDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleRequisicionCompra() {
		return this.jCheckBoxSeleccionadosDetalleRequisicionCompra;
	}

	public void setjCheckBoxSeleccionadosDetalleRequisicionCompra(
			JCheckBox jCheckBoxSeleccionadosDetalleRequisicionCompra) {
		this.jCheckBoxSeleccionadosDetalleRequisicionCompra = jCheckBoxSeleccionadosDetalleRequisicionCompra;
	}
	
	public void setBorderResaltarSeleccionadosDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleRequisicionCompra() {
		return this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleRequisicionCompra(
			JComboBox jComboBoxTiposArchivosReportesDetalleRequisicionCompra) {
		this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra = jComboBoxTiposArchivosReportesDetalleRequisicionCompra;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleRequisicionCompra() {
		return this.jComboBoxTiposReportesDetalleRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleRequisicionCompra(
			JComboBox jComboBoxTiposReportesDetalleRequisicionCompra) {
		this.jComboBoxTiposReportesDetalleRequisicionCompra = jComboBoxTiposReportesDetalleRequisicionCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleRequisicionCompra() {
	//	return jComboBoxTiposReportesDinamicoDetalleRequisicionCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleRequisicionCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleRequisicionCompra) {
	//	this.jComboBoxTiposReportesDinamicoDetalleRequisicionCompra = jComboBoxTiposReportesDinamicoDetalleRequisicionCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra = jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra;
	//}
	
	public void setBorderResaltarTiposReportesDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleRequisicionCompra() {
		return this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleRequisicionCompra(
			JComboBox jComboBoxTiposGraficosReportesDetalleRequisicionCompra) {
		this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra = jComboBoxTiposGraficosReportesDetalleRequisicionCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleRequisicionCompra() {
		return this.jComboBoxTiposPaginacionDetalleRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleRequisicionCompra(
			JComboBox jComboBoxTiposPaginacionDetalleRequisicionCompra) {
		this.jComboBoxTiposPaginacionDetalleRequisicionCompra = jComboBoxTiposPaginacionDetalleRequisicionCompra;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleRequisicionCompra() {
		return this.jComboBoxTiposRelacionesDetalleRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleRequisicionCompra() {
		return this.jComboBoxTiposAccionesDetalleRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleRequisicionCompra(
			JComboBox jComboBoxTiposRelacionesDetalleRequisicionCompra) {
		this.jComboBoxTiposRelacionesDetalleRequisicionCompra = jComboBoxTiposRelacionesDetalleRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleRequisicionCompra(
			JComboBox jComboBoxTiposAccionesDetalleRequisicionCompra) {
		this.jComboBoxTiposAccionesDetalleRequisicionCompra = jComboBoxTiposAccionesDetalleRequisicionCompra;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleRequisicionCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleRequisicionCompra() {
	//	return jCheckBoxConGraficoDinamicoDetalleRequisicionCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleRequisicionCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleRequisicionCompra) {
	//	this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra = jCheckBoxConGraficoDinamicoDetalleRequisicionCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleRequisicionCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleRequisicionCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra .setBorder(borderResaltar);		
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
		this.detallerequisicioncompraSessionBean=new DetalleRequisicionCompraSessionBean();
		
		this.detallerequisicioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallerequisicioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleRequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleRequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleRequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleRequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleRequisicionCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Requisicion Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleRequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRequisicionCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"nuevo","nuevo","Nuevo"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"duplicar","duplicar","Duplicar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"copiar","copiar","Copiar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"ver_form","ver_form","Ver"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"recargar","recargar","Recargar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"cerrar","cerrar","Salir"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleRequisicionCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleRequisicionCompra;
			
				this.jButtonProcesarInformacionToolBarDetalleRequisicionCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleRequisicionCompra;
				
		//protected JButton jButtonModificarToolBarDetalleRequisicionCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleRequisicionCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleRequisicionCompra=new JMenuMe("General");
		this.jmenuArchivoDetalleRequisicionCompra=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleRequisicionCompra=new JMenuMe("Acciones");
		this.jmenuDatosDetalleRequisicionCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleRequisicionCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleRequisicionCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleRequisicionCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleRequisicionCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleRequisicionCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleRequisicionCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleRequisicionCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleRequisicionCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleRequisicionCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleRequisicionCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleRequisicionCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleRequisicionCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleRequisicionCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleRequisicionCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleRequisicionCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleRequisicionCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleRequisicionCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleRequisicionCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleRequisicionCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleRequisicionCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleRequisicionCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleRequisicionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleRequisicionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleRequisicionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleRequisicionCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleRequisicionCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleRequisicionCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleRequisicionCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleRequisicionCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleRequisicionCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleRequisicionCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleRequisicionCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleRequisicionCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleRequisicionCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleRequisicionCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleRequisicionCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleRequisicionCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleRequisicionCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleRequisicionCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleRequisicionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleRequisicionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleRequisicionCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleRequisicionCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleRequisicionCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleRequisicionCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleRequisicionCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleRequisicionCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleRequisicionCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleRequisicionCompra.add(this.jMenuItemCerrarDetalleRequisicionCompra);
			
			this.jmenuAccionesDetalleRequisicionCompra.add(this.jMenuItemNuevoDetalleRequisicionCompra);
			this.jmenuAccionesDetalleRequisicionCompra.add(this.jMenuItemNuevoGuardarCambiosDetalleRequisicionCompra);
			this.jmenuAccionesDetalleRequisicionCompra.add(this.jMenuItemNuevoRelacionesDetalleRequisicionCompra);
			this.jmenuAccionesDetalleRequisicionCompra.add(this.jMenuItemGuardarCambiosTablaDetalleRequisicionCompra);		
			this.jmenuAccionesDetalleRequisicionCompra.add(this.jMenuItemDuplicarDetalleRequisicionCompra);		
			this.jmenuAccionesDetalleRequisicionCompra.add(this.jMenuItemCopiarDetalleRequisicionCompra);		
			this.jmenuAccionesDetalleRequisicionCompra.add(this.jMenuItemVerFormDetalleRequisicionCompra);		
			
			this.jmenuDatosDetalleRequisicionCompra.add(this.jMenuItemRecargarInformacionDetalleRequisicionCompra);				
			this.jmenuDatosDetalleRequisicionCompra.add(this.jMenuItemAnterioresDetalleRequisicionCompra);				
			this.jmenuDatosDetalleRequisicionCompra.add(this.jMenuItemSiguientesDetalleRequisicionCompra);				
			this.jmenuDatosDetalleRequisicionCompra.add(this.jMenuItemAbrirOrderByDetalleRequisicionCompra);				
			this.jmenuDatosDetalleRequisicionCompra.add(this.jMenuItemMostrarOcultarDetalleRequisicionCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleRequisicionCompra.add(this.jMenuItemGuardarCambiosDetalleRequisicionCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRequisicionCompra.add(this.jmenuArchivoDetalleRequisicionCompra);		
			this.jmenuBarDetalleRequisicionCompra.add(this.jmenuAccionesDetalleRequisicionCompra);		
			this.jmenuBarDetalleRequisicionCompra.add(this.jmenuDatosDetalleRequisicionCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleRequisicionCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleRequisicionCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleRequisicionCompra.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleRequisicionCompra= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleRequisicionCompra.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleRequisicionCompra.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleRequisicionCompra,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleRequisicionCompra.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleRequisicionCompra= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleRequisicionCompra.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleRequisicionCompra.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleRequisicionCompra,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra.setFocusable(false);

		this.jPanelFK_IdProductoDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleRequisicionCompra.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleRequisicionCompra= new JButtonMe();
		this.jButtonFK_IdProductoDetalleRequisicionCompra.setText("Buscar");
		this.jButtonFK_IdProductoDetalleRequisicionCompra.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleRequisicionCompra,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleRequisicionCompra = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleRequisicionCompra.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleRequisicionCompra.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra.setFocusable(false);

		this.jPanelFK_IdRequisicionCompraDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRequisicionCompraDetalleRequisicionCompra.setToolTipText("Buscar Por Requisicion Compra ");
		this.jButtonFK_IdRequisicionCompraDetalleRequisicionCompra= new JButtonMe();
		this.jButtonFK_IdRequisicionCompraDetalleRequisicionCompra.setText("Buscar");
		this.jButtonFK_IdRequisicionCompraDetalleRequisicionCompra.setToolTipText("Buscar Por Requisicion Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRequisicionCompraDetalleRequisicionCompra,"buscar_button","Buscar Por Requisicion Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRequisicionCompraDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra = new JLabelMe();
		jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra.setText("Requisicion Compra :");
		jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra.setToolTipText("Requisicion Compra");
		jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleRequisicionCompra.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleRequisicionCompra= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleRequisicionCompra.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleRequisicionCompra.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleRequisicionCompra,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleRequisicionCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleRequisicionCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleRequisicionCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleRequisicionCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleRequisicionCompra = new DetalleRequisicionCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Requisicion Compra DATOS");
			this.jInternalFrameDetalleFormDetalleRequisicionCompra = new DetalleRequisicionCompraDetalleFormJInternalFrame(jDesktopPane,this.detallerequisicioncompraSessionBean.getConGuardarRelaciones(),this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleRequisicionCompra = null;//new DetalleRequisicionCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleRequisicionCompra= new GridBagLayout();
		
		
		this.jTableDatosDetalleRequisicionCompra = new JTableMe();      
		
		String sToolTipDetalleRequisicionCompra="";
		sToolTipDetalleRequisicionCompra=DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleRequisicionCompra+="(Inventario.DetalleRequisicionCompra)";
		}
		
		if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleRequisicionCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleRequisicionCompra.setToolTipText(sToolTipDetalleRequisicionCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleRequisicionCompra);
		this.jTableDatosDetalleRequisicionCompra.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleRequisicionCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleRequisicionCompra.setRowSelectionAllowed(true);
		this.jTableDatosDetalleRequisicionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleRequisicionCompraTotales = new JTableMe();        
		//this.jTableDatosDetalleRequisicionCompraTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleRequisicionCompraTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleRequisicionCompra = new JButtonMe();
		this.jButtonDuplicarDetalleRequisicionCompra = new JButtonMe();
		this.jButtonCopiarDetalleRequisicionCompra = new JButtonMe();
		this.jButtonVerFormDetalleRequisicionCompra = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleRequisicionCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleRequisicionCompra = new JButtonMe();
		this.jButtonCerrarDetalleRequisicionCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetalleRequisicionCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleRequisicionCompra = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleRequisicionCompraTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Requisicion Compra";
		
		if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicion Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleRequisicionCompraTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleRequisicionCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetalleRequisicionCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleRequisicionCompra=new ReporteDinamicoJInternalFrame(DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleRequisicionCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleRequisicionCompra=new ImportacionJInternalFrame(DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleRequisicionCompra();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleRequisicionCompra = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleRequisicionCompra.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleRequisicionCompra,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleRequisicionCompra=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleRequisicionCompra();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleRequisicionCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleRequisicionCompra.setText("Orden");
		this.jButtonAbrirOrderByDetalleRequisicionCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleRequisicionCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleRequisicionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRequisicionCompra,false,this);
			
			//this.cargarOrderByDetalleRequisicionCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleRequisicionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRequisicionCompra,true,this);
			
			//this.cargarOrderByDetalleRequisicionCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleRequisicionCompra.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosDetalleRequisicionCompra.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosDetalleRequisicionCompra.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosDetalleRequisicionCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleRequisicionCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleRequisicionCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleRequisicionCompra.setText("Nuevo");
		this.jButtonDuplicarDetalleRequisicionCompra.setText("Duplicar");
		this.jButtonCopiarDetalleRequisicionCompra.setText("Copiar");
		this.jButtonVerFormDetalleRequisicionCompra.setText("Ver");
		this.jButtonNuevoRelacionesDetalleRequisicionCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleRequisicionCompra.setText("Guardar");
		this.jButtonCerrarDetalleRequisicionCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleRequisicionCompra,"nuevo_button","Nuevo",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleRequisicionCompra,"duplicar_button","Duplicar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleRequisicionCompra,"copiar_button","Copiar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleRequisicionCompra,"ver_form","Ver",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleRequisicionCompra,"nuevorelaciones_button","Nuevo Rel",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleRequisicionCompra,"guardarcambiostabla_button","Guardar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleRequisicionCompra,"cerrar_button","Salir",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleRequisicionCompra.setToolTipText("Nuevo"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleRequisicionCompra.setToolTipText("Duplicar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleRequisicionCompra.setToolTipText("Copiar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleRequisicionCompra.setToolTipText("Ver"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleRequisicionCompra.setToolTipText("Nuevo Rel"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleRequisicionCompra.setToolTipText("Guardar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleRequisicionCompra.setToolTipText("Salir"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleRequisicionCompra";
		inputMap = this.jButtonNuevoDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleRequisicionCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleRequisicionCompra";
		inputMap = this.jButtonDuplicarDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleRequisicionCompra"));
		
		//COPIAR
		sMapKey = "CopiarDetalleRequisicionCompra";
		inputMap = this.jButtonCopiarDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleRequisicionCompra"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleRequisicionCompra";
		inputMap = this.jButtonVerFormDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleRequisicionCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleRequisicionCompra";
		inputMap = this.jButtonNuevoRelacionesDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleRequisicionCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleRequisicionCompra";
		inputMap = this.jButtonModificarDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleRequisicionCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleRequisicionCompra";
		inputMap = this.jButtonCerrarDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleRequisicionCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleRequisicionCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleRequisicionCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleRequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleRequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleRequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleRequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleRequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleRequisicionCompra.setName("jPanelParametrosReportesDetalleRequisicionCompra"); 
		
		this.jPanelParametrosReportesAccionesDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleRequisicionCompra.setName("jPanelParametrosReportesAccionesDetalleRequisicionCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleRequisicionCompra = new JButtonMe();
		this.jButtonRecargarInformacionDetalleRequisicionCompra.setText("Recargar");
		this.jButtonRecargarInformacionDetalleRequisicionCompra.setToolTipText("Recargar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleRequisicionCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleRequisicionCompra = new JButtonMe();
		this.jButtonProcesarInformacionDetalleRequisicionCompra.setText("Procesar");
		this.jButtonProcesarInformacionDetalleRequisicionCompra.setToolTipText("Procesar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleRequisicionCompra.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleRequisicionCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleRequisicionCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleRequisicionCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleRequisicionCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleRequisicionCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleRequisicionCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleRequisicionCompra.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleRequisicionCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleRequisicionCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetalleRequisicionCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleRequisicionCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleRequisicionCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleRequisicionCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleRequisicionCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleRequisicionCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleRequisicionCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleRequisicionCompra = new JLabelMe();
		
		this.jLabelAccionesDetalleRequisicionCompra.setText("Acciones");		
		this.jLabelAccionesDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleRequisicionCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleRequisicionCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleRequisicionCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleRequisicionCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleRequisicionCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleRequisicionCompra = new JButtonMe();
		//this.jButtonAnterioresDetalleRequisicionCompra.setText("<<");
        this.jButtonAnterioresDetalleRequisicionCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleRequisicionCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleRequisicionCompra = new JButtonMe();
		//this.jButtonSiguientesDetalleRequisicionCompra.setText(">>");
        this.jButtonSiguientesDetalleRequisicionCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleRequisicionCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleRequisicionCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleRequisicionCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleRequisicionCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleRequisicionCompra,"nuevoguardarcambios_button","Nue",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleRequisicionCompra";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleRequisicionCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleRequisicionCompra";
		inputMap = this.jButtonRecargarInformacionDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleRequisicionCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleRequisicionCompra";
		inputMap = this.jButtonSiguientesDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleRequisicionCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleRequisicionCompra";
		inputMap = this.jButtonAnterioresDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleRequisicionCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleRequisicionCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleRequisicionCompra.setMinimumSize(new Dimension(this.getWidth(),DetalleRequisicionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRequisicionCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleRequisicionCompra.setMaximumSize(new Dimension(this.getWidth(),DetalleRequisicionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRequisicionCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleRequisicionCompra.setPreferredSize(new Dimension(this.getWidth(),DetalleRequisicionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRequisicionCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleRequisicionCompra = new GridBagLayout();

			this.jPanelPaginacionDetalleRequisicionCompra.setLayout(gridaBagLayoutPaginacionDetalleRequisicionCompra);						
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonAnterioresDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
					
						
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
			
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonNuevoGuardarCambiosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
						
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonSiguientesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonAbrirTotalesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonNuevoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
						
			
			
			if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
				this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonGuardarCambiosTablaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			}
			
			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonDuplicarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonCopiarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonVerFormDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleRequisicionCompra.add(this.jButtonCerrarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		
		
		this.jButtonRecargarInformacionDetalleRequisicionCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleRequisicionCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleRequisicionCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleRequisicionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleRequisicionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleRequisicionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleRequisicionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleRequisicionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleRequisicionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleRequisicionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleRequisicionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleRequisicionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleRequisicionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRequisicionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRequisicionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleRequisicionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleRequisicionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleRequisicionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleRequisicionCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleRequisicionCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleRequisicionCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleRequisicionCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleRequisicionCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleRequisicionCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleRequisicionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleRequisicionCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleRequisicionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleRequisicionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleRequisicionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleRequisicionCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleRequisicionCompra.setLayout(gridaBagParametrosReportesDetalleRequisicionCompra);
			this.jPanelParametrosReportesAccionesDetalleRequisicionCompra.setLayout(gridaBagParametrosReportesAccionesDetalleRequisicionCompra);
			
			
			this.jPanelParametrosAuxiliar1DetalleRequisicionCompra.setLayout(gridaBagParametrosAuxiliar1DetalleRequisicionCompra);
			this.jPanelParametrosAuxiliar2DetalleRequisicionCompra.setLayout(gridaBagParametrosAuxiliar2DetalleRequisicionCompra);
			this.jPanelParametrosAuxiliar3DetalleRequisicionCompra.setLayout(gridaBagParametrosAuxiliar3DetalleRequisicionCompra);
			this.jPanelParametrosAuxiliar4DetalleRequisicionCompra.setLayout(gridaBagParametrosAuxiliar4DetalleRequisicionCompra);
			//this.jPanelParametrosAuxiliar5DetalleRequisicionCompra.setLayout(gridaBagParametrosAuxiliar2DetalleRequisicionCompra);			
			
			
			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jButtonRecargarInformacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRequisicionCompra.add(this.jComboBoxTiposPaginacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRequisicionCompra.add(this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRequisicionCompra.add(this.jComboBoxTiposArchivosReportesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jPanelParametrosAuxiliar1DetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleRequisicionCompra.add(this.jComboBoxTiposReportesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);																		
			
			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleRequisicionCompra.add(this.jComboBoxTiposGraficosReportesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jPanelParametrosAuxiliar4DetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jComboBoxTiposReportesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jCheckBoxGenerarReporteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jPanelParametrosAuxiliar2DetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jLabelAccionesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jButtonAbrirOrderByDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jComboBoxTiposSeleccionarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
			
			
			/*
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jCheckBoxConGraficoReporteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRequisicionCompra.add(this.jCheckBoxSeleccionarTodosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);															
				
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRequisicionCompra.add(this.jCheckBoxSeleccionadosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);															
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRequisicionCompra.add(this.jCheckBoxConGraficoReporteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jPanelParametrosAuxiliar3DetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jComboBoxTiposAccionesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
	
				
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRequisicionCompra.add(this.jTextFieldValorCampoGeneralDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleRequisicionCompra = new GridBagLayout();

			this.jScrollPanelDatosDetalleRequisicionCompra.setLayout(gridaBagLayoutDatosDetalleRequisicionCompra);
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
			
			this.jScrollPanelDatosDetalleRequisicionCompra.add(this.jTableDatosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleRequisicionCompra.setViewportView(this.jTableDatosDetalleRequisicionCompra);
		this.jTableDatosDetalleRequisicionCompra.setFillsViewportHeight(true);
		this.jTableDatosDetalleRequisicionCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleRequisicionCompraTotales.setViewportView(this.jTableDatosDetalleRequisicionCompraTotales);
		//this.jTableDatosDetalleRequisicionCompraTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleRequisicionCompraTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleRequisicionCompra= new GridBagLayout();
		this.jPanelAccionesDetalleRequisicionCompra.setLayout(gridaBagLayoutAccionesDetalleRequisicionCompra);
		
		
		/*	
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
			
		this.jPanelAccionesDetalleRequisicionCompra.add(this.jButtonNuevoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleRequisicionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleRequisicionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleRequisicionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleRequisicionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleRequisicionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleRequisicionCompra.setLayout(gridaBagLayoutFK_IdBodegaDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		jPanelFK_IdBodegaDetalleRequisicionCompra.add(jLabelid_bodegaFK_IdBodegaDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
		jPanelFK_IdBodegaDetalleRequisicionCompra.add(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
		gridBagConstraintsDetalleRequisicionCompra.gridx =1;
		jPanelFK_IdBodegaDetalleRequisicionCompra.add(jButtonFK_IdBodegaDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		jTabbedPaneBusquedasDetalleRequisicionCompra.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleRequisicionCompra);
		jTabbedPaneBusquedasDetalleRequisicionCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleRequisicionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleRequisicionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleRequisicionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleRequisicionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleRequisicionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleRequisicionCompra.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		jPanelFK_IdCentroCostoDetalleRequisicionCompra.add(jLabelid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
		jPanelFK_IdCentroCostoDetalleRequisicionCompra.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);


		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		jPanelFK_IdCentroCostoDetalleRequisicionCompra.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
		gridBagConstraintsDetalleRequisicionCompra.gridx =1;
		jPanelFK_IdCentroCostoDetalleRequisicionCompra.add(jButtonFK_IdCentroCostoDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		jTabbedPaneBusquedasDetalleRequisicionCompra.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleRequisicionCompra);
		jTabbedPaneBusquedasDetalleRequisicionCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleRequisicionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleRequisicionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleRequisicionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleRequisicionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleRequisicionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleRequisicionCompra.setLayout(gridaBagLayoutFK_IdProductoDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		jPanelFK_IdProductoDetalleRequisicionCompra.add(jLabelid_productoFK_IdProductoDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
		jPanelFK_IdProductoDetalleRequisicionCompra.add(jComboBoxid_productoFK_IdProductoDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);


		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		jPanelFK_IdProductoDetalleRequisicionCompra.add(this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
		gridBagConstraintsDetalleRequisicionCompra.gridx =1;
		jPanelFK_IdProductoDetalleRequisicionCompra.add(jButtonFK_IdProductoDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		jTabbedPaneBusquedasDetalleRequisicionCompra.addTab("3.-Por Producto ", jPanelFK_IdProductoDetalleRequisicionCompra);
		jTabbedPaneBusquedasDetalleRequisicionCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdRequisicionCompraDetalleRequisicionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdRequisicionCompraDetalleRequisicionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRequisicionCompraDetalleRequisicionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRequisicionCompraDetalleRequisicionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRequisicionCompraDetalleRequisicionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRequisicionCompraDetalleRequisicionCompra.setLayout(gridaBagLayoutFK_IdRequisicionCompraDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		jPanelFK_IdRequisicionCompraDetalleRequisicionCompra.add(jLabelid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
		jPanelFK_IdRequisicionCompraDetalleRequisicionCompra.add(jComboBoxid_requisicion_compraFK_IdRequisicionCompraDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
		gridBagConstraintsDetalleRequisicionCompra.gridx =1;
		jPanelFK_IdRequisicionCompraDetalleRequisicionCompra.add(jButtonFK_IdRequisicionCompraDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		jTabbedPaneBusquedasDetalleRequisicionCompra.addTab("4.-Por Requisicion Compra ", jPanelFK_IdRequisicionCompraDetalleRequisicionCompra);
		jTabbedPaneBusquedasDetalleRequisicionCompra.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleRequisicionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleRequisicionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleRequisicionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleRequisicionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleRequisicionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleRequisicionCompra.setLayout(gridaBagLayoutFK_IdUnidadDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		jPanelFK_IdUnidadDetalleRequisicionCompra.add(jLabelid_unidadFK_IdUnidadDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
		jPanelFK_IdUnidadDetalleRequisicionCompra.add(jComboBoxid_unidadFK_IdUnidadDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicionCompra.gridy = 1;
		gridBagConstraintsDetalleRequisicionCompra.gridx =1;
		jPanelFK_IdUnidadDetalleRequisicionCompra.add(jButtonFK_IdUnidadDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);

		jTabbedPaneBusquedasDetalleRequisicionCompra.addTab("5.-Por Unidad ", jPanelFK_IdUnidadDetalleRequisicionCompra);
		jTabbedPaneBusquedasDetalleRequisicionCompra.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleRequisicionCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;		
			//this.gridBagConstraintsDetalleRequisicionCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;		
		//this.gridBagConstraintsDetalleRequisicionCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleRequisicionCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;		
			this.gridBagConstraintsDetalleRequisicionCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);								
		
		
		/*
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		*/		
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =0;
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleRequisicionCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
				
		//this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleRequisicionCompra.gridx =0;
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleRequisicionCompra.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleRequisicionCompraTotales/*this.jTableDatosDetalleRequisicionCompraTotales*/, this.gridBagConstraintsDetalleRequisicionCompra);				
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleRequisicionCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleRequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleRequisicionCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleRequisicionCompra.setLayout(gridaBagLayoutBusquedasParametrosDetalleRequisicionCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleRequisicionCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			
			
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
			
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleRequisicionCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleRequisicionCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleRequisicionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleRequisicionCompra.setName("jPanelReporteDinamicoDetalleRequisicionCompra"); 
		
		this.jPanelReporteDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleRequisicionCompra.setLayout(gridaBagLayoutReporteDinamicoDetalleRequisicionCompra);
		
		
		this.jInternalFrameReporteDinamicoDetalleRequisicionCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleRequisicionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRequisicionCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicion Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleRequisicionCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleRequisicionCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jLabelColumnasSelectReporteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleRequisicionCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleRequisicionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleRequisicionCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleRequisicionCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleRequisicionCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleRequisicionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleRequisicionCompra=new JScrollPane(this.jListColumnasSelectReporteDetalleRequisicionCompra);
			
			this.jScrollColumnasSelectReporteDetalleRequisicionCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleRequisicionCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleRequisicionCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jListColumnasSelectReporteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jScrollColumnasSelectReporteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleRequisicionCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleRequisicionCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleRequisicionCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleRequisicionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleRequisicionCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleRequisicionCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleRequisicionCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleRequisicionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleRequisicionCompra=new JScrollPane(this.jListRelacionesSelectReporteDetalleRequisicionCompra);
			
			this.jScrollRelacionesSelectReporteDetalleRequisicionCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleRequisicionCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleRequisicionCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleRequisicionCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleRequisicionCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleRequisicionCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleRequisicionCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleRequisicionCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jLabelConGraficoDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jCheckBoxConGraficoDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleRequisicionCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleRequisicionCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jLabelColumnaCategoriaGraficoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleRequisicionCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleRequisicionCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jLabelColumnaCategoriaValorDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleRequisicionCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleRequisicionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleRequisicionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleRequisicionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleRequisicionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jComboBoxColumnaCategoriaValorDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleRequisicionCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleRequisicionCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jLabelColumnasValoresGraficoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleRequisicionCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleRequisicionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleRequisicionCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleRequisicionCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleRequisicionCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleRequisicionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleRequisicionCompra=new JScrollPane(this.jListColumnasValoresGraficoDetalleRequisicionCompra);
			
			this.jScrollColumnasValoresGraficoDetalleRequisicionCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleRequisicionCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleRequisicionCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jListColumnasSelectReporteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jScrollColumnasValoresGraficoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleRequisicionCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleRequisicionCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jLabelTiposGraficosReportesDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleRequisicionCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRequisicionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicionCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicionCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jLabelGenerarExcelReporteDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleRequisicionCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleRequisicionCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleRequisicionCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleRequisicionCompra.setToolTipText("Generar EXCEL"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jButtonGenerarExcelReporteDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jComboBoxTiposReportesDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicionCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicionCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jLabelTiposArchivoReporteDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleRequisicionCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleRequisicionCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleRequisicionCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleRequisicionCompra.setToolTipText("Generar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jButtonGenerarReporteDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleRequisicionCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleRequisicionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleRequisicionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleRequisicionCompra.setToolTipText("Cancelar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRequisicionCompra.add(this.jButtonCerrarReporteDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleRequisicionCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleRequisicionCompra= new JScrollPane(jPanelReporteDinamicoDetalleRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicion Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleRequisicionCompra);
		this.jInternalFrameReporteDinamicoDetalleRequisicionCompra.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleRequisicionCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleRequisicionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleRequisicionCompra.setName("jPanelImportacionDetalleRequisicionCompra"); 
		
		this.jPanelImportacionDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleRequisicionCompra.setLayout(gridaBagLayoutImportacionDetalleRequisicionCompra);
		
		
		this.jInternalFrameImportacionDetalleRequisicionCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleRequisicionCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleRequisicionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRequisicionCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleRequisicionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setResizable(true);
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setClosable(true);
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleRequisicionCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setResizable(true);
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setClosable(true);
	    this.jInternalFrameImportacionDetalleRequisicionCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicion Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleRequisicionCompra = new JLabelMe();

		this.jLabelArchivoImportacionDetalleRequisicionCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleRequisicionCompra.add(this.jLabelArchivoImportacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleRequisicionCompra = new JFileChooser();		
		this.jFileChooserImportacionDetalleRequisicionCompra.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleRequisicionCompra = new JButtonMe();
		this.jButtonAbrirImportacionDetalleRequisicionCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleRequisicionCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleRequisicionCompra.setToolTipText("Generar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRequisicionCompra.add(this.jButtonAbrirImportacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleRequisicionCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleRequisicionCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleRequisicionCompra.add(this.jLabelPathArchivoImportacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleRequisicionCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleRequisicionCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleRequisicionCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleRequisicionCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRequisicionCompra.add(this.jTextFieldPathArchivoImportacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleRequisicionCompra = new JButtonMe();
		this.jButtonGenerarImportacionDetalleRequisicionCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleRequisicionCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleRequisicionCompra.setToolTipText("Generar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRequisicionCompra.add(this.jButtonGenerarImportacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleRequisicionCompra = new JButtonMe();
		this.jButtonCerrarImportacionDetalleRequisicionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleRequisicionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleRequisicionCompra.setToolTipText("Cancelar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRequisicionCompra.add(this.jButtonCerrarImportacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleRequisicionCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleRequisicionCompra= new JScrollPane(jPanelImportacionDetalleRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleRequisicionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleRequisicionCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleRequisicionCompra);
		this.jInternalFrameImportacionDetalleRequisicionCompra.getContentPane().add(this.jScrollPanelImportacionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleRequisicionCompra() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleRequisicionCompra = new JButtonMe();
		this.jButtonAbrirTotalesDetalleRequisicionCompra.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleRequisicionCompra,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleRequisicionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleRequisicionCompra.setName("jPanelTotalesDetalleRequisicionCompra"); 
		
		this.jPanelTotalesDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleRequisicionCompra.setLayout(gridaBagLayoutTotalesDetalleRequisicionCompra);
		
		
		this.jInternalFrameTotalesDetalleRequisicionCompra= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleRequisicionCompra= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleRequisicionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRequisicionCompra= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleRequisicionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleRequisicionCompra.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleRequisicionCompra.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleRequisicionCompra.setResizable(true);
	    this.jInternalFrameTotalesDetalleRequisicionCompra.setClosable(true);
	    this.jInternalFrameTotalesDetalleRequisicionCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicion Compras"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleRequisicionCompra.ipady =150;
		
		this.jPanelTotalesDetalleRequisicionCompra.add(jScrollPanelDatosDetalleRequisicionCompraTotales, this.gridBagConstraintsDetalleRequisicionCompra);//this.jTableDatosDetalleRequisicionCompraTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleRequisicionCompra = new JButtonMe();
		this.jButtonCerrarTotalesDetalleRequisicionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleRequisicionCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleRequisicionCompra.setToolTipText("Cancelar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleRequisicionCompra.add(this.jButtonCerrarTotalesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleRequisicionCompra = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleRequisicionCompra= new JScrollPane(jPanelTotalesDetalleRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleRequisicionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleRequisicionCompra.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleRequisicionCompra);
		this.jInternalFrameTotalesDetalleRequisicionCompra.getContentPane().add(this.jScrollPanelTotalesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleRequisicionCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleRequisicionCompra = new JButtonMe();
			this.jButtonAbrirOrderByDetalleRequisicionCompra.setText("Orden");
			this.jButtonAbrirOrderByDetalleRequisicionCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleRequisicionCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleRequisicionCompra";
			inputMap = this.jButtonAbrirOrderByDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleRequisicionCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleRequisicionCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleRequisicionCompra.setName("jPanelOrderByDetalleRequisicionCompra"); 
			
			this.jPanelOrderByDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleRequisicionCompra.setLayout(gridaBagLayoutOrderByDetalleRequisicionCompra);
			
			
			this.jTableDatosDetalleRequisicionCompraOrderBy = new JTableMe();        
			this.jTableDatosDetalleRequisicionCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleRequisicionCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleRequisicionCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleRequisicionCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleRequisicionCompraOrderBy.setViewportView(this.jTableDatosDetalleRequisicionCompraOrderBy);
			this.jTableDatosDetalleRequisicionCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleRequisicionCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleRequisicionCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleRequisicionCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleRequisicionCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleRequisicionCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleRequisicionCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleRequisicionCompra.setTitle("Orden");
			this.jInternalFrameOrderByDetalleRequisicionCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleRequisicionCompra.setResizable(true);
			this.jInternalFrameOrderByDetalleRequisicionCompra.setClosable(true);
			this.jInternalFrameOrderByDetalleRequisicionCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicion Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleRequisicionCompra.ipady =150;
				
			this.jPanelOrderByDetalleRequisicionCompra.add(jScrollPanelDatosDetalleRequisicionCompraOrderBy, this.gridBagConstraintsDetalleRequisicionCompra);//this.jTableDatosDetalleRequisicionCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleRequisicionCompra = new JButtonMe();
			this.jButtonCerrarOrderByDetalleRequisicionCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleRequisicionCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleRequisicionCompra.setToolTipText("Cancelar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleRequisicionCompra.add(this.jButtonCerrarOrderByDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleRequisicionCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleRequisicionCompra= new JScrollPane(jPanelOrderByDetalleRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleRequisicionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleRequisicionCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleRequisicionCompra);
			
			this.jInternalFrameOrderByDetalleRequisicionCompra.getContentPane().add(this.jScrollPanelOrderByDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
		
		} else {
			this.jButtonAbrirOrderByDetalleRequisicionCompra = new JButtonMe();
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
			&& this.detallerequisicioncompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleRequisicionCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleRequisicionCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleRequisicionCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleRequisicionCompra.getRowHeight();//DetalleRequisicionCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleRequisicionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra.isSelected()) {
					iHeightTable=DetalleRequisicionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleRequisicionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleRequisicionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleRequisicionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleRequisicionCompra.isSelected()) {
					iHeightTable=DetalleRequisicionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleRequisicionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleRequisicionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleRequisicionCompra!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleRequisicionCompra.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleRequisicionCompra!=null && this.jInternalFrameOrderByDetalleRequisicionCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleRequisicionCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleRequisicionCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleRequisicionCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleRequisicionCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleRequisicionCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleRequisicionCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleRequisicionCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetalleRequisicionCompra!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleRequisicionCompra.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleRequisicionCompra.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallerequisicioncompraLogic.getDetalleRequisicionCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallerequisicioncompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleRequisicionCompra> TraerDetalleRequisicionCompraBeans(List<DetalleRequisicionCompra> detallerequisicioncompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleRequisicionCompra detallerequisicioncompra:detallerequisicioncompras) {
					
				if(!(DetalleRequisicionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleRequisicionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallerequisicioncompra.setsDetalleGeneralEntityReporte(DetalleRequisicionCompraConstantesFunciones.getDetalleRequisicionCompraDescripcion(detallerequisicioncompra));
										
						
					
						
					
				} else  {
							
					//detallerequisicioncompra.setsDetalleGeneralEntityReporte(detallerequisicioncompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallerequisicioncomprabeans.add(detallerequisicioncomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallerequisicioncompras;
    }
	//PARA REPORTES FIN
}
