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
import com.bydan.erp.contabilidad.util.PeriodoImportExportConstantesFunciones;

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
public class PeriodoImportExportJInternalFrame extends PeriodoImportExportBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPeriodoImportExport;
	
	protected JMenuBar jmenuBarPeriodoImportExport;
	
	protected JMenu jmenuPeriodoImportExport;
	protected JMenu jmenuDatosPeriodoImportExport;
	protected JMenu jmenuArchivoPeriodoImportExport;
	protected JMenu jmenuAccionesPeriodoImportExport;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPeriodoImportExport;	
	protected GridBagConstraints gridBagConstraintsPeriodoImportExport;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PeriodoImportExportDetalleFormJInternalFrame jInternalFrameDetalleFormPeriodoImportExport;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPeriodoImportExport;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPeriodoImportExport;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PeriodoImportExportSessionBean periodoimportexportSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PeriodoImportExport> periodoimportexports;		
	public List<PeriodoImportExport> periodoimportexportsEliminados;	
	public List<PeriodoImportExport> periodoimportexportsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPeriodoImportExport;		
	protected JButton jButtonAbrirOrderByPeriodoImportExport;
	
	
	//protected JPanel jPanelOrderByPeriodoImportExport;
	//public JScrollPane jScrollPanelOrderByPeriodoImportExport;	
	//protected JButton jButtonCerrarOrderByPeriodoImportExport;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PeriodoImportExportLogic periodoimportexportLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPeriodoImportExport;
	public JScrollPane jScrollPanelDatosEdicionPeriodoImportExport;
	public JScrollPane jScrollPanelDatosGeneralPeriodoImportExport;
    
	
	
	//public JScrollPane jScrollPanelDatosPeriodoImportExportOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPeriodoImportExport;
	//public JScrollPane jScrollPanelImportacionPeriodoImportExport;
	
	
	
	protected JPanel jPanelAccionesPeriodoImportExport;
	
    protected JPanel jPanelPaginacionPeriodoImportExport;
    protected JPanel jPanelParametrosReportesPeriodoImportExport;
	protected JPanel jPanelParametrosReportesAccionesPeriodoImportExport;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PeriodoImportExport;
	protected JPanel jPanelParametrosAuxiliar2PeriodoImportExport;
	protected JPanel jPanelParametrosAuxiliar3PeriodoImportExport;
	protected JPanel jPanelParametrosAuxiliar4PeriodoImportExport;
	//protected JPanel jPanelParametrosAuxiliar5PeriodoImportExport;
	
	
	
	//protected JPanel jPanelReporteDinamicoPeriodoImportExport;
	//protected JPanel jPanelImportacionPeriodoImportExport;
	
	
	public JTable jTableDatosPeriodoImportExport;
	
	
	
	//public JTable jTableDatosPeriodoImportExportOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPeriodoImportExport;
	protected JButton jButtonDuplicarPeriodoImportExport;
	protected JButton jButtonCopiarPeriodoImportExport;
	protected JButton jButtonVerFormPeriodoImportExport;
	protected JButton jButtonNuevoRelacionesPeriodoImportExport;
	protected JButton jButtonModificarPeriodoImportExport;
	
    protected JButton jButtonGuardarCambiosTablaPeriodoImportExport;
	protected JButton jButtonCerrarPeriodoImportExport;
	
	
	protected JButton jButtonRecargarInformacionPeriodoImportExport;
	protected JButton jButtonProcesarInformacionPeriodoImportExport;
	
	
	protected JButton jButtonAnterioresPeriodoImportExport;
	protected JButton jButtonSiguientesPeriodoImportExport;
	protected JButton jButtonNuevoGuardarCambiosPeriodoImportExport;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPeriodoImportExport;
	//protected JButton jButtonCerrarReporteDinamicoPeriodoImportExport;
	//protected JButton jButtonGenerarExcelReporteDinamicoPeriodoImportExport;	
	
	
	
	//protected JButton jButtonAbrirImportacionPeriodoImportExport;
	//protected JButton jButtonGenerarImportacionPeriodoImportExport;
	//protected JButton jButtonCerrarImportacionPeriodoImportExport;
	//protected JFileChooser jFileChooserImportacionPeriodoImportExport;
	//protected File fileImportacionPeriodoImportExport;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPeriodoImportExport;
	protected JButton jButtonDuplicarToolBarPeriodoImportExport;
	protected JButton jButtonNuevoRelacionesToolBarPeriodoImportExport;
	
	
	public JButton jButtonGuardarCambiosToolBarPeriodoImportExport;
	protected JButton jButtonCopiarToolBarPeriodoImportExport;
	protected JButton jButtonVerFormToolBarPeriodoImportExport;
	public JButton jButtonGuardarCambiosTablaToolBarPeriodoImportExport;
	protected JButton jButtonMostrarOcultarTablaToolBarPeriodoImportExport;
	protected JButton jButtonCerrarToolBarPeriodoImportExport;
	
	protected JButton jButtonRecargarInformacionToolBarPeriodoImportExport;
	protected JButton jButtonProcesarInformacionToolBarPeriodoImportExport;
	protected JButton jButtonAnterioresToolBarPeriodoImportExport;
	protected JButton jButtonSiguientesToolBarPeriodoImportExport;
	protected JButton jButtonNuevoGuardarCambiosToolBarPeriodoImportExport;
	protected JButton jButtonAbrirOrderByToolBarPeriodoImportExport;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPeriodoImportExport;
	protected JMenuItem jMenuItemDuplicarPeriodoImportExport;
	protected JMenuItem jMenuItemNuevoRelacionesPeriodoImportExport;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPeriodoImportExport;
	protected JMenuItem jMenuItemCopiarPeriodoImportExport;
	protected JMenuItem jMenuItemVerFormPeriodoImportExport;
	protected JMenuItem jMenuItemGuardarCambiosTablaPeriodoImportExport;
	protected JMenuItem jMenuItemCerrarPeriodoImportExport;
	protected JMenuItem jMenuItemDetalleCerrarPeriodoImportExport;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPeriodoImportExport;
	protected JMenuItem jMenuItemDetalleMostarOcultarPeriodoImportExport;
	
	protected JMenuItem jMenuItemRecargarInformacionPeriodoImportExport;
	protected JMenuItem jMenuItemProcesarInformacionPeriodoImportExport;
	protected JMenuItem jMenuItemAnterioresPeriodoImportExport;
	protected JMenuItem jMenuItemSiguientesPeriodoImportExport;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPeriodoImportExport;
	protected JMenuItem jMenuItemAbrirOrderByPeriodoImportExport;
	protected JMenuItem jMenuItemMostrarOcultarPeriodoImportExport;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPeriodoImportExport;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPeriodoImportExport;
	protected JCheckBox jCheckBoxSeleccionadosPeriodoImportExport;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPeriodoImportExport;
	protected JCheckBox jCheckBoxConGraficoReportePeriodoImportExport;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPeriodoImportExport;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPeriodoImportExport;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPeriodoImportExport;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPeriodoImportExport;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPeriodoImportExport;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPeriodoImportExport;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPeriodoImportExport;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPeriodoImportExport;
	protected JTextField jTextFieldValorCampoGeneralPeriodoImportExport;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePeriodoImportExport;
	//public JList<Reporte> jListColumnasSelectReportePeriodoImportExport;
	//public JScrollPane jScrollColumnasSelectReportePeriodoImportExport;
	
	//public JLabel jLabelRelacionesSelectReportePeriodoImportExport;
	//public JList<Reporte> jListRelacionesSelectReportePeriodoImportExport;
	//public JScrollPane jScrollRelacionesSelectReportePeriodoImportExport;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPeriodoImportExport;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPeriodoImportExport;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPeriodoImportExport;
	//public JLabel jLabelTiposArchivoReporteDinamicoPeriodoImportExport;
	
		
	//public JLabel jLabelArchivoImportacionPeriodoImportExport;	
	//public JLabel jLabelPathArchivoImportacionPeriodoImportExport;
	//protected JTextField jTextFieldPathArchivoImportacionPeriodoImportExport;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPeriodoImportExport;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPeriodoImportExport;
	
	//public JLabel jLabelColumnaCategoriaValorPeriodoImportExport;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPeriodoImportExport;
	
	//public JLabel jLabelColumnasValoresGraficoPeriodoImportExport;
	//public JList<Reporte> jListColumnasValoresGraficoPeriodoImportExport;
	//public JScrollPane jScrollColumnasValoresGraficoPeriodoImportExport;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPeriodoImportExport;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPeriodoImportExport;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPeriodoImportExport;
	public JPanel jPanelBusquedaPorCodigoPeriodoImportExport;
	public JButton jButtonBusquedaPorCodigoPeriodoImportExport;
	public JPanel jPanelFK_IdAnioPeriodoImportExport;
	public JButton jButtonFK_IdAnioPeriodoImportExport;
	
	public JPanel jPanelcodigoBusquedaPorCodigoPeriodoImportExport;
	public JLabel jLabelcodigoBusquedaPorCodigoPeriodoImportExport;
	public JTextField jTextFieldcodigoBusquedaPorCodigoPeriodoImportExport;
	public JButton jButtoncodigoBusquedaPorCodigoPeriodoImportExportBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioFK_IdAnioPeriodoImportExport;
	public JLabel jLabelid_anioFK_IdAnioPeriodoImportExport;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioPeriodoImportExport;
	public JButton jButtonid_anioFK_IdAnioPeriodoImportExport= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioPeriodoImportExportUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioPeriodoImportExportBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PeriodoImportExportJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoImportExportJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoImportExportJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoImportExportJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPeriodoImportExport)	{
		this.jButtonRecargarInformacionPeriodoImportExport = jButtonRecargarInformacionPeriodoImportExport;
	}
	
	public JButton getjButtonProcesarInformacionPeriodoImportExport() {
		return this.jButtonProcesarInformacionPeriodoImportExport;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPeriodoImportExport)	{
		this.jButtonProcesarInformacionPeriodoImportExport = jButtonProcesarInformacionPeriodoImportExport;
	}
	
	
	public JButton getjButtonRecargarInformacionPeriodoImportExport() {
		return this.jButtonRecargarInformacionPeriodoImportExport;
	}
	
	
	public List<PeriodoImportExport> getperiodoimportexports() {
		return this.periodoimportexports;
	}

	public void setperiodoimportexports(List<PeriodoImportExport> periodoimportexports) {
		this.periodoimportexports = periodoimportexports;
	}
	
	public List<PeriodoImportExport> getperiodoimportexportsAux() {
		return this.periodoimportexportsAux;
	}

	public void setperiodoimportexportsAux(List<PeriodoImportExport> periodoimportexportsAux) {
		this.periodoimportexportsAux = periodoimportexportsAux;
	}
	
	public List<PeriodoImportExport> getperiodoimportexportsEliminados() {
		return this.periodoimportexportsEliminados;
	}

	public void setPeriodoImportExportsEliminados(List<PeriodoImportExport> periodoimportexportsEliminados) {
		this.periodoimportexportsEliminados = periodoimportexportsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPeriodoImportExport() {
		return jComboBoxTiposSeleccionarPeriodoImportExport;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPeriodoImportExport(
			JComboBox jComboBoxTiposSeleccionarPeriodoImportExport) {
		this.jComboBoxTiposSeleccionarPeriodoImportExport = jComboBoxTiposSeleccionarPeriodoImportExport;
	}
	
	public void setBorderResaltarTiposSeleccionarPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPeriodoImportExport() {
		return jTextFieldValorCampoGeneralPeriodoImportExport;
	}

	public void setjTextFieldValorCampoGeneralPeriodoImportExport(
			JTextField jTextFieldValorCampoGeneralPeriodoImportExport) {
		this.jTextFieldValorCampoGeneralPeriodoImportExport = jTextFieldValorCampoGeneralPeriodoImportExport;
	}

	public void setBorderResaltarValorCampoGeneralPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPeriodoImportExport .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPeriodoImportExport() {
		return this.jCheckBoxSeleccionarTodosPeriodoImportExport;
	}

	public void setjCheckBoxSeleccionarTodosPeriodoImportExport(
			JCheckBox jCheckBoxSeleccionarTodosPeriodoImportExport) {
		this.jCheckBoxSeleccionarTodosPeriodoImportExport = jCheckBoxSeleccionarTodosPeriodoImportExport;
	}

	public void setBorderResaltarSeleccionarTodosPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPeriodoImportExport() {
		return this.jCheckBoxSeleccionadosPeriodoImportExport;
	}

	public void setjCheckBoxSeleccionadosPeriodoImportExport(
			JCheckBox jCheckBoxSeleccionadosPeriodoImportExport) {
		this.jCheckBoxSeleccionadosPeriodoImportExport = jCheckBoxSeleccionadosPeriodoImportExport;
	}
	
	public void setBorderResaltarSeleccionadosPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPeriodoImportExport() {
		return this.jComboBoxTiposArchivosReportesPeriodoImportExport;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPeriodoImportExport(
			JComboBox jComboBoxTiposArchivosReportesPeriodoImportExport) {
		this.jComboBoxTiposArchivosReportesPeriodoImportExport = jComboBoxTiposArchivosReportesPeriodoImportExport;
	}

	public void setBorderResaltarTiposArchivosReportesPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPeriodoImportExport() {
		return this.jComboBoxTiposReportesPeriodoImportExport;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPeriodoImportExport(
			JComboBox jComboBoxTiposReportesPeriodoImportExport) {
		this.jComboBoxTiposReportesPeriodoImportExport = jComboBoxTiposReportesPeriodoImportExport;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPeriodoImportExport() {
	//	return jComboBoxTiposReportesDinamicoPeriodoImportExport;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPeriodoImportExport(
	//		JComboBox jComboBoxTiposReportesDinamicoPeriodoImportExport) {
	//	this.jComboBoxTiposReportesDinamicoPeriodoImportExport = jComboBoxTiposReportesDinamicoPeriodoImportExport;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPeriodoImportExport() {
	//	return jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPeriodoImportExport(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport = jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport;
	//}
	
	public void setBorderResaltarTiposReportesPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPeriodoImportExport() {
		return this.jComboBoxTiposGraficosReportesPeriodoImportExport;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPeriodoImportExport(
			JComboBox jComboBoxTiposGraficosReportesPeriodoImportExport) {
		this.jComboBoxTiposGraficosReportesPeriodoImportExport = jComboBoxTiposGraficosReportesPeriodoImportExport;
	}
	
	public void setBorderResaltarTiposGraficosReportesPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPeriodoImportExport() {
		return this.jComboBoxTiposPaginacionPeriodoImportExport;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPeriodoImportExport(
			JComboBox jComboBoxTiposPaginacionPeriodoImportExport) {
		this.jComboBoxTiposPaginacionPeriodoImportExport = jComboBoxTiposPaginacionPeriodoImportExport;
	}
	
	public void setBorderResaltarTiposPaginacionPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPeriodoImportExport() {
		return this.jComboBoxTiposRelacionesPeriodoImportExport;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPeriodoImportExport() {
		return this.jComboBoxTiposAccionesPeriodoImportExport;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPeriodoImportExport(
			JComboBox jComboBoxTiposRelacionesPeriodoImportExport) {
		this.jComboBoxTiposRelacionesPeriodoImportExport = jComboBoxTiposRelacionesPeriodoImportExport;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPeriodoImportExport(
			JComboBox jComboBoxTiposAccionesPeriodoImportExport) {
		this.jComboBoxTiposAccionesPeriodoImportExport = jComboBoxTiposAccionesPeriodoImportExport;
	}
	
	public void setBorderResaltarTiposRelacionesPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPeriodoImportExport() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPeriodoImportExport .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPeriodoImportExport() {
	//	return jCheckBoxConGraficoDinamicoPeriodoImportExport;
	//}

	//public void setjCheckBoxConGraficoDinamicoPeriodoImportExport(
	//		JCheckBox jCheckBoxConGraficoDinamicoPeriodoImportExport) {
	//	this.jCheckBoxConGraficoDinamicoPeriodoImportExport = jCheckBoxConGraficoDinamicoPeriodoImportExport;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPeriodoImportExport() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPeriodoImportExport.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPeriodoImportExport .setBorder(borderResaltar);		
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
		this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
		
		this.periodoimportexportSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoimportexportSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.periodoimportexportSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PeriodoImportExportJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PeriodoImportExportJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PeriodoImportExportJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PeriodoImportExportJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PeriodoImportExportJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Periodo Importar Exportar MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
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
		
		PeriodoImportExportJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPeriodoImportExport= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"nuevo","nuevo","Nuevo"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"duplicar","duplicar","Duplicar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"copiar","copiar","Copiar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"ver_form","ver_form","Ver"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"recargar","recargar","Recargar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPeriodoImportExport,this.jTtoolBarPeriodoImportExport,
							"cerrar","cerrar","Salir"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPeriodoImportExport=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPeriodoImportExport;
			
				this.jButtonProcesarInformacionToolBarPeriodoImportExport=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPeriodoImportExport;
				
		//protected JButton jButtonModificarToolBarPeriodoImportExport;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPeriodoImportExport=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPeriodoImportExport=new JMenuMe("General");
		this.jmenuArchivoPeriodoImportExport=new JMenuMe("Archivo");
		this.jmenuAccionesPeriodoImportExport=new JMenuMe("Acciones");
		this.jmenuDatosPeriodoImportExport=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPeriodoImportExport= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPeriodoImportExport.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPeriodoImportExport,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPeriodoImportExport= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPeriodoImportExport.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPeriodoImportExport,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPeriodoImportExport= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPeriodoImportExport.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPeriodoImportExport,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPeriodoImportExport= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPeriodoImportExport.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPeriodoImportExport,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPeriodoImportExport= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPeriodoImportExport.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPeriodoImportExport,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPeriodoImportExport= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPeriodoImportExport.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPeriodoImportExport,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPeriodoImportExport= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPeriodoImportExport.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPeriodoImportExport,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPeriodoImportExport= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPeriodoImportExport.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPeriodoImportExport,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPeriodoImportExport= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPeriodoImportExport.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPeriodoImportExport,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPeriodoImportExport= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPeriodoImportExport.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPeriodoImportExport,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPeriodoImportExport= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPeriodoImportExport.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPeriodoImportExport,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPeriodoImportExport= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPeriodoImportExport.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPeriodoImportExport,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPeriodoImportExport= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPeriodoImportExport.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPeriodoImportExport,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPeriodoImportExport= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPeriodoImportExport.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPeriodoImportExport,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPeriodoImportExport= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPeriodoImportExport.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPeriodoImportExport,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPeriodoImportExport= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPeriodoImportExport.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPeriodoImportExport,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPeriodoImportExport= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPeriodoImportExport.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPeriodoImportExport,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPeriodoImportExport.add(this.jMenuItemCerrarPeriodoImportExport);
			
			this.jmenuAccionesPeriodoImportExport.add(this.jMenuItemNuevoPeriodoImportExport);
			this.jmenuAccionesPeriodoImportExport.add(this.jMenuItemNuevoGuardarCambiosPeriodoImportExport);
			this.jmenuAccionesPeriodoImportExport.add(this.jMenuItemNuevoRelacionesPeriodoImportExport);
			this.jmenuAccionesPeriodoImportExport.add(this.jMenuItemGuardarCambiosTablaPeriodoImportExport);		
			this.jmenuAccionesPeriodoImportExport.add(this.jMenuItemDuplicarPeriodoImportExport);		
			this.jmenuAccionesPeriodoImportExport.add(this.jMenuItemCopiarPeriodoImportExport);		
			this.jmenuAccionesPeriodoImportExport.add(this.jMenuItemVerFormPeriodoImportExport);		
			
			this.jmenuDatosPeriodoImportExport.add(this.jMenuItemRecargarInformacionPeriodoImportExport);				
			this.jmenuDatosPeriodoImportExport.add(this.jMenuItemAnterioresPeriodoImportExport);				
			this.jmenuDatosPeriodoImportExport.add(this.jMenuItemSiguientesPeriodoImportExport);				
			this.jmenuDatosPeriodoImportExport.add(this.jMenuItemAbrirOrderByPeriodoImportExport);				
			this.jmenuDatosPeriodoImportExport.add(this.jMenuItemMostrarOcultarPeriodoImportExport);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPeriodoImportExport.add(this.jMenuItemGuardarCambiosPeriodoImportExport);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPeriodoImportExport.add(this.jmenuArchivoPeriodoImportExport);		
			this.jmenuBarPeriodoImportExport.add(this.jmenuAccionesPeriodoImportExport);		
			this.jmenuBarPeriodoImportExport.add(this.jmenuDatosPeriodoImportExport);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPeriodoImportExport);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPeriodoImportExport() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoPeriodoImportExport=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoPeriodoImportExport.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoPeriodoImportExport= new JButtonMe();
		this.jButtonBusquedaPorCodigoPeriodoImportExport.setText("Buscar");
		this.jButtonBusquedaPorCodigoPeriodoImportExport.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoPeriodoImportExport,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoPeriodoImportExport = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoPeriodoImportExport.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoPeriodoImportExport.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoPeriodoImportExport= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdAnioPeriodoImportExport=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioPeriodoImportExport.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioPeriodoImportExport= new JButtonMe();
		this.jButtonFK_IdAnioPeriodoImportExport.setText("Buscar");
		this.jButtonFK_IdAnioPeriodoImportExport.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioPeriodoImportExport,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioPeriodoImportExport = new JLabelMe();
		jLabelid_anioFK_IdAnioPeriodoImportExport.setText("Anio :");
		jLabelid_anioFK_IdAnioPeriodoImportExport.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioPeriodoImportExport= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPeriodoImportExport=new JTabbedPane();


		this.jTabbedPaneBusquedasPeriodoImportExport.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPeriodoImportExport.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPeriodoImportExport.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPeriodoImportExport.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePeriodoImportExport = new PeriodoImportExportDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Periodo Importar Exportar DATOS");
			this.jInternalFrameDetalleFormPeriodoImportExport = new PeriodoImportExportDetalleFormJInternalFrame(jDesktopPane,this.periodoimportexportSessionBean.getConGuardarRelaciones(),this.periodoimportexportSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPeriodoImportExport = null;//new PeriodoImportExportDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPeriodoImportExport= new GridBagLayout();
		
		
		this.jTableDatosPeriodoImportExport = new JTableMe();      
		
		String sToolTipPeriodoImportExport="";
		sToolTipPeriodoImportExport=PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPeriodoImportExport+="(Contabilidad.PeriodoImportExport)";
		}
		
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			sToolTipPeriodoImportExport+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPeriodoImportExport.setToolTipText(sToolTipPeriodoImportExport);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPeriodoImportExport);
		this.jTableDatosPeriodoImportExport.setAutoCreateRowSorter(true);
		this.jTableDatosPeriodoImportExport.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPeriodoImportExport.setRowSelectionAllowed(true);
		this.jTableDatosPeriodoImportExport.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPeriodoImportExport = new JButtonMe();
		this.jButtonDuplicarPeriodoImportExport = new JButtonMe();
		this.jButtonCopiarPeriodoImportExport = new JButtonMe();
		this.jButtonVerFormPeriodoImportExport = new JButtonMe();
		this.jButtonNuevoRelacionesPeriodoImportExport = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPeriodoImportExport = new JButtonMe();
		this.jButtonCerrarPeriodoImportExport = new JButtonMe();
		
		this.jScrollPanelDatosPeriodoImportExport = new JScrollPane();   
        this.jScrollPanelDatosGeneralPeriodoImportExport = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Periodo Importar Exportar";
		
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Importar Exportars" + this.sPath));
		} else {
			this.jScrollPanelDatosPeriodoImportExport.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPeriodoImportExport.setToolTipText("Acciones");
        this.jPanelAccionesPeriodoImportExport.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPeriodoImportExport=new ReporteDinamicoJInternalFrame(PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPeriodoImportExport();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPeriodoImportExport=new ImportacionJInternalFrame(PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPeriodoImportExport();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPeriodoImportExport = new JButtonMe();
		
		this.jButtonAbrirOrderByPeriodoImportExport.setText("Orden");
		this.jButtonAbrirOrderByPeriodoImportExport.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPeriodoImportExport,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPeriodoImportExport=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoImportExport,false,this);
			
			//this.cargarOrderByPeriodoImportExport(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPeriodoImportExport=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoImportExport,true,this);
			
			//this.cargarOrderByPeriodoImportExport(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPeriodoImportExport.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosPeriodoImportExport.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosPeriodoImportExport.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosPeriodoImportExport.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPeriodoImportExport.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPeriodoImportExport.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPeriodoImportExport.setText("Nuevo");
		this.jButtonDuplicarPeriodoImportExport.setText("Duplicar");
		this.jButtonCopiarPeriodoImportExport.setText("Copiar");
		this.jButtonVerFormPeriodoImportExport.setText("Ver");
		this.jButtonNuevoRelacionesPeriodoImportExport.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPeriodoImportExport.setText("Guardar");
		this.jButtonCerrarPeriodoImportExport.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPeriodoImportExport,"nuevo_button","Nuevo",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPeriodoImportExport,"duplicar_button","Duplicar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPeriodoImportExport,"copiar_button","Copiar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPeriodoImportExport,"ver_form","Ver",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPeriodoImportExport,"nuevorelaciones_button","Nuevo Rel",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPeriodoImportExport,"guardarcambiostabla_button","Guardar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPeriodoImportExport,"cerrar_button","Salir",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPeriodoImportExport.setToolTipText("Nuevo"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPeriodoImportExport.setToolTipText("Duplicar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPeriodoImportExport.setToolTipText("Copiar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPeriodoImportExport.setToolTipText("Ver"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPeriodoImportExport.setToolTipText("Nuevo Rel"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPeriodoImportExport.setToolTipText("Guardar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPeriodoImportExport.setToolTipText("Salir"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPeriodoImportExport";
		inputMap = this.jButtonNuevoPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPeriodoImportExport.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPeriodoImportExport"));
		
		//DUPLICAR
		sMapKey = "DuplicarPeriodoImportExport";
		inputMap = this.jButtonDuplicarPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPeriodoImportExport.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPeriodoImportExport"));
		
		//COPIAR
		sMapKey = "CopiarPeriodoImportExport";
		inputMap = this.jButtonCopiarPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPeriodoImportExport.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPeriodoImportExport"));
		
		//VEr FORM
		sMapKey = "VerFormPeriodoImportExport";
		inputMap = this.jButtonVerFormPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPeriodoImportExport.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPeriodoImportExport"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPeriodoImportExport";
		inputMap = this.jButtonNuevoRelacionesPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPeriodoImportExport"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPeriodoImportExport";
		inputMap = this.jButtonModificarPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPeriodoImportExport"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPeriodoImportExport";
		inputMap = this.jButtonCerrarPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPeriodoImportExport"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPeriodoImportExport";
		inputMap = this.jButtonGuardarCambiosTablaPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPeriodoImportExport"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PeriodoImportExport= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PeriodoImportExport= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PeriodoImportExport= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PeriodoImportExport= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PeriodoImportExport= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPeriodoImportExport.setName("jPanelParametrosReportesPeriodoImportExport"); 
		
		this.jPanelParametrosReportesAccionesPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPeriodoImportExport.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPeriodoImportExport.setName("jPanelParametrosReportesAccionesPeriodoImportExport"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPeriodoImportExport = new JButtonMe();
		this.jButtonRecargarInformacionPeriodoImportExport.setText("Recargar");
		this.jButtonRecargarInformacionPeriodoImportExport.setToolTipText("Recargar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPeriodoImportExport,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPeriodoImportExport = new JButtonMe();
		this.jButtonProcesarInformacionPeriodoImportExport.setText("Procesar");
		this.jButtonProcesarInformacionPeriodoImportExport.setToolTipText("Procesar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPeriodoImportExport.setVisible(false);
			
		this.jButtonProcesarInformacionPeriodoImportExport.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPeriodoImportExport.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPeriodoImportExport.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoImportExport.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPeriodoImportExport.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoImportExport.setText("TIPO");       
		this.jComboBoxTiposReportesPeriodoImportExport.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoImportExport.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPeriodoImportExport.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPeriodoImportExport.setText("Paginacion");
		this.jComboBoxTiposPaginacionPeriodoImportExport.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPeriodoImportExport.setText("Accion");
		this.jComboBoxTiposRelacionesPeriodoImportExport.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPeriodoImportExport.setText("Accion");
		this.jComboBoxTiposAccionesPeriodoImportExport.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPeriodoImportExport.setText("Accion");
		this.jComboBoxTiposSeleccionarPeriodoImportExport.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPeriodoImportExport=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPeriodoImportExport.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPeriodoImportExport.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPeriodoImportExport.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPeriodoImportExport = new JLabelMe();
		
		this.jLabelAccionesPeriodoImportExport.setText("Acciones");		
		this.jLabelAccionesPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPeriodoImportExport = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPeriodoImportExport.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPeriodoImportExport.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPeriodoImportExport = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPeriodoImportExport.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPeriodoImportExport.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPeriodoImportExport = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPeriodoImportExport.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPeriodoImportExport.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePeriodoImportExport = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePeriodoImportExport.setText("Graf.");
		this.jCheckBoxConGraficoReportePeriodoImportExport.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPeriodoImportExport = new JButtonMe();
		//this.jButtonAnterioresPeriodoImportExport.setText("<<");
        this.jButtonAnterioresPeriodoImportExport.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPeriodoImportExport,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPeriodoImportExport = new JButtonMe();
		//this.jButtonSiguientesPeriodoImportExport.setText(">>");
        this.jButtonSiguientesPeriodoImportExport.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPeriodoImportExport,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPeriodoImportExport = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPeriodoImportExport.setText("Nue");
        this.jButtonNuevoGuardarCambiosPeriodoImportExport.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPeriodoImportExport,"nuevoguardarcambios_button","Nue",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPeriodoImportExport";
		inputMap = this.jButtonNuevoGuardarCambiosPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPeriodoImportExport"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPeriodoImportExport";
		inputMap = this.jButtonRecargarInformacionPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPeriodoImportExport"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPeriodoImportExport";
		inputMap = this.jButtonSiguientesPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPeriodoImportExport"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPeriodoImportExport";
		inputMap = this.jButtonAnterioresPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPeriodoImportExport"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPeriodoImportExport();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPeriodoImportExport.setMinimumSize(new Dimension(this.getWidth(),PeriodoImportExportBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoImportExportBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPeriodoImportExport.setMaximumSize(new Dimension(this.getWidth(),PeriodoImportExportBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoImportExportBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPeriodoImportExport.setPreferredSize(new Dimension(this.getWidth(),PeriodoImportExportBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoImportExportBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPeriodoImportExport = new GridBagLayout();

			this.jPanelPaginacionPeriodoImportExport.setLayout(gridaBagLayoutPaginacionPeriodoImportExport);						
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = 0;
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPeriodoImportExport.add(this.jButtonAnterioresPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
					
						
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPeriodoImportExport.gridy = 0;
			
			this.jPanelPaginacionPeriodoImportExport.add(this.jButtonNuevoGuardarCambiosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
						
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPeriodoImportExport.gridy = 0;
			this.jPanelPaginacionPeriodoImportExport.add(this.jButtonSiguientesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = 1;
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoImportExport.add(this.jButtonNuevoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
						
			
			
			if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
				this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPeriodoImportExport.gridy = 1;
				this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPeriodoImportExport.add(this.jButtonGuardarCambiosTablaPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			}
			
			
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = 1;
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoImportExport.add(this.jButtonDuplicarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = 1;
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoImportExport.add(this.jButtonCopiarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = 1;
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoImportExport.add(this.jButtonVerFormPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = 1;
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPeriodoImportExport.add(this.jButtonCerrarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
		
		
		this.jButtonRecargarInformacionPeriodoImportExport.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPeriodoImportExport.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPeriodoImportExport.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPeriodoImportExport.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPeriodoImportExport.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPeriodoImportExport.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPeriodoImportExport.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPeriodoImportExport.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPeriodoImportExport.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPeriodoImportExport.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPeriodoImportExport.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPeriodoImportExport.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPeriodoImportExport.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPeriodoImportExport.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPeriodoImportExport.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPeriodoImportExport.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPeriodoImportExport.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPeriodoImportExport.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPeriodoImportExport.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoImportExport.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoImportExport.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPeriodoImportExport.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPeriodoImportExport.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPeriodoImportExport.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPeriodoImportExport.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPeriodoImportExport.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPeriodoImportExport.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePeriodoImportExport.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePeriodoImportExport.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePeriodoImportExport.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPeriodoImportExport.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPeriodoImportExport.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPeriodoImportExport.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPeriodoImportExport.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPeriodoImportExport.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPeriodoImportExport.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPeriodoImportExport = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPeriodoImportExport = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PeriodoImportExport = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PeriodoImportExport = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PeriodoImportExport = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PeriodoImportExport = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPeriodoImportExport.setLayout(gridaBagParametrosReportesPeriodoImportExport);
			this.jPanelParametrosReportesAccionesPeriodoImportExport.setLayout(gridaBagParametrosReportesAccionesPeriodoImportExport);
			
			
			this.jPanelParametrosAuxiliar1PeriodoImportExport.setLayout(gridaBagParametrosAuxiliar1PeriodoImportExport);
			this.jPanelParametrosAuxiliar2PeriodoImportExport.setLayout(gridaBagParametrosAuxiliar2PeriodoImportExport);
			this.jPanelParametrosAuxiliar3PeriodoImportExport.setLayout(gridaBagParametrosAuxiliar3PeriodoImportExport);
			this.jPanelParametrosAuxiliar4PeriodoImportExport.setLayout(gridaBagParametrosAuxiliar4PeriodoImportExport);
			//this.jPanelParametrosAuxiliar5PeriodoImportExport.setLayout(gridaBagParametrosAuxiliar2PeriodoImportExport);			
			
			
			
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jButtonRecargarInformacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoImportExport.add(this.jComboBoxTiposPaginacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoImportExport.add(this.jCheckBoxConAltoMaximoTablaPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoImportExport.add(this.jComboBoxTiposArchivosReportesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jPanelParametrosAuxiliar1PeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoImportExport.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PeriodoImportExport.add(this.jComboBoxTiposReportesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jPanelParametrosAuxiliar4PeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jComboBoxTiposReportesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jCheckBoxGenerarReportePeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jPanelParametrosAuxiliar2PeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoImportExport.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jLabelAccionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
				this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPeriodoImportExport.add(this.jButtonAbrirOrderByPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jComboBoxTiposSeleccionarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
			
			
			/*
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoImportExport.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jCheckBoxSeleccionarTodosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoImportExport.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PeriodoImportExport.add(this.jCheckBoxSeleccionarTodosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);															
				
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoImportExport.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PeriodoImportExport.add(this.jCheckBoxSeleccionadosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jPanelParametrosAuxiliar3PeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jComboBoxTiposRelacionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
				
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jComboBoxTiposAccionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
	
				
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoImportExport.add(this.jTextFieldValorCampoGeneralPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPeriodoImportExport = new GridBagLayout();

			this.jScrollPanelDatosPeriodoImportExport.setLayout(gridaBagLayoutDatosPeriodoImportExport);
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = 0;
			this.gridBagConstraintsPeriodoImportExport.gridx = 0;
			
			this.jScrollPanelDatosPeriodoImportExport.add(this.jTableDatosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPeriodoImportExport.setViewportView(this.jTableDatosPeriodoImportExport);
		this.jTableDatosPeriodoImportExport.setFillsViewportHeight(true);
		this.jTableDatosPeriodoImportExport.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPeriodoImportExport= new GridBagLayout();
		this.jPanelAccionesPeriodoImportExport.setLayout(gridaBagLayoutAccionesPeriodoImportExport);
		
		
		/*	
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;
			
		this.jPanelAccionesPeriodoImportExport.add(this.jButtonNuevoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoPeriodoImportExport= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoPeriodoImportExport.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPeriodoImportExport.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPeriodoImportExport.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoPeriodoImportExport.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoPeriodoImportExport.setLayout(gridaBagLayoutBusquedaPorCodigoPeriodoImportExport);

		gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoImportExport.gridy = 0;
		gridBagConstraintsPeriodoImportExport.gridx = 0;
		jPanelBusquedaPorCodigoPeriodoImportExport.add(jLabelcodigoBusquedaPorCodigoPeriodoImportExport, gridBagConstraintsPeriodoImportExport);

		gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoImportExport.gridy = 0;
		gridBagConstraintsPeriodoImportExport.gridx = 1;
		jPanelBusquedaPorCodigoPeriodoImportExport.add(jTextFieldcodigoBusquedaPorCodigoPeriodoImportExport, gridBagConstraintsPeriodoImportExport);

		gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoImportExport.gridy = 1;
		gridBagConstraintsPeriodoImportExport.gridx =1;
		jPanelBusquedaPorCodigoPeriodoImportExport.add(jButtonBusquedaPorCodigoPeriodoImportExport, gridBagConstraintsPeriodoImportExport);

		jTabbedPaneBusquedasPeriodoImportExport.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoPeriodoImportExport);
		jTabbedPaneBusquedasPeriodoImportExport.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdAnioPeriodoImportExport= new GridBagLayout();
		gridaBagLayoutFK_IdAnioPeriodoImportExport.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodoImportExport.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodoImportExport.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioPeriodoImportExport.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioPeriodoImportExport.setLayout(gridaBagLayoutFK_IdAnioPeriodoImportExport);

		gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoImportExport.gridy = 0;
		gridBagConstraintsPeriodoImportExport.gridx = 0;
		jPanelFK_IdAnioPeriodoImportExport.add(jLabelid_anioFK_IdAnioPeriodoImportExport, gridBagConstraintsPeriodoImportExport);

		gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoImportExport.gridy = 0;
		gridBagConstraintsPeriodoImportExport.gridx = 1;
		jPanelFK_IdAnioPeriodoImportExport.add(jComboBoxid_anioFK_IdAnioPeriodoImportExport, gridBagConstraintsPeriodoImportExport);

		gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoImportExport.gridy = 1;
		gridBagConstraintsPeriodoImportExport.gridx =1;
		jPanelFK_IdAnioPeriodoImportExport.add(jButtonFK_IdAnioPeriodoImportExport, gridBagConstraintsPeriodoImportExport);

		jTabbedPaneBusquedasPeriodoImportExport.addTab("2.-Por Anio ", jPanelFK_IdAnioPeriodoImportExport);
		jTabbedPaneBusquedasPeriodoImportExport.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPeriodoImportExport = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPeriodoImportExport);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();						
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodoImportExport.gridx = 0;		
			//this.gridBagConstraintsPeriodoImportExport.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPeriodoImportExport.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;		
		//this.gridBagConstraintsPeriodoImportExport.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPeriodoImportExport.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPeriodoImportExport);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodoImportExport.gridx = 0;		
			this.gridBagConstraintsPeriodoImportExport.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPeriodoImportExport.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);								
		
		
		/*
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		*/		
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPeriodoImportExport.gridx =0;
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPeriodoImportExport.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
				
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPeriodoImportExport= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPeriodoImportExport = new GridBagLayout();
			this.jPanelBusquedasParametrosPeriodoImportExport.setLayout(gridaBagLayoutBusquedasParametrosPeriodoImportExport);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPeriodoImportExport=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPeriodoImportExport.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoImportExport.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoImportExport.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			
			
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
			
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPeriodoImportExport;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPeriodoImportExport() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPeriodoImportExport = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPeriodoImportExport.setName("jPanelReporteDinamicoPeriodoImportExport"); 
		
		this.jPanelReporteDinamicoPeriodoImportExport.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPeriodoImportExport.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPeriodoImportExport.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPeriodoImportExport.setLayout(gridaBagLayoutReporteDinamicoPeriodoImportExport);
		
		
		this.jInternalFrameReporteDinamicoPeriodoImportExport= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPeriodoImportExport = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePeriodoImportExport= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPeriodoImportExport.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPeriodoImportExport.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPeriodoImportExport.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPeriodoImportExport.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPeriodoImportExport.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPeriodoImportExport.setResizable(true);
	    this.jInternalFrameReporteDinamicoPeriodoImportExport.setClosable(true);
	    this.jInternalFrameReporteDinamicoPeriodoImportExport.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPeriodoImportExport.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPeriodoImportExport.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPeriodoImportExport.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Importar Exportars"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePeriodoImportExport = new JLabelMe();

		this.jLabelColumnasSelectReportePeriodoImportExport.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPeriodoImportExport.add(this.jLabelColumnasSelectReportePeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePeriodoImportExport = new JList<Reporte>();
		this.jListColumnasSelectReportePeriodoImportExport.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePeriodoImportExport.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePeriodoImportExport.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePeriodoImportExport.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePeriodoImportExport.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePeriodoImportExport=new JScrollPane(this.jListColumnasSelectReportePeriodoImportExport);
			
			this.jScrollColumnasSelectReportePeriodoImportExport.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePeriodoImportExport.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePeriodoImportExport.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPeriodoImportExport.add(this.jListColumnasSelectReportePeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		this.jPanelReporteDinamicoPeriodoImportExport.add(this.jScrollColumnasSelectReportePeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePeriodoImportExport = new JLabelMe();

		this.jLabelRelacionesSelectReportePeriodoImportExport.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePeriodoImportExport = new JList<Reporte>();
		this.jListRelacionesSelectReportePeriodoImportExport.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePeriodoImportExport.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePeriodoImportExport.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePeriodoImportExport.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePeriodoImportExport.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePeriodoImportExport=new JScrollPane(this.jListRelacionesSelectReportePeriodoImportExport);
			
			this.jScrollRelacionesSelectReportePeriodoImportExport.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePeriodoImportExport.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePeriodoImportExport.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPeriodoImportExport = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPeriodoImportExport = new JComboBoxMe();
		this.jListColumnasValoresGraficoPeriodoImportExport = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPeriodoImportExport = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPeriodoImportExport.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPeriodoImportExport.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPeriodoImportExport.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPeriodoImportExport.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPeriodoImportExport = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPeriodoImportExport.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPeriodoImportExport.add(this.jLabelGenerarExcelReporteDinamicoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPeriodoImportExport = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPeriodoImportExport.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPeriodoImportExport,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPeriodoImportExport.setToolTipText("Generar EXCEL"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPeriodoImportExport.add(this.jButtonGenerarExcelReporteDinamicoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoImportExport.add(this.jComboBoxTiposReportesDinamicoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPeriodoImportExport = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPeriodoImportExport.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPeriodoImportExport.add(this.jLabelTiposArchivoReporteDinamicoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoImportExport.add(this.jComboBoxTiposArchivosReportesDinamicoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPeriodoImportExport = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPeriodoImportExport.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPeriodoImportExport,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPeriodoImportExport.setToolTipText("Generar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoImportExport.add(this.jButtonGenerarReporteDinamicoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPeriodoImportExport = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPeriodoImportExport.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPeriodoImportExport,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPeriodoImportExport.setToolTipText("Cancelar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoImportExport.add(this.jButtonCerrarReporteDinamicoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPeriodoImportExport = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPeriodoImportExport= new JScrollPane(jPanelReporteDinamicoPeriodoImportExport,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPeriodoImportExport.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPeriodoImportExport.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPeriodoImportExport.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Importar Exportars"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoImportExport.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPeriodoImportExport.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPeriodoImportExport.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPeriodoImportExport);
		this.jInternalFrameReporteDinamicoPeriodoImportExport.getContentPane().add(this.jScrollPanelReporteDinamicoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPeriodoImportExport() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPeriodoImportExport = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPeriodoImportExport.setName("jPanelImportacionPeriodoImportExport"); 
		
		this.jPanelImportacionPeriodoImportExport.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPeriodoImportExport.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPeriodoImportExport.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPeriodoImportExport.setLayout(gridaBagLayoutImportacionPeriodoImportExport);
		
		
		this.jInternalFrameImportacionPeriodoImportExport= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPeriodoImportExport= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPeriodoImportExport = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePeriodoImportExport= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPeriodoImportExport.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPeriodoImportExport.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPeriodoImportExport.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPeriodoImportExport.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPeriodoImportExport.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPeriodoImportExport.setResizable(true);
	    this.jInternalFrameImportacionPeriodoImportExport.setClosable(true);
	    this.jInternalFrameImportacionPeriodoImportExport.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPeriodoImportExport.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPeriodoImportExport.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPeriodoImportExport.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPeriodoImportExport.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPeriodoImportExport.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPeriodoImportExport.setResizable(true);
	    this.jInternalFrameImportacionPeriodoImportExport.setClosable(true);
	    this.jInternalFrameImportacionPeriodoImportExport.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPeriodoImportExport.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPeriodoImportExport.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPeriodoImportExport.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Importar Exportars"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPeriodoImportExport = new JLabelMe();

		this.jLabelArchivoImportacionPeriodoImportExport.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYImportacion;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPeriodoImportExport.add(this.jLabelArchivoImportacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPeriodoImportExport = new JFileChooser();		
		this.jFileChooserImportacionPeriodoImportExport.setToolTipText("ESCOGER ARCHIVO"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPeriodoImportExport = new JButtonMe();
		this.jButtonAbrirImportacionPeriodoImportExport.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPeriodoImportExport,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPeriodoImportExport.setToolTipText("Generar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoImportExport.add(this.jButtonAbrirImportacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPeriodoImportExport = new JLabelMe();

		this.jLabelPathArchivoImportacionPeriodoImportExport.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYImportacion;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPeriodoImportExport.add(this.jLabelPathArchivoImportacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPeriodoImportExport=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPeriodoImportExport.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPeriodoImportExport.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPeriodoImportExport.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoImportExport.add(this.jTextFieldPathArchivoImportacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPeriodoImportExport = new JButtonMe();
		this.jButtonGenerarImportacionPeriodoImportExport.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPeriodoImportExport,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPeriodoImportExport.setToolTipText("Generar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoImportExport.add(this.jButtonGenerarImportacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPeriodoImportExport = new JButtonMe();
		this.jButtonCerrarImportacionPeriodoImportExport.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPeriodoImportExport,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPeriodoImportExport.setToolTipText("Cancelar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoImportExport.add(this.jButtonCerrarImportacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPeriodoImportExport = new GridBagLayout();
		
		this.jScrollPanelImportacionPeriodoImportExport= new JScrollPane(jPanelImportacionPeriodoImportExport,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy =iPosYImportacion;
		this.gridBagConstraintsPeriodoImportExport.gridx =iPosXImportacion;
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPeriodoImportExport.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPeriodoImportExport.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPeriodoImportExport);
		this.jInternalFrameImportacionPeriodoImportExport.getContentPane().add(this.jScrollPanelImportacionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPeriodoImportExport(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPeriodoImportExport = new JButtonMe();
			this.jButtonAbrirOrderByPeriodoImportExport.setText("Orden");
			this.jButtonAbrirOrderByPeriodoImportExport.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPeriodoImportExport,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPeriodoImportExport";
			inputMap = this.jButtonAbrirOrderByPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPeriodoImportExport"));
		
		
			GridBagLayout gridaBagLayoutOrderByPeriodoImportExport = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPeriodoImportExport.setName("jPanelOrderByPeriodoImportExport"); 
			
			this.jPanelOrderByPeriodoImportExport.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPeriodoImportExport.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPeriodoImportExport.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPeriodoImportExport.setLayout(gridaBagLayoutOrderByPeriodoImportExport);
			
			
			this.jTableDatosPeriodoImportExportOrderBy = new JTableMe();        
			this.jTableDatosPeriodoImportExportOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPeriodoImportExportOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPeriodoImportExportOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPeriodoImportExportOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPeriodoImportExportOrderBy.setViewportView(this.jTableDatosPeriodoImportExportOrderBy);
			this.jTableDatosPeriodoImportExportOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPeriodoImportExportOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPeriodoImportExport= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPeriodoImportExport= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPeriodoImportExport = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePeriodoImportExport= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPeriodoImportExport.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPeriodoImportExport.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPeriodoImportExport.setTitle("Orden");
			this.jInternalFrameOrderByPeriodoImportExport.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPeriodoImportExport.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPeriodoImportExport.setResizable(true);
			this.jInternalFrameOrderByPeriodoImportExport.setClosable(true);
			this.jInternalFrameOrderByPeriodoImportExport.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPeriodoImportExport.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPeriodoImportExport.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPeriodoImportExport.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Importar Exportars"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPeriodoImportExport.gridx =iPosXOrderBy;
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPeriodoImportExport.ipady =150;
				
			this.jPanelOrderByPeriodoImportExport.add(jScrollPanelDatosPeriodoImportExportOrderBy, this.gridBagConstraintsPeriodoImportExport);//this.jTableDatosPeriodoImportExportTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPeriodoImportExport = new JButtonMe();
			this.jButtonCerrarOrderByPeriodoImportExport.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPeriodoImportExport,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPeriodoImportExport.setToolTipText("Cancelar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPeriodoImportExport.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPeriodoImportExport.add(this.jButtonCerrarOrderByPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPeriodoImportExport = new GridBagLayout();
			
			this.jScrollPanelOrderByPeriodoImportExport= new JScrollPane(jPanelOrderByPeriodoImportExport,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy =iPosYOrderBy;
			this.gridBagConstraintsPeriodoImportExport.gridx =iPosXOrderBy;
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPeriodoImportExport.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPeriodoImportExport.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPeriodoImportExport);
			
			this.jInternalFrameOrderByPeriodoImportExport.getContentPane().add(this.jScrollPanelOrderByPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
		
		} else {
			this.jButtonAbrirOrderByPeriodoImportExport = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.periodoimportexportSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPeriodoImportExport.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPeriodoImportExport.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPeriodoImportExport.getRowHeight();//PeriodoImportExportConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PeriodoImportExportConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPeriodoImportExport.isSelected()) {
					iHeightTable=PeriodoImportExportConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PeriodoImportExportConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PeriodoImportExportConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PeriodoImportExportConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPeriodoImportExport.isSelected()) {
					iHeightTable=PeriodoImportExportConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PeriodoImportExportConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PeriodoImportExportConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPeriodoImportExport.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPeriodoImportExport.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPeriodoImportExport.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPeriodoImportExport.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPeriodoImportExport.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPeriodoImportExport.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPeriodoImportExport!=null && this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy()!=null) {
			//if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPeriodoImportExport.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPeriodoImportExport.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPeriodoImportExport.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPeriodoImportExport.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPeriodoImportExport.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPeriodoImportExport.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=periodoimportexportLogic.getPeriodoImportExports().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodoimportexports.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PeriodoImportExport> TraerPeriodoImportExportBeans(List<PeriodoImportExport> periodoimportexports,ArrayList<Classe> classes)throws Exception {
		try {
			for(PeriodoImportExport periodoimportexport:periodoimportexports) {
					
				if(!(PeriodoImportExportConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PeriodoImportExportConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					periodoimportexport.setsDetalleGeneralEntityReporte(PeriodoImportExportConstantesFunciones.getPeriodoImportExportDescripcion(periodoimportexport));
										
						
					
						
					
				} else  {
							
					//periodoimportexport.setsDetalleGeneralEntityReporte(periodoimportexport.getsDetalleGeneralEntityReporte());
										
				}
				
				//periodoimportexportbeans.add(periodoimportexportbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return periodoimportexports;
    }
	//PARA REPORTES FIN
}
