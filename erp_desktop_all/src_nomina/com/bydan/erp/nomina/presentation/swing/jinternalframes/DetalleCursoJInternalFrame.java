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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.DetalleCursoConstantesFunciones;

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
public class DetalleCursoJInternalFrame extends DetalleCursoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleCurso;
	
	protected JMenuBar jmenuBarDetalleCurso;
	
	protected JMenu jmenuDetalleCurso;
	protected JMenu jmenuDatosDetalleCurso;
	protected JMenu jmenuArchivoDetalleCurso;
	protected JMenu jmenuAccionesDetalleCurso;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCurso;	
	protected GridBagConstraints gridBagConstraintsDetalleCurso;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleCursoDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleCurso;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleCurso;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleCurso;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_curso="";
	
	public DetalleCursoSessionBean detallecursoSessionBean;
		
	
	
	public CursoSessionBean cursoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleCurso> detallecursos;		
	public List<DetalleCurso> detallecursosEliminados;	
	public List<DetalleCurso> detallecursosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleCurso;		
	protected JButton jButtonAbrirOrderByDetalleCurso;
	
	
	//protected JPanel jPanelOrderByDetalleCurso;
	//public JScrollPane jScrollPanelOrderByDetalleCurso;	
	//protected JButton jButtonCerrarOrderByDetalleCurso;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleCursoLogic detallecursoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleCurso;
	public JScrollPane jScrollPanelDatosEdicionDetalleCurso;
	public JScrollPane jScrollPanelDatosGeneralDetalleCurso;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleCursoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleCurso;
	//public JScrollPane jScrollPanelImportacionDetalleCurso;
	
	
	
	protected JPanel jPanelAccionesDetalleCurso;
	
    protected JPanel jPanelPaginacionDetalleCurso;
    protected JPanel jPanelParametrosReportesDetalleCurso;
	protected JPanel jPanelParametrosReportesAccionesDetalleCurso;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleCurso;
	protected JPanel jPanelParametrosAuxiliar2DetalleCurso;
	protected JPanel jPanelParametrosAuxiliar3DetalleCurso;
	protected JPanel jPanelParametrosAuxiliar4DetalleCurso;
	//protected JPanel jPanelParametrosAuxiliar5DetalleCurso;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleCurso;
	//protected JPanel jPanelImportacionDetalleCurso;
	
	
	public JTable jTableDatosDetalleCurso;
	
	
	
	//public JTable jTableDatosDetalleCursoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleCurso;
	protected JButton jButtonDuplicarDetalleCurso;
	protected JButton jButtonCopiarDetalleCurso;
	protected JButton jButtonVerFormDetalleCurso;
	protected JButton jButtonNuevoRelacionesDetalleCurso;
	protected JButton jButtonModificarDetalleCurso;
	
    protected JButton jButtonGuardarCambiosTablaDetalleCurso;
	protected JButton jButtonCerrarDetalleCurso;
	
	
	protected JButton jButtonRecargarInformacionDetalleCurso;
	protected JButton jButtonProcesarInformacionDetalleCurso;
	
	
	protected JButton jButtonAnterioresDetalleCurso;
	protected JButton jButtonSiguientesDetalleCurso;
	protected JButton jButtonNuevoGuardarCambiosDetalleCurso;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleCurso;
	//protected JButton jButtonCerrarReporteDinamicoDetalleCurso;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleCurso;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleCurso;
	//protected JButton jButtonGenerarImportacionDetalleCurso;
	//protected JButton jButtonCerrarImportacionDetalleCurso;
	//protected JFileChooser jFileChooserImportacionDetalleCurso;
	//protected File fileImportacionDetalleCurso;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleCurso;
	protected JButton jButtonDuplicarToolBarDetalleCurso;
	protected JButton jButtonNuevoRelacionesToolBarDetalleCurso;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleCurso;
	protected JButton jButtonCopiarToolBarDetalleCurso;
	protected JButton jButtonVerFormToolBarDetalleCurso;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleCurso;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCurso;
	protected JButton jButtonCerrarToolBarDetalleCurso;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleCurso;
	protected JButton jButtonProcesarInformacionToolBarDetalleCurso;
	protected JButton jButtonAnterioresToolBarDetalleCurso;
	protected JButton jButtonSiguientesToolBarDetalleCurso;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleCurso;
	protected JButton jButtonAbrirOrderByToolBarDetalleCurso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleCurso;
	protected JMenuItem jMenuItemDuplicarDetalleCurso;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleCurso;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleCurso;
	protected JMenuItem jMenuItemCopiarDetalleCurso;
	protected JMenuItem jMenuItemVerFormDetalleCurso;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCurso;
	protected JMenuItem jMenuItemCerrarDetalleCurso;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCurso;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleCurso;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCurso;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleCurso;
	protected JMenuItem jMenuItemProcesarInformacionDetalleCurso;
	protected JMenuItem jMenuItemAnterioresDetalleCurso;
	protected JMenuItem jMenuItemSiguientesDetalleCurso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCurso;
	protected JMenuItem jMenuItemAbrirOrderByDetalleCurso;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCurso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCurso;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleCurso;
	protected JCheckBox jCheckBoxSeleccionadosDetalleCurso;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleCurso;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleCurso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCurso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleCurso;
	protected JTextField jTextFieldValorCampoGeneralDetalleCurso;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleCurso;
	//public JList<Reporte> jListColumnasSelectReporteDetalleCurso;
	//public JScrollPane jScrollColumnasSelectReporteDetalleCurso;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleCurso;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleCurso;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleCurso;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleCurso;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleCurso;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleCurso;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleCurso;
	
		
	//public JLabel jLabelArchivoImportacionDetalleCurso;	
	//public JLabel jLabelPathArchivoImportacionDetalleCurso;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleCurso;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleCurso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleCurso;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleCurso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleCurso;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleCurso;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleCurso;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleCurso;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleCurso;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleCurso;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleCurso;
	public JPanel jPanelFK_IdCursoDetalleCurso;
	public JButton jButtonFK_IdCursoDetalleCurso;
	
	public JPanel jPanelid_cursoFK_IdCursoDetalleCurso;
	public JLabel jLabelid_cursoFK_IdCursoDetalleCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cursoFK_IdCursoDetalleCurso;
	public JButton jButtonid_cursoFK_IdCursoDetalleCurso= new JButtonMe();
	public JButton jButtonid_cursoFK_IdCursoDetalleCursoUpdate= new JButtonMe();
	public JButton jButtonid_cursoFK_IdCursoDetalleCursoBusqueda= new JButtonMe();

	
	
	
	
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
	public DetalleCursoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCursoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCursoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCursoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleCurso)	{
		this.jButtonRecargarInformacionDetalleCurso = jButtonRecargarInformacionDetalleCurso;
	}
	
	public JButton getjButtonProcesarInformacionDetalleCurso() {
		return this.jButtonProcesarInformacionDetalleCurso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCurso)	{
		this.jButtonProcesarInformacionDetalleCurso = jButtonProcesarInformacionDetalleCurso;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleCurso() {
		return this.jButtonRecargarInformacionDetalleCurso;
	}
	
	
	public List<DetalleCurso> getdetallecursos() {
		return this.detallecursos;
	}

	public void setdetallecursos(List<DetalleCurso> detallecursos) {
		this.detallecursos = detallecursos;
	}
	
	public List<DetalleCurso> getdetallecursosAux() {
		return this.detallecursosAux;
	}

	public void setdetallecursosAux(List<DetalleCurso> detallecursosAux) {
		this.detallecursosAux = detallecursosAux;
	}
	
	public List<DetalleCurso> getdetallecursosEliminados() {
		return this.detallecursosEliminados;
	}

	public void setDetalleCursosEliminados(List<DetalleCurso> detallecursosEliminados) {
		this.detallecursosEliminados = detallecursosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleCurso() {
		return jComboBoxTiposSeleccionarDetalleCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleCurso(
			JComboBox jComboBoxTiposSeleccionarDetalleCurso) {
		this.jComboBoxTiposSeleccionarDetalleCurso = jComboBoxTiposSeleccionarDetalleCurso;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleCurso .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleCurso() {
		return jTextFieldValorCampoGeneralDetalleCurso;
	}

	public void setjTextFieldValorCampoGeneralDetalleCurso(
			JTextField jTextFieldValorCampoGeneralDetalleCurso) {
		this.jTextFieldValorCampoGeneralDetalleCurso = jTextFieldValorCampoGeneralDetalleCurso;
	}

	public void setBorderResaltarValorCampoGeneralDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleCurso .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleCurso() {
		return this.jCheckBoxSeleccionarTodosDetalleCurso;
	}

	public void setjCheckBoxSeleccionarTodosDetalleCurso(
			JCheckBox jCheckBoxSeleccionarTodosDetalleCurso) {
		this.jCheckBoxSeleccionarTodosDetalleCurso = jCheckBoxSeleccionarTodosDetalleCurso;
	}

	public void setBorderResaltarSeleccionarTodosDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleCurso .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleCurso() {
		return this.jCheckBoxSeleccionadosDetalleCurso;
	}

	public void setjCheckBoxSeleccionadosDetalleCurso(
			JCheckBox jCheckBoxSeleccionadosDetalleCurso) {
		this.jCheckBoxSeleccionadosDetalleCurso = jCheckBoxSeleccionadosDetalleCurso;
	}
	
	public void setBorderResaltarSeleccionadosDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleCurso .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleCurso() {
		return this.jComboBoxTiposArchivosReportesDetalleCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleCurso(
			JComboBox jComboBoxTiposArchivosReportesDetalleCurso) {
		this.jComboBoxTiposArchivosReportesDetalleCurso = jComboBoxTiposArchivosReportesDetalleCurso;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleCurso() {
		return this.jComboBoxTiposReportesDetalleCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleCurso(
			JComboBox jComboBoxTiposReportesDetalleCurso) {
		this.jComboBoxTiposReportesDetalleCurso = jComboBoxTiposReportesDetalleCurso;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleCurso() {
	//	return jComboBoxTiposReportesDinamicoDetalleCurso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleCurso(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleCurso) {
	//	this.jComboBoxTiposReportesDinamicoDetalleCurso = jComboBoxTiposReportesDinamicoDetalleCurso;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleCurso() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleCurso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleCurso(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCurso) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleCurso = jComboBoxTiposArchivosReportesDinamicoDetalleCurso;
	//}
	
	public void setBorderResaltarTiposReportesDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleCurso() {
		return this.jComboBoxTiposGraficosReportesDetalleCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleCurso(
			JComboBox jComboBoxTiposGraficosReportesDetalleCurso) {
		this.jComboBoxTiposGraficosReportesDetalleCurso = jComboBoxTiposGraficosReportesDetalleCurso;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleCurso() {
		return this.jComboBoxTiposPaginacionDetalleCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleCurso(
			JComboBox jComboBoxTiposPaginacionDetalleCurso) {
		this.jComboBoxTiposPaginacionDetalleCurso = jComboBoxTiposPaginacionDetalleCurso;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleCurso() {
		return this.jComboBoxTiposRelacionesDetalleCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCurso() {
		return this.jComboBoxTiposAccionesDetalleCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCurso(
			JComboBox jComboBoxTiposRelacionesDetalleCurso) {
		this.jComboBoxTiposRelacionesDetalleCurso = jComboBoxTiposRelacionesDetalleCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCurso(
			JComboBox jComboBoxTiposAccionesDetalleCurso) {
		this.jComboBoxTiposAccionesDetalleCurso = jComboBoxTiposAccionesDetalleCurso;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleCurso .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleCurso .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleCurso() {
	//	return jCheckBoxConGraficoDinamicoDetalleCurso;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleCurso(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleCurso) {
	//	this.jCheckBoxConGraficoDinamicoDetalleCurso = jCheckBoxConGraficoDinamicoDetalleCurso;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleCurso() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleCurso.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleCurso .setBorder(borderResaltar);		
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
		this.detallecursoSessionBean=new DetalleCursoSessionBean();
		
		this.detallecursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallecursoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleCursoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleCursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleCursoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleCursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleCursoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Curso MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleCursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCurso= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"nuevo","nuevo","Nuevo"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"duplicar","duplicar","Duplicar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"copiar","copiar","Copiar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"ver_form","ver_form","Ver"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"recargar","recargar","Recargar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleCurso,this.jTtoolBarDetalleCurso,
							"cerrar","cerrar","Salir"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleCurso=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleCurso;
			
				this.jButtonProcesarInformacionToolBarDetalleCurso=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleCurso;
				
		//protected JButton jButtonModificarToolBarDetalleCurso;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleCurso=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleCurso=new JMenuMe("General");
		this.jmenuArchivoDetalleCurso=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleCurso=new JMenuMe("Acciones");
		this.jmenuDatosDetalleCurso=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCurso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCurso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCurso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleCurso= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleCurso.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleCurso,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleCurso= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleCurso.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleCurso,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleCurso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCurso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCurso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleCurso= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleCurso.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleCurso,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleCurso= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleCurso.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleCurso,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleCurso= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleCurso.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleCurso,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleCurso= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleCurso.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleCurso,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleCurso= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleCurso.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleCurso,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleCurso= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleCurso.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleCurso,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleCurso= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleCurso.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleCurso,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleCurso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleCurso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleCurso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCurso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleCurso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleCurso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleCurso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCurso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleCurso= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleCurso.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleCurso,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleCurso.add(this.jMenuItemCerrarDetalleCurso);
			
			this.jmenuAccionesDetalleCurso.add(this.jMenuItemNuevoDetalleCurso);
			this.jmenuAccionesDetalleCurso.add(this.jMenuItemNuevoGuardarCambiosDetalleCurso);
			this.jmenuAccionesDetalleCurso.add(this.jMenuItemNuevoRelacionesDetalleCurso);
			this.jmenuAccionesDetalleCurso.add(this.jMenuItemGuardarCambiosTablaDetalleCurso);		
			this.jmenuAccionesDetalleCurso.add(this.jMenuItemDuplicarDetalleCurso);		
			this.jmenuAccionesDetalleCurso.add(this.jMenuItemCopiarDetalleCurso);		
			this.jmenuAccionesDetalleCurso.add(this.jMenuItemVerFormDetalleCurso);		
			
			this.jmenuDatosDetalleCurso.add(this.jMenuItemRecargarInformacionDetalleCurso);				
			this.jmenuDatosDetalleCurso.add(this.jMenuItemAnterioresDetalleCurso);				
			this.jmenuDatosDetalleCurso.add(this.jMenuItemSiguientesDetalleCurso);				
			this.jmenuDatosDetalleCurso.add(this.jMenuItemAbrirOrderByDetalleCurso);				
			this.jmenuDatosDetalleCurso.add(this.jMenuItemMostrarOcultarDetalleCurso);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleCurso.add(this.jMenuItemGuardarCambiosDetalleCurso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCurso.add(this.jmenuArchivoDetalleCurso);		
			this.jmenuBarDetalleCurso.add(this.jmenuAccionesDetalleCurso);		
			this.jmenuBarDetalleCurso.add(this.jmenuDatosDetalleCurso);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleCurso);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleCurso() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCursoDetalleCurso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCursoDetalleCurso.setToolTipText("Buscar Por Curso ");
		this.jButtonFK_IdCursoDetalleCurso= new JButtonMe();
		this.jButtonFK_IdCursoDetalleCurso.setText("Buscar");
		this.jButtonFK_IdCursoDetalleCurso.setToolTipText("Buscar Por Curso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCursoDetalleCurso,"buscar_button","Buscar Por Curso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCursoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cursoFK_IdCursoDetalleCurso = new JLabelMe();
		jLabelid_cursoFK_IdCursoDetalleCurso.setText("Curso :");
		jLabelid_cursoFK_IdCursoDetalleCurso.setToolTipText("Curso");
		jLabelid_cursoFK_IdCursoDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cursoFK_IdCursoDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cursoFK_IdCursoDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cursoFK_IdCursoDetalleCurso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cursoFK_IdCursoDetalleCurso= new JComboBoxMe();
		jComboBoxid_cursoFK_IdCursoDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cursoFK_IdCursoDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cursoFK_IdCursoDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cursoFK_IdCursoDetalleCurso,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleCurso=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleCurso.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCurso.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCurso.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleCurso,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleCurso = new DetalleCursoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Curso DATOS");
			this.jInternalFrameDetalleFormDetalleCurso = new DetalleCursoDetalleFormJInternalFrame(jDesktopPane,this.detallecursoSessionBean.getConGuardarRelaciones(),this.detallecursoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleCurso = null;//new DetalleCursoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleCurso= new GridBagLayout();
		
		
		this.jTableDatosDetalleCurso = new JTableMe();      
		
		String sToolTipDetalleCurso="";
		sToolTipDetalleCurso=DetalleCursoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCurso+="(Nomina.DetalleCurso)";
		}
		
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCurso+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleCurso.setToolTipText(sToolTipDetalleCurso);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleCurso);
		this.jTableDatosDetalleCurso.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleCurso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleCurso.setRowSelectionAllowed(true);
		this.jTableDatosDetalleCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleCurso,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleCurso = new JButtonMe();
		this.jButtonDuplicarDetalleCurso = new JButtonMe();
		this.jButtonCopiarDetalleCurso = new JButtonMe();
		this.jButtonVerFormDetalleCurso = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleCurso = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleCurso = new JButtonMe();
		this.jButtonCerrarDetalleCurso = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCurso = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleCurso = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Curso";
		
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cursos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCurso.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCurso.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleCurso=new ReporteDinamicoJInternalFrame(DetalleCursoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleCurso();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleCurso=new ImportacionJInternalFrame(DetalleCursoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleCurso();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleCurso = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleCurso.setText("Orden");
		this.jButtonAbrirOrderByDetalleCurso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCurso,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCurso,false,this);
			
			//this.cargarOrderByDetalleCurso(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCurso,true,this);
			
			//this.cargarOrderByDetalleCurso(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleCurso.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleCurso.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleCurso.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosDetalleCurso.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCurso.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCurso.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleCurso.setText("Nuevo");
		this.jButtonDuplicarDetalleCurso.setText("Duplicar");
		this.jButtonCopiarDetalleCurso.setText("Copiar");
		this.jButtonVerFormDetalleCurso.setText("Ver");
		this.jButtonNuevoRelacionesDetalleCurso.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleCurso.setText("Guardar");
		this.jButtonCerrarDetalleCurso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCurso,"nuevo_button","Nuevo",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleCurso,"duplicar_button","Duplicar",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleCurso,"copiar_button","Copiar",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleCurso,"ver_form","Ver",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleCurso,"nuevorelaciones_button","Nuevo Rel",this.detallecursoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCurso,"guardarcambiostabla_button","Guardar",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCurso,"cerrar_button","Salir",this.detallecursoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleCurso.setToolTipText("Nuevo"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleCurso.setToolTipText("Duplicar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleCurso.setToolTipText("Copiar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleCurso.setToolTipText("Ver"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleCurso.setToolTipText("Nuevo Rel"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleCurso.setToolTipText("Guardar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCurso.setToolTipText("Salir"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCurso";
		inputMap = this.jButtonNuevoDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCurso"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleCurso";
		inputMap = this.jButtonDuplicarDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleCurso"));
		
		//COPIAR
		sMapKey = "CopiarDetalleCurso";
		inputMap = this.jButtonCopiarDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleCurso"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleCurso";
		inputMap = this.jButtonVerFormDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleCurso"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleCurso";
		inputMap = this.jButtonNuevoRelacionesDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleCurso"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleCurso";
		inputMap = this.jButtonModificarDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleCurso"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleCurso";
		inputMap = this.jButtonCerrarDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCurso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCurso";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCurso"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleCurso.setName("jPanelParametrosReportesDetalleCurso"); 
		
		this.jPanelParametrosReportesAccionesDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleCurso.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleCurso.setName("jPanelParametrosReportesAccionesDetalleCurso"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleCurso = new JButtonMe();
		this.jButtonRecargarInformacionDetalleCurso.setText("Recargar");
		this.jButtonRecargarInformacionDetalleCurso.setToolTipText("Recargar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleCurso,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleCurso = new JButtonMe();
		this.jButtonProcesarInformacionDetalleCurso.setText("Procesar");
		this.jButtonProcesarInformacionDetalleCurso.setToolTipText("Procesar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleCurso.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleCurso.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCurso.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCurso.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCurso.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleCurso.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCurso.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleCurso.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCurso.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleCurso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleCurso.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleCurso.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleCurso.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleCurso.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCurso.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCurso.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleCurso.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleCurso.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleCurso=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleCurso.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCurso.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCurso.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleCurso = new JLabelMe();
		
		this.jLabelAccionesDetalleCurso.setText("Acciones");		
		this.jLabelAccionesDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleCurso = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleCurso.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleCurso.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleCurso = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleCurso.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleCurso.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleCurso = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleCurso.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleCurso.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleCurso = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleCurso.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleCurso.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleCurso = new JButtonMe();
		//this.jButtonAnterioresDetalleCurso.setText("<<");
        this.jButtonAnterioresDetalleCurso.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleCurso,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleCurso = new JButtonMe();
		//this.jButtonSiguientesDetalleCurso.setText(">>");
        this.jButtonSiguientesDetalleCurso.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleCurso,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleCurso = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleCurso.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleCurso.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleCurso,"nuevoguardarcambios_button","Nue",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleCurso";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleCurso"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleCurso";
		inputMap = this.jButtonRecargarInformacionDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleCurso"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleCurso";
		inputMap = this.jButtonSiguientesDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleCurso"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleCurso";
		inputMap = this.jButtonAnterioresDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleCurso"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleCurso();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleCurso.setMinimumSize(new Dimension(this.getWidth(),DetalleCursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCursoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleCurso.setMaximumSize(new Dimension(this.getWidth(),DetalleCursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCursoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleCurso.setPreferredSize(new Dimension(this.getWidth(),DetalleCursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCursoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleCurso = new GridBagLayout();

			this.jPanelPaginacionDetalleCurso.setLayout(gridaBagLayoutPaginacionDetalleCurso);						
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = 0;
			this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleCurso.add(this.jButtonAnterioresDetalleCurso, this.gridBagConstraintsDetalleCurso);
					
						
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCurso.gridy = 0;
			
			this.jPanelPaginacionDetalleCurso.add(this.jButtonNuevoGuardarCambiosDetalleCurso, this.gridBagConstraintsDetalleCurso);
						
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCurso.gridy = 0;
			this.jPanelPaginacionDetalleCurso.add(this.jButtonSiguientesDetalleCurso, this.gridBagConstraintsDetalleCurso);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = 1;
			this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCurso.add(this.jButtonNuevoDetalleCurso, this.gridBagConstraintsDetalleCurso);
						
			
			
			if(!this.detallecursoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
				this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleCurso.gridy = 1;
				this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleCurso.add(this.jButtonGuardarCambiosTablaDetalleCurso, this.gridBagConstraintsDetalleCurso);
			}
			
			
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = 1;
			this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCurso.add(this.jButtonDuplicarDetalleCurso, this.gridBagConstraintsDetalleCurso);
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = 1;
			this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCurso.add(this.jButtonCopiarDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = 1;
			this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCurso.add(this.jButtonVerFormDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = 1;
			this.gridBagConstraintsDetalleCurso.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleCurso.add(this.jButtonCerrarDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
		
		
		this.jButtonRecargarInformacionDetalleCurso.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCurso.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCurso.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleCurso.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCurso.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCurso.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleCurso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCurso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCurso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleCurso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCurso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCurso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleCurso.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCurso.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCurso.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleCurso.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCurso.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCurso.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleCurso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCurso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCurso.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleCurso.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCurso.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCurso.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleCurso = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleCurso = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleCurso.setLayout(gridaBagParametrosReportesDetalleCurso);
			this.jPanelParametrosReportesAccionesDetalleCurso.setLayout(gridaBagParametrosReportesAccionesDetalleCurso);
			
			
			this.jPanelParametrosAuxiliar1DetalleCurso.setLayout(gridaBagParametrosAuxiliar1DetalleCurso);
			this.jPanelParametrosAuxiliar2DetalleCurso.setLayout(gridaBagParametrosAuxiliar2DetalleCurso);
			this.jPanelParametrosAuxiliar3DetalleCurso.setLayout(gridaBagParametrosAuxiliar3DetalleCurso);
			this.jPanelParametrosAuxiliar4DetalleCurso.setLayout(gridaBagParametrosAuxiliar4DetalleCurso);
			//this.jPanelParametrosAuxiliar5DetalleCurso.setLayout(gridaBagParametrosAuxiliar2DetalleCurso);			
			
			
			
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCurso.add(this.jButtonRecargarInformacionDetalleCurso, this.gridBagConstraintsDetalleCurso);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCurso.add(this.jComboBoxTiposPaginacionDetalleCurso, this.gridBagConstraintsDetalleCurso);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCurso.add(this.jCheckBoxConAltoMaximoTablaDetalleCurso, this.gridBagConstraintsDetalleCurso);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCurso.add(this.jComboBoxTiposArchivosReportesDetalleCurso, this.gridBagConstraintsDetalleCurso);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCurso.add(this.jPanelParametrosAuxiliar1DetalleCurso, this.gridBagConstraintsDetalleCurso);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleCurso.add(this.jComboBoxTiposReportesDetalleCurso, this.gridBagConstraintsDetalleCurso);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCurso.add(this.jPanelParametrosAuxiliar4DetalleCurso, this.gridBagConstraintsDetalleCurso);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCurso.add(this.jComboBoxTiposReportesDetalleCurso, this.gridBagConstraintsDetalleCurso);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCurso.add(this.jCheckBoxGenerarReporteDetalleCurso, this.gridBagConstraintsDetalleCurso);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCurso.add(this.jPanelParametrosAuxiliar2DetalleCurso, this.gridBagConstraintsDetalleCurso);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCurso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCurso.add(this.jLabelAccionesDetalleCurso, this.gridBagConstraintsDetalleCurso);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
				this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleCurso.add(this.jButtonAbrirOrderByDetalleCurso, this.gridBagConstraintsDetalleCurso);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCurso.add(this.jComboBoxTiposSeleccionarDetalleCurso, this.gridBagConstraintsDetalleCurso);			
			
			
			/*
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCurso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCurso.add(this.jCheckBoxSeleccionarTodosDetalleCurso, this.gridBagConstraintsDetalleCurso);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCurso.add(this.jCheckBoxSeleccionarTodosDetalleCurso, this.gridBagConstraintsDetalleCurso);															
				
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCurso.add(this.jCheckBoxSeleccionadosDetalleCurso, this.gridBagConstraintsDetalleCurso);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCurso.add(this.jPanelParametrosAuxiliar3DetalleCurso, this.gridBagConstraintsDetalleCurso);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCurso.add(this.jComboBoxTiposAccionesDetalleCurso, this.gridBagConstraintsDetalleCurso);
	
				
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCurso.add(this.jTextFieldValorCampoGeneralDetalleCurso, this.gridBagConstraintsDetalleCurso);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleCurso = new GridBagLayout();

			this.jScrollPanelDatosDetalleCurso.setLayout(gridaBagLayoutDatosDetalleCurso);
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = 0;
			this.gridBagConstraintsDetalleCurso.gridx = 0;
			
			this.jScrollPanelDatosDetalleCurso.add(this.jTableDatosDetalleCurso, this.gridBagConstraintsDetalleCurso);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleCurso.setViewportView(this.jTableDatosDetalleCurso);
		this.jTableDatosDetalleCurso.setFillsViewportHeight(true);
		this.jTableDatosDetalleCurso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleCurso= new GridBagLayout();
		this.jPanelAccionesDetalleCurso.setLayout(gridaBagLayoutAccionesDetalleCurso);
		
		
		/*	
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = 0;
		this.gridBagConstraintsDetalleCurso.gridx = 0;
			
		this.jPanelAccionesDetalleCurso.add(this.jButtonNuevoDetalleCurso, this.gridBagConstraintsDetalleCurso);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCursoDetalleCurso= new GridBagLayout();
		gridaBagLayoutFK_IdCursoDetalleCurso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCursoDetalleCurso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCursoDetalleCurso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCursoDetalleCurso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCursoDetalleCurso.setLayout(gridaBagLayoutFK_IdCursoDetalleCurso);

		gridBagConstraintsDetalleCurso = new GridBagConstraints();
		gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCurso.gridy = 0;
		gridBagConstraintsDetalleCurso.gridx = 0;
		jPanelFK_IdCursoDetalleCurso.add(jLabelid_cursoFK_IdCursoDetalleCurso, gridBagConstraintsDetalleCurso);

		gridBagConstraintsDetalleCurso = new GridBagConstraints();
		gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCurso.gridy = 0;
		gridBagConstraintsDetalleCurso.gridx = 1;
		jPanelFK_IdCursoDetalleCurso.add(jComboBoxid_cursoFK_IdCursoDetalleCurso, gridBagConstraintsDetalleCurso);

		gridBagConstraintsDetalleCurso = new GridBagConstraints();
		gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCurso.gridy = 1;
		gridBagConstraintsDetalleCurso.gridx =1;
		jPanelFK_IdCursoDetalleCurso.add(jButtonFK_IdCursoDetalleCurso, gridBagConstraintsDetalleCurso);

		jTabbedPaneBusquedasDetalleCurso.addTab("1.-Por Curso ", jPanelFK_IdCursoDetalleCurso);
		jTabbedPaneBusquedasDetalleCurso.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCurso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCurso);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCurso.gridx = 0;		
			//this.gridBagConstraintsDetalleCurso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCurso.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleCurso, this.gridBagConstraintsDetalleCurso);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleCurso.gridx = 0;		
		//this.gridBagConstraintsDetalleCurso.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleCurso.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleCurso);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCurso.gridx = 0;		
			this.gridBagConstraintsDetalleCurso.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleCurso.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleCurso, this.gridBagConstraintsDetalleCurso);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleCurso, this.gridBagConstraintsDetalleCurso);								
		
		
		/*
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleCurso, this.gridBagConstraintsDetalleCurso);
		*/		
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCurso.gridx =0;
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCurso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCurso, this.gridBagConstraintsDetalleCurso);
				
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleCurso, this.gridBagConstraintsDetalleCurso);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleCursoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCurso = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleCurso.setLayout(gridaBagLayoutBusquedasParametrosDetalleCurso);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleCurso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCurso, this.gridBagConstraintsDetalleCurso);
			
			
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
			
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCurso, this.gridBagConstraintsDetalleCurso);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleCurso;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleCurso() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleCurso = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleCurso.setName("jPanelReporteDinamicoDetalleCurso"); 
		
		this.jPanelReporteDinamicoDetalleCurso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCurso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCurso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleCurso.setLayout(gridaBagLayoutReporteDinamicoDetalleCurso);
		
		
		this.jInternalFrameReporteDinamicoDetalleCurso= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleCurso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCurso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleCurso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleCurso.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleCurso.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleCurso.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleCurso.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleCurso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCurso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCurso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cursos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleCurso = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleCurso.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCurso.add(this.jLabelColumnasSelectReporteDetalleCurso, this.gridBagConstraintsDetalleCurso);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleCurso = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleCurso.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleCurso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCurso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCurso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleCurso=new JScrollPane(this.jListColumnasSelectReporteDetalleCurso);
			
			this.jScrollColumnasSelectReporteDetalleCurso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCurso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCurso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleCurso.add(this.jListColumnasSelectReporteDetalleCurso, this.gridBagConstraintsDetalleCurso);
		this.jPanelReporteDinamicoDetalleCurso.add(this.jScrollColumnasSelectReporteDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleCurso = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleCurso.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleCurso = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleCurso.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleCurso.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCurso.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCurso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleCurso=new JScrollPane(this.jListRelacionesSelectReporteDetalleCurso);
			
			this.jScrollRelacionesSelectReporteDetalleCurso.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCurso.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCurso.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleCurso = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleCurso = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleCurso = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleCurso = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleCurso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCurso = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCurso.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleCurso = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleCurso.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCurso.add(this.jLabelGenerarExcelReporteDinamicoDetalleCurso, this.gridBagConstraintsDetalleCurso);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleCurso = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleCurso.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleCurso,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleCurso.setToolTipText("Generar EXCEL"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleCurso.add(this.jButtonGenerarExcelReporteDinamicoDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCurso.add(this.jComboBoxTiposReportesDinamicoDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleCurso = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleCurso.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCurso.add(this.jLabelTiposArchivoReporteDinamicoDetalleCurso, this.gridBagConstraintsDetalleCurso);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCurso.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleCurso = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleCurso.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleCurso,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleCurso.setToolTipText("Generar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCurso.add(this.jButtonGenerarReporteDinamicoDetalleCurso, this.gridBagConstraintsDetalleCurso);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleCurso = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleCurso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleCurso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleCurso.setToolTipText("Cancelar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCurso.add(this.jButtonCerrarReporteDinamicoDetalleCurso, this.gridBagConstraintsDetalleCurso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleCurso = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleCurso= new JScrollPane(jPanelReporteDinamicoDetalleCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleCurso.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCurso.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCurso.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cursos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCurso.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleCurso.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleCurso);
		this.jInternalFrameReporteDinamicoDetalleCurso.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleCurso, this.gridBagConstraintsDetalleCurso);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleCurso() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleCurso = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleCurso.setName("jPanelImportacionDetalleCurso"); 
		
		this.jPanelImportacionDetalleCurso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCurso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCurso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleCurso.setLayout(gridaBagLayoutImportacionDetalleCurso);
		
		
		this.jInternalFrameImportacionDetalleCurso= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleCurso= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleCurso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCurso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCurso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleCurso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCurso.setResizable(true);
	    this.jInternalFrameImportacionDetalleCurso.setClosable(true);
	    this.jInternalFrameImportacionDetalleCurso.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCurso.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleCurso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCurso.setResizable(true);
	    this.jInternalFrameImportacionDetalleCurso.setClosable(true);
	    this.jInternalFrameImportacionDetalleCurso.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleCurso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCurso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCurso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cursos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleCurso = new JLabelMe();

		this.jLabelArchivoImportacionDetalleCurso.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCurso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCurso.add(this.jLabelArchivoImportacionDetalleCurso, this.gridBagConstraintsDetalleCurso);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleCurso = new JFileChooser();		
		this.jFileChooserImportacionDetalleCurso.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleCurso = new JButtonMe();
		this.jButtonAbrirImportacionDetalleCurso.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleCurso,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleCurso.setToolTipText("Generar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCurso.add(this.jButtonAbrirImportacionDetalleCurso, this.gridBagConstraintsDetalleCurso);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleCurso = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleCurso.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCurso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCurso.add(this.jLabelPathArchivoImportacionDetalleCurso, this.gridBagConstraintsDetalleCurso);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleCurso=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleCurso.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCurso.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCurso.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCurso.add(this.jTextFieldPathArchivoImportacionDetalleCurso, this.gridBagConstraintsDetalleCurso);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleCurso = new JButtonMe();
		this.jButtonGenerarImportacionDetalleCurso.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleCurso,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleCurso.setToolTipText("Generar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCurso.add(this.jButtonGenerarImportacionDetalleCurso, this.gridBagConstraintsDetalleCurso);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleCurso = new JButtonMe();
		this.jButtonCerrarImportacionDetalleCurso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleCurso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleCurso.setToolTipText("Cancelar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCurso.add(this.jButtonCerrarImportacionDetalleCurso, this.gridBagConstraintsDetalleCurso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleCurso = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleCurso= new JScrollPane(jPanelImportacionDetalleCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleCurso.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleCurso.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleCurso);
		this.jInternalFrameImportacionDetalleCurso.getContentPane().add(this.jScrollPanelImportacionDetalleCurso, this.gridBagConstraintsDetalleCurso);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleCurso(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleCurso = new JButtonMe();
			this.jButtonAbrirOrderByDetalleCurso.setText("Orden");
			this.jButtonAbrirOrderByDetalleCurso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCurso,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleCurso";
			inputMap = this.jButtonAbrirOrderByDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleCurso"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleCurso = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleCurso.setName("jPanelOrderByDetalleCurso"); 
			
			this.jPanelOrderByDetalleCurso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCurso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCurso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleCurso.setLayout(gridaBagLayoutOrderByDetalleCurso);
			
			
			this.jTableDatosDetalleCursoOrderBy = new JTableMe();        
			this.jTableDatosDetalleCursoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleCursoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleCursoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleCursoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleCursoOrderBy.setViewportView(this.jTableDatosDetalleCursoOrderBy);
			this.jTableDatosDetalleCursoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleCursoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleCurso= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleCurso= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleCurso = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleCurso= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleCurso.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleCurso.setTitle("Orden");
			this.jInternalFrameOrderByDetalleCurso.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleCurso.setResizable(true);
			this.jInternalFrameOrderByDetalleCurso.setClosable(true);
			this.jInternalFrameOrderByDetalleCurso.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleCurso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCurso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCurso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cursos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleCurso.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleCurso.ipady =150;
				
			this.jPanelOrderByDetalleCurso.add(jScrollPanelDatosDetalleCursoOrderBy, this.gridBagConstraintsDetalleCurso);//this.jTableDatosDetalleCursoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleCurso = new JButtonMe();
			this.jButtonCerrarOrderByDetalleCurso.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleCurso,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleCurso.setToolTipText("Cancelar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleCurso.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleCurso.add(this.jButtonCerrarOrderByDetalleCurso, this.gridBagConstraintsDetalleCurso);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleCurso = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleCurso= new JScrollPane(jPanelOrderByDetalleCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleCurso.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleCurso.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleCurso);
			
			this.jInternalFrameOrderByDetalleCurso.getContentPane().add(this.jScrollPanelOrderByDetalleCurso, this.gridBagConstraintsDetalleCurso);			
		
		} else {
			this.jButtonAbrirOrderByDetalleCurso = new JButtonMe();
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
			&& this.detallecursoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleCurso.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleCurso.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleCurso.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleCurso.getRowHeight();//DetalleCursoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleCursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCurso.isSelected()) {
					iHeightTable=DetalleCursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleCursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleCursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleCursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCurso.isSelected()) {
					iHeightTable=DetalleCursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleCursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleCursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleCurso.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCurso.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCurso.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleCurso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCurso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCurso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleCurso!=null && this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy()!=null) {
			//if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleCurso.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleCurso.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleCurso.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleCurso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCurso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCurso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallecursoLogic.getDetalleCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallecursos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleCurso> TraerDetalleCursoBeans(List<DetalleCurso> detallecursos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleCurso detallecurso:detallecursos) {
					
				if(!(DetalleCursoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleCursoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallecurso.setsDetalleGeneralEntityReporte(DetalleCursoConstantesFunciones.getDetalleCursoDescripcion(detallecurso));
										
						
					
						
					
				} else  {
							
					//detallecurso.setsDetalleGeneralEntityReporte(detallecurso.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallecursobeans.add(detallecursobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallecursos;
    }
	//PARA REPORTES FIN
}
