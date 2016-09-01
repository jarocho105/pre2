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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PeriodoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PeriodoJInternalFrame extends PeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPeriodo;
	
	protected JMenuBar jmenuBarPeriodo;
	
	protected JMenu jmenuPeriodo;
	protected JMenu jmenuDatosPeriodo;
	protected JMenu jmenuArchivoPeriodo;
	protected JMenu jmenuAccionesPeriodo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPeriodo;	
	protected GridBagConstraints gridBagConstraintsPeriodo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PeriodoDetalleFormJInternalFrame jInternalFrameDetalleFormPeriodo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPeriodo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPeriodo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected EstadoPeriodoBeanSwingJInternalFrame estadoperiodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoperiodo="";
	
	public PeriodoSessionBean periodoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public AnioSessionBean anioSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public MesSessionBean mesSessionBean;
	public EstadoPeriodoSessionBean estadoperiodoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Periodo> periodos;		
	public List<Periodo> periodosEliminados;	
	public List<Periodo> periodosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPeriodo;		
	protected JButton jButtonAbrirOrderByPeriodo;
	
	
	//protected JPanel jPanelOrderByPeriodo;
	//public JScrollPane jScrollPanelOrderByPeriodo;	
	//protected JButton jButtonCerrarOrderByPeriodo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PeriodoLogic periodoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPeriodo;
	public JScrollPane jScrollPanelDatosEdicionPeriodo;
	public JScrollPane jScrollPanelDatosGeneralPeriodo;
    
	
	
	//public JScrollPane jScrollPanelDatosPeriodoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPeriodo;
	//public JScrollPane jScrollPanelImportacionPeriodo;
	
	
	
	protected JPanel jPanelAccionesPeriodo;
	
    protected JPanel jPanelPaginacionPeriodo;
    protected JPanel jPanelParametrosReportesPeriodo;
	protected JPanel jPanelParametrosReportesAccionesPeriodo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Periodo;
	protected JPanel jPanelParametrosAuxiliar2Periodo;
	protected JPanel jPanelParametrosAuxiliar3Periodo;
	protected JPanel jPanelParametrosAuxiliar4Periodo;
	//protected JPanel jPanelParametrosAuxiliar5Periodo;
	
	
	
	//protected JPanel jPanelReporteDinamicoPeriodo;
	//protected JPanel jPanelImportacionPeriodo;
	
	
	public JTable jTableDatosPeriodo;
	
	
	
	//public JTable jTableDatosPeriodoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPeriodo;
	protected JButton jButtonDuplicarPeriodo;
	protected JButton jButtonCopiarPeriodo;
	protected JButton jButtonVerFormPeriodo;
	protected JButton jButtonNuevoRelacionesPeriodo;
	protected JButton jButtonModificarPeriodo;
	
    protected JButton jButtonGuardarCambiosTablaPeriodo;
	protected JButton jButtonCerrarPeriodo;
	
	
	protected JButton jButtonRecargarInformacionPeriodo;
	protected JButton jButtonProcesarInformacionPeriodo;
	
	
	protected JButton jButtonAnterioresPeriodo;
	protected JButton jButtonSiguientesPeriodo;
	protected JButton jButtonNuevoGuardarCambiosPeriodo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPeriodo;
	//protected JButton jButtonCerrarReporteDinamicoPeriodo;
	//protected JButton jButtonGenerarExcelReporteDinamicoPeriodo;	
	
	
	
	//protected JButton jButtonAbrirImportacionPeriodo;
	//protected JButton jButtonGenerarImportacionPeriodo;
	//protected JButton jButtonCerrarImportacionPeriodo;
	//protected JFileChooser jFileChooserImportacionPeriodo;
	//protected File fileImportacionPeriodo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPeriodo;
	protected JButton jButtonDuplicarToolBarPeriodo;
	protected JButton jButtonNuevoRelacionesToolBarPeriodo;
	
	
	public JButton jButtonGuardarCambiosToolBarPeriodo;
	protected JButton jButtonCopiarToolBarPeriodo;
	protected JButton jButtonVerFormToolBarPeriodo;
	public JButton jButtonGuardarCambiosTablaToolBarPeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarPeriodo;
	protected JButton jButtonCerrarToolBarPeriodo;
	
	protected JButton jButtonRecargarInformacionToolBarPeriodo;
	protected JButton jButtonProcesarInformacionToolBarPeriodo;
	protected JButton jButtonAnterioresToolBarPeriodo;
	protected JButton jButtonSiguientesToolBarPeriodo;
	protected JButton jButtonNuevoGuardarCambiosToolBarPeriodo;
	protected JButton jButtonAbrirOrderByToolBarPeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPeriodo;
	protected JMenuItem jMenuItemDuplicarPeriodo;
	protected JMenuItem jMenuItemNuevoRelacionesPeriodo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPeriodo;
	protected JMenuItem jMenuItemCopiarPeriodo;
	protected JMenuItem jMenuItemVerFormPeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaPeriodo;
	protected JMenuItem jMenuItemCerrarPeriodo;
	protected JMenuItem jMenuItemDetalleCerrarPeriodo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarPeriodo;
	
	protected JMenuItem jMenuItemRecargarInformacionPeriodo;
	protected JMenuItem jMenuItemProcesarInformacionPeriodo;
	protected JMenuItem jMenuItemAnterioresPeriodo;
	protected JMenuItem jMenuItemSiguientesPeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPeriodo;
	protected JMenuItem jMenuItemAbrirOrderByPeriodo;
	protected JMenuItem jMenuItemMostrarOcultarPeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPeriodo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPeriodo;
	protected JCheckBox jCheckBoxSeleccionadosPeriodo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPeriodo;
	protected JCheckBox jCheckBoxConGraficoReportePeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPeriodo;
	protected JTextField jTextFieldValorCampoGeneralPeriodo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePeriodo;
	//public JList<Reporte> jListColumnasSelectReportePeriodo;
	//public JScrollPane jScrollColumnasSelectReportePeriodo;
	
	//public JLabel jLabelRelacionesSelectReportePeriodo;
	//public JList<Reporte> jListRelacionesSelectReportePeriodo;
	//public JScrollPane jScrollRelacionesSelectReportePeriodo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPeriodo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPeriodo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPeriodo;
	//public JLabel jLabelTiposArchivoReporteDinamicoPeriodo;
	
		
	//public JLabel jLabelArchivoImportacionPeriodo;	
	//public JLabel jLabelPathArchivoImportacionPeriodo;
	//protected JTextField jTextFieldPathArchivoImportacionPeriodo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPeriodo;
	
	//public JLabel jLabelColumnaCategoriaValorPeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPeriodo;
	
	//public JLabel jLabelColumnasValoresGraficoPeriodo;
	//public JList<Reporte> jListColumnasValoresGraficoPeriodo;
	//public JScrollPane jScrollColumnasValoresGraficoPeriodo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPeriodo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPeriodo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPeriodo;
	public JPanel jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo;
	public JButton jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo;
	public JPanel jPanelFK_IdAnioPeriodo;
	public JButton jButtonFK_IdAnioPeriodo;
	
	public JPanel jPanelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo;
	public JLabel jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo;
	public JButton jButtonid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo= new JButtonMe();
	public JButton jButtonid_anioBusquedaPorIdAnioPorIdEjercicioPeriodoUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaPorIdAnioPorIdEjercicioPeriodoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo;
	public JLabel jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo;
	public JButton jButtonid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioFK_IdAnioPeriodo;
	public JLabel jLabelid_anioFK_IdAnioPeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioPeriodo;
	public JButton jButtonid_anioFK_IdAnioPeriodo= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioPeriodoUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioPeriodoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PeriodoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPeriodo)	{
		this.jButtonRecargarInformacionPeriodo = jButtonRecargarInformacionPeriodo;
	}
	
	public JButton getjButtonProcesarInformacionPeriodo() {
		return this.jButtonProcesarInformacionPeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPeriodo)	{
		this.jButtonProcesarInformacionPeriodo = jButtonProcesarInformacionPeriodo;
	}
	
	
	public JButton getjButtonRecargarInformacionPeriodo() {
		return this.jButtonRecargarInformacionPeriodo;
	}
	
	
	public List<Periodo> getperiodos() {
		return this.periodos;
	}

	public void setperiodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}
	
	public List<Periodo> getperiodosAux() {
		return this.periodosAux;
	}

	public void setperiodosAux(List<Periodo> periodosAux) {
		this.periodosAux = periodosAux;
	}
	
	public List<Periodo> getperiodosEliminados() {
		return this.periodosEliminados;
	}

	public void setPeriodosEliminados(List<Periodo> periodosEliminados) {
		this.periodosEliminados = periodosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPeriodo() {
		return jComboBoxTiposSeleccionarPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPeriodo(
			JComboBox jComboBoxTiposSeleccionarPeriodo) {
		this.jComboBoxTiposSeleccionarPeriodo = jComboBoxTiposSeleccionarPeriodo;
	}
	
	public void setBorderResaltarTiposSeleccionarPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPeriodo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPeriodo() {
		return jTextFieldValorCampoGeneralPeriodo;
	}

	public void setjTextFieldValorCampoGeneralPeriodo(
			JTextField jTextFieldValorCampoGeneralPeriodo) {
		this.jTextFieldValorCampoGeneralPeriodo = jTextFieldValorCampoGeneralPeriodo;
	}

	public void setBorderResaltarValorCampoGeneralPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPeriodo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPeriodo() {
		return this.jCheckBoxSeleccionarTodosPeriodo;
	}

	public void setjCheckBoxSeleccionarTodosPeriodo(
			JCheckBox jCheckBoxSeleccionarTodosPeriodo) {
		this.jCheckBoxSeleccionarTodosPeriodo = jCheckBoxSeleccionarTodosPeriodo;
	}

	public void setBorderResaltarSeleccionarTodosPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPeriodo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPeriodo() {
		return this.jCheckBoxSeleccionadosPeriodo;
	}

	public void setjCheckBoxSeleccionadosPeriodo(
			JCheckBox jCheckBoxSeleccionadosPeriodo) {
		this.jCheckBoxSeleccionadosPeriodo = jCheckBoxSeleccionadosPeriodo;
	}
	
	public void setBorderResaltarSeleccionadosPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPeriodo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPeriodo() {
		return this.jComboBoxTiposArchivosReportesPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPeriodo(
			JComboBox jComboBoxTiposArchivosReportesPeriodo) {
		this.jComboBoxTiposArchivosReportesPeriodo = jComboBoxTiposArchivosReportesPeriodo;
	}

	public void setBorderResaltarTiposArchivosReportesPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPeriodo() {
		return this.jComboBoxTiposReportesPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPeriodo(
			JComboBox jComboBoxTiposReportesPeriodo) {
		this.jComboBoxTiposReportesPeriodo = jComboBoxTiposReportesPeriodo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPeriodo() {
	//	return jComboBoxTiposReportesDinamicoPeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPeriodo(
	//		JComboBox jComboBoxTiposReportesDinamicoPeriodo) {
	//	this.jComboBoxTiposReportesDinamicoPeriodo = jComboBoxTiposReportesDinamicoPeriodo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPeriodo() {
	//	return jComboBoxTiposArchivosReportesDinamicoPeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPeriodo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPeriodo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPeriodo = jComboBoxTiposArchivosReportesDinamicoPeriodo;
	//}
	
	public void setBorderResaltarTiposReportesPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPeriodo() {
		return this.jComboBoxTiposGraficosReportesPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPeriodo(
			JComboBox jComboBoxTiposGraficosReportesPeriodo) {
		this.jComboBoxTiposGraficosReportesPeriodo = jComboBoxTiposGraficosReportesPeriodo;
	}
	
	public void setBorderResaltarTiposGraficosReportesPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPeriodo() {
		return this.jComboBoxTiposPaginacionPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPeriodo(
			JComboBox jComboBoxTiposPaginacionPeriodo) {
		this.jComboBoxTiposPaginacionPeriodo = jComboBoxTiposPaginacionPeriodo;
	}
	
	public void setBorderResaltarTiposPaginacionPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPeriodo() {
		return this.jComboBoxTiposRelacionesPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPeriodo() {
		return this.jComboBoxTiposAccionesPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPeriodo(
			JComboBox jComboBoxTiposRelacionesPeriodo) {
		this.jComboBoxTiposRelacionesPeriodo = jComboBoxTiposRelacionesPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPeriodo(
			JComboBox jComboBoxTiposAccionesPeriodo) {
		this.jComboBoxTiposAccionesPeriodo = jComboBoxTiposAccionesPeriodo;
	}
	
	public void setBorderResaltarTiposRelacionesPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPeriodo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPeriodo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPeriodo() {
	//	return jCheckBoxConGraficoDinamicoPeriodo;
	//}

	//public void setjCheckBoxConGraficoDinamicoPeriodo(
	//		JCheckBox jCheckBoxConGraficoDinamicoPeriodo) {
	//	this.jCheckBoxConGraficoDinamicoPeriodo = jCheckBoxConGraficoDinamicoPeriodo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPeriodo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPeriodo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPeriodo .setBorder(borderResaltar);		
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
		this.periodoSessionBean=new PeriodoSessionBean();
		
		this.periodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.periodoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PeriodoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Periodo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
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
		
		PeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPeriodo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPeriodo,this.jTtoolBarPeriodo,
							"nuevo","nuevo","Nuevo"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPeriodo,this.jTtoolBarPeriodo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPeriodo,this.jTtoolBarPeriodo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPeriodo,this.jTtoolBarPeriodo,
							"duplicar","duplicar","Duplicar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPeriodo,this.jTtoolBarPeriodo,
							"copiar","copiar","Copiar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPeriodo,this.jTtoolBarPeriodo,
							"ver_form","ver_form","Ver"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodo,this.jTtoolBarPeriodo,
							"recargar","recargar","Recargar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodo,this.jTtoolBarPeriodo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodo,this.jTtoolBarPeriodo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPeriodo,this.jTtoolBarPeriodo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPeriodo,this.jTtoolBarPeriodo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPeriodo,this.jTtoolBarPeriodo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPeriodo,this.jTtoolBarPeriodo,
							"cerrar","cerrar","Salir"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPeriodo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPeriodo;
			
				this.jButtonProcesarInformacionToolBarPeriodo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPeriodo;
				
		//protected JButton jButtonModificarToolBarPeriodo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPeriodo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPeriodo=new JMenuMe("General");
		this.jmenuArchivoPeriodo=new JMenuMe("Archivo");
		this.jmenuAccionesPeriodo=new JMenuMe("Acciones");
		this.jmenuDatosPeriodo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPeriodo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPeriodo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPeriodo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPeriodo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPeriodo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPeriodo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPeriodo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPeriodo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPeriodo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPeriodo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPeriodo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPeriodo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPeriodo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPeriodo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPeriodo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPeriodo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPeriodo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPeriodo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPeriodo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPeriodo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPeriodo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPeriodo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPeriodo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPeriodo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPeriodo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPeriodo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPeriodo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPeriodo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPeriodo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPeriodo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPeriodo.add(this.jMenuItemCerrarPeriodo);
			
			this.jmenuAccionesPeriodo.add(this.jMenuItemNuevoPeriodo);
			this.jmenuAccionesPeriodo.add(this.jMenuItemNuevoGuardarCambiosPeriodo);
			this.jmenuAccionesPeriodo.add(this.jMenuItemNuevoRelacionesPeriodo);
			this.jmenuAccionesPeriodo.add(this.jMenuItemGuardarCambiosTablaPeriodo);		
			this.jmenuAccionesPeriodo.add(this.jMenuItemDuplicarPeriodo);		
			this.jmenuAccionesPeriodo.add(this.jMenuItemCopiarPeriodo);		
			this.jmenuAccionesPeriodo.add(this.jMenuItemVerFormPeriodo);		
			
			this.jmenuDatosPeriodo.add(this.jMenuItemRecargarInformacionPeriodo);				
			this.jmenuDatosPeriodo.add(this.jMenuItemAnterioresPeriodo);				
			this.jmenuDatosPeriodo.add(this.jMenuItemSiguientesPeriodo);				
			this.jmenuDatosPeriodo.add(this.jMenuItemAbrirOrderByPeriodo);				
			this.jmenuDatosPeriodo.add(this.jMenuItemMostrarOcultarPeriodo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPeriodo.add(this.jMenuItemGuardarCambiosPeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPeriodo.add(this.jmenuArchivoPeriodo);		
			this.jmenuBarPeriodo.add(this.jmenuAccionesPeriodo);		
			this.jmenuBarPeriodo.add(this.jmenuDatosPeriodo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPeriodo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPeriodo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo.setToolTipText("Buscar Por Anio Por Ejercicio ");
		this.jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo= new JButtonMe();
		this.jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo.setText("Buscar");
		this.jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo.setToolTipText("Buscar Por Anio Por Ejercicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo,"buscar_button","Buscar Por Anio Por Ejercicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo = new JLabelMe();
		jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setText("Anio :");
		jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setToolTipText("Anio");
		jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo= new JComboBoxMe();
		jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo = new JLabelMe();
		jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdAnioPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioPeriodo.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioPeriodo= new JButtonMe();
		this.jButtonFK_IdAnioPeriodo.setText("Buscar");
		this.jButtonFK_IdAnioPeriodo.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioPeriodo,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioPeriodo = new JLabelMe();
		jLabelid_anioFK_IdAnioPeriodo.setText("Anio :");
		jLabelid_anioFK_IdAnioPeriodo.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioPeriodo= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPeriodo=new JTabbedPane();


		this.jTabbedPaneBusquedasPeriodo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPeriodo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPeriodo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePeriodo = new PeriodoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Periodo DATOS");
			this.jInternalFrameDetalleFormPeriodo = new PeriodoDetalleFormJInternalFrame(jDesktopPane,this.periodoSessionBean.getConGuardarRelaciones(),this.periodoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPeriodo = null;//new PeriodoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPeriodo= new GridBagLayout();
		
		
		this.jTableDatosPeriodo = new JTableMe();      
		
		String sToolTipPeriodo="";
		sToolTipPeriodo=PeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPeriodo+="(Contabilidad.Periodo)";
		}
		
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPeriodo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPeriodo.setToolTipText(sToolTipPeriodo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPeriodo);
		this.jTableDatosPeriodo.setAutoCreateRowSorter(true);
		this.jTableDatosPeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPeriodo.setRowSelectionAllowed(true);
		this.jTableDatosPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPeriodo = new JButtonMe();
		this.jButtonDuplicarPeriodo = new JButtonMe();
		this.jButtonCopiarPeriodo = new JButtonMe();
		this.jButtonVerFormPeriodo = new JButtonMe();
		this.jButtonNuevoRelacionesPeriodo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPeriodo = new JButtonMe();
		this.jButtonCerrarPeriodo = new JButtonMe();
		
		this.jScrollPanelDatosPeriodo = new JScrollPane();   
        this.jScrollPanelDatosGeneralPeriodo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Periodo";
		
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodos" + this.sPath));
		} else {
			this.jScrollPanelDatosPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesPeriodo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPeriodo=new ReporteDinamicoJInternalFrame(PeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPeriodo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPeriodo=new ImportacionJInternalFrame(PeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPeriodo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPeriodo = new JButtonMe();
		
		this.jButtonAbrirOrderByPeriodo.setText("Orden");
		this.jButtonAbrirOrderByPeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPeriodo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodo,false,this);
			
			//this.cargarOrderByPeriodo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodo,true,this);
			
			//this.cargarOrderByPeriodo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPeriodo.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosPeriodo.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosPeriodo.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosPeriodo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPeriodo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPeriodo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPeriodo.setText("Nuevo");
		this.jButtonDuplicarPeriodo.setText("Duplicar");
		this.jButtonCopiarPeriodo.setText("Copiar");
		this.jButtonVerFormPeriodo.setText("Ver");
		this.jButtonNuevoRelacionesPeriodo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPeriodo.setText("Guardar");
		this.jButtonCerrarPeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPeriodo,"nuevo_button","Nuevo",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPeriodo,"duplicar_button","Duplicar",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPeriodo,"copiar_button","Copiar",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPeriodo,"ver_form","Ver",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPeriodo,"nuevorelaciones_button","Nuevo Rel",this.periodoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPeriodo,"guardarcambiostabla_button","Guardar",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPeriodo,"cerrar_button","Salir",this.periodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPeriodo.setToolTipText("Nuevo"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPeriodo.setToolTipText("Duplicar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPeriodo.setToolTipText("Copiar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPeriodo.setToolTipText("Ver"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPeriodo.setToolTipText("Nuevo Rel"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPeriodo.setToolTipText("Guardar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPeriodo.setToolTipText("Salir"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPeriodo";
		inputMap = this.jButtonNuevoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPeriodo"));
		
		//DUPLICAR
		sMapKey = "DuplicarPeriodo";
		inputMap = this.jButtonDuplicarPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPeriodo"));
		
		//COPIAR
		sMapKey = "CopiarPeriodo";
		inputMap = this.jButtonCopiarPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPeriodo"));
		
		//VEr FORM
		sMapKey = "VerFormPeriodo";
		inputMap = this.jButtonVerFormPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPeriodo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPeriodo";
		inputMap = this.jButtonNuevoRelacionesPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPeriodo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPeriodo";
		inputMap = this.jButtonModificarPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPeriodo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPeriodo";
		inputMap = this.jButtonCerrarPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPeriodo";
		inputMap = this.jButtonGuardarCambiosTablaPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPeriodo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Periodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Periodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Periodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Periodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Periodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPeriodo.setName("jPanelParametrosReportesPeriodo"); 
		
		this.jPanelParametrosReportesAccionesPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPeriodo.setName("jPanelParametrosReportesAccionesPeriodo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPeriodo = new JButtonMe();
		this.jButtonRecargarInformacionPeriodo.setText("Recargar");
		this.jButtonRecargarInformacionPeriodo.setToolTipText("Recargar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPeriodo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPeriodo = new JButtonMe();
		this.jButtonProcesarInformacionPeriodo.setText("Procesar");
		this.jButtonProcesarInformacionPeriodo.setToolTipText("Procesar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPeriodo.setVisible(false);
			
		this.jButtonProcesarInformacionPeriodo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPeriodo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPeriodo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPeriodo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodo.setText("TIPO");       
		this.jComboBoxTiposReportesPeriodo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPeriodo.setText("Paginacion");
		this.jComboBoxTiposPaginacionPeriodo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPeriodo.setText("Accion");
		this.jComboBoxTiposRelacionesPeriodo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPeriodo.setText("Accion");
		this.jComboBoxTiposAccionesPeriodo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPeriodo.setText("Accion");
		this.jComboBoxTiposSeleccionarPeriodo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPeriodo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPeriodo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPeriodo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPeriodo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPeriodo = new JLabelMe();
		
		this.jLabelAccionesPeriodo.setText("Acciones");		
		this.jLabelAccionesPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPeriodo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPeriodo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPeriodo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPeriodo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPeriodo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPeriodo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPeriodo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPeriodo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPeriodo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePeriodo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePeriodo.setText("Graf.");
		this.jCheckBoxConGraficoReportePeriodo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPeriodo = new JButtonMe();
		//this.jButtonAnterioresPeriodo.setText("<<");
        this.jButtonAnterioresPeriodo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPeriodo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPeriodo = new JButtonMe();
		//this.jButtonSiguientesPeriodo.setText(">>");
        this.jButtonSiguientesPeriodo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPeriodo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPeriodo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPeriodo.setText("Nue");
        this.jButtonNuevoGuardarCambiosPeriodo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPeriodo,"nuevoguardarcambios_button","Nue",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPeriodo";
		inputMap = this.jButtonNuevoGuardarCambiosPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPeriodo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPeriodo";
		inputMap = this.jButtonRecargarInformacionPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPeriodo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPeriodo";
		inputMap = this.jButtonSiguientesPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPeriodo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPeriodo";
		inputMap = this.jButtonAnterioresPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPeriodo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPeriodo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPeriodo.setMinimumSize(new Dimension(this.getWidth(),PeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPeriodo.setMaximumSize(new Dimension(this.getWidth(),PeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPeriodo.setPreferredSize(new Dimension(this.getWidth(),PeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPeriodo = new GridBagLayout();

			this.jPanelPaginacionPeriodo.setLayout(gridaBagLayoutPaginacionPeriodo);						
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = 0;
			this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPeriodo.add(this.jButtonAnterioresPeriodo, this.gridBagConstraintsPeriodo);
					
						
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPeriodo.gridy = 0;
			
			this.jPanelPaginacionPeriodo.add(this.jButtonNuevoGuardarCambiosPeriodo, this.gridBagConstraintsPeriodo);
						
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPeriodo.gridy = 0;
			this.jPanelPaginacionPeriodo.add(this.jButtonSiguientesPeriodo, this.gridBagConstraintsPeriodo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = 1;
			this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodo.add(this.jButtonNuevoPeriodo, this.gridBagConstraintsPeriodo);
						
			
			
			if(!this.periodoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPeriodo = new GridBagConstraints();
				this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPeriodo.gridy = 1;
				this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPeriodo.add(this.jButtonGuardarCambiosTablaPeriodo, this.gridBagConstraintsPeriodo);
			}
			
			
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = 1;
			this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodo.add(this.jButtonDuplicarPeriodo, this.gridBagConstraintsPeriodo);
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = 1;
			this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodo.add(this.jButtonCopiarPeriodo, this.gridBagConstraintsPeriodo);
		
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = 1;
			this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodo.add(this.jButtonVerFormPeriodo, this.gridBagConstraintsPeriodo);
		
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = 1;
			this.gridBagConstraintsPeriodo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPeriodo.add(this.jButtonCerrarPeriodo, this.gridBagConstraintsPeriodo);
		
		
		
		this.jButtonRecargarInformacionPeriodo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPeriodo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPeriodo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPeriodo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPeriodo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPeriodo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPeriodo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPeriodo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPeriodo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePeriodo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePeriodo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePeriodo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPeriodo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPeriodo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPeriodo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPeriodo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPeriodo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPeriodo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPeriodo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Periodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Periodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Periodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Periodo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPeriodo.setLayout(gridaBagParametrosReportesPeriodo);
			this.jPanelParametrosReportesAccionesPeriodo.setLayout(gridaBagParametrosReportesAccionesPeriodo);
			
			
			this.jPanelParametrosAuxiliar1Periodo.setLayout(gridaBagParametrosAuxiliar1Periodo);
			this.jPanelParametrosAuxiliar2Periodo.setLayout(gridaBagParametrosAuxiliar2Periodo);
			this.jPanelParametrosAuxiliar3Periodo.setLayout(gridaBagParametrosAuxiliar3Periodo);
			this.jPanelParametrosAuxiliar4Periodo.setLayout(gridaBagParametrosAuxiliar4Periodo);
			//this.jPanelParametrosAuxiliar5Periodo.setLayout(gridaBagParametrosAuxiliar2Periodo);			
			
			
			
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodo.add(this.jButtonRecargarInformacionPeriodo, this.gridBagConstraintsPeriodo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Periodo.add(this.jComboBoxTiposPaginacionPeriodo, this.gridBagConstraintsPeriodo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Periodo.add(this.jCheckBoxConAltoMaximoTablaPeriodo, this.gridBagConstraintsPeriodo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Periodo.add(this.jComboBoxTiposArchivosReportesPeriodo, this.gridBagConstraintsPeriodo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodo.add(this.jPanelParametrosAuxiliar1Periodo, this.gridBagConstraintsPeriodo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Periodo.add(this.jComboBoxTiposReportesPeriodo, this.gridBagConstraintsPeriodo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodo.add(this.jPanelParametrosAuxiliar4Periodo, this.gridBagConstraintsPeriodo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodo.add(this.jComboBoxTiposReportesPeriodo, this.gridBagConstraintsPeriodo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodo.add(this.jCheckBoxGenerarReportePeriodo, this.gridBagConstraintsPeriodo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodo.add(this.jPanelParametrosAuxiliar2Periodo, this.gridBagConstraintsPeriodo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodo.add(this.jLabelAccionesPeriodo, this.gridBagConstraintsPeriodo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPeriodo = new GridBagConstraints();
				this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPeriodo.add(this.jButtonAbrirOrderByPeriodo, this.gridBagConstraintsPeriodo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodo.add(this.jComboBoxTiposSeleccionarPeriodo, this.gridBagConstraintsPeriodo);			
			
			
			/*
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodo.add(this.jCheckBoxSeleccionarTodosPeriodo, this.gridBagConstraintsPeriodo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Periodo.add(this.jCheckBoxSeleccionarTodosPeriodo, this.gridBagConstraintsPeriodo);															
				
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Periodo.add(this.jCheckBoxSeleccionadosPeriodo, this.gridBagConstraintsPeriodo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodo.add(this.jPanelParametrosAuxiliar3Periodo, this.gridBagConstraintsPeriodo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodo.add(this.jComboBoxTiposAccionesPeriodo, this.gridBagConstraintsPeriodo);
	
				
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodo.add(this.jTextFieldValorCampoGeneralPeriodo, this.gridBagConstraintsPeriodo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPeriodo = new GridBagLayout();

			this.jScrollPanelDatosPeriodo.setLayout(gridaBagLayoutDatosPeriodo);
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = 0;
			this.gridBagConstraintsPeriodo.gridx = 0;
			
			this.jScrollPanelDatosPeriodo.add(this.jTableDatosPeriodo, this.gridBagConstraintsPeriodo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPeriodo.setViewportView(this.jTableDatosPeriodo);
		this.jTableDatosPeriodo.setFillsViewportHeight(true);
		this.jTableDatosPeriodo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPeriodo= new GridBagLayout();
		this.jPanelAccionesPeriodo.setLayout(gridaBagLayoutAccionesPeriodo);
		
		
		/*	
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 0;
			
		this.jPanelAccionesPeriodo.add(this.jButtonNuevoPeriodo, this.gridBagConstraintsPeriodo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdAnioPorIdEjercicioPeriodo= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdAnioPorIdEjercicioPeriodo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdAnioPorIdEjercicioPeriodo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdAnioPorIdEjercicioPeriodo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdAnioPorIdEjercicioPeriodo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo.setLayout(gridaBagLayoutBusquedaPorIdAnioPorIdEjercicioPeriodo);

		gridBagConstraintsPeriodo = new GridBagConstraints();
		gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodo.gridy = 0;
		gridBagConstraintsPeriodo.gridx = 0;
		jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo.add(jLabelid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo, gridBagConstraintsPeriodo);

		gridBagConstraintsPeriodo = new GridBagConstraints();
		gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodo.gridy = 0;
		gridBagConstraintsPeriodo.gridx = 1;
		jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo.add(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo, gridBagConstraintsPeriodo);


		gridBagConstraintsPeriodo = new GridBagConstraints();
		gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodo.gridy = 1;
		gridBagConstraintsPeriodo.gridx = 0;
		jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo.add(jLabelid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo, gridBagConstraintsPeriodo);

		gridBagConstraintsPeriodo = new GridBagConstraints();
		gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodo.gridy = 1;
		gridBagConstraintsPeriodo.gridx = 1;
		jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo.add(jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo, gridBagConstraintsPeriodo);

		gridBagConstraintsPeriodo = new GridBagConstraints();
		gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodo.gridy = 2;
		gridBagConstraintsPeriodo.gridx =1;
		jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo.add(jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo, gridBagConstraintsPeriodo);

		jTabbedPaneBusquedasPeriodo.addTab("1.-Por Anio Por Ejercicio ", jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);
		jTabbedPaneBusquedasPeriodo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdAnioPeriodo= new GridBagLayout();
		gridaBagLayoutFK_IdAnioPeriodo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioPeriodo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioPeriodo.setLayout(gridaBagLayoutFK_IdAnioPeriodo);

		gridBagConstraintsPeriodo = new GridBagConstraints();
		gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodo.gridy = 0;
		gridBagConstraintsPeriodo.gridx = 0;
		jPanelFK_IdAnioPeriodo.add(jLabelid_anioFK_IdAnioPeriodo, gridBagConstraintsPeriodo);

		gridBagConstraintsPeriodo = new GridBagConstraints();
		gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodo.gridy = 0;
		gridBagConstraintsPeriodo.gridx = 1;
		jPanelFK_IdAnioPeriodo.add(jComboBoxid_anioFK_IdAnioPeriodo, gridBagConstraintsPeriodo);

		gridBagConstraintsPeriodo = new GridBagConstraints();
		gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodo.gridy = 1;
		gridBagConstraintsPeriodo.gridx =1;
		jPanelFK_IdAnioPeriodo.add(jButtonFK_IdAnioPeriodo, gridBagConstraintsPeriodo);

		jTabbedPaneBusquedasPeriodo.addTab("2.-Por Anio ", jPanelFK_IdAnioPeriodo);
		jTabbedPaneBusquedasPeriodo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPeriodo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.periodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPeriodo = new GridBagConstraints();						
			this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodo.gridx = 0;		
			//this.gridBagConstraintsPeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPeriodo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPeriodo, this.gridBagConstraintsPeriodo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPeriodo.gridx = 0;		
		//this.gridBagConstraintsPeriodo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPeriodo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPeriodo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodo.gridx = 0;		
			this.gridBagConstraintsPeriodo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPeriodo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPeriodo, this.gridBagConstraintsPeriodo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPeriodo, this.gridBagConstraintsPeriodo);								
		
		
		/*
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPeriodo, this.gridBagConstraintsPeriodo);
		*/		
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPeriodo.gridx =0;
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPeriodo, this.gridBagConstraintsPeriodo);
				
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPeriodo, this.gridBagConstraintsPeriodo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PeriodoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPeriodo = new GridBagLayout();
			this.jPanelBusquedasParametrosPeriodo.setLayout(gridaBagLayoutBusquedasParametrosPeriodo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPeriodo, this.gridBagConstraintsPeriodo);
			
			
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPeriodo, this.gridBagConstraintsPeriodo);
		
			
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPeriodo, this.gridBagConstraintsPeriodo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPeriodo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPeriodo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPeriodo.setName("jPanelReporteDinamicoPeriodo"); 
		
		this.jPanelReporteDinamicoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPeriodo.setLayout(gridaBagLayoutReporteDinamicoPeriodo);
		
		
		this.jInternalFrameReporteDinamicoPeriodo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPeriodo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPeriodo.setResizable(true);
	    this.jInternalFrameReporteDinamicoPeriodo.setClosable(true);
	    this.jInternalFrameReporteDinamicoPeriodo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePeriodo = new JLabelMe();

		this.jLabelColumnasSelectReportePeriodo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPeriodo.add(this.jLabelColumnasSelectReportePeriodo, this.gridBagConstraintsPeriodo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePeriodo = new JList<Reporte>();
		this.jListColumnasSelectReportePeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePeriodo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePeriodo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePeriodo=new JScrollPane(this.jListColumnasSelectReportePeriodo);
			
			this.jScrollColumnasSelectReportePeriodo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePeriodo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePeriodo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPeriodo.add(this.jListColumnasSelectReportePeriodo, this.gridBagConstraintsPeriodo);
		this.jPanelReporteDinamicoPeriodo.add(this.jScrollColumnasSelectReportePeriodo, this.gridBagConstraintsPeriodo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePeriodo = new JLabelMe();

		this.jLabelRelacionesSelectReportePeriodo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePeriodo = new JList<Reporte>();
		this.jListRelacionesSelectReportePeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePeriodo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePeriodo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePeriodo=new JScrollPane(this.jListRelacionesSelectReportePeriodo);
			
			this.jScrollRelacionesSelectReportePeriodo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePeriodo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePeriodo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPeriodo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPeriodo = new JComboBoxMe();
		this.jListColumnasValoresGraficoPeriodo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPeriodo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPeriodo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPeriodo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPeriodo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPeriodo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPeriodo.add(this.jLabelGenerarExcelReporteDinamicoPeriodo, this.gridBagConstraintsPeriodo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPeriodo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPeriodo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPeriodo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPeriodo.setToolTipText("Generar EXCEL"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPeriodo.add(this.jButtonGenerarExcelReporteDinamicoPeriodo, this.gridBagConstraintsPeriodo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodo.add(this.jComboBoxTiposReportesDinamicoPeriodo, this.gridBagConstraintsPeriodo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPeriodo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPeriodo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPeriodo.add(this.jLabelTiposArchivoReporteDinamicoPeriodo, this.gridBagConstraintsPeriodo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodo.add(this.jComboBoxTiposArchivosReportesDinamicoPeriodo, this.gridBagConstraintsPeriodo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPeriodo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPeriodo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPeriodo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPeriodo.setToolTipText("Generar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodo.add(this.jButtonGenerarReporteDinamicoPeriodo, this.gridBagConstraintsPeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPeriodo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPeriodo.setToolTipText("Cancelar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodo.add(this.jButtonCerrarReporteDinamicoPeriodo, this.gridBagConstraintsPeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPeriodo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPeriodo= new JScrollPane(jPanelReporteDinamicoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPeriodo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPeriodo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPeriodo);
		this.jInternalFrameReporteDinamicoPeriodo.getContentPane().add(this.jScrollPanelReporteDinamicoPeriodo, this.gridBagConstraintsPeriodo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPeriodo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPeriodo.setName("jPanelImportacionPeriodo"); 
		
		this.jPanelImportacionPeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPeriodo.setLayout(gridaBagLayoutImportacionPeriodo);
		
		
		this.jInternalFrameImportacionPeriodo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPeriodo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPeriodo.setResizable(true);
	    this.jInternalFrameImportacionPeriodo.setClosable(true);
	    this.jInternalFrameImportacionPeriodo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPeriodo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPeriodo.setResizable(true);
	    this.jInternalFrameImportacionPeriodo.setClosable(true);
	    this.jInternalFrameImportacionPeriodo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPeriodo = new JLabelMe();

		this.jLabelArchivoImportacionPeriodo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsPeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPeriodo.add(this.jLabelArchivoImportacionPeriodo, this.gridBagConstraintsPeriodo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPeriodo = new JFileChooser();		
		this.jFileChooserImportacionPeriodo.setToolTipText("ESCOGER ARCHIVO"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPeriodo = new JButtonMe();
		this.jButtonAbrirImportacionPeriodo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPeriodo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPeriodo.setToolTipText("Generar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodo.add(this.jButtonAbrirImportacionPeriodo, this.gridBagConstraintsPeriodo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPeriodo = new JLabelMe();

		this.jLabelPathArchivoImportacionPeriodo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsPeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPeriodo.add(this.jLabelPathArchivoImportacionPeriodo, this.gridBagConstraintsPeriodo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPeriodo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPeriodo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPeriodo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPeriodo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodo.add(this.jTextFieldPathArchivoImportacionPeriodo, this.gridBagConstraintsPeriodo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPeriodo = new JButtonMe();
		this.jButtonGenerarImportacionPeriodo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPeriodo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPeriodo.setToolTipText("Generar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodo.add(this.jButtonGenerarImportacionPeriodo, this.gridBagConstraintsPeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPeriodo = new JButtonMe();
		this.jButtonCerrarImportacionPeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPeriodo.setToolTipText("Cancelar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodo.add(this.jButtonCerrarImportacionPeriodo, this.gridBagConstraintsPeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPeriodo = new GridBagLayout();
		
		this.jScrollPanelImportacionPeriodo= new JScrollPane(jPanelImportacionPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy =iPosYImportacion;
		this.gridBagConstraintsPeriodo.gridx =iPosXImportacion;
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPeriodo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPeriodo);
		this.jInternalFrameImportacionPeriodo.getContentPane().add(this.jScrollPanelImportacionPeriodo, this.gridBagConstraintsPeriodo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPeriodo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPeriodo = new JButtonMe();
			this.jButtonAbrirOrderByPeriodo.setText("Orden");
			this.jButtonAbrirOrderByPeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPeriodo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPeriodo";
			inputMap = this.jButtonAbrirOrderByPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPeriodo"));
		
		
			GridBagLayout gridaBagLayoutOrderByPeriodo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPeriodo.setName("jPanelOrderByPeriodo"); 
			
			this.jPanelOrderByPeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPeriodo.setLayout(gridaBagLayoutOrderByPeriodo);
			
			
			this.jTableDatosPeriodoOrderBy = new JTableMe();        
			this.jTableDatosPeriodoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPeriodoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPeriodoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPeriodoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPeriodoOrderBy.setViewportView(this.jTableDatosPeriodoOrderBy);
			this.jTableDatosPeriodoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPeriodoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPeriodo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPeriodo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPeriodo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePeriodo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPeriodo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPeriodo.setTitle("Orden");
			this.jInternalFrameOrderByPeriodo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPeriodo.setResizable(true);
			this.jInternalFrameOrderByPeriodo.setClosable(true);
			this.jInternalFrameOrderByPeriodo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPeriodo.ipady =150;
				
			this.jPanelOrderByPeriodo.add(jScrollPanelDatosPeriodoOrderBy, this.gridBagConstraintsPeriodo);//this.jTableDatosPeriodoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPeriodo = new JButtonMe();
			this.jButtonCerrarOrderByPeriodo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPeriodo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPeriodo.setToolTipText("Cancelar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPeriodo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPeriodo.add(this.jButtonCerrarOrderByPeriodo, this.gridBagConstraintsPeriodo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPeriodo = new GridBagLayout();
			
			this.jScrollPanelOrderByPeriodo= new JScrollPane(jPanelOrderByPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy =iPosYOrderBy;
			this.gridBagConstraintsPeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPeriodo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPeriodo);
			
			this.jInternalFrameOrderByPeriodo.getContentPane().add(this.jScrollPanelOrderByPeriodo, this.gridBagConstraintsPeriodo);			
		
		} else {
			this.jButtonAbrirOrderByPeriodo = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.periodoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPeriodo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPeriodo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPeriodo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPeriodo.getRowHeight();//PeriodoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPeriodo.isSelected()) {
					iHeightTable=PeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPeriodo.isSelected()) {
					iHeightTable=PeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPeriodo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPeriodo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPeriodo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPeriodo!=null && this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy()!=null) {
			//if(!this.periodoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPeriodo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPeriodo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPeriodo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=periodoLogic.getPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Periodo> TraerPeriodoBeans(List<Periodo> periodos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Periodo periodo:periodos) {
					
				if(!(PeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					periodo.setsDetalleGeneralEntityReporte(PeriodoConstantesFunciones.getPeriodoDescripcion(periodo));
										
						
					
						
					
				} else  {
							
					//periodo.setsDetalleGeneralEntityReporte(periodo.getsDetalleGeneralEntityReporte());
										
				}
				
				//periodobeans.add(periodobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return periodos;
    }
	//PARA REPORTES FIN
}
