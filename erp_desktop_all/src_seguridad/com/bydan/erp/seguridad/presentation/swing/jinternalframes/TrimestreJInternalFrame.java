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
import com.bydan.erp.seguridad.util.TrimestreConstantesFunciones;

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
public class TrimestreJInternalFrame extends TrimestreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTrimestre;
	
	protected JMenuBar jmenuBarTrimestre;
	
	protected JMenu jmenuTrimestre;
	protected JMenu jmenuDatosTrimestre;
	protected JMenu jmenuArchivoTrimestre;
	protected JMenu jmenuAccionesTrimestre;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTrimestre;	
	protected GridBagConstraints gridBagConstraintsTrimestre;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TrimestreDetalleFormJInternalFrame jInternalFrameDetalleFormTrimestre;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTrimestre;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTrimestre;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TrimestreSessionBean trimestreSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Trimestre> trimestres;		
	public List<Trimestre> trimestresEliminados;	
	public List<Trimestre> trimestresAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTrimestre;		
	protected JButton jButtonAbrirOrderByTrimestre;
	
	
	//protected JPanel jPanelOrderByTrimestre;
	//public JScrollPane jScrollPanelOrderByTrimestre;	
	//protected JButton jButtonCerrarOrderByTrimestre;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TrimestreLogic trimestreLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTrimestre;
	public JScrollPane jScrollPanelDatosEdicionTrimestre;
	public JScrollPane jScrollPanelDatosGeneralTrimestre;
    
	
	
	//public JScrollPane jScrollPanelDatosTrimestreOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTrimestre;
	//public JScrollPane jScrollPanelImportacionTrimestre;
	
	
	
	protected JPanel jPanelAccionesTrimestre;
	
    protected JPanel jPanelPaginacionTrimestre;
    protected JPanel jPanelParametrosReportesTrimestre;
	protected JPanel jPanelParametrosReportesAccionesTrimestre;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Trimestre;
	protected JPanel jPanelParametrosAuxiliar2Trimestre;
	protected JPanel jPanelParametrosAuxiliar3Trimestre;
	protected JPanel jPanelParametrosAuxiliar4Trimestre;
	//protected JPanel jPanelParametrosAuxiliar5Trimestre;
	
	
	
	//protected JPanel jPanelReporteDinamicoTrimestre;
	//protected JPanel jPanelImportacionTrimestre;
	
	
	public JTable jTableDatosTrimestre;
	
	
	
	//public JTable jTableDatosTrimestreOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTrimestre;
	protected JButton jButtonDuplicarTrimestre;
	protected JButton jButtonCopiarTrimestre;
	protected JButton jButtonVerFormTrimestre;
	protected JButton jButtonNuevoRelacionesTrimestre;
	protected JButton jButtonModificarTrimestre;
	
    protected JButton jButtonGuardarCambiosTablaTrimestre;
	protected JButton jButtonCerrarTrimestre;
	
	
	protected JButton jButtonRecargarInformacionTrimestre;
	protected JButton jButtonProcesarInformacionTrimestre;
	
	
	protected JButton jButtonAnterioresTrimestre;
	protected JButton jButtonSiguientesTrimestre;
	protected JButton jButtonNuevoGuardarCambiosTrimestre;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTrimestre;
	//protected JButton jButtonCerrarReporteDinamicoTrimestre;
	//protected JButton jButtonGenerarExcelReporteDinamicoTrimestre;	
	
	
	
	//protected JButton jButtonAbrirImportacionTrimestre;
	//protected JButton jButtonGenerarImportacionTrimestre;
	//protected JButton jButtonCerrarImportacionTrimestre;
	//protected JFileChooser jFileChooserImportacionTrimestre;
	//protected File fileImportacionTrimestre;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTrimestre;
	protected JButton jButtonDuplicarToolBarTrimestre;
	protected JButton jButtonNuevoRelacionesToolBarTrimestre;
	
	
	public JButton jButtonGuardarCambiosToolBarTrimestre;
	protected JButton jButtonCopiarToolBarTrimestre;
	protected JButton jButtonVerFormToolBarTrimestre;
	public JButton jButtonGuardarCambiosTablaToolBarTrimestre;
	protected JButton jButtonMostrarOcultarTablaToolBarTrimestre;
	protected JButton jButtonCerrarToolBarTrimestre;
	
	protected JButton jButtonRecargarInformacionToolBarTrimestre;
	protected JButton jButtonProcesarInformacionToolBarTrimestre;
	protected JButton jButtonAnterioresToolBarTrimestre;
	protected JButton jButtonSiguientesToolBarTrimestre;
	protected JButton jButtonNuevoGuardarCambiosToolBarTrimestre;
	protected JButton jButtonAbrirOrderByToolBarTrimestre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTrimestre;
	protected JMenuItem jMenuItemDuplicarTrimestre;
	protected JMenuItem jMenuItemNuevoRelacionesTrimestre;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTrimestre;
	protected JMenuItem jMenuItemCopiarTrimestre;
	protected JMenuItem jMenuItemVerFormTrimestre;
	protected JMenuItem jMenuItemGuardarCambiosTablaTrimestre;
	protected JMenuItem jMenuItemCerrarTrimestre;
	protected JMenuItem jMenuItemDetalleCerrarTrimestre;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTrimestre;
	protected JMenuItem jMenuItemDetalleMostarOcultarTrimestre;
	
	protected JMenuItem jMenuItemRecargarInformacionTrimestre;
	protected JMenuItem jMenuItemProcesarInformacionTrimestre;
	protected JMenuItem jMenuItemAnterioresTrimestre;
	protected JMenuItem jMenuItemSiguientesTrimestre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTrimestre;
	protected JMenuItem jMenuItemAbrirOrderByTrimestre;
	protected JMenuItem jMenuItemMostrarOcultarTrimestre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTrimestre;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTrimestre;
	protected JCheckBox jCheckBoxSeleccionadosTrimestre;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTrimestre;
	protected JCheckBox jCheckBoxConGraficoReporteTrimestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTrimestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTrimestre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTrimestre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTrimestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTrimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTrimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTrimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTrimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTrimestre;
	protected JTextField jTextFieldValorCampoGeneralTrimestre;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTrimestre;
	//public JList<Reporte> jListColumnasSelectReporteTrimestre;
	//public JScrollPane jScrollColumnasSelectReporteTrimestre;
	
	//public JLabel jLabelRelacionesSelectReporteTrimestre;
	//public JList<Reporte> jListRelacionesSelectReporteTrimestre;
	//public JScrollPane jScrollRelacionesSelectReporteTrimestre;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTrimestre;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTrimestre;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTrimestre;
	//public JLabel jLabelTiposArchivoReporteDinamicoTrimestre;
	
		
	//public JLabel jLabelArchivoImportacionTrimestre;	
	//public JLabel jLabelPathArchivoImportacionTrimestre;
	//protected JTextField jTextFieldPathArchivoImportacionTrimestre;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTrimestre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTrimestre;
	
	//public JLabel jLabelColumnaCategoriaValorTrimestre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTrimestre;
	
	//public JLabel jLabelColumnasValoresGraficoTrimestre;
	//public JList<Reporte> jListColumnasValoresGraficoTrimestre;
	//public JScrollPane jScrollColumnasValoresGraficoTrimestre;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTrimestre;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTrimestre;	
	
	
	
	
	
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
	public TrimestreJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TrimestreJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TrimestreJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TrimestreJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTrimestre)	{
		this.jButtonRecargarInformacionTrimestre = jButtonRecargarInformacionTrimestre;
	}
	
	public JButton getjButtonProcesarInformacionTrimestre() {
		return this.jButtonProcesarInformacionTrimestre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTrimestre)	{
		this.jButtonProcesarInformacionTrimestre = jButtonProcesarInformacionTrimestre;
	}
	
	
	public JButton getjButtonRecargarInformacionTrimestre() {
		return this.jButtonRecargarInformacionTrimestre;
	}
	
	
	public List<Trimestre> gettrimestres() {
		return this.trimestres;
	}

	public void settrimestres(List<Trimestre> trimestres) {
		this.trimestres = trimestres;
	}
	
	public List<Trimestre> gettrimestresAux() {
		return this.trimestresAux;
	}

	public void settrimestresAux(List<Trimestre> trimestresAux) {
		this.trimestresAux = trimestresAux;
	}
	
	public List<Trimestre> gettrimestresEliminados() {
		return this.trimestresEliminados;
	}

	public void setTrimestresEliminados(List<Trimestre> trimestresEliminados) {
		this.trimestresEliminados = trimestresEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTrimestre() {
		return jComboBoxTiposSeleccionarTrimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTrimestre(
			JComboBox jComboBoxTiposSeleccionarTrimestre) {
		this.jComboBoxTiposSeleccionarTrimestre = jComboBoxTiposSeleccionarTrimestre;
	}
	
	public void setBorderResaltarTiposSeleccionarTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTrimestre .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTrimestre() {
		return jTextFieldValorCampoGeneralTrimestre;
	}

	public void setjTextFieldValorCampoGeneralTrimestre(
			JTextField jTextFieldValorCampoGeneralTrimestre) {
		this.jTextFieldValorCampoGeneralTrimestre = jTextFieldValorCampoGeneralTrimestre;
	}

	public void setBorderResaltarValorCampoGeneralTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTrimestre .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTrimestre() {
		return this.jCheckBoxSeleccionarTodosTrimestre;
	}

	public void setjCheckBoxSeleccionarTodosTrimestre(
			JCheckBox jCheckBoxSeleccionarTodosTrimestre) {
		this.jCheckBoxSeleccionarTodosTrimestre = jCheckBoxSeleccionarTodosTrimestre;
	}

	public void setBorderResaltarSeleccionarTodosTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTrimestre .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTrimestre() {
		return this.jCheckBoxSeleccionadosTrimestre;
	}

	public void setjCheckBoxSeleccionadosTrimestre(
			JCheckBox jCheckBoxSeleccionadosTrimestre) {
		this.jCheckBoxSeleccionadosTrimestre = jCheckBoxSeleccionadosTrimestre;
	}
	
	public void setBorderResaltarSeleccionadosTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTrimestre .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTrimestre() {
		return this.jComboBoxTiposArchivosReportesTrimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTrimestre(
			JComboBox jComboBoxTiposArchivosReportesTrimestre) {
		this.jComboBoxTiposArchivosReportesTrimestre = jComboBoxTiposArchivosReportesTrimestre;
	}

	public void setBorderResaltarTiposArchivosReportesTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTrimestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTrimestre() {
		return this.jComboBoxTiposReportesTrimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTrimestre(
			JComboBox jComboBoxTiposReportesTrimestre) {
		this.jComboBoxTiposReportesTrimestre = jComboBoxTiposReportesTrimestre;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTrimestre() {
	//	return jComboBoxTiposReportesDinamicoTrimestre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTrimestre(
	//		JComboBox jComboBoxTiposReportesDinamicoTrimestre) {
	//	this.jComboBoxTiposReportesDinamicoTrimestre = jComboBoxTiposReportesDinamicoTrimestre;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTrimestre() {
	//	return jComboBoxTiposArchivosReportesDinamicoTrimestre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTrimestre(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTrimestre) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTrimestre = jComboBoxTiposArchivosReportesDinamicoTrimestre;
	//}
	
	public void setBorderResaltarTiposReportesTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTrimestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTrimestre() {
		return this.jComboBoxTiposGraficosReportesTrimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTrimestre(
			JComboBox jComboBoxTiposGraficosReportesTrimestre) {
		this.jComboBoxTiposGraficosReportesTrimestre = jComboBoxTiposGraficosReportesTrimestre;
	}
	
	public void setBorderResaltarTiposGraficosReportesTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTrimestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTrimestre() {
		return this.jComboBoxTiposPaginacionTrimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTrimestre(
			JComboBox jComboBoxTiposPaginacionTrimestre) {
		this.jComboBoxTiposPaginacionTrimestre = jComboBoxTiposPaginacionTrimestre;
	}
	
	public void setBorderResaltarTiposPaginacionTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTrimestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTrimestre() {
		return this.jComboBoxTiposRelacionesTrimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTrimestre() {
		return this.jComboBoxTiposAccionesTrimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTrimestre(
			JComboBox jComboBoxTiposRelacionesTrimestre) {
		this.jComboBoxTiposRelacionesTrimestre = jComboBoxTiposRelacionesTrimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTrimestre(
			JComboBox jComboBoxTiposAccionesTrimestre) {
		this.jComboBoxTiposAccionesTrimestre = jComboBoxTiposAccionesTrimestre;
	}
	
	public void setBorderResaltarTiposRelacionesTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTrimestre .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTrimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTrimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTrimestre .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTrimestre() {
	//	return jCheckBoxConGraficoDinamicoTrimestre;
	//}

	//public void setjCheckBoxConGraficoDinamicoTrimestre(
	//		JCheckBox jCheckBoxConGraficoDinamicoTrimestre) {
	//	this.jCheckBoxConGraficoDinamicoTrimestre = jCheckBoxConGraficoDinamicoTrimestre;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTrimestre() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTrimestre.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTrimestre .setBorder(borderResaltar);		
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
		this.trimestreSessionBean=new TrimestreSessionBean();
		
		this.trimestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.trimestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.trimestreSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TrimestreJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TrimestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TrimestreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TrimestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TrimestreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Trimestre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
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
		
		TrimestreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTrimestre= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTrimestre,this.jTtoolBarTrimestre,
							"nuevo","nuevo","Nuevo"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTrimestre,this.jTtoolBarTrimestre,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTrimestre,this.jTtoolBarTrimestre,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTrimestre,this.jTtoolBarTrimestre,
							"duplicar","duplicar","Duplicar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTrimestre,this.jTtoolBarTrimestre,
							"copiar","copiar","Copiar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTrimestre,this.jTtoolBarTrimestre,
							"ver_form","ver_form","Ver"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTrimestre,this.jTtoolBarTrimestre,
							"recargar","recargar","Recargar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTrimestre,this.jTtoolBarTrimestre,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTrimestre,this.jTtoolBarTrimestre,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTrimestre,this.jTtoolBarTrimestre,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTrimestre,this.jTtoolBarTrimestre,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTrimestre,this.jTtoolBarTrimestre,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTrimestre,this.jTtoolBarTrimestre,
							"cerrar","cerrar","Salir"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTrimestre=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTrimestre;
			
				this.jButtonProcesarInformacionToolBarTrimestre=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTrimestre;
				
		//protected JButton jButtonModificarToolBarTrimestre;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTrimestre=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTrimestre=new JMenuMe("General");
		this.jmenuArchivoTrimestre=new JMenuMe("Archivo");
		this.jmenuAccionesTrimestre=new JMenuMe("Acciones");
		this.jmenuDatosTrimestre=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTrimestre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTrimestre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTrimestre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTrimestre= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTrimestre.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTrimestre,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTrimestre= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTrimestre.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTrimestre,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTrimestre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTrimestre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTrimestre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTrimestre= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTrimestre.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTrimestre,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTrimestre= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTrimestre.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTrimestre,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTrimestre= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTrimestre.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTrimestre,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTrimestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTrimestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTrimestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTrimestre= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTrimestre.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTrimestre,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTrimestre= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTrimestre.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTrimestre,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTrimestre= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTrimestre.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTrimestre,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTrimestre= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTrimestre.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTrimestre,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTrimestre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTrimestre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTrimestre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTrimestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTrimestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTrimestre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTrimestre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTrimestre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTrimestre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTrimestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTrimestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTrimestre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTrimestre= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTrimestre.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTrimestre,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTrimestre.add(this.jMenuItemCerrarTrimestre);
			
			this.jmenuAccionesTrimestre.add(this.jMenuItemNuevoTrimestre);
			this.jmenuAccionesTrimestre.add(this.jMenuItemNuevoGuardarCambiosTrimestre);
			this.jmenuAccionesTrimestre.add(this.jMenuItemNuevoRelacionesTrimestre);
			this.jmenuAccionesTrimestre.add(this.jMenuItemGuardarCambiosTablaTrimestre);		
			this.jmenuAccionesTrimestre.add(this.jMenuItemDuplicarTrimestre);		
			this.jmenuAccionesTrimestre.add(this.jMenuItemCopiarTrimestre);		
			this.jmenuAccionesTrimestre.add(this.jMenuItemVerFormTrimestre);		
			
			this.jmenuDatosTrimestre.add(this.jMenuItemRecargarInformacionTrimestre);				
			this.jmenuDatosTrimestre.add(this.jMenuItemAnterioresTrimestre);				
			this.jmenuDatosTrimestre.add(this.jMenuItemSiguientesTrimestre);				
			this.jmenuDatosTrimestre.add(this.jMenuItemAbrirOrderByTrimestre);				
			this.jmenuDatosTrimestre.add(this.jMenuItemMostrarOcultarTrimestre);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTrimestre.add(this.jMenuItemGuardarCambiosTrimestre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTrimestre.add(this.jmenuArchivoTrimestre);		
			this.jmenuBarTrimestre.add(this.jmenuAccionesTrimestre);		
			this.jmenuBarTrimestre.add(this.jmenuDatosTrimestre);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTrimestre);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTrimestre() {
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
			//this.jInternalFrameDetalleTrimestre = new TrimestreDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Trimestre DATOS");
			this.jInternalFrameDetalleFormTrimestre = new TrimestreDetalleFormJInternalFrame(jDesktopPane,this.trimestreSessionBean.getConGuardarRelaciones(),this.trimestreSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTrimestre = null;//new TrimestreDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTrimestre= new GridBagLayout();
		
		
		this.jTableDatosTrimestre = new JTableMe();      
		
		String sToolTipTrimestre="";
		sToolTipTrimestre=TrimestreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTrimestre+="(Seguridad.Trimestre)";
		}
		
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
			sToolTipTrimestre+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTrimestre.setToolTipText(sToolTipTrimestre);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTrimestre);
		this.jTableDatosTrimestre.setAutoCreateRowSorter(true);
		this.jTableDatosTrimestre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTrimestre.setRowSelectionAllowed(true);
		this.jTableDatosTrimestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTrimestre,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTrimestre = new JButtonMe();
		this.jButtonDuplicarTrimestre = new JButtonMe();
		this.jButtonCopiarTrimestre = new JButtonMe();
		this.jButtonVerFormTrimestre = new JButtonMe();
		this.jButtonNuevoRelacionesTrimestre = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTrimestre = new JButtonMe();
		this.jButtonCerrarTrimestre = new JButtonMe();
		
		this.jScrollPanelDatosTrimestre = new JScrollPane();   
        this.jScrollPanelDatosGeneralTrimestre = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Trimestre";
		
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Trimestres" + this.sPath));
		} else {
			this.jScrollPanelDatosTrimestre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTrimestre.setToolTipText("Acciones");
        this.jPanelAccionesTrimestre.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTrimestre=new ReporteDinamicoJInternalFrame(TrimestreConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTrimestre();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTrimestre=new ImportacionJInternalFrame(TrimestreConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTrimestre();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTrimestre = new JButtonMe();
		
		this.jButtonAbrirOrderByTrimestre.setText("Orden");
		this.jButtonAbrirOrderByTrimestre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTrimestre,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTrimestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTrimestre,false,this);
			
			//this.cargarOrderByTrimestre(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTrimestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTrimestre,true,this);
			
			//this.cargarOrderByTrimestre(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTrimestre.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTrimestre.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTrimestre.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTrimestre.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTrimestre.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTrimestre.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTrimestre.setText("Nuevo");
		this.jButtonDuplicarTrimestre.setText("Duplicar");
		this.jButtonCopiarTrimestre.setText("Copiar");
		this.jButtonVerFormTrimestre.setText("Ver");
		this.jButtonNuevoRelacionesTrimestre.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTrimestre.setText("Guardar");
		this.jButtonCerrarTrimestre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTrimestre,"nuevo_button","Nuevo",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTrimestre,"duplicar_button","Duplicar",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTrimestre,"copiar_button","Copiar",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTrimestre,"ver_form","Ver",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTrimestre,"nuevorelaciones_button","Nuevo Rel",this.trimestreSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTrimestre,"guardarcambiostabla_button","Guardar",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTrimestre,"cerrar_button","Salir",this.trimestreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTrimestre.setToolTipText("Nuevo"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTrimestre.setToolTipText("Duplicar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTrimestre.setToolTipText("Copiar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTrimestre.setToolTipText("Ver"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTrimestre.setToolTipText("Nuevo Rel"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTrimestre.setToolTipText("Guardar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTrimestre.setToolTipText("Salir"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTrimestre";
		inputMap = this.jButtonNuevoTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTrimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTrimestre"));
		
		//DUPLICAR
		sMapKey = "DuplicarTrimestre";
		inputMap = this.jButtonDuplicarTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTrimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTrimestre"));
		
		//COPIAR
		sMapKey = "CopiarTrimestre";
		inputMap = this.jButtonCopiarTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTrimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTrimestre"));
		
		//VEr FORM
		sMapKey = "VerFormTrimestre";
		inputMap = this.jButtonVerFormTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTrimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTrimestre"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTrimestre";
		inputMap = this.jButtonNuevoRelacionesTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTrimestre"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTrimestre";
		inputMap = this.jButtonModificarTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTrimestre"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTrimestre";
		inputMap = this.jButtonCerrarTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTrimestre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTrimestre";
		inputMap = this.jButtonGuardarCambiosTablaTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTrimestre"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Trimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Trimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Trimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Trimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Trimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTrimestre.setName("jPanelParametrosReportesTrimestre"); 
		
		this.jPanelParametrosReportesAccionesTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTrimestre.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTrimestre.setName("jPanelParametrosReportesAccionesTrimestre"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTrimestre = new JButtonMe();
		this.jButtonRecargarInformacionTrimestre.setText("Recargar");
		this.jButtonRecargarInformacionTrimestre.setToolTipText("Recargar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTrimestre,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTrimestre = new JButtonMe();
		this.jButtonProcesarInformacionTrimestre.setText("Procesar");
		this.jButtonProcesarInformacionTrimestre.setToolTipText("Procesar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTrimestre.setVisible(false);
			
		this.jButtonProcesarInformacionTrimestre.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTrimestre.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTrimestre.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTrimestre.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTrimestre.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTrimestre.setText("TIPO");       
		this.jComboBoxTiposReportesTrimestre.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTrimestre.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTrimestre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTrimestre.setText("Paginacion");
		this.jComboBoxTiposPaginacionTrimestre.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTrimestre.setText("Accion");
		this.jComboBoxTiposRelacionesTrimestre.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTrimestre.setText("Accion");
		this.jComboBoxTiposAccionesTrimestre.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTrimestre.setText("Accion");
		this.jComboBoxTiposSeleccionarTrimestre.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTrimestre=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTrimestre.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTrimestre.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTrimestre.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTrimestre = new JLabelMe();
		
		this.jLabelAccionesTrimestre.setText("Acciones");		
		this.jLabelAccionesTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTrimestre = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTrimestre.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTrimestre.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTrimestre = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTrimestre.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTrimestre.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTrimestre = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTrimestre.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTrimestre.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTrimestre = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTrimestre.setText("Graf.");
		this.jCheckBoxConGraficoReporteTrimestre.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTrimestre = new JButtonMe();
		//this.jButtonAnterioresTrimestre.setText("<<");
        this.jButtonAnterioresTrimestre.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTrimestre,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTrimestre = new JButtonMe();
		//this.jButtonSiguientesTrimestre.setText(">>");
        this.jButtonSiguientesTrimestre.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTrimestre,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTrimestre = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTrimestre.setText("Nue");
        this.jButtonNuevoGuardarCambiosTrimestre.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTrimestre,"nuevoguardarcambios_button","Nue",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTrimestre";
		inputMap = this.jButtonNuevoGuardarCambiosTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTrimestre"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTrimestre";
		inputMap = this.jButtonRecargarInformacionTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTrimestre"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTrimestre";
		inputMap = this.jButtonSiguientesTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTrimestre"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTrimestre";
		inputMap = this.jButtonAnterioresTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTrimestre"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTrimestre();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTrimestre.setMinimumSize(new Dimension(this.getWidth(),TrimestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TrimestreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTrimestre.setMaximumSize(new Dimension(this.getWidth(),TrimestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TrimestreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTrimestre.setPreferredSize(new Dimension(this.getWidth(),TrimestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TrimestreBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTrimestre = new GridBagLayout();

			this.jPanelPaginacionTrimestre.setLayout(gridaBagLayoutPaginacionTrimestre);						
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = 0;
			this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTrimestre.add(this.jButtonAnterioresTrimestre, this.gridBagConstraintsTrimestre);
					
						
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTrimestre.gridy = 0;
			
			this.jPanelPaginacionTrimestre.add(this.jButtonNuevoGuardarCambiosTrimestre, this.gridBagConstraintsTrimestre);
						
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTrimestre.gridy = 0;
			this.jPanelPaginacionTrimestre.add(this.jButtonSiguientesTrimestre, this.gridBagConstraintsTrimestre);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = 1;
			this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTrimestre.add(this.jButtonNuevoTrimestre, this.gridBagConstraintsTrimestre);
						
			
			
			if(!this.trimestreSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTrimestre = new GridBagConstraints();
				this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTrimestre.gridy = 1;
				this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTrimestre.add(this.jButtonGuardarCambiosTablaTrimestre, this.gridBagConstraintsTrimestre);
			}
			
			
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = 1;
			this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTrimestre.add(this.jButtonDuplicarTrimestre, this.gridBagConstraintsTrimestre);
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = 1;
			this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTrimestre.add(this.jButtonCopiarTrimestre, this.gridBagConstraintsTrimestre);
		
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = 1;
			this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTrimestre.add(this.jButtonVerFormTrimestre, this.gridBagConstraintsTrimestre);
		
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = 1;
			this.gridBagConstraintsTrimestre.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTrimestre.add(this.jButtonCerrarTrimestre, this.gridBagConstraintsTrimestre);
		
		
		
		this.jButtonRecargarInformacionTrimestre.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTrimestre.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTrimestre.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTrimestre.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTrimestre.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTrimestre.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTrimestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTrimestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTrimestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTrimestre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTrimestre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTrimestre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTrimestre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTrimestre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTrimestre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTrimestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTrimestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTrimestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTrimestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTrimestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTrimestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTrimestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTrimestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTrimestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTrimestre.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTrimestre.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTrimestre.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTrimestre.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTrimestre.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTrimestre.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTrimestre.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTrimestre.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTrimestre.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTrimestre.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTrimestre.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTrimestre.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTrimestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTrimestre = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Trimestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Trimestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Trimestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Trimestre = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTrimestre.setLayout(gridaBagParametrosReportesTrimestre);
			this.jPanelParametrosReportesAccionesTrimestre.setLayout(gridaBagParametrosReportesAccionesTrimestre);
			
			
			this.jPanelParametrosAuxiliar1Trimestre.setLayout(gridaBagParametrosAuxiliar1Trimestre);
			this.jPanelParametrosAuxiliar2Trimestre.setLayout(gridaBagParametrosAuxiliar2Trimestre);
			this.jPanelParametrosAuxiliar3Trimestre.setLayout(gridaBagParametrosAuxiliar3Trimestre);
			this.jPanelParametrosAuxiliar4Trimestre.setLayout(gridaBagParametrosAuxiliar4Trimestre);
			//this.jPanelParametrosAuxiliar5Trimestre.setLayout(gridaBagParametrosAuxiliar2Trimestre);			
			
			
			
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTrimestre.add(this.jButtonRecargarInformacionTrimestre, this.gridBagConstraintsTrimestre);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Trimestre.add(this.jComboBoxTiposPaginacionTrimestre, this.gridBagConstraintsTrimestre);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Trimestre.add(this.jCheckBoxConAltoMaximoTablaTrimestre, this.gridBagConstraintsTrimestre);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Trimestre.add(this.jComboBoxTiposArchivosReportesTrimestre, this.gridBagConstraintsTrimestre);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTrimestre.add(this.jPanelParametrosAuxiliar1Trimestre, this.gridBagConstraintsTrimestre);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTrimestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Trimestre.add(this.jComboBoxTiposReportesTrimestre, this.gridBagConstraintsTrimestre);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTrimestre.add(this.jPanelParametrosAuxiliar4Trimestre, this.gridBagConstraintsTrimestre);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTrimestre.add(this.jComboBoxTiposReportesTrimestre, this.gridBagConstraintsTrimestre);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTrimestre.add(this.jCheckBoxGenerarReporteTrimestre, this.gridBagConstraintsTrimestre);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTrimestre.add(this.jPanelParametrosAuxiliar2Trimestre, this.gridBagConstraintsTrimestre);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTrimestre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTrimestre.add(this.jLabelAccionesTrimestre, this.gridBagConstraintsTrimestre);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTrimestre = new GridBagConstraints();
				this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTrimestre.add(this.jButtonAbrirOrderByTrimestre, this.gridBagConstraintsTrimestre);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTrimestre.add(this.jComboBoxTiposSeleccionarTrimestre, this.gridBagConstraintsTrimestre);			
			
			
			/*
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTrimestre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTrimestre.add(this.jCheckBoxSeleccionarTodosTrimestre, this.gridBagConstraintsTrimestre);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTrimestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Trimestre.add(this.jCheckBoxSeleccionarTodosTrimestre, this.gridBagConstraintsTrimestre);															
				
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTrimestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Trimestre.add(this.jCheckBoxSeleccionadosTrimestre, this.gridBagConstraintsTrimestre);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTrimestre.add(this.jPanelParametrosAuxiliar3Trimestre, this.gridBagConstraintsTrimestre);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTrimestre.add(this.jComboBoxTiposRelacionesTrimestre, this.gridBagConstraintsTrimestre);
				
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTrimestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTrimestre.add(this.jComboBoxTiposAccionesTrimestre, this.gridBagConstraintsTrimestre);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTrimestre = new GridBagLayout();

			this.jScrollPanelDatosTrimestre.setLayout(gridaBagLayoutDatosTrimestre);
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = 0;
			this.gridBagConstraintsTrimestre.gridx = 0;
			
			this.jScrollPanelDatosTrimestre.add(this.jTableDatosTrimestre, this.gridBagConstraintsTrimestre);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTrimestre.setViewportView(this.jTableDatosTrimestre);
		this.jTableDatosTrimestre.setFillsViewportHeight(true);
		this.jTableDatosTrimestre.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTrimestre= new GridBagLayout();
		this.jPanelAccionesTrimestre.setLayout(gridaBagLayoutAccionesTrimestre);
		
		
		/*	
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = 0;
		this.gridBagConstraintsTrimestre.gridx = 0;
			
		this.jPanelAccionesTrimestre.add(this.jButtonNuevoTrimestre, this.gridBagConstraintsTrimestre);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTrimestre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTrimestre);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTrimestre = new GridBagConstraints();						
			this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTrimestre.gridx = 0;		
			//this.gridBagConstraintsTrimestre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTrimestre.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTrimestre, this.gridBagConstraintsTrimestre);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTrimestre.gridx = 0;		
		//this.gridBagConstraintsTrimestre.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTrimestre.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTrimestre);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTrimestre, this.gridBagConstraintsTrimestre);								
		
		
		/*
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTrimestre, this.gridBagConstraintsTrimestre);
		*/		
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTrimestre.gridx =0;
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTrimestre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTrimestre, this.gridBagConstraintsTrimestre);
				
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTrimestre, this.gridBagConstraintsTrimestre);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TrimestreJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTrimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTrimestre = new GridBagLayout();
			this.jPanelBusquedasParametrosTrimestre.setLayout(gridaBagLayoutBusquedasParametrosTrimestre);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTrimestre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTrimestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTrimestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTrimestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTrimestre, this.gridBagConstraintsTrimestre);
			
			
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTrimestre, this.gridBagConstraintsTrimestre);
		
			
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTrimestre, this.gridBagConstraintsTrimestre);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTrimestre;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTrimestre() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTrimestre = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTrimestre.setName("jPanelReporteDinamicoTrimestre"); 
		
		this.jPanelReporteDinamicoTrimestre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTrimestre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTrimestre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTrimestre.setLayout(gridaBagLayoutReporteDinamicoTrimestre);
		
		
		this.jInternalFrameReporteDinamicoTrimestre= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTrimestre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTrimestre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTrimestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTrimestre.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTrimestre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTrimestre.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTrimestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTrimestre.setResizable(true);
	    this.jInternalFrameReporteDinamicoTrimestre.setClosable(true);
	    this.jInternalFrameReporteDinamicoTrimestre.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTrimestre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTrimestre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTrimestre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Trimestres"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTrimestre = new JLabelMe();

		this.jLabelColumnasSelectReporteTrimestre.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTrimestre.add(this.jLabelColumnasSelectReporteTrimestre, this.gridBagConstraintsTrimestre);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTrimestre = new JList<Reporte>();
		this.jListColumnasSelectReporteTrimestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTrimestre.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTrimestre.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTrimestre.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTrimestre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTrimestre=new JScrollPane(this.jListColumnasSelectReporteTrimestre);
			
			this.jScrollColumnasSelectReporteTrimestre.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTrimestre.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTrimestre.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTrimestre.add(this.jListColumnasSelectReporteTrimestre, this.gridBagConstraintsTrimestre);
		this.jPanelReporteDinamicoTrimestre.add(this.jScrollColumnasSelectReporteTrimestre, this.gridBagConstraintsTrimestre);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTrimestre = new JLabelMe();

		this.jLabelRelacionesSelectReporteTrimestre.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTrimestre = new JList<Reporte>();
		this.jListRelacionesSelectReporteTrimestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTrimestre.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTrimestre.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTrimestre.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTrimestre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTrimestre=new JScrollPane(this.jListRelacionesSelectReporteTrimestre);
			
			this.jScrollRelacionesSelectReporteTrimestre.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTrimestre.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTrimestre.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTrimestre = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTrimestre = new JComboBoxMe();
		this.jListColumnasValoresGraficoTrimestre = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTrimestre = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTrimestre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTrimestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTrimestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTrimestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTrimestre = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTrimestre.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTrimestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTrimestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTrimestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTrimestre = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTrimestre.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTrimestre.add(this.jLabelGenerarExcelReporteDinamicoTrimestre, this.gridBagConstraintsTrimestre);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTrimestre = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTrimestre.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTrimestre,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTrimestre.setToolTipText("Generar EXCEL"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTrimestre = new GridBagConstraints();
		//this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTrimestre.add(this.jButtonGenerarExcelReporteDinamicoTrimestre, this.gridBagConstraintsTrimestre);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTrimestre.add(this.jComboBoxTiposReportesDinamicoTrimestre, this.gridBagConstraintsTrimestre);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTrimestre = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTrimestre.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTrimestre.add(this.jLabelTiposArchivoReporteDinamicoTrimestre, this.gridBagConstraintsTrimestre);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTrimestre.add(this.jComboBoxTiposArchivosReportesDinamicoTrimestre, this.gridBagConstraintsTrimestre);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTrimestre = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTrimestre.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTrimestre,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTrimestre.setToolTipText("Generar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTrimestre.add(this.jButtonGenerarReporteDinamicoTrimestre, this.gridBagConstraintsTrimestre);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTrimestre = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTrimestre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTrimestre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTrimestre.setToolTipText("Cancelar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTrimestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTrimestre.add(this.jButtonCerrarReporteDinamicoTrimestre, this.gridBagConstraintsTrimestre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTrimestre = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTrimestre= new JScrollPane(jPanelReporteDinamicoTrimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTrimestre.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTrimestre.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTrimestre.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Trimestres"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTrimestre.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTrimestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTrimestre.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTrimestre);
		this.jInternalFrameReporteDinamicoTrimestre.getContentPane().add(this.jScrollPanelReporteDinamicoTrimestre, this.gridBagConstraintsTrimestre);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTrimestre() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTrimestre = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTrimestre.setName("jPanelImportacionTrimestre"); 
		
		this.jPanelImportacionTrimestre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTrimestre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTrimestre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTrimestre.setLayout(gridaBagLayoutImportacionTrimestre);
		
		
		this.jInternalFrameImportacionTrimestre= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTrimestre= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTrimestre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTrimestre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTrimestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTrimestre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTrimestre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTrimestre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTrimestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTrimestre.setResizable(true);
	    this.jInternalFrameImportacionTrimestre.setClosable(true);
	    this.jInternalFrameImportacionTrimestre.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTrimestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTrimestre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTrimestre.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTrimestre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTrimestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTrimestre.setResizable(true);
	    this.jInternalFrameImportacionTrimestre.setClosable(true);
	    this.jInternalFrameImportacionTrimestre.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTrimestre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTrimestre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTrimestre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Trimestres"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTrimestre = new JLabelMe();

		this.jLabelArchivoImportacionTrimestre.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYImportacion;		
		this.gridBagConstraintsTrimestre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTrimestre.add(this.jLabelArchivoImportacionTrimestre, this.gridBagConstraintsTrimestre);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTrimestre = new JFileChooser();		
		this.jFileChooserImportacionTrimestre.setToolTipText("ESCOGER ARCHIVO"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTrimestre = new JButtonMe();
		this.jButtonAbrirImportacionTrimestre.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTrimestre,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTrimestre.setToolTipText("Generar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYImportacion;
		this.gridBagConstraintsTrimestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTrimestre.add(this.jButtonAbrirImportacionTrimestre, this.gridBagConstraintsTrimestre);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTrimestre = new JLabelMe();

		this.jLabelPathArchivoImportacionTrimestre.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYImportacion;		
		this.gridBagConstraintsTrimestre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTrimestre.add(this.jLabelPathArchivoImportacionTrimestre, this.gridBagConstraintsTrimestre);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTrimestre=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTrimestre.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTrimestre.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTrimestre.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYImportacion;
		this.gridBagConstraintsTrimestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTrimestre.add(this.jTextFieldPathArchivoImportacionTrimestre, this.gridBagConstraintsTrimestre);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTrimestre = new JButtonMe();
		this.jButtonGenerarImportacionTrimestre.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTrimestre,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTrimestre.setToolTipText("Generar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYImportacion;
		this.gridBagConstraintsTrimestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTrimestre.add(this.jButtonGenerarImportacionTrimestre, this.gridBagConstraintsTrimestre);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTrimestre = new JButtonMe();
		this.jButtonCerrarImportacionTrimestre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTrimestre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTrimestre.setToolTipText("Cancelar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = iPosYImportacion;
		this.gridBagConstraintsTrimestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTrimestre.add(this.jButtonCerrarImportacionTrimestre, this.gridBagConstraintsTrimestre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTrimestre = new GridBagLayout();
		
		this.jScrollPanelImportacionTrimestre= new JScrollPane(jPanelImportacionTrimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy =iPosYImportacion;
		this.gridBagConstraintsTrimestre.gridx =iPosXImportacion;
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTrimestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTrimestre.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTrimestre);
		this.jInternalFrameImportacionTrimestre.getContentPane().add(this.jScrollPanelImportacionTrimestre, this.gridBagConstraintsTrimestre);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTrimestre(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTrimestre = new JButtonMe();
			this.jButtonAbrirOrderByTrimestre.setText("Orden");
			this.jButtonAbrirOrderByTrimestre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTrimestre,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTrimestre";
			inputMap = this.jButtonAbrirOrderByTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTrimestre"));
		
		
			GridBagLayout gridaBagLayoutOrderByTrimestre = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTrimestre.setName("jPanelOrderByTrimestre"); 
			
			this.jPanelOrderByTrimestre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTrimestre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTrimestre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTrimestre.setLayout(gridaBagLayoutOrderByTrimestre);
			
			
			this.jTableDatosTrimestreOrderBy = new JTableMe();        
			this.jTableDatosTrimestreOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTrimestreOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTrimestreOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTrimestreOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTrimestreOrderBy.setViewportView(this.jTableDatosTrimestreOrderBy);
			this.jTableDatosTrimestreOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTrimestreOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTrimestre= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTrimestre= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTrimestre = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTrimestre= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTrimestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTrimestre.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTrimestre.setTitle("Orden");
			this.jInternalFrameOrderByTrimestre.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTrimestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTrimestre.setResizable(true);
			this.jInternalFrameOrderByTrimestre.setClosable(true);
			this.jInternalFrameOrderByTrimestre.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTrimestre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTrimestre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTrimestre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Trimestres"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTrimestre.gridx =iPosXOrderBy;
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTrimestre.ipady =150;
				
			this.jPanelOrderByTrimestre.add(jScrollPanelDatosTrimestreOrderBy, this.gridBagConstraintsTrimestre);//this.jTableDatosTrimestreTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTrimestre = new JButtonMe();
			this.jButtonCerrarOrderByTrimestre.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTrimestre,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTrimestre.setToolTipText("Cancelar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTrimestre.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTrimestre.add(this.jButtonCerrarOrderByTrimestre, this.gridBagConstraintsTrimestre);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTrimestre = new GridBagLayout();
			
			this.jScrollPanelOrderByTrimestre= new JScrollPane(jPanelOrderByTrimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy =iPosYOrderBy;
			this.gridBagConstraintsTrimestre.gridx =iPosXOrderBy;
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTrimestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTrimestre.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTrimestre);
			
			this.jInternalFrameOrderByTrimestre.getContentPane().add(this.jScrollPanelOrderByTrimestre, this.gridBagConstraintsTrimestre);			
		
		} else {
			this.jButtonAbrirOrderByTrimestre = new JButtonMe();
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
			&& this.trimestreSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTrimestre.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTrimestre.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTrimestre.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTrimestre.getRowHeight();//TrimestreConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TrimestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTrimestre.isSelected()) {
					iHeightTable=TrimestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TrimestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TrimestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TrimestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTrimestre.isSelected()) {
					iHeightTable=TrimestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TrimestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TrimestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTrimestre.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTrimestre.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTrimestre.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTrimestre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTrimestre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTrimestre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTrimestre!=null && this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy()!=null) {
			//if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTrimestre.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTrimestre.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTrimestre.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTrimestre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTrimestre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTrimestre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=trimestreLogic.getTrimestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=trimestres.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Trimestre> TraerTrimestreBeans(List<Trimestre> trimestres,ArrayList<Classe> classes)throws Exception {
		try {
			for(Trimestre trimestre:trimestres) {
					
				if(!(TrimestreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TrimestreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					trimestre.setsDetalleGeneralEntityReporte(TrimestreConstantesFunciones.getTrimestreDescripcion(trimestre));
										
						
					
						
					
				} else  {
							
					//trimestre.setsDetalleGeneralEntityReporte(trimestre.getsDetalleGeneralEntityReporte());
										
				}
				
				//trimestrebeans.add(trimestrebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return trimestres;
    }
	//PARA REPORTES FIN
}
