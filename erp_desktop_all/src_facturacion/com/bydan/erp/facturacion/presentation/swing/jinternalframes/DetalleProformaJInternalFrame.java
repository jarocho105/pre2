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
import com.bydan.erp.facturacion.util.DetalleProformaConstantesFunciones;

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
public class DetalleProformaJInternalFrame extends DetalleProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleProforma;
	
	protected JMenuBar jmenuBarDetalleProforma;
	
	protected JMenu jmenuDetalleProforma;
	protected JMenu jmenuDatosDetalleProforma;
	protected JMenu jmenuArchivoDetalleProforma;
	protected JMenu jmenuAccionesDetalleProforma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleProforma;	
	protected GridBagConstraints gridBagConstraintsDetalleProforma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleProformaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleProforma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleProforma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleProforma;	
	
	
	
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

	protected ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_proforma="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EmpaqueBeanSwingJInternalFrame empaqueBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empaque="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EstadoDetalleProformaBeanSwingJInternalFrame estadodetalleproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleproforma="";
	
	public DetalleProformaSessionBean detalleproformaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ProformaSessionBean proformaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EmpaqueSessionBean empaqueSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EstadoDetalleProformaSessionBean estadodetalleproformaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleProforma> detalleproformas;		
	public List<DetalleProforma> detalleproformasEliminados;	
	public List<DetalleProforma> detalleproformasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleProforma;		
	protected JButton jButtonAbrirOrderByDetalleProforma;
	
	
	//protected JPanel jPanelOrderByDetalleProforma;
	//public JScrollPane jScrollPanelOrderByDetalleProforma;	
	//protected JButton jButtonCerrarOrderByDetalleProforma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleProformaLogic detalleproformaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleProforma;
	public JScrollPane jScrollPanelDatosEdicionDetalleProforma;
	public JScrollPane jScrollPanelDatosGeneralDetalleProforma;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleProformaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleProforma;
	//public JScrollPane jScrollPanelImportacionDetalleProforma;
	
	
	
	protected JPanel jPanelAccionesDetalleProforma;
	
    protected JPanel jPanelPaginacionDetalleProforma;
    protected JPanel jPanelParametrosReportesDetalleProforma;
	protected JPanel jPanelParametrosReportesAccionesDetalleProforma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleProforma;
	protected JPanel jPanelParametrosAuxiliar2DetalleProforma;
	protected JPanel jPanelParametrosAuxiliar3DetalleProforma;
	protected JPanel jPanelParametrosAuxiliar4DetalleProforma;
	//protected JPanel jPanelParametrosAuxiliar5DetalleProforma;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleProforma;
	//protected JPanel jPanelImportacionDetalleProforma;
	
	
	public JTable jTableDatosDetalleProforma;
	
	
	
	//public JTable jTableDatosDetalleProformaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleProforma;
	protected JButton jButtonDuplicarDetalleProforma;
	protected JButton jButtonCopiarDetalleProforma;
	protected JButton jButtonVerFormDetalleProforma;
	protected JButton jButtonNuevoRelacionesDetalleProforma;
	protected JButton jButtonModificarDetalleProforma;
	
    protected JButton jButtonGuardarCambiosTablaDetalleProforma;
	protected JButton jButtonCerrarDetalleProforma;
	
	
	protected JButton jButtonRecargarInformacionDetalleProforma;
	protected JButton jButtonProcesarInformacionDetalleProforma;
	
	
	protected JButton jButtonAnterioresDetalleProforma;
	protected JButton jButtonSiguientesDetalleProforma;
	protected JButton jButtonNuevoGuardarCambiosDetalleProforma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleProforma;
	//protected JButton jButtonCerrarReporteDinamicoDetalleProforma;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleProforma;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleProforma;
	//protected JButton jButtonGenerarImportacionDetalleProforma;
	//protected JButton jButtonCerrarImportacionDetalleProforma;
	//protected JFileChooser jFileChooserImportacionDetalleProforma;
	//protected File fileImportacionDetalleProforma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleProforma;
	protected JButton jButtonDuplicarToolBarDetalleProforma;
	protected JButton jButtonNuevoRelacionesToolBarDetalleProforma;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleProforma;
	protected JButton jButtonCopiarToolBarDetalleProforma;
	protected JButton jButtonVerFormToolBarDetalleProforma;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleProforma;
	protected JButton jButtonCerrarToolBarDetalleProforma;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleProforma;
	protected JButton jButtonProcesarInformacionToolBarDetalleProforma;
	protected JButton jButtonAnterioresToolBarDetalleProforma;
	protected JButton jButtonSiguientesToolBarDetalleProforma;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleProforma;
	protected JButton jButtonAbrirOrderByToolBarDetalleProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleProforma;
	protected JMenuItem jMenuItemDuplicarDetalleProforma;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleProforma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleProforma;
	protected JMenuItem jMenuItemCopiarDetalleProforma;
	protected JMenuItem jMenuItemVerFormDetalleProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleProforma;
	protected JMenuItem jMenuItemCerrarDetalleProforma;
	protected JMenuItem jMenuItemDetalleCerrarDetalleProforma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleProforma;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleProforma;
	protected JMenuItem jMenuItemProcesarInformacionDetalleProforma;
	protected JMenuItem jMenuItemAnterioresDetalleProforma;
	protected JMenuItem jMenuItemSiguientesDetalleProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleProforma;
	protected JMenuItem jMenuItemAbrirOrderByDetalleProforma;
	protected JMenuItem jMenuItemMostrarOcultarDetalleProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleProforma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleProforma;
	protected JCheckBox jCheckBoxSeleccionadosDetalleProforma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleProforma;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleProforma;
	protected JTextField jTextFieldValorCampoGeneralDetalleProforma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleProforma;
	//public JList<Reporte> jListColumnasSelectReporteDetalleProforma;
	//public JScrollPane jScrollColumnasSelectReporteDetalleProforma;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleProforma;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleProforma;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleProforma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleProforma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleProforma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleProforma;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleProforma;
	
		
	//public JLabel jLabelArchivoImportacionDetalleProforma;	
	//public JLabel jLabelPathArchivoImportacionDetalleProforma;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleProforma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleProforma;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleProforma;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleProforma;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleProforma;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleProforma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleProforma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleProforma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleProforma;
	public JPanel jPanelFK_IdBodegaDetalleProforma;
	public JButton jButtonFK_IdBodegaDetalleProforma;
	public JPanel jPanelFK_IdCentroCostoDetalleProforma;
	public JButton jButtonFK_IdCentroCostoDetalleProforma;
	public JPanel jPanelFK_IdEmpaqueDetalleProforma;
	public JButton jButtonFK_IdEmpaqueDetalleProforma;
	public JPanel jPanelFK_IdEstadoDetalleProformaDetalleProforma;
	public JButton jButtonFK_IdEstadoDetalleProformaDetalleProforma;
	public JPanel jPanelFK_IdProductoDetalleProforma;
	public JButton jButtonFK_IdProductoDetalleProforma;
	public JPanel jPanelFK_IdProformaDetalleProforma;
	public JButton jButtonFK_IdProformaDetalleProforma;
	public JPanel jPanelFK_IdUnidadDetalleProforma;
	public JButton jButtonFK_IdUnidadDetalleProforma;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleProforma;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleProforma;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleProforma= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleProforma;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleProforma;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleProforma= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleProformaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleProformaArbol= new JButtonMe();

	
	public JPanel jPanelid_empaqueFK_IdEmpaqueDetalleProforma;
	public JLabel jLabelid_empaqueFK_IdEmpaqueDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empaqueFK_IdEmpaqueDetalleProforma;
	public JButton jButtonid_empaqueFK_IdEmpaqueDetalleProforma= new JButtonMe();
	public JButton jButtonid_empaqueFK_IdEmpaqueDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_empaqueFK_IdEmpaqueDetalleProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma;
	public JLabel jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma;
	public JButton jButtonid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma= new JButtonMe();
	public JButton jButtonid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleProforma;
	public JLabel jLabelid_productoFK_IdProductoDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleProforma;
	public JButton jButtonid_productoFK_IdProductoDetalleProforma= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleProformaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleProforma;
	
	public JPanel jPanelid_proformaFK_IdProformaDetalleProforma;
	public JLabel jLabelid_proformaFK_IdProformaDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_proformaFK_IdProformaDetalleProforma;
	public JButton jButtonid_proformaFK_IdProformaDetalleProforma= new JButtonMe();
	public JButton jButtonid_proformaFK_IdProformaDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_proformaFK_IdProformaDetalleProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleProforma;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleProforma;
	public JButton jButtonid_unidadFK_IdUnidadDetalleProforma= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleProformaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleProformaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleProformaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProformaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProformaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProformaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleProforma)	{
		this.jButtonRecargarInformacionDetalleProforma = jButtonRecargarInformacionDetalleProforma;
	}
	
	public JButton getjButtonProcesarInformacionDetalleProforma() {
		return this.jButtonProcesarInformacionDetalleProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleProforma)	{
		this.jButtonProcesarInformacionDetalleProforma = jButtonProcesarInformacionDetalleProforma;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleProforma() {
		return this.jButtonRecargarInformacionDetalleProforma;
	}
	
	
	public List<DetalleProforma> getdetalleproformas() {
		return this.detalleproformas;
	}

	public void setdetalleproformas(List<DetalleProforma> detalleproformas) {
		this.detalleproformas = detalleproformas;
	}
	
	public List<DetalleProforma> getdetalleproformasAux() {
		return this.detalleproformasAux;
	}

	public void setdetalleproformasAux(List<DetalleProforma> detalleproformasAux) {
		this.detalleproformasAux = detalleproformasAux;
	}
	
	public List<DetalleProforma> getdetalleproformasEliminados() {
		return this.detalleproformasEliminados;
	}

	public void setDetalleProformasEliminados(List<DetalleProforma> detalleproformasEliminados) {
		this.detalleproformasEliminados = detalleproformasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleProforma() {
		return jComboBoxTiposSeleccionarDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleProforma(
			JComboBox jComboBoxTiposSeleccionarDetalleProforma) {
		this.jComboBoxTiposSeleccionarDetalleProforma = jComboBoxTiposSeleccionarDetalleProforma;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleProforma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleProforma() {
		return jTextFieldValorCampoGeneralDetalleProforma;
	}

	public void setjTextFieldValorCampoGeneralDetalleProforma(
			JTextField jTextFieldValorCampoGeneralDetalleProforma) {
		this.jTextFieldValorCampoGeneralDetalleProforma = jTextFieldValorCampoGeneralDetalleProforma;
	}

	public void setBorderResaltarValorCampoGeneralDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleProforma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleProforma() {
		return this.jCheckBoxSeleccionarTodosDetalleProforma;
	}

	public void setjCheckBoxSeleccionarTodosDetalleProforma(
			JCheckBox jCheckBoxSeleccionarTodosDetalleProforma) {
		this.jCheckBoxSeleccionarTodosDetalleProforma = jCheckBoxSeleccionarTodosDetalleProforma;
	}

	public void setBorderResaltarSeleccionarTodosDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleProforma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleProforma() {
		return this.jCheckBoxSeleccionadosDetalleProforma;
	}

	public void setjCheckBoxSeleccionadosDetalleProforma(
			JCheckBox jCheckBoxSeleccionadosDetalleProforma) {
		this.jCheckBoxSeleccionadosDetalleProforma = jCheckBoxSeleccionadosDetalleProforma;
	}
	
	public void setBorderResaltarSeleccionadosDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleProforma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleProforma() {
		return this.jComboBoxTiposArchivosReportesDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleProforma(
			JComboBox jComboBoxTiposArchivosReportesDetalleProforma) {
		this.jComboBoxTiposArchivosReportesDetalleProforma = jComboBoxTiposArchivosReportesDetalleProforma;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleProforma() {
		return this.jComboBoxTiposReportesDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleProforma(
			JComboBox jComboBoxTiposReportesDetalleProforma) {
		this.jComboBoxTiposReportesDetalleProforma = jComboBoxTiposReportesDetalleProforma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleProforma() {
	//	return jComboBoxTiposReportesDinamicoDetalleProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleProforma(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleProforma) {
	//	this.jComboBoxTiposReportesDinamicoDetalleProforma = jComboBoxTiposReportesDinamicoDetalleProforma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleProforma() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleProforma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleProforma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleProforma = jComboBoxTiposArchivosReportesDinamicoDetalleProforma;
	//}
	
	public void setBorderResaltarTiposReportesDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleProforma() {
		return this.jComboBoxTiposGraficosReportesDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleProforma(
			JComboBox jComboBoxTiposGraficosReportesDetalleProforma) {
		this.jComboBoxTiposGraficosReportesDetalleProforma = jComboBoxTiposGraficosReportesDetalleProforma;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleProforma() {
		return this.jComboBoxTiposPaginacionDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleProforma(
			JComboBox jComboBoxTiposPaginacionDetalleProforma) {
		this.jComboBoxTiposPaginacionDetalleProforma = jComboBoxTiposPaginacionDetalleProforma;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleProforma() {
		return this.jComboBoxTiposRelacionesDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleProforma() {
		return this.jComboBoxTiposAccionesDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleProforma(
			JComboBox jComboBoxTiposRelacionesDetalleProforma) {
		this.jComboBoxTiposRelacionesDetalleProforma = jComboBoxTiposRelacionesDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleProforma(
			JComboBox jComboBoxTiposAccionesDetalleProforma) {
		this.jComboBoxTiposAccionesDetalleProforma = jComboBoxTiposAccionesDetalleProforma;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleProforma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleProforma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleProforma() {
	//	return jCheckBoxConGraficoDinamicoDetalleProforma;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleProforma(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleProforma) {
	//	this.jCheckBoxConGraficoDinamicoDetalleProforma = jCheckBoxConGraficoDinamicoDetalleProforma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleProforma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleProforma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleProforma .setBorder(borderResaltar);		
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
		this.detalleproformaSessionBean=new DetalleProformaSessionBean();
		
		this.detalleproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleproformaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProforma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"nuevo","nuevo","Nuevo"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"duplicar","duplicar","Duplicar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"copiar","copiar","Copiar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"ver_form","ver_form","Ver"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"recargar","recargar","Recargar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleProforma,this.jTtoolBarDetalleProforma,
							"cerrar","cerrar","Salir"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleProforma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleProforma;
			
				this.jButtonProcesarInformacionToolBarDetalleProforma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleProforma;
				
		//protected JButton jButtonModificarToolBarDetalleProforma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleProforma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleProforma=new JMenuMe("General");
		this.jmenuArchivoDetalleProforma=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleProforma=new JMenuMe("Acciones");
		this.jmenuDatosDetalleProforma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleProforma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleProforma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleProforma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleProforma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleProforma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleProforma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleProforma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleProforma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleProforma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleProforma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleProforma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleProforma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleProforma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleProforma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleProforma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleProforma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleProforma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleProforma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleProforma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleProforma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleProforma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleProforma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleProforma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleProforma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleProforma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleProforma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleProforma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleProforma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleProforma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleProforma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleProforma.add(this.jMenuItemCerrarDetalleProforma);
			
			this.jmenuAccionesDetalleProforma.add(this.jMenuItemNuevoDetalleProforma);
			this.jmenuAccionesDetalleProforma.add(this.jMenuItemNuevoGuardarCambiosDetalleProforma);
			this.jmenuAccionesDetalleProforma.add(this.jMenuItemNuevoRelacionesDetalleProforma);
			this.jmenuAccionesDetalleProforma.add(this.jMenuItemGuardarCambiosTablaDetalleProforma);		
			this.jmenuAccionesDetalleProforma.add(this.jMenuItemDuplicarDetalleProforma);		
			this.jmenuAccionesDetalleProforma.add(this.jMenuItemCopiarDetalleProforma);		
			this.jmenuAccionesDetalleProforma.add(this.jMenuItemVerFormDetalleProforma);		
			
			this.jmenuDatosDetalleProforma.add(this.jMenuItemRecargarInformacionDetalleProforma);				
			this.jmenuDatosDetalleProforma.add(this.jMenuItemAnterioresDetalleProforma);				
			this.jmenuDatosDetalleProforma.add(this.jMenuItemSiguientesDetalleProforma);				
			this.jmenuDatosDetalleProforma.add(this.jMenuItemAbrirOrderByDetalleProforma);				
			this.jmenuDatosDetalleProforma.add(this.jMenuItemMostrarOcultarDetalleProforma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleProforma.add(this.jMenuItemGuardarCambiosDetalleProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleProforma.add(this.jmenuArchivoDetalleProforma);		
			this.jmenuBarDetalleProforma.add(this.jmenuAccionesDetalleProforma);		
			this.jmenuBarDetalleProforma.add(this.jmenuDatosDetalleProforma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleProforma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleProforma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleProforma.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleProforma= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleProforma.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleProforma.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleProforma,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleProforma = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleProforma.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleProforma.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleProforma= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleProforma.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleProforma= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleProforma.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleProforma.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleProforma,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleProforma = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleProforma.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleProforma.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleProforma= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpaqueDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpaqueDetalleProforma.setToolTipText("Buscar Por Empaque ");
		this.jButtonFK_IdEmpaqueDetalleProforma= new JButtonMe();
		this.jButtonFK_IdEmpaqueDetalleProforma.setText("Buscar");
		this.jButtonFK_IdEmpaqueDetalleProforma.setToolTipText("Buscar Por Empaque ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpaqueDetalleProforma,"buscar_button","Buscar Por Empaque ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpaqueDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empaqueFK_IdEmpaqueDetalleProforma = new JLabelMe();
		jLabelid_empaqueFK_IdEmpaqueDetalleProforma.setText("Empaque :");
		jLabelid_empaqueFK_IdEmpaqueDetalleProforma.setToolTipText("Empaque");
		jLabelid_empaqueFK_IdEmpaqueDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empaqueFK_IdEmpaqueDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empaqueFK_IdEmpaqueDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empaqueFK_IdEmpaqueDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empaqueFK_IdEmpaqueDetalleProforma= new JComboBoxMe();
		jComboBoxid_empaqueFK_IdEmpaqueDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueFK_IdEmpaqueDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueFK_IdEmpaqueDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empaqueFK_IdEmpaqueDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetalleProformaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleProformaDetalleProforma.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetalleProformaDetalleProforma= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleProformaDetalleProforma.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleProformaDetalleProforma.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleProformaDetalleProforma,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleProformaDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma = new JLabelMe();
		jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma.setText("Estado :");
		jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma.setToolTipText("Estado");
		jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma= new JComboBoxMe();
		jComboBoxid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleProforma.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleProforma= new JButtonMe();
		this.jButtonFK_IdProductoDetalleProforma.setText("Buscar");
		this.jButtonFK_IdProductoDetalleProforma.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleProforma,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleProforma = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleProforma.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleProforma.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleProforma= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleProforma= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleProforma.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleProforma.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleProforma.setFocusable(false);

		this.jPanelFK_IdProformaDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProformaDetalleProforma.setToolTipText("Buscar Por Proforma ");
		this.jButtonFK_IdProformaDetalleProforma= new JButtonMe();
		this.jButtonFK_IdProformaDetalleProforma.setText("Buscar");
		this.jButtonFK_IdProformaDetalleProforma.setToolTipText("Buscar Por Proforma ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProformaDetalleProforma,"buscar_button","Buscar Por Proforma ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProformaDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_proformaFK_IdProformaDetalleProforma = new JLabelMe();
		jLabelid_proformaFK_IdProformaDetalleProforma.setText("Proforma :");
		jLabelid_proformaFK_IdProformaDetalleProforma.setToolTipText("Proforma");
		jLabelid_proformaFK_IdProformaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_proformaFK_IdProformaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_proformaFK_IdProformaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_proformaFK_IdProformaDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_proformaFK_IdProformaDetalleProforma= new JComboBoxMe();
		jComboBoxid_proformaFK_IdProformaDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proformaFK_IdProformaDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proformaFK_IdProformaDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_proformaFK_IdProformaDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleProforma.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleProforma= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleProforma.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleProforma.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleProforma,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleProforma = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleProforma.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleProforma.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleProforma= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleProforma=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleProforma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleProforma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleProforma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleProforma = new DetalleProformaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Proforma DATOS");
			this.jInternalFrameDetalleFormDetalleProforma = new DetalleProformaDetalleFormJInternalFrame(jDesktopPane,this.detalleproformaSessionBean.getConGuardarRelaciones(),this.detalleproformaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleProforma = null;//new DetalleProformaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleProforma= new GridBagLayout();
		
		
		this.jTableDatosDetalleProforma = new JTableMe();      
		
		String sToolTipDetalleProforma="";
		sToolTipDetalleProforma=DetalleProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleProforma+="(Facturacion.DetalleProforma)";
		}
		
		if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleProforma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleProforma.setToolTipText(sToolTipDetalleProforma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleProforma);
		this.jTableDatosDetalleProforma.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleProforma.setRowSelectionAllowed(true);
		this.jTableDatosDetalleProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleProforma = new JButtonMe();
		this.jButtonDuplicarDetalleProforma = new JButtonMe();
		this.jButtonCopiarDetalleProforma = new JButtonMe();
		this.jButtonVerFormDetalleProforma = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleProforma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleProforma = new JButtonMe();
		this.jButtonCerrarDetalleProforma = new JButtonMe();
		
		this.jScrollPanelDatosDetalleProforma = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleProforma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Proforma";
		
		if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleProforma.setToolTipText("Acciones");
        this.jPanelAccionesDetalleProforma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleProforma=new ReporteDinamicoJInternalFrame(DetalleProformaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleProforma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleProforma=new ImportacionJInternalFrame(DetalleProformaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleProforma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleProforma = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleProforma.setText("Orden");
		this.jButtonAbrirOrderByDetalleProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleProforma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleProforma,false,this);
			
			//this.cargarOrderByDetalleProforma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleProforma,true,this);
			
			//this.cargarOrderByDetalleProforma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleProforma.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleProforma.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleProforma.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosDetalleProforma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleProforma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleProforma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleProforma.setText("Nuevo");
		this.jButtonDuplicarDetalleProforma.setText("Duplicar");
		this.jButtonCopiarDetalleProforma.setText("Copiar");
		this.jButtonVerFormDetalleProforma.setText("Ver");
		this.jButtonNuevoRelacionesDetalleProforma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleProforma.setText("Guardar");
		this.jButtonCerrarDetalleProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleProforma,"nuevo_button","Nuevo",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleProforma,"duplicar_button","Duplicar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleProforma,"copiar_button","Copiar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleProforma,"ver_form","Ver",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleProforma,"nuevorelaciones_button","Nuevo Rel",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleProforma,"guardarcambiostabla_button","Guardar",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleProforma,"cerrar_button","Salir",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleProforma.setToolTipText("Nuevo"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleProforma.setToolTipText("Duplicar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleProforma.setToolTipText("Copiar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleProforma.setToolTipText("Ver"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleProforma.setToolTipText("Nuevo Rel"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleProforma.setToolTipText("Guardar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleProforma.setToolTipText("Salir"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleProforma";
		inputMap = this.jButtonNuevoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleProforma"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleProforma";
		inputMap = this.jButtonDuplicarDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleProforma"));
		
		//COPIAR
		sMapKey = "CopiarDetalleProforma";
		inputMap = this.jButtonCopiarDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleProforma"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleProforma";
		inputMap = this.jButtonVerFormDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleProforma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleProforma";
		inputMap = this.jButtonNuevoRelacionesDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleProforma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleProforma";
		inputMap = this.jButtonModificarDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleProforma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleProforma";
		inputMap = this.jButtonCerrarDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleProforma";
		inputMap = this.jButtonGuardarCambiosTablaDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleProforma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleProforma.setName("jPanelParametrosReportesDetalleProforma"); 
		
		this.jPanelParametrosReportesAccionesDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleProforma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleProforma.setName("jPanelParametrosReportesAccionesDetalleProforma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleProforma = new JButtonMe();
		this.jButtonRecargarInformacionDetalleProforma.setText("Recargar");
		this.jButtonRecargarInformacionDetalleProforma.setToolTipText("Recargar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleProforma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleProforma = new JButtonMe();
		this.jButtonProcesarInformacionDetalleProforma.setText("Procesar");
		this.jButtonProcesarInformacionDetalleProforma.setToolTipText("Procesar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleProforma.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleProforma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleProforma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleProforma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleProforma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleProforma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleProforma.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleProforma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleProforma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleProforma.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleProforma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleProforma.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleProforma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleProforma.setText("Accion");
		this.jComboBoxTiposAccionesDetalleProforma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleProforma.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleProforma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleProforma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleProforma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleProforma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleProforma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleProforma = new JLabelMe();
		
		this.jLabelAccionesDetalleProforma.setText("Acciones");		
		this.jLabelAccionesDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleProforma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleProforma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleProforma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleProforma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleProforma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleProforma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleProforma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleProforma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleProforma.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleProforma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleProforma = new JButtonMe();
		//this.jButtonAnterioresDetalleProforma.setText("<<");
        this.jButtonAnterioresDetalleProforma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleProforma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleProforma = new JButtonMe();
		//this.jButtonSiguientesDetalleProforma.setText(">>");
        this.jButtonSiguientesDetalleProforma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleProforma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleProforma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleProforma.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleProforma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleProforma,"nuevoguardarcambios_button","Nue",this.detalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleProforma";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleProforma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleProforma";
		inputMap = this.jButtonRecargarInformacionDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleProforma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleProforma";
		inputMap = this.jButtonSiguientesDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleProforma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleProforma";
		inputMap = this.jButtonAnterioresDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleProforma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleProforma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleProforma.setMinimumSize(new Dimension(this.getWidth(),DetalleProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleProforma.setMaximumSize(new Dimension(this.getWidth(),DetalleProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleProforma.setPreferredSize(new Dimension(this.getWidth(),DetalleProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleProformaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleProforma = new GridBagLayout();

			this.jPanelPaginacionDetalleProforma.setLayout(gridaBagLayoutPaginacionDetalleProforma);						
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = 0;
			this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleProforma.add(this.jButtonAnterioresDetalleProforma, this.gridBagConstraintsDetalleProforma);
					
						
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleProforma.gridy = 0;
			
			this.jPanelPaginacionDetalleProforma.add(this.jButtonNuevoGuardarCambiosDetalleProforma, this.gridBagConstraintsDetalleProforma);
						
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleProforma.gridy = 0;
			this.jPanelPaginacionDetalleProforma.add(this.jButtonSiguientesDetalleProforma, this.gridBagConstraintsDetalleProforma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = 1;
			this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleProforma.add(this.jButtonNuevoDetalleProforma, this.gridBagConstraintsDetalleProforma);
						
			
			
			if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
				this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleProforma.gridy = 1;
				this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleProforma.add(this.jButtonGuardarCambiosTablaDetalleProforma, this.gridBagConstraintsDetalleProforma);
			}
			
			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = 1;
			this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleProforma.add(this.jButtonDuplicarDetalleProforma, this.gridBagConstraintsDetalleProforma);
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = 1;
			this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleProforma.add(this.jButtonCopiarDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = 1;
			this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleProforma.add(this.jButtonVerFormDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = 1;
			this.gridBagConstraintsDetalleProforma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleProforma.add(this.jButtonCerrarDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		
		
		this.jButtonRecargarInformacionDetalleProforma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleProforma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleProforma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleProforma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleProforma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleProforma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleProforma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleProforma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleProforma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleProforma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleProforma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleProforma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleProforma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleProforma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleProforma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleProforma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleProforma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleProforma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleProforma.setLayout(gridaBagParametrosReportesDetalleProforma);
			this.jPanelParametrosReportesAccionesDetalleProforma.setLayout(gridaBagParametrosReportesAccionesDetalleProforma);
			
			
			this.jPanelParametrosAuxiliar1DetalleProforma.setLayout(gridaBagParametrosAuxiliar1DetalleProforma);
			this.jPanelParametrosAuxiliar2DetalleProforma.setLayout(gridaBagParametrosAuxiliar2DetalleProforma);
			this.jPanelParametrosAuxiliar3DetalleProforma.setLayout(gridaBagParametrosAuxiliar3DetalleProforma);
			this.jPanelParametrosAuxiliar4DetalleProforma.setLayout(gridaBagParametrosAuxiliar4DetalleProforma);
			//this.jPanelParametrosAuxiliar5DetalleProforma.setLayout(gridaBagParametrosAuxiliar2DetalleProforma);			
			
			
			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProforma.add(this.jButtonRecargarInformacionDetalleProforma, this.gridBagConstraintsDetalleProforma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleProforma.add(this.jComboBoxTiposPaginacionDetalleProforma, this.gridBagConstraintsDetalleProforma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleProforma.add(this.jCheckBoxConAltoMaximoTablaDetalleProforma, this.gridBagConstraintsDetalleProforma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleProforma.add(this.jComboBoxTiposArchivosReportesDetalleProforma, this.gridBagConstraintsDetalleProforma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProforma.add(this.jPanelParametrosAuxiliar1DetalleProforma, this.gridBagConstraintsDetalleProforma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleProforma.add(this.jComboBoxTiposReportesDetalleProforma, this.gridBagConstraintsDetalleProforma);																		
			
			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleProforma.add(this.jComboBoxTiposGraficosReportesDetalleProforma, this.gridBagConstraintsDetalleProforma);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProforma.add(this.jPanelParametrosAuxiliar4DetalleProforma, this.gridBagConstraintsDetalleProforma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProforma.add(this.jComboBoxTiposReportesDetalleProforma, this.gridBagConstraintsDetalleProforma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleProforma.add(this.jCheckBoxGenerarReporteDetalleProforma, this.gridBagConstraintsDetalleProforma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProforma.add(this.jPanelParametrosAuxiliar2DetalleProforma, this.gridBagConstraintsDetalleProforma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleProforma.add(this.jLabelAccionesDetalleProforma, this.gridBagConstraintsDetalleProforma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
				this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleProforma.add(this.jButtonAbrirOrderByDetalleProforma, this.gridBagConstraintsDetalleProforma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProforma.add(this.jComboBoxTiposSeleccionarDetalleProforma, this.gridBagConstraintsDetalleProforma);			
			
			
			/*
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleProforma.add(this.jCheckBoxSeleccionarTodosDetalleProforma, this.gridBagConstraintsDetalleProforma);
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleProforma.add(this.jCheckBoxConGraficoReporteDetalleProforma, this.gridBagConstraintsDetalleProforma);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleProforma.add(this.jCheckBoxSeleccionarTodosDetalleProforma, this.gridBagConstraintsDetalleProforma);															
				
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleProforma.add(this.jCheckBoxSeleccionadosDetalleProforma, this.gridBagConstraintsDetalleProforma);															
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleProforma.add(this.jCheckBoxConGraficoReporteDetalleProforma, this.gridBagConstraintsDetalleProforma);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProforma.add(this.jPanelParametrosAuxiliar3DetalleProforma, this.gridBagConstraintsDetalleProforma);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProforma.add(this.jComboBoxTiposAccionesDetalleProforma, this.gridBagConstraintsDetalleProforma);
	
				
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProforma.add(this.jTextFieldValorCampoGeneralDetalleProforma, this.gridBagConstraintsDetalleProforma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleProforma = new GridBagLayout();

			this.jScrollPanelDatosDetalleProforma.setLayout(gridaBagLayoutDatosDetalleProforma);
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = 0;
			this.gridBagConstraintsDetalleProforma.gridx = 0;
			
			this.jScrollPanelDatosDetalleProforma.add(this.jTableDatosDetalleProforma, this.gridBagConstraintsDetalleProforma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleProforma.setViewportView(this.jTableDatosDetalleProforma);
		this.jTableDatosDetalleProforma.setFillsViewportHeight(true);
		this.jTableDatosDetalleProforma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleProforma= new GridBagLayout();
		this.jPanelAccionesDetalleProforma.setLayout(gridaBagLayoutAccionesDetalleProforma);
		
		
		/*	
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = 0;
		this.gridBagConstraintsDetalleProforma.gridx = 0;
			
		this.jPanelAccionesDetalleProforma.add(this.jButtonNuevoDetalleProforma, this.gridBagConstraintsDetalleProforma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleProforma= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleProforma.setLayout(gridaBagLayoutFK_IdBodegaDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 0;
		jPanelFK_IdBodegaDetalleProforma.add(jLabelid_bodegaFK_IdBodegaDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 1;
		jPanelFK_IdBodegaDetalleProforma.add(jComboBoxid_bodegaFK_IdBodegaDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 1;
		gridBagConstraintsDetalleProforma.gridx =1;
		jPanelFK_IdBodegaDetalleProforma.add(jButtonFK_IdBodegaDetalleProforma, gridBagConstraintsDetalleProforma);

		jTabbedPaneBusquedasDetalleProforma.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleProforma);
		jTabbedPaneBusquedasDetalleProforma.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleProforma= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleProforma.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 0;
		jPanelFK_IdCentroCostoDetalleProforma.add(jLabelid_centro_costoFK_IdCentroCostoDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 1;
		jPanelFK_IdCentroCostoDetalleProforma.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 1;
		gridBagConstraintsDetalleProforma.gridx =1;
		jPanelFK_IdCentroCostoDetalleProforma.add(jButtonFK_IdCentroCostoDetalleProforma, gridBagConstraintsDetalleProforma);

		jTabbedPaneBusquedasDetalleProforma.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleProforma);
		jTabbedPaneBusquedasDetalleProforma.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpaqueDetalleProforma= new GridBagLayout();
		gridaBagLayoutFK_IdEmpaqueDetalleProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpaqueDetalleProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpaqueDetalleProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpaqueDetalleProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpaqueDetalleProforma.setLayout(gridaBagLayoutFK_IdEmpaqueDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 0;
		jPanelFK_IdEmpaqueDetalleProforma.add(jLabelid_empaqueFK_IdEmpaqueDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 1;
		jPanelFK_IdEmpaqueDetalleProforma.add(jComboBoxid_empaqueFK_IdEmpaqueDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 1;
		gridBagConstraintsDetalleProforma.gridx =1;
		jPanelFK_IdEmpaqueDetalleProforma.add(jButtonFK_IdEmpaqueDetalleProforma, gridBagConstraintsDetalleProforma);

		jTabbedPaneBusquedasDetalleProforma.addTab("3.-Por Empaque ", jPanelFK_IdEmpaqueDetalleProforma);
		jTabbedPaneBusquedasDetalleProforma.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleProformaDetalleProforma= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleProformaDetalleProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleProformaDetalleProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleProformaDetalleProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleProformaDetalleProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleProformaDetalleProforma.setLayout(gridaBagLayoutFK_IdEstadoDetalleProformaDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 0;
		jPanelFK_IdEstadoDetalleProformaDetalleProforma.add(jLabelid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 1;
		jPanelFK_IdEstadoDetalleProformaDetalleProforma.add(jComboBoxid_estado_detalle_proformaFK_IdEstadoDetalleProformaDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 1;
		gridBagConstraintsDetalleProforma.gridx =1;
		jPanelFK_IdEstadoDetalleProformaDetalleProforma.add(jButtonFK_IdEstadoDetalleProformaDetalleProforma, gridBagConstraintsDetalleProforma);

		jTabbedPaneBusquedasDetalleProforma.addTab("4.-Por Estado ", jPanelFK_IdEstadoDetalleProformaDetalleProforma);
		jTabbedPaneBusquedasDetalleProforma.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleProforma= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleProforma.setLayout(gridaBagLayoutFK_IdProductoDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 0;
		jPanelFK_IdProductoDetalleProforma.add(jLabelid_productoFK_IdProductoDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 1;
		jPanelFK_IdProductoDetalleProforma.add(jComboBoxid_productoFK_IdProductoDetalleProforma, gridBagConstraintsDetalleProforma);


		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 0;
		jPanelFK_IdProductoDetalleProforma.add(this.jButtonBuscarFK_IdProductoid_productoDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 1;
		gridBagConstraintsDetalleProforma.gridx =1;
		jPanelFK_IdProductoDetalleProforma.add(jButtonFK_IdProductoDetalleProforma, gridBagConstraintsDetalleProforma);

		jTabbedPaneBusquedasDetalleProforma.addTab("5.-Por Producto ", jPanelFK_IdProductoDetalleProforma);
		jTabbedPaneBusquedasDetalleProforma.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdProformaDetalleProforma= new GridBagLayout();
		gridaBagLayoutFK_IdProformaDetalleProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProformaDetalleProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProformaDetalleProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProformaDetalleProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProformaDetalleProforma.setLayout(gridaBagLayoutFK_IdProformaDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 0;
		jPanelFK_IdProformaDetalleProforma.add(jLabelid_proformaFK_IdProformaDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 1;
		jPanelFK_IdProformaDetalleProforma.add(jComboBoxid_proformaFK_IdProformaDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 1;
		gridBagConstraintsDetalleProforma.gridx =1;
		jPanelFK_IdProformaDetalleProforma.add(jButtonFK_IdProformaDetalleProforma, gridBagConstraintsDetalleProforma);

		jTabbedPaneBusquedasDetalleProforma.addTab("6.-Por Proforma ", jPanelFK_IdProformaDetalleProforma);
		jTabbedPaneBusquedasDetalleProforma.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleProforma= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleProforma.setLayout(gridaBagLayoutFK_IdUnidadDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 0;
		jPanelFK_IdUnidadDetalleProforma.add(jLabelid_unidadFK_IdUnidadDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 0;
		gridBagConstraintsDetalleProforma.gridx = 1;
		jPanelFK_IdUnidadDetalleProforma.add(jComboBoxid_unidadFK_IdUnidadDetalleProforma, gridBagConstraintsDetalleProforma);

		gridBagConstraintsDetalleProforma = new GridBagConstraints();
		gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProforma.gridy = 1;
		gridBagConstraintsDetalleProforma.gridx =1;
		jPanelFK_IdUnidadDetalleProforma.add(jButtonFK_IdUnidadDetalleProforma, gridBagConstraintsDetalleProforma);

		jTabbedPaneBusquedasDetalleProforma.addTab("7.-Por Unidad ", jPanelFK_IdUnidadDetalleProforma);
		jTabbedPaneBusquedasDetalleProforma.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleProforma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();						
			this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleProforma.gridx = 0;		
			//this.gridBagConstraintsDetalleProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleProforma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleProforma, this.gridBagConstraintsDetalleProforma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleProforma.gridx = 0;		
		//this.gridBagConstraintsDetalleProforma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleProforma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleProforma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleProforma.gridx = 0;		
			this.gridBagConstraintsDetalleProforma.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleProforma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleProforma, this.gridBagConstraintsDetalleProforma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleProforma, this.gridBagConstraintsDetalleProforma);								
		
		
		/*
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleProforma, this.gridBagConstraintsDetalleProforma);
		*/		
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleProforma.gridx =0;
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleProforma, this.gridBagConstraintsDetalleProforma);
				
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleProforma, this.gridBagConstraintsDetalleProforma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleProformaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleProforma = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleProforma.setLayout(gridaBagLayoutBusquedasParametrosDetalleProforma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleProforma, this.gridBagConstraintsDetalleProforma);
			
			
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
			
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleProforma, this.gridBagConstraintsDetalleProforma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleProforma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleProforma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleProforma.setName("jPanelReporteDinamicoDetalleProforma"); 
		
		this.jPanelReporteDinamicoDetalleProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleProforma.setLayout(gridaBagLayoutReporteDinamicoDetalleProforma);
		
		
		this.jInternalFrameReporteDinamicoDetalleProforma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleProforma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleProforma.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleProforma.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleProforma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proformas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleProforma = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleProforma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleProforma.add(this.jLabelColumnasSelectReporteDetalleProforma, this.gridBagConstraintsDetalleProforma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleProforma = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleProforma=new JScrollPane(this.jListColumnasSelectReporteDetalleProforma);
			
			this.jScrollColumnasSelectReporteDetalleProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleProforma.add(this.jListColumnasSelectReporteDetalleProforma, this.gridBagConstraintsDetalleProforma);
		this.jPanelReporteDinamicoDetalleProforma.add(this.jScrollColumnasSelectReporteDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleProforma = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleProforma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleProforma = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleProforma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleProforma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleProforma=new JScrollPane(this.jListRelacionesSelectReporteDetalleProforma);
			
			this.jScrollRelacionesSelectReporteDetalleProforma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleProforma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleProforma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleProforma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleProforma = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleProforma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleProforma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProforma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProforma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleProforma = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleProforma.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleProforma.add(this.jLabelConGraficoDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleProforma.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleProforma.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleProforma.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProforma.add(this.jCheckBoxConGraficoDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleProforma = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleProforma.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleProforma.add(this.jLabelColumnaCategoriaGraficoDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleProforma.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleProforma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleProforma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleProforma.add(this.jComboBoxColumnaCategoriaGraficoDetalleProforma, this.gridBagConstraintsDetalleProforma);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleProforma = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleProforma.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProforma.add(this.jLabelColumnaCategoriaValorDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleProforma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleProforma.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleProforma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleProforma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleProforma.add(this.jComboBoxColumnaCategoriaValorDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleProforma = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleProforma.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProforma.add(this.jLabelColumnasValoresGraficoDetalleProforma, this.gridBagConstraintsDetalleProforma);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleProforma = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleProforma.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleProforma=new JScrollPane(this.jListColumnasValoresGraficoDetalleProforma);
			
			this.jScrollColumnasValoresGraficoDetalleProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleProforma.add(this.jListColumnasSelectReporteDetalleProforma, this.gridBagConstraintsDetalleProforma);
		this.jPanelReporteDinamicoDetalleProforma.add(this.jScrollColumnasValoresGraficoDetalleProforma, this.gridBagConstraintsDetalleProforma);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleProforma = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleProforma.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProforma.add(this.jLabelTiposGraficosReportesDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleProforma.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleProforma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleProforma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProforma.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleProforma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleProforma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProforma.add(this.jLabelGenerarExcelReporteDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleProforma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleProforma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleProforma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleProforma.setToolTipText("Generar EXCEL"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleProforma.add(this.jButtonGenerarExcelReporteDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleProforma.add(this.jComboBoxTiposReportesDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleProforma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleProforma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProforma.add(this.jLabelTiposArchivoReporteDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleProforma.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleProforma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleProforma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleProforma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleProforma.setToolTipText("Generar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleProforma.add(this.jButtonGenerarReporteDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleProforma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleProforma.setToolTipText("Cancelar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleProforma.add(this.jButtonCerrarReporteDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleProforma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleProforma= new JScrollPane(jPanelReporteDinamicoDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleProforma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleProforma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleProforma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proformas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProforma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleProforma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleProforma);
		this.jInternalFrameReporteDinamicoDetalleProforma.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleProforma, this.gridBagConstraintsDetalleProforma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleProforma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleProforma.setName("jPanelImportacionDetalleProforma"); 
		
		this.jPanelImportacionDetalleProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleProforma.setLayout(gridaBagLayoutImportacionDetalleProforma);
		
		
		this.jInternalFrameImportacionDetalleProforma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleProforma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleProforma.setResizable(true);
	    this.jInternalFrameImportacionDetalleProforma.setClosable(true);
	    this.jInternalFrameImportacionDetalleProforma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleProforma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleProforma.setResizable(true);
	    this.jInternalFrameImportacionDetalleProforma.setClosable(true);
	    this.jInternalFrameImportacionDetalleProforma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proformas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleProforma = new JLabelMe();

		this.jLabelArchivoImportacionDetalleProforma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleProforma.add(this.jLabelArchivoImportacionDetalleProforma, this.gridBagConstraintsDetalleProforma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleProforma = new JFileChooser();		
		this.jFileChooserImportacionDetalleProforma.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleProforma = new JButtonMe();
		this.jButtonAbrirImportacionDetalleProforma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleProforma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleProforma.setToolTipText("Generar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleProforma.add(this.jButtonAbrirImportacionDetalleProforma, this.gridBagConstraintsDetalleProforma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleProforma = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleProforma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleProforma.add(this.jLabelPathArchivoImportacionDetalleProforma, this.gridBagConstraintsDetalleProforma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleProforma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleProforma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleProforma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleProforma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleProforma.add(this.jTextFieldPathArchivoImportacionDetalleProforma, this.gridBagConstraintsDetalleProforma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleProforma = new JButtonMe();
		this.jButtonGenerarImportacionDetalleProforma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleProforma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleProforma.setToolTipText("Generar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleProforma.add(this.jButtonGenerarImportacionDetalleProforma, this.gridBagConstraintsDetalleProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleProforma = new JButtonMe();
		this.jButtonCerrarImportacionDetalleProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleProforma.setToolTipText("Cancelar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleProforma.add(this.jButtonCerrarImportacionDetalleProforma, this.gridBagConstraintsDetalleProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleProforma = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleProforma= new JScrollPane(jPanelImportacionDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleProforma.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleProforma.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleProforma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleProforma);
		this.jInternalFrameImportacionDetalleProforma.getContentPane().add(this.jScrollPanelImportacionDetalleProforma, this.gridBagConstraintsDetalleProforma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleProforma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleProforma = new JButtonMe();
			this.jButtonAbrirOrderByDetalleProforma.setText("Orden");
			this.jButtonAbrirOrderByDetalleProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleProforma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleProforma";
			inputMap = this.jButtonAbrirOrderByDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleProforma"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleProforma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleProforma.setName("jPanelOrderByDetalleProforma"); 
			
			this.jPanelOrderByDetalleProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleProforma.setLayout(gridaBagLayoutOrderByDetalleProforma);
			
			
			this.jTableDatosDetalleProformaOrderBy = new JTableMe();        
			this.jTableDatosDetalleProformaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleProformaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleProformaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleProformaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleProformaOrderBy.setViewportView(this.jTableDatosDetalleProformaOrderBy);
			this.jTableDatosDetalleProformaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleProformaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleProforma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleProforma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleProforma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleProforma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleProforma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleProforma.setTitle("Orden");
			this.jInternalFrameOrderByDetalleProforma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleProforma.setResizable(true);
			this.jInternalFrameOrderByDetalleProforma.setClosable(true);
			this.jInternalFrameOrderByDetalleProforma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proformas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleProforma.ipady =150;
				
			this.jPanelOrderByDetalleProforma.add(jScrollPanelDatosDetalleProformaOrderBy, this.gridBagConstraintsDetalleProforma);//this.jTableDatosDetalleProformaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleProforma = new JButtonMe();
			this.jButtonCerrarOrderByDetalleProforma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleProforma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleProforma.setToolTipText("Cancelar"+" "+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProforma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleProforma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleProforma.add(this.jButtonCerrarOrderByDetalleProforma, this.gridBagConstraintsDetalleProforma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleProforma = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleProforma= new JScrollPane(jPanelOrderByDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleProforma.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleProforma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleProforma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleProforma);
			
			this.jInternalFrameOrderByDetalleProforma.getContentPane().add(this.jScrollPanelOrderByDetalleProforma, this.gridBagConstraintsDetalleProforma);			
		
		} else {
			this.jButtonAbrirOrderByDetalleProforma = new JButtonMe();
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
		int iWidthTableCalculado=0;//4630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleproformaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleProforma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleProforma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleProforma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleProforma.getRowHeight();//DetalleProformaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleProforma.isSelected()) {
					iHeightTable=DetalleProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleProforma.isSelected()) {
					iHeightTable=DetalleProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleProforma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleProforma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleProforma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleProforma!=null && this.jInternalFrameOrderByDetalleProforma.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleproformaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleProforma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleProforma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleProforma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleProforma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleProforma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleProforma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleProforma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleproformaLogic.getDetalleProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleproformas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleProforma> TraerDetalleProformaBeans(List<DetalleProforma> detalleproformas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleProforma detalleproforma:detalleproformas) {
					
				if(!(DetalleProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleproforma.setsDetalleGeneralEntityReporte(DetalleProformaConstantesFunciones.getDetalleProformaDescripcion(detalleproforma));
										
						
					
						
					
				} else  {
							
					//detalleproforma.setsDetalleGeneralEntityReporte(detalleproforma.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleproformabeans.add(detalleproformabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleproformas;
    }
	//PARA REPORTES FIN
}
