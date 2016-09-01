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
import com.bydan.erp.inventario.util.DetallePlaneacionCompraConstantesFunciones;

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
public class DetallePlaneacionCompraJInternalFrame extends DetallePlaneacionCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePlaneacionCompra;
	
	protected JMenuBar jmenuBarDetallePlaneacionCompra;
	
	protected JMenu jmenuDetallePlaneacionCompra;
	protected JMenu jmenuDatosDetallePlaneacionCompra;
	protected JMenu jmenuArchivoDetallePlaneacionCompra;
	protected JMenu jmenuAccionesDetallePlaneacionCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePlaneacionCompra;	
	protected GridBagConstraints gridBagConstraintsDetallePlaneacionCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePlaneacionCompraDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePlaneacionCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePlaneacionCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePlaneacionCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected PlaneacionCompraBeanSwingJInternalFrame planeacioncompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_planeacioncompra="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public DetallePlaneacionCompraSessionBean detalleplaneacioncompraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public PlaneacionCompraSessionBean planeacioncompraSessionBean;
	public LineaSessionBean lineaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePlaneacionCompra> detalleplaneacioncompras;		
	public List<DetallePlaneacionCompra> detalleplaneacioncomprasEliminados;	
	public List<DetallePlaneacionCompra> detalleplaneacioncomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePlaneacionCompra;		
	protected JButton jButtonAbrirOrderByDetallePlaneacionCompra;
	
	
	//protected JPanel jPanelOrderByDetallePlaneacionCompra;
	//public JScrollPane jScrollPanelOrderByDetallePlaneacionCompra;	
	//protected JButton jButtonCerrarOrderByDetallePlaneacionCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePlaneacionCompraLogic detalleplaneacioncompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePlaneacionCompra;
	public JScrollPane jScrollPanelDatosEdicionDetallePlaneacionCompra;
	public JScrollPane jScrollPanelDatosGeneralDetallePlaneacionCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosDetallePlaneacionCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePlaneacionCompra;
	//public JScrollPane jScrollPanelImportacionDetallePlaneacionCompra;
	
	
	
	protected JPanel jPanelAccionesDetallePlaneacionCompra;
	
    protected JPanel jPanelPaginacionDetallePlaneacionCompra;
    protected JPanel jPanelParametrosReportesDetallePlaneacionCompra;
	protected JPanel jPanelParametrosReportesAccionesDetallePlaneacionCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePlaneacionCompra;
	protected JPanel jPanelParametrosAuxiliar2DetallePlaneacionCompra;
	protected JPanel jPanelParametrosAuxiliar3DetallePlaneacionCompra;
	protected JPanel jPanelParametrosAuxiliar4DetallePlaneacionCompra;
	//protected JPanel jPanelParametrosAuxiliar5DetallePlaneacionCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePlaneacionCompra;
	//protected JPanel jPanelImportacionDetallePlaneacionCompra;
	
	
	public JTable jTableDatosDetallePlaneacionCompra;
	
	
	
	//public JTable jTableDatosDetallePlaneacionCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePlaneacionCompra;
	protected JButton jButtonDuplicarDetallePlaneacionCompra;
	protected JButton jButtonCopiarDetallePlaneacionCompra;
	protected JButton jButtonVerFormDetallePlaneacionCompra;
	protected JButton jButtonNuevoRelacionesDetallePlaneacionCompra;
	protected JButton jButtonModificarDetallePlaneacionCompra;
	
    protected JButton jButtonGuardarCambiosTablaDetallePlaneacionCompra;
	protected JButton jButtonCerrarDetallePlaneacionCompra;
	
	
	protected JButton jButtonRecargarInformacionDetallePlaneacionCompra;
	protected JButton jButtonProcesarInformacionDetallePlaneacionCompra;
	
	
	protected JButton jButtonAnterioresDetallePlaneacionCompra;
	protected JButton jButtonSiguientesDetallePlaneacionCompra;
	protected JButton jButtonNuevoGuardarCambiosDetallePlaneacionCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePlaneacionCompra;
	//protected JButton jButtonCerrarReporteDinamicoDetallePlaneacionCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePlaneacionCompra;
	//protected JButton jButtonGenerarImportacionDetallePlaneacionCompra;
	//protected JButton jButtonCerrarImportacionDetallePlaneacionCompra;
	//protected JFileChooser jFileChooserImportacionDetallePlaneacionCompra;
	//protected File fileImportacionDetallePlaneacionCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePlaneacionCompra;
	protected JButton jButtonDuplicarToolBarDetallePlaneacionCompra;
	protected JButton jButtonNuevoRelacionesToolBarDetallePlaneacionCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePlaneacionCompra;
	protected JButton jButtonCopiarToolBarDetallePlaneacionCompra;
	protected JButton jButtonVerFormToolBarDetallePlaneacionCompra;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePlaneacionCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePlaneacionCompra;
	protected JButton jButtonCerrarToolBarDetallePlaneacionCompra;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePlaneacionCompra;
	protected JButton jButtonProcesarInformacionToolBarDetallePlaneacionCompra;
	protected JButton jButtonAnterioresToolBarDetallePlaneacionCompra;
	protected JButton jButtonSiguientesToolBarDetallePlaneacionCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePlaneacionCompra;
	protected JButton jButtonAbrirOrderByToolBarDetallePlaneacionCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePlaneacionCompra;
	protected JMenuItem jMenuItemDuplicarDetallePlaneacionCompra;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePlaneacionCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePlaneacionCompra;
	protected JMenuItem jMenuItemCopiarDetallePlaneacionCompra;
	protected JMenuItem jMenuItemVerFormDetallePlaneacionCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePlaneacionCompra;
	protected JMenuItem jMenuItemCerrarDetallePlaneacionCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetallePlaneacionCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePlaneacionCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePlaneacionCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePlaneacionCompra;
	protected JMenuItem jMenuItemProcesarInformacionDetallePlaneacionCompra;
	protected JMenuItem jMenuItemAnterioresDetallePlaneacionCompra;
	protected JMenuItem jMenuItemSiguientesDetallePlaneacionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra;
	protected JMenuItem jMenuItemAbrirOrderByDetallePlaneacionCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetallePlaneacionCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePlaneacionCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePlaneacionCompra;
	protected JCheckBox jCheckBoxSeleccionadosDetallePlaneacionCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePlaneacionCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePlaneacionCompra;
	protected JTextField jTextFieldValorCampoGeneralDetallePlaneacionCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePlaneacionCompra;
	//public JList<Reporte> jListColumnasSelectReporteDetallePlaneacionCompra;
	//public JScrollPane jScrollColumnasSelectReporteDetallePlaneacionCompra;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePlaneacionCompra;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePlaneacionCompra;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePlaneacionCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePlaneacionCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePlaneacionCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePlaneacionCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePlaneacionCompra;
	
		
	//public JLabel jLabelArchivoImportacionDetallePlaneacionCompra;	
	//public JLabel jLabelPathArchivoImportacionDetallePlaneacionCompra;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePlaneacionCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePlaneacionCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePlaneacionCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePlaneacionCompra;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePlaneacionCompra;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePlaneacionCompra;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePlaneacionCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePlaneacionCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePlaneacionCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePlaneacionCompra;
	public JPanel jPanelFK_IdLineaDetallePlaneacionCompra;
	public JButton jButtonFK_IdLineaDetallePlaneacionCompra;
	public JPanel jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra;
	public JButton jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra;
	public JPanel jPanelFK_IdProductoDetallePlaneacionCompra;
	public JButton jButtonFK_IdProductoDetallePlaneacionCompra;
	public JPanel jPanelFK_IdUnidadDetallePlaneacionCompra;
	public JButton jButtonFK_IdUnidadDetallePlaneacionCompra;
	
	public JPanel jPanelid_lineaFK_IdLineaDetallePlaneacionCompra;
	public JLabel jLabelid_lineaFK_IdLineaDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra;
	public JButton jButtonid_lineaFK_IdLineaDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaDetallePlaneacionCompraBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaDetallePlaneacionCompraArbol= new JButtonMe();

	
	public JPanel jPanelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra;
	public JLabel jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra;
	public JButton jButtonid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetallePlaneacionCompra;
	public JLabel jLabelid_productoFK_IdProductoDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra;
	public JButton jButtonid_productoFK_IdProductoDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetallePlaneacionCompra;
	public JLabel jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra;
	public JButton jButtonid_unidadFK_IdUnidadDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePlaneacionCompraBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetallePlaneacionCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePlaneacionCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePlaneacionCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePlaneacionCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePlaneacionCompra)	{
		this.jButtonRecargarInformacionDetallePlaneacionCompra = jButtonRecargarInformacionDetallePlaneacionCompra;
	}
	
	public JButton getjButtonProcesarInformacionDetallePlaneacionCompra() {
		return this.jButtonProcesarInformacionDetallePlaneacionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePlaneacionCompra)	{
		this.jButtonProcesarInformacionDetallePlaneacionCompra = jButtonProcesarInformacionDetallePlaneacionCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePlaneacionCompra() {
		return this.jButtonRecargarInformacionDetallePlaneacionCompra;
	}
	
	
	public List<DetallePlaneacionCompra> getdetalleplaneacioncompras() {
		return this.detalleplaneacioncompras;
	}

	public void setdetalleplaneacioncompras(List<DetallePlaneacionCompra> detalleplaneacioncompras) {
		this.detalleplaneacioncompras = detalleplaneacioncompras;
	}
	
	public List<DetallePlaneacionCompra> getdetalleplaneacioncomprasAux() {
		return this.detalleplaneacioncomprasAux;
	}

	public void setdetalleplaneacioncomprasAux(List<DetallePlaneacionCompra> detalleplaneacioncomprasAux) {
		this.detalleplaneacioncomprasAux = detalleplaneacioncomprasAux;
	}
	
	public List<DetallePlaneacionCompra> getdetalleplaneacioncomprasEliminados() {
		return this.detalleplaneacioncomprasEliminados;
	}

	public void setDetallePlaneacionComprasEliminados(List<DetallePlaneacionCompra> detalleplaneacioncomprasEliminados) {
		this.detalleplaneacioncomprasEliminados = detalleplaneacioncomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePlaneacionCompra() {
		return jComboBoxTiposSeleccionarDetallePlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePlaneacionCompra(
			JComboBox jComboBoxTiposSeleccionarDetallePlaneacionCompra) {
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra = jComboBoxTiposSeleccionarDetallePlaneacionCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePlaneacionCompra() {
		return jTextFieldValorCampoGeneralDetallePlaneacionCompra;
	}

	public void setjTextFieldValorCampoGeneralDetallePlaneacionCompra(
			JTextField jTextFieldValorCampoGeneralDetallePlaneacionCompra) {
		this.jTextFieldValorCampoGeneralDetallePlaneacionCompra = jTextFieldValorCampoGeneralDetallePlaneacionCompra;
	}

	public void setBorderResaltarValorCampoGeneralDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePlaneacionCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePlaneacionCompra() {
		return this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra;
	}

	public void setjCheckBoxSeleccionarTodosDetallePlaneacionCompra(
			JCheckBox jCheckBoxSeleccionarTodosDetallePlaneacionCompra) {
		this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra = jCheckBoxSeleccionarTodosDetallePlaneacionCompra;
	}

	public void setBorderResaltarSeleccionarTodosDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePlaneacionCompra() {
		return this.jCheckBoxSeleccionadosDetallePlaneacionCompra;
	}

	public void setjCheckBoxSeleccionadosDetallePlaneacionCompra(
			JCheckBox jCheckBoxSeleccionadosDetallePlaneacionCompra) {
		this.jCheckBoxSeleccionadosDetallePlaneacionCompra = jCheckBoxSeleccionadosDetallePlaneacionCompra;
	}
	
	public void setBorderResaltarSeleccionadosDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePlaneacionCompra() {
		return this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePlaneacionCompra(
			JComboBox jComboBoxTiposArchivosReportesDetallePlaneacionCompra) {
		this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra = jComboBoxTiposArchivosReportesDetallePlaneacionCompra;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePlaneacionCompra() {
		return this.jComboBoxTiposReportesDetallePlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePlaneacionCompra(
			JComboBox jComboBoxTiposReportesDetallePlaneacionCompra) {
		this.jComboBoxTiposReportesDetallePlaneacionCompra = jComboBoxTiposReportesDetallePlaneacionCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePlaneacionCompra() {
	//	return jComboBoxTiposReportesDinamicoDetallePlaneacionCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePlaneacionCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePlaneacionCompra) {
	//	this.jComboBoxTiposReportesDinamicoDetallePlaneacionCompra = jComboBoxTiposReportesDinamicoDetallePlaneacionCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra = jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra;
	//}
	
	public void setBorderResaltarTiposReportesDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePlaneacionCompra() {
		return this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePlaneacionCompra(
			JComboBox jComboBoxTiposGraficosReportesDetallePlaneacionCompra) {
		this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra = jComboBoxTiposGraficosReportesDetallePlaneacionCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePlaneacionCompra() {
		return this.jComboBoxTiposPaginacionDetallePlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePlaneacionCompra(
			JComboBox jComboBoxTiposPaginacionDetallePlaneacionCompra) {
		this.jComboBoxTiposPaginacionDetallePlaneacionCompra = jComboBoxTiposPaginacionDetallePlaneacionCompra;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePlaneacionCompra() {
		return this.jComboBoxTiposRelacionesDetallePlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePlaneacionCompra() {
		return this.jComboBoxTiposAccionesDetallePlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePlaneacionCompra(
			JComboBox jComboBoxTiposRelacionesDetallePlaneacionCompra) {
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra = jComboBoxTiposRelacionesDetallePlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePlaneacionCompra(
			JComboBox jComboBoxTiposAccionesDetallePlaneacionCompra) {
		this.jComboBoxTiposAccionesDetallePlaneacionCompra = jComboBoxTiposAccionesDetallePlaneacionCompra;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePlaneacionCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePlaneacionCompra() {
	//	return jCheckBoxConGraficoDinamicoDetallePlaneacionCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePlaneacionCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePlaneacionCompra) {
	//	this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra = jCheckBoxConGraficoDinamicoDetallePlaneacionCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePlaneacionCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePlaneacionCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra .setBorder(borderResaltar);		
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
		this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		
		this.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePlaneacionCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Planeacion Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePlaneacionCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"nuevo","nuevo","Nuevo"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"duplicar","duplicar","Duplicar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"copiar","copiar","Copiar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"ver_form","ver_form","Ver"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"recargar","recargar","Recargar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"cerrar","cerrar","Salir"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePlaneacionCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePlaneacionCompra;
			
				this.jButtonProcesarInformacionToolBarDetallePlaneacionCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePlaneacionCompra;
				
		//protected JButton jButtonModificarToolBarDetallePlaneacionCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePlaneacionCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePlaneacionCompra=new JMenuMe("General");
		this.jmenuArchivoDetallePlaneacionCompra=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePlaneacionCompra=new JMenuMe("Acciones");
		this.jmenuDatosDetallePlaneacionCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePlaneacionCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePlaneacionCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePlaneacionCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePlaneacionCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePlaneacionCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePlaneacionCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePlaneacionCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePlaneacionCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePlaneacionCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePlaneacionCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePlaneacionCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePlaneacionCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePlaneacionCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePlaneacionCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePlaneacionCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePlaneacionCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePlaneacionCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePlaneacionCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePlaneacionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePlaneacionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePlaneacionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePlaneacionCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePlaneacionCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePlaneacionCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePlaneacionCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePlaneacionCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePlaneacionCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePlaneacionCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePlaneacionCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePlaneacionCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePlaneacionCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePlaneacionCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePlaneacionCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePlaneacionCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePlaneacionCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePlaneacionCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePlaneacionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePlaneacionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePlaneacionCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePlaneacionCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePlaneacionCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePlaneacionCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePlaneacionCompra.add(this.jMenuItemCerrarDetallePlaneacionCompra);
			
			this.jmenuAccionesDetallePlaneacionCompra.add(this.jMenuItemNuevoDetallePlaneacionCompra);
			this.jmenuAccionesDetallePlaneacionCompra.add(this.jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra);
			this.jmenuAccionesDetallePlaneacionCompra.add(this.jMenuItemNuevoRelacionesDetallePlaneacionCompra);
			this.jmenuAccionesDetallePlaneacionCompra.add(this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra);		
			this.jmenuAccionesDetallePlaneacionCompra.add(this.jMenuItemDuplicarDetallePlaneacionCompra);		
			this.jmenuAccionesDetallePlaneacionCompra.add(this.jMenuItemCopiarDetallePlaneacionCompra);		
			this.jmenuAccionesDetallePlaneacionCompra.add(this.jMenuItemVerFormDetallePlaneacionCompra);		
			
			this.jmenuDatosDetallePlaneacionCompra.add(this.jMenuItemRecargarInformacionDetallePlaneacionCompra);				
			this.jmenuDatosDetallePlaneacionCompra.add(this.jMenuItemAnterioresDetallePlaneacionCompra);				
			this.jmenuDatosDetallePlaneacionCompra.add(this.jMenuItemSiguientesDetallePlaneacionCompra);				
			this.jmenuDatosDetallePlaneacionCompra.add(this.jMenuItemAbrirOrderByDetallePlaneacionCompra);				
			this.jmenuDatosDetallePlaneacionCompra.add(this.jMenuItemMostrarOcultarDetallePlaneacionCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePlaneacionCompra.add(this.jMenuItemGuardarCambiosDetallePlaneacionCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePlaneacionCompra.add(this.jmenuArchivoDetallePlaneacionCompra);		
			this.jmenuBarDetallePlaneacionCompra.add(this.jmenuAccionesDetallePlaneacionCompra);		
			this.jmenuBarDetallePlaneacionCompra.add(this.jmenuDatosDetallePlaneacionCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePlaneacionCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePlaneacionCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdLineaDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaDetallePlaneacionCompra.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaDetallePlaneacionCompra= new JButtonMe();
		this.jButtonFK_IdLineaDetallePlaneacionCompra.setText("Buscar");
		this.jButtonFK_IdLineaDetallePlaneacionCompra.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaDetallePlaneacionCompra,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaDetallePlaneacionCompra = new JLabelMe();
		jLabelid_lineaFK_IdLineaDetallePlaneacionCompra.setText("Linea :");
		jLabelid_lineaFK_IdLineaDetallePlaneacionCompra.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra.setToolTipText("Buscar Por Planeacion Compra ");
		this.jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra= new JButtonMe();
		this.jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra.setText("Buscar");
		this.jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra.setToolTipText("Buscar Por Planeacion Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra,"buscar_button","Buscar Por Planeacion Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra = new JLabelMe();
		jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setText("Planeacion Compra :");
		jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setToolTipText("Planeacion Compra");
		jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetallePlaneacionCompra.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetallePlaneacionCompra= new JButtonMe();
		this.jButtonFK_IdProductoDetallePlaneacionCompra.setText("Buscar");
		this.jButtonFK_IdProductoDetallePlaneacionCompra.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetallePlaneacionCompra,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetallePlaneacionCompra = new JLabelMe();
		jLabelid_productoFK_IdProductoDetallePlaneacionCompra.setText("Producto :");
		jLabelid_productoFK_IdProductoDetallePlaneacionCompra.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra.setFocusable(false);

		this.jPanelFK_IdUnidadDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetallePlaneacionCompra.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadDetallePlaneacionCompra= new JButtonMe();
		this.jButtonFK_IdUnidadDetallePlaneacionCompra.setText("Buscar");
		this.jButtonFK_IdUnidadDetallePlaneacionCompra.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetallePlaneacionCompra,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra.setText("Unad :");
		jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetallePlaneacionCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePlaneacionCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePlaneacionCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePlaneacionCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePlaneacionCompra = new DetallePlaneacionCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Planeacion Compra DATOS");
			this.jInternalFrameDetalleFormDetallePlaneacionCompra = new DetallePlaneacionCompraDetalleFormJInternalFrame(jDesktopPane,this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones(),this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra = null;//new DetallePlaneacionCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePlaneacionCompra= new GridBagLayout();
		
		
		this.jTableDatosDetallePlaneacionCompra = new JTableMe();      
		
		String sToolTipDetallePlaneacionCompra="";
		sToolTipDetallePlaneacionCompra=DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePlaneacionCompra+="(Inventario.DetallePlaneacionCompra)";
		}
		
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePlaneacionCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePlaneacionCompra.setToolTipText(sToolTipDetallePlaneacionCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePlaneacionCompra);
		this.jTableDatosDetallePlaneacionCompra.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePlaneacionCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePlaneacionCompra.setRowSelectionAllowed(true);
		this.jTableDatosDetallePlaneacionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetallePlaneacionCompra = new JButtonMe();
		this.jButtonDuplicarDetallePlaneacionCompra = new JButtonMe();
		this.jButtonCopiarDetallePlaneacionCompra = new JButtonMe();
		this.jButtonVerFormDetallePlaneacionCompra = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePlaneacionCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra = new JButtonMe();
		this.jButtonCerrarDetallePlaneacionCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetallePlaneacionCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePlaneacionCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Planeacion Compra";
		
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Planeacion Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePlaneacionCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetallePlaneacionCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePlaneacionCompra=new ReporteDinamicoJInternalFrame(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePlaneacionCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePlaneacionCompra=new ImportacionJInternalFrame(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePlaneacionCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePlaneacionCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePlaneacionCompra.setText("Orden");
		this.jButtonAbrirOrderByDetallePlaneacionCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePlaneacionCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePlaneacionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePlaneacionCompra,false,this);
			
			//this.cargarOrderByDetallePlaneacionCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePlaneacionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePlaneacionCompra,true,this);
			
			//this.cargarOrderByDetallePlaneacionCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePlaneacionCompra.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosDetallePlaneacionCompra.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosDetallePlaneacionCompra.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosDetallePlaneacionCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePlaneacionCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePlaneacionCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePlaneacionCompra.setText("Nuevo");
		this.jButtonDuplicarDetallePlaneacionCompra.setText("Duplicar");
		this.jButtonCopiarDetallePlaneacionCompra.setText("Copiar");
		this.jButtonVerFormDetallePlaneacionCompra.setText("Ver");
		this.jButtonNuevoRelacionesDetallePlaneacionCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.setText("Guardar");
		this.jButtonCerrarDetallePlaneacionCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePlaneacionCompra,"nuevo_button","Nuevo",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePlaneacionCompra,"duplicar_button","Duplicar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePlaneacionCompra,"copiar_button","Copiar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePlaneacionCompra,"ver_form","Ver",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePlaneacionCompra,"nuevorelaciones_button","Nuevo Rel",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePlaneacionCompra,"guardarcambiostabla_button","Guardar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePlaneacionCompra,"cerrar_button","Salir",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePlaneacionCompra.setToolTipText("Nuevo"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePlaneacionCompra.setToolTipText("Duplicar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePlaneacionCompra.setToolTipText("Copiar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePlaneacionCompra.setToolTipText("Ver"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePlaneacionCompra.setToolTipText("Nuevo Rel"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.setToolTipText("Guardar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePlaneacionCompra.setToolTipText("Salir"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePlaneacionCompra";
		inputMap = this.jButtonNuevoDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePlaneacionCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePlaneacionCompra";
		inputMap = this.jButtonDuplicarDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePlaneacionCompra"));
		
		//COPIAR
		sMapKey = "CopiarDetallePlaneacionCompra";
		inputMap = this.jButtonCopiarDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePlaneacionCompra"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePlaneacionCompra";
		inputMap = this.jButtonVerFormDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePlaneacionCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePlaneacionCompra";
		inputMap = this.jButtonNuevoRelacionesDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePlaneacionCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePlaneacionCompra";
		inputMap = this.jButtonModificarDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePlaneacionCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePlaneacionCompra";
		inputMap = this.jButtonCerrarDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePlaneacionCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePlaneacionCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePlaneacionCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePlaneacionCompra.setName("jPanelParametrosReportesDetallePlaneacionCompra"); 
		
		this.jPanelParametrosReportesAccionesDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePlaneacionCompra.setName("jPanelParametrosReportesAccionesDetallePlaneacionCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePlaneacionCompra = new JButtonMe();
		this.jButtonRecargarInformacionDetallePlaneacionCompra.setText("Recargar");
		this.jButtonRecargarInformacionDetallePlaneacionCompra.setToolTipText("Recargar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePlaneacionCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetallePlaneacionCompra = new JButtonMe();
		this.jButtonProcesarInformacionDetallePlaneacionCompra.setText("Procesar");
		this.jButtonProcesarInformacionDetallePlaneacionCompra.setToolTipText("Procesar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePlaneacionCompra.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePlaneacionCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePlaneacionCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePlaneacionCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePlaneacionCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePlaneacionCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePlaneacionCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePlaneacionCompra.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePlaneacionCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePlaneacionCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePlaneacionCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePlaneacionCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePlaneacionCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePlaneacionCompra = new JLabelMe();
		
		this.jLabelAccionesDetallePlaneacionCompra.setText("Acciones");		
		this.jLabelAccionesDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePlaneacionCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePlaneacionCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePlaneacionCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePlaneacionCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePlaneacionCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePlaneacionCompra = new JButtonMe();
		//this.jButtonAnterioresDetallePlaneacionCompra.setText("<<");
        this.jButtonAnterioresDetallePlaneacionCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePlaneacionCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePlaneacionCompra = new JButtonMe();
		//this.jButtonSiguientesDetallePlaneacionCompra.setText(">>");
        this.jButtonSiguientesDetallePlaneacionCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePlaneacionCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra,"nuevoguardarcambios_button","Nue",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePlaneacionCompra";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePlaneacionCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePlaneacionCompra";
		inputMap = this.jButtonRecargarInformacionDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePlaneacionCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePlaneacionCompra";
		inputMap = this.jButtonSiguientesDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePlaneacionCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePlaneacionCompra";
		inputMap = this.jButtonAnterioresDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePlaneacionCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePlaneacionCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePlaneacionCompra.setMinimumSize(new Dimension(this.getWidth(),DetallePlaneacionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePlaneacionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePlaneacionCompra.setMaximumSize(new Dimension(this.getWidth(),DetallePlaneacionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePlaneacionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePlaneacionCompra.setPreferredSize(new Dimension(this.getWidth(),DetallePlaneacionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePlaneacionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePlaneacionCompra = new GridBagLayout();

			this.jPanelPaginacionDetallePlaneacionCompra.setLayout(gridaBagLayoutPaginacionDetallePlaneacionCompra);						
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonAnterioresDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
					
						
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
			
			this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
						
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
			this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonSiguientesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonNuevoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
						
			
			
			if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
				this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
				this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonGuardarCambiosTablaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			}
			
			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonDuplicarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonCopiarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonVerFormDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePlaneacionCompra.add(this.jButtonCerrarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		
		
		this.jButtonRecargarInformacionDetallePlaneacionCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePlaneacionCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePlaneacionCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePlaneacionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePlaneacionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePlaneacionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePlaneacionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePlaneacionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePlaneacionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePlaneacionCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePlaneacionCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePlaneacionCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePlaneacionCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePlaneacionCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePlaneacionCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePlaneacionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePlaneacionCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePlaneacionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePlaneacionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePlaneacionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePlaneacionCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePlaneacionCompra.setLayout(gridaBagParametrosReportesDetallePlaneacionCompra);
			this.jPanelParametrosReportesAccionesDetallePlaneacionCompra.setLayout(gridaBagParametrosReportesAccionesDetallePlaneacionCompra);
			
			
			this.jPanelParametrosAuxiliar1DetallePlaneacionCompra.setLayout(gridaBagParametrosAuxiliar1DetallePlaneacionCompra);
			this.jPanelParametrosAuxiliar2DetallePlaneacionCompra.setLayout(gridaBagParametrosAuxiliar2DetallePlaneacionCompra);
			this.jPanelParametrosAuxiliar3DetallePlaneacionCompra.setLayout(gridaBagParametrosAuxiliar3DetallePlaneacionCompra);
			this.jPanelParametrosAuxiliar4DetallePlaneacionCompra.setLayout(gridaBagParametrosAuxiliar4DetallePlaneacionCompra);
			//this.jPanelParametrosAuxiliar5DetallePlaneacionCompra.setLayout(gridaBagParametrosAuxiliar2DetallePlaneacionCompra);			
			
			
			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jButtonRecargarInformacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePlaneacionCompra.add(this.jComboBoxTiposPaginacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePlaneacionCompra.add(this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePlaneacionCompra.add(this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jPanelParametrosAuxiliar1DetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePlaneacionCompra.add(this.jComboBoxTiposReportesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);																		
			
			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePlaneacionCompra.add(this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jPanelParametrosAuxiliar4DetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jComboBoxTiposReportesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jCheckBoxGenerarReporteDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jPanelParametrosAuxiliar2DetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jLabelAccionesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
				this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jButtonAbrirOrderByDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jComboBoxTiposSeleccionarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
			
			
			/*
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jCheckBoxConGraficoReporteDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePlaneacionCompra.add(this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);															
				
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePlaneacionCompra.add(this.jCheckBoxSeleccionadosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);															
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePlaneacionCompra.add(this.jCheckBoxConGraficoReporteDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jPanelParametrosAuxiliar3DetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jComboBoxTiposAccionesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
	
				
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePlaneacionCompra.add(this.jTextFieldValorCampoGeneralDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePlaneacionCompra = new GridBagLayout();

			this.jScrollPanelDatosDetallePlaneacionCompra.setLayout(gridaBagLayoutDatosDetallePlaneacionCompra);
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
			
			this.jScrollPanelDatosDetallePlaneacionCompra.add(this.jTableDatosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePlaneacionCompra.setViewportView(this.jTableDatosDetallePlaneacionCompra);
		this.jTableDatosDetallePlaneacionCompra.setFillsViewportHeight(true);
		this.jTableDatosDetallePlaneacionCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePlaneacionCompra= new GridBagLayout();
		this.jPanelAccionesDetallePlaneacionCompra.setLayout(gridaBagLayoutAccionesDetallePlaneacionCompra);
		
		
		/*	
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
			
		this.jPanelAccionesDetallePlaneacionCompra.add(this.jButtonNuevoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdLineaDetallePlaneacionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdLineaDetallePlaneacionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaDetallePlaneacionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaDetallePlaneacionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaDetallePlaneacionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaDetallePlaneacionCompra.setLayout(gridaBagLayoutFK_IdLineaDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
		jPanelFK_IdLineaDetallePlaneacionCompra.add(jLabelid_lineaFK_IdLineaDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
		jPanelFK_IdLineaDetallePlaneacionCompra.add(jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
		gridBagConstraintsDetallePlaneacionCompra.gridx =1;
		jPanelFK_IdLineaDetallePlaneacionCompra.add(jButtonFK_IdLineaDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		jTabbedPaneBusquedasDetallePlaneacionCompra.addTab("1.-Por Linea ", jPanelFK_IdLineaDetallePlaneacionCompra);
		jTabbedPaneBusquedasDetallePlaneacionCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPlaneacionCompraDetallePlaneacionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdPlaneacionCompraDetallePlaneacionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPlaneacionCompraDetallePlaneacionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPlaneacionCompraDetallePlaneacionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPlaneacionCompraDetallePlaneacionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra.setLayout(gridaBagLayoutFK_IdPlaneacionCompraDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
		jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra.add(jLabelid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
		jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra.add(jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
		gridBagConstraintsDetallePlaneacionCompra.gridx =1;
		jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra.add(jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		jTabbedPaneBusquedasDetallePlaneacionCompra.addTab("2.-Por Planeacion Compra ", jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);
		jTabbedPaneBusquedasDetallePlaneacionCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDetallePlaneacionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetallePlaneacionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePlaneacionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePlaneacionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetallePlaneacionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetallePlaneacionCompra.setLayout(gridaBagLayoutFK_IdProductoDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
		jPanelFK_IdProductoDetallePlaneacionCompra.add(jLabelid_productoFK_IdProductoDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
		jPanelFK_IdProductoDetallePlaneacionCompra.add(jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);


		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
		jPanelFK_IdProductoDetallePlaneacionCompra.add(this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
		gridBagConstraintsDetallePlaneacionCompra.gridx =1;
		jPanelFK_IdProductoDetallePlaneacionCompra.add(jButtonFK_IdProductoDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		jTabbedPaneBusquedasDetallePlaneacionCompra.addTab("3.-Por Producto ", jPanelFK_IdProductoDetallePlaneacionCompra);
		jTabbedPaneBusquedasDetallePlaneacionCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetallePlaneacionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetallePlaneacionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePlaneacionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePlaneacionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetallePlaneacionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetallePlaneacionCompra.setLayout(gridaBagLayoutFK_IdUnidadDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
		jPanelFK_IdUnidadDetallePlaneacionCompra.add(jLabelid_unidadFK_IdUnidadDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
		jPanelFK_IdUnidadDetallePlaneacionCompra.add(jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePlaneacionCompra.gridy = 1;
		gridBagConstraintsDetallePlaneacionCompra.gridx =1;
		jPanelFK_IdUnidadDetallePlaneacionCompra.add(jButtonFK_IdUnidadDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);

		jTabbedPaneBusquedasDetallePlaneacionCompra.addTab("4.-Por Unad ", jPanelFK_IdUnidadDetallePlaneacionCompra);
		jTabbedPaneBusquedasDetallePlaneacionCompra.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePlaneacionCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;		
			//this.gridBagConstraintsDetallePlaneacionCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;		
		//this.gridBagConstraintsDetallePlaneacionCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePlaneacionCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;		
			this.gridBagConstraintsDetallePlaneacionCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);								
		
		
		/*
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		*/		
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx =0;
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePlaneacionCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
				
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePlaneacionCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePlaneacionCompra.setLayout(gridaBagLayoutBusquedasParametrosDetallePlaneacionCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePlaneacionCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			
			
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
			
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePlaneacionCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePlaneacionCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePlaneacionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePlaneacionCompra.setName("jPanelReporteDinamicoDetallePlaneacionCompra"); 
		
		this.jPanelReporteDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePlaneacionCompra.setLayout(gridaBagLayoutReporteDinamicoDetallePlaneacionCompra);
		
		
		this.jInternalFrameReporteDinamicoDetallePlaneacionCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePlaneacionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePlaneacionCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Planeacion Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePlaneacionCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePlaneacionCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jLabelColumnasSelectReporteDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePlaneacionCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePlaneacionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePlaneacionCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePlaneacionCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePlaneacionCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePlaneacionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePlaneacionCompra=new JScrollPane(this.jListColumnasSelectReporteDetallePlaneacionCompra);
			
			this.jScrollColumnasSelectReporteDetallePlaneacionCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePlaneacionCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePlaneacionCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jListColumnasSelectReporteDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jScrollColumnasSelectReporteDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePlaneacionCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePlaneacionCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePlaneacionCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePlaneacionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePlaneacionCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePlaneacionCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePlaneacionCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePlaneacionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePlaneacionCompra=new JScrollPane(this.jListRelacionesSelectReporteDetallePlaneacionCompra);
			
			this.jScrollRelacionesSelectReporteDetallePlaneacionCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePlaneacionCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePlaneacionCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePlaneacionCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePlaneacionCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePlaneacionCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePlaneacionCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePlaneacionCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jLabelConGraficoDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jCheckBoxConGraficoDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePlaneacionCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePlaneacionCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jLabelColumnaCategoriaGraficoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePlaneacionCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePlaneacionCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jLabelColumnaCategoriaValorDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePlaneacionCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePlaneacionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePlaneacionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePlaneacionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePlaneacionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jComboBoxColumnaCategoriaValorDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePlaneacionCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePlaneacionCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jLabelColumnasValoresGraficoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePlaneacionCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePlaneacionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePlaneacionCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePlaneacionCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePlaneacionCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePlaneacionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePlaneacionCompra=new JScrollPane(this.jListColumnasValoresGraficoDetallePlaneacionCompra);
			
			this.jScrollColumnasValoresGraficoDetallePlaneacionCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePlaneacionCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePlaneacionCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jListColumnasSelectReporteDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jScrollColumnasValoresGraficoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePlaneacionCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePlaneacionCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jLabelTiposGraficosReportesDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePlaneacionCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePlaneacionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePlaneacionCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePlaneacionCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jLabelGenerarExcelReporteDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompra.setToolTipText("Generar EXCEL"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jComboBoxTiposReportesDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePlaneacionCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePlaneacionCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jLabelTiposArchivoReporteDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePlaneacionCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePlaneacionCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePlaneacionCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePlaneacionCompra.setToolTipText("Generar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jButtonGenerarReporteDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePlaneacionCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePlaneacionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePlaneacionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePlaneacionCompra.setToolTipText("Cancelar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePlaneacionCompra.add(this.jButtonCerrarReporteDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePlaneacionCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePlaneacionCompra= new JScrollPane(jPanelReporteDinamicoDetallePlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Planeacion Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePlaneacionCompra);
		this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePlaneacionCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePlaneacionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePlaneacionCompra.setName("jPanelImportacionDetallePlaneacionCompra"); 
		
		this.jPanelImportacionDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePlaneacionCompra.setLayout(gridaBagLayoutImportacionDetallePlaneacionCompra);
		
		
		this.jInternalFrameImportacionDetallePlaneacionCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePlaneacionCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePlaneacionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePlaneacionCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePlaneacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePlaneacionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePlaneacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setResizable(true);
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setClosable(true);
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePlaneacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePlaneacionCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePlaneacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setResizable(true);
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setClosable(true);
	    this.jInternalFrameImportacionDetallePlaneacionCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Planeacion Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePlaneacionCompra = new JLabelMe();

		this.jLabelArchivoImportacionDetallePlaneacionCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePlaneacionCompra.add(this.jLabelArchivoImportacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePlaneacionCompra = new JFileChooser();		
		this.jFileChooserImportacionDetallePlaneacionCompra.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePlaneacionCompra = new JButtonMe();
		this.jButtonAbrirImportacionDetallePlaneacionCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePlaneacionCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePlaneacionCompra.setToolTipText("Generar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePlaneacionCompra.add(this.jButtonAbrirImportacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePlaneacionCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePlaneacionCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePlaneacionCompra.add(this.jLabelPathArchivoImportacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePlaneacionCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePlaneacionCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePlaneacionCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePlaneacionCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePlaneacionCompra.add(this.jTextFieldPathArchivoImportacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePlaneacionCompra = new JButtonMe();
		this.jButtonGenerarImportacionDetallePlaneacionCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePlaneacionCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePlaneacionCompra.setToolTipText("Generar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePlaneacionCompra.add(this.jButtonGenerarImportacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePlaneacionCompra = new JButtonMe();
		this.jButtonCerrarImportacionDetallePlaneacionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePlaneacionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePlaneacionCompra.setToolTipText("Cancelar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePlaneacionCompra.add(this.jButtonCerrarImportacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePlaneacionCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePlaneacionCompra= new JScrollPane(jPanelImportacionDetallePlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePlaneacionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePlaneacionCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePlaneacionCompra);
		this.jInternalFrameImportacionDetallePlaneacionCompra.getContentPane().add(this.jScrollPanelImportacionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetallePlaneacionCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePlaneacionCompra = new JButtonMe();
			this.jButtonAbrirOrderByDetallePlaneacionCompra.setText("Orden");
			this.jButtonAbrirOrderByDetallePlaneacionCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePlaneacionCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePlaneacionCompra";
			inputMap = this.jButtonAbrirOrderByDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePlaneacionCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePlaneacionCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePlaneacionCompra.setName("jPanelOrderByDetallePlaneacionCompra"); 
			
			this.jPanelOrderByDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePlaneacionCompra.setLayout(gridaBagLayoutOrderByDetallePlaneacionCompra);
			
			
			this.jTableDatosDetallePlaneacionCompraOrderBy = new JTableMe();        
			this.jTableDatosDetallePlaneacionCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePlaneacionCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePlaneacionCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePlaneacionCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePlaneacionCompraOrderBy.setViewportView(this.jTableDatosDetallePlaneacionCompraOrderBy);
			this.jTableDatosDetallePlaneacionCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePlaneacionCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePlaneacionCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePlaneacionCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePlaneacionCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePlaneacionCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePlaneacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePlaneacionCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePlaneacionCompra.setTitle("Orden");
			this.jInternalFrameOrderByDetallePlaneacionCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePlaneacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePlaneacionCompra.setResizable(true);
			this.jInternalFrameOrderByDetallePlaneacionCompra.setClosable(true);
			this.jInternalFrameOrderByDetallePlaneacionCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Planeacion Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePlaneacionCompra.ipady =150;
				
			this.jPanelOrderByDetallePlaneacionCompra.add(jScrollPanelDatosDetallePlaneacionCompraOrderBy, this.gridBagConstraintsDetallePlaneacionCompra);//this.jTableDatosDetallePlaneacionCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePlaneacionCompra = new JButtonMe();
			this.jButtonCerrarOrderByDetallePlaneacionCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePlaneacionCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePlaneacionCompra.setToolTipText("Cancelar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePlaneacionCompra.add(this.jButtonCerrarOrderByDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePlaneacionCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePlaneacionCompra= new JScrollPane(jPanelOrderByDetallePlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePlaneacionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePlaneacionCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePlaneacionCompra);
			
			this.jInternalFrameOrderByDetallePlaneacionCompra.getContentPane().add(this.jScrollPanelOrderByDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
		
		} else {
			this.jButtonAbrirOrderByDetallePlaneacionCompra = new JButtonMe();
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
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetallePlaneacionCompra.getRowHeight();//DetallePlaneacionCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra.isSelected()) {
					iHeightTable=DetallePlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePlaneacionCompra.isSelected()) {
					iHeightTable=DetallePlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePlaneacionCompra!=null && this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePlaneacionCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePlaneacionCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePlaneacionCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleplaneacioncompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePlaneacionCompra> TraerDetallePlaneacionCompraBeans(List<DetallePlaneacionCompra> detalleplaneacioncompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncompras) {
					
				if(!(DetallePlaneacionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePlaneacionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleplaneacioncompra.setsDetalleGeneralEntityReporte(DetallePlaneacionCompraConstantesFunciones.getDetallePlaneacionCompraDescripcion(detalleplaneacioncompra));
										
						
					
						
					
				} else  {
							
					//detalleplaneacioncompra.setsDetalleGeneralEntityReporte(detalleplaneacioncompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleplaneacioncomprabeans.add(detalleplaneacioncomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleplaneacioncompras;
    }
	//PARA REPORTES FIN
}
