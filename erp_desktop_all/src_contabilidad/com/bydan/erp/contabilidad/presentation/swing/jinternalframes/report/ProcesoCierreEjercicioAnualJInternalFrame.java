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
import com.bydan.erp.contabilidad.util.report.ProcesoCierreEjercicioAnualConstantesFunciones;

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
public class ProcesoCierreEjercicioAnualJInternalFrame extends ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCierreEjercicioAnual;
	
	protected JMenuBar jmenuBarProcesoCierreEjercicioAnual;
	
	protected JMenu jmenuProcesoCierreEjercicioAnual;
	protected JMenu jmenuDatosProcesoCierreEjercicioAnual;
	protected JMenu jmenuArchivoProcesoCierreEjercicioAnual;
	protected JMenu jmenuAccionesProcesoCierreEjercicioAnual;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierreEjercicioAnual;	
	protected GridBagConstraints gridBagConstraintsProcesoCierreEjercicioAnual;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCierreEjercicioAnualDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCierreEjercicioAnual;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCierreEjercicioAnual;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";
	
	public ProcesoCierreEjercicioAnualSessionBean procesocierreejercicioanualSessionBean;
		
	
	
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCierreEjercicioAnual> procesocierreejercicioanuals;		
	public List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsEliminados;	
	public List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCierreEjercicioAnual;		
	protected JButton jButtonAbrirOrderByProcesoCierreEjercicioAnual;
	
	
	//protected JPanel jPanelOrderByProcesoCierreEjercicioAnual;
	//public JScrollPane jScrollPanelOrderByProcesoCierreEjercicioAnual;	
	//protected JButton jButtonCerrarOrderByProcesoCierreEjercicioAnual;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCierreEjercicioAnualLogic procesocierreejercicioanualLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCierreEjercicioAnual;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierreEjercicioAnual;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierreEjercicioAnual;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCierreEjercicioAnualOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual;
	//public JScrollPane jScrollPanelImportacionProcesoCierreEjercicioAnual;
	
	
	
	protected JPanel jPanelAccionesProcesoCierreEjercicioAnual;
	
    protected JPanel jPanelPaginacionProcesoCierreEjercicioAnual;
    protected JPanel jPanelParametrosReportesProcesoCierreEjercicioAnual;
	protected JPanel jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCierreEjercicioAnual;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCierreEjercicioAnual;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCierreEjercicioAnual;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCierreEjercicioAnual;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCierreEjercicioAnual;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCierreEjercicioAnual;
	//protected JPanel jPanelImportacionProcesoCierreEjercicioAnual;
	
	
	public JTable jTableDatosProcesoCierreEjercicioAnual;
	
	
	
	//public JTable jTableDatosProcesoCierreEjercicioAnualOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCierreEjercicioAnual;
	protected JButton jButtonDuplicarProcesoCierreEjercicioAnual;
	protected JButton jButtonCopiarProcesoCierreEjercicioAnual;
	protected JButton jButtonVerFormProcesoCierreEjercicioAnual;
	protected JButton jButtonNuevoRelacionesProcesoCierreEjercicioAnual;
	protected JButton jButtonModificarProcesoCierreEjercicioAnual;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual;
	protected JButton jButtonCerrarProcesoCierreEjercicioAnual;
	
	
	protected JButton jButtonRecargarInformacionProcesoCierreEjercicioAnual;
	protected JButton jButtonProcesarInformacionProcesoCierreEjercicioAnual;
	
	
	protected JButton jButtonAnterioresProcesoCierreEjercicioAnual;
	protected JButton jButtonSiguientesProcesoCierreEjercicioAnual;
	protected JButton jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnual;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnual;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCierreEjercicioAnual;
	//protected JButton jButtonGenerarImportacionProcesoCierreEjercicioAnual;
	//protected JButton jButtonCerrarImportacionProcesoCierreEjercicioAnual;
	//protected JFileChooser jFileChooserImportacionProcesoCierreEjercicioAnual;
	//protected File fileImportacionProcesoCierreEjercicioAnual;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonDuplicarToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonCopiarToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonVerFormToolBarProcesoCierreEjercicioAnual;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonCerrarToolBarProcesoCierreEjercicioAnual;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonProcesarInformacionToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonAnterioresToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonSiguientesToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonAbrirOrderByToolBarProcesoCierreEjercicioAnual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemDuplicarProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemCopiarProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemVerFormProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemCerrarProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemAnterioresProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemSiguientesProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierreEjercicioAnual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierreEjercicioAnual;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCierreEjercicioAnual;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCierreEjercicioAnual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual;
	protected JTextField jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCierreEjercicioAnual;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCierreEjercicioAnual;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCierreEjercicioAnual;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCierreEjercicioAnual;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCierreEjercicioAnual;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCierreEjercicioAnual;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCierreEjercicioAnual;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCierreEjercicioAnual;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCierreEjercicioAnual;	
	//public JLabel jLabelPathArchivoImportacionProcesoCierreEjercicioAnual;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCierreEjercicioAnual;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCierreEjercicioAnual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCierreEjercicioAnual;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCierreEjercicioAnual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCierreEjercicioAnual;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCierreEjercicioAnual;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCierreEjercicioAnual;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCierreEjercicioAnual;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCierreEjercicioAnual;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCierreEjercicioAnual;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCierreEjercicioAnual;
	public JPanel jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;
	public JButton jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;
	
	public JPanel jPanelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;
	public JLabel jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;
	public JButton jButtonid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnualUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnualBusqueda= new JButtonMe();

	
	public JPanel jPanelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;
	public JLabel jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;
	//public JFormattedTextField jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;

	public JDateChooser jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual;
	public JButton jButtonfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnualBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoCierreEjercicioAnualJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreEjercicioAnualJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreEjercicioAnualJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreEjercicioAnualJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCierreEjercicioAnual)	{
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual = jButtonRecargarInformacionProcesoCierreEjercicioAnual;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCierreEjercicioAnual() {
		return this.jButtonProcesarInformacionProcesoCierreEjercicioAnual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierreEjercicioAnual)	{
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual = jButtonProcesarInformacionProcesoCierreEjercicioAnual;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCierreEjercicioAnual() {
		return this.jButtonRecargarInformacionProcesoCierreEjercicioAnual;
	}
	
	
	public List<ProcesoCierreEjercicioAnual> getprocesocierreejercicioanuals() {
		return this.procesocierreejercicioanuals;
	}

	public void setprocesocierreejercicioanuals(List<ProcesoCierreEjercicioAnual> procesocierreejercicioanuals) {
		this.procesocierreejercicioanuals = procesocierreejercicioanuals;
	}
	
	public List<ProcesoCierreEjercicioAnual> getprocesocierreejercicioanualsAux() {
		return this.procesocierreejercicioanualsAux;
	}

	public void setprocesocierreejercicioanualsAux(List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsAux) {
		this.procesocierreejercicioanualsAux = procesocierreejercicioanualsAux;
	}
	
	public List<ProcesoCierreEjercicioAnual> getprocesocierreejercicioanualsEliminados() {
		return this.procesocierreejercicioanualsEliminados;
	}

	public void setProcesoCierreEjercicioAnualsEliminados(List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsEliminados) {
		this.procesocierreejercicioanualsEliminados = procesocierreejercicioanualsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCierreEjercicioAnual() {
		return jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual = jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCierreEjercicioAnual() {
		return jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual;
	}

	public void setjTextFieldValorCampoGeneralProcesoCierreEjercicioAnual(
			JTextField jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual) {
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual = jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual() {
		return this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual) {
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual = jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCierreEjercicioAnual() {
		return this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual;
	}

	public void setjCheckBoxSeleccionadosProcesoCierreEjercicioAnual(
			JCheckBox jCheckBoxSeleccionadosProcesoCierreEjercicioAnual) {
		this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual = jCheckBoxSeleccionadosProcesoCierreEjercicioAnual;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual() {
		return this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual = jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCierreEjercicioAnual() {
		return this.jComboBoxTiposReportesProcesoCierreEjercicioAnual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposReportesProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposReportesProcesoCierreEjercicioAnual = jComboBoxTiposReportesProcesoCierreEjercicioAnual;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual() {
	//	return jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual = jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual = jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual() {
		return this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual = jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCierreEjercicioAnual() {
		return this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposPaginacionProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual = jComboBoxTiposPaginacionProcesoCierreEjercicioAnual;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCierreEjercicioAnual() {
		return this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierreEjercicioAnual() {
		return this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposRelacionesProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual = jComboBoxTiposRelacionesProcesoCierreEjercicioAnual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposAccionesProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual = jComboBoxTiposAccionesProcesoCierreEjercicioAnual;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCierreEjercicioAnual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual() {
	//	return jCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual = jCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCierreEjercicioAnual() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual .setBorder(borderResaltar);		
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
		this.procesocierreejercicioanualSessionBean=new ProcesoCierreEjercicioAnualSessionBean();
		
		this.procesocierreejercicioanualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreejercicioanualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCierreEjercicioAnualJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCierreEjercicioAnualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierreEjercicioAnualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierreEjercicioAnualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierreEjercicioAnualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cierre Ejercicio Anual MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCierreEjercicioAnualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCierreEjercicioAnual= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"copiar","copiar","Copiar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"ver_form","ver_form","Ver"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"recargar","recargar","Procesar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,
							"cerrar","cerrar","Salir"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual;
			
				this.jButtonProcesarInformacionToolBarProcesoCierreEjercicioAnual=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCierreEjercicioAnual;
				
		//protected JButton jButtonModificarToolBarProcesoCierreEjercicioAnual;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCierreEjercicioAnual=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCierreEjercicioAnual=new JMenuMe("General");
		this.jmenuArchivoProcesoCierreEjercicioAnual=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCierreEjercicioAnual=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCierreEjercicioAnual=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierreEjercicioAnual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierreEjercicioAnual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierreEjercicioAnual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCierreEjercicioAnual= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCierreEjercicioAnual.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCierreEjercicioAnual,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCierreEjercicioAnual= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCierreEjercicioAnual.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCierreEjercicioAnual,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCierreEjercicioAnual= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCierreEjercicioAnual.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCierreEjercicioAnual,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierreEjercicioAnual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierreEjercicioAnual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierreEjercicioAnual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCierreEjercicioAnual= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCierreEjercicioAnual.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCierreEjercicioAnual,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCierreEjercicioAnual= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCierreEjercicioAnual.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCierreEjercicioAnual,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCierreEjercicioAnual= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCierreEjercicioAnual.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCierreEjercicioAnual,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCierreEjercicioAnual= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCierreEjercicioAnual.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCierreEjercicioAnual,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCierreEjercicioAnual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCierreEjercicioAnual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCierreEjercicioAnual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCierreEjercicioAnual.add(this.jMenuItemCerrarProcesoCierreEjercicioAnual);
			
			this.jmenuAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemNuevoProcesoCierreEjercicioAnual);
			this.jmenuAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual);
			this.jmenuAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual);
			this.jmenuAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual);		
			this.jmenuAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemDuplicarProcesoCierreEjercicioAnual);		
			this.jmenuAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemCopiarProcesoCierreEjercicioAnual);		
			this.jmenuAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemVerFormProcesoCierreEjercicioAnual);		
			
			this.jmenuDatosProcesoCierreEjercicioAnual.add(this.jMenuItemRecargarInformacionProcesoCierreEjercicioAnual);				
			this.jmenuDatosProcesoCierreEjercicioAnual.add(this.jMenuItemAnterioresProcesoCierreEjercicioAnual);				
			this.jmenuDatosProcesoCierreEjercicioAnual.add(this.jMenuItemSiguientesProcesoCierreEjercicioAnual);				
			this.jmenuDatosProcesoCierreEjercicioAnual.add(this.jMenuItemAbrirOrderByProcesoCierreEjercicioAnual);				
			this.jmenuDatosProcesoCierreEjercicioAnual.add(this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCierreEjercicioAnual.add(this.jmenuArchivoProcesoCierreEjercicioAnual);		
			this.jmenuBarProcesoCierreEjercicioAnual.add(this.jmenuAccionesProcesoCierreEjercicioAnual);		
			this.jmenuBarProcesoCierreEjercicioAnual.add(this.jmenuDatosProcesoCierreEjercicioAnual);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCierreEjercicioAnual);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCierreEjercicioAnual() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setToolTipText("Procesar Proceso Cierre Ejercicio Anual");
		this.jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual= new JButtonMe();
		this.jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setText("Procesar");
		this.jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setToolTipText("Procesar Proceso Cierre Ejercicio Anual");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual,"buscar_button","Procesar Proceso Cierre Ejercicio Anual");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual = new JLabelMe();
		jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setText("Tipo Documento :");
		jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setToolTipText("Tipo Documento");
		jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual= new JComboBoxMe();
		jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual = new JLabelMe();
		jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setText("Fecha :");
		jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setToolTipText("Fecha");
		jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual= new JDateChooser();
		jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setDate(new Date());
		jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Cierre Ejercicio Anual"));
		this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCierreEjercicioAnual = new ProcesoCierreEjercicioAnualDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Cierre Ejercicio Anual DATOS");
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual = new ProcesoCierreEjercicioAnualDetalleFormJInternalFrame(jDesktopPane,this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones(),this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual = null;//new ProcesoCierreEjercicioAnualDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierreEjercicioAnual= new GridBagLayout();
		
		
		this.jTableDatosProcesoCierreEjercicioAnual = new JTableMe();      
		
		String sToolTipProcesoCierreEjercicioAnual="";
		sToolTipProcesoCierreEjercicioAnual=ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierreEjercicioAnual+="(Contabilidad.ProcesoCierreEjercicioAnual)";
		}
		
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierreEjercicioAnual+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCierreEjercicioAnual.setToolTipText(sToolTipProcesoCierreEjercicioAnual);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCierreEjercicioAnual);
		this.jTableDatosProcesoCierreEjercicioAnual.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCierreEjercicioAnual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCierreEjercicioAnual.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCierreEjercicioAnual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonDuplicarProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonCopiarProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonVerFormProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonCerrarProcesoCierreEjercicioAnual = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierreEjercicioAnual = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cierre Ejercicio Anual";
		
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Ejercicio Anuales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierreEjercicioAnual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierreEjercicioAnual.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierreEjercicioAnual.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual=new ReporteDinamicoJInternalFrame(ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCierreEjercicioAnual();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCierreEjercicioAnual=new ImportacionJInternalFrame(ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCierreEjercicioAnual();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCierreEjercicioAnual = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.setText("Orden");
		this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierreEjercicioAnual,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierreEjercicioAnual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreEjercicioAnual,false,this);
			
			//this.cargarOrderByProcesoCierreEjercicioAnual(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierreEjercicioAnual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreEjercicioAnual,true,this);
			
			//this.cargarOrderByProcesoCierreEjercicioAnual(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCierreEjercicioAnual.setText("Nuevo");
		this.jButtonDuplicarProcesoCierreEjercicioAnual.setText("Duplicar");
		this.jButtonCopiarProcesoCierreEjercicioAnual.setText("Copiar");
		this.jButtonVerFormProcesoCierreEjercicioAnual.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.setText("Guardar");
		this.jButtonCerrarProcesoCierreEjercicioAnual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierreEjercicioAnual,"nuevo_button","Nuevo",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCierreEjercicioAnual,"duplicar_button","Duplicar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCierreEjercicioAnual,"copiar_button","Copiar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCierreEjercicioAnual,"ver_form","Ver",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual,"nuevorelaciones_button","Nuevo Rel",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual,"guardarcambiostabla_button","Guardar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierreEjercicioAnual,"cerrar_button","Salir",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCierreEjercicioAnual.setToolTipText("Nuevo"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCierreEjercicioAnual.setToolTipText("Duplicar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCierreEjercicioAnual.setToolTipText("Copiar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCierreEjercicioAnual.setToolTipText("Ver"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.setToolTipText("Nuevo Rel"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.setToolTipText("Guardar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierreEjercicioAnual.setToolTipText("Salir"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierreEjercicioAnual";
		inputMap = this.jButtonNuevoProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierreEjercicioAnual"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonDuplicarProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCierreEjercicioAnual"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonCopiarProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCierreEjercicioAnual"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCierreEjercicioAnual";
		inputMap = this.jButtonVerFormProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCierreEjercicioAnual"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCierreEjercicioAnual";
		inputMap = this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCierreEjercicioAnual"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonModificarProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCierreEjercicioAnual"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonCerrarProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierreEjercicioAnual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierreEjercicioAnual";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierreEjercicioAnual"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCierreEjercicioAnual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCierreEjercicioAnual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCierreEjercicioAnual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCierreEjercicioAnual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCierreEjercicioAnual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setName("jPanelParametrosReportesProcesoCierreEjercicioAnual"); 
		
		this.jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual.setName("jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.setText("Procesar");
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.setToolTipText("Procesar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCierreEjercicioAnual,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual.setToolTipText("Procesar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCierreEjercicioAnual.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCierreEjercicioAnual = new JLabelMe();
		
		this.jLabelAccionesProcesoCierreEjercicioAnual.setText("Acciones");		
		this.jLabelAccionesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCierreEjercicioAnual = new JButtonMe();
		//this.jButtonAnterioresProcesoCierreEjercicioAnual.setText("<<");
        this.jButtonAnterioresProcesoCierreEjercicioAnual.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCierreEjercicioAnual,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCierreEjercicioAnual = new JButtonMe();
		//this.jButtonSiguientesProcesoCierreEjercicioAnual.setText(">>");
        this.jButtonSiguientesProcesoCierreEjercicioAnual.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCierreEjercicioAnual,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual,"nuevoguardarcambios_button","Nue",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCierreEjercicioAnual";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCierreEjercicioAnual"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCierreEjercicioAnual";
		inputMap = this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCierreEjercicioAnual"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCierreEjercicioAnual";
		inputMap = this.jButtonSiguientesProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCierreEjercicioAnual"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCierreEjercicioAnual";
		inputMap = this.jButtonAnterioresProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCierreEjercicioAnual"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCierreEjercicioAnual();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(this.getWidth(),ProcesoCierreEjercicioAnualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreEjercicioAnualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(this.getWidth(),ProcesoCierreEjercicioAnualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreEjercicioAnualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(this.getWidth(),ProcesoCierreEjercicioAnualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreEjercicioAnualBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCierreEjercicioAnual = new GridBagLayout();

			this.jPanelPaginacionProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutPaginacionProcesoCierreEjercicioAnual);						
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonAnterioresProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
					
						
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
			
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
						
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonSiguientesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonNuevoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
						
			
			
			if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
				this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			}
			
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonProcesarInformacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonDuplicarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonCopiarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonVerFormProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCierreEjercicioAnual.add(this.jButtonCerrarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
		
		
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCierreEjercicioAnual = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCierreEjercicioAnual = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCierreEjercicioAnual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCierreEjercicioAnual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCierreEjercicioAnual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCierreEjercicioAnual = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setLayout(gridaBagParametrosReportesProcesoCierreEjercicioAnual);
			this.jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual.setLayout(gridaBagParametrosReportesAccionesProcesoCierreEjercicioAnual);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCierreEjercicioAnual.setLayout(gridaBagParametrosAuxiliar1ProcesoCierreEjercicioAnual);
			this.jPanelParametrosAuxiliar2ProcesoCierreEjercicioAnual.setLayout(gridaBagParametrosAuxiliar2ProcesoCierreEjercicioAnual);
			this.jPanelParametrosAuxiliar3ProcesoCierreEjercicioAnual.setLayout(gridaBagParametrosAuxiliar3ProcesoCierreEjercicioAnual);
			this.jPanelParametrosAuxiliar4ProcesoCierreEjercicioAnual.setLayout(gridaBagParametrosAuxiliar4ProcesoCierreEjercicioAnual);
			//this.jPanelParametrosAuxiliar5ProcesoCierreEjercicioAnual.setLayout(gridaBagParametrosAuxiliar2ProcesoCierreEjercicioAnual);			
			
			
			
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jButtonRecargarInformacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreEjercicioAnual.add(this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreEjercicioAnual.add(this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreEjercicioAnual.add(this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jPanelParametrosAuxiliar1ProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCierreEjercicioAnual.add(this.jComboBoxTiposReportesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jPanelParametrosAuxiliar4ProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jComboBoxTiposReportesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jCheckBoxGenerarReporteProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jPanelParametrosAuxiliar2ProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jLabelAccionesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);			
			
			
			/*
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierreEjercicioAnual.add(this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);															
				
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierreEjercicioAnual.add(this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jPanelParametrosAuxiliar3ProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.add(this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCierreEjercicioAnual = new GridBagLayout();

			this.jScrollPanelDatosProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutDatosProcesoCierreEjercicioAnual);
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
			
			this.jScrollPanelDatosProcesoCierreEjercicioAnual.add(this.jTableDatosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setViewportView(this.jTableDatosProcesoCierreEjercicioAnual);
		this.jTableDatosProcesoCierreEjercicioAnual.setFillsViewportHeight(true);
		this.jTableDatosProcesoCierreEjercicioAnual.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierreEjercicioAnual= new GridBagLayout();
		this.jPanelAccionesProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutAccionesProcesoCierreEjercicioAnual);
		
		
		/*	
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
			
		this.jPanelAccionesProcesoCierreEjercicioAnual.add(this.jButtonNuevoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);

		gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
		jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.add(jLabelid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual, gridBagConstraintsProcesoCierreEjercicioAnual);

		gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 1;
		jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.add(jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual, gridBagConstraintsProcesoCierreEjercicioAnual);


		gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
		jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.add(jLabelfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual, gridBagConstraintsProcesoCierreEjercicioAnual);

		gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 1;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 1;
		jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.add(jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual, gridBagConstraintsProcesoCierreEjercicioAnual);

		gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 2;
		gridBagConstraintsProcesoCierreEjercicioAnual.gridx =1;
		jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.add(jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual, gridBagConstraintsProcesoCierreEjercicioAnual);

		jTabbedPaneBusquedasProcesoCierreEjercicioAnual.addTab("1.-Por Tipo Documento Por Fecha ", jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
		jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierreEjercicioAnual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierreEjercicioAnual);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;		
			//this.gridBagConstraintsProcesoCierreEjercicioAnual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;		
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);								
		
		
		/*
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		*/		
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
				
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCierreEjercicioAnual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierreEjercicioAnual = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutBusquedasParametrosProcesoCierreEjercicioAnual);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			
			
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
			
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(false);
		this.jButtonAnterioresProcesoCierreEjercicioAnual.setVisible(false);
		this.jButtonSiguientesProcesoCierreEjercicioAnual.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.setVisible(false);
		this.jComboBoxTiposReportesProcesoCierreEjercicioAnual.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.setVisible(false);
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.setVisible(false);
		
		this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(false);
		
		
		this.jTtoolBarProcesoCierreEjercicioAnual.setVisible(false);
			
		this.jMenuItemAnterioresProcesoCierreEjercicioAnual.setVisible(false);
		this.jMenuItemSiguientesProcesoCierreEjercicioAnual.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoCierreEjercicioAnual.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoCierreEjercicioAnual.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoCierreEjercicioAnual.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCierreEjercicioAnual() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCierreEjercicioAnual = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.setName("jPanelReporteDinamicoProcesoCierreEjercicioAnual"); 
		
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutReporteDinamicoProcesoCierreEjercicioAnual);
		
		
		this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Ejercicio Anuales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCierreEjercicioAnual = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCierreEjercicioAnual.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jLabelColumnasSelectReporteProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCierreEjercicioAnual = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCierreEjercicioAnual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCierreEjercicioAnual.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual=new JScrollPane(this.jListColumnasSelectReporteProcesoCierreEjercicioAnual);
			
			this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jListColumnasSelectReporteProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCierreEjercicioAnual = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCierreEjercicioAnual.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCierreEjercicioAnual = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCierreEjercicioAnual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCierreEjercicioAnual.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCierreEjercicioAnual=new JScrollPane(this.jListRelacionesSelectReporteProcesoCierreEjercicioAnual);
			
			this.jScrollRelacionesSelectReporteProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCierreEjercicioAnual = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCierreEjercicioAnual = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCierreEjercicioAnual = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jLabelGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual.setToolTipText("Generar EXCEL"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jComboBoxTiposReportesDinamicoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreEjercicioAnual = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCierreEjercicioAnual.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jLabelTiposArchivoReporteDinamicoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnual.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnual,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnual.setToolTipText("Generar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnual.setToolTipText("Cancelar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreEjercicioAnual.add(this.jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCierreEjercicioAnual = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual= new JScrollPane(jPanelReporteDinamicoProcesoCierreEjercicioAnual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Ejercicio Anuales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCierreEjercicioAnual);
		this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCierreEjercicioAnual() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCierreEjercicioAnual = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCierreEjercicioAnual.setName("jPanelImportacionProcesoCierreEjercicioAnual"); 
		
		this.jPanelImportacionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutImportacionProcesoCierreEjercicioAnual);
		
		
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCierreEjercicioAnual= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCierreEjercicioAnual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Ejercicio Anuales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCierreEjercicioAnual = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCierreEjercicioAnual.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierreEjercicioAnual.add(this.jLabelArchivoImportacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCierreEjercicioAnual = new JFileChooser();		
		this.jFileChooserImportacionProcesoCierreEjercicioAnual.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCierreEjercicioAnual.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCierreEjercicioAnual,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCierreEjercicioAnual.setToolTipText("Generar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreEjercicioAnual.add(this.jButtonAbrirImportacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCierreEjercicioAnual = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCierreEjercicioAnual.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierreEjercicioAnual.add(this.jLabelPathArchivoImportacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCierreEjercicioAnual=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreEjercicioAnual.add(this.jTextFieldPathArchivoImportacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCierreEjercicioAnual.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCierreEjercicioAnual,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCierreEjercicioAnual.setToolTipText("Generar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreEjercicioAnual.add(this.jButtonGenerarImportacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCierreEjercicioAnual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCierreEjercicioAnual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCierreEjercicioAnual.setToolTipText("Cancelar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreEjercicioAnual.add(this.jButtonCerrarImportacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCierreEjercicioAnual = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCierreEjercicioAnual= new JScrollPane(jPanelImportacionProcesoCierreEjercicioAnual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCierreEjercicioAnual);
		this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getContentPane().add(this.jScrollPanelImportacionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCierreEjercicioAnual(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCierreEjercicioAnual = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.setText("Orden");
			this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierreEjercicioAnual,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCierreEjercicioAnual";
			inputMap = this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCierreEjercicioAnual"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCierreEjercicioAnual = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCierreEjercicioAnual.setName("jPanelOrderByProcesoCierreEjercicioAnual"); 
			
			this.jPanelOrderByProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutOrderByProcesoCierreEjercicioAnual);
			
			
			this.jTableDatosProcesoCierreEjercicioAnualOrderBy = new JTableMe();        
			this.jTableDatosProcesoCierreEjercicioAnualOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCierreEjercicioAnualOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCierreEjercicioAnualOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCierreEjercicioAnualOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCierreEjercicioAnualOrderBy.setViewportView(this.jTableDatosProcesoCierreEjercicioAnualOrderBy);
			this.jTableDatosProcesoCierreEjercicioAnualOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCierreEjercicioAnualOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCierreEjercicioAnual = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCierreEjercicioAnual= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setResizable(true);
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setClosable(true);
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Ejercicio Anuales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCierreEjercicioAnual.ipady =150;
				
			this.jPanelOrderByProcesoCierreEjercicioAnual.add(jScrollPanelDatosProcesoCierreEjercicioAnualOrderBy, this.gridBagConstraintsProcesoCierreEjercicioAnual);//this.jTableDatosProcesoCierreEjercicioAnualTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCierreEjercicioAnual = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCierreEjercicioAnual.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCierreEjercicioAnual,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCierreEjercicioAnual.setToolTipText("Cancelar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCierreEjercicioAnual.add(this.jButtonCerrarOrderByProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCierreEjercicioAnual = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCierreEjercicioAnual= new JScrollPane(jPanelOrderByProcesoCierreEjercicioAnual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCierreEjercicioAnual);
			
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getContentPane().add(this.jScrollPanelOrderByProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCierreEjercicioAnual = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCierreEjercicioAnual.getRowHeight();//ProcesoCierreEjercicioAnualConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCierreEjercicioAnualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual.isSelected()) {
					iHeightTable=ProcesoCierreEjercicioAnualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierreEjercicioAnualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierreEjercicioAnualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCierreEjercicioAnualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierreEjercicioAnual.isSelected()) {
					iHeightTable=ProcesoCierreEjercicioAnualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierreEjercicioAnualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierreEjercicioAnualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCierreEjercicioAnual!=null && this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreejercicioanuals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCierreEjercicioAnual> TraerProcesoCierreEjercicioAnualBeans(List<ProcesoCierreEjercicioAnual> procesocierreejercicioanuals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanual:procesocierreejercicioanuals) {
					
				if(!(ProcesoCierreEjercicioAnualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCierreEjercicioAnualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocierreejercicioanual.setsDetalleGeneralEntityReporte(ProcesoCierreEjercicioAnualConstantesFunciones.getProcesoCierreEjercicioAnualDescripcion(procesocierreejercicioanual));
										
						
					
						
					
				} else  {
							
					//procesocierreejercicioanual.setsDetalleGeneralEntityReporte(procesocierreejercicioanual.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocierreejercicioanualbeans.add(procesocierreejercicioanualbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocierreejercicioanuals;
    }
	//PARA REPORTES FIN
}
