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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ExistenciasDisponiblesConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ExistenciasDisponiblesJInternalFrame extends ExistenciasDisponiblesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarExistenciasDisponibles;
	
	protected JMenuBar jmenuBarExistenciasDisponibles;
	
	protected JMenu jmenuExistenciasDisponibles;
	protected JMenu jmenuDatosExistenciasDisponibles;
	protected JMenu jmenuArchivoExistenciasDisponibles;
	protected JMenu jmenuAccionesExistenciasDisponibles;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutExistenciasDisponibles;	
	protected GridBagConstraints gridBagConstraintsExistenciasDisponibles;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ExistenciasDisponiblesDetalleFormJInternalFrame jInternalFrameDetalleFormExistenciasDisponibles;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoExistenciasDisponibles;	
	protected ImportacionJInternalFrame jInternalFrameImportacionExistenciasDisponibles;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ExistenciasDisponiblesSessionBean existenciasdisponiblesSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ExistenciasDisponibles> existenciasdisponibless;		
	public List<ExistenciasDisponibles> existenciasdisponiblessEliminados;	
	public List<ExistenciasDisponibles> existenciasdisponiblessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByExistenciasDisponibles;		
	protected JButton jButtonAbrirOrderByExistenciasDisponibles;
	
	
	//protected JPanel jPanelOrderByExistenciasDisponibles;
	//public JScrollPane jScrollPanelOrderByExistenciasDisponibles;	
	//protected JButton jButtonCerrarOrderByExistenciasDisponibles;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ExistenciasDisponiblesLogic existenciasdisponiblesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosExistenciasDisponibles;
	public JScrollPane jScrollPanelDatosEdicionExistenciasDisponibles;
	public JScrollPane jScrollPanelDatosGeneralExistenciasDisponibles;
    
	
	
	//public JScrollPane jScrollPanelDatosExistenciasDisponiblesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoExistenciasDisponibles;
	//public JScrollPane jScrollPanelImportacionExistenciasDisponibles;
	
	
	
	protected JPanel jPanelAccionesExistenciasDisponibles;
	
    protected JPanel jPanelPaginacionExistenciasDisponibles;
    protected JPanel jPanelParametrosReportesExistenciasDisponibles;
	protected JPanel jPanelParametrosReportesAccionesExistenciasDisponibles;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ExistenciasDisponibles;
	protected JPanel jPanelParametrosAuxiliar2ExistenciasDisponibles;
	protected JPanel jPanelParametrosAuxiliar3ExistenciasDisponibles;
	protected JPanel jPanelParametrosAuxiliar4ExistenciasDisponibles;
	//protected JPanel jPanelParametrosAuxiliar5ExistenciasDisponibles;
	
	
	
	//protected JPanel jPanelReporteDinamicoExistenciasDisponibles;
	//protected JPanel jPanelImportacionExistenciasDisponibles;
	
	
	public JTable jTableDatosExistenciasDisponibles;
	
	
	
	//public JTable jTableDatosExistenciasDisponiblesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoExistenciasDisponibles;
	protected JButton jButtonDuplicarExistenciasDisponibles;
	protected JButton jButtonCopiarExistenciasDisponibles;
	protected JButton jButtonVerFormExistenciasDisponibles;
	protected JButton jButtonNuevoRelacionesExistenciasDisponibles;
	protected JButton jButtonModificarExistenciasDisponibles;
	
    protected JButton jButtonGuardarCambiosTablaExistenciasDisponibles;
	protected JButton jButtonCerrarExistenciasDisponibles;
	
	
	protected JButton jButtonRecargarInformacionExistenciasDisponibles;
	protected JButton jButtonProcesarInformacionExistenciasDisponibles;
	
	
	protected JButton jButtonAnterioresExistenciasDisponibles;
	protected JButton jButtonSiguientesExistenciasDisponibles;
	protected JButton jButtonNuevoGuardarCambiosExistenciasDisponibles;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoExistenciasDisponibles;
	//protected JButton jButtonCerrarReporteDinamicoExistenciasDisponibles;
	//protected JButton jButtonGenerarExcelReporteDinamicoExistenciasDisponibles;	
	
	
	
	//protected JButton jButtonAbrirImportacionExistenciasDisponibles;
	//protected JButton jButtonGenerarImportacionExistenciasDisponibles;
	//protected JButton jButtonCerrarImportacionExistenciasDisponibles;
	//protected JFileChooser jFileChooserImportacionExistenciasDisponibles;
	//protected File fileImportacionExistenciasDisponibles;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarExistenciasDisponibles;
	protected JButton jButtonDuplicarToolBarExistenciasDisponibles;
	protected JButton jButtonNuevoRelacionesToolBarExistenciasDisponibles;
	
	
	public JButton jButtonGuardarCambiosToolBarExistenciasDisponibles;
	protected JButton jButtonCopiarToolBarExistenciasDisponibles;
	protected JButton jButtonVerFormToolBarExistenciasDisponibles;
	public JButton jButtonGuardarCambiosTablaToolBarExistenciasDisponibles;
	protected JButton jButtonMostrarOcultarTablaToolBarExistenciasDisponibles;
	protected JButton jButtonCerrarToolBarExistenciasDisponibles;
	
	protected JButton jButtonRecargarInformacionToolBarExistenciasDisponibles;
	protected JButton jButtonProcesarInformacionToolBarExistenciasDisponibles;
	protected JButton jButtonAnterioresToolBarExistenciasDisponibles;
	protected JButton jButtonSiguientesToolBarExistenciasDisponibles;
	protected JButton jButtonNuevoGuardarCambiosToolBarExistenciasDisponibles;
	protected JButton jButtonAbrirOrderByToolBarExistenciasDisponibles;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoExistenciasDisponibles;
	protected JMenuItem jMenuItemDuplicarExistenciasDisponibles;
	protected JMenuItem jMenuItemNuevoRelacionesExistenciasDisponibles;
	
	
	protected JMenuItem jMenuItemGuardarCambiosExistenciasDisponibles;
	protected JMenuItem jMenuItemCopiarExistenciasDisponibles;
	protected JMenuItem jMenuItemVerFormExistenciasDisponibles;
	protected JMenuItem jMenuItemGuardarCambiosTablaExistenciasDisponibles;
	protected JMenuItem jMenuItemCerrarExistenciasDisponibles;
	protected JMenuItem jMenuItemDetalleCerrarExistenciasDisponibles;
	protected JMenuItem jMenuItemDetalleAbrirOrderByExistenciasDisponibles;
	protected JMenuItem jMenuItemDetalleMostarOcultarExistenciasDisponibles;
	
	protected JMenuItem jMenuItemRecargarInformacionExistenciasDisponibles;
	protected JMenuItem jMenuItemProcesarInformacionExistenciasDisponibles;
	protected JMenuItem jMenuItemAnterioresExistenciasDisponibles;
	protected JMenuItem jMenuItemSiguientesExistenciasDisponibles;
	protected JMenuItem jMenuItemNuevoGuardarCambiosExistenciasDisponibles;
	protected JMenuItem jMenuItemAbrirOrderByExistenciasDisponibles;
	protected JMenuItem jMenuItemMostrarOcultarExistenciasDisponibles;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesExistenciasDisponibles;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosExistenciasDisponibles;
	protected JCheckBox jCheckBoxSeleccionadosExistenciasDisponibles;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaExistenciasDisponibles;
	protected JCheckBox jCheckBoxConGraficoReporteExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesExistenciasDisponibles;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarExistenciasDisponibles;
	protected JTextField jTextFieldValorCampoGeneralExistenciasDisponibles;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteExistenciasDisponibles;
	//public JList<Reporte> jListColumnasSelectReporteExistenciasDisponibles;
	//public JScrollPane jScrollColumnasSelectReporteExistenciasDisponibles;
	
	//public JLabel jLabelRelacionesSelectReporteExistenciasDisponibles;
	//public JList<Reporte> jListRelacionesSelectReporteExistenciasDisponibles;
	//public JScrollPane jScrollRelacionesSelectReporteExistenciasDisponibles;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoExistenciasDisponibles;
	//protected JCheckBox jCheckBoxConGraficoDinamicoExistenciasDisponibles;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoExistenciasDisponibles;
	//public JLabel jLabelTiposArchivoReporteDinamicoExistenciasDisponibles;
	
		
	//public JLabel jLabelArchivoImportacionExistenciasDisponibles;	
	//public JLabel jLabelPathArchivoImportacionExistenciasDisponibles;
	//protected JTextField jTextFieldPathArchivoImportacionExistenciasDisponibles;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoExistenciasDisponibles;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoExistenciasDisponibles;
	
	//public JLabel jLabelColumnaCategoriaValorExistenciasDisponibles;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorExistenciasDisponibles;
	
	//public JLabel jLabelColumnasValoresGraficoExistenciasDisponibles;
	//public JList<Reporte> jListColumnasValoresGraficoExistenciasDisponibles;
	//public JScrollPane jScrollColumnasValoresGraficoExistenciasDisponibles;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoExistenciasDisponibles;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoExistenciasDisponibles;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasExistenciasDisponibles;
	public JPanel jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JButton jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles;
	
	public JPanel jPanelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JLabel jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JButton jButtonid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JLabel jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JButton jButtonid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_productoBusquedaExistenciasDisponiblesExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaExistenciasDisponiblesExistenciasDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JLabel jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JButton jButtonid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_lineaBusquedaExistenciasDisponiblesExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaExistenciasDisponiblesExistenciasDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JLabel jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JButton jButtonid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JLabel jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JButton jButtonid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JLabel jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JButton jButtonid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JLabel jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles;
	public JButton jButtonfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponiblesBusqueda= new JButtonMe();

	
	
	
	
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
	public ExistenciasDisponiblesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasDisponiblesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasDisponiblesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasDisponiblesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionExistenciasDisponibles)	{
		this.jButtonRecargarInformacionExistenciasDisponibles = jButtonRecargarInformacionExistenciasDisponibles;
	}
	
	public JButton getjButtonProcesarInformacionExistenciasDisponibles() {
		return this.jButtonProcesarInformacionExistenciasDisponibles;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionExistenciasDisponibles)	{
		this.jButtonProcesarInformacionExistenciasDisponibles = jButtonProcesarInformacionExistenciasDisponibles;
	}
	
	
	public JButton getjButtonRecargarInformacionExistenciasDisponibles() {
		return this.jButtonRecargarInformacionExistenciasDisponibles;
	}
	
	
	public List<ExistenciasDisponibles> getexistenciasdisponibless() {
		return this.existenciasdisponibless;
	}

	public void setexistenciasdisponibless(List<ExistenciasDisponibles> existenciasdisponibless) {
		this.existenciasdisponibless = existenciasdisponibless;
	}
	
	public List<ExistenciasDisponibles> getexistenciasdisponiblessAux() {
		return this.existenciasdisponiblessAux;
	}

	public void setexistenciasdisponiblessAux(List<ExistenciasDisponibles> existenciasdisponiblessAux) {
		this.existenciasdisponiblessAux = existenciasdisponiblessAux;
	}
	
	public List<ExistenciasDisponibles> getexistenciasdisponiblessEliminados() {
		return this.existenciasdisponiblessEliminados;
	}

	public void setExistenciasDisponiblessEliminados(List<ExistenciasDisponibles> existenciasdisponiblessEliminados) {
		this.existenciasdisponiblessEliminados = existenciasdisponiblessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarExistenciasDisponibles() {
		return jComboBoxTiposSeleccionarExistenciasDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarExistenciasDisponibles(
			JComboBox jComboBoxTiposSeleccionarExistenciasDisponibles) {
		this.jComboBoxTiposSeleccionarExistenciasDisponibles = jComboBoxTiposSeleccionarExistenciasDisponibles;
	}
	
	public void setBorderResaltarTiposSeleccionarExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralExistenciasDisponibles() {
		return jTextFieldValorCampoGeneralExistenciasDisponibles;
	}

	public void setjTextFieldValorCampoGeneralExistenciasDisponibles(
			JTextField jTextFieldValorCampoGeneralExistenciasDisponibles) {
		this.jTextFieldValorCampoGeneralExistenciasDisponibles = jTextFieldValorCampoGeneralExistenciasDisponibles;
	}

	public void setBorderResaltarValorCampoGeneralExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralExistenciasDisponibles .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosExistenciasDisponibles() {
		return this.jCheckBoxSeleccionarTodosExistenciasDisponibles;
	}

	public void setjCheckBoxSeleccionarTodosExistenciasDisponibles(
			JCheckBox jCheckBoxSeleccionarTodosExistenciasDisponibles) {
		this.jCheckBoxSeleccionarTodosExistenciasDisponibles = jCheckBoxSeleccionarTodosExistenciasDisponibles;
	}

	public void setBorderResaltarSeleccionarTodosExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosExistenciasDisponibles() {
		return this.jCheckBoxSeleccionadosExistenciasDisponibles;
	}

	public void setjCheckBoxSeleccionadosExistenciasDisponibles(
			JCheckBox jCheckBoxSeleccionadosExistenciasDisponibles) {
		this.jCheckBoxSeleccionadosExistenciasDisponibles = jCheckBoxSeleccionadosExistenciasDisponibles;
	}
	
	public void setBorderResaltarSeleccionadosExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesExistenciasDisponibles() {
		return this.jComboBoxTiposArchivosReportesExistenciasDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesExistenciasDisponibles(
			JComboBox jComboBoxTiposArchivosReportesExistenciasDisponibles) {
		this.jComboBoxTiposArchivosReportesExistenciasDisponibles = jComboBoxTiposArchivosReportesExistenciasDisponibles;
	}

	public void setBorderResaltarTiposArchivosReportesExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesExistenciasDisponibles() {
		return this.jComboBoxTiposReportesExistenciasDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesExistenciasDisponibles(
			JComboBox jComboBoxTiposReportesExistenciasDisponibles) {
		this.jComboBoxTiposReportesExistenciasDisponibles = jComboBoxTiposReportesExistenciasDisponibles;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoExistenciasDisponibles() {
	//	return jComboBoxTiposReportesDinamicoExistenciasDisponibles;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoExistenciasDisponibles(
	//		JComboBox jComboBoxTiposReportesDinamicoExistenciasDisponibles) {
	//	this.jComboBoxTiposReportesDinamicoExistenciasDisponibles = jComboBoxTiposReportesDinamicoExistenciasDisponibles;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles() {
	//	return jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles) {
	//	this.jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles = jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles;
	//}
	
	public void setBorderResaltarTiposReportesExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesExistenciasDisponibles() {
		return this.jComboBoxTiposGraficosReportesExistenciasDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesExistenciasDisponibles(
			JComboBox jComboBoxTiposGraficosReportesExistenciasDisponibles) {
		this.jComboBoxTiposGraficosReportesExistenciasDisponibles = jComboBoxTiposGraficosReportesExistenciasDisponibles;
	}
	
	public void setBorderResaltarTiposGraficosReportesExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionExistenciasDisponibles() {
		return this.jComboBoxTiposPaginacionExistenciasDisponibles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionExistenciasDisponibles(
			JComboBox jComboBoxTiposPaginacionExistenciasDisponibles) {
		this.jComboBoxTiposPaginacionExistenciasDisponibles = jComboBoxTiposPaginacionExistenciasDisponibles;
	}
	
	public void setBorderResaltarTiposPaginacionExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesExistenciasDisponibles() {
		return this.jComboBoxTiposRelacionesExistenciasDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesExistenciasDisponibles() {
		return this.jComboBoxTiposAccionesExistenciasDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesExistenciasDisponibles(
			JComboBox jComboBoxTiposRelacionesExistenciasDisponibles) {
		this.jComboBoxTiposRelacionesExistenciasDisponibles = jComboBoxTiposRelacionesExistenciasDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesExistenciasDisponibles(
			JComboBox jComboBoxTiposAccionesExistenciasDisponibles) {
		this.jComboBoxTiposAccionesExistenciasDisponibles = jComboBoxTiposAccionesExistenciasDisponibles;
	}
	
	public void setBorderResaltarTiposRelacionesExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesExistenciasDisponibles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesExistenciasDisponibles .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoExistenciasDisponibles() {
	//	return jCheckBoxConGraficoDinamicoExistenciasDisponibles;
	//}

	//public void setjCheckBoxConGraficoDinamicoExistenciasDisponibles(
	//		JCheckBox jCheckBoxConGraficoDinamicoExistenciasDisponibles) {
	//	this.jCheckBoxConGraficoDinamicoExistenciasDisponibles = jCheckBoxConGraficoDinamicoExistenciasDisponibles;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoExistenciasDisponibles() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarExistenciasDisponibles.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoExistenciasDisponibles .setBorder(borderResaltar);		
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
		this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
		
		this.existenciasdisponiblesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.existenciasdisponiblesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ExistenciasDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ExistenciasDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ExistenciasDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ExistenciasDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ExistenciasDisponiblesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Existencias Disponibles MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
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
		
		ExistenciasDisponiblesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarExistenciasDisponibles= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"nuevo","nuevo","Nuevo"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"duplicar","duplicar","Duplicar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"copiar","copiar","Copiar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"ver_form","ver_form","Ver"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"recargar","recargar","Buscar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,
							"cerrar","cerrar","Salir"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarExistenciasDisponibles=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarExistenciasDisponibles;
			
				this.jButtonProcesarInformacionToolBarExistenciasDisponibles=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarExistenciasDisponibles;
				
		//protected JButton jButtonModificarToolBarExistenciasDisponibles;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarExistenciasDisponibles=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuExistenciasDisponibles=new JMenuMe("General");
		this.jmenuArchivoExistenciasDisponibles=new JMenuMe("Archivo");
		this.jmenuAccionesExistenciasDisponibles=new JMenuMe("Acciones");
		this.jmenuDatosExistenciasDisponibles=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoExistenciasDisponibles= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoExistenciasDisponibles.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoExistenciasDisponibles,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarExistenciasDisponibles= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarExistenciasDisponibles.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarExistenciasDisponibles,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesExistenciasDisponibles= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesExistenciasDisponibles.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesExistenciasDisponibles,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosExistenciasDisponibles= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosExistenciasDisponibles.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosExistenciasDisponibles,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarExistenciasDisponibles= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarExistenciasDisponibles.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarExistenciasDisponibles,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormExistenciasDisponibles= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormExistenciasDisponibles.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormExistenciasDisponibles,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaExistenciasDisponibles= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaExistenciasDisponibles.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaExistenciasDisponibles,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarExistenciasDisponibles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarExistenciasDisponibles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarExistenciasDisponibles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionExistenciasDisponibles= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionExistenciasDisponibles.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionExistenciasDisponibles,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionExistenciasDisponibles= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionExistenciasDisponibles.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionExistenciasDisponibles,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresExistenciasDisponibles= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresExistenciasDisponibles.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresExistenciasDisponibles,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesExistenciasDisponibles= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesExistenciasDisponibles.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesExistenciasDisponibles,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByExistenciasDisponibles= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByExistenciasDisponibles.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByExistenciasDisponibles,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarExistenciasDisponibles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarExistenciasDisponibles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarExistenciasDisponibles,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByExistenciasDisponibles= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByExistenciasDisponibles.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByExistenciasDisponibles,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarExistenciasDisponibles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarExistenciasDisponibles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarExistenciasDisponibles,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosExistenciasDisponibles= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosExistenciasDisponibles.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosExistenciasDisponibles,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoExistenciasDisponibles.add(this.jMenuItemCerrarExistenciasDisponibles);
			
			this.jmenuAccionesExistenciasDisponibles.add(this.jMenuItemNuevoExistenciasDisponibles);
			this.jmenuAccionesExistenciasDisponibles.add(this.jMenuItemNuevoGuardarCambiosExistenciasDisponibles);
			this.jmenuAccionesExistenciasDisponibles.add(this.jMenuItemNuevoRelacionesExistenciasDisponibles);
			this.jmenuAccionesExistenciasDisponibles.add(this.jMenuItemGuardarCambiosTablaExistenciasDisponibles);		
			this.jmenuAccionesExistenciasDisponibles.add(this.jMenuItemDuplicarExistenciasDisponibles);		
			this.jmenuAccionesExistenciasDisponibles.add(this.jMenuItemCopiarExistenciasDisponibles);		
			this.jmenuAccionesExistenciasDisponibles.add(this.jMenuItemVerFormExistenciasDisponibles);		
			
			this.jmenuDatosExistenciasDisponibles.add(this.jMenuItemRecargarInformacionExistenciasDisponibles);				
			this.jmenuDatosExistenciasDisponibles.add(this.jMenuItemAnterioresExistenciasDisponibles);				
			this.jmenuDatosExistenciasDisponibles.add(this.jMenuItemSiguientesExistenciasDisponibles);				
			this.jmenuDatosExistenciasDisponibles.add(this.jMenuItemAbrirOrderByExistenciasDisponibles);				
			this.jmenuDatosExistenciasDisponibles.add(this.jMenuItemMostrarOcultarExistenciasDisponibles);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesExistenciasDisponibles.add(this.jMenuItemGuardarCambiosExistenciasDisponibles);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarExistenciasDisponibles.add(this.jmenuArchivoExistenciasDisponibles);		
			this.jmenuBarExistenciasDisponibles.add(this.jmenuAccionesExistenciasDisponibles);		
			this.jmenuBarExistenciasDisponibles.add(this.jmenuDatosExistenciasDisponibles);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarExistenciasDisponibles);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasExistenciasDisponibles() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		this.jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles= new JButtonMe();
		this.jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles.setText("Buscar");
		this.jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles = new JLabelMe();
		jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setText("Bodega :");
		jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles = new JLabelMe();
		jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setText("Producto :");
		jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Producto");
		jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles = new JLabelMe();
		jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setText("Linea :");
		jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Linea");
		jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles = new JLabelMe();
		jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles = new JLabelMe();
		jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles = new JLabelMe();
		jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles = new JLabelMe();
		jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setText("Fecha Ultima Venta Hasta :");
		jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setToolTipText("Fecha Ultima Venta Hasta");
		jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasExistenciasDisponibles=new JTabbedPane();


		this.jTabbedPaneBusquedasExistenciasDisponibles.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasExistenciasDisponibles.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasExistenciasDisponibles.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasExistenciasDisponibles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleExistenciasDisponibles = new ExistenciasDisponiblesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Existencias Disponibles DATOS");
			this.jInternalFrameDetalleFormExistenciasDisponibles = new ExistenciasDisponiblesDetalleFormJInternalFrame(jDesktopPane,this.existenciasdisponiblesSessionBean.getConGuardarRelaciones(),this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormExistenciasDisponibles = null;//new ExistenciasDisponiblesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutExistenciasDisponibles= new GridBagLayout();
		
		
		this.jTableDatosExistenciasDisponibles = new JTableMe();      
		
		String sToolTipExistenciasDisponibles="";
		sToolTipExistenciasDisponibles=ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipExistenciasDisponibles+="(Inventario.ExistenciasDisponibles)";
		}
		
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			sToolTipExistenciasDisponibles+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosExistenciasDisponibles.setToolTipText(sToolTipExistenciasDisponibles);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosExistenciasDisponibles);
		this.jTableDatosExistenciasDisponibles.setAutoCreateRowSorter(true);
		this.jTableDatosExistenciasDisponibles.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosExistenciasDisponibles.setRowSelectionAllowed(true);
		this.jTableDatosExistenciasDisponibles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoExistenciasDisponibles = new JButtonMe();
		this.jButtonDuplicarExistenciasDisponibles = new JButtonMe();
		this.jButtonCopiarExistenciasDisponibles = new JButtonMe();
		this.jButtonVerFormExistenciasDisponibles = new JButtonMe();
		this.jButtonNuevoRelacionesExistenciasDisponibles = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaExistenciasDisponibles = new JButtonMe();
		this.jButtonCerrarExistenciasDisponibles = new JButtonMe();
		
		this.jScrollPanelDatosExistenciasDisponibles = new JScrollPane();   
        this.jScrollPanelDatosGeneralExistenciasDisponibles = new JScrollPane();
		
				
		
		
		this.jPanelAccionesExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Existencias Disponibles";
		
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Disponibleses" + this.sPath));
		} else {
			this.jScrollPanelDatosExistenciasDisponibles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesExistenciasDisponibles.setToolTipText("Acciones");
        this.jPanelAccionesExistenciasDisponibles.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoExistenciasDisponibles=new ReporteDinamicoJInternalFrame(ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoExistenciasDisponibles();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionExistenciasDisponibles=new ImportacionJInternalFrame(ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionExistenciasDisponibles();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByExistenciasDisponibles = new JButtonMe();
		
		this.jButtonAbrirOrderByExistenciasDisponibles.setText("Orden");
		this.jButtonAbrirOrderByExistenciasDisponibles.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByExistenciasDisponibles,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByExistenciasDisponibles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByExistenciasDisponibles,false,this);
			
			//this.cargarOrderByExistenciasDisponibles(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByExistenciasDisponibles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByExistenciasDisponibles,true,this);
			
			//this.cargarOrderByExistenciasDisponibles(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosExistenciasDisponibles.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosExistenciasDisponibles.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosExistenciasDisponibles.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosExistenciasDisponibles.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosExistenciasDisponibles.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosExistenciasDisponibles.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoExistenciasDisponibles.setText("Nuevo");
		this.jButtonDuplicarExistenciasDisponibles.setText("Duplicar");
		this.jButtonCopiarExistenciasDisponibles.setText("Copiar");
		this.jButtonVerFormExistenciasDisponibles.setText("Ver");
		this.jButtonNuevoRelacionesExistenciasDisponibles.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.setText("Guardar");
		this.jButtonCerrarExistenciasDisponibles.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoExistenciasDisponibles,"nuevo_button","Nuevo",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarExistenciasDisponibles,"duplicar_button","Duplicar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarExistenciasDisponibles,"copiar_button","Copiar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormExistenciasDisponibles,"ver_form","Ver",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesExistenciasDisponibles,"nuevorelaciones_button","Nuevo Rel",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaExistenciasDisponibles,"guardarcambiostabla_button","Guardar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarExistenciasDisponibles,"cerrar_button","Salir",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoExistenciasDisponibles.setToolTipText("Nuevo"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarExistenciasDisponibles.setToolTipText("Duplicar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarExistenciasDisponibles.setToolTipText("Copiar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormExistenciasDisponibles.setToolTipText("Ver"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesExistenciasDisponibles.setToolTipText("Nuevo Rel"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.setToolTipText("Guardar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarExistenciasDisponibles.setToolTipText("Salir"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoExistenciasDisponibles";
		inputMap = this.jButtonNuevoExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoExistenciasDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoExistenciasDisponibles"));
		
		//DUPLICAR
		sMapKey = "DuplicarExistenciasDisponibles";
		inputMap = this.jButtonDuplicarExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarExistenciasDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarExistenciasDisponibles"));
		
		//COPIAR
		sMapKey = "CopiarExistenciasDisponibles";
		inputMap = this.jButtonCopiarExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarExistenciasDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarExistenciasDisponibles"));
		
		//VEr FORM
		sMapKey = "VerFormExistenciasDisponibles";
		inputMap = this.jButtonVerFormExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormExistenciasDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormExistenciasDisponibles"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesExistenciasDisponibles";
		inputMap = this.jButtonNuevoRelacionesExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesExistenciasDisponibles"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarExistenciasDisponibles";
		inputMap = this.jButtonModificarExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarExistenciasDisponibles"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarExistenciasDisponibles";
		inputMap = this.jButtonCerrarExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarExistenciasDisponibles"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaExistenciasDisponibles";
		inputMap = this.jButtonGuardarCambiosTablaExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaExistenciasDisponibles"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ExistenciasDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ExistenciasDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ExistenciasDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ExistenciasDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ExistenciasDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesExistenciasDisponibles.setName("jPanelParametrosReportesExistenciasDisponibles"); 
		
		this.jPanelParametrosReportesAccionesExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesExistenciasDisponibles.setName("jPanelParametrosReportesAccionesExistenciasDisponibles"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionExistenciasDisponibles = new JButtonMe();
		this.jButtonRecargarInformacionExistenciasDisponibles.setText("Buscar");
		this.jButtonRecargarInformacionExistenciasDisponibles.setToolTipText("Buscar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionExistenciasDisponibles,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionExistenciasDisponibles.setVisible(false);
		
		
		this.jButtonProcesarInformacionExistenciasDisponibles = new JButtonMe();
		this.jButtonProcesarInformacionExistenciasDisponibles.setText("Procesar");
		this.jButtonProcesarInformacionExistenciasDisponibles.setToolTipText("Procesar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionExistenciasDisponibles.setVisible(false);
			
		this.jButtonProcesarInformacionExistenciasDisponibles.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionExistenciasDisponibles.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionExistenciasDisponibles.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesExistenciasDisponibles.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesExistenciasDisponibles.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesExistenciasDisponibles.setText("TIPO");       
		this.jComboBoxTiposReportesExistenciasDisponibles.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesExistenciasDisponibles.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesExistenciasDisponibles.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionExistenciasDisponibles.setText("Paginacion");
		this.jComboBoxTiposPaginacionExistenciasDisponibles.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesExistenciasDisponibles.setText("Accion");
		this.jComboBoxTiposRelacionesExistenciasDisponibles.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesExistenciasDisponibles.setText("Accion");
		this.jComboBoxTiposAccionesExistenciasDisponibles.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarExistenciasDisponibles.setText("Accion");
		this.jComboBoxTiposSeleccionarExistenciasDisponibles.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralExistenciasDisponibles=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralExistenciasDisponibles.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralExistenciasDisponibles.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralExistenciasDisponibles.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesExistenciasDisponibles = new JLabelMe();
		
		this.jLabelAccionesExistenciasDisponibles.setText("Acciones");		
		this.jLabelAccionesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosExistenciasDisponibles = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosExistenciasDisponibles.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosExistenciasDisponibles.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosExistenciasDisponibles = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosExistenciasDisponibles.setText("Seleccionados");
		this.jCheckBoxSeleccionadosExistenciasDisponibles.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteExistenciasDisponibles = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteExistenciasDisponibles.setText("Graf.");
		this.jCheckBoxConGraficoReporteExistenciasDisponibles.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresExistenciasDisponibles = new JButtonMe();
		//this.jButtonAnterioresExistenciasDisponibles.setText("<<");
        this.jButtonAnterioresExistenciasDisponibles.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresExistenciasDisponibles,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesExistenciasDisponibles = new JButtonMe();
		//this.jButtonSiguientesExistenciasDisponibles.setText(">>");
        this.jButtonSiguientesExistenciasDisponibles.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesExistenciasDisponibles,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosExistenciasDisponibles = new JButtonMe();
		this.jButtonNuevoGuardarCambiosExistenciasDisponibles.setText("Nue");
        this.jButtonNuevoGuardarCambiosExistenciasDisponibles.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosExistenciasDisponibles,"nuevoguardarcambios_button","Nue",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosExistenciasDisponibles";
		inputMap = this.jButtonNuevoGuardarCambiosExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosExistenciasDisponibles"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionExistenciasDisponibles";
		inputMap = this.jButtonRecargarInformacionExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionExistenciasDisponibles"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesExistenciasDisponibles";
		inputMap = this.jButtonSiguientesExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesExistenciasDisponibles"));
		
		//ANTERIORES		
		sMapKey = "AnterioresExistenciasDisponibles";
		inputMap = this.jButtonAnterioresExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresExistenciasDisponibles"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasExistenciasDisponibles();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesExistenciasDisponibles.setMinimumSize(new Dimension(this.getWidth(),ExistenciasDisponiblesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ExistenciasDisponiblesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesExistenciasDisponibles.setMaximumSize(new Dimension(this.getWidth(),ExistenciasDisponiblesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ExistenciasDisponiblesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesExistenciasDisponibles.setPreferredSize(new Dimension(this.getWidth(),ExistenciasDisponiblesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ExistenciasDisponiblesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionExistenciasDisponibles = new GridBagLayout();

			this.jPanelPaginacionExistenciasDisponibles.setLayout(gridaBagLayoutPaginacionExistenciasDisponibles);						
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonAnterioresExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
					
						
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
			
			this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonNuevoGuardarCambiosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
						
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
			this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonSiguientesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 1;
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonNuevoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
						
			
			
			if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
				this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsExistenciasDisponibles.gridy = 1;
				this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonGuardarCambiosTablaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			}
			
			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 1;
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonDuplicarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 1;
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonCopiarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 1;
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonVerFormExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 1;
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionExistenciasDisponibles.add(this.jButtonCerrarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		
		
		this.jButtonRecargarInformacionExistenciasDisponibles.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionExistenciasDisponibles.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionExistenciasDisponibles.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesExistenciasDisponibles.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesExistenciasDisponibles.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesExistenciasDisponibles.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesExistenciasDisponibles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesExistenciasDisponibles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesExistenciasDisponibles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesExistenciasDisponibles.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesExistenciasDisponibles.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesExistenciasDisponibles.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionExistenciasDisponibles.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionExistenciasDisponibles.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionExistenciasDisponibles.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesExistenciasDisponibles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesExistenciasDisponibles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesExistenciasDisponibles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesExistenciasDisponibles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesExistenciasDisponibles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesExistenciasDisponibles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarExistenciasDisponibles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarExistenciasDisponibles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarExistenciasDisponibles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteExistenciasDisponibles.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteExistenciasDisponibles.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteExistenciasDisponibles.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosExistenciasDisponibles.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosExistenciasDisponibles.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosExistenciasDisponibles.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosExistenciasDisponibles.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosExistenciasDisponibles.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosExistenciasDisponibles.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesExistenciasDisponibles = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesExistenciasDisponibles = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ExistenciasDisponibles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ExistenciasDisponibles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ExistenciasDisponibles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ExistenciasDisponibles = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesExistenciasDisponibles.setLayout(gridaBagParametrosReportesExistenciasDisponibles);
			this.jPanelParametrosReportesAccionesExistenciasDisponibles.setLayout(gridaBagParametrosReportesAccionesExistenciasDisponibles);
			
			
			this.jPanelParametrosAuxiliar1ExistenciasDisponibles.setLayout(gridaBagParametrosAuxiliar1ExistenciasDisponibles);
			this.jPanelParametrosAuxiliar2ExistenciasDisponibles.setLayout(gridaBagParametrosAuxiliar2ExistenciasDisponibles);
			this.jPanelParametrosAuxiliar3ExistenciasDisponibles.setLayout(gridaBagParametrosAuxiliar3ExistenciasDisponibles);
			this.jPanelParametrosAuxiliar4ExistenciasDisponibles.setLayout(gridaBagParametrosAuxiliar4ExistenciasDisponibles);
			//this.jPanelParametrosAuxiliar5ExistenciasDisponibles.setLayout(gridaBagParametrosAuxiliar2ExistenciasDisponibles);			
			
			
			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jButtonRecargarInformacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ExistenciasDisponibles.add(this.jComboBoxTiposPaginacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ExistenciasDisponibles.add(this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ExistenciasDisponibles.add(this.jComboBoxTiposArchivosReportesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jPanelParametrosAuxiliar1ExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ExistenciasDisponibles.add(this.jComboBoxTiposReportesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);																		
			
			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ExistenciasDisponibles.add(this.jComboBoxTiposGraficosReportesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jPanelParametrosAuxiliar4ExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jComboBoxTiposReportesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jCheckBoxGenerarReporteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jPanelParametrosAuxiliar2ExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jLabelAccionesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
				this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesExistenciasDisponibles.add(this.jButtonAbrirOrderByExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jComboBoxTiposSeleccionarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);			
			
			
			/*
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jCheckBoxSeleccionarTodosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jCheckBoxConGraficoReporteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ExistenciasDisponibles.add(this.jCheckBoxSeleccionarTodosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);															
				
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ExistenciasDisponibles.add(this.jCheckBoxSeleccionadosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);															
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ExistenciasDisponibles.add(this.jCheckBoxConGraficoReporteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jPanelParametrosAuxiliar3ExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesExistenciasDisponibles.add(this.jComboBoxTiposAccionesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosExistenciasDisponibles = new GridBagLayout();

			this.jScrollPanelDatosExistenciasDisponibles.setLayout(gridaBagLayoutDatosExistenciasDisponibles);
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
			this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
			
			this.jScrollPanelDatosExistenciasDisponibles.add(this.jTableDatosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosExistenciasDisponibles.setViewportView(this.jTableDatosExistenciasDisponibles);
		this.jTableDatosExistenciasDisponibles.setFillsViewportHeight(true);
		this.jTableDatosExistenciasDisponibles.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesExistenciasDisponibles= new GridBagLayout();
		this.jPanelAccionesExistenciasDisponibles.setLayout(gridaBagLayoutAccionesExistenciasDisponibles);
		
		
		/*	
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
			
		this.jPanelAccionesExistenciasDisponibles.add(this.jButtonNuevoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaExistenciasDisponiblesExistenciasDisponibles= new GridBagLayout();
		gridaBagLayoutBusquedaExistenciasDisponiblesExistenciasDisponibles.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaExistenciasDisponiblesExistenciasDisponibles.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaExistenciasDisponiblesExistenciasDisponibles.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaExistenciasDisponiblesExistenciasDisponibles.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.setLayout(gridaBagLayoutBusquedaExistenciasDisponiblesExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 0;
		gridBagConstraintsExistenciasDisponibles.gridx = 0;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jLabelid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 0;
		gridBagConstraintsExistenciasDisponibles.gridx = 1;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);


		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 1;
		gridBagConstraintsExistenciasDisponibles.gridx = 0;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jLabelid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 1;
		gridBagConstraintsExistenciasDisponibles.gridx = 1;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);


		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 2;
		gridBagConstraintsExistenciasDisponibles.gridx = 0;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jLabelid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 2;
		gridBagConstraintsExistenciasDisponibles.gridx = 1;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);


		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 3;
		gridBagConstraintsExistenciasDisponibles.gridx = 0;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jLabelid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 3;
		gridBagConstraintsExistenciasDisponibles.gridx = 1;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);


		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 4;
		gridBagConstraintsExistenciasDisponibles.gridx = 0;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jLabelid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 4;
		gridBagConstraintsExistenciasDisponibles.gridx = 1;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);


		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 5;
		gridBagConstraintsExistenciasDisponibles.gridx = 0;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jLabelid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 5;
		gridBagConstraintsExistenciasDisponibles.gridx = 1;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);


		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 6;
		gridBagConstraintsExistenciasDisponibles.gridx = 0;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jLabelfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 6;
		gridBagConstraintsExistenciasDisponibles.gridx = 1;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasDisponibles.gridy = 7;
		gridBagConstraintsExistenciasDisponibles.gridx =1;
		jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles.add(jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);

		jTabbedPaneBusquedasExistenciasDisponibles.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ", jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);
		jTabbedPaneBusquedasExistenciasDisponibles.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutExistenciasDisponibles);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();						
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsExistenciasDisponibles.gridx = 0;		
			//this.gridBagConstraintsExistenciasDisponibles.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsExistenciasDisponibles.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;		
		//this.gridBagConstraintsExistenciasDisponibles.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsExistenciasDisponibles);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsExistenciasDisponibles.gridx = 0;		
			this.gridBagConstraintsExistenciasDisponibles.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsExistenciasDisponibles.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);								
		
		
		/*
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		*/		
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy =iGridyPrincipal++;
		this.gridBagConstraintsExistenciasDisponibles.gridx =0;
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsExistenciasDisponibles.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
				
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosExistenciasDisponibles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosExistenciasDisponibles = new GridBagLayout();
			this.jPanelBusquedasParametrosExistenciasDisponibles.setLayout(gridaBagLayoutBusquedasParametrosExistenciasDisponibles);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralExistenciasDisponibles=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralExistenciasDisponibles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralExistenciasDisponibles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralExistenciasDisponibles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			
			
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
			
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralExistenciasDisponibles;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoExistenciasDisponibles() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoExistenciasDisponibles = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoExistenciasDisponibles.setName("jPanelReporteDinamicoExistenciasDisponibles"); 
		
		this.jPanelReporteDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoExistenciasDisponibles.setLayout(gridaBagLayoutReporteDinamicoExistenciasDisponibles);
		
		
		this.jInternalFrameReporteDinamicoExistenciasDisponibles= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoExistenciasDisponibles = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteExistenciasDisponibles= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoExistenciasDisponibles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoExistenciasDisponibles.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoExistenciasDisponibles.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoExistenciasDisponibles.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoExistenciasDisponibles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoExistenciasDisponibles.setResizable(true);
	    this.jInternalFrameReporteDinamicoExistenciasDisponibles.setClosable(true);
	    this.jInternalFrameReporteDinamicoExistenciasDisponibles.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Disponibleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteExistenciasDisponibles = new JLabelMe();

		this.jLabelColumnasSelectReporteExistenciasDisponibles.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jLabelColumnasSelectReporteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteExistenciasDisponibles = new JList<Reporte>();
		this.jListColumnasSelectReporteExistenciasDisponibles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteExistenciasDisponibles.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteExistenciasDisponibles.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteExistenciasDisponibles.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteExistenciasDisponibles.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteExistenciasDisponibles=new JScrollPane(this.jListColumnasSelectReporteExistenciasDisponibles);
			
			this.jScrollColumnasSelectReporteExistenciasDisponibles.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteExistenciasDisponibles.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteExistenciasDisponibles.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jListColumnasSelectReporteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jScrollColumnasSelectReporteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteExistenciasDisponibles = new JLabelMe();

		this.jLabelRelacionesSelectReporteExistenciasDisponibles.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteExistenciasDisponibles = new JList<Reporte>();
		this.jListRelacionesSelectReporteExistenciasDisponibles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteExistenciasDisponibles.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteExistenciasDisponibles.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteExistenciasDisponibles.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteExistenciasDisponibles.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteExistenciasDisponibles=new JScrollPane(this.jListRelacionesSelectReporteExistenciasDisponibles);
			
			this.jScrollRelacionesSelectReporteExistenciasDisponibles.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteExistenciasDisponibles.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteExistenciasDisponibles.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoExistenciasDisponibles = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles = new JComboBoxMe();
		this.jListColumnasValoresGraficoExistenciasDisponibles = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoExistenciasDisponibles = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoExistenciasDisponibles.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoExistenciasDisponibles = new JLabelMe();

		this.jLabelConGraficoDinamicoExistenciasDisponibles.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jLabelConGraficoDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoExistenciasDisponibles = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoExistenciasDisponibles.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoExistenciasDisponibles.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jCheckBoxConGraficoDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoExistenciasDisponibles = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoExistenciasDisponibles.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jLabelColumnaCategoriaGraficoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorExistenciasDisponibles = new JLabelMe();

		this.jLabelColumnaCategoriaValorExistenciasDisponibles.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jLabelColumnaCategoriaValorExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorExistenciasDisponibles.setText("Accion");
        this.jComboBoxColumnaCategoriaValorExistenciasDisponibles.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorExistenciasDisponibles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorExistenciasDisponibles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorExistenciasDisponibles.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jComboBoxColumnaCategoriaValorExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoExistenciasDisponibles = new JLabelMe();

		this.jLabelColumnasValoresGraficoExistenciasDisponibles.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jLabelColumnasValoresGraficoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoExistenciasDisponibles = new JList<Reporte>();
		this.jListColumnasValoresGraficoExistenciasDisponibles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoExistenciasDisponibles.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoExistenciasDisponibles.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoExistenciasDisponibles.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoExistenciasDisponibles.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoExistenciasDisponibles=new JScrollPane(this.jListColumnasValoresGraficoExistenciasDisponibles);
			
			this.jScrollColumnasValoresGraficoExistenciasDisponibles.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoExistenciasDisponibles.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoExistenciasDisponibles.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jListColumnasSelectReporteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jScrollColumnasValoresGraficoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoExistenciasDisponibles = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoExistenciasDisponibles.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jLabelTiposGraficosReportesDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoExistenciasDisponibles.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoExistenciasDisponibles.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jComboBoxTiposGraficosReportesDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoExistenciasDisponibles = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoExistenciasDisponibles.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jLabelGenerarExcelReporteDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoExistenciasDisponibles = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoExistenciasDisponibles.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoExistenciasDisponibles,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoExistenciasDisponibles.setToolTipText("Generar EXCEL"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jButtonGenerarExcelReporteDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jComboBoxTiposReportesDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoExistenciasDisponibles = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoExistenciasDisponibles.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jLabelTiposArchivoReporteDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jComboBoxTiposArchivosReportesDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoExistenciasDisponibles = new JButtonMe();
		this.jButtonGenerarReporteDinamicoExistenciasDisponibles.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoExistenciasDisponibles,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoExistenciasDisponibles.setToolTipText("Generar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jButtonGenerarReporteDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoExistenciasDisponibles = new JButtonMe();
		this.jButtonCerrarReporteDinamicoExistenciasDisponibles.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoExistenciasDisponibles,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoExistenciasDisponibles.setToolTipText("Cancelar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoExistenciasDisponibles.add(this.jButtonCerrarReporteDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalExistenciasDisponibles = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoExistenciasDisponibles= new JScrollPane(jPanelReporteDinamicoExistenciasDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoExistenciasDisponibles.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoExistenciasDisponibles.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoExistenciasDisponibles.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Disponibleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasDisponibles.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoExistenciasDisponibles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoExistenciasDisponibles.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalExistenciasDisponibles);
		this.jInternalFrameReporteDinamicoExistenciasDisponibles.getContentPane().add(this.jScrollPanelReporteDinamicoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionExistenciasDisponibles() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionExistenciasDisponibles = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionExistenciasDisponibles.setName("jPanelImportacionExistenciasDisponibles"); 
		
		this.jPanelImportacionExistenciasDisponibles.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionExistenciasDisponibles.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionExistenciasDisponibles.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionExistenciasDisponibles.setLayout(gridaBagLayoutImportacionExistenciasDisponibles);
		
		
		this.jInternalFrameImportacionExistenciasDisponibles= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionExistenciasDisponibles= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionExistenciasDisponibles = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteExistenciasDisponibles= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionExistenciasDisponibles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionExistenciasDisponibles.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionExistenciasDisponibles.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionExistenciasDisponibles.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionExistenciasDisponibles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionExistenciasDisponibles.setResizable(true);
	    this.jInternalFrameImportacionExistenciasDisponibles.setClosable(true);
	    this.jInternalFrameImportacionExistenciasDisponibles.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionExistenciasDisponibles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionExistenciasDisponibles.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionExistenciasDisponibles.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionExistenciasDisponibles.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionExistenciasDisponibles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionExistenciasDisponibles.setResizable(true);
	    this.jInternalFrameImportacionExistenciasDisponibles.setClosable(true);
	    this.jInternalFrameImportacionExistenciasDisponibles.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionExistenciasDisponibles.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionExistenciasDisponibles.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionExistenciasDisponibles.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Disponibleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionExistenciasDisponibles = new JLabelMe();

		this.jLabelArchivoImportacionExistenciasDisponibles.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYImportacion;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXImportacion++;
			
		this.jPanelImportacionExistenciasDisponibles.add(this.jLabelArchivoImportacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionExistenciasDisponibles = new JFileChooser();		
		this.jFileChooserImportacionExistenciasDisponibles.setToolTipText("ESCOGER ARCHIVO"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionExistenciasDisponibles = new JButtonMe();
		this.jButtonAbrirImportacionExistenciasDisponibles.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionExistenciasDisponibles,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionExistenciasDisponibles.setToolTipText("Generar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYImportacion;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionExistenciasDisponibles.add(this.jButtonAbrirImportacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionExistenciasDisponibles = new JLabelMe();

		this.jLabelPathArchivoImportacionExistenciasDisponibles.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYImportacion;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXImportacion++;
			
		this.jPanelImportacionExistenciasDisponibles.add(this.jLabelPathArchivoImportacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionExistenciasDisponibles=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionExistenciasDisponibles.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionExistenciasDisponibles.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionExistenciasDisponibles.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYImportacion;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionExistenciasDisponibles.add(this.jTextFieldPathArchivoImportacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionExistenciasDisponibles = new JButtonMe();
		this.jButtonGenerarImportacionExistenciasDisponibles.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionExistenciasDisponibles,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionExistenciasDisponibles.setToolTipText("Generar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYImportacion;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionExistenciasDisponibles.add(this.jButtonGenerarImportacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionExistenciasDisponibles = new JButtonMe();
		this.jButtonCerrarImportacionExistenciasDisponibles.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionExistenciasDisponibles,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionExistenciasDisponibles.setToolTipText("Cancelar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYImportacion;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionExistenciasDisponibles.add(this.jButtonCerrarImportacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalExistenciasDisponibles = new GridBagLayout();
		
		this.jScrollPanelImportacionExistenciasDisponibles= new JScrollPane(jPanelImportacionExistenciasDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy =iPosYImportacion;
		this.gridBagConstraintsExistenciasDisponibles.gridx =iPosXImportacion;
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionExistenciasDisponibles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionExistenciasDisponibles.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalExistenciasDisponibles);
		this.jInternalFrameImportacionExistenciasDisponibles.getContentPane().add(this.jScrollPanelImportacionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByExistenciasDisponibles(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByExistenciasDisponibles = new JButtonMe();
			this.jButtonAbrirOrderByExistenciasDisponibles.setText("Orden");
			this.jButtonAbrirOrderByExistenciasDisponibles.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByExistenciasDisponibles,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByExistenciasDisponibles";
			inputMap = this.jButtonAbrirOrderByExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByExistenciasDisponibles"));
		
		
			GridBagLayout gridaBagLayoutOrderByExistenciasDisponibles = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByExistenciasDisponibles.setName("jPanelOrderByExistenciasDisponibles"); 
			
			this.jPanelOrderByExistenciasDisponibles.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByExistenciasDisponibles.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByExistenciasDisponibles.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByExistenciasDisponibles.setLayout(gridaBagLayoutOrderByExistenciasDisponibles);
			
			
			this.jTableDatosExistenciasDisponiblesOrderBy = new JTableMe();        
			this.jTableDatosExistenciasDisponiblesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosExistenciasDisponiblesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosExistenciasDisponiblesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosExistenciasDisponiblesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosExistenciasDisponiblesOrderBy.setViewportView(this.jTableDatosExistenciasDisponiblesOrderBy);
			this.jTableDatosExistenciasDisponiblesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosExistenciasDisponiblesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByExistenciasDisponibles= new OrderByJInternalFrame();
			this.jInternalFrameOrderByExistenciasDisponibles= new OrderByJInternalFrame();
			this.jScrollPanelOrderByExistenciasDisponibles = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteExistenciasDisponibles= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByExistenciasDisponibles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByExistenciasDisponibles.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByExistenciasDisponibles.setTitle("Orden");
			this.jInternalFrameOrderByExistenciasDisponibles.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByExistenciasDisponibles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByExistenciasDisponibles.setResizable(true);
			this.jInternalFrameOrderByExistenciasDisponibles.setClosable(true);
			this.jInternalFrameOrderByExistenciasDisponibles.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByExistenciasDisponibles.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByExistenciasDisponibles.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByExistenciasDisponibles.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Disponibleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.gridy =iPosYOrderBy++;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iPosXOrderBy;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsExistenciasDisponibles.ipady =150;
				
			this.jPanelOrderByExistenciasDisponibles.add(jScrollPanelDatosExistenciasDisponiblesOrderBy, this.gridBagConstraintsExistenciasDisponibles);//this.jTableDatosExistenciasDisponiblesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByExistenciasDisponibles = new JButtonMe();
			this.jButtonCerrarOrderByExistenciasDisponibles.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByExistenciasDisponibles,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByExistenciasDisponibles.setToolTipText("Cancelar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.gridy = iPosYOrderBy++;
			this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXOrderBy;
									
			this.jPanelOrderByExistenciasDisponibles.add(this.jButtonCerrarOrderByExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalExistenciasDisponibles = new GridBagLayout();
			
			this.jScrollPanelOrderByExistenciasDisponibles= new JScrollPane(jPanelOrderByExistenciasDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.gridy =iPosYOrderBy;
			this.gridBagConstraintsExistenciasDisponibles.gridx =iPosXOrderBy;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByExistenciasDisponibles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByExistenciasDisponibles.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalExistenciasDisponibles);
			
			this.jInternalFrameOrderByExistenciasDisponibles.getContentPane().add(this.jScrollPanelOrderByExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);			
		
		} else {
			this.jButtonAbrirOrderByExistenciasDisponibles = new JButtonMe();
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
		//if(this.conMaximoRelaciones 
		//	&& this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosExistenciasDisponibles.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosExistenciasDisponibles.getRowHeight();//ExistenciasDisponiblesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ExistenciasDisponiblesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles.isSelected()) {
					iHeightTable=ExistenciasDisponiblesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ExistenciasDisponiblesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ExistenciasDisponiblesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ExistenciasDisponiblesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaExistenciasDisponibles.isSelected()) {
					iHeightTable=ExistenciasDisponiblesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ExistenciasDisponiblesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ExistenciasDisponiblesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosExistenciasDisponibles.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosExistenciasDisponibles.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosExistenciasDisponibles.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosExistenciasDisponibles.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosExistenciasDisponibles.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosExistenciasDisponibles.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByExistenciasDisponibles!=null && this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy()!=null) {
			//if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByExistenciasDisponibles.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByExistenciasDisponibles.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByExistenciasDisponibles.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosExistenciasDisponibles.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosExistenciasDisponibles.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosExistenciasDisponibles.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=existenciasdisponiblesLogic.getExistenciasDisponibless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=existenciasdisponibless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ExistenciasDisponibles> TraerExistenciasDisponiblesBeans(List<ExistenciasDisponibles> existenciasdisponibless,ArrayList<Classe> classes)throws Exception {
		try {
			for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponibless) {
					
				if(!(ExistenciasDisponiblesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ExistenciasDisponiblesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					existenciasdisponibles.setsDetalleGeneralEntityReporte(ExistenciasDisponiblesConstantesFunciones.getExistenciasDisponiblesDescripcion(existenciasdisponibles));
										
						
					
						
					
				} else  {
							
					//existenciasdisponibles.setsDetalleGeneralEntityReporte(existenciasdisponibles.getsDetalleGeneralEntityReporte());
										
				}
				
				//existenciasdisponiblesbeans.add(existenciasdisponiblesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return existenciasdisponibless;
    }
	//PARA REPORTES FIN
}
