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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;





//import com.bydan.erp.seguridad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.report.*;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarEjercicioPeriodoConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.report.*;
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
public class ProcesoCambiarEjercicioPeriodoJInternalFrame extends ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCambiarEjercicioPeriodo;
	
	protected JMenuBar jmenuBarProcesoCambiarEjercicioPeriodo;
	
	protected JMenu jmenuProcesoCambiarEjercicioPeriodo;
	protected JMenu jmenuDatosProcesoCambiarEjercicioPeriodo;
	protected JMenu jmenuArchivoProcesoCambiarEjercicioPeriodo;
	protected JMenu jmenuAccionesProcesoCambiarEjercicioPeriodo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCambiarEjercicioPeriodo;	
	protected GridBagConstraints gridBagConstraintsProcesoCambiarEjercicioPeriodo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCambiarEjercicioPeriodo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProcesoCambiarEjercicioPeriodoSessionBean procesocambiarejercicioperiodoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodos;		
	public List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosEliminados;	
	public List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCambiarEjercicioPeriodo;		
	protected JButton jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo;
	
	
	//protected JPanel jPanelOrderByProcesoCambiarEjercicioPeriodo;
	//public JScrollPane jScrollPanelOrderByProcesoCambiarEjercicioPeriodo;	
	//protected JButton jButtonCerrarOrderByProcesoCambiarEjercicioPeriodo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCambiarEjercicioPeriodoLogic procesocambiarejercicioperiodoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCambiarEjercicioPeriodo;
	public JScrollPane jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo;
	public JScrollPane jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCambiarEjercicioPeriodoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo;
	//public JScrollPane jScrollPanelImportacionProcesoCambiarEjercicioPeriodo;
	
	
	
	protected JPanel jPanelAccionesProcesoCambiarEjercicioPeriodo;
	
    protected JPanel jPanelPaginacionProcesoCambiarEjercicioPeriodo;
    protected JPanel jPanelParametrosReportesProcesoCambiarEjercicioPeriodo;
	protected JPanel jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCambiarEjercicioPeriodo;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCambiarEjercicioPeriodo;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCambiarEjercicioPeriodo;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCambiarEjercicioPeriodo;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo;
	//protected JPanel jPanelImportacionProcesoCambiarEjercicioPeriodo;
	
	
	public JTable jTableDatosProcesoCambiarEjercicioPeriodo;
	
	
	
	//public JTable jTableDatosProcesoCambiarEjercicioPeriodoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonDuplicarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonCopiarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonVerFormProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonModificarProcesoCambiarEjercicioPeriodo;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonCerrarProcesoCambiarEjercicioPeriodo;
	
	
	protected JButton jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo;
	
	
	protected JButton jButtonAnterioresProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonSiguientesProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodo;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodo;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCambiarEjercicioPeriodo;
	//protected JButton jButtonGenerarImportacionProcesoCambiarEjercicioPeriodo;
	//protected JButton jButtonCerrarImportacionProcesoCambiarEjercicioPeriodo;
	//protected JFileChooser jFileChooserImportacionProcesoCambiarEjercicioPeriodo;
	//protected File fileImportacionProcesoCambiarEjercicioPeriodo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonDuplicarToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonCopiarToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonVerFormToolBarProcesoCambiarEjercicioPeriodo;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonCerrarToolBarProcesoCambiarEjercicioPeriodo;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonProcesarInformacionToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonAnterioresToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonSiguientesToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonAbrirOrderByToolBarProcesoCambiarEjercicioPeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemDuplicarProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemCopiarProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemVerFormProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemCerrarProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemAnterioresProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemSiguientesProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCambiarEjercicioPeriodo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo;
	protected JTextField jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCambiarEjercicioPeriodo;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCambiarEjercicioPeriodo;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCambiarEjercicioPeriodo;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCambiarEjercicioPeriodo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCambiarEjercicioPeriodo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCambiarEjercicioPeriodo;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCambiarEjercicioPeriodo;	
	//public JLabel jLabelPathArchivoImportacionProcesoCambiarEjercicioPeriodo;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCambiarEjercicioPeriodo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCambiarEjercicioPeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCambiarEjercicioPeriodo;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCambiarEjercicioPeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCambiarEjercicioPeriodo;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCambiarEjercicioPeriodo;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCambiarEjercicioPeriodo;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCambiarEjercicioPeriodo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCambiarEjercicioPeriodo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCambiarEjercicioPeriodo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo;
	public JPanel jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo;
	public JButton jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo;
	
	public JPanel jPanelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo;
	public JLabel jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo;
	//public JFormattedTextField jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo;

	public JDateChooser jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo;
	public JButton jButtonfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodoBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoCambiarEjercicioPeriodoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEjercicioPeriodoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEjercicioPeriodoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEjercicioPeriodoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo)	{
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo = jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCambiarEjercicioPeriodo() {
		return this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo)	{
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo = jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCambiarEjercicioPeriodo() {
		return this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo;
	}
	
	
	public List<ProcesoCambiarEjercicioPeriodo> getprocesocambiarejercicioperiodos() {
		return this.procesocambiarejercicioperiodos;
	}

	public void setprocesocambiarejercicioperiodos(List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodos) {
		this.procesocambiarejercicioperiodos = procesocambiarejercicioperiodos;
	}
	
	public List<ProcesoCambiarEjercicioPeriodo> getprocesocambiarejercicioperiodosAux() {
		return this.procesocambiarejercicioperiodosAux;
	}

	public void setprocesocambiarejercicioperiodosAux(List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosAux) {
		this.procesocambiarejercicioperiodosAux = procesocambiarejercicioperiodosAux;
	}
	
	public List<ProcesoCambiarEjercicioPeriodo> getprocesocambiarejercicioperiodosEliminados() {
		return this.procesocambiarejercicioperiodosEliminados;
	}

	public void setProcesoCambiarEjercicioPeriodosEliminados(List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosEliminados) {
		this.procesocambiarejercicioperiodosEliminados = procesocambiarejercicioperiodosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo() {
		return jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo = jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo() {
		return jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo;
	}

	public void setjTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo(
			JTextField jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo) {
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo = jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo() {
		return this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo) {
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo = jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo() {
		return this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo;
	}

	public void setjCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo(
			JCheckBox jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo) {
		this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo = jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo() {
		return this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo = jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCambiarEjercicioPeriodo() {
		return this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo = jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo() {
	//	return jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo = jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo = jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo() {
		return this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo = jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo() {
		return this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo = jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo() {
		return this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo() {
		return this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo = jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo = jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCambiarEjercicioPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo() {
	//	return jCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo = jCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCambiarEjercicioPeriodo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo .setBorder(borderResaltar);		
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
		this.procesocambiarejercicioperiodoSessionBean=new ProcesoCambiarEjercicioPeriodoSessionBean();
		
		this.procesocambiarejercicioperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarejercicioperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCambiarEjercicioPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCambiarEjercicioPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCambiarEjercicioPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCambiarEjercicioPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCambiarEjercicioPeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cambiar Ejercicio Periodo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCambiarEjercicioPeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCambiarEjercicioPeriodo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"copiar","copiar","Copiar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"ver_form","ver_form","Ver"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"recargar","recargar","Procesar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,
							"cerrar","cerrar","Salir"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo;
			
				this.jButtonProcesarInformacionToolBarProcesoCambiarEjercicioPeriodo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCambiarEjercicioPeriodo;
				
		//protected JButton jButtonModificarToolBarProcesoCambiarEjercicioPeriodo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCambiarEjercicioPeriodo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCambiarEjercicioPeriodo=new JMenuMe("General");
		this.jmenuArchivoProcesoCambiarEjercicioPeriodo=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCambiarEjercicioPeriodo=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCambiarEjercicioPeriodo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCambiarEjercicioPeriodo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCambiarEjercicioPeriodo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCambiarEjercicioPeriodo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCambiarEjercicioPeriodo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCambiarEjercicioPeriodo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCambiarEjercicioPeriodo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCambiarEjercicioPeriodo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCambiarEjercicioPeriodo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCambiarEjercicioPeriodo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCambiarEjercicioPeriodo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCambiarEjercicioPeriodo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCambiarEjercicioPeriodo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCambiarEjercicioPeriodo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCambiarEjercicioPeriodo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCambiarEjercicioPeriodo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCambiarEjercicioPeriodo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCambiarEjercicioPeriodo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCambiarEjercicioPeriodo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCambiarEjercicioPeriodo.add(this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo);
			
			this.jmenuAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo);
			this.jmenuAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo);
			this.jmenuAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo);
			this.jmenuAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo);		
			this.jmenuAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemDuplicarProcesoCambiarEjercicioPeriodo);		
			this.jmenuAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemCopiarProcesoCambiarEjercicioPeriodo);		
			this.jmenuAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemVerFormProcesoCambiarEjercicioPeriodo);		
			
			this.jmenuDatosProcesoCambiarEjercicioPeriodo.add(this.jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo);				
			this.jmenuDatosProcesoCambiarEjercicioPeriodo.add(this.jMenuItemAnterioresProcesoCambiarEjercicioPeriodo);				
			this.jmenuDatosProcesoCambiarEjercicioPeriodo.add(this.jMenuItemSiguientesProcesoCambiarEjercicioPeriodo);				
			this.jmenuDatosProcesoCambiarEjercicioPeriodo.add(this.jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo);				
			this.jmenuDatosProcesoCambiarEjercicioPeriodo.add(this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCambiarEjercicioPeriodo.add(this.jmenuArchivoProcesoCambiarEjercicioPeriodo);		
			this.jmenuBarProcesoCambiarEjercicioPeriodo.add(this.jmenuAccionesProcesoCambiarEjercicioPeriodo);		
			this.jmenuBarProcesoCambiarEjercicioPeriodo.add(this.jmenuDatosProcesoCambiarEjercicioPeriodo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCambiarEjercicioPeriodo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCambiarEjercicioPeriodo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setToolTipText("Procesar Proceso Cambiar Ejercicio Periodo");
		this.jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo= new JButtonMe();
		this.jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setText("Procesar");
		this.jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setToolTipText("Procesar Proceso Cambiar Ejercicio Periodo");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo,"buscar_button","Procesar Proceso Cambiar Ejercicio Periodo");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo = new JLabelMe();
		jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setText("Fecha Sistema :");
		jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setToolTipText("Fecha Sistema");
		jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo= new JDateChooser();
		jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setDate(new Date());
		jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Cambiar Ejercicio Periodo"));
		this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCambiarEjercicioPeriodo = new ProcesoCambiarEjercicioPeriodoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Cambiar Ejercicio Periodo DATOS");
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo = new ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame(jDesktopPane,this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones(),this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo = null;//new ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCambiarEjercicioPeriodo= new GridBagLayout();
		
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo = new JTableMe();      
		
		String sToolTipProcesoCambiarEjercicioPeriodo="";
		sToolTipProcesoCambiarEjercicioPeriodo=ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCambiarEjercicioPeriodo+="(Seguridad.ProcesoCambiarEjercicioPeriodo)";
		}
		
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCambiarEjercicioPeriodo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setToolTipText(sToolTipProcesoCambiarEjercicioPeriodo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCambiarEjercicioPeriodo);
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonDuplicarProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonCopiarProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonVerFormProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cambiar Ejercicio Periodo";
		
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Ejercicio Periodos" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo=new ReporteDinamicoJInternalFrame(ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCambiarEjercicioPeriodo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo=new ImportacionJInternalFrame(ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCambiarEjercicioPeriodo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.setText("Orden");
		this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo,false,this);
			
			//this.cargarOrderByProcesoCambiarEjercicioPeriodo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo,true,this);
			
			//this.cargarOrderByProcesoCambiarEjercicioPeriodo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(400,50));//230
		
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCambiarEjercicioPeriodo.setText("Nuevo");
		this.jButtonDuplicarProcesoCambiarEjercicioPeriodo.setText("Duplicar");
		this.jButtonCopiarProcesoCambiarEjercicioPeriodo.setText("Copiar");
		this.jButtonVerFormProcesoCambiarEjercicioPeriodo.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.setText("Guardar");
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCambiarEjercicioPeriodo,"nuevo_button","Nuevo",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCambiarEjercicioPeriodo,"duplicar_button","Duplicar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCambiarEjercicioPeriodo,"copiar_button","Copiar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCambiarEjercicioPeriodo,"ver_form","Ver",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo,"nuevorelaciones_button","Nuevo Rel",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo,"guardarcambiostabla_button","Guardar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCambiarEjercicioPeriodo,"cerrar_button","Salir",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo.setToolTipText("Nuevo"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCambiarEjercicioPeriodo.setToolTipText("Duplicar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCambiarEjercicioPeriodo.setToolTipText("Copiar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCambiarEjercicioPeriodo.setToolTipText("Ver"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.setToolTipText("Nuevo Rel"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.setToolTipText("Guardar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.setToolTipText("Salir"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonNuevoProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCambiarEjercicioPeriodo"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonDuplicarProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCambiarEjercicioPeriodo"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonCopiarProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCambiarEjercicioPeriodo"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonVerFormProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCambiarEjercicioPeriodo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCambiarEjercicioPeriodo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonModificarProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCambiarEjercicioPeriodo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonCerrarProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCambiarEjercicioPeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCambiarEjercicioPeriodo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCambiarEjercicioPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCambiarEjercicioPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCambiarEjercicioPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCambiarEjercicioPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setName("jPanelParametrosReportesProcesoCambiarEjercicioPeriodo"); 
		
		this.jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo.setName("jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.setText("Procesar");
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.setToolTipText("Procesar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo.setToolTipText("Procesar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo = new JLabelMe();
		
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo.setText("Acciones");		
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCambiarEjercicioPeriodo = new JButtonMe();
		//this.jButtonAnterioresProcesoCambiarEjercicioPeriodo.setText("<<");
        this.jButtonAnterioresProcesoCambiarEjercicioPeriodo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCambiarEjercicioPeriodo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCambiarEjercicioPeriodo = new JButtonMe();
		//this.jButtonSiguientesProcesoCambiarEjercicioPeriodo.setText(">>");
        this.jButtonSiguientesProcesoCambiarEjercicioPeriodo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCambiarEjercicioPeriodo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo,"nuevoguardarcambios_button","Nue",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCambiarEjercicioPeriodo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCambiarEjercicioPeriodo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonSiguientesProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCambiarEjercicioPeriodo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonAnterioresProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCambiarEjercicioPeriodo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCambiarEjercicioPeriodo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(this.getWidth(),ProcesoCambiarEjercicioPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarEjercicioPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(this.getWidth(),ProcesoCambiarEjercicioPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarEjercicioPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(this.getWidth(),ProcesoCambiarEjercicioPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarEjercicioPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCambiarEjercicioPeriodo = new GridBagLayout();

			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutPaginacionProcesoCambiarEjercicioPeriodo);						
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonAnterioresProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
					
						
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
			
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
						
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonSiguientesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonNuevoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
						
			
			
			if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
				this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 1;
				this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			}
			
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonDuplicarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonCopiarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonVerFormProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.add(this.jButtonCerrarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setLayout(gridaBagParametrosReportesProcesoCambiarEjercicioPeriodo);
			this.jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo.setLayout(gridaBagParametrosReportesAccionesProcesoCambiarEjercicioPeriodo);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo.setLayout(gridaBagParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo);
			this.jPanelParametrosAuxiliar2ProcesoCambiarEjercicioPeriodo.setLayout(gridaBagParametrosAuxiliar2ProcesoCambiarEjercicioPeriodo);
			this.jPanelParametrosAuxiliar3ProcesoCambiarEjercicioPeriodo.setLayout(gridaBagParametrosAuxiliar3ProcesoCambiarEjercicioPeriodo);
			this.jPanelParametrosAuxiliar4ProcesoCambiarEjercicioPeriodo.setLayout(gridaBagParametrosAuxiliar4ProcesoCambiarEjercicioPeriodo);
			//this.jPanelParametrosAuxiliar5ProcesoCambiarEjercicioPeriodo.setLayout(gridaBagParametrosAuxiliar2ProcesoCambiarEjercicioPeriodo);			
			
			
			
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo.add(this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jPanelParametrosAuxiliar1ProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jPanelParametrosAuxiliar4ProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jCheckBoxGenerarReporteProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jPanelParametrosAuxiliar2ProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jLabelAccionesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);			
			
			
			/*
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCambiarEjercicioPeriodo.add(this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);															
				
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCambiarEjercicioPeriodo.add(this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jPanelParametrosAuxiliar3ProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCambiarEjercicioPeriodo = new GridBagLayout();

			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutDatosProcesoCambiarEjercicioPeriodo);
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
			
			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.add(this.jTableDatosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setViewportView(this.jTableDatosProcesoCambiarEjercicioPeriodo);
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setFillsViewportHeight(true);
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCambiarEjercicioPeriodo= new GridBagLayout();
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutAccionesProcesoCambiarEjercicioPeriodo);
		
		
		/*	
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
			
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo.add(this.jButtonNuevoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);

		gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
		jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.add(jLabelfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo, gridBagConstraintsProcesoCambiarEjercicioPeriodo);

		gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 1;
		jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.add(jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo, gridBagConstraintsProcesoCambiarEjercicioPeriodo);

		gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 1;
		gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =1;
		jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.add(jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo, gridBagConstraintsProcesoCambiarEjercicioPeriodo);

		jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.addTab("1.-Por Fecha Sistema ", jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
		jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCambiarEjercicioPeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCambiarEjercicioPeriodo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;		
			//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;		
		//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);								
		
		
		/*
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		*/		
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =0;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
				
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCambiarEjercicioPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutBusquedasParametrosProcesoCambiarEjercicioPeriodo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			
			
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
			
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jButtonAnterioresProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jButtonSiguientesProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		
		this.jTtoolBarProcesoCambiarEjercicioPeriodo.setVisible(false);
			
		this.jMenuItemAnterioresProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jMenuItemSiguientesProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCambiarEjercicioPeriodo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCambiarEjercicioPeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setName("jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo"); 
		
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutReporteDinamicoProcesoCambiarEjercicioPeriodo);
		
		
		this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Ejercicio Periodos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCambiarEjercicioPeriodo = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jLabelColumnasSelectReporteProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo=new JScrollPane(this.jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo);
			
			this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jListColumnasSelectReporteProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCambiarEjercicioPeriodo = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCambiarEjercicioPeriodo = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCambiarEjercicioPeriodo=new JScrollPane(this.jListRelacionesSelectReporteProcesoCambiarEjercicioPeriodo);
			
			this.jScrollRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCambiarEjercicioPeriodo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCambiarEjercicioPeriodo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo.setToolTipText("Generar EXCEL"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposReportesDinamicoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEjercicioPeriodo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEjercicioPeriodo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodo.setToolTipText("Generar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodo.setToolTipText("Cancelar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.add(this.jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCambiarEjercicioPeriodo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo= new JScrollPane(jPanelReporteDinamicoProcesoCambiarEjercicioPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Ejercicio Periodos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCambiarEjercicioPeriodo);
		this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCambiarEjercicioPeriodo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCambiarEjercicioPeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.setName("jPanelImportacionProcesoCambiarEjercicioPeriodo"); 
		
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutImportacionProcesoCambiarEjercicioPeriodo);
		
		
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCambiarEjercicioPeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setResizable(true);
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setClosable(true);
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setResizable(true);
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setClosable(true);
	    this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Ejercicio Periodos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCambiarEjercicioPeriodo = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCambiarEjercicioPeriodo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.add(this.jLabelArchivoImportacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCambiarEjercicioPeriodo = new JFileChooser();		
		this.jFileChooserImportacionProcesoCambiarEjercicioPeriodo.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCambiarEjercicioPeriodo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCambiarEjercicioPeriodo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCambiarEjercicioPeriodo.setToolTipText("Generar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.add(this.jButtonAbrirImportacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCambiarEjercicioPeriodo = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCambiarEjercicioPeriodo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.add(this.jLabelPathArchivoImportacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCambiarEjercicioPeriodo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.add(this.jTextFieldPathArchivoImportacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCambiarEjercicioPeriodo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCambiarEjercicioPeriodo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCambiarEjercicioPeriodo.setToolTipText("Generar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.add(this.jButtonGenerarImportacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCambiarEjercicioPeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCambiarEjercicioPeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCambiarEjercicioPeriodo.setToolTipText("Cancelar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarEjercicioPeriodo.add(this.jButtonCerrarImportacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCambiarEjercicioPeriodo = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCambiarEjercicioPeriodo= new JScrollPane(jPanelImportacionProcesoCambiarEjercicioPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCambiarEjercicioPeriodo);
		this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getContentPane().add(this.jScrollPanelImportacionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCambiarEjercicioPeriodo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.setText("Orden");
			this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCambiarEjercicioPeriodo";
			inputMap = this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCambiarEjercicioPeriodo"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCambiarEjercicioPeriodo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo.setName("jPanelOrderByProcesoCambiarEjercicioPeriodo"); 
			
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutOrderByProcesoCambiarEjercicioPeriodo);
			
			
			this.jTableDatosProcesoCambiarEjercicioPeriodoOrderBy = new JTableMe();        
			this.jTableDatosProcesoCambiarEjercicioPeriodoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCambiarEjercicioPeriodoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodoOrderBy.setViewportView(this.jTableDatosProcesoCambiarEjercicioPeriodoOrderBy);
			this.jTableDatosProcesoCambiarEjercicioPeriodoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCambiarEjercicioPeriodoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCambiarEjercicioPeriodo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCambiarEjercicioPeriodo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setResizable(true);
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setClosable(true);
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Ejercicio Periodos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipady =150;
				
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo.add(jScrollPanelDatosProcesoCambiarEjercicioPeriodoOrderBy, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);//this.jTableDatosProcesoCambiarEjercicioPeriodoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCambiarEjercicioPeriodo = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCambiarEjercicioPeriodo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCambiarEjercicioPeriodo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCambiarEjercicioPeriodo.setToolTipText("Cancelar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCambiarEjercicioPeriodo.add(this.jButtonCerrarOrderByProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCambiarEjercicioPeriodo= new JScrollPane(jPanelOrderByProcesoCambiarEjercicioPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCambiarEjercicioPeriodo);
			
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getContentPane().add(this.jScrollPanelOrderByProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo = new JButtonMe();
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
		int iWidthTableCalculado=0;//430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCambiarEjercicioPeriodo.getRowHeight();//ProcesoCambiarEjercicioPeriodoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCambiarEjercicioPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo.isSelected()) {
					iHeightTable=ProcesoCambiarEjercicioPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCambiarEjercicioPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCambiarEjercicioPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCambiarEjercicioPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCambiarEjercicioPeriodo.isSelected()) {
					iHeightTable=ProcesoCambiarEjercicioPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCambiarEjercicioPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCambiarEjercicioPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo!=null && this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarejercicioperiodos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCambiarEjercicioPeriodo> TraerProcesoCambiarEjercicioPeriodoBeans(List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo:procesocambiarejercicioperiodos) {
					
				if(!(ProcesoCambiarEjercicioPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCambiarEjercicioPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocambiarejercicioperiodo.setsDetalleGeneralEntityReporte(ProcesoCambiarEjercicioPeriodoConstantesFunciones.getProcesoCambiarEjercicioPeriodoDescripcion(procesocambiarejercicioperiodo));
										
						
					
						
					
				} else  {
							
					//procesocambiarejercicioperiodo.setsDetalleGeneralEntityReporte(procesocambiarejercicioperiodo.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocambiarejercicioperiodobeans.add(procesocambiarejercicioperiodobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocambiarejercicioperiodos;
    }
	//PARA REPORTES FIN
}
