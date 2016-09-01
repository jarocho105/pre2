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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.CursoConstantesFunciones;

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
public class CursoJInternalFrame extends CursoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCurso;
	
	protected JMenuBar jmenuBarCurso;
	
	protected JMenu jmenuCurso;
	protected JMenu jmenuDatosCurso;
	protected JMenu jmenuArchivoCurso;
	protected JMenu jmenuAccionesCurso;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCurso;	
	protected GridBagConstraints gridBagConstraintsCurso;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CursoDetalleFormJInternalFrame jInternalFrameDetalleFormCurso;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCurso;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCurso;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoCursoBeanSwingJInternalFrame tipocursoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocurso="";

	protected TipoInstitucionBeanSwingJInternalFrame tipoinstitucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoinstitucion="";
	
	public CursoSessionBean cursoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoCursoSessionBean tipocursoSessionBean;
	public TipoInstitucionSessionBean tipoinstitucionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Curso> cursos;		
	public List<Curso> cursosEliminados;	
	public List<Curso> cursosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCurso;		
	protected JButton jButtonAbrirOrderByCurso;
	
	
	//protected JPanel jPanelOrderByCurso;
	//public JScrollPane jScrollPanelOrderByCurso;	
	//protected JButton jButtonCerrarOrderByCurso;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CursoLogic cursoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCurso;
	public JScrollPane jScrollPanelDatosEdicionCurso;
	public JScrollPane jScrollPanelDatosGeneralCurso;
    
	
	
	//public JScrollPane jScrollPanelDatosCursoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCurso;
	//public JScrollPane jScrollPanelImportacionCurso;
	
	
	
	protected JPanel jPanelAccionesCurso;
	
    protected JPanel jPanelPaginacionCurso;
    protected JPanel jPanelParametrosReportesCurso;
	protected JPanel jPanelParametrosReportesAccionesCurso;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Curso;
	protected JPanel jPanelParametrosAuxiliar2Curso;
	protected JPanel jPanelParametrosAuxiliar3Curso;
	protected JPanel jPanelParametrosAuxiliar4Curso;
	//protected JPanel jPanelParametrosAuxiliar5Curso;
	
	
	
	//protected JPanel jPanelReporteDinamicoCurso;
	//protected JPanel jPanelImportacionCurso;
	
	
	public JTable jTableDatosCurso;
	
	
	
	//public JTable jTableDatosCursoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCurso;
	protected JButton jButtonDuplicarCurso;
	protected JButton jButtonCopiarCurso;
	protected JButton jButtonVerFormCurso;
	protected JButton jButtonNuevoRelacionesCurso;
	protected JButton jButtonModificarCurso;
	
    protected JButton jButtonGuardarCambiosTablaCurso;
	protected JButton jButtonCerrarCurso;
	
	
	protected JButton jButtonRecargarInformacionCurso;
	protected JButton jButtonProcesarInformacionCurso;
	
	
	protected JButton jButtonAnterioresCurso;
	protected JButton jButtonSiguientesCurso;
	protected JButton jButtonNuevoGuardarCambiosCurso;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCurso;
	//protected JButton jButtonCerrarReporteDinamicoCurso;
	//protected JButton jButtonGenerarExcelReporteDinamicoCurso;	
	
	
	
	//protected JButton jButtonAbrirImportacionCurso;
	//protected JButton jButtonGenerarImportacionCurso;
	//protected JButton jButtonCerrarImportacionCurso;
	//protected JFileChooser jFileChooserImportacionCurso;
	//protected File fileImportacionCurso;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCurso;
	protected JButton jButtonDuplicarToolBarCurso;
	protected JButton jButtonNuevoRelacionesToolBarCurso;
	
	
	public JButton jButtonGuardarCambiosToolBarCurso;
	protected JButton jButtonCopiarToolBarCurso;
	protected JButton jButtonVerFormToolBarCurso;
	public JButton jButtonGuardarCambiosTablaToolBarCurso;
	protected JButton jButtonMostrarOcultarTablaToolBarCurso;
	protected JButton jButtonCerrarToolBarCurso;
	
	protected JButton jButtonRecargarInformacionToolBarCurso;
	protected JButton jButtonProcesarInformacionToolBarCurso;
	protected JButton jButtonAnterioresToolBarCurso;
	protected JButton jButtonSiguientesToolBarCurso;
	protected JButton jButtonNuevoGuardarCambiosToolBarCurso;
	protected JButton jButtonAbrirOrderByToolBarCurso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCurso;
	protected JMenuItem jMenuItemDuplicarCurso;
	protected JMenuItem jMenuItemNuevoRelacionesCurso;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCurso;
	protected JMenuItem jMenuItemCopiarCurso;
	protected JMenuItem jMenuItemVerFormCurso;
	protected JMenuItem jMenuItemGuardarCambiosTablaCurso;
	protected JMenuItem jMenuItemCerrarCurso;
	protected JMenuItem jMenuItemDetalleCerrarCurso;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCurso;
	protected JMenuItem jMenuItemDetalleMostarOcultarCurso;
	
	protected JMenuItem jMenuItemRecargarInformacionCurso;
	protected JMenuItem jMenuItemProcesarInformacionCurso;
	protected JMenuItem jMenuItemAnterioresCurso;
	protected JMenuItem jMenuItemSiguientesCurso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCurso;
	protected JMenuItem jMenuItemAbrirOrderByCurso;
	protected JMenuItem jMenuItemMostrarOcultarCurso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCurso;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCurso;
	protected JCheckBox jCheckBoxSeleccionadosCurso;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCurso;
	protected JCheckBox jCheckBoxConGraficoReporteCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCurso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCurso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCurso;
	protected JTextField jTextFieldValorCampoGeneralCurso;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCurso;
	//public JList<Reporte> jListColumnasSelectReporteCurso;
	//public JScrollPane jScrollColumnasSelectReporteCurso;
	
	//public JLabel jLabelRelacionesSelectReporteCurso;
	//public JList<Reporte> jListRelacionesSelectReporteCurso;
	//public JScrollPane jScrollRelacionesSelectReporteCurso;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCurso;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCurso;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCurso;
	//public JLabel jLabelTiposArchivoReporteDinamicoCurso;
	
		
	//public JLabel jLabelArchivoImportacionCurso;	
	//public JLabel jLabelPathArchivoImportacionCurso;
	//protected JTextField jTextFieldPathArchivoImportacionCurso;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCurso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCurso;
	
	//public JLabel jLabelColumnaCategoriaValorCurso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCurso;
	
	//public JLabel jLabelColumnasValoresGraficoCurso;
	//public JList<Reporte> jListColumnasValoresGraficoCurso;
	//public JScrollPane jScrollColumnasValoresGraficoCurso;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCurso;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCurso;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCurso;
	public JPanel jPanelFK_IdEmpleadoCurso;
	public JButton jButtonFK_IdEmpleadoCurso;
	public JPanel jPanelFK_IdTipoCursoCurso;
	public JButton jButtonFK_IdTipoCursoCurso;
	public JPanel jPanelFK_IdTipoInstitucionCurso;
	public JButton jButtonFK_IdTipoInstitucionCurso;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoCurso;
	public JLabel jLabelid_empleadoFK_IdEmpleadoCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoCurso;
	public JButton jButtonid_empleadoFK_IdEmpleadoCurso= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCursoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCursoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoCurso;
	
	public JPanel jPanelid_tipo_cursoFK_IdTipoCursoCurso;
	public JLabel jLabelid_tipo_cursoFK_IdTipoCursoCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cursoFK_IdTipoCursoCurso;
	public JButton jButtonid_tipo_cursoFK_IdTipoCursoCurso= new JButtonMe();
	public JButton jButtonid_tipo_cursoFK_IdTipoCursoCursoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cursoFK_IdTipoCursoCursoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_institucionFK_IdTipoInstitucionCurso;
	public JLabel jLabelid_tipo_institucionFK_IdTipoInstitucionCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso;
	public JButton jButtonid_tipo_institucionFK_IdTipoInstitucionCurso= new JButtonMe();
	public JButton jButtonid_tipo_institucionFK_IdTipoInstitucionCursoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_institucionFK_IdTipoInstitucionCursoBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CursoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CursoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CursoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CursoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCurso)	{
		this.jButtonRecargarInformacionCurso = jButtonRecargarInformacionCurso;
	}
	
	public JButton getjButtonProcesarInformacionCurso() {
		return this.jButtonProcesarInformacionCurso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCurso)	{
		this.jButtonProcesarInformacionCurso = jButtonProcesarInformacionCurso;
	}
	
	
	public JButton getjButtonRecargarInformacionCurso() {
		return this.jButtonRecargarInformacionCurso;
	}
	
	
	public List<Curso> getcursos() {
		return this.cursos;
	}

	public void setcursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public List<Curso> getcursosAux() {
		return this.cursosAux;
	}

	public void setcursosAux(List<Curso> cursosAux) {
		this.cursosAux = cursosAux;
	}
	
	public List<Curso> getcursosEliminados() {
		return this.cursosEliminados;
	}

	public void setCursosEliminados(List<Curso> cursosEliminados) {
		this.cursosEliminados = cursosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCurso() {
		return jComboBoxTiposSeleccionarCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCurso(
			JComboBox jComboBoxTiposSeleccionarCurso) {
		this.jComboBoxTiposSeleccionarCurso = jComboBoxTiposSeleccionarCurso;
	}
	
	public void setBorderResaltarTiposSeleccionarCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCurso .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCurso() {
		return jTextFieldValorCampoGeneralCurso;
	}

	public void setjTextFieldValorCampoGeneralCurso(
			JTextField jTextFieldValorCampoGeneralCurso) {
		this.jTextFieldValorCampoGeneralCurso = jTextFieldValorCampoGeneralCurso;
	}

	public void setBorderResaltarValorCampoGeneralCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCurso .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCurso() {
		return this.jCheckBoxSeleccionarTodosCurso;
	}

	public void setjCheckBoxSeleccionarTodosCurso(
			JCheckBox jCheckBoxSeleccionarTodosCurso) {
		this.jCheckBoxSeleccionarTodosCurso = jCheckBoxSeleccionarTodosCurso;
	}

	public void setBorderResaltarSeleccionarTodosCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCurso .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCurso() {
		return this.jCheckBoxSeleccionadosCurso;
	}

	public void setjCheckBoxSeleccionadosCurso(
			JCheckBox jCheckBoxSeleccionadosCurso) {
		this.jCheckBoxSeleccionadosCurso = jCheckBoxSeleccionadosCurso;
	}
	
	public void setBorderResaltarSeleccionadosCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCurso .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCurso() {
		return this.jComboBoxTiposArchivosReportesCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCurso(
			JComboBox jComboBoxTiposArchivosReportesCurso) {
		this.jComboBoxTiposArchivosReportesCurso = jComboBoxTiposArchivosReportesCurso;
	}

	public void setBorderResaltarTiposArchivosReportesCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCurso() {
		return this.jComboBoxTiposReportesCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCurso(
			JComboBox jComboBoxTiposReportesCurso) {
		this.jComboBoxTiposReportesCurso = jComboBoxTiposReportesCurso;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCurso() {
	//	return jComboBoxTiposReportesDinamicoCurso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCurso(
	//		JComboBox jComboBoxTiposReportesDinamicoCurso) {
	//	this.jComboBoxTiposReportesDinamicoCurso = jComboBoxTiposReportesDinamicoCurso;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCurso() {
	//	return jComboBoxTiposArchivosReportesDinamicoCurso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCurso(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCurso) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCurso = jComboBoxTiposArchivosReportesDinamicoCurso;
	//}
	
	public void setBorderResaltarTiposReportesCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCurso() {
		return this.jComboBoxTiposGraficosReportesCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCurso(
			JComboBox jComboBoxTiposGraficosReportesCurso) {
		this.jComboBoxTiposGraficosReportesCurso = jComboBoxTiposGraficosReportesCurso;
	}
	
	public void setBorderResaltarTiposGraficosReportesCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCurso() {
		return this.jComboBoxTiposPaginacionCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCurso(
			JComboBox jComboBoxTiposPaginacionCurso) {
		this.jComboBoxTiposPaginacionCurso = jComboBoxTiposPaginacionCurso;
	}
	
	public void setBorderResaltarTiposPaginacionCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCurso() {
		return this.jComboBoxTiposRelacionesCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCurso() {
		return this.jComboBoxTiposAccionesCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCurso(
			JComboBox jComboBoxTiposRelacionesCurso) {
		this.jComboBoxTiposRelacionesCurso = jComboBoxTiposRelacionesCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCurso(
			JComboBox jComboBoxTiposAccionesCurso) {
		this.jComboBoxTiposAccionesCurso = jComboBoxTiposAccionesCurso;
	}
	
	public void setBorderResaltarTiposRelacionesCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCurso .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCurso .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCurso() {
	//	return jCheckBoxConGraficoDinamicoCurso;
	//}

	//public void setjCheckBoxConGraficoDinamicoCurso(
	//		JCheckBox jCheckBoxConGraficoDinamicoCurso) {
	//	this.jCheckBoxConGraficoDinamicoCurso = jCheckBoxConGraficoDinamicoCurso;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCurso() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCurso.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCurso .setBorder(borderResaltar);		
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
		this.cursoSessionBean=new CursoSessionBean();
		
		this.cursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cursoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CursoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CursoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CursoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Curso MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
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
		
		CursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCurso= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCurso,this.jTtoolBarCurso,
							"nuevo","nuevo","Nuevo"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCurso,this.jTtoolBarCurso,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCurso,this.jTtoolBarCurso,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCurso,this.jTtoolBarCurso,
							"duplicar","duplicar","Duplicar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCurso,this.jTtoolBarCurso,
							"copiar","copiar","Copiar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCurso,this.jTtoolBarCurso,
							"ver_form","ver_form","Ver"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCurso,this.jTtoolBarCurso,
							"recargar","recargar","Recargar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCurso,this.jTtoolBarCurso,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCurso,this.jTtoolBarCurso,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCurso,this.jTtoolBarCurso,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCurso,this.jTtoolBarCurso,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCurso,this.jTtoolBarCurso,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCurso,this.jTtoolBarCurso,
							"cerrar","cerrar","Salir"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCurso=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCurso;
			
				this.jButtonProcesarInformacionToolBarCurso=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCurso;
				
		//protected JButton jButtonModificarToolBarCurso;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCurso=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCurso=new JMenuMe("General");
		this.jmenuArchivoCurso=new JMenuMe("Archivo");
		this.jmenuAccionesCurso=new JMenuMe("Acciones");
		this.jmenuDatosCurso=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCurso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCurso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCurso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCurso= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCurso.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCurso,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCurso= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCurso.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCurso,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCurso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCurso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCurso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCurso= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCurso.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCurso,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCurso= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCurso.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCurso,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCurso= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCurso.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCurso,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCurso= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCurso.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCurso,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCurso= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCurso.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCurso,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCurso= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCurso.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCurso,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCurso= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCurso.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCurso,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCurso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCurso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCurso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCurso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCurso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCurso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCurso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCurso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCurso= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCurso.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCurso,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCurso.add(this.jMenuItemCerrarCurso);
			
			this.jmenuAccionesCurso.add(this.jMenuItemNuevoCurso);
			this.jmenuAccionesCurso.add(this.jMenuItemNuevoGuardarCambiosCurso);
			this.jmenuAccionesCurso.add(this.jMenuItemNuevoRelacionesCurso);
			this.jmenuAccionesCurso.add(this.jMenuItemGuardarCambiosTablaCurso);		
			this.jmenuAccionesCurso.add(this.jMenuItemDuplicarCurso);		
			this.jmenuAccionesCurso.add(this.jMenuItemCopiarCurso);		
			this.jmenuAccionesCurso.add(this.jMenuItemVerFormCurso);		
			
			this.jmenuDatosCurso.add(this.jMenuItemRecargarInformacionCurso);				
			this.jmenuDatosCurso.add(this.jMenuItemAnterioresCurso);				
			this.jmenuDatosCurso.add(this.jMenuItemSiguientesCurso);				
			this.jmenuDatosCurso.add(this.jMenuItemAbrirOrderByCurso);				
			this.jmenuDatosCurso.add(this.jMenuItemMostrarOcultarCurso);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCurso.add(this.jMenuItemGuardarCambiosCurso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCurso.add(this.jmenuArchivoCurso);		
			this.jmenuBarCurso.add(this.jmenuAccionesCurso);		
			this.jmenuBarCurso.add(this.jmenuDatosCurso);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCurso);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCurso() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoCurso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoCurso.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoCurso= new JButtonMe();
		this.jButtonFK_IdEmpleadoCurso.setText("Buscar");
		this.jButtonFK_IdEmpleadoCurso.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoCurso,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoCurso = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoCurso.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoCurso.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoCurso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoCurso= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoCurso,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso.setFocusable(false);

		this.jPanelFK_IdTipoCursoCurso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCursoCurso.setToolTipText("Buscar Por Tipo Curso ");
		this.jButtonFK_IdTipoCursoCurso= new JButtonMe();
		this.jButtonFK_IdTipoCursoCurso.setText("Buscar");
		this.jButtonFK_IdTipoCursoCurso.setToolTipText("Buscar Por Tipo Curso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCursoCurso,"buscar_button","Buscar Por Tipo Curso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCursoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cursoFK_IdTipoCursoCurso = new JLabelMe();
		jLabelid_tipo_cursoFK_IdTipoCursoCurso.setText("Tipo Curso :");
		jLabelid_tipo_cursoFK_IdTipoCursoCurso.setToolTipText("Tipo Curso");
		jLabelid_tipo_cursoFK_IdTipoCursoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cursoFK_IdTipoCursoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cursoFK_IdTipoCursoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cursoFK_IdTipoCursoCurso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cursoFK_IdTipoCursoCurso= new JComboBoxMe();
		jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cursoFK_IdTipoCursoCurso,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoInstitucionCurso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoInstitucionCurso.setToolTipText("Buscar Por Tipo Institucion ");
		this.jButtonFK_IdTipoInstitucionCurso= new JButtonMe();
		this.jButtonFK_IdTipoInstitucionCurso.setText("Buscar");
		this.jButtonFK_IdTipoInstitucionCurso.setToolTipText("Buscar Por Tipo Institucion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoInstitucionCurso,"buscar_button","Buscar Por Tipo Institucion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoInstitucionCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_institucionFK_IdTipoInstitucionCurso = new JLabelMe();
		jLabelid_tipo_institucionFK_IdTipoInstitucionCurso.setText("Tipo Institucion :");
		jLabelid_tipo_institucionFK_IdTipoInstitucionCurso.setToolTipText("Tipo Institucion");
		jLabelid_tipo_institucionFK_IdTipoInstitucionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_institucionFK_IdTipoInstitucionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_institucionFK_IdTipoInstitucionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_institucionFK_IdTipoInstitucionCurso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso= new JComboBoxMe();
		jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCurso=new JTabbedPane();


		this.jTabbedPaneBusquedasCurso.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCurso.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCurso.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCurso,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCurso = new CursoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Curso DATOS");
			this.jInternalFrameDetalleFormCurso = new CursoDetalleFormJInternalFrame(jDesktopPane,this.cursoSessionBean.getConGuardarRelaciones(),this.cursoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCurso = null;//new CursoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCurso= new GridBagLayout();
		
		
		this.jTableDatosCurso = new JTableMe();      
		
		String sToolTipCurso="";
		sToolTipCurso=CursoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCurso+="(Nomina.Curso)";
		}
		
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCurso+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCurso.setToolTipText(sToolTipCurso);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCurso);
		this.jTableDatosCurso.setAutoCreateRowSorter(true);
		this.jTableDatosCurso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCurso.setRowSelectionAllowed(true);
		this.jTableDatosCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCurso,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCurso = new JButtonMe();
		this.jButtonDuplicarCurso = new JButtonMe();
		this.jButtonCopiarCurso = new JButtonMe();
		this.jButtonVerFormCurso = new JButtonMe();
		this.jButtonNuevoRelacionesCurso = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCurso = new JButtonMe();
		this.jButtonCerrarCurso = new JButtonMe();
		
		this.jScrollPanelDatosCurso = new JScrollPane();   
        this.jScrollPanelDatosGeneralCurso = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Curso";
		
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cursos" + this.sPath));
		} else {
			this.jScrollPanelDatosCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCurso.setToolTipText("Acciones");
        this.jPanelAccionesCurso.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCurso, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCurso=new ReporteDinamicoJInternalFrame(CursoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCurso();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCurso=new ImportacionJInternalFrame(CursoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCurso();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCurso = new JButtonMe();
		
		this.jButtonAbrirOrderByCurso.setText("Orden");
		this.jButtonAbrirOrderByCurso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCurso,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCurso,false,this);
			
			//this.cargarOrderByCurso(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCurso,true,this);
			
			//this.cargarOrderByCurso(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCurso.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosCurso.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosCurso.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosCurso.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCurso.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCurso.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCurso.setText("Nuevo");
		this.jButtonDuplicarCurso.setText("Duplicar");
		this.jButtonCopiarCurso.setText("Copiar");
		this.jButtonVerFormCurso.setText("Ver");
		this.jButtonNuevoRelacionesCurso.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCurso.setText("Guardar");
		this.jButtonCerrarCurso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCurso,"nuevo_button","Nuevo",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCurso,"duplicar_button","Duplicar",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCurso,"copiar_button","Copiar",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCurso,"ver_form","Ver",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCurso,"nuevorelaciones_button","Nuevo Rel",this.cursoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCurso,"guardarcambiostabla_button","Guardar",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCurso,"cerrar_button","Salir",this.cursoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCurso.setToolTipText("Nuevo"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCurso.setToolTipText("Duplicar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCurso.setToolTipText("Copiar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCurso.setToolTipText("Ver"+" "+CursoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCurso.setToolTipText("Nuevo Rel"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCurso.setToolTipText("Guardar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCurso.setToolTipText("Salir"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCurso";
		inputMap = this.jButtonNuevoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCurso"));
		
		//DUPLICAR
		sMapKey = "DuplicarCurso";
		inputMap = this.jButtonDuplicarCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCurso"));
		
		//COPIAR
		sMapKey = "CopiarCurso";
		inputMap = this.jButtonCopiarCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCurso"));
		
		//VEr FORM
		sMapKey = "VerFormCurso";
		inputMap = this.jButtonVerFormCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCurso"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCurso";
		inputMap = this.jButtonNuevoRelacionesCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCurso"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCurso";
		inputMap = this.jButtonModificarCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCurso"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCurso";
		inputMap = this.jButtonCerrarCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCurso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCurso";
		inputMap = this.jButtonGuardarCambiosTablaCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCurso"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Curso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Curso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Curso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Curso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Curso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCurso.setName("jPanelParametrosReportesCurso"); 
		
		this.jPanelParametrosReportesAccionesCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCurso.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCurso.setName("jPanelParametrosReportesAccionesCurso"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCurso, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCurso, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCurso = new JButtonMe();
		this.jButtonRecargarInformacionCurso.setText("Recargar");
		this.jButtonRecargarInformacionCurso.setToolTipText("Recargar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCurso,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCurso = new JButtonMe();
		this.jButtonProcesarInformacionCurso.setText("Procesar");
		this.jButtonProcesarInformacionCurso.setToolTipText("Procesar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCurso.setVisible(false);
			
		this.jButtonProcesarInformacionCurso.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCurso.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCurso.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCurso.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCurso.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCurso.setText("TIPO");       
		this.jComboBoxTiposReportesCurso.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCurso.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCurso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCurso = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCurso.setText("Paginacion");
		this.jComboBoxTiposPaginacionCurso.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCurso = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCurso.setText("Accion");
		this.jComboBoxTiposRelacionesCurso.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCurso.setText("Accion");
		this.jComboBoxTiposAccionesCurso.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCurso = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCurso.setText("Accion");
		this.jComboBoxTiposSeleccionarCurso.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCurso=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCurso.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCurso.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCurso.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCurso = new JLabelMe();
		
		this.jLabelAccionesCurso.setText("Acciones");		
		this.jLabelAccionesCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCurso = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCurso.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCurso.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCurso = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCurso.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCurso.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCurso = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCurso.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCurso.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCurso = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCurso.setText("Graf.");
		this.jCheckBoxConGraficoReporteCurso.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCurso = new JButtonMe();
		//this.jButtonAnterioresCurso.setText("<<");
        this.jButtonAnterioresCurso.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCurso,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCurso = new JButtonMe();
		//this.jButtonSiguientesCurso.setText(">>");
        this.jButtonSiguientesCurso.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCurso,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCurso = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCurso.setText("Nue");
        this.jButtonNuevoGuardarCambiosCurso.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCurso,"nuevoguardarcambios_button","Nue",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCurso";
		inputMap = this.jButtonNuevoGuardarCambiosCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCurso"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCurso";
		inputMap = this.jButtonRecargarInformacionCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCurso"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCurso";
		inputMap = this.jButtonSiguientesCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCurso"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCurso";
		inputMap = this.jButtonAnterioresCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCurso"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCurso();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCurso.setMinimumSize(new Dimension(this.getWidth(),CursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CursoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCurso.setMaximumSize(new Dimension(this.getWidth(),CursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CursoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCurso.setPreferredSize(new Dimension(this.getWidth(),CursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CursoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCurso = new GridBagLayout();

			this.jPanelPaginacionCurso.setLayout(gridaBagLayoutPaginacionCurso);						
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = 0;
			this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCurso.add(this.jButtonAnterioresCurso, this.gridBagConstraintsCurso);
					
						
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCurso.gridy = 0;
			
			this.jPanelPaginacionCurso.add(this.jButtonNuevoGuardarCambiosCurso, this.gridBagConstraintsCurso);
						
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCurso.gridy = 0;
			this.jPanelPaginacionCurso.add(this.jButtonSiguientesCurso, this.gridBagConstraintsCurso);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = 1;
			this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCurso.add(this.jButtonNuevoCurso, this.gridBagConstraintsCurso);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCurso = new GridBagConstraints();
				this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCurso.gridy = 1;
				this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCurso.add(this.jButtonNuevoRelacionesCurso, this.gridBagConstraintsCurso);
			}
			
			
			if(!this.cursoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCurso = new GridBagConstraints();
				this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCurso.gridy = 1;
				this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCurso.add(this.jButtonGuardarCambiosTablaCurso, this.gridBagConstraintsCurso);
			}
			
			
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = 1;
			this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCurso.add(this.jButtonDuplicarCurso, this.gridBagConstraintsCurso);
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = 1;
			this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCurso.add(this.jButtonCopiarCurso, this.gridBagConstraintsCurso);
		
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = 1;
			this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCurso.add(this.jButtonVerFormCurso, this.gridBagConstraintsCurso);
		
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = 1;
			this.gridBagConstraintsCurso.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCurso.add(this.jButtonCerrarCurso, this.gridBagConstraintsCurso);
		
		
		
		this.jButtonRecargarInformacionCurso.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCurso.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCurso.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCurso.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCurso.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCurso.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCurso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCurso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCurso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCurso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCurso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCurso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCurso.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCurso.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCurso.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCurso.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCurso.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCurso.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCurso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCurso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCurso.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCurso.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCurso.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCurso.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCurso = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Curso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Curso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Curso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Curso = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCurso.setLayout(gridaBagParametrosReportesCurso);
			this.jPanelParametrosReportesAccionesCurso.setLayout(gridaBagParametrosReportesAccionesCurso);
			
			
			this.jPanelParametrosAuxiliar1Curso.setLayout(gridaBagParametrosAuxiliar1Curso);
			this.jPanelParametrosAuxiliar2Curso.setLayout(gridaBagParametrosAuxiliar2Curso);
			this.jPanelParametrosAuxiliar3Curso.setLayout(gridaBagParametrosAuxiliar3Curso);
			this.jPanelParametrosAuxiliar4Curso.setLayout(gridaBagParametrosAuxiliar4Curso);
			//this.jPanelParametrosAuxiliar5Curso.setLayout(gridaBagParametrosAuxiliar2Curso);			
			
			
			
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCurso.add(this.jButtonRecargarInformacionCurso, this.gridBagConstraintsCurso);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Curso.add(this.jComboBoxTiposPaginacionCurso, this.gridBagConstraintsCurso);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Curso.add(this.jCheckBoxConAltoMaximoTablaCurso, this.gridBagConstraintsCurso);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Curso.add(this.jComboBoxTiposArchivosReportesCurso, this.gridBagConstraintsCurso);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCurso.add(this.jPanelParametrosAuxiliar1Curso, this.gridBagConstraintsCurso);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Curso.add(this.jComboBoxTiposReportesCurso, this.gridBagConstraintsCurso);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCurso.add(this.jPanelParametrosAuxiliar4Curso, this.gridBagConstraintsCurso);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCurso.add(this.jComboBoxTiposReportesCurso, this.gridBagConstraintsCurso);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCurso.add(this.jCheckBoxGenerarReporteCurso, this.gridBagConstraintsCurso);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCurso.add(this.jPanelParametrosAuxiliar2Curso, this.gridBagConstraintsCurso);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCurso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCurso.add(this.jLabelAccionesCurso, this.gridBagConstraintsCurso);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCurso = new GridBagConstraints();
				this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCurso.add(this.jButtonAbrirOrderByCurso, this.gridBagConstraintsCurso);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCurso.add(this.jComboBoxTiposSeleccionarCurso, this.gridBagConstraintsCurso);			
			
			
			/*
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCurso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCurso.add(this.jCheckBoxSeleccionarTodosCurso, this.gridBagConstraintsCurso);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Curso.add(this.jCheckBoxSeleccionarTodosCurso, this.gridBagConstraintsCurso);															
				
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Curso.add(this.jCheckBoxSeleccionadosCurso, this.gridBagConstraintsCurso);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCurso.add(this.jPanelParametrosAuxiliar3Curso, this.gridBagConstraintsCurso);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCurso.add(this.jComboBoxTiposRelacionesCurso, this.gridBagConstraintsCurso);
				
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCurso.add(this.jComboBoxTiposAccionesCurso, this.gridBagConstraintsCurso);
	
				
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCurso.add(this.jTextFieldValorCampoGeneralCurso, this.gridBagConstraintsCurso);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCurso = new GridBagLayout();

			this.jScrollPanelDatosCurso.setLayout(gridaBagLayoutDatosCurso);
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = 0;
			this.gridBagConstraintsCurso.gridx = 0;
			
			this.jScrollPanelDatosCurso.add(this.jTableDatosCurso, this.gridBagConstraintsCurso);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCurso.setViewportView(this.jTableDatosCurso);
		this.jTableDatosCurso.setFillsViewportHeight(true);
		this.jTableDatosCurso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCurso= new GridBagLayout();
		this.jPanelAccionesCurso.setLayout(gridaBagLayoutAccionesCurso);
		
		
		/*	
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 0;
			
		this.jPanelAccionesCurso.add(this.jButtonNuevoCurso, this.gridBagConstraintsCurso);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoCurso= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoCurso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCurso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCurso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoCurso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoCurso.setLayout(gridaBagLayoutFK_IdEmpleadoCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 0;
		gridBagConstraintsCurso.gridx = 0;
		jPanelFK_IdEmpleadoCurso.add(jLabelid_empleadoFK_IdEmpleadoCurso, gridBagConstraintsCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 0;
		gridBagConstraintsCurso.gridx = 1;
		jPanelFK_IdEmpleadoCurso.add(jComboBoxid_empleadoFK_IdEmpleadoCurso, gridBagConstraintsCurso);


		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
		gridBagConstraintsCurso.gridy = 0;
		gridBagConstraintsCurso.gridx = 0;
		jPanelFK_IdEmpleadoCurso.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso, gridBagConstraintsCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 1;
		gridBagConstraintsCurso.gridx =1;
		jPanelFK_IdEmpleadoCurso.add(jButtonFK_IdEmpleadoCurso, gridBagConstraintsCurso);

		jTabbedPaneBusquedasCurso.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoCurso);
		jTabbedPaneBusquedasCurso.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoCursoCurso= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCursoCurso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCursoCurso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCursoCurso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCursoCurso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCursoCurso.setLayout(gridaBagLayoutFK_IdTipoCursoCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 0;
		gridBagConstraintsCurso.gridx = 0;
		jPanelFK_IdTipoCursoCurso.add(jLabelid_tipo_cursoFK_IdTipoCursoCurso, gridBagConstraintsCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 0;
		gridBagConstraintsCurso.gridx = 1;
		jPanelFK_IdTipoCursoCurso.add(jComboBoxid_tipo_cursoFK_IdTipoCursoCurso, gridBagConstraintsCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 1;
		gridBagConstraintsCurso.gridx =1;
		jPanelFK_IdTipoCursoCurso.add(jButtonFK_IdTipoCursoCurso, gridBagConstraintsCurso);

		jTabbedPaneBusquedasCurso.addTab("2.-Por Tipo Curso ", jPanelFK_IdTipoCursoCurso);
		jTabbedPaneBusquedasCurso.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoInstitucionCurso= new GridBagLayout();
		gridaBagLayoutFK_IdTipoInstitucionCurso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoInstitucionCurso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoInstitucionCurso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoInstitucionCurso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoInstitucionCurso.setLayout(gridaBagLayoutFK_IdTipoInstitucionCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 0;
		gridBagConstraintsCurso.gridx = 0;
		jPanelFK_IdTipoInstitucionCurso.add(jLabelid_tipo_institucionFK_IdTipoInstitucionCurso, gridBagConstraintsCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 0;
		gridBagConstraintsCurso.gridx = 1;
		jPanelFK_IdTipoInstitucionCurso.add(jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso, gridBagConstraintsCurso);

		gridBagConstraintsCurso = new GridBagConstraints();
		gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCurso.gridy = 1;
		gridBagConstraintsCurso.gridx =1;
		jPanelFK_IdTipoInstitucionCurso.add(jButtonFK_IdTipoInstitucionCurso, gridBagConstraintsCurso);

		jTabbedPaneBusquedasCurso.addTab("3.-Por Tipo Institucion ", jPanelFK_IdTipoInstitucionCurso);
		jTabbedPaneBusquedasCurso.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCurso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCurso);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cursoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCurso = new GridBagConstraints();						
			this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCurso.gridx = 0;		
			//this.gridBagConstraintsCurso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCurso.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCurso, this.gridBagConstraintsCurso);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCurso.gridx = 0;		
		//this.gridBagConstraintsCurso.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCurso.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCurso);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCurso.gridx = 0;		
			this.gridBagConstraintsCurso.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCurso.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCurso, this.gridBagConstraintsCurso);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCurso, this.gridBagConstraintsCurso);								
		
		
		/*
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCurso, this.gridBagConstraintsCurso);
		*/		
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCurso.gridx =0;
		this.gridBagConstraintsCurso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCurso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCurso, this.gridBagConstraintsCurso);
				
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCurso, this.gridBagConstraintsCurso);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CursoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCurso = new GridBagLayout();
			this.jPanelBusquedasParametrosCurso.setLayout(gridaBagLayoutBusquedasParametrosCurso);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCurso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCurso, this.gridBagConstraintsCurso);
			
			
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCurso, this.gridBagConstraintsCurso);
		
			
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCurso, this.gridBagConstraintsCurso);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCurso;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCurso() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCurso = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCurso.setName("jPanelReporteDinamicoCurso"); 
		
		this.jPanelReporteDinamicoCurso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCurso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCurso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCurso.setLayout(gridaBagLayoutReporteDinamicoCurso);
		
		
		this.jInternalFrameReporteDinamicoCurso= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCurso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCurso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCurso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCurso.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCurso.setResizable(true);
	    this.jInternalFrameReporteDinamicoCurso.setClosable(true);
	    this.jInternalFrameReporteDinamicoCurso.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCurso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCurso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCurso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cursos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCurso = new JLabelMe();

		this.jLabelColumnasSelectReporteCurso.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCurso.add(this.jLabelColumnasSelectReporteCurso, this.gridBagConstraintsCurso);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCurso = new JList<Reporte>();
		this.jListColumnasSelectReporteCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCurso.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCurso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCurso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCurso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCurso=new JScrollPane(this.jListColumnasSelectReporteCurso);
			
			this.jScrollColumnasSelectReporteCurso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCurso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCurso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCurso.add(this.jListColumnasSelectReporteCurso, this.gridBagConstraintsCurso);
		this.jPanelReporteDinamicoCurso.add(this.jScrollColumnasSelectReporteCurso, this.gridBagConstraintsCurso);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCurso = new JLabelMe();

		this.jLabelRelacionesSelectReporteCurso.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCurso.add(this.jLabelRelacionesSelectReporteCurso, this.gridBagConstraintsCurso);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCurso = new JList<Reporte>();
		this.jListRelacionesSelectReporteCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCurso.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCurso.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCurso.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCurso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCurso=new JScrollPane(this.jListRelacionesSelectReporteCurso);
			
			this.jScrollRelacionesSelectReporteCurso.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCurso.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCurso.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCurso.add(this.jListRelacionesSelectReporteCurso, this.gridBagConstraintsCurso);
		this.jPanelReporteDinamicoCurso.add(this.jScrollRelacionesSelectReporteCurso, this.gridBagConstraintsCurso);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCurso = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCurso = new JComboBoxMe();
		this.jListColumnasValoresGraficoCurso = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCurso = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCurso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCurso = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCurso.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCurso = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCurso.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCurso.add(this.jLabelGenerarExcelReporteDinamicoCurso, this.gridBagConstraintsCurso);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCurso = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCurso.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCurso,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCurso.setToolTipText("Generar EXCEL"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCurso.add(this.jButtonGenerarExcelReporteDinamicoCurso, this.gridBagConstraintsCurso);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCurso.add(this.jComboBoxTiposReportesDinamicoCurso, this.gridBagConstraintsCurso);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCurso = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCurso.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCurso.add(this.jLabelTiposArchivoReporteDinamicoCurso, this.gridBagConstraintsCurso);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCurso.add(this.jComboBoxTiposArchivosReportesDinamicoCurso, this.gridBagConstraintsCurso);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCurso = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCurso.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCurso,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCurso.setToolTipText("Generar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCurso.add(this.jButtonGenerarReporteDinamicoCurso, this.gridBagConstraintsCurso);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCurso = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCurso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCurso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCurso.setToolTipText("Cancelar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCurso.add(this.jButtonCerrarReporteDinamicoCurso, this.gridBagConstraintsCurso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCurso = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCurso= new JScrollPane(jPanelReporteDinamicoCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCurso.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCurso.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCurso.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cursos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCurso.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCurso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCurso.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCurso);
		this.jInternalFrameReporteDinamicoCurso.getContentPane().add(this.jScrollPanelReporteDinamicoCurso, this.gridBagConstraintsCurso);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCurso() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCurso = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCurso.setName("jPanelImportacionCurso"); 
		
		this.jPanelImportacionCurso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCurso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCurso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCurso.setLayout(gridaBagLayoutImportacionCurso);
		
		
		this.jInternalFrameImportacionCurso= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCurso= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCurso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCurso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCurso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCurso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCurso.setResizable(true);
	    this.jInternalFrameImportacionCurso.setClosable(true);
	    this.jInternalFrameImportacionCurso.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCurso.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCurso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCurso.setResizable(true);
	    this.jInternalFrameImportacionCurso.setClosable(true);
	    this.jInternalFrameImportacionCurso.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCurso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCurso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCurso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cursos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCurso = new JLabelMe();

		this.jLabelArchivoImportacionCurso.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = iPosYImportacion;		
		this.gridBagConstraintsCurso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCurso.add(this.jLabelArchivoImportacionCurso, this.gridBagConstraintsCurso);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCurso = new JFileChooser();		
		this.jFileChooserImportacionCurso.setToolTipText("ESCOGER ARCHIVO"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCurso = new JButtonMe();
		this.jButtonAbrirImportacionCurso.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCurso,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCurso.setToolTipText("Generar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCurso.add(this.jButtonAbrirImportacionCurso, this.gridBagConstraintsCurso);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCurso = new JLabelMe();

		this.jLabelPathArchivoImportacionCurso.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = iPosYImportacion;		
		this.gridBagConstraintsCurso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCurso.add(this.jLabelPathArchivoImportacionCurso, this.gridBagConstraintsCurso);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCurso=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCurso.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCurso.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCurso.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCurso.add(this.jTextFieldPathArchivoImportacionCurso, this.gridBagConstraintsCurso);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCurso = new JButtonMe();
		this.jButtonGenerarImportacionCurso.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCurso,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCurso.setToolTipText("Generar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCurso.add(this.jButtonGenerarImportacionCurso, this.gridBagConstraintsCurso);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCurso = new JButtonMe();
		this.jButtonCerrarImportacionCurso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCurso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCurso.setToolTipText("Cancelar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCurso.add(this.jButtonCerrarImportacionCurso, this.gridBagConstraintsCurso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCurso = new GridBagLayout();
		
		this.jScrollPanelImportacionCurso= new JScrollPane(jPanelImportacionCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy =iPosYImportacion;
		this.gridBagConstraintsCurso.gridx =iPosXImportacion;
		this.gridBagConstraintsCurso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCurso.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCurso);
		this.jInternalFrameImportacionCurso.getContentPane().add(this.jScrollPanelImportacionCurso, this.gridBagConstraintsCurso);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCurso(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCurso = new JButtonMe();
			this.jButtonAbrirOrderByCurso.setText("Orden");
			this.jButtonAbrirOrderByCurso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCurso,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCurso";
			inputMap = this.jButtonAbrirOrderByCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCurso"));
		
		
			GridBagLayout gridaBagLayoutOrderByCurso = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCurso.setName("jPanelOrderByCurso"); 
			
			this.jPanelOrderByCurso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCurso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCurso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCurso.setLayout(gridaBagLayoutOrderByCurso);
			
			
			this.jTableDatosCursoOrderBy = new JTableMe();        
			this.jTableDatosCursoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCursoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCursoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCursoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCursoOrderBy.setViewportView(this.jTableDatosCursoOrderBy);
			this.jTableDatosCursoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCursoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCurso= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCurso= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCurso = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCurso= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCurso.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCurso.setTitle("Orden");
			this.jInternalFrameOrderByCurso.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCurso.setResizable(true);
			this.jInternalFrameOrderByCurso.setClosable(true);
			this.jInternalFrameOrderByCurso.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCurso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCurso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCurso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cursos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCurso.gridx =iPosXOrderBy;
			this.gridBagConstraintsCurso.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCurso.ipady =150;
				
			this.jPanelOrderByCurso.add(jScrollPanelDatosCursoOrderBy, this.gridBagConstraintsCurso);//this.jTableDatosCursoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCurso = new JButtonMe();
			this.jButtonCerrarOrderByCurso.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCurso,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCurso.setToolTipText("Cancelar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCurso.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCurso.add(this.jButtonCerrarOrderByCurso, this.gridBagConstraintsCurso);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCurso = new GridBagLayout();
			
			this.jScrollPanelOrderByCurso= new JScrollPane(jPanelOrderByCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy =iPosYOrderBy;
			this.gridBagConstraintsCurso.gridx =iPosXOrderBy;
			this.gridBagConstraintsCurso.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCurso.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCurso);
			
			this.jInternalFrameOrderByCurso.getContentPane().add(this.jScrollPanelOrderByCurso, this.gridBagConstraintsCurso);			
		
		} else {
			this.jButtonAbrirOrderByCurso = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cursoSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosCurso.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCurso.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCurso.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCurso.getRowHeight();//CursoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCurso.isSelected()) {
					iHeightTable=CursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCurso.isSelected()) {
					iHeightTable=CursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCurso.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCurso.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCurso.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCurso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCurso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCurso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCurso!=null && this.jInternalFrameOrderByCurso.getjTableDatosOrderBy()!=null) {
			//if(!this.cursoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCurso.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCurso.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCurso.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCurso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCurso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCurso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cursoLogic.getCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cursos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Curso> TraerCursoBeans(List<Curso> cursos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Curso curso:cursos) {
					
				if(!(CursoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CursoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					curso.setsDetalleGeneralEntityReporte(CursoConstantesFunciones.getCursoDescripcion(curso));
										
					curso.setes_aprobado_descripcion(CursoConstantesFunciones.getes_aprobadoDescripcion(curso));curso.setes_auspicio_empresa_descripcion(CursoConstantesFunciones.getes_auspicio_empresaDescripcion(curso));	
					
					

					if(curso.getDetalleCursos()!=null && Funciones.existeClass(classes,DetalleCurso.class)) {
						try{curso.setdetallecursosDescripcionReporte(new JRBeanCollectionDataSource(DetalleCursoJInternalFrame.TraerDetalleCursoBeans(curso.getDetalleCursos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//curso.setsDetalleGeneralEntityReporte(curso.getsDetalleGeneralEntityReporte());
										
				}
				
				//cursobeans.add(cursobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cursos;
    }
	//PARA REPORTES FIN
}
