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
import com.bydan.erp.inventario.util.report.ProcesoPreciosPorcentajeConstantesFunciones;

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
public class ProcesoPreciosPorcentajeJInternalFrame extends ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoPreciosPorcentaje;
	
	protected JMenuBar jmenuBarProcesoPreciosPorcentaje;
	
	protected JMenu jmenuProcesoPreciosPorcentaje;
	protected JMenu jmenuDatosProcesoPreciosPorcentaje;
	protected JMenu jmenuArchivoProcesoPreciosPorcentaje;
	protected JMenu jmenuAccionesProcesoPreciosPorcentaje;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoPreciosPorcentaje;	
	protected GridBagConstraints gridBagConstraintsProcesoPreciosPorcentaje;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoPreciosPorcentajeDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoPreciosPorcentaje;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoPreciosPorcentaje;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoPreciosPorcentaje;	
	
	
	
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
	
	public ProcesoPreciosPorcentajeSessionBean procesopreciosporcentajeSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoPreciosPorcentaje> procesopreciosporcentajes;		
	public List<ProcesoPreciosPorcentaje> procesopreciosporcentajesEliminados;	
	public List<ProcesoPreciosPorcentaje> procesopreciosporcentajesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoPreciosPorcentaje;		
	protected JButton jButtonAbrirOrderByProcesoPreciosPorcentaje;
	
	
	//protected JPanel jPanelOrderByProcesoPreciosPorcentaje;
	//public JScrollPane jScrollPanelOrderByProcesoPreciosPorcentaje;	
	//protected JButton jButtonCerrarOrderByProcesoPreciosPorcentaje;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoPreciosPorcentajeLogic procesopreciosporcentajeLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoPreciosPorcentaje;
	public JScrollPane jScrollPanelDatosEdicionProcesoPreciosPorcentaje;
	public JScrollPane jScrollPanelDatosGeneralProcesoPreciosPorcentaje;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoPreciosPorcentajeOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoPreciosPorcentaje;
	//public JScrollPane jScrollPanelImportacionProcesoPreciosPorcentaje;
	
	
	
	protected JPanel jPanelAccionesProcesoPreciosPorcentaje;
	
    protected JPanel jPanelPaginacionProcesoPreciosPorcentaje;
    protected JPanel jPanelParametrosReportesProcesoPreciosPorcentaje;
	protected JPanel jPanelParametrosReportesAccionesProcesoPreciosPorcentaje;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoPreciosPorcentaje;
	protected JPanel jPanelParametrosAuxiliar2ProcesoPreciosPorcentaje;
	protected JPanel jPanelParametrosAuxiliar3ProcesoPreciosPorcentaje;
	protected JPanel jPanelParametrosAuxiliar4ProcesoPreciosPorcentaje;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoPreciosPorcentaje;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoPreciosPorcentaje;
	//protected JPanel jPanelImportacionProcesoPreciosPorcentaje;
	
	
	public JTable jTableDatosProcesoPreciosPorcentaje;
	
	
	
	//public JTable jTableDatosProcesoPreciosPorcentajeOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoPreciosPorcentaje;
	protected JButton jButtonDuplicarProcesoPreciosPorcentaje;
	protected JButton jButtonCopiarProcesoPreciosPorcentaje;
	protected JButton jButtonVerFormProcesoPreciosPorcentaje;
	protected JButton jButtonNuevoRelacionesProcesoPreciosPorcentaje;
	protected JButton jButtonModificarProcesoPreciosPorcentaje;
	
    protected JButton jButtonGuardarCambiosTablaProcesoPreciosPorcentaje;
	protected JButton jButtonCerrarProcesoPreciosPorcentaje;
	
	
	protected JButton jButtonRecargarInformacionProcesoPreciosPorcentaje;
	protected JButton jButtonProcesarInformacionProcesoPreciosPorcentaje;
	
	
	protected JButton jButtonAnterioresProcesoPreciosPorcentaje;
	protected JButton jButtonSiguientesProcesoPreciosPorcentaje;
	protected JButton jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoPreciosPorcentaje;
	//protected JButton jButtonCerrarReporteDinamicoProcesoPreciosPorcentaje;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentaje;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoPreciosPorcentaje;
	//protected JButton jButtonGenerarImportacionProcesoPreciosPorcentaje;
	//protected JButton jButtonCerrarImportacionProcesoPreciosPorcentaje;
	//protected JFileChooser jFileChooserImportacionProcesoPreciosPorcentaje;
	//protected File fileImportacionProcesoPreciosPorcentaje;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonDuplicarToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonCopiarToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonVerFormToolBarProcesoPreciosPorcentaje;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonCerrarToolBarProcesoPreciosPorcentaje;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonProcesarInformacionToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonAnterioresToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonSiguientesToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonAbrirOrderByToolBarProcesoPreciosPorcentaje;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemDuplicarProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoPreciosPorcentaje;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemCopiarProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemVerFormProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemCerrarProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemDetalleCerrarProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemProcesarInformacionProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemAnterioresProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemSiguientesProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemAbrirOrderByProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemMostrarOcultarProcesoPreciosPorcentaje;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoPreciosPorcentaje;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje;
	protected JCheckBox jCheckBoxSeleccionadosProcesoPreciosPorcentaje;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoPreciosPorcentaje;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoPreciosPorcentaje;
	protected JTextField jTextFieldValorCampoGeneralProcesoPreciosPorcentaje;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoPreciosPorcentaje;
	//public JList<Reporte> jListColumnasSelectReporteProcesoPreciosPorcentaje;
	//public JScrollPane jScrollColumnasSelectReporteProcesoPreciosPorcentaje;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoPreciosPorcentaje;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoPreciosPorcentaje;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoPreciosPorcentaje;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoPreciosPorcentaje;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoPreciosPorcentaje;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoPreciosPorcentaje;
	
		
	//public JLabel jLabelArchivoImportacionProcesoPreciosPorcentaje;	
	//public JLabel jLabelPathArchivoImportacionProcesoPreciosPorcentaje;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoPreciosPorcentaje;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoPreciosPorcentaje;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoPreciosPorcentaje;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoPreciosPorcentaje;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoPreciosPorcentaje;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoPreciosPorcentaje;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoPreciosPorcentaje;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoPreciosPorcentaje;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoPreciosPorcentaje;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoPreciosPorcentaje;
	public JPanel jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JButton jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	
	public JPanel jPanelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JLabel jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JButton jButtonid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JLabel jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JButton jButtonid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JLabel jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JButton jButtonid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JLabel jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JButton jButtonid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JLabel jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JButton jButtonid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JLabel jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje;
	public JButton jButtonid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoPreciosPorcentajeJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosPorcentajeJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosPorcentajeJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosPorcentajeJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoPreciosPorcentaje)	{
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje = jButtonRecargarInformacionProcesoPreciosPorcentaje;
	}
	
	public JButton getjButtonProcesarInformacionProcesoPreciosPorcentaje() {
		return this.jButtonProcesarInformacionProcesoPreciosPorcentaje;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoPreciosPorcentaje)	{
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje = jButtonProcesarInformacionProcesoPreciosPorcentaje;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoPreciosPorcentaje() {
		return this.jButtonRecargarInformacionProcesoPreciosPorcentaje;
	}
	
	
	public List<ProcesoPreciosPorcentaje> getprocesopreciosporcentajes() {
		return this.procesopreciosporcentajes;
	}

	public void setprocesopreciosporcentajes(List<ProcesoPreciosPorcentaje> procesopreciosporcentajes) {
		this.procesopreciosporcentajes = procesopreciosporcentajes;
	}
	
	public List<ProcesoPreciosPorcentaje> getprocesopreciosporcentajesAux() {
		return this.procesopreciosporcentajesAux;
	}

	public void setprocesopreciosporcentajesAux(List<ProcesoPreciosPorcentaje> procesopreciosporcentajesAux) {
		this.procesopreciosporcentajesAux = procesopreciosporcentajesAux;
	}
	
	public List<ProcesoPreciosPorcentaje> getprocesopreciosporcentajesEliminados() {
		return this.procesopreciosporcentajesEliminados;
	}

	public void setProcesoPreciosPorcentajesEliminados(List<ProcesoPreciosPorcentaje> procesopreciosporcentajesEliminados) {
		this.procesopreciosporcentajesEliminados = procesopreciosporcentajesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoPreciosPorcentaje() {
		return jComboBoxTiposSeleccionarProcesoPreciosPorcentaje;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposSeleccionarProcesoPreciosPorcentaje) {
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje = jComboBoxTiposSeleccionarProcesoPreciosPorcentaje;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoPreciosPorcentaje() {
		return jTextFieldValorCampoGeneralProcesoPreciosPorcentaje;
	}

	public void setjTextFieldValorCampoGeneralProcesoPreciosPorcentaje(
			JTextField jTextFieldValorCampoGeneralProcesoPreciosPorcentaje) {
		this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje = jTextFieldValorCampoGeneralProcesoPreciosPorcentaje;
	}

	public void setBorderResaltarValorCampoGeneralProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoPreciosPorcentaje() {
		return this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje;
	}

	public void setjCheckBoxSeleccionarTodosProcesoPreciosPorcentaje(
			JCheckBox jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje) {
		this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje = jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje;
	}

	public void setBorderResaltarSeleccionarTodosProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoPreciosPorcentaje() {
		return this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje;
	}

	public void setjCheckBoxSeleccionadosProcesoPreciosPorcentaje(
			JCheckBox jCheckBoxSeleccionadosProcesoPreciosPorcentaje) {
		this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje = jCheckBoxSeleccionadosProcesoPreciosPorcentaje;
	}
	
	public void setBorderResaltarSeleccionadosProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoPreciosPorcentaje() {
		return this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje) {
		this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje = jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoPreciosPorcentaje() {
		return this.jComboBoxTiposReportesProcesoPreciosPorcentaje;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposReportesProcesoPreciosPorcentaje) {
		this.jComboBoxTiposReportesProcesoPreciosPorcentaje = jComboBoxTiposReportesProcesoPreciosPorcentaje;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje() {
	//	return jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje) {
	//	this.jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje = jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje = jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje;
	//}
	
	public void setBorderResaltarTiposReportesProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoPreciosPorcentaje() {
		return this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje) {
		this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje = jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoPreciosPorcentaje() {
		return this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposPaginacionProcesoPreciosPorcentaje) {
		this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje = jComboBoxTiposPaginacionProcesoPreciosPorcentaje;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoPreciosPorcentaje() {
		return this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoPreciosPorcentaje() {
		return this.jComboBoxTiposAccionesProcesoPreciosPorcentaje;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposRelacionesProcesoPreciosPorcentaje) {
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje = jComboBoxTiposRelacionesProcesoPreciosPorcentaje;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposAccionesProcesoPreciosPorcentaje) {
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje = jComboBoxTiposAccionesProcesoPreciosPorcentaje;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoPreciosPorcentaje() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje() {
	//	return jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje) {
	//	this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje = jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoPreciosPorcentaje() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoPreciosPorcentaje.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje .setBorder(borderResaltar);		
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
		this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
		
		this.procesopreciosporcentajeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopreciosporcentajeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoPreciosPorcentajeJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoPreciosPorcentajeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoPreciosPorcentajeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoPreciosPorcentajeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoPreciosPorcentajeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Precios Porcentaje MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoPreciosPorcentajeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoPreciosPorcentaje= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"nuevo","nuevo","Nuevo"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"duplicar","duplicar","Duplicar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"copiar","copiar","Copiar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"ver_form","ver_form","Ver"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"recargar","recargar","Buscar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,
							"cerrar","cerrar","Salir"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje;
			
				this.jButtonProcesarInformacionToolBarProcesoPreciosPorcentaje=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoPreciosPorcentaje;
				
		//protected JButton jButtonModificarToolBarProcesoPreciosPorcentaje;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoPreciosPorcentaje=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoPreciosPorcentaje=new JMenuMe("General");
		this.jmenuArchivoProcesoPreciosPorcentaje=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoPreciosPorcentaje=new JMenuMe("Acciones");
		this.jmenuDatosProcesoPreciosPorcentaje=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoPreciosPorcentaje= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoPreciosPorcentaje.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoPreciosPorcentaje,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoPreciosPorcentaje= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoPreciosPorcentaje.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoPreciosPorcentaje,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoPreciosPorcentaje= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoPreciosPorcentaje.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoPreciosPorcentaje,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoPreciosPorcentaje= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoPreciosPorcentaje.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoPreciosPorcentaje,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoPreciosPorcentaje= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoPreciosPorcentaje.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoPreciosPorcentaje,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoPreciosPorcentaje= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoPreciosPorcentaje.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoPreciosPorcentaje,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoPreciosPorcentaje= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoPreciosPorcentaje.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoPreciosPorcentaje,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoPreciosPorcentaje= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoPreciosPorcentaje.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoPreciosPorcentaje,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoPreciosPorcentaje= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoPreciosPorcentaje.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoPreciosPorcentaje,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoPreciosPorcentaje= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoPreciosPorcentaje.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoPreciosPorcentaje,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoPreciosPorcentaje.add(this.jMenuItemCerrarProcesoPreciosPorcentaje);
			
			this.jmenuAccionesProcesoPreciosPorcentaje.add(this.jMenuItemNuevoProcesoPreciosPorcentaje);
			this.jmenuAccionesProcesoPreciosPorcentaje.add(this.jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje);
			this.jmenuAccionesProcesoPreciosPorcentaje.add(this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje);
			this.jmenuAccionesProcesoPreciosPorcentaje.add(this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje);		
			this.jmenuAccionesProcesoPreciosPorcentaje.add(this.jMenuItemDuplicarProcesoPreciosPorcentaje);		
			this.jmenuAccionesProcesoPreciosPorcentaje.add(this.jMenuItemCopiarProcesoPreciosPorcentaje);		
			this.jmenuAccionesProcesoPreciosPorcentaje.add(this.jMenuItemVerFormProcesoPreciosPorcentaje);		
			
			this.jmenuDatosProcesoPreciosPorcentaje.add(this.jMenuItemRecargarInformacionProcesoPreciosPorcentaje);				
			this.jmenuDatosProcesoPreciosPorcentaje.add(this.jMenuItemAnterioresProcesoPreciosPorcentaje);				
			this.jmenuDatosProcesoPreciosPorcentaje.add(this.jMenuItemSiguientesProcesoPreciosPorcentaje);				
			this.jmenuDatosProcesoPreciosPorcentaje.add(this.jMenuItemAbrirOrderByProcesoPreciosPorcentaje);				
			this.jmenuDatosProcesoPreciosPorcentaje.add(this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoPreciosPorcentaje.add(this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoPreciosPorcentaje.add(this.jmenuArchivoProcesoPreciosPorcentaje);		
			this.jmenuBarProcesoPreciosPorcentaje.add(this.jmenuAccionesProcesoPreciosPorcentaje);		
			this.jmenuBarProcesoPreciosPorcentaje.add(this.jmenuDatosProcesoPreciosPorcentaje);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoPreciosPorcentaje);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoPreciosPorcentaje() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		this.jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje = new JLabelMe();
		jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setText("Bodega :");
		jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje = new JLabelMe();
		jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setText("Producto :");
		jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setToolTipText("Producto");
		jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje = new JLabelMe();
		jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setText("Linea :");
		jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setToolTipText("Linea");
		jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje = new JLabelMe();
		jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje = new JLabelMe();
		jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoPreciosPorcentaje=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoPreciosPorcentaje = new ProcesoPreciosPorcentajeDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Precios Porcentaje DATOS");
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje = new ProcesoPreciosPorcentajeDetalleFormJInternalFrame(jDesktopPane,this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones(),this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje = null;//new ProcesoPreciosPorcentajeDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoPreciosPorcentaje= new GridBagLayout();
		
		
		this.jTableDatosProcesoPreciosPorcentaje = new JTableMe();      
		
		String sToolTipProcesoPreciosPorcentaje="";
		sToolTipProcesoPreciosPorcentaje=ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoPreciosPorcentaje+="(Inventario.ProcesoPreciosPorcentaje)";
		}
		
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoPreciosPorcentaje+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoPreciosPorcentaje.setToolTipText(sToolTipProcesoPreciosPorcentaje);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoPreciosPorcentaje);
		this.jTableDatosProcesoPreciosPorcentaje.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoPreciosPorcentaje.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionAllowed(true);
		this.jTableDatosProcesoPreciosPorcentaje.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonDuplicarProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonCopiarProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonVerFormProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoPreciosPorcentaje = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonCerrarProcesoPreciosPorcentaje = new JButtonMe();
		
		this.jScrollPanelDatosProcesoPreciosPorcentaje = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Precios Porcentaje";
		
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Porcentajes" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoPreciosPorcentaje.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoPreciosPorcentaje.setToolTipText("Acciones");
        this.jPanelAccionesProcesoPreciosPorcentaje.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje=new ReporteDinamicoJInternalFrame(ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoPreciosPorcentaje();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoPreciosPorcentaje=new ImportacionJInternalFrame(ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoPreciosPorcentaje();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoPreciosPorcentaje = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoPreciosPorcentaje.setText("Orden");
		this.jButtonAbrirOrderByProcesoPreciosPorcentaje.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoPreciosPorcentaje,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoPreciosPorcentaje=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPreciosPorcentaje,false,this);
			
			//this.cargarOrderByProcesoPreciosPorcentaje(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoPreciosPorcentaje=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPreciosPorcentaje,true,this);
			
			//this.cargarOrderByProcesoPreciosPorcentaje(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoPreciosPorcentaje.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosProcesoPreciosPorcentaje.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosProcesoPreciosPorcentaje.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosProcesoPreciosPorcentaje.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoPreciosPorcentaje.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoPreciosPorcentaje.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoPreciosPorcentaje.setText("Nuevo");
		this.jButtonDuplicarProcesoPreciosPorcentaje.setText("Duplicar");
		this.jButtonCopiarProcesoPreciosPorcentaje.setText("Copiar");
		this.jButtonVerFormProcesoPreciosPorcentaje.setText("Ver");
		this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.setText("Guardar");
		this.jButtonCerrarProcesoPreciosPorcentaje.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoPreciosPorcentaje,"nuevo_button","Nuevo",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoPreciosPorcentaje,"duplicar_button","Duplicar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoPreciosPorcentaje,"copiar_button","Copiar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoPreciosPorcentaje,"ver_form","Ver",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoPreciosPorcentaje,"nuevorelaciones_button","Nuevo Rel",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje,"guardarcambiostabla_button","Guardar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoPreciosPorcentaje,"cerrar_button","Salir",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoPreciosPorcentaje.setToolTipText("Nuevo"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoPreciosPorcentaje.setToolTipText("Duplicar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoPreciosPorcentaje.setToolTipText("Copiar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoPreciosPorcentaje.setToolTipText("Ver"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.setToolTipText("Nuevo Rel"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.setToolTipText("Guardar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoPreciosPorcentaje.setToolTipText("Salir"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoPreciosPorcentaje";
		inputMap = this.jButtonNuevoProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoPreciosPorcentaje"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoPreciosPorcentaje";
		inputMap = this.jButtonDuplicarProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoPreciosPorcentaje"));
		
		//COPIAR
		sMapKey = "CopiarProcesoPreciosPorcentaje";
		inputMap = this.jButtonCopiarProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoPreciosPorcentaje"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoPreciosPorcentaje";
		inputMap = this.jButtonVerFormProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoPreciosPorcentaje"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoPreciosPorcentaje";
		inputMap = this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoPreciosPorcentaje"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoPreciosPorcentaje";
		inputMap = this.jButtonModificarProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoPreciosPorcentaje"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoPreciosPorcentaje";
		inputMap = this.jButtonCerrarProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoPreciosPorcentaje"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoPreciosPorcentaje";
		inputMap = this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoPreciosPorcentaje"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoPreciosPorcentaje= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoPreciosPorcentaje= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoPreciosPorcentaje= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoPreciosPorcentaje= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoPreciosPorcentaje= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoPreciosPorcentaje.setName("jPanelParametrosReportesProcesoPreciosPorcentaje"); 
		
		this.jPanelParametrosReportesAccionesProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoPreciosPorcentaje.setName("jPanelParametrosReportesAccionesProcesoPreciosPorcentaje"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.setToolTipText("Buscar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoPreciosPorcentaje,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje.setText("Procesar");
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje.setToolTipText("Procesar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoPreciosPorcentaje.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setText("Accion");
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoPreciosPorcentaje = new JLabelMe();
		
		this.jLabelAccionesProcesoPreciosPorcentaje.setText("Acciones");		
		this.jLabelAccionesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoPreciosPorcentaje = new JButtonMe();
		//this.jButtonAnterioresProcesoPreciosPorcentaje.setText("<<");
        this.jButtonAnterioresProcesoPreciosPorcentaje.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoPreciosPorcentaje,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoPreciosPorcentaje = new JButtonMe();
		//this.jButtonSiguientesProcesoPreciosPorcentaje.setText(">>");
        this.jButtonSiguientesProcesoPreciosPorcentaje.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoPreciosPorcentaje,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje,"nuevoguardarcambios_button","Nue",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoPreciosPorcentaje";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoPreciosPorcentaje"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoPreciosPorcentaje";
		inputMap = this.jButtonRecargarInformacionProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoPreciosPorcentaje"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoPreciosPorcentaje";
		inputMap = this.jButtonSiguientesProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoPreciosPorcentaje"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoPreciosPorcentaje";
		inputMap = this.jButtonAnterioresProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoPreciosPorcentaje"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoPreciosPorcentaje();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(this.getWidth(),ProcesoPreciosPorcentajeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPreciosPorcentajeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(this.getWidth(),ProcesoPreciosPorcentajeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPreciosPorcentajeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(this.getWidth(),ProcesoPreciosPorcentajeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPreciosPorcentajeBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoPreciosPorcentaje = new GridBagLayout();

			this.jPanelPaginacionProcesoPreciosPorcentaje.setLayout(gridaBagLayoutPaginacionProcesoPreciosPorcentaje);						
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonAnterioresProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
					
						
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
			
			this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
						
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
			this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonSiguientesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 1;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonNuevoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
						
			
			
			if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
				this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 1;
				this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			}
			
			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 1;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonDuplicarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 1;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonCopiarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 1;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonVerFormProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 1;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoPreciosPorcentaje.add(this.jButtonCerrarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		
		
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoPreciosPorcentaje = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoPreciosPorcentaje = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoPreciosPorcentaje = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoPreciosPorcentaje = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoPreciosPorcentaje = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoPreciosPorcentaje = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.setLayout(gridaBagParametrosReportesProcesoPreciosPorcentaje);
			this.jPanelParametrosReportesAccionesProcesoPreciosPorcentaje.setLayout(gridaBagParametrosReportesAccionesProcesoPreciosPorcentaje);
			
			
			this.jPanelParametrosAuxiliar1ProcesoPreciosPorcentaje.setLayout(gridaBagParametrosAuxiliar1ProcesoPreciosPorcentaje);
			this.jPanelParametrosAuxiliar2ProcesoPreciosPorcentaje.setLayout(gridaBagParametrosAuxiliar2ProcesoPreciosPorcentaje);
			this.jPanelParametrosAuxiliar3ProcesoPreciosPorcentaje.setLayout(gridaBagParametrosAuxiliar3ProcesoPreciosPorcentaje);
			this.jPanelParametrosAuxiliar4ProcesoPreciosPorcentaje.setLayout(gridaBagParametrosAuxiliar4ProcesoPreciosPorcentaje);
			//this.jPanelParametrosAuxiliar5ProcesoPreciosPorcentaje.setLayout(gridaBagParametrosAuxiliar2ProcesoPreciosPorcentaje);			
			
			
			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jButtonRecargarInformacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPreciosPorcentaje.add(this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPreciosPorcentaje.add(this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPreciosPorcentaje.add(this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jPanelParametrosAuxiliar1ProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoPreciosPorcentaje.add(this.jComboBoxTiposReportesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);																		
			
			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoPreciosPorcentaje.add(this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jPanelParametrosAuxiliar4ProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jComboBoxTiposReportesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jCheckBoxGenerarReporteProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jPanelParametrosAuxiliar2ProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jLabelAccionesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
				this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jButtonAbrirOrderByProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);			
			
			
			/*
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPreciosPorcentaje.add(this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);															
				
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPreciosPorcentaje.add(this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);															
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPreciosPorcentaje.add(this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jPanelParametrosAuxiliar3ProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.add(this.jComboBoxTiposAccionesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoPreciosPorcentaje = new GridBagLayout();

			this.jScrollPanelDatosProcesoPreciosPorcentaje.setLayout(gridaBagLayoutDatosProcesoPreciosPorcentaje);
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
			
			this.jScrollPanelDatosProcesoPreciosPorcentaje.add(this.jTableDatosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoPreciosPorcentaje.setViewportView(this.jTableDatosProcesoPreciosPorcentaje);
		this.jTableDatosProcesoPreciosPorcentaje.setFillsViewportHeight(true);
		this.jTableDatosProcesoPreciosPorcentaje.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoPreciosPorcentaje= new GridBagLayout();
		this.jPanelAccionesProcesoPreciosPorcentaje.setLayout(gridaBagLayoutAccionesProcesoPreciosPorcentaje);
		
		
		/*	
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
			
		this.jPanelAccionesProcesoPreciosPorcentaje.add(this.jButtonNuevoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setLayout(gridaBagLayoutBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);

		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jLabelid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);

		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);


		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 1;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jLabelid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);

		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 1;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);


		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 2;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jLabelid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);

		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 2;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);


		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 3;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jLabelid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);

		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 3;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);


		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 4;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jLabelid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);

		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 4;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);


		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 5;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jLabelid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);

		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 5;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);

		gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosPorcentaje.gridy = 6;
		gridBagConstraintsProcesoPreciosPorcentaje.gridx =1;
		jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.add(jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);

		jTabbedPaneBusquedasProcesoPreciosPorcentaje.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ", jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
		jTabbedPaneBusquedasProcesoPreciosPorcentaje.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoPreciosPorcentaje);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();						
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;		
			//this.gridBagConstraintsProcesoPreciosPorcentaje.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;		
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoPreciosPorcentaje);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);								
		
		
		/*
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		*/		
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoPreciosPorcentaje.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
				
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoPreciosPorcentaje= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoPreciosPorcentaje = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoPreciosPorcentaje.setLayout(gridaBagLayoutBusquedasParametrosProcesoPreciosPorcentaje);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			
			
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
			
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoPreciosPorcentaje() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoPreciosPorcentaje = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.setName("jPanelReporteDinamicoProcesoPreciosPorcentaje"); 
		
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.setLayout(gridaBagLayoutReporteDinamicoProcesoPreciosPorcentaje);
		
		
		this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Porcentajes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoPreciosPorcentaje.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jLabelColumnasSelectReporteProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoPreciosPorcentaje = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoPreciosPorcentaje.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoPreciosPorcentaje.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje=new JScrollPane(this.jListColumnasSelectReporteProcesoPreciosPorcentaje);
			
			this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jListColumnasSelectReporteProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoPreciosPorcentaje.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoPreciosPorcentaje = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoPreciosPorcentaje.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoPreciosPorcentaje.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoPreciosPorcentaje=new JScrollPane(this.jListRelacionesSelectReporteProcesoPreciosPorcentaje);
			
			this.jScrollRelacionesSelectReporteProcesoPreciosPorcentaje.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoPreciosPorcentaje.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoPreciosPorcentaje.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoPreciosPorcentaje = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoPreciosPorcentaje.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jLabelConGraficoDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jCheckBoxConGraficoDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoPreciosPorcentaje.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jLabelColumnaCategoriaGraficoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoPreciosPorcentaje.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jLabelColumnaCategoriaValorProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoPreciosPorcentaje.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoPreciosPorcentaje.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jComboBoxColumnaCategoriaValorProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoPreciosPorcentaje.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jLabelColumnasValoresGraficoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoPreciosPorcentaje = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoPreciosPorcentaje.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoPreciosPorcentaje.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoPreciosPorcentaje=new JScrollPane(this.jListColumnasValoresGraficoProcesoPreciosPorcentaje);
			
			this.jScrollColumnasValoresGraficoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jListColumnasSelectReporteProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jScrollColumnasValoresGraficoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosPorcentaje.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jLabelTiposGraficosReportesDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoPreciosPorcentaje.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosPorcentaje.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosPorcentaje.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jLabelGenerarExcelReporteDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentaje.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentaje,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentaje.setToolTipText("Generar EXCEL"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jComboBoxTiposReportesDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosPorcentaje.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jLabelTiposArchivoReporteDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoPreciosPorcentaje.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoPreciosPorcentaje,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoPreciosPorcentaje.setToolTipText("Generar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jButtonGenerarReporteDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoPreciosPorcentaje.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoPreciosPorcentaje,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoPreciosPorcentaje.setToolTipText("Cancelar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPreciosPorcentaje.add(this.jButtonCerrarReporteDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoPreciosPorcentaje = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje= new JScrollPane(jPanelReporteDinamicoProcesoPreciosPorcentaje,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Porcentajes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoPreciosPorcentaje);
		this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoPreciosPorcentaje() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoPreciosPorcentaje = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoPreciosPorcentaje.setName("jPanelImportacionProcesoPreciosPorcentaje"); 
		
		this.jPanelImportacionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoPreciosPorcentaje.setLayout(gridaBagLayoutImportacionProcesoPreciosPorcentaje);
		
		
		this.jInternalFrameImportacionProcesoPreciosPorcentaje= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoPreciosPorcentaje= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoPreciosPorcentaje = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setResizable(true);
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setClosable(true);
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setResizable(true);
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setClosable(true);
	    this.jInternalFrameImportacionProcesoPreciosPorcentaje.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Porcentajes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelArchivoImportacionProcesoPreciosPorcentaje.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoPreciosPorcentaje.add(this.jLabelArchivoImportacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoPreciosPorcentaje = new JFileChooser();		
		this.jFileChooserImportacionProcesoPreciosPorcentaje.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonAbrirImportacionProcesoPreciosPorcentaje.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoPreciosPorcentaje,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoPreciosPorcentaje.setToolTipText("Generar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPreciosPorcentaje.add(this.jButtonAbrirImportacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoPreciosPorcentaje = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoPreciosPorcentaje.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoPreciosPorcentaje.add(this.jLabelPathArchivoImportacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoPreciosPorcentaje=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPreciosPorcentaje.add(this.jTextFieldPathArchivoImportacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonGenerarImportacionProcesoPreciosPorcentaje.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoPreciosPorcentaje,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoPreciosPorcentaje.setToolTipText("Generar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPreciosPorcentaje.add(this.jButtonGenerarImportacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonCerrarImportacionProcesoPreciosPorcentaje.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoPreciosPorcentaje,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoPreciosPorcentaje.setToolTipText("Cancelar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPreciosPorcentaje.add(this.jButtonCerrarImportacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoPreciosPorcentaje = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoPreciosPorcentaje= new JScrollPane(jPanelImportacionProcesoPreciosPorcentaje,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoPreciosPorcentaje);
		this.jInternalFrameImportacionProcesoPreciosPorcentaje.getContentPane().add(this.jScrollPanelImportacionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoPreciosPorcentaje(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoPreciosPorcentaje = new JButtonMe();
			this.jButtonAbrirOrderByProcesoPreciosPorcentaje.setText("Orden");
			this.jButtonAbrirOrderByProcesoPreciosPorcentaje.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoPreciosPorcentaje,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoPreciosPorcentaje";
			inputMap = this.jButtonAbrirOrderByProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoPreciosPorcentaje"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoPreciosPorcentaje = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoPreciosPorcentaje.setName("jPanelOrderByProcesoPreciosPorcentaje"); 
			
			this.jPanelOrderByProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoPreciosPorcentaje.setLayout(gridaBagLayoutOrderByProcesoPreciosPorcentaje);
			
			
			this.jTableDatosProcesoPreciosPorcentajeOrderBy = new JTableMe();        
			this.jTableDatosProcesoPreciosPorcentajeOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoPreciosPorcentajeOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoPreciosPorcentajeOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoPreciosPorcentajeOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoPreciosPorcentajeOrderBy.setViewportView(this.jTableDatosProcesoPreciosPorcentajeOrderBy);
			this.jTableDatosProcesoPreciosPorcentajeOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoPreciosPorcentajeOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoPreciosPorcentaje= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoPreciosPorcentaje= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoPreciosPorcentaje = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoPreciosPorcentaje= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setTitle("Orden");
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setResizable(true);
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setClosable(true);
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Porcentajes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoPreciosPorcentaje.ipady =150;
				
			this.jPanelOrderByProcesoPreciosPorcentaje.add(jScrollPanelDatosProcesoPreciosPorcentajeOrderBy, this.gridBagConstraintsProcesoPreciosPorcentaje);//this.jTableDatosProcesoPreciosPorcentajeTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoPreciosPorcentaje = new JButtonMe();
			this.jButtonCerrarOrderByProcesoPreciosPorcentaje.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoPreciosPorcentaje,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoPreciosPorcentaje.setToolTipText("Cancelar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoPreciosPorcentaje.add(this.jButtonCerrarOrderByProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoPreciosPorcentaje = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoPreciosPorcentaje= new JScrollPane(jPanelOrderByProcesoPreciosPorcentaje,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoPreciosPorcentaje);
			
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.getContentPane().add(this.jScrollPanelOrderByProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);			
		
		} else {
			this.jButtonAbrirOrderByProcesoPreciosPorcentaje = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoPreciosPorcentaje.getRowHeight();//ProcesoPreciosPorcentajeConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoPreciosPorcentajeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje.isSelected()) {
					iHeightTable=ProcesoPreciosPorcentajeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoPreciosPorcentajeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoPreciosPorcentajeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoPreciosPorcentajeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoPreciosPorcentaje.isSelected()) {
					iHeightTable=ProcesoPreciosPorcentajeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoPreciosPorcentajeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoPreciosPorcentajeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoPreciosPorcentaje!=null && this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy()!=null) {
			//if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopreciosporcentajes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoPreciosPorcentaje> TraerProcesoPreciosPorcentajeBeans(List<ProcesoPreciosPorcentaje> procesopreciosporcentajes,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajes) {
					
				if(!(ProcesoPreciosPorcentajeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoPreciosPorcentajeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesopreciosporcentaje.setsDetalleGeneralEntityReporte(ProcesoPreciosPorcentajeConstantesFunciones.getProcesoPreciosPorcentajeDescripcion(procesopreciosporcentaje));
										
						
					
						
					
				} else  {
							
					//procesopreciosporcentaje.setsDetalleGeneralEntityReporte(procesopreciosporcentaje.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesopreciosporcentajebeans.add(procesopreciosporcentajebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesopreciosporcentajes;
    }
	//PARA REPORTES FIN
}
