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
import com.bydan.erp.facturacion.util.DetalleConsignacionConstantesFunciones;

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
public class DetalleConsignacionJInternalFrame extends DetalleConsignacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleConsignacion;
	
	protected JMenuBar jmenuBarDetalleConsignacion;
	
	protected JMenu jmenuDetalleConsignacion;
	protected JMenu jmenuDatosDetalleConsignacion;
	protected JMenu jmenuArchivoDetalleConsignacion;
	protected JMenu jmenuAccionesDetalleConsignacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleConsignacion;	
	protected GridBagConstraints gridBagConstraintsDetalleConsignacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleConsignacionDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleConsignacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleConsignacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleConsignacion;	
	
	
	
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

	protected ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consignacion="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EstadoDetallePedidoBeanSwingJInternalFrame estadodetallepedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallepedido="";
	
	public DetalleConsignacionSessionBean detalleconsignacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ConsignacionSessionBean consignacionSessionBean;
	public ProductoSessionBean productoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleConsignacion> detalleconsignacions;		
	public List<DetalleConsignacion> detalleconsignacionsEliminados;	
	public List<DetalleConsignacion> detalleconsignacionsAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleConsignacion;		
	protected JButton jButtonAbrirTotalesDetalleConsignacion;		
	
	/*
	protected JPanel jPanelTotalesDetalleConsignacion;
	public JScrollPane jScrollPanelTotalesDetalleConsignacion;	
	protected JButton jButtonCerrarTotalesDetalleConsignacion;
	*/
	
	public List<DetalleConsignacion> detalleconsignacionsTotal= new ArrayList<DetalleConsignacion>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleConsignacion;		
	protected JButton jButtonAbrirOrderByDetalleConsignacion;
	
	
	//protected JPanel jPanelOrderByDetalleConsignacion;
	//public JScrollPane jScrollPanelOrderByDetalleConsignacion;	
	//protected JButton jButtonCerrarOrderByDetalleConsignacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleConsignacionLogic detalleconsignacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleConsignacion;
	public JScrollPane jScrollPanelDatosEdicionDetalleConsignacion;
	public JScrollPane jScrollPanelDatosGeneralDetalleConsignacion;
    //public JScrollPane jScrollPanelDatosDetalleConsignacionTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetalleConsignacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleConsignacion;
	//public JScrollPane jScrollPanelImportacionDetalleConsignacion;
	
	
	
	protected JPanel jPanelAccionesDetalleConsignacion;
	
    protected JPanel jPanelPaginacionDetalleConsignacion;
    protected JPanel jPanelParametrosReportesDetalleConsignacion;
	protected JPanel jPanelParametrosReportesAccionesDetalleConsignacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleConsignacion;
	protected JPanel jPanelParametrosAuxiliar2DetalleConsignacion;
	protected JPanel jPanelParametrosAuxiliar3DetalleConsignacion;
	protected JPanel jPanelParametrosAuxiliar4DetalleConsignacion;
	//protected JPanel jPanelParametrosAuxiliar5DetalleConsignacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleConsignacion;
	//protected JPanel jPanelImportacionDetalleConsignacion;
	
	
	public JTable jTableDatosDetalleConsignacion;
	//public JTable jTableDatosDetalleConsignacionTotales;
	
	
	//public JTable jTableDatosDetalleConsignacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleConsignacion;
	protected JButton jButtonDuplicarDetalleConsignacion;
	protected JButton jButtonCopiarDetalleConsignacion;
	protected JButton jButtonVerFormDetalleConsignacion;
	protected JButton jButtonNuevoRelacionesDetalleConsignacion;
	protected JButton jButtonModificarDetalleConsignacion;
	
    protected JButton jButtonGuardarCambiosTablaDetalleConsignacion;
	protected JButton jButtonCerrarDetalleConsignacion;
	
	
	protected JButton jButtonRecargarInformacionDetalleConsignacion;
	protected JButton jButtonProcesarInformacionDetalleConsignacion;
	
	
	protected JButton jButtonAnterioresDetalleConsignacion;
	protected JButton jButtonSiguientesDetalleConsignacion;
	protected JButton jButtonNuevoGuardarCambiosDetalleConsignacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleConsignacion;
	//protected JButton jButtonCerrarReporteDinamicoDetalleConsignacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleConsignacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleConsignacion;
	//protected JButton jButtonGenerarImportacionDetalleConsignacion;
	//protected JButton jButtonCerrarImportacionDetalleConsignacion;
	//protected JFileChooser jFileChooserImportacionDetalleConsignacion;
	//protected File fileImportacionDetalleConsignacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleConsignacion;
	protected JButton jButtonDuplicarToolBarDetalleConsignacion;
	protected JButton jButtonNuevoRelacionesToolBarDetalleConsignacion;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleConsignacion;
	protected JButton jButtonCopiarToolBarDetalleConsignacion;
	protected JButton jButtonVerFormToolBarDetalleConsignacion;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleConsignacion;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleConsignacion;
	protected JButton jButtonCerrarToolBarDetalleConsignacion;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleConsignacion;
	protected JButton jButtonProcesarInformacionToolBarDetalleConsignacion;
	protected JButton jButtonAnterioresToolBarDetalleConsignacion;
	protected JButton jButtonSiguientesToolBarDetalleConsignacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleConsignacion;
	protected JButton jButtonAbrirOrderByToolBarDetalleConsignacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleConsignacion;
	protected JMenuItem jMenuItemDuplicarDetalleConsignacion;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleConsignacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleConsignacion;
	protected JMenuItem jMenuItemCopiarDetalleConsignacion;
	protected JMenuItem jMenuItemVerFormDetalleConsignacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleConsignacion;
	protected JMenuItem jMenuItemCerrarDetalleConsignacion;
	protected JMenuItem jMenuItemDetalleCerrarDetalleConsignacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleConsignacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleConsignacion;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleConsignacion;
	protected JMenuItem jMenuItemProcesarInformacionDetalleConsignacion;
	protected JMenuItem jMenuItemAnterioresDetalleConsignacion;
	protected JMenuItem jMenuItemSiguientesDetalleConsignacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleConsignacion;
	protected JMenuItem jMenuItemAbrirOrderByDetalleConsignacion;
	protected JMenuItem jMenuItemMostrarOcultarDetalleConsignacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleConsignacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleConsignacion;
	protected JCheckBox jCheckBoxSeleccionadosDetalleConsignacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleConsignacion;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleConsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleConsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleConsignacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleConsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleConsignacion;
	protected JTextField jTextFieldValorCampoGeneralDetalleConsignacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleConsignacion;
	//public JList<Reporte> jListColumnasSelectReporteDetalleConsignacion;
	//public JScrollPane jScrollColumnasSelectReporteDetalleConsignacion;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleConsignacion;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleConsignacion;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleConsignacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleConsignacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleConsignacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleConsignacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleConsignacion;
	
		
	//public JLabel jLabelArchivoImportacionDetalleConsignacion;	
	//public JLabel jLabelPathArchivoImportacionDetalleConsignacion;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleConsignacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleConsignacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleConsignacion;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleConsignacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleConsignacion;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleConsignacion;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleConsignacion;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleConsignacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleConsignacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleConsignacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleConsignacion;
	public JPanel jPanelFK_IdBodegaDetalleConsignacion;
	public JButton jButtonFK_IdBodegaDetalleConsignacion;
	public JPanel jPanelFK_IdConsignacionDetalleConsignacion;
	public JButton jButtonFK_IdConsignacionDetalleConsignacion;
	public JPanel jPanelFK_IdEstadoDetallePedidoDetalleConsignacion;
	public JButton jButtonFK_IdEstadoDetallePedidoDetalleConsignacion;
	public JPanel jPanelFK_IdProductoDetalleConsignacion;
	public JButton jButtonFK_IdProductoDetalleConsignacion;
	public JPanel jPanelFK_IdUnidadDetalleConsignacion;
	public JButton jButtonFK_IdUnidadDetalleConsignacion;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleConsignacion;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleConsignacion;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_consignacionFK_IdConsignacionDetalleConsignacion;
	public JLabel jLabelid_consignacionFK_IdConsignacionDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consignacionFK_IdConsignacionDetalleConsignacion;
	public JButton jButtonid_consignacionFK_IdConsignacionDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_consignacionFK_IdConsignacionDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_consignacionFK_IdConsignacionDetalleConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion;
	public JLabel jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion;
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleConsignacion;
	public JLabel jLabelid_productoFK_IdProductoDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleConsignacion;
	public JButton jButtonid_productoFK_IdProductoDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleConsignacionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleConsignacion;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleConsignacion;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleConsignacion;
	public JButton jButtonid_unidadFK_IdUnidadDetalleConsignacion= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleConsignacionBusqueda= new JButtonMe();

	
	
	
	
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
	public DetalleConsignacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleConsignacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleConsignacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleConsignacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleConsignacion)	{
		this.jButtonRecargarInformacionDetalleConsignacion = jButtonRecargarInformacionDetalleConsignacion;
	}
	
	public JButton getjButtonProcesarInformacionDetalleConsignacion() {
		return this.jButtonProcesarInformacionDetalleConsignacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleConsignacion)	{
		this.jButtonProcesarInformacionDetalleConsignacion = jButtonProcesarInformacionDetalleConsignacion;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleConsignacion() {
		return this.jButtonRecargarInformacionDetalleConsignacion;
	}
	
	
	public List<DetalleConsignacion> getdetalleconsignacions() {
		return this.detalleconsignacions;
	}

	public void setdetalleconsignacions(List<DetalleConsignacion> detalleconsignacions) {
		this.detalleconsignacions = detalleconsignacions;
	}
	
	public List<DetalleConsignacion> getdetalleconsignacionsAux() {
		return this.detalleconsignacionsAux;
	}

	public void setdetalleconsignacionsAux(List<DetalleConsignacion> detalleconsignacionsAux) {
		this.detalleconsignacionsAux = detalleconsignacionsAux;
	}
	
	public List<DetalleConsignacion> getdetalleconsignacionsEliminados() {
		return this.detalleconsignacionsEliminados;
	}

	public void setDetalleConsignacionsEliminados(List<DetalleConsignacion> detalleconsignacionsEliminados) {
		this.detalleconsignacionsEliminados = detalleconsignacionsEliminados;
	}
	
	public List<DetalleConsignacion> getdetalleconsignacionsTotal() {
		return this.detalleconsignacionsTotal;
	}

	public void setdetalleconsignacionsTotal(List<DetalleConsignacion> detalleconsignacionsTotal) {
		this.detalleconsignacionsTotal = detalleconsignacionsTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleConsignacion() {
		return jComboBoxTiposSeleccionarDetalleConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleConsignacion(
			JComboBox jComboBoxTiposSeleccionarDetalleConsignacion) {
		this.jComboBoxTiposSeleccionarDetalleConsignacion = jComboBoxTiposSeleccionarDetalleConsignacion;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleConsignacion() {
		return jTextFieldValorCampoGeneralDetalleConsignacion;
	}

	public void setjTextFieldValorCampoGeneralDetalleConsignacion(
			JTextField jTextFieldValorCampoGeneralDetalleConsignacion) {
		this.jTextFieldValorCampoGeneralDetalleConsignacion = jTextFieldValorCampoGeneralDetalleConsignacion;
	}

	public void setBorderResaltarValorCampoGeneralDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleConsignacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleConsignacion() {
		return this.jCheckBoxSeleccionarTodosDetalleConsignacion;
	}

	public void setjCheckBoxSeleccionarTodosDetalleConsignacion(
			JCheckBox jCheckBoxSeleccionarTodosDetalleConsignacion) {
		this.jCheckBoxSeleccionarTodosDetalleConsignacion = jCheckBoxSeleccionarTodosDetalleConsignacion;
	}

	public void setBorderResaltarSeleccionarTodosDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleConsignacion() {
		return this.jCheckBoxSeleccionadosDetalleConsignacion;
	}

	public void setjCheckBoxSeleccionadosDetalleConsignacion(
			JCheckBox jCheckBoxSeleccionadosDetalleConsignacion) {
		this.jCheckBoxSeleccionadosDetalleConsignacion = jCheckBoxSeleccionadosDetalleConsignacion;
	}
	
	public void setBorderResaltarSeleccionadosDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleConsignacion() {
		return this.jComboBoxTiposArchivosReportesDetalleConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleConsignacion(
			JComboBox jComboBoxTiposArchivosReportesDetalleConsignacion) {
		this.jComboBoxTiposArchivosReportesDetalleConsignacion = jComboBoxTiposArchivosReportesDetalleConsignacion;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleConsignacion() {
		return this.jComboBoxTiposReportesDetalleConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleConsignacion(
			JComboBox jComboBoxTiposReportesDetalleConsignacion) {
		this.jComboBoxTiposReportesDetalleConsignacion = jComboBoxTiposReportesDetalleConsignacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleConsignacion() {
	//	return jComboBoxTiposReportesDinamicoDetalleConsignacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleConsignacion(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleConsignacion) {
	//	this.jComboBoxTiposReportesDinamicoDetalleConsignacion = jComboBoxTiposReportesDinamicoDetalleConsignacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleConsignacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleConsignacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion = jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion;
	//}
	
	public void setBorderResaltarTiposReportesDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleConsignacion() {
		return this.jComboBoxTiposGraficosReportesDetalleConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleConsignacion(
			JComboBox jComboBoxTiposGraficosReportesDetalleConsignacion) {
		this.jComboBoxTiposGraficosReportesDetalleConsignacion = jComboBoxTiposGraficosReportesDetalleConsignacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleConsignacion() {
		return this.jComboBoxTiposPaginacionDetalleConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleConsignacion(
			JComboBox jComboBoxTiposPaginacionDetalleConsignacion) {
		this.jComboBoxTiposPaginacionDetalleConsignacion = jComboBoxTiposPaginacionDetalleConsignacion;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleConsignacion() {
		return this.jComboBoxTiposRelacionesDetalleConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleConsignacion() {
		return this.jComboBoxTiposAccionesDetalleConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleConsignacion(
			JComboBox jComboBoxTiposRelacionesDetalleConsignacion) {
		this.jComboBoxTiposRelacionesDetalleConsignacion = jComboBoxTiposRelacionesDetalleConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleConsignacion(
			JComboBox jComboBoxTiposAccionesDetalleConsignacion) {
		this.jComboBoxTiposAccionesDetalleConsignacion = jComboBoxTiposAccionesDetalleConsignacion;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleConsignacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleConsignacion() {
	//	return jCheckBoxConGraficoDinamicoDetalleConsignacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleConsignacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleConsignacion) {
	//	this.jCheckBoxConGraficoDinamicoDetalleConsignacion = jCheckBoxConGraficoDinamicoDetalleConsignacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleConsignacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleConsignacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleConsignacion .setBorder(borderResaltar);		
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
		this.detalleconsignacionSessionBean=new DetalleConsignacionSessionBean();
		
		this.detalleconsignacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleconsignacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleconsignacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleConsignacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Consignacion MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleConsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConsignacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"nuevo","nuevo","Nuevo"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"duplicar","duplicar","Duplicar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"copiar","copiar","Copiar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"ver_form","ver_form","Ver"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"recargar","recargar","Recargar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleConsignacion,this.jTtoolBarDetalleConsignacion,
							"cerrar","cerrar","Salir"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleConsignacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleConsignacion;
			
				this.jButtonProcesarInformacionToolBarDetalleConsignacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleConsignacion;
				
		//protected JButton jButtonModificarToolBarDetalleConsignacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleConsignacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleConsignacion=new JMenuMe("General");
		this.jmenuArchivoDetalleConsignacion=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleConsignacion=new JMenuMe("Acciones");
		this.jmenuDatosDetalleConsignacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleConsignacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleConsignacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleConsignacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleConsignacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleConsignacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleConsignacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleConsignacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleConsignacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleConsignacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleConsignacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleConsignacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleConsignacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleConsignacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleConsignacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleConsignacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleConsignacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleConsignacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleConsignacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleConsignacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleConsignacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleConsignacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleConsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleConsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleConsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleConsignacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleConsignacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleConsignacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleConsignacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleConsignacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleConsignacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleConsignacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleConsignacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleConsignacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleConsignacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleConsignacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleConsignacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleConsignacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleConsignacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleConsignacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleConsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleConsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleConsignacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleConsignacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleConsignacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleConsignacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleConsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleConsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleConsignacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleConsignacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleConsignacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleConsignacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleConsignacion.add(this.jMenuItemCerrarDetalleConsignacion);
			
			this.jmenuAccionesDetalleConsignacion.add(this.jMenuItemNuevoDetalleConsignacion);
			this.jmenuAccionesDetalleConsignacion.add(this.jMenuItemNuevoGuardarCambiosDetalleConsignacion);
			this.jmenuAccionesDetalleConsignacion.add(this.jMenuItemNuevoRelacionesDetalleConsignacion);
			this.jmenuAccionesDetalleConsignacion.add(this.jMenuItemGuardarCambiosTablaDetalleConsignacion);		
			this.jmenuAccionesDetalleConsignacion.add(this.jMenuItemDuplicarDetalleConsignacion);		
			this.jmenuAccionesDetalleConsignacion.add(this.jMenuItemCopiarDetalleConsignacion);		
			this.jmenuAccionesDetalleConsignacion.add(this.jMenuItemVerFormDetalleConsignacion);		
			
			this.jmenuDatosDetalleConsignacion.add(this.jMenuItemRecargarInformacionDetalleConsignacion);				
			this.jmenuDatosDetalleConsignacion.add(this.jMenuItemAnterioresDetalleConsignacion);				
			this.jmenuDatosDetalleConsignacion.add(this.jMenuItemSiguientesDetalleConsignacion);				
			this.jmenuDatosDetalleConsignacion.add(this.jMenuItemAbrirOrderByDetalleConsignacion);				
			this.jmenuDatosDetalleConsignacion.add(this.jMenuItemMostrarOcultarDetalleConsignacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleConsignacion.add(this.jMenuItemGuardarCambiosDetalleConsignacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleConsignacion.add(this.jmenuArchivoDetalleConsignacion);		
			this.jmenuBarDetalleConsignacion.add(this.jmenuAccionesDetalleConsignacion);		
			this.jmenuBarDetalleConsignacion.add(this.jmenuDatosDetalleConsignacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleConsignacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleConsignacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleConsignacion.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleConsignacion= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleConsignacion.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleConsignacion.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleConsignacion,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleConsignacion = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleConsignacion.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleConsignacion.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdConsignacionDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConsignacionDetalleConsignacion.setToolTipText("Buscar Por Consignacion ");
		this.jButtonFK_IdConsignacionDetalleConsignacion= new JButtonMe();
		this.jButtonFK_IdConsignacionDetalleConsignacion.setText("Buscar");
		this.jButtonFK_IdConsignacionDetalleConsignacion.setToolTipText("Buscar Por Consignacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConsignacionDetalleConsignacion,"buscar_button","Buscar Por Consignacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConsignacionDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_consignacionFK_IdConsignacionDetalleConsignacion = new JLabelMe();
		jLabelid_consignacionFK_IdConsignacionDetalleConsignacion.setText("Consignacion :");
		jLabelid_consignacionFK_IdConsignacionDetalleConsignacion.setToolTipText("Consignacion");
		jLabelid_consignacionFK_IdConsignacionDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consignacionFK_IdConsignacionDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consignacionFK_IdConsignacionDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_consignacionFK_IdConsignacionDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_consignacionFK_IdConsignacionDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_consignacionFK_IdConsignacionDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignacionFK_IdConsignacionDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignacionFK_IdConsignacionDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consignacionFK_IdConsignacionDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetallePedidoDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetallePedidoDetalleConsignacion.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetallePedidoDetalleConsignacion= new JButtonMe();
		this.jButtonFK_IdEstadoDetallePedidoDetalleConsignacion.setText("Buscar");
		this.jButtonFK_IdEstadoDetallePedidoDetalleConsignacion.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetallePedidoDetalleConsignacion,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetallePedidoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion = new JLabelMe();
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion.setText("Estado :");
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion.setToolTipText("Estado");
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleConsignacion.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleConsignacion= new JButtonMe();
		this.jButtonFK_IdProductoDetalleConsignacion.setText("Buscar");
		this.jButtonFK_IdProductoDetalleConsignacion.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleConsignacion,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleConsignacion = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleConsignacion.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleConsignacion.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleConsignacion= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleConsignacion.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleConsignacion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleConsignacion.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleConsignacion.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleConsignacion= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleConsignacion.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleConsignacion.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleConsignacion,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleConsignacion = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleConsignacion.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleConsignacion.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleConsignacion= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleConsignacion=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleConsignacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleConsignacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleConsignacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleConsignacion = new DetalleConsignacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Consignacion DATOS");
			this.jInternalFrameDetalleFormDetalleConsignacion = new DetalleConsignacionDetalleFormJInternalFrame(jDesktopPane,this.detalleconsignacionSessionBean.getConGuardarRelaciones(),this.detalleconsignacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleConsignacion = null;//new DetalleConsignacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleConsignacion= new GridBagLayout();
		
		
		this.jTableDatosDetalleConsignacion = new JTableMe();      
		
		String sToolTipDetalleConsignacion="";
		sToolTipDetalleConsignacion=DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleConsignacion+="(Facturacion.DetalleConsignacion)";
		}
		
		if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleConsignacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleConsignacion.setToolTipText(sToolTipDetalleConsignacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleConsignacion);
		this.jTableDatosDetalleConsignacion.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleConsignacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleConsignacion.setRowSelectionAllowed(true);
		this.jTableDatosDetalleConsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleConsignacionTotales = new JTableMe();        
		//this.jTableDatosDetalleConsignacionTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleConsignacionTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleConsignacion = new JButtonMe();
		this.jButtonDuplicarDetalleConsignacion = new JButtonMe();
		this.jButtonCopiarDetalleConsignacion = new JButtonMe();
		this.jButtonVerFormDetalleConsignacion = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleConsignacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleConsignacion = new JButtonMe();
		this.jButtonCerrarDetalleConsignacion = new JButtonMe();
		
		this.jScrollPanelDatosDetalleConsignacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleConsignacion = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleConsignacionTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Consignacion";
		
		if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Consignacions" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleConsignacionTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleConsignacion.setToolTipText("Acciones");
        this.jPanelAccionesDetalleConsignacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleConsignacion=new ReporteDinamicoJInternalFrame(DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleConsignacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleConsignacion=new ImportacionJInternalFrame(DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleConsignacion();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleConsignacion = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleConsignacion.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleConsignacion,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleConsignacion=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleConsignacion,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleConsignacion();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleConsignacion = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleConsignacion.setText("Orden");
		this.jButtonAbrirOrderByDetalleConsignacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleConsignacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleConsignacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleConsignacion,false,this);
			
			//this.cargarOrderByDetalleConsignacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleConsignacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleConsignacion,true,this);
			
			//this.cargarOrderByDetalleConsignacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleConsignacion.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosDetalleConsignacion.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosDetalleConsignacion.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosDetalleConsignacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleConsignacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleConsignacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleConsignacion.setText("Nuevo");
		this.jButtonDuplicarDetalleConsignacion.setText("Duplicar");
		this.jButtonCopiarDetalleConsignacion.setText("Copiar");
		this.jButtonVerFormDetalleConsignacion.setText("Ver");
		this.jButtonNuevoRelacionesDetalleConsignacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleConsignacion.setText("Guardar");
		this.jButtonCerrarDetalleConsignacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleConsignacion,"nuevo_button","Nuevo",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleConsignacion,"duplicar_button","Duplicar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleConsignacion,"copiar_button","Copiar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleConsignacion,"ver_form","Ver",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleConsignacion,"nuevorelaciones_button","Nuevo Rel",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleConsignacion,"guardarcambiostabla_button","Guardar",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleConsignacion,"cerrar_button","Salir",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleConsignacion.setToolTipText("Nuevo"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleConsignacion.setToolTipText("Duplicar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleConsignacion.setToolTipText("Copiar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleConsignacion.setToolTipText("Ver"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleConsignacion.setToolTipText("Nuevo Rel"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleConsignacion.setToolTipText("Guardar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleConsignacion.setToolTipText("Salir"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleConsignacion";
		inputMap = this.jButtonNuevoDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleConsignacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleConsignacion";
		inputMap = this.jButtonDuplicarDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleConsignacion"));
		
		//COPIAR
		sMapKey = "CopiarDetalleConsignacion";
		inputMap = this.jButtonCopiarDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleConsignacion"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleConsignacion";
		inputMap = this.jButtonVerFormDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleConsignacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleConsignacion";
		inputMap = this.jButtonNuevoRelacionesDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleConsignacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleConsignacion";
		inputMap = this.jButtonModificarDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleConsignacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleConsignacion";
		inputMap = this.jButtonCerrarDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleConsignacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleConsignacion";
		inputMap = this.jButtonGuardarCambiosTablaDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleConsignacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleConsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleConsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleConsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleConsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleConsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleConsignacion.setName("jPanelParametrosReportesDetalleConsignacion"); 
		
		this.jPanelParametrosReportesAccionesDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleConsignacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleConsignacion.setName("jPanelParametrosReportesAccionesDetalleConsignacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleConsignacion = new JButtonMe();
		this.jButtonRecargarInformacionDetalleConsignacion.setText("Recargar");
		this.jButtonRecargarInformacionDetalleConsignacion.setToolTipText("Recargar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleConsignacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleConsignacion = new JButtonMe();
		this.jButtonProcesarInformacionDetalleConsignacion.setText("Procesar");
		this.jButtonProcesarInformacionDetalleConsignacion.setToolTipText("Procesar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleConsignacion.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleConsignacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleConsignacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleConsignacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleConsignacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleConsignacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleConsignacion.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleConsignacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleConsignacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleConsignacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleConsignacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleConsignacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleConsignacion.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleConsignacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleConsignacion.setText("Accion");
		this.jComboBoxTiposAccionesDetalleConsignacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleConsignacion.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleConsignacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleConsignacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleConsignacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleConsignacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleConsignacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleConsignacion = new JLabelMe();
		
		this.jLabelAccionesDetalleConsignacion.setText("Acciones");		
		this.jLabelAccionesDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleConsignacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleConsignacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleConsignacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleConsignacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleConsignacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleConsignacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleConsignacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleConsignacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleConsignacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleConsignacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleConsignacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleConsignacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleConsignacion = new JButtonMe();
		//this.jButtonAnterioresDetalleConsignacion.setText("<<");
        this.jButtonAnterioresDetalleConsignacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleConsignacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleConsignacion = new JButtonMe();
		//this.jButtonSiguientesDetalleConsignacion.setText(">>");
        this.jButtonSiguientesDetalleConsignacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleConsignacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleConsignacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleConsignacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleConsignacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleConsignacion,"nuevoguardarcambios_button","Nue",this.detalleconsignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleConsignacion";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleConsignacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleConsignacion";
		inputMap = this.jButtonRecargarInformacionDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleConsignacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleConsignacion";
		inputMap = this.jButtonSiguientesDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleConsignacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleConsignacion";
		inputMap = this.jButtonAnterioresDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleConsignacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleConsignacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleConsignacion.setMinimumSize(new Dimension(this.getWidth(),DetalleConsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleConsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleConsignacion.setMaximumSize(new Dimension(this.getWidth(),DetalleConsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleConsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleConsignacion.setPreferredSize(new Dimension(this.getWidth(),DetalleConsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleConsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleConsignacion = new GridBagLayout();

			this.jPanelPaginacionDetalleConsignacion.setLayout(gridaBagLayoutPaginacionDetalleConsignacion);						
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = 0;
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonAnterioresDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
					
						
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleConsignacion.gridy = 0;
			
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonNuevoGuardarCambiosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
						
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleConsignacion.gridy = 0;
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonSiguientesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = 0;
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonAbrirTotalesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = 1;
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonNuevoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
						
			
			
			if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
				this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleConsignacion.gridy = 1;
				this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleConsignacion.add(this.jButtonGuardarCambiosTablaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			}
			
			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = 1;
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonDuplicarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = 1;
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonCopiarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = 1;
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonVerFormDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = 1;
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleConsignacion.add(this.jButtonCerrarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		
		
		this.jButtonRecargarInformacionDetalleConsignacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleConsignacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleConsignacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleConsignacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleConsignacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleConsignacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleConsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleConsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleConsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleConsignacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleConsignacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleConsignacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleConsignacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleConsignacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleConsignacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleConsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleConsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleConsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleConsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleConsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleConsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleConsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleConsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleConsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleConsignacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleConsignacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleConsignacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleConsignacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleConsignacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleConsignacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleConsignacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleConsignacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleConsignacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleConsignacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleConsignacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleConsignacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleConsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleConsignacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleConsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleConsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleConsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleConsignacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleConsignacion.setLayout(gridaBagParametrosReportesDetalleConsignacion);
			this.jPanelParametrosReportesAccionesDetalleConsignacion.setLayout(gridaBagParametrosReportesAccionesDetalleConsignacion);
			
			
			this.jPanelParametrosAuxiliar1DetalleConsignacion.setLayout(gridaBagParametrosAuxiliar1DetalleConsignacion);
			this.jPanelParametrosAuxiliar2DetalleConsignacion.setLayout(gridaBagParametrosAuxiliar2DetalleConsignacion);
			this.jPanelParametrosAuxiliar3DetalleConsignacion.setLayout(gridaBagParametrosAuxiliar3DetalleConsignacion);
			this.jPanelParametrosAuxiliar4DetalleConsignacion.setLayout(gridaBagParametrosAuxiliar4DetalleConsignacion);
			//this.jPanelParametrosAuxiliar5DetalleConsignacion.setLayout(gridaBagParametrosAuxiliar2DetalleConsignacion);			
			
			
			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jButtonRecargarInformacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleConsignacion.add(this.jComboBoxTiposPaginacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleConsignacion.add(this.jCheckBoxConAltoMaximoTablaDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleConsignacion.add(this.jComboBoxTiposArchivosReportesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jPanelParametrosAuxiliar1DetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleConsignacion.add(this.jComboBoxTiposReportesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);																		
			
			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleConsignacion.add(this.jComboBoxTiposGraficosReportesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jPanelParametrosAuxiliar4DetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jComboBoxTiposReportesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jCheckBoxGenerarReporteDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jPanelParametrosAuxiliar2DetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jLabelAccionesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
				this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleConsignacion.add(this.jButtonAbrirOrderByDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jComboBoxTiposSeleccionarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
			
			
			/*
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jCheckBoxSeleccionarTodosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jCheckBoxConGraficoReporteDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleConsignacion.add(this.jCheckBoxSeleccionarTodosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);															
				
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleConsignacion.add(this.jCheckBoxSeleccionadosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);															
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleConsignacion.add(this.jCheckBoxConGraficoReporteDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jPanelParametrosAuxiliar3DetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jComboBoxTiposAccionesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
	
				
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleConsignacion.add(this.jTextFieldValorCampoGeneralDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleConsignacion = new GridBagLayout();

			this.jScrollPanelDatosDetalleConsignacion.setLayout(gridaBagLayoutDatosDetalleConsignacion);
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = 0;
			this.gridBagConstraintsDetalleConsignacion.gridx = 0;
			
			this.jScrollPanelDatosDetalleConsignacion.add(this.jTableDatosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleConsignacion.setViewportView(this.jTableDatosDetalleConsignacion);
		this.jTableDatosDetalleConsignacion.setFillsViewportHeight(true);
		this.jTableDatosDetalleConsignacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleConsignacionTotales.setViewportView(this.jTableDatosDetalleConsignacionTotales);
		//this.jTableDatosDetalleConsignacionTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleConsignacionTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleConsignacion= new GridBagLayout();
		this.jPanelAccionesDetalleConsignacion.setLayout(gridaBagLayoutAccionesDetalleConsignacion);
		
		
		/*	
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = 0;
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;
			
		this.jPanelAccionesDetalleConsignacion.add(this.jButtonNuevoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleConsignacion.setLayout(gridaBagLayoutFK_IdBodegaDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 0;
		jPanelFK_IdBodegaDetalleConsignacion.add(jLabelid_bodegaFK_IdBodegaDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 1;
		jPanelFK_IdBodegaDetalleConsignacion.add(jComboBoxid_bodegaFK_IdBodegaDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 1;
		gridBagConstraintsDetalleConsignacion.gridx =1;
		jPanelFK_IdBodegaDetalleConsignacion.add(jButtonFK_IdBodegaDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		jTabbedPaneBusquedasDetalleConsignacion.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleConsignacion);
		jTabbedPaneBusquedasDetalleConsignacion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdConsignacionDetalleConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdConsignacionDetalleConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConsignacionDetalleConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConsignacionDetalleConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConsignacionDetalleConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConsignacionDetalleConsignacion.setLayout(gridaBagLayoutFK_IdConsignacionDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 0;
		jPanelFK_IdConsignacionDetalleConsignacion.add(jLabelid_consignacionFK_IdConsignacionDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 1;
		jPanelFK_IdConsignacionDetalleConsignacion.add(jComboBoxid_consignacionFK_IdConsignacionDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 1;
		gridBagConstraintsDetalleConsignacion.gridx =1;
		jPanelFK_IdConsignacionDetalleConsignacion.add(jButtonFK_IdConsignacionDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		jTabbedPaneBusquedasDetalleConsignacion.addTab("2.-Por Consignacion ", jPanelFK_IdConsignacionDetalleConsignacion);
		jTabbedPaneBusquedasDetalleConsignacion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetallePedidoDetalleConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetallePedidoDetalleConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetallePedidoDetalleConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetallePedidoDetalleConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetallePedidoDetalleConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetallePedidoDetalleConsignacion.setLayout(gridaBagLayoutFK_IdEstadoDetallePedidoDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 0;
		jPanelFK_IdEstadoDetallePedidoDetalleConsignacion.add(jLabelid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 1;
		jPanelFK_IdEstadoDetallePedidoDetalleConsignacion.add(jComboBoxid_estado_detalle_pedidoFK_IdEstadoDetallePedidoDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 1;
		gridBagConstraintsDetalleConsignacion.gridx =1;
		jPanelFK_IdEstadoDetallePedidoDetalleConsignacion.add(jButtonFK_IdEstadoDetallePedidoDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		jTabbedPaneBusquedasDetalleConsignacion.addTab("3.-Por Estado ", jPanelFK_IdEstadoDetallePedidoDetalleConsignacion);
		jTabbedPaneBusquedasDetalleConsignacion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleConsignacion.setLayout(gridaBagLayoutFK_IdProductoDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 0;
		jPanelFK_IdProductoDetalleConsignacion.add(jLabelid_productoFK_IdProductoDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 1;
		jPanelFK_IdProductoDetalleConsignacion.add(jComboBoxid_productoFK_IdProductoDetalleConsignacion, gridBagConstraintsDetalleConsignacion);


		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 0;
		jPanelFK_IdProductoDetalleConsignacion.add(this.jButtonBuscarFK_IdProductoid_productoDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 1;
		gridBagConstraintsDetalleConsignacion.gridx =1;
		jPanelFK_IdProductoDetalleConsignacion.add(jButtonFK_IdProductoDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		jTabbedPaneBusquedasDetalleConsignacion.addTab("4.-Por Producto ", jPanelFK_IdProductoDetalleConsignacion);
		jTabbedPaneBusquedasDetalleConsignacion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleConsignacion.setLayout(gridaBagLayoutFK_IdUnidadDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 0;
		jPanelFK_IdUnidadDetalleConsignacion.add(jLabelid_unidadFK_IdUnidadDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 0;
		gridBagConstraintsDetalleConsignacion.gridx = 1;
		jPanelFK_IdUnidadDetalleConsignacion.add(jComboBoxid_unidadFK_IdUnidadDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleConsignacion.gridy = 1;
		gridBagConstraintsDetalleConsignacion.gridx =1;
		jPanelFK_IdUnidadDetalleConsignacion.add(jButtonFK_IdUnidadDetalleConsignacion, gridBagConstraintsDetalleConsignacion);

		jTabbedPaneBusquedasDetalleConsignacion.addTab("5.-Por Unidad ", jPanelFK_IdUnidadDetalleConsignacion);
		jTabbedPaneBusquedasDetalleConsignacion.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleConsignacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleConsignacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();						
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleConsignacion.gridx = 0;		
			//this.gridBagConstraintsDetalleConsignacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleConsignacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;		
		//this.gridBagConstraintsDetalleConsignacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleConsignacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleConsignacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleConsignacion.gridx = 0;		
			this.gridBagConstraintsDetalleConsignacion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleConsignacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);								
		
		
		/*
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		*/		
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleConsignacion.gridx =0;
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleConsignacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
				
		//this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleConsignacion.gridx =0;
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleConsignacion.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleConsignacionTotales/*this.jTableDatosDetalleConsignacionTotales*/, this.gridBagConstraintsDetalleConsignacion);				
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleConsignacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleConsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleConsignacion = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleConsignacion.setLayout(gridaBagLayoutBusquedasParametrosDetalleConsignacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleConsignacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleConsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleConsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleConsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
			
			
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
			
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleConsignacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleConsignacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleConsignacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleConsignacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleConsignacion.setName("jPanelReporteDinamicoDetalleConsignacion"); 
		
		this.jPanelReporteDinamicoDetalleConsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleConsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleConsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleConsignacion.setLayout(gridaBagLayoutReporteDinamicoDetalleConsignacion);
		
		
		this.jInternalFrameReporteDinamicoDetalleConsignacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleConsignacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleConsignacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleConsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleConsignacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleConsignacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleConsignacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleConsignacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleConsignacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleConsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleConsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleConsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Consignacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleConsignacion = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleConsignacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jLabelColumnasSelectReporteDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleConsignacion = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleConsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleConsignacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleConsignacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleConsignacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleConsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleConsignacion=new JScrollPane(this.jListColumnasSelectReporteDetalleConsignacion);
			
			this.jScrollColumnasSelectReporteDetalleConsignacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleConsignacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleConsignacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleConsignacion.add(this.jListColumnasSelectReporteDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jScrollColumnasSelectReporteDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleConsignacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleConsignacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleConsignacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleConsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleConsignacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleConsignacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleConsignacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleConsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleConsignacion=new JScrollPane(this.jListRelacionesSelectReporteDetalleConsignacion);
			
			this.jScrollRelacionesSelectReporteDetalleConsignacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleConsignacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleConsignacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleConsignacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleConsignacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleConsignacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleConsignacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleConsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleConsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleConsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleConsignacion = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleConsignacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jLabelConGraficoDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleConsignacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleConsignacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleConsignacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleConsignacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleConsignacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleConsignacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jCheckBoxConGraficoDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleConsignacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleConsignacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jLabelColumnaCategoriaGraficoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleConsignacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleConsignacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jLabelColumnaCategoriaValorDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleConsignacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleConsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleConsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleConsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleConsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jComboBoxColumnaCategoriaValorDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleConsignacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleConsignacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jLabelColumnasValoresGraficoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleConsignacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleConsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleConsignacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleConsignacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleConsignacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleConsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleConsignacion=new JScrollPane(this.jListColumnasValoresGraficoDetalleConsignacion);
			
			this.jScrollColumnasValoresGraficoDetalleConsignacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleConsignacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleConsignacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleConsignacion.add(this.jListColumnasSelectReporteDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jScrollColumnasValoresGraficoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleConsignacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleConsignacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jLabelTiposGraficosReportesDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleConsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleConsignacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleConsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleConsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleConsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleConsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleConsignacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleConsignacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jLabelGenerarExcelReporteDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleConsignacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleConsignacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleConsignacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleConsignacion.setToolTipText("Generar EXCEL"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleConsignacion.add(this.jButtonGenerarExcelReporteDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jComboBoxTiposReportesDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleConsignacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleConsignacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jLabelTiposArchivoReporteDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleConsignacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleConsignacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleConsignacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleConsignacion.setToolTipText("Generar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jButtonGenerarReporteDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleConsignacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleConsignacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleConsignacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleConsignacion.setToolTipText("Cancelar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleConsignacion.add(this.jButtonCerrarReporteDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleConsignacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleConsignacion= new JScrollPane(jPanelReporteDinamicoDetalleConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleConsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleConsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleConsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Consignacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleConsignacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleConsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleConsignacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleConsignacion);
		this.jInternalFrameReporteDinamicoDetalleConsignacion.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleConsignacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleConsignacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleConsignacion.setName("jPanelImportacionDetalleConsignacion"); 
		
		this.jPanelImportacionDetalleConsignacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleConsignacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleConsignacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleConsignacion.setLayout(gridaBagLayoutImportacionDetalleConsignacion);
		
		
		this.jInternalFrameImportacionDetalleConsignacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleConsignacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleConsignacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleConsignacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleConsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleConsignacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleConsignacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleConsignacion.setResizable(true);
	    this.jInternalFrameImportacionDetalleConsignacion.setClosable(true);
	    this.jInternalFrameImportacionDetalleConsignacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleConsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleConsignacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleConsignacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleConsignacion.setResizable(true);
	    this.jInternalFrameImportacionDetalleConsignacion.setClosable(true);
	    this.jInternalFrameImportacionDetalleConsignacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleConsignacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleConsignacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleConsignacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Consignacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleConsignacion = new JLabelMe();

		this.jLabelArchivoImportacionDetalleConsignacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleConsignacion.add(this.jLabelArchivoImportacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleConsignacion = new JFileChooser();		
		this.jFileChooserImportacionDetalleConsignacion.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleConsignacion = new JButtonMe();
		this.jButtonAbrirImportacionDetalleConsignacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleConsignacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleConsignacion.setToolTipText("Generar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleConsignacion.add(this.jButtonAbrirImportacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleConsignacion = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleConsignacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleConsignacion.add(this.jLabelPathArchivoImportacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleConsignacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleConsignacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleConsignacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleConsignacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleConsignacion.add(this.jTextFieldPathArchivoImportacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleConsignacion = new JButtonMe();
		this.jButtonGenerarImportacionDetalleConsignacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleConsignacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleConsignacion.setToolTipText("Generar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleConsignacion.add(this.jButtonGenerarImportacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleConsignacion = new JButtonMe();
		this.jButtonCerrarImportacionDetalleConsignacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleConsignacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleConsignacion.setToolTipText("Cancelar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleConsignacion.add(this.jButtonCerrarImportacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleConsignacion = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleConsignacion= new JScrollPane(jPanelImportacionDetalleConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleConsignacion.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleConsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleConsignacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleConsignacion);
		this.jInternalFrameImportacionDetalleConsignacion.getContentPane().add(this.jScrollPanelImportacionDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleConsignacion() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleConsignacion = new JButtonMe();
		this.jButtonAbrirTotalesDetalleConsignacion.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleConsignacion,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleConsignacion = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleConsignacion.setName("jPanelTotalesDetalleConsignacion"); 
		
		this.jPanelTotalesDetalleConsignacion.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleConsignacion.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleConsignacion.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleConsignacion.setLayout(gridaBagLayoutTotalesDetalleConsignacion);
		
		
		this.jInternalFrameTotalesDetalleConsignacion= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleConsignacion= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleConsignacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleConsignacion= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleConsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleConsignacion.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleConsignacion.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleConsignacion.setResizable(true);
	    this.jInternalFrameTotalesDetalleConsignacion.setClosable(true);
	    this.jInternalFrameTotalesDetalleConsignacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleConsignacion.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleConsignacion.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleConsignacion.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Consignacions"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleConsignacion.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleConsignacion.ipady =150;
		
		this.jPanelTotalesDetalleConsignacion.add(jScrollPanelDatosDetalleConsignacionTotales, this.gridBagConstraintsDetalleConsignacion);//this.jTableDatosDetalleConsignacionTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleConsignacion = new JButtonMe();
		this.jButtonCerrarTotalesDetalleConsignacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleConsignacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleConsignacion.setToolTipText("Cancelar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleConsignacion.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleConsignacion.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleConsignacion.add(this.jButtonCerrarTotalesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleConsignacion = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleConsignacion= new JScrollPane(jPanelTotalesDetalleConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
		this.gridBagConstraintsDetalleConsignacion.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleConsignacion.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleConsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleConsignacion.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleConsignacion);
		this.jInternalFrameTotalesDetalleConsignacion.getContentPane().add(this.jScrollPanelTotalesDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleConsignacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleConsignacion = new JButtonMe();
			this.jButtonAbrirOrderByDetalleConsignacion.setText("Orden");
			this.jButtonAbrirOrderByDetalleConsignacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleConsignacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleConsignacion";
			inputMap = this.jButtonAbrirOrderByDetalleConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleConsignacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleConsignacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleConsignacion.setName("jPanelOrderByDetalleConsignacion"); 
			
			this.jPanelOrderByDetalleConsignacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleConsignacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleConsignacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleConsignacion.setLayout(gridaBagLayoutOrderByDetalleConsignacion);
			
			
			this.jTableDatosDetalleConsignacionOrderBy = new JTableMe();        
			this.jTableDatosDetalleConsignacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleConsignacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleConsignacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleConsignacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleConsignacionOrderBy.setViewportView(this.jTableDatosDetalleConsignacionOrderBy);
			this.jTableDatosDetalleConsignacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleConsignacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleConsignacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleConsignacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleConsignacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleConsignacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleConsignacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleConsignacion.setTitle("Orden");
			this.jInternalFrameOrderByDetalleConsignacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleConsignacion.setResizable(true);
			this.jInternalFrameOrderByDetalleConsignacion.setClosable(true);
			this.jInternalFrameOrderByDetalleConsignacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleConsignacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleConsignacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleConsignacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Consignacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleConsignacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleConsignacion.ipady =150;
				
			this.jPanelOrderByDetalleConsignacion.add(jScrollPanelDatosDetalleConsignacionOrderBy, this.gridBagConstraintsDetalleConsignacion);//this.jTableDatosDetalleConsignacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleConsignacion = new JButtonMe();
			this.jButtonCerrarOrderByDetalleConsignacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleConsignacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleConsignacion.setToolTipText("Cancelar"+" "+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleConsignacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleConsignacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleConsignacion.add(this.jButtonCerrarOrderByDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleConsignacion = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleConsignacion= new JScrollPane(jPanelOrderByDetalleConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleConsignacion = new GridBagConstraints();
			this.gridBagConstraintsDetalleConsignacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleConsignacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleConsignacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleConsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleConsignacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleConsignacion);
			
			this.jInternalFrameOrderByDetalleConsignacion.getContentPane().add(this.jScrollPanelOrderByDetalleConsignacion, this.gridBagConstraintsDetalleConsignacion);			
		
		} else {
			this.jButtonAbrirOrderByDetalleConsignacion = new JButtonMe();
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
			&& this.detalleconsignacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleConsignacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleConsignacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleConsignacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleConsignacion.getRowHeight();//DetalleConsignacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleConsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleConsignacion.isSelected()) {
					iHeightTable=DetalleConsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleConsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleConsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleConsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleConsignacion.isSelected()) {
					iHeightTable=DetalleConsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleConsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleConsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleConsignacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleConsignacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleConsignacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleConsignacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleConsignacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleConsignacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleConsignacion!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleConsignacion.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleConsignacion.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleConsignacion.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleConsignacion.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleConsignacion.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleConsignacion.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleConsignacion.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleConsignacion!=null && this.jInternalFrameOrderByDetalleConsignacion.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleConsignacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleConsignacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleConsignacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleConsignacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleConsignacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleConsignacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleConsignacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleConsignacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleConsignacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleConsignacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetalleConsignacion!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleConsignacion.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleConsignacion.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleConsignacion.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleConsignacion.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleConsignacion.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleConsignacion.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleConsignacion.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleconsignacionLogic.getDetalleConsignacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleconsignacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleConsignacion> TraerDetalleConsignacionBeans(List<DetalleConsignacion> detalleconsignacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleConsignacion detalleconsignacion:detalleconsignacions) {
					
				if(!(DetalleConsignacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleConsignacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleconsignacion.setsDetalleGeneralEntityReporte(DetalleConsignacionConstantesFunciones.getDetalleConsignacionDescripcion(detalleconsignacion));
										
						
					
						
					
				} else  {
							
					//detalleconsignacion.setsDetalleGeneralEntityReporte(detalleconsignacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleconsignacionbeans.add(detalleconsignacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleconsignacions;
    }
	//PARA REPORTES FIN
}
