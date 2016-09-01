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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.EvaluacionesPeriodosConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class EvaluacionesPeriodosJInternalFrame extends EvaluacionesPeriodosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEvaluacionesPeriodos;
	
	protected JMenuBar jmenuBarEvaluacionesPeriodos;
	
	protected JMenu jmenuEvaluacionesPeriodos;
	protected JMenu jmenuDatosEvaluacionesPeriodos;
	protected JMenu jmenuArchivoEvaluacionesPeriodos;
	protected JMenu jmenuAccionesEvaluacionesPeriodos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionesPeriodos;	
	protected GridBagConstraints gridBagConstraintsEvaluacionesPeriodos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EvaluacionesPeriodosDetalleFormJInternalFrame jInternalFrameDetalleFormEvaluacionesPeriodos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEvaluacionesPeriodos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEvaluacionesPeriodos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalificacionempleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoEvaluacionEmpleadoBeanSwingJInternalFrame tipoevaluacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoevaluacionempleado="";

	protected FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomipreguntanomi="";
	
	public EvaluacionesPeriodosSessionBean evaluacionesperiodosSessionBean;
		
	
	
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EvaluacionesPeriodos> evaluacionesperiodoss;		
	public List<EvaluacionesPeriodos> evaluacionesperiodossEliminados;	
	public List<EvaluacionesPeriodos> evaluacionesperiodossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEvaluacionesPeriodos;		
	protected JButton jButtonAbrirOrderByEvaluacionesPeriodos;
	
	
	//protected JPanel jPanelOrderByEvaluacionesPeriodos;
	//public JScrollPane jScrollPanelOrderByEvaluacionesPeriodos;	
	//protected JButton jButtonCerrarOrderByEvaluacionesPeriodos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EvaluacionesPeriodosLogic evaluacionesperiodosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEvaluacionesPeriodos;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionesPeriodos;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionesPeriodos;
    
	
	
	//public JScrollPane jScrollPanelDatosEvaluacionesPeriodosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEvaluacionesPeriodos;
	//public JScrollPane jScrollPanelImportacionEvaluacionesPeriodos;
	
	
	
	protected JPanel jPanelAccionesEvaluacionesPeriodos;
	
    protected JPanel jPanelPaginacionEvaluacionesPeriodos;
    protected JPanel jPanelParametrosReportesEvaluacionesPeriodos;
	protected JPanel jPanelParametrosReportesAccionesEvaluacionesPeriodos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EvaluacionesPeriodos;
	protected JPanel jPanelParametrosAuxiliar2EvaluacionesPeriodos;
	protected JPanel jPanelParametrosAuxiliar3EvaluacionesPeriodos;
	protected JPanel jPanelParametrosAuxiliar4EvaluacionesPeriodos;
	//protected JPanel jPanelParametrosAuxiliar5EvaluacionesPeriodos;
	
	
	
	//protected JPanel jPanelReporteDinamicoEvaluacionesPeriodos;
	//protected JPanel jPanelImportacionEvaluacionesPeriodos;
	
	
	public JTable jTableDatosEvaluacionesPeriodos;
	
	
	
	//public JTable jTableDatosEvaluacionesPeriodosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEvaluacionesPeriodos;
	protected JButton jButtonDuplicarEvaluacionesPeriodos;
	protected JButton jButtonCopiarEvaluacionesPeriodos;
	protected JButton jButtonVerFormEvaluacionesPeriodos;
	protected JButton jButtonNuevoRelacionesEvaluacionesPeriodos;
	protected JButton jButtonModificarEvaluacionesPeriodos;
	
    protected JButton jButtonGuardarCambiosTablaEvaluacionesPeriodos;
	protected JButton jButtonCerrarEvaluacionesPeriodos;
	
	
	protected JButton jButtonRecargarInformacionEvaluacionesPeriodos;
	protected JButton jButtonProcesarInformacionEvaluacionesPeriodos;
	
	
	protected JButton jButtonAnterioresEvaluacionesPeriodos;
	protected JButton jButtonSiguientesEvaluacionesPeriodos;
	protected JButton jButtonNuevoGuardarCambiosEvaluacionesPeriodos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEvaluacionesPeriodos;
	//protected JButton jButtonCerrarReporteDinamicoEvaluacionesPeriodos;
	//protected JButton jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodos;	
	
	
	
	//protected JButton jButtonAbrirImportacionEvaluacionesPeriodos;
	//protected JButton jButtonGenerarImportacionEvaluacionesPeriodos;
	//protected JButton jButtonCerrarImportacionEvaluacionesPeriodos;
	//protected JFileChooser jFileChooserImportacionEvaluacionesPeriodos;
	//protected File fileImportacionEvaluacionesPeriodos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionesPeriodos;
	protected JButton jButtonDuplicarToolBarEvaluacionesPeriodos;
	protected JButton jButtonNuevoRelacionesToolBarEvaluacionesPeriodos;
	
	
	public JButton jButtonGuardarCambiosToolBarEvaluacionesPeriodos;
	protected JButton jButtonCopiarToolBarEvaluacionesPeriodos;
	protected JButton jButtonVerFormToolBarEvaluacionesPeriodos;
	public JButton jButtonGuardarCambiosTablaToolBarEvaluacionesPeriodos;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionesPeriodos;
	protected JButton jButtonCerrarToolBarEvaluacionesPeriodos;
	
	protected JButton jButtonRecargarInformacionToolBarEvaluacionesPeriodos;
	protected JButton jButtonProcesarInformacionToolBarEvaluacionesPeriodos;
	protected JButton jButtonAnterioresToolBarEvaluacionesPeriodos;
	protected JButton jButtonSiguientesToolBarEvaluacionesPeriodos;
	protected JButton jButtonNuevoGuardarCambiosToolBarEvaluacionesPeriodos;
	protected JButton jButtonAbrirOrderByToolBarEvaluacionesPeriodos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionesPeriodos;
	protected JMenuItem jMenuItemDuplicarEvaluacionesPeriodos;
	protected JMenuItem jMenuItemNuevoRelacionesEvaluacionesPeriodos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEvaluacionesPeriodos;
	protected JMenuItem jMenuItemCopiarEvaluacionesPeriodos;
	protected JMenuItem jMenuItemVerFormEvaluacionesPeriodos;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionesPeriodos;
	protected JMenuItem jMenuItemCerrarEvaluacionesPeriodos;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionesPeriodos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEvaluacionesPeriodos;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionesPeriodos;
	
	protected JMenuItem jMenuItemRecargarInformacionEvaluacionesPeriodos;
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionesPeriodos;
	protected JMenuItem jMenuItemAnterioresEvaluacionesPeriodos;
	protected JMenuItem jMenuItemSiguientesEvaluacionesPeriodos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos;
	protected JMenuItem jMenuItemAbrirOrderByEvaluacionesPeriodos;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionesPeriodos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionesPeriodos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEvaluacionesPeriodos;
	protected JCheckBox jCheckBoxSeleccionadosEvaluacionesPeriodos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos;
	protected JCheckBox jCheckBoxConGraficoReporteEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEvaluacionesPeriodos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEvaluacionesPeriodos;
	protected JTextField jTextFieldValorCampoGeneralEvaluacionesPeriodos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEvaluacionesPeriodos;
	//public JList<Reporte> jListColumnasSelectReporteEvaluacionesPeriodos;
	//public JScrollPane jScrollColumnasSelectReporteEvaluacionesPeriodos;
	
	//public JLabel jLabelRelacionesSelectReporteEvaluacionesPeriodos;
	//public JList<Reporte> jListRelacionesSelectReporteEvaluacionesPeriodos;
	//public JScrollPane jScrollRelacionesSelectReporteEvaluacionesPeriodos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEvaluacionesPeriodos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEvaluacionesPeriodos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEvaluacionesPeriodos;
	//public JLabel jLabelTiposArchivoReporteDinamicoEvaluacionesPeriodos;
	
		
	//public JLabel jLabelArchivoImportacionEvaluacionesPeriodos;	
	//public JLabel jLabelPathArchivoImportacionEvaluacionesPeriodos;
	//protected JTextField jTextFieldPathArchivoImportacionEvaluacionesPeriodos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEvaluacionesPeriodos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos;
	
	//public JLabel jLabelColumnaCategoriaValorEvaluacionesPeriodos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEvaluacionesPeriodos;
	
	//public JLabel jLabelColumnasValoresGraficoEvaluacionesPeriodos;
	//public JList<Reporte> jListColumnasValoresGraficoEvaluacionesPeriodos;
	//public JScrollPane jScrollColumnasValoresGraficoEvaluacionesPeriodos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEvaluacionesPeriodos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEvaluacionesPeriodos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEvaluacionesPeriodos;
	public JPanel jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JButton jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	
	public JPanel jPanelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JLabel jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodosBusqueda= new JButtonMe();

	
	public JPanel jPanelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JLabel jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JCheckBox jCheckBoxverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JButton jButtonverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JLabel jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JButton jButtonid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodosBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JLabel jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JTextField jTextFieldcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JButton jButtoncodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JLabel jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JButton jButtonid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JLabel jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos;
	public JButton jButtonid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EvaluacionesPeriodosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesPeriodosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesPeriodosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesPeriodosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEvaluacionesPeriodos)	{
		this.jButtonRecargarInformacionEvaluacionesPeriodos = jButtonRecargarInformacionEvaluacionesPeriodos;
	}
	
	public JButton getjButtonProcesarInformacionEvaluacionesPeriodos() {
		return this.jButtonProcesarInformacionEvaluacionesPeriodos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionesPeriodos)	{
		this.jButtonProcesarInformacionEvaluacionesPeriodos = jButtonProcesarInformacionEvaluacionesPeriodos;
	}
	
	
	public JButton getjButtonRecargarInformacionEvaluacionesPeriodos() {
		return this.jButtonRecargarInformacionEvaluacionesPeriodos;
	}
	
	
	public List<EvaluacionesPeriodos> getevaluacionesperiodoss() {
		return this.evaluacionesperiodoss;
	}

	public void setevaluacionesperiodoss(List<EvaluacionesPeriodos> evaluacionesperiodoss) {
		this.evaluacionesperiodoss = evaluacionesperiodoss;
	}
	
	public List<EvaluacionesPeriodos> getevaluacionesperiodossAux() {
		return this.evaluacionesperiodossAux;
	}

	public void setevaluacionesperiodossAux(List<EvaluacionesPeriodos> evaluacionesperiodossAux) {
		this.evaluacionesperiodossAux = evaluacionesperiodossAux;
	}
	
	public List<EvaluacionesPeriodos> getevaluacionesperiodossEliminados() {
		return this.evaluacionesperiodossEliminados;
	}

	public void setEvaluacionesPeriodossEliminados(List<EvaluacionesPeriodos> evaluacionesperiodossEliminados) {
		this.evaluacionesperiodossEliminados = evaluacionesperiodossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEvaluacionesPeriodos() {
		return jComboBoxTiposSeleccionarEvaluacionesPeriodos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEvaluacionesPeriodos(
			JComboBox jComboBoxTiposSeleccionarEvaluacionesPeriodos) {
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos = jComboBoxTiposSeleccionarEvaluacionesPeriodos;
	}
	
	public void setBorderResaltarTiposSeleccionarEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEvaluacionesPeriodos() {
		return jTextFieldValorCampoGeneralEvaluacionesPeriodos;
	}

	public void setjTextFieldValorCampoGeneralEvaluacionesPeriodos(
			JTextField jTextFieldValorCampoGeneralEvaluacionesPeriodos) {
		this.jTextFieldValorCampoGeneralEvaluacionesPeriodos = jTextFieldValorCampoGeneralEvaluacionesPeriodos;
	}

	public void setBorderResaltarValorCampoGeneralEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEvaluacionesPeriodos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEvaluacionesPeriodos() {
		return this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos;
	}

	public void setjCheckBoxSeleccionarTodosEvaluacionesPeriodos(
			JCheckBox jCheckBoxSeleccionarTodosEvaluacionesPeriodos) {
		this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos = jCheckBoxSeleccionarTodosEvaluacionesPeriodos;
	}

	public void setBorderResaltarSeleccionarTodosEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEvaluacionesPeriodos() {
		return this.jCheckBoxSeleccionadosEvaluacionesPeriodos;
	}

	public void setjCheckBoxSeleccionadosEvaluacionesPeriodos(
			JCheckBox jCheckBoxSeleccionadosEvaluacionesPeriodos) {
		this.jCheckBoxSeleccionadosEvaluacionesPeriodos = jCheckBoxSeleccionadosEvaluacionesPeriodos;
	}
	
	public void setBorderResaltarSeleccionadosEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEvaluacionesPeriodos() {
		return this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEvaluacionesPeriodos(
			JComboBox jComboBoxTiposArchivosReportesEvaluacionesPeriodos) {
		this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos = jComboBoxTiposArchivosReportesEvaluacionesPeriodos;
	}

	public void setBorderResaltarTiposArchivosReportesEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEvaluacionesPeriodos() {
		return this.jComboBoxTiposReportesEvaluacionesPeriodos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEvaluacionesPeriodos(
			JComboBox jComboBoxTiposReportesEvaluacionesPeriodos) {
		this.jComboBoxTiposReportesEvaluacionesPeriodos = jComboBoxTiposReportesEvaluacionesPeriodos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEvaluacionesPeriodos() {
	//	return jComboBoxTiposReportesDinamicoEvaluacionesPeriodos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEvaluacionesPeriodos(
	//		JComboBox jComboBoxTiposReportesDinamicoEvaluacionesPeriodos) {
	//	this.jComboBoxTiposReportesDinamicoEvaluacionesPeriodos = jComboBoxTiposReportesDinamicoEvaluacionesPeriodos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos() {
	//	return jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos = jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos;
	//}
	
	public void setBorderResaltarTiposReportesEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEvaluacionesPeriodos() {
		return this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEvaluacionesPeriodos(
			JComboBox jComboBoxTiposGraficosReportesEvaluacionesPeriodos) {
		this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos = jComboBoxTiposGraficosReportesEvaluacionesPeriodos;
	}
	
	public void setBorderResaltarTiposGraficosReportesEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEvaluacionesPeriodos() {
		return this.jComboBoxTiposPaginacionEvaluacionesPeriodos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEvaluacionesPeriodos(
			JComboBox jComboBoxTiposPaginacionEvaluacionesPeriodos) {
		this.jComboBoxTiposPaginacionEvaluacionesPeriodos = jComboBoxTiposPaginacionEvaluacionesPeriodos;
	}
	
	public void setBorderResaltarTiposPaginacionEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEvaluacionesPeriodos() {
		return this.jComboBoxTiposRelacionesEvaluacionesPeriodos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionesPeriodos() {
		return this.jComboBoxTiposAccionesEvaluacionesPeriodos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionesPeriodos(
			JComboBox jComboBoxTiposRelacionesEvaluacionesPeriodos) {
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos = jComboBoxTiposRelacionesEvaluacionesPeriodos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionesPeriodos(
			JComboBox jComboBoxTiposAccionesEvaluacionesPeriodos) {
		this.jComboBoxTiposAccionesEvaluacionesPeriodos = jComboBoxTiposAccionesEvaluacionesPeriodos;
	}
	
	public void setBorderResaltarTiposRelacionesEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEvaluacionesPeriodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEvaluacionesPeriodos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEvaluacionesPeriodos() {
	//	return jCheckBoxConGraficoDinamicoEvaluacionesPeriodos;
	//}

	//public void setjCheckBoxConGraficoDinamicoEvaluacionesPeriodos(
	//		JCheckBox jCheckBoxConGraficoDinamicoEvaluacionesPeriodos) {
	//	this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos = jCheckBoxConGraficoDinamicoEvaluacionesPeriodos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEvaluacionesPeriodos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEvaluacionesPeriodos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos .setBorder(borderResaltar);		
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
		this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
		
		this.evaluacionesperiodosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesperiodosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EvaluacionesPeriodosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EvaluacionesPeriodosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionesPeriodosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionesPeriodosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionesPeriodosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluaciones Periodos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
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
		
		EvaluacionesPeriodosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEvaluacionesPeriodos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"nuevo","nuevo","Nuevo"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"duplicar","duplicar","Duplicar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"copiar","copiar","Copiar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"ver_form","ver_form","Ver"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"recargar","recargar","Buscar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,
							"cerrar","cerrar","Salir"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEvaluacionesPeriodos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEvaluacionesPeriodos;
			
				this.jButtonProcesarInformacionToolBarEvaluacionesPeriodos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEvaluacionesPeriodos;
				
		//protected JButton jButtonModificarToolBarEvaluacionesPeriodos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEvaluacionesPeriodos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEvaluacionesPeriodos=new JMenuMe("General");
		this.jmenuArchivoEvaluacionesPeriodos=new JMenuMe("Archivo");
		this.jmenuAccionesEvaluacionesPeriodos=new JMenuMe("Acciones");
		this.jmenuDatosEvaluacionesPeriodos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionesPeriodos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionesPeriodos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionesPeriodos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEvaluacionesPeriodos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEvaluacionesPeriodos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEvaluacionesPeriodos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEvaluacionesPeriodos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEvaluacionesPeriodos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEvaluacionesPeriodos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEvaluacionesPeriodos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionesPeriodos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionesPeriodos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEvaluacionesPeriodos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEvaluacionesPeriodos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEvaluacionesPeriodos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEvaluacionesPeriodos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEvaluacionesPeriodos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEvaluacionesPeriodos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionesPeriodos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionesPeriodos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionesPeriodos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEvaluacionesPeriodos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEvaluacionesPeriodos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEvaluacionesPeriodos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEvaluacionesPeriodos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEvaluacionesPeriodos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEvaluacionesPeriodos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEvaluacionesPeriodos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEvaluacionesPeriodos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEvaluacionesPeriodos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEvaluacionesPeriodos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEvaluacionesPeriodos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEvaluacionesPeriodos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEvaluacionesPeriodos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEvaluacionesPeriodos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEvaluacionesPeriodos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionesPeriodos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionesPeriodos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionesPeriodos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEvaluacionesPeriodos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEvaluacionesPeriodos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEvaluacionesPeriodos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEvaluacionesPeriodos.add(this.jMenuItemCerrarEvaluacionesPeriodos);
			
			this.jmenuAccionesEvaluacionesPeriodos.add(this.jMenuItemNuevoEvaluacionesPeriodos);
			this.jmenuAccionesEvaluacionesPeriodos.add(this.jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos);
			this.jmenuAccionesEvaluacionesPeriodos.add(this.jMenuItemNuevoRelacionesEvaluacionesPeriodos);
			this.jmenuAccionesEvaluacionesPeriodos.add(this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos);		
			this.jmenuAccionesEvaluacionesPeriodos.add(this.jMenuItemDuplicarEvaluacionesPeriodos);		
			this.jmenuAccionesEvaluacionesPeriodos.add(this.jMenuItemCopiarEvaluacionesPeriodos);		
			this.jmenuAccionesEvaluacionesPeriodos.add(this.jMenuItemVerFormEvaluacionesPeriodos);		
			
			this.jmenuDatosEvaluacionesPeriodos.add(this.jMenuItemRecargarInformacionEvaluacionesPeriodos);				
			this.jmenuDatosEvaluacionesPeriodos.add(this.jMenuItemAnterioresEvaluacionesPeriodos);				
			this.jmenuDatosEvaluacionesPeriodos.add(this.jMenuItemSiguientesEvaluacionesPeriodos);				
			this.jmenuDatosEvaluacionesPeriodos.add(this.jMenuItemAbrirOrderByEvaluacionesPeriodos);				
			this.jmenuDatosEvaluacionesPeriodos.add(this.jMenuItemMostrarOcultarEvaluacionesPeriodos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEvaluacionesPeriodos.add(this.jMenuItemGuardarCambiosEvaluacionesPeriodos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEvaluacionesPeriodos.add(this.jmenuArchivoEvaluacionesPeriodos);		
			this.jmenuBarEvaluacionesPeriodos.add(this.jmenuAccionesEvaluacionesPeriodos);		
			this.jmenuBarEvaluacionesPeriodos.add(this.jmenuDatosEvaluacionesPeriodos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEvaluacionesPeriodos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEvaluacionesPeriodos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setToolTipText("Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo Por Ejercicio Por Tipo Evaluacion Empleado ");
		this.jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JButtonMe();
		this.jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setText("Buscar");
		this.jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setToolTipText("Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo Por Ejercicio Por Tipo Evaluacion Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,"buscar_button","Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo Por Ejercicio Por Tipo Evaluacion Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos = new JLabelMe();
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setText("Tipo Calificacion Empleado :");
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setToolTipText("Tipo Calificacion Empleado");
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos = new JLabelMe();
		jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setText("Verificado :");
		jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setToolTipText("Verificado");
		jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JCheckBoxMe();
		jCheckBoxverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos = new JLabelMe();
		jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setText("Estructura :");
		jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos = new JLabelMe();
		jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setText("Codigo :");
		jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setToolTipText("Codigo");
		jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JTextFieldMe();
		jTextFieldcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos = new JLabelMe();
		jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos = new JLabelMe();
		jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setText("Tipo Evaluacion Empleado :");
		jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setToolTipText("Tipo Evaluacion Empleado");
		jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEvaluacionesPeriodos=new JTabbedPane();


		this.jTabbedPaneBusquedasEvaluacionesPeriodos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasEvaluacionesPeriodos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasEvaluacionesPeriodos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEvaluacionesPeriodos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEvaluacionesPeriodos = new EvaluacionesPeriodosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Evaluaciones Periodos DATOS");
			this.jInternalFrameDetalleFormEvaluacionesPeriodos = new EvaluacionesPeriodosDetalleFormJInternalFrame(jDesktopPane,this.evaluacionesperiodosSessionBean.getConGuardarRelaciones(),this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos = null;//new EvaluacionesPeriodosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionesPeriodos= new GridBagLayout();
		
		
		this.jTableDatosEvaluacionesPeriodos = new JTableMe();      
		
		String sToolTipEvaluacionesPeriodos="";
		sToolTipEvaluacionesPeriodos=EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionesPeriodos+="(Nomina.EvaluacionesPeriodos)";
		}
		
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionesPeriodos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEvaluacionesPeriodos.setToolTipText(sToolTipEvaluacionesPeriodos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEvaluacionesPeriodos);
		this.jTableDatosEvaluacionesPeriodos.setAutoCreateRowSorter(true);
		this.jTableDatosEvaluacionesPeriodos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEvaluacionesPeriodos.setRowSelectionAllowed(true);
		this.jTableDatosEvaluacionesPeriodos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEvaluacionesPeriodos = new JButtonMe();
		this.jButtonDuplicarEvaluacionesPeriodos = new JButtonMe();
		this.jButtonCopiarEvaluacionesPeriodos = new JButtonMe();
		this.jButtonVerFormEvaluacionesPeriodos = new JButtonMe();
		this.jButtonNuevoRelacionesEvaluacionesPeriodos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos = new JButtonMe();
		this.jButtonCerrarEvaluacionesPeriodos = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionesPeriodos = new JScrollPane();   
        this.jScrollPanelDatosGeneralEvaluacionesPeriodos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluaciones Periodos";
		
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Periodoses" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionesPeriodos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionesPeriodos.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionesPeriodos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEvaluacionesPeriodos=new ReporteDinamicoJInternalFrame(EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEvaluacionesPeriodos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEvaluacionesPeriodos=new ImportacionJInternalFrame(EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEvaluacionesPeriodos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEvaluacionesPeriodos = new JButtonMe();
		
		this.jButtonAbrirOrderByEvaluacionesPeriodos.setText("Orden");
		this.jButtonAbrirOrderByEvaluacionesPeriodos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionesPeriodos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionesPeriodos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesPeriodos,false,this);
			
			//this.cargarOrderByEvaluacionesPeriodos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionesPeriodos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesPeriodos,true,this);
			
			//this.cargarOrderByEvaluacionesPeriodos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEvaluacionesPeriodos.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosEvaluacionesPeriodos.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosEvaluacionesPeriodos.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosEvaluacionesPeriodos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionesPeriodos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionesPeriodos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEvaluacionesPeriodos.setText("Nuevo");
		this.jButtonDuplicarEvaluacionesPeriodos.setText("Duplicar");
		this.jButtonCopiarEvaluacionesPeriodos.setText("Copiar");
		this.jButtonVerFormEvaluacionesPeriodos.setText("Ver");
		this.jButtonNuevoRelacionesEvaluacionesPeriodos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.setText("Guardar");
		this.jButtonCerrarEvaluacionesPeriodos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionesPeriodos,"nuevo_button","Nuevo",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEvaluacionesPeriodos,"duplicar_button","Duplicar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEvaluacionesPeriodos,"copiar_button","Copiar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEvaluacionesPeriodos,"ver_form","Ver",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEvaluacionesPeriodos,"nuevorelaciones_button","Nuevo Rel",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionesPeriodos,"guardarcambiostabla_button","Guardar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionesPeriodos,"cerrar_button","Salir",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEvaluacionesPeriodos.setToolTipText("Nuevo"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEvaluacionesPeriodos.setToolTipText("Duplicar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEvaluacionesPeriodos.setToolTipText("Copiar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEvaluacionesPeriodos.setToolTipText("Ver"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEvaluacionesPeriodos.setToolTipText("Nuevo Rel"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.setToolTipText("Guardar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionesPeriodos.setToolTipText("Salir"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionesPeriodos";
		inputMap = this.jButtonNuevoEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionesPeriodos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionesPeriodos"));
		
		//DUPLICAR
		sMapKey = "DuplicarEvaluacionesPeriodos";
		inputMap = this.jButtonDuplicarEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEvaluacionesPeriodos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEvaluacionesPeriodos"));
		
		//COPIAR
		sMapKey = "CopiarEvaluacionesPeriodos";
		inputMap = this.jButtonCopiarEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEvaluacionesPeriodos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEvaluacionesPeriodos"));
		
		//VEr FORM
		sMapKey = "VerFormEvaluacionesPeriodos";
		inputMap = this.jButtonVerFormEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEvaluacionesPeriodos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEvaluacionesPeriodos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEvaluacionesPeriodos";
		inputMap = this.jButtonNuevoRelacionesEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEvaluacionesPeriodos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEvaluacionesPeriodos";
		inputMap = this.jButtonModificarEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEvaluacionesPeriodos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionesPeriodos";
		inputMap = this.jButtonCerrarEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionesPeriodos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionesPeriodos";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionesPeriodos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EvaluacionesPeriodos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EvaluacionesPeriodos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EvaluacionesPeriodos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EvaluacionesPeriodos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EvaluacionesPeriodos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEvaluacionesPeriodos.setName("jPanelParametrosReportesEvaluacionesPeriodos"); 
		
		this.jPanelParametrosReportesAccionesEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEvaluacionesPeriodos.setName("jPanelParametrosReportesAccionesEvaluacionesPeriodos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEvaluacionesPeriodos = new JButtonMe();
		this.jButtonRecargarInformacionEvaluacionesPeriodos.setText("Buscar");
		this.jButtonRecargarInformacionEvaluacionesPeriodos.setToolTipText("Buscar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEvaluacionesPeriodos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionEvaluacionesPeriodos.setVisible(false);
		
		
		this.jButtonProcesarInformacionEvaluacionesPeriodos = new JButtonMe();
		this.jButtonProcesarInformacionEvaluacionesPeriodos.setText("Procesar");
		this.jButtonProcesarInformacionEvaluacionesPeriodos.setToolTipText("Procesar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEvaluacionesPeriodos.setVisible(false);
			
		this.jButtonProcesarInformacionEvaluacionesPeriodos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionesPeriodos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionesPeriodos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.setText("TIPO");       
		this.jComboBoxTiposReportesEvaluacionesPeriodos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEvaluacionesPeriodos.setText("Paginacion");
		this.jComboBoxTiposPaginacionEvaluacionesPeriodos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEvaluacionesPeriodos.setText("Accion");
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionesPeriodos.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.setText("Accion");
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEvaluacionesPeriodos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEvaluacionesPeriodos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionesPeriodos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionesPeriodos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEvaluacionesPeriodos = new JLabelMe();
		
		this.jLabelAccionesEvaluacionesPeriodos.setText("Acciones");		
		this.jLabelAccionesEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEvaluacionesPeriodos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEvaluacionesPeriodos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEvaluacionesPeriodos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEvaluacionesPeriodos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEvaluacionesPeriodos.setText("Graf.");
		this.jCheckBoxConGraficoReporteEvaluacionesPeriodos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEvaluacionesPeriodos = new JButtonMe();
		//this.jButtonAnterioresEvaluacionesPeriodos.setText("<<");
        this.jButtonAnterioresEvaluacionesPeriodos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEvaluacionesPeriodos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEvaluacionesPeriodos = new JButtonMe();
		//this.jButtonSiguientesEvaluacionesPeriodos.setText(">>");
        this.jButtonSiguientesEvaluacionesPeriodos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEvaluacionesPeriodos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos.setText("Nue");
        this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos,"nuevoguardarcambios_button","Nue",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEvaluacionesPeriodos";
		inputMap = this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEvaluacionesPeriodos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEvaluacionesPeriodos";
		inputMap = this.jButtonRecargarInformacionEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEvaluacionesPeriodos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEvaluacionesPeriodos";
		inputMap = this.jButtonSiguientesEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEvaluacionesPeriodos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEvaluacionesPeriodos";
		inputMap = this.jButtonAnterioresEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEvaluacionesPeriodos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEvaluacionesPeriodos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEvaluacionesPeriodos.setMinimumSize(new Dimension(this.getWidth(),EvaluacionesPeriodosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesPeriodosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionesPeriodos.setMaximumSize(new Dimension(this.getWidth(),EvaluacionesPeriodosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesPeriodosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionesPeriodos.setPreferredSize(new Dimension(this.getWidth(),EvaluacionesPeriodosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesPeriodosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEvaluacionesPeriodos = new GridBagLayout();

			this.jPanelPaginacionEvaluacionesPeriodos.setLayout(gridaBagLayoutPaginacionEvaluacionesPeriodos);						
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonAnterioresEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
					
						
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
			
			this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
						
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
			this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonSiguientesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 1;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonNuevoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
						
			
			
			if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionesPeriodos.gridy = 1;
				this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonGuardarCambiosTablaEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			}
			
			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 1;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonDuplicarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 1;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonCopiarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 1;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonVerFormEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 1;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEvaluacionesPeriodos.add(this.jButtonCerrarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		
		
		this.jButtonRecargarInformacionEvaluacionesPeriodos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionesPeriodos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionesPeriodos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEvaluacionesPeriodos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionesPeriodos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionesPeriodos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEvaluacionesPeriodos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionesPeriodos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionesPeriodos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEvaluacionesPeriodos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionesPeriodos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionesPeriodos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEvaluacionesPeriodos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionesPeriodos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionesPeriodos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEvaluacionesPeriodos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEvaluacionesPeriodos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EvaluacionesPeriodos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EvaluacionesPeriodos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EvaluacionesPeriodos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EvaluacionesPeriodos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEvaluacionesPeriodos.setLayout(gridaBagParametrosReportesEvaluacionesPeriodos);
			this.jPanelParametrosReportesAccionesEvaluacionesPeriodos.setLayout(gridaBagParametrosReportesAccionesEvaluacionesPeriodos);
			
			
			this.jPanelParametrosAuxiliar1EvaluacionesPeriodos.setLayout(gridaBagParametrosAuxiliar1EvaluacionesPeriodos);
			this.jPanelParametrosAuxiliar2EvaluacionesPeriodos.setLayout(gridaBagParametrosAuxiliar2EvaluacionesPeriodos);
			this.jPanelParametrosAuxiliar3EvaluacionesPeriodos.setLayout(gridaBagParametrosAuxiliar3EvaluacionesPeriodos);
			this.jPanelParametrosAuxiliar4EvaluacionesPeriodos.setLayout(gridaBagParametrosAuxiliar4EvaluacionesPeriodos);
			//this.jPanelParametrosAuxiliar5EvaluacionesPeriodos.setLayout(gridaBagParametrosAuxiliar2EvaluacionesPeriodos);			
			
			
			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jButtonRecargarInformacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesPeriodos.add(this.jComboBoxTiposPaginacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesPeriodos.add(this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesPeriodos.add(this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jPanelParametrosAuxiliar1EvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EvaluacionesPeriodos.add(this.jComboBoxTiposReportesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);																		
			
			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EvaluacionesPeriodos.add(this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jPanelParametrosAuxiliar4EvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jComboBoxTiposReportesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jCheckBoxGenerarReporteEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jPanelParametrosAuxiliar2EvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jLabelAccionesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jButtonAbrirOrderByEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jComboBoxTiposSeleccionarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);			
			
			
			/*
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jCheckBoxConGraficoReporteEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesPeriodos.add(this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);															
				
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesPeriodos.add(this.jCheckBoxSeleccionadosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);															
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesPeriodos.add(this.jCheckBoxConGraficoReporteEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jPanelParametrosAuxiliar3EvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesPeriodos.add(this.jComboBoxTiposAccionesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEvaluacionesPeriodos = new GridBagLayout();

			this.jScrollPanelDatosEvaluacionesPeriodos.setLayout(gridaBagLayoutDatosEvaluacionesPeriodos);
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
			
			this.jScrollPanelDatosEvaluacionesPeriodos.add(this.jTableDatosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEvaluacionesPeriodos.setViewportView(this.jTableDatosEvaluacionesPeriodos);
		this.jTableDatosEvaluacionesPeriodos.setFillsViewportHeight(true);
		this.jTableDatosEvaluacionesPeriodos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionesPeriodos= new GridBagLayout();
		this.jPanelAccionesEvaluacionesPeriodos.setLayout(gridaBagLayoutAccionesEvaluacionesPeriodos);
		
		
		/*	
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
			
		this.jPanelAccionesEvaluacionesPeriodos.add(this.jButtonNuevoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaEvaluacionesPeriodosEvaluacionesPeriodos= new GridBagLayout();
		gridaBagLayoutBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setLayout(gridaBagLayoutBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);

		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);

		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);


		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 1;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jLabelverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);

		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 1;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jCheckBoxverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);


		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 2;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jLabelid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);

		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 2;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);


		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 3;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jLabelcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);

		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 3;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jTextFieldcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);


		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 4;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jLabelid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);

		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 4;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);


		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 5;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jLabelid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);

		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 5;
		gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);

		gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesPeriodos.gridy = 6;
		gridBagConstraintsEvaluacionesPeriodos.gridx =1;
		jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.add(jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);

		jTabbedPaneBusquedasEvaluacionesPeriodos.addTab("1.-Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo Por Ejercicio Por Tipo Evaluacion Empleado ", jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
		jTabbedPaneBusquedasEvaluacionesPeriodos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionesPeriodos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;		
			//this.gridBagConstraintsEvaluacionesPeriodos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;		
		//this.gridBagConstraintsEvaluacionesPeriodos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEvaluacionesPeriodos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;		
			this.gridBagConstraintsEvaluacionesPeriodos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);								
		
		
		/*
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		*/		
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx =0;
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionesPeriodos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
				
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEvaluacionesPeriodos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionesPeriodos = new GridBagLayout();
			this.jPanelBusquedasParametrosEvaluacionesPeriodos.setLayout(gridaBagLayoutBusquedasParametrosEvaluacionesPeriodos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEvaluacionesPeriodos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			
			
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
			
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEvaluacionesPeriodos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEvaluacionesPeriodos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEvaluacionesPeriodos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEvaluacionesPeriodos.setName("jPanelReporteDinamicoEvaluacionesPeriodos"); 
		
		this.jPanelReporteDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEvaluacionesPeriodos.setLayout(gridaBagLayoutReporteDinamicoEvaluacionesPeriodos);
		
		
		this.jInternalFrameReporteDinamicoEvaluacionesPeriodos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEvaluacionesPeriodos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionesPeriodos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setResizable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setClosable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Periodoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEvaluacionesPeriodos = new JLabelMe();

		this.jLabelColumnasSelectReporteEvaluacionesPeriodos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jLabelColumnasSelectReporteEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEvaluacionesPeriodos = new JList<Reporte>();
		this.jListColumnasSelectReporteEvaluacionesPeriodos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEvaluacionesPeriodos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEvaluacionesPeriodos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionesPeriodos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionesPeriodos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEvaluacionesPeriodos=new JScrollPane(this.jListColumnasSelectReporteEvaluacionesPeriodos);
			
			this.jScrollColumnasSelectReporteEvaluacionesPeriodos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionesPeriodos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionesPeriodos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jListColumnasSelectReporteEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jScrollColumnasSelectReporteEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEvaluacionesPeriodos = new JLabelMe();

		this.jLabelRelacionesSelectReporteEvaluacionesPeriodos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEvaluacionesPeriodos = new JList<Reporte>();
		this.jListRelacionesSelectReporteEvaluacionesPeriodos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEvaluacionesPeriodos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEvaluacionesPeriodos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionesPeriodos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionesPeriodos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEvaluacionesPeriodos=new JScrollPane(this.jListRelacionesSelectReporteEvaluacionesPeriodos);
			
			this.jScrollRelacionesSelectReporteEvaluacionesPeriodos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionesPeriodos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionesPeriodos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos = new JComboBoxMe();
		this.jListColumnasValoresGraficoEvaluacionesPeriodos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEvaluacionesPeriodos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEvaluacionesPeriodos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEvaluacionesPeriodos = new JLabelMe();

		this.jLabelConGraficoDinamicoEvaluacionesPeriodos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jLabelConGraficoDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jCheckBoxConGraficoDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEvaluacionesPeriodos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEvaluacionesPeriodos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jLabelColumnaCategoriaGraficoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEvaluacionesPeriodos = new JLabelMe();

		this.jLabelColumnaCategoriaValorEvaluacionesPeriodos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jLabelColumnaCategoriaValorEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEvaluacionesPeriodos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEvaluacionesPeriodos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEvaluacionesPeriodos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEvaluacionesPeriodos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEvaluacionesPeriodos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jComboBoxColumnaCategoriaValorEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEvaluacionesPeriodos = new JLabelMe();

		this.jLabelColumnasValoresGraficoEvaluacionesPeriodos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jLabelColumnasValoresGraficoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEvaluacionesPeriodos = new JList<Reporte>();
		this.jListColumnasValoresGraficoEvaluacionesPeriodos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEvaluacionesPeriodos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEvaluacionesPeriodos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEvaluacionesPeriodos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEvaluacionesPeriodos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEvaluacionesPeriodos=new JScrollPane(this.jListColumnasValoresGraficoEvaluacionesPeriodos);
			
			this.jScrollColumnasValoresGraficoEvaluacionesPeriodos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEvaluacionesPeriodos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEvaluacionesPeriodos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jListColumnasSelectReporteEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jScrollColumnasValoresGraficoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesPeriodos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEvaluacionesPeriodos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jLabelTiposGraficosReportesDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEvaluacionesPeriodos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesPeriodos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesPeriodos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEvaluacionesPeriodos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jLabelGenerarExcelReporteDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodos.setToolTipText("Generar EXCEL"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jComboBoxTiposReportesDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesPeriodos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEvaluacionesPeriodos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jLabelTiposArchivoReporteDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEvaluacionesPeriodos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEvaluacionesPeriodos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEvaluacionesPeriodos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEvaluacionesPeriodos.setToolTipText("Generar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jButtonGenerarReporteDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEvaluacionesPeriodos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEvaluacionesPeriodos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEvaluacionesPeriodos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEvaluacionesPeriodos.setToolTipText("Cancelar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesPeriodos.add(this.jButtonCerrarReporteDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEvaluacionesPeriodos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEvaluacionesPeriodos= new JScrollPane(jPanelReporteDinamicoEvaluacionesPeriodos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Periodoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEvaluacionesPeriodos);
		this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getContentPane().add(this.jScrollPanelReporteDinamicoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEvaluacionesPeriodos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEvaluacionesPeriodos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEvaluacionesPeriodos.setName("jPanelImportacionEvaluacionesPeriodos"); 
		
		this.jPanelImportacionEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEvaluacionesPeriodos.setLayout(gridaBagLayoutImportacionEvaluacionesPeriodos);
		
		
		this.jInternalFrameImportacionEvaluacionesPeriodos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEvaluacionesPeriodos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEvaluacionesPeriodos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionesPeriodos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEvaluacionesPeriodos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionesPeriodos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionesPeriodos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEvaluacionesPeriodos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionesPeriodos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionesPeriodos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionesPeriodos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Periodoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEvaluacionesPeriodos = new JLabelMe();

		this.jLabelArchivoImportacionEvaluacionesPeriodos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionesPeriodos.add(this.jLabelArchivoImportacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEvaluacionesPeriodos = new JFileChooser();		
		this.jFileChooserImportacionEvaluacionesPeriodos.setToolTipText("ESCOGER ARCHIVO"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEvaluacionesPeriodos = new JButtonMe();
		this.jButtonAbrirImportacionEvaluacionesPeriodos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEvaluacionesPeriodos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEvaluacionesPeriodos.setToolTipText("Generar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesPeriodos.add(this.jButtonAbrirImportacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEvaluacionesPeriodos = new JLabelMe();

		this.jLabelPathArchivoImportacionEvaluacionesPeriodos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionesPeriodos.add(this.jLabelPathArchivoImportacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEvaluacionesPeriodos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEvaluacionesPeriodos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionesPeriodos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionesPeriodos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesPeriodos.add(this.jTextFieldPathArchivoImportacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEvaluacionesPeriodos = new JButtonMe();
		this.jButtonGenerarImportacionEvaluacionesPeriodos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEvaluacionesPeriodos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEvaluacionesPeriodos.setToolTipText("Generar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesPeriodos.add(this.jButtonGenerarImportacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEvaluacionesPeriodos = new JButtonMe();
		this.jButtonCerrarImportacionEvaluacionesPeriodos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEvaluacionesPeriodos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEvaluacionesPeriodos.setToolTipText("Cancelar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesPeriodos.add(this.jButtonCerrarImportacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEvaluacionesPeriodos = new GridBagLayout();
		
		this.jScrollPanelImportacionEvaluacionesPeriodos= new JScrollPane(jPanelImportacionEvaluacionesPeriodos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy =iPosYImportacion;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx =iPosXImportacion;
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEvaluacionesPeriodos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEvaluacionesPeriodos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEvaluacionesPeriodos);
		this.jInternalFrameImportacionEvaluacionesPeriodos.getContentPane().add(this.jScrollPanelImportacionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEvaluacionesPeriodos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEvaluacionesPeriodos = new JButtonMe();
			this.jButtonAbrirOrderByEvaluacionesPeriodos.setText("Orden");
			this.jButtonAbrirOrderByEvaluacionesPeriodos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionesPeriodos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEvaluacionesPeriodos";
			inputMap = this.jButtonAbrirOrderByEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEvaluacionesPeriodos"));
		
		
			GridBagLayout gridaBagLayoutOrderByEvaluacionesPeriodos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEvaluacionesPeriodos.setName("jPanelOrderByEvaluacionesPeriodos"); 
			
			this.jPanelOrderByEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEvaluacionesPeriodos.setLayout(gridaBagLayoutOrderByEvaluacionesPeriodos);
			
			
			this.jTableDatosEvaluacionesPeriodosOrderBy = new JTableMe();        
			this.jTableDatosEvaluacionesPeriodosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEvaluacionesPeriodosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEvaluacionesPeriodosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEvaluacionesPeriodosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEvaluacionesPeriodosOrderBy.setViewportView(this.jTableDatosEvaluacionesPeriodosOrderBy);
			this.jTableDatosEvaluacionesPeriodosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEvaluacionesPeriodosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEvaluacionesPeriodos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEvaluacionesPeriodos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEvaluacionesPeriodos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEvaluacionesPeriodos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEvaluacionesPeriodos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEvaluacionesPeriodos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEvaluacionesPeriodos.setTitle("Orden");
			this.jInternalFrameOrderByEvaluacionesPeriodos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEvaluacionesPeriodos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEvaluacionesPeriodos.setResizable(true);
			this.jInternalFrameOrderByEvaluacionesPeriodos.setClosable(true);
			this.jInternalFrameOrderByEvaluacionesPeriodos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Periodoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEvaluacionesPeriodos.ipady =150;
				
			this.jPanelOrderByEvaluacionesPeriodos.add(jScrollPanelDatosEvaluacionesPeriodosOrderBy, this.gridBagConstraintsEvaluacionesPeriodos);//this.jTableDatosEvaluacionesPeriodosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEvaluacionesPeriodos = new JButtonMe();
			this.jButtonCerrarOrderByEvaluacionesPeriodos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEvaluacionesPeriodos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEvaluacionesPeriodos.setToolTipText("Cancelar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEvaluacionesPeriodos.add(this.jButtonCerrarOrderByEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEvaluacionesPeriodos = new GridBagLayout();
			
			this.jScrollPanelOrderByEvaluacionesPeriodos= new JScrollPane(jPanelOrderByEvaluacionesPeriodos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iPosYOrderBy;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEvaluacionesPeriodos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEvaluacionesPeriodos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEvaluacionesPeriodos);
			
			this.jInternalFrameOrderByEvaluacionesPeriodos.getContentPane().add(this.jScrollPanelOrderByEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);			
		
		} else {
			this.jButtonAbrirOrderByEvaluacionesPeriodos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosEvaluacionesPeriodos.getRowHeight();//EvaluacionesPeriodosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EvaluacionesPeriodosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos.isSelected()) {
					iHeightTable=EvaluacionesPeriodosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionesPeriodosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionesPeriodosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EvaluacionesPeriodosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionesPeriodos.isSelected()) {
					iHeightTable=EvaluacionesPeriodosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionesPeriodosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionesPeriodosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEvaluacionesPeriodos!=null && this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy()!=null) {
			//if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEvaluacionesPeriodos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEvaluacionesPeriodos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEvaluacionesPeriodos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesperiodoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EvaluacionesPeriodos> TraerEvaluacionesPeriodosBeans(List<EvaluacionesPeriodos> evaluacionesperiodoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodoss) {
					
				if(!(EvaluacionesPeriodosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EvaluacionesPeriodosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					evaluacionesperiodos.setsDetalleGeneralEntityReporte(EvaluacionesPeriodosConstantesFunciones.getEvaluacionesPeriodosDescripcion(evaluacionesperiodos));
										
						
					
						
					
				} else  {
							
					//evaluacionesperiodos.setsDetalleGeneralEntityReporte(evaluacionesperiodos.getsDetalleGeneralEntityReporte());
										
				}
				
				//evaluacionesperiodosbeans.add(evaluacionesperiodosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return evaluacionesperiodoss;
    }
	//PARA REPORTES FIN
}
