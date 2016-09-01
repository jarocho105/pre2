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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.PreguntaEvaluacionConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class PreguntaEvaluacionJInternalFrame extends PreguntaEvaluacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPreguntaEvaluacion;
	
	protected JMenuBar jmenuBarPreguntaEvaluacion;
	
	protected JMenu jmenuPreguntaEvaluacion;
	protected JMenu jmenuDatosPreguntaEvaluacion;
	protected JMenu jmenuArchivoPreguntaEvaluacion;
	protected JMenu jmenuAccionesPreguntaEvaluacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPreguntaEvaluacion;	
	protected GridBagConstraints gridBagConstraintsPreguntaEvaluacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PreguntaEvaluacionDetalleFormJInternalFrame jInternalFrameDetalleFormPreguntaEvaluacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPreguntaEvaluacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPreguntaEvaluacion;	
	
	
	
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
	
	public PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PreguntaEvaluacion> preguntaevaluacions;		
	public List<PreguntaEvaluacion> preguntaevaluacionsEliminados;	
	public List<PreguntaEvaluacion> preguntaevaluacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPreguntaEvaluacion;		
	protected JButton jButtonAbrirOrderByPreguntaEvaluacion;
	
	
	//protected JPanel jPanelOrderByPreguntaEvaluacion;
	//public JScrollPane jScrollPanelOrderByPreguntaEvaluacion;	
	//protected JButton jButtonCerrarOrderByPreguntaEvaluacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PreguntaEvaluacionLogic preguntaevaluacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPreguntaEvaluacion;
	public JScrollPane jScrollPanelDatosEdicionPreguntaEvaluacion;
	public JScrollPane jScrollPanelDatosGeneralPreguntaEvaluacion;
    
	
	
	//public JScrollPane jScrollPanelDatosPreguntaEvaluacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPreguntaEvaluacion;
	//public JScrollPane jScrollPanelImportacionPreguntaEvaluacion;
	
	
	
	protected JPanel jPanelAccionesPreguntaEvaluacion;
	
    protected JPanel jPanelPaginacionPreguntaEvaluacion;
    protected JPanel jPanelParametrosReportesPreguntaEvaluacion;
	protected JPanel jPanelParametrosReportesAccionesPreguntaEvaluacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PreguntaEvaluacion;
	protected JPanel jPanelParametrosAuxiliar2PreguntaEvaluacion;
	protected JPanel jPanelParametrosAuxiliar3PreguntaEvaluacion;
	protected JPanel jPanelParametrosAuxiliar4PreguntaEvaluacion;
	//protected JPanel jPanelParametrosAuxiliar5PreguntaEvaluacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoPreguntaEvaluacion;
	//protected JPanel jPanelImportacionPreguntaEvaluacion;
	
	
	public JTable jTableDatosPreguntaEvaluacion;
	
	
	
	//public JTable jTableDatosPreguntaEvaluacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPreguntaEvaluacion;
	protected JButton jButtonDuplicarPreguntaEvaluacion;
	protected JButton jButtonCopiarPreguntaEvaluacion;
	protected JButton jButtonVerFormPreguntaEvaluacion;
	protected JButton jButtonNuevoRelacionesPreguntaEvaluacion;
	protected JButton jButtonModificarPreguntaEvaluacion;
	
    protected JButton jButtonGuardarCambiosTablaPreguntaEvaluacion;
	protected JButton jButtonCerrarPreguntaEvaluacion;
	
	
	protected JButton jButtonRecargarInformacionPreguntaEvaluacion;
	protected JButton jButtonProcesarInformacionPreguntaEvaluacion;
	
	
	protected JButton jButtonAnterioresPreguntaEvaluacion;
	protected JButton jButtonSiguientesPreguntaEvaluacion;
	protected JButton jButtonNuevoGuardarCambiosPreguntaEvaluacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPreguntaEvaluacion;
	//protected JButton jButtonCerrarReporteDinamicoPreguntaEvaluacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoPreguntaEvaluacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionPreguntaEvaluacion;
	//protected JButton jButtonGenerarImportacionPreguntaEvaluacion;
	//protected JButton jButtonCerrarImportacionPreguntaEvaluacion;
	//protected JFileChooser jFileChooserImportacionPreguntaEvaluacion;
	//protected File fileImportacionPreguntaEvaluacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPreguntaEvaluacion;
	protected JButton jButtonDuplicarToolBarPreguntaEvaluacion;
	protected JButton jButtonNuevoRelacionesToolBarPreguntaEvaluacion;
	
	
	public JButton jButtonGuardarCambiosToolBarPreguntaEvaluacion;
	protected JButton jButtonCopiarToolBarPreguntaEvaluacion;
	protected JButton jButtonVerFormToolBarPreguntaEvaluacion;
	public JButton jButtonGuardarCambiosTablaToolBarPreguntaEvaluacion;
	protected JButton jButtonMostrarOcultarTablaToolBarPreguntaEvaluacion;
	protected JButton jButtonCerrarToolBarPreguntaEvaluacion;
	
	protected JButton jButtonRecargarInformacionToolBarPreguntaEvaluacion;
	protected JButton jButtonProcesarInformacionToolBarPreguntaEvaluacion;
	protected JButton jButtonAnterioresToolBarPreguntaEvaluacion;
	protected JButton jButtonSiguientesToolBarPreguntaEvaluacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarPreguntaEvaluacion;
	protected JButton jButtonAbrirOrderByToolBarPreguntaEvaluacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPreguntaEvaluacion;
	protected JMenuItem jMenuItemDuplicarPreguntaEvaluacion;
	protected JMenuItem jMenuItemNuevoRelacionesPreguntaEvaluacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPreguntaEvaluacion;
	protected JMenuItem jMenuItemCopiarPreguntaEvaluacion;
	protected JMenuItem jMenuItemVerFormPreguntaEvaluacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPreguntaEvaluacion;
	protected JMenuItem jMenuItemCerrarPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleCerrarPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPreguntaEvaluacion;
	
	protected JMenuItem jMenuItemRecargarInformacionPreguntaEvaluacion;
	protected JMenuItem jMenuItemProcesarInformacionPreguntaEvaluacion;
	protected JMenuItem jMenuItemAnterioresPreguntaEvaluacion;
	protected JMenuItem jMenuItemSiguientesPreguntaEvaluacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPreguntaEvaluacion;
	protected JMenuItem jMenuItemAbrirOrderByPreguntaEvaluacion;
	protected JMenuItem jMenuItemMostrarOcultarPreguntaEvaluacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPreguntaEvaluacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPreguntaEvaluacion;
	protected JCheckBox jCheckBoxSeleccionadosPreguntaEvaluacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPreguntaEvaluacion;
	protected JCheckBox jCheckBoxConGraficoReportePreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPreguntaEvaluacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPreguntaEvaluacion;
	protected JTextField jTextFieldValorCampoGeneralPreguntaEvaluacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePreguntaEvaluacion;
	//public JList<Reporte> jListColumnasSelectReportePreguntaEvaluacion;
	//public JScrollPane jScrollColumnasSelectReportePreguntaEvaluacion;
	
	//public JLabel jLabelRelacionesSelectReportePreguntaEvaluacion;
	//public JList<Reporte> jListRelacionesSelectReportePreguntaEvaluacion;
	//public JScrollPane jScrollRelacionesSelectReportePreguntaEvaluacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPreguntaEvaluacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPreguntaEvaluacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPreguntaEvaluacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoPreguntaEvaluacion;
	
		
	//public JLabel jLabelArchivoImportacionPreguntaEvaluacion;	
	//public JLabel jLabelPathArchivoImportacionPreguntaEvaluacion;
	//protected JTextField jTextFieldPathArchivoImportacionPreguntaEvaluacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPreguntaEvaluacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion;
	
	//public JLabel jLabelColumnaCategoriaValorPreguntaEvaluacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPreguntaEvaluacion;
	
	//public JLabel jLabelColumnasValoresGraficoPreguntaEvaluacion;
	//public JList<Reporte> jListColumnasValoresGraficoPreguntaEvaluacion;
	//public JScrollPane jScrollColumnasValoresGraficoPreguntaEvaluacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPreguntaEvaluacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPreguntaEvaluacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPreguntaEvaluacion;
	public JPanel jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion;
	public JButton jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion;
	public JPanel jPanelBusquedaPorPreguntaPreguntaEvaluacion;
	public JButton jButtonBusquedaPorPreguntaPreguntaEvaluacion;
	
	public JPanel jPanelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion;
	public JLabel jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion;
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion;
	public JLabel jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion;
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacionBusqueda= new JButtonMe();

	
	public JPanel jPanelpreguntaBusquedaPorPreguntaPreguntaEvaluacion;
	public JLabel jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion;
	public JTextArea jTextAreapreguntaBusquedaPorPreguntaPreguntaEvaluacion;
	public JButton jButtonpreguntaBusquedaPorPreguntaPreguntaEvaluacionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PreguntaEvaluacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEvaluacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEvaluacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEvaluacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPreguntaEvaluacion)	{
		this.jButtonRecargarInformacionPreguntaEvaluacion = jButtonRecargarInformacionPreguntaEvaluacion;
	}
	
	public JButton getjButtonProcesarInformacionPreguntaEvaluacion() {
		return this.jButtonProcesarInformacionPreguntaEvaluacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPreguntaEvaluacion)	{
		this.jButtonProcesarInformacionPreguntaEvaluacion = jButtonProcesarInformacionPreguntaEvaluacion;
	}
	
	
	public JButton getjButtonRecargarInformacionPreguntaEvaluacion() {
		return this.jButtonRecargarInformacionPreguntaEvaluacion;
	}
	
	
	public List<PreguntaEvaluacion> getpreguntaevaluacions() {
		return this.preguntaevaluacions;
	}

	public void setpreguntaevaluacions(List<PreguntaEvaluacion> preguntaevaluacions) {
		this.preguntaevaluacions = preguntaevaluacions;
	}
	
	public List<PreguntaEvaluacion> getpreguntaevaluacionsAux() {
		return this.preguntaevaluacionsAux;
	}

	public void setpreguntaevaluacionsAux(List<PreguntaEvaluacion> preguntaevaluacionsAux) {
		this.preguntaevaluacionsAux = preguntaevaluacionsAux;
	}
	
	public List<PreguntaEvaluacion> getpreguntaevaluacionsEliminados() {
		return this.preguntaevaluacionsEliminados;
	}

	public void setPreguntaEvaluacionsEliminados(List<PreguntaEvaluacion> preguntaevaluacionsEliminados) {
		this.preguntaevaluacionsEliminados = preguntaevaluacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPreguntaEvaluacion() {
		return jComboBoxTiposSeleccionarPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPreguntaEvaluacion(
			JComboBox jComboBoxTiposSeleccionarPreguntaEvaluacion) {
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion = jComboBoxTiposSeleccionarPreguntaEvaluacion;
	}
	
	public void setBorderResaltarTiposSeleccionarPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPreguntaEvaluacion() {
		return jTextFieldValorCampoGeneralPreguntaEvaluacion;
	}

	public void setjTextFieldValorCampoGeneralPreguntaEvaluacion(
			JTextField jTextFieldValorCampoGeneralPreguntaEvaluacion) {
		this.jTextFieldValorCampoGeneralPreguntaEvaluacion = jTextFieldValorCampoGeneralPreguntaEvaluacion;
	}

	public void setBorderResaltarValorCampoGeneralPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPreguntaEvaluacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPreguntaEvaluacion() {
		return this.jCheckBoxSeleccionarTodosPreguntaEvaluacion;
	}

	public void setjCheckBoxSeleccionarTodosPreguntaEvaluacion(
			JCheckBox jCheckBoxSeleccionarTodosPreguntaEvaluacion) {
		this.jCheckBoxSeleccionarTodosPreguntaEvaluacion = jCheckBoxSeleccionarTodosPreguntaEvaluacion;
	}

	public void setBorderResaltarSeleccionarTodosPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPreguntaEvaluacion() {
		return this.jCheckBoxSeleccionadosPreguntaEvaluacion;
	}

	public void setjCheckBoxSeleccionadosPreguntaEvaluacion(
			JCheckBox jCheckBoxSeleccionadosPreguntaEvaluacion) {
		this.jCheckBoxSeleccionadosPreguntaEvaluacion = jCheckBoxSeleccionadosPreguntaEvaluacion;
	}
	
	public void setBorderResaltarSeleccionadosPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPreguntaEvaluacion() {
		return this.jComboBoxTiposArchivosReportesPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPreguntaEvaluacion(
			JComboBox jComboBoxTiposArchivosReportesPreguntaEvaluacion) {
		this.jComboBoxTiposArchivosReportesPreguntaEvaluacion = jComboBoxTiposArchivosReportesPreguntaEvaluacion;
	}

	public void setBorderResaltarTiposArchivosReportesPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPreguntaEvaluacion() {
		return this.jComboBoxTiposReportesPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPreguntaEvaluacion(
			JComboBox jComboBoxTiposReportesPreguntaEvaluacion) {
		this.jComboBoxTiposReportesPreguntaEvaluacion = jComboBoxTiposReportesPreguntaEvaluacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPreguntaEvaluacion() {
	//	return jComboBoxTiposReportesDinamicoPreguntaEvaluacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPreguntaEvaluacion(
	//		JComboBox jComboBoxTiposReportesDinamicoPreguntaEvaluacion) {
	//	this.jComboBoxTiposReportesDinamicoPreguntaEvaluacion = jComboBoxTiposReportesDinamicoPreguntaEvaluacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion = jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion;
	//}
	
	public void setBorderResaltarTiposReportesPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPreguntaEvaluacion() {
		return this.jComboBoxTiposGraficosReportesPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPreguntaEvaluacion(
			JComboBox jComboBoxTiposGraficosReportesPreguntaEvaluacion) {
		this.jComboBoxTiposGraficosReportesPreguntaEvaluacion = jComboBoxTiposGraficosReportesPreguntaEvaluacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPreguntaEvaluacion() {
		return this.jComboBoxTiposPaginacionPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPreguntaEvaluacion(
			JComboBox jComboBoxTiposPaginacionPreguntaEvaluacion) {
		this.jComboBoxTiposPaginacionPreguntaEvaluacion = jComboBoxTiposPaginacionPreguntaEvaluacion;
	}
	
	public void setBorderResaltarTiposPaginacionPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPreguntaEvaluacion() {
		return this.jComboBoxTiposRelacionesPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPreguntaEvaluacion() {
		return this.jComboBoxTiposAccionesPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPreguntaEvaluacion(
			JComboBox jComboBoxTiposRelacionesPreguntaEvaluacion) {
		this.jComboBoxTiposRelacionesPreguntaEvaluacion = jComboBoxTiposRelacionesPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPreguntaEvaluacion(
			JComboBox jComboBoxTiposAccionesPreguntaEvaluacion) {
		this.jComboBoxTiposAccionesPreguntaEvaluacion = jComboBoxTiposAccionesPreguntaEvaluacion;
	}
	
	public void setBorderResaltarTiposRelacionesPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPreguntaEvaluacion() {
	//	return jCheckBoxConGraficoDinamicoPreguntaEvaluacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoPreguntaEvaluacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoPreguntaEvaluacion) {
	//	this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion = jCheckBoxConGraficoDinamicoPreguntaEvaluacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPreguntaEvaluacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPreguntaEvaluacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion .setBorder(borderResaltar);		
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
		this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
		
		this.preguntaevaluacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntaevaluacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.preguntaevaluacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PreguntaEvaluacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pregunta Evaluacion MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
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
		
		PreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPreguntaEvaluacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"nuevo","nuevo","Nuevo"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"duplicar","duplicar","Duplicar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"copiar","copiar","Copiar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"ver_form","ver_form","Ver"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"recargar","recargar","Recargar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,
							"cerrar","cerrar","Salir"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPreguntaEvaluacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPreguntaEvaluacion;
			
				this.jButtonProcesarInformacionToolBarPreguntaEvaluacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPreguntaEvaluacion;
				
		//protected JButton jButtonModificarToolBarPreguntaEvaluacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPreguntaEvaluacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPreguntaEvaluacion=new JMenuMe("General");
		this.jmenuArchivoPreguntaEvaluacion=new JMenuMe("Archivo");
		this.jmenuAccionesPreguntaEvaluacion=new JMenuMe("Acciones");
		this.jmenuDatosPreguntaEvaluacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPreguntaEvaluacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPreguntaEvaluacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPreguntaEvaluacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPreguntaEvaluacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPreguntaEvaluacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPreguntaEvaluacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPreguntaEvaluacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPreguntaEvaluacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPreguntaEvaluacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPreguntaEvaluacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPreguntaEvaluacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPreguntaEvaluacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPreguntaEvaluacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPreguntaEvaluacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPreguntaEvaluacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPreguntaEvaluacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPreguntaEvaluacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPreguntaEvaluacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPreguntaEvaluacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPreguntaEvaluacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPreguntaEvaluacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPreguntaEvaluacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPreguntaEvaluacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPreguntaEvaluacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPreguntaEvaluacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPreguntaEvaluacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPreguntaEvaluacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPreguntaEvaluacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPreguntaEvaluacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPreguntaEvaluacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPreguntaEvaluacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPreguntaEvaluacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPreguntaEvaluacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPreguntaEvaluacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPreguntaEvaluacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPreguntaEvaluacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPreguntaEvaluacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPreguntaEvaluacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPreguntaEvaluacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPreguntaEvaluacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPreguntaEvaluacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPreguntaEvaluacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPreguntaEvaluacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPreguntaEvaluacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPreguntaEvaluacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPreguntaEvaluacion.add(this.jMenuItemCerrarPreguntaEvaluacion);
			
			this.jmenuAccionesPreguntaEvaluacion.add(this.jMenuItemNuevoPreguntaEvaluacion);
			this.jmenuAccionesPreguntaEvaluacion.add(this.jMenuItemNuevoGuardarCambiosPreguntaEvaluacion);
			this.jmenuAccionesPreguntaEvaluacion.add(this.jMenuItemNuevoRelacionesPreguntaEvaluacion);
			this.jmenuAccionesPreguntaEvaluacion.add(this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion);		
			this.jmenuAccionesPreguntaEvaluacion.add(this.jMenuItemDuplicarPreguntaEvaluacion);		
			this.jmenuAccionesPreguntaEvaluacion.add(this.jMenuItemCopiarPreguntaEvaluacion);		
			this.jmenuAccionesPreguntaEvaluacion.add(this.jMenuItemVerFormPreguntaEvaluacion);		
			
			this.jmenuDatosPreguntaEvaluacion.add(this.jMenuItemRecargarInformacionPreguntaEvaluacion);				
			this.jmenuDatosPreguntaEvaluacion.add(this.jMenuItemAnterioresPreguntaEvaluacion);				
			this.jmenuDatosPreguntaEvaluacion.add(this.jMenuItemSiguientesPreguntaEvaluacion);				
			this.jmenuDatosPreguntaEvaluacion.add(this.jMenuItemAbrirOrderByPreguntaEvaluacion);				
			this.jmenuDatosPreguntaEvaluacion.add(this.jMenuItemMostrarOcultarPreguntaEvaluacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPreguntaEvaluacion.add(this.jMenuItemGuardarCambiosPreguntaEvaluacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPreguntaEvaluacion.add(this.jmenuArchivoPreguntaEvaluacion);		
			this.jmenuBarPreguntaEvaluacion.add(this.jmenuAccionesPreguntaEvaluacion);		
			this.jmenuBarPreguntaEvaluacion.add(this.jmenuDatosPreguntaEvaluacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPreguntaEvaluacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPreguntaEvaluacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setToolTipText("Buscar Por Ejercicio Por Periodo ");
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion= new JButtonMe();
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setText("Buscar");
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setToolTipText("Buscar Por Ejercicio Por Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion,"buscar_button","Buscar Por Ejercicio Por Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion = new JLabelMe();
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion = new JLabelMe();
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setText("Periodo :");
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setToolTipText("Periodo");
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorPreguntaPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorPreguntaPreguntaEvaluacion.setToolTipText("Buscar Por Pregunta ");
		this.jButtonBusquedaPorPreguntaPreguntaEvaluacion= new JButtonMe();
		this.jButtonBusquedaPorPreguntaPreguntaEvaluacion.setText("Buscar");
		this.jButtonBusquedaPorPreguntaPreguntaEvaluacion.setToolTipText("Buscar Por Pregunta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorPreguntaPreguntaEvaluacion,"buscar_button","Buscar Por Pregunta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorPreguntaPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion = new JLabelMe();
		jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion.setText("Pregunta :");
		jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion.setToolTipText("Pregunta");
		jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreapreguntaBusquedaPorPreguntaPreguntaEvaluacion= new JTextAreaMe();
		jTextAreapreguntaBusquedaPorPreguntaPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaBusquedaPorPreguntaPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaBusquedaPorPreguntaPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreapreguntaBusquedaPorPreguntaPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPreguntaEvaluacion=new JTabbedPane();


		this.jTabbedPaneBusquedasPreguntaEvaluacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPreguntaEvaluacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPreguntaEvaluacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPreguntaEvaluacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePreguntaEvaluacion = new PreguntaEvaluacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pregunta Evaluacion DATOS");
			this.jInternalFrameDetalleFormPreguntaEvaluacion = new PreguntaEvaluacionDetalleFormJInternalFrame(jDesktopPane,this.preguntaevaluacionSessionBean.getConGuardarRelaciones(),this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPreguntaEvaluacion = null;//new PreguntaEvaluacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPreguntaEvaluacion= new GridBagLayout();
		
		
		this.jTableDatosPreguntaEvaluacion = new JTableMe();      
		
		String sToolTipPreguntaEvaluacion="";
		sToolTipPreguntaEvaluacion=PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPreguntaEvaluacion+="(Cartera.PreguntaEvaluacion)";
		}
		
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPreguntaEvaluacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPreguntaEvaluacion.setToolTipText(sToolTipPreguntaEvaluacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPreguntaEvaluacion);
		this.jTableDatosPreguntaEvaluacion.setAutoCreateRowSorter(true);
		this.jTableDatosPreguntaEvaluacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPreguntaEvaluacion.setRowSelectionAllowed(true);
		this.jTableDatosPreguntaEvaluacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPreguntaEvaluacion = new JButtonMe();
		this.jButtonDuplicarPreguntaEvaluacion = new JButtonMe();
		this.jButtonCopiarPreguntaEvaluacion = new JButtonMe();
		this.jButtonVerFormPreguntaEvaluacion = new JButtonMe();
		this.jButtonNuevoRelacionesPreguntaEvaluacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion = new JButtonMe();
		this.jButtonCerrarPreguntaEvaluacion = new JButtonMe();
		
		this.jScrollPanelDatosPreguntaEvaluacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralPreguntaEvaluacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pregunta Evaluacion";
		
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Evaluacions" + this.sPath));
		} else {
			this.jScrollPanelDatosPreguntaEvaluacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPreguntaEvaluacion.setToolTipText("Acciones");
        this.jPanelAccionesPreguntaEvaluacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPreguntaEvaluacion=new ReporteDinamicoJInternalFrame(PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPreguntaEvaluacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPreguntaEvaluacion=new ImportacionJInternalFrame(PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPreguntaEvaluacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPreguntaEvaluacion = new JButtonMe();
		
		this.jButtonAbrirOrderByPreguntaEvaluacion.setText("Orden");
		this.jButtonAbrirOrderByPreguntaEvaluacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPreguntaEvaluacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPreguntaEvaluacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaEvaluacion,false,this);
			
			//this.cargarOrderByPreguntaEvaluacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPreguntaEvaluacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaEvaluacion,true,this);
			
			//this.cargarOrderByPreguntaEvaluacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPreguntaEvaluacion.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosPreguntaEvaluacion.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosPreguntaEvaluacion.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosPreguntaEvaluacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPreguntaEvaluacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPreguntaEvaluacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPreguntaEvaluacion.setText("Nuevo");
		this.jButtonDuplicarPreguntaEvaluacion.setText("Duplicar");
		this.jButtonCopiarPreguntaEvaluacion.setText("Copiar");
		this.jButtonVerFormPreguntaEvaluacion.setText("Ver");
		this.jButtonNuevoRelacionesPreguntaEvaluacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.setText("Guardar");
		this.jButtonCerrarPreguntaEvaluacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPreguntaEvaluacion,"nuevo_button","Nuevo",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPreguntaEvaluacion,"duplicar_button","Duplicar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPreguntaEvaluacion,"copiar_button","Copiar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPreguntaEvaluacion,"ver_form","Ver",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPreguntaEvaluacion,"nuevorelaciones_button","Nuevo Rel",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPreguntaEvaluacion,"guardarcambiostabla_button","Guardar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPreguntaEvaluacion,"cerrar_button","Salir",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPreguntaEvaluacion.setToolTipText("Nuevo"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPreguntaEvaluacion.setToolTipText("Duplicar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPreguntaEvaluacion.setToolTipText("Copiar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPreguntaEvaluacion.setToolTipText("Ver"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPreguntaEvaluacion.setToolTipText("Nuevo Rel"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.setToolTipText("Guardar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPreguntaEvaluacion.setToolTipText("Salir"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPreguntaEvaluacion";
		inputMap = this.jButtonNuevoPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPreguntaEvaluacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarPreguntaEvaluacion";
		inputMap = this.jButtonDuplicarPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPreguntaEvaluacion"));
		
		//COPIAR
		sMapKey = "CopiarPreguntaEvaluacion";
		inputMap = this.jButtonCopiarPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPreguntaEvaluacion"));
		
		//VEr FORM
		sMapKey = "VerFormPreguntaEvaluacion";
		inputMap = this.jButtonVerFormPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPreguntaEvaluacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPreguntaEvaluacion";
		inputMap = this.jButtonNuevoRelacionesPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPreguntaEvaluacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPreguntaEvaluacion";
		inputMap = this.jButtonModificarPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPreguntaEvaluacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPreguntaEvaluacion";
		inputMap = this.jButtonCerrarPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPreguntaEvaluacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPreguntaEvaluacion";
		inputMap = this.jButtonGuardarCambiosTablaPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPreguntaEvaluacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPreguntaEvaluacion.setName("jPanelParametrosReportesPreguntaEvaluacion"); 
		
		this.jPanelParametrosReportesAccionesPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPreguntaEvaluacion.setName("jPanelParametrosReportesAccionesPreguntaEvaluacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPreguntaEvaluacion = new JButtonMe();
		this.jButtonRecargarInformacionPreguntaEvaluacion.setText("Recargar");
		this.jButtonRecargarInformacionPreguntaEvaluacion.setToolTipText("Recargar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPreguntaEvaluacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPreguntaEvaluacion = new JButtonMe();
		this.jButtonProcesarInformacionPreguntaEvaluacion.setText("Procesar");
		this.jButtonProcesarInformacionPreguntaEvaluacion.setToolTipText("Procesar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPreguntaEvaluacion.setVisible(false);
			
		this.jButtonProcesarInformacionPreguntaEvaluacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPreguntaEvaluacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPreguntaEvaluacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.setText("TIPO");       
		this.jComboBoxTiposReportesPreguntaEvaluacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPreguntaEvaluacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPreguntaEvaluacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionPreguntaEvaluacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPreguntaEvaluacion.setText("Accion");
		this.jComboBoxTiposRelacionesPreguntaEvaluacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPreguntaEvaluacion.setText("Accion");
		this.jComboBoxTiposAccionesPreguntaEvaluacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPreguntaEvaluacion.setText("Accion");
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPreguntaEvaluacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPreguntaEvaluacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPreguntaEvaluacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPreguntaEvaluacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPreguntaEvaluacion = new JLabelMe();
		
		this.jLabelAccionesPreguntaEvaluacion.setText("Acciones");		
		this.jLabelAccionesPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPreguntaEvaluacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPreguntaEvaluacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPreguntaEvaluacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePreguntaEvaluacion.setText("Graf.");
		this.jCheckBoxConGraficoReportePreguntaEvaluacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPreguntaEvaluacion = new JButtonMe();
		//this.jButtonAnterioresPreguntaEvaluacion.setText("<<");
        this.jButtonAnterioresPreguntaEvaluacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPreguntaEvaluacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPreguntaEvaluacion = new JButtonMe();
		//this.jButtonSiguientesPreguntaEvaluacion.setText(">>");
        this.jButtonSiguientesPreguntaEvaluacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPreguntaEvaluacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPreguntaEvaluacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPreguntaEvaluacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosPreguntaEvaluacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPreguntaEvaluacion,"nuevoguardarcambios_button","Nue",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPreguntaEvaluacion";
		inputMap = this.jButtonNuevoGuardarCambiosPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPreguntaEvaluacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPreguntaEvaluacion";
		inputMap = this.jButtonRecargarInformacionPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPreguntaEvaluacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPreguntaEvaluacion";
		inputMap = this.jButtonSiguientesPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPreguntaEvaluacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPreguntaEvaluacion";
		inputMap = this.jButtonAnterioresPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPreguntaEvaluacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPreguntaEvaluacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPreguntaEvaluacion.setMinimumSize(new Dimension(this.getWidth(),PreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPreguntaEvaluacion.setMaximumSize(new Dimension(this.getWidth(),PreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPreguntaEvaluacion.setPreferredSize(new Dimension(this.getWidth(),PreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPreguntaEvaluacion = new GridBagLayout();

			this.jPanelPaginacionPreguntaEvaluacion.setLayout(gridaBagLayoutPaginacionPreguntaEvaluacion);						
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonAnterioresPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
					
						
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
			
			this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonNuevoGuardarCambiosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
						
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
			this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonSiguientesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonNuevoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
				this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPreguntaEvaluacion.gridy = 1;
				this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonNuevoRelacionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			}
			
			
			if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
				this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPreguntaEvaluacion.gridy = 1;
				this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonGuardarCambiosTablaPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			}
			
			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonDuplicarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonCopiarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonVerFormPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPreguntaEvaluacion.add(this.jButtonCerrarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		
		
		this.jButtonRecargarInformacionPreguntaEvaluacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPreguntaEvaluacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPreguntaEvaluacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPreguntaEvaluacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPreguntaEvaluacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPreguntaEvaluacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPreguntaEvaluacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPreguntaEvaluacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPreguntaEvaluacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePreguntaEvaluacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePreguntaEvaluacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePreguntaEvaluacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPreguntaEvaluacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPreguntaEvaluacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPreguntaEvaluacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPreguntaEvaluacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPreguntaEvaluacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PreguntaEvaluacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PreguntaEvaluacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PreguntaEvaluacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PreguntaEvaluacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPreguntaEvaluacion.setLayout(gridaBagParametrosReportesPreguntaEvaluacion);
			this.jPanelParametrosReportesAccionesPreguntaEvaluacion.setLayout(gridaBagParametrosReportesAccionesPreguntaEvaluacion);
			
			
			this.jPanelParametrosAuxiliar1PreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar1PreguntaEvaluacion);
			this.jPanelParametrosAuxiliar2PreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar2PreguntaEvaluacion);
			this.jPanelParametrosAuxiliar3PreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar3PreguntaEvaluacion);
			this.jPanelParametrosAuxiliar4PreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar4PreguntaEvaluacion);
			//this.jPanelParametrosAuxiliar5PreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar2PreguntaEvaluacion);			
			
			
			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jButtonRecargarInformacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaEvaluacion.add(this.jComboBoxTiposPaginacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaEvaluacion.add(this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaEvaluacion.add(this.jComboBoxTiposArchivosReportesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jPanelParametrosAuxiliar1PreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PreguntaEvaluacion.add(this.jComboBoxTiposReportesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);																		
			
			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PreguntaEvaluacion.add(this.jComboBoxTiposGraficosReportesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jPanelParametrosAuxiliar4PreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jComboBoxTiposReportesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jCheckBoxGenerarReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jPanelParametrosAuxiliar2PreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jLabelAccionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
				this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jButtonAbrirOrderByPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jComboBoxTiposSeleccionarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
			
			
			/*
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jCheckBoxSeleccionarTodosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jCheckBoxConGraficoReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreguntaEvaluacion.add(this.jCheckBoxSeleccionarTodosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);															
				
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreguntaEvaluacion.add(this.jCheckBoxSeleccionadosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);															
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreguntaEvaluacion.add(this.jCheckBoxConGraficoReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jPanelParametrosAuxiliar3PreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jComboBoxTiposRelacionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
				
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jComboBoxTiposAccionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
	
				
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEvaluacion.add(this.jTextFieldValorCampoGeneralPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPreguntaEvaluacion = new GridBagLayout();

			this.jScrollPanelDatosPreguntaEvaluacion.setLayout(gridaBagLayoutDatosPreguntaEvaluacion);
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
			
			this.jScrollPanelDatosPreguntaEvaluacion.add(this.jTableDatosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPreguntaEvaluacion.setViewportView(this.jTableDatosPreguntaEvaluacion);
		this.jTableDatosPreguntaEvaluacion.setFillsViewportHeight(true);
		this.jTableDatosPreguntaEvaluacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPreguntaEvaluacion= new GridBagLayout();
		this.jPanelAccionesPreguntaEvaluacion.setLayout(gridaBagLayoutAccionesPreguntaEvaluacion);
		
		
		/*	
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
			
		this.jPanelAccionesPreguntaEvaluacion.add(this.jButtonNuevoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setLayout(gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);

		gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		gridBagConstraintsPreguntaEvaluacion.gridx = 0;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.add(jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);

		gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		gridBagConstraintsPreguntaEvaluacion.gridx = 1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.add(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);


		gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEvaluacion.gridy = 1;
		gridBagConstraintsPreguntaEvaluacion.gridx = 0;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.add(jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);

		gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEvaluacion.gridy = 1;
		gridBagConstraintsPreguntaEvaluacion.gridx = 1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.add(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);

		gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEvaluacion.gridy = 2;
		gridBagConstraintsPreguntaEvaluacion.gridx =1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.add(jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);

		jTabbedPaneBusquedasPreguntaEvaluacion.addTab("1.-Por Ejercicio Por Periodo ", jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
		jTabbedPaneBusquedasPreguntaEvaluacion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorPreguntaPreguntaEvaluacion= new GridBagLayout();
		gridaBagLayoutBusquedaPorPreguntaPreguntaEvaluacion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorPreguntaPreguntaEvaluacion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorPreguntaPreguntaEvaluacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorPreguntaPreguntaEvaluacion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorPreguntaPreguntaEvaluacion.setLayout(gridaBagLayoutBusquedaPorPreguntaPreguntaEvaluacion);

		gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		gridBagConstraintsPreguntaEvaluacion.gridx = 0;
		jPanelBusquedaPorPreguntaPreguntaEvaluacion.add(jLabelpreguntaBusquedaPorPreguntaPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);

		gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		gridBagConstraintsPreguntaEvaluacion.gridx = 1;
		jPanelBusquedaPorPreguntaPreguntaEvaluacion.add(jTextAreapreguntaBusquedaPorPreguntaPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);

		gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEvaluacion.gridy = 1;
		gridBagConstraintsPreguntaEvaluacion.gridx =1;
		jPanelBusquedaPorPreguntaPreguntaEvaluacion.add(jButtonBusquedaPorPreguntaPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);

		jTabbedPaneBusquedasPreguntaEvaluacion.addTab("2.-Por Pregunta ", jPanelBusquedaPorPreguntaPreguntaEvaluacion);
		jTabbedPaneBusquedasPreguntaEvaluacion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPreguntaEvaluacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();						
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;		
			//this.gridBagConstraintsPreguntaEvaluacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPreguntaEvaluacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;		
		//this.gridBagConstraintsPreguntaEvaluacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPreguntaEvaluacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;		
			this.gridBagConstraintsPreguntaEvaluacion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPreguntaEvaluacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);								
		
		
		/*
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		*/		
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPreguntaEvaluacion.gridx =0;
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPreguntaEvaluacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
				
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPreguntaEvaluacion = new GridBagLayout();
			this.jPanelBusquedasParametrosPreguntaEvaluacion.setLayout(gridaBagLayoutBusquedasParametrosPreguntaEvaluacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPreguntaEvaluacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			
			
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
			
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPreguntaEvaluacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPreguntaEvaluacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPreguntaEvaluacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPreguntaEvaluacion.setName("jPanelReporteDinamicoPreguntaEvaluacion"); 
		
		this.jPanelReporteDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPreguntaEvaluacion.setLayout(gridaBagLayoutReporteDinamicoPreguntaEvaluacion);
		
		
		this.jInternalFrameReporteDinamicoPreguntaEvaluacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPreguntaEvaluacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePreguntaEvaluacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Evaluacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePreguntaEvaluacion = new JLabelMe();

		this.jLabelColumnasSelectReportePreguntaEvaluacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelColumnasSelectReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePreguntaEvaluacion = new JList<Reporte>();
		this.jListColumnasSelectReportePreguntaEvaluacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePreguntaEvaluacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePreguntaEvaluacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePreguntaEvaluacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePreguntaEvaluacion=new JScrollPane(this.jListColumnasSelectReportePreguntaEvaluacion);
			
			this.jScrollColumnasSelectReportePreguntaEvaluacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePreguntaEvaluacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePreguntaEvaluacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jListColumnasSelectReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jScrollColumnasSelectReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePreguntaEvaluacion = new JLabelMe();

		this.jLabelRelacionesSelectReportePreguntaEvaluacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelRelacionesSelectReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePreguntaEvaluacion = new JList<Reporte>();
		this.jListRelacionesSelectReportePreguntaEvaluacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePreguntaEvaluacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePreguntaEvaluacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePreguntaEvaluacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePreguntaEvaluacion=new JScrollPane(this.jListRelacionesSelectReportePreguntaEvaluacion);
			
			this.jScrollRelacionesSelectReportePreguntaEvaluacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePreguntaEvaluacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePreguntaEvaluacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jListRelacionesSelectReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jScrollRelacionesSelectReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoPreguntaEvaluacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPreguntaEvaluacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPreguntaEvaluacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPreguntaEvaluacion = new JLabelMe();

		this.jLabelConGraficoDinamicoPreguntaEvaluacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelConGraficoDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jCheckBoxConGraficoDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPreguntaEvaluacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPreguntaEvaluacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelColumnaCategoriaGraficoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPreguntaEvaluacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorPreguntaEvaluacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelColumnaCategoriaValorPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPreguntaEvaluacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jComboBoxColumnaCategoriaValorPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPreguntaEvaluacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoPreguntaEvaluacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelColumnasValoresGraficoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPreguntaEvaluacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoPreguntaEvaluacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPreguntaEvaluacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPreguntaEvaluacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPreguntaEvaluacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPreguntaEvaluacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPreguntaEvaluacion=new JScrollPane(this.jListColumnasValoresGraficoPreguntaEvaluacion);
			
			this.jScrollColumnasValoresGraficoPreguntaEvaluacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPreguntaEvaluacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPreguntaEvaluacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jListColumnasSelectReportePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jScrollColumnasValoresGraficoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPreguntaEvaluacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPreguntaEvaluacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelTiposGraficosReportesDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPreguntaEvaluacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jComboBoxTiposGraficosReportesDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPreguntaEvaluacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPreguntaEvaluacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelGenerarExcelReporteDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPreguntaEvaluacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPreguntaEvaluacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPreguntaEvaluacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPreguntaEvaluacion.setToolTipText("Generar EXCEL"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jButtonGenerarExcelReporteDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jComboBoxTiposReportesDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPreguntaEvaluacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPreguntaEvaluacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jLabelTiposArchivoReporteDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jComboBoxTiposArchivosReportesDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPreguntaEvaluacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPreguntaEvaluacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPreguntaEvaluacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPreguntaEvaluacion.setToolTipText("Generar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jButtonGenerarReporteDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPreguntaEvaluacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPreguntaEvaluacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPreguntaEvaluacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPreguntaEvaluacion.setToolTipText("Cancelar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaEvaluacion.add(this.jButtonCerrarReporteDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPreguntaEvaluacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPreguntaEvaluacion= new JScrollPane(jPanelReporteDinamicoPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Evaluacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEvaluacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPreguntaEvaluacion);
		this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getContentPane().add(this.jScrollPanelReporteDinamicoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPreguntaEvaluacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPreguntaEvaluacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPreguntaEvaluacion.setName("jPanelImportacionPreguntaEvaluacion"); 
		
		this.jPanelImportacionPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPreguntaEvaluacion.setLayout(gridaBagLayoutImportacionPreguntaEvaluacion);
		
		
		this.jInternalFrameImportacionPreguntaEvaluacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPreguntaEvaluacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPreguntaEvaluacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePreguntaEvaluacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPreguntaEvaluacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPreguntaEvaluacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPreguntaEvaluacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPreguntaEvaluacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPreguntaEvaluacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPreguntaEvaluacion.setResizable(true);
	    this.jInternalFrameImportacionPreguntaEvaluacion.setClosable(true);
	    this.jInternalFrameImportacionPreguntaEvaluacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPreguntaEvaluacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPreguntaEvaluacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPreguntaEvaluacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPreguntaEvaluacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPreguntaEvaluacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPreguntaEvaluacion.setResizable(true);
	    this.jInternalFrameImportacionPreguntaEvaluacion.setClosable(true);
	    this.jInternalFrameImportacionPreguntaEvaluacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Evaluacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPreguntaEvaluacion = new JLabelMe();

		this.jLabelArchivoImportacionPreguntaEvaluacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPreguntaEvaluacion.add(this.jLabelArchivoImportacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPreguntaEvaluacion = new JFileChooser();		
		this.jFileChooserImportacionPreguntaEvaluacion.setToolTipText("ESCOGER ARCHIVO"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPreguntaEvaluacion = new JButtonMe();
		this.jButtonAbrirImportacionPreguntaEvaluacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPreguntaEvaluacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPreguntaEvaluacion.setToolTipText("Generar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaEvaluacion.add(this.jButtonAbrirImportacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPreguntaEvaluacion = new JLabelMe();

		this.jLabelPathArchivoImportacionPreguntaEvaluacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPreguntaEvaluacion.add(this.jLabelPathArchivoImportacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPreguntaEvaluacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPreguntaEvaluacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPreguntaEvaluacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPreguntaEvaluacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaEvaluacion.add(this.jTextFieldPathArchivoImportacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPreguntaEvaluacion = new JButtonMe();
		this.jButtonGenerarImportacionPreguntaEvaluacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPreguntaEvaluacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPreguntaEvaluacion.setToolTipText("Generar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaEvaluacion.add(this.jButtonGenerarImportacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPreguntaEvaluacion = new JButtonMe();
		this.jButtonCerrarImportacionPreguntaEvaluacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPreguntaEvaluacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPreguntaEvaluacion.setToolTipText("Cancelar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaEvaluacion.add(this.jButtonCerrarImportacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPreguntaEvaluacion = new GridBagLayout();
		
		this.jScrollPanelImportacionPreguntaEvaluacion= new JScrollPane(jPanelImportacionPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy =iPosYImportacion;
		this.gridBagConstraintsPreguntaEvaluacion.gridx =iPosXImportacion;
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPreguntaEvaluacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPreguntaEvaluacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPreguntaEvaluacion);
		this.jInternalFrameImportacionPreguntaEvaluacion.getContentPane().add(this.jScrollPanelImportacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPreguntaEvaluacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPreguntaEvaluacion = new JButtonMe();
			this.jButtonAbrirOrderByPreguntaEvaluacion.setText("Orden");
			this.jButtonAbrirOrderByPreguntaEvaluacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPreguntaEvaluacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPreguntaEvaluacion";
			inputMap = this.jButtonAbrirOrderByPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPreguntaEvaluacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByPreguntaEvaluacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPreguntaEvaluacion.setName("jPanelOrderByPreguntaEvaluacion"); 
			
			this.jPanelOrderByPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPreguntaEvaluacion.setLayout(gridaBagLayoutOrderByPreguntaEvaluacion);
			
			
			this.jTableDatosPreguntaEvaluacionOrderBy = new JTableMe();        
			this.jTableDatosPreguntaEvaluacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPreguntaEvaluacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPreguntaEvaluacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPreguntaEvaluacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPreguntaEvaluacionOrderBy.setViewportView(this.jTableDatosPreguntaEvaluacionOrderBy);
			this.jTableDatosPreguntaEvaluacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPreguntaEvaluacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPreguntaEvaluacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPreguntaEvaluacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPreguntaEvaluacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePreguntaEvaluacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPreguntaEvaluacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPreguntaEvaluacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPreguntaEvaluacion.setTitle("Orden");
			this.jInternalFrameOrderByPreguntaEvaluacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPreguntaEvaluacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPreguntaEvaluacion.setResizable(true);
			this.jInternalFrameOrderByPreguntaEvaluacion.setClosable(true);
			this.jInternalFrameOrderByPreguntaEvaluacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Evaluacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPreguntaEvaluacion.ipady =150;
				
			this.jPanelOrderByPreguntaEvaluacion.add(jScrollPanelDatosPreguntaEvaluacionOrderBy, this.gridBagConstraintsPreguntaEvaluacion);//this.jTableDatosPreguntaEvaluacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPreguntaEvaluacion = new JButtonMe();
			this.jButtonCerrarOrderByPreguntaEvaluacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPreguntaEvaluacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPreguntaEvaluacion.setToolTipText("Cancelar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPreguntaEvaluacion.add(this.jButtonCerrarOrderByPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPreguntaEvaluacion = new GridBagLayout();
			
			this.jScrollPanelOrderByPreguntaEvaluacion= new JScrollPane(jPanelOrderByPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsPreguntaEvaluacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPreguntaEvaluacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPreguntaEvaluacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPreguntaEvaluacion);
			
			this.jInternalFrameOrderByPreguntaEvaluacion.getContentPane().add(this.jScrollPanelOrderByPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
		
		} else {
			this.jButtonAbrirOrderByPreguntaEvaluacion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.preguntaevaluacionSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPreguntaEvaluacion.getRowHeight();//PreguntaEvaluacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion.isSelected()) {
					iHeightTable=PreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPreguntaEvaluacion.isSelected()) {
					iHeightTable=PreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPreguntaEvaluacion!=null && this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy()!=null) {
			//if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPreguntaEvaluacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPreguntaEvaluacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPreguntaEvaluacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=preguntaevaluacionLogic.getPreguntaEvaluacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntaevaluacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PreguntaEvaluacion> TraerPreguntaEvaluacionBeans(List<PreguntaEvaluacion> preguntaevaluacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacions) {
					
				if(!(PreguntaEvaluacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PreguntaEvaluacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					preguntaevaluacion.setsDetalleGeneralEntityReporte(PreguntaEvaluacionConstantesFunciones.getPreguntaEvaluacionDescripcion(preguntaevaluacion));
										
						
					
					

					if(preguntaevaluacion.getDetalleEvaluacionProveedors()!=null && Funciones.existeClass(classes,DetalleEvaluacionProveedor.class)) {
						try{preguntaevaluacion.setdetalleevaluacionproveedorsDescripcionReporte(new JRBeanCollectionDataSource(DetalleEvaluacionProveedorJInternalFrame.TraerDetalleEvaluacionProveedorBeans(preguntaevaluacion.getDetalleEvaluacionProveedors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(preguntaevaluacion.getSubPreguntaEvaluacions()!=null && Funciones.existeClass(classes,SubPreguntaEvaluacion.class)) {
						try{preguntaevaluacion.setsubpreguntaevaluacionsDescripcionReporte(new JRBeanCollectionDataSource(SubPreguntaEvaluacionJInternalFrame.TraerSubPreguntaEvaluacionBeans(preguntaevaluacion.getSubPreguntaEvaluacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//preguntaevaluacion.setsDetalleGeneralEntityReporte(preguntaevaluacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//preguntaevaluacionbeans.add(preguntaevaluacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return preguntaevaluacions;
    }
	//PARA REPORTES FIN
}
