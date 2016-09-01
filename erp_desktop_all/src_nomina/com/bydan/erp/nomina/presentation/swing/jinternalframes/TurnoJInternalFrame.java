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
import com.bydan.erp.nomina.util.TurnoConstantesFunciones;

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
public class TurnoJInternalFrame extends TurnoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTurno;
	
	protected JMenuBar jmenuBarTurno;
	
	protected JMenu jmenuTurno;
	protected JMenu jmenuDatosTurno;
	protected JMenu jmenuArchivoTurno;
	protected JMenu jmenuAccionesTurno;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTurno;	
	protected GridBagConstraints gridBagConstraintsTurno;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TurnoDetalleFormJInternalFrame jInternalFrameDetalleFormTurno;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTurno;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTurno;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TurnoSessionBean turnoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Turno> turnos;		
	public List<Turno> turnosEliminados;	
	public List<Turno> turnosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTurno;		
	protected JButton jButtonAbrirOrderByTurno;
	
	
	//protected JPanel jPanelOrderByTurno;
	//public JScrollPane jScrollPanelOrderByTurno;	
	//protected JButton jButtonCerrarOrderByTurno;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TurnoLogic turnoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTurno;
	public JScrollPane jScrollPanelDatosEdicionTurno;
	public JScrollPane jScrollPanelDatosGeneralTurno;
    
	
	
	//public JScrollPane jScrollPanelDatosTurnoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTurno;
	//public JScrollPane jScrollPanelImportacionTurno;
	
	
	
	protected JPanel jPanelAccionesTurno;
	
    protected JPanel jPanelPaginacionTurno;
    protected JPanel jPanelParametrosReportesTurno;
	protected JPanel jPanelParametrosReportesAccionesTurno;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Turno;
	protected JPanel jPanelParametrosAuxiliar2Turno;
	protected JPanel jPanelParametrosAuxiliar3Turno;
	protected JPanel jPanelParametrosAuxiliar4Turno;
	//protected JPanel jPanelParametrosAuxiliar5Turno;
	
	
	
	//protected JPanel jPanelReporteDinamicoTurno;
	//protected JPanel jPanelImportacionTurno;
	
	
	public JTable jTableDatosTurno;
	
	
	
	//public JTable jTableDatosTurnoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTurno;
	protected JButton jButtonDuplicarTurno;
	protected JButton jButtonCopiarTurno;
	protected JButton jButtonVerFormTurno;
	protected JButton jButtonNuevoRelacionesTurno;
	protected JButton jButtonModificarTurno;
	
    protected JButton jButtonGuardarCambiosTablaTurno;
	protected JButton jButtonCerrarTurno;
	
	
	protected JButton jButtonRecargarInformacionTurno;
	protected JButton jButtonProcesarInformacionTurno;
	
	
	protected JButton jButtonAnterioresTurno;
	protected JButton jButtonSiguientesTurno;
	protected JButton jButtonNuevoGuardarCambiosTurno;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTurno;
	//protected JButton jButtonCerrarReporteDinamicoTurno;
	//protected JButton jButtonGenerarExcelReporteDinamicoTurno;	
	
	
	
	//protected JButton jButtonAbrirImportacionTurno;
	//protected JButton jButtonGenerarImportacionTurno;
	//protected JButton jButtonCerrarImportacionTurno;
	//protected JFileChooser jFileChooserImportacionTurno;
	//protected File fileImportacionTurno;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTurno;
	protected JButton jButtonDuplicarToolBarTurno;
	protected JButton jButtonNuevoRelacionesToolBarTurno;
	
	
	public JButton jButtonGuardarCambiosToolBarTurno;
	protected JButton jButtonCopiarToolBarTurno;
	protected JButton jButtonVerFormToolBarTurno;
	public JButton jButtonGuardarCambiosTablaToolBarTurno;
	protected JButton jButtonMostrarOcultarTablaToolBarTurno;
	protected JButton jButtonCerrarToolBarTurno;
	
	protected JButton jButtonRecargarInformacionToolBarTurno;
	protected JButton jButtonProcesarInformacionToolBarTurno;
	protected JButton jButtonAnterioresToolBarTurno;
	protected JButton jButtonSiguientesToolBarTurno;
	protected JButton jButtonNuevoGuardarCambiosToolBarTurno;
	protected JButton jButtonAbrirOrderByToolBarTurno;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTurno;
	protected JMenuItem jMenuItemDuplicarTurno;
	protected JMenuItem jMenuItemNuevoRelacionesTurno;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTurno;
	protected JMenuItem jMenuItemCopiarTurno;
	protected JMenuItem jMenuItemVerFormTurno;
	protected JMenuItem jMenuItemGuardarCambiosTablaTurno;
	protected JMenuItem jMenuItemCerrarTurno;
	protected JMenuItem jMenuItemDetalleCerrarTurno;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTurno;
	protected JMenuItem jMenuItemDetalleMostarOcultarTurno;
	
	protected JMenuItem jMenuItemRecargarInformacionTurno;
	protected JMenuItem jMenuItemProcesarInformacionTurno;
	protected JMenuItem jMenuItemAnterioresTurno;
	protected JMenuItem jMenuItemSiguientesTurno;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTurno;
	protected JMenuItem jMenuItemAbrirOrderByTurno;
	protected JMenuItem jMenuItemMostrarOcultarTurno;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTurno;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTurno;
	protected JCheckBox jCheckBoxSeleccionadosTurno;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTurno;
	protected JCheckBox jCheckBoxConGraficoReporteTurno;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTurno;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTurno;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTurno;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTurno;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTurno;
	protected JTextField jTextFieldValorCampoGeneralTurno;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTurno;
	//public JList<Reporte> jListColumnasSelectReporteTurno;
	//public JScrollPane jScrollColumnasSelectReporteTurno;
	
	//public JLabel jLabelRelacionesSelectReporteTurno;
	//public JList<Reporte> jListRelacionesSelectReporteTurno;
	//public JScrollPane jScrollRelacionesSelectReporteTurno;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTurno;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTurno;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTurno;
	//public JLabel jLabelTiposArchivoReporteDinamicoTurno;
	
		
	//public JLabel jLabelArchivoImportacionTurno;	
	//public JLabel jLabelPathArchivoImportacionTurno;
	//protected JTextField jTextFieldPathArchivoImportacionTurno;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTurno;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTurno;
	
	//public JLabel jLabelColumnaCategoriaValorTurno;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTurno;
	
	//public JLabel jLabelColumnasValoresGraficoTurno;
	//public JList<Reporte> jListColumnasValoresGraficoTurno;
	//public JScrollPane jScrollColumnasValoresGraficoTurno;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTurno;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTurno;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTurno;
	
	
	
	
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
	//public int iHeightFormulario=484;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TurnoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTurno)	{
		this.jButtonRecargarInformacionTurno = jButtonRecargarInformacionTurno;
	}
	
	public JButton getjButtonProcesarInformacionTurno() {
		return this.jButtonProcesarInformacionTurno;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTurno)	{
		this.jButtonProcesarInformacionTurno = jButtonProcesarInformacionTurno;
	}
	
	
	public JButton getjButtonRecargarInformacionTurno() {
		return this.jButtonRecargarInformacionTurno;
	}
	
	
	public List<Turno> getturnos() {
		return this.turnos;
	}

	public void setturnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
	
	public List<Turno> getturnosAux() {
		return this.turnosAux;
	}

	public void setturnosAux(List<Turno> turnosAux) {
		this.turnosAux = turnosAux;
	}
	
	public List<Turno> getturnosEliminados() {
		return this.turnosEliminados;
	}

	public void setTurnosEliminados(List<Turno> turnosEliminados) {
		this.turnosEliminados = turnosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTurno() {
		return jComboBoxTiposSeleccionarTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTurno(
			JComboBox jComboBoxTiposSeleccionarTurno) {
		this.jComboBoxTiposSeleccionarTurno = jComboBoxTiposSeleccionarTurno;
	}
	
	public void setBorderResaltarTiposSeleccionarTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTurno .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTurno() {
		return jTextFieldValorCampoGeneralTurno;
	}

	public void setjTextFieldValorCampoGeneralTurno(
			JTextField jTextFieldValorCampoGeneralTurno) {
		this.jTextFieldValorCampoGeneralTurno = jTextFieldValorCampoGeneralTurno;
	}

	public void setBorderResaltarValorCampoGeneralTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTurno .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTurno() {
		return this.jCheckBoxSeleccionarTodosTurno;
	}

	public void setjCheckBoxSeleccionarTodosTurno(
			JCheckBox jCheckBoxSeleccionarTodosTurno) {
		this.jCheckBoxSeleccionarTodosTurno = jCheckBoxSeleccionarTodosTurno;
	}

	public void setBorderResaltarSeleccionarTodosTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTurno .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTurno() {
		return this.jCheckBoxSeleccionadosTurno;
	}

	public void setjCheckBoxSeleccionadosTurno(
			JCheckBox jCheckBoxSeleccionadosTurno) {
		this.jCheckBoxSeleccionadosTurno = jCheckBoxSeleccionadosTurno;
	}
	
	public void setBorderResaltarSeleccionadosTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTurno .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTurno() {
		return this.jComboBoxTiposArchivosReportesTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTurno(
			JComboBox jComboBoxTiposArchivosReportesTurno) {
		this.jComboBoxTiposArchivosReportesTurno = jComboBoxTiposArchivosReportesTurno;
	}

	public void setBorderResaltarTiposArchivosReportesTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTurno .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTurno() {
		return this.jComboBoxTiposReportesTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTurno(
			JComboBox jComboBoxTiposReportesTurno) {
		this.jComboBoxTiposReportesTurno = jComboBoxTiposReportesTurno;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTurno() {
	//	return jComboBoxTiposReportesDinamicoTurno;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTurno(
	//		JComboBox jComboBoxTiposReportesDinamicoTurno) {
	//	this.jComboBoxTiposReportesDinamicoTurno = jComboBoxTiposReportesDinamicoTurno;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTurno() {
	//	return jComboBoxTiposArchivosReportesDinamicoTurno;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTurno(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTurno) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTurno = jComboBoxTiposArchivosReportesDinamicoTurno;
	//}
	
	public void setBorderResaltarTiposReportesTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTurno .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTurno() {
		return this.jComboBoxTiposGraficosReportesTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTurno(
			JComboBox jComboBoxTiposGraficosReportesTurno) {
		this.jComboBoxTiposGraficosReportesTurno = jComboBoxTiposGraficosReportesTurno;
	}
	
	public void setBorderResaltarTiposGraficosReportesTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTurno .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTurno() {
		return this.jComboBoxTiposPaginacionTurno;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTurno(
			JComboBox jComboBoxTiposPaginacionTurno) {
		this.jComboBoxTiposPaginacionTurno = jComboBoxTiposPaginacionTurno;
	}
	
	public void setBorderResaltarTiposPaginacionTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTurno .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTurno() {
		return this.jComboBoxTiposRelacionesTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTurno() {
		return this.jComboBoxTiposAccionesTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTurno(
			JComboBox jComboBoxTiposRelacionesTurno) {
		this.jComboBoxTiposRelacionesTurno = jComboBoxTiposRelacionesTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTurno(
			JComboBox jComboBoxTiposAccionesTurno) {
		this.jComboBoxTiposAccionesTurno = jComboBoxTiposAccionesTurno;
	}
	
	public void setBorderResaltarTiposRelacionesTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTurno .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTurno() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurno.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTurno .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTurno() {
	//	return jCheckBoxConGraficoDinamicoTurno;
	//}

	//public void setjCheckBoxConGraficoDinamicoTurno(
	//		JCheckBox jCheckBoxConGraficoDinamicoTurno) {
	//	this.jCheckBoxConGraficoDinamicoTurno = jCheckBoxConGraficoDinamicoTurno;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTurno() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTurno.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTurno .setBorder(borderResaltar);		
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
		this.turnoSessionBean=new TurnoSessionBean();
		
		this.turnoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.turnoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.turnoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TurnoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TurnoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TurnoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Turno MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
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
		
		TurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTurno= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTurno,this.jTtoolBarTurno,
							"nuevo","nuevo","Nuevo"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTurno,this.jTtoolBarTurno,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTurno,this.jTtoolBarTurno,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTurno,this.jTtoolBarTurno,
							"duplicar","duplicar","Duplicar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTurno,this.jTtoolBarTurno,
							"copiar","copiar","Copiar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTurno,this.jTtoolBarTurno,
							"ver_form","ver_form","Ver"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTurno,this.jTtoolBarTurno,
							"recargar","recargar","Recargar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTurno,this.jTtoolBarTurno,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTurno,this.jTtoolBarTurno,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTurno,this.jTtoolBarTurno,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTurno,this.jTtoolBarTurno,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTurno,this.jTtoolBarTurno,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTurno,this.jTtoolBarTurno,
							"cerrar","cerrar","Salir"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTurno=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTurno;
			
				this.jButtonProcesarInformacionToolBarTurno=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTurno;
				
		//protected JButton jButtonModificarToolBarTurno;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTurno=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTurno=new JMenuMe("General");
		this.jmenuArchivoTurno=new JMenuMe("Archivo");
		this.jmenuAccionesTurno=new JMenuMe("Acciones");
		this.jmenuDatosTurno=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTurno= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTurno.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTurno,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTurno= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTurno.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTurno,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTurno= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTurno.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTurno,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTurno= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTurno.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTurno,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTurno= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTurno.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTurno,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTurno= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTurno.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTurno,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTurno= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTurno.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTurno,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTurno= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTurno.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTurno,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTurno= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTurno.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTurno,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTurno= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTurno.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTurno,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTurno= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTurno.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTurno,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTurno= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTurno.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTurno,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTurno= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTurno.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTurno,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTurno= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTurno.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTurno,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTurno= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTurno.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTurno,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTurno= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTurno.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTurno,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTurno= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTurno.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTurno,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTurno.add(this.jMenuItemCerrarTurno);
			
			this.jmenuAccionesTurno.add(this.jMenuItemNuevoTurno);
			this.jmenuAccionesTurno.add(this.jMenuItemNuevoGuardarCambiosTurno);
			this.jmenuAccionesTurno.add(this.jMenuItemNuevoRelacionesTurno);
			this.jmenuAccionesTurno.add(this.jMenuItemGuardarCambiosTablaTurno);		
			this.jmenuAccionesTurno.add(this.jMenuItemDuplicarTurno);		
			this.jmenuAccionesTurno.add(this.jMenuItemCopiarTurno);		
			this.jmenuAccionesTurno.add(this.jMenuItemVerFormTurno);		
			
			this.jmenuDatosTurno.add(this.jMenuItemRecargarInformacionTurno);				
			this.jmenuDatosTurno.add(this.jMenuItemAnterioresTurno);				
			this.jmenuDatosTurno.add(this.jMenuItemSiguientesTurno);				
			this.jmenuDatosTurno.add(this.jMenuItemAbrirOrderByTurno);				
			this.jmenuDatosTurno.add(this.jMenuItemMostrarOcultarTurno);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTurno.add(this.jMenuItemGuardarCambiosTurno);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTurno, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTurno, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTurno, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTurno.add(this.jmenuArchivoTurno);		
			this.jmenuBarTurno.add(this.jmenuAccionesTurno);		
			this.jmenuBarTurno.add(this.jmenuDatosTurno);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTurno);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTurno() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTurno=new JTabbedPane();


		this.jTabbedPaneBusquedasTurno.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTurno.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTurno.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTurno.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTurno,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTurno = new TurnoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Turno DATOS");
			this.jInternalFrameDetalleFormTurno = new TurnoDetalleFormJInternalFrame(jDesktopPane,this.turnoSessionBean.getConGuardarRelaciones(),this.turnoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTurno = null;//new TurnoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTurno= new GridBagLayout();
		
		
		this.jTableDatosTurno = new JTableMe();      
		
		String sToolTipTurno="";
		sToolTipTurno=TurnoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTurno+="(Nomina.Turno)";
		}
		
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTurno+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTurno.setToolTipText(sToolTipTurno);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTurno);
		this.jTableDatosTurno.setAutoCreateRowSorter(true);
		this.jTableDatosTurno.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTurno.setRowSelectionAllowed(true);
		this.jTableDatosTurno.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTurno,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTurno = new JButtonMe();
		this.jButtonDuplicarTurno = new JButtonMe();
		this.jButtonCopiarTurno = new JButtonMe();
		this.jButtonVerFormTurno = new JButtonMe();
		this.jButtonNuevoRelacionesTurno = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTurno = new JButtonMe();
		this.jButtonCerrarTurno = new JButtonMe();
		
		this.jScrollPanelDatosTurno = new JScrollPane();   
        this.jScrollPanelDatosGeneralTurno = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Turno";
		
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turnos" + this.sPath));
		} else {
			this.jScrollPanelDatosTurno.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTurno.setToolTipText("Acciones");
        this.jPanelAccionesTurno.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTurno, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTurno=new ReporteDinamicoJInternalFrame(TurnoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTurno();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTurno=new ImportacionJInternalFrame(TurnoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTurno();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTurno = new JButtonMe();
		
		this.jButtonAbrirOrderByTurno.setText("Orden");
		this.jButtonAbrirOrderByTurno.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTurno,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTurno=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTurno,false,this);
			
			//this.cargarOrderByTurno(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTurno=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTurno,true,this);
			
			//this.cargarOrderByTurno(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTurno.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosTurno.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosTurno.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosTurno.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTurno.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTurno.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTurno.setText("Nuevo");
		this.jButtonDuplicarTurno.setText("Duplicar");
		this.jButtonCopiarTurno.setText("Copiar");
		this.jButtonVerFormTurno.setText("Ver");
		this.jButtonNuevoRelacionesTurno.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTurno.setText("Guardar");
		this.jButtonCerrarTurno.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTurno,"nuevo_button","Nuevo",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTurno,"duplicar_button","Duplicar",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTurno,"copiar_button","Copiar",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTurno,"ver_form","Ver",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTurno,"nuevorelaciones_button","Nuevo Rel",this.turnoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTurno,"guardarcambiostabla_button","Guardar",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTurno,"cerrar_button","Salir",this.turnoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTurno, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTurno.setToolTipText("Nuevo"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTurno.setToolTipText("Duplicar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTurno.setToolTipText("Copiar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTurno.setToolTipText("Ver"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTurno.setToolTipText("Nuevo Rel"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTurno.setToolTipText("Guardar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTurno.setToolTipText("Salir"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTurno";
		inputMap = this.jButtonNuevoTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTurno"));
		
		//DUPLICAR
		sMapKey = "DuplicarTurno";
		inputMap = this.jButtonDuplicarTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTurno"));
		
		//COPIAR
		sMapKey = "CopiarTurno";
		inputMap = this.jButtonCopiarTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTurno"));
		
		//VEr FORM
		sMapKey = "VerFormTurno";
		inputMap = this.jButtonVerFormTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTurno"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTurno";
		inputMap = this.jButtonNuevoRelacionesTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTurno"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTurno";
		inputMap = this.jButtonModificarTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTurno"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTurno";
		inputMap = this.jButtonCerrarTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTurno"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTurno";
		inputMap = this.jButtonGuardarCambiosTablaTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTurno"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Turno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Turno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Turno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Turno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Turno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTurno.setName("jPanelParametrosReportesTurno"); 
		
		this.jPanelParametrosReportesAccionesTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTurno.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTurno.setName("jPanelParametrosReportesAccionesTurno"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTurno, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTurno, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTurno = new JButtonMe();
		this.jButtonRecargarInformacionTurno.setText("Recargar");
		this.jButtonRecargarInformacionTurno.setToolTipText("Recargar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTurno,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTurno = new JButtonMe();
		this.jButtonProcesarInformacionTurno.setText("Procesar");
		this.jButtonProcesarInformacionTurno.setToolTipText("Procesar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTurno.setVisible(false);
			
		this.jButtonProcesarInformacionTurno.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTurno.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTurno.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTurno = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTurno.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTurno.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTurno = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTurno.setText("TIPO");       
		this.jComboBoxTiposReportesTurno.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTurno = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTurno.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTurno.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTurno = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTurno.setText("Paginacion");
		this.jComboBoxTiposPaginacionTurno.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTurno = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTurno.setText("Accion");
		this.jComboBoxTiposRelacionesTurno.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTurno = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTurno.setText("Accion");
		this.jComboBoxTiposAccionesTurno.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTurno = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTurno.setText("Accion");
		this.jComboBoxTiposSeleccionarTurno.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTurno=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTurno.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTurno.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTurno.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTurno = new JLabelMe();
		
		this.jLabelAccionesTurno.setText("Acciones");		
		this.jLabelAccionesTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTurno = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTurno.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTurno.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTurno = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTurno.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTurno.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTurno = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTurno.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTurno.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTurno = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTurno.setText("Graf.");
		this.jCheckBoxConGraficoReporteTurno.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTurno = new JButtonMe();
		//this.jButtonAnterioresTurno.setText("<<");
        this.jButtonAnterioresTurno.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTurno,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTurno = new JButtonMe();
		//this.jButtonSiguientesTurno.setText(">>");
        this.jButtonSiguientesTurno.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTurno,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTurno = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTurno.setText("Nue");
        this.jButtonNuevoGuardarCambiosTurno.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTurno,"nuevoguardarcambios_button","Nue",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTurno";
		inputMap = this.jButtonNuevoGuardarCambiosTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTurno"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTurno";
		inputMap = this.jButtonRecargarInformacionTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTurno"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTurno";
		inputMap = this.jButtonSiguientesTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTurno"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTurno";
		inputMap = this.jButtonAnterioresTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTurno"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTurno();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTurno.setMinimumSize(new Dimension(this.getWidth(),TurnoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TurnoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTurno.setMaximumSize(new Dimension(this.getWidth(),TurnoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TurnoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTurno.setPreferredSize(new Dimension(this.getWidth(),TurnoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TurnoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTurno = new GridBagLayout();

			this.jPanelPaginacionTurno.setLayout(gridaBagLayoutPaginacionTurno);						
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = 0;
			this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTurno.add(this.jButtonAnterioresTurno, this.gridBagConstraintsTurno);
					
						
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTurno.gridy = 0;
			
			this.jPanelPaginacionTurno.add(this.jButtonNuevoGuardarCambiosTurno, this.gridBagConstraintsTurno);
						
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTurno.gridy = 0;
			this.jPanelPaginacionTurno.add(this.jButtonSiguientesTurno, this.gridBagConstraintsTurno);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = 1;
			this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTurno.add(this.jButtonNuevoTurno, this.gridBagConstraintsTurno);
						
			
			
			if(!this.turnoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTurno = new GridBagConstraints();
				this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTurno.gridy = 1;
				this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTurno.add(this.jButtonGuardarCambiosTablaTurno, this.gridBagConstraintsTurno);
			}
			
			
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = 1;
			this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTurno.add(this.jButtonDuplicarTurno, this.gridBagConstraintsTurno);
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = 1;
			this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTurno.add(this.jButtonCopiarTurno, this.gridBagConstraintsTurno);
		
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = 1;
			this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTurno.add(this.jButtonVerFormTurno, this.gridBagConstraintsTurno);
		
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = 1;
			this.gridBagConstraintsTurno.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTurno.add(this.jButtonCerrarTurno, this.gridBagConstraintsTurno);
		
		
		
		this.jButtonRecargarInformacionTurno.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTurno.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTurno.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTurno, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTurno.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTurno.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTurno.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTurno.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTurno.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTurno.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTurno.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTurno.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTurno.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTurno.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTurno.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTurno.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTurno.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTurno.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTurno.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTurno.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTurno.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTurno.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTurno.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTurno.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTurno.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTurno.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTurno.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTurno.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTurno.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTurno.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTurno.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTurno, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTurno.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTurno.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTurno.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTurno.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTurno.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTurno.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTurno = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTurno = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Turno = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Turno = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Turno = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Turno = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTurno.setLayout(gridaBagParametrosReportesTurno);
			this.jPanelParametrosReportesAccionesTurno.setLayout(gridaBagParametrosReportesAccionesTurno);
			
			
			this.jPanelParametrosAuxiliar1Turno.setLayout(gridaBagParametrosAuxiliar1Turno);
			this.jPanelParametrosAuxiliar2Turno.setLayout(gridaBagParametrosAuxiliar2Turno);
			this.jPanelParametrosAuxiliar3Turno.setLayout(gridaBagParametrosAuxiliar3Turno);
			this.jPanelParametrosAuxiliar4Turno.setLayout(gridaBagParametrosAuxiliar4Turno);
			//this.jPanelParametrosAuxiliar5Turno.setLayout(gridaBagParametrosAuxiliar2Turno);			
			
			
			
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurno.add(this.jButtonRecargarInformacionTurno, this.gridBagConstraintsTurno);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Turno.add(this.jComboBoxTiposPaginacionTurno, this.gridBagConstraintsTurno);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Turno.add(this.jCheckBoxConAltoMaximoTablaTurno, this.gridBagConstraintsTurno);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Turno.add(this.jComboBoxTiposArchivosReportesTurno, this.gridBagConstraintsTurno);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurno.add(this.jPanelParametrosAuxiliar1Turno, this.gridBagConstraintsTurno);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTurno.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Turno.add(this.jComboBoxTiposReportesTurno, this.gridBagConstraintsTurno);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurno.add(this.jPanelParametrosAuxiliar4Turno, this.gridBagConstraintsTurno);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurno.add(this.jComboBoxTiposReportesTurno, this.gridBagConstraintsTurno);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTurno.add(this.jCheckBoxGenerarReporteTurno, this.gridBagConstraintsTurno);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurno.add(this.jPanelParametrosAuxiliar2Turno, this.gridBagConstraintsTurno);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTurno.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTurno.add(this.jLabelAccionesTurno, this.gridBagConstraintsTurno);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTurno = new GridBagConstraints();
				this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTurno.add(this.jButtonAbrirOrderByTurno, this.gridBagConstraintsTurno);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurno.add(this.jComboBoxTiposSeleccionarTurno, this.gridBagConstraintsTurno);			
			
			
			/*
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTurno.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTurno.add(this.jCheckBoxSeleccionarTodosTurno, this.gridBagConstraintsTurno);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTurno.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Turno.add(this.jCheckBoxSeleccionarTodosTurno, this.gridBagConstraintsTurno);															
				
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTurno.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Turno.add(this.jCheckBoxSeleccionadosTurno, this.gridBagConstraintsTurno);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurno.add(this.jPanelParametrosAuxiliar3Turno, this.gridBagConstraintsTurno);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurno.add(this.jComboBoxTiposAccionesTurno, this.gridBagConstraintsTurno);
	
				
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurno.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurno.add(this.jTextFieldValorCampoGeneralTurno, this.gridBagConstraintsTurno);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTurno = new GridBagLayout();

			this.jScrollPanelDatosTurno.setLayout(gridaBagLayoutDatosTurno);
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = 0;
			this.gridBagConstraintsTurno.gridx = 0;
			
			this.jScrollPanelDatosTurno.add(this.jTableDatosTurno, this.gridBagConstraintsTurno);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTurno.setViewportView(this.jTableDatosTurno);
		this.jTableDatosTurno.setFillsViewportHeight(true);
		this.jTableDatosTurno.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTurno= new GridBagLayout();
		this.jPanelAccionesTurno.setLayout(gridaBagLayoutAccionesTurno);
		
		
		/*	
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 0;
			
		this.jPanelAccionesTurno.add(this.jButtonNuevoTurno, this.gridBagConstraintsTurno);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTurno = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTurno);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.turnoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTurno = new GridBagConstraints();						
			this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTurno.gridx = 0;		
			//this.gridBagConstraintsTurno.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTurno.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTurno, this.gridBagConstraintsTurno);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTurno.gridx = 0;		
		//this.gridBagConstraintsTurno.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTurno.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTurno);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTurno, this.gridBagConstraintsTurno);								
		
		
		/*
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTurno, this.gridBagConstraintsTurno);
		*/		
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTurno.gridx =0;
		this.gridBagConstraintsTurno.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTurno.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTurno, this.gridBagConstraintsTurno);
				
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTurno, this.gridBagConstraintsTurno);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TurnoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTurno= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTurno = new GridBagLayout();
			this.jPanelBusquedasParametrosTurno.setLayout(gridaBagLayoutBusquedasParametrosTurno);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTurno=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTurno.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTurno.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTurno.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTurno, this.gridBagConstraintsTurno);
			
			
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTurno, this.gridBagConstraintsTurno);
		
			
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTurno, this.gridBagConstraintsTurno);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTurno;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTurno() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTurno = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTurno.setName("jPanelReporteDinamicoTurno"); 
		
		this.jPanelReporteDinamicoTurno.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTurno.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTurno.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTurno.setLayout(gridaBagLayoutReporteDinamicoTurno);
		
		
		this.jInternalFrameReporteDinamicoTurno= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTurno = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTurno= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTurno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTurno.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTurno.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTurno.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTurno.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTurno.setResizable(true);
	    this.jInternalFrameReporteDinamicoTurno.setClosable(true);
	    this.jInternalFrameReporteDinamicoTurno.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTurno.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTurno.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTurno.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turnos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTurno = new JLabelMe();

		this.jLabelColumnasSelectReporteTurno.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTurno.add(this.jLabelColumnasSelectReporteTurno, this.gridBagConstraintsTurno);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTurno = new JList<Reporte>();
		this.jListColumnasSelectReporteTurno.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTurno.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTurno.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTurno.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTurno.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTurno=new JScrollPane(this.jListColumnasSelectReporteTurno);
			
			this.jScrollColumnasSelectReporteTurno.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTurno.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTurno.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTurno.add(this.jListColumnasSelectReporteTurno, this.gridBagConstraintsTurno);
		this.jPanelReporteDinamicoTurno.add(this.jScrollColumnasSelectReporteTurno, this.gridBagConstraintsTurno);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTurno = new JLabelMe();

		this.jLabelRelacionesSelectReporteTurno.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTurno = new JList<Reporte>();
		this.jListRelacionesSelectReporteTurno.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTurno.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTurno.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTurno.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTurno.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTurno=new JScrollPane(this.jListRelacionesSelectReporteTurno);
			
			this.jScrollRelacionesSelectReporteTurno.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTurno.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTurno.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTurno = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTurno = new JComboBoxMe();
		this.jListColumnasValoresGraficoTurno = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTurno = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTurno.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTurno.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTurno.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTurno.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTurno = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTurno.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTurno.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTurno.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTurno.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTurno = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTurno.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTurno.add(this.jLabelGenerarExcelReporteDinamicoTurno, this.gridBagConstraintsTurno);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTurno = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTurno.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTurno,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTurno.setToolTipText("Generar EXCEL"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTurno.add(this.jButtonGenerarExcelReporteDinamicoTurno, this.gridBagConstraintsTurno);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTurno.add(this.jComboBoxTiposReportesDinamicoTurno, this.gridBagConstraintsTurno);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTurno = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTurno.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTurno.add(this.jLabelTiposArchivoReporteDinamicoTurno, this.gridBagConstraintsTurno);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTurno.add(this.jComboBoxTiposArchivosReportesDinamicoTurno, this.gridBagConstraintsTurno);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTurno = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTurno.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTurno,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTurno.setToolTipText("Generar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTurno.add(this.jButtonGenerarReporteDinamicoTurno, this.gridBagConstraintsTurno);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTurno = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTurno.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTurno,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTurno.setToolTipText("Cancelar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTurno.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTurno.add(this.jButtonCerrarReporteDinamicoTurno, this.gridBagConstraintsTurno);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTurno = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTurno= new JScrollPane(jPanelReporteDinamicoTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTurno.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTurno.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTurno.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turnos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTurno.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTurno.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTurno.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTurno.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTurno);
		this.jInternalFrameReporteDinamicoTurno.getContentPane().add(this.jScrollPanelReporteDinamicoTurno, this.gridBagConstraintsTurno);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTurno() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTurno = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTurno.setName("jPanelImportacionTurno"); 
		
		this.jPanelImportacionTurno.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTurno.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTurno.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTurno.setLayout(gridaBagLayoutImportacionTurno);
		
		
		this.jInternalFrameImportacionTurno= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTurno= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTurno = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTurno= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTurno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTurno.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTurno.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTurno.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTurno.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTurno.setResizable(true);
	    this.jInternalFrameImportacionTurno.setClosable(true);
	    this.jInternalFrameImportacionTurno.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTurno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTurno.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTurno.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTurno.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTurno.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTurno.setResizable(true);
	    this.jInternalFrameImportacionTurno.setClosable(true);
	    this.jInternalFrameImportacionTurno.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTurno.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTurno.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTurno.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turnos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTurno = new JLabelMe();

		this.jLabelArchivoImportacionTurno.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = iPosYImportacion;		
		this.gridBagConstraintsTurno.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTurno.add(this.jLabelArchivoImportacionTurno, this.gridBagConstraintsTurno);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTurno = new JFileChooser();		
		this.jFileChooserImportacionTurno.setToolTipText("ESCOGER ARCHIVO"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTurno = new JButtonMe();
		this.jButtonAbrirImportacionTurno.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTurno,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTurno.setToolTipText("Generar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = iPosYImportacion;
		this.gridBagConstraintsTurno.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTurno.add(this.jButtonAbrirImportacionTurno, this.gridBagConstraintsTurno);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTurno = new JLabelMe();

		this.jLabelPathArchivoImportacionTurno.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = iPosYImportacion;		
		this.gridBagConstraintsTurno.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTurno.add(this.jLabelPathArchivoImportacionTurno, this.gridBagConstraintsTurno);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTurno=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTurno.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTurno.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTurno.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = iPosYImportacion;
		this.gridBagConstraintsTurno.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTurno.add(this.jTextFieldPathArchivoImportacionTurno, this.gridBagConstraintsTurno);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTurno = new JButtonMe();
		this.jButtonGenerarImportacionTurno.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTurno,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTurno.setToolTipText("Generar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = iPosYImportacion;
		this.gridBagConstraintsTurno.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTurno.add(this.jButtonGenerarImportacionTurno, this.gridBagConstraintsTurno);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTurno = new JButtonMe();
		this.jButtonCerrarImportacionTurno.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTurno,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTurno.setToolTipText("Cancelar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = iPosYImportacion;
		this.gridBagConstraintsTurno.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTurno.add(this.jButtonCerrarImportacionTurno, this.gridBagConstraintsTurno);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTurno = new GridBagLayout();
		
		this.jScrollPanelImportacionTurno= new JScrollPane(jPanelImportacionTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy =iPosYImportacion;
		this.gridBagConstraintsTurno.gridx =iPosXImportacion;
		this.gridBagConstraintsTurno.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTurno.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTurno.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTurno);
		this.jInternalFrameImportacionTurno.getContentPane().add(this.jScrollPanelImportacionTurno, this.gridBagConstraintsTurno);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTurno(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTurno = new JButtonMe();
			this.jButtonAbrirOrderByTurno.setText("Orden");
			this.jButtonAbrirOrderByTurno.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTurno,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTurno";
			inputMap = this.jButtonAbrirOrderByTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTurno"));
		
		
			GridBagLayout gridaBagLayoutOrderByTurno = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTurno.setName("jPanelOrderByTurno"); 
			
			this.jPanelOrderByTurno.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTurno.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTurno.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTurno.setLayout(gridaBagLayoutOrderByTurno);
			
			
			this.jTableDatosTurnoOrderBy = new JTableMe();        
			this.jTableDatosTurnoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTurnoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTurnoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTurnoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTurnoOrderBy.setViewportView(this.jTableDatosTurnoOrderBy);
			this.jTableDatosTurnoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTurnoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTurno= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTurno= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTurno = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTurno= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTurno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTurno.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTurno.setTitle("Orden");
			this.jInternalFrameOrderByTurno.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTurno.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTurno.setResizable(true);
			this.jInternalFrameOrderByTurno.setClosable(true);
			this.jInternalFrameOrderByTurno.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTurno.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTurno.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTurno.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turnos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTurno.gridx =iPosXOrderBy;
			this.gridBagConstraintsTurno.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTurno.ipady =150;
				
			this.jPanelOrderByTurno.add(jScrollPanelDatosTurnoOrderBy, this.gridBagConstraintsTurno);//this.jTableDatosTurnoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTurno = new JButtonMe();
			this.jButtonCerrarOrderByTurno.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTurno,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTurno.setToolTipText("Cancelar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTurno.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTurno.add(this.jButtonCerrarOrderByTurno, this.gridBagConstraintsTurno);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTurno = new GridBagLayout();
			
			this.jScrollPanelOrderByTurno= new JScrollPane(jPanelOrderByTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy =iPosYOrderBy;
			this.gridBagConstraintsTurno.gridx =iPosXOrderBy;
			this.gridBagConstraintsTurno.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTurno.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTurno.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTurno);
			
			this.jInternalFrameOrderByTurno.getContentPane().add(this.jScrollPanelOrderByTurno, this.gridBagConstraintsTurno);			
		
		} else {
			this.jButtonAbrirOrderByTurno = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.turnoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTurno.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTurno.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTurno.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTurno.getRowHeight();//TurnoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TurnoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTurno.isSelected()) {
					iHeightTable=TurnoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TurnoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TurnoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TurnoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTurno.isSelected()) {
					iHeightTable=TurnoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TurnoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TurnoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTurno.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTurno.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTurno.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTurno.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTurno.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTurno.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTurno!=null && this.jInternalFrameOrderByTurno.getjTableDatosOrderBy()!=null) {
			//if(!this.turnoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTurno.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTurno.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTurno.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTurno.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTurno.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTurno.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=turnoLogic.getTurnos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=turnos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Turno> TraerTurnoBeans(List<Turno> turnos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Turno turno:turnos) {
					
				if(!(TurnoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TurnoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					turno.setsDetalleGeneralEntityReporte(TurnoConstantesFunciones.getTurnoDescripcion(turno));
										
						
					
						
					
				} else  {
							
					//turno.setsDetalleGeneralEntityReporte(turno.getsDetalleGeneralEntityReporte());
										
				}
				
				//turnobeans.add(turnobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return turnos;
    }
	//PARA REPORTES FIN
}
