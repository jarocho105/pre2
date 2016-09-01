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
import com.bydan.erp.nomina.util.PeriodoAsistenciaConstantesFunciones;

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
public class PeriodoAsistenciaJInternalFrame extends PeriodoAsistenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPeriodoAsistencia;
	
	protected JMenuBar jmenuBarPeriodoAsistencia;
	
	protected JMenu jmenuPeriodoAsistencia;
	protected JMenu jmenuDatosPeriodoAsistencia;
	protected JMenu jmenuArchivoPeriodoAsistencia;
	protected JMenu jmenuAccionesPeriodoAsistencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPeriodoAsistencia;	
	protected GridBagConstraints gridBagConstraintsPeriodoAsistencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PeriodoAsistenciaDetalleFormJInternalFrame jInternalFrameDetalleFormPeriodoAsistencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPeriodoAsistencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPeriodoAsistencia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public PeriodoAsistenciaSessionBean periodoasistenciaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PeriodoAsistencia> periodoasistencias;		
	public List<PeriodoAsistencia> periodoasistenciasEliminados;	
	public List<PeriodoAsistencia> periodoasistenciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPeriodoAsistencia;		
	protected JButton jButtonAbrirOrderByPeriodoAsistencia;
	
	
	//protected JPanel jPanelOrderByPeriodoAsistencia;
	//public JScrollPane jScrollPanelOrderByPeriodoAsistencia;	
	//protected JButton jButtonCerrarOrderByPeriodoAsistencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PeriodoAsistenciaLogic periodoasistenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPeriodoAsistencia;
	public JScrollPane jScrollPanelDatosEdicionPeriodoAsistencia;
	public JScrollPane jScrollPanelDatosGeneralPeriodoAsistencia;
    
	
	
	//public JScrollPane jScrollPanelDatosPeriodoAsistenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPeriodoAsistencia;
	//public JScrollPane jScrollPanelImportacionPeriodoAsistencia;
	
	
	
	protected JPanel jPanelAccionesPeriodoAsistencia;
	
    protected JPanel jPanelPaginacionPeriodoAsistencia;
    protected JPanel jPanelParametrosReportesPeriodoAsistencia;
	protected JPanel jPanelParametrosReportesAccionesPeriodoAsistencia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PeriodoAsistencia;
	protected JPanel jPanelParametrosAuxiliar2PeriodoAsistencia;
	protected JPanel jPanelParametrosAuxiliar3PeriodoAsistencia;
	protected JPanel jPanelParametrosAuxiliar4PeriodoAsistencia;
	//protected JPanel jPanelParametrosAuxiliar5PeriodoAsistencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoPeriodoAsistencia;
	//protected JPanel jPanelImportacionPeriodoAsistencia;
	
	
	public JTable jTableDatosPeriodoAsistencia;
	
	
	
	//public JTable jTableDatosPeriodoAsistenciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPeriodoAsistencia;
	protected JButton jButtonDuplicarPeriodoAsistencia;
	protected JButton jButtonCopiarPeriodoAsistencia;
	protected JButton jButtonVerFormPeriodoAsistencia;
	protected JButton jButtonNuevoRelacionesPeriodoAsistencia;
	protected JButton jButtonModificarPeriodoAsistencia;
	
    protected JButton jButtonGuardarCambiosTablaPeriodoAsistencia;
	protected JButton jButtonCerrarPeriodoAsistencia;
	
	
	protected JButton jButtonRecargarInformacionPeriodoAsistencia;
	protected JButton jButtonProcesarInformacionPeriodoAsistencia;
	
	
	protected JButton jButtonAnterioresPeriodoAsistencia;
	protected JButton jButtonSiguientesPeriodoAsistencia;
	protected JButton jButtonNuevoGuardarCambiosPeriodoAsistencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPeriodoAsistencia;
	//protected JButton jButtonCerrarReporteDinamicoPeriodoAsistencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoPeriodoAsistencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionPeriodoAsistencia;
	//protected JButton jButtonGenerarImportacionPeriodoAsistencia;
	//protected JButton jButtonCerrarImportacionPeriodoAsistencia;
	//protected JFileChooser jFileChooserImportacionPeriodoAsistencia;
	//protected File fileImportacionPeriodoAsistencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPeriodoAsistencia;
	protected JButton jButtonDuplicarToolBarPeriodoAsistencia;
	protected JButton jButtonNuevoRelacionesToolBarPeriodoAsistencia;
	
	
	public JButton jButtonGuardarCambiosToolBarPeriodoAsistencia;
	protected JButton jButtonCopiarToolBarPeriodoAsistencia;
	protected JButton jButtonVerFormToolBarPeriodoAsistencia;
	public JButton jButtonGuardarCambiosTablaToolBarPeriodoAsistencia;
	protected JButton jButtonMostrarOcultarTablaToolBarPeriodoAsistencia;
	protected JButton jButtonCerrarToolBarPeriodoAsistencia;
	
	protected JButton jButtonRecargarInformacionToolBarPeriodoAsistencia;
	protected JButton jButtonProcesarInformacionToolBarPeriodoAsistencia;
	protected JButton jButtonAnterioresToolBarPeriodoAsistencia;
	protected JButton jButtonSiguientesToolBarPeriodoAsistencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarPeriodoAsistencia;
	protected JButton jButtonAbrirOrderByToolBarPeriodoAsistencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPeriodoAsistencia;
	protected JMenuItem jMenuItemDuplicarPeriodoAsistencia;
	protected JMenuItem jMenuItemNuevoRelacionesPeriodoAsistencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPeriodoAsistencia;
	protected JMenuItem jMenuItemCopiarPeriodoAsistencia;
	protected JMenuItem jMenuItemVerFormPeriodoAsistencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaPeriodoAsistencia;
	protected JMenuItem jMenuItemCerrarPeriodoAsistencia;
	protected JMenuItem jMenuItemDetalleCerrarPeriodoAsistencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPeriodoAsistencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarPeriodoAsistencia;
	
	protected JMenuItem jMenuItemRecargarInformacionPeriodoAsistencia;
	protected JMenuItem jMenuItemProcesarInformacionPeriodoAsistencia;
	protected JMenuItem jMenuItemAnterioresPeriodoAsistencia;
	protected JMenuItem jMenuItemSiguientesPeriodoAsistencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPeriodoAsistencia;
	protected JMenuItem jMenuItemAbrirOrderByPeriodoAsistencia;
	protected JMenuItem jMenuItemMostrarOcultarPeriodoAsistencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPeriodoAsistencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPeriodoAsistencia;
	protected JCheckBox jCheckBoxSeleccionadosPeriodoAsistencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPeriodoAsistencia;
	protected JCheckBox jCheckBoxConGraficoReportePeriodoAsistencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPeriodoAsistencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPeriodoAsistencia;
	protected JTextField jTextFieldValorCampoGeneralPeriodoAsistencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePeriodoAsistencia;
	//public JList<Reporte> jListColumnasSelectReportePeriodoAsistencia;
	//public JScrollPane jScrollColumnasSelectReportePeriodoAsistencia;
	
	//public JLabel jLabelRelacionesSelectReportePeriodoAsistencia;
	//public JList<Reporte> jListRelacionesSelectReportePeriodoAsistencia;
	//public JScrollPane jScrollRelacionesSelectReportePeriodoAsistencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPeriodoAsistencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPeriodoAsistencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPeriodoAsistencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoPeriodoAsistencia;
	
		
	//public JLabel jLabelArchivoImportacionPeriodoAsistencia;	
	//public JLabel jLabelPathArchivoImportacionPeriodoAsistencia;
	//protected JTextField jTextFieldPathArchivoImportacionPeriodoAsistencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPeriodoAsistencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPeriodoAsistencia;
	
	//public JLabel jLabelColumnaCategoriaValorPeriodoAsistencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPeriodoAsistencia;
	
	//public JLabel jLabelColumnasValoresGraficoPeriodoAsistencia;
	//public JList<Reporte> jListColumnasValoresGraficoPeriodoAsistencia;
	//public JScrollPane jScrollColumnasValoresGraficoPeriodoAsistencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPeriodoAsistencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPeriodoAsistencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPeriodoAsistencia;
	
	
	
	
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
	public PeriodoAsistenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoAsistenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoAsistenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoAsistenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPeriodoAsistencia)	{
		this.jButtonRecargarInformacionPeriodoAsistencia = jButtonRecargarInformacionPeriodoAsistencia;
	}
	
	public JButton getjButtonProcesarInformacionPeriodoAsistencia() {
		return this.jButtonProcesarInformacionPeriodoAsistencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPeriodoAsistencia)	{
		this.jButtonProcesarInformacionPeriodoAsistencia = jButtonProcesarInformacionPeriodoAsistencia;
	}
	
	
	public JButton getjButtonRecargarInformacionPeriodoAsistencia() {
		return this.jButtonRecargarInformacionPeriodoAsistencia;
	}
	
	
	public List<PeriodoAsistencia> getperiodoasistencias() {
		return this.periodoasistencias;
	}

	public void setperiodoasistencias(List<PeriodoAsistencia> periodoasistencias) {
		this.periodoasistencias = periodoasistencias;
	}
	
	public List<PeriodoAsistencia> getperiodoasistenciasAux() {
		return this.periodoasistenciasAux;
	}

	public void setperiodoasistenciasAux(List<PeriodoAsistencia> periodoasistenciasAux) {
		this.periodoasistenciasAux = periodoasistenciasAux;
	}
	
	public List<PeriodoAsistencia> getperiodoasistenciasEliminados() {
		return this.periodoasistenciasEliminados;
	}

	public void setPeriodoAsistenciasEliminados(List<PeriodoAsistencia> periodoasistenciasEliminados) {
		this.periodoasistenciasEliminados = periodoasistenciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPeriodoAsistencia() {
		return jComboBoxTiposSeleccionarPeriodoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPeriodoAsistencia(
			JComboBox jComboBoxTiposSeleccionarPeriodoAsistencia) {
		this.jComboBoxTiposSeleccionarPeriodoAsistencia = jComboBoxTiposSeleccionarPeriodoAsistencia;
	}
	
	public void setBorderResaltarTiposSeleccionarPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPeriodoAsistencia() {
		return jTextFieldValorCampoGeneralPeriodoAsistencia;
	}

	public void setjTextFieldValorCampoGeneralPeriodoAsistencia(
			JTextField jTextFieldValorCampoGeneralPeriodoAsistencia) {
		this.jTextFieldValorCampoGeneralPeriodoAsistencia = jTextFieldValorCampoGeneralPeriodoAsistencia;
	}

	public void setBorderResaltarValorCampoGeneralPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPeriodoAsistencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPeriodoAsistencia() {
		return this.jCheckBoxSeleccionarTodosPeriodoAsistencia;
	}

	public void setjCheckBoxSeleccionarTodosPeriodoAsistencia(
			JCheckBox jCheckBoxSeleccionarTodosPeriodoAsistencia) {
		this.jCheckBoxSeleccionarTodosPeriodoAsistencia = jCheckBoxSeleccionarTodosPeriodoAsistencia;
	}

	public void setBorderResaltarSeleccionarTodosPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPeriodoAsistencia() {
		return this.jCheckBoxSeleccionadosPeriodoAsistencia;
	}

	public void setjCheckBoxSeleccionadosPeriodoAsistencia(
			JCheckBox jCheckBoxSeleccionadosPeriodoAsistencia) {
		this.jCheckBoxSeleccionadosPeriodoAsistencia = jCheckBoxSeleccionadosPeriodoAsistencia;
	}
	
	public void setBorderResaltarSeleccionadosPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPeriodoAsistencia() {
		return this.jComboBoxTiposArchivosReportesPeriodoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPeriodoAsistencia(
			JComboBox jComboBoxTiposArchivosReportesPeriodoAsistencia) {
		this.jComboBoxTiposArchivosReportesPeriodoAsistencia = jComboBoxTiposArchivosReportesPeriodoAsistencia;
	}

	public void setBorderResaltarTiposArchivosReportesPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPeriodoAsistencia() {
		return this.jComboBoxTiposReportesPeriodoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPeriodoAsistencia(
			JComboBox jComboBoxTiposReportesPeriodoAsistencia) {
		this.jComboBoxTiposReportesPeriodoAsistencia = jComboBoxTiposReportesPeriodoAsistencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPeriodoAsistencia() {
	//	return jComboBoxTiposReportesDinamicoPeriodoAsistencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPeriodoAsistencia(
	//		JComboBox jComboBoxTiposReportesDinamicoPeriodoAsistencia) {
	//	this.jComboBoxTiposReportesDinamicoPeriodoAsistencia = jComboBoxTiposReportesDinamicoPeriodoAsistencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia = jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia;
	//}
	
	public void setBorderResaltarTiposReportesPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPeriodoAsistencia() {
		return this.jComboBoxTiposGraficosReportesPeriodoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPeriodoAsistencia(
			JComboBox jComboBoxTiposGraficosReportesPeriodoAsistencia) {
		this.jComboBoxTiposGraficosReportesPeriodoAsistencia = jComboBoxTiposGraficosReportesPeriodoAsistencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPeriodoAsistencia() {
		return this.jComboBoxTiposPaginacionPeriodoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPeriodoAsistencia(
			JComboBox jComboBoxTiposPaginacionPeriodoAsistencia) {
		this.jComboBoxTiposPaginacionPeriodoAsistencia = jComboBoxTiposPaginacionPeriodoAsistencia;
	}
	
	public void setBorderResaltarTiposPaginacionPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPeriodoAsistencia() {
		return this.jComboBoxTiposRelacionesPeriodoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPeriodoAsistencia() {
		return this.jComboBoxTiposAccionesPeriodoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPeriodoAsistencia(
			JComboBox jComboBoxTiposRelacionesPeriodoAsistencia) {
		this.jComboBoxTiposRelacionesPeriodoAsistencia = jComboBoxTiposRelacionesPeriodoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPeriodoAsistencia(
			JComboBox jComboBoxTiposAccionesPeriodoAsistencia) {
		this.jComboBoxTiposAccionesPeriodoAsistencia = jComboBoxTiposAccionesPeriodoAsistencia;
	}
	
	public void setBorderResaltarTiposRelacionesPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPeriodoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPeriodoAsistencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPeriodoAsistencia() {
	//	return jCheckBoxConGraficoDinamicoPeriodoAsistencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoPeriodoAsistencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoPeriodoAsistencia) {
	//	this.jCheckBoxConGraficoDinamicoPeriodoAsistencia = jCheckBoxConGraficoDinamicoPeriodoAsistencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPeriodoAsistencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPeriodoAsistencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPeriodoAsistencia .setBorder(borderResaltar);		
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
		this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
		
		this.periodoasistenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoasistenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.periodoasistenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PeriodoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PeriodoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PeriodoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PeriodoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PeriodoAsistenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Periodo Asistencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		PeriodoAsistenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPeriodoAsistencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"nuevo","nuevo","Nuevo"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"duplicar","duplicar","Duplicar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"copiar","copiar","Copiar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"ver_form","ver_form","Ver"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"recargar","recargar","Recargar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,
							"cerrar","cerrar","Salir"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPeriodoAsistencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPeriodoAsistencia;
			
				this.jButtonProcesarInformacionToolBarPeriodoAsistencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPeriodoAsistencia;
				
		//protected JButton jButtonModificarToolBarPeriodoAsistencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPeriodoAsistencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPeriodoAsistencia=new JMenuMe("General");
		this.jmenuArchivoPeriodoAsistencia=new JMenuMe("Archivo");
		this.jmenuAccionesPeriodoAsistencia=new JMenuMe("Acciones");
		this.jmenuDatosPeriodoAsistencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPeriodoAsistencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPeriodoAsistencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPeriodoAsistencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPeriodoAsistencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPeriodoAsistencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPeriodoAsistencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPeriodoAsistencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPeriodoAsistencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPeriodoAsistencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPeriodoAsistencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPeriodoAsistencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPeriodoAsistencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPeriodoAsistencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPeriodoAsistencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPeriodoAsistencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPeriodoAsistencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPeriodoAsistencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPeriodoAsistencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPeriodoAsistencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPeriodoAsistencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPeriodoAsistencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPeriodoAsistencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPeriodoAsistencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPeriodoAsistencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPeriodoAsistencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPeriodoAsistencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPeriodoAsistencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPeriodoAsistencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPeriodoAsistencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPeriodoAsistencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPeriodoAsistencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPeriodoAsistencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPeriodoAsistencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPeriodoAsistencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPeriodoAsistencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPeriodoAsistencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPeriodoAsistencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPeriodoAsistencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPeriodoAsistencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPeriodoAsistencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPeriodoAsistencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPeriodoAsistencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPeriodoAsistencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPeriodoAsistencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPeriodoAsistencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPeriodoAsistencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPeriodoAsistencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPeriodoAsistencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPeriodoAsistencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPeriodoAsistencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPeriodoAsistencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPeriodoAsistencia.add(this.jMenuItemCerrarPeriodoAsistencia);
			
			this.jmenuAccionesPeriodoAsistencia.add(this.jMenuItemNuevoPeriodoAsistencia);
			this.jmenuAccionesPeriodoAsistencia.add(this.jMenuItemNuevoGuardarCambiosPeriodoAsistencia);
			this.jmenuAccionesPeriodoAsistencia.add(this.jMenuItemNuevoRelacionesPeriodoAsistencia);
			this.jmenuAccionesPeriodoAsistencia.add(this.jMenuItemGuardarCambiosTablaPeriodoAsistencia);		
			this.jmenuAccionesPeriodoAsistencia.add(this.jMenuItemDuplicarPeriodoAsistencia);		
			this.jmenuAccionesPeriodoAsistencia.add(this.jMenuItemCopiarPeriodoAsistencia);		
			this.jmenuAccionesPeriodoAsistencia.add(this.jMenuItemVerFormPeriodoAsistencia);		
			
			this.jmenuDatosPeriodoAsistencia.add(this.jMenuItemRecargarInformacionPeriodoAsistencia);				
			this.jmenuDatosPeriodoAsistencia.add(this.jMenuItemAnterioresPeriodoAsistencia);				
			this.jmenuDatosPeriodoAsistencia.add(this.jMenuItemSiguientesPeriodoAsistencia);				
			this.jmenuDatosPeriodoAsistencia.add(this.jMenuItemAbrirOrderByPeriodoAsistencia);				
			this.jmenuDatosPeriodoAsistencia.add(this.jMenuItemMostrarOcultarPeriodoAsistencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPeriodoAsistencia.add(this.jMenuItemGuardarCambiosPeriodoAsistencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPeriodoAsistencia.add(this.jmenuArchivoPeriodoAsistencia);		
			this.jmenuBarPeriodoAsistencia.add(this.jmenuAccionesPeriodoAsistencia);		
			this.jmenuBarPeriodoAsistencia.add(this.jmenuDatosPeriodoAsistencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPeriodoAsistencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPeriodoAsistencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasPeriodoAsistencia=new JTabbedPane();


		this.jTabbedPaneBusquedasPeriodoAsistencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPeriodoAsistencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPeriodoAsistencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPeriodoAsistencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePeriodoAsistencia = new PeriodoAsistenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Periodo Asistencia DATOS");
			this.jInternalFrameDetalleFormPeriodoAsistencia = new PeriodoAsistenciaDetalleFormJInternalFrame(jDesktopPane,this.periodoasistenciaSessionBean.getConGuardarRelaciones(),this.periodoasistenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPeriodoAsistencia = null;//new PeriodoAsistenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPeriodoAsistencia= new GridBagLayout();
		
		
		this.jTableDatosPeriodoAsistencia = new JTableMe();      
		
		String sToolTipPeriodoAsistencia="";
		sToolTipPeriodoAsistencia=PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPeriodoAsistencia+="(Nomina.PeriodoAsistencia)";
		}
		
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPeriodoAsistencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPeriodoAsistencia.setToolTipText(sToolTipPeriodoAsistencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPeriodoAsistencia);
		this.jTableDatosPeriodoAsistencia.setAutoCreateRowSorter(true);
		this.jTableDatosPeriodoAsistencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPeriodoAsistencia.setRowSelectionAllowed(true);
		this.jTableDatosPeriodoAsistencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPeriodoAsistencia = new JButtonMe();
		this.jButtonDuplicarPeriodoAsistencia = new JButtonMe();
		this.jButtonCopiarPeriodoAsistencia = new JButtonMe();
		this.jButtonVerFormPeriodoAsistencia = new JButtonMe();
		this.jButtonNuevoRelacionesPeriodoAsistencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPeriodoAsistencia = new JButtonMe();
		this.jButtonCerrarPeriodoAsistencia = new JButtonMe();
		
		this.jScrollPanelDatosPeriodoAsistencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralPeriodoAsistencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Periodo Asistencia";
		
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Asistencias" + this.sPath));
		} else {
			this.jScrollPanelDatosPeriodoAsistencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPeriodoAsistencia.setToolTipText("Acciones");
        this.jPanelAccionesPeriodoAsistencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPeriodoAsistencia=new ReporteDinamicoJInternalFrame(PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPeriodoAsistencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPeriodoAsistencia=new ImportacionJInternalFrame(PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPeriodoAsistencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPeriodoAsistencia = new JButtonMe();
		
		this.jButtonAbrirOrderByPeriodoAsistencia.setText("Orden");
		this.jButtonAbrirOrderByPeriodoAsistencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPeriodoAsistencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPeriodoAsistencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoAsistencia,false,this);
			
			//this.cargarOrderByPeriodoAsistencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPeriodoAsistencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoAsistencia,true,this);
			
			//this.cargarOrderByPeriodoAsistencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPeriodoAsistencia.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosPeriodoAsistencia.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosPeriodoAsistencia.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosPeriodoAsistencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPeriodoAsistencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPeriodoAsistencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPeriodoAsistencia.setText("Nuevo");
		this.jButtonDuplicarPeriodoAsistencia.setText("Duplicar");
		this.jButtonCopiarPeriodoAsistencia.setText("Copiar");
		this.jButtonVerFormPeriodoAsistencia.setText("Ver");
		this.jButtonNuevoRelacionesPeriodoAsistencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.setText("Guardar");
		this.jButtonCerrarPeriodoAsistencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPeriodoAsistencia,"nuevo_button","Nuevo",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPeriodoAsistencia,"duplicar_button","Duplicar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPeriodoAsistencia,"copiar_button","Copiar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPeriodoAsistencia,"ver_form","Ver",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPeriodoAsistencia,"nuevorelaciones_button","Nuevo Rel",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPeriodoAsistencia,"guardarcambiostabla_button","Guardar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPeriodoAsistencia,"cerrar_button","Salir",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPeriodoAsistencia.setToolTipText("Nuevo"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPeriodoAsistencia.setToolTipText("Duplicar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPeriodoAsistencia.setToolTipText("Copiar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPeriodoAsistencia.setToolTipText("Ver"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPeriodoAsistencia.setToolTipText("Nuevo Rel"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.setToolTipText("Guardar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPeriodoAsistencia.setToolTipText("Salir"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPeriodoAsistencia";
		inputMap = this.jButtonNuevoPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPeriodoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPeriodoAsistencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarPeriodoAsistencia";
		inputMap = this.jButtonDuplicarPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPeriodoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPeriodoAsistencia"));
		
		//COPIAR
		sMapKey = "CopiarPeriodoAsistencia";
		inputMap = this.jButtonCopiarPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPeriodoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPeriodoAsistencia"));
		
		//VEr FORM
		sMapKey = "VerFormPeriodoAsistencia";
		inputMap = this.jButtonVerFormPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPeriodoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPeriodoAsistencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPeriodoAsistencia";
		inputMap = this.jButtonNuevoRelacionesPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPeriodoAsistencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPeriodoAsistencia";
		inputMap = this.jButtonModificarPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPeriodoAsistencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPeriodoAsistencia";
		inputMap = this.jButtonCerrarPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPeriodoAsistencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPeriodoAsistencia";
		inputMap = this.jButtonGuardarCambiosTablaPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPeriodoAsistencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PeriodoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PeriodoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PeriodoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PeriodoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PeriodoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPeriodoAsistencia.setName("jPanelParametrosReportesPeriodoAsistencia"); 
		
		this.jPanelParametrosReportesAccionesPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPeriodoAsistencia.setName("jPanelParametrosReportesAccionesPeriodoAsistencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPeriodoAsistencia = new JButtonMe();
		this.jButtonRecargarInformacionPeriodoAsistencia.setText("Recargar");
		this.jButtonRecargarInformacionPeriodoAsistencia.setToolTipText("Recargar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPeriodoAsistencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPeriodoAsistencia = new JButtonMe();
		this.jButtonProcesarInformacionPeriodoAsistencia.setText("Procesar");
		this.jButtonProcesarInformacionPeriodoAsistencia.setToolTipText("Procesar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPeriodoAsistencia.setVisible(false);
			
		this.jButtonProcesarInformacionPeriodoAsistencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPeriodoAsistencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPeriodoAsistencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoAsistencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPeriodoAsistencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoAsistencia.setText("TIPO");       
		this.jComboBoxTiposReportesPeriodoAsistencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoAsistencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPeriodoAsistencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPeriodoAsistencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionPeriodoAsistencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPeriodoAsistencia.setText("Accion");
		this.jComboBoxTiposRelacionesPeriodoAsistencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPeriodoAsistencia.setText("Accion");
		this.jComboBoxTiposAccionesPeriodoAsistencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPeriodoAsistencia.setText("Accion");
		this.jComboBoxTiposSeleccionarPeriodoAsistencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPeriodoAsistencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPeriodoAsistencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPeriodoAsistencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPeriodoAsistencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPeriodoAsistencia = new JLabelMe();
		
		this.jLabelAccionesPeriodoAsistencia.setText("Acciones");		
		this.jLabelAccionesPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPeriodoAsistencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPeriodoAsistencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPeriodoAsistencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPeriodoAsistencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPeriodoAsistencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPeriodoAsistencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePeriodoAsistencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePeriodoAsistencia.setText("Graf.");
		this.jCheckBoxConGraficoReportePeriodoAsistencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPeriodoAsistencia = new JButtonMe();
		//this.jButtonAnterioresPeriodoAsistencia.setText("<<");
        this.jButtonAnterioresPeriodoAsistencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPeriodoAsistencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPeriodoAsistencia = new JButtonMe();
		//this.jButtonSiguientesPeriodoAsistencia.setText(">>");
        this.jButtonSiguientesPeriodoAsistencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPeriodoAsistencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPeriodoAsistencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPeriodoAsistencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosPeriodoAsistencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPeriodoAsistencia,"nuevoguardarcambios_button","Nue",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPeriodoAsistencia";
		inputMap = this.jButtonNuevoGuardarCambiosPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPeriodoAsistencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPeriodoAsistencia";
		inputMap = this.jButtonRecargarInformacionPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPeriodoAsistencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPeriodoAsistencia";
		inputMap = this.jButtonSiguientesPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPeriodoAsistencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPeriodoAsistencia";
		inputMap = this.jButtonAnterioresPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPeriodoAsistencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPeriodoAsistencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPeriodoAsistencia.setMinimumSize(new Dimension(this.getWidth(),PeriodoAsistenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoAsistenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPeriodoAsistencia.setMaximumSize(new Dimension(this.getWidth(),PeriodoAsistenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoAsistenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPeriodoAsistencia.setPreferredSize(new Dimension(this.getWidth(),PeriodoAsistenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoAsistenciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPeriodoAsistencia = new GridBagLayout();

			this.jPanelPaginacionPeriodoAsistencia.setLayout(gridaBagLayoutPaginacionPeriodoAsistencia);						
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonAnterioresPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
					
						
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
			
			this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonNuevoGuardarCambiosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
						
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
			this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonSiguientesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 1;
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonNuevoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
						
			
			
			if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
				this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPeriodoAsistencia.gridy = 1;
				this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonGuardarCambiosTablaPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			}
			
			
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 1;
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonDuplicarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 1;
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonCopiarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 1;
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonVerFormPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 1;
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPeriodoAsistencia.add(this.jButtonCerrarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
		
		
		this.jButtonRecargarInformacionPeriodoAsistencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPeriodoAsistencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPeriodoAsistencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPeriodoAsistencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPeriodoAsistencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPeriodoAsistencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPeriodoAsistencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPeriodoAsistencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPeriodoAsistencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPeriodoAsistencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPeriodoAsistencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPeriodoAsistencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPeriodoAsistencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPeriodoAsistencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPeriodoAsistencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPeriodoAsistencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPeriodoAsistencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPeriodoAsistencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPeriodoAsistencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoAsistencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoAsistencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPeriodoAsistencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPeriodoAsistencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPeriodoAsistencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePeriodoAsistencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePeriodoAsistencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePeriodoAsistencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPeriodoAsistencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPeriodoAsistencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPeriodoAsistencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPeriodoAsistencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPeriodoAsistencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPeriodoAsistencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPeriodoAsistencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPeriodoAsistencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PeriodoAsistencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PeriodoAsistencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PeriodoAsistencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PeriodoAsistencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPeriodoAsistencia.setLayout(gridaBagParametrosReportesPeriodoAsistencia);
			this.jPanelParametrosReportesAccionesPeriodoAsistencia.setLayout(gridaBagParametrosReportesAccionesPeriodoAsistencia);
			
			
			this.jPanelParametrosAuxiliar1PeriodoAsistencia.setLayout(gridaBagParametrosAuxiliar1PeriodoAsistencia);
			this.jPanelParametrosAuxiliar2PeriodoAsistencia.setLayout(gridaBagParametrosAuxiliar2PeriodoAsistencia);
			this.jPanelParametrosAuxiliar3PeriodoAsistencia.setLayout(gridaBagParametrosAuxiliar3PeriodoAsistencia);
			this.jPanelParametrosAuxiliar4PeriodoAsistencia.setLayout(gridaBagParametrosAuxiliar4PeriodoAsistencia);
			//this.jPanelParametrosAuxiliar5PeriodoAsistencia.setLayout(gridaBagParametrosAuxiliar2PeriodoAsistencia);			
			
			
			
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jButtonRecargarInformacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoAsistencia.add(this.jComboBoxTiposPaginacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoAsistencia.add(this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoAsistencia.add(this.jComboBoxTiposArchivosReportesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jPanelParametrosAuxiliar1PeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoAsistencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PeriodoAsistencia.add(this.jComboBoxTiposReportesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jPanelParametrosAuxiliar4PeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jComboBoxTiposReportesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jCheckBoxGenerarReportePeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jPanelParametrosAuxiliar2PeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoAsistencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jLabelAccionesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
				this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPeriodoAsistencia.add(this.jButtonAbrirOrderByPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jComboBoxTiposSeleccionarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
			
			
			/*
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoAsistencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jCheckBoxSeleccionarTodosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoAsistencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PeriodoAsistencia.add(this.jCheckBoxSeleccionarTodosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);															
				
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoAsistencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PeriodoAsistencia.add(this.jCheckBoxSeleccionadosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jPanelParametrosAuxiliar3PeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jComboBoxTiposAccionesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
	
				
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoAsistencia.add(this.jTextFieldValorCampoGeneralPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPeriodoAsistencia = new GridBagLayout();

			this.jScrollPanelDatosPeriodoAsistencia.setLayout(gridaBagLayoutDatosPeriodoAsistencia);
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
			this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
			
			this.jScrollPanelDatosPeriodoAsistencia.add(this.jTableDatosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPeriodoAsistencia.setViewportView(this.jTableDatosPeriodoAsistencia);
		this.jTableDatosPeriodoAsistencia.setFillsViewportHeight(true);
		this.jTableDatosPeriodoAsistencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPeriodoAsistencia= new GridBagLayout();
		this.jPanelAccionesPeriodoAsistencia.setLayout(gridaBagLayoutAccionesPeriodoAsistencia);
		
		
		/*	
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
			
		this.jPanelAccionesPeriodoAsistencia.add(this.jButtonNuevoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPeriodoAsistencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPeriodoAsistencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();						
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodoAsistencia.gridx = 0;		
			//this.gridBagConstraintsPeriodoAsistencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPeriodoAsistencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;		
		//this.gridBagConstraintsPeriodoAsistencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPeriodoAsistencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);								
		
		
		/*
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		*/		
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPeriodoAsistencia.gridx =0;
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPeriodoAsistencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
				
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPeriodoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPeriodoAsistencia = new GridBagLayout();
			this.jPanelBusquedasParametrosPeriodoAsistencia.setLayout(gridaBagLayoutBusquedasParametrosPeriodoAsistencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPeriodoAsistencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPeriodoAsistencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoAsistencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoAsistencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			
			
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
			
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPeriodoAsistencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPeriodoAsistencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPeriodoAsistencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPeriodoAsistencia.setName("jPanelReporteDinamicoPeriodoAsistencia"); 
		
		this.jPanelReporteDinamicoPeriodoAsistencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPeriodoAsistencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPeriodoAsistencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPeriodoAsistencia.setLayout(gridaBagLayoutReporteDinamicoPeriodoAsistencia);
		
		
		this.jInternalFrameReporteDinamicoPeriodoAsistencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPeriodoAsistencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePeriodoAsistencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPeriodoAsistencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPeriodoAsistencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPeriodoAsistencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPeriodoAsistencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPeriodoAsistencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPeriodoAsistencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoPeriodoAsistencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoPeriodoAsistencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPeriodoAsistencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPeriodoAsistencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPeriodoAsistencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Asistencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePeriodoAsistencia = new JLabelMe();

		this.jLabelColumnasSelectReportePeriodoAsistencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jLabelColumnasSelectReportePeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePeriodoAsistencia = new JList<Reporte>();
		this.jListColumnasSelectReportePeriodoAsistencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePeriodoAsistencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePeriodoAsistencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePeriodoAsistencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePeriodoAsistencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePeriodoAsistencia=new JScrollPane(this.jListColumnasSelectReportePeriodoAsistencia);
			
			this.jScrollColumnasSelectReportePeriodoAsistencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePeriodoAsistencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePeriodoAsistencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jListColumnasSelectReportePeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jScrollColumnasSelectReportePeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePeriodoAsistencia = new JLabelMe();

		this.jLabelRelacionesSelectReportePeriodoAsistencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePeriodoAsistencia = new JList<Reporte>();
		this.jListRelacionesSelectReportePeriodoAsistencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePeriodoAsistencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePeriodoAsistencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePeriodoAsistencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePeriodoAsistencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePeriodoAsistencia=new JScrollPane(this.jListRelacionesSelectReportePeriodoAsistencia);
			
			this.jScrollRelacionesSelectReportePeriodoAsistencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePeriodoAsistencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePeriodoAsistencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPeriodoAsistencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPeriodoAsistencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoPeriodoAsistencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPeriodoAsistencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPeriodoAsistencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPeriodoAsistencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPeriodoAsistencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPeriodoAsistencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPeriodoAsistencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPeriodoAsistencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jLabelGenerarExcelReporteDinamicoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPeriodoAsistencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPeriodoAsistencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPeriodoAsistencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPeriodoAsistencia.setToolTipText("Generar EXCEL"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jButtonGenerarExcelReporteDinamicoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jComboBoxTiposReportesDinamicoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPeriodoAsistencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPeriodoAsistencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jLabelTiposArchivoReporteDinamicoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jComboBoxTiposArchivosReportesDinamicoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPeriodoAsistencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPeriodoAsistencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPeriodoAsistencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPeriodoAsistencia.setToolTipText("Generar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jButtonGenerarReporteDinamicoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPeriodoAsistencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPeriodoAsistencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPeriodoAsistencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPeriodoAsistencia.setToolTipText("Cancelar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoAsistencia.add(this.jButtonCerrarReporteDinamicoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPeriodoAsistencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPeriodoAsistencia= new JScrollPane(jPanelReporteDinamicoPeriodoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPeriodoAsistencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPeriodoAsistencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPeriodoAsistencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Asistencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoAsistencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPeriodoAsistencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPeriodoAsistencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPeriodoAsistencia);
		this.jInternalFrameReporteDinamicoPeriodoAsistencia.getContentPane().add(this.jScrollPanelReporteDinamicoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPeriodoAsistencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPeriodoAsistencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPeriodoAsistencia.setName("jPanelImportacionPeriodoAsistencia"); 
		
		this.jPanelImportacionPeriodoAsistencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPeriodoAsistencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPeriodoAsistencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPeriodoAsistencia.setLayout(gridaBagLayoutImportacionPeriodoAsistencia);
		
		
		this.jInternalFrameImportacionPeriodoAsistencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPeriodoAsistencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPeriodoAsistencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePeriodoAsistencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPeriodoAsistencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPeriodoAsistencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPeriodoAsistencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPeriodoAsistencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPeriodoAsistencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPeriodoAsistencia.setResizable(true);
	    this.jInternalFrameImportacionPeriodoAsistencia.setClosable(true);
	    this.jInternalFrameImportacionPeriodoAsistencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPeriodoAsistencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPeriodoAsistencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPeriodoAsistencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPeriodoAsistencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPeriodoAsistencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPeriodoAsistencia.setResizable(true);
	    this.jInternalFrameImportacionPeriodoAsistencia.setClosable(true);
	    this.jInternalFrameImportacionPeriodoAsistencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPeriodoAsistencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPeriodoAsistencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPeriodoAsistencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Asistencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPeriodoAsistencia = new JLabelMe();

		this.jLabelArchivoImportacionPeriodoAsistencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPeriodoAsistencia.add(this.jLabelArchivoImportacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPeriodoAsistencia = new JFileChooser();		
		this.jFileChooserImportacionPeriodoAsistencia.setToolTipText("ESCOGER ARCHIVO"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPeriodoAsistencia = new JButtonMe();
		this.jButtonAbrirImportacionPeriodoAsistencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPeriodoAsistencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPeriodoAsistencia.setToolTipText("Generar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoAsistencia.add(this.jButtonAbrirImportacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPeriodoAsistencia = new JLabelMe();

		this.jLabelPathArchivoImportacionPeriodoAsistencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPeriodoAsistencia.add(this.jLabelPathArchivoImportacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPeriodoAsistencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPeriodoAsistencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPeriodoAsistencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPeriodoAsistencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoAsistencia.add(this.jTextFieldPathArchivoImportacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPeriodoAsistencia = new JButtonMe();
		this.jButtonGenerarImportacionPeriodoAsistencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPeriodoAsistencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPeriodoAsistencia.setToolTipText("Generar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoAsistencia.add(this.jButtonGenerarImportacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPeriodoAsistencia = new JButtonMe();
		this.jButtonCerrarImportacionPeriodoAsistencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPeriodoAsistencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPeriodoAsistencia.setToolTipText("Cancelar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoAsistencia.add(this.jButtonCerrarImportacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPeriodoAsistencia = new GridBagLayout();
		
		this.jScrollPanelImportacionPeriodoAsistencia= new JScrollPane(jPanelImportacionPeriodoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy =iPosYImportacion;
		this.gridBagConstraintsPeriodoAsistencia.gridx =iPosXImportacion;
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPeriodoAsistencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPeriodoAsistencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPeriodoAsistencia);
		this.jInternalFrameImportacionPeriodoAsistencia.getContentPane().add(this.jScrollPanelImportacionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPeriodoAsistencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPeriodoAsistencia = new JButtonMe();
			this.jButtonAbrirOrderByPeriodoAsistencia.setText("Orden");
			this.jButtonAbrirOrderByPeriodoAsistencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPeriodoAsistencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPeriodoAsistencia";
			inputMap = this.jButtonAbrirOrderByPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPeriodoAsistencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByPeriodoAsistencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPeriodoAsistencia.setName("jPanelOrderByPeriodoAsistencia"); 
			
			this.jPanelOrderByPeriodoAsistencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPeriodoAsistencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPeriodoAsistencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPeriodoAsistencia.setLayout(gridaBagLayoutOrderByPeriodoAsistencia);
			
			
			this.jTableDatosPeriodoAsistenciaOrderBy = new JTableMe();        
			this.jTableDatosPeriodoAsistenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPeriodoAsistenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPeriodoAsistenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPeriodoAsistenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPeriodoAsistenciaOrderBy.setViewportView(this.jTableDatosPeriodoAsistenciaOrderBy);
			this.jTableDatosPeriodoAsistenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPeriodoAsistenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPeriodoAsistencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPeriodoAsistencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPeriodoAsistencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePeriodoAsistencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPeriodoAsistencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPeriodoAsistencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPeriodoAsistencia.setTitle("Orden");
			this.jInternalFrameOrderByPeriodoAsistencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPeriodoAsistencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPeriodoAsistencia.setResizable(true);
			this.jInternalFrameOrderByPeriodoAsistencia.setClosable(true);
			this.jInternalFrameOrderByPeriodoAsistencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPeriodoAsistencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPeriodoAsistencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPeriodoAsistencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Asistencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPeriodoAsistencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPeriodoAsistencia.ipady =150;
				
			this.jPanelOrderByPeriodoAsistencia.add(jScrollPanelDatosPeriodoAsistenciaOrderBy, this.gridBagConstraintsPeriodoAsistencia);//this.jTableDatosPeriodoAsistenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPeriodoAsistencia = new JButtonMe();
			this.jButtonCerrarOrderByPeriodoAsistencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPeriodoAsistencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPeriodoAsistencia.setToolTipText("Cancelar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPeriodoAsistencia.add(this.jButtonCerrarOrderByPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPeriodoAsistencia = new GridBagLayout();
			
			this.jScrollPanelOrderByPeriodoAsistencia= new JScrollPane(jPanelOrderByPeriodoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsPeriodoAsistencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPeriodoAsistencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPeriodoAsistencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPeriodoAsistencia);
			
			this.jInternalFrameOrderByPeriodoAsistencia.getContentPane().add(this.jScrollPanelOrderByPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
		
		} else {
			this.jButtonAbrirOrderByPeriodoAsistencia = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.periodoasistenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPeriodoAsistencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPeriodoAsistencia.getRowHeight();//PeriodoAsistenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PeriodoAsistenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia.isSelected()) {
					iHeightTable=PeriodoAsistenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PeriodoAsistenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PeriodoAsistenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PeriodoAsistenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPeriodoAsistencia.isSelected()) {
					iHeightTable=PeriodoAsistenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PeriodoAsistenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PeriodoAsistenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPeriodoAsistencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPeriodoAsistencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPeriodoAsistencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPeriodoAsistencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPeriodoAsistencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPeriodoAsistencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPeriodoAsistencia!=null && this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy()!=null) {
			//if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPeriodoAsistencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPeriodoAsistencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPeriodoAsistencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPeriodoAsistencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPeriodoAsistencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPeriodoAsistencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=periodoasistenciaLogic.getPeriodoAsistencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodoasistencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PeriodoAsistencia> TraerPeriodoAsistenciaBeans(List<PeriodoAsistencia> periodoasistencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(PeriodoAsistencia periodoasistencia:periodoasistencias) {
					
				if(!(PeriodoAsistenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PeriodoAsistenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					periodoasistencia.setsDetalleGeneralEntityReporte(PeriodoAsistenciaConstantesFunciones.getPeriodoAsistenciaDescripcion(periodoasistencia));
										
						
					
						
					
				} else  {
							
					//periodoasistencia.setsDetalleGeneralEntityReporte(periodoasistencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//periodoasistenciabeans.add(periodoasistenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return periodoasistencias;
    }
	//PARA REPORTES FIN
}
