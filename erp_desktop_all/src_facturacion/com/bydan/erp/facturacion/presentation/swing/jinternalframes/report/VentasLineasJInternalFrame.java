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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasLineasConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasLineasJInternalFrame extends VentasLineasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentasLineas;
	
	protected JMenuBar jmenuBarVentasLineas;
	
	protected JMenu jmenuVentasLineas;
	protected JMenu jmenuDatosVentasLineas;
	protected JMenu jmenuArchivoVentasLineas;
	protected JMenu jmenuAccionesVentasLineas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasLineas;	
	protected GridBagConstraints gridBagConstraintsVentasLineas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentasLineasDetalleFormJInternalFrame jInternalFrameDetalleFormVentasLineas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentasLineas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentasLineas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public VentasLineasSessionBean ventaslineasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentasLineas> ventaslineass;		
	public List<VentasLineas> ventaslineassEliminados;	
	public List<VentasLineas> ventaslineassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentasLineas;		
	protected JButton jButtonAbrirOrderByVentasLineas;
	
	
	//protected JPanel jPanelOrderByVentasLineas;
	//public JScrollPane jScrollPanelOrderByVentasLineas;	
	//protected JButton jButtonCerrarOrderByVentasLineas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentasLineasLogic ventaslineasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentasLineas;
	public JScrollPane jScrollPanelDatosEdicionVentasLineas;
	public JScrollPane jScrollPanelDatosGeneralVentasLineas;
    
	
	
	//public JScrollPane jScrollPanelDatosVentasLineasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentasLineas;
	//public JScrollPane jScrollPanelImportacionVentasLineas;
	
	
	
	protected JPanel jPanelAccionesVentasLineas;
	
    protected JPanel jPanelPaginacionVentasLineas;
    protected JPanel jPanelParametrosReportesVentasLineas;
	protected JPanel jPanelParametrosReportesAccionesVentasLineas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentasLineas;
	protected JPanel jPanelParametrosAuxiliar2VentasLineas;
	protected JPanel jPanelParametrosAuxiliar3VentasLineas;
	protected JPanel jPanelParametrosAuxiliar4VentasLineas;
	//protected JPanel jPanelParametrosAuxiliar5VentasLineas;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentasLineas;
	//protected JPanel jPanelImportacionVentasLineas;
	
	
	public JTable jTableDatosVentasLineas;
	
	
	
	//public JTable jTableDatosVentasLineasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentasLineas;
	protected JButton jButtonDuplicarVentasLineas;
	protected JButton jButtonCopiarVentasLineas;
	protected JButton jButtonVerFormVentasLineas;
	protected JButton jButtonNuevoRelacionesVentasLineas;
	protected JButton jButtonModificarVentasLineas;
	
    protected JButton jButtonGuardarCambiosTablaVentasLineas;
	protected JButton jButtonCerrarVentasLineas;
	
	
	protected JButton jButtonRecargarInformacionVentasLineas;
	protected JButton jButtonProcesarInformacionVentasLineas;
	
	
	protected JButton jButtonAnterioresVentasLineas;
	protected JButton jButtonSiguientesVentasLineas;
	protected JButton jButtonNuevoGuardarCambiosVentasLineas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentasLineas;
	//protected JButton jButtonCerrarReporteDinamicoVentasLineas;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentasLineas;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentasLineas;
	//protected JButton jButtonGenerarImportacionVentasLineas;
	//protected JButton jButtonCerrarImportacionVentasLineas;
	//protected JFileChooser jFileChooserImportacionVentasLineas;
	//protected File fileImportacionVentasLineas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasLineas;
	protected JButton jButtonDuplicarToolBarVentasLineas;
	protected JButton jButtonNuevoRelacionesToolBarVentasLineas;
	
	
	public JButton jButtonGuardarCambiosToolBarVentasLineas;
	protected JButton jButtonCopiarToolBarVentasLineas;
	protected JButton jButtonVerFormToolBarVentasLineas;
	public JButton jButtonGuardarCambiosTablaToolBarVentasLineas;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasLineas;
	protected JButton jButtonCerrarToolBarVentasLineas;
	
	protected JButton jButtonRecargarInformacionToolBarVentasLineas;
	protected JButton jButtonProcesarInformacionToolBarVentasLineas;
	protected JButton jButtonAnterioresToolBarVentasLineas;
	protected JButton jButtonSiguientesToolBarVentasLineas;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentasLineas;
	protected JButton jButtonAbrirOrderByToolBarVentasLineas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasLineas;
	protected JMenuItem jMenuItemDuplicarVentasLineas;
	protected JMenuItem jMenuItemNuevoRelacionesVentasLineas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentasLineas;
	protected JMenuItem jMenuItemCopiarVentasLineas;
	protected JMenuItem jMenuItemVerFormVentasLineas;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasLineas;
	protected JMenuItem jMenuItemCerrarVentasLineas;
	protected JMenuItem jMenuItemDetalleCerrarVentasLineas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentasLineas;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasLineas;
	
	protected JMenuItem jMenuItemRecargarInformacionVentasLineas;
	protected JMenuItem jMenuItemProcesarInformacionVentasLineas;
	protected JMenuItem jMenuItemAnterioresVentasLineas;
	protected JMenuItem jMenuItemSiguientesVentasLineas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasLineas;
	protected JMenuItem jMenuItemAbrirOrderByVentasLineas;
	protected JMenuItem jMenuItemMostrarOcultarVentasLineas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasLineas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentasLineas;
	protected JCheckBox jCheckBoxSeleccionadosVentasLineas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentasLineas;
	protected JCheckBox jCheckBoxConGraficoReporteVentasLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentasLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentasLineas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentasLineas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentasLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentasLineas;
	protected JTextField jTextFieldValorCampoGeneralVentasLineas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentasLineas;
	//public JList<Reporte> jListColumnasSelectReporteVentasLineas;
	//public JScrollPane jScrollColumnasSelectReporteVentasLineas;
	
	//public JLabel jLabelRelacionesSelectReporteVentasLineas;
	//public JList<Reporte> jListRelacionesSelectReporteVentasLineas;
	//public JScrollPane jScrollRelacionesSelectReporteVentasLineas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentasLineas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentasLineas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentasLineas;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentasLineas;
	
		
	//public JLabel jLabelArchivoImportacionVentasLineas;	
	//public JLabel jLabelPathArchivoImportacionVentasLineas;
	//protected JTextField jTextFieldPathArchivoImportacionVentasLineas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentasLineas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentasLineas;
	
	//public JLabel jLabelColumnaCategoriaValorVentasLineas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentasLineas;
	
	//public JLabel jLabelColumnasValoresGraficoVentasLineas;
	//public JList<Reporte> jListColumnasValoresGraficoVentasLineas;
	//public JScrollPane jScrollColumnasValoresGraficoVentasLineas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentasLineas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentasLineas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentasLineas;
	public JPanel jPanelBusquedaVentasLineasVentasLineas;
	public JButton jButtonBusquedaVentasLineasVentasLineas;
	
	public JPanel jPanelid_empresaBusquedaVentasLineasVentasLineas;
	public JLabel jLabelid_empresaBusquedaVentasLineasVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBusquedaVentasLineasVentasLineas;
	public JButton jButtonid_empresaBusquedaVentasLineasVentasLineas= new JButtonMe();
	public JButton jButtonid_empresaBusquedaVentasLineasVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_empresaBusquedaVentasLineasVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaVentasLineasVentasLineas;
	public JLabel jLabelid_lineaBusquedaVentasLineasVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaVentasLineasVentasLineas;
	public JButton jButtonid_lineaBusquedaVentasLineasVentasLineas= new JButtonMe();
	public JButton jButtonid_lineaBusquedaVentasLineasVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaVentasLineasVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaVentasLineasVentasLineas;
	public JLabel jLabelid_linea_grupoBusquedaVentasLineasVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas;
	public JButton jButtonid_linea_grupoBusquedaVentasLineasVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaVentasLineasVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaVentasLineasVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaVentasLineasVentasLineas;
	public JLabel jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas;
	public JButton jButtonid_linea_categoriaBusquedaVentasLineasVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaVentasLineasVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaVentasLineasVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaVentasLineasVentasLineas;
	public JLabel jLabelid_linea_marcaBusquedaVentasLineasVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas;
	public JButton jButtonid_linea_marcaBusquedaVentasLineasVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaVentasLineasVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaVentasLineasVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaVentasLineasVentasLineas;
	public JLabel jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas;
	public JButton jButtonfecha_emision_desdeBusquedaVentasLineasVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaVentasLineasVentasLineas;
	public JLabel jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas;
	public JButton jButtonfecha_emision_hastaBusquedaVentasLineasVentasLineasBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VentasLineasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasLineasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasLineasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasLineasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentasLineas)	{
		this.jButtonRecargarInformacionVentasLineas = jButtonRecargarInformacionVentasLineas;
	}
	
	public JButton getjButtonProcesarInformacionVentasLineas() {
		return this.jButtonProcesarInformacionVentasLineas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasLineas)	{
		this.jButtonProcesarInformacionVentasLineas = jButtonProcesarInformacionVentasLineas;
	}
	
	
	public JButton getjButtonRecargarInformacionVentasLineas() {
		return this.jButtonRecargarInformacionVentasLineas;
	}
	
	
	public List<VentasLineas> getventaslineass() {
		return this.ventaslineass;
	}

	public void setventaslineass(List<VentasLineas> ventaslineass) {
		this.ventaslineass = ventaslineass;
	}
	
	public List<VentasLineas> getventaslineassAux() {
		return this.ventaslineassAux;
	}

	public void setventaslineassAux(List<VentasLineas> ventaslineassAux) {
		this.ventaslineassAux = ventaslineassAux;
	}
	
	public List<VentasLineas> getventaslineassEliminados() {
		return this.ventaslineassEliminados;
	}

	public void setVentasLineassEliminados(List<VentasLineas> ventaslineassEliminados) {
		this.ventaslineassEliminados = ventaslineassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentasLineas() {
		return jComboBoxTiposSeleccionarVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentasLineas(
			JComboBox jComboBoxTiposSeleccionarVentasLineas) {
		this.jComboBoxTiposSeleccionarVentasLineas = jComboBoxTiposSeleccionarVentasLineas;
	}
	
	public void setBorderResaltarTiposSeleccionarVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentasLineas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentasLineas() {
		return jTextFieldValorCampoGeneralVentasLineas;
	}

	public void setjTextFieldValorCampoGeneralVentasLineas(
			JTextField jTextFieldValorCampoGeneralVentasLineas) {
		this.jTextFieldValorCampoGeneralVentasLineas = jTextFieldValorCampoGeneralVentasLineas;
	}

	public void setBorderResaltarValorCampoGeneralVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentasLineas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentasLineas() {
		return this.jCheckBoxSeleccionarTodosVentasLineas;
	}

	public void setjCheckBoxSeleccionarTodosVentasLineas(
			JCheckBox jCheckBoxSeleccionarTodosVentasLineas) {
		this.jCheckBoxSeleccionarTodosVentasLineas = jCheckBoxSeleccionarTodosVentasLineas;
	}

	public void setBorderResaltarSeleccionarTodosVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentasLineas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentasLineas() {
		return this.jCheckBoxSeleccionadosVentasLineas;
	}

	public void setjCheckBoxSeleccionadosVentasLineas(
			JCheckBox jCheckBoxSeleccionadosVentasLineas) {
		this.jCheckBoxSeleccionadosVentasLineas = jCheckBoxSeleccionadosVentasLineas;
	}
	
	public void setBorderResaltarSeleccionadosVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentasLineas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentasLineas() {
		return this.jComboBoxTiposArchivosReportesVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentasLineas(
			JComboBox jComboBoxTiposArchivosReportesVentasLineas) {
		this.jComboBoxTiposArchivosReportesVentasLineas = jComboBoxTiposArchivosReportesVentasLineas;
	}

	public void setBorderResaltarTiposArchivosReportesVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentasLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentasLineas() {
		return this.jComboBoxTiposReportesVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentasLineas(
			JComboBox jComboBoxTiposReportesVentasLineas) {
		this.jComboBoxTiposReportesVentasLineas = jComboBoxTiposReportesVentasLineas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentasLineas() {
	//	return jComboBoxTiposReportesDinamicoVentasLineas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentasLineas(
	//		JComboBox jComboBoxTiposReportesDinamicoVentasLineas) {
	//	this.jComboBoxTiposReportesDinamicoVentasLineas = jComboBoxTiposReportesDinamicoVentasLineas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentasLineas() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentasLineas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentasLineas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentasLineas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentasLineas = jComboBoxTiposArchivosReportesDinamicoVentasLineas;
	//}
	
	public void setBorderResaltarTiposReportesVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentasLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentasLineas() {
		return this.jComboBoxTiposGraficosReportesVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentasLineas(
			JComboBox jComboBoxTiposGraficosReportesVentasLineas) {
		this.jComboBoxTiposGraficosReportesVentasLineas = jComboBoxTiposGraficosReportesVentasLineas;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentasLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentasLineas() {
		return this.jComboBoxTiposPaginacionVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentasLineas(
			JComboBox jComboBoxTiposPaginacionVentasLineas) {
		this.jComboBoxTiposPaginacionVentasLineas = jComboBoxTiposPaginacionVentasLineas;
	}
	
	public void setBorderResaltarTiposPaginacionVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentasLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentasLineas() {
		return this.jComboBoxTiposRelacionesVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasLineas() {
		return this.jComboBoxTiposAccionesVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasLineas(
			JComboBox jComboBoxTiposRelacionesVentasLineas) {
		this.jComboBoxTiposRelacionesVentasLineas = jComboBoxTiposRelacionesVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasLineas(
			JComboBox jComboBoxTiposAccionesVentasLineas) {
		this.jComboBoxTiposAccionesVentasLineas = jComboBoxTiposAccionesVentasLineas;
	}
	
	public void setBorderResaltarTiposRelacionesVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentasLineas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentasLineas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentasLineas() {
	//	return jCheckBoxConGraficoDinamicoVentasLineas;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentasLineas(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentasLineas) {
	//	this.jCheckBoxConGraficoDinamicoVentasLineas = jCheckBoxConGraficoDinamicoVentasLineas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentasLineas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentasLineas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentasLineas .setBorder(borderResaltar);		
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
		this.ventaslineasSessionBean=new VentasLineasSessionBean();
		
		this.ventaslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventaslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventaslineasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasLineasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Lineas MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
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
		
		VentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentasLineas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"nuevo","nuevo","Nuevo"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"duplicar","duplicar","Duplicar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"copiar","copiar","Copiar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"ver_form","ver_form","Ver"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"recargar","recargar","Buscar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentasLineas,this.jTtoolBarVentasLineas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentasLineas,this.jTtoolBarVentasLineas,
							"cerrar","cerrar","Salir"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentasLineas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentasLineas;
			
				this.jButtonProcesarInformacionToolBarVentasLineas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentasLineas;
				
		//protected JButton jButtonModificarToolBarVentasLineas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentasLineas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentasLineas=new JMenuMe("General");
		this.jmenuArchivoVentasLineas=new JMenuMe("Archivo");
		this.jmenuAccionesVentasLineas=new JMenuMe("Acciones");
		this.jmenuDatosVentasLineas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasLineas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasLineas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasLineas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentasLineas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentasLineas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentasLineas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentasLineas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentasLineas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentasLineas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentasLineas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasLineas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasLineas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentasLineas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentasLineas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentasLineas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentasLineas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentasLineas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentasLineas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentasLineas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentasLineas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentasLineas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentasLineas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentasLineas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentasLineas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentasLineas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentasLineas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentasLineas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentasLineas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentasLineas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentasLineas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentasLineas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentasLineas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentasLineas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentasLineas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentasLineas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentasLineas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasLineas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentasLineas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentasLineas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentasLineas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasLineas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentasLineas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentasLineas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentasLineas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentasLineas.add(this.jMenuItemCerrarVentasLineas);
			
			this.jmenuAccionesVentasLineas.add(this.jMenuItemNuevoVentasLineas);
			this.jmenuAccionesVentasLineas.add(this.jMenuItemNuevoGuardarCambiosVentasLineas);
			this.jmenuAccionesVentasLineas.add(this.jMenuItemNuevoRelacionesVentasLineas);
			this.jmenuAccionesVentasLineas.add(this.jMenuItemGuardarCambiosTablaVentasLineas);		
			this.jmenuAccionesVentasLineas.add(this.jMenuItemDuplicarVentasLineas);		
			this.jmenuAccionesVentasLineas.add(this.jMenuItemCopiarVentasLineas);		
			this.jmenuAccionesVentasLineas.add(this.jMenuItemVerFormVentasLineas);		
			
			this.jmenuDatosVentasLineas.add(this.jMenuItemRecargarInformacionVentasLineas);				
			this.jmenuDatosVentasLineas.add(this.jMenuItemAnterioresVentasLineas);				
			this.jmenuDatosVentasLineas.add(this.jMenuItemSiguientesVentasLineas);				
			this.jmenuDatosVentasLineas.add(this.jMenuItemAbrirOrderByVentasLineas);				
			this.jmenuDatosVentasLineas.add(this.jMenuItemMostrarOcultarVentasLineas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentasLineas.add(this.jMenuItemGuardarCambiosVentasLineas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentasLineas.add(this.jmenuArchivoVentasLineas);		
			this.jmenuBarVentasLineas.add(this.jmenuAccionesVentasLineas);		
			this.jmenuBarVentasLineas.add(this.jmenuDatosVentasLineas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentasLineas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentasLineas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentasLineasVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentasLineasVentasLineas.setToolTipText("Buscar Por Empresa Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaVentasLineasVentasLineas= new JButtonMe();
		this.jButtonBusquedaVentasLineasVentasLineas.setText("Buscar");
		this.jButtonBusquedaVentasLineasVentasLineas.setToolTipText("Buscar Por Empresa Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentasLineasVentasLineas,"buscar_button","Buscar Por Empresa Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentasLineasVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresaBusquedaVentasLineasVentasLineas = new JLabelMe();
		jLabelid_empresaBusquedaVentasLineasVentasLineas.setText("Empresa :");
		jLabelid_empresaBusquedaVentasLineasVentasLineas.setToolTipText("Empresa");
		jLabelid_empresaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresaBusquedaVentasLineasVentasLineas= new JComboBoxMe();
		jComboBoxid_empresaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaVentasLineasVentasLineas = new JLabelMe();
		jLabelid_lineaBusquedaVentasLineasVentasLineas.setText("Linea :");
		jLabelid_lineaBusquedaVentasLineasVentasLineas.setToolTipText("Linea");
		jLabelid_lineaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaVentasLineasVentasLineas= new JComboBoxMe();
		jComboBoxid_lineaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaVentasLineasVentasLineas = new JLabelMe();
		jLabelid_linea_grupoBusquedaVentasLineasVentasLineas.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaVentasLineasVentasLineas.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas = new JLabelMe();
		jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaVentasLineasVentasLineas = new JLabelMe();
		jLabelid_linea_marcaBusquedaVentasLineasVentasLineas.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaVentasLineasVentasLineas.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentasLineas=new JTabbedPane();


		this.jTabbedPaneBusquedasVentasLineas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasVentasLineas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasVentasLineas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentasLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentasLineas = new VentasLineasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ventas Lineas DATOS");
			this.jInternalFrameDetalleFormVentasLineas = new VentasLineasDetalleFormJInternalFrame(jDesktopPane,this.ventaslineasSessionBean.getConGuardarRelaciones(),this.ventaslineasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentasLineas = null;//new VentasLineasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasLineas= new GridBagLayout();
		
		
		this.jTableDatosVentasLineas = new JTableMe();      
		
		String sToolTipVentasLineas="";
		sToolTipVentasLineas=VentasLineasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasLineas+="(Facturacion.VentasLineas)";
		}
		
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasLineas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentasLineas.setToolTipText(sToolTipVentasLineas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentasLineas);
		this.jTableDatosVentasLineas.setAutoCreateRowSorter(true);
		this.jTableDatosVentasLineas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentasLineas.setRowSelectionAllowed(true);
		this.jTableDatosVentasLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentasLineas = new JButtonMe();
		this.jButtonDuplicarVentasLineas = new JButtonMe();
		this.jButtonCopiarVentasLineas = new JButtonMe();
		this.jButtonVerFormVentasLineas = new JButtonMe();
		this.jButtonNuevoRelacionesVentasLineas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentasLineas = new JButtonMe();
		this.jButtonCerrarVentasLineas = new JButtonMe();
		
		this.jScrollPanelDatosVentasLineas = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentasLineas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Lineas";
		
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Lineases" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasLineas.setToolTipText("Acciones");
        this.jPanelAccionesVentasLineas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentasLineas=new ReporteDinamicoJInternalFrame(VentasLineasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentasLineas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentasLineas=new ImportacionJInternalFrame(VentasLineasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentasLineas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentasLineas = new JButtonMe();
		
		this.jButtonAbrirOrderByVentasLineas.setText("Orden");
		this.jButtonAbrirOrderByVentasLineas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasLineas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasLineas,false,this);
			
			//this.cargarOrderByVentasLineas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasLineas,true,this);
			
			//this.cargarOrderByVentasLineas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentasLineas.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosVentasLineas.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosVentasLineas.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosVentasLineas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasLineas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasLineas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentasLineas.setText("Nuevo");
		this.jButtonDuplicarVentasLineas.setText("Duplicar");
		this.jButtonCopiarVentasLineas.setText("Copiar");
		this.jButtonVerFormVentasLineas.setText("Ver");
		this.jButtonNuevoRelacionesVentasLineas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentasLineas.setText("Guardar");
		this.jButtonCerrarVentasLineas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasLineas,"nuevo_button","Nuevo",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentasLineas,"duplicar_button","Duplicar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentasLineas,"copiar_button","Copiar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentasLineas,"ver_form","Ver",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentasLineas,"nuevorelaciones_button","Nuevo Rel",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasLineas,"guardarcambiostabla_button","Guardar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasLineas,"cerrar_button","Salir",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentasLineas.setToolTipText("Nuevo"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentasLineas.setToolTipText("Duplicar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentasLineas.setToolTipText("Copiar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentasLineas.setToolTipText("Ver"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentasLineas.setToolTipText("Nuevo Rel"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentasLineas.setToolTipText("Guardar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasLineas.setToolTipText("Salir"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasLineas";
		inputMap = this.jButtonNuevoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasLineas"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentasLineas";
		inputMap = this.jButtonDuplicarVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentasLineas"));
		
		//COPIAR
		sMapKey = "CopiarVentasLineas";
		inputMap = this.jButtonCopiarVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentasLineas"));
		
		//VEr FORM
		sMapKey = "VerFormVentasLineas";
		inputMap = this.jButtonVerFormVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentasLineas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentasLineas";
		inputMap = this.jButtonNuevoRelacionesVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentasLineas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentasLineas";
		inputMap = this.jButtonModificarVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentasLineas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentasLineas";
		inputMap = this.jButtonCerrarVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasLineas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasLineas";
		inputMap = this.jButtonGuardarCambiosTablaVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasLineas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentasLineas.setName("jPanelParametrosReportesVentasLineas"); 
		
		this.jPanelParametrosReportesAccionesVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentasLineas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentasLineas.setName("jPanelParametrosReportesAccionesVentasLineas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentasLineas = new JButtonMe();
		this.jButtonRecargarInformacionVentasLineas.setText("Buscar");
		this.jButtonRecargarInformacionVentasLineas.setToolTipText("Buscar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentasLineas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentasLineas.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentasLineas = new JButtonMe();
		this.jButtonProcesarInformacionVentasLineas.setText("Procesar");
		this.jButtonProcesarInformacionVentasLineas.setToolTipText("Procesar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentasLineas.setVisible(false);
			
		this.jButtonProcesarInformacionVentasLineas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasLineas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasLineas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasLineas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentasLineas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasLineas.setText("TIPO");       
		this.jComboBoxTiposReportesVentasLineas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasLineas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentasLineas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentasLineas.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentasLineas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentasLineas.setText("Accion");
		this.jComboBoxTiposRelacionesVentasLineas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasLineas.setText("Accion");
		this.jComboBoxTiposAccionesVentasLineas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentasLineas.setText("Accion");
		this.jComboBoxTiposSeleccionarVentasLineas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentasLineas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentasLineas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasLineas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasLineas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentasLineas = new JLabelMe();
		
		this.jLabelAccionesVentasLineas.setText("Acciones");		
		this.jLabelAccionesVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentasLineas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentasLineas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentasLineas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentasLineas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentasLineas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentasLineas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentasLineas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentasLineas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentasLineas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentasLineas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentasLineas.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentasLineas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentasLineas = new JButtonMe();
		//this.jButtonAnterioresVentasLineas.setText("<<");
        this.jButtonAnterioresVentasLineas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentasLineas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentasLineas = new JButtonMe();
		//this.jButtonSiguientesVentasLineas.setText(">>");
        this.jButtonSiguientesVentasLineas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentasLineas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentasLineas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentasLineas.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentasLineas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentasLineas,"nuevoguardarcambios_button","Nue",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentasLineas";
		inputMap = this.jButtonNuevoGuardarCambiosVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentasLineas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentasLineas";
		inputMap = this.jButtonRecargarInformacionVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentasLineas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentasLineas";
		inputMap = this.jButtonSiguientesVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentasLineas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentasLineas";
		inputMap = this.jButtonAnterioresVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentasLineas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentasLineas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentasLineas.setMinimumSize(new Dimension(this.getWidth(),VentasLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasLineasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasLineas.setMaximumSize(new Dimension(this.getWidth(),VentasLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasLineasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasLineas.setPreferredSize(new Dimension(this.getWidth(),VentasLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasLineasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentasLineas = new GridBagLayout();

			this.jPanelPaginacionVentasLineas.setLayout(gridaBagLayoutPaginacionVentasLineas);						
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = 0;
			this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentasLineas.add(this.jButtonAnterioresVentasLineas, this.gridBagConstraintsVentasLineas);
					
						
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasLineas.gridy = 0;
			
			this.jPanelPaginacionVentasLineas.add(this.jButtonNuevoGuardarCambiosVentasLineas, this.gridBagConstraintsVentasLineas);
						
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasLineas.gridy = 0;
			this.jPanelPaginacionVentasLineas.add(this.jButtonSiguientesVentasLineas, this.gridBagConstraintsVentasLineas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = 1;
			this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasLineas.add(this.jButtonNuevoVentasLineas, this.gridBagConstraintsVentasLineas);
						
			
			
			if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentasLineas = new GridBagConstraints();
				this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentasLineas.gridy = 1;
				this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentasLineas.add(this.jButtonGuardarCambiosTablaVentasLineas, this.gridBagConstraintsVentasLineas);
			}
			
			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = 1;
			this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasLineas.add(this.jButtonDuplicarVentasLineas, this.gridBagConstraintsVentasLineas);
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = 1;
			this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasLineas.add(this.jButtonCopiarVentasLineas, this.gridBagConstraintsVentasLineas);
		
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = 1;
			this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasLineas.add(this.jButtonVerFormVentasLineas, this.gridBagConstraintsVentasLineas);
		
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = 1;
			this.gridBagConstraintsVentasLineas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentasLineas.add(this.jButtonCerrarVentasLineas, this.gridBagConstraintsVentasLineas);
		
		
		
		this.jButtonRecargarInformacionVentasLineas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasLineas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasLineas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentasLineas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasLineas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasLineas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentasLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentasLineas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasLineas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasLineas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentasLineas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasLineas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasLineas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentasLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentasLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentasLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentasLineas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasLineas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasLineas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentasLineas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasLineas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasLineas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentasLineas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasLineas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasLineas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentasLineas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasLineas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasLineas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentasLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentasLineas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentasLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentasLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentasLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentasLineas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentasLineas.setLayout(gridaBagParametrosReportesVentasLineas);
			this.jPanelParametrosReportesAccionesVentasLineas.setLayout(gridaBagParametrosReportesAccionesVentasLineas);
			
			
			this.jPanelParametrosAuxiliar1VentasLineas.setLayout(gridaBagParametrosAuxiliar1VentasLineas);
			this.jPanelParametrosAuxiliar2VentasLineas.setLayout(gridaBagParametrosAuxiliar2VentasLineas);
			this.jPanelParametrosAuxiliar3VentasLineas.setLayout(gridaBagParametrosAuxiliar3VentasLineas);
			this.jPanelParametrosAuxiliar4VentasLineas.setLayout(gridaBagParametrosAuxiliar4VentasLineas);
			//this.jPanelParametrosAuxiliar5VentasLineas.setLayout(gridaBagParametrosAuxiliar2VentasLineas);			
			
			
			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasLineas.add(this.jButtonRecargarInformacionVentasLineas, this.gridBagConstraintsVentasLineas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasLineas.add(this.jComboBoxTiposPaginacionVentasLineas, this.gridBagConstraintsVentasLineas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasLineas.add(this.jCheckBoxConAltoMaximoTablaVentasLineas, this.gridBagConstraintsVentasLineas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasLineas.add(this.jComboBoxTiposArchivosReportesVentasLineas, this.gridBagConstraintsVentasLineas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasLineas.add(this.jPanelParametrosAuxiliar1VentasLineas, this.gridBagConstraintsVentasLineas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentasLineas.add(this.jComboBoxTiposReportesVentasLineas, this.gridBagConstraintsVentasLineas);																		
			
			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentasLineas.add(this.jComboBoxTiposGraficosReportesVentasLineas, this.gridBagConstraintsVentasLineas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasLineas.add(this.jPanelParametrosAuxiliar4VentasLineas, this.gridBagConstraintsVentasLineas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasLineas.add(this.jComboBoxTiposReportesVentasLineas, this.gridBagConstraintsVentasLineas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasLineas.add(this.jCheckBoxGenerarReporteVentasLineas, this.gridBagConstraintsVentasLineas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasLineas.add(this.jPanelParametrosAuxiliar2VentasLineas, this.gridBagConstraintsVentasLineas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasLineas.add(this.jLabelAccionesVentasLineas, this.gridBagConstraintsVentasLineas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentasLineas = new GridBagConstraints();
				this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentasLineas.add(this.jButtonAbrirOrderByVentasLineas, this.gridBagConstraintsVentasLineas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasLineas.add(this.jComboBoxTiposSeleccionarVentasLineas, this.gridBagConstraintsVentasLineas);			
			
			
			/*
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasLineas.add(this.jCheckBoxSeleccionarTodosVentasLineas, this.gridBagConstraintsVentasLineas);
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasLineas.add(this.jCheckBoxConGraficoReporteVentasLineas, this.gridBagConstraintsVentasLineas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasLineas.add(this.jCheckBoxSeleccionarTodosVentasLineas, this.gridBagConstraintsVentasLineas);															
				
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasLineas.add(this.jCheckBoxSeleccionadosVentasLineas, this.gridBagConstraintsVentasLineas);															
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasLineas.add(this.jCheckBoxConGraficoReporteVentasLineas, this.gridBagConstraintsVentasLineas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasLineas.add(this.jPanelParametrosAuxiliar3VentasLineas, this.gridBagConstraintsVentasLineas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasLineas.add(this.jComboBoxTiposAccionesVentasLineas, this.gridBagConstraintsVentasLineas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentasLineas = new GridBagLayout();

			this.jScrollPanelDatosVentasLineas.setLayout(gridaBagLayoutDatosVentasLineas);
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = 0;
			this.gridBagConstraintsVentasLineas.gridx = 0;
			
			this.jScrollPanelDatosVentasLineas.add(this.jTableDatosVentasLineas, this.gridBagConstraintsVentasLineas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentasLineas.setViewportView(this.jTableDatosVentasLineas);
		this.jTableDatosVentasLineas.setFillsViewportHeight(true);
		this.jTableDatosVentasLineas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentasLineas= new GridBagLayout();
		this.jPanelAccionesVentasLineas.setLayout(gridaBagLayoutAccionesVentasLineas);
		
		
		/*	
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 0;
			
		this.jPanelAccionesVentasLineas.add(this.jButtonNuevoVentasLineas, this.gridBagConstraintsVentasLineas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentasLineasVentasLineas= new GridBagLayout();
		gridaBagLayoutBusquedaVentasLineasVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentasLineasVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentasLineasVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentasLineasVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentasLineasVentasLineas.setLayout(gridaBagLayoutBusquedaVentasLineasVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 0;
		gridBagConstraintsVentasLineas.gridx = 0;
		jPanelBusquedaVentasLineasVentasLineas.add(jLabelid_empresaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 0;
		gridBagConstraintsVentasLineas.gridx = 1;
		jPanelBusquedaVentasLineasVentasLineas.add(jComboBoxid_empresaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);


		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 1;
		gridBagConstraintsVentasLineas.gridx = 0;
		jPanelBusquedaVentasLineasVentasLineas.add(jLabelid_lineaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 1;
		gridBagConstraintsVentasLineas.gridx = 1;
		jPanelBusquedaVentasLineasVentasLineas.add(jComboBoxid_lineaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);


		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 2;
		gridBagConstraintsVentasLineas.gridx = 0;
		jPanelBusquedaVentasLineasVentasLineas.add(jLabelid_linea_grupoBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 2;
		gridBagConstraintsVentasLineas.gridx = 1;
		jPanelBusquedaVentasLineasVentasLineas.add(jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);


		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 3;
		gridBagConstraintsVentasLineas.gridx = 0;
		jPanelBusquedaVentasLineasVentasLineas.add(jLabelid_linea_categoriaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 3;
		gridBagConstraintsVentasLineas.gridx = 1;
		jPanelBusquedaVentasLineasVentasLineas.add(jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);


		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 4;
		gridBagConstraintsVentasLineas.gridx = 0;
		jPanelBusquedaVentasLineasVentasLineas.add(jLabelid_linea_marcaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 4;
		gridBagConstraintsVentasLineas.gridx = 1;
		jPanelBusquedaVentasLineasVentasLineas.add(jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);


		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 5;
		gridBagConstraintsVentasLineas.gridx = 0;
		jPanelBusquedaVentasLineasVentasLineas.add(jLabelfecha_emision_desdeBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 5;
		gridBagConstraintsVentasLineas.gridx = 1;
		jPanelBusquedaVentasLineasVentasLineas.add(jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);


		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 6;
		gridBagConstraintsVentasLineas.gridx = 0;
		jPanelBusquedaVentasLineasVentasLineas.add(jLabelfecha_emision_hastaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 6;
		gridBagConstraintsVentasLineas.gridx = 1;
		jPanelBusquedaVentasLineasVentasLineas.add(jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		gridBagConstraintsVentasLineas = new GridBagConstraints();
		gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasLineas.gridy = 7;
		gridBagConstraintsVentasLineas.gridx =1;
		jPanelBusquedaVentasLineasVentasLineas.add(jButtonBusquedaVentasLineasVentasLineas, gridBagConstraintsVentasLineas);

		jTabbedPaneBusquedasVentasLineas.addTab("1.-Por Empresa Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaVentasLineasVentasLineas);
		jTabbedPaneBusquedasVentasLineas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasLineas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasLineas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();						
			this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasLineas.gridx = 0;		
			//this.gridBagConstraintsVentasLineas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasLineas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentasLineas, this.gridBagConstraintsVentasLineas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentasLineas.gridx = 0;		
		//this.gridBagConstraintsVentasLineas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentasLineas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentasLineas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasLineas.gridx = 0;		
			this.gridBagConstraintsVentasLineas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentasLineas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentasLineas, this.gridBagConstraintsVentasLineas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentasLineas, this.gridBagConstraintsVentasLineas);								
		
		
		/*
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentasLineas, this.gridBagConstraintsVentasLineas);
		*/		
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasLineas.gridx =0;
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasLineas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasLineas, this.gridBagConstraintsVentasLineas);
				
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentasLineas, this.gridBagConstraintsVentasLineas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentasLineasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasLineas = new GridBagLayout();
			this.jPanelBusquedasParametrosVentasLineas.setLayout(gridaBagLayoutBusquedasParametrosVentasLineas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentasLineas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasLineas, this.gridBagConstraintsVentasLineas);
			
			
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasLineas, this.gridBagConstraintsVentasLineas);
		
			
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasLineas, this.gridBagConstraintsVentasLineas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentasLineas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentasLineas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentasLineas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentasLineas.setName("jPanelReporteDinamicoVentasLineas"); 
		
		this.jPanelReporteDinamicoVentasLineas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasLineas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasLineas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentasLineas.setLayout(gridaBagLayoutReporteDinamicoVentasLineas);
		
		
		this.jInternalFrameReporteDinamicoVentasLineas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentasLineas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasLineas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentasLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentasLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentasLineas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentasLineas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentasLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentasLineas.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentasLineas.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentasLineas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentasLineas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasLineas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasLineas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Lineases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentasLineas = new JLabelMe();

		this.jLabelColumnasSelectReporteVentasLineas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasLineas.add(this.jLabelColumnasSelectReporteVentasLineas, this.gridBagConstraintsVentasLineas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentasLineas = new JList<Reporte>();
		this.jListColumnasSelectReporteVentasLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentasLineas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentasLineas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasLineas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentasLineas=new JScrollPane(this.jListColumnasSelectReporteVentasLineas);
			
			this.jScrollColumnasSelectReporteVentasLineas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasLineas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasLineas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentasLineas.add(this.jListColumnasSelectReporteVentasLineas, this.gridBagConstraintsVentasLineas);
		this.jPanelReporteDinamicoVentasLineas.add(this.jScrollColumnasSelectReporteVentasLineas, this.gridBagConstraintsVentasLineas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentasLineas = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentasLineas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentasLineas = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentasLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentasLineas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentasLineas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasLineas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentasLineas=new JScrollPane(this.jListRelacionesSelectReporteVentasLineas);
			
			this.jScrollRelacionesSelectReporteVentasLineas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasLineas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasLineas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentasLineas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentasLineas = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentasLineas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentasLineas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentasLineas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentasLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentasLineas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentasLineas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentasLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentasLineas = new JLabelMe();

		this.jLabelConGraficoDinamicoVentasLineas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasLineas.add(this.jLabelConGraficoDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentasLineas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentasLineas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentasLineas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentasLineas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasLineas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasLineas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasLineas.add(this.jCheckBoxConGraficoDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentasLineas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentasLineas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasLineas.add(this.jLabelColumnaCategoriaGraficoVentasLineas, this.gridBagConstraintsVentasLineas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentasLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasLineas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentasLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentasLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentasLineas.add(this.jComboBoxColumnaCategoriaGraficoVentasLineas, this.gridBagConstraintsVentasLineas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentasLineas = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentasLineas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasLineas.add(this.jLabelColumnaCategoriaValorVentasLineas, this.gridBagConstraintsVentasLineas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentasLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentasLineas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentasLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentasLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentasLineas.add(this.jComboBoxColumnaCategoriaValorVentasLineas, this.gridBagConstraintsVentasLineas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentasLineas = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentasLineas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasLineas.add(this.jLabelColumnasValoresGraficoVentasLineas, this.gridBagConstraintsVentasLineas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentasLineas = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentasLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentasLineas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentasLineas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasLineas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentasLineas=new JScrollPane(this.jListColumnasValoresGraficoVentasLineas);
			
			this.jScrollColumnasValoresGraficoVentasLineas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasLineas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasLineas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentasLineas.add(this.jListColumnasSelectReporteVentasLineas, this.gridBagConstraintsVentasLineas);
		this.jPanelReporteDinamicoVentasLineas.add(this.jScrollColumnasValoresGraficoVentasLineas, this.gridBagConstraintsVentasLineas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentasLineas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentasLineas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasLineas.add(this.jLabelTiposGraficosReportesDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentasLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasLineas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentasLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentasLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasLineas.add(this.jComboBoxTiposGraficosReportesDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentasLineas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentasLineas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasLineas.add(this.jLabelGenerarExcelReporteDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentasLineas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentasLineas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentasLineas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentasLineas.setToolTipText("Generar EXCEL"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentasLineas.add(this.jButtonGenerarExcelReporteDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasLineas.add(this.jComboBoxTiposReportesDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentasLineas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentasLineas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasLineas.add(this.jLabelTiposArchivoReporteDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasLineas.add(this.jComboBoxTiposArchivosReportesDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentasLineas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentasLineas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentasLineas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentasLineas.setToolTipText("Generar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasLineas.add(this.jButtonGenerarReporteDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentasLineas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentasLineas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentasLineas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentasLineas.setToolTipText("Cancelar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasLineas.add(this.jButtonCerrarReporteDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentasLineas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentasLineas= new JScrollPane(jPanelReporteDinamicoVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentasLineas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasLineas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasLineas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Lineases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentasLineas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentasLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentasLineas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentasLineas);
		this.jInternalFrameReporteDinamicoVentasLineas.getContentPane().add(this.jScrollPanelReporteDinamicoVentasLineas, this.gridBagConstraintsVentasLineas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentasLineas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentasLineas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentasLineas.setName("jPanelImportacionVentasLineas"); 
		
		this.jPanelImportacionVentasLineas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasLineas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasLineas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentasLineas.setLayout(gridaBagLayoutImportacionVentasLineas);
		
		
		this.jInternalFrameImportacionVentasLineas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentasLineas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentasLineas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasLineas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentasLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasLineas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentasLineas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasLineas.setResizable(true);
	    this.jInternalFrameImportacionVentasLineas.setClosable(true);
	    this.jInternalFrameImportacionVentasLineas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentasLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasLineas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentasLineas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasLineas.setResizable(true);
	    this.jInternalFrameImportacionVentasLineas.setClosable(true);
	    this.jInternalFrameImportacionVentasLineas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentasLineas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasLineas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasLineas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Lineases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentasLineas = new JLabelMe();

		this.jLabelArchivoImportacionVentasLineas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasLineas.add(this.jLabelArchivoImportacionVentasLineas, this.gridBagConstraintsVentasLineas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentasLineas = new JFileChooser();		
		this.jFileChooserImportacionVentasLineas.setToolTipText("ESCOGER ARCHIVO"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentasLineas = new JButtonMe();
		this.jButtonAbrirImportacionVentasLineas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentasLineas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentasLineas.setToolTipText("Generar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasLineas.add(this.jButtonAbrirImportacionVentasLineas, this.gridBagConstraintsVentasLineas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentasLineas = new JLabelMe();

		this.jLabelPathArchivoImportacionVentasLineas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasLineas.add(this.jLabelPathArchivoImportacionVentasLineas, this.gridBagConstraintsVentasLineas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentasLineas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentasLineas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasLineas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasLineas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasLineas.add(this.jTextFieldPathArchivoImportacionVentasLineas, this.gridBagConstraintsVentasLineas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentasLineas = new JButtonMe();
		this.jButtonGenerarImportacionVentasLineas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentasLineas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentasLineas.setToolTipText("Generar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasLineas.add(this.jButtonGenerarImportacionVentasLineas, this.gridBagConstraintsVentasLineas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentasLineas = new JButtonMe();
		this.jButtonCerrarImportacionVentasLineas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentasLineas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentasLineas.setToolTipText("Cancelar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasLineas.add(this.jButtonCerrarImportacionVentasLineas, this.gridBagConstraintsVentasLineas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentasLineas = new GridBagLayout();
		
		this.jScrollPanelImportacionVentasLineas= new JScrollPane(jPanelImportacionVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy =iPosYImportacion;
		this.gridBagConstraintsVentasLineas.gridx =iPosXImportacion;
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentasLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentasLineas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentasLineas);
		this.jInternalFrameImportacionVentasLineas.getContentPane().add(this.jScrollPanelImportacionVentasLineas, this.gridBagConstraintsVentasLineas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentasLineas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentasLineas = new JButtonMe();
			this.jButtonAbrirOrderByVentasLineas.setText("Orden");
			this.jButtonAbrirOrderByVentasLineas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasLineas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentasLineas";
			inputMap = this.jButtonAbrirOrderByVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentasLineas"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentasLineas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentasLineas.setName("jPanelOrderByVentasLineas"); 
			
			this.jPanelOrderByVentasLineas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasLineas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasLineas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentasLineas.setLayout(gridaBagLayoutOrderByVentasLineas);
			
			
			this.jTableDatosVentasLineasOrderBy = new JTableMe();        
			this.jTableDatosVentasLineasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentasLineasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentasLineasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentasLineasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentasLineasOrderBy.setViewportView(this.jTableDatosVentasLineasOrderBy);
			this.jTableDatosVentasLineasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentasLineasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentasLineas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentasLineas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentasLineas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentasLineas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentasLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentasLineas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentasLineas.setTitle("Orden");
			this.jInternalFrameOrderByVentasLineas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentasLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentasLineas.setResizable(true);
			this.jInternalFrameOrderByVentasLineas.setClosable(true);
			this.jInternalFrameOrderByVentasLineas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentasLineas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasLineas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasLineas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Lineases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentasLineas.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentasLineas.ipady =150;
				
			this.jPanelOrderByVentasLineas.add(jScrollPanelDatosVentasLineasOrderBy, this.gridBagConstraintsVentasLineas);//this.jTableDatosVentasLineasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentasLineas = new JButtonMe();
			this.jButtonCerrarOrderByVentasLineas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentasLineas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentasLineas.setToolTipText("Cancelar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentasLineas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentasLineas.add(this.jButtonCerrarOrderByVentasLineas, this.gridBagConstraintsVentasLineas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentasLineas = new GridBagLayout();
			
			this.jScrollPanelOrderByVentasLineas= new JScrollPane(jPanelOrderByVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentasLineas.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentasLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentasLineas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentasLineas);
			
			this.jInternalFrameOrderByVentasLineas.getContentPane().add(this.jScrollPanelOrderByVentasLineas, this.gridBagConstraintsVentasLineas);			
		
		} else {
			this.jButtonAbrirOrderByVentasLineas = new JButtonMe();
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
		int iWidthTableCalculado=0;//3030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ventaslineasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentasLineas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentasLineas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentasLineas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentasLineas.getRowHeight();//VentasLineasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentasLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasLineas.isSelected()) {
					iHeightTable=VentasLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentasLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasLineas.isSelected()) {
					iHeightTable=VentasLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentasLineas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasLineas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasLineas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentasLineas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasLineas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasLineas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentasLineas!=null && this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy()!=null) {
			//if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentasLineas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentasLineas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentasLineas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentasLineas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasLineas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasLineas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventaslineasLogic.getVentasLineass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventaslineass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentasLineas> TraerVentasLineasBeans(List<VentasLineas> ventaslineass,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentasLineas ventaslineas:ventaslineass) {
					
				if(!(VentasLineasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentasLineasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventaslineas.setsDetalleGeneralEntityReporte(VentasLineasConstantesFunciones.getVentasLineasDescripcion(ventaslineas));
										
						
					
						
					
				} else  {
							
					//ventaslineas.setsDetalleGeneralEntityReporte(ventaslineas.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventaslineasbeans.add(ventaslineasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventaslineass;
    }
	//PARA REPORTES FIN
}
