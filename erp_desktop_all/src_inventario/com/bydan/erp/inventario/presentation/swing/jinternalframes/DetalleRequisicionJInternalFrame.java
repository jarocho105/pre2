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
import com.bydan.erp.inventario.util.DetalleRequisicionConstantesFunciones;

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
public class DetalleRequisicionJInternalFrame extends DetalleRequisicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleRequisicion;
	
	protected JMenuBar jmenuBarDetalleRequisicion;
	
	protected JMenu jmenuDetalleRequisicion;
	protected JMenu jmenuDatosDetalleRequisicion;
	protected JMenu jmenuArchivoDetalleRequisicion;
	protected JMenu jmenuAccionesDetalleRequisicion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleRequisicion;	
	protected GridBagConstraints gridBagConstraintsDetalleRequisicion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleRequisicionDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleRequisicion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleRequisicion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleRequisicion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected RequisicionBeanSwingJInternalFrame requisicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_requisicion="";

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
	
	public DetalleRequisicionSessionBean detallerequisicionSessionBean;
		
	
	
	public RequisicionSessionBean requisicionSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleRequisicion> detallerequisicions;		
	public List<DetalleRequisicion> detallerequisicionsEliminados;	
	public List<DetalleRequisicion> detallerequisicionsAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleRequisicion;		
	protected JButton jButtonAbrirTotalesDetalleRequisicion;		
	
	/*
	protected JPanel jPanelTotalesDetalleRequisicion;
	public JScrollPane jScrollPanelTotalesDetalleRequisicion;	
	protected JButton jButtonCerrarTotalesDetalleRequisicion;
	*/
	
	public List<DetalleRequisicion> detallerequisicionsTotal= new ArrayList<DetalleRequisicion>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleRequisicion;		
	protected JButton jButtonAbrirOrderByDetalleRequisicion;
	
	
	//protected JPanel jPanelOrderByDetalleRequisicion;
	//public JScrollPane jScrollPanelOrderByDetalleRequisicion;	
	//protected JButton jButtonCerrarOrderByDetalleRequisicion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleRequisicionLogic detallerequisicionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleRequisicion;
	public JScrollPane jScrollPanelDatosEdicionDetalleRequisicion;
	public JScrollPane jScrollPanelDatosGeneralDetalleRequisicion;
    //public JScrollPane jScrollPanelDatosDetalleRequisicionTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetalleRequisicionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleRequisicion;
	//public JScrollPane jScrollPanelImportacionDetalleRequisicion;
	
	
	
	protected JPanel jPanelAccionesDetalleRequisicion;
	
    protected JPanel jPanelPaginacionDetalleRequisicion;
    protected JPanel jPanelParametrosReportesDetalleRequisicion;
	protected JPanel jPanelParametrosReportesAccionesDetalleRequisicion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleRequisicion;
	protected JPanel jPanelParametrosAuxiliar2DetalleRequisicion;
	protected JPanel jPanelParametrosAuxiliar3DetalleRequisicion;
	protected JPanel jPanelParametrosAuxiliar4DetalleRequisicion;
	//protected JPanel jPanelParametrosAuxiliar5DetalleRequisicion;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleRequisicion;
	//protected JPanel jPanelImportacionDetalleRequisicion;
	
	
	public JTable jTableDatosDetalleRequisicion;
	//public JTable jTableDatosDetalleRequisicionTotales;
	
	
	//public JTable jTableDatosDetalleRequisicionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleRequisicion;
	protected JButton jButtonDuplicarDetalleRequisicion;
	protected JButton jButtonCopiarDetalleRequisicion;
	protected JButton jButtonVerFormDetalleRequisicion;
	protected JButton jButtonNuevoRelacionesDetalleRequisicion;
	protected JButton jButtonModificarDetalleRequisicion;
	
    protected JButton jButtonGuardarCambiosTablaDetalleRequisicion;
	protected JButton jButtonCerrarDetalleRequisicion;
	
	
	protected JButton jButtonRecargarInformacionDetalleRequisicion;
	protected JButton jButtonProcesarInformacionDetalleRequisicion;
	
	
	protected JButton jButtonAnterioresDetalleRequisicion;
	protected JButton jButtonSiguientesDetalleRequisicion;
	protected JButton jButtonNuevoGuardarCambiosDetalleRequisicion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleRequisicion;
	//protected JButton jButtonCerrarReporteDinamicoDetalleRequisicion;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleRequisicion;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleRequisicion;
	//protected JButton jButtonGenerarImportacionDetalleRequisicion;
	//protected JButton jButtonCerrarImportacionDetalleRequisicion;
	//protected JFileChooser jFileChooserImportacionDetalleRequisicion;
	//protected File fileImportacionDetalleRequisicion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleRequisicion;
	protected JButton jButtonDuplicarToolBarDetalleRequisicion;
	protected JButton jButtonNuevoRelacionesToolBarDetalleRequisicion;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleRequisicion;
	protected JButton jButtonCopiarToolBarDetalleRequisicion;
	protected JButton jButtonVerFormToolBarDetalleRequisicion;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleRequisicion;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleRequisicion;
	protected JButton jButtonCerrarToolBarDetalleRequisicion;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleRequisicion;
	protected JButton jButtonProcesarInformacionToolBarDetalleRequisicion;
	protected JButton jButtonAnterioresToolBarDetalleRequisicion;
	protected JButton jButtonSiguientesToolBarDetalleRequisicion;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleRequisicion;
	protected JButton jButtonAbrirOrderByToolBarDetalleRequisicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleRequisicion;
	protected JMenuItem jMenuItemDuplicarDetalleRequisicion;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleRequisicion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleRequisicion;
	protected JMenuItem jMenuItemCopiarDetalleRequisicion;
	protected JMenuItem jMenuItemVerFormDetalleRequisicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleRequisicion;
	protected JMenuItem jMenuItemCerrarDetalleRequisicion;
	protected JMenuItem jMenuItemDetalleCerrarDetalleRequisicion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleRequisicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleRequisicion;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleRequisicion;
	protected JMenuItem jMenuItemProcesarInformacionDetalleRequisicion;
	protected JMenuItem jMenuItemAnterioresDetalleRequisicion;
	protected JMenuItem jMenuItemSiguientesDetalleRequisicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleRequisicion;
	protected JMenuItem jMenuItemAbrirOrderByDetalleRequisicion;
	protected JMenuItem jMenuItemMostrarOcultarDetalleRequisicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleRequisicion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleRequisicion;
	protected JCheckBox jCheckBoxSeleccionadosDetalleRequisicion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleRequisicion;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleRequisicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleRequisicion;
	protected JTextField jTextFieldValorCampoGeneralDetalleRequisicion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleRequisicion;
	//public JList<Reporte> jListColumnasSelectReporteDetalleRequisicion;
	//public JScrollPane jScrollColumnasSelectReporteDetalleRequisicion;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleRequisicion;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleRequisicion;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleRequisicion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleRequisicion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleRequisicion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleRequisicion;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleRequisicion;
	
		
	//public JLabel jLabelArchivoImportacionDetalleRequisicion;	
	//public JLabel jLabelPathArchivoImportacionDetalleRequisicion;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleRequisicion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleRequisicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleRequisicion;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleRequisicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleRequisicion;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleRequisicion;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleRequisicion;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleRequisicion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleRequisicion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleRequisicion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleRequisicion;
	public JPanel jPanelFK_IdBodegaDetalleRequisicion;
	public JButton jButtonFK_IdBodegaDetalleRequisicion;
	public JPanel jPanelFK_IdProductoDetalleRequisicion;
	public JButton jButtonFK_IdProductoDetalleRequisicion;
	public JPanel jPanelFK_IdRequisicionDetalleRequisicion;
	public JButton jButtonFK_IdRequisicionDetalleRequisicion;
	public JPanel jPanelFK_IdUnidadDetalleRequisicion;
	public JButton jButtonFK_IdUnidadDetalleRequisicion;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleRequisicion;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleRequisicion;
	public JLabel jLabelid_productoFK_IdProductoDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleRequisicion;
	public JButton jButtonid_productoFK_IdProductoDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleRequisicionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleRequisicion;
	
	public JPanel jPanelid_requisicionFK_IdRequisicionDetalleRequisicion;
	public JLabel jLabelid_requisicionFK_IdRequisicionDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion;
	public JButton jButtonid_requisicionFK_IdRequisicionDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_requisicionFK_IdRequisicionDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_requisicionFK_IdRequisicionDetalleRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleRequisicion;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleRequisicion;
	public JButton jButtonid_unidadFK_IdUnidadDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleRequisicionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleRequisicionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleRequisicion)	{
		this.jButtonRecargarInformacionDetalleRequisicion = jButtonRecargarInformacionDetalleRequisicion;
	}
	
	public JButton getjButtonProcesarInformacionDetalleRequisicion() {
		return this.jButtonProcesarInformacionDetalleRequisicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleRequisicion)	{
		this.jButtonProcesarInformacionDetalleRequisicion = jButtonProcesarInformacionDetalleRequisicion;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleRequisicion() {
		return this.jButtonRecargarInformacionDetalleRequisicion;
	}
	
	
	public List<DetalleRequisicion> getdetallerequisicions() {
		return this.detallerequisicions;
	}

	public void setdetallerequisicions(List<DetalleRequisicion> detallerequisicions) {
		this.detallerequisicions = detallerequisicions;
	}
	
	public List<DetalleRequisicion> getdetallerequisicionsAux() {
		return this.detallerequisicionsAux;
	}

	public void setdetallerequisicionsAux(List<DetalleRequisicion> detallerequisicionsAux) {
		this.detallerequisicionsAux = detallerequisicionsAux;
	}
	
	public List<DetalleRequisicion> getdetallerequisicionsEliminados() {
		return this.detallerequisicionsEliminados;
	}

	public void setDetalleRequisicionsEliminados(List<DetalleRequisicion> detallerequisicionsEliminados) {
		this.detallerequisicionsEliminados = detallerequisicionsEliminados;
	}
	
	public List<DetalleRequisicion> getdetallerequisicionsTotal() {
		return this.detallerequisicionsTotal;
	}

	public void setdetallerequisicionsTotal(List<DetalleRequisicion> detallerequisicionsTotal) {
		this.detallerequisicionsTotal = detallerequisicionsTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleRequisicion() {
		return jComboBoxTiposSeleccionarDetalleRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleRequisicion(
			JComboBox jComboBoxTiposSeleccionarDetalleRequisicion) {
		this.jComboBoxTiposSeleccionarDetalleRequisicion = jComboBoxTiposSeleccionarDetalleRequisicion;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleRequisicion() {
		return jTextFieldValorCampoGeneralDetalleRequisicion;
	}

	public void setjTextFieldValorCampoGeneralDetalleRequisicion(
			JTextField jTextFieldValorCampoGeneralDetalleRequisicion) {
		this.jTextFieldValorCampoGeneralDetalleRequisicion = jTextFieldValorCampoGeneralDetalleRequisicion;
	}

	public void setBorderResaltarValorCampoGeneralDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleRequisicion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleRequisicion() {
		return this.jCheckBoxSeleccionarTodosDetalleRequisicion;
	}

	public void setjCheckBoxSeleccionarTodosDetalleRequisicion(
			JCheckBox jCheckBoxSeleccionarTodosDetalleRequisicion) {
		this.jCheckBoxSeleccionarTodosDetalleRequisicion = jCheckBoxSeleccionarTodosDetalleRequisicion;
	}

	public void setBorderResaltarSeleccionarTodosDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleRequisicion() {
		return this.jCheckBoxSeleccionadosDetalleRequisicion;
	}

	public void setjCheckBoxSeleccionadosDetalleRequisicion(
			JCheckBox jCheckBoxSeleccionadosDetalleRequisicion) {
		this.jCheckBoxSeleccionadosDetalleRequisicion = jCheckBoxSeleccionadosDetalleRequisicion;
	}
	
	public void setBorderResaltarSeleccionadosDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleRequisicion() {
		return this.jComboBoxTiposArchivosReportesDetalleRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleRequisicion(
			JComboBox jComboBoxTiposArchivosReportesDetalleRequisicion) {
		this.jComboBoxTiposArchivosReportesDetalleRequisicion = jComboBoxTiposArchivosReportesDetalleRequisicion;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleRequisicion() {
		return this.jComboBoxTiposReportesDetalleRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleRequisicion(
			JComboBox jComboBoxTiposReportesDetalleRequisicion) {
		this.jComboBoxTiposReportesDetalleRequisicion = jComboBoxTiposReportesDetalleRequisicion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleRequisicion() {
	//	return jComboBoxTiposReportesDinamicoDetalleRequisicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleRequisicion(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleRequisicion) {
	//	this.jComboBoxTiposReportesDinamicoDetalleRequisicion = jComboBoxTiposReportesDinamicoDetalleRequisicion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleRequisicion() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleRequisicion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion = jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion;
	//}
	
	public void setBorderResaltarTiposReportesDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleRequisicion() {
		return this.jComboBoxTiposGraficosReportesDetalleRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleRequisicion(
			JComboBox jComboBoxTiposGraficosReportesDetalleRequisicion) {
		this.jComboBoxTiposGraficosReportesDetalleRequisicion = jComboBoxTiposGraficosReportesDetalleRequisicion;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleRequisicion() {
		return this.jComboBoxTiposPaginacionDetalleRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleRequisicion(
			JComboBox jComboBoxTiposPaginacionDetalleRequisicion) {
		this.jComboBoxTiposPaginacionDetalleRequisicion = jComboBoxTiposPaginacionDetalleRequisicion;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleRequisicion() {
		return this.jComboBoxTiposRelacionesDetalleRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleRequisicion() {
		return this.jComboBoxTiposAccionesDetalleRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleRequisicion(
			JComboBox jComboBoxTiposRelacionesDetalleRequisicion) {
		this.jComboBoxTiposRelacionesDetalleRequisicion = jComboBoxTiposRelacionesDetalleRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleRequisicion(
			JComboBox jComboBoxTiposAccionesDetalleRequisicion) {
		this.jComboBoxTiposAccionesDetalleRequisicion = jComboBoxTiposAccionesDetalleRequisicion;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleRequisicion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleRequisicion() {
	//	return jCheckBoxConGraficoDinamicoDetalleRequisicion;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleRequisicion(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleRequisicion) {
	//	this.jCheckBoxConGraficoDinamicoDetalleRequisicion = jCheckBoxConGraficoDinamicoDetalleRequisicion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleRequisicion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleRequisicion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleRequisicion .setBorder(borderResaltar);		
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
		this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
		
		this.detallerequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallerequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallerequisicionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleRequisicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Requisicion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRequisicion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"nuevo","nuevo","Nuevo"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"duplicar","duplicar","Duplicar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"copiar","copiar","Copiar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"ver_form","ver_form","Ver"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"recargar","recargar","Recargar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleRequisicion,this.jTtoolBarDetalleRequisicion,
							"cerrar","cerrar","Salir"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleRequisicion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleRequisicion;
			
				this.jButtonProcesarInformacionToolBarDetalleRequisicion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleRequisicion;
				
		//protected JButton jButtonModificarToolBarDetalleRequisicion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleRequisicion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleRequisicion=new JMenuMe("General");
		this.jmenuArchivoDetalleRequisicion=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleRequisicion=new JMenuMe("Acciones");
		this.jmenuDatosDetalleRequisicion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleRequisicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleRequisicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleRequisicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleRequisicion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleRequisicion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleRequisicion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleRequisicion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleRequisicion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleRequisicion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleRequisicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleRequisicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleRequisicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleRequisicion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleRequisicion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleRequisicion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleRequisicion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleRequisicion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleRequisicion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleRequisicion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleRequisicion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleRequisicion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleRequisicion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleRequisicion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleRequisicion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleRequisicion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleRequisicion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleRequisicion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleRequisicion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleRequisicion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleRequisicion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleRequisicion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleRequisicion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleRequisicion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleRequisicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleRequisicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleRequisicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleRequisicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleRequisicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleRequisicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleRequisicion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleRequisicion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleRequisicion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleRequisicion.add(this.jMenuItemCerrarDetalleRequisicion);
			
			this.jmenuAccionesDetalleRequisicion.add(this.jMenuItemNuevoDetalleRequisicion);
			this.jmenuAccionesDetalleRequisicion.add(this.jMenuItemNuevoGuardarCambiosDetalleRequisicion);
			this.jmenuAccionesDetalleRequisicion.add(this.jMenuItemNuevoRelacionesDetalleRequisicion);
			this.jmenuAccionesDetalleRequisicion.add(this.jMenuItemGuardarCambiosTablaDetalleRequisicion);		
			this.jmenuAccionesDetalleRequisicion.add(this.jMenuItemDuplicarDetalleRequisicion);		
			this.jmenuAccionesDetalleRequisicion.add(this.jMenuItemCopiarDetalleRequisicion);		
			this.jmenuAccionesDetalleRequisicion.add(this.jMenuItemVerFormDetalleRequisicion);		
			
			this.jmenuDatosDetalleRequisicion.add(this.jMenuItemRecargarInformacionDetalleRequisicion);				
			this.jmenuDatosDetalleRequisicion.add(this.jMenuItemAnterioresDetalleRequisicion);				
			this.jmenuDatosDetalleRequisicion.add(this.jMenuItemSiguientesDetalleRequisicion);				
			this.jmenuDatosDetalleRequisicion.add(this.jMenuItemAbrirOrderByDetalleRequisicion);				
			this.jmenuDatosDetalleRequisicion.add(this.jMenuItemMostrarOcultarDetalleRequisicion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleRequisicion.add(this.jMenuItemGuardarCambiosDetalleRequisicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRequisicion.add(this.jmenuArchivoDetalleRequisicion);		
			this.jmenuBarDetalleRequisicion.add(this.jmenuAccionesDetalleRequisicion);		
			this.jmenuBarDetalleRequisicion.add(this.jmenuDatosDetalleRequisicion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleRequisicion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleRequisicion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleRequisicion.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleRequisicion= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleRequisicion.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleRequisicion.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleRequisicion,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleRequisicion = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleRequisicion.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleRequisicion.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleRequisicion.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleRequisicion= new JButtonMe();
		this.jButtonFK_IdProductoDetalleRequisicion.setText("Buscar");
		this.jButtonFK_IdProductoDetalleRequisicion.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleRequisicion,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleRequisicion = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleRequisicion.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleRequisicion.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion.setFocusable(false);

		this.jPanelFK_IdRequisicionDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRequisicionDetalleRequisicion.setToolTipText("Buscar Por Requisicion ");
		this.jButtonFK_IdRequisicionDetalleRequisicion= new JButtonMe();
		this.jButtonFK_IdRequisicionDetalleRequisicion.setText("Buscar");
		this.jButtonFK_IdRequisicionDetalleRequisicion.setToolTipText("Buscar Por Requisicion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRequisicionDetalleRequisicion,"buscar_button","Buscar Por Requisicion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRequisicionDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_requisicionFK_IdRequisicionDetalleRequisicion = new JLabelMe();
		jLabelid_requisicionFK_IdRequisicionDetalleRequisicion.setText("Requisicion :");
		jLabelid_requisicionFK_IdRequisicionDetalleRequisicion.setToolTipText("Requisicion");
		jLabelid_requisicionFK_IdRequisicionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_requisicionFK_IdRequisicionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_requisicionFK_IdRequisicionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_requisicionFK_IdRequisicionDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleRequisicion.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleRequisicion= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleRequisicion.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleRequisicion.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleRequisicion,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleRequisicion = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleRequisicion.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleRequisicion.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleRequisicion=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleRequisicion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleRequisicion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleRequisicion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleRequisicion = new DetalleRequisicionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Requisicion DATOS");
			this.jInternalFrameDetalleFormDetalleRequisicion = new DetalleRequisicionDetalleFormJInternalFrame(jDesktopPane,this.detallerequisicionSessionBean.getConGuardarRelaciones(),this.detallerequisicionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleRequisicion = null;//new DetalleRequisicionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleRequisicion= new GridBagLayout();
		
		
		this.jTableDatosDetalleRequisicion = new JTableMe();      
		
		String sToolTipDetalleRequisicion="";
		sToolTipDetalleRequisicion=DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleRequisicion+="(Inventario.DetalleRequisicion)";
		}
		
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleRequisicion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleRequisicion.setToolTipText(sToolTipDetalleRequisicion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleRequisicion);
		this.jTableDatosDetalleRequisicion.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleRequisicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleRequisicion.setRowSelectionAllowed(true);
		this.jTableDatosDetalleRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleRequisicionTotales = new JTableMe();        
		//this.jTableDatosDetalleRequisicionTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleRequisicionTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleRequisicion = new JButtonMe();
		this.jButtonDuplicarDetalleRequisicion = new JButtonMe();
		this.jButtonCopiarDetalleRequisicion = new JButtonMe();
		this.jButtonVerFormDetalleRequisicion = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleRequisicion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleRequisicion = new JButtonMe();
		this.jButtonCerrarDetalleRequisicion = new JButtonMe();
		
		this.jScrollPanelDatosDetalleRequisicion = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleRequisicion = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleRequisicionTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Requisicion";
		
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicions" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleRequisicionTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesDetalleRequisicion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleRequisicion=new ReporteDinamicoJInternalFrame(DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleRequisicion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleRequisicion=new ImportacionJInternalFrame(DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleRequisicion();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleRequisicion = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleRequisicion.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleRequisicion,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleRequisicion=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleRequisicion,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleRequisicion();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleRequisicion = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleRequisicion.setText("Orden");
		this.jButtonAbrirOrderByDetalleRequisicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleRequisicion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRequisicion,false,this);
			
			//this.cargarOrderByDetalleRequisicion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRequisicion,true,this);
			
			//this.cargarOrderByDetalleRequisicion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleRequisicion.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleRequisicion.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleRequisicion.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDetalleRequisicion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleRequisicion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleRequisicion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleRequisicion.setText("Nuevo");
		this.jButtonDuplicarDetalleRequisicion.setText("Duplicar");
		this.jButtonCopiarDetalleRequisicion.setText("Copiar");
		this.jButtonVerFormDetalleRequisicion.setText("Ver");
		this.jButtonNuevoRelacionesDetalleRequisicion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleRequisicion.setText("Guardar");
		this.jButtonCerrarDetalleRequisicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleRequisicion,"nuevo_button","Nuevo",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleRequisicion,"duplicar_button","Duplicar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleRequisicion,"copiar_button","Copiar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleRequisicion,"ver_form","Ver",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleRequisicion,"nuevorelaciones_button","Nuevo Rel",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleRequisicion,"guardarcambiostabla_button","Guardar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleRequisicion,"cerrar_button","Salir",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleRequisicion.setToolTipText("Nuevo"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleRequisicion.setToolTipText("Duplicar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleRequisicion.setToolTipText("Copiar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleRequisicion.setToolTipText("Ver"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleRequisicion.setToolTipText("Nuevo Rel"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleRequisicion.setToolTipText("Guardar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleRequisicion.setToolTipText("Salir"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleRequisicion";
		inputMap = this.jButtonNuevoDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleRequisicion"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleRequisicion";
		inputMap = this.jButtonDuplicarDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleRequisicion"));
		
		//COPIAR
		sMapKey = "CopiarDetalleRequisicion";
		inputMap = this.jButtonCopiarDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleRequisicion"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleRequisicion";
		inputMap = this.jButtonVerFormDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleRequisicion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleRequisicion";
		inputMap = this.jButtonNuevoRelacionesDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleRequisicion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleRequisicion";
		inputMap = this.jButtonModificarDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleRequisicion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleRequisicion";
		inputMap = this.jButtonCerrarDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleRequisicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleRequisicion";
		inputMap = this.jButtonGuardarCambiosTablaDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleRequisicion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleRequisicion.setName("jPanelParametrosReportesDetalleRequisicion"); 
		
		this.jPanelParametrosReportesAccionesDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleRequisicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleRequisicion.setName("jPanelParametrosReportesAccionesDetalleRequisicion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleRequisicion = new JButtonMe();
		this.jButtonRecargarInformacionDetalleRequisicion.setText("Recargar");
		this.jButtonRecargarInformacionDetalleRequisicion.setToolTipText("Recargar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleRequisicion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleRequisicion = new JButtonMe();
		this.jButtonProcesarInformacionDetalleRequisicion.setText("Procesar");
		this.jButtonProcesarInformacionDetalleRequisicion.setToolTipText("Procesar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleRequisicion.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleRequisicion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleRequisicion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleRequisicion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRequisicion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleRequisicion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRequisicion.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleRequisicion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRequisicion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleRequisicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleRequisicion.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleRequisicion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleRequisicion.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleRequisicion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleRequisicion.setText("Accion");
		this.jComboBoxTiposAccionesDetalleRequisicion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleRequisicion.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleRequisicion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleRequisicion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleRequisicion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleRequisicion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleRequisicion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleRequisicion = new JLabelMe();
		
		this.jLabelAccionesDetalleRequisicion.setText("Acciones");		
		this.jLabelAccionesDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleRequisicion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleRequisicion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleRequisicion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleRequisicion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleRequisicion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleRequisicion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleRequisicion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleRequisicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleRequisicion.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleRequisicion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleRequisicion = new JButtonMe();
		//this.jButtonAnterioresDetalleRequisicion.setText("<<");
        this.jButtonAnterioresDetalleRequisicion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleRequisicion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleRequisicion = new JButtonMe();
		//this.jButtonSiguientesDetalleRequisicion.setText(">>");
        this.jButtonSiguientesDetalleRequisicion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleRequisicion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleRequisicion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleRequisicion.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleRequisicion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleRequisicion,"nuevoguardarcambios_button","Nue",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleRequisicion";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleRequisicion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleRequisicion";
		inputMap = this.jButtonRecargarInformacionDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleRequisicion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleRequisicion";
		inputMap = this.jButtonSiguientesDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleRequisicion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleRequisicion";
		inputMap = this.jButtonAnterioresDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleRequisicion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleRequisicion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleRequisicion.setMinimumSize(new Dimension(this.getWidth(),DetalleRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleRequisicion.setMaximumSize(new Dimension(this.getWidth(),DetalleRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleRequisicion.setPreferredSize(new Dimension(this.getWidth(),DetalleRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleRequisicion = new GridBagLayout();

			this.jPanelPaginacionDetalleRequisicion.setLayout(gridaBagLayoutPaginacionDetalleRequisicion);						
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = 0;
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonAnterioresDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
					
						
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleRequisicion.gridy = 0;
			
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonNuevoGuardarCambiosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
						
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleRequisicion.gridy = 0;
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonSiguientesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = 0;
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonAbrirTotalesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = 1;
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonNuevoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
						
			
			
			if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
				this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleRequisicion.gridy = 1;
				this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleRequisicion.add(this.jButtonGuardarCambiosTablaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			}
			
			
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = 1;
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonDuplicarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = 1;
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonCopiarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = 1;
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonVerFormDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = 1;
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleRequisicion.add(this.jButtonCerrarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
		
		
		this.jButtonRecargarInformacionDetalleRequisicion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleRequisicion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleRequisicion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleRequisicion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleRequisicion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleRequisicion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleRequisicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleRequisicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleRequisicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleRequisicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleRequisicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleRequisicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleRequisicion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleRequisicion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleRequisicion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleRequisicion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleRequisicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleRequisicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleRequisicion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleRequisicion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleRequisicion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleRequisicion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleRequisicion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleRequisicion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleRequisicion.setLayout(gridaBagParametrosReportesDetalleRequisicion);
			this.jPanelParametrosReportesAccionesDetalleRequisicion.setLayout(gridaBagParametrosReportesAccionesDetalleRequisicion);
			
			
			this.jPanelParametrosAuxiliar1DetalleRequisicion.setLayout(gridaBagParametrosAuxiliar1DetalleRequisicion);
			this.jPanelParametrosAuxiliar2DetalleRequisicion.setLayout(gridaBagParametrosAuxiliar2DetalleRequisicion);
			this.jPanelParametrosAuxiliar3DetalleRequisicion.setLayout(gridaBagParametrosAuxiliar3DetalleRequisicion);
			this.jPanelParametrosAuxiliar4DetalleRequisicion.setLayout(gridaBagParametrosAuxiliar4DetalleRequisicion);
			//this.jPanelParametrosAuxiliar5DetalleRequisicion.setLayout(gridaBagParametrosAuxiliar2DetalleRequisicion);			
			
			
			
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jButtonRecargarInformacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRequisicion.add(this.jComboBoxTiposPaginacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRequisicion.add(this.jCheckBoxConAltoMaximoTablaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRequisicion.add(this.jComboBoxTiposArchivosReportesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jPanelParametrosAuxiliar1DetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleRequisicion.add(this.jComboBoxTiposReportesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jPanelParametrosAuxiliar4DetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jComboBoxTiposReportesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jCheckBoxGenerarReporteDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jPanelParametrosAuxiliar2DetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jLabelAccionesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
				this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleRequisicion.add(this.jButtonAbrirOrderByDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jComboBoxTiposSeleccionarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
			
			
			/*
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jCheckBoxSeleccionarTodosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRequisicion.add(this.jCheckBoxSeleccionarTodosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);															
				
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRequisicion.add(this.jCheckBoxSeleccionadosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jPanelParametrosAuxiliar3DetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jComboBoxTiposAccionesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
	
				
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRequisicion.add(this.jTextFieldValorCampoGeneralDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleRequisicion = new GridBagLayout();

			this.jScrollPanelDatosDetalleRequisicion.setLayout(gridaBagLayoutDatosDetalleRequisicion);
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = 0;
			this.gridBagConstraintsDetalleRequisicion.gridx = 0;
			
			this.jScrollPanelDatosDetalleRequisicion.add(this.jTableDatosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleRequisicion.setViewportView(this.jTableDatosDetalleRequisicion);
		this.jTableDatosDetalleRequisicion.setFillsViewportHeight(true);
		this.jTableDatosDetalleRequisicion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleRequisicionTotales.setViewportView(this.jTableDatosDetalleRequisicionTotales);
		//this.jTableDatosDetalleRequisicionTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleRequisicionTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleRequisicion= new GridBagLayout();
		this.jPanelAccionesDetalleRequisicion.setLayout(gridaBagLayoutAccionesDetalleRequisicion);
		
		
		/*	
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;
			
		this.jPanelAccionesDetalleRequisicion.add(this.jButtonNuevoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleRequisicion.setLayout(gridaBagLayoutFK_IdBodegaDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 0;
		jPanelFK_IdBodegaDetalleRequisicion.add(jLabelid_bodegaFK_IdBodegaDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 1;
		jPanelFK_IdBodegaDetalleRequisicion.add(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 1;
		gridBagConstraintsDetalleRequisicion.gridx =1;
		jPanelFK_IdBodegaDetalleRequisicion.add(jButtonFK_IdBodegaDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		jTabbedPaneBusquedasDetalleRequisicion.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleRequisicion);
		jTabbedPaneBusquedasDetalleRequisicion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleRequisicion.setLayout(gridaBagLayoutFK_IdProductoDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 0;
		jPanelFK_IdProductoDetalleRequisicion.add(jLabelid_productoFK_IdProductoDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 1;
		jPanelFK_IdProductoDetalleRequisicion.add(jComboBoxid_productoFK_IdProductoDetalleRequisicion, gridBagConstraintsDetalleRequisicion);


		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 0;
		jPanelFK_IdProductoDetalleRequisicion.add(this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 1;
		gridBagConstraintsDetalleRequisicion.gridx =1;
		jPanelFK_IdProductoDetalleRequisicion.add(jButtonFK_IdProductoDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		jTabbedPaneBusquedasDetalleRequisicion.addTab("2.-Por Producto ", jPanelFK_IdProductoDetalleRequisicion);
		jTabbedPaneBusquedasDetalleRequisicion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdRequisicionDetalleRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdRequisicionDetalleRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRequisicionDetalleRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRequisicionDetalleRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRequisicionDetalleRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRequisicionDetalleRequisicion.setLayout(gridaBagLayoutFK_IdRequisicionDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 0;
		jPanelFK_IdRequisicionDetalleRequisicion.add(jLabelid_requisicionFK_IdRequisicionDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 1;
		jPanelFK_IdRequisicionDetalleRequisicion.add(jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 1;
		gridBagConstraintsDetalleRequisicion.gridx =1;
		jPanelFK_IdRequisicionDetalleRequisicion.add(jButtonFK_IdRequisicionDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		jTabbedPaneBusquedasDetalleRequisicion.addTab("3.-Por Requisicion ", jPanelFK_IdRequisicionDetalleRequisicion);
		jTabbedPaneBusquedasDetalleRequisicion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleRequisicion.setLayout(gridaBagLayoutFK_IdUnidadDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 0;
		jPanelFK_IdUnidadDetalleRequisicion.add(jLabelid_unidadFK_IdUnidadDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 0;
		gridBagConstraintsDetalleRequisicion.gridx = 1;
		jPanelFK_IdUnidadDetalleRequisicion.add(jComboBoxid_unidadFK_IdUnidadDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRequisicion.gridy = 1;
		gridBagConstraintsDetalleRequisicion.gridx =1;
		jPanelFK_IdUnidadDetalleRequisicion.add(jButtonFK_IdUnidadDetalleRequisicion, gridBagConstraintsDetalleRequisicion);

		jTabbedPaneBusquedasDetalleRequisicion.addTab("4.-Por Unidad ", jPanelFK_IdUnidadDetalleRequisicion);
		jTabbedPaneBusquedasDetalleRequisicion.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleRequisicion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();						
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRequisicion.gridx = 0;		
			//this.gridBagConstraintsDetalleRequisicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleRequisicion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;		
		//this.gridBagConstraintsDetalleRequisicion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleRequisicion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRequisicion.gridx = 0;		
			this.gridBagConstraintsDetalleRequisicion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleRequisicion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);								
		
		
		/*
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		*/		
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleRequisicion.gridx =0;
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleRequisicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
				
		//this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleRequisicion.gridx =0;
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleRequisicion.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleRequisicionTotales/*this.jTableDatosDetalleRequisicionTotales*/, this.gridBagConstraintsDetalleRequisicion);				
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleRequisicion = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleRequisicion.setLayout(gridaBagLayoutBusquedasParametrosDetalleRequisicion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleRequisicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			
			
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
			
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleRequisicion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleRequisicion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleRequisicion.setName("jPanelReporteDinamicoDetalleRequisicion"); 
		
		this.jPanelReporteDinamicoDetalleRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleRequisicion.setLayout(gridaBagLayoutReporteDinamicoDetalleRequisicion);
		
		
		this.jInternalFrameReporteDinamicoDetalleRequisicion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleRequisicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleRequisicion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleRequisicion.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleRequisicion.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleRequisicion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleRequisicion = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleRequisicion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRequisicion.add(this.jLabelColumnasSelectReporteDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleRequisicion = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleRequisicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleRequisicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleRequisicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleRequisicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleRequisicion=new JScrollPane(this.jListColumnasSelectReporteDetalleRequisicion);
			
			this.jScrollColumnasSelectReporteDetalleRequisicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleRequisicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleRequisicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleRequisicion.add(this.jListColumnasSelectReporteDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		this.jPanelReporteDinamicoDetalleRequisicion.add(this.jScrollColumnasSelectReporteDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleRequisicion = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleRequisicion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleRequisicion = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleRequisicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleRequisicion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleRequisicion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleRequisicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleRequisicion=new JScrollPane(this.jListRelacionesSelectReporteDetalleRequisicion);
			
			this.jScrollRelacionesSelectReporteDetalleRequisicion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleRequisicion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleRequisicion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleRequisicion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleRequisicion = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleRequisicion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleRequisicion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleRequisicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicion.add(this.jLabelGenerarExcelReporteDinamicoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleRequisicion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleRequisicion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleRequisicion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleRequisicion.setToolTipText("Generar EXCEL"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleRequisicion.add(this.jButtonGenerarExcelReporteDinamicoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRequisicion.add(this.jComboBoxTiposReportesDinamicoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRequisicion.add(this.jLabelTiposArchivoReporteDinamicoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRequisicion.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleRequisicion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleRequisicion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleRequisicion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleRequisicion.setToolTipText("Generar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRequisicion.add(this.jButtonGenerarReporteDinamicoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleRequisicion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleRequisicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleRequisicion.setToolTipText("Cancelar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRequisicion.add(this.jButtonCerrarReporteDinamicoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleRequisicion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleRequisicion= new JScrollPane(jPanelReporteDinamicoDetalleRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRequisicion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleRequisicion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleRequisicion);
		this.jInternalFrameReporteDinamicoDetalleRequisicion.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleRequisicion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleRequisicion.setName("jPanelImportacionDetalleRequisicion"); 
		
		this.jPanelImportacionDetalleRequisicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleRequisicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleRequisicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleRequisicion.setLayout(gridaBagLayoutImportacionDetalleRequisicion);
		
		
		this.jInternalFrameImportacionDetalleRequisicion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleRequisicion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleRequisicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleRequisicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleRequisicion.setResizable(true);
	    this.jInternalFrameImportacionDetalleRequisicion.setClosable(true);
	    this.jInternalFrameImportacionDetalleRequisicion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleRequisicion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleRequisicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleRequisicion.setResizable(true);
	    this.jInternalFrameImportacionDetalleRequisicion.setClosable(true);
	    this.jInternalFrameImportacionDetalleRequisicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleRequisicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleRequisicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleRequisicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleRequisicion = new JLabelMe();

		this.jLabelArchivoImportacionDetalleRequisicion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleRequisicion.add(this.jLabelArchivoImportacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleRequisicion = new JFileChooser();		
		this.jFileChooserImportacionDetalleRequisicion.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleRequisicion = new JButtonMe();
		this.jButtonAbrirImportacionDetalleRequisicion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleRequisicion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleRequisicion.setToolTipText("Generar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRequisicion.add(this.jButtonAbrirImportacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleRequisicion = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleRequisicion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleRequisicion.add(this.jLabelPathArchivoImportacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleRequisicion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleRequisicion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleRequisicion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleRequisicion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRequisicion.add(this.jTextFieldPathArchivoImportacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleRequisicion = new JButtonMe();
		this.jButtonGenerarImportacionDetalleRequisicion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleRequisicion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleRequisicion.setToolTipText("Generar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRequisicion.add(this.jButtonGenerarImportacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleRequisicion = new JButtonMe();
		this.jButtonCerrarImportacionDetalleRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleRequisicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleRequisicion.setToolTipText("Cancelar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRequisicion.add(this.jButtonCerrarImportacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleRequisicion = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleRequisicion= new JScrollPane(jPanelImportacionDetalleRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleRequisicion.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleRequisicion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleRequisicion);
		this.jInternalFrameImportacionDetalleRequisicion.getContentPane().add(this.jScrollPanelImportacionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleRequisicion() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleRequisicion = new JButtonMe();
		this.jButtonAbrirTotalesDetalleRequisicion.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleRequisicion,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleRequisicion.setName("jPanelTotalesDetalleRequisicion"); 
		
		this.jPanelTotalesDetalleRequisicion.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleRequisicion.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleRequisicion.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleRequisicion.setLayout(gridaBagLayoutTotalesDetalleRequisicion);
		
		
		this.jInternalFrameTotalesDetalleRequisicion= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleRequisicion= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleRequisicion.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleRequisicion.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleRequisicion.setResizable(true);
	    this.jInternalFrameTotalesDetalleRequisicion.setClosable(true);
	    this.jInternalFrameTotalesDetalleRequisicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleRequisicion.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleRequisicion.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleRequisicion.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicions"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleRequisicion.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleRequisicion.ipady =150;
		
		this.jPanelTotalesDetalleRequisicion.add(jScrollPanelDatosDetalleRequisicionTotales, this.gridBagConstraintsDetalleRequisicion);//this.jTableDatosDetalleRequisicionTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleRequisicion = new JButtonMe();
		this.jButtonCerrarTotalesDetalleRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleRequisicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleRequisicion.setToolTipText("Cancelar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleRequisicion.add(this.jButtonCerrarTotalesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleRequisicion = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleRequisicion= new JScrollPane(jPanelTotalesDetalleRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleRequisicion.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleRequisicion.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleRequisicion);
		this.jInternalFrameTotalesDetalleRequisicion.getContentPane().add(this.jScrollPanelTotalesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleRequisicion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleRequisicion = new JButtonMe();
			this.jButtonAbrirOrderByDetalleRequisicion.setText("Orden");
			this.jButtonAbrirOrderByDetalleRequisicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleRequisicion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleRequisicion";
			inputMap = this.jButtonAbrirOrderByDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleRequisicion"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleRequisicion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleRequisicion.setName("jPanelOrderByDetalleRequisicion"); 
			
			this.jPanelOrderByDetalleRequisicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleRequisicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleRequisicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleRequisicion.setLayout(gridaBagLayoutOrderByDetalleRequisicion);
			
			
			this.jTableDatosDetalleRequisicionOrderBy = new JTableMe();        
			this.jTableDatosDetalleRequisicionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleRequisicionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleRequisicionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleRequisicionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleRequisicionOrderBy.setViewportView(this.jTableDatosDetalleRequisicionOrderBy);
			this.jTableDatosDetalleRequisicionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleRequisicionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleRequisicion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleRequisicion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleRequisicion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleRequisicion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleRequisicion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleRequisicion.setTitle("Orden");
			this.jInternalFrameOrderByDetalleRequisicion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleRequisicion.setResizable(true);
			this.jInternalFrameOrderByDetalleRequisicion.setClosable(true);
			this.jInternalFrameOrderByDetalleRequisicion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleRequisicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleRequisicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleRequisicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleRequisicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleRequisicion.ipady =150;
				
			this.jPanelOrderByDetalleRequisicion.add(jScrollPanelDatosDetalleRequisicionOrderBy, this.gridBagConstraintsDetalleRequisicion);//this.jTableDatosDetalleRequisicionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleRequisicion = new JButtonMe();
			this.jButtonCerrarOrderByDetalleRequisicion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleRequisicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleRequisicion.setToolTipText("Cancelar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleRequisicion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleRequisicion.add(this.jButtonCerrarOrderByDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleRequisicion = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleRequisicion= new JScrollPane(jPanelOrderByDetalleRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleRequisicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleRequisicion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleRequisicion);
			
			this.jInternalFrameOrderByDetalleRequisicion.getContentPane().add(this.jScrollPanelOrderByDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
		
		} else {
			this.jButtonAbrirOrderByDetalleRequisicion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallerequisicionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleRequisicion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleRequisicion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleRequisicion.getRowHeight();//DetalleRequisicionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleRequisicion.isSelected()) {
					iHeightTable=DetalleRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleRequisicion.isSelected()) {
					iHeightTable=DetalleRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleRequisicion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleRequisicion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleRequisicion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleRequisicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleRequisicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleRequisicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleRequisicion!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleRequisicion.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleRequisicion.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleRequisicion.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleRequisicion!=null && this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy()!=null) {
			//if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleRequisicion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleRequisicion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleRequisicion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleRequisicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleRequisicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleRequisicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetalleRequisicion!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleRequisicion.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleRequisicion.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleRequisicion.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallerequisicionLogic.getDetalleRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallerequisicions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleRequisicion> TraerDetalleRequisicionBeans(List<DetalleRequisicion> detallerequisicions,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleRequisicion detallerequisicion:detallerequisicions) {
					
				if(!(DetalleRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallerequisicion.setsDetalleGeneralEntityReporte(DetalleRequisicionConstantesFunciones.getDetalleRequisicionDescripcion(detallerequisicion));
										
						
					
						
					
				} else  {
							
					//detallerequisicion.setsDetalleGeneralEntityReporte(detallerequisicion.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallerequisicionbeans.add(detallerequisicionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallerequisicions;
    }
	//PARA REPORTES FIN
}
