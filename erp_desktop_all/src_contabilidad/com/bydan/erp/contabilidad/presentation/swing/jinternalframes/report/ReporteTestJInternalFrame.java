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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.contabilidad.util.report.ReporteTestConstantesFunciones;

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
public class ReporteTestJInternalFrame extends ReporteTestBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarReporteTest;
	
	protected JMenuBar jmenuBarReporteTest;
	
	protected JMenu jmenuReporteTest;
	protected JMenu jmenuDatosReporteTest;
	protected JMenu jmenuArchivoReporteTest;
	protected JMenu jmenuAccionesReporteTest;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReporteTest;	
	protected GridBagConstraints gridBagConstraintsReporteTest;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ReporteTestDetalleFormJInternalFrame jInternalFrameDetalleFormReporteTest;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoReporteTest;	
	protected ImportacionJInternalFrame jInternalFrameImportacionReporteTest;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public ReporteTestSessionBean reportetestSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ReporteTest> reportetests;		
	public List<ReporteTest> reportetestsEliminados;	
	public List<ReporteTest> reportetestsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByReporteTest;		
	protected JButton jButtonAbrirOrderByReporteTest;
	
	
	//protected JPanel jPanelOrderByReporteTest;
	//public JScrollPane jScrollPanelOrderByReporteTest;	
	//protected JButton jButtonCerrarOrderByReporteTest;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ReporteTestLogic reportetestLogic;
	
	
	
	public JScrollPane jScrollPanelDatosReporteTest;
	public JScrollPane jScrollPanelDatosEdicionReporteTest;
	public JScrollPane jScrollPanelDatosGeneralReporteTest;
    
	
	
	//public JScrollPane jScrollPanelDatosReporteTestOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoReporteTest;
	//public JScrollPane jScrollPanelImportacionReporteTest;
	
	
	
	protected JPanel jPanelAccionesReporteTest;
	
    protected JPanel jPanelPaginacionReporteTest;
    protected JPanel jPanelParametrosReportesReporteTest;
	protected JPanel jPanelParametrosReportesAccionesReporteTest;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ReporteTest;
	protected JPanel jPanelParametrosAuxiliar2ReporteTest;
	protected JPanel jPanelParametrosAuxiliar3ReporteTest;
	protected JPanel jPanelParametrosAuxiliar4ReporteTest;
	//protected JPanel jPanelParametrosAuxiliar5ReporteTest;
	
	
	
	//protected JPanel jPanelReporteDinamicoReporteTest;
	//protected JPanel jPanelImportacionReporteTest;
	
	
	public JTable jTableDatosReporteTest;
	
	
	
	//public JTable jTableDatosReporteTestOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoReporteTest;
	protected JButton jButtonDuplicarReporteTest;
	protected JButton jButtonCopiarReporteTest;
	protected JButton jButtonVerFormReporteTest;
	protected JButton jButtonNuevoRelacionesReporteTest;
	protected JButton jButtonModificarReporteTest;
	
    protected JButton jButtonGuardarCambiosTablaReporteTest;
	protected JButton jButtonCerrarReporteTest;
	
	
	protected JButton jButtonRecargarInformacionReporteTest;
	protected JButton jButtonProcesarInformacionReporteTest;
	
	
	protected JButton jButtonAnterioresReporteTest;
	protected JButton jButtonSiguientesReporteTest;
	protected JButton jButtonNuevoGuardarCambiosReporteTest;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoReporteTest;
	//protected JButton jButtonCerrarReporteDinamicoReporteTest;
	//protected JButton jButtonGenerarExcelReporteDinamicoReporteTest;	
	
	
	
	//protected JButton jButtonAbrirImportacionReporteTest;
	//protected JButton jButtonGenerarImportacionReporteTest;
	//protected JButton jButtonCerrarImportacionReporteTest;
	//protected JFileChooser jFileChooserImportacionReporteTest;
	//protected File fileImportacionReporteTest;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReporteTest;
	protected JButton jButtonDuplicarToolBarReporteTest;
	protected JButton jButtonNuevoRelacionesToolBarReporteTest;
	
	
	public JButton jButtonGuardarCambiosToolBarReporteTest;
	protected JButton jButtonCopiarToolBarReporteTest;
	protected JButton jButtonVerFormToolBarReporteTest;
	public JButton jButtonGuardarCambiosTablaToolBarReporteTest;
	protected JButton jButtonMostrarOcultarTablaToolBarReporteTest;
	protected JButton jButtonCerrarToolBarReporteTest;
	
	protected JButton jButtonRecargarInformacionToolBarReporteTest;
	protected JButton jButtonProcesarInformacionToolBarReporteTest;
	protected JButton jButtonAnterioresToolBarReporteTest;
	protected JButton jButtonSiguientesToolBarReporteTest;
	protected JButton jButtonNuevoGuardarCambiosToolBarReporteTest;
	protected JButton jButtonAbrirOrderByToolBarReporteTest;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReporteTest;
	protected JMenuItem jMenuItemDuplicarReporteTest;
	protected JMenuItem jMenuItemNuevoRelacionesReporteTest;
	
	
	protected JMenuItem jMenuItemGuardarCambiosReporteTest;
	protected JMenuItem jMenuItemCopiarReporteTest;
	protected JMenuItem jMenuItemVerFormReporteTest;
	protected JMenuItem jMenuItemGuardarCambiosTablaReporteTest;
	protected JMenuItem jMenuItemCerrarReporteTest;
	protected JMenuItem jMenuItemDetalleCerrarReporteTest;
	protected JMenuItem jMenuItemDetalleAbrirOrderByReporteTest;
	protected JMenuItem jMenuItemDetalleMostarOcultarReporteTest;
	
	protected JMenuItem jMenuItemRecargarInformacionReporteTest;
	protected JMenuItem jMenuItemProcesarInformacionReporteTest;
	protected JMenuItem jMenuItemAnterioresReporteTest;
	protected JMenuItem jMenuItemSiguientesReporteTest;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReporteTest;
	protected JMenuItem jMenuItemAbrirOrderByReporteTest;
	protected JMenuItem jMenuItemMostrarOcultarReporteTest;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReporteTest;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosReporteTest;
	protected JCheckBox jCheckBoxSeleccionadosReporteTest;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaReporteTest;
	protected JCheckBox jCheckBoxConGraficoReporteReporteTest;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesReporteTest;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesReporteTest;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoReporteTest;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoReporteTest;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesReporteTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionReporteTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReporteTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReporteTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarReporteTest;
	protected JTextField jTextFieldValorCampoGeneralReporteTest;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteReporteTest;
	//public JList<Reporte> jListColumnasSelectReporteReporteTest;
	//public JScrollPane jScrollColumnasSelectReporteReporteTest;
	
	//public JLabel jLabelRelacionesSelectReporteReporteTest;
	//public JList<Reporte> jListRelacionesSelectReporteReporteTest;
	//public JScrollPane jScrollRelacionesSelectReporteReporteTest;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoReporteTest;
	//protected JCheckBox jCheckBoxConGraficoDinamicoReporteTest;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoReporteTest;
	//public JLabel jLabelTiposArchivoReporteDinamicoReporteTest;
	
		
	//public JLabel jLabelArchivoImportacionReporteTest;	
	//public JLabel jLabelPathArchivoImportacionReporteTest;
	//protected JTextField jTextFieldPathArchivoImportacionReporteTest;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoReporteTest;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoReporteTest;
	
	//public JLabel jLabelColumnaCategoriaValorReporteTest;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorReporteTest;
	
	//public JLabel jLabelColumnasValoresGraficoReporteTest;
	//public JList<Reporte> jListColumnasValoresGraficoReporteTest;
	//public JScrollPane jScrollColumnasValoresGraficoReporteTest;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoReporteTest;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoReporteTest;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasReporteTest;
	public JPanel jPanelBusquedaReporteTestReporteTest;
	public JButton jButtonBusquedaReporteTestReporteTest;
	
	public JPanel jPanelid_empresaBusquedaReporteTestReporteTest;
	public JLabel jLabelid_empresaBusquedaReporteTestReporteTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBusquedaReporteTestReporteTest;
	public JButton jButtonid_empresaBusquedaReporteTestReporteTest= new JButtonMe();
	public JButton jButtonid_empresaBusquedaReporteTestReporteTestUpdate= new JButtonMe();
	public JButton jButtonid_empresaBusquedaReporteTestReporteTestBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaReporteTestReporteTest;
	public JLabel jLabelid_moduloBusquedaReporteTestReporteTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaReporteTestReporteTest;
	public JButton jButtonid_moduloBusquedaReporteTestReporteTest= new JButtonMe();
	public JButton jButtonid_moduloBusquedaReporteTestReporteTestUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaReporteTestReporteTestBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaReporteTestReporteTest;
	public JLabel jLabelnombreBusquedaReporteTestReporteTest;
	public JTextField jTextFieldnombreBusquedaReporteTestReporteTest;
	public JButton jButtonnombreBusquedaReporteTestReporteTestBusqueda= new JButtonMe();

	
	public JPanel jPanelubicacionBusquedaReporteTestReporteTest;
	public JLabel jLabelubicacionBusquedaReporteTestReporteTest;
	public JTextArea jTextAreaubicacionBusquedaReporteTestReporteTest;
	public JButton jButtonubicacionBusquedaReporteTestReporteTestBusqueda= new JButtonMe();

	
	
	
	
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
	public ReporteTestJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReporteTestJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReporteTestJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReporteTestJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionReporteTest)	{
		this.jButtonRecargarInformacionReporteTest = jButtonRecargarInformacionReporteTest;
	}
	
	public JButton getjButtonProcesarInformacionReporteTest() {
		return this.jButtonProcesarInformacionReporteTest;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReporteTest)	{
		this.jButtonProcesarInformacionReporteTest = jButtonProcesarInformacionReporteTest;
	}
	
	
	public JButton getjButtonRecargarInformacionReporteTest() {
		return this.jButtonRecargarInformacionReporteTest;
	}
	
	
	public List<ReporteTest> getreportetests() {
		return this.reportetests;
	}

	public void setreportetests(List<ReporteTest> reportetests) {
		this.reportetests = reportetests;
	}
	
	public List<ReporteTest> getreportetestsAux() {
		return this.reportetestsAux;
	}

	public void setreportetestsAux(List<ReporteTest> reportetestsAux) {
		this.reportetestsAux = reportetestsAux;
	}
	
	public List<ReporteTest> getreportetestsEliminados() {
		return this.reportetestsEliminados;
	}

	public void setReporteTestsEliminados(List<ReporteTest> reportetestsEliminados) {
		this.reportetestsEliminados = reportetestsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarReporteTest() {
		return jComboBoxTiposSeleccionarReporteTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarReporteTest(
			JComboBox jComboBoxTiposSeleccionarReporteTest) {
		this.jComboBoxTiposSeleccionarReporteTest = jComboBoxTiposSeleccionarReporteTest;
	}
	
	public void setBorderResaltarTiposSeleccionarReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarReporteTest .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralReporteTest() {
		return jTextFieldValorCampoGeneralReporteTest;
	}

	public void setjTextFieldValorCampoGeneralReporteTest(
			JTextField jTextFieldValorCampoGeneralReporteTest) {
		this.jTextFieldValorCampoGeneralReporteTest = jTextFieldValorCampoGeneralReporteTest;
	}

	public void setBorderResaltarValorCampoGeneralReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralReporteTest .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosReporteTest() {
		return this.jCheckBoxSeleccionarTodosReporteTest;
	}

	public void setjCheckBoxSeleccionarTodosReporteTest(
			JCheckBox jCheckBoxSeleccionarTodosReporteTest) {
		this.jCheckBoxSeleccionarTodosReporteTest = jCheckBoxSeleccionarTodosReporteTest;
	}

	public void setBorderResaltarSeleccionarTodosReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosReporteTest .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosReporteTest() {
		return this.jCheckBoxSeleccionadosReporteTest;
	}

	public void setjCheckBoxSeleccionadosReporteTest(
			JCheckBox jCheckBoxSeleccionadosReporteTest) {
		this.jCheckBoxSeleccionadosReporteTest = jCheckBoxSeleccionadosReporteTest;
	}
	
	public void setBorderResaltarSeleccionadosReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosReporteTest .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesReporteTest() {
		return this.jComboBoxTiposArchivosReportesReporteTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesReporteTest(
			JComboBox jComboBoxTiposArchivosReportesReporteTest) {
		this.jComboBoxTiposArchivosReportesReporteTest = jComboBoxTiposArchivosReportesReporteTest;
	}

	public void setBorderResaltarTiposArchivosReportesReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesReporteTest .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesReporteTest() {
		return this.jComboBoxTiposReportesReporteTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesReporteTest(
			JComboBox jComboBoxTiposReportesReporteTest) {
		this.jComboBoxTiposReportesReporteTest = jComboBoxTiposReportesReporteTest;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoReporteTest() {
	//	return jComboBoxTiposReportesDinamicoReporteTest;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoReporteTest(
	//		JComboBox jComboBoxTiposReportesDinamicoReporteTest) {
	//	this.jComboBoxTiposReportesDinamicoReporteTest = jComboBoxTiposReportesDinamicoReporteTest;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoReporteTest() {
	//	return jComboBoxTiposArchivosReportesDinamicoReporteTest;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoReporteTest(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoReporteTest) {
	//	this.jComboBoxTiposArchivosReportesDinamicoReporteTest = jComboBoxTiposArchivosReportesDinamicoReporteTest;
	//}
	
	public void setBorderResaltarTiposReportesReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesReporteTest .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesReporteTest() {
		return this.jComboBoxTiposGraficosReportesReporteTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesReporteTest(
			JComboBox jComboBoxTiposGraficosReportesReporteTest) {
		this.jComboBoxTiposGraficosReportesReporteTest = jComboBoxTiposGraficosReportesReporteTest;
	}
	
	public void setBorderResaltarTiposGraficosReportesReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesReporteTest .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionReporteTest() {
		return this.jComboBoxTiposPaginacionReporteTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionReporteTest(
			JComboBox jComboBoxTiposPaginacionReporteTest) {
		this.jComboBoxTiposPaginacionReporteTest = jComboBoxTiposPaginacionReporteTest;
	}
	
	public void setBorderResaltarTiposPaginacionReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionReporteTest .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesReporteTest() {
		return this.jComboBoxTiposRelacionesReporteTest;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReporteTest() {
		return this.jComboBoxTiposAccionesReporteTest;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReporteTest(
			JComboBox jComboBoxTiposRelacionesReporteTest) {
		this.jComboBoxTiposRelacionesReporteTest = jComboBoxTiposRelacionesReporteTest;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReporteTest(
			JComboBox jComboBoxTiposAccionesReporteTest) {
		this.jComboBoxTiposAccionesReporteTest = jComboBoxTiposAccionesReporteTest;
	}
	
	public void setBorderResaltarTiposRelacionesReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesReporteTest .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesReporteTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReporteTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesReporteTest .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoReporteTest() {
	//	return jCheckBoxConGraficoDinamicoReporteTest;
	//}

	//public void setjCheckBoxConGraficoDinamicoReporteTest(
	//		JCheckBox jCheckBoxConGraficoDinamicoReporteTest) {
	//	this.jCheckBoxConGraficoDinamicoReporteTest = jCheckBoxConGraficoDinamicoReporteTest;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoReporteTest() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarReporteTest.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoReporteTest .setBorder(borderResaltar);		
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
		this.reportetestSessionBean=new ReporteTestSessionBean();
		
		this.reportetestSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.reportetestSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.reportetestSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ReporteTestJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ReporteTestJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReporteTestJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReporteTestJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReporteTestJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Reporte Test MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
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
		
		ReporteTestJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarReporteTest= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarReporteTest,this.jTtoolBarReporteTest,
							"nuevo","nuevo","Nuevo"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarReporteTest,this.jTtoolBarReporteTest,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarReporteTest,this.jTtoolBarReporteTest,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarReporteTest,this.jTtoolBarReporteTest,
							"duplicar","duplicar","Duplicar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarReporteTest,this.jTtoolBarReporteTest,
							"copiar","copiar","Copiar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarReporteTest,this.jTtoolBarReporteTest,
							"ver_form","ver_form","Ver"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReporteTest,this.jTtoolBarReporteTest,
							"recargar","recargar","Buscar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReporteTest,this.jTtoolBarReporteTest,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReporteTest,this.jTtoolBarReporteTest,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarReporteTest,this.jTtoolBarReporteTest,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarReporteTest,this.jTtoolBarReporteTest,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarReporteTest,this.jTtoolBarReporteTest,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarReporteTest,this.jTtoolBarReporteTest,
							"cerrar","cerrar","Salir"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarReporteTest=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarReporteTest;
			
				this.jButtonProcesarInformacionToolBarReporteTest=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarReporteTest;
				
		//protected JButton jButtonModificarToolBarReporteTest;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarReporteTest=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuReporteTest=new JMenuMe("General");
		this.jmenuArchivoReporteTest=new JMenuMe("Archivo");
		this.jmenuAccionesReporteTest=new JMenuMe("Acciones");
		this.jmenuDatosReporteTest=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReporteTest= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReporteTest.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReporteTest,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarReporteTest= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarReporteTest.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarReporteTest,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesReporteTest= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesReporteTest.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesReporteTest,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosReporteTest= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReporteTest.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReporteTest,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarReporteTest= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarReporteTest.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarReporteTest,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormReporteTest= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormReporteTest.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormReporteTest,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaReporteTest= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaReporteTest.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaReporteTest,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReporteTest= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReporteTest.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReporteTest,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionReporteTest= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionReporteTest.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionReporteTest,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionReporteTest= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionReporteTest.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionReporteTest,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresReporteTest= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresReporteTest.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresReporteTest,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesReporteTest= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesReporteTest.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesReporteTest,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByReporteTest= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByReporteTest.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByReporteTest,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReporteTest= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReporteTest.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReporteTest,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByReporteTest= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByReporteTest.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByReporteTest,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReporteTest= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReporteTest.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReporteTest,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosReporteTest= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosReporteTest.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosReporteTest,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoReporteTest.add(this.jMenuItemCerrarReporteTest);
			
			this.jmenuAccionesReporteTest.add(this.jMenuItemNuevoReporteTest);
			this.jmenuAccionesReporteTest.add(this.jMenuItemNuevoGuardarCambiosReporteTest);
			this.jmenuAccionesReporteTest.add(this.jMenuItemNuevoRelacionesReporteTest);
			this.jmenuAccionesReporteTest.add(this.jMenuItemGuardarCambiosTablaReporteTest);		
			this.jmenuAccionesReporteTest.add(this.jMenuItemDuplicarReporteTest);		
			this.jmenuAccionesReporteTest.add(this.jMenuItemCopiarReporteTest);		
			this.jmenuAccionesReporteTest.add(this.jMenuItemVerFormReporteTest);		
			
			this.jmenuDatosReporteTest.add(this.jMenuItemRecargarInformacionReporteTest);				
			this.jmenuDatosReporteTest.add(this.jMenuItemAnterioresReporteTest);				
			this.jmenuDatosReporteTest.add(this.jMenuItemSiguientesReporteTest);				
			this.jmenuDatosReporteTest.add(this.jMenuItemAbrirOrderByReporteTest);				
			this.jmenuDatosReporteTest.add(this.jMenuItemMostrarOcultarReporteTest);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesReporteTest.add(this.jMenuItemGuardarCambiosReporteTest);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarReporteTest.add(this.jmenuArchivoReporteTest);		
			this.jmenuBarReporteTest.add(this.jmenuAccionesReporteTest);		
			this.jmenuBarReporteTest.add(this.jmenuDatosReporteTest);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarReporteTest);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasReporteTest() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaReporteTestReporteTest=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaReporteTestReporteTest.setToolTipText("Buscar Por Empresa Por Modulo Por Nombre Por Ubicacion ");
		this.jButtonBusquedaReporteTestReporteTest= new JButtonMe();
		this.jButtonBusquedaReporteTestReporteTest.setText("Buscar");
		this.jButtonBusquedaReporteTestReporteTest.setToolTipText("Buscar Por Empresa Por Modulo Por Nombre Por Ubicacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaReporteTestReporteTest,"buscar_button","Buscar Por Empresa Por Modulo Por Nombre Por Ubicacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaReporteTestReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresaBusquedaReporteTestReporteTest = new JLabelMe();
		jLabelid_empresaBusquedaReporteTestReporteTest.setText("Empresa :");
		jLabelid_empresaBusquedaReporteTestReporteTest.setToolTipText("Empresa");
		jLabelid_empresaBusquedaReporteTestReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaBusquedaReporteTestReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaBusquedaReporteTestReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBusquedaReporteTestReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresaBusquedaReporteTestReporteTest= new JComboBoxMe();
		jComboBoxid_empresaBusquedaReporteTestReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBusquedaReporteTestReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBusquedaReporteTestReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBusquedaReporteTestReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_moduloBusquedaReporteTestReporteTest = new JLabelMe();
		jLabelid_moduloBusquedaReporteTestReporteTest.setText("Modulo :");
		jLabelid_moduloBusquedaReporteTestReporteTest.setToolTipText("Modulo");
		jLabelid_moduloBusquedaReporteTestReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaReporteTestReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaReporteTestReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaReporteTestReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaReporteTestReporteTest= new JComboBoxMe();
		jComboBoxid_moduloBusquedaReporteTestReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaReporteTestReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaReporteTestReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaReporteTestReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaReporteTestReporteTest = new JLabelMe();
		jLabelnombreBusquedaReporteTestReporteTest.setText("Nombre :");
		jLabelnombreBusquedaReporteTestReporteTest.setToolTipText("Nombre");
		jLabelnombreBusquedaReporteTestReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaReporteTestReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaReporteTestReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaReporteTestReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaReporteTestReporteTest= new JTextFieldMe();
		jTextFieldnombreBusquedaReporteTestReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaReporteTestReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaReporteTestReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaReporteTestReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelubicacionBusquedaReporteTestReporteTest = new JLabelMe();
		jLabelubicacionBusquedaReporteTestReporteTest.setText("Ubicacion :");
		jLabelubicacionBusquedaReporteTestReporteTest.setToolTipText("Ubicacion");
		jLabelubicacionBusquedaReporteTestReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelubicacionBusquedaReporteTestReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelubicacionBusquedaReporteTestReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelubicacionBusquedaReporteTestReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreaubicacionBusquedaReporteTestReporteTest= new JTextAreaMe();
		jTextAreaubicacionBusquedaReporteTestReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionBusquedaReporteTestReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionBusquedaReporteTestReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreaubicacionBusquedaReporteTestReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasReporteTest=new JTabbedPane();


		this.jTabbedPaneBusquedasReporteTest.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasReporteTest.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasReporteTest.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasReporteTest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleReporteTest = new ReporteTestDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Reporte Test DATOS");
			this.jInternalFrameDetalleFormReporteTest = new ReporteTestDetalleFormJInternalFrame(jDesktopPane,this.reportetestSessionBean.getConGuardarRelaciones(),this.reportetestSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormReporteTest = null;//new ReporteTestDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReporteTest= new GridBagLayout();
		
		
		this.jTableDatosReporteTest = new JTableMe();      
		
		String sToolTipReporteTest="";
		sToolTipReporteTest=ReporteTestConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReporteTest+="(Contabilidad.ReporteTest)";
		}
		
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
			sToolTipReporteTest+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosReporteTest.setToolTipText(sToolTipReporteTest);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosReporteTest);
		this.jTableDatosReporteTest.setAutoCreateRowSorter(true);
		this.jTableDatosReporteTest.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosReporteTest.setRowSelectionAllowed(true);
		this.jTableDatosReporteTest.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosReporteTest,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoReporteTest = new JButtonMe();
		this.jButtonDuplicarReporteTest = new JButtonMe();
		this.jButtonCopiarReporteTest = new JButtonMe();
		this.jButtonVerFormReporteTest = new JButtonMe();
		this.jButtonNuevoRelacionesReporteTest = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaReporteTest = new JButtonMe();
		this.jButtonCerrarReporteTest = new JButtonMe();
		
		this.jScrollPanelDatosReporteTest = new JScrollPane();   
        this.jScrollPanelDatosGeneralReporteTest = new JScrollPane();
		
				
		
		
		this.jPanelAccionesReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Reporte Test";
		
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reporte Testes" + this.sPath));
		} else {
			this.jScrollPanelDatosReporteTest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReporteTest.setToolTipText("Acciones");
        this.jPanelAccionesReporteTest.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoReporteTest=new ReporteDinamicoJInternalFrame(ReporteTestConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoReporteTest();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionReporteTest=new ImportacionJInternalFrame(ReporteTestConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionReporteTest();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByReporteTest = new JButtonMe();
		
		this.jButtonAbrirOrderByReporteTest.setText("Orden");
		this.jButtonAbrirOrderByReporteTest.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReporteTest,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReporteTest=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReporteTest,false,this);
			
			//this.cargarOrderByReporteTest(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReporteTest=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReporteTest,true,this);
			
			//this.cargarOrderByReporteTest(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosReporteTest.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosReporteTest.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosReporteTest.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosReporteTest.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosReporteTest.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosReporteTest.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoReporteTest.setText("Nuevo");
		this.jButtonDuplicarReporteTest.setText("Duplicar");
		this.jButtonCopiarReporteTest.setText("Copiar");
		this.jButtonVerFormReporteTest.setText("Ver");
		this.jButtonNuevoRelacionesReporteTest.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaReporteTest.setText("Guardar");
		this.jButtonCerrarReporteTest.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReporteTest,"nuevo_button","Nuevo",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarReporteTest,"duplicar_button","Duplicar",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarReporteTest,"copiar_button","Copiar",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormReporteTest,"ver_form","Ver",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesReporteTest,"nuevorelaciones_button","Nuevo Rel",this.reportetestSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReporteTest,"guardarcambiostabla_button","Guardar",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteTest,"cerrar_button","Salir",this.reportetestSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoReporteTest.setToolTipText("Nuevo"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarReporteTest.setToolTipText("Duplicar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarReporteTest.setToolTipText("Copiar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormReporteTest.setToolTipText("Ver"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesReporteTest.setToolTipText("Nuevo Rel"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaReporteTest.setToolTipText("Guardar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReporteTest.setToolTipText("Salir"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReporteTest";
		inputMap = this.jButtonNuevoReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReporteTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReporteTest"));
		
		//DUPLICAR
		sMapKey = "DuplicarReporteTest";
		inputMap = this.jButtonDuplicarReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarReporteTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarReporteTest"));
		
		//COPIAR
		sMapKey = "CopiarReporteTest";
		inputMap = this.jButtonCopiarReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarReporteTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarReporteTest"));
		
		//VEr FORM
		sMapKey = "VerFormReporteTest";
		inputMap = this.jButtonVerFormReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormReporteTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormReporteTest"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesReporteTest";
		inputMap = this.jButtonNuevoRelacionesReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesReporteTest"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarReporteTest";
		inputMap = this.jButtonModificarReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarReporteTest"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarReporteTest";
		inputMap = this.jButtonCerrarReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReporteTest"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReporteTest";
		inputMap = this.jButtonGuardarCambiosTablaReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReporteTest"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ReporteTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ReporteTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ReporteTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ReporteTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ReporteTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesReporteTest.setName("jPanelParametrosReportesReporteTest"); 
		
		this.jPanelParametrosReportesAccionesReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesReporteTest.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesReporteTest.setName("jPanelParametrosReportesAccionesReporteTest"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionReporteTest = new JButtonMe();
		this.jButtonRecargarInformacionReporteTest.setText("Buscar");
		this.jButtonRecargarInformacionReporteTest.setToolTipText("Buscar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionReporteTest,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionReporteTest.setVisible(false);
		
		
		this.jButtonProcesarInformacionReporteTest = new JButtonMe();
		this.jButtonProcesarInformacionReporteTest.setText("Procesar");
		this.jButtonProcesarInformacionReporteTest.setToolTipText("Procesar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionReporteTest.setVisible(false);
			
		this.jButtonProcesarInformacionReporteTest.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReporteTest.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReporteTest.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReporteTest.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesReporteTest.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReporteTest.setText("TIPO");       
		this.jComboBoxTiposReportesReporteTest.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReporteTest.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesReporteTest.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionReporteTest.setText("Paginacion");
		this.jComboBoxTiposPaginacionReporteTest.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesReporteTest.setText("Accion");
		this.jComboBoxTiposRelacionesReporteTest.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReporteTest.setText("Accion");
		this.jComboBoxTiposAccionesReporteTest.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarReporteTest.setText("Accion");
		this.jComboBoxTiposSeleccionarReporteTest.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralReporteTest=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralReporteTest.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReporteTest.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReporteTest.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesReporteTest = new JLabelMe();
		
		this.jLabelAccionesReporteTest.setText("Acciones");		
		this.jLabelAccionesReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosReporteTest = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosReporteTest.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosReporteTest.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosReporteTest = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosReporteTest.setText("Seleccionados");
		this.jCheckBoxSeleccionadosReporteTest.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaReporteTest = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaReporteTest.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaReporteTest.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteReporteTest = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteReporteTest.setText("Graf.");
		this.jCheckBoxConGraficoReporteReporteTest.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresReporteTest = new JButtonMe();
		//this.jButtonAnterioresReporteTest.setText("<<");
        this.jButtonAnterioresReporteTest.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresReporteTest,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesReporteTest = new JButtonMe();
		//this.jButtonSiguientesReporteTest.setText(">>");
        this.jButtonSiguientesReporteTest.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesReporteTest,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosReporteTest = new JButtonMe();
		this.jButtonNuevoGuardarCambiosReporteTest.setText("Nue");
        this.jButtonNuevoGuardarCambiosReporteTest.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosReporteTest,"nuevoguardarcambios_button","Nue",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosReporteTest";
		inputMap = this.jButtonNuevoGuardarCambiosReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosReporteTest"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionReporteTest";
		inputMap = this.jButtonRecargarInformacionReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionReporteTest"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesReporteTest";
		inputMap = this.jButtonSiguientesReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesReporteTest"));
		
		//ANTERIORES		
		sMapKey = "AnterioresReporteTest";
		inputMap = this.jButtonAnterioresReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresReporteTest"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasReporteTest();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesReporteTest.setMinimumSize(new Dimension(this.getWidth(),ReporteTestBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReporteTestBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReporteTest.setMaximumSize(new Dimension(this.getWidth(),ReporteTestBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReporteTestBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReporteTest.setPreferredSize(new Dimension(this.getWidth(),ReporteTestBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReporteTestBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionReporteTest = new GridBagLayout();

			this.jPanelPaginacionReporteTest.setLayout(gridaBagLayoutPaginacionReporteTest);						
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = 0;
			this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionReporteTest.add(this.jButtonAnterioresReporteTest, this.gridBagConstraintsReporteTest);
					
						
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReporteTest.gridy = 0;
			
			this.jPanelPaginacionReporteTest.add(this.jButtonNuevoGuardarCambiosReporteTest, this.gridBagConstraintsReporteTest);
						
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReporteTest.gridy = 0;
			this.jPanelPaginacionReporteTest.add(this.jButtonSiguientesReporteTest, this.gridBagConstraintsReporteTest);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = 1;
			this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReporteTest.add(this.jButtonNuevoReporteTest, this.gridBagConstraintsReporteTest);
						
			
			
			if(!this.reportetestSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsReporteTest = new GridBagConstraints();
				this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReporteTest.gridy = 1;
				this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionReporteTest.add(this.jButtonGuardarCambiosTablaReporteTest, this.gridBagConstraintsReporteTest);
			}
			
			
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = 1;
			this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReporteTest.add(this.jButtonDuplicarReporteTest, this.gridBagConstraintsReporteTest);
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = 1;
			this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReporteTest.add(this.jButtonCopiarReporteTest, this.gridBagConstraintsReporteTest);
		
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = 1;
			this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReporteTest.add(this.jButtonVerFormReporteTest, this.gridBagConstraintsReporteTest);
		
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = 1;
			this.gridBagConstraintsReporteTest.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionReporteTest.add(this.jButtonCerrarReporteTest, this.gridBagConstraintsReporteTest);
		
		
		
		this.jButtonRecargarInformacionReporteTest.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReporteTest.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReporteTest.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesReporteTest.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReporteTest.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReporteTest.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesReporteTest.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReporteTest.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReporteTest.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesReporteTest.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReporteTest.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReporteTest.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionReporteTest.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReporteTest.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReporteTest.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesReporteTest.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReporteTest.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReporteTest.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesReporteTest.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReporteTest.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReporteTest.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarReporteTest.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReporteTest.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReporteTest.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaReporteTest.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReporteTest.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReporteTest.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteReporteTest.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReporteTest.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReporteTest.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosReporteTest.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReporteTest.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReporteTest.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosReporteTest.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReporteTest.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReporteTest.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesReporteTest = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesReporteTest = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ReporteTest = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ReporteTest = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ReporteTest = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ReporteTest = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesReporteTest.setLayout(gridaBagParametrosReportesReporteTest);
			this.jPanelParametrosReportesAccionesReporteTest.setLayout(gridaBagParametrosReportesAccionesReporteTest);
			
			
			this.jPanelParametrosAuxiliar1ReporteTest.setLayout(gridaBagParametrosAuxiliar1ReporteTest);
			this.jPanelParametrosAuxiliar2ReporteTest.setLayout(gridaBagParametrosAuxiliar2ReporteTest);
			this.jPanelParametrosAuxiliar3ReporteTest.setLayout(gridaBagParametrosAuxiliar3ReporteTest);
			this.jPanelParametrosAuxiliar4ReporteTest.setLayout(gridaBagParametrosAuxiliar4ReporteTest);
			//this.jPanelParametrosAuxiliar5ReporteTest.setLayout(gridaBagParametrosAuxiliar2ReporteTest);			
			
			
			
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReporteTest.add(this.jButtonRecargarInformacionReporteTest, this.gridBagConstraintsReporteTest);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReporteTest.add(this.jComboBoxTiposPaginacionReporteTest, this.gridBagConstraintsReporteTest);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReporteTest.add(this.jCheckBoxConAltoMaximoTablaReporteTest, this.gridBagConstraintsReporteTest);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReporteTest.add(this.jComboBoxTiposArchivosReportesReporteTest, this.gridBagConstraintsReporteTest);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReporteTest.add(this.jPanelParametrosAuxiliar1ReporteTest, this.gridBagConstraintsReporteTest);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReporteTest.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ReporteTest.add(this.jComboBoxTiposReportesReporteTest, this.gridBagConstraintsReporteTest);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReporteTest.add(this.jPanelParametrosAuxiliar4ReporteTest, this.gridBagConstraintsReporteTest);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReporteTest.add(this.jComboBoxTiposReportesReporteTest, this.gridBagConstraintsReporteTest);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReporteTest.add(this.jCheckBoxGenerarReporteReporteTest, this.gridBagConstraintsReporteTest);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReporteTest.add(this.jPanelParametrosAuxiliar2ReporteTest, this.gridBagConstraintsReporteTest);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReporteTest.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReporteTest.add(this.jLabelAccionesReporteTest, this.gridBagConstraintsReporteTest);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsReporteTest = new GridBagConstraints();
				this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesReporteTest.add(this.jButtonAbrirOrderByReporteTest, this.gridBagConstraintsReporteTest);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReporteTest.add(this.jComboBoxTiposSeleccionarReporteTest, this.gridBagConstraintsReporteTest);			
			
			
			/*
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReporteTest.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReporteTest.add(this.jCheckBoxSeleccionarTodosReporteTest, this.gridBagConstraintsReporteTest);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReporteTest.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReporteTest.add(this.jCheckBoxSeleccionarTodosReporteTest, this.gridBagConstraintsReporteTest);															
				
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReporteTest.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReporteTest.add(this.jCheckBoxSeleccionadosReporteTest, this.gridBagConstraintsReporteTest);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReporteTest.add(this.jPanelParametrosAuxiliar3ReporteTest, this.gridBagConstraintsReporteTest);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReporteTest.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReporteTest.add(this.jComboBoxTiposAccionesReporteTest, this.gridBagConstraintsReporteTest);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosReporteTest = new GridBagLayout();

			this.jScrollPanelDatosReporteTest.setLayout(gridaBagLayoutDatosReporteTest);
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = 0;
			this.gridBagConstraintsReporteTest.gridx = 0;
			
			this.jScrollPanelDatosReporteTest.add(this.jTableDatosReporteTest, this.gridBagConstraintsReporteTest);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosReporteTest.setViewportView(this.jTableDatosReporteTest);
		this.jTableDatosReporteTest.setFillsViewportHeight(true);
		this.jTableDatosReporteTest.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesReporteTest= new GridBagLayout();
		this.jPanelAccionesReporteTest.setLayout(gridaBagLayoutAccionesReporteTest);
		
		
		/*	
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 0;
			
		this.jPanelAccionesReporteTest.add(this.jButtonNuevoReporteTest, this.gridBagConstraintsReporteTest);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaReporteTestReporteTest= new GridBagLayout();
		gridaBagLayoutBusquedaReporteTestReporteTest.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaReporteTestReporteTest.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaReporteTestReporteTest.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaReporteTestReporteTest.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaReporteTestReporteTest.setLayout(gridaBagLayoutBusquedaReporteTestReporteTest);

		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 0;
		gridBagConstraintsReporteTest.gridx = 0;
		jPanelBusquedaReporteTestReporteTest.add(jLabelid_empresaBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);

		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 0;
		gridBagConstraintsReporteTest.gridx = 1;
		jPanelBusquedaReporteTestReporteTest.add(jComboBoxid_empresaBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);


		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 1;
		gridBagConstraintsReporteTest.gridx = 0;
		jPanelBusquedaReporteTestReporteTest.add(jLabelid_moduloBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);

		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 1;
		gridBagConstraintsReporteTest.gridx = 1;
		jPanelBusquedaReporteTestReporteTest.add(jComboBoxid_moduloBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);


		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 2;
		gridBagConstraintsReporteTest.gridx = 0;
		jPanelBusquedaReporteTestReporteTest.add(jLabelnombreBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);

		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 2;
		gridBagConstraintsReporteTest.gridx = 1;
		jPanelBusquedaReporteTestReporteTest.add(jTextFieldnombreBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);


		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 3;
		gridBagConstraintsReporteTest.gridx = 0;
		jPanelBusquedaReporteTestReporteTest.add(jLabelubicacionBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);

		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 3;
		gridBagConstraintsReporteTest.gridx = 1;
		jPanelBusquedaReporteTestReporteTest.add(jTextAreaubicacionBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);

		gridBagConstraintsReporteTest = new GridBagConstraints();
		gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReporteTest.gridy = 4;
		gridBagConstraintsReporteTest.gridx =1;
		jPanelBusquedaReporteTestReporteTest.add(jButtonBusquedaReporteTestReporteTest, gridBagConstraintsReporteTest);

		jTabbedPaneBusquedasReporteTest.addTab("1.-Por Empresa Por Modulo Por Nombre Por Ubicacion ", jPanelBusquedaReporteTestReporteTest);
		jTabbedPaneBusquedasReporteTest.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReporteTest = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReporteTest);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReporteTest = new GridBagConstraints();						
			this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReporteTest.gridx = 0;		
			//this.gridBagConstraintsReporteTest.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReporteTest.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarReporteTest, this.gridBagConstraintsReporteTest);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;
		this.gridBagConstraintsReporteTest.gridx = 0;		
		//this.gridBagConstraintsReporteTest.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsReporteTest.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsReporteTest);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReporteTest.gridx = 0;		
			this.gridBagConstraintsReporteTest.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsReporteTest.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasReporteTest, this.gridBagConstraintsReporteTest);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesReporteTest, this.gridBagConstraintsReporteTest);								
		
		
		/*
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesReporteTest, this.gridBagConstraintsReporteTest);
		*/		
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReporteTest.gridx =0;
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReporteTest.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReporteTest, this.gridBagConstraintsReporteTest);
				
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionReporteTest, this.gridBagConstraintsReporteTest);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ReporteTestJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosReporteTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReporteTest = new GridBagLayout();
			this.jPanelBusquedasParametrosReporteTest.setLayout(gridaBagLayoutBusquedasParametrosReporteTest);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralReporteTest=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReporteTest.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReporteTest.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReporteTest.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReporteTest, this.gridBagConstraintsReporteTest);
			
			
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReporteTest, this.gridBagConstraintsReporteTest);
		
			
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReporteTest, this.gridBagConstraintsReporteTest);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralReporteTest;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoReporteTest() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoReporteTest = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoReporteTest.setName("jPanelReporteDinamicoReporteTest"); 
		
		this.jPanelReporteDinamicoReporteTest.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReporteTest.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReporteTest.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoReporteTest.setLayout(gridaBagLayoutReporteDinamicoReporteTest);
		
		
		this.jInternalFrameReporteDinamicoReporteTest= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoReporteTest = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReporteTest= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoReporteTest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoReporteTest.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoReporteTest.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoReporteTest.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoReporteTest.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoReporteTest.setResizable(true);
	    this.jInternalFrameReporteDinamicoReporteTest.setClosable(true);
	    this.jInternalFrameReporteDinamicoReporteTest.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoReporteTest.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReporteTest.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReporteTest.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reporte Testes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteReporteTest = new JLabelMe();

		this.jLabelColumnasSelectReporteReporteTest.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReporteTest.add(this.jLabelColumnasSelectReporteReporteTest, this.gridBagConstraintsReporteTest);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteReporteTest = new JList<Reporte>();
		this.jListColumnasSelectReporteReporteTest.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteReporteTest.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteReporteTest.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReporteTest.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReporteTest.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteReporteTest=new JScrollPane(this.jListColumnasSelectReporteReporteTest);
			
			this.jScrollColumnasSelectReporteReporteTest.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReporteTest.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReporteTest.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReporteTest.add(this.jListColumnasSelectReporteReporteTest, this.gridBagConstraintsReporteTest);
		this.jPanelReporteDinamicoReporteTest.add(this.jScrollColumnasSelectReporteReporteTest, this.gridBagConstraintsReporteTest);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteReporteTest = new JLabelMe();

		this.jLabelRelacionesSelectReporteReporteTest.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteReporteTest = new JList<Reporte>();
		this.jListRelacionesSelectReporteReporteTest.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteReporteTest.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteReporteTest.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReporteTest.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReporteTest.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteReporteTest=new JScrollPane(this.jListRelacionesSelectReporteReporteTest);
			
			this.jScrollRelacionesSelectReporteReporteTest.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReporteTest.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReporteTest.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoReporteTest = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoReporteTest = new JComboBoxMe();
		this.jListColumnasValoresGraficoReporteTest = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoReporteTest = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoReporteTest.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoReporteTest.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReporteTest.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReporteTest.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoReporteTest = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoReporteTest.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoReporteTest.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReporteTest.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReporteTest.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoReporteTest = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoReporteTest.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReporteTest.add(this.jLabelGenerarExcelReporteDinamicoReporteTest, this.gridBagConstraintsReporteTest);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoReporteTest = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoReporteTest.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoReporteTest,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoReporteTest.setToolTipText("Generar EXCEL"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoReporteTest.add(this.jButtonGenerarExcelReporteDinamicoReporteTest, this.gridBagConstraintsReporteTest);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReporteTest.add(this.jComboBoxTiposReportesDinamicoReporteTest, this.gridBagConstraintsReporteTest);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoReporteTest = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoReporteTest.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReporteTest.add(this.jLabelTiposArchivoReporteDinamicoReporteTest, this.gridBagConstraintsReporteTest);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReporteTest.add(this.jComboBoxTiposArchivosReportesDinamicoReporteTest, this.gridBagConstraintsReporteTest);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoReporteTest = new JButtonMe();
		this.jButtonGenerarReporteDinamicoReporteTest.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoReporteTest,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoReporteTest.setToolTipText("Generar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReporteTest.add(this.jButtonGenerarReporteDinamicoReporteTest, this.gridBagConstraintsReporteTest);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoReporteTest = new JButtonMe();
		this.jButtonCerrarReporteDinamicoReporteTest.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoReporteTest,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoReporteTest.setToolTipText("Cancelar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReporteTest.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReporteTest.add(this.jButtonCerrarReporteDinamicoReporteTest, this.gridBagConstraintsReporteTest);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalReporteTest = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoReporteTest= new JScrollPane(jPanelReporteDinamicoReporteTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoReporteTest.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReporteTest.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReporteTest.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reporte Testes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsReporteTest.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoReporteTest.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoReporteTest.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalReporteTest);
		this.jInternalFrameReporteDinamicoReporteTest.getContentPane().add(this.jScrollPanelReporteDinamicoReporteTest, this.gridBagConstraintsReporteTest);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionReporteTest() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionReporteTest = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionReporteTest.setName("jPanelImportacionReporteTest"); 
		
		this.jPanelImportacionReporteTest.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReporteTest.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReporteTest.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionReporteTest.setLayout(gridaBagLayoutImportacionReporteTest);
		
		
		this.jInternalFrameImportacionReporteTest= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionReporteTest= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionReporteTest = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReporteTest= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionReporteTest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReporteTest.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReporteTest.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionReporteTest.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReporteTest.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReporteTest.setResizable(true);
	    this.jInternalFrameImportacionReporteTest.setClosable(true);
	    this.jInternalFrameImportacionReporteTest.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionReporteTest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReporteTest.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReporteTest.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionReporteTest.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReporteTest.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReporteTest.setResizable(true);
	    this.jInternalFrameImportacionReporteTest.setClosable(true);
	    this.jInternalFrameImportacionReporteTest.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionReporteTest.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReporteTest.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReporteTest.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reporte Testes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionReporteTest = new JLabelMe();

		this.jLabelArchivoImportacionReporteTest.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYImportacion;		
		this.gridBagConstraintsReporteTest.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReporteTest.add(this.jLabelArchivoImportacionReporteTest, this.gridBagConstraintsReporteTest);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionReporteTest = new JFileChooser();		
		this.jFileChooserImportacionReporteTest.setToolTipText("ESCOGER ARCHIVO"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionReporteTest = new JButtonMe();
		this.jButtonAbrirImportacionReporteTest.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionReporteTest,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionReporteTest.setToolTipText("Generar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYImportacion;
		this.gridBagConstraintsReporteTest.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReporteTest.add(this.jButtonAbrirImportacionReporteTest, this.gridBagConstraintsReporteTest);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionReporteTest = new JLabelMe();

		this.jLabelPathArchivoImportacionReporteTest.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYImportacion;		
		this.gridBagConstraintsReporteTest.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReporteTest.add(this.jLabelPathArchivoImportacionReporteTest, this.gridBagConstraintsReporteTest);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionReporteTest=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionReporteTest.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReporteTest.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReporteTest.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYImportacion;
		this.gridBagConstraintsReporteTest.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReporteTest.add(this.jTextFieldPathArchivoImportacionReporteTest, this.gridBagConstraintsReporteTest);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionReporteTest = new JButtonMe();
		this.jButtonGenerarImportacionReporteTest.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionReporteTest,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionReporteTest.setToolTipText("Generar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYImportacion;
		this.gridBagConstraintsReporteTest.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReporteTest.add(this.jButtonGenerarImportacionReporteTest, this.gridBagConstraintsReporteTest);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionReporteTest = new JButtonMe();
		this.jButtonCerrarImportacionReporteTest.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionReporteTest,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionReporteTest.setToolTipText("Cancelar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = iPosYImportacion;
		this.gridBagConstraintsReporteTest.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReporteTest.add(this.jButtonCerrarImportacionReporteTest, this.gridBagConstraintsReporteTest);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalReporteTest = new GridBagLayout();
		
		this.jScrollPanelImportacionReporteTest= new JScrollPane(jPanelImportacionReporteTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy =iPosYImportacion;
		this.gridBagConstraintsReporteTest.gridx =iPosXImportacion;
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionReporteTest.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionReporteTest.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalReporteTest);
		this.jInternalFrameImportacionReporteTest.getContentPane().add(this.jScrollPanelImportacionReporteTest, this.gridBagConstraintsReporteTest);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByReporteTest(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByReporteTest = new JButtonMe();
			this.jButtonAbrirOrderByReporteTest.setText("Orden");
			this.jButtonAbrirOrderByReporteTest.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReporteTest,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByReporteTest";
			inputMap = this.jButtonAbrirOrderByReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByReporteTest"));
		
		
			GridBagLayout gridaBagLayoutOrderByReporteTest = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByReporteTest.setName("jPanelOrderByReporteTest"); 
			
			this.jPanelOrderByReporteTest.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReporteTest.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReporteTest.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByReporteTest.setLayout(gridaBagLayoutOrderByReporteTest);
			
			
			this.jTableDatosReporteTestOrderBy = new JTableMe();        
			this.jTableDatosReporteTestOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosReporteTestOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosReporteTestOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosReporteTestOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosReporteTestOrderBy.setViewportView(this.jTableDatosReporteTestOrderBy);
			this.jTableDatosReporteTestOrderBy.setFillsViewportHeight(true);
			this.jTableDatosReporteTestOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByReporteTest= new OrderByJInternalFrame();
			this.jInternalFrameOrderByReporteTest= new OrderByJInternalFrame();
			this.jScrollPanelOrderByReporteTest = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteReporteTest= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByReporteTest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByReporteTest.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByReporteTest.setTitle("Orden");
			this.jInternalFrameOrderByReporteTest.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByReporteTest.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByReporteTest.setResizable(true);
			this.jInternalFrameOrderByReporteTest.setClosable(true);
			this.jInternalFrameOrderByReporteTest.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByReporteTest.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReporteTest.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReporteTest.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reporte Testes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.gridy =iPosYOrderBy++;
			this.gridBagConstraintsReporteTest.gridx =iPosXOrderBy;
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsReporteTest.ipady =150;
				
			this.jPanelOrderByReporteTest.add(jScrollPanelDatosReporteTestOrderBy, this.gridBagConstraintsReporteTest);//this.jTableDatosReporteTestTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByReporteTest = new JButtonMe();
			this.jButtonCerrarOrderByReporteTest.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByReporteTest,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByReporteTest.setToolTipText("Cancelar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.gridy = iPosYOrderBy++;
			this.gridBagConstraintsReporteTest.gridx = iPosXOrderBy;
									
			this.jPanelOrderByReporteTest.add(this.jButtonCerrarOrderByReporteTest, this.gridBagConstraintsReporteTest);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalReporteTest = new GridBagLayout();
			
			this.jScrollPanelOrderByReporteTest= new JScrollPane(jPanelOrderByReporteTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.gridy =iPosYOrderBy;
			this.gridBagConstraintsReporteTest.gridx =iPosXOrderBy;
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByReporteTest.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByReporteTest.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalReporteTest);
			
			this.jInternalFrameOrderByReporteTest.getContentPane().add(this.jScrollPanelOrderByReporteTest, this.gridBagConstraintsReporteTest);			
		
		} else {
			this.jButtonAbrirOrderByReporteTest = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.reportetestSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosReporteTest.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosReporteTest.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosReporteTest.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosReporteTest.getRowHeight();//ReporteTestConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ReporteTestConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReporteTest.isSelected()) {
					iHeightTable=ReporteTestConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReporteTestConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReporteTestConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ReporteTestConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReporteTest.isSelected()) {
					iHeightTable=ReporteTestConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReporteTestConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReporteTestConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosReporteTest.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReporteTest.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReporteTest.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosReporteTest.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReporteTest.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReporteTest.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByReporteTest!=null && this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy()!=null) {
			//if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByReporteTest.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByReporteTest.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByReporteTest.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosReporteTest.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReporteTest.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReporteTest.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=reportetestLogic.getReporteTests().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=reportetests.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ReporteTest> TraerReporteTestBeans(List<ReporteTest> reportetests,ArrayList<Classe> classes)throws Exception {
		try {
			for(ReporteTest reportetest:reportetests) {
					
				if(!(ReporteTestConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ReporteTestConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					reportetest.setsDetalleGeneralEntityReporte(ReporteTestConstantesFunciones.getReporteTestDescripcion(reportetest));
										
						
					
						
					
				} else  {
							
					//reportetest.setsDetalleGeneralEntityReporte(reportetest.getsDetalleGeneralEntityReporte());
										
				}
				
				//reportetestbeans.add(reportetestbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return reportetests;
    }
	//PARA REPORTES FIN
}
