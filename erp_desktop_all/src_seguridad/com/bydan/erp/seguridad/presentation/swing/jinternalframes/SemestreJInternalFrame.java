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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.SemestreConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class SemestreJInternalFrame extends SemestreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSemestre;
	
	protected JMenuBar jmenuBarSemestre;
	
	protected JMenu jmenuSemestre;
	protected JMenu jmenuDatosSemestre;
	protected JMenu jmenuArchivoSemestre;
	protected JMenu jmenuAccionesSemestre;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSemestre;	
	protected GridBagConstraints gridBagConstraintsSemestre;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SemestreDetalleFormJInternalFrame jInternalFrameDetalleFormSemestre;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSemestre;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSemestre;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SemestreSessionBean semestreSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Semestre> semestres;		
	public List<Semestre> semestresEliminados;	
	public List<Semestre> semestresAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySemestre;		
	protected JButton jButtonAbrirOrderBySemestre;
	
	
	//protected JPanel jPanelOrderBySemestre;
	//public JScrollPane jScrollPanelOrderBySemestre;	
	//protected JButton jButtonCerrarOrderBySemestre;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SemestreLogic semestreLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSemestre;
	public JScrollPane jScrollPanelDatosEdicionSemestre;
	public JScrollPane jScrollPanelDatosGeneralSemestre;
    
	
	
	//public JScrollPane jScrollPanelDatosSemestreOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSemestre;
	//public JScrollPane jScrollPanelImportacionSemestre;
	
	
	
	protected JPanel jPanelAccionesSemestre;
	
    protected JPanel jPanelPaginacionSemestre;
    protected JPanel jPanelParametrosReportesSemestre;
	protected JPanel jPanelParametrosReportesAccionesSemestre;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Semestre;
	protected JPanel jPanelParametrosAuxiliar2Semestre;
	protected JPanel jPanelParametrosAuxiliar3Semestre;
	protected JPanel jPanelParametrosAuxiliar4Semestre;
	//protected JPanel jPanelParametrosAuxiliar5Semestre;
	
	
	
	//protected JPanel jPanelReporteDinamicoSemestre;
	//protected JPanel jPanelImportacionSemestre;
	
	
	public JTable jTableDatosSemestre;
	
	
	
	//public JTable jTableDatosSemestreOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSemestre;
	protected JButton jButtonDuplicarSemestre;
	protected JButton jButtonCopiarSemestre;
	protected JButton jButtonVerFormSemestre;
	protected JButton jButtonNuevoRelacionesSemestre;
	protected JButton jButtonModificarSemestre;
	
    protected JButton jButtonGuardarCambiosTablaSemestre;
	protected JButton jButtonCerrarSemestre;
	
	
	protected JButton jButtonRecargarInformacionSemestre;
	protected JButton jButtonProcesarInformacionSemestre;
	
	
	protected JButton jButtonAnterioresSemestre;
	protected JButton jButtonSiguientesSemestre;
	protected JButton jButtonNuevoGuardarCambiosSemestre;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSemestre;
	//protected JButton jButtonCerrarReporteDinamicoSemestre;
	//protected JButton jButtonGenerarExcelReporteDinamicoSemestre;	
	
	
	
	//protected JButton jButtonAbrirImportacionSemestre;
	//protected JButton jButtonGenerarImportacionSemestre;
	//protected JButton jButtonCerrarImportacionSemestre;
	//protected JFileChooser jFileChooserImportacionSemestre;
	//protected File fileImportacionSemestre;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSemestre;
	protected JButton jButtonDuplicarToolBarSemestre;
	protected JButton jButtonNuevoRelacionesToolBarSemestre;
	
	
	public JButton jButtonGuardarCambiosToolBarSemestre;
	protected JButton jButtonCopiarToolBarSemestre;
	protected JButton jButtonVerFormToolBarSemestre;
	public JButton jButtonGuardarCambiosTablaToolBarSemestre;
	protected JButton jButtonMostrarOcultarTablaToolBarSemestre;
	protected JButton jButtonCerrarToolBarSemestre;
	
	protected JButton jButtonRecargarInformacionToolBarSemestre;
	protected JButton jButtonProcesarInformacionToolBarSemestre;
	protected JButton jButtonAnterioresToolBarSemestre;
	protected JButton jButtonSiguientesToolBarSemestre;
	protected JButton jButtonNuevoGuardarCambiosToolBarSemestre;
	protected JButton jButtonAbrirOrderByToolBarSemestre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSemestre;
	protected JMenuItem jMenuItemDuplicarSemestre;
	protected JMenuItem jMenuItemNuevoRelacionesSemestre;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSemestre;
	protected JMenuItem jMenuItemCopiarSemestre;
	protected JMenuItem jMenuItemVerFormSemestre;
	protected JMenuItem jMenuItemGuardarCambiosTablaSemestre;
	protected JMenuItem jMenuItemCerrarSemestre;
	protected JMenuItem jMenuItemDetalleCerrarSemestre;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySemestre;
	protected JMenuItem jMenuItemDetalleMostarOcultarSemestre;
	
	protected JMenuItem jMenuItemRecargarInformacionSemestre;
	protected JMenuItem jMenuItemProcesarInformacionSemestre;
	protected JMenuItem jMenuItemAnterioresSemestre;
	protected JMenuItem jMenuItemSiguientesSemestre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSemestre;
	protected JMenuItem jMenuItemAbrirOrderBySemestre;
	protected JMenuItem jMenuItemMostrarOcultarSemestre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSemestre;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSemestre;
	protected JCheckBox jCheckBoxSeleccionadosSemestre;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSemestre;
	protected JCheckBox jCheckBoxConGraficoReporteSemestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSemestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSemestre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSemestre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSemestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSemestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSemestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSemestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSemestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSemestre;
	protected JTextField jTextFieldValorCampoGeneralSemestre;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSemestre;
	//public JList<Reporte> jListColumnasSelectReporteSemestre;
	//public JScrollPane jScrollColumnasSelectReporteSemestre;
	
	//public JLabel jLabelRelacionesSelectReporteSemestre;
	//public JList<Reporte> jListRelacionesSelectReporteSemestre;
	//public JScrollPane jScrollRelacionesSelectReporteSemestre;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSemestre;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSemestre;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSemestre;
	//public JLabel jLabelTiposArchivoReporteDinamicoSemestre;
	
		
	//public JLabel jLabelArchivoImportacionSemestre;	
	//public JLabel jLabelPathArchivoImportacionSemestre;
	//protected JTextField jTextFieldPathArchivoImportacionSemestre;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSemestre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSemestre;
	
	//public JLabel jLabelColumnaCategoriaValorSemestre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSemestre;
	
	//public JLabel jLabelColumnasValoresGraficoSemestre;
	//public JList<Reporte> jListColumnasValoresGraficoSemestre;
	//public JScrollPane jScrollColumnasValoresGraficoSemestre;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSemestre;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSemestre;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public SemestreJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SemestreJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SemestreJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SemestreJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSemestre)	{
		this.jButtonRecargarInformacionSemestre = jButtonRecargarInformacionSemestre;
	}
	
	public JButton getjButtonProcesarInformacionSemestre() {
		return this.jButtonProcesarInformacionSemestre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSemestre)	{
		this.jButtonProcesarInformacionSemestre = jButtonProcesarInformacionSemestre;
	}
	
	
	public JButton getjButtonRecargarInformacionSemestre() {
		return this.jButtonRecargarInformacionSemestre;
	}
	
	
	public List<Semestre> getsemestres() {
		return this.semestres;
	}

	public void setsemestres(List<Semestre> semestres) {
		this.semestres = semestres;
	}
	
	public List<Semestre> getsemestresAux() {
		return this.semestresAux;
	}

	public void setsemestresAux(List<Semestre> semestresAux) {
		this.semestresAux = semestresAux;
	}
	
	public List<Semestre> getsemestresEliminados() {
		return this.semestresEliminados;
	}

	public void setSemestresEliminados(List<Semestre> semestresEliminados) {
		this.semestresEliminados = semestresEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSemestre() {
		return jComboBoxTiposSeleccionarSemestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSemestre(
			JComboBox jComboBoxTiposSeleccionarSemestre) {
		this.jComboBoxTiposSeleccionarSemestre = jComboBoxTiposSeleccionarSemestre;
	}
	
	public void setBorderResaltarTiposSeleccionarSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSemestre .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSemestre() {
		return jTextFieldValorCampoGeneralSemestre;
	}

	public void setjTextFieldValorCampoGeneralSemestre(
			JTextField jTextFieldValorCampoGeneralSemestre) {
		this.jTextFieldValorCampoGeneralSemestre = jTextFieldValorCampoGeneralSemestre;
	}

	public void setBorderResaltarValorCampoGeneralSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSemestre .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSemestre() {
		return this.jCheckBoxSeleccionarTodosSemestre;
	}

	public void setjCheckBoxSeleccionarTodosSemestre(
			JCheckBox jCheckBoxSeleccionarTodosSemestre) {
		this.jCheckBoxSeleccionarTodosSemestre = jCheckBoxSeleccionarTodosSemestre;
	}

	public void setBorderResaltarSeleccionarTodosSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSemestre .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSemestre() {
		return this.jCheckBoxSeleccionadosSemestre;
	}

	public void setjCheckBoxSeleccionadosSemestre(
			JCheckBox jCheckBoxSeleccionadosSemestre) {
		this.jCheckBoxSeleccionadosSemestre = jCheckBoxSeleccionadosSemestre;
	}
	
	public void setBorderResaltarSeleccionadosSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSemestre .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSemestre() {
		return this.jComboBoxTiposArchivosReportesSemestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSemestre(
			JComboBox jComboBoxTiposArchivosReportesSemestre) {
		this.jComboBoxTiposArchivosReportesSemestre = jComboBoxTiposArchivosReportesSemestre;
	}

	public void setBorderResaltarTiposArchivosReportesSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSemestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSemestre() {
		return this.jComboBoxTiposReportesSemestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSemestre(
			JComboBox jComboBoxTiposReportesSemestre) {
		this.jComboBoxTiposReportesSemestre = jComboBoxTiposReportesSemestre;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSemestre() {
	//	return jComboBoxTiposReportesDinamicoSemestre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSemestre(
	//		JComboBox jComboBoxTiposReportesDinamicoSemestre) {
	//	this.jComboBoxTiposReportesDinamicoSemestre = jComboBoxTiposReportesDinamicoSemestre;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSemestre() {
	//	return jComboBoxTiposArchivosReportesDinamicoSemestre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSemestre(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSemestre) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSemestre = jComboBoxTiposArchivosReportesDinamicoSemestre;
	//}
	
	public void setBorderResaltarTiposReportesSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSemestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSemestre() {
		return this.jComboBoxTiposGraficosReportesSemestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSemestre(
			JComboBox jComboBoxTiposGraficosReportesSemestre) {
		this.jComboBoxTiposGraficosReportesSemestre = jComboBoxTiposGraficosReportesSemestre;
	}
	
	public void setBorderResaltarTiposGraficosReportesSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSemestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSemestre() {
		return this.jComboBoxTiposPaginacionSemestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSemestre(
			JComboBox jComboBoxTiposPaginacionSemestre) {
		this.jComboBoxTiposPaginacionSemestre = jComboBoxTiposPaginacionSemestre;
	}
	
	public void setBorderResaltarTiposPaginacionSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSemestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSemestre() {
		return this.jComboBoxTiposRelacionesSemestre;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSemestre() {
		return this.jComboBoxTiposAccionesSemestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSemestre(
			JComboBox jComboBoxTiposRelacionesSemestre) {
		this.jComboBoxTiposRelacionesSemestre = jComboBoxTiposRelacionesSemestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSemestre(
			JComboBox jComboBoxTiposAccionesSemestre) {
		this.jComboBoxTiposAccionesSemestre = jComboBoxTiposAccionesSemestre;
	}
	
	public void setBorderResaltarTiposRelacionesSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSemestre .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSemestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSemestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSemestre .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSemestre() {
	//	return jCheckBoxConGraficoDinamicoSemestre;
	//}

	//public void setjCheckBoxConGraficoDinamicoSemestre(
	//		JCheckBox jCheckBoxConGraficoDinamicoSemestre) {
	//	this.jCheckBoxConGraficoDinamicoSemestre = jCheckBoxConGraficoDinamicoSemestre;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSemestre() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSemestre.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSemestre .setBorder(borderResaltar);		
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
		this.semestreSessionBean=new SemestreSessionBean();
		
		this.semestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.semestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.semestreSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SemestreJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SemestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SemestreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SemestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SemestreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Semestre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
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
		
		SemestreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSemestre= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSemestre,this.jTtoolBarSemestre,
							"nuevo","nuevo","Nuevo"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSemestre,this.jTtoolBarSemestre,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSemestre,this.jTtoolBarSemestre,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSemestre,this.jTtoolBarSemestre,
							"duplicar","duplicar","Duplicar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSemestre,this.jTtoolBarSemestre,
							"copiar","copiar","Copiar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSemestre,this.jTtoolBarSemestre,
							"ver_form","ver_form","Ver"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSemestre,this.jTtoolBarSemestre,
							"recargar","recargar","Recargar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSemestre,this.jTtoolBarSemestre,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSemestre,this.jTtoolBarSemestre,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSemestre,this.jTtoolBarSemestre,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSemestre,this.jTtoolBarSemestre,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSemestre,this.jTtoolBarSemestre,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSemestre,this.jTtoolBarSemestre,
							"cerrar","cerrar","Salir"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSemestre=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSemestre;
			
				this.jButtonProcesarInformacionToolBarSemestre=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSemestre;
				
		//protected JButton jButtonModificarToolBarSemestre;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSemestre=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSemestre=new JMenuMe("General");
		this.jmenuArchivoSemestre=new JMenuMe("Archivo");
		this.jmenuAccionesSemestre=new JMenuMe("Acciones");
		this.jmenuDatosSemestre=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSemestre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSemestre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSemestre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSemestre= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSemestre.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSemestre,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSemestre= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSemestre.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSemestre,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSemestre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSemestre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSemestre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSemestre= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSemestre.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSemestre,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSemestre= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSemestre.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSemestre,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSemestre= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSemestre.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSemestre,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSemestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSemestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSemestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSemestre= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSemestre.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSemestre,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSemestre= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSemestre.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSemestre,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSemestre= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSemestre.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSemestre,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSemestre= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSemestre.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSemestre,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySemestre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySemestre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySemestre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSemestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSemestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSemestre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySemestre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySemestre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySemestre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSemestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSemestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSemestre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSemestre= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSemestre.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSemestre,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSemestre.add(this.jMenuItemCerrarSemestre);
			
			this.jmenuAccionesSemestre.add(this.jMenuItemNuevoSemestre);
			this.jmenuAccionesSemestre.add(this.jMenuItemNuevoGuardarCambiosSemestre);
			this.jmenuAccionesSemestre.add(this.jMenuItemNuevoRelacionesSemestre);
			this.jmenuAccionesSemestre.add(this.jMenuItemGuardarCambiosTablaSemestre);		
			this.jmenuAccionesSemestre.add(this.jMenuItemDuplicarSemestre);		
			this.jmenuAccionesSemestre.add(this.jMenuItemCopiarSemestre);		
			this.jmenuAccionesSemestre.add(this.jMenuItemVerFormSemestre);		
			
			this.jmenuDatosSemestre.add(this.jMenuItemRecargarInformacionSemestre);				
			this.jmenuDatosSemestre.add(this.jMenuItemAnterioresSemestre);				
			this.jmenuDatosSemestre.add(this.jMenuItemSiguientesSemestre);				
			this.jmenuDatosSemestre.add(this.jMenuItemAbrirOrderBySemestre);				
			this.jmenuDatosSemestre.add(this.jMenuItemMostrarOcultarSemestre);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSemestre.add(this.jMenuItemGuardarCambiosSemestre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSemestre.add(this.jmenuArchivoSemestre);		
			this.jmenuBarSemestre.add(this.jmenuAccionesSemestre);		
			this.jmenuBarSemestre.add(this.jmenuDatosSemestre);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSemestre);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSemestre() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleSemestre = new SemestreDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Semestre DATOS");
			this.jInternalFrameDetalleFormSemestre = new SemestreDetalleFormJInternalFrame(jDesktopPane,this.semestreSessionBean.getConGuardarRelaciones(),this.semestreSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSemestre = null;//new SemestreDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSemestre= new GridBagLayout();
		
		
		this.jTableDatosSemestre = new JTableMe();      
		
		String sToolTipSemestre="";
		sToolTipSemestre=SemestreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSemestre+="(Seguridad.Semestre)";
		}
		
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
			sToolTipSemestre+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSemestre.setToolTipText(sToolTipSemestre);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSemestre);
		this.jTableDatosSemestre.setAutoCreateRowSorter(true);
		this.jTableDatosSemestre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSemestre.setRowSelectionAllowed(true);
		this.jTableDatosSemestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSemestre,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSemestre = new JButtonMe();
		this.jButtonDuplicarSemestre = new JButtonMe();
		this.jButtonCopiarSemestre = new JButtonMe();
		this.jButtonVerFormSemestre = new JButtonMe();
		this.jButtonNuevoRelacionesSemestre = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSemestre = new JButtonMe();
		this.jButtonCerrarSemestre = new JButtonMe();
		
		this.jScrollPanelDatosSemestre = new JScrollPane();   
        this.jScrollPanelDatosGeneralSemestre = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Semestre";
		
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Semestres" + this.sPath));
		} else {
			this.jScrollPanelDatosSemestre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSemestre.setToolTipText("Acciones");
        this.jPanelAccionesSemestre.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSemestre, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSemestre=new ReporteDinamicoJInternalFrame(SemestreConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSemestre();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSemestre=new ImportacionJInternalFrame(SemestreConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSemestre();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySemestre = new JButtonMe();
		
		this.jButtonAbrirOrderBySemestre.setText("Orden");
		this.jButtonAbrirOrderBySemestre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySemestre,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySemestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySemestre,false,this);
			
			//this.cargarOrderBySemestre(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySemestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySemestre,true,this);
			
			//this.cargarOrderBySemestre(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSemestre.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosSemestre.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosSemestre.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosSemestre.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSemestre.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSemestre.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSemestre.setText("Nuevo");
		this.jButtonDuplicarSemestre.setText("Duplicar");
		this.jButtonCopiarSemestre.setText("Copiar");
		this.jButtonVerFormSemestre.setText("Ver");
		this.jButtonNuevoRelacionesSemestre.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSemestre.setText("Guardar");
		this.jButtonCerrarSemestre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSemestre,"nuevo_button","Nuevo",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSemestre,"duplicar_button","Duplicar",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSemestre,"copiar_button","Copiar",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSemestre,"ver_form","Ver",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSemestre,"nuevorelaciones_button","Nuevo Rel",this.semestreSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSemestre,"guardarcambiostabla_button","Guardar",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSemestre,"cerrar_button","Salir",this.semestreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSemestre.setToolTipText("Nuevo"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSemestre.setToolTipText("Duplicar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSemestre.setToolTipText("Copiar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSemestre.setToolTipText("Ver"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSemestre.setToolTipText("Nuevo Rel"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSemestre.setToolTipText("Guardar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSemestre.setToolTipText("Salir"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSemestre";
		inputMap = this.jButtonNuevoSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSemestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSemestre"));
		
		//DUPLICAR
		sMapKey = "DuplicarSemestre";
		inputMap = this.jButtonDuplicarSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSemestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSemestre"));
		
		//COPIAR
		sMapKey = "CopiarSemestre";
		inputMap = this.jButtonCopiarSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSemestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSemestre"));
		
		//VEr FORM
		sMapKey = "VerFormSemestre";
		inputMap = this.jButtonVerFormSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSemestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSemestre"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSemestre";
		inputMap = this.jButtonNuevoRelacionesSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSemestre"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSemestre";
		inputMap = this.jButtonModificarSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSemestre"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSemestre";
		inputMap = this.jButtonCerrarSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSemestre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSemestre";
		inputMap = this.jButtonGuardarCambiosTablaSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSemestre"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Semestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Semestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Semestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Semestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Semestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSemestre.setName("jPanelParametrosReportesSemestre"); 
		
		this.jPanelParametrosReportesAccionesSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSemestre.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSemestre.setName("jPanelParametrosReportesAccionesSemestre"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSemestre = new JButtonMe();
		this.jButtonRecargarInformacionSemestre.setText("Recargar");
		this.jButtonRecargarInformacionSemestre.setToolTipText("Recargar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSemestre,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSemestre = new JButtonMe();
		this.jButtonProcesarInformacionSemestre.setText("Procesar");
		this.jButtonProcesarInformacionSemestre.setToolTipText("Procesar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSemestre.setVisible(false);
			
		this.jButtonProcesarInformacionSemestre.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSemestre.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSemestre.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSemestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSemestre.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSemestre.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSemestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSemestre.setText("TIPO");       
		this.jComboBoxTiposReportesSemestre.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSemestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSemestre.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSemestre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSemestre = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSemestre.setText("Paginacion");
		this.jComboBoxTiposPaginacionSemestre.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSemestre = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSemestre.setText("Accion");
		this.jComboBoxTiposRelacionesSemestre.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSemestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSemestre.setText("Accion");
		this.jComboBoxTiposAccionesSemestre.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSemestre = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSemestre.setText("Accion");
		this.jComboBoxTiposSeleccionarSemestre.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSemestre=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSemestre.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSemestre.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSemestre.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSemestre = new JLabelMe();
		
		this.jLabelAccionesSemestre.setText("Acciones");		
		this.jLabelAccionesSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSemestre = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSemestre.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSemestre.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSemestre = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSemestre.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSemestre.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSemestre = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSemestre.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSemestre.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSemestre = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSemestre.setText("Graf.");
		this.jCheckBoxConGraficoReporteSemestre.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSemestre = new JButtonMe();
		//this.jButtonAnterioresSemestre.setText("<<");
        this.jButtonAnterioresSemestre.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSemestre,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSemestre = new JButtonMe();
		//this.jButtonSiguientesSemestre.setText(">>");
        this.jButtonSiguientesSemestre.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSemestre,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSemestre = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSemestre.setText("Nue");
        this.jButtonNuevoGuardarCambiosSemestre.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSemestre,"nuevoguardarcambios_button","Nue",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSemestre";
		inputMap = this.jButtonNuevoGuardarCambiosSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSemestre"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSemestre";
		inputMap = this.jButtonRecargarInformacionSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSemestre"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSemestre";
		inputMap = this.jButtonSiguientesSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSemestre"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSemestre";
		inputMap = this.jButtonAnterioresSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSemestre"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSemestre();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSemestre.setMinimumSize(new Dimension(this.getWidth(),SemestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SemestreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSemestre.setMaximumSize(new Dimension(this.getWidth(),SemestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SemestreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSemestre.setPreferredSize(new Dimension(this.getWidth(),SemestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SemestreBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSemestre = new GridBagLayout();

			this.jPanelPaginacionSemestre.setLayout(gridaBagLayoutPaginacionSemestre);						
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = 0;
			this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSemestre.add(this.jButtonAnterioresSemestre, this.gridBagConstraintsSemestre);
					
						
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSemestre.gridy = 0;
			
			this.jPanelPaginacionSemestre.add(this.jButtonNuevoGuardarCambiosSemestre, this.gridBagConstraintsSemestre);
						
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSemestre.gridy = 0;
			this.jPanelPaginacionSemestre.add(this.jButtonSiguientesSemestre, this.gridBagConstraintsSemestre);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = 1;
			this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSemestre.add(this.jButtonNuevoSemestre, this.gridBagConstraintsSemestre);
						
			
			
			if(!this.semestreSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSemestre = new GridBagConstraints();
				this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSemestre.gridy = 1;
				this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSemestre.add(this.jButtonGuardarCambiosTablaSemestre, this.gridBagConstraintsSemestre);
			}
			
			
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = 1;
			this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSemestre.add(this.jButtonDuplicarSemestre, this.gridBagConstraintsSemestre);
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = 1;
			this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSemestre.add(this.jButtonCopiarSemestre, this.gridBagConstraintsSemestre);
		
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = 1;
			this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSemestre.add(this.jButtonVerFormSemestre, this.gridBagConstraintsSemestre);
		
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = 1;
			this.gridBagConstraintsSemestre.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSemestre.add(this.jButtonCerrarSemestre, this.gridBagConstraintsSemestre);
		
		
		
		this.jButtonRecargarInformacionSemestre.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSemestre.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSemestre.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSemestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSemestre.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSemestre.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSemestre.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSemestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSemestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSemestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSemestre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSemestre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSemestre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSemestre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSemestre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSemestre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSemestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSemestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSemestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSemestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSemestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSemestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSemestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSemestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSemestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSemestre.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSemestre.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSemestre.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSemestre.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSemestre.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSemestre.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSemestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSemestre.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSemestre.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSemestre.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSemestre.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSemestre.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSemestre.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSemestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSemestre = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Semestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Semestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Semestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Semestre = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSemestre.setLayout(gridaBagParametrosReportesSemestre);
			this.jPanelParametrosReportesAccionesSemestre.setLayout(gridaBagParametrosReportesAccionesSemestre);
			
			
			this.jPanelParametrosAuxiliar1Semestre.setLayout(gridaBagParametrosAuxiliar1Semestre);
			this.jPanelParametrosAuxiliar2Semestre.setLayout(gridaBagParametrosAuxiliar2Semestre);
			this.jPanelParametrosAuxiliar3Semestre.setLayout(gridaBagParametrosAuxiliar3Semestre);
			this.jPanelParametrosAuxiliar4Semestre.setLayout(gridaBagParametrosAuxiliar4Semestre);
			//this.jPanelParametrosAuxiliar5Semestre.setLayout(gridaBagParametrosAuxiliar2Semestre);			
			
			
			
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSemestre.add(this.jButtonRecargarInformacionSemestre, this.gridBagConstraintsSemestre);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Semestre.add(this.jComboBoxTiposPaginacionSemestre, this.gridBagConstraintsSemestre);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Semestre.add(this.jCheckBoxConAltoMaximoTablaSemestre, this.gridBagConstraintsSemestre);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Semestre.add(this.jComboBoxTiposArchivosReportesSemestre, this.gridBagConstraintsSemestre);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSemestre.add(this.jPanelParametrosAuxiliar1Semestre, this.gridBagConstraintsSemestre);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSemestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Semestre.add(this.jComboBoxTiposReportesSemestre, this.gridBagConstraintsSemestre);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSemestre.add(this.jPanelParametrosAuxiliar4Semestre, this.gridBagConstraintsSemestre);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSemestre.add(this.jComboBoxTiposReportesSemestre, this.gridBagConstraintsSemestre);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSemestre.add(this.jCheckBoxGenerarReporteSemestre, this.gridBagConstraintsSemestre);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSemestre.add(this.jPanelParametrosAuxiliar2Semestre, this.gridBagConstraintsSemestre);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSemestre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSemestre.add(this.jLabelAccionesSemestre, this.gridBagConstraintsSemestre);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSemestre = new GridBagConstraints();
				this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSemestre.add(this.jButtonAbrirOrderBySemestre, this.gridBagConstraintsSemestre);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSemestre.add(this.jComboBoxTiposSeleccionarSemestre, this.gridBagConstraintsSemestre);			
			
			
			/*
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSemestre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSemestre.add(this.jCheckBoxSeleccionarTodosSemestre, this.gridBagConstraintsSemestre);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSemestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Semestre.add(this.jCheckBoxSeleccionarTodosSemestre, this.gridBagConstraintsSemestre);															
				
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSemestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Semestre.add(this.jCheckBoxSeleccionadosSemestre, this.gridBagConstraintsSemestre);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSemestre.add(this.jPanelParametrosAuxiliar3Semestre, this.gridBagConstraintsSemestre);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSemestre.add(this.jComboBoxTiposRelacionesSemestre, this.gridBagConstraintsSemestre);
				
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSemestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSemestre.add(this.jComboBoxTiposAccionesSemestre, this.gridBagConstraintsSemestre);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSemestre = new GridBagLayout();

			this.jScrollPanelDatosSemestre.setLayout(gridaBagLayoutDatosSemestre);
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = 0;
			this.gridBagConstraintsSemestre.gridx = 0;
			
			this.jScrollPanelDatosSemestre.add(this.jTableDatosSemestre, this.gridBagConstraintsSemestre);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSemestre.setViewportView(this.jTableDatosSemestre);
		this.jTableDatosSemestre.setFillsViewportHeight(true);
		this.jTableDatosSemestre.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSemestre= new GridBagLayout();
		this.jPanelAccionesSemestre.setLayout(gridaBagLayoutAccionesSemestre);
		
		
		/*	
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = 0;
		this.gridBagConstraintsSemestre.gridx = 0;
			
		this.jPanelAccionesSemestre.add(this.jButtonNuevoSemestre, this.gridBagConstraintsSemestre);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSemestre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSemestre);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.semestreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSemestre = new GridBagConstraints();						
			this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSemestre.gridx = 0;		
			//this.gridBagConstraintsSemestre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSemestre.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSemestre, this.gridBagConstraintsSemestre);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSemestre.gridx = 0;		
		//this.gridBagConstraintsSemestre.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSemestre.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSemestre);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSemestre, this.gridBagConstraintsSemestre);								
		
		
		/*
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSemestre, this.gridBagConstraintsSemestre);
		*/		
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSemestre.gridx =0;
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSemestre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSemestre, this.gridBagConstraintsSemestre);
				
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSemestre, this.gridBagConstraintsSemestre);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SemestreJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSemestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSemestre = new GridBagLayout();
			this.jPanelBusquedasParametrosSemestre.setLayout(gridaBagLayoutBusquedasParametrosSemestre);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSemestre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSemestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSemestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSemestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSemestre, this.gridBagConstraintsSemestre);
			
			
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSemestre, this.gridBagConstraintsSemestre);
		
			
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSemestre, this.gridBagConstraintsSemestre);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSemestre;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSemestre() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSemestre = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSemestre.setName("jPanelReporteDinamicoSemestre"); 
		
		this.jPanelReporteDinamicoSemestre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSemestre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSemestre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSemestre.setLayout(gridaBagLayoutReporteDinamicoSemestre);
		
		
		this.jInternalFrameReporteDinamicoSemestre= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSemestre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSemestre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSemestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSemestre.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSemestre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSemestre.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSemestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSemestre.setResizable(true);
	    this.jInternalFrameReporteDinamicoSemestre.setClosable(true);
	    this.jInternalFrameReporteDinamicoSemestre.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSemestre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSemestre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSemestre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Semestres"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSemestre = new JLabelMe();

		this.jLabelColumnasSelectReporteSemestre.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSemestre.add(this.jLabelColumnasSelectReporteSemestre, this.gridBagConstraintsSemestre);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSemestre = new JList<Reporte>();
		this.jListColumnasSelectReporteSemestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSemestre.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSemestre.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSemestre.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSemestre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSemestre=new JScrollPane(this.jListColumnasSelectReporteSemestre);
			
			this.jScrollColumnasSelectReporteSemestre.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSemestre.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSemestre.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSemestre.add(this.jListColumnasSelectReporteSemestre, this.gridBagConstraintsSemestre);
		this.jPanelReporteDinamicoSemestre.add(this.jScrollColumnasSelectReporteSemestre, this.gridBagConstraintsSemestre);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSemestre = new JLabelMe();

		this.jLabelRelacionesSelectReporteSemestre.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSemestre = new JList<Reporte>();
		this.jListRelacionesSelectReporteSemestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSemestre.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSemestre.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSemestre.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSemestre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSemestre=new JScrollPane(this.jListRelacionesSelectReporteSemestre);
			
			this.jScrollRelacionesSelectReporteSemestre.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSemestre.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSemestre.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSemestre = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSemestre = new JComboBoxMe();
		this.jListColumnasValoresGraficoSemestre = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSemestre = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSemestre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSemestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSemestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSemestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSemestre = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSemestre.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSemestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSemestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSemestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSemestre = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSemestre.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSemestre.add(this.jLabelGenerarExcelReporteDinamicoSemestre, this.gridBagConstraintsSemestre);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSemestre = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSemestre.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSemestre,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSemestre.setToolTipText("Generar EXCEL"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSemestre = new GridBagConstraints();
		//this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSemestre.add(this.jButtonGenerarExcelReporteDinamicoSemestre, this.gridBagConstraintsSemestre);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSemestre.add(this.jComboBoxTiposReportesDinamicoSemestre, this.gridBagConstraintsSemestre);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSemestre = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSemestre.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSemestre.add(this.jLabelTiposArchivoReporteDinamicoSemestre, this.gridBagConstraintsSemestre);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSemestre.add(this.jComboBoxTiposArchivosReportesDinamicoSemestre, this.gridBagConstraintsSemestre);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSemestre = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSemestre.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSemestre,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSemestre.setToolTipText("Generar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSemestre.add(this.jButtonGenerarReporteDinamicoSemestre, this.gridBagConstraintsSemestre);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSemestre = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSemestre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSemestre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSemestre.setToolTipText("Cancelar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSemestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSemestre.add(this.jButtonCerrarReporteDinamicoSemestre, this.gridBagConstraintsSemestre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSemestre = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSemestre= new JScrollPane(jPanelReporteDinamicoSemestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSemestre.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSemestre.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSemestre.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Semestres"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSemestre.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSemestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSemestre.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSemestre);
		this.jInternalFrameReporteDinamicoSemestre.getContentPane().add(this.jScrollPanelReporteDinamicoSemestre, this.gridBagConstraintsSemestre);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSemestre() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSemestre = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSemestre.setName("jPanelImportacionSemestre"); 
		
		this.jPanelImportacionSemestre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSemestre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSemestre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSemestre.setLayout(gridaBagLayoutImportacionSemestre);
		
		
		this.jInternalFrameImportacionSemestre= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSemestre= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSemestre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSemestre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSemestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSemestre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSemestre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSemestre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSemestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSemestre.setResizable(true);
	    this.jInternalFrameImportacionSemestre.setClosable(true);
	    this.jInternalFrameImportacionSemestre.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSemestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSemestre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSemestre.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSemestre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSemestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSemestre.setResizable(true);
	    this.jInternalFrameImportacionSemestre.setClosable(true);
	    this.jInternalFrameImportacionSemestre.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSemestre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSemestre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSemestre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Semestres"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSemestre = new JLabelMe();

		this.jLabelArchivoImportacionSemestre.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSemestre.gridy = iPosYImportacion;		
		this.gridBagConstraintsSemestre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSemestre.add(this.jLabelArchivoImportacionSemestre, this.gridBagConstraintsSemestre);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSemestre = new JFileChooser();		
		this.jFileChooserImportacionSemestre.setToolTipText("ESCOGER ARCHIVO"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSemestre = new JButtonMe();
		this.jButtonAbrirImportacionSemestre.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSemestre,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSemestre.setToolTipText("Generar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = iPosYImportacion;
		this.gridBagConstraintsSemestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSemestre.add(this.jButtonAbrirImportacionSemestre, this.gridBagConstraintsSemestre);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSemestre = new JLabelMe();

		this.jLabelPathArchivoImportacionSemestre.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSemestre.gridy = iPosYImportacion;		
		this.gridBagConstraintsSemestre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSemestre.add(this.jLabelPathArchivoImportacionSemestre, this.gridBagConstraintsSemestre);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSemestre=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSemestre.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSemestre.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSemestre.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = iPosYImportacion;
		this.gridBagConstraintsSemestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSemestre.add(this.jTextFieldPathArchivoImportacionSemestre, this.gridBagConstraintsSemestre);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSemestre = new JButtonMe();
		this.jButtonGenerarImportacionSemestre.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSemestre,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSemestre.setToolTipText("Generar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = iPosYImportacion;
		this.gridBagConstraintsSemestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSemestre.add(this.jButtonGenerarImportacionSemestre, this.gridBagConstraintsSemestre);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSemestre = new JButtonMe();
		this.jButtonCerrarImportacionSemestre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSemestre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSemestre.setToolTipText("Cancelar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = iPosYImportacion;
		this.gridBagConstraintsSemestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSemestre.add(this.jButtonCerrarImportacionSemestre, this.gridBagConstraintsSemestre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSemestre = new GridBagLayout();
		
		this.jScrollPanelImportacionSemestre= new JScrollPane(jPanelImportacionSemestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy =iPosYImportacion;
		this.gridBagConstraintsSemestre.gridx =iPosXImportacion;
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSemestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSemestre.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSemestre);
		this.jInternalFrameImportacionSemestre.getContentPane().add(this.jScrollPanelImportacionSemestre, this.gridBagConstraintsSemestre);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySemestre(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySemestre = new JButtonMe();
			this.jButtonAbrirOrderBySemestre.setText("Orden");
			this.jButtonAbrirOrderBySemestre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySemestre,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySemestre";
			inputMap = this.jButtonAbrirOrderBySemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySemestre"));
		
		
			GridBagLayout gridaBagLayoutOrderBySemestre = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySemestre.setName("jPanelOrderBySemestre"); 
			
			this.jPanelOrderBySemestre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySemestre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySemestre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySemestre.setLayout(gridaBagLayoutOrderBySemestre);
			
			
			this.jTableDatosSemestreOrderBy = new JTableMe();        
			this.jTableDatosSemestreOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSemestreOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSemestreOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSemestreOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSemestreOrderBy.setViewportView(this.jTableDatosSemestreOrderBy);
			this.jTableDatosSemestreOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSemestreOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySemestre= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySemestre= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySemestre = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSemestre= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySemestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySemestre.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySemestre.setTitle("Orden");
			this.jInternalFrameOrderBySemestre.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySemestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySemestre.setResizable(true);
			this.jInternalFrameOrderBySemestre.setClosable(true);
			this.jInternalFrameOrderBySemestre.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySemestre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySemestre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySemestre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Semestres"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSemestre.gridx =iPosXOrderBy;
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSemestre.ipady =150;
				
			this.jPanelOrderBySemestre.add(jScrollPanelDatosSemestreOrderBy, this.gridBagConstraintsSemestre);//this.jTableDatosSemestreTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySemestre = new JButtonMe();
			this.jButtonCerrarOrderBySemestre.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySemestre,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySemestre.setToolTipText("Cancelar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSemestre.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySemestre.add(this.jButtonCerrarOrderBySemestre, this.gridBagConstraintsSemestre);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSemestre = new GridBagLayout();
			
			this.jScrollPanelOrderBySemestre= new JScrollPane(jPanelOrderBySemestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy =iPosYOrderBy;
			this.gridBagConstraintsSemestre.gridx =iPosXOrderBy;
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySemestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySemestre.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSemestre);
			
			this.jInternalFrameOrderBySemestre.getContentPane().add(this.jScrollPanelOrderBySemestre, this.gridBagConstraintsSemestre);			
		
		} else {
			this.jButtonAbrirOrderBySemestre = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.semestreSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSemestre.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSemestre.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSemestre.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSemestre.getRowHeight();//SemestreConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SemestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSemestre.isSelected()) {
					iHeightTable=SemestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SemestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SemestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SemestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSemestre.isSelected()) {
					iHeightTable=SemestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SemestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SemestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSemestre.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSemestre.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSemestre.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSemestre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSemestre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSemestre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySemestre!=null && this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy()!=null) {
			//if(!this.semestreSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySemestre.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySemestre.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySemestre.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSemestre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSemestre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSemestre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=semestreLogic.getSemestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=semestres.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Semestre> TraerSemestreBeans(List<Semestre> semestres,ArrayList<Classe> classes)throws Exception {
		try {
			for(Semestre semestre:semestres) {
					
				if(!(SemestreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SemestreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					semestre.setsDetalleGeneralEntityReporte(SemestreConstantesFunciones.getSemestreDescripcion(semestre));
										
						
					
						
					
				} else  {
							
					//semestre.setsDetalleGeneralEntityReporte(semestre.getsDetalleGeneralEntityReporte());
										
				}
				
				//semestrebeans.add(semestrebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return semestres;
    }
	//PARA REPORTES FIN
}
