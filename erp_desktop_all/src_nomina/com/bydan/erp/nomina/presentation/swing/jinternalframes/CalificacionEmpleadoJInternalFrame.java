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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.CalificacionEmpleadoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class CalificacionEmpleadoJInternalFrame extends CalificacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCalificacionEmpleado;
	
	protected JMenuBar jmenuBarCalificacionEmpleado;
	
	protected JMenu jmenuCalificacionEmpleado;
	protected JMenu jmenuDatosCalificacionEmpleado;
	protected JMenu jmenuArchivoCalificacionEmpleado;
	protected JMenu jmenuAccionesCalificacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCalificacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsCalificacionEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CalificacionEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormCalificacionEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCalificacionEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCalificacionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_evaluacionempleado="";

	protected FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomifactornomi="";

	protected FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomipreguntanomi="";

	protected TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalificacionempleado="";
	
	public CalificacionEmpleadoSessionBean calificacionempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EvaluacionEmpleadoSessionBean evaluacionempleadoSessionBean;
	public FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CalificacionEmpleado> calificacionempleados;		
	public List<CalificacionEmpleado> calificacionempleadosEliminados;	
	public List<CalificacionEmpleado> calificacionempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCalificacionEmpleado;		
	protected JButton jButtonAbrirOrderByCalificacionEmpleado;
	
	
	//protected JPanel jPanelOrderByCalificacionEmpleado;
	//public JScrollPane jScrollPanelOrderByCalificacionEmpleado;	
	//protected JButton jButtonCerrarOrderByCalificacionEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CalificacionEmpleadoLogic calificacionempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCalificacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionCalificacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralCalificacionEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosCalificacionEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCalificacionEmpleado;
	//public JScrollPane jScrollPanelImportacionCalificacionEmpleado;
	
	
	
	protected JPanel jPanelAccionesCalificacionEmpleado;
	
    protected JPanel jPanelPaginacionCalificacionEmpleado;
    protected JPanel jPanelParametrosReportesCalificacionEmpleado;
	protected JPanel jPanelParametrosReportesAccionesCalificacionEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CalificacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar2CalificacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar3CalificacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar4CalificacionEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5CalificacionEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoCalificacionEmpleado;
	//protected JPanel jPanelImportacionCalificacionEmpleado;
	
	
	public JTable jTableDatosCalificacionEmpleado;
	
	
	
	//public JTable jTableDatosCalificacionEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCalificacionEmpleado;
	protected JButton jButtonDuplicarCalificacionEmpleado;
	protected JButton jButtonCopiarCalificacionEmpleado;
	protected JButton jButtonVerFormCalificacionEmpleado;
	protected JButton jButtonNuevoRelacionesCalificacionEmpleado;
	protected JButton jButtonModificarCalificacionEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaCalificacionEmpleado;
	protected JButton jButtonCerrarCalificacionEmpleado;
	
	
	protected JButton jButtonRecargarInformacionCalificacionEmpleado;
	protected JButton jButtonProcesarInformacionCalificacionEmpleado;
	
	
	protected JButton jButtonAnterioresCalificacionEmpleado;
	protected JButton jButtonSiguientesCalificacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosCalificacionEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCalificacionEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoCalificacionEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoCalificacionEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionCalificacionEmpleado;
	//protected JButton jButtonGenerarImportacionCalificacionEmpleado;
	//protected JButton jButtonCerrarImportacionCalificacionEmpleado;
	//protected JFileChooser jFileChooserImportacionCalificacionEmpleado;
	//protected File fileImportacionCalificacionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCalificacionEmpleado;
	protected JButton jButtonDuplicarToolBarCalificacionEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarCalificacionEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarCalificacionEmpleado;
	protected JButton jButtonCopiarToolBarCalificacionEmpleado;
	protected JButton jButtonVerFormToolBarCalificacionEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarCalificacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarCalificacionEmpleado;
	protected JButton jButtonCerrarToolBarCalificacionEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarCalificacionEmpleado;
	protected JButton jButtonProcesarInformacionToolBarCalificacionEmpleado;
	protected JButton jButtonAnterioresToolBarCalificacionEmpleado;
	protected JButton jButtonSiguientesToolBarCalificacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarCalificacionEmpleado;
	protected JButton jButtonAbrirOrderByToolBarCalificacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCalificacionEmpleado;
	protected JMenuItem jMenuItemDuplicarCalificacionEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesCalificacionEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCalificacionEmpleado;
	protected JMenuItem jMenuItemCopiarCalificacionEmpleado;
	protected JMenuItem jMenuItemVerFormCalificacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaCalificacionEmpleado;
	protected JMenuItem jMenuItemCerrarCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarCalificacionEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionCalificacionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionCalificacionEmpleado;
	protected JMenuItem jMenuItemAnterioresCalificacionEmpleado;
	protected JMenuItem jMenuItemSiguientesCalificacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCalificacionEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByCalificacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarCalificacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCalificacionEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCalificacionEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosCalificacionEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCalificacionEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCalificacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCalificacionEmpleado;
	protected JTextField jTextFieldValorCampoGeneralCalificacionEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCalificacionEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteCalificacionEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteCalificacionEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteCalificacionEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteCalificacionEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteCalificacionEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCalificacionEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCalificacionEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCalificacionEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoCalificacionEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionCalificacionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionCalificacionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionCalificacionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCalificacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCalificacionEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorCalificacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCalificacionEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoCalificacionEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoCalificacionEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoCalificacionEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCalificacionEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCalificacionEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCalificacionEmpleado;
	public JPanel jPanelFK_IdEmpleadoCalificacionEmpleado;
	public JButton jButtonFK_IdEmpleadoCalificacionEmpleado;
	public JPanel jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado;
	public JButton jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado;
	public JPanel jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado;
	public JButton jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado;
	public JPanel jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado;
	public JButton jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado;
	public JPanel jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado;
	public JButton jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoCalificacionEmpleado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado;
	public JButton jButtonid_empleadoFK_IdEmpleadoCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCalificacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado;
	public JLabel jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado;
	public JButton jButtonid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado;
	public JLabel jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado;
	public JButton jButtonid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado;
	public JLabel jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado;
	public JButton jButtonid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado;
	public JLabel jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado;
	public JButton jButtonid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=352;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CalificacionEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalificacionEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalificacionEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalificacionEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCalificacionEmpleado)	{
		this.jButtonRecargarInformacionCalificacionEmpleado = jButtonRecargarInformacionCalificacionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionCalificacionEmpleado() {
		return this.jButtonProcesarInformacionCalificacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCalificacionEmpleado)	{
		this.jButtonProcesarInformacionCalificacionEmpleado = jButtonProcesarInformacionCalificacionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionCalificacionEmpleado() {
		return this.jButtonRecargarInformacionCalificacionEmpleado;
	}
	
	
	public List<CalificacionEmpleado> getcalificacionempleados() {
		return this.calificacionempleados;
	}

	public void setcalificacionempleados(List<CalificacionEmpleado> calificacionempleados) {
		this.calificacionempleados = calificacionempleados;
	}
	
	public List<CalificacionEmpleado> getcalificacionempleadosAux() {
		return this.calificacionempleadosAux;
	}

	public void setcalificacionempleadosAux(List<CalificacionEmpleado> calificacionempleadosAux) {
		this.calificacionempleadosAux = calificacionempleadosAux;
	}
	
	public List<CalificacionEmpleado> getcalificacionempleadosEliminados() {
		return this.calificacionempleadosEliminados;
	}

	public void setCalificacionEmpleadosEliminados(List<CalificacionEmpleado> calificacionempleadosEliminados) {
		this.calificacionempleadosEliminados = calificacionempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCalificacionEmpleado() {
		return jComboBoxTiposSeleccionarCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCalificacionEmpleado(
			JComboBox jComboBoxTiposSeleccionarCalificacionEmpleado) {
		this.jComboBoxTiposSeleccionarCalificacionEmpleado = jComboBoxTiposSeleccionarCalificacionEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCalificacionEmpleado() {
		return jTextFieldValorCampoGeneralCalificacionEmpleado;
	}

	public void setjTextFieldValorCampoGeneralCalificacionEmpleado(
			JTextField jTextFieldValorCampoGeneralCalificacionEmpleado) {
		this.jTextFieldValorCampoGeneralCalificacionEmpleado = jTextFieldValorCampoGeneralCalificacionEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCalificacionEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCalificacionEmpleado() {
		return this.jCheckBoxSeleccionarTodosCalificacionEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosCalificacionEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosCalificacionEmpleado) {
		this.jCheckBoxSeleccionarTodosCalificacionEmpleado = jCheckBoxSeleccionarTodosCalificacionEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCalificacionEmpleado() {
		return this.jCheckBoxSeleccionadosCalificacionEmpleado;
	}

	public void setjCheckBoxSeleccionadosCalificacionEmpleado(
			JCheckBox jCheckBoxSeleccionadosCalificacionEmpleado) {
		this.jCheckBoxSeleccionadosCalificacionEmpleado = jCheckBoxSeleccionadosCalificacionEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCalificacionEmpleado() {
		return this.jComboBoxTiposArchivosReportesCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCalificacionEmpleado(
			JComboBox jComboBoxTiposArchivosReportesCalificacionEmpleado) {
		this.jComboBoxTiposArchivosReportesCalificacionEmpleado = jComboBoxTiposArchivosReportesCalificacionEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCalificacionEmpleado() {
		return this.jComboBoxTiposReportesCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCalificacionEmpleado(
			JComboBox jComboBoxTiposReportesCalificacionEmpleado) {
		this.jComboBoxTiposReportesCalificacionEmpleado = jComboBoxTiposReportesCalificacionEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCalificacionEmpleado() {
	//	return jComboBoxTiposReportesDinamicoCalificacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCalificacionEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoCalificacionEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoCalificacionEmpleado = jComboBoxTiposReportesDinamicoCalificacionEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado = jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCalificacionEmpleado() {
		return this.jComboBoxTiposGraficosReportesCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCalificacionEmpleado(
			JComboBox jComboBoxTiposGraficosReportesCalificacionEmpleado) {
		this.jComboBoxTiposGraficosReportesCalificacionEmpleado = jComboBoxTiposGraficosReportesCalificacionEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCalificacionEmpleado() {
		return this.jComboBoxTiposPaginacionCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCalificacionEmpleado(
			JComboBox jComboBoxTiposPaginacionCalificacionEmpleado) {
		this.jComboBoxTiposPaginacionCalificacionEmpleado = jComboBoxTiposPaginacionCalificacionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCalificacionEmpleado() {
		return this.jComboBoxTiposRelacionesCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCalificacionEmpleado() {
		return this.jComboBoxTiposAccionesCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCalificacionEmpleado(
			JComboBox jComboBoxTiposRelacionesCalificacionEmpleado) {
		this.jComboBoxTiposRelacionesCalificacionEmpleado = jComboBoxTiposRelacionesCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCalificacionEmpleado(
			JComboBox jComboBoxTiposAccionesCalificacionEmpleado) {
		this.jComboBoxTiposAccionesCalificacionEmpleado = jComboBoxTiposAccionesCalificacionEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCalificacionEmpleado() {
	//	return jCheckBoxConGraficoDinamicoCalificacionEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoCalificacionEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoCalificacionEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoCalificacionEmpleado = jCheckBoxConGraficoDinamicoCalificacionEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCalificacionEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCalificacionEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCalificacionEmpleado .setBorder(borderResaltar);		
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
		this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		
		this.calificacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.calificacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.calificacionempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CalificacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Calificacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCalificacionEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"nuevo","nuevo","Nuevo"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"duplicar","duplicar","Duplicar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"copiar","copiar","Copiar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"ver_form","ver_form","Ver"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"recargar","recargar","Recargar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,
							"cerrar","cerrar","Salir"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCalificacionEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCalificacionEmpleado;
			
				this.jButtonProcesarInformacionToolBarCalificacionEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCalificacionEmpleado;
				
		//protected JButton jButtonModificarToolBarCalificacionEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCalificacionEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCalificacionEmpleado=new JMenuMe("General");
		this.jmenuArchivoCalificacionEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesCalificacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosCalificacionEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCalificacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCalificacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCalificacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCalificacionEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCalificacionEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCalificacionEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCalificacionEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCalificacionEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCalificacionEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCalificacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCalificacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCalificacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCalificacionEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCalificacionEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCalificacionEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCalificacionEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCalificacionEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCalificacionEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCalificacionEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCalificacionEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCalificacionEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCalificacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCalificacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCalificacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCalificacionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCalificacionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCalificacionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCalificacionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCalificacionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCalificacionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCalificacionEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCalificacionEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCalificacionEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCalificacionEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCalificacionEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCalificacionEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCalificacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCalificacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCalificacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCalificacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCalificacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCalificacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCalificacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCalificacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCalificacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCalificacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCalificacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCalificacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCalificacionEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCalificacionEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCalificacionEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCalificacionEmpleado.add(this.jMenuItemCerrarCalificacionEmpleado);
			
			this.jmenuAccionesCalificacionEmpleado.add(this.jMenuItemNuevoCalificacionEmpleado);
			this.jmenuAccionesCalificacionEmpleado.add(this.jMenuItemNuevoGuardarCambiosCalificacionEmpleado);
			this.jmenuAccionesCalificacionEmpleado.add(this.jMenuItemNuevoRelacionesCalificacionEmpleado);
			this.jmenuAccionesCalificacionEmpleado.add(this.jMenuItemGuardarCambiosTablaCalificacionEmpleado);		
			this.jmenuAccionesCalificacionEmpleado.add(this.jMenuItemDuplicarCalificacionEmpleado);		
			this.jmenuAccionesCalificacionEmpleado.add(this.jMenuItemCopiarCalificacionEmpleado);		
			this.jmenuAccionesCalificacionEmpleado.add(this.jMenuItemVerFormCalificacionEmpleado);		
			
			this.jmenuDatosCalificacionEmpleado.add(this.jMenuItemRecargarInformacionCalificacionEmpleado);				
			this.jmenuDatosCalificacionEmpleado.add(this.jMenuItemAnterioresCalificacionEmpleado);				
			this.jmenuDatosCalificacionEmpleado.add(this.jMenuItemSiguientesCalificacionEmpleado);				
			this.jmenuDatosCalificacionEmpleado.add(this.jMenuItemAbrirOrderByCalificacionEmpleado);				
			this.jmenuDatosCalificacionEmpleado.add(this.jMenuItemMostrarOcultarCalificacionEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCalificacionEmpleado.add(this.jMenuItemGuardarCambiosCalificacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCalificacionEmpleado.add(this.jmenuArchivoCalificacionEmpleado);		
			this.jmenuBarCalificacionEmpleado.add(this.jmenuAccionesCalificacionEmpleado);		
			this.jmenuBarCalificacionEmpleado.add(this.jmenuDatosCalificacionEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCalificacionEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCalificacionEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoCalificacionEmpleado.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoCalificacionEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoCalificacionEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoCalificacionEmpleado.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoCalificacionEmpleado,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado.setToolTipText("Buscar Por Evaluacion Empleado ");
		this.jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado= new JButtonMe();
		this.jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado.setText("Buscar");
		this.jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado.setToolTipText("Buscar Por Evaluacion Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado,"buscar_button","Buscar Por Evaluacion Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado = new JLabelMe();
		jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setText("Evaluacion Empleado :");
		jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setToolTipText("Evaluacion Empleado");
		jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setToolTipText("Buscar Por Formato Nomi Factor Nomi ");
		this.jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado= new JButtonMe();
		this.jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setText("Buscar");
		this.jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setToolTipText("Buscar Por Formato Nomi Factor Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado,"buscar_button","Buscar Por Formato Nomi Factor Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado = new JLabelMe();
		jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setText("Formato Nomi Factor Nomi :");
		jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setToolTipText("Formato Nomi Factor Nomi");
		jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setToolTipText("Buscar Por Formato Nomi Pregunta Nomi ");
		this.jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado= new JButtonMe();
		this.jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setText("Buscar");
		this.jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setToolTipText("Buscar Por Formato Nomi Pregunta Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado,"buscar_button","Buscar Por Formato Nomi Pregunta Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado = new JLabelMe();
		jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setText("Formato Nomi Pregunta Nomi :");
		jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setToolTipText("Formato Nomi Pregunta Nomi");
		jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setToolTipText("Buscar Por Idtipo Calificacion Empleado ");
		this.jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setToolTipText("Buscar Por Idtipo Calificacion Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado,"buscar_button","Buscar Por Idtipo Calificacion Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado = new JLabelMe();
		jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setText("Idtipo Calificacion Empleado :");
		jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setToolTipText("Idtipo Calificacion Empleado");
		jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCalificacionEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasCalificacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCalificacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCalificacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCalificacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCalificacionEmpleado = new CalificacionEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Calificacion Empleado DATOS");
			this.jInternalFrameDetalleFormCalificacionEmpleado = new CalificacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.calificacionempleadoSessionBean.getConGuardarRelaciones(),this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCalificacionEmpleado = null;//new CalificacionEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCalificacionEmpleado= new GridBagLayout();
		
		
		this.jTableDatosCalificacionEmpleado = new JTableMe();      
		
		String sToolTipCalificacionEmpleado="";
		sToolTipCalificacionEmpleado=CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCalificacionEmpleado+="(Nomina.CalificacionEmpleado)";
		}
		
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCalificacionEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCalificacionEmpleado.setToolTipText(sToolTipCalificacionEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCalificacionEmpleado);
		this.jTableDatosCalificacionEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosCalificacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCalificacionEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosCalificacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCalificacionEmpleado = new JButtonMe();
		this.jButtonDuplicarCalificacionEmpleado = new JButtonMe();
		this.jButtonCopiarCalificacionEmpleado = new JButtonMe();
		this.jButtonVerFormCalificacionEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesCalificacionEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCalificacionEmpleado = new JButtonMe();
		this.jButtonCerrarCalificacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosCalificacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralCalificacionEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Calificacion Empleado";
		
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calificacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosCalificacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCalificacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesCalificacionEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCalificacionEmpleado=new ReporteDinamicoJInternalFrame(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCalificacionEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCalificacionEmpleado=new ImportacionJInternalFrame(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCalificacionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCalificacionEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByCalificacionEmpleado.setText("Orden");
		this.jButtonAbrirOrderByCalificacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCalificacionEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCalificacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCalificacionEmpleado,false,this);
			
			//this.cargarOrderByCalificacionEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCalificacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCalificacionEmpleado,true,this);
			
			//this.cargarOrderByCalificacionEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCalificacionEmpleado.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosCalificacionEmpleado.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosCalificacionEmpleado.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosCalificacionEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCalificacionEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCalificacionEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCalificacionEmpleado.setText("Nuevo");
		this.jButtonDuplicarCalificacionEmpleado.setText("Duplicar");
		this.jButtonCopiarCalificacionEmpleado.setText("Copiar");
		this.jButtonVerFormCalificacionEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesCalificacionEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.setText("Guardar");
		this.jButtonCerrarCalificacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCalificacionEmpleado,"nuevo_button","Nuevo",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCalificacionEmpleado,"duplicar_button","Duplicar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCalificacionEmpleado,"copiar_button","Copiar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCalificacionEmpleado,"ver_form","Ver",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCalificacionEmpleado,"nuevorelaciones_button","Nuevo Rel",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCalificacionEmpleado,"guardarcambiostabla_button","Guardar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCalificacionEmpleado,"cerrar_button","Salir",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCalificacionEmpleado.setToolTipText("Nuevo"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCalificacionEmpleado.setToolTipText("Duplicar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCalificacionEmpleado.setToolTipText("Copiar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCalificacionEmpleado.setToolTipText("Ver"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCalificacionEmpleado.setToolTipText("Nuevo Rel"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.setToolTipText("Guardar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCalificacionEmpleado.setToolTipText("Salir"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCalificacionEmpleado";
		inputMap = this.jButtonNuevoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCalificacionEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarCalificacionEmpleado";
		inputMap = this.jButtonDuplicarCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCalificacionEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarCalificacionEmpleado";
		inputMap = this.jButtonCopiarCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCalificacionEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormCalificacionEmpleado";
		inputMap = this.jButtonVerFormCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCalificacionEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCalificacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCalificacionEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCalificacionEmpleado";
		inputMap = this.jButtonModificarCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCalificacionEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCalificacionEmpleado";
		inputMap = this.jButtonCerrarCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCalificacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCalificacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCalificacionEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCalificacionEmpleado.setName("jPanelParametrosReportesCalificacionEmpleado"); 
		
		this.jPanelParametrosReportesAccionesCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCalificacionEmpleado.setName("jPanelParametrosReportesAccionesCalificacionEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCalificacionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionCalificacionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionCalificacionEmpleado.setToolTipText("Recargar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCalificacionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCalificacionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionCalificacionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionCalificacionEmpleado.setToolTipText("Procesar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCalificacionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionCalificacionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCalificacionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCalificacionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCalificacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCalificacionEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCalificacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesCalificacionEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCalificacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCalificacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCalificacionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionCalificacionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCalificacionEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesCalificacionEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCalificacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesCalificacionEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCalificacionEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCalificacionEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCalificacionEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCalificacionEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCalificacionEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCalificacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesCalificacionEmpleado.setText("Acciones");		
		this.jLabelAccionesCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCalificacionEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCalificacionEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCalificacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCalificacionEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCalificacionEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCalificacionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteCalificacionEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCalificacionEmpleado = new JButtonMe();
		//this.jButtonAnterioresCalificacionEmpleado.setText("<<");
        this.jButtonAnterioresCalificacionEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCalificacionEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCalificacionEmpleado = new JButtonMe();
		//this.jButtonSiguientesCalificacionEmpleado.setText(">>");
        this.jButtonSiguientesCalificacionEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCalificacionEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCalificacionEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCalificacionEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosCalificacionEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCalificacionEmpleado,"nuevoguardarcambios_button","Nue",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCalificacionEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCalificacionEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCalificacionEmpleado";
		inputMap = this.jButtonRecargarInformacionCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCalificacionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCalificacionEmpleado";
		inputMap = this.jButtonSiguientesCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCalificacionEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCalificacionEmpleado";
		inputMap = this.jButtonAnterioresCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCalificacionEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCalificacionEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCalificacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),CalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCalificacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),CalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCalificacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),CalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCalificacionEmpleado = new GridBagLayout();

			this.jPanelPaginacionCalificacionEmpleado.setLayout(gridaBagLayoutPaginacionCalificacionEmpleado);						
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonAnterioresCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
					
						
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
			
			this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonNuevoGuardarCambiosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
						
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
			this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonSiguientesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonNuevoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
						
			
			
			if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCalificacionEmpleado.gridy = 1;
				this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonGuardarCambiosTablaCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			}
			
			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonDuplicarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonCopiarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonVerFormCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCalificacionEmpleado.add(this.jButtonCerrarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		
		
		this.jButtonRecargarInformacionCalificacionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCalificacionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCalificacionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCalificacionEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCalificacionEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCalificacionEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCalificacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCalificacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCalificacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCalificacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCalificacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCalificacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCalificacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCalificacionEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCalificacionEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCalificacionEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCalificacionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCalificacionEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCalificacionEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCalificacionEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCalificacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCalificacionEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CalificacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CalificacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CalificacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CalificacionEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCalificacionEmpleado.setLayout(gridaBagParametrosReportesCalificacionEmpleado);
			this.jPanelParametrosReportesAccionesCalificacionEmpleado.setLayout(gridaBagParametrosReportesAccionesCalificacionEmpleado);
			
			
			this.jPanelParametrosAuxiliar1CalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar1CalificacionEmpleado);
			this.jPanelParametrosAuxiliar2CalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar2CalificacionEmpleado);
			this.jPanelParametrosAuxiliar3CalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar3CalificacionEmpleado);
			this.jPanelParametrosAuxiliar4CalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar4CalificacionEmpleado);
			//this.jPanelParametrosAuxiliar5CalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar2CalificacionEmpleado);			
			
			
			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jButtonRecargarInformacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CalificacionEmpleado.add(this.jComboBoxTiposPaginacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CalificacionEmpleado.add(this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CalificacionEmpleado.add(this.jComboBoxTiposArchivosReportesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jPanelParametrosAuxiliar1CalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CalificacionEmpleado.add(this.jComboBoxTiposReportesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);																		
			
			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CalificacionEmpleado.add(this.jComboBoxTiposGraficosReportesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jPanelParametrosAuxiliar4CalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jComboBoxTiposReportesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jCheckBoxGenerarReporteCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jPanelParametrosAuxiliar2CalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jLabelAccionesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCalificacionEmpleado.add(this.jButtonAbrirOrderByCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jComboBoxTiposSeleccionarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
			
			
			/*
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jCheckBoxSeleccionarTodosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jCheckBoxConGraficoReporteCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CalificacionEmpleado.add(this.jCheckBoxSeleccionarTodosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);															
				
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CalificacionEmpleado.add(this.jCheckBoxSeleccionadosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);															
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CalificacionEmpleado.add(this.jCheckBoxConGraficoReporteCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jPanelParametrosAuxiliar3CalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jComboBoxTiposAccionesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
	
				
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalificacionEmpleado.add(this.jTextFieldValorCampoGeneralCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCalificacionEmpleado = new GridBagLayout();

			this.jScrollPanelDatosCalificacionEmpleado.setLayout(gridaBagLayoutDatosCalificacionEmpleado);
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
			this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
			
			this.jScrollPanelDatosCalificacionEmpleado.add(this.jTableDatosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCalificacionEmpleado.setViewportView(this.jTableDatosCalificacionEmpleado);
		this.jTableDatosCalificacionEmpleado.setFillsViewportHeight(true);
		this.jTableDatosCalificacionEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCalificacionEmpleado= new GridBagLayout();
		this.jPanelAccionesCalificacionEmpleado.setLayout(gridaBagLayoutAccionesCalificacionEmpleado);
		
		
		/*	
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
			
		this.jPanelAccionesCalificacionEmpleado.add(this.jButtonNuevoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoCalificacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoCalificacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCalificacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCalificacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoCalificacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoCalificacionEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoCalificacionEmpleado.add(jLabelid_empleadoFK_IdEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoCalificacionEmpleado.add(jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 1;
		gridBagConstraintsCalificacionEmpleado.gridx =1;
		jPanelFK_IdEmpleadoCalificacionEmpleado.add(jButtonFK_IdEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		jTabbedPaneBusquedasCalificacionEmpleado.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoCalificacionEmpleado);
		jTabbedPaneBusquedasCalificacionEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEvaluacionEmpleadoCalificacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEvaluacionEmpleadoCalificacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEvaluacionEmpleadoCalificacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEvaluacionEmpleadoCalificacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEvaluacionEmpleadoCalificacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado.setLayout(gridaBagLayoutFK_IdEvaluacionEmpleadoCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 0;
		jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado.add(jLabelid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 1;
		jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado.add(jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 1;
		gridBagConstraintsCalificacionEmpleado.gridx =1;
		jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado.add(jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		jTabbedPaneBusquedasCalificacionEmpleado.addTab("2.-Por Evaluacion Empleado ", jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);
		jTabbedPaneBusquedasCalificacionEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdFormatoNomiFactorNomiCalificacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNomiFactorNomiCalificacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiFactorNomiCalificacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiFactorNomiCalificacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNomiFactorNomiCalificacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setLayout(gridaBagLayoutFK_IdFormatoNomiFactorNomiCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 0;
		jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado.add(jLabelid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 1;
		jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado.add(jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 1;
		gridBagConstraintsCalificacionEmpleado.gridx =1;
		jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado.add(jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		jTabbedPaneBusquedasCalificacionEmpleado.addTab("3.-Por Formato Nomi Factor Nomi ", jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
		jTabbedPaneBusquedasCalificacionEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setLayout(gridaBagLayoutFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 0;
		jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.add(jLabelid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 1;
		jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.add(jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 1;
		gridBagConstraintsCalificacionEmpleado.gridx =1;
		jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.add(jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		jTabbedPaneBusquedasCalificacionEmpleado.addTab("4.-Por Formato Nomi Pregunta Nomi ", jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
		jTabbedPaneBusquedasCalificacionEmpleado.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoCalificacionEmpleadoCalificacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setLayout(gridaBagLayoutFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 0;
		jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.add(jLabelid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 0;
		gridBagConstraintsCalificacionEmpleado.gridx = 1;
		jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.add(jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalificacionEmpleado.gridy = 1;
		gridBagConstraintsCalificacionEmpleado.gridx =1;
		jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.add(jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);

		jTabbedPaneBusquedasCalificacionEmpleado.addTab("5.-Por Idtipo Calificacion Empleado ", jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
		jTabbedPaneBusquedasCalificacionEmpleado.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCalificacionEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCalificacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsCalificacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCalificacionEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;		
		//this.gridBagConstraintsCalificacionEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCalificacionEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCalificacionEmpleado.gridx = 0;		
			this.gridBagConstraintsCalificacionEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCalificacionEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);								
		
		
		/*
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		*/		
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCalificacionEmpleado.gridx =0;
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCalificacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
				
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCalificacionEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosCalificacionEmpleado.setLayout(gridaBagLayoutBusquedasParametrosCalificacionEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCalificacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCalificacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCalificacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCalificacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			
			
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
			
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCalificacionEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCalificacionEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCalificacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCalificacionEmpleado.setName("jPanelReporteDinamicoCalificacionEmpleado"); 
		
		this.jPanelReporteDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCalificacionEmpleado.setLayout(gridaBagLayoutReporteDinamicoCalificacionEmpleado);
		
		
		this.jInternalFrameReporteDinamicoCalificacionEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCalificacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCalificacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCalificacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCalificacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCalificacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCalificacionEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCalificacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCalificacionEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoCalificacionEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoCalificacionEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calificacion Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCalificacionEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteCalificacionEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jLabelColumnasSelectReporteCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCalificacionEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteCalificacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCalificacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCalificacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCalificacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCalificacionEmpleado=new JScrollPane(this.jListColumnasSelectReporteCalificacionEmpleado);
			
			this.jScrollColumnasSelectReporteCalificacionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCalificacionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCalificacionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jListColumnasSelectReporteCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jScrollColumnasSelectReporteCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCalificacionEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteCalificacionEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCalificacionEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteCalificacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCalificacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCalificacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCalificacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCalificacionEmpleado=new JScrollPane(this.jListRelacionesSelectReporteCalificacionEmpleado);
			
			this.jScrollRelacionesSelectReporteCalificacionEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCalificacionEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCalificacionEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCalificacionEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoCalificacionEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCalificacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCalificacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCalificacionEmpleado = new JLabelMe();

		this.jLabelConGraficoDinamicoCalificacionEmpleado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jLabelConGraficoDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCalificacionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCalificacionEmpleado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jCheckBoxConGraficoDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCalificacionEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCalificacionEmpleado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jLabelColumnaCategoriaGraficoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCalificacionEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaValorCalificacionEmpleado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jLabelColumnaCategoriaValorCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCalificacionEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCalificacionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jComboBoxColumnaCategoriaValorCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCalificacionEmpleado = new JLabelMe();

		this.jLabelColumnasValoresGraficoCalificacionEmpleado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jLabelColumnasValoresGraficoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCalificacionEmpleado = new JList<Reporte>();
		this.jListColumnasValoresGraficoCalificacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCalificacionEmpleado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCalificacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCalificacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCalificacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCalificacionEmpleado=new JScrollPane(this.jListColumnasValoresGraficoCalificacionEmpleado);
			
			this.jScrollColumnasValoresGraficoCalificacionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCalificacionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCalificacionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jListColumnasSelectReporteCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jScrollColumnasValoresGraficoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCalificacionEmpleado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCalificacionEmpleado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jLabelTiposGraficosReportesDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCalificacionEmpleado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jComboBoxTiposGraficosReportesDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCalificacionEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCalificacionEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jLabelGenerarExcelReporteDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCalificacionEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCalificacionEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCalificacionEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCalificacionEmpleado.setToolTipText("Generar EXCEL"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jButtonGenerarExcelReporteDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jComboBoxTiposReportesDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCalificacionEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCalificacionEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jLabelTiposArchivoReporteDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCalificacionEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCalificacionEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCalificacionEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCalificacionEmpleado.setToolTipText("Generar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jButtonGenerarReporteDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCalificacionEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCalificacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCalificacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCalificacionEmpleado.setToolTipText("Cancelar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCalificacionEmpleado.add(this.jButtonCerrarReporteDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCalificacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCalificacionEmpleado= new JScrollPane(jPanelReporteDinamicoCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calificacion Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCalificacionEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCalificacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCalificacionEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCalificacionEmpleado);
		this.jInternalFrameReporteDinamicoCalificacionEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCalificacionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCalificacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCalificacionEmpleado.setName("jPanelImportacionCalificacionEmpleado"); 
		
		this.jPanelImportacionCalificacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCalificacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCalificacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCalificacionEmpleado.setLayout(gridaBagLayoutImportacionCalificacionEmpleado);
		
		
		this.jInternalFrameImportacionCalificacionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCalificacionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCalificacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCalificacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCalificacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCalificacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCalificacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCalificacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCalificacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCalificacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionCalificacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionCalificacionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCalificacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCalificacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCalificacionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCalificacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCalificacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCalificacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionCalificacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionCalificacionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCalificacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCalificacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCalificacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calificacion Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCalificacionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionCalificacionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCalificacionEmpleado.add(this.jLabelArchivoImportacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCalificacionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionCalificacionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCalificacionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionCalificacionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCalificacionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCalificacionEmpleado.setToolTipText("Generar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCalificacionEmpleado.add(this.jButtonAbrirImportacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCalificacionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionCalificacionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCalificacionEmpleado.add(this.jLabelPathArchivoImportacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCalificacionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCalificacionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCalificacionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCalificacionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCalificacionEmpleado.add(this.jTextFieldPathArchivoImportacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCalificacionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionCalificacionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCalificacionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCalificacionEmpleado.setToolTipText("Generar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCalificacionEmpleado.add(this.jButtonGenerarImportacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCalificacionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionCalificacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCalificacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCalificacionEmpleado.setToolTipText("Cancelar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCalificacionEmpleado.add(this.jButtonCerrarImportacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCalificacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionCalificacionEmpleado= new JScrollPane(jPanelImportacionCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsCalificacionEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCalificacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCalificacionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCalificacionEmpleado);
		this.jInternalFrameImportacionCalificacionEmpleado.getContentPane().add(this.jScrollPanelImportacionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCalificacionEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCalificacionEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByCalificacionEmpleado.setText("Orden");
			this.jButtonAbrirOrderByCalificacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCalificacionEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCalificacionEmpleado";
			inputMap = this.jButtonAbrirOrderByCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCalificacionEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByCalificacionEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCalificacionEmpleado.setName("jPanelOrderByCalificacionEmpleado"); 
			
			this.jPanelOrderByCalificacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCalificacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCalificacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCalificacionEmpleado.setLayout(gridaBagLayoutOrderByCalificacionEmpleado);
			
			
			this.jTableDatosCalificacionEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosCalificacionEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCalificacionEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCalificacionEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCalificacionEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCalificacionEmpleadoOrderBy.setViewportView(this.jTableDatosCalificacionEmpleadoOrderBy);
			this.jTableDatosCalificacionEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCalificacionEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCalificacionEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCalificacionEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCalificacionEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCalificacionEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCalificacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCalificacionEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCalificacionEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByCalificacionEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCalificacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCalificacionEmpleado.setResizable(true);
			this.jInternalFrameOrderByCalificacionEmpleado.setClosable(true);
			this.jInternalFrameOrderByCalificacionEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCalificacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCalificacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCalificacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calificacion Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCalificacionEmpleado.ipady =150;
				
			this.jPanelOrderByCalificacionEmpleado.add(jScrollPanelDatosCalificacionEmpleadoOrderBy, this.gridBagConstraintsCalificacionEmpleado);//this.jTableDatosCalificacionEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCalificacionEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByCalificacionEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCalificacionEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCalificacionEmpleado.setToolTipText("Cancelar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCalificacionEmpleado.add(this.jButtonCerrarOrderByCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCalificacionEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByCalificacionEmpleado= new JScrollPane(jPanelOrderByCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsCalificacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCalificacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCalificacionEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCalificacionEmpleado);
			
			this.jInternalFrameOrderByCalificacionEmpleado.getContentPane().add(this.jScrollPanelOrderByCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByCalificacionEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.calificacionempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCalificacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCalificacionEmpleado.getRowHeight();//CalificacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado.isSelected()) {
					iHeightTable=CalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCalificacionEmpleado.isSelected()) {
					iHeightTable=CalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCalificacionEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCalificacionEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCalificacionEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCalificacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCalificacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCalificacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCalificacionEmpleado!=null && this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCalificacionEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCalificacionEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCalificacionEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCalificacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCalificacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCalificacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=calificacionempleadoLogic.getCalificacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=calificacionempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CalificacionEmpleado> TraerCalificacionEmpleadoBeans(List<CalificacionEmpleado> calificacionempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(CalificacionEmpleado calificacionempleado:calificacionempleados) {
					
				if(!(CalificacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CalificacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					calificacionempleado.setsDetalleGeneralEntityReporte(CalificacionEmpleadoConstantesFunciones.getCalificacionEmpleadoDescripcion(calificacionempleado));
										
					calificacionempleado.setverificado_descripcion(CalificacionEmpleadoConstantesFunciones.getverificadoDescripcion(calificacionempleado));	
					
						
					
				} else  {
							
					//calificacionempleado.setsDetalleGeneralEntityReporte(calificacionempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//calificacionempleadobeans.add(calificacionempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return calificacionempleados;
    }
	//PARA REPORTES FIN
}
