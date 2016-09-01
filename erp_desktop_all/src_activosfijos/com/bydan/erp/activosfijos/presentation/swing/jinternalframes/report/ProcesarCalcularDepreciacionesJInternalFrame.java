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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ProcesarCalcularDepreciacionesConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class ProcesarCalcularDepreciacionesJInternalFrame extends ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesarCalcularDepreciaciones;
	
	protected JMenuBar jmenuBarProcesarCalcularDepreciaciones;
	
	protected JMenu jmenuProcesarCalcularDepreciaciones;
	protected JMenu jmenuDatosProcesarCalcularDepreciaciones;
	protected JMenu jmenuArchivoProcesarCalcularDepreciaciones;
	protected JMenu jmenuAccionesProcesarCalcularDepreciaciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesarCalcularDepreciaciones;	
	protected GridBagConstraints gridBagConstraintsProcesarCalcularDepreciaciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesarCalcularDepreciacionesDetalleFormJInternalFrame jInternalFrameDetalleFormProcesarCalcularDepreciaciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesarCalcularDepreciaciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";

	protected SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subgrupoactivofijo="";
	
	public ProcesarCalcularDepreciacionesSessionBean procesarcalculardepreciacionesSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
	public SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacioness;		
	public List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessEliminados;	
	public List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesarCalcularDepreciaciones;		
	protected JButton jButtonAbrirOrderByProcesarCalcularDepreciaciones;
	
	
	//protected JPanel jPanelOrderByProcesarCalcularDepreciaciones;
	//public JScrollPane jScrollPanelOrderByProcesarCalcularDepreciaciones;	
	//protected JButton jButtonCerrarOrderByProcesarCalcularDepreciaciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesarCalcularDepreciacionesLogic procesarcalculardepreciacionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesarCalcularDepreciaciones;
	public JScrollPane jScrollPanelDatosEdicionProcesarCalcularDepreciaciones;
	public JScrollPane jScrollPanelDatosGeneralProcesarCalcularDepreciaciones;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesarCalcularDepreciacionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones;
	//public JScrollPane jScrollPanelImportacionProcesarCalcularDepreciaciones;
	
	
	
	protected JPanel jPanelAccionesProcesarCalcularDepreciaciones;
	
    protected JPanel jPanelPaginacionProcesarCalcularDepreciaciones;
    protected JPanel jPanelParametrosReportesProcesarCalcularDepreciaciones;
	protected JPanel jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesarCalcularDepreciaciones;
	protected JPanel jPanelParametrosAuxiliar2ProcesarCalcularDepreciaciones;
	protected JPanel jPanelParametrosAuxiliar3ProcesarCalcularDepreciaciones;
	protected JPanel jPanelParametrosAuxiliar4ProcesarCalcularDepreciaciones;
	//protected JPanel jPanelParametrosAuxiliar5ProcesarCalcularDepreciaciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesarCalcularDepreciaciones;
	//protected JPanel jPanelImportacionProcesarCalcularDepreciaciones;
	
	
	public JTable jTableDatosProcesarCalcularDepreciaciones;
	
	
	
	//public JTable jTableDatosProcesarCalcularDepreciacionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesarCalcularDepreciaciones;
	protected JButton jButtonDuplicarProcesarCalcularDepreciaciones;
	protected JButton jButtonCopiarProcesarCalcularDepreciaciones;
	protected JButton jButtonVerFormProcesarCalcularDepreciaciones;
	protected JButton jButtonNuevoRelacionesProcesarCalcularDepreciaciones;
	protected JButton jButtonModificarProcesarCalcularDepreciaciones;
	
    protected JButton jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones;
	protected JButton jButtonCerrarProcesarCalcularDepreciaciones;
	
	
	protected JButton jButtonRecargarInformacionProcesarCalcularDepreciaciones;
	protected JButton jButtonProcesarInformacionProcesarCalcularDepreciaciones;
	
	
	protected JButton jButtonAnterioresProcesarCalcularDepreciaciones;
	protected JButton jButtonSiguientesProcesarCalcularDepreciaciones;
	protected JButton jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesarCalcularDepreciaciones;
	//protected JButton jButtonCerrarReporteDinamicoProcesarCalcularDepreciaciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesarCalcularDepreciaciones;
	//protected JButton jButtonGenerarImportacionProcesarCalcularDepreciaciones;
	//protected JButton jButtonCerrarImportacionProcesarCalcularDepreciaciones;
	//protected JFileChooser jFileChooserImportacionProcesarCalcularDepreciaciones;
	//protected File fileImportacionProcesarCalcularDepreciaciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonDuplicarToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonCopiarToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonVerFormToolBarProcesarCalcularDepreciaciones;
	public JButton jButtonGuardarCambiosTablaToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonCerrarToolBarProcesarCalcularDepreciaciones;
	
	protected JButton jButtonRecargarInformacionToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonProcesarInformacionToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonAnterioresToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonSiguientesToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonAbrirOrderByToolBarProcesarCalcularDepreciaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemDuplicarProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemCopiarProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemVerFormProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemCerrarProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemDetalleCerrarProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemProcesarInformacionProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemAnterioresProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemSiguientesProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemAbrirOrderByProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemMostrarOcultarProcesarCalcularDepreciaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesarCalcularDepreciaciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones;
	protected JCheckBox jCheckBoxSeleccionadosProcesarCalcularDepreciaciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones;
	protected JCheckBox jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesarCalcularDepreciaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones;
	protected JTextField jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesarCalcularDepreciaciones;
	//public JList<Reporte> jListColumnasSelectReporteProcesarCalcularDepreciaciones;
	//public JScrollPane jScrollColumnasSelectReporteProcesarCalcularDepreciaciones;
	
	//public JLabel jLabelRelacionesSelectReporteProcesarCalcularDepreciaciones;
	//public JList<Reporte> jListRelacionesSelectReporteProcesarCalcularDepreciaciones;
	//public JScrollPane jScrollRelacionesSelectReporteProcesarCalcularDepreciaciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesarCalcularDepreciaciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesarCalcularDepreciaciones;
	
		
	//public JLabel jLabelArchivoImportacionProcesarCalcularDepreciaciones;	
	//public JLabel jLabelPathArchivoImportacionProcesarCalcularDepreciaciones;
	//protected JTextField jTextFieldPathArchivoImportacionProcesarCalcularDepreciaciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesarCalcularDepreciaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesarCalcularDepreciaciones;
	
	//public JLabel jLabelColumnaCategoriaValorProcesarCalcularDepreciaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesarCalcularDepreciaciones;
	
	//public JLabel jLabelColumnasValoresGraficoProcesarCalcularDepreciaciones;
	//public JList<Reporte> jListColumnasValoresGraficoProcesarCalcularDepreciaciones;
	//public JScrollPane jScrollColumnasValoresGraficoProcesarCalcularDepreciaciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesarCalcularDepreciaciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesarCalcularDepreciaciones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesarCalcularDepreciaciones;
	public JPanel jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JButton jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	
	public JPanel jPanelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JLabel jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JButton jButtonid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JLabel jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JButton jButtonid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JLabel jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JButton jButtonid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JLabel jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones;
	public JButton jButtonid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JButtonMe();
	public JButton jButtonid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesarCalcularDepreciacionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCalcularDepreciacionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCalcularDepreciacionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCalcularDepreciacionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesarCalcularDepreciaciones)	{
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones = jButtonRecargarInformacionProcesarCalcularDepreciaciones;
	}
	
	public JButton getjButtonProcesarInformacionProcesarCalcularDepreciaciones() {
		return this.jButtonProcesarInformacionProcesarCalcularDepreciaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesarCalcularDepreciaciones)	{
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones = jButtonProcesarInformacionProcesarCalcularDepreciaciones;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesarCalcularDepreciaciones() {
		return this.jButtonRecargarInformacionProcesarCalcularDepreciaciones;
	}
	
	
	public List<ProcesarCalcularDepreciaciones> getprocesarcalculardepreciacioness() {
		return this.procesarcalculardepreciacioness;
	}

	public void setprocesarcalculardepreciacioness(List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacioness) {
		this.procesarcalculardepreciacioness = procesarcalculardepreciacioness;
	}
	
	public List<ProcesarCalcularDepreciaciones> getprocesarcalculardepreciacionessAux() {
		return this.procesarcalculardepreciacionessAux;
	}

	public void setprocesarcalculardepreciacionessAux(List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessAux) {
		this.procesarcalculardepreciacionessAux = procesarcalculardepreciacionessAux;
	}
	
	public List<ProcesarCalcularDepreciaciones> getprocesarcalculardepreciacionessEliminados() {
		return this.procesarcalculardepreciacionessEliminados;
	}

	public void setProcesarCalcularDepreciacionessEliminados(List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacionessEliminados) {
		this.procesarcalculardepreciacionessEliminados = procesarcalculardepreciacionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesarCalcularDepreciaciones() {
		return jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones = jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesarCalcularDepreciaciones() {
		return jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones;
	}

	public void setjTextFieldValorCampoGeneralProcesarCalcularDepreciaciones(
			JTextField jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones) {
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones = jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones;
	}

	public void setBorderResaltarValorCampoGeneralProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones() {
		return this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones;
	}

	public void setjCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones(
			JCheckBox jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones) {
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones = jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones;
	}

	public void setBorderResaltarSeleccionarTodosProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesarCalcularDepreciaciones() {
		return this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones;
	}

	public void setjCheckBoxSeleccionadosProcesarCalcularDepreciaciones(
			JCheckBox jCheckBoxSeleccionadosProcesarCalcularDepreciaciones) {
		this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones = jCheckBoxSeleccionadosProcesarCalcularDepreciaciones;
	}
	
	public void setBorderResaltarSeleccionadosProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones() {
		return this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones = jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones;
	}

	public void setBorderResaltarTiposArchivosReportesProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesarCalcularDepreciaciones() {
		return this.jComboBoxTiposReportesProcesarCalcularDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposReportesProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposReportesProcesarCalcularDepreciaciones = jComboBoxTiposReportesProcesarCalcularDepreciaciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones() {
	//	return jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones) {
	//	this.jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones = jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones = jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones;
	//}
	
	public void setBorderResaltarTiposReportesProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones() {
		return this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones = jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesarCalcularDepreciaciones() {
		return this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposPaginacionProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones = jComboBoxTiposPaginacionProcesarCalcularDepreciaciones;
	}
	
	public void setBorderResaltarTiposPaginacionProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesarCalcularDepreciaciones() {
		return this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesarCalcularDepreciaciones() {
		return this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposRelacionesProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones = jComboBoxTiposRelacionesProcesarCalcularDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposAccionesProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones = jComboBoxTiposAccionesProcesarCalcularDepreciaciones;
	}
	
	public void setBorderResaltarTiposRelacionesProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesarCalcularDepreciaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones() {
	//	return jCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones) {
	//	this.jCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones = jCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesarCalcularDepreciaciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesarCalcularDepreciaciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones .setBorder(borderResaltar);		
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
		this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
		
		this.procesarcalculardepreciacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarcalculardepreciacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesarCalcularDepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesarCalcularDepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesarCalcularDepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesarCalcularDepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesarCalcularDepreciacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Procesar Calcular Depreciaciones MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesarCalcularDepreciacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesarCalcularDepreciaciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"nuevo","nuevo","Nuevo"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"duplicar","duplicar","Duplicar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"copiar","copiar","Copiar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"ver_form","ver_form","Ver"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"recargar","recargar","Procesar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesarCalcularDepreciaciones,this.jTtoolBarProcesarCalcularDepreciaciones,
							"cerrar","cerrar","Salir"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesarCalcularDepreciaciones;
			
				this.jButtonProcesarInformacionToolBarProcesarCalcularDepreciaciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesarCalcularDepreciaciones;
				
		//protected JButton jButtonModificarToolBarProcesarCalcularDepreciaciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesarCalcularDepreciaciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesarCalcularDepreciaciones=new JMenuMe("General");
		this.jmenuArchivoProcesarCalcularDepreciaciones=new JMenuMe("Archivo");
		this.jmenuAccionesProcesarCalcularDepreciaciones=new JMenuMe("Acciones");
		this.jmenuDatosProcesarCalcularDepreciaciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesarCalcularDepreciaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesarCalcularDepreciaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesarCalcularDepreciaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesarCalcularDepreciaciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesarCalcularDepreciaciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesarCalcularDepreciaciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesarCalcularDepreciaciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesarCalcularDepreciaciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesarCalcularDepreciaciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesarCalcularDepreciaciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesarCalcularDepreciaciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesarCalcularDepreciaciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesarCalcularDepreciaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesarCalcularDepreciaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesarCalcularDepreciaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesarCalcularDepreciaciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesarCalcularDepreciaciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesarCalcularDepreciaciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesarCalcularDepreciaciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesarCalcularDepreciaciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesarCalcularDepreciaciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesarCalcularDepreciaciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesarCalcularDepreciaciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesarCalcularDepreciaciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesarCalcularDepreciaciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesarCalcularDepreciaciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesarCalcularDepreciaciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesarCalcularDepreciaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesarCalcularDepreciaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesarCalcularDepreciaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesarCalcularDepreciaciones.add(this.jMenuItemCerrarProcesarCalcularDepreciaciones);
			
			this.jmenuAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemNuevoProcesarCalcularDepreciaciones);
			this.jmenuAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones);
			this.jmenuAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemNuevoRelacionesProcesarCalcularDepreciaciones);
			this.jmenuAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones);		
			this.jmenuAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemDuplicarProcesarCalcularDepreciaciones);		
			this.jmenuAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemCopiarProcesarCalcularDepreciaciones);		
			this.jmenuAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemVerFormProcesarCalcularDepreciaciones);		
			
			this.jmenuDatosProcesarCalcularDepreciaciones.add(this.jMenuItemRecargarInformacionProcesarCalcularDepreciaciones);				
			this.jmenuDatosProcesarCalcularDepreciaciones.add(this.jMenuItemAnterioresProcesarCalcularDepreciaciones);				
			this.jmenuDatosProcesarCalcularDepreciaciones.add(this.jMenuItemSiguientesProcesarCalcularDepreciaciones);				
			this.jmenuDatosProcesarCalcularDepreciaciones.add(this.jMenuItemAbrirOrderByProcesarCalcularDepreciaciones);				
			this.jmenuDatosProcesarCalcularDepreciaciones.add(this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesarCalcularDepreciaciones.add(this.jmenuArchivoProcesarCalcularDepreciaciones);		
			this.jmenuBarProcesarCalcularDepreciaciones.add(this.jmenuAccionesProcesarCalcularDepreciaciones);		
			this.jmenuBarProcesarCalcularDepreciaciones.add(this.jmenuDatosProcesarCalcularDepreciaciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesarCalcularDepreciaciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesarCalcularDepreciaciones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setToolTipText("Procesar Procesar Calcular Depreciaciones");
		this.jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JButtonMe();
		this.jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setText("Procesar");
		this.jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setToolTipText("Procesar Procesar Calcular Depreciaciones");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,"buscar_button","Procesar Procesar Calcular Depreciaciones");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones = new JLabelMe();
		jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setText("Anio :");
		jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setToolTipText("Anio");
		jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JComboBoxMe();
		jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones = new JLabelMe();
		jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setText("Mes :");
		jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setToolTipText("Mes");
		jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JComboBoxMe();
		jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones = new JLabelMe();
		jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setText("Detalle Grupo Activo Fijo :");
		jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setToolTipText("Detalle Grupo Activo Fijo");
		jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones = new JLabelMe();
		jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setText("Sub Grupo Activo Fijo :");
		jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setToolTipText("Sub Grupo Activo Fijo");
		jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new JComboBoxMe();
		jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Procesar Calcular Depreciaciones"));
		this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesarCalcularDepreciaciones = new ProcesarCalcularDepreciacionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Procesar Calcular Depreciaciones DATOS");
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones = new ProcesarCalcularDepreciacionesDetalleFormJInternalFrame(jDesktopPane,this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones(),this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesarCalcularDepreciaciones = null;//new ProcesarCalcularDepreciacionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesarCalcularDepreciaciones= new GridBagLayout();
		
		
		this.jTableDatosProcesarCalcularDepreciaciones = new JTableMe();      
		
		String sToolTipProcesarCalcularDepreciaciones="";
		sToolTipProcesarCalcularDepreciaciones=ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesarCalcularDepreciaciones+="(ActivosFijos.ProcesarCalcularDepreciaciones)";
		}
		
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesarCalcularDepreciaciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesarCalcularDepreciaciones.setToolTipText(sToolTipProcesarCalcularDepreciaciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesarCalcularDepreciaciones);
		this.jTableDatosProcesarCalcularDepreciaciones.setAutoCreateRowSorter(true);
		this.jTableDatosProcesarCalcularDepreciaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesarCalcularDepreciaciones.setRowSelectionAllowed(true);
		this.jTableDatosProcesarCalcularDepreciaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonDuplicarProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonCopiarProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonVerFormProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonCerrarProcesarCalcularDepreciaciones = new JButtonMe();
		
		this.jScrollPanelDatosProcesarCalcularDepreciaciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Procesar Calcular Depreciaciones";
		
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Calcular Depreciacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesarCalcularDepreciaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesarCalcularDepreciaciones.setToolTipText("Acciones");
        this.jPanelAccionesProcesarCalcularDepreciaciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones=new ReporteDinamicoJInternalFrame(ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesarCalcularDepreciaciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesarCalcularDepreciaciones=new ImportacionJInternalFrame(ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesarCalcularDepreciaciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesarCalcularDepreciaciones = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.setText("Orden");
		this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesarCalcularDepreciaciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesarCalcularDepreciaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarCalcularDepreciaciones,false,this);
			
			//this.cargarOrderByProcesarCalcularDepreciaciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesarCalcularDepreciaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarCalcularDepreciaciones,true,this);
			
			//this.cargarOrderByProcesarCalcularDepreciaciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesarCalcularDepreciaciones.setText("Nuevo");
		this.jButtonDuplicarProcesarCalcularDepreciaciones.setText("Duplicar");
		this.jButtonCopiarProcesarCalcularDepreciaciones.setText("Copiar");
		this.jButtonVerFormProcesarCalcularDepreciaciones.setText("Ver");
		this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.setText("Guardar");
		this.jButtonCerrarProcesarCalcularDepreciaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesarCalcularDepreciaciones,"nuevo_button","Nuevo",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesarCalcularDepreciaciones,"duplicar_button","Duplicar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesarCalcularDepreciaciones,"copiar_button","Copiar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesarCalcularDepreciaciones,"ver_form","Ver",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones,"nuevorelaciones_button","Nuevo Rel",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones,"guardarcambiostabla_button","Guardar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesarCalcularDepreciaciones,"cerrar_button","Salir",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesarCalcularDepreciaciones.setToolTipText("Nuevo"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesarCalcularDepreciaciones.setToolTipText("Duplicar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesarCalcularDepreciaciones.setToolTipText("Copiar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesarCalcularDepreciaciones.setToolTipText("Ver"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.setToolTipText("Nuevo Rel"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.setToolTipText("Guardar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesarCalcularDepreciaciones.setToolTipText("Salir"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesarCalcularDepreciaciones";
		inputMap = this.jButtonNuevoProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesarCalcularDepreciaciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonDuplicarProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesarCalcularDepreciaciones"));
		
		//COPIAR
		sMapKey = "CopiarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonCopiarProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesarCalcularDepreciaciones"));
		
		//VEr FORM
		sMapKey = "VerFormProcesarCalcularDepreciaciones";
		inputMap = this.jButtonVerFormProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesarCalcularDepreciaciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesarCalcularDepreciaciones";
		inputMap = this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesarCalcularDepreciaciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonModificarProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesarCalcularDepreciaciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonCerrarProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesarCalcularDepreciaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesarCalcularDepreciaciones";
		inputMap = this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesarCalcularDepreciaciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesarCalcularDepreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesarCalcularDepreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesarCalcularDepreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesarCalcularDepreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesarCalcularDepreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setName("jPanelParametrosReportesProcesarCalcularDepreciaciones"); 
		
		this.jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones.setName("jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.setText("Procesar");
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.setToolTipText("Procesar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesarCalcularDepreciaciones,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones.setText("Procesar");
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones.setToolTipText("Procesar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones.setVisible(false);
			
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.setText("TIPO");       
		this.jComboBoxTiposReportesProcesarCalcularDepreciaciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.setText("Accion");
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setText("Accion");
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesarCalcularDepreciaciones = new JLabelMe();
		
		this.jLabelAccionesProcesarCalcularDepreciaciones.setText("Acciones");		
		this.jLabelAccionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesarCalcularDepreciaciones = new JButtonMe();
		//this.jButtonAnterioresProcesarCalcularDepreciaciones.setText("<<");
        this.jButtonAnterioresProcesarCalcularDepreciaciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesarCalcularDepreciaciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesarCalcularDepreciaciones = new JButtonMe();
		//this.jButtonSiguientesProcesarCalcularDepreciaciones.setText(">>");
        this.jButtonSiguientesProcesarCalcularDepreciaciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesarCalcularDepreciaciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones,"nuevoguardarcambios_button","Nue",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesarCalcularDepreciaciones";
		inputMap = this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesarCalcularDepreciaciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesarCalcularDepreciaciones";
		inputMap = this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesarCalcularDepreciaciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesarCalcularDepreciaciones";
		inputMap = this.jButtonSiguientesProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesarCalcularDepreciaciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesarCalcularDepreciaciones";
		inputMap = this.jButtonAnterioresProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesarCalcularDepreciaciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesarCalcularDepreciaciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(this.getWidth(),ProcesarCalcularDepreciacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarCalcularDepreciacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(this.getWidth(),ProcesarCalcularDepreciacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarCalcularDepreciacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(this.getWidth(),ProcesarCalcularDepreciacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarCalcularDepreciacionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesarCalcularDepreciaciones = new GridBagLayout();

			this.jPanelPaginacionProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutPaginacionProcesarCalcularDepreciaciones);						
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonAnterioresProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
					
						
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
			
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
						
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonSiguientesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonNuevoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
						
			
			
			if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
				this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
				this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			}
			
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonProcesarInformacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonDuplicarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonCopiarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonVerFormProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesarCalcularDepreciaciones.add(this.jButtonCerrarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
		
		
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesarCalcularDepreciaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesarCalcularDepreciaciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesarCalcularDepreciaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesarCalcularDepreciaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesarCalcularDepreciaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesarCalcularDepreciaciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setLayout(gridaBagParametrosReportesProcesarCalcularDepreciaciones);
			this.jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones.setLayout(gridaBagParametrosReportesAccionesProcesarCalcularDepreciaciones);
			
			
			this.jPanelParametrosAuxiliar1ProcesarCalcularDepreciaciones.setLayout(gridaBagParametrosAuxiliar1ProcesarCalcularDepreciaciones);
			this.jPanelParametrosAuxiliar2ProcesarCalcularDepreciaciones.setLayout(gridaBagParametrosAuxiliar2ProcesarCalcularDepreciaciones);
			this.jPanelParametrosAuxiliar3ProcesarCalcularDepreciaciones.setLayout(gridaBagParametrosAuxiliar3ProcesarCalcularDepreciaciones);
			this.jPanelParametrosAuxiliar4ProcesarCalcularDepreciaciones.setLayout(gridaBagParametrosAuxiliar4ProcesarCalcularDepreciaciones);
			//this.jPanelParametrosAuxiliar5ProcesarCalcularDepreciaciones.setLayout(gridaBagParametrosAuxiliar2ProcesarCalcularDepreciaciones);			
			
			
			
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jButtonRecargarInformacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarCalcularDepreciaciones.add(this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarCalcularDepreciaciones.add(this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarCalcularDepreciaciones.add(this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jPanelParametrosAuxiliar1ProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesarCalcularDepreciaciones.add(this.jComboBoxTiposReportesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jPanelParametrosAuxiliar4ProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jComboBoxTiposReportesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jCheckBoxGenerarReporteProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jPanelParametrosAuxiliar2ProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jLabelAccionesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);			
			
			
			/*
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesarCalcularDepreciaciones.add(this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);															
				
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesarCalcularDepreciaciones.add(this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jPanelParametrosAuxiliar3ProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarCalcularDepreciaciones.add(this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesarCalcularDepreciaciones = new GridBagLayout();

			this.jScrollPanelDatosProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutDatosProcesarCalcularDepreciaciones);
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
			
			this.jScrollPanelDatosProcesarCalcularDepreciaciones.add(this.jTableDatosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setViewportView(this.jTableDatosProcesarCalcularDepreciaciones);
		this.jTableDatosProcesarCalcularDepreciaciones.setFillsViewportHeight(true);
		this.jTableDatosProcesarCalcularDepreciaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesarCalcularDepreciaciones= new GridBagLayout();
		this.jPanelAccionesProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutAccionesProcesarCalcularDepreciaciones);
		
		
		/*	
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
			
		this.jPanelAccionesProcesarCalcularDepreciaciones.add(this.jButtonNuevoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones= new GridBagLayout();
		gridaBagLayoutBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);

		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jLabelid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);

		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jComboBoxid_anioBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);


		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jLabelid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);

		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 1;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jComboBoxid_mesBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);


		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 2;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jLabelid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);

		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 2;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jComboBoxid_detalle_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);


		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 3;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jLabelid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);

		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 3;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jComboBoxid_sub_grupo_activo_fijoBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);

		gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 4;
		gridBagConstraintsProcesarCalcularDepreciaciones.gridx =1;
		jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones.add(jButtonBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);

		jTabbedPaneBusquedasProcesarCalcularDepreciaciones.addTab("1.-Por Anio Por Mes Por Detalle Grupo Activo Fijo Por Sub Grupo Activo Fijo ", jPanelBusquedaProcesarCalcularDepreciacionesProcesarCalcularDepreciaciones);
		jTabbedPaneBusquedasProcesarCalcularDepreciaciones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesarCalcularDepreciaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesarCalcularDepreciaciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();						
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;		
			//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;		
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);								
		
		
		/*
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		*/		
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
				
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesarCalcularDepreciaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesarCalcularDepreciaciones = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutBusquedasParametrosProcesarCalcularDepreciaciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			
			
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
			
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesarCalcularDepreciaciones.setVisible(false);
		this.jButtonAnterioresProcesarCalcularDepreciaciones.setVisible(false);
		this.jButtonSiguientesProcesarCalcularDepreciaciones.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesarCalcularDepreciaciones.setVisible(false);
		this.jCheckBoxSeleccionadosProcesarCalcularDepreciaciones.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesarCalcularDepreciaciones.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesarCalcularDepreciaciones.setVisible(false);
		this.jComboBoxTiposReportesProcesarCalcularDepreciaciones.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesarCalcularDepreciaciones.setVisible(false);
		this.jComboBoxTiposPaginacionProcesarCalcularDepreciaciones.setVisible(false);
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones.setVisible(false);
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.setVisible(false);
		
		this.jPanelParametrosReportesProcesarCalcularDepreciaciones.setVisible(false);
		
		
		this.jTtoolBarProcesarCalcularDepreciaciones.setVisible(false);
			
		this.jMenuItemAnterioresProcesarCalcularDepreciaciones.setVisible(false);
		this.jMenuItemSiguientesProcesarCalcularDepreciaciones.setVisible(false);
		this.jMenuItemAbrirOrderByProcesarCalcularDepreciaciones.setVisible(false);
		this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesarCalcularDepreciaciones.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesarCalcularDepreciaciones.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesarCalcularDepreciaciones.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesarCalcularDepreciaciones.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesarCalcularDepreciaciones.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones.setVisible(false);
		this.jMenuItemRecargarInformacionProcesarCalcularDepreciaciones.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesarCalcularDepreciaciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesarCalcularDepreciaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.setName("jPanelReporteDinamicoProcesarCalcularDepreciaciones"); 
		
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutReporteDinamicoProcesarCalcularDepreciaciones);
		
		
		this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Calcular Depreciacioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesarCalcularDepreciaciones = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesarCalcularDepreciaciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jLabelColumnasSelectReporteProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesarCalcularDepreciaciones = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesarCalcularDepreciaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesarCalcularDepreciaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones=new JScrollPane(this.jListColumnasSelectReporteProcesarCalcularDepreciaciones);
			
			this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jListColumnasSelectReporteProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesarCalcularDepreciaciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesarCalcularDepreciaciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesarCalcularDepreciaciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesarCalcularDepreciaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesarCalcularDepreciaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesarCalcularDepreciaciones=new JScrollPane(this.jListRelacionesSelectReporteProcesarCalcularDepreciaciones);
			
			this.jScrollRelacionesSelectReporteProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesarCalcularDepreciaciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesarCalcularDepreciaciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesarCalcularDepreciaciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jLabelGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones.setToolTipText("Generar EXCEL"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jButtonGenerarExcelReporteDinamicoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jComboBoxTiposReportesDinamicoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesarCalcularDepreciaciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesarCalcularDepreciaciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jLabelTiposArchivoReporteDinamicoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jComboBoxTiposArchivosReportesDinamicoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesarCalcularDepreciaciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesarCalcularDepreciaciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesarCalcularDepreciaciones.setToolTipText("Generar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jButtonGenerarReporteDinamicoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesarCalcularDepreciaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesarCalcularDepreciaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesarCalcularDepreciaciones.setToolTipText("Cancelar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarCalcularDepreciaciones.add(this.jButtonCerrarReporteDinamicoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesarCalcularDepreciaciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones= new JScrollPane(jPanelReporteDinamicoProcesarCalcularDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Calcular Depreciacioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesarCalcularDepreciaciones);
		this.jInternalFrameReporteDinamicoProcesarCalcularDepreciaciones.getContentPane().add(this.jScrollPanelReporteDinamicoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesarCalcularDepreciaciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesarCalcularDepreciaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesarCalcularDepreciaciones.setName("jPanelImportacionProcesarCalcularDepreciaciones"); 
		
		this.jPanelImportacionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutImportacionProcesarCalcularDepreciaciones);
		
		
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesarCalcularDepreciaciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesarCalcularDepreciaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setResizable(true);
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setClosable(true);
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setResizable(true);
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setClosable(true);
	    this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Calcular Depreciacioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesarCalcularDepreciaciones = new JLabelMe();

		this.jLabelArchivoImportacionProcesarCalcularDepreciaciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesarCalcularDepreciaciones.add(this.jLabelArchivoImportacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesarCalcularDepreciaciones = new JFileChooser();		
		this.jFileChooserImportacionProcesarCalcularDepreciaciones.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonAbrirImportacionProcesarCalcularDepreciaciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesarCalcularDepreciaciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesarCalcularDepreciaciones.setToolTipText("Generar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarCalcularDepreciaciones.add(this.jButtonAbrirImportacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesarCalcularDepreciaciones = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesarCalcularDepreciaciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesarCalcularDepreciaciones.add(this.jLabelPathArchivoImportacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesarCalcularDepreciaciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarCalcularDepreciaciones.add(this.jTextFieldPathArchivoImportacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonGenerarImportacionProcesarCalcularDepreciaciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesarCalcularDepreciaciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesarCalcularDepreciaciones.setToolTipText("Generar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarCalcularDepreciaciones.add(this.jButtonGenerarImportacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonCerrarImportacionProcesarCalcularDepreciaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesarCalcularDepreciaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesarCalcularDepreciaciones.setToolTipText("Cancelar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarCalcularDepreciaciones.add(this.jButtonCerrarImportacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesarCalcularDepreciaciones = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesarCalcularDepreciaciones= new JScrollPane(jPanelImportacionProcesarCalcularDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesarCalcularDepreciaciones);
		this.jInternalFrameImportacionProcesarCalcularDepreciaciones.getContentPane().add(this.jScrollPanelImportacionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesarCalcularDepreciaciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesarCalcularDepreciaciones = new JButtonMe();
			this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.setText("Orden");
			this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesarCalcularDepreciaciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesarCalcularDepreciaciones";
			inputMap = this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesarCalcularDepreciaciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesarCalcularDepreciaciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesarCalcularDepreciaciones.setName("jPanelOrderByProcesarCalcularDepreciaciones"); 
			
			this.jPanelOrderByProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutOrderByProcesarCalcularDepreciaciones);
			
			
			this.jTableDatosProcesarCalcularDepreciacionesOrderBy = new JTableMe();        
			this.jTableDatosProcesarCalcularDepreciacionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesarCalcularDepreciacionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesarCalcularDepreciacionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesarCalcularDepreciacionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesarCalcularDepreciacionesOrderBy.setViewportView(this.jTableDatosProcesarCalcularDepreciacionesOrderBy);
			this.jTableDatosProcesarCalcularDepreciacionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesarCalcularDepreciacionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesarCalcularDepreciaciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesarCalcularDepreciaciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setTitle("Orden");
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setResizable(true);
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setClosable(true);
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Calcular Depreciacioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesarCalcularDepreciaciones.ipady =150;
				
			this.jPanelOrderByProcesarCalcularDepreciaciones.add(jScrollPanelDatosProcesarCalcularDepreciacionesOrderBy, this.gridBagConstraintsProcesarCalcularDepreciaciones);//this.jTableDatosProcesarCalcularDepreciacionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesarCalcularDepreciaciones = new JButtonMe();
			this.jButtonCerrarOrderByProcesarCalcularDepreciaciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesarCalcularDepreciaciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesarCalcularDepreciaciones.setToolTipText("Cancelar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesarCalcularDepreciaciones.add(this.jButtonCerrarOrderByProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesarCalcularDepreciaciones = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesarCalcularDepreciaciones= new JScrollPane(jPanelOrderByProcesarCalcularDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesarCalcularDepreciaciones);
			
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getContentPane().add(this.jScrollPanelOrderByProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);			
		
		} else {
			this.jButtonAbrirOrderByProcesarCalcularDepreciaciones = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesarCalcularDepreciaciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesarCalcularDepreciaciones.getRowHeight();//ProcesarCalcularDepreciacionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesarCalcularDepreciacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones.isSelected()) {
					iHeightTable=ProcesarCalcularDepreciacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesarCalcularDepreciacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesarCalcularDepreciacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesarCalcularDepreciacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesarCalcularDepreciaciones.isSelected()) {
					iHeightTable=ProcesarCalcularDepreciacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesarCalcularDepreciacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesarCalcularDepreciacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesarCalcularDepreciaciones!=null && this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy()!=null) {
			//if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesarCalcularDepreciaciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesarcalculardepreciacionesLogic.getProcesarCalcularDepreciacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarcalculardepreciacioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesarCalcularDepreciaciones> TraerProcesarCalcularDepreciacionesBeans(List<ProcesarCalcularDepreciaciones> procesarcalculardepreciacioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesarCalcularDepreciaciones procesarcalculardepreciaciones:procesarcalculardepreciacioness) {
					
				if(!(ProcesarCalcularDepreciacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesarCalcularDepreciacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesarcalculardepreciaciones.setsDetalleGeneralEntityReporte(ProcesarCalcularDepreciacionesConstantesFunciones.getProcesarCalcularDepreciacionesDescripcion(procesarcalculardepreciaciones));
										
						
					
						
					
				} else  {
							
					//procesarcalculardepreciaciones.setsDetalleGeneralEntityReporte(procesarcalculardepreciaciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesarcalculardepreciacionesbeans.add(procesarcalculardepreciacionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesarcalculardepreciacioness;
    }
	//PARA REPORTES FIN
}
