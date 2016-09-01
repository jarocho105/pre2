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
import com.bydan.erp.facturacion.util.DetalleFacturaConstantesFunciones;

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
public class DetalleFacturaJInternalFrame extends DetalleFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleFactura;
	
	protected JMenuBar jmenuBarDetalleFactura;
	
	protected JMenu jmenuDetalleFactura;
	protected JMenu jmenuDatosDetalleFactura;
	protected JMenu jmenuArchivoDetalleFactura;
	protected JMenu jmenuAccionesDetalleFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFactura;	
	protected GridBagConstraints gridBagConstraintsDetalleFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleFacturaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleFactura;	
	
	
	
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

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetalleFacturaSessionBean detallefacturaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleFactura> detallefacturas;		
	public List<DetalleFactura> detallefacturasEliminados;	
	public List<DetalleFactura> detallefacturasAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleFactura;		
	protected JButton jButtonAbrirTotalesDetalleFactura;		
	
	/*
	protected JPanel jPanelTotalesDetalleFactura;
	public JScrollPane jScrollPanelTotalesDetalleFactura;	
	protected JButton jButtonCerrarTotalesDetalleFactura;
	*/
	
	public List<DetalleFactura> detallefacturasTotal= new ArrayList<DetalleFactura>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleFactura;		
	protected JButton jButtonAbrirOrderByDetalleFactura;
	
	
	//protected JPanel jPanelOrderByDetalleFactura;
	//public JScrollPane jScrollPanelOrderByDetalleFactura;	
	//protected JButton jButtonCerrarOrderByDetalleFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleFacturaLogic detallefacturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleFactura;
	public JScrollPane jScrollPanelDatosEdicionDetalleFactura;
	public JScrollPane jScrollPanelDatosGeneralDetalleFactura;
    //public JScrollPane jScrollPanelDatosDetalleFacturaTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetalleFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleFactura;
	//public JScrollPane jScrollPanelImportacionDetalleFactura;
	
	
	
	protected JPanel jPanelAccionesDetalleFactura;
	
    protected JPanel jPanelPaginacionDetalleFactura;
    protected JPanel jPanelParametrosReportesDetalleFactura;
	protected JPanel jPanelParametrosReportesAccionesDetalleFactura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleFactura;
	protected JPanel jPanelParametrosAuxiliar2DetalleFactura;
	protected JPanel jPanelParametrosAuxiliar3DetalleFactura;
	protected JPanel jPanelParametrosAuxiliar4DetalleFactura;
	//protected JPanel jPanelParametrosAuxiliar5DetalleFactura;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleFactura;
	//protected JPanel jPanelImportacionDetalleFactura;
	
	
	public JTable jTableDatosDetalleFactura;
	//public JTable jTableDatosDetalleFacturaTotales;
	
	
	//public JTable jTableDatosDetalleFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleFactura;
	protected JButton jButtonDuplicarDetalleFactura;
	protected JButton jButtonCopiarDetalleFactura;
	protected JButton jButtonVerFormDetalleFactura;
	protected JButton jButtonNuevoRelacionesDetalleFactura;
	protected JButton jButtonModificarDetalleFactura;
	
    protected JButton jButtonGuardarCambiosTablaDetalleFactura;
	protected JButton jButtonCerrarDetalleFactura;
	
	
	protected JButton jButtonRecargarInformacionDetalleFactura;
	protected JButton jButtonProcesarInformacionDetalleFactura;
	
	
	protected JButton jButtonAnterioresDetalleFactura;
	protected JButton jButtonSiguientesDetalleFactura;
	protected JButton jButtonNuevoGuardarCambiosDetalleFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleFactura;
	//protected JButton jButtonCerrarReporteDinamicoDetalleFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleFactura;
	//protected JButton jButtonGenerarImportacionDetalleFactura;
	//protected JButton jButtonCerrarImportacionDetalleFactura;
	//protected JFileChooser jFileChooserImportacionDetalleFactura;
	//protected File fileImportacionDetalleFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFactura;
	protected JButton jButtonDuplicarToolBarDetalleFactura;
	protected JButton jButtonNuevoRelacionesToolBarDetalleFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleFactura;
	protected JButton jButtonCopiarToolBarDetalleFactura;
	protected JButton jButtonVerFormToolBarDetalleFactura;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFactura;
	protected JButton jButtonCerrarToolBarDetalleFactura;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleFactura;
	protected JButton jButtonProcesarInformacionToolBarDetalleFactura;
	protected JButton jButtonAnterioresToolBarDetalleFactura;
	protected JButton jButtonSiguientesToolBarDetalleFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleFactura;
	protected JButton jButtonAbrirOrderByToolBarDetalleFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFactura;
	protected JMenuItem jMenuItemDuplicarDetalleFactura;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleFactura;
	protected JMenuItem jMenuItemCopiarDetalleFactura;
	protected JMenuItem jMenuItemVerFormDetalleFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFactura;
	protected JMenuItem jMenuItemCerrarDetalleFactura;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleFactura;
	protected JMenuItem jMenuItemProcesarInformacionDetalleFactura;
	protected JMenuItem jMenuItemAnterioresDetalleFactura;
	protected JMenuItem jMenuItemSiguientesDetalleFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFactura;
	protected JMenuItem jMenuItemAbrirOrderByDetalleFactura;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleFactura;
	protected JCheckBox jCheckBoxSeleccionadosDetalleFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleFactura;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleFactura;
	protected JTextField jTextFieldValorCampoGeneralDetalleFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleFactura;
	//public JList<Reporte> jListColumnasSelectReporteDetalleFactura;
	//public JScrollPane jScrollColumnasSelectReporteDetalleFactura;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleFactura;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleFactura;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleFactura;
	
		
	//public JLabel jLabelArchivoImportacionDetalleFactura;	
	//public JLabel jLabelPathArchivoImportacionDetalleFactura;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleFactura;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleFactura;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleFactura;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleFactura;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleFactura;
	public JPanel jPanelFK_IdBodegaDetalleFactura;
	public JButton jButtonFK_IdBodegaDetalleFactura;
	public JPanel jPanelFK_IdCentroCostoDetalleFactura;
	public JButton jButtonFK_IdCentroCostoDetalleFactura;
	public JPanel jPanelFK_IdFacturaDetalleFactura;
	public JButton jButtonFK_IdFacturaDetalleFactura;
	public JPanel jPanelFK_IdProductoDetalleFactura;
	public JButton jButtonFK_IdProductoDetalleFactura;
	public JPanel jPanelFK_IdUnidadDetalleFactura;
	public JButton jButtonFK_IdUnidadDetalleFactura;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleFactura;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleFactura;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFactura= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleFactura;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleFactura;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleFactura= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleFacturaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura;
	
	public JPanel jPanelid_facturaFK_IdFacturaDetalleFactura;
	public JLabel jLabelid_facturaFK_IdFacturaDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaDetalleFactura;
	public JButton jButtonid_facturaFK_IdFacturaDetalleFactura= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleFacturaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaDetalleFactura;
	
	public JPanel jPanelid_productoFK_IdProductoDetalleFactura;
	public JLabel jLabelid_productoFK_IdProductoDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleFactura;
	public JButton jButtonid_productoFK_IdProductoDetalleFactura= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleFacturaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleFactura;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleFactura;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleFactura;
	public JButton jButtonid_unidadFK_IdUnidadDetalleFactura= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleFacturaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1166;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleFacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleFactura)	{
		this.jButtonRecargarInformacionDetalleFactura = jButtonRecargarInformacionDetalleFactura;
	}
	
	public JButton getjButtonProcesarInformacionDetalleFactura() {
		return this.jButtonProcesarInformacionDetalleFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFactura)	{
		this.jButtonProcesarInformacionDetalleFactura = jButtonProcesarInformacionDetalleFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleFactura() {
		return this.jButtonRecargarInformacionDetalleFactura;
	}
	
	
	public List<DetalleFactura> getdetallefacturas() {
		return this.detallefacturas;
	}

	public void setdetallefacturas(List<DetalleFactura> detallefacturas) {
		this.detallefacturas = detallefacturas;
	}
	
	public List<DetalleFactura> getdetallefacturasAux() {
		return this.detallefacturasAux;
	}

	public void setdetallefacturasAux(List<DetalleFactura> detallefacturasAux) {
		this.detallefacturasAux = detallefacturasAux;
	}
	
	public List<DetalleFactura> getdetallefacturasEliminados() {
		return this.detallefacturasEliminados;
	}

	public void setDetalleFacturasEliminados(List<DetalleFactura> detallefacturasEliminados) {
		this.detallefacturasEliminados = detallefacturasEliminados;
	}
	
	public List<DetalleFactura> getdetallefacturasTotal() {
		return this.detallefacturasTotal;
	}

	public void setdetallefacturasTotal(List<DetalleFactura> detallefacturasTotal) {
		this.detallefacturasTotal = detallefacturasTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleFactura() {
		return jComboBoxTiposSeleccionarDetalleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleFactura(
			JComboBox jComboBoxTiposSeleccionarDetalleFactura) {
		this.jComboBoxTiposSeleccionarDetalleFactura = jComboBoxTiposSeleccionarDetalleFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleFactura() {
		return jTextFieldValorCampoGeneralDetalleFactura;
	}

	public void setjTextFieldValorCampoGeneralDetalleFactura(
			JTextField jTextFieldValorCampoGeneralDetalleFactura) {
		this.jTextFieldValorCampoGeneralDetalleFactura = jTextFieldValorCampoGeneralDetalleFactura;
	}

	public void setBorderResaltarValorCampoGeneralDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleFactura() {
		return this.jCheckBoxSeleccionarTodosDetalleFactura;
	}

	public void setjCheckBoxSeleccionarTodosDetalleFactura(
			JCheckBox jCheckBoxSeleccionarTodosDetalleFactura) {
		this.jCheckBoxSeleccionarTodosDetalleFactura = jCheckBoxSeleccionarTodosDetalleFactura;
	}

	public void setBorderResaltarSeleccionarTodosDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleFactura() {
		return this.jCheckBoxSeleccionadosDetalleFactura;
	}

	public void setjCheckBoxSeleccionadosDetalleFactura(
			JCheckBox jCheckBoxSeleccionadosDetalleFactura) {
		this.jCheckBoxSeleccionadosDetalleFactura = jCheckBoxSeleccionadosDetalleFactura;
	}
	
	public void setBorderResaltarSeleccionadosDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleFactura() {
		return this.jComboBoxTiposArchivosReportesDetalleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleFactura(
			JComboBox jComboBoxTiposArchivosReportesDetalleFactura) {
		this.jComboBoxTiposArchivosReportesDetalleFactura = jComboBoxTiposArchivosReportesDetalleFactura;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleFactura() {
		return this.jComboBoxTiposReportesDetalleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleFactura(
			JComboBox jComboBoxTiposReportesDetalleFactura) {
		this.jComboBoxTiposReportesDetalleFactura = jComboBoxTiposReportesDetalleFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleFactura() {
	//	return jComboBoxTiposReportesDinamicoDetalleFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleFactura) {
	//	this.jComboBoxTiposReportesDinamicoDetalleFactura = jComboBoxTiposReportesDinamicoDetalleFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleFactura = jComboBoxTiposArchivosReportesDinamicoDetalleFactura;
	//}
	
	public void setBorderResaltarTiposReportesDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleFactura() {
		return this.jComboBoxTiposGraficosReportesDetalleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleFactura(
			JComboBox jComboBoxTiposGraficosReportesDetalleFactura) {
		this.jComboBoxTiposGraficosReportesDetalleFactura = jComboBoxTiposGraficosReportesDetalleFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleFactura() {
		return this.jComboBoxTiposPaginacionDetalleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleFactura(
			JComboBox jComboBoxTiposPaginacionDetalleFactura) {
		this.jComboBoxTiposPaginacionDetalleFactura = jComboBoxTiposPaginacionDetalleFactura;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleFactura() {
		return this.jComboBoxTiposRelacionesDetalleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFactura() {
		return this.jComboBoxTiposAccionesDetalleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFactura(
			JComboBox jComboBoxTiposRelacionesDetalleFactura) {
		this.jComboBoxTiposRelacionesDetalleFactura = jComboBoxTiposRelacionesDetalleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFactura(
			JComboBox jComboBoxTiposAccionesDetalleFactura) {
		this.jComboBoxTiposAccionesDetalleFactura = jComboBoxTiposAccionesDetalleFactura;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleFactura() {
	//	return jCheckBoxConGraficoDinamicoDetalleFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleFactura) {
	//	this.jCheckBoxConGraficoDinamicoDetalleFactura = jCheckBoxConGraficoDinamicoDetalleFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleFactura .setBorder(borderResaltar);		
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
		this.detallefacturaSessionBean=new DetalleFacturaSessionBean();
		
		this.detallefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallefacturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Factura MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"nuevo","nuevo","Nuevo"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"duplicar","duplicar","Duplicar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"copiar","copiar","Copiar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"ver_form","ver_form","Ver"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"recargar","recargar","Recargar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleFactura,this.jTtoolBarDetalleFactura,
							"cerrar","cerrar","Salir"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleFactura;
			
				this.jButtonProcesarInformacionToolBarDetalleFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleFactura;
				
		//protected JButton jButtonModificarToolBarDetalleFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleFactura=new JMenuMe("General");
		this.jmenuArchivoDetalleFactura=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleFactura=new JMenuMe("Acciones");
		this.jmenuDatosDetalleFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleFactura.add(this.jMenuItemCerrarDetalleFactura);
			
			this.jmenuAccionesDetalleFactura.add(this.jMenuItemNuevoDetalleFactura);
			this.jmenuAccionesDetalleFactura.add(this.jMenuItemNuevoGuardarCambiosDetalleFactura);
			this.jmenuAccionesDetalleFactura.add(this.jMenuItemNuevoRelacionesDetalleFactura);
			this.jmenuAccionesDetalleFactura.add(this.jMenuItemGuardarCambiosTablaDetalleFactura);		
			this.jmenuAccionesDetalleFactura.add(this.jMenuItemDuplicarDetalleFactura);		
			this.jmenuAccionesDetalleFactura.add(this.jMenuItemCopiarDetalleFactura);		
			this.jmenuAccionesDetalleFactura.add(this.jMenuItemVerFormDetalleFactura);		
			
			this.jmenuDatosDetalleFactura.add(this.jMenuItemRecargarInformacionDetalleFactura);				
			this.jmenuDatosDetalleFactura.add(this.jMenuItemAnterioresDetalleFactura);				
			this.jmenuDatosDetalleFactura.add(this.jMenuItemSiguientesDetalleFactura);				
			this.jmenuDatosDetalleFactura.add(this.jMenuItemAbrirOrderByDetalleFactura);				
			this.jmenuDatosDetalleFactura.add(this.jMenuItemMostrarOcultarDetalleFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleFactura.add(this.jMenuItemGuardarCambiosDetalleFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFactura.add(this.jmenuArchivoDetalleFactura);		
			this.jmenuBarDetalleFactura.add(this.jmenuAccionesDetalleFactura);		
			this.jmenuBarDetalleFactura.add(this.jmenuDatosDetalleFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleFactura.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleFactura= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleFactura.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleFactura.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleFactura,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleFactura = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleFactura.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleFactura.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleFactura= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleFactura.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleFactura= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleFactura.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleFactura.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleFactura,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleFactura = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleFactura.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleFactura.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleFactura= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura.setFocusable(false);

		this.jPanelFK_IdFacturaDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaDetalleFactura.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaDetalleFactura= new JButtonMe();
		this.jButtonFK_IdFacturaDetalleFactura.setText("Buscar");
		this.jButtonFK_IdFacturaDetalleFactura.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaDetalleFactura,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaDetalleFactura = new JLabelMe();
		jLabelid_facturaFK_IdFacturaDetalleFactura.setText("Factura :");
		jLabelid_facturaFK_IdFacturaDetalleFactura.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaDetalleFactura= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaDetalleFactura= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaDetalleFactura.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleFactura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleFactura.setFocusable(false);

		this.jPanelFK_IdProductoDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleFactura.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleFactura= new JButtonMe();
		this.jButtonFK_IdProductoDetalleFactura.setText("Buscar");
		this.jButtonFK_IdProductoDetalleFactura.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleFactura,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleFactura = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleFactura.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleFactura.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleFactura= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleFactura= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleFactura.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleFactura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleFactura.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleFactura.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleFactura= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleFactura.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleFactura.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleFactura,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleFactura = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleFactura.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleFactura.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleFactura= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleFactura=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleFactura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleFactura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleFactura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleFactura = new DetalleFacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Factura DATOS");
			this.jInternalFrameDetalleFormDetalleFactura = new DetalleFacturaDetalleFormJInternalFrame(jDesktopPane,this.detallefacturaSessionBean.getConGuardarRelaciones(),this.detallefacturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleFactura = null;//new DetalleFacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFactura= new GridBagLayout();
		
		
		this.jTableDatosDetalleFactura = new JTableMe();      
		
		String sToolTipDetalleFactura="";
		sToolTipDetalleFactura=DetalleFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFactura+="(Facturacion.DetalleFactura)";
		}
		
		if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleFactura.setToolTipText(sToolTipDetalleFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleFactura);
		this.jTableDatosDetalleFactura.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleFactura.setRowSelectionAllowed(true);
		this.jTableDatosDetalleFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleFacturaTotales = new JTableMe();        
		//this.jTableDatosDetalleFacturaTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleFacturaTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleFactura = new JButtonMe();
		this.jButtonDuplicarDetalleFactura = new JButtonMe();
		this.jButtonCopiarDetalleFactura = new JButtonMe();
		this.jButtonVerFormDetalleFactura = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleFactura = new JButtonMe();
		this.jButtonCerrarDetalleFactura = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleFactura = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleFacturaTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Factura";
		
		if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleFacturaTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFactura.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleFactura=new ReporteDinamicoJInternalFrame(DetalleFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleFactura=new ImportacionJInternalFrame(DetalleFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleFactura();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleFactura = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleFactura.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleFactura,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleFactura=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleFactura,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleFactura();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleFactura.setText("Orden");
		this.jButtonAbrirOrderByDetalleFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFactura,false,this);
			
			//this.cargarOrderByDetalleFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFactura,true,this);
			
			//this.cargarOrderByDetalleFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleFactura.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosDetalleFactura.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosDetalleFactura.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosDetalleFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleFactura.setText("Nuevo");
		this.jButtonDuplicarDetalleFactura.setText("Duplicar");
		this.jButtonCopiarDetalleFactura.setText("Copiar");
		this.jButtonVerFormDetalleFactura.setText("Ver");
		this.jButtonNuevoRelacionesDetalleFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleFactura.setText("Guardar");
		this.jButtonCerrarDetalleFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFactura,"nuevo_button","Nuevo",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleFactura,"duplicar_button","Duplicar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleFactura,"copiar_button","Copiar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleFactura,"ver_form","Ver",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleFactura,"nuevorelaciones_button","Nuevo Rel",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFactura,"guardarcambiostabla_button","Guardar",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFactura,"cerrar_button","Salir",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleFactura.setToolTipText("Nuevo"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleFactura.setToolTipText("Duplicar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleFactura.setToolTipText("Copiar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleFactura.setToolTipText("Ver"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleFactura.setToolTipText("Nuevo Rel"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleFactura.setToolTipText("Guardar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFactura.setToolTipText("Salir"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFactura";
		inputMap = this.jButtonNuevoDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleFactura";
		inputMap = this.jButtonDuplicarDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleFactura"));
		
		//COPIAR
		sMapKey = "CopiarDetalleFactura";
		inputMap = this.jButtonCopiarDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleFactura"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleFactura";
		inputMap = this.jButtonVerFormDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleFactura";
		inputMap = this.jButtonNuevoRelacionesDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleFactura";
		inputMap = this.jButtonModificarDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleFactura";
		inputMap = this.jButtonCerrarDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFactura";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleFactura.setName("jPanelParametrosReportesDetalleFactura"); 
		
		this.jPanelParametrosReportesAccionesDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleFactura.setName("jPanelParametrosReportesAccionesDetalleFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleFactura = new JButtonMe();
		this.jButtonRecargarInformacionDetalleFactura.setText("Recargar");
		this.jButtonRecargarInformacionDetalleFactura.setToolTipText("Recargar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleFactura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleFactura = new JButtonMe();
		this.jButtonProcesarInformacionDetalleFactura.setText("Procesar");
		this.jButtonProcesarInformacionDetalleFactura.setToolTipText("Procesar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleFactura.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFactura.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleFactura.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFactura.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleFactura = new JLabelMe();
		
		this.jLabelAccionesDetalleFactura.setText("Acciones");		
		this.jLabelAccionesDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleFactura.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleFactura = new JButtonMe();
		//this.jButtonAnterioresDetalleFactura.setText("<<");
        this.jButtonAnterioresDetalleFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleFactura = new JButtonMe();
		//this.jButtonSiguientesDetalleFactura.setText(">>");
        this.jButtonSiguientesDetalleFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleFactura,"nuevoguardarcambios_button","Nue",this.detallefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleFactura";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleFactura";
		inputMap = this.jButtonRecargarInformacionDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleFactura";
		inputMap = this.jButtonSiguientesDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleFactura";
		inputMap = this.jButtonAnterioresDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleFactura.setMinimumSize(new Dimension(this.getWidth(),DetalleFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleFactura.setMaximumSize(new Dimension(this.getWidth(),DetalleFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleFactura.setPreferredSize(new Dimension(this.getWidth(),DetalleFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleFactura = new GridBagLayout();

			this.jPanelPaginacionDetalleFactura.setLayout(gridaBagLayoutPaginacionDetalleFactura);						
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = 0;
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleFactura.add(this.jButtonAnterioresDetalleFactura, this.gridBagConstraintsDetalleFactura);
					
						
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFactura.gridy = 0;
			
			this.jPanelPaginacionDetalleFactura.add(this.jButtonNuevoGuardarCambiosDetalleFactura, this.gridBagConstraintsDetalleFactura);
						
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFactura.gridy = 0;
			this.jPanelPaginacionDetalleFactura.add(this.jButtonSiguientesDetalleFactura, this.gridBagConstraintsDetalleFactura);
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = 0;
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleFactura.add(this.jButtonAbrirTotalesDetalleFactura, this.gridBagConstraintsDetalleFactura);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = 1;
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFactura.add(this.jButtonNuevoDetalleFactura, this.gridBagConstraintsDetalleFactura);
						
			
			
			if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
				this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleFactura.gridy = 1;
				this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleFactura.add(this.jButtonGuardarCambiosTablaDetalleFactura, this.gridBagConstraintsDetalleFactura);
			}
			
			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = 1;
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFactura.add(this.jButtonDuplicarDetalleFactura, this.gridBagConstraintsDetalleFactura);
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = 1;
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFactura.add(this.jButtonCopiarDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = 1;
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFactura.add(this.jButtonVerFormDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = 1;
			this.gridBagConstraintsDetalleFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleFactura.add(this.jButtonCerrarDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		
		
		this.jButtonRecargarInformacionDetalleFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleFactura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleFactura.setLayout(gridaBagParametrosReportesDetalleFactura);
			this.jPanelParametrosReportesAccionesDetalleFactura.setLayout(gridaBagParametrosReportesAccionesDetalleFactura);
			
			
			this.jPanelParametrosAuxiliar1DetalleFactura.setLayout(gridaBagParametrosAuxiliar1DetalleFactura);
			this.jPanelParametrosAuxiliar2DetalleFactura.setLayout(gridaBagParametrosAuxiliar2DetalleFactura);
			this.jPanelParametrosAuxiliar3DetalleFactura.setLayout(gridaBagParametrosAuxiliar3DetalleFactura);
			this.jPanelParametrosAuxiliar4DetalleFactura.setLayout(gridaBagParametrosAuxiliar4DetalleFactura);
			//this.jPanelParametrosAuxiliar5DetalleFactura.setLayout(gridaBagParametrosAuxiliar2DetalleFactura);			
			
			
			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFactura.add(this.jButtonRecargarInformacionDetalleFactura, this.gridBagConstraintsDetalleFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFactura.add(this.jComboBoxTiposPaginacionDetalleFactura, this.gridBagConstraintsDetalleFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFactura.add(this.jCheckBoxConAltoMaximoTablaDetalleFactura, this.gridBagConstraintsDetalleFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFactura.add(this.jComboBoxTiposArchivosReportesDetalleFactura, this.gridBagConstraintsDetalleFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFactura.add(this.jPanelParametrosAuxiliar1DetalleFactura, this.gridBagConstraintsDetalleFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleFactura.add(this.jComboBoxTiposReportesDetalleFactura, this.gridBagConstraintsDetalleFactura);																		
			
			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleFactura.add(this.jComboBoxTiposGraficosReportesDetalleFactura, this.gridBagConstraintsDetalleFactura);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFactura.add(this.jPanelParametrosAuxiliar4DetalleFactura, this.gridBagConstraintsDetalleFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFactura.add(this.jComboBoxTiposReportesDetalleFactura, this.gridBagConstraintsDetalleFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFactura.add(this.jCheckBoxGenerarReporteDetalleFactura, this.gridBagConstraintsDetalleFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFactura.add(this.jPanelParametrosAuxiliar2DetalleFactura, this.gridBagConstraintsDetalleFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFactura.add(this.jLabelAccionesDetalleFactura, this.gridBagConstraintsDetalleFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
				this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleFactura.add(this.jButtonAbrirOrderByDetalleFactura, this.gridBagConstraintsDetalleFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFactura.add(this.jComboBoxTiposSeleccionarDetalleFactura, this.gridBagConstraintsDetalleFactura);			
			
			
			/*
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFactura.add(this.jCheckBoxSeleccionarTodosDetalleFactura, this.gridBagConstraintsDetalleFactura);
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFactura.add(this.jCheckBoxConGraficoReporteDetalleFactura, this.gridBagConstraintsDetalleFactura);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFactura.add(this.jCheckBoxSeleccionarTodosDetalleFactura, this.gridBagConstraintsDetalleFactura);															
				
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFactura.add(this.jCheckBoxSeleccionadosDetalleFactura, this.gridBagConstraintsDetalleFactura);															
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFactura.add(this.jCheckBoxConGraficoReporteDetalleFactura, this.gridBagConstraintsDetalleFactura);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFactura.add(this.jPanelParametrosAuxiliar3DetalleFactura, this.gridBagConstraintsDetalleFactura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFactura.add(this.jComboBoxTiposAccionesDetalleFactura, this.gridBagConstraintsDetalleFactura);
	
				
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFactura.add(this.jTextFieldValorCampoGeneralDetalleFactura, this.gridBagConstraintsDetalleFactura);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleFactura = new GridBagLayout();

			this.jScrollPanelDatosDetalleFactura.setLayout(gridaBagLayoutDatosDetalleFactura);
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = 0;
			this.gridBagConstraintsDetalleFactura.gridx = 0;
			
			this.jScrollPanelDatosDetalleFactura.add(this.jTableDatosDetalleFactura, this.gridBagConstraintsDetalleFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleFactura.setViewportView(this.jTableDatosDetalleFactura);
		this.jTableDatosDetalleFactura.setFillsViewportHeight(true);
		this.jTableDatosDetalleFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleFacturaTotales.setViewportView(this.jTableDatosDetalleFacturaTotales);
		//this.jTableDatosDetalleFacturaTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleFacturaTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleFactura= new GridBagLayout();
		this.jPanelAccionesDetalleFactura.setLayout(gridaBagLayoutAccionesDetalleFactura);
		
		
		/*	
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = 0;
		this.gridBagConstraintsDetalleFactura.gridx = 0;
			
		this.jPanelAccionesDetalleFactura.add(this.jButtonNuevoDetalleFactura, this.gridBagConstraintsDetalleFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleFactura= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleFactura.setLayout(gridaBagLayoutFK_IdBodegaDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 0;
		jPanelFK_IdBodegaDetalleFactura.add(jLabelid_bodegaFK_IdBodegaDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 1;
		jPanelFK_IdBodegaDetalleFactura.add(jComboBoxid_bodegaFK_IdBodegaDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 1;
		gridBagConstraintsDetalleFactura.gridx =1;
		jPanelFK_IdBodegaDetalleFactura.add(jButtonFK_IdBodegaDetalleFactura, gridBagConstraintsDetalleFactura);

		jTabbedPaneBusquedasDetalleFactura.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleFactura);
		jTabbedPaneBusquedasDetalleFactura.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleFactura= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleFactura.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 0;
		jPanelFK_IdCentroCostoDetalleFactura.add(jLabelid_centro_costoFK_IdCentroCostoDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 1;
		jPanelFK_IdCentroCostoDetalleFactura.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleFactura, gridBagConstraintsDetalleFactura);


		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 0;
		jPanelFK_IdCentroCostoDetalleFactura.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 1;
		gridBagConstraintsDetalleFactura.gridx =1;
		jPanelFK_IdCentroCostoDetalleFactura.add(jButtonFK_IdCentroCostoDetalleFactura, gridBagConstraintsDetalleFactura);

		jTabbedPaneBusquedasDetalleFactura.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleFactura);
		jTabbedPaneBusquedasDetalleFactura.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdFacturaDetalleFactura= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaDetalleFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaDetalleFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaDetalleFactura.setLayout(gridaBagLayoutFK_IdFacturaDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 0;
		jPanelFK_IdFacturaDetalleFactura.add(jLabelid_facturaFK_IdFacturaDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 1;
		jPanelFK_IdFacturaDetalleFactura.add(jComboBoxid_facturaFK_IdFacturaDetalleFactura, gridBagConstraintsDetalleFactura);


		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 0;
		jPanelFK_IdFacturaDetalleFactura.add(this.jButtonBuscarFK_IdFacturaid_facturaDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 1;
		gridBagConstraintsDetalleFactura.gridx =1;
		jPanelFK_IdFacturaDetalleFactura.add(jButtonFK_IdFacturaDetalleFactura, gridBagConstraintsDetalleFactura);

		jTabbedPaneBusquedasDetalleFactura.addTab("3.-Por Factura ", jPanelFK_IdFacturaDetalleFactura);
		jTabbedPaneBusquedasDetalleFactura.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleFactura= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleFactura.setLayout(gridaBagLayoutFK_IdProductoDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 0;
		jPanelFK_IdProductoDetalleFactura.add(jLabelid_productoFK_IdProductoDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 1;
		jPanelFK_IdProductoDetalleFactura.add(jComboBoxid_productoFK_IdProductoDetalleFactura, gridBagConstraintsDetalleFactura);


		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 0;
		jPanelFK_IdProductoDetalleFactura.add(this.jButtonBuscarFK_IdProductoid_productoDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 1;
		gridBagConstraintsDetalleFactura.gridx =1;
		jPanelFK_IdProductoDetalleFactura.add(jButtonFK_IdProductoDetalleFactura, gridBagConstraintsDetalleFactura);

		jTabbedPaneBusquedasDetalleFactura.addTab("4.-Por Producto ", jPanelFK_IdProductoDetalleFactura);
		jTabbedPaneBusquedasDetalleFactura.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleFactura= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleFactura.setLayout(gridaBagLayoutFK_IdUnidadDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 0;
		jPanelFK_IdUnidadDetalleFactura.add(jLabelid_unidadFK_IdUnidadDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 0;
		gridBagConstraintsDetalleFactura.gridx = 1;
		jPanelFK_IdUnidadDetalleFactura.add(jComboBoxid_unidadFK_IdUnidadDetalleFactura, gridBagConstraintsDetalleFactura);

		gridBagConstraintsDetalleFactura = new GridBagConstraints();
		gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFactura.gridy = 1;
		gridBagConstraintsDetalleFactura.gridx =1;
		jPanelFK_IdUnidadDetalleFactura.add(jButtonFK_IdUnidadDetalleFactura, gridBagConstraintsDetalleFactura);

		jTabbedPaneBusquedasDetalleFactura.addTab("5.-Por Unidad ", jPanelFK_IdUnidadDetalleFactura);
		jTabbedPaneBusquedasDetalleFactura.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallefacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFactura.gridx = 0;		
			//this.gridBagConstraintsDetalleFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleFactura, this.gridBagConstraintsDetalleFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleFactura.gridx = 0;		
		//this.gridBagConstraintsDetalleFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFactura.gridx = 0;		
			this.gridBagConstraintsDetalleFactura.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleFactura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleFactura, this.gridBagConstraintsDetalleFactura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleFactura, this.gridBagConstraintsDetalleFactura);								
		
		
		/*
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleFactura, this.gridBagConstraintsDetalleFactura);
		*/		
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFactura.gridx =0;
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFactura, this.gridBagConstraintsDetalleFactura);
				
		//this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleFactura.gridx =0;
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleFactura.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleFacturaTotales/*this.jTableDatosDetalleFacturaTotales*/, this.gridBagConstraintsDetalleFactura);				
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleFactura, this.gridBagConstraintsDetalleFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleFacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleFactura.setLayout(gridaBagLayoutBusquedasParametrosDetalleFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFactura, this.gridBagConstraintsDetalleFactura);
			
			
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
			
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFactura, this.gridBagConstraintsDetalleFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleFactura.setName("jPanelReporteDinamicoDetalleFactura"); 
		
		this.jPanelReporteDinamicoDetalleFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleFactura.setLayout(gridaBagLayoutReporteDinamicoDetalleFactura);
		
		
		this.jInternalFrameReporteDinamicoDetalleFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleFactura = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFactura.add(this.jLabelColumnasSelectReporteDetalleFactura, this.gridBagConstraintsDetalleFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleFactura = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleFactura=new JScrollPane(this.jListColumnasSelectReporteDetalleFactura);
			
			this.jScrollColumnasSelectReporteDetalleFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleFactura.add(this.jListColumnasSelectReporteDetalleFactura, this.gridBagConstraintsDetalleFactura);
		this.jPanelReporteDinamicoDetalleFactura.add(this.jScrollColumnasSelectReporteDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleFactura = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleFactura = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleFactura=new JScrollPane(this.jListRelacionesSelectReporteDetalleFactura);
			
			this.jScrollRelacionesSelectReporteDetalleFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleFactura = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleFactura.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFactura.add(this.jLabelConGraficoDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleFactura.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleFactura.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFactura.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFactura.add(this.jCheckBoxConGraficoDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleFactura = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleFactura.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFactura.add(this.jLabelColumnaCategoriaGraficoDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFactura.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleFactura.add(this.jComboBoxColumnaCategoriaGraficoDetalleFactura, this.gridBagConstraintsDetalleFactura);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleFactura = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleFactura.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFactura.add(this.jLabelColumnaCategoriaValorDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleFactura.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleFactura.add(this.jComboBoxColumnaCategoriaValorDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleFactura = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleFactura.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFactura.add(this.jLabelColumnasValoresGraficoDetalleFactura, this.gridBagConstraintsDetalleFactura);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleFactura = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleFactura.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleFactura=new JScrollPane(this.jListColumnasValoresGraficoDetalleFactura);
			
			this.jScrollColumnasValoresGraficoDetalleFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleFactura.add(this.jListColumnasSelectReporteDetalleFactura, this.gridBagConstraintsDetalleFactura);
		this.jPanelReporteDinamicoDetalleFactura.add(this.jScrollColumnasValoresGraficoDetalleFactura, this.gridBagConstraintsDetalleFactura);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleFactura = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleFactura.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFactura.add(this.jLabelTiposGraficosReportesDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFactura.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFactura.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFactura.add(this.jLabelGenerarExcelReporteDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleFactura.setToolTipText("Generar EXCEL"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleFactura.add(this.jButtonGenerarExcelReporteDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFactura.add(this.jComboBoxTiposReportesDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFactura.add(this.jLabelTiposArchivoReporteDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFactura.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleFactura.setToolTipText("Generar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFactura.add(this.jButtonGenerarReporteDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleFactura.setToolTipText("Cancelar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFactura.add(this.jButtonCerrarReporteDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleFactura= new JScrollPane(jPanelReporteDinamicoDetalleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleFactura);
		this.jInternalFrameReporteDinamicoDetalleFactura.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleFactura, this.gridBagConstraintsDetalleFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleFactura.setName("jPanelImportacionDetalleFactura"); 
		
		this.jPanelImportacionDetalleFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleFactura.setLayout(gridaBagLayoutImportacionDetalleFactura);
		
		
		this.jInternalFrameImportacionDetalleFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFactura.setResizable(true);
	    this.jInternalFrameImportacionDetalleFactura.setClosable(true);
	    this.jInternalFrameImportacionDetalleFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFactura.setResizable(true);
	    this.jInternalFrameImportacionDetalleFactura.setClosable(true);
	    this.jInternalFrameImportacionDetalleFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleFactura = new JLabelMe();

		this.jLabelArchivoImportacionDetalleFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFactura.add(this.jLabelArchivoImportacionDetalleFactura, this.gridBagConstraintsDetalleFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleFactura = new JFileChooser();		
		this.jFileChooserImportacionDetalleFactura.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleFactura = new JButtonMe();
		this.jButtonAbrirImportacionDetalleFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleFactura.setToolTipText("Generar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFactura.add(this.jButtonAbrirImportacionDetalleFactura, this.gridBagConstraintsDetalleFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFactura.add(this.jLabelPathArchivoImportacionDetalleFactura, this.gridBagConstraintsDetalleFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFactura.add(this.jTextFieldPathArchivoImportacionDetalleFactura, this.gridBagConstraintsDetalleFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleFactura = new JButtonMe();
		this.jButtonGenerarImportacionDetalleFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleFactura.setToolTipText("Generar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFactura.add(this.jButtonGenerarImportacionDetalleFactura, this.gridBagConstraintsDetalleFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleFactura = new JButtonMe();
		this.jButtonCerrarImportacionDetalleFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleFactura.setToolTipText("Cancelar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFactura.add(this.jButtonCerrarImportacionDetalleFactura, this.gridBagConstraintsDetalleFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleFactura= new JScrollPane(jPanelImportacionDetalleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleFactura);
		this.jInternalFrameImportacionDetalleFactura.getContentPane().add(this.jScrollPanelImportacionDetalleFactura, this.gridBagConstraintsDetalleFactura);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleFactura() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleFactura = new JButtonMe();
		this.jButtonAbrirTotalesDetalleFactura.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleFactura,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleFactura.setName("jPanelTotalesDetalleFactura"); 
		
		this.jPanelTotalesDetalleFactura.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleFactura.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleFactura.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleFactura.setLayout(gridaBagLayoutTotalesDetalleFactura);
		
		
		this.jInternalFrameTotalesDetalleFactura= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleFactura= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFactura= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleFactura.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleFactura.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleFactura.setResizable(true);
	    this.jInternalFrameTotalesDetalleFactura.setClosable(true);
	    this.jInternalFrameTotalesDetalleFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleFactura.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleFactura.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleFactura.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleFactura.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleFactura.ipady =150;
		
		this.jPanelTotalesDetalleFactura.add(jScrollPanelDatosDetalleFacturaTotales, this.gridBagConstraintsDetalleFactura);//this.jTableDatosDetalleFacturaTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleFactura = new JButtonMe();
		this.jButtonCerrarTotalesDetalleFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleFactura.setToolTipText("Cancelar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFactura.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleFactura.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleFactura.add(this.jButtonCerrarTotalesDetalleFactura, this.gridBagConstraintsDetalleFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleFactura = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleFactura= new JScrollPane(jPanelTotalesDetalleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
		this.gridBagConstraintsDetalleFactura.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleFactura.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleFactura.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleFactura);
		this.jInternalFrameTotalesDetalleFactura.getContentPane().add(this.jScrollPanelTotalesDetalleFactura, this.gridBagConstraintsDetalleFactura);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleFactura = new JButtonMe();
			this.jButtonAbrirOrderByDetalleFactura.setText("Orden");
			this.jButtonAbrirOrderByDetalleFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleFactura";
			inputMap = this.jButtonAbrirOrderByDetalleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleFactura.setName("jPanelOrderByDetalleFactura"); 
			
			this.jPanelOrderByDetalleFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleFactura.setLayout(gridaBagLayoutOrderByDetalleFactura);
			
			
			this.jTableDatosDetalleFacturaOrderBy = new JTableMe();        
			this.jTableDatosDetalleFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleFacturaOrderBy.setViewportView(this.jTableDatosDetalleFacturaOrderBy);
			this.jTableDatosDetalleFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleFactura.setTitle("Orden");
			this.jInternalFrameOrderByDetalleFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleFactura.setResizable(true);
			this.jInternalFrameOrderByDetalleFactura.setClosable(true);
			this.jInternalFrameOrderByDetalleFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleFactura.ipady =150;
				
			this.jPanelOrderByDetalleFactura.add(jScrollPanelDatosDetalleFacturaOrderBy, this.gridBagConstraintsDetalleFactura);//this.jTableDatosDetalleFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleFactura = new JButtonMe();
			this.jButtonCerrarOrderByDetalleFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleFactura.setToolTipText("Cancelar"+" "+DetalleFacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleFactura.add(this.jButtonCerrarOrderByDetalleFactura, this.gridBagConstraintsDetalleFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleFactura= new JScrollPane(jPanelOrderByDetalleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleFactura = new GridBagConstraints();
			this.gridBagConstraintsDetalleFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleFactura);
			
			this.jInternalFrameOrderByDetalleFactura.getContentPane().add(this.jScrollPanelOrderByDetalleFactura, this.gridBagConstraintsDetalleFactura);			
		
		} else {
			this.jButtonAbrirOrderByDetalleFactura = new JButtonMe();
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
		int iWidthTableCalculado=0;//4930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallefacturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleFactura.getRowHeight();//DetalleFacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFactura.isSelected()) {
					iHeightTable=DetalleFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFactura.isSelected()) {
					iHeightTable=DetalleFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleFactura!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleFactura.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleFactura.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleFactura.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleFactura.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleFactura.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleFactura.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleFactura.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleFactura!=null && this.jInternalFrameOrderByDetalleFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.detallefacturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetalleFactura!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleFactura.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleFactura.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleFactura.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleFactura.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleFactura.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleFactura.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleFactura.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallefacturaLogic.getDetalleFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallefacturas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleFactura> TraerDetalleFacturaBeans(List<DetalleFactura> detallefacturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleFactura detallefactura:detallefacturas) {
					
				if(!(DetalleFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallefactura.setsDetalleGeneralEntityReporte(DetalleFacturaConstantesFunciones.getDetalleFacturaDescripcion(detallefactura));
										
						
					
						
					
				} else  {
							
					//detallefactura.setsDetalleGeneralEntityReporte(detallefactura.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallefacturabeans.add(detallefacturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallefacturas;
    }
	//PARA REPORTES FIN
}
