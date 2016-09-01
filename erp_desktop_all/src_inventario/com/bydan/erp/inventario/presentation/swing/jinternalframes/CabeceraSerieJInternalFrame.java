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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.CabeceraSerieConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class CabeceraSerieJInternalFrame extends CabeceraSerieBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCabeceraSerie;
	
	protected JMenuBar jmenuBarCabeceraSerie;
	
	protected JMenu jmenuCabeceraSerie;
	protected JMenu jmenuDatosCabeceraSerie;
	protected JMenu jmenuArchivoCabeceraSerie;
	protected JMenu jmenuAccionesCabeceraSerie;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCabeceraSerie;	
	protected GridBagConstraints gridBagConstraintsCabeceraSerie;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CabeceraSerieDetalleFormJInternalFrame jInternalFrameDetalleFormCabeceraSerie;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCabeceraSerie;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCabeceraSerie;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CabeceraSerieSessionBean cabeceraserieSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CabeceraSerie> cabeceraseries;		
	public List<CabeceraSerie> cabeceraseriesEliminados;	
	public List<CabeceraSerie> cabeceraseriesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCabeceraSerie;		
	protected JButton jButtonAbrirOrderByCabeceraSerie;
	
	
	//protected JPanel jPanelOrderByCabeceraSerie;
	//public JScrollPane jScrollPanelOrderByCabeceraSerie;	
	//protected JButton jButtonCerrarOrderByCabeceraSerie;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CabeceraSerieLogic cabeceraserieLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCabeceraSerie;
	public JScrollPane jScrollPanelDatosEdicionCabeceraSerie;
	public JScrollPane jScrollPanelDatosGeneralCabeceraSerie;
    
	
	
	//public JScrollPane jScrollPanelDatosCabeceraSerieOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCabeceraSerie;
	//public JScrollPane jScrollPanelImportacionCabeceraSerie;
	
	
	
	protected JPanel jPanelAccionesCabeceraSerie;
	
    protected JPanel jPanelPaginacionCabeceraSerie;
    protected JPanel jPanelParametrosReportesCabeceraSerie;
	protected JPanel jPanelParametrosReportesAccionesCabeceraSerie;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CabeceraSerie;
	protected JPanel jPanelParametrosAuxiliar2CabeceraSerie;
	protected JPanel jPanelParametrosAuxiliar3CabeceraSerie;
	protected JPanel jPanelParametrosAuxiliar4CabeceraSerie;
	//protected JPanel jPanelParametrosAuxiliar5CabeceraSerie;
	
	
	
	//protected JPanel jPanelReporteDinamicoCabeceraSerie;
	//protected JPanel jPanelImportacionCabeceraSerie;
	
	
	public JTable jTableDatosCabeceraSerie;
	
	
	
	//public JTable jTableDatosCabeceraSerieOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCabeceraSerie;
	protected JButton jButtonDuplicarCabeceraSerie;
	protected JButton jButtonCopiarCabeceraSerie;
	protected JButton jButtonVerFormCabeceraSerie;
	protected JButton jButtonNuevoRelacionesCabeceraSerie;
	protected JButton jButtonModificarCabeceraSerie;
	
    protected JButton jButtonGuardarCambiosTablaCabeceraSerie;
	protected JButton jButtonCerrarCabeceraSerie;
	
	
	protected JButton jButtonRecargarInformacionCabeceraSerie;
	protected JButton jButtonProcesarInformacionCabeceraSerie;
	
	
	protected JButton jButtonAnterioresCabeceraSerie;
	protected JButton jButtonSiguientesCabeceraSerie;
	protected JButton jButtonNuevoGuardarCambiosCabeceraSerie;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCabeceraSerie;
	//protected JButton jButtonCerrarReporteDinamicoCabeceraSerie;
	//protected JButton jButtonGenerarExcelReporteDinamicoCabeceraSerie;	
	
	
	
	//protected JButton jButtonAbrirImportacionCabeceraSerie;
	//protected JButton jButtonGenerarImportacionCabeceraSerie;
	//protected JButton jButtonCerrarImportacionCabeceraSerie;
	//protected JFileChooser jFileChooserImportacionCabeceraSerie;
	//protected File fileImportacionCabeceraSerie;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCabeceraSerie;
	protected JButton jButtonDuplicarToolBarCabeceraSerie;
	protected JButton jButtonNuevoRelacionesToolBarCabeceraSerie;
	
	
	public JButton jButtonGuardarCambiosToolBarCabeceraSerie;
	protected JButton jButtonCopiarToolBarCabeceraSerie;
	protected JButton jButtonVerFormToolBarCabeceraSerie;
	public JButton jButtonGuardarCambiosTablaToolBarCabeceraSerie;
	protected JButton jButtonMostrarOcultarTablaToolBarCabeceraSerie;
	protected JButton jButtonCerrarToolBarCabeceraSerie;
	
	protected JButton jButtonRecargarInformacionToolBarCabeceraSerie;
	protected JButton jButtonProcesarInformacionToolBarCabeceraSerie;
	protected JButton jButtonAnterioresToolBarCabeceraSerie;
	protected JButton jButtonSiguientesToolBarCabeceraSerie;
	protected JButton jButtonNuevoGuardarCambiosToolBarCabeceraSerie;
	protected JButton jButtonAbrirOrderByToolBarCabeceraSerie;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCabeceraSerie;
	protected JMenuItem jMenuItemDuplicarCabeceraSerie;
	protected JMenuItem jMenuItemNuevoRelacionesCabeceraSerie;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCabeceraSerie;
	protected JMenuItem jMenuItemCopiarCabeceraSerie;
	protected JMenuItem jMenuItemVerFormCabeceraSerie;
	protected JMenuItem jMenuItemGuardarCambiosTablaCabeceraSerie;
	protected JMenuItem jMenuItemCerrarCabeceraSerie;
	protected JMenuItem jMenuItemDetalleCerrarCabeceraSerie;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCabeceraSerie;
	protected JMenuItem jMenuItemDetalleMostarOcultarCabeceraSerie;
	
	protected JMenuItem jMenuItemRecargarInformacionCabeceraSerie;
	protected JMenuItem jMenuItemProcesarInformacionCabeceraSerie;
	protected JMenuItem jMenuItemAnterioresCabeceraSerie;
	protected JMenuItem jMenuItemSiguientesCabeceraSerie;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCabeceraSerie;
	protected JMenuItem jMenuItemAbrirOrderByCabeceraSerie;
	protected JMenuItem jMenuItemMostrarOcultarCabeceraSerie;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCabeceraSerie;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCabeceraSerie;
	protected JCheckBox jCheckBoxSeleccionadosCabeceraSerie;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCabeceraSerie;
	protected JCheckBox jCheckBoxConGraficoReporteCabeceraSerie;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCabeceraSerie;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCabeceraSerie;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCabeceraSerie;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCabeceraSerie;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCabeceraSerie;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCabeceraSerie;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCabeceraSerie;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCabeceraSerie;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCabeceraSerie;
	protected JTextField jTextFieldValorCampoGeneralCabeceraSerie;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCabeceraSerie;
	//public JList<Reporte> jListColumnasSelectReporteCabeceraSerie;
	//public JScrollPane jScrollColumnasSelectReporteCabeceraSerie;
	
	//public JLabel jLabelRelacionesSelectReporteCabeceraSerie;
	//public JList<Reporte> jListRelacionesSelectReporteCabeceraSerie;
	//public JScrollPane jScrollRelacionesSelectReporteCabeceraSerie;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCabeceraSerie;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCabeceraSerie;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCabeceraSerie;
	//public JLabel jLabelTiposArchivoReporteDinamicoCabeceraSerie;
	
		
	//public JLabel jLabelArchivoImportacionCabeceraSerie;	
	//public JLabel jLabelPathArchivoImportacionCabeceraSerie;
	//protected JTextField jTextFieldPathArchivoImportacionCabeceraSerie;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCabeceraSerie;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCabeceraSerie;
	
	//public JLabel jLabelColumnaCategoriaValorCabeceraSerie;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCabeceraSerie;
	
	//public JLabel jLabelColumnasValoresGraficoCabeceraSerie;
	//public JList<Reporte> jListColumnasValoresGraficoCabeceraSerie;
	//public JScrollPane jScrollColumnasValoresGraficoCabeceraSerie;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCabeceraSerie;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCabeceraSerie;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCabeceraSerie;
	public JPanel jPanelBusquedaPorNombreCabeceraSerie;
	public JButton jButtonBusquedaPorNombreCabeceraSerie;
	
	public JPanel jPanelnombreBusquedaPorNombreCabeceraSerie;
	public JLabel jLabelnombreBusquedaPorNombreCabeceraSerie;
	public JTextField jTextFieldnombreBusquedaPorNombreCabeceraSerie;
	public JButton jButtonnombreBusquedaPorNombreCabeceraSerieBusqueda= new JButtonMe();

	
	
	
	
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
	public CabeceraSerieJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CabeceraSerieJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CabeceraSerieJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CabeceraSerieJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCabeceraSerie)	{
		this.jButtonRecargarInformacionCabeceraSerie = jButtonRecargarInformacionCabeceraSerie;
	}
	
	public JButton getjButtonProcesarInformacionCabeceraSerie() {
		return this.jButtonProcesarInformacionCabeceraSerie;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCabeceraSerie)	{
		this.jButtonProcesarInformacionCabeceraSerie = jButtonProcesarInformacionCabeceraSerie;
	}
	
	
	public JButton getjButtonRecargarInformacionCabeceraSerie() {
		return this.jButtonRecargarInformacionCabeceraSerie;
	}
	
	
	public List<CabeceraSerie> getcabeceraseries() {
		return this.cabeceraseries;
	}

	public void setcabeceraseries(List<CabeceraSerie> cabeceraseries) {
		this.cabeceraseries = cabeceraseries;
	}
	
	public List<CabeceraSerie> getcabeceraseriesAux() {
		return this.cabeceraseriesAux;
	}

	public void setcabeceraseriesAux(List<CabeceraSerie> cabeceraseriesAux) {
		this.cabeceraseriesAux = cabeceraseriesAux;
	}
	
	public List<CabeceraSerie> getcabeceraseriesEliminados() {
		return this.cabeceraseriesEliminados;
	}

	public void setCabeceraSeriesEliminados(List<CabeceraSerie> cabeceraseriesEliminados) {
		this.cabeceraseriesEliminados = cabeceraseriesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCabeceraSerie() {
		return jComboBoxTiposSeleccionarCabeceraSerie;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCabeceraSerie(
			JComboBox jComboBoxTiposSeleccionarCabeceraSerie) {
		this.jComboBoxTiposSeleccionarCabeceraSerie = jComboBoxTiposSeleccionarCabeceraSerie;
	}
	
	public void setBorderResaltarTiposSeleccionarCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCabeceraSerie .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCabeceraSerie() {
		return jTextFieldValorCampoGeneralCabeceraSerie;
	}

	public void setjTextFieldValorCampoGeneralCabeceraSerie(
			JTextField jTextFieldValorCampoGeneralCabeceraSerie) {
		this.jTextFieldValorCampoGeneralCabeceraSerie = jTextFieldValorCampoGeneralCabeceraSerie;
	}

	public void setBorderResaltarValorCampoGeneralCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCabeceraSerie .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCabeceraSerie() {
		return this.jCheckBoxSeleccionarTodosCabeceraSerie;
	}

	public void setjCheckBoxSeleccionarTodosCabeceraSerie(
			JCheckBox jCheckBoxSeleccionarTodosCabeceraSerie) {
		this.jCheckBoxSeleccionarTodosCabeceraSerie = jCheckBoxSeleccionarTodosCabeceraSerie;
	}

	public void setBorderResaltarSeleccionarTodosCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCabeceraSerie .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCabeceraSerie() {
		return this.jCheckBoxSeleccionadosCabeceraSerie;
	}

	public void setjCheckBoxSeleccionadosCabeceraSerie(
			JCheckBox jCheckBoxSeleccionadosCabeceraSerie) {
		this.jCheckBoxSeleccionadosCabeceraSerie = jCheckBoxSeleccionadosCabeceraSerie;
	}
	
	public void setBorderResaltarSeleccionadosCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCabeceraSerie .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCabeceraSerie() {
		return this.jComboBoxTiposArchivosReportesCabeceraSerie;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCabeceraSerie(
			JComboBox jComboBoxTiposArchivosReportesCabeceraSerie) {
		this.jComboBoxTiposArchivosReportesCabeceraSerie = jComboBoxTiposArchivosReportesCabeceraSerie;
	}

	public void setBorderResaltarTiposArchivosReportesCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCabeceraSerie .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCabeceraSerie() {
		return this.jComboBoxTiposReportesCabeceraSerie;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCabeceraSerie(
			JComboBox jComboBoxTiposReportesCabeceraSerie) {
		this.jComboBoxTiposReportesCabeceraSerie = jComboBoxTiposReportesCabeceraSerie;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCabeceraSerie() {
	//	return jComboBoxTiposReportesDinamicoCabeceraSerie;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCabeceraSerie(
	//		JComboBox jComboBoxTiposReportesDinamicoCabeceraSerie) {
	//	this.jComboBoxTiposReportesDinamicoCabeceraSerie = jComboBoxTiposReportesDinamicoCabeceraSerie;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCabeceraSerie() {
	//	return jComboBoxTiposArchivosReportesDinamicoCabeceraSerie;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCabeceraSerie(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCabeceraSerie) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCabeceraSerie = jComboBoxTiposArchivosReportesDinamicoCabeceraSerie;
	//}
	
	public void setBorderResaltarTiposReportesCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCabeceraSerie .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCabeceraSerie() {
		return this.jComboBoxTiposGraficosReportesCabeceraSerie;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCabeceraSerie(
			JComboBox jComboBoxTiposGraficosReportesCabeceraSerie) {
		this.jComboBoxTiposGraficosReportesCabeceraSerie = jComboBoxTiposGraficosReportesCabeceraSerie;
	}
	
	public void setBorderResaltarTiposGraficosReportesCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCabeceraSerie .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCabeceraSerie() {
		return this.jComboBoxTiposPaginacionCabeceraSerie;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCabeceraSerie(
			JComboBox jComboBoxTiposPaginacionCabeceraSerie) {
		this.jComboBoxTiposPaginacionCabeceraSerie = jComboBoxTiposPaginacionCabeceraSerie;
	}
	
	public void setBorderResaltarTiposPaginacionCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCabeceraSerie .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCabeceraSerie() {
		return this.jComboBoxTiposRelacionesCabeceraSerie;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCabeceraSerie() {
		return this.jComboBoxTiposAccionesCabeceraSerie;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCabeceraSerie(
			JComboBox jComboBoxTiposRelacionesCabeceraSerie) {
		this.jComboBoxTiposRelacionesCabeceraSerie = jComboBoxTiposRelacionesCabeceraSerie;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCabeceraSerie(
			JComboBox jComboBoxTiposAccionesCabeceraSerie) {
		this.jComboBoxTiposAccionesCabeceraSerie = jComboBoxTiposAccionesCabeceraSerie;
	}
	
	public void setBorderResaltarTiposRelacionesCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCabeceraSerie .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCabeceraSerie() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCabeceraSerie .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCabeceraSerie() {
	//	return jCheckBoxConGraficoDinamicoCabeceraSerie;
	//}

	//public void setjCheckBoxConGraficoDinamicoCabeceraSerie(
	//		JCheckBox jCheckBoxConGraficoDinamicoCabeceraSerie) {
	//	this.jCheckBoxConGraficoDinamicoCabeceraSerie = jCheckBoxConGraficoDinamicoCabeceraSerie;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCabeceraSerie() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCabeceraSerie.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCabeceraSerie .setBorder(borderResaltar);		
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
		this.cabeceraserieSessionBean=new CabeceraSerieSessionBean();
		
		this.cabeceraserieSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cabeceraserieSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cabeceraserieSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CabeceraSerieJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CabeceraSerieJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CabeceraSerieJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CabeceraSerieJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CabeceraSerieJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cabecera Serie MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
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
		
		CabeceraSerieJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCabeceraSerie= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"nuevo","nuevo","Nuevo"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"duplicar","duplicar","Duplicar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"copiar","copiar","Copiar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"ver_form","ver_form","Ver"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"recargar","recargar","Recargar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCabeceraSerie,this.jTtoolBarCabeceraSerie,
							"cerrar","cerrar","Salir"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCabeceraSerie=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCabeceraSerie;
			
				this.jButtonProcesarInformacionToolBarCabeceraSerie=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCabeceraSerie;
				
		//protected JButton jButtonModificarToolBarCabeceraSerie;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCabeceraSerie=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCabeceraSerie=new JMenuMe("General");
		this.jmenuArchivoCabeceraSerie=new JMenuMe("Archivo");
		this.jmenuAccionesCabeceraSerie=new JMenuMe("Acciones");
		this.jmenuDatosCabeceraSerie=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCabeceraSerie= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCabeceraSerie.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCabeceraSerie,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCabeceraSerie= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCabeceraSerie.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCabeceraSerie,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCabeceraSerie= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCabeceraSerie.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCabeceraSerie,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCabeceraSerie= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCabeceraSerie.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCabeceraSerie,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCabeceraSerie= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCabeceraSerie.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCabeceraSerie,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCabeceraSerie= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCabeceraSerie.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCabeceraSerie,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCabeceraSerie= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCabeceraSerie.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCabeceraSerie,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCabeceraSerie= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCabeceraSerie.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCabeceraSerie,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCabeceraSerie= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCabeceraSerie.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCabeceraSerie,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCabeceraSerie= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCabeceraSerie.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCabeceraSerie,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCabeceraSerie= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCabeceraSerie.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCabeceraSerie,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCabeceraSerie= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCabeceraSerie.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCabeceraSerie,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCabeceraSerie= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCabeceraSerie.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCabeceraSerie,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCabeceraSerie= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCabeceraSerie.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCabeceraSerie,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCabeceraSerie= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCabeceraSerie.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCabeceraSerie,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCabeceraSerie= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCabeceraSerie.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCabeceraSerie,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCabeceraSerie= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCabeceraSerie.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCabeceraSerie,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCabeceraSerie.add(this.jMenuItemCerrarCabeceraSerie);
			
			this.jmenuAccionesCabeceraSerie.add(this.jMenuItemNuevoCabeceraSerie);
			this.jmenuAccionesCabeceraSerie.add(this.jMenuItemNuevoGuardarCambiosCabeceraSerie);
			this.jmenuAccionesCabeceraSerie.add(this.jMenuItemNuevoRelacionesCabeceraSerie);
			this.jmenuAccionesCabeceraSerie.add(this.jMenuItemGuardarCambiosTablaCabeceraSerie);		
			this.jmenuAccionesCabeceraSerie.add(this.jMenuItemDuplicarCabeceraSerie);		
			this.jmenuAccionesCabeceraSerie.add(this.jMenuItemCopiarCabeceraSerie);		
			this.jmenuAccionesCabeceraSerie.add(this.jMenuItemVerFormCabeceraSerie);		
			
			this.jmenuDatosCabeceraSerie.add(this.jMenuItemRecargarInformacionCabeceraSerie);				
			this.jmenuDatosCabeceraSerie.add(this.jMenuItemAnterioresCabeceraSerie);				
			this.jmenuDatosCabeceraSerie.add(this.jMenuItemSiguientesCabeceraSerie);				
			this.jmenuDatosCabeceraSerie.add(this.jMenuItemAbrirOrderByCabeceraSerie);				
			this.jmenuDatosCabeceraSerie.add(this.jMenuItemMostrarOcultarCabeceraSerie);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCabeceraSerie.add(this.jMenuItemGuardarCambiosCabeceraSerie);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCabeceraSerie.add(this.jmenuArchivoCabeceraSerie);		
			this.jmenuBarCabeceraSerie.add(this.jmenuAccionesCabeceraSerie);		
			this.jmenuBarCabeceraSerie.add(this.jmenuDatosCabeceraSerie);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCabeceraSerie);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCabeceraSerie() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreCabeceraSerie=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCabeceraSerie.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCabeceraSerie= new JButtonMe();
		this.jButtonBusquedaPorNombreCabeceraSerie.setText("Buscar");
		this.jButtonBusquedaPorNombreCabeceraSerie.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCabeceraSerie,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCabeceraSerie = new JLabelMe();
		jLabelnombreBusquedaPorNombreCabeceraSerie.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCabeceraSerie.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCabeceraSerie,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreCabeceraSerie= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreCabeceraSerie,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCabeceraSerie=new JTabbedPane();


		this.jTabbedPaneBusquedasCabeceraSerie.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCabeceraSerie.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCabeceraSerie.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCabeceraSerie.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCabeceraSerie,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCabeceraSerie = new CabeceraSerieDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cabecera Serie DATOS");
			this.jInternalFrameDetalleFormCabeceraSerie = new CabeceraSerieDetalleFormJInternalFrame(jDesktopPane,this.cabeceraserieSessionBean.getConGuardarRelaciones(),this.cabeceraserieSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCabeceraSerie = null;//new CabeceraSerieDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCabeceraSerie= new GridBagLayout();
		
		
		this.jTableDatosCabeceraSerie = new JTableMe();      
		
		String sToolTipCabeceraSerie="";
		sToolTipCabeceraSerie=CabeceraSerieConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCabeceraSerie+="(Inventario.CabeceraSerie)";
		}
		
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			sToolTipCabeceraSerie+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCabeceraSerie.setToolTipText(sToolTipCabeceraSerie);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCabeceraSerie);
		this.jTableDatosCabeceraSerie.setAutoCreateRowSorter(true);
		this.jTableDatosCabeceraSerie.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCabeceraSerie.setRowSelectionAllowed(true);
		this.jTableDatosCabeceraSerie.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCabeceraSerie,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCabeceraSerie = new JButtonMe();
		this.jButtonDuplicarCabeceraSerie = new JButtonMe();
		this.jButtonCopiarCabeceraSerie = new JButtonMe();
		this.jButtonVerFormCabeceraSerie = new JButtonMe();
		this.jButtonNuevoRelacionesCabeceraSerie = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCabeceraSerie = new JButtonMe();
		this.jButtonCerrarCabeceraSerie = new JButtonMe();
		
		this.jScrollPanelDatosCabeceraSerie = new JScrollPane();   
        this.jScrollPanelDatosGeneralCabeceraSerie = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cabecera Serie";
		
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cabecera Seriees" + this.sPath));
		} else {
			this.jScrollPanelDatosCabeceraSerie.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCabeceraSerie.setToolTipText("Acciones");
        this.jPanelAccionesCabeceraSerie.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCabeceraSerie=new ReporteDinamicoJInternalFrame(CabeceraSerieConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCabeceraSerie();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCabeceraSerie=new ImportacionJInternalFrame(CabeceraSerieConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCabeceraSerie();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCabeceraSerie = new JButtonMe();
		
		this.jButtonAbrirOrderByCabeceraSerie.setText("Orden");
		this.jButtonAbrirOrderByCabeceraSerie.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCabeceraSerie,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCabeceraSerie=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCabeceraSerie,false,this);
			
			//this.cargarOrderByCabeceraSerie(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCabeceraSerie=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCabeceraSerie,true,this);
			
			//this.cargarOrderByCabeceraSerie(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCabeceraSerie.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosCabeceraSerie.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosCabeceraSerie.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosCabeceraSerie.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCabeceraSerie.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCabeceraSerie.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCabeceraSerie.setText("Nuevo");
		this.jButtonDuplicarCabeceraSerie.setText("Duplicar");
		this.jButtonCopiarCabeceraSerie.setText("Copiar");
		this.jButtonVerFormCabeceraSerie.setText("Ver");
		this.jButtonNuevoRelacionesCabeceraSerie.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCabeceraSerie.setText("Guardar");
		this.jButtonCerrarCabeceraSerie.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCabeceraSerie,"nuevo_button","Nuevo",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCabeceraSerie,"duplicar_button","Duplicar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCabeceraSerie,"copiar_button","Copiar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCabeceraSerie,"ver_form","Ver",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCabeceraSerie,"nuevorelaciones_button","Nuevo Rel",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCabeceraSerie,"guardarcambiostabla_button","Guardar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCabeceraSerie,"cerrar_button","Salir",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCabeceraSerie.setToolTipText("Nuevo"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCabeceraSerie.setToolTipText("Duplicar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCabeceraSerie.setToolTipText("Copiar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCabeceraSerie.setToolTipText("Ver"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCabeceraSerie.setToolTipText("Nuevo Rel"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCabeceraSerie.setToolTipText("Guardar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCabeceraSerie.setToolTipText("Salir"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCabeceraSerie";
		inputMap = this.jButtonNuevoCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCabeceraSerie.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCabeceraSerie"));
		
		//DUPLICAR
		sMapKey = "DuplicarCabeceraSerie";
		inputMap = this.jButtonDuplicarCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCabeceraSerie.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCabeceraSerie"));
		
		//COPIAR
		sMapKey = "CopiarCabeceraSerie";
		inputMap = this.jButtonCopiarCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCabeceraSerie.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCabeceraSerie"));
		
		//VEr FORM
		sMapKey = "VerFormCabeceraSerie";
		inputMap = this.jButtonVerFormCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCabeceraSerie.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCabeceraSerie"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCabeceraSerie";
		inputMap = this.jButtonNuevoRelacionesCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCabeceraSerie"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCabeceraSerie";
		inputMap = this.jButtonModificarCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCabeceraSerie"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCabeceraSerie";
		inputMap = this.jButtonCerrarCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCabeceraSerie"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCabeceraSerie";
		inputMap = this.jButtonGuardarCambiosTablaCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCabeceraSerie"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CabeceraSerie= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CabeceraSerie= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CabeceraSerie= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CabeceraSerie= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CabeceraSerie= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCabeceraSerie.setName("jPanelParametrosReportesCabeceraSerie"); 
		
		this.jPanelParametrosReportesAccionesCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCabeceraSerie.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCabeceraSerie.setName("jPanelParametrosReportesAccionesCabeceraSerie"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCabeceraSerie = new JButtonMe();
		this.jButtonRecargarInformacionCabeceraSerie.setText("Recargar");
		this.jButtonRecargarInformacionCabeceraSerie.setToolTipText("Recargar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCabeceraSerie,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCabeceraSerie = new JButtonMe();
		this.jButtonProcesarInformacionCabeceraSerie.setText("Procesar");
		this.jButtonProcesarInformacionCabeceraSerie.setToolTipText("Procesar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCabeceraSerie.setVisible(false);
			
		this.jButtonProcesarInformacionCabeceraSerie.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCabeceraSerie.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCabeceraSerie.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCabeceraSerie.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCabeceraSerie.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCabeceraSerie.setText("TIPO");       
		this.jComboBoxTiposReportesCabeceraSerie.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCabeceraSerie.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCabeceraSerie.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCabeceraSerie.setText("Paginacion");
		this.jComboBoxTiposPaginacionCabeceraSerie.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCabeceraSerie.setText("Accion");
		this.jComboBoxTiposRelacionesCabeceraSerie.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCabeceraSerie.setText("Accion");
		this.jComboBoxTiposAccionesCabeceraSerie.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCabeceraSerie.setText("Accion");
		this.jComboBoxTiposSeleccionarCabeceraSerie.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCabeceraSerie=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCabeceraSerie.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCabeceraSerie.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCabeceraSerie.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCabeceraSerie = new JLabelMe();
		
		this.jLabelAccionesCabeceraSerie.setText("Acciones");		
		this.jLabelAccionesCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCabeceraSerie = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCabeceraSerie.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCabeceraSerie.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCabeceraSerie = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCabeceraSerie.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCabeceraSerie.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCabeceraSerie = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCabeceraSerie.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCabeceraSerie.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCabeceraSerie = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCabeceraSerie.setText("Graf.");
		this.jCheckBoxConGraficoReporteCabeceraSerie.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCabeceraSerie = new JButtonMe();
		//this.jButtonAnterioresCabeceraSerie.setText("<<");
        this.jButtonAnterioresCabeceraSerie.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCabeceraSerie,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCabeceraSerie = new JButtonMe();
		//this.jButtonSiguientesCabeceraSerie.setText(">>");
        this.jButtonSiguientesCabeceraSerie.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCabeceraSerie,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCabeceraSerie = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCabeceraSerie.setText("Nue");
        this.jButtonNuevoGuardarCambiosCabeceraSerie.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCabeceraSerie,"nuevoguardarcambios_button","Nue",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCabeceraSerie";
		inputMap = this.jButtonNuevoGuardarCambiosCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCabeceraSerie"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCabeceraSerie";
		inputMap = this.jButtonRecargarInformacionCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCabeceraSerie"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCabeceraSerie";
		inputMap = this.jButtonSiguientesCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCabeceraSerie"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCabeceraSerie";
		inputMap = this.jButtonAnterioresCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCabeceraSerie"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCabeceraSerie();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCabeceraSerie.setMinimumSize(new Dimension(this.getWidth(),CabeceraSerieBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CabeceraSerieBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCabeceraSerie.setMaximumSize(new Dimension(this.getWidth(),CabeceraSerieBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CabeceraSerieBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCabeceraSerie.setPreferredSize(new Dimension(this.getWidth(),CabeceraSerieBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CabeceraSerieBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCabeceraSerie = new GridBagLayout();

			this.jPanelPaginacionCabeceraSerie.setLayout(gridaBagLayoutPaginacionCabeceraSerie);						
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = 0;
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCabeceraSerie.add(this.jButtonAnterioresCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
					
						
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCabeceraSerie.gridy = 0;
			
			this.jPanelPaginacionCabeceraSerie.add(this.jButtonNuevoGuardarCambiosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
						
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCabeceraSerie.gridy = 0;
			this.jPanelPaginacionCabeceraSerie.add(this.jButtonSiguientesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = 1;
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCabeceraSerie.add(this.jButtonNuevoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
						
			
			
			if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
				this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCabeceraSerie.gridy = 1;
				this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCabeceraSerie.add(this.jButtonGuardarCambiosTablaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			}
			
			
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = 1;
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCabeceraSerie.add(this.jButtonDuplicarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = 1;
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCabeceraSerie.add(this.jButtonCopiarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = 1;
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCabeceraSerie.add(this.jButtonVerFormCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = 1;
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCabeceraSerie.add(this.jButtonCerrarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
		
		
		this.jButtonRecargarInformacionCabeceraSerie.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCabeceraSerie.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCabeceraSerie.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCabeceraSerie.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCabeceraSerie.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCabeceraSerie.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCabeceraSerie.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCabeceraSerie.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCabeceraSerie.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCabeceraSerie.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCabeceraSerie.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCabeceraSerie.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCabeceraSerie.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCabeceraSerie.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCabeceraSerie.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCabeceraSerie.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCabeceraSerie.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCabeceraSerie.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCabeceraSerie.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCabeceraSerie.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCabeceraSerie.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCabeceraSerie.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCabeceraSerie.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCabeceraSerie.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCabeceraSerie.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCabeceraSerie.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCabeceraSerie.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCabeceraSerie.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCabeceraSerie.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCabeceraSerie.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCabeceraSerie.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCabeceraSerie.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCabeceraSerie.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCabeceraSerie.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCabeceraSerie.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCabeceraSerie.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCabeceraSerie = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCabeceraSerie = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CabeceraSerie = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CabeceraSerie = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CabeceraSerie = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CabeceraSerie = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCabeceraSerie.setLayout(gridaBagParametrosReportesCabeceraSerie);
			this.jPanelParametrosReportesAccionesCabeceraSerie.setLayout(gridaBagParametrosReportesAccionesCabeceraSerie);
			
			
			this.jPanelParametrosAuxiliar1CabeceraSerie.setLayout(gridaBagParametrosAuxiliar1CabeceraSerie);
			this.jPanelParametrosAuxiliar2CabeceraSerie.setLayout(gridaBagParametrosAuxiliar2CabeceraSerie);
			this.jPanelParametrosAuxiliar3CabeceraSerie.setLayout(gridaBagParametrosAuxiliar3CabeceraSerie);
			this.jPanelParametrosAuxiliar4CabeceraSerie.setLayout(gridaBagParametrosAuxiliar4CabeceraSerie);
			//this.jPanelParametrosAuxiliar5CabeceraSerie.setLayout(gridaBagParametrosAuxiliar2CabeceraSerie);			
			
			
			
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCabeceraSerie.add(this.jButtonRecargarInformacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CabeceraSerie.add(this.jComboBoxTiposPaginacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CabeceraSerie.add(this.jCheckBoxConAltoMaximoTablaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CabeceraSerie.add(this.jComboBoxTiposArchivosReportesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCabeceraSerie.add(this.jPanelParametrosAuxiliar1CabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCabeceraSerie.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CabeceraSerie.add(this.jComboBoxTiposReportesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCabeceraSerie.add(this.jPanelParametrosAuxiliar4CabeceraSerie, this.gridBagConstraintsCabeceraSerie);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCabeceraSerie.add(this.jComboBoxTiposReportesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCabeceraSerie.add(this.jCheckBoxGenerarReporteCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCabeceraSerie.add(this.jPanelParametrosAuxiliar2CabeceraSerie, this.gridBagConstraintsCabeceraSerie);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCabeceraSerie.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCabeceraSerie.add(this.jLabelAccionesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
				this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCabeceraSerie.add(this.jButtonAbrirOrderByCabeceraSerie, this.gridBagConstraintsCabeceraSerie);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCabeceraSerie.add(this.jComboBoxTiposSeleccionarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
			
			
			/*
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCabeceraSerie.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCabeceraSerie.add(this.jCheckBoxSeleccionarTodosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCabeceraSerie.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CabeceraSerie.add(this.jCheckBoxSeleccionarTodosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);															
				
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCabeceraSerie.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CabeceraSerie.add(this.jCheckBoxSeleccionadosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCabeceraSerie.add(this.jPanelParametrosAuxiliar3CabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCabeceraSerie.add(this.jComboBoxTiposAccionesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
	
				
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCabeceraSerie.add(this.jTextFieldValorCampoGeneralCabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCabeceraSerie = new GridBagLayout();

			this.jScrollPanelDatosCabeceraSerie.setLayout(gridaBagLayoutDatosCabeceraSerie);
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = 0;
			this.gridBagConstraintsCabeceraSerie.gridx = 0;
			
			this.jScrollPanelDatosCabeceraSerie.add(this.jTableDatosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCabeceraSerie.setViewportView(this.jTableDatosCabeceraSerie);
		this.jTableDatosCabeceraSerie.setFillsViewportHeight(true);
		this.jTableDatosCabeceraSerie.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCabeceraSerie= new GridBagLayout();
		this.jPanelAccionesCabeceraSerie.setLayout(gridaBagLayoutAccionesCabeceraSerie);
		
		
		/*	
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx = 0;
			
		this.jPanelAccionesCabeceraSerie.add(this.jButtonNuevoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreCabeceraSerie= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCabeceraSerie.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCabeceraSerie.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCabeceraSerie.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCabeceraSerie.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCabeceraSerie.setLayout(gridaBagLayoutBusquedaPorNombreCabeceraSerie);

		gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCabeceraSerie.gridy = 0;
		gridBagConstraintsCabeceraSerie.gridx = 0;
		jPanelBusquedaPorNombreCabeceraSerie.add(jLabelnombreBusquedaPorNombreCabeceraSerie, gridBagConstraintsCabeceraSerie);

		gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCabeceraSerie.gridy = 0;
		gridBagConstraintsCabeceraSerie.gridx = 1;
		jPanelBusquedaPorNombreCabeceraSerie.add(jTextFieldnombreBusquedaPorNombreCabeceraSerie, gridBagConstraintsCabeceraSerie);

		gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCabeceraSerie.gridy = 1;
		gridBagConstraintsCabeceraSerie.gridx =1;
		jPanelBusquedaPorNombreCabeceraSerie.add(jButtonBusquedaPorNombreCabeceraSerie, gridBagConstraintsCabeceraSerie);

		jTabbedPaneBusquedasCabeceraSerie.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreCabeceraSerie);
		jTabbedPaneBusquedasCabeceraSerie.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCabeceraSerie = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCabeceraSerie);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();						
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCabeceraSerie.gridx = 0;		
			//this.gridBagConstraintsCabeceraSerie.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCabeceraSerie.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCabeceraSerie.gridx = 0;		
		//this.gridBagConstraintsCabeceraSerie.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCabeceraSerie.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCabeceraSerie);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCabeceraSerie.gridx = 0;		
			this.gridBagConstraintsCabeceraSerie.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCabeceraSerie.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCabeceraSerie, this.gridBagConstraintsCabeceraSerie);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);								
		
		
		/*
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		*/		
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCabeceraSerie.gridx =0;
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCabeceraSerie.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
				
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCabeceraSerie= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCabeceraSerie = new GridBagLayout();
			this.jPanelBusquedasParametrosCabeceraSerie.setLayout(gridaBagLayoutBusquedasParametrosCabeceraSerie);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCabeceraSerie=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCabeceraSerie.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCabeceraSerie.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCabeceraSerie.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			
			
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
			
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCabeceraSerie;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCabeceraSerie() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCabeceraSerie = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCabeceraSerie.setName("jPanelReporteDinamicoCabeceraSerie"); 
		
		this.jPanelReporteDinamicoCabeceraSerie.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCabeceraSerie.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCabeceraSerie.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCabeceraSerie.setLayout(gridaBagLayoutReporteDinamicoCabeceraSerie);
		
		
		this.jInternalFrameReporteDinamicoCabeceraSerie= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCabeceraSerie = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCabeceraSerie= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCabeceraSerie.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCabeceraSerie.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCabeceraSerie.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCabeceraSerie.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCabeceraSerie.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCabeceraSerie.setResizable(true);
	    this.jInternalFrameReporteDinamicoCabeceraSerie.setClosable(true);
	    this.jInternalFrameReporteDinamicoCabeceraSerie.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCabeceraSerie.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCabeceraSerie.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCabeceraSerie.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cabecera Seriees"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCabeceraSerie = new JLabelMe();

		this.jLabelColumnasSelectReporteCabeceraSerie.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCabeceraSerie.add(this.jLabelColumnasSelectReporteCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCabeceraSerie = new JList<Reporte>();
		this.jListColumnasSelectReporteCabeceraSerie.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCabeceraSerie.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCabeceraSerie.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCabeceraSerie.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCabeceraSerie.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCabeceraSerie=new JScrollPane(this.jListColumnasSelectReporteCabeceraSerie);
			
			this.jScrollColumnasSelectReporteCabeceraSerie.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCabeceraSerie.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCabeceraSerie.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCabeceraSerie.add(this.jListColumnasSelectReporteCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		this.jPanelReporteDinamicoCabeceraSerie.add(this.jScrollColumnasSelectReporteCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCabeceraSerie = new JLabelMe();

		this.jLabelRelacionesSelectReporteCabeceraSerie.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCabeceraSerie = new JList<Reporte>();
		this.jListRelacionesSelectReporteCabeceraSerie.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCabeceraSerie.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCabeceraSerie.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCabeceraSerie.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCabeceraSerie.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCabeceraSerie=new JScrollPane(this.jListRelacionesSelectReporteCabeceraSerie);
			
			this.jScrollRelacionesSelectReporteCabeceraSerie.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCabeceraSerie.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCabeceraSerie.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCabeceraSerie = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCabeceraSerie = new JComboBoxMe();
		this.jListColumnasValoresGraficoCabeceraSerie = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCabeceraSerie = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCabeceraSerie.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCabeceraSerie.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCabeceraSerie.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCabeceraSerie.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCabeceraSerie = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCabeceraSerie.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCabeceraSerie.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCabeceraSerie.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCabeceraSerie.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCabeceraSerie = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCabeceraSerie.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCabeceraSerie.add(this.jLabelGenerarExcelReporteDinamicoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCabeceraSerie = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCabeceraSerie.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCabeceraSerie,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCabeceraSerie.setToolTipText("Generar EXCEL"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		//this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCabeceraSerie.add(this.jButtonGenerarExcelReporteDinamicoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCabeceraSerie.add(this.jComboBoxTiposReportesDinamicoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCabeceraSerie = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCabeceraSerie.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCabeceraSerie.add(this.jLabelTiposArchivoReporteDinamicoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCabeceraSerie.add(this.jComboBoxTiposArchivosReportesDinamicoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCabeceraSerie = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCabeceraSerie.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCabeceraSerie,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCabeceraSerie.setToolTipText("Generar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCabeceraSerie.add(this.jButtonGenerarReporteDinamicoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCabeceraSerie = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCabeceraSerie.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCabeceraSerie,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCabeceraSerie.setToolTipText("Cancelar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCabeceraSerie.add(this.jButtonCerrarReporteDinamicoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCabeceraSerie = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCabeceraSerie= new JScrollPane(jPanelReporteDinamicoCabeceraSerie,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCabeceraSerie.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCabeceraSerie.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCabeceraSerie.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cabecera Seriees"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCabeceraSerie.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCabeceraSerie.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCabeceraSerie.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCabeceraSerie);
		this.jInternalFrameReporteDinamicoCabeceraSerie.getContentPane().add(this.jScrollPanelReporteDinamicoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCabeceraSerie() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCabeceraSerie = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCabeceraSerie.setName("jPanelImportacionCabeceraSerie"); 
		
		this.jPanelImportacionCabeceraSerie.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCabeceraSerie.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCabeceraSerie.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCabeceraSerie.setLayout(gridaBagLayoutImportacionCabeceraSerie);
		
		
		this.jInternalFrameImportacionCabeceraSerie= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCabeceraSerie= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCabeceraSerie = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCabeceraSerie= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCabeceraSerie.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCabeceraSerie.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCabeceraSerie.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCabeceraSerie.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCabeceraSerie.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCabeceraSerie.setResizable(true);
	    this.jInternalFrameImportacionCabeceraSerie.setClosable(true);
	    this.jInternalFrameImportacionCabeceraSerie.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCabeceraSerie.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCabeceraSerie.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCabeceraSerie.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCabeceraSerie.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCabeceraSerie.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCabeceraSerie.setResizable(true);
	    this.jInternalFrameImportacionCabeceraSerie.setClosable(true);
	    this.jInternalFrameImportacionCabeceraSerie.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCabeceraSerie.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCabeceraSerie.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCabeceraSerie.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cabecera Seriees"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCabeceraSerie = new JLabelMe();

		this.jLabelArchivoImportacionCabeceraSerie.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYImportacion;		
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCabeceraSerie.add(this.jLabelArchivoImportacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCabeceraSerie = new JFileChooser();		
		this.jFileChooserImportacionCabeceraSerie.setToolTipText("ESCOGER ARCHIVO"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCabeceraSerie = new JButtonMe();
		this.jButtonAbrirImportacionCabeceraSerie.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCabeceraSerie,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCabeceraSerie.setToolTipText("Generar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYImportacion;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCabeceraSerie.add(this.jButtonAbrirImportacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCabeceraSerie = new JLabelMe();

		this.jLabelPathArchivoImportacionCabeceraSerie.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYImportacion;		
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCabeceraSerie.add(this.jLabelPathArchivoImportacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCabeceraSerie=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCabeceraSerie.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCabeceraSerie.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCabeceraSerie.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYImportacion;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCabeceraSerie.add(this.jTextFieldPathArchivoImportacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCabeceraSerie = new JButtonMe();
		this.jButtonGenerarImportacionCabeceraSerie.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCabeceraSerie,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCabeceraSerie.setToolTipText("Generar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYImportacion;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCabeceraSerie.add(this.jButtonGenerarImportacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCabeceraSerie = new JButtonMe();
		this.jButtonCerrarImportacionCabeceraSerie.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCabeceraSerie,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCabeceraSerie.setToolTipText("Cancelar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = iPosYImportacion;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCabeceraSerie.add(this.jButtonCerrarImportacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCabeceraSerie = new GridBagLayout();
		
		this.jScrollPanelImportacionCabeceraSerie= new JScrollPane(jPanelImportacionCabeceraSerie,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy =iPosYImportacion;
		this.gridBagConstraintsCabeceraSerie.gridx =iPosXImportacion;
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCabeceraSerie.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCabeceraSerie.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCabeceraSerie);
		this.jInternalFrameImportacionCabeceraSerie.getContentPane().add(this.jScrollPanelImportacionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCabeceraSerie(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCabeceraSerie = new JButtonMe();
			this.jButtonAbrirOrderByCabeceraSerie.setText("Orden");
			this.jButtonAbrirOrderByCabeceraSerie.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCabeceraSerie,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCabeceraSerie";
			inputMap = this.jButtonAbrirOrderByCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCabeceraSerie"));
		
		
			GridBagLayout gridaBagLayoutOrderByCabeceraSerie = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCabeceraSerie.setName("jPanelOrderByCabeceraSerie"); 
			
			this.jPanelOrderByCabeceraSerie.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCabeceraSerie.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCabeceraSerie.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCabeceraSerie.setLayout(gridaBagLayoutOrderByCabeceraSerie);
			
			
			this.jTableDatosCabeceraSerieOrderBy = new JTableMe();        
			this.jTableDatosCabeceraSerieOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCabeceraSerieOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCabeceraSerieOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCabeceraSerieOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCabeceraSerieOrderBy.setViewportView(this.jTableDatosCabeceraSerieOrderBy);
			this.jTableDatosCabeceraSerieOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCabeceraSerieOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCabeceraSerie= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCabeceraSerie= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCabeceraSerie = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCabeceraSerie= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCabeceraSerie.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCabeceraSerie.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCabeceraSerie.setTitle("Orden");
			this.jInternalFrameOrderByCabeceraSerie.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCabeceraSerie.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCabeceraSerie.setResizable(true);
			this.jInternalFrameOrderByCabeceraSerie.setClosable(true);
			this.jInternalFrameOrderByCabeceraSerie.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCabeceraSerie.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCabeceraSerie.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCabeceraSerie.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cabecera Seriees"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCabeceraSerie.gridx =iPosXOrderBy;
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCabeceraSerie.ipady =150;
				
			this.jPanelOrderByCabeceraSerie.add(jScrollPanelDatosCabeceraSerieOrderBy, this.gridBagConstraintsCabeceraSerie);//this.jTableDatosCabeceraSerieTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCabeceraSerie = new JButtonMe();
			this.jButtonCerrarOrderByCabeceraSerie.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCabeceraSerie,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCabeceraSerie.setToolTipText("Cancelar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCabeceraSerie.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCabeceraSerie.add(this.jButtonCerrarOrderByCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCabeceraSerie = new GridBagLayout();
			
			this.jScrollPanelOrderByCabeceraSerie= new JScrollPane(jPanelOrderByCabeceraSerie,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy =iPosYOrderBy;
			this.gridBagConstraintsCabeceraSerie.gridx =iPosXOrderBy;
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCabeceraSerie.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCabeceraSerie.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCabeceraSerie);
			
			this.jInternalFrameOrderByCabeceraSerie.getContentPane().add(this.jScrollPanelOrderByCabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
		
		} else {
			this.jButtonAbrirOrderByCabeceraSerie = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cabeceraserieSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCabeceraSerie.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCabeceraSerie.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCabeceraSerie.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCabeceraSerie.getRowHeight();//CabeceraSerieConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CabeceraSerieConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCabeceraSerie.isSelected()) {
					iHeightTable=CabeceraSerieConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CabeceraSerieConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CabeceraSerieConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CabeceraSerieConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCabeceraSerie.isSelected()) {
					iHeightTable=CabeceraSerieConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CabeceraSerieConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CabeceraSerieConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCabeceraSerie.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCabeceraSerie.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCabeceraSerie.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCabeceraSerie.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCabeceraSerie.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCabeceraSerie.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCabeceraSerie!=null && this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy()!=null) {
			//if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCabeceraSerie.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCabeceraSerie.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCabeceraSerie.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCabeceraSerie.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCabeceraSerie.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCabeceraSerie.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cabeceraserieLogic.getCabeceraSeries().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cabeceraseries.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CabeceraSerie> TraerCabeceraSerieBeans(List<CabeceraSerie> cabeceraseries,ArrayList<Classe> classes)throws Exception {
		try {
			for(CabeceraSerie cabeceraserie:cabeceraseries) {
					
				if(!(CabeceraSerieConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CabeceraSerieConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cabeceraserie.setsDetalleGeneralEntityReporte(CabeceraSerieConstantesFunciones.getCabeceraSerieDescripcion(cabeceraserie));
										
					cabeceraserie.setcon_formula_descripcion(CabeceraSerieConstantesFunciones.getcon_formulaDescripcion(cabeceraserie));cabeceraserie.setcon_totalizar_descripcion(CabeceraSerieConstantesFunciones.getcon_totalizarDescripcion(cabeceraserie));	
					
						
					
				} else  {
							
					//cabeceraserie.setsDetalleGeneralEntityReporte(cabeceraserie.getsDetalleGeneralEntityReporte());
										
				}
				
				//cabeceraseriebeans.add(cabeceraseriebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cabeceraseries;
    }
	//PARA REPORTES FIN
}
