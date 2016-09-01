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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ProcesoCierrePeriodoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ProcesoCierrePeriodoJInternalFrame extends ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCierrePeriodo;
	
	protected JMenuBar jmenuBarProcesoCierrePeriodo;
	
	protected JMenu jmenuProcesoCierrePeriodo;
	protected JMenu jmenuDatosProcesoCierrePeriodo;
	protected JMenu jmenuArchivoProcesoCierrePeriodo;
	protected JMenu jmenuAccionesProcesoCierrePeriodo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierrePeriodo;	
	protected GridBagConstraints gridBagConstraintsProcesoCierrePeriodo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCierrePeriodoDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCierrePeriodo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCierrePeriodo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCierrePeriodo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EstadoPeriodoBeanSwingJInternalFrame estadoperiodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoperiodo="";
	
	public ProcesoCierrePeriodoSessionBean procesocierreperiodoSessionBean;
		
	
	
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EstadoPeriodoSessionBean estadoperiodoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCierrePeriodo> procesocierreperiodos;		
	public List<ProcesoCierrePeriodo> procesocierreperiodosEliminados;	
	public List<ProcesoCierrePeriodo> procesocierreperiodosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCierrePeriodo;		
	protected JButton jButtonAbrirOrderByProcesoCierrePeriodo;
	
	
	//protected JPanel jPanelOrderByProcesoCierrePeriodo;
	//public JScrollPane jScrollPanelOrderByProcesoCierrePeriodo;	
	//protected JButton jButtonCerrarOrderByProcesoCierrePeriodo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCierrePeriodoLogic procesocierreperiodoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCierrePeriodo;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierrePeriodo;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierrePeriodo;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCierrePeriodoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCierrePeriodo;
	//public JScrollPane jScrollPanelImportacionProcesoCierrePeriodo;
	
	
	
	protected JPanel jPanelAccionesProcesoCierrePeriodo;
	
    protected JPanel jPanelPaginacionProcesoCierrePeriodo;
    protected JPanel jPanelParametrosReportesProcesoCierrePeriodo;
	protected JPanel jPanelParametrosReportesAccionesProcesoCierrePeriodo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCierrePeriodo;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCierrePeriodo;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCierrePeriodo;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCierrePeriodo;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCierrePeriodo;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCierrePeriodo;
	//protected JPanel jPanelImportacionProcesoCierrePeriodo;
	
	
	public JTable jTableDatosProcesoCierrePeriodo;
	
	
	
	//public JTable jTableDatosProcesoCierrePeriodoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCierrePeriodo;
	protected JButton jButtonDuplicarProcesoCierrePeriodo;
	protected JButton jButtonCopiarProcesoCierrePeriodo;
	protected JButton jButtonVerFormProcesoCierrePeriodo;
	protected JButton jButtonNuevoRelacionesProcesoCierrePeriodo;
	protected JButton jButtonModificarProcesoCierrePeriodo;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCierrePeriodo;
	protected JButton jButtonCerrarProcesoCierrePeriodo;
	
	
	protected JButton jButtonRecargarInformacionProcesoCierrePeriodo;
	protected JButton jButtonProcesarInformacionProcesoCierrePeriodo;
	
	
	protected JButton jButtonAnterioresProcesoCierrePeriodo;
	protected JButton jButtonSiguientesProcesoCierrePeriodo;
	protected JButton jButtonNuevoGuardarCambiosProcesoCierrePeriodo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCierrePeriodo;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCierrePeriodo;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodo;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCierrePeriodo;
	//protected JButton jButtonGenerarImportacionProcesoCierrePeriodo;
	//protected JButton jButtonCerrarImportacionProcesoCierrePeriodo;
	//protected JFileChooser jFileChooserImportacionProcesoCierrePeriodo;
	//protected File fileImportacionProcesoCierrePeriodo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierrePeriodo;
	protected JButton jButtonDuplicarToolBarProcesoCierrePeriodo;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCierrePeriodo;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCierrePeriodo;
	protected JButton jButtonCopiarToolBarProcesoCierrePeriodo;
	protected JButton jButtonVerFormToolBarProcesoCierrePeriodo;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCierrePeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierrePeriodo;
	protected JButton jButtonCerrarToolBarProcesoCierrePeriodo;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCierrePeriodo;
	protected JButton jButtonProcesarInformacionToolBarProcesoCierrePeriodo;
	protected JButton jButtonAnterioresToolBarProcesoCierrePeriodo;
	protected JButton jButtonSiguientesToolBarProcesoCierrePeriodo;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCierrePeriodo;
	protected JButton jButtonAbrirOrderByToolBarProcesoCierrePeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierrePeriodo;
	protected JMenuItem jMenuItemDuplicarProcesoCierrePeriodo;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCierrePeriodo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCierrePeriodo;
	protected JMenuItem jMenuItemCopiarProcesoCierrePeriodo;
	protected JMenuItem jMenuItemVerFormProcesoCierrePeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierrePeriodo;
	protected JMenuItem jMenuItemCerrarProcesoCierrePeriodo;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierrePeriodo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierrePeriodo;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCierrePeriodo;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierrePeriodo;
	protected JMenuItem jMenuItemAnterioresProcesoCierrePeriodo;
	protected JMenuItem jMenuItemSiguientesProcesoCierrePeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCierrePeriodo;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierrePeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierrePeriodo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCierrePeriodo;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCierrePeriodo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCierrePeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCierrePeriodo;
	protected JTextField jTextFieldValorCampoGeneralProcesoCierrePeriodo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCierrePeriodo;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCierrePeriodo;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCierrePeriodo;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCierrePeriodo;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCierrePeriodo;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCierrePeriodo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCierrePeriodo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCierrePeriodo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCierrePeriodo;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCierrePeriodo;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCierrePeriodo;	
	//public JLabel jLabelPathArchivoImportacionProcesoCierrePeriodo;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCierrePeriodo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCierrePeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCierrePeriodo;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCierrePeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCierrePeriodo;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCierrePeriodo;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCierrePeriodo;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCierrePeriodo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCierrePeriodo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCierrePeriodo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCierrePeriodo;
	public JPanel jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	public JButton jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	
	public JPanel jPanelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	public JLabel jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	public JLabel jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo= new JButtonMe();
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodoUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	public JLabel jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo;
	public JButton jButtonid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo= new JButtonMe();
	public JButton jButtonid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodoUpdate= new JButtonMe();
	public JButton jButtonid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoCierrePeriodoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierrePeriodoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierrePeriodoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierrePeriodoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCierrePeriodo)	{
		this.jButtonRecargarInformacionProcesoCierrePeriodo = jButtonRecargarInformacionProcesoCierrePeriodo;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCierrePeriodo() {
		return this.jButtonProcesarInformacionProcesoCierrePeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierrePeriodo)	{
		this.jButtonProcesarInformacionProcesoCierrePeriodo = jButtonProcesarInformacionProcesoCierrePeriodo;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCierrePeriodo() {
		return this.jButtonRecargarInformacionProcesoCierrePeriodo;
	}
	
	
	public List<ProcesoCierrePeriodo> getprocesocierreperiodos() {
		return this.procesocierreperiodos;
	}

	public void setprocesocierreperiodos(List<ProcesoCierrePeriodo> procesocierreperiodos) {
		this.procesocierreperiodos = procesocierreperiodos;
	}
	
	public List<ProcesoCierrePeriodo> getprocesocierreperiodosAux() {
		return this.procesocierreperiodosAux;
	}

	public void setprocesocierreperiodosAux(List<ProcesoCierrePeriodo> procesocierreperiodosAux) {
		this.procesocierreperiodosAux = procesocierreperiodosAux;
	}
	
	public List<ProcesoCierrePeriodo> getprocesocierreperiodosEliminados() {
		return this.procesocierreperiodosEliminados;
	}

	public void setProcesoCierrePeriodosEliminados(List<ProcesoCierrePeriodo> procesocierreperiodosEliminados) {
		this.procesocierreperiodosEliminados = procesocierreperiodosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCierrePeriodo() {
		return jComboBoxTiposSeleccionarProcesoCierrePeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCierrePeriodo(
			JComboBox jComboBoxTiposSeleccionarProcesoCierrePeriodo) {
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo = jComboBoxTiposSeleccionarProcesoCierrePeriodo;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCierrePeriodo() {
		return jTextFieldValorCampoGeneralProcesoCierrePeriodo;
	}

	public void setjTextFieldValorCampoGeneralProcesoCierrePeriodo(
			JTextField jTextFieldValorCampoGeneralProcesoCierrePeriodo) {
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo = jTextFieldValorCampoGeneralProcesoCierrePeriodo;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCierrePeriodo() {
		return this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCierrePeriodo(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCierrePeriodo) {
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo = jCheckBoxSeleccionarTodosProcesoCierrePeriodo;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCierrePeriodo() {
		return this.jCheckBoxSeleccionadosProcesoCierrePeriodo;
	}

	public void setjCheckBoxSeleccionadosProcesoCierrePeriodo(
			JCheckBox jCheckBoxSeleccionadosProcesoCierrePeriodo) {
		this.jCheckBoxSeleccionadosProcesoCierrePeriodo = jCheckBoxSeleccionadosProcesoCierrePeriodo;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCierrePeriodo() {
		return this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCierrePeriodo(
			JComboBox jComboBoxTiposArchivosReportesProcesoCierrePeriodo) {
		this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo = jComboBoxTiposArchivosReportesProcesoCierrePeriodo;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCierrePeriodo() {
		return this.jComboBoxTiposReportesProcesoCierrePeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCierrePeriodo(
			JComboBox jComboBoxTiposReportesProcesoCierrePeriodo) {
		this.jComboBoxTiposReportesProcesoCierrePeriodo = jComboBoxTiposReportesProcesoCierrePeriodo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCierrePeriodo() {
	//	return jComboBoxTiposReportesDinamicoProcesoCierrePeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCierrePeriodo(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCierrePeriodo) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCierrePeriodo = jComboBoxTiposReportesDinamicoProcesoCierrePeriodo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo = jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCierrePeriodo() {
		return this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCierrePeriodo(
			JComboBox jComboBoxTiposGraficosReportesProcesoCierrePeriodo) {
		this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo = jComboBoxTiposGraficosReportesProcesoCierrePeriodo;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCierrePeriodo() {
		return this.jComboBoxTiposPaginacionProcesoCierrePeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCierrePeriodo(
			JComboBox jComboBoxTiposPaginacionProcesoCierrePeriodo) {
		this.jComboBoxTiposPaginacionProcesoCierrePeriodo = jComboBoxTiposPaginacionProcesoCierrePeriodo;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCierrePeriodo() {
		return this.jComboBoxTiposRelacionesProcesoCierrePeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierrePeriodo() {
		return this.jComboBoxTiposAccionesProcesoCierrePeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierrePeriodo(
			JComboBox jComboBoxTiposRelacionesProcesoCierrePeriodo) {
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo = jComboBoxTiposRelacionesProcesoCierrePeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierrePeriodo(
			JComboBox jComboBoxTiposAccionesProcesoCierrePeriodo) {
		this.jComboBoxTiposAccionesProcesoCierrePeriodo = jComboBoxTiposAccionesProcesoCierrePeriodo;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCierrePeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCierrePeriodo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCierrePeriodo() {
	//	return jCheckBoxConGraficoDinamicoProcesoCierrePeriodo;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCierrePeriodo(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCierrePeriodo) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCierrePeriodo = jCheckBoxConGraficoDinamicoProcesoCierrePeriodo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCierrePeriodo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCierrePeriodo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCierrePeriodo .setBorder(borderResaltar);		
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
		this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean();
		
		this.procesocierreperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierreperiodoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCierrePeriodoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCierrePeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierrePeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierrePeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierrePeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cierre Periodo Mensual MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCierrePeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCierrePeriodo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"copiar","copiar","Copiar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"ver_form","ver_form","Ver"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"recargar","recargar","PROCESAR"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"PROCESAR",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,
							"cerrar","cerrar","Salir"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCierrePeriodo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCierrePeriodo;
			
				this.jButtonProcesarInformacionToolBarProcesoCierrePeriodo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCierrePeriodo;
				
		//protected JButton jButtonModificarToolBarProcesoCierrePeriodo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCierrePeriodo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCierrePeriodo=new JMenuMe("General");
		this.jmenuArchivoProcesoCierrePeriodo=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCierrePeriodo=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCierrePeriodo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierrePeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierrePeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierrePeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCierrePeriodo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCierrePeriodo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCierrePeriodo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCierrePeriodo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCierrePeriodo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCierrePeriodo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCierrePeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierrePeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierrePeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCierrePeriodo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCierrePeriodo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCierrePeriodo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCierrePeriodo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCierrePeriodo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCierrePeriodo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierrePeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierrePeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierrePeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCierrePeriodo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCierrePeriodo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCierrePeriodo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCierrePeriodo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCierrePeriodo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCierrePeriodo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCierrePeriodo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCierrePeriodo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCierrePeriodo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCierrePeriodo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCierrePeriodo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCierrePeriodo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCierrePeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCierrePeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCierrePeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierrePeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierrePeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierrePeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCierrePeriodo.add(this.jMenuItemCerrarProcesoCierrePeriodo);
			
			this.jmenuAccionesProcesoCierrePeriodo.add(this.jMenuItemNuevoProcesoCierrePeriodo);
			this.jmenuAccionesProcesoCierrePeriodo.add(this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo);
			this.jmenuAccionesProcesoCierrePeriodo.add(this.jMenuItemNuevoRelacionesProcesoCierrePeriodo);
			this.jmenuAccionesProcesoCierrePeriodo.add(this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo);		
			this.jmenuAccionesProcesoCierrePeriodo.add(this.jMenuItemDuplicarProcesoCierrePeriodo);		
			this.jmenuAccionesProcesoCierrePeriodo.add(this.jMenuItemCopiarProcesoCierrePeriodo);		
			this.jmenuAccionesProcesoCierrePeriodo.add(this.jMenuItemVerFormProcesoCierrePeriodo);		
			
			this.jmenuDatosProcesoCierrePeriodo.add(this.jMenuItemRecargarInformacionProcesoCierrePeriodo);				
			this.jmenuDatosProcesoCierrePeriodo.add(this.jMenuItemAnterioresProcesoCierrePeriodo);				
			this.jmenuDatosProcesoCierrePeriodo.add(this.jMenuItemSiguientesProcesoCierrePeriodo);				
			this.jmenuDatosProcesoCierrePeriodo.add(this.jMenuItemAbrirOrderByProcesoCierrePeriodo);				
			this.jmenuDatosProcesoCierrePeriodo.add(this.jMenuItemMostrarOcultarProcesoCierrePeriodo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCierrePeriodo.add(this.jMenuItemGuardarCambiosProcesoCierrePeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCierrePeriodo.add(this.jmenuArchivoProcesoCierrePeriodo);		
			this.jmenuBarProcesoCierrePeriodo.add(this.jmenuAccionesProcesoCierrePeriodo);		
			this.jmenuBarProcesoCierrePeriodo.add(this.jmenuDatosProcesoCierrePeriodo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCierrePeriodo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCierrePeriodo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setToolTipText("PROCESAR Por Ejercicio Por Periodo Por Estado Periodo ");
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo= new JButtonMe();
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setText("PROCESAR");
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setToolTipText("PROCESAR Por Ejercicio Por Periodo Por Estado Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,"buscar_button","PROCESAR Por Ejercicio Por Periodo Por Estado Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo = new JLabelMe();
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo = new JLabelMe();
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setText("Periodo :");
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setToolTipText("Periodo");
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo= new JComboBoxMe();
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo = new JLabelMe();
		jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setText("Estado Periodo :");
		jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setToolTipText("Estado Periodo");
		jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo= new JComboBoxMe();
		jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoCierrePeriodo=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCierrePeriodo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoCierrePeriodo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoCierrePeriodo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoCierrePeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCierrePeriodo = new ProcesoCierrePeriodoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cierre Periodo Mensual DATOS");
			this.jInternalFrameDetalleFormProcesoCierrePeriodo = new ProcesoCierrePeriodoDetalleFormJInternalFrame(jDesktopPane,this.procesocierreperiodoSessionBean.getConGuardarRelaciones(),this.procesocierreperiodoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo = null;//new ProcesoCierrePeriodoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierrePeriodo= new GridBagLayout();
		
		
		this.jTableDatosProcesoCierrePeriodo = new JTableMe();      
		
		String sToolTipProcesoCierrePeriodo="";
		sToolTipProcesoCierrePeriodo=ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierrePeriodo+="(Contabilidad.ProcesoCierrePeriodo)";
		}
		
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierrePeriodo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCierrePeriodo.setToolTipText(sToolTipProcesoCierrePeriodo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCierrePeriodo);
		this.jTableDatosProcesoCierrePeriodo.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCierrePeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCierrePeriodo.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCierrePeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCierrePeriodo = new JButtonMe();
		this.jButtonDuplicarProcesoCierrePeriodo = new JButtonMe();
		this.jButtonCopiarProcesoCierrePeriodo = new JButtonMe();
		this.jButtonVerFormProcesoCierrePeriodo = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCierrePeriodo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo = new JButtonMe();
		this.jButtonCerrarProcesoCierrePeriodo = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierrePeriodo = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCierrePeriodo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cierre Periodo Mensual";
		
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Periodo Mensuales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierrePeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierrePeriodo.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierrePeriodo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCierrePeriodo=new ReporteDinamicoJInternalFrame(ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCierrePeriodo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCierrePeriodo=new ImportacionJInternalFrame(ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCierrePeriodo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCierrePeriodo = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCierrePeriodo.setText("Orden");
		this.jButtonAbrirOrderByProcesoCierrePeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierrePeriodo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierrePeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierrePeriodo,false,this);
			
			//this.cargarOrderByProcesoCierrePeriodo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierrePeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierrePeriodo,true,this);
			
			//this.cargarOrderByProcesoCierrePeriodo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCierrePeriodo.setMinimumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoCierrePeriodo.setMaximumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoCierrePeriodo.setPreferredSize(new Dimension(400,50));//230
		
		this.jScrollPanelDatosProcesoCierrePeriodo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierrePeriodo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierrePeriodo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCierrePeriodo.setText("Nuevo");
		this.jButtonDuplicarProcesoCierrePeriodo.setText("Duplicar");
		this.jButtonCopiarProcesoCierrePeriodo.setText("Copiar");
		this.jButtonVerFormProcesoCierrePeriodo.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCierrePeriodo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.setText("Guardar");
		this.jButtonCerrarProcesoCierrePeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierrePeriodo,"nuevo_button","Nuevo",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCierrePeriodo,"duplicar_button","Duplicar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCierrePeriodo,"copiar_button","Copiar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCierrePeriodo,"ver_form","Ver",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCierrePeriodo,"nuevorelaciones_button","Nuevo Rel",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierrePeriodo,"guardarcambiostabla_button","Guardar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierrePeriodo,"cerrar_button","Salir",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCierrePeriodo.setToolTipText("Nuevo"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCierrePeriodo.setToolTipText("Duplicar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCierrePeriodo.setToolTipText("Copiar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCierrePeriodo.setToolTipText("Ver"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCierrePeriodo.setToolTipText("Nuevo Rel"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.setToolTipText("Guardar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierrePeriodo.setToolTipText("Salir"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierrePeriodo";
		inputMap = this.jButtonNuevoProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierrePeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierrePeriodo"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCierrePeriodo";
		inputMap = this.jButtonDuplicarProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCierrePeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCierrePeriodo"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCierrePeriodo";
		inputMap = this.jButtonCopiarProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCierrePeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCierrePeriodo"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCierrePeriodo";
		inputMap = this.jButtonVerFormProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCierrePeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCierrePeriodo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCierrePeriodo";
		inputMap = this.jButtonNuevoRelacionesProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCierrePeriodo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCierrePeriodo";
		inputMap = this.jButtonModificarProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCierrePeriodo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierrePeriodo";
		inputMap = this.jButtonCerrarProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierrePeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierrePeriodo";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierrePeriodo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCierrePeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCierrePeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCierrePeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCierrePeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCierrePeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCierrePeriodo.setName("jPanelParametrosReportesProcesoCierrePeriodo"); 
		
		this.jPanelParametrosReportesAccionesProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCierrePeriodo.setName("jPanelParametrosReportesAccionesProcesoCierrePeriodo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCierrePeriodo = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCierrePeriodo.setText("PROCESAR");
		this.jButtonRecargarInformacionProcesoCierrePeriodo.setToolTipText("PROCESAR"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCierrePeriodo,"recargar_button","PROCESAR");		
		
		
		this.jButtonRecargarInformacionProcesoCierrePeriodo.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCierrePeriodo = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCierrePeriodo.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCierrePeriodo.setToolTipText("Procesar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCierrePeriodo.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCierrePeriodo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierrePeriodo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierrePeriodo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCierrePeriodo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCierrePeriodo.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCierrePeriodo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCierrePeriodo.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierrePeriodo.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCierrePeriodo = new JLabelMe();
		
		this.jLabelAccionesProcesoCierrePeriodo.setText("Acciones");		
		this.jLabelAccionesProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCierrePeriodo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCierrePeriodo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCierrePeriodo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCierrePeriodo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCierrePeriodo.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCierrePeriodo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCierrePeriodo = new JButtonMe();
		//this.jButtonAnterioresProcesoCierrePeriodo.setText("<<");
        this.jButtonAnterioresProcesoCierrePeriodo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCierrePeriodo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCierrePeriodo = new JButtonMe();
		//this.jButtonSiguientesProcesoCierrePeriodo.setText(">>");
        this.jButtonSiguientesProcesoCierrePeriodo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCierrePeriodo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo,"nuevoguardarcambios_button","Nue",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCierrePeriodo";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCierrePeriodo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCierrePeriodo";
		inputMap = this.jButtonRecargarInformacionProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCierrePeriodo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCierrePeriodo";
		inputMap = this.jButtonSiguientesProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCierrePeriodo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCierrePeriodo";
		inputMap = this.jButtonAnterioresProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCierrePeriodo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCierrePeriodo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCierrePeriodo.setMinimumSize(new Dimension(this.getWidth(),ProcesoCierrePeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierrePeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierrePeriodo.setMaximumSize(new Dimension(this.getWidth(),ProcesoCierrePeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierrePeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierrePeriodo.setPreferredSize(new Dimension(this.getWidth(),ProcesoCierrePeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierrePeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCierrePeriodo = new GridBagLayout();

			this.jPanelPaginacionProcesoCierrePeriodo.setLayout(gridaBagLayoutPaginacionProcesoCierrePeriodo);						
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonAnterioresProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
					
						
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
			
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
						
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonSiguientesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonNuevoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
						
			
			
			if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
				this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonGuardarCambiosTablaProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			}
			
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonProcesarInformacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonDuplicarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonCopiarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonVerFormProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCierrePeriodo.add(this.jButtonCerrarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
		
		
		this.jButtonRecargarInformacionProcesoCierrePeriodo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierrePeriodo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierrePeriodo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCierrePeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierrePeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierrePeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCierrePeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierrePeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierrePeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCierrePeriodo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierrePeriodo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierrePeriodo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCierrePeriodo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierrePeriodo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierrePeriodo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCierrePeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCierrePeriodo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCierrePeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCierrePeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCierrePeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCierrePeriodo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCierrePeriodo.setLayout(gridaBagParametrosReportesProcesoCierrePeriodo);
			this.jPanelParametrosReportesAccionesProcesoCierrePeriodo.setLayout(gridaBagParametrosReportesAccionesProcesoCierrePeriodo);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCierrePeriodo.setLayout(gridaBagParametrosAuxiliar1ProcesoCierrePeriodo);
			this.jPanelParametrosAuxiliar2ProcesoCierrePeriodo.setLayout(gridaBagParametrosAuxiliar2ProcesoCierrePeriodo);
			this.jPanelParametrosAuxiliar3ProcesoCierrePeriodo.setLayout(gridaBagParametrosAuxiliar3ProcesoCierrePeriodo);
			this.jPanelParametrosAuxiliar4ProcesoCierrePeriodo.setLayout(gridaBagParametrosAuxiliar4ProcesoCierrePeriodo);
			//this.jPanelParametrosAuxiliar5ProcesoCierrePeriodo.setLayout(gridaBagParametrosAuxiliar2ProcesoCierrePeriodo);			
			
			
			
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jButtonRecargarInformacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierrePeriodo.add(this.jComboBoxTiposPaginacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierrePeriodo.add(this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierrePeriodo.add(this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jPanelParametrosAuxiliar1ProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCierrePeriodo.add(this.jComboBoxTiposReportesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jPanelParametrosAuxiliar4ProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jComboBoxTiposReportesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jCheckBoxGenerarReporteProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jPanelParametrosAuxiliar2ProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jLabelAccionesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jComboBoxTiposSeleccionarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);			
			
			
			/*
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierrePeriodo.add(this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);															
				
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierrePeriodo.add(this.jCheckBoxSeleccionadosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jPanelParametrosAuxiliar3ProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierrePeriodo.add(this.jComboBoxTiposAccionesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCierrePeriodo = new GridBagLayout();

			this.jScrollPanelDatosProcesoCierrePeriodo.setLayout(gridaBagLayoutDatosProcesoCierrePeriodo);
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
			
			this.jScrollPanelDatosProcesoCierrePeriodo.add(this.jTableDatosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCierrePeriodo.setViewportView(this.jTableDatosProcesoCierrePeriodo);
		this.jTableDatosProcesoCierrePeriodo.setFillsViewportHeight(true);
		this.jTableDatosProcesoCierrePeriodo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierrePeriodo= new GridBagLayout();
		this.jPanelAccionesProcesoCierrePeriodo.setLayout(gridaBagLayoutAccionesProcesoCierrePeriodo);
		
		
		/*	
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
			
		this.jPanelAccionesProcesoCierrePeriodo.add(this.jButtonNuevoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setLayout(gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);

		gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.add(jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);

		gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		gridBagConstraintsProcesoCierrePeriodo.gridx = 1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.add(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);


		gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
		gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.add(jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);

		gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierrePeriodo.gridy = 1;
		gridBagConstraintsProcesoCierrePeriodo.gridx = 1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.add(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);


		gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierrePeriodo.gridy = 2;
		gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.add(jLabelid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);

		gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierrePeriodo.gridy = 2;
		gridBagConstraintsProcesoCierrePeriodo.gridx = 1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.add(jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);

		gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierrePeriodo.gridy = 3;
		gridBagConstraintsProcesoCierrePeriodo.gridx =1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.add(jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);

		jTabbedPaneBusquedasProcesoCierrePeriodo.addTab("1.-Por Ejercicio Por Periodo Por Estado Periodo ", jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
		jTabbedPaneBusquedasProcesoCierrePeriodo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierrePeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierrePeriodo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;		
			//this.gridBagConstraintsProcesoCierrePeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;		
		//this.gridBagConstraintsProcesoCierrePeriodo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCierrePeriodo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;		
			this.gridBagConstraintsProcesoCierrePeriodo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);								
		
		
		/*
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		*/		
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx =0;
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierrePeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
				
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCierrePeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierrePeriodo = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCierrePeriodo.setLayout(gridaBagLayoutBusquedasParametrosProcesoCierrePeriodo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCierrePeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			
			
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
			
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoCierrePeriodo.setVisible(false);
		this.jButtonAnterioresProcesoCierrePeriodo.setVisible(false);
		this.jButtonSiguientesProcesoCierrePeriodo.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoCierrePeriodo.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoCierrePeriodo.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoCierrePeriodo.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.setVisible(false);
		this.jComboBoxTiposReportesProcesoCierrePeriodo.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoCierrePeriodo.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo.setVisible(false);
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.setVisible(false);
		
		this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(false);
		
		
		this.jTtoolBarProcesoCierrePeriodo.setVisible(false);
			
		this.jMenuItemAnterioresProcesoCierrePeriodo.setVisible(false);
		this.jMenuItemSiguientesProcesoCierrePeriodo.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoCierrePeriodo.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoCierrePeriodo.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoCierrePeriodo.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierrePeriodo.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoCierrePeriodo.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoCierrePeriodo.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoCierrePeriodo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCierrePeriodo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCierrePeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCierrePeriodo.setName("jPanelReporteDinamicoProcesoCierrePeriodo"); 
		
		this.jPanelReporteDinamicoProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCierrePeriodo.setLayout(gridaBagLayoutReporteDinamicoProcesoCierrePeriodo);
		
		
		this.jInternalFrameReporteDinamicoProcesoCierrePeriodo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCierrePeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierrePeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Periodo Mensuales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCierrePeriodo = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCierrePeriodo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jLabelColumnasSelectReporteProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCierrePeriodo = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCierrePeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCierrePeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCierrePeriodo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierrePeriodo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierrePeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCierrePeriodo=new JScrollPane(this.jListColumnasSelectReporteProcesoCierrePeriodo);
			
			this.jScrollColumnasSelectReporteProcesoCierrePeriodo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierrePeriodo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierrePeriodo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jListColumnasSelectReporteProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jScrollColumnasSelectReporteProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCierrePeriodo = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCierrePeriodo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCierrePeriodo = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCierrePeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCierrePeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCierrePeriodo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierrePeriodo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierrePeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCierrePeriodo=new JScrollPane(this.jListRelacionesSelectReporteProcesoCierrePeriodo);
			
			this.jScrollRelacionesSelectReporteProcesoCierrePeriodo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierrePeriodo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierrePeriodo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCierrePeriodo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCierrePeriodo = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCierrePeriodo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCierrePeriodo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCierrePeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCierrePeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierrePeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierrePeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCierrePeriodo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCierrePeriodo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jLabelGenerarExcelReporteDinamicoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodo.setToolTipText("Generar EXCEL"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jComboBoxTiposReportesDinamicoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCierrePeriodo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCierrePeriodo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jLabelTiposArchivoReporteDinamicoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCierrePeriodo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCierrePeriodo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCierrePeriodo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCierrePeriodo.setToolTipText("Generar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jButtonGenerarReporteDinamicoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCierrePeriodo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCierrePeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCierrePeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCierrePeriodo.setToolTipText("Cancelar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierrePeriodo.add(this.jButtonCerrarReporteDinamicoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCierrePeriodo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCierrePeriodo= new JScrollPane(jPanelReporteDinamicoProcesoCierrePeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Periodo Mensuales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCierrePeriodo);
		this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCierrePeriodo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCierrePeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCierrePeriodo.setName("jPanelImportacionProcesoCierrePeriodo"); 
		
		this.jPanelImportacionProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCierrePeriodo.setLayout(gridaBagLayoutImportacionProcesoCierrePeriodo);
		
		
		this.jInternalFrameImportacionProcesoCierrePeriodo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCierrePeriodo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCierrePeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierrePeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCierrePeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierrePeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierrePeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCierrePeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierrePeriodo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierrePeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierrePeriodo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Periodo Mensuales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCierrePeriodo = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCierrePeriodo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierrePeriodo.add(this.jLabelArchivoImportacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCierrePeriodo = new JFileChooser();		
		this.jFileChooserImportacionProcesoCierrePeriodo.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCierrePeriodo = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCierrePeriodo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCierrePeriodo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCierrePeriodo.setToolTipText("Generar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierrePeriodo.add(this.jButtonAbrirImportacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCierrePeriodo = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCierrePeriodo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierrePeriodo.add(this.jLabelPathArchivoImportacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCierrePeriodo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCierrePeriodo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierrePeriodo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierrePeriodo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierrePeriodo.add(this.jTextFieldPathArchivoImportacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCierrePeriodo = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCierrePeriodo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCierrePeriodo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCierrePeriodo.setToolTipText("Generar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierrePeriodo.add(this.jButtonGenerarImportacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCierrePeriodo = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCierrePeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCierrePeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCierrePeriodo.setToolTipText("Cancelar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierrePeriodo.add(this.jButtonCerrarImportacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCierrePeriodo = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCierrePeriodo= new JScrollPane(jPanelImportacionProcesoCierrePeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCierrePeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCierrePeriodo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCierrePeriodo);
		this.jInternalFrameImportacionProcesoCierrePeriodo.getContentPane().add(this.jScrollPanelImportacionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCierrePeriodo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCierrePeriodo = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCierrePeriodo.setText("Orden");
			this.jButtonAbrirOrderByProcesoCierrePeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierrePeriodo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCierrePeriodo";
			inputMap = this.jButtonAbrirOrderByProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCierrePeriodo"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCierrePeriodo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCierrePeriodo.setName("jPanelOrderByProcesoCierrePeriodo"); 
			
			this.jPanelOrderByProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCierrePeriodo.setLayout(gridaBagLayoutOrderByProcesoCierrePeriodo);
			
			
			this.jTableDatosProcesoCierrePeriodoOrderBy = new JTableMe();        
			this.jTableDatosProcesoCierrePeriodoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCierrePeriodoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCierrePeriodoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCierrePeriodoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCierrePeriodoOrderBy.setViewportView(this.jTableDatosProcesoCierrePeriodoOrderBy);
			this.jTableDatosProcesoCierrePeriodoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCierrePeriodoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCierrePeriodo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCierrePeriodo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCierrePeriodo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCierrePeriodo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCierrePeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCierrePeriodo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCierrePeriodo.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCierrePeriodo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCierrePeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCierrePeriodo.setResizable(true);
			this.jInternalFrameOrderByProcesoCierrePeriodo.setClosable(true);
			this.jInternalFrameOrderByProcesoCierrePeriodo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Periodo Mensuales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCierrePeriodo.ipady =150;
				
			this.jPanelOrderByProcesoCierrePeriodo.add(jScrollPanelDatosProcesoCierrePeriodoOrderBy, this.gridBagConstraintsProcesoCierrePeriodo);//this.jTableDatosProcesoCierrePeriodoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCierrePeriodo = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCierrePeriodo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCierrePeriodo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCierrePeriodo.setToolTipText("Cancelar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCierrePeriodo.add(this.jButtonCerrarOrderByProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCierrePeriodo = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCierrePeriodo= new JScrollPane(jPanelOrderByProcesoCierrePeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCierrePeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCierrePeriodo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCierrePeriodo);
			
			this.jInternalFrameOrderByProcesoCierrePeriodo.getContentPane().add(this.jScrollPanelOrderByProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCierrePeriodo = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocierreperiodoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCierrePeriodo.getRowHeight();//ProcesoCierrePeriodoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCierrePeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo.isSelected()) {
					iHeightTable=ProcesoCierrePeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierrePeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierrePeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCierrePeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierrePeriodo.isSelected()) {
					iHeightTable=ProcesoCierrePeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierrePeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierrePeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCierrePeriodo!=null && this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCierrePeriodo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCierrePeriodo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCierrePeriodo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocierreperiodoLogic.getProcesoCierrePeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreperiodos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCierrePeriodo> TraerProcesoCierrePeriodoBeans(List<ProcesoCierrePeriodo> procesocierreperiodos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCierrePeriodo procesocierreperiodo:procesocierreperiodos) {
					
				if(!(ProcesoCierrePeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCierrePeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocierreperiodo.setsDetalleGeneralEntityReporte(ProcesoCierrePeriodoConstantesFunciones.getProcesoCierrePeriodoDescripcion(procesocierreperiodo));
										
						
					
						
					
				} else  {
							
					//procesocierreperiodo.setsDetalleGeneralEntityReporte(procesocierreperiodo.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocierreperiodobeans.add(procesocierreperiodobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocierreperiodos;
    }
	//PARA REPORTES FIN
}
