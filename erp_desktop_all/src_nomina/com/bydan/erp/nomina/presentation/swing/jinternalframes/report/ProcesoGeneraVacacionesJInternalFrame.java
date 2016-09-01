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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;





//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoGeneraVacacionesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoGeneraVacacionesJInternalFrame extends ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoGeneraVacaciones;
	
	protected JMenuBar jmenuBarProcesoGeneraVacaciones;
	
	protected JMenu jmenuProcesoGeneraVacaciones;
	protected JMenu jmenuDatosProcesoGeneraVacaciones;
	protected JMenu jmenuArchivoProcesoGeneraVacaciones;
	protected JMenu jmenuAccionesProcesoGeneraVacaciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoGeneraVacaciones;	
	protected GridBagConstraints gridBagConstraintsProcesoGeneraVacaciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoGeneraVacacionesDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoGeneraVacaciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoGeneraVacaciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoGeneraVacaciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProcesoGeneraVacacionesSessionBean procesogeneravacacionesSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoGeneraVacaciones> procesogeneravacacioness;		
	public List<ProcesoGeneraVacaciones> procesogeneravacacionessEliminados;	
	public List<ProcesoGeneraVacaciones> procesogeneravacacionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoGeneraVacaciones;		
	protected JButton jButtonAbrirOrderByProcesoGeneraVacaciones;
	
	
	//protected JPanel jPanelOrderByProcesoGeneraVacaciones;
	//public JScrollPane jScrollPanelOrderByProcesoGeneraVacaciones;	
	//protected JButton jButtonCerrarOrderByProcesoGeneraVacaciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoGeneraVacacionesLogic procesogeneravacacionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoGeneraVacaciones;
	public JScrollPane jScrollPanelDatosEdicionProcesoGeneraVacaciones;
	public JScrollPane jScrollPanelDatosGeneralProcesoGeneraVacaciones;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoGeneraVacacionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoGeneraVacaciones;
	//public JScrollPane jScrollPanelImportacionProcesoGeneraVacaciones;
	
	
	
	protected JPanel jPanelAccionesProcesoGeneraVacaciones;
	
    protected JPanel jPanelPaginacionProcesoGeneraVacaciones;
    protected JPanel jPanelParametrosReportesProcesoGeneraVacaciones;
	protected JPanel jPanelParametrosReportesAccionesProcesoGeneraVacaciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoGeneraVacaciones;
	protected JPanel jPanelParametrosAuxiliar2ProcesoGeneraVacaciones;
	protected JPanel jPanelParametrosAuxiliar3ProcesoGeneraVacaciones;
	protected JPanel jPanelParametrosAuxiliar4ProcesoGeneraVacaciones;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoGeneraVacaciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoGeneraVacaciones;
	//protected JPanel jPanelImportacionProcesoGeneraVacaciones;
	
	
	public JTable jTableDatosProcesoGeneraVacaciones;
	
	
	
	//public JTable jTableDatosProcesoGeneraVacacionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoGeneraVacaciones;
	protected JButton jButtonDuplicarProcesoGeneraVacaciones;
	protected JButton jButtonCopiarProcesoGeneraVacaciones;
	protected JButton jButtonVerFormProcesoGeneraVacaciones;
	protected JButton jButtonNuevoRelacionesProcesoGeneraVacaciones;
	protected JButton jButtonModificarProcesoGeneraVacaciones;
	
    protected JButton jButtonGuardarCambiosTablaProcesoGeneraVacaciones;
	protected JButton jButtonCerrarProcesoGeneraVacaciones;
	
	
	protected JButton jButtonRecargarInformacionProcesoGeneraVacaciones;
	protected JButton jButtonProcesarInformacionProcesoGeneraVacaciones;
	
	
	protected JButton jButtonAnterioresProcesoGeneraVacaciones;
	protected JButton jButtonSiguientesProcesoGeneraVacaciones;
	protected JButton jButtonNuevoGuardarCambiosProcesoGeneraVacaciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoGeneraVacaciones;
	//protected JButton jButtonCerrarReporteDinamicoProcesoGeneraVacaciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoGeneraVacaciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoGeneraVacaciones;
	//protected JButton jButtonGenerarImportacionProcesoGeneraVacaciones;
	//protected JButton jButtonCerrarImportacionProcesoGeneraVacaciones;
	//protected JFileChooser jFileChooserImportacionProcesoGeneraVacaciones;
	//protected File fileImportacionProcesoGeneraVacaciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoGeneraVacaciones;
	protected JButton jButtonDuplicarToolBarProcesoGeneraVacaciones;
	protected JButton jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoGeneraVacaciones;
	protected JButton jButtonCopiarToolBarProcesoGeneraVacaciones;
	protected JButton jButtonVerFormToolBarProcesoGeneraVacaciones;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoGeneraVacaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoGeneraVacaciones;
	protected JButton jButtonCerrarToolBarProcesoGeneraVacaciones;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoGeneraVacaciones;
	protected JButton jButtonProcesarInformacionToolBarProcesoGeneraVacaciones;
	protected JButton jButtonAnterioresToolBarProcesoGeneraVacaciones;
	protected JButton jButtonSiguientesToolBarProcesoGeneraVacaciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoGeneraVacaciones;
	protected JButton jButtonAbrirOrderByToolBarProcesoGeneraVacaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemDuplicarProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoGeneraVacaciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemCopiarProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemVerFormProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemCerrarProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemDetalleCerrarProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemProcesarInformacionProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemAnterioresProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemSiguientesProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemAbrirOrderByProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemMostrarOcultarProcesoGeneraVacaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoGeneraVacaciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoGeneraVacaciones;
	protected JCheckBox jCheckBoxSeleccionadosProcesoGeneraVacaciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoGeneraVacaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoGeneraVacaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoGeneraVacaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoGeneraVacaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoGeneraVacaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoGeneraVacaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoGeneraVacaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoGeneraVacaciones;
	protected JTextField jTextFieldValorCampoGeneralProcesoGeneraVacaciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoGeneraVacaciones;
	//public JList<Reporte> jListColumnasSelectReporteProcesoGeneraVacaciones;
	//public JScrollPane jScrollColumnasSelectReporteProcesoGeneraVacaciones;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoGeneraVacaciones;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoGeneraVacaciones;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoGeneraVacaciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoGeneraVacaciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoGeneraVacaciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoGeneraVacaciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoGeneraVacaciones;
	
		
	//public JLabel jLabelArchivoImportacionProcesoGeneraVacaciones;	
	//public JLabel jLabelPathArchivoImportacionProcesoGeneraVacaciones;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoGeneraVacaciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoGeneraVacaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoGeneraVacaciones;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoGeneraVacaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoGeneraVacaciones;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoGeneraVacaciones;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoGeneraVacaciones;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoGeneraVacaciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoGeneraVacaciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoGeneraVacaciones;	
	
	
	
	
	
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
	//public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoGeneraVacacionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraVacacionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraVacacionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraVacacionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoGeneraVacaciones)	{
		this.jButtonRecargarInformacionProcesoGeneraVacaciones = jButtonRecargarInformacionProcesoGeneraVacaciones;
	}
	
	public JButton getjButtonProcesarInformacionProcesoGeneraVacaciones() {
		return this.jButtonProcesarInformacionProcesoGeneraVacaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoGeneraVacaciones)	{
		this.jButtonProcesarInformacionProcesoGeneraVacaciones = jButtonProcesarInformacionProcesoGeneraVacaciones;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoGeneraVacaciones() {
		return this.jButtonRecargarInformacionProcesoGeneraVacaciones;
	}
	
	
	public List<ProcesoGeneraVacaciones> getprocesogeneravacacioness() {
		return this.procesogeneravacacioness;
	}

	public void setprocesogeneravacacioness(List<ProcesoGeneraVacaciones> procesogeneravacacioness) {
		this.procesogeneravacacioness = procesogeneravacacioness;
	}
	
	public List<ProcesoGeneraVacaciones> getprocesogeneravacacionessAux() {
		return this.procesogeneravacacionessAux;
	}

	public void setprocesogeneravacacionessAux(List<ProcesoGeneraVacaciones> procesogeneravacacionessAux) {
		this.procesogeneravacacionessAux = procesogeneravacacionessAux;
	}
	
	public List<ProcesoGeneraVacaciones> getprocesogeneravacacionessEliminados() {
		return this.procesogeneravacacionessEliminados;
	}

	public void setProcesoGeneraVacacionessEliminados(List<ProcesoGeneraVacaciones> procesogeneravacacionessEliminados) {
		this.procesogeneravacacionessEliminados = procesogeneravacacionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoGeneraVacaciones() {
		return jComboBoxTiposSeleccionarProcesoGeneraVacaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposSeleccionarProcesoGeneraVacaciones) {
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones = jComboBoxTiposSeleccionarProcesoGeneraVacaciones;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoGeneraVacaciones() {
		return jTextFieldValorCampoGeneralProcesoGeneraVacaciones;
	}

	public void setjTextFieldValorCampoGeneralProcesoGeneraVacaciones(
			JTextField jTextFieldValorCampoGeneralProcesoGeneraVacaciones) {
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones = jTextFieldValorCampoGeneralProcesoGeneraVacaciones;
	}

	public void setBorderResaltarValorCampoGeneralProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoGeneraVacaciones() {
		return this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones;
	}

	public void setjCheckBoxSeleccionarTodosProcesoGeneraVacaciones(
			JCheckBox jCheckBoxSeleccionarTodosProcesoGeneraVacaciones) {
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones = jCheckBoxSeleccionarTodosProcesoGeneraVacaciones;
	}

	public void setBorderResaltarSeleccionarTodosProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoGeneraVacaciones() {
		return this.jCheckBoxSeleccionadosProcesoGeneraVacaciones;
	}

	public void setjCheckBoxSeleccionadosProcesoGeneraVacaciones(
			JCheckBox jCheckBoxSeleccionadosProcesoGeneraVacaciones) {
		this.jCheckBoxSeleccionadosProcesoGeneraVacaciones = jCheckBoxSeleccionadosProcesoGeneraVacaciones;
	}
	
	public void setBorderResaltarSeleccionadosProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoGeneraVacaciones() {
		return this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposArchivosReportesProcesoGeneraVacaciones) {
		this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones = jComboBoxTiposArchivosReportesProcesoGeneraVacaciones;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoGeneraVacaciones() {
		return this.jComboBoxTiposReportesProcesoGeneraVacaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposReportesProcesoGeneraVacaciones) {
		this.jComboBoxTiposReportesProcesoGeneraVacaciones = jComboBoxTiposReportesProcesoGeneraVacaciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoGeneraVacaciones() {
	//	return jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoGeneraVacaciones(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones) {
	//	this.jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones = jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones = jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones;
	//}
	
	public void setBorderResaltarTiposReportesProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoGeneraVacaciones() {
		return this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposGraficosReportesProcesoGeneraVacaciones) {
		this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones = jComboBoxTiposGraficosReportesProcesoGeneraVacaciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoGeneraVacaciones() {
		return this.jComboBoxTiposPaginacionProcesoGeneraVacaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposPaginacionProcesoGeneraVacaciones) {
		this.jComboBoxTiposPaginacionProcesoGeneraVacaciones = jComboBoxTiposPaginacionProcesoGeneraVacaciones;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoGeneraVacaciones() {
		return this.jComboBoxTiposRelacionesProcesoGeneraVacaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoGeneraVacaciones() {
		return this.jComboBoxTiposAccionesProcesoGeneraVacaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposRelacionesProcesoGeneraVacaciones) {
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones = jComboBoxTiposRelacionesProcesoGeneraVacaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposAccionesProcesoGeneraVacaciones) {
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones = jComboBoxTiposAccionesProcesoGeneraVacaciones;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoGeneraVacaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoGeneraVacaciones() {
	//	return jCheckBoxConGraficoDinamicoProcesoGeneraVacaciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoGeneraVacaciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoGeneraVacaciones) {
	//	this.jCheckBoxConGraficoDinamicoProcesoGeneraVacaciones = jCheckBoxConGraficoDinamicoProcesoGeneraVacaciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoGeneraVacaciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoGeneraVacaciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoGeneraVacaciones .setBorder(borderResaltar);		
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
		this.procesogeneravacacionesSessionBean=new ProcesoGeneraVacacionesSessionBean();
		
		this.procesogeneravacacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogeneravacacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoGeneraVacacionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoGeneraVacacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoGeneraVacacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoGeneraVacacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoGeneraVacacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Genera Vacaciones MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoGeneraVacacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoGeneraVacaciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"nuevo","nuevo","Nuevo"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"duplicar","duplicar","Duplicar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"copiar","copiar","Copiar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"ver_form","ver_form","Ver"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"recargar","recargar","Procesar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,
							"cerrar","cerrar","Salir"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones;
			
				this.jButtonProcesarInformacionToolBarProcesoGeneraVacaciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoGeneraVacaciones;
				
		//protected JButton jButtonModificarToolBarProcesoGeneraVacaciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoGeneraVacaciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoGeneraVacaciones=new JMenuMe("General");
		this.jmenuArchivoProcesoGeneraVacaciones=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoGeneraVacaciones=new JMenuMe("Acciones");
		this.jmenuDatosProcesoGeneraVacaciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoGeneraVacaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoGeneraVacaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoGeneraVacaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoGeneraVacaciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoGeneraVacaciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoGeneraVacaciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoGeneraVacaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoGeneraVacaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoGeneraVacaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoGeneraVacaciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoGeneraVacaciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoGeneraVacaciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoGeneraVacaciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoGeneraVacaciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoGeneraVacaciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoGeneraVacaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoGeneraVacaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoGeneraVacaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoGeneraVacaciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoGeneraVacaciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoGeneraVacaciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoGeneraVacaciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoGeneraVacaciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoGeneraVacaciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoGeneraVacaciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoGeneraVacaciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoGeneraVacaciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoGeneraVacaciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoGeneraVacaciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoGeneraVacaciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoGeneraVacaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoGeneraVacaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoGeneraVacaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoGeneraVacaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoGeneraVacaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoGeneraVacaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoGeneraVacaciones.add(this.jMenuItemCerrarProcesoGeneraVacaciones);
			
			this.jmenuAccionesProcesoGeneraVacaciones.add(this.jMenuItemNuevoProcesoGeneraVacaciones);
			this.jmenuAccionesProcesoGeneraVacaciones.add(this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones);
			this.jmenuAccionesProcesoGeneraVacaciones.add(this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones);
			this.jmenuAccionesProcesoGeneraVacaciones.add(this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones);		
			this.jmenuAccionesProcesoGeneraVacaciones.add(this.jMenuItemDuplicarProcesoGeneraVacaciones);		
			this.jmenuAccionesProcesoGeneraVacaciones.add(this.jMenuItemCopiarProcesoGeneraVacaciones);		
			this.jmenuAccionesProcesoGeneraVacaciones.add(this.jMenuItemVerFormProcesoGeneraVacaciones);		
			
			this.jmenuDatosProcesoGeneraVacaciones.add(this.jMenuItemRecargarInformacionProcesoGeneraVacaciones);				
			this.jmenuDatosProcesoGeneraVacaciones.add(this.jMenuItemAnterioresProcesoGeneraVacaciones);				
			this.jmenuDatosProcesoGeneraVacaciones.add(this.jMenuItemSiguientesProcesoGeneraVacaciones);				
			this.jmenuDatosProcesoGeneraVacaciones.add(this.jMenuItemAbrirOrderByProcesoGeneraVacaciones);				
			this.jmenuDatosProcesoGeneraVacaciones.add(this.jMenuItemMostrarOcultarProcesoGeneraVacaciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoGeneraVacaciones.add(this.jMenuItemGuardarCambiosProcesoGeneraVacaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoGeneraVacaciones.add(this.jmenuArchivoProcesoGeneraVacaciones);		
			this.jmenuBarProcesoGeneraVacaciones.add(this.jmenuAccionesProcesoGeneraVacaciones);		
			this.jmenuBarProcesoGeneraVacaciones.add(this.jmenuDatosProcesoGeneraVacaciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoGeneraVacaciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoGeneraVacaciones() {
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
			//this.jInternalFrameDetalleProcesoGeneraVacaciones = new ProcesoGeneraVacacionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Genera Vacaciones DATOS");
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones = new ProcesoGeneraVacacionesDetalleFormJInternalFrame(jDesktopPane,this.procesogeneravacacionesSessionBean.getConGuardarRelaciones(),this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones = null;//new ProcesoGeneraVacacionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoGeneraVacaciones= new GridBagLayout();
		
		
		this.jTableDatosProcesoGeneraVacaciones = new JTableMe();      
		
		String sToolTipProcesoGeneraVacaciones="";
		sToolTipProcesoGeneraVacaciones=ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoGeneraVacaciones+="(Nomina.ProcesoGeneraVacaciones)";
		}
		
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoGeneraVacaciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoGeneraVacaciones.setToolTipText(sToolTipProcesoGeneraVacaciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoGeneraVacaciones);
		this.jTableDatosProcesoGeneraVacaciones.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoGeneraVacaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoGeneraVacaciones.setRowSelectionAllowed(true);
		this.jTableDatosProcesoGeneraVacaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoGeneraVacaciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonDuplicarProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonCopiarProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonVerFormProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoGeneraVacaciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonCerrarProcesoGeneraVacaciones = new JButtonMe();
		
		this.jScrollPanelDatosProcesoGeneraVacaciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoGeneraVacaciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Genera Vacaciones";
		
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Vacacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoGeneraVacaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoGeneraVacaciones.setToolTipText("Acciones");
        this.jPanelAccionesProcesoGeneraVacaciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones=new ReporteDinamicoJInternalFrame(ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoGeneraVacaciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoGeneraVacaciones=new ImportacionJInternalFrame(ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoGeneraVacaciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoGeneraVacaciones = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoGeneraVacaciones.setText("Orden");
		this.jButtonAbrirOrderByProcesoGeneraVacaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoGeneraVacaciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoGeneraVacaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGeneraVacaciones,false,this);
			
			//this.cargarOrderByProcesoGeneraVacaciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoGeneraVacaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGeneraVacaciones,true,this);
			
			//this.cargarOrderByProcesoGeneraVacaciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoGeneraVacaciones.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosProcesoGeneraVacaciones.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosProcesoGeneraVacaciones.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosProcesoGeneraVacaciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoGeneraVacaciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoGeneraVacaciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoGeneraVacaciones.setText("Nuevo");
		this.jButtonDuplicarProcesoGeneraVacaciones.setText("Duplicar");
		this.jButtonCopiarProcesoGeneraVacaciones.setText("Copiar");
		this.jButtonVerFormProcesoGeneraVacaciones.setText("Ver");
		this.jButtonNuevoRelacionesProcesoGeneraVacaciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.setText("Guardar");
		this.jButtonCerrarProcesoGeneraVacaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoGeneraVacaciones,"nuevo_button","Nuevo",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoGeneraVacaciones,"duplicar_button","Duplicar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoGeneraVacaciones,"copiar_button","Copiar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoGeneraVacaciones,"ver_form","Ver",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoGeneraVacaciones,"nuevorelaciones_button","Nuevo Rel",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones,"guardarcambiostabla_button","Guardar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoGeneraVacaciones,"cerrar_button","Salir",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoGeneraVacaciones.setToolTipText("Nuevo"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoGeneraVacaciones.setToolTipText("Duplicar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoGeneraVacaciones.setToolTipText("Copiar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoGeneraVacaciones.setToolTipText("Ver"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoGeneraVacaciones.setToolTipText("Nuevo Rel"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.setToolTipText("Guardar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoGeneraVacaciones.setToolTipText("Salir"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoGeneraVacaciones";
		inputMap = this.jButtonNuevoProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoGeneraVacaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoGeneraVacaciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoGeneraVacaciones";
		inputMap = this.jButtonDuplicarProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoGeneraVacaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoGeneraVacaciones"));
		
		//COPIAR
		sMapKey = "CopiarProcesoGeneraVacaciones";
		inputMap = this.jButtonCopiarProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoGeneraVacaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoGeneraVacaciones"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoGeneraVacaciones";
		inputMap = this.jButtonVerFormProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoGeneraVacaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoGeneraVacaciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoGeneraVacaciones";
		inputMap = this.jButtonNuevoRelacionesProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoGeneraVacaciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoGeneraVacaciones";
		inputMap = this.jButtonModificarProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoGeneraVacaciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoGeneraVacaciones";
		inputMap = this.jButtonCerrarProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoGeneraVacaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoGeneraVacaciones";
		inputMap = this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoGeneraVacaciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoGeneraVacaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoGeneraVacaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoGeneraVacaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoGeneraVacaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoGeneraVacaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoGeneraVacaciones.setName("jPanelParametrosReportesProcesoGeneraVacaciones"); 
		
		this.jPanelParametrosReportesAccionesProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoGeneraVacaciones.setName("jPanelParametrosReportesAccionesProcesoGeneraVacaciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.setText("Procesar");
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.setToolTipText("Procesar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoGeneraVacaciones,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.setText("Procesar");
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.setToolTipText("Procesar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.setPreferredSize(new Dimension(185,25));		
		
		
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.setVisible(true);
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoGeneraVacaciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setText("Accion");
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoGeneraVacaciones = new JLabelMe();
		
		this.jLabelAccionesProcesoGeneraVacaciones.setText("Acciones");		
		this.jLabelAccionesProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoGeneraVacaciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoGeneraVacaciones = new JButtonMe();
		//this.jButtonAnterioresProcesoGeneraVacaciones.setText("<<");
        this.jButtonAnterioresProcesoGeneraVacaciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoGeneraVacaciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoGeneraVacaciones = new JButtonMe();
		//this.jButtonSiguientesProcesoGeneraVacaciones.setText(">>");
        this.jButtonSiguientesProcesoGeneraVacaciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoGeneraVacaciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones,"nuevoguardarcambios_button","Nue",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoGeneraVacaciones";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoGeneraVacaciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoGeneraVacaciones";
		inputMap = this.jButtonRecargarInformacionProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoGeneraVacaciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoGeneraVacaciones";
		inputMap = this.jButtonSiguientesProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoGeneraVacaciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoGeneraVacaciones";
		inputMap = this.jButtonAnterioresProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoGeneraVacaciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoGeneraVacaciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoGeneraVacaciones.setMinimumSize(new Dimension(this.getWidth(),ProcesoGeneraVacacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGeneraVacacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoGeneraVacaciones.setMaximumSize(new Dimension(this.getWidth(),ProcesoGeneraVacacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGeneraVacacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoGeneraVacaciones.setPreferredSize(new Dimension(this.getWidth(),ProcesoGeneraVacacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGeneraVacacionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoGeneraVacaciones = new GridBagLayout();

			this.jPanelPaginacionProcesoGeneraVacaciones.setLayout(gridaBagLayoutPaginacionProcesoGeneraVacaciones);						
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonAnterioresProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
					
						
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
			
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
						
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonSiguientesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 1;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonNuevoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
						
			
			
			if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
				this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 1;
				this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			}
			
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 1;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonProcesarInformacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 1;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonDuplicarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 1;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonCopiarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 1;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonVerFormProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 1;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoGeneraVacaciones.add(this.jButtonCerrarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
		
		
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoGeneraVacaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoGeneraVacaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoGeneraVacaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoGeneraVacaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoGeneraVacaciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoGeneraVacaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoGeneraVacaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoGeneraVacaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoGeneraVacaciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoGeneraVacaciones.setLayout(gridaBagParametrosReportesProcesoGeneraVacaciones);
			this.jPanelParametrosReportesAccionesProcesoGeneraVacaciones.setLayout(gridaBagParametrosReportesAccionesProcesoGeneraVacaciones);
			
			
			this.jPanelParametrosAuxiliar1ProcesoGeneraVacaciones.setLayout(gridaBagParametrosAuxiliar1ProcesoGeneraVacaciones);
			this.jPanelParametrosAuxiliar2ProcesoGeneraVacaciones.setLayout(gridaBagParametrosAuxiliar2ProcesoGeneraVacaciones);
			this.jPanelParametrosAuxiliar3ProcesoGeneraVacaciones.setLayout(gridaBagParametrosAuxiliar3ProcesoGeneraVacaciones);
			this.jPanelParametrosAuxiliar4ProcesoGeneraVacaciones.setLayout(gridaBagParametrosAuxiliar4ProcesoGeneraVacaciones);
			//this.jPanelParametrosAuxiliar5ProcesoGeneraVacaciones.setLayout(gridaBagParametrosAuxiliar2ProcesoGeneraVacaciones);			
			
			
			
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jButtonRecargarInformacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGeneraVacaciones.add(this.jComboBoxTiposPaginacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGeneraVacaciones.add(this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGeneraVacaciones.add(this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jPanelParametrosAuxiliar1ProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoGeneraVacaciones.add(this.jComboBoxTiposReportesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jPanelParametrosAuxiliar4ProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jComboBoxTiposReportesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jCheckBoxGenerarReporteProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jPanelParametrosAuxiliar2ProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jLabelAccionesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);			
			
			
			/*
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoGeneraVacaciones.add(this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);															
				
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoGeneraVacaciones.add(this.jCheckBoxSeleccionadosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jPanelParametrosAuxiliar3ProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGeneraVacaciones.add(this.jComboBoxTiposAccionesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoGeneraVacaciones = new GridBagLayout();

			this.jScrollPanelDatosProcesoGeneraVacaciones.setLayout(gridaBagLayoutDatosProcesoGeneraVacaciones);
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
			
			this.jScrollPanelDatosProcesoGeneraVacaciones.add(this.jTableDatosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoGeneraVacaciones.setViewportView(this.jTableDatosProcesoGeneraVacaciones);
		this.jTableDatosProcesoGeneraVacaciones.setFillsViewportHeight(true);
		this.jTableDatosProcesoGeneraVacaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoGeneraVacaciones= new GridBagLayout();
		this.jPanelAccionesProcesoGeneraVacaciones.setLayout(gridaBagLayoutAccionesProcesoGeneraVacaciones);
		
		
		/*	
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
			
		this.jPanelAccionesProcesoGeneraVacaciones.add(this.jButtonNuevoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoGeneraVacaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoGeneraVacaciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();						
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;		
			//this.gridBagConstraintsProcesoGeneraVacaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;		
		//this.gridBagConstraintsProcesoGeneraVacaciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoGeneraVacaciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);								
		
		
		/*
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		*/		
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx =0;
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoGeneraVacaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
				
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoGeneraVacaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoGeneraVacaciones = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoGeneraVacaciones.setLayout(gridaBagLayoutBusquedasParametrosProcesoGeneraVacaciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoGeneraVacaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			
			
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
			
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(false);
		this.jButtonAnterioresProcesoGeneraVacaciones.setVisible(false);
		this.jButtonSiguientesProcesoGeneraVacaciones.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.setVisible(false);
		this.jComboBoxTiposReportesProcesoGeneraVacaciones.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.setVisible(false);
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.setVisible(false);
		
		this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(false);
		
		
		this.jTtoolBarProcesoGeneraVacaciones.setVisible(false);
			
		this.jMenuItemAnterioresProcesoGeneraVacaciones.setVisible(false);
		this.jMenuItemSiguientesProcesoGeneraVacaciones.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoGeneraVacaciones.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoGeneraVacaciones.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraVacaciones.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoGeneraVacaciones.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoGeneraVacaciones.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoGeneraVacaciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoGeneraVacaciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoGeneraVacaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.setName("jPanelReporteDinamicoProcesoGeneraVacaciones"); 
		
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.setLayout(gridaBagLayoutReporteDinamicoProcesoGeneraVacaciones);
		
		
		this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoGeneraVacaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Vacacioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoGeneraVacaciones = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoGeneraVacaciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jLabelColumnasSelectReporteProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoGeneraVacaciones = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoGeneraVacaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoGeneraVacaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoGeneraVacaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoGeneraVacaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoGeneraVacaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoGeneraVacaciones=new JScrollPane(this.jListColumnasSelectReporteProcesoGeneraVacaciones);
			
			this.jScrollColumnasSelectReporteProcesoGeneraVacaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoGeneraVacaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoGeneraVacaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jListColumnasSelectReporteProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jScrollColumnasSelectReporteProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoGeneraVacaciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoGeneraVacaciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoGeneraVacaciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoGeneraVacaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoGeneraVacaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoGeneraVacaciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoGeneraVacaciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoGeneraVacaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoGeneraVacaciones=new JScrollPane(this.jListRelacionesSelectReporteProcesoGeneraVacaciones);
			
			this.jScrollRelacionesSelectReporteProcesoGeneraVacaciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoGeneraVacaciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoGeneraVacaciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoGeneraVacaciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoGeneraVacaciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoGeneraVacaciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraVacaciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraVacaciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jLabelGenerarExcelReporteDinamicoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoGeneraVacaciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoGeneraVacaciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoGeneraVacaciones.setToolTipText("Generar EXCEL"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jButtonGenerarExcelReporteDinamicoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jComboBoxTiposReportesDinamicoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraVacaciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraVacaciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jLabelTiposArchivoReporteDinamicoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoGeneraVacaciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoGeneraVacaciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoGeneraVacaciones.setToolTipText("Generar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jButtonGenerarReporteDinamicoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoGeneraVacaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoGeneraVacaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoGeneraVacaciones.setToolTipText("Cancelar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGeneraVacaciones.add(this.jButtonCerrarReporteDinamicoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoGeneraVacaciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones= new JScrollPane(jPanelReporteDinamicoProcesoGeneraVacaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Vacacioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoGeneraVacaciones);
		this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoGeneraVacaciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoGeneraVacaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoGeneraVacaciones.setName("jPanelImportacionProcesoGeneraVacaciones"); 
		
		this.jPanelImportacionProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoGeneraVacaciones.setLayout(gridaBagLayoutImportacionProcesoGeneraVacaciones);
		
		
		this.jInternalFrameImportacionProcesoGeneraVacaciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoGeneraVacaciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoGeneraVacaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoGeneraVacaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoGeneraVacaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoGeneraVacaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoGeneraVacaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setResizable(true);
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setClosable(true);
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoGeneraVacaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoGeneraVacaciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoGeneraVacaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setResizable(true);
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setClosable(true);
	    this.jInternalFrameImportacionProcesoGeneraVacaciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Vacacioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoGeneraVacaciones = new JLabelMe();

		this.jLabelArchivoImportacionProcesoGeneraVacaciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoGeneraVacaciones.add(this.jLabelArchivoImportacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoGeneraVacaciones = new JFileChooser();		
		this.jFileChooserImportacionProcesoGeneraVacaciones.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonAbrirImportacionProcesoGeneraVacaciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoGeneraVacaciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoGeneraVacaciones.setToolTipText("Generar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGeneraVacaciones.add(this.jButtonAbrirImportacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoGeneraVacaciones = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoGeneraVacaciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoGeneraVacaciones.add(this.jLabelPathArchivoImportacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoGeneraVacaciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoGeneraVacaciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoGeneraVacaciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoGeneraVacaciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGeneraVacaciones.add(this.jTextFieldPathArchivoImportacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonGenerarImportacionProcesoGeneraVacaciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoGeneraVacaciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoGeneraVacaciones.setToolTipText("Generar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGeneraVacaciones.add(this.jButtonGenerarImportacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonCerrarImportacionProcesoGeneraVacaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoGeneraVacaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoGeneraVacaciones.setToolTipText("Cancelar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGeneraVacaciones.add(this.jButtonCerrarImportacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoGeneraVacaciones = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoGeneraVacaciones= new JScrollPane(jPanelImportacionProcesoGeneraVacaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoGeneraVacaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoGeneraVacaciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoGeneraVacaciones);
		this.jInternalFrameImportacionProcesoGeneraVacaciones.getContentPane().add(this.jScrollPanelImportacionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoGeneraVacaciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoGeneraVacaciones = new JButtonMe();
			this.jButtonAbrirOrderByProcesoGeneraVacaciones.setText("Orden");
			this.jButtonAbrirOrderByProcesoGeneraVacaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoGeneraVacaciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoGeneraVacaciones";
			inputMap = this.jButtonAbrirOrderByProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoGeneraVacaciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoGeneraVacaciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoGeneraVacaciones.setName("jPanelOrderByProcesoGeneraVacaciones"); 
			
			this.jPanelOrderByProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoGeneraVacaciones.setLayout(gridaBagLayoutOrderByProcesoGeneraVacaciones);
			
			
			this.jTableDatosProcesoGeneraVacacionesOrderBy = new JTableMe();        
			this.jTableDatosProcesoGeneraVacacionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoGeneraVacacionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoGeneraVacacionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoGeneraVacacionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoGeneraVacacionesOrderBy.setViewportView(this.jTableDatosProcesoGeneraVacacionesOrderBy);
			this.jTableDatosProcesoGeneraVacacionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoGeneraVacacionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoGeneraVacaciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoGeneraVacaciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoGeneraVacaciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoGeneraVacaciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setTitle("Orden");
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setResizable(true);
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setClosable(true);
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Vacacioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoGeneraVacaciones.ipady =150;
				
			this.jPanelOrderByProcesoGeneraVacaciones.add(jScrollPanelDatosProcesoGeneraVacacionesOrderBy, this.gridBagConstraintsProcesoGeneraVacaciones);//this.jTableDatosProcesoGeneraVacacionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoGeneraVacaciones = new JButtonMe();
			this.jButtonCerrarOrderByProcesoGeneraVacaciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoGeneraVacaciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoGeneraVacaciones.setToolTipText("Cancelar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoGeneraVacaciones.add(this.jButtonCerrarOrderByProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoGeneraVacaciones = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoGeneraVacaciones= new JScrollPane(jPanelOrderByProcesoGeneraVacaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoGeneraVacaciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoGeneraVacaciones);
			
			this.jInternalFrameOrderByProcesoGeneraVacaciones.getContentPane().add(this.jScrollPanelOrderByProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);			
		
		} else {
			this.jButtonAbrirOrderByProcesoGeneraVacaciones = new JButtonMe();
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
		//if(this.conMaximoRelaciones 
		//	&& this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoGeneraVacaciones.getRowHeight();//ProcesoGeneraVacacionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoGeneraVacacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones.isSelected()) {
					iHeightTable=ProcesoGeneraVacacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoGeneraVacacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoGeneraVacacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoGeneraVacacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoGeneraVacaciones.isSelected()) {
					iHeightTable=ProcesoGeneraVacacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoGeneraVacacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoGeneraVacacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoGeneraVacaciones!=null && this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy()!=null) {
			//if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoGeneraVacaciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoGeneraVacaciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoGeneraVacaciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesogeneravacacionesLogic.getProcesoGeneraVacacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogeneravacacioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoGeneraVacaciones> TraerProcesoGeneraVacacionesBeans(List<ProcesoGeneraVacaciones> procesogeneravacacioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoGeneraVacaciones procesogeneravacaciones:procesogeneravacacioness) {
					
				if(!(ProcesoGeneraVacacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoGeneraVacacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesogeneravacaciones.setsDetalleGeneralEntityReporte(ProcesoGeneraVacacionesConstantesFunciones.getProcesoGeneraVacacionesDescripcion(procesogeneravacaciones));
										
						
					
						
					
				} else  {
							
					//procesogeneravacaciones.setsDetalleGeneralEntityReporte(procesogeneravacaciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesogeneravacacionesbeans.add(procesogeneravacacionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesogeneravacacioness;
    }
	//PARA REPORTES FIN
}
