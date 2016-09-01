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

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.contabilidad.util.report.ProcesoTestConstantesFunciones;

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
public class ProcesoTestJInternalFrame extends ProcesoTestBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoTest;
	
	protected JMenuBar jmenuBarProcesoTest;
	
	protected JMenu jmenuProcesoTest;
	protected JMenu jmenuDatosProcesoTest;
	protected JMenu jmenuArchivoProcesoTest;
	protected JMenu jmenuAccionesProcesoTest;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoTest;	
	protected GridBagConstraints gridBagConstraintsProcesoTest;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoTestDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoTest;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoTest;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoTest;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public ProcesoTestSessionBean procesotestSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoTest> procesotests;		
	public List<ProcesoTest> procesotestsEliminados;	
	public List<ProcesoTest> procesotestsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoTest;		
	protected JButton jButtonAbrirOrderByProcesoTest;
	
	
	//protected JPanel jPanelOrderByProcesoTest;
	//public JScrollPane jScrollPanelOrderByProcesoTest;	
	//protected JButton jButtonCerrarOrderByProcesoTest;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoTestLogic procesotestLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoTest;
	public JScrollPane jScrollPanelDatosEdicionProcesoTest;
	public JScrollPane jScrollPanelDatosGeneralProcesoTest;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoTestOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoTest;
	//public JScrollPane jScrollPanelImportacionProcesoTest;
	
	
	
	protected JPanel jPanelAccionesProcesoTest;
	
    protected JPanel jPanelPaginacionProcesoTest;
    protected JPanel jPanelParametrosReportesProcesoTest;
	protected JPanel jPanelParametrosReportesAccionesProcesoTest;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoTest;
	protected JPanel jPanelParametrosAuxiliar2ProcesoTest;
	protected JPanel jPanelParametrosAuxiliar3ProcesoTest;
	protected JPanel jPanelParametrosAuxiliar4ProcesoTest;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoTest;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoTest;
	//protected JPanel jPanelImportacionProcesoTest;
	
	
	public JTable jTableDatosProcesoTest;
	
	
	
	//public JTable jTableDatosProcesoTestOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoTest;
	protected JButton jButtonDuplicarProcesoTest;
	protected JButton jButtonCopiarProcesoTest;
	protected JButton jButtonVerFormProcesoTest;
	protected JButton jButtonNuevoRelacionesProcesoTest;
	protected JButton jButtonModificarProcesoTest;
	
    protected JButton jButtonGuardarCambiosTablaProcesoTest;
	protected JButton jButtonCerrarProcesoTest;
	
	
	protected JButton jButtonRecargarInformacionProcesoTest;
	protected JButton jButtonProcesarInformacionProcesoTest;
	
	
	protected JButton jButtonAnterioresProcesoTest;
	protected JButton jButtonSiguientesProcesoTest;
	protected JButton jButtonNuevoGuardarCambiosProcesoTest;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoTest;
	//protected JButton jButtonCerrarReporteDinamicoProcesoTest;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoTest;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoTest;
	//protected JButton jButtonGenerarImportacionProcesoTest;
	//protected JButton jButtonCerrarImportacionProcesoTest;
	//protected JFileChooser jFileChooserImportacionProcesoTest;
	//protected File fileImportacionProcesoTest;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoTest;
	protected JButton jButtonDuplicarToolBarProcesoTest;
	protected JButton jButtonNuevoRelacionesToolBarProcesoTest;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoTest;
	protected JButton jButtonCopiarToolBarProcesoTest;
	protected JButton jButtonVerFormToolBarProcesoTest;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoTest;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoTest;
	protected JButton jButtonCerrarToolBarProcesoTest;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoTest;
	protected JButton jButtonProcesarInformacionToolBarProcesoTest;
	protected JButton jButtonAnterioresToolBarProcesoTest;
	protected JButton jButtonSiguientesToolBarProcesoTest;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoTest;
	protected JButton jButtonAbrirOrderByToolBarProcesoTest;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoTest;
	protected JMenuItem jMenuItemDuplicarProcesoTest;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoTest;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoTest;
	protected JMenuItem jMenuItemCopiarProcesoTest;
	protected JMenuItem jMenuItemVerFormProcesoTest;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoTest;
	protected JMenuItem jMenuItemCerrarProcesoTest;
	protected JMenuItem jMenuItemDetalleCerrarProcesoTest;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoTest;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoTest;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoTest;
	protected JMenuItem jMenuItemProcesarInformacionProcesoTest;
	protected JMenuItem jMenuItemAnterioresProcesoTest;
	protected JMenuItem jMenuItemSiguientesProcesoTest;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoTest;
	protected JMenuItem jMenuItemAbrirOrderByProcesoTest;
	protected JMenuItem jMenuItemMostrarOcultarProcesoTest;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoTest;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoTest;
	protected JCheckBox jCheckBoxSeleccionadosProcesoTest;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoTest;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoTest;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoTest;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoTest;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoTest;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoTest;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoTest;
	protected JTextField jTextFieldValorCampoGeneralProcesoTest;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoTest;
	//public JList<Reporte> jListColumnasSelectReporteProcesoTest;
	//public JScrollPane jScrollColumnasSelectReporteProcesoTest;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoTest;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoTest;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoTest;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoTest;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoTest;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoTest;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoTest;
	
		
	//public JLabel jLabelArchivoImportacionProcesoTest;	
	//public JLabel jLabelPathArchivoImportacionProcesoTest;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoTest;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoTest;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoTest;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoTest;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoTest;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoTest;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoTest;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoTest;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoTest;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoTest;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoTest;
	public JPanel jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	public JButton jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	
	public JPanel jPanelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	public JLabel jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	public JButton jButtonid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest= new JButtonMe();
	public JButton jButtonid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTestUpdate= new JButtonMe();
	public JButton jButtonid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTestBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	public JLabel jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	public JButton jButtonid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTestUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTestBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	public JLabel jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	public JTextField jTextFieldnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest;
	public JButton jButtonnombreBusquedaPorIdEmpresaPorIdModuloProcesoTestBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoTestJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTestJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTestJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTestJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoTest)	{
		this.jButtonRecargarInformacionProcesoTest = jButtonRecargarInformacionProcesoTest;
	}
	
	public JButton getjButtonProcesarInformacionProcesoTest() {
		return this.jButtonProcesarInformacionProcesoTest;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoTest)	{
		this.jButtonProcesarInformacionProcesoTest = jButtonProcesarInformacionProcesoTest;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoTest() {
		return this.jButtonRecargarInformacionProcesoTest;
	}
	
	
	public List<ProcesoTest> getprocesotests() {
		return this.procesotests;
	}

	public void setprocesotests(List<ProcesoTest> procesotests) {
		this.procesotests = procesotests;
	}
	
	public List<ProcesoTest> getprocesotestsAux() {
		return this.procesotestsAux;
	}

	public void setprocesotestsAux(List<ProcesoTest> procesotestsAux) {
		this.procesotestsAux = procesotestsAux;
	}
	
	public List<ProcesoTest> getprocesotestsEliminados() {
		return this.procesotestsEliminados;
	}

	public void setProcesoTestsEliminados(List<ProcesoTest> procesotestsEliminados) {
		this.procesotestsEliminados = procesotestsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoTest() {
		return jComboBoxTiposSeleccionarProcesoTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoTest(
			JComboBox jComboBoxTiposSeleccionarProcesoTest) {
		this.jComboBoxTiposSeleccionarProcesoTest = jComboBoxTiposSeleccionarProcesoTest;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoTest .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoTest() {
		return jTextFieldValorCampoGeneralProcesoTest;
	}

	public void setjTextFieldValorCampoGeneralProcesoTest(
			JTextField jTextFieldValorCampoGeneralProcesoTest) {
		this.jTextFieldValorCampoGeneralProcesoTest = jTextFieldValorCampoGeneralProcesoTest;
	}

	public void setBorderResaltarValorCampoGeneralProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoTest .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoTest() {
		return this.jCheckBoxSeleccionarTodosProcesoTest;
	}

	public void setjCheckBoxSeleccionarTodosProcesoTest(
			JCheckBox jCheckBoxSeleccionarTodosProcesoTest) {
		this.jCheckBoxSeleccionarTodosProcesoTest = jCheckBoxSeleccionarTodosProcesoTest;
	}

	public void setBorderResaltarSeleccionarTodosProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoTest .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoTest() {
		return this.jCheckBoxSeleccionadosProcesoTest;
	}

	public void setjCheckBoxSeleccionadosProcesoTest(
			JCheckBox jCheckBoxSeleccionadosProcesoTest) {
		this.jCheckBoxSeleccionadosProcesoTest = jCheckBoxSeleccionadosProcesoTest;
	}
	
	public void setBorderResaltarSeleccionadosProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoTest .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoTest() {
		return this.jComboBoxTiposArchivosReportesProcesoTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoTest(
			JComboBox jComboBoxTiposArchivosReportesProcesoTest) {
		this.jComboBoxTiposArchivosReportesProcesoTest = jComboBoxTiposArchivosReportesProcesoTest;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoTest .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoTest() {
		return this.jComboBoxTiposReportesProcesoTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoTest(
			JComboBox jComboBoxTiposReportesProcesoTest) {
		this.jComboBoxTiposReportesProcesoTest = jComboBoxTiposReportesProcesoTest;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoTest() {
	//	return jComboBoxTiposReportesDinamicoProcesoTest;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoTest(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoTest) {
	//	this.jComboBoxTiposReportesDinamicoProcesoTest = jComboBoxTiposReportesDinamicoProcesoTest;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoTest() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoTest;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoTest(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoTest) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoTest = jComboBoxTiposArchivosReportesDinamicoProcesoTest;
	//}
	
	public void setBorderResaltarTiposReportesProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoTest .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoTest() {
		return this.jComboBoxTiposGraficosReportesProcesoTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoTest(
			JComboBox jComboBoxTiposGraficosReportesProcesoTest) {
		this.jComboBoxTiposGraficosReportesProcesoTest = jComboBoxTiposGraficosReportesProcesoTest;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoTest .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoTest() {
		return this.jComboBoxTiposPaginacionProcesoTest;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoTest(
			JComboBox jComboBoxTiposPaginacionProcesoTest) {
		this.jComboBoxTiposPaginacionProcesoTest = jComboBoxTiposPaginacionProcesoTest;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoTest .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoTest() {
		return this.jComboBoxTiposRelacionesProcesoTest;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoTest() {
		return this.jComboBoxTiposAccionesProcesoTest;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoTest(
			JComboBox jComboBoxTiposRelacionesProcesoTest) {
		this.jComboBoxTiposRelacionesProcesoTest = jComboBoxTiposRelacionesProcesoTest;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoTest(
			JComboBox jComboBoxTiposAccionesProcesoTest) {
		this.jComboBoxTiposAccionesProcesoTest = jComboBoxTiposAccionesProcesoTest;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoTest .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoTest() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTest.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoTest .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoTest() {
	//	return jCheckBoxConGraficoDinamicoProcesoTest;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoTest(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoTest) {
	//	this.jCheckBoxConGraficoDinamicoProcesoTest = jCheckBoxConGraficoDinamicoProcesoTest;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoTest() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoTest.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoTest .setBorder(borderResaltar);		
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
		this.procesotestSessionBean=new ProcesoTestSessionBean();
		
		this.procesotestSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesotestSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesotestSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoTestJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoTestJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoTestJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoTestJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoTestJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Test MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoTestJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoTest= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"nuevo","nuevo","Nuevo"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"duplicar","duplicar","Duplicar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"copiar","copiar","Copiar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"ver_form","ver_form","Ver"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"recargar","recargar","Buscar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoTest,this.jTtoolBarProcesoTest,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoTest,this.jTtoolBarProcesoTest,
							"cerrar","cerrar","Salir"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoTest=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoTest;
			
				this.jButtonProcesarInformacionToolBarProcesoTest=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoTest;
				
		//protected JButton jButtonModificarToolBarProcesoTest;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoTest=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoTest=new JMenuMe("General");
		this.jmenuArchivoProcesoTest=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoTest=new JMenuMe("Acciones");
		this.jmenuDatosProcesoTest=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoTest= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoTest.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoTest,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoTest= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoTest.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoTest,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoTest= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoTest.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoTest,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoTest= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoTest.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoTest,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoTest= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoTest.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoTest,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoTest= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoTest.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoTest,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoTest= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoTest.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoTest,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoTest= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoTest.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoTest,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoTest= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoTest.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoTest,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoTest= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoTest.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoTest,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoTest= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoTest.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoTest,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoTest= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoTest.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoTest,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoTest= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoTest.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoTest,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoTest= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoTest.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoTest,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoTest= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoTest.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoTest,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoTest= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoTest.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoTest,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoTest= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoTest.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoTest,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoTest.add(this.jMenuItemCerrarProcesoTest);
			
			this.jmenuAccionesProcesoTest.add(this.jMenuItemNuevoProcesoTest);
			this.jmenuAccionesProcesoTest.add(this.jMenuItemNuevoGuardarCambiosProcesoTest);
			this.jmenuAccionesProcesoTest.add(this.jMenuItemNuevoRelacionesProcesoTest);
			this.jmenuAccionesProcesoTest.add(this.jMenuItemGuardarCambiosTablaProcesoTest);		
			this.jmenuAccionesProcesoTest.add(this.jMenuItemDuplicarProcesoTest);		
			this.jmenuAccionesProcesoTest.add(this.jMenuItemCopiarProcesoTest);		
			this.jmenuAccionesProcesoTest.add(this.jMenuItemVerFormProcesoTest);		
			
			this.jmenuDatosProcesoTest.add(this.jMenuItemRecargarInformacionProcesoTest);				
			this.jmenuDatosProcesoTest.add(this.jMenuItemAnterioresProcesoTest);				
			this.jmenuDatosProcesoTest.add(this.jMenuItemSiguientesProcesoTest);				
			this.jmenuDatosProcesoTest.add(this.jMenuItemAbrirOrderByProcesoTest);				
			this.jmenuDatosProcesoTest.add(this.jMenuItemMostrarOcultarProcesoTest);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoTest.add(this.jMenuItemGuardarCambiosProcesoTest);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoTest.add(this.jmenuArchivoProcesoTest);		
			this.jmenuBarProcesoTest.add(this.jmenuAccionesProcesoTest);		
			this.jmenuBarProcesoTest.add(this.jmenuDatosProcesoTest);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoTest);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoTest() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.setToolTipText("Buscar Por Empresa Por Modulo Por Nombre ");
		this.jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest= new JButtonMe();
		this.jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest.setText("Buscar");
		this.jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest.setToolTipText("Buscar Por Empresa Por Modulo Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest,"buscar_button","Buscar Por Empresa Por Modulo Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest = new JLabelMe();
		jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setText("Empresa :");
		jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setToolTipText("Empresa");
		jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest= new JComboBoxMe();
		jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest = new JLabelMe();
		jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest = new JLabelMe();
		jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.setText("Nombre :");
		jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.setToolTipText("Nombre");
		jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest= new JTextFieldMe();
		jTextFieldnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoTest=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoTest.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoTest.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoTest.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoTest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoTest,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoTest = new ProcesoTestDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Test DATOS");
			this.jInternalFrameDetalleFormProcesoTest = new ProcesoTestDetalleFormJInternalFrame(jDesktopPane,this.procesotestSessionBean.getConGuardarRelaciones(),this.procesotestSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoTest = null;//new ProcesoTestDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoTest= new GridBagLayout();
		
		
		this.jTableDatosProcesoTest = new JTableMe();      
		
		String sToolTipProcesoTest="";
		sToolTipProcesoTest=ProcesoTestConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoTest+="(Contabilidad.ProcesoTest)";
		}
		
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoTest+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoTest.setToolTipText(sToolTipProcesoTest);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoTest);
		this.jTableDatosProcesoTest.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoTest.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoTest.setRowSelectionAllowed(true);
		this.jTableDatosProcesoTest.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoTest,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoTest = new JButtonMe();
		this.jButtonDuplicarProcesoTest = new JButtonMe();
		this.jButtonCopiarProcesoTest = new JButtonMe();
		this.jButtonVerFormProcesoTest = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoTest = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoTest = new JButtonMe();
		this.jButtonCerrarProcesoTest = new JButtonMe();
		
		this.jScrollPanelDatosProcesoTest = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoTest = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Test";
		
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Testes" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoTest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoTest.setToolTipText("Acciones");
        this.jPanelAccionesProcesoTest.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoTest=new ReporteDinamicoJInternalFrame(ProcesoTestConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoTest();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoTest=new ImportacionJInternalFrame(ProcesoTestConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoTest();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoTest = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoTest.setText("Orden");
		this.jButtonAbrirOrderByProcesoTest.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoTest,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoTest=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoTest,false,this);
			
			//this.cargarOrderByProcesoTest(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoTest=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoTest,true,this);
			
			//this.cargarOrderByProcesoTest(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoTest.setMinimumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoTest.setMaximumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoTest.setPreferredSize(new Dimension(400,50));//230
		
		this.jScrollPanelDatosProcesoTest.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoTest.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoTest.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoTest.setText("Nuevo");
		this.jButtonDuplicarProcesoTest.setText("Duplicar");
		this.jButtonCopiarProcesoTest.setText("Copiar");
		this.jButtonVerFormProcesoTest.setText("Ver");
		this.jButtonNuevoRelacionesProcesoTest.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoTest.setText("Guardar");
		this.jButtonCerrarProcesoTest.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoTest,"nuevo_button","Nuevo",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoTest,"duplicar_button","Duplicar",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoTest,"copiar_button","Copiar",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoTest,"ver_form","Ver",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoTest,"nuevorelaciones_button","Nuevo Rel",this.procesotestSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoTest,"guardarcambiostabla_button","Guardar",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoTest,"cerrar_button","Salir",this.procesotestSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoTest.setToolTipText("Nuevo"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoTest.setToolTipText("Duplicar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoTest.setToolTipText("Copiar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoTest.setToolTipText("Ver"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoTest.setToolTipText("Nuevo Rel"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoTest.setToolTipText("Guardar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoTest.setToolTipText("Salir"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoTest";
		inputMap = this.jButtonNuevoProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoTest"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoTest";
		inputMap = this.jButtonDuplicarProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoTest"));
		
		//COPIAR
		sMapKey = "CopiarProcesoTest";
		inputMap = this.jButtonCopiarProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoTest"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoTest";
		inputMap = this.jButtonVerFormProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoTest"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoTest";
		inputMap = this.jButtonNuevoRelacionesProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoTest"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoTest";
		inputMap = this.jButtonModificarProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoTest"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoTest";
		inputMap = this.jButtonCerrarProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoTest"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoTest";
		inputMap = this.jButtonGuardarCambiosTablaProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoTest"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoTest.setName("jPanelParametrosReportesProcesoTest"); 
		
		this.jPanelParametrosReportesAccionesProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoTest.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoTest.setName("jPanelParametrosReportesAccionesProcesoTest"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoTest = new JButtonMe();
		this.jButtonRecargarInformacionProcesoTest.setText("Buscar");
		this.jButtonRecargarInformacionProcesoTest.setToolTipText("Buscar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoTest,"recargar_button","Buscar");		
		
		
		
		
		this.jButtonProcesarInformacionProcesoTest = new JButtonMe();
		this.jButtonProcesarInformacionProcesoTest.setText("Procesar");
		this.jButtonProcesarInformacionProcesoTest.setToolTipText("Procesar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoTest.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoTest.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoTest.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoTest.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoTest.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoTest.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoTest.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoTest.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoTest.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoTest.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoTest.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoTest.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoTest.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoTest.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoTest.setText("Accion");
		this.jComboBoxTiposAccionesProcesoTest.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoTest.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoTest.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoTest=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoTest.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoTest.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoTest.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoTest = new JLabelMe();
		
		this.jLabelAccionesProcesoTest.setText("Acciones");		
		this.jLabelAccionesProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoTest = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoTest.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoTest.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoTest = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoTest.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoTest.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoTest = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoTest.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoTest.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoTest = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoTest.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoTest.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoTest = new JButtonMe();
		//this.jButtonAnterioresProcesoTest.setText("<<");
        this.jButtonAnterioresProcesoTest.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoTest,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoTest = new JButtonMe();
		//this.jButtonSiguientesProcesoTest.setText(">>");
        this.jButtonSiguientesProcesoTest.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoTest,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoTest = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoTest.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoTest.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoTest,"nuevoguardarcambios_button","Nue",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoTest";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoTest"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoTest";
		inputMap = this.jButtonRecargarInformacionProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoTest"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoTest";
		inputMap = this.jButtonSiguientesProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoTest"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoTest";
		inputMap = this.jButtonAnterioresProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoTest"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoTest();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoTest.setMinimumSize(new Dimension(this.getWidth(),ProcesoTestBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoTestBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoTest.setMaximumSize(new Dimension(this.getWidth(),ProcesoTestBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoTestBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoTest.setPreferredSize(new Dimension(this.getWidth(),ProcesoTestBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoTestBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoTest = new GridBagLayout();

			this.jPanelPaginacionProcesoTest.setLayout(gridaBagLayoutPaginacionProcesoTest);						
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = 0;
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoTest.add(this.jButtonAnterioresProcesoTest, this.gridBagConstraintsProcesoTest);
					
						
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoTest.gridy = 0;
			
			this.jPanelPaginacionProcesoTest.add(this.jButtonNuevoGuardarCambiosProcesoTest, this.gridBagConstraintsProcesoTest);
						
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoTest.gridy = 0;
			this.jPanelPaginacionProcesoTest.add(this.jButtonSiguientesProcesoTest, this.gridBagConstraintsProcesoTest);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = 1;
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoTest.add(this.jButtonNuevoProcesoTest, this.gridBagConstraintsProcesoTest);
						
			
			
			if(!this.procesotestSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoTest = new GridBagConstraints();
				this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoTest.gridy = 1;
				this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoTest.add(this.jButtonGuardarCambiosTablaProcesoTest, this.gridBagConstraintsProcesoTest);
			}
			
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = 1;
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoTest.add(this.jButtonProcesarInformacionProcesoTest, this.gridBagConstraintsProcesoTest);
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = 1;
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoTest.add(this.jButtonDuplicarProcesoTest, this.gridBagConstraintsProcesoTest);
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = 1;
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoTest.add(this.jButtonCopiarProcesoTest, this.gridBagConstraintsProcesoTest);
		
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = 1;
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoTest.add(this.jButtonVerFormProcesoTest, this.gridBagConstraintsProcesoTest);
		
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = 1;
			this.gridBagConstraintsProcesoTest.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoTest.add(this.jButtonCerrarProcesoTest, this.gridBagConstraintsProcesoTest);
		
		
		
		this.jButtonRecargarInformacionProcesoTest.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoTest.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoTest.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoTest.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoTest.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoTest.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoTest.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoTest.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoTest.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoTest.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoTest.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoTest.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoTest.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoTest.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoTest.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoTest.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoTest.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoTest.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoTest.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoTest.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoTest.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoTest.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoTest.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoTest.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoTest.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoTest.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoTest.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoTest.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoTest.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoTest.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoTest.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoTest.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoTest.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoTest.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoTest.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoTest.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoTest = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoTest = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoTest = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoTest = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoTest = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoTest = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoTest.setLayout(gridaBagParametrosReportesProcesoTest);
			this.jPanelParametrosReportesAccionesProcesoTest.setLayout(gridaBagParametrosReportesAccionesProcesoTest);
			
			
			this.jPanelParametrosAuxiliar1ProcesoTest.setLayout(gridaBagParametrosAuxiliar1ProcesoTest);
			this.jPanelParametrosAuxiliar2ProcesoTest.setLayout(gridaBagParametrosAuxiliar2ProcesoTest);
			this.jPanelParametrosAuxiliar3ProcesoTest.setLayout(gridaBagParametrosAuxiliar3ProcesoTest);
			this.jPanelParametrosAuxiliar4ProcesoTest.setLayout(gridaBagParametrosAuxiliar4ProcesoTest);
			//this.jPanelParametrosAuxiliar5ProcesoTest.setLayout(gridaBagParametrosAuxiliar2ProcesoTest);			
			
			
			
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoTest.add(this.jButtonRecargarInformacionProcesoTest, this.gridBagConstraintsProcesoTest);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoTest.add(this.jComboBoxTiposPaginacionProcesoTest, this.gridBagConstraintsProcesoTest);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoTest.add(this.jCheckBoxConAltoMaximoTablaProcesoTest, this.gridBagConstraintsProcesoTest);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoTest.add(this.jComboBoxTiposArchivosReportesProcesoTest, this.gridBagConstraintsProcesoTest);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTest.add(this.jPanelParametrosAuxiliar1ProcesoTest, this.gridBagConstraintsProcesoTest);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTest.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoTest.add(this.jComboBoxTiposReportesProcesoTest, this.gridBagConstraintsProcesoTest);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTest.add(this.jPanelParametrosAuxiliar4ProcesoTest, this.gridBagConstraintsProcesoTest);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTest.add(this.jComboBoxTiposReportesProcesoTest, this.gridBagConstraintsProcesoTest);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoTest.add(this.jCheckBoxGenerarReporteProcesoTest, this.gridBagConstraintsProcesoTest);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTest.add(this.jPanelParametrosAuxiliar2ProcesoTest, this.gridBagConstraintsProcesoTest);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTest.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoTest.add(this.jLabelAccionesProcesoTest, this.gridBagConstraintsProcesoTest);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoTest.add(this.jComboBoxTiposSeleccionarProcesoTest, this.gridBagConstraintsProcesoTest);			
			
			
			/*
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTest.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoTest.add(this.jCheckBoxSeleccionarTodosProcesoTest, this.gridBagConstraintsProcesoTest);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTest.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoTest.add(this.jCheckBoxSeleccionarTodosProcesoTest, this.gridBagConstraintsProcesoTest);															
				
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTest.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoTest.add(this.jCheckBoxSeleccionadosProcesoTest, this.gridBagConstraintsProcesoTest);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTest.add(this.jPanelParametrosAuxiliar3ProcesoTest, this.gridBagConstraintsProcesoTest);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTest.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoTest.add(this.jComboBoxTiposAccionesProcesoTest, this.gridBagConstraintsProcesoTest);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoTest = new GridBagLayout();

			this.jScrollPanelDatosProcesoTest.setLayout(gridaBagLayoutDatosProcesoTest);
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = 0;
			this.gridBagConstraintsProcesoTest.gridx = 0;
			
			this.jScrollPanelDatosProcesoTest.add(this.jTableDatosProcesoTest, this.gridBagConstraintsProcesoTest);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoTest.setViewportView(this.jTableDatosProcesoTest);
		this.jTableDatosProcesoTest.setFillsViewportHeight(true);
		this.jTableDatosProcesoTest.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoTest= new GridBagLayout();
		this.jPanelAccionesProcesoTest.setLayout(gridaBagLayoutAccionesProcesoTest);
		
		
		/*	
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = 0;
		this.gridBagConstraintsProcesoTest.gridx = 0;
			
		this.jPanelAccionesProcesoTest.add(this.jButtonNuevoProcesoTest, this.gridBagConstraintsProcesoTest);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdEmpresaPorIdModuloProcesoTest= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdEmpresaPorIdModuloProcesoTest.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdEmpresaPorIdModuloProcesoTest.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdEmpresaPorIdModuloProcesoTest.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdEmpresaPorIdModuloProcesoTest.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.setLayout(gridaBagLayoutBusquedaPorIdEmpresaPorIdModuloProcesoTest);

		gridBagConstraintsProcesoTest = new GridBagConstraints();
		gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTest.gridy = 0;
		gridBagConstraintsProcesoTest.gridx = 0;
		jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.add(jLabelid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest, gridBagConstraintsProcesoTest);

		gridBagConstraintsProcesoTest = new GridBagConstraints();
		gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTest.gridy = 0;
		gridBagConstraintsProcesoTest.gridx = 1;
		jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.add(jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest, gridBagConstraintsProcesoTest);


		gridBagConstraintsProcesoTest = new GridBagConstraints();
		gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTest.gridy = 1;
		gridBagConstraintsProcesoTest.gridx = 0;
		jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.add(jLabelid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest, gridBagConstraintsProcesoTest);

		gridBagConstraintsProcesoTest = new GridBagConstraints();
		gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTest.gridy = 1;
		gridBagConstraintsProcesoTest.gridx = 1;
		jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.add(jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest, gridBagConstraintsProcesoTest);


		gridBagConstraintsProcesoTest = new GridBagConstraints();
		gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTest.gridy = 2;
		gridBagConstraintsProcesoTest.gridx = 0;
		jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.add(jLabelnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest, gridBagConstraintsProcesoTest);

		gridBagConstraintsProcesoTest = new GridBagConstraints();
		gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTest.gridy = 2;
		gridBagConstraintsProcesoTest.gridx = 1;
		jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.add(jTextFieldnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest, gridBagConstraintsProcesoTest);

		gridBagConstraintsProcesoTest = new GridBagConstraints();
		gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTest.gridy = 3;
		gridBagConstraintsProcesoTest.gridx =1;
		jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest.add(jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest, gridBagConstraintsProcesoTest);

		jTabbedPaneBusquedasProcesoTest.addTab("1.-Por Empresa Por Modulo Por Nombre ", jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest);
		jTabbedPaneBusquedasProcesoTest.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoTest = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoTest);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();						
			this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoTest.gridx = 0;		
			//this.gridBagConstraintsProcesoTest.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoTest.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoTest, this.gridBagConstraintsProcesoTest);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoTest.gridx = 0;		
		//this.gridBagConstraintsProcesoTest.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoTest.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoTest);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoTest.gridx = 0;		
			this.gridBagConstraintsProcesoTest.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoTest.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoTest, this.gridBagConstraintsProcesoTest);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoTest, this.gridBagConstraintsProcesoTest);								
		
		
		/*
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoTest, this.gridBagConstraintsProcesoTest);
		*/		
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoTest.gridx =0;
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoTest.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoTest, this.gridBagConstraintsProcesoTest);
				
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoTest, this.gridBagConstraintsProcesoTest);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoTestJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoTest= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoTest = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoTest.setLayout(gridaBagLayoutBusquedasParametrosProcesoTest);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoTest=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoTest.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoTest.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoTest.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoTest, this.gridBagConstraintsProcesoTest);
			
			
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoTest, this.gridBagConstraintsProcesoTest);
		
			
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoTest, this.gridBagConstraintsProcesoTest);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoTest.setVisible(false);
		this.jButtonAnterioresProcesoTest.setVisible(false);
		this.jButtonSiguientesProcesoTest.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoTest.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoTest.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoTest.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoTest.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoTest.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoTest.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoTest.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoTest.setVisible(false);
		this.jComboBoxTiposReportesProcesoTest.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoTest.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoTest.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoTest.setVisible(false);
		this.jComboBoxTiposAccionesProcesoTest.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoTest.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoTest.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoTest.setVisible(false);
		
		this.jPanelParametrosReportesProcesoTest.setVisible(false);
		
		
		this.jTtoolBarProcesoTest.setVisible(false);
			
		this.jMenuItemAnterioresProcesoTest.setVisible(false);
		this.jMenuItemSiguientesProcesoTest.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoTest.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoTest.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoTest.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoTest.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoTest.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoTest.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoTest.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoTest.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoTest.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoTest.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoTest;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoTest() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoTest = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoTest.setName("jPanelReporteDinamicoProcesoTest"); 
		
		this.jPanelReporteDinamicoProcesoTest.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoTest.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoTest.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoTest.setLayout(gridaBagLayoutReporteDinamicoProcesoTest);
		
		
		this.jInternalFrameReporteDinamicoProcesoTest= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoTest = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoTest= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoTest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoTest.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoTest.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoTest.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoTest.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoTest.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoTest.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoTest.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoTest.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoTest.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoTest.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Testes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoTest = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoTest.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoTest.add(this.jLabelColumnasSelectReporteProcesoTest, this.gridBagConstraintsProcesoTest);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoTest = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoTest.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoTest.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoTest.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoTest.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoTest.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoTest=new JScrollPane(this.jListColumnasSelectReporteProcesoTest);
			
			this.jScrollColumnasSelectReporteProcesoTest.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoTest.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoTest.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoTest.add(this.jListColumnasSelectReporteProcesoTest, this.gridBagConstraintsProcesoTest);
		this.jPanelReporteDinamicoProcesoTest.add(this.jScrollColumnasSelectReporteProcesoTest, this.gridBagConstraintsProcesoTest);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoTest = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoTest.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoTest = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoTest.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoTest.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoTest.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoTest.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoTest.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoTest=new JScrollPane(this.jListRelacionesSelectReporteProcesoTest);
			
			this.jScrollRelacionesSelectReporteProcesoTest.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoTest.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoTest.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoTest = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoTest = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoTest = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoTest = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoTest.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoTest.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoTest.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoTest.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTest = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTest.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTest.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTest.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTest.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoTest = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoTest.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoTest.add(this.jLabelGenerarExcelReporteDinamicoProcesoTest, this.gridBagConstraintsProcesoTest);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoTest = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoTest.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoTest,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoTest.setToolTipText("Generar EXCEL"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoTest.add(this.jButtonGenerarExcelReporteDinamicoProcesoTest, this.gridBagConstraintsProcesoTest);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoTest.add(this.jComboBoxTiposReportesDinamicoProcesoTest, this.gridBagConstraintsProcesoTest);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoTest = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoTest.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoTest.add(this.jLabelTiposArchivoReporteDinamicoProcesoTest, this.gridBagConstraintsProcesoTest);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoTest.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoTest, this.gridBagConstraintsProcesoTest);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoTest = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoTest.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoTest,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoTest.setToolTipText("Generar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoTest.add(this.jButtonGenerarReporteDinamicoProcesoTest, this.gridBagConstraintsProcesoTest);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoTest = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoTest.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoTest,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoTest.setToolTipText("Cancelar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTest.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoTest.add(this.jButtonCerrarReporteDinamicoProcesoTest, this.gridBagConstraintsProcesoTest);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoTest = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoTest= new JScrollPane(jPanelReporteDinamicoProcesoTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoTest.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoTest.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoTest.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Testes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTest.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoTest.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoTest.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoTest);
		this.jInternalFrameReporteDinamicoProcesoTest.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoTest, this.gridBagConstraintsProcesoTest);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoTest() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoTest = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoTest.setName("jPanelImportacionProcesoTest"); 
		
		this.jPanelImportacionProcesoTest.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoTest.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoTest.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoTest.setLayout(gridaBagLayoutImportacionProcesoTest);
		
		
		this.jInternalFrameImportacionProcesoTest= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoTest= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoTest = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoTest= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoTest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoTest.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoTest.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoTest.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoTest.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoTest.setResizable(true);
	    this.jInternalFrameImportacionProcesoTest.setClosable(true);
	    this.jInternalFrameImportacionProcesoTest.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoTest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoTest.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoTest.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoTest.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoTest.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoTest.setResizable(true);
	    this.jInternalFrameImportacionProcesoTest.setClosable(true);
	    this.jInternalFrameImportacionProcesoTest.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoTest.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoTest.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoTest.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Testes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoTest = new JLabelMe();

		this.jLabelArchivoImportacionProcesoTest.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoTest.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoTest.add(this.jLabelArchivoImportacionProcesoTest, this.gridBagConstraintsProcesoTest);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoTest = new JFileChooser();		
		this.jFileChooserImportacionProcesoTest.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoTest = new JButtonMe();
		this.jButtonAbrirImportacionProcesoTest.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoTest,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoTest.setToolTipText("Generar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoTest.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoTest.add(this.jButtonAbrirImportacionProcesoTest, this.gridBagConstraintsProcesoTest);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoTest = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoTest.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoTest.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoTest.add(this.jLabelPathArchivoImportacionProcesoTest, this.gridBagConstraintsProcesoTest);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoTest=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoTest.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoTest.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoTest.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoTest.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoTest.add(this.jTextFieldPathArchivoImportacionProcesoTest, this.gridBagConstraintsProcesoTest);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoTest = new JButtonMe();
		this.jButtonGenerarImportacionProcesoTest.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoTest,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoTest.setToolTipText("Generar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoTest.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoTest.add(this.jButtonGenerarImportacionProcesoTest, this.gridBagConstraintsProcesoTest);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoTest = new JButtonMe();
		this.jButtonCerrarImportacionProcesoTest.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoTest,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoTest.setToolTipText("Cancelar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoTest.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoTest.add(this.jButtonCerrarImportacionProcesoTest, this.gridBagConstraintsProcesoTest);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoTest = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoTest= new JScrollPane(jPanelImportacionProcesoTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoTest.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoTest.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoTest.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoTest);
		this.jInternalFrameImportacionProcesoTest.getContentPane().add(this.jScrollPanelImportacionProcesoTest, this.gridBagConstraintsProcesoTest);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoTest(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoTest = new JButtonMe();
			this.jButtonAbrirOrderByProcesoTest.setText("Orden");
			this.jButtonAbrirOrderByProcesoTest.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoTest,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoTest";
			inputMap = this.jButtonAbrirOrderByProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoTest"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoTest = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoTest.setName("jPanelOrderByProcesoTest"); 
			
			this.jPanelOrderByProcesoTest.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoTest.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoTest.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoTest.setLayout(gridaBagLayoutOrderByProcesoTest);
			
			
			this.jTableDatosProcesoTestOrderBy = new JTableMe();        
			this.jTableDatosProcesoTestOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoTestOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoTestOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoTestOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoTestOrderBy.setViewportView(this.jTableDatosProcesoTestOrderBy);
			this.jTableDatosProcesoTestOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoTestOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoTest= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoTest= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoTest = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoTest= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoTest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoTest.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoTest.setTitle("Orden");
			this.jInternalFrameOrderByProcesoTest.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoTest.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoTest.setResizable(true);
			this.jInternalFrameOrderByProcesoTest.setClosable(true);
			this.jInternalFrameOrderByProcesoTest.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoTest.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoTest.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoTest.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Testes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoTest.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoTest.ipady =150;
				
			this.jPanelOrderByProcesoTest.add(jScrollPanelDatosProcesoTestOrderBy, this.gridBagConstraintsProcesoTest);//this.jTableDatosProcesoTestTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoTest = new JButtonMe();
			this.jButtonCerrarOrderByProcesoTest.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoTest,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoTest.setToolTipText("Cancelar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoTest.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoTest.add(this.jButtonCerrarOrderByProcesoTest, this.gridBagConstraintsProcesoTest);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoTest = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoTest= new JScrollPane(jPanelOrderByProcesoTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoTest.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoTest.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoTest.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoTest);
			
			this.jInternalFrameOrderByProcesoTest.getContentPane().add(this.jScrollPanelOrderByProcesoTest, this.gridBagConstraintsProcesoTest);			
		
		} else {
			this.jButtonAbrirOrderByProcesoTest = new JButtonMe();
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
		//	&& this.procesotestSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoTest.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoTest.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoTest.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoTest.getRowHeight();//ProcesoTestConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoTestConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoTest.isSelected()) {
					iHeightTable=ProcesoTestConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoTestConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoTestConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoTestConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoTest.isSelected()) {
					iHeightTable=ProcesoTestConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoTestConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoTestConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoTest.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoTest.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoTest.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoTest.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoTest.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoTest.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoTest!=null && this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy()!=null) {
			//if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoTest.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoTest.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoTest.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoTest.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoTest.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoTest.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesotestLogic.getProcesoTests().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesotests.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoTest> TraerProcesoTestBeans(List<ProcesoTest> procesotests,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoTest procesotest:procesotests) {
					
				if(!(ProcesoTestConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoTestConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesotest.setsDetalleGeneralEntityReporte(ProcesoTestConstantesFunciones.getProcesoTestDescripcion(procesotest));
										
						
					
						
					
				} else  {
							
					//procesotest.setsDetalleGeneralEntityReporte(procesotest.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesotestbeans.add(procesotestbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesotests;
    }
	//PARA REPORTES FIN
}
