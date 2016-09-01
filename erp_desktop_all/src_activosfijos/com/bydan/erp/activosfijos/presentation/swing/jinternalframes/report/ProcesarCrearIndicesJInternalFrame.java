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



import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;





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
import com.bydan.erp.activosfijos.util.report.ProcesarCrearIndicesConstantesFunciones;

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
public class ProcesarCrearIndicesJInternalFrame extends ProcesarCrearIndicesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesarCrearIndices;
	
	protected JMenuBar jmenuBarProcesarCrearIndices;
	
	protected JMenu jmenuProcesarCrearIndices;
	protected JMenu jmenuDatosProcesarCrearIndices;
	protected JMenu jmenuArchivoProcesarCrearIndices;
	protected JMenu jmenuAccionesProcesarCrearIndices;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesarCrearIndices;	
	protected GridBagConstraints gridBagConstraintsProcesarCrearIndices;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesarCrearIndicesDetalleFormJInternalFrame jInternalFrameDetalleFormProcesarCrearIndices;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesarCrearIndices;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesarCrearIndices;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProcesarCrearIndicesSessionBean procesarcrearindicesSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesarCrearIndices> procesarcrearindicess;		
	public List<ProcesarCrearIndices> procesarcrearindicessEliminados;	
	public List<ProcesarCrearIndices> procesarcrearindicessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesarCrearIndices;		
	protected JButton jButtonAbrirOrderByProcesarCrearIndices;
	
	
	//protected JPanel jPanelOrderByProcesarCrearIndices;
	//public JScrollPane jScrollPanelOrderByProcesarCrearIndices;	
	//protected JButton jButtonCerrarOrderByProcesarCrearIndices;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesarCrearIndicesLogic procesarcrearindicesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesarCrearIndices;
	public JScrollPane jScrollPanelDatosEdicionProcesarCrearIndices;
	public JScrollPane jScrollPanelDatosGeneralProcesarCrearIndices;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesarCrearIndicesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesarCrearIndices;
	//public JScrollPane jScrollPanelImportacionProcesarCrearIndices;
	
	
	
	protected JPanel jPanelAccionesProcesarCrearIndices;
	
    protected JPanel jPanelPaginacionProcesarCrearIndices;
    protected JPanel jPanelParametrosReportesProcesarCrearIndices;
	protected JPanel jPanelParametrosReportesAccionesProcesarCrearIndices;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesarCrearIndices;
	protected JPanel jPanelParametrosAuxiliar2ProcesarCrearIndices;
	protected JPanel jPanelParametrosAuxiliar3ProcesarCrearIndices;
	protected JPanel jPanelParametrosAuxiliar4ProcesarCrearIndices;
	//protected JPanel jPanelParametrosAuxiliar5ProcesarCrearIndices;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesarCrearIndices;
	//protected JPanel jPanelImportacionProcesarCrearIndices;
	
	
	public JTable jTableDatosProcesarCrearIndices;
	
	
	
	//public JTable jTableDatosProcesarCrearIndicesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesarCrearIndices;
	protected JButton jButtonDuplicarProcesarCrearIndices;
	protected JButton jButtonCopiarProcesarCrearIndices;
	protected JButton jButtonVerFormProcesarCrearIndices;
	protected JButton jButtonNuevoRelacionesProcesarCrearIndices;
	protected JButton jButtonModificarProcesarCrearIndices;
	
    protected JButton jButtonGuardarCambiosTablaProcesarCrearIndices;
	protected JButton jButtonCerrarProcesarCrearIndices;
	
	
	protected JButton jButtonRecargarInformacionProcesarCrearIndices;
	protected JButton jButtonProcesarInformacionProcesarCrearIndices;
	
	
	protected JButton jButtonAnterioresProcesarCrearIndices;
	protected JButton jButtonSiguientesProcesarCrearIndices;
	protected JButton jButtonNuevoGuardarCambiosProcesarCrearIndices;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesarCrearIndices;
	//protected JButton jButtonCerrarReporteDinamicoProcesarCrearIndices;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesarCrearIndices;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesarCrearIndices;
	//protected JButton jButtonGenerarImportacionProcesarCrearIndices;
	//protected JButton jButtonCerrarImportacionProcesarCrearIndices;
	//protected JFileChooser jFileChooserImportacionProcesarCrearIndices;
	//protected File fileImportacionProcesarCrearIndices;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesarCrearIndices;
	protected JButton jButtonDuplicarToolBarProcesarCrearIndices;
	protected JButton jButtonNuevoRelacionesToolBarProcesarCrearIndices;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesarCrearIndices;
	protected JButton jButtonCopiarToolBarProcesarCrearIndices;
	protected JButton jButtonVerFormToolBarProcesarCrearIndices;
	public JButton jButtonGuardarCambiosTablaToolBarProcesarCrearIndices;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesarCrearIndices;
	protected JButton jButtonCerrarToolBarProcesarCrearIndices;
	
	protected JButton jButtonRecargarInformacionToolBarProcesarCrearIndices;
	protected JButton jButtonProcesarInformacionToolBarProcesarCrearIndices;
	protected JButton jButtonAnterioresToolBarProcesarCrearIndices;
	protected JButton jButtonSiguientesToolBarProcesarCrearIndices;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesarCrearIndices;
	protected JButton jButtonAbrirOrderByToolBarProcesarCrearIndices;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesarCrearIndices;
	protected JMenuItem jMenuItemDuplicarProcesarCrearIndices;
	protected JMenuItem jMenuItemNuevoRelacionesProcesarCrearIndices;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesarCrearIndices;
	protected JMenuItem jMenuItemCopiarProcesarCrearIndices;
	protected JMenuItem jMenuItemVerFormProcesarCrearIndices;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesarCrearIndices;
	protected JMenuItem jMenuItemCerrarProcesarCrearIndices;
	protected JMenuItem jMenuItemDetalleCerrarProcesarCrearIndices;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesarCrearIndices;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesarCrearIndices;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesarCrearIndices;
	protected JMenuItem jMenuItemProcesarInformacionProcesarCrearIndices;
	protected JMenuItem jMenuItemAnterioresProcesarCrearIndices;
	protected JMenuItem jMenuItemSiguientesProcesarCrearIndices;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesarCrearIndices;
	protected JMenuItem jMenuItemAbrirOrderByProcesarCrearIndices;
	protected JMenuItem jMenuItemMostrarOcultarProcesarCrearIndices;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesarCrearIndices;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesarCrearIndices;
	protected JCheckBox jCheckBoxSeleccionadosProcesarCrearIndices;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesarCrearIndices;
	protected JCheckBox jCheckBoxConGraficoReporteProcesarCrearIndices;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesarCrearIndices;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesarCrearIndices;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesarCrearIndices;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesarCrearIndices;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesarCrearIndices;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesarCrearIndices;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesarCrearIndices;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesarCrearIndices;
	protected JTextField jTextFieldValorCampoGeneralProcesarCrearIndices;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesarCrearIndices;
	//public JList<Reporte> jListColumnasSelectReporteProcesarCrearIndices;
	//public JScrollPane jScrollColumnasSelectReporteProcesarCrearIndices;
	
	//public JLabel jLabelRelacionesSelectReporteProcesarCrearIndices;
	//public JList<Reporte> jListRelacionesSelectReporteProcesarCrearIndices;
	//public JScrollPane jScrollRelacionesSelectReporteProcesarCrearIndices;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesarCrearIndices;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesarCrearIndices;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesarCrearIndices;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesarCrearIndices;
	
		
	//public JLabel jLabelArchivoImportacionProcesarCrearIndices;	
	//public JLabel jLabelPathArchivoImportacionProcesarCrearIndices;
	//protected JTextField jTextFieldPathArchivoImportacionProcesarCrearIndices;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesarCrearIndices;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesarCrearIndices;
	
	//public JLabel jLabelColumnaCategoriaValorProcesarCrearIndices;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesarCrearIndices;
	
	//public JLabel jLabelColumnasValoresGraficoProcesarCrearIndices;
	//public JList<Reporte> jListColumnasValoresGraficoProcesarCrearIndices;
	//public JScrollPane jScrollColumnasValoresGraficoProcesarCrearIndices;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesarCrearIndices;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesarCrearIndices;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesarCrearIndices;
	public JPanel jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices;
	public JButton jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices;
	
	public JPanel jPanelIdIdBusquedaProcesarCrearIndicesProcesarCrearIndices;
	public JLabel jLabelidBusquedaProcesarCrearIndicesProcesarCrearIndices;
	public JTextFieldMe jLabelidProcesarCrearIndicesBusquedaProcesarCrearIndices;
	public JButton jButtonidBusquedaProcesarCrearIndicesProcesarCrearIndicesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=154;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesarCrearIndicesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCrearIndicesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCrearIndicesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCrearIndicesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesarCrearIndices)	{
		this.jButtonRecargarInformacionProcesarCrearIndices = jButtonRecargarInformacionProcesarCrearIndices;
	}
	
	public JButton getjButtonProcesarInformacionProcesarCrearIndices() {
		return this.jButtonProcesarInformacionProcesarCrearIndices;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesarCrearIndices)	{
		this.jButtonProcesarInformacionProcesarCrearIndices = jButtonProcesarInformacionProcesarCrearIndices;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesarCrearIndices() {
		return this.jButtonRecargarInformacionProcesarCrearIndices;
	}
	
	
	public List<ProcesarCrearIndices> getprocesarcrearindicess() {
		return this.procesarcrearindicess;
	}

	public void setprocesarcrearindicess(List<ProcesarCrearIndices> procesarcrearindicess) {
		this.procesarcrearindicess = procesarcrearindicess;
	}
	
	public List<ProcesarCrearIndices> getprocesarcrearindicessAux() {
		return this.procesarcrearindicessAux;
	}

	public void setprocesarcrearindicessAux(List<ProcesarCrearIndices> procesarcrearindicessAux) {
		this.procesarcrearindicessAux = procesarcrearindicessAux;
	}
	
	public List<ProcesarCrearIndices> getprocesarcrearindicessEliminados() {
		return this.procesarcrearindicessEliminados;
	}

	public void setProcesarCrearIndicessEliminados(List<ProcesarCrearIndices> procesarcrearindicessEliminados) {
		this.procesarcrearindicessEliminados = procesarcrearindicessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesarCrearIndices() {
		return jComboBoxTiposSeleccionarProcesarCrearIndices;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesarCrearIndices(
			JComboBox jComboBoxTiposSeleccionarProcesarCrearIndices) {
		this.jComboBoxTiposSeleccionarProcesarCrearIndices = jComboBoxTiposSeleccionarProcesarCrearIndices;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesarCrearIndices() {
		return jTextFieldValorCampoGeneralProcesarCrearIndices;
	}

	public void setjTextFieldValorCampoGeneralProcesarCrearIndices(
			JTextField jTextFieldValorCampoGeneralProcesarCrearIndices) {
		this.jTextFieldValorCampoGeneralProcesarCrearIndices = jTextFieldValorCampoGeneralProcesarCrearIndices;
	}

	public void setBorderResaltarValorCampoGeneralProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesarCrearIndices .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesarCrearIndices() {
		return this.jCheckBoxSeleccionarTodosProcesarCrearIndices;
	}

	public void setjCheckBoxSeleccionarTodosProcesarCrearIndices(
			JCheckBox jCheckBoxSeleccionarTodosProcesarCrearIndices) {
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices = jCheckBoxSeleccionarTodosProcesarCrearIndices;
	}

	public void setBorderResaltarSeleccionarTodosProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesarCrearIndices() {
		return this.jCheckBoxSeleccionadosProcesarCrearIndices;
	}

	public void setjCheckBoxSeleccionadosProcesarCrearIndices(
			JCheckBox jCheckBoxSeleccionadosProcesarCrearIndices) {
		this.jCheckBoxSeleccionadosProcesarCrearIndices = jCheckBoxSeleccionadosProcesarCrearIndices;
	}
	
	public void setBorderResaltarSeleccionadosProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesarCrearIndices() {
		return this.jComboBoxTiposArchivosReportesProcesarCrearIndices;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesarCrearIndices(
			JComboBox jComboBoxTiposArchivosReportesProcesarCrearIndices) {
		this.jComboBoxTiposArchivosReportesProcesarCrearIndices = jComboBoxTiposArchivosReportesProcesarCrearIndices;
	}

	public void setBorderResaltarTiposArchivosReportesProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesarCrearIndices() {
		return this.jComboBoxTiposReportesProcesarCrearIndices;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesarCrearIndices(
			JComboBox jComboBoxTiposReportesProcesarCrearIndices) {
		this.jComboBoxTiposReportesProcesarCrearIndices = jComboBoxTiposReportesProcesarCrearIndices;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesarCrearIndices() {
	//	return jComboBoxTiposReportesDinamicoProcesarCrearIndices;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesarCrearIndices(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesarCrearIndices) {
	//	this.jComboBoxTiposReportesDinamicoProcesarCrearIndices = jComboBoxTiposReportesDinamicoProcesarCrearIndices;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices = jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices;
	//}
	
	public void setBorderResaltarTiposReportesProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesarCrearIndices() {
		return this.jComboBoxTiposGraficosReportesProcesarCrearIndices;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesarCrearIndices(
			JComboBox jComboBoxTiposGraficosReportesProcesarCrearIndices) {
		this.jComboBoxTiposGraficosReportesProcesarCrearIndices = jComboBoxTiposGraficosReportesProcesarCrearIndices;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesarCrearIndices() {
		return this.jComboBoxTiposPaginacionProcesarCrearIndices;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesarCrearIndices(
			JComboBox jComboBoxTiposPaginacionProcesarCrearIndices) {
		this.jComboBoxTiposPaginacionProcesarCrearIndices = jComboBoxTiposPaginacionProcesarCrearIndices;
	}
	
	public void setBorderResaltarTiposPaginacionProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesarCrearIndices() {
		return this.jComboBoxTiposRelacionesProcesarCrearIndices;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesarCrearIndices() {
		return this.jComboBoxTiposAccionesProcesarCrearIndices;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesarCrearIndices(
			JComboBox jComboBoxTiposRelacionesProcesarCrearIndices) {
		this.jComboBoxTiposRelacionesProcesarCrearIndices = jComboBoxTiposRelacionesProcesarCrearIndices;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesarCrearIndices(
			JComboBox jComboBoxTiposAccionesProcesarCrearIndices) {
		this.jComboBoxTiposAccionesProcesarCrearIndices = jComboBoxTiposAccionesProcesarCrearIndices;
	}
	
	public void setBorderResaltarTiposRelacionesProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesarCrearIndices() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesarCrearIndices .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesarCrearIndices() {
	//	return jCheckBoxConGraficoDinamicoProcesarCrearIndices;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesarCrearIndices(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesarCrearIndices) {
	//	this.jCheckBoxConGraficoDinamicoProcesarCrearIndices = jCheckBoxConGraficoDinamicoProcesarCrearIndices;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesarCrearIndices() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesarCrearIndices.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesarCrearIndices .setBorder(borderResaltar);		
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
		this.procesarcrearindicesSessionBean=new ProcesarCrearIndicesSessionBean();
		
		this.procesarcrearindicesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarcrearindicesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesarcrearindicesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesarCrearIndicesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesarCrearIndicesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesarCrearIndicesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesarCrearIndicesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesarCrearIndicesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Procesar Crear Indices MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesarCrearIndicesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesarCrearIndices= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"nuevo","nuevo","Nuevo"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"duplicar","duplicar","Duplicar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"copiar","copiar","Copiar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"ver_form","ver_form","Ver"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"recargar","recargar","Procesar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,
							"cerrar","cerrar","Salir"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesarCrearIndices=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesarCrearIndices;
			
				this.jButtonProcesarInformacionToolBarProcesarCrearIndices=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesarCrearIndices;
				
		//protected JButton jButtonModificarToolBarProcesarCrearIndices;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesarCrearIndices=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesarCrearIndices=new JMenuMe("General");
		this.jmenuArchivoProcesarCrearIndices=new JMenuMe("Archivo");
		this.jmenuAccionesProcesarCrearIndices=new JMenuMe("Acciones");
		this.jmenuDatosProcesarCrearIndices=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesarCrearIndices= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesarCrearIndices.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesarCrearIndices,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesarCrearIndices= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesarCrearIndices.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesarCrearIndices,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesarCrearIndices= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesarCrearIndices.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesarCrearIndices,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesarCrearIndices= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesarCrearIndices.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesarCrearIndices,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesarCrearIndices= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesarCrearIndices.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesarCrearIndices,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesarCrearIndices= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesarCrearIndices.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesarCrearIndices,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesarCrearIndices= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesarCrearIndices.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesarCrearIndices,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesarCrearIndices= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesarCrearIndices.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesarCrearIndices,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesarCrearIndices= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesarCrearIndices.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesarCrearIndices,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesarCrearIndices= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesarCrearIndices.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesarCrearIndices,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesarCrearIndices= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesarCrearIndices.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesarCrearIndices,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesarCrearIndices= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesarCrearIndices.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesarCrearIndices,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesarCrearIndices= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesarCrearIndices.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesarCrearIndices,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesarCrearIndices= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesarCrearIndices.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesarCrearIndices,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesarCrearIndices= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesarCrearIndices.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesarCrearIndices,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesarCrearIndices= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesarCrearIndices.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesarCrearIndices,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesarCrearIndices.add(this.jMenuItemCerrarProcesarCrearIndices);
			
			this.jmenuAccionesProcesarCrearIndices.add(this.jMenuItemNuevoProcesarCrearIndices);
			this.jmenuAccionesProcesarCrearIndices.add(this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices);
			this.jmenuAccionesProcesarCrearIndices.add(this.jMenuItemNuevoRelacionesProcesarCrearIndices);
			this.jmenuAccionesProcesarCrearIndices.add(this.jMenuItemGuardarCambiosTablaProcesarCrearIndices);		
			this.jmenuAccionesProcesarCrearIndices.add(this.jMenuItemDuplicarProcesarCrearIndices);		
			this.jmenuAccionesProcesarCrearIndices.add(this.jMenuItemCopiarProcesarCrearIndices);		
			this.jmenuAccionesProcesarCrearIndices.add(this.jMenuItemVerFormProcesarCrearIndices);		
			
			this.jmenuDatosProcesarCrearIndices.add(this.jMenuItemRecargarInformacionProcesarCrearIndices);				
			this.jmenuDatosProcesarCrearIndices.add(this.jMenuItemAnterioresProcesarCrearIndices);				
			this.jmenuDatosProcesarCrearIndices.add(this.jMenuItemSiguientesProcesarCrearIndices);				
			this.jmenuDatosProcesarCrearIndices.add(this.jMenuItemAbrirOrderByProcesarCrearIndices);				
			this.jmenuDatosProcesarCrearIndices.add(this.jMenuItemMostrarOcultarProcesarCrearIndices);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesarCrearIndices.add(this.jMenuItemGuardarCambiosProcesarCrearIndices);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesarCrearIndices.add(this.jmenuArchivoProcesarCrearIndices);		
			this.jmenuBarProcesarCrearIndices.add(this.jmenuAccionesProcesarCrearIndices);		
			this.jmenuBarProcesarCrearIndices.add(this.jmenuDatosProcesarCrearIndices);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesarCrearIndices);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesarCrearIndices() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices.setToolTipText("Procesar Procesar Crear Indices");
		this.jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices= new JButtonMe();
		this.jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices.setText("Procesar");
		this.jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices.setToolTipText("Procesar Procesar Crear Indices");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices,"buscar_button","Procesar Procesar Crear Indices");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaProcesarCrearIndicesProcesarCrearIndices = new JLabelMe();
		jLabelidBusquedaProcesarCrearIndicesProcesarCrearIndices.setText(" :");
		jLabelidBusquedaProcesarCrearIndicesProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaProcesarCrearIndicesProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaProcesarCrearIndicesProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaProcesarCrearIndicesProcesarCrearIndices,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidProcesarCrearIndicesBusquedaProcesarCrearIndices= new JTextFieldMe();
		jLabelidProcesarCrearIndicesBusquedaProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesarCrearIndicesBusquedaProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesarCrearIndicesBusquedaProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidProcesarCrearIndicesBusquedaProcesarCrearIndices.setVisible(false);




		this.jTabbedPaneBusquedasProcesarCrearIndices=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesarCrearIndices.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasProcesarCrearIndices.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasProcesarCrearIndices.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Procesar Crear Indices"));
		this.jTabbedPaneBusquedasProcesarCrearIndices.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesarCrearIndices,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesarCrearIndices = new ProcesarCrearIndicesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Procesar Crear Indices DATOS");
			this.jInternalFrameDetalleFormProcesarCrearIndices = new ProcesarCrearIndicesDetalleFormJInternalFrame(jDesktopPane,this.procesarcrearindicesSessionBean.getConGuardarRelaciones(),this.procesarcrearindicesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesarCrearIndices = null;//new ProcesarCrearIndicesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesarCrearIndices= new GridBagLayout();
		
		
		this.jTableDatosProcesarCrearIndices = new JTableMe();      
		
		String sToolTipProcesarCrearIndices="";
		sToolTipProcesarCrearIndices=ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesarCrearIndices+="(ActivosFijos.ProcesarCrearIndices)";
		}
		
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesarCrearIndices+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesarCrearIndices.setToolTipText(sToolTipProcesarCrearIndices);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesarCrearIndices);
		this.jTableDatosProcesarCrearIndices.setAutoCreateRowSorter(true);
		this.jTableDatosProcesarCrearIndices.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesarCrearIndices.setRowSelectionAllowed(true);
		this.jTableDatosProcesarCrearIndices.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesarCrearIndices,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesarCrearIndices = new JButtonMe();
		this.jButtonDuplicarProcesarCrearIndices = new JButtonMe();
		this.jButtonCopiarProcesarCrearIndices = new JButtonMe();
		this.jButtonVerFormProcesarCrearIndices = new JButtonMe();
		this.jButtonNuevoRelacionesProcesarCrearIndices = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesarCrearIndices = new JButtonMe();
		this.jButtonCerrarProcesarCrearIndices = new JButtonMe();
		
		this.jScrollPanelDatosProcesarCrearIndices = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesarCrearIndices = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Procesar Crear Indices";
		
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Crear Indiceses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesarCrearIndices.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesarCrearIndices.setToolTipText("Acciones");
        this.jPanelAccionesProcesarCrearIndices.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesarCrearIndices=new ReporteDinamicoJInternalFrame(ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesarCrearIndices();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesarCrearIndices=new ImportacionJInternalFrame(ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesarCrearIndices();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesarCrearIndices = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesarCrearIndices.setText("Orden");
		this.jButtonAbrirOrderByProcesarCrearIndices.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesarCrearIndices,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesarCrearIndices=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarCrearIndices,false,this);
			
			//this.cargarOrderByProcesarCrearIndices(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesarCrearIndices=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarCrearIndices,true,this);
			
			//this.cargarOrderByProcesarCrearIndices(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesarCrearIndices.setMinimumSize(new Dimension(400,50));//130
		this.jTableDatosProcesarCrearIndices.setMaximumSize(new Dimension(400,50));//130
		this.jTableDatosProcesarCrearIndices.setPreferredSize(new Dimension(400,50));//130
		
		this.jScrollPanelDatosProcesarCrearIndices.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesarCrearIndices.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesarCrearIndices.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesarCrearIndices.setText("Nuevo");
		this.jButtonDuplicarProcesarCrearIndices.setText("Duplicar");
		this.jButtonCopiarProcesarCrearIndices.setText("Copiar");
		this.jButtonVerFormProcesarCrearIndices.setText("Ver");
		this.jButtonNuevoRelacionesProcesarCrearIndices.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.setText("Guardar");
		this.jButtonCerrarProcesarCrearIndices.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesarCrearIndices,"nuevo_button","Nuevo",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesarCrearIndices,"duplicar_button","Duplicar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesarCrearIndices,"copiar_button","Copiar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesarCrearIndices,"ver_form","Ver",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesarCrearIndices,"nuevorelaciones_button","Nuevo Rel",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesarCrearIndices,"guardarcambiostabla_button","Guardar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesarCrearIndices,"cerrar_button","Salir",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesarCrearIndices.setToolTipText("Nuevo"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesarCrearIndices.setToolTipText("Duplicar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesarCrearIndices.setToolTipText("Copiar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesarCrearIndices.setToolTipText("Ver"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesarCrearIndices.setToolTipText("Nuevo Rel"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.setToolTipText("Guardar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesarCrearIndices.setToolTipText("Salir"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesarCrearIndices";
		inputMap = this.jButtonNuevoProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesarCrearIndices.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesarCrearIndices"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesarCrearIndices";
		inputMap = this.jButtonDuplicarProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesarCrearIndices.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesarCrearIndices"));
		
		//COPIAR
		sMapKey = "CopiarProcesarCrearIndices";
		inputMap = this.jButtonCopiarProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesarCrearIndices.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesarCrearIndices"));
		
		//VEr FORM
		sMapKey = "VerFormProcesarCrearIndices";
		inputMap = this.jButtonVerFormProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesarCrearIndices.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesarCrearIndices"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesarCrearIndices";
		inputMap = this.jButtonNuevoRelacionesProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesarCrearIndices"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesarCrearIndices";
		inputMap = this.jButtonModificarProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesarCrearIndices"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesarCrearIndices";
		inputMap = this.jButtonCerrarProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesarCrearIndices"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesarCrearIndices";
		inputMap = this.jButtonGuardarCambiosTablaProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesarCrearIndices"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesarCrearIndices= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesarCrearIndices= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesarCrearIndices= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesarCrearIndices= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesarCrearIndices= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesarCrearIndices.setName("jPanelParametrosReportesProcesarCrearIndices"); 
		
		this.jPanelParametrosReportesAccionesProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesarCrearIndices.setName("jPanelParametrosReportesAccionesProcesarCrearIndices"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesarCrearIndices = new JButtonMe();
		this.jButtonRecargarInformacionProcesarCrearIndices.setText("Procesar");
		this.jButtonRecargarInformacionProcesarCrearIndices.setToolTipText("Procesar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesarCrearIndices,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesarCrearIndices.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesarCrearIndices = new JButtonMe();
		this.jButtonProcesarInformacionProcesarCrearIndices.setText("Procesar");
		this.jButtonProcesarInformacionProcesarCrearIndices.setToolTipText("Procesar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesarCrearIndices.setVisible(false);
			
		this.jButtonProcesarInformacionProcesarCrearIndices.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesarCrearIndices.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesarCrearIndices.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarCrearIndices.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesarCrearIndices.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarCrearIndices.setText("TIPO");       
		this.jComboBoxTiposReportesProcesarCrearIndices.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarCrearIndices.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesarCrearIndices.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesarCrearIndices.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesarCrearIndices.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesarCrearIndices.setText("Accion");
		this.jComboBoxTiposRelacionesProcesarCrearIndices.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesarCrearIndices.setText("Accion");
		this.jComboBoxTiposAccionesProcesarCrearIndices.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesarCrearIndices.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesarCrearIndices.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesarCrearIndices=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesarCrearIndices.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesarCrearIndices.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesarCrearIndices.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesarCrearIndices = new JLabelMe();
		
		this.jLabelAccionesProcesarCrearIndices.setText("Acciones");		
		this.jLabelAccionesProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesarCrearIndices = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesarCrearIndices.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesarCrearIndices.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesarCrearIndices = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesarCrearIndices.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesarCrearIndices.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesarCrearIndices = new JButtonMe();
		//this.jButtonAnterioresProcesarCrearIndices.setText("<<");
        this.jButtonAnterioresProcesarCrearIndices.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesarCrearIndices,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesarCrearIndices = new JButtonMe();
		//this.jButtonSiguientesProcesarCrearIndices.setText(">>");
        this.jButtonSiguientesProcesarCrearIndices.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesarCrearIndices,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesarCrearIndices = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesarCrearIndices.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesarCrearIndices.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesarCrearIndices,"nuevoguardarcambios_button","Nue",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesarCrearIndices";
		inputMap = this.jButtonNuevoGuardarCambiosProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesarCrearIndices"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesarCrearIndices";
		inputMap = this.jButtonRecargarInformacionProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesarCrearIndices"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesarCrearIndices";
		inputMap = this.jButtonSiguientesProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesarCrearIndices"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesarCrearIndices";
		inputMap = this.jButtonAnterioresProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesarCrearIndices"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesarCrearIndices();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesarCrearIndices.setMinimumSize(new Dimension(this.getWidth(),ProcesarCrearIndicesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarCrearIndicesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesarCrearIndices.setMaximumSize(new Dimension(this.getWidth(),ProcesarCrearIndicesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarCrearIndicesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesarCrearIndices.setPreferredSize(new Dimension(this.getWidth(),ProcesarCrearIndicesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarCrearIndicesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesarCrearIndices = new GridBagLayout();

			this.jPanelPaginacionProcesarCrearIndices.setLayout(gridaBagLayoutPaginacionProcesarCrearIndices);						
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonAnterioresProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
					
						
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
			
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonNuevoGuardarCambiosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
						
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonSiguientesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 1;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonNuevoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
						
			
			
			if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
				this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesarCrearIndices.gridy = 1;
				this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonGuardarCambiosTablaProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			}
			
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 1;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonProcesarInformacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 1;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonDuplicarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 1;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonCopiarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 1;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonVerFormProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 1;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesarCrearIndices.add(this.jButtonCerrarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
		
		
		this.jButtonRecargarInformacionProcesarCrearIndices.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesarCrearIndices.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesarCrearIndices.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesarCrearIndices.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesarCrearIndices.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesarCrearIndices.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesarCrearIndices.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesarCrearIndices.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesarCrearIndices.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesarCrearIndices.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesarCrearIndices.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesarCrearIndices.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesarCrearIndices.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesarCrearIndices.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesarCrearIndices.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesarCrearIndices.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesarCrearIndices.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesarCrearIndices.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesarCrearIndices.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarCrearIndices.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarCrearIndices.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesarCrearIndices.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesarCrearIndices.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesarCrearIndices.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesarCrearIndices.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesarCrearIndices.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesarCrearIndices.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesarCrearIndices.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesarCrearIndices.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesarCrearIndices.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesarCrearIndices.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesarCrearIndices.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesarCrearIndices = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesarCrearIndices = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesarCrearIndices = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesarCrearIndices = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesarCrearIndices = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesarCrearIndices = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesarCrearIndices.setLayout(gridaBagParametrosReportesProcesarCrearIndices);
			this.jPanelParametrosReportesAccionesProcesarCrearIndices.setLayout(gridaBagParametrosReportesAccionesProcesarCrearIndices);
			
			
			this.jPanelParametrosAuxiliar1ProcesarCrearIndices.setLayout(gridaBagParametrosAuxiliar1ProcesarCrearIndices);
			this.jPanelParametrosAuxiliar2ProcesarCrearIndices.setLayout(gridaBagParametrosAuxiliar2ProcesarCrearIndices);
			this.jPanelParametrosAuxiliar3ProcesarCrearIndices.setLayout(gridaBagParametrosAuxiliar3ProcesarCrearIndices);
			this.jPanelParametrosAuxiliar4ProcesarCrearIndices.setLayout(gridaBagParametrosAuxiliar4ProcesarCrearIndices);
			//this.jPanelParametrosAuxiliar5ProcesarCrearIndices.setLayout(gridaBagParametrosAuxiliar2ProcesarCrearIndices);			
			
			
			
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jButtonRecargarInformacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarCrearIndices.add(this.jComboBoxTiposPaginacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarCrearIndices.add(this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarCrearIndices.add(this.jComboBoxTiposArchivosReportesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jPanelParametrosAuxiliar1ProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCrearIndices.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesarCrearIndices.add(this.jComboBoxTiposReportesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jPanelParametrosAuxiliar4ProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jComboBoxTiposReportesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jCheckBoxGenerarReporteProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jPanelParametrosAuxiliar2ProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCrearIndices.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jLabelAccionesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jComboBoxTiposSeleccionarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);			
			
			
			/*
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCrearIndices.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jCheckBoxSeleccionarTodosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCrearIndices.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesarCrearIndices.add(this.jCheckBoxSeleccionarTodosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);															
				
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarCrearIndices.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesarCrearIndices.add(this.jCheckBoxSeleccionadosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jPanelParametrosAuxiliar3ProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarCrearIndices.add(this.jComboBoxTiposAccionesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesarCrearIndices = new GridBagLayout();

			this.jScrollPanelDatosProcesarCrearIndices.setLayout(gridaBagLayoutDatosProcesarCrearIndices);
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
			this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
			
			this.jScrollPanelDatosProcesarCrearIndices.add(this.jTableDatosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesarCrearIndices.setViewportView(this.jTableDatosProcesarCrearIndices);
		this.jTableDatosProcesarCrearIndices.setFillsViewportHeight(true);
		this.jTableDatosProcesarCrearIndices.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesarCrearIndices= new GridBagLayout();
		this.jPanelAccionesProcesarCrearIndices.setLayout(gridaBagLayoutAccionesProcesarCrearIndices);
		
		
		/*	
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
			
		this.jPanelAccionesProcesarCrearIndices.add(this.jButtonNuevoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesarCrearIndicesProcesarCrearIndices= new GridBagLayout();
		gridaBagLayoutBusquedaProcesarCrearIndicesProcesarCrearIndices.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesarCrearIndicesProcesarCrearIndices.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesarCrearIndicesProcesarCrearIndices.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesarCrearIndicesProcesarCrearIndices.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices.setLayout(gridaBagLayoutBusquedaProcesarCrearIndicesProcesarCrearIndices);

		gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCrearIndices.gridy = 0;
		gridBagConstraintsProcesarCrearIndices.gridx = 0;
		jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices.add(jLabelidBusquedaProcesarCrearIndicesProcesarCrearIndices, gridBagConstraintsProcesarCrearIndices);

		gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCrearIndices.gridy = 0;
		gridBagConstraintsProcesarCrearIndices.gridx = 1;
		jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices.add(jLabelidProcesarCrearIndicesBusquedaProcesarCrearIndices, gridBagConstraintsProcesarCrearIndices);

		gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarCrearIndices.gridy = 1;
		gridBagConstraintsProcesarCrearIndices.gridx =1;
		jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices.add(jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices, gridBagConstraintsProcesarCrearIndices);

		jTabbedPaneBusquedasProcesarCrearIndices.addTab("Procesar", jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices);
		jTabbedPaneBusquedasProcesarCrearIndices.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesarCrearIndices = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesarCrearIndices);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();						
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarCrearIndices.gridx = 0;		
			//this.gridBagConstraintsProcesarCrearIndices.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesarCrearIndices.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;		
		//this.gridBagConstraintsProcesarCrearIndices.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesarCrearIndices.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesarCrearIndices);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarCrearIndices.gridx = 0;		
			this.gridBagConstraintsProcesarCrearIndices.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesarCrearIndices.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);								
		
		
		/*
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		*/		
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesarCrearIndices.gridx =0;
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesarCrearIndices.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
				
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesarCrearIndices= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesarCrearIndices = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesarCrearIndices.setLayout(gridaBagLayoutBusquedasParametrosProcesarCrearIndices);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesarCrearIndices=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesarCrearIndices.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarCrearIndices.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarCrearIndices.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			
			
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
			
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesarCrearIndices.setVisible(false);
		this.jButtonAnterioresProcesarCrearIndices.setVisible(false);
		this.jButtonSiguientesProcesarCrearIndices.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesarCrearIndices.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesarCrearIndices.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesarCrearIndices.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices.setVisible(false);
		this.jCheckBoxSeleccionadosProcesarCrearIndices.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesarCrearIndices.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesarCrearIndices.setVisible(false);
		this.jComboBoxTiposReportesProcesarCrearIndices.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesarCrearIndices.setVisible(false);
		this.jComboBoxTiposPaginacionProcesarCrearIndices.setVisible(false);
		this.jComboBoxTiposRelacionesProcesarCrearIndices.setVisible(false);
		this.jComboBoxTiposAccionesProcesarCrearIndices.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesarCrearIndices.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesarCrearIndices.setVisible(false);
		
		this.jPanelParametrosReportesProcesarCrearIndices.setVisible(false);
		
		
		this.jTtoolBarProcesarCrearIndices.setVisible(false);
			
		this.jMenuItemAnterioresProcesarCrearIndices.setVisible(false);
		this.jMenuItemSiguientesProcesarCrearIndices.setVisible(false);
		this.jMenuItemAbrirOrderByProcesarCrearIndices.setVisible(false);
		this.jMenuItemMostrarOcultarProcesarCrearIndices.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesarCrearIndices.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesarCrearIndices.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesarCrearIndices.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesarCrearIndices.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesarCrearIndices.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesarCrearIndices.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices.setVisible(false);
		this.jMenuItemRecargarInformacionProcesarCrearIndices.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesarCrearIndices;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesarCrearIndices() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesarCrearIndices = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesarCrearIndices.setName("jPanelReporteDinamicoProcesarCrearIndices"); 
		
		this.jPanelReporteDinamicoProcesarCrearIndices.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesarCrearIndices.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesarCrearIndices.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesarCrearIndices.setLayout(gridaBagLayoutReporteDinamicoProcesarCrearIndices);
		
		
		this.jInternalFrameReporteDinamicoProcesarCrearIndices= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesarCrearIndices = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesarCrearIndices= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesarCrearIndices.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesarCrearIndices.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesarCrearIndices.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesarCrearIndices.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesarCrearIndices.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesarCrearIndices.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesarCrearIndices.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesarCrearIndices.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesarCrearIndices.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesarCrearIndices.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesarCrearIndices.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Crear Indiceses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesarCrearIndices = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesarCrearIndices.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jLabelColumnasSelectReporteProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesarCrearIndices = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesarCrearIndices.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesarCrearIndices.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesarCrearIndices.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesarCrearIndices.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesarCrearIndices.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesarCrearIndices=new JScrollPane(this.jListColumnasSelectReporteProcesarCrearIndices);
			
			this.jScrollColumnasSelectReporteProcesarCrearIndices.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesarCrearIndices.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesarCrearIndices.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jListColumnasSelectReporteProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jScrollColumnasSelectReporteProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesarCrearIndices = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesarCrearIndices.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesarCrearIndices = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesarCrearIndices.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesarCrearIndices.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesarCrearIndices.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesarCrearIndices.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesarCrearIndices.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesarCrearIndices=new JScrollPane(this.jListRelacionesSelectReporteProcesarCrearIndices);
			
			this.jScrollRelacionesSelectReporteProcesarCrearIndices.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesarCrearIndices.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesarCrearIndices.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesarCrearIndices = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesarCrearIndices = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesarCrearIndices = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesarCrearIndices = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesarCrearIndices.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesarCrearIndices.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesarCrearIndices.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesarCrearIndices.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesarCrearIndices = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesarCrearIndices.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jLabelGenerarExcelReporteDinamicoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesarCrearIndices = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesarCrearIndices.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesarCrearIndices,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesarCrearIndices.setToolTipText("Generar EXCEL"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jButtonGenerarExcelReporteDinamicoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jComboBoxTiposReportesDinamicoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesarCrearIndices = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesarCrearIndices.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jLabelTiposArchivoReporteDinamicoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jComboBoxTiposArchivosReportesDinamicoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesarCrearIndices = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesarCrearIndices.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesarCrearIndices,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesarCrearIndices.setToolTipText("Generar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jButtonGenerarReporteDinamicoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesarCrearIndices = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesarCrearIndices.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesarCrearIndices,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesarCrearIndices.setToolTipText("Cancelar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarCrearIndices.add(this.jButtonCerrarReporteDinamicoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesarCrearIndices = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesarCrearIndices= new JScrollPane(jPanelReporteDinamicoProcesarCrearIndices,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesarCrearIndices.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesarCrearIndices.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesarCrearIndices.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Crear Indiceses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesarCrearIndices.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesarCrearIndices.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesarCrearIndices.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesarCrearIndices);
		this.jInternalFrameReporteDinamicoProcesarCrearIndices.getContentPane().add(this.jScrollPanelReporteDinamicoProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesarCrearIndices() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesarCrearIndices = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesarCrearIndices.setName("jPanelImportacionProcesarCrearIndices"); 
		
		this.jPanelImportacionProcesarCrearIndices.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesarCrearIndices.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesarCrearIndices.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesarCrearIndices.setLayout(gridaBagLayoutImportacionProcesarCrearIndices);
		
		
		this.jInternalFrameImportacionProcesarCrearIndices= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesarCrearIndices= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesarCrearIndices = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesarCrearIndices= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesarCrearIndices.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesarCrearIndices.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesarCrearIndices.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesarCrearIndices.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesarCrearIndices.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesarCrearIndices.setResizable(true);
	    this.jInternalFrameImportacionProcesarCrearIndices.setClosable(true);
	    this.jInternalFrameImportacionProcesarCrearIndices.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesarCrearIndices.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesarCrearIndices.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesarCrearIndices.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesarCrearIndices.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesarCrearIndices.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesarCrearIndices.setResizable(true);
	    this.jInternalFrameImportacionProcesarCrearIndices.setClosable(true);
	    this.jInternalFrameImportacionProcesarCrearIndices.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesarCrearIndices.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesarCrearIndices.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesarCrearIndices.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Crear Indiceses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesarCrearIndices = new JLabelMe();

		this.jLabelArchivoImportacionProcesarCrearIndices.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesarCrearIndices.add(this.jLabelArchivoImportacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesarCrearIndices = new JFileChooser();		
		this.jFileChooserImportacionProcesarCrearIndices.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesarCrearIndices = new JButtonMe();
		this.jButtonAbrirImportacionProcesarCrearIndices.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesarCrearIndices,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesarCrearIndices.setToolTipText("Generar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarCrearIndices.add(this.jButtonAbrirImportacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesarCrearIndices = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesarCrearIndices.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesarCrearIndices.add(this.jLabelPathArchivoImportacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesarCrearIndices=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesarCrearIndices.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesarCrearIndices.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesarCrearIndices.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarCrearIndices.add(this.jTextFieldPathArchivoImportacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesarCrearIndices = new JButtonMe();
		this.jButtonGenerarImportacionProcesarCrearIndices.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesarCrearIndices,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesarCrearIndices.setToolTipText("Generar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarCrearIndices.add(this.jButtonGenerarImportacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesarCrearIndices = new JButtonMe();
		this.jButtonCerrarImportacionProcesarCrearIndices.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesarCrearIndices,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesarCrearIndices.setToolTipText("Cancelar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarCrearIndices.add(this.jButtonCerrarImportacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesarCrearIndices = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesarCrearIndices= new JScrollPane(jPanelImportacionProcesarCrearIndices,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesarCrearIndices.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesarCrearIndices.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesarCrearIndices.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesarCrearIndices);
		this.jInternalFrameImportacionProcesarCrearIndices.getContentPane().add(this.jScrollPanelImportacionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesarCrearIndices(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesarCrearIndices = new JButtonMe();
			this.jButtonAbrirOrderByProcesarCrearIndices.setText("Orden");
			this.jButtonAbrirOrderByProcesarCrearIndices.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesarCrearIndices,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesarCrearIndices";
			inputMap = this.jButtonAbrirOrderByProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesarCrearIndices"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesarCrearIndices = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesarCrearIndices.setName("jPanelOrderByProcesarCrearIndices"); 
			
			this.jPanelOrderByProcesarCrearIndices.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesarCrearIndices.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesarCrearIndices.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesarCrearIndices.setLayout(gridaBagLayoutOrderByProcesarCrearIndices);
			
			
			this.jTableDatosProcesarCrearIndicesOrderBy = new JTableMe();        
			this.jTableDatosProcesarCrearIndicesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesarCrearIndicesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesarCrearIndicesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesarCrearIndicesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesarCrearIndicesOrderBy.setViewportView(this.jTableDatosProcesarCrearIndicesOrderBy);
			this.jTableDatosProcesarCrearIndicesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesarCrearIndicesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesarCrearIndices= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesarCrearIndices= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesarCrearIndices = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesarCrearIndices= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesarCrearIndices.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesarCrearIndices.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesarCrearIndices.setTitle("Orden");
			this.jInternalFrameOrderByProcesarCrearIndices.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesarCrearIndices.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesarCrearIndices.setResizable(true);
			this.jInternalFrameOrderByProcesarCrearIndices.setClosable(true);
			this.jInternalFrameOrderByProcesarCrearIndices.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesarCrearIndices.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesarCrearIndices.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesarCrearIndices.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Crear Indiceses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesarCrearIndices.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesarCrearIndices.ipady =150;
				
			this.jPanelOrderByProcesarCrearIndices.add(jScrollPanelDatosProcesarCrearIndicesOrderBy, this.gridBagConstraintsProcesarCrearIndices);//this.jTableDatosProcesarCrearIndicesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesarCrearIndices = new JButtonMe();
			this.jButtonCerrarOrderByProcesarCrearIndices.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesarCrearIndices,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesarCrearIndices.setToolTipText("Cancelar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesarCrearIndices.add(this.jButtonCerrarOrderByProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesarCrearIndices = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesarCrearIndices= new JScrollPane(jPanelOrderByProcesarCrearIndices,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesarCrearIndices.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesarCrearIndices.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesarCrearIndices.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesarCrearIndices);
			
			this.jInternalFrameOrderByProcesarCrearIndices.getContentPane().add(this.jScrollPanelOrderByProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);			
		
		} else {
			this.jButtonAbrirOrderByProcesarCrearIndices = new JButtonMe();
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
		int iWidthTableCalculado=0;//230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesarcrearindicesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesarCrearIndices.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesarCrearIndices.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesarCrearIndices.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesarCrearIndices.getRowHeight();//ProcesarCrearIndicesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesarCrearIndicesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices.isSelected()) {
					iHeightTable=ProcesarCrearIndicesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesarCrearIndicesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesarCrearIndicesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesarCrearIndicesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesarCrearIndices.isSelected()) {
					iHeightTable=ProcesarCrearIndicesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesarCrearIndicesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesarCrearIndicesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesarCrearIndices.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesarCrearIndices.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesarCrearIndices.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesarCrearIndices.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesarCrearIndices.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesarCrearIndices.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesarCrearIndices!=null && this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy()!=null) {
			//if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesarCrearIndices.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesarCrearIndices.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesarCrearIndices.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesarCrearIndices.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesarCrearIndices.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesarCrearIndices.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesarcrearindicesLogic.getProcesarCrearIndicess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarcrearindicess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesarCrearIndices> TraerProcesarCrearIndicesBeans(List<ProcesarCrearIndices> procesarcrearindicess,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesarCrearIndices procesarcrearindices:procesarcrearindicess) {
					
				if(!(ProcesarCrearIndicesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesarCrearIndicesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesarcrearindices.setsDetalleGeneralEntityReporte(ProcesarCrearIndicesConstantesFunciones.getProcesarCrearIndicesDescripcion(procesarcrearindices));
										
						
					
						
					
				} else  {
							
					//procesarcrearindices.setsDetalleGeneralEntityReporte(procesarcrearindices.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesarcrearindicesbeans.add(procesarcrearindicesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesarcrearindicess;
    }
	//PARA REPORTES FIN
}
