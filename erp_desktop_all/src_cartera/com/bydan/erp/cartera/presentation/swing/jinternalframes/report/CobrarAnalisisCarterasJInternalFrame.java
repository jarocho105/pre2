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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;





//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarAnalisisCarterasConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarAnalisisCarterasJInternalFrame extends CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarAnalisisCarteras;
	
	protected JMenuBar jmenuBarCobrarAnalisisCarteras;
	
	protected JMenu jmenuCobrarAnalisisCarteras;
	protected JMenu jmenuDatosCobrarAnalisisCarteras;
	protected JMenu jmenuArchivoCobrarAnalisisCarteras;
	protected JMenu jmenuAccionesCobrarAnalisisCarteras;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarAnalisisCarteras;	
	protected GridBagConstraints gridBagConstraintsCobrarAnalisisCarteras;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarAnalisisCarterasDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarAnalisisCarteras;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarAnalisisCarteras;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarAnalisisCarteras;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CobrarAnalisisCarterasSessionBean cobraranalisiscarterasSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarAnalisisCarteras> cobraranalisiscarterass;		
	public List<CobrarAnalisisCarteras> cobraranalisiscarterassEliminados;	
	public List<CobrarAnalisisCarteras> cobraranalisiscarterassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarAnalisisCarteras;		
	protected JButton jButtonAbrirOrderByCobrarAnalisisCarteras;
	
	
	//protected JPanel jPanelOrderByCobrarAnalisisCarteras;
	//public JScrollPane jScrollPanelOrderByCobrarAnalisisCarteras;	
	//protected JButton jButtonCerrarOrderByCobrarAnalisisCarteras;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarAnalisisCarterasLogic cobraranalisiscarterasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarAnalisisCarteras;
	public JScrollPane jScrollPanelDatosEdicionCobrarAnalisisCarteras;
	public JScrollPane jScrollPanelDatosGeneralCobrarAnalisisCarteras;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarAnalisisCarterasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarAnalisisCarteras;
	//public JScrollPane jScrollPanelImportacionCobrarAnalisisCarteras;
	
	
	
	protected JPanel jPanelAccionesCobrarAnalisisCarteras;
	
    protected JPanel jPanelPaginacionCobrarAnalisisCarteras;
    protected JPanel jPanelParametrosReportesCobrarAnalisisCarteras;
	protected JPanel jPanelParametrosReportesAccionesCobrarAnalisisCarteras;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarAnalisisCarteras;
	protected JPanel jPanelParametrosAuxiliar2CobrarAnalisisCarteras;
	protected JPanel jPanelParametrosAuxiliar3CobrarAnalisisCarteras;
	protected JPanel jPanelParametrosAuxiliar4CobrarAnalisisCarteras;
	//protected JPanel jPanelParametrosAuxiliar5CobrarAnalisisCarteras;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarAnalisisCarteras;
	//protected JPanel jPanelImportacionCobrarAnalisisCarteras;
	
	
	public JTable jTableDatosCobrarAnalisisCarteras;
	
	
	
	//public JTable jTableDatosCobrarAnalisisCarterasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarAnalisisCarteras;
	protected JButton jButtonDuplicarCobrarAnalisisCarteras;
	protected JButton jButtonCopiarCobrarAnalisisCarteras;
	protected JButton jButtonVerFormCobrarAnalisisCarteras;
	protected JButton jButtonNuevoRelacionesCobrarAnalisisCarteras;
	protected JButton jButtonModificarCobrarAnalisisCarteras;
	
    protected JButton jButtonGuardarCambiosTablaCobrarAnalisisCarteras;
	protected JButton jButtonCerrarCobrarAnalisisCarteras;
	
	
	protected JButton jButtonRecargarInformacionCobrarAnalisisCarteras;
	protected JButton jButtonProcesarInformacionCobrarAnalisisCarteras;
	
	
	protected JButton jButtonAnterioresCobrarAnalisisCarteras;
	protected JButton jButtonSiguientesCobrarAnalisisCarteras;
	protected JButton jButtonNuevoGuardarCambiosCobrarAnalisisCarteras;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarAnalisisCarteras;
	//protected JButton jButtonCerrarReporteDinamicoCobrarAnalisisCarteras;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarteras;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarAnalisisCarteras;
	//protected JButton jButtonGenerarImportacionCobrarAnalisisCarteras;
	//protected JButton jButtonCerrarImportacionCobrarAnalisisCarteras;
	//protected JFileChooser jFileChooserImportacionCobrarAnalisisCarteras;
	//protected File fileImportacionCobrarAnalisisCarteras;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarAnalisisCarteras;
	protected JButton jButtonDuplicarToolBarCobrarAnalisisCarteras;
	protected JButton jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarAnalisisCarteras;
	protected JButton jButtonCopiarToolBarCobrarAnalisisCarteras;
	protected JButton jButtonVerFormToolBarCobrarAnalisisCarteras;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarAnalisisCarteras;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarAnalisisCarteras;
	protected JButton jButtonCerrarToolBarCobrarAnalisisCarteras;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarAnalisisCarteras;
	protected JButton jButtonProcesarInformacionToolBarCobrarAnalisisCarteras;
	protected JButton jButtonAnterioresToolBarCobrarAnalisisCarteras;
	protected JButton jButtonSiguientesToolBarCobrarAnalisisCarteras;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarAnalisisCarteras;
	protected JButton jButtonAbrirOrderByToolBarCobrarAnalisisCarteras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemDuplicarCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarAnalisisCarteras;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemCopiarCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemVerFormCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemCerrarCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemDetalleCerrarCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemProcesarInformacionCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemAnterioresCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemSiguientesCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemAbrirOrderByCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemMostrarOcultarCobrarAnalisisCarteras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarAnalisisCarteras;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarAnalisisCarteras;
	protected JCheckBox jCheckBoxSeleccionadosCobrarAnalisisCarteras;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarAnalisisCarteras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarAnalisisCarteras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarAnalisisCarteras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarAnalisisCarteras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarAnalisisCarteras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarAnalisisCarteras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarAnalisisCarteras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarAnalisisCarteras;
	protected JTextField jTextFieldValorCampoGeneralCobrarAnalisisCarteras;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarAnalisisCarteras;
	//public JList<Reporte> jListColumnasSelectReporteCobrarAnalisisCarteras;
	//public JScrollPane jScrollColumnasSelectReporteCobrarAnalisisCarteras;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarAnalisisCarteras;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarAnalisisCarteras;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarAnalisisCarteras;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarAnalisisCarteras;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarAnalisisCarteras;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarAnalisisCarteras;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarAnalisisCarteras;
	
		
	//public JLabel jLabelArchivoImportacionCobrarAnalisisCarteras;	
	//public JLabel jLabelPathArchivoImportacionCobrarAnalisisCarteras;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarAnalisisCarteras;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarAnalisisCarteras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarAnalisisCarteras;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarAnalisisCarteras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarAnalisisCarteras;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarAnalisisCarteras;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarAnalisisCarteras;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarAnalisisCarteras;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarAnalisisCarteras;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarAnalisisCarteras;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarAnalisisCarteras;
	public JPanel jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras;
	public JButton jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras;
	
	public JPanel jPanelIdIdBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras;
	public JLabel jLabelidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras;
	public JTextFieldMe jLabelidCobrarAnalisisCarterasBusquedaCobrarAnalisisCarteras;
	public JButton jButtonidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarterasBusqueda= new JButtonMe();

	
	
	
	
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
	public CobrarAnalisisCarterasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarAnalisisCarterasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarAnalisisCarterasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarAnalisisCarterasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarAnalisisCarteras)	{
		this.jButtonRecargarInformacionCobrarAnalisisCarteras = jButtonRecargarInformacionCobrarAnalisisCarteras;
	}
	
	public JButton getjButtonProcesarInformacionCobrarAnalisisCarteras() {
		return this.jButtonProcesarInformacionCobrarAnalisisCarteras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarAnalisisCarteras)	{
		this.jButtonProcesarInformacionCobrarAnalisisCarteras = jButtonProcesarInformacionCobrarAnalisisCarteras;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarAnalisisCarteras() {
		return this.jButtonRecargarInformacionCobrarAnalisisCarteras;
	}
	
	
	public List<CobrarAnalisisCarteras> getcobraranalisiscarterass() {
		return this.cobraranalisiscarterass;
	}

	public void setcobraranalisiscarterass(List<CobrarAnalisisCarteras> cobraranalisiscarterass) {
		this.cobraranalisiscarterass = cobraranalisiscarterass;
	}
	
	public List<CobrarAnalisisCarteras> getcobraranalisiscarterassAux() {
		return this.cobraranalisiscarterassAux;
	}

	public void setcobraranalisiscarterassAux(List<CobrarAnalisisCarteras> cobraranalisiscarterassAux) {
		this.cobraranalisiscarterassAux = cobraranalisiscarterassAux;
	}
	
	public List<CobrarAnalisisCarteras> getcobraranalisiscarterassEliminados() {
		return this.cobraranalisiscarterassEliminados;
	}

	public void setCobrarAnalisisCarterassEliminados(List<CobrarAnalisisCarteras> cobraranalisiscarterassEliminados) {
		this.cobraranalisiscarterassEliminados = cobraranalisiscarterassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarAnalisisCarteras() {
		return jComboBoxTiposSeleccionarCobrarAnalisisCarteras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposSeleccionarCobrarAnalisisCarteras) {
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras = jComboBoxTiposSeleccionarCobrarAnalisisCarteras;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarAnalisisCarteras() {
		return jTextFieldValorCampoGeneralCobrarAnalisisCarteras;
	}

	public void setjTextFieldValorCampoGeneralCobrarAnalisisCarteras(
			JTextField jTextFieldValorCampoGeneralCobrarAnalisisCarteras) {
		this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras = jTextFieldValorCampoGeneralCobrarAnalisisCarteras;
	}

	public void setBorderResaltarValorCampoGeneralCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarAnalisisCarteras() {
		return this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras;
	}

	public void setjCheckBoxSeleccionarTodosCobrarAnalisisCarteras(
			JCheckBox jCheckBoxSeleccionarTodosCobrarAnalisisCarteras) {
		this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras = jCheckBoxSeleccionarTodosCobrarAnalisisCarteras;
	}

	public void setBorderResaltarSeleccionarTodosCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarAnalisisCarteras() {
		return this.jCheckBoxSeleccionadosCobrarAnalisisCarteras;
	}

	public void setjCheckBoxSeleccionadosCobrarAnalisisCarteras(
			JCheckBox jCheckBoxSeleccionadosCobrarAnalisisCarteras) {
		this.jCheckBoxSeleccionadosCobrarAnalisisCarteras = jCheckBoxSeleccionadosCobrarAnalisisCarteras;
	}
	
	public void setBorderResaltarSeleccionadosCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarAnalisisCarteras() {
		return this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposArchivosReportesCobrarAnalisisCarteras) {
		this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras = jComboBoxTiposArchivosReportesCobrarAnalisisCarteras;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarAnalisisCarteras() {
		return this.jComboBoxTiposReportesCobrarAnalisisCarteras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposReportesCobrarAnalisisCarteras) {
		this.jComboBoxTiposReportesCobrarAnalisisCarteras = jComboBoxTiposReportesCobrarAnalisisCarteras;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarAnalisisCarteras() {
	//	return jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarAnalisisCarteras(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras) {
	//	this.jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras = jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras = jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras;
	//}
	
	public void setBorderResaltarTiposReportesCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarAnalisisCarteras() {
		return this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposGraficosReportesCobrarAnalisisCarteras) {
		this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras = jComboBoxTiposGraficosReportesCobrarAnalisisCarteras;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarAnalisisCarteras() {
		return this.jComboBoxTiposPaginacionCobrarAnalisisCarteras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposPaginacionCobrarAnalisisCarteras) {
		this.jComboBoxTiposPaginacionCobrarAnalisisCarteras = jComboBoxTiposPaginacionCobrarAnalisisCarteras;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarAnalisisCarteras() {
		return this.jComboBoxTiposRelacionesCobrarAnalisisCarteras;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarAnalisisCarteras() {
		return this.jComboBoxTiposAccionesCobrarAnalisisCarteras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposRelacionesCobrarAnalisisCarteras) {
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras = jComboBoxTiposRelacionesCobrarAnalisisCarteras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposAccionesCobrarAnalisisCarteras) {
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras = jComboBoxTiposAccionesCobrarAnalisisCarteras;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarAnalisisCarteras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarAnalisisCarteras() {
	//	return jCheckBoxConGraficoDinamicoCobrarAnalisisCarteras;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarAnalisisCarteras(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarAnalisisCarteras) {
	//	this.jCheckBoxConGraficoDinamicoCobrarAnalisisCarteras = jCheckBoxConGraficoDinamicoCobrarAnalisisCarteras;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarAnalisisCarteras() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarAnalisisCarteras.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarAnalisisCarteras .setBorder(borderResaltar);		
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
		this.cobraranalisiscarterasSessionBean=new CobrarAnalisisCarterasSessionBean();
		
		this.cobraranalisiscarterasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobraranalisiscarterasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarAnalisisCarterasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarAnalisisCarterasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarAnalisisCarterasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarAnalisisCarterasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarAnalisisCarterasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Analisis Carteras MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarAnalisisCarterasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarAnalisisCarteras= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"nuevo","nuevo","Nuevo"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"duplicar","duplicar","Duplicar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"copiar","copiar","Copiar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"ver_form","ver_form","Ver"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"recargar","recargar","Buscar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,
							"cerrar","cerrar","Salir"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras;
			
				this.jButtonProcesarInformacionToolBarCobrarAnalisisCarteras=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarAnalisisCarteras;
				
		//protected JButton jButtonModificarToolBarCobrarAnalisisCarteras;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarAnalisisCarteras=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarAnalisisCarteras=new JMenuMe("General");
		this.jmenuArchivoCobrarAnalisisCarteras=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarAnalisisCarteras=new JMenuMe("Acciones");
		this.jmenuDatosCobrarAnalisisCarteras=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarAnalisisCarteras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarAnalisisCarteras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarAnalisisCarteras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarAnalisisCarteras= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarAnalisisCarteras.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarAnalisisCarteras,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarAnalisisCarteras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarAnalisisCarteras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarAnalisisCarteras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarAnalisisCarteras= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarAnalisisCarteras.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarAnalisisCarteras,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarAnalisisCarteras= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarAnalisisCarteras.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarAnalisisCarteras,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarAnalisisCarteras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarAnalisisCarteras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarAnalisisCarteras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarAnalisisCarteras= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarAnalisisCarteras.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarAnalisisCarteras,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarAnalisisCarteras= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarAnalisisCarteras.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarAnalisisCarteras,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarAnalisisCarteras= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarAnalisisCarteras.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarAnalisisCarteras,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarAnalisisCarteras= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarAnalisisCarteras.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarAnalisisCarteras,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarAnalisisCarteras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarAnalisisCarteras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarAnalisisCarteras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarAnalisisCarteras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarAnalisisCarteras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarAnalisisCarteras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarAnalisisCarteras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarAnalisisCarteras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarAnalisisCarteras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarAnalisisCarteras.add(this.jMenuItemCerrarCobrarAnalisisCarteras);
			
			this.jmenuAccionesCobrarAnalisisCarteras.add(this.jMenuItemNuevoCobrarAnalisisCarteras);
			this.jmenuAccionesCobrarAnalisisCarteras.add(this.jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras);
			this.jmenuAccionesCobrarAnalisisCarteras.add(this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras);
			this.jmenuAccionesCobrarAnalisisCarteras.add(this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras);		
			this.jmenuAccionesCobrarAnalisisCarteras.add(this.jMenuItemDuplicarCobrarAnalisisCarteras);		
			this.jmenuAccionesCobrarAnalisisCarteras.add(this.jMenuItemCopiarCobrarAnalisisCarteras);		
			this.jmenuAccionesCobrarAnalisisCarteras.add(this.jMenuItemVerFormCobrarAnalisisCarteras);		
			
			this.jmenuDatosCobrarAnalisisCarteras.add(this.jMenuItemRecargarInformacionCobrarAnalisisCarteras);				
			this.jmenuDatosCobrarAnalisisCarteras.add(this.jMenuItemAnterioresCobrarAnalisisCarteras);				
			this.jmenuDatosCobrarAnalisisCarteras.add(this.jMenuItemSiguientesCobrarAnalisisCarteras);				
			this.jmenuDatosCobrarAnalisisCarteras.add(this.jMenuItemAbrirOrderByCobrarAnalisisCarteras);				
			this.jmenuDatosCobrarAnalisisCarteras.add(this.jMenuItemMostrarOcultarCobrarAnalisisCarteras);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarAnalisisCarteras.add(this.jMenuItemGuardarCambiosCobrarAnalisisCarteras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarAnalisisCarteras.add(this.jmenuArchivoCobrarAnalisisCarteras);		
			this.jmenuBarCobrarAnalisisCarteras.add(this.jmenuAccionesCobrarAnalisisCarteras);		
			this.jmenuBarCobrarAnalisisCarteras.add(this.jmenuDatosCobrarAnalisisCarteras);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarAnalisisCarteras);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarAnalisisCarteras() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras= new JButtonMe();
		this.jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.setText("Buscar");
		this.jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras = new JLabelMe();
		jLabelidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.setText("Id :");
		jLabelidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidCobrarAnalisisCarterasBusquedaCobrarAnalisisCarteras= new JTextFieldMe();
		jLabelidCobrarAnalisisCarterasBusquedaCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarAnalisisCarterasBusquedaCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarAnalisisCarterasBusquedaCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidCobrarAnalisisCarterasBusquedaCobrarAnalisisCarteras.setVisible(false);




		this.jTabbedPaneBusquedasCobrarAnalisisCarteras=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarAnalisisCarteras = new CobrarAnalisisCarterasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Analisis Carteras DATOS");
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras = new CobrarAnalisisCarterasDetalleFormJInternalFrame(jDesktopPane,this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones(),this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras = null;//new CobrarAnalisisCarterasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarAnalisisCarteras= new GridBagLayout();
		
		
		this.jTableDatosCobrarAnalisisCarteras = new JTableMe();      
		
		String sToolTipCobrarAnalisisCarteras="";
		sToolTipCobrarAnalisisCarteras=CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarAnalisisCarteras+="(Cartera.CobrarAnalisisCarteras)";
		}
		
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarAnalisisCarteras+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarAnalisisCarteras.setToolTipText(sToolTipCobrarAnalisisCarteras);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarAnalisisCarteras);
		this.jTableDatosCobrarAnalisisCarteras.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarAnalisisCarteras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarAnalisisCarteras.setRowSelectionAllowed(true);
		this.jTableDatosCobrarAnalisisCarteras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonDuplicarCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonCopiarCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonVerFormCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarAnalisisCarteras = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonCerrarCobrarAnalisisCarteras = new JButtonMe();
		
		this.jScrollPanelDatosCobrarAnalisisCarteras = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarAnalisisCarteras = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Analisis Carteras";
		
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Analisis Carterases" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarAnalisisCarteras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarAnalisisCarteras.setToolTipText("Acciones");
        this.jPanelAccionesCobrarAnalisisCarteras.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras=new ReporteDinamicoJInternalFrame(CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarAnalisisCarteras();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarAnalisisCarteras=new ImportacionJInternalFrame(CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarAnalisisCarteras();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarAnalisisCarteras = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarAnalisisCarteras.setText("Orden");
		this.jButtonAbrirOrderByCobrarAnalisisCarteras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarAnalisisCarteras,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarAnalisisCarteras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarAnalisisCarteras,false,this);
			
			//this.cargarOrderByCobrarAnalisisCarteras(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarAnalisisCarteras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarAnalisisCarteras,true,this);
			
			//this.cargarOrderByCobrarAnalisisCarteras(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarAnalisisCarteras.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosCobrarAnalisisCarteras.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosCobrarAnalisisCarteras.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosCobrarAnalisisCarteras.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarAnalisisCarteras.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarAnalisisCarteras.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarAnalisisCarteras.setText("Nuevo");
		this.jButtonDuplicarCobrarAnalisisCarteras.setText("Duplicar");
		this.jButtonCopiarCobrarAnalisisCarteras.setText("Copiar");
		this.jButtonVerFormCobrarAnalisisCarteras.setText("Ver");
		this.jButtonNuevoRelacionesCobrarAnalisisCarteras.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.setText("Guardar");
		this.jButtonCerrarCobrarAnalisisCarteras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarAnalisisCarteras,"nuevo_button","Nuevo",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarAnalisisCarteras,"duplicar_button","Duplicar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarAnalisisCarteras,"copiar_button","Copiar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarAnalisisCarteras,"ver_form","Ver",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarAnalisisCarteras,"nuevorelaciones_button","Nuevo Rel",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras,"guardarcambiostabla_button","Guardar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarAnalisisCarteras,"cerrar_button","Salir",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarAnalisisCarteras.setToolTipText("Nuevo"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarAnalisisCarteras.setToolTipText("Duplicar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarAnalisisCarteras.setToolTipText("Copiar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarAnalisisCarteras.setToolTipText("Ver"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarAnalisisCarteras.setToolTipText("Nuevo Rel"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.setToolTipText("Guardar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarAnalisisCarteras.setToolTipText("Salir"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarAnalisisCarteras";
		inputMap = this.jButtonNuevoCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarAnalisisCarteras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarAnalisisCarteras"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarAnalisisCarteras";
		inputMap = this.jButtonDuplicarCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarAnalisisCarteras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarAnalisisCarteras"));
		
		//COPIAR
		sMapKey = "CopiarCobrarAnalisisCarteras";
		inputMap = this.jButtonCopiarCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarAnalisisCarteras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarAnalisisCarteras"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarAnalisisCarteras";
		inputMap = this.jButtonVerFormCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarAnalisisCarteras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarAnalisisCarteras"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarAnalisisCarteras";
		inputMap = this.jButtonNuevoRelacionesCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarAnalisisCarteras"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarAnalisisCarteras";
		inputMap = this.jButtonModificarCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarAnalisisCarteras"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarAnalisisCarteras";
		inputMap = this.jButtonCerrarCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarAnalisisCarteras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarAnalisisCarteras";
		inputMap = this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarAnalisisCarteras"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarAnalisisCarteras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarAnalisisCarteras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarAnalisisCarteras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarAnalisisCarteras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarAnalisisCarteras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarAnalisisCarteras.setName("jPanelParametrosReportesCobrarAnalisisCarteras"); 
		
		this.jPanelParametrosReportesAccionesCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarAnalisisCarteras.setName("jPanelParametrosReportesAccionesCobrarAnalisisCarteras"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.setText("Buscar");
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.setToolTipText("Buscar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarAnalisisCarteras,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonProcesarInformacionCobrarAnalisisCarteras.setText("Procesar");
		this.jButtonProcesarInformacionCobrarAnalisisCarteras.setToolTipText("Procesar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarAnalisisCarteras.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarAnalisisCarteras.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarAnalisisCarteras.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarAnalisisCarteras.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarAnalisisCarteras.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setText("Accion");
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarAnalisisCarteras = new JLabelMe();
		
		this.jLabelAccionesCobrarAnalisisCarteras.setText("Acciones");		
		this.jLabelAccionesCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarAnalisisCarteras = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarAnalisisCarteras.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarAnalisisCarteras.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarAnalisisCarteras = new JButtonMe();
		//this.jButtonAnterioresCobrarAnalisisCarteras.setText("<<");
        this.jButtonAnterioresCobrarAnalisisCarteras.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarAnalisisCarteras,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarAnalisisCarteras = new JButtonMe();
		//this.jButtonSiguientesCobrarAnalisisCarteras.setText(">>");
        this.jButtonSiguientesCobrarAnalisisCarteras.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarAnalisisCarteras,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras,"nuevoguardarcambios_button","Nue",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarAnalisisCarteras";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarAnalisisCarteras"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarAnalisisCarteras";
		inputMap = this.jButtonRecargarInformacionCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarAnalisisCarteras"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarAnalisisCarteras";
		inputMap = this.jButtonSiguientesCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarAnalisisCarteras"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarAnalisisCarteras";
		inputMap = this.jButtonAnterioresCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarAnalisisCarteras"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarAnalisisCarteras();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarAnalisisCarteras.setMinimumSize(new Dimension(this.getWidth(),CobrarAnalisisCarterasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarAnalisisCarterasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarAnalisisCarteras.setMaximumSize(new Dimension(this.getWidth(),CobrarAnalisisCarterasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarAnalisisCarterasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarAnalisisCarteras.setPreferredSize(new Dimension(this.getWidth(),CobrarAnalisisCarterasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarAnalisisCarterasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarAnalisisCarteras = new GridBagLayout();

			this.jPanelPaginacionCobrarAnalisisCarteras.setLayout(gridaBagLayoutPaginacionCobrarAnalisisCarteras);						
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonAnterioresCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
					
						
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
			
			this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
						
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
			this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonSiguientesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 1;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonNuevoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
						
			
			
			if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
				this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 1;
				this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			}
			
			
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 1;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonDuplicarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 1;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonCopiarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 1;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonVerFormCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 1;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarAnalisisCarteras.add(this.jButtonCerrarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
		
		
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarAnalisisCarteras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarAnalisisCarteras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarAnalisisCarteras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarAnalisisCarteras.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarAnalisisCarteras.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarAnalisisCarteras.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarAnalisisCarteras = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarAnalisisCarteras = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarAnalisisCarteras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarAnalisisCarteras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarAnalisisCarteras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarAnalisisCarteras = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarAnalisisCarteras.setLayout(gridaBagParametrosReportesCobrarAnalisisCarteras);
			this.jPanelParametrosReportesAccionesCobrarAnalisisCarteras.setLayout(gridaBagParametrosReportesAccionesCobrarAnalisisCarteras);
			
			
			this.jPanelParametrosAuxiliar1CobrarAnalisisCarteras.setLayout(gridaBagParametrosAuxiliar1CobrarAnalisisCarteras);
			this.jPanelParametrosAuxiliar2CobrarAnalisisCarteras.setLayout(gridaBagParametrosAuxiliar2CobrarAnalisisCarteras);
			this.jPanelParametrosAuxiliar3CobrarAnalisisCarteras.setLayout(gridaBagParametrosAuxiliar3CobrarAnalisisCarteras);
			this.jPanelParametrosAuxiliar4CobrarAnalisisCarteras.setLayout(gridaBagParametrosAuxiliar4CobrarAnalisisCarteras);
			//this.jPanelParametrosAuxiliar5CobrarAnalisisCarteras.setLayout(gridaBagParametrosAuxiliar2CobrarAnalisisCarteras);			
			
			
			
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jButtonRecargarInformacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarAnalisisCarteras.add(this.jComboBoxTiposPaginacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarAnalisisCarteras.add(this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarAnalisisCarteras.add(this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jPanelParametrosAuxiliar1CobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarAnalisisCarteras.add(this.jComboBoxTiposReportesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jPanelParametrosAuxiliar4CobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jComboBoxTiposReportesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jCheckBoxGenerarReporteCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jPanelParametrosAuxiliar2CobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jLabelAccionesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
				this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jButtonAbrirOrderByCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);			
			
			
			/*
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarAnalisisCarteras.add(this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);															
				
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarAnalisisCarteras.add(this.jCheckBoxSeleccionadosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jPanelParametrosAuxiliar3CobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarAnalisisCarteras.add(this.jComboBoxTiposAccionesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarAnalisisCarteras = new GridBagLayout();

			this.jScrollPanelDatosCobrarAnalisisCarteras.setLayout(gridaBagLayoutDatosCobrarAnalisisCarteras);
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
			
			this.jScrollPanelDatosCobrarAnalisisCarteras.add(this.jTableDatosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarAnalisisCarteras.setViewportView(this.jTableDatosCobrarAnalisisCarteras);
		this.jTableDatosCobrarAnalisisCarteras.setFillsViewportHeight(true);
		this.jTableDatosCobrarAnalisisCarteras.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarAnalisisCarteras= new GridBagLayout();
		this.jPanelAccionesCobrarAnalisisCarteras.setLayout(gridaBagLayoutAccionesCobrarAnalisisCarteras);
		
		
		/*	
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
			
		this.jPanelAccionesCobrarAnalisisCarteras.add(this.jButtonNuevoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.setLayout(gridaBagLayoutBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);

		gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
		jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.add(jLabelidBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras, gridBagConstraintsCobrarAnalisisCarteras);

		gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		gridBagConstraintsCobrarAnalisisCarteras.gridx = 1;
		jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.add(jLabelidCobrarAnalisisCarterasBusquedaCobrarAnalisisCarteras, gridBagConstraintsCobrarAnalisisCarteras);

		gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarAnalisisCarteras.gridy = 1;
		gridBagConstraintsCobrarAnalisisCarteras.gridx =1;
		jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.add(jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras, gridBagConstraintsCobrarAnalisisCarteras);

		jTabbedPaneBusquedasCobrarAnalisisCarteras.addTab("1.-Por Id ", jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
		jTabbedPaneBusquedasCobrarAnalisisCarteras.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarAnalisisCarteras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarAnalisisCarteras);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();						
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;		
			//this.gridBagConstraintsCobrarAnalisisCarteras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;		
		//this.gridBagConstraintsCobrarAnalisisCarteras.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarAnalisisCarteras);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;		
			this.gridBagConstraintsCobrarAnalisisCarteras.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);								
		
		
		/*
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		*/		
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx =0;
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarAnalisisCarteras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
				
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarAnalisisCarteras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarAnalisisCarteras = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarAnalisisCarteras.setLayout(gridaBagLayoutBusquedasParametrosCobrarAnalisisCarteras);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarAnalisisCarteras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			
			
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
			
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarAnalisisCarteras;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarAnalisisCarteras() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarAnalisisCarteras = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.setName("jPanelReporteDinamicoCobrarAnalisisCarteras"); 
		
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.setLayout(gridaBagLayoutReporteDinamicoCobrarAnalisisCarteras);
		
		
		this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarAnalisisCarteras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Analisis Carterases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarAnalisisCarteras = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarAnalisisCarteras.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jLabelColumnasSelectReporteCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarAnalisisCarteras = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarAnalisisCarteras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarAnalisisCarteras.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarAnalisisCarteras.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarAnalisisCarteras.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarAnalisisCarteras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarAnalisisCarteras=new JScrollPane(this.jListColumnasSelectReporteCobrarAnalisisCarteras);
			
			this.jScrollColumnasSelectReporteCobrarAnalisisCarteras.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarAnalisisCarteras.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarAnalisisCarteras.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jListColumnasSelectReporteCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jScrollColumnasSelectReporteCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarAnalisisCarteras = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarAnalisisCarteras.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarAnalisisCarteras = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarAnalisisCarteras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarAnalisisCarteras.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarAnalisisCarteras.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarAnalisisCarteras.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarAnalisisCarteras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarAnalisisCarteras=new JScrollPane(this.jListRelacionesSelectReporteCobrarAnalisisCarteras);
			
			this.jScrollRelacionesSelectReporteCobrarAnalisisCarteras.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarAnalisisCarteras.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarAnalisisCarteras.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarAnalisisCarteras = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarAnalisisCarteras = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarAnalisisCarteras = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarAnalisisCarteras = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarAnalisisCarteras.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jLabelGenerarExcelReporteDinamicoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarteras.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarteras,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarteras.setToolTipText("Generar EXCEL"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		//this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jComboBoxTiposReportesDinamicoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarAnalisisCarteras = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarAnalisisCarteras.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jLabelTiposArchivoReporteDinamicoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarAnalisisCarteras.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarAnalisisCarteras,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarAnalisisCarteras.setToolTipText("Generar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jButtonGenerarReporteDinamicoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarAnalisisCarteras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarAnalisisCarteras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarAnalisisCarteras.setToolTipText("Cancelar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarAnalisisCarteras.add(this.jButtonCerrarReporteDinamicoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarAnalisisCarteras = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras= new JScrollPane(jPanelReporteDinamicoCobrarAnalisisCarteras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Analisis Carterases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarAnalisisCarteras);
		this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarAnalisisCarteras() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarAnalisisCarteras = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarAnalisisCarteras.setName("jPanelImportacionCobrarAnalisisCarteras"); 
		
		this.jPanelImportacionCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarAnalisisCarteras.setLayout(gridaBagLayoutImportacionCobrarAnalisisCarteras);
		
		
		this.jInternalFrameImportacionCobrarAnalisisCarteras= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarAnalisisCarteras= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarAnalisisCarteras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarAnalisisCarteras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarAnalisisCarteras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarAnalisisCarteras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarAnalisisCarteras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setResizable(true);
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setClosable(true);
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarAnalisisCarteras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarAnalisisCarteras.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarAnalisisCarteras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setResizable(true);
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setClosable(true);
	    this.jInternalFrameImportacionCobrarAnalisisCarteras.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Analisis Carterases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarAnalisisCarteras = new JLabelMe();

		this.jLabelArchivoImportacionCobrarAnalisisCarteras.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarAnalisisCarteras.add(this.jLabelArchivoImportacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarAnalisisCarteras = new JFileChooser();		
		this.jFileChooserImportacionCobrarAnalisisCarteras.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonAbrirImportacionCobrarAnalisisCarteras.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarAnalisisCarteras,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarAnalisisCarteras.setToolTipText("Generar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarAnalisisCarteras.add(this.jButtonAbrirImportacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarAnalisisCarteras = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarAnalisisCarteras.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarAnalisisCarteras.add(this.jLabelPathArchivoImportacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarAnalisisCarteras=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarAnalisisCarteras.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarAnalisisCarteras.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarAnalisisCarteras.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarAnalisisCarteras.add(this.jTextFieldPathArchivoImportacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonGenerarImportacionCobrarAnalisisCarteras.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarAnalisisCarteras,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarAnalisisCarteras.setToolTipText("Generar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarAnalisisCarteras.add(this.jButtonGenerarImportacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonCerrarImportacionCobrarAnalisisCarteras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarAnalisisCarteras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarAnalisisCarteras.setToolTipText("Cancelar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarAnalisisCarteras.add(this.jButtonCerrarImportacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarAnalisisCarteras = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarAnalisisCarteras= new JScrollPane(jPanelImportacionCobrarAnalisisCarteras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarAnalisisCarteras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarAnalisisCarteras.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarAnalisisCarteras);
		this.jInternalFrameImportacionCobrarAnalisisCarteras.getContentPane().add(this.jScrollPanelImportacionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarAnalisisCarteras(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarAnalisisCarteras = new JButtonMe();
			this.jButtonAbrirOrderByCobrarAnalisisCarteras.setText("Orden");
			this.jButtonAbrirOrderByCobrarAnalisisCarteras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarAnalisisCarteras,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarAnalisisCarteras";
			inputMap = this.jButtonAbrirOrderByCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarAnalisisCarteras"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarAnalisisCarteras = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarAnalisisCarteras.setName("jPanelOrderByCobrarAnalisisCarteras"); 
			
			this.jPanelOrderByCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarAnalisisCarteras.setLayout(gridaBagLayoutOrderByCobrarAnalisisCarteras);
			
			
			this.jTableDatosCobrarAnalisisCarterasOrderBy = new JTableMe();        
			this.jTableDatosCobrarAnalisisCarterasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarAnalisisCarterasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarAnalisisCarterasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarAnalisisCarterasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarAnalisisCarterasOrderBy.setViewportView(this.jTableDatosCobrarAnalisisCarterasOrderBy);
			this.jTableDatosCobrarAnalisisCarterasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarAnalisisCarterasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarAnalisisCarteras= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarAnalisisCarteras= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarAnalisisCarteras = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarAnalisisCarteras= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setTitle("Orden");
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setResizable(true);
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setClosable(true);
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Analisis Carterases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarAnalisisCarteras.ipady =150;
				
			this.jPanelOrderByCobrarAnalisisCarteras.add(jScrollPanelDatosCobrarAnalisisCarterasOrderBy, this.gridBagConstraintsCobrarAnalisisCarteras);//this.jTableDatosCobrarAnalisisCarterasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarAnalisisCarteras = new JButtonMe();
			this.jButtonCerrarOrderByCobrarAnalisisCarteras.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarAnalisisCarteras,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarAnalisisCarteras.setToolTipText("Cancelar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarAnalisisCarteras.add(this.jButtonCerrarOrderByCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarAnalisisCarteras = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarAnalisisCarteras= new JScrollPane(jPanelOrderByCobrarAnalisisCarteras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarAnalisisCarteras.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarAnalisisCarteras);
			
			this.jInternalFrameOrderByCobrarAnalisisCarteras.getContentPane().add(this.jScrollPanelOrderByCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);			
		
		} else {
			this.jButtonAbrirOrderByCobrarAnalisisCarteras = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarAnalisisCarteras.getRowHeight();//CobrarAnalisisCarterasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarAnalisisCarterasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras.isSelected()) {
					iHeightTable=CobrarAnalisisCarterasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarAnalisisCarterasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarAnalisisCarterasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarAnalisisCarterasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarAnalisisCarteras.isSelected()) {
					iHeightTable=CobrarAnalisisCarterasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarAnalisisCarterasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarAnalisisCarterasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarAnalisisCarteras!=null && this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy()!=null) {
			//if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarAnalisisCarteras.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarAnalisisCarteras.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarAnalisisCarteras.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobraranalisiscarterass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarAnalisisCarteras> TraerCobrarAnalisisCarterasBeans(List<CobrarAnalisisCarteras> cobraranalisiscarterass,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarAnalisisCarteras cobraranalisiscarteras:cobraranalisiscarterass) {
					
				if(!(CobrarAnalisisCarterasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarAnalisisCarterasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobraranalisiscarteras.setsDetalleGeneralEntityReporte(CobrarAnalisisCarterasConstantesFunciones.getCobrarAnalisisCarterasDescripcion(cobraranalisiscarteras));
										
						
					
						
					
				} else  {
							
					//cobraranalisiscarteras.setsDetalleGeneralEntityReporte(cobraranalisiscarteras.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobraranalisiscarterasbeans.add(cobraranalisiscarterasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobraranalisiscarterass;
    }
	//PARA REPORTES FIN
}
