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



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.seguridad.util.TipoVisualConstantesFunciones;

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
public class TipoVisualJInternalFrame extends TipoVisualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoVisual;
	
	protected JMenuBar jmenuBarTipoVisual;
	
	protected JMenu jmenuTipoVisual;
	protected JMenu jmenuDatosTipoVisual;
	protected JMenu jmenuArchivoTipoVisual;
	protected JMenu jmenuAccionesTipoVisual;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVisual;	
	protected GridBagConstraints gridBagConstraintsTipoVisual;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoVisualDetalleFormJInternalFrame jInternalFrameDetalleFormTipoVisual;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoVisual;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoVisual;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoVisualSessionBean tipovisualSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoVisual> tipovisuals;		
	public List<TipoVisual> tipovisualsEliminados;	
	public List<TipoVisual> tipovisualsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoVisual;		
	protected JButton jButtonAbrirOrderByTipoVisual;
	
	
	//protected JPanel jPanelOrderByTipoVisual;
	//public JScrollPane jScrollPanelOrderByTipoVisual;	
	//protected JButton jButtonCerrarOrderByTipoVisual;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoVisualLogic tipovisualLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoVisual;
	public JScrollPane jScrollPanelDatosEdicionTipoVisual;
	public JScrollPane jScrollPanelDatosGeneralTipoVisual;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoVisualOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoVisual;
	//public JScrollPane jScrollPanelImportacionTipoVisual;
	
	
	
	protected JPanel jPanelAccionesTipoVisual;
	
    protected JPanel jPanelPaginacionTipoVisual;
    protected JPanel jPanelParametrosReportesTipoVisual;
	protected JPanel jPanelParametrosReportesAccionesTipoVisual;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoVisual;
	protected JPanel jPanelParametrosAuxiliar2TipoVisual;
	protected JPanel jPanelParametrosAuxiliar3TipoVisual;
	protected JPanel jPanelParametrosAuxiliar4TipoVisual;
	//protected JPanel jPanelParametrosAuxiliar5TipoVisual;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoVisual;
	//protected JPanel jPanelImportacionTipoVisual;
	
	
	public JTable jTableDatosTipoVisual;
	
	
	
	//public JTable jTableDatosTipoVisualOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoVisual;
	protected JButton jButtonDuplicarTipoVisual;
	protected JButton jButtonCopiarTipoVisual;
	protected JButton jButtonVerFormTipoVisual;
	protected JButton jButtonNuevoRelacionesTipoVisual;
	protected JButton jButtonModificarTipoVisual;
	
    protected JButton jButtonGuardarCambiosTablaTipoVisual;
	protected JButton jButtonCerrarTipoVisual;
	
	
	protected JButton jButtonRecargarInformacionTipoVisual;
	protected JButton jButtonProcesarInformacionTipoVisual;
	
	
	protected JButton jButtonAnterioresTipoVisual;
	protected JButton jButtonSiguientesTipoVisual;
	protected JButton jButtonNuevoGuardarCambiosTipoVisual;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoVisual;
	//protected JButton jButtonCerrarReporteDinamicoTipoVisual;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoVisual;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoVisual;
	//protected JButton jButtonGenerarImportacionTipoVisual;
	//protected JButton jButtonCerrarImportacionTipoVisual;
	//protected JFileChooser jFileChooserImportacionTipoVisual;
	//protected File fileImportacionTipoVisual;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVisual;
	protected JButton jButtonDuplicarToolBarTipoVisual;
	protected JButton jButtonNuevoRelacionesToolBarTipoVisual;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoVisual;
	protected JButton jButtonCopiarToolBarTipoVisual;
	protected JButton jButtonVerFormToolBarTipoVisual;
	public JButton jButtonGuardarCambiosTablaToolBarTipoVisual;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVisual;
	protected JButton jButtonCerrarToolBarTipoVisual;
	
	protected JButton jButtonRecargarInformacionToolBarTipoVisual;
	protected JButton jButtonProcesarInformacionToolBarTipoVisual;
	protected JButton jButtonAnterioresToolBarTipoVisual;
	protected JButton jButtonSiguientesToolBarTipoVisual;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoVisual;
	protected JButton jButtonAbrirOrderByToolBarTipoVisual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVisual;
	protected JMenuItem jMenuItemDuplicarTipoVisual;
	protected JMenuItem jMenuItemNuevoRelacionesTipoVisual;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoVisual;
	protected JMenuItem jMenuItemCopiarTipoVisual;
	protected JMenuItem jMenuItemVerFormTipoVisual;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVisual;
	protected JMenuItem jMenuItemCerrarTipoVisual;
	protected JMenuItem jMenuItemDetalleCerrarTipoVisual;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoVisual;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVisual;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoVisual;
	protected JMenuItem jMenuItemProcesarInformacionTipoVisual;
	protected JMenuItem jMenuItemAnterioresTipoVisual;
	protected JMenuItem jMenuItemSiguientesTipoVisual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVisual;
	protected JMenuItem jMenuItemAbrirOrderByTipoVisual;
	protected JMenuItem jMenuItemMostrarOcultarTipoVisual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVisual;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoVisual;
	protected JCheckBox jCheckBoxSeleccionadosTipoVisual;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoVisual;
	protected JCheckBox jCheckBoxConGraficoReporteTipoVisual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoVisual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoVisual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVisual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoVisual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoVisual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoVisual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVisual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVisual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoVisual;
	protected JTextField jTextFieldValorCampoGeneralTipoVisual;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoVisual;
	//public JList<Reporte> jListColumnasSelectReporteTipoVisual;
	//public JScrollPane jScrollColumnasSelectReporteTipoVisual;
	
	//public JLabel jLabelRelacionesSelectReporteTipoVisual;
	//public JList<Reporte> jListRelacionesSelectReporteTipoVisual;
	//public JScrollPane jScrollRelacionesSelectReporteTipoVisual;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoVisual;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoVisual;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoVisual;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoVisual;
	
		
	//public JLabel jLabelArchivoImportacionTipoVisual;	
	//public JLabel jLabelPathArchivoImportacionTipoVisual;
	//protected JTextField jTextFieldPathArchivoImportacionTipoVisual;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoVisual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoVisual;
	
	//public JLabel jLabelColumnaCategoriaValorTipoVisual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoVisual;
	
	//public JLabel jLabelColumnasValoresGraficoTipoVisual;
	//public JList<Reporte> jListColumnasValoresGraficoTipoVisual;
	//public JScrollPane jScrollColumnasValoresGraficoTipoVisual;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoVisual;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoVisual;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoVisual;
	public JPanel jPanelBusquedaPorNombreTipoVisual;
	public JButton jButtonBusquedaPorNombreTipoVisual;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoVisual;
	public JLabel jLabelnombreBusquedaPorNombreTipoVisual;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoVisual;
	public JButton jButtonnombreBusquedaPorNombreTipoVisualBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoVisualJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVisualJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVisualJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVisualJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoVisual)	{
		this.jButtonRecargarInformacionTipoVisual = jButtonRecargarInformacionTipoVisual;
	}
	
	public JButton getjButtonProcesarInformacionTipoVisual() {
		return this.jButtonProcesarInformacionTipoVisual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVisual)	{
		this.jButtonProcesarInformacionTipoVisual = jButtonProcesarInformacionTipoVisual;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoVisual() {
		return this.jButtonRecargarInformacionTipoVisual;
	}
	
	
	public List<TipoVisual> gettipovisuals() {
		return this.tipovisuals;
	}

	public void settipovisuals(List<TipoVisual> tipovisuals) {
		this.tipovisuals = tipovisuals;
	}
	
	public List<TipoVisual> gettipovisualsAux() {
		return this.tipovisualsAux;
	}

	public void settipovisualsAux(List<TipoVisual> tipovisualsAux) {
		this.tipovisualsAux = tipovisualsAux;
	}
	
	public List<TipoVisual> gettipovisualsEliminados() {
		return this.tipovisualsEliminados;
	}

	public void setTipoVisualsEliminados(List<TipoVisual> tipovisualsEliminados) {
		this.tipovisualsEliminados = tipovisualsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoVisual() {
		return jComboBoxTiposSeleccionarTipoVisual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoVisual(
			JComboBox jComboBoxTiposSeleccionarTipoVisual) {
		this.jComboBoxTiposSeleccionarTipoVisual = jComboBoxTiposSeleccionarTipoVisual;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoVisual .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoVisual() {
		return jTextFieldValorCampoGeneralTipoVisual;
	}

	public void setjTextFieldValorCampoGeneralTipoVisual(
			JTextField jTextFieldValorCampoGeneralTipoVisual) {
		this.jTextFieldValorCampoGeneralTipoVisual = jTextFieldValorCampoGeneralTipoVisual;
	}

	public void setBorderResaltarValorCampoGeneralTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoVisual .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoVisual() {
		return this.jCheckBoxSeleccionarTodosTipoVisual;
	}

	public void setjCheckBoxSeleccionarTodosTipoVisual(
			JCheckBox jCheckBoxSeleccionarTodosTipoVisual) {
		this.jCheckBoxSeleccionarTodosTipoVisual = jCheckBoxSeleccionarTodosTipoVisual;
	}

	public void setBorderResaltarSeleccionarTodosTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoVisual .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoVisual() {
		return this.jCheckBoxSeleccionadosTipoVisual;
	}

	public void setjCheckBoxSeleccionadosTipoVisual(
			JCheckBox jCheckBoxSeleccionadosTipoVisual) {
		this.jCheckBoxSeleccionadosTipoVisual = jCheckBoxSeleccionadosTipoVisual;
	}
	
	public void setBorderResaltarSeleccionadosTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoVisual .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoVisual() {
		return this.jComboBoxTiposArchivosReportesTipoVisual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoVisual(
			JComboBox jComboBoxTiposArchivosReportesTipoVisual) {
		this.jComboBoxTiposArchivosReportesTipoVisual = jComboBoxTiposArchivosReportesTipoVisual;
	}

	public void setBorderResaltarTiposArchivosReportesTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoVisual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoVisual() {
		return this.jComboBoxTiposReportesTipoVisual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoVisual(
			JComboBox jComboBoxTiposReportesTipoVisual) {
		this.jComboBoxTiposReportesTipoVisual = jComboBoxTiposReportesTipoVisual;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoVisual() {
	//	return jComboBoxTiposReportesDinamicoTipoVisual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoVisual(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoVisual) {
	//	this.jComboBoxTiposReportesDinamicoTipoVisual = jComboBoxTiposReportesDinamicoTipoVisual;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoVisual() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoVisual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoVisual(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVisual) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoVisual = jComboBoxTiposArchivosReportesDinamicoTipoVisual;
	//}
	
	public void setBorderResaltarTiposReportesTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoVisual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoVisual() {
		return this.jComboBoxTiposGraficosReportesTipoVisual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoVisual(
			JComboBox jComboBoxTiposGraficosReportesTipoVisual) {
		this.jComboBoxTiposGraficosReportesTipoVisual = jComboBoxTiposGraficosReportesTipoVisual;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoVisual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoVisual() {
		return this.jComboBoxTiposPaginacionTipoVisual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoVisual(
			JComboBox jComboBoxTiposPaginacionTipoVisual) {
		this.jComboBoxTiposPaginacionTipoVisual = jComboBoxTiposPaginacionTipoVisual;
	}
	
	public void setBorderResaltarTiposPaginacionTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoVisual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoVisual() {
		return this.jComboBoxTiposRelacionesTipoVisual;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVisual() {
		return this.jComboBoxTiposAccionesTipoVisual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVisual(
			JComboBox jComboBoxTiposRelacionesTipoVisual) {
		this.jComboBoxTiposRelacionesTipoVisual = jComboBoxTiposRelacionesTipoVisual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVisual(
			JComboBox jComboBoxTiposAccionesTipoVisual) {
		this.jComboBoxTiposAccionesTipoVisual = jComboBoxTiposAccionesTipoVisual;
	}
	
	public void setBorderResaltarTiposRelacionesTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoVisual .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoVisual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVisual.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoVisual .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoVisual() {
	//	return jCheckBoxConGraficoDinamicoTipoVisual;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoVisual(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoVisual) {
	//	this.jCheckBoxConGraficoDinamicoTipoVisual = jCheckBoxConGraficoDinamicoTipoVisual;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoVisual() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoVisual.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoVisual .setBorder(borderResaltar);		
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
		this.tipovisualSessionBean=new TipoVisualSessionBean();
		
		this.tipovisualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovisualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovisualSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoVisualJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoVisualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoVisualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoVisualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoVisualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Visual MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoVisualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoVisual= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"nuevo","nuevo","Nuevo"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"duplicar","duplicar","Duplicar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"copiar","copiar","Copiar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"ver_form","ver_form","Ver"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"recargar","recargar","Recargar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoVisual,this.jTtoolBarTipoVisual,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoVisual,this.jTtoolBarTipoVisual,
							"cerrar","cerrar","Salir"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoVisual=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoVisual;
			
				this.jButtonProcesarInformacionToolBarTipoVisual=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoVisual;
				
		//protected JButton jButtonModificarToolBarTipoVisual;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoVisual=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoVisual=new JMenuMe("General");
		this.jmenuArchivoTipoVisual=new JMenuMe("Archivo");
		this.jmenuAccionesTipoVisual=new JMenuMe("Acciones");
		this.jmenuDatosTipoVisual=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVisual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVisual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVisual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoVisual= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoVisual.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoVisual,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoVisual= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoVisual.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoVisual,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoVisual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVisual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVisual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoVisual= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoVisual.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoVisual,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoVisual= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoVisual.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoVisual,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoVisual= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoVisual.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoVisual,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVisual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVisual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVisual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoVisual= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoVisual.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoVisual,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoVisual= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoVisual.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoVisual,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoVisual= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoVisual.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoVisual,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoVisual= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoVisual.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoVisual,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoVisual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoVisual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoVisual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVisual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVisual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVisual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoVisual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoVisual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoVisual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVisual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVisual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVisual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoVisual= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoVisual.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoVisual,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoVisual.add(this.jMenuItemCerrarTipoVisual);
			
			this.jmenuAccionesTipoVisual.add(this.jMenuItemNuevoTipoVisual);
			this.jmenuAccionesTipoVisual.add(this.jMenuItemNuevoGuardarCambiosTipoVisual);
			this.jmenuAccionesTipoVisual.add(this.jMenuItemNuevoRelacionesTipoVisual);
			this.jmenuAccionesTipoVisual.add(this.jMenuItemGuardarCambiosTablaTipoVisual);		
			this.jmenuAccionesTipoVisual.add(this.jMenuItemDuplicarTipoVisual);		
			this.jmenuAccionesTipoVisual.add(this.jMenuItemCopiarTipoVisual);		
			this.jmenuAccionesTipoVisual.add(this.jMenuItemVerFormTipoVisual);		
			
			this.jmenuDatosTipoVisual.add(this.jMenuItemRecargarInformacionTipoVisual);				
			this.jmenuDatosTipoVisual.add(this.jMenuItemAnterioresTipoVisual);				
			this.jmenuDatosTipoVisual.add(this.jMenuItemSiguientesTipoVisual);				
			this.jmenuDatosTipoVisual.add(this.jMenuItemAbrirOrderByTipoVisual);				
			this.jmenuDatosTipoVisual.add(this.jMenuItemMostrarOcultarTipoVisual);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoVisual.add(this.jMenuItemGuardarCambiosTipoVisual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoVisual.add(this.jmenuArchivoTipoVisual);		
			this.jmenuBarTipoVisual.add(this.jmenuAccionesTipoVisual);		
			this.jmenuBarTipoVisual.add(this.jmenuDatosTipoVisual);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoVisual);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoVisual() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoVisual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoVisual.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoVisual= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoVisual.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoVisual.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoVisual,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoVisual = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoVisual.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoVisual.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoVisual,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoVisual= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoVisual,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoVisual=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoVisual.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoVisual.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoVisual.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoVisual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoVisual,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoVisual = new TipoVisualDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Visual DATOS");
			this.jInternalFrameDetalleFormTipoVisual = new TipoVisualDetalleFormJInternalFrame(jDesktopPane,this.tipovisualSessionBean.getConGuardarRelaciones(),this.tipovisualSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoVisual = null;//new TipoVisualDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVisual= new GridBagLayout();
		
		
		this.jTableDatosTipoVisual = new JTableMe();      
		
		String sToolTipTipoVisual="";
		sToolTipTipoVisual=TipoVisualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVisual+="(Seguridad.TipoVisual)";
		}
		
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVisual+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoVisual.setToolTipText(sToolTipTipoVisual);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoVisual);
		this.jTableDatosTipoVisual.setAutoCreateRowSorter(true);
		this.jTableDatosTipoVisual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoVisual.setRowSelectionAllowed(true);
		this.jTableDatosTipoVisual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoVisual,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoVisual = new JButtonMe();
		this.jButtonDuplicarTipoVisual = new JButtonMe();
		this.jButtonCopiarTipoVisual = new JButtonMe();
		this.jButtonVerFormTipoVisual = new JButtonMe();
		this.jButtonNuevoRelacionesTipoVisual = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoVisual = new JButtonMe();
		this.jButtonCerrarTipoVisual = new JButtonMe();
		
		this.jScrollPanelDatosTipoVisual = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoVisual = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Visual";
		
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVisual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVisual.setToolTipText("Acciones");
        this.jPanelAccionesTipoVisual.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoVisual=new ReporteDinamicoJInternalFrame(TipoVisualConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoVisual();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoVisual=new ImportacionJInternalFrame(TipoVisualConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoVisual();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoVisual = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoVisual.setText("Orden");
		this.jButtonAbrirOrderByTipoVisual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVisual,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVisual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVisual,false,this);
			
			//this.cargarOrderByTipoVisual(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVisual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVisual,true,this);
			
			//this.cargarOrderByTipoVisual(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoVisual.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVisual.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVisual.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoVisual.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVisual.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVisual.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoVisual.setText("Nuevo");
		this.jButtonDuplicarTipoVisual.setText("Duplicar");
		this.jButtonCopiarTipoVisual.setText("Copiar");
		this.jButtonVerFormTipoVisual.setText("Ver");
		this.jButtonNuevoRelacionesTipoVisual.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoVisual.setText("Guardar");
		this.jButtonCerrarTipoVisual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVisual,"nuevo_button","Nuevo",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoVisual,"duplicar_button","Duplicar",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoVisual,"copiar_button","Copiar",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoVisual,"ver_form","Ver",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoVisual,"nuevorelaciones_button","Nuevo Rel",this.tipovisualSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVisual,"guardarcambiostabla_button","Guardar",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVisual,"cerrar_button","Salir",this.tipovisualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoVisual.setToolTipText("Nuevo"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoVisual.setToolTipText("Duplicar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoVisual.setToolTipText("Copiar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoVisual.setToolTipText("Ver"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoVisual.setToolTipText("Nuevo Rel"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoVisual.setToolTipText("Guardar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVisual.setToolTipText("Salir"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVisual";
		inputMap = this.jButtonNuevoTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVisual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVisual"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoVisual";
		inputMap = this.jButtonDuplicarTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoVisual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoVisual"));
		
		//COPIAR
		sMapKey = "CopiarTipoVisual";
		inputMap = this.jButtonCopiarTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoVisual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoVisual"));
		
		//VEr FORM
		sMapKey = "VerFormTipoVisual";
		inputMap = this.jButtonVerFormTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoVisual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoVisual"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoVisual";
		inputMap = this.jButtonNuevoRelacionesTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoVisual"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoVisual";
		inputMap = this.jButtonModificarTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoVisual"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoVisual";
		inputMap = this.jButtonCerrarTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVisual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVisual";
		inputMap = this.jButtonGuardarCambiosTablaTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVisual"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoVisual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoVisual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoVisual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoVisual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoVisual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoVisual.setName("jPanelParametrosReportesTipoVisual"); 
		
		this.jPanelParametrosReportesAccionesTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoVisual.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoVisual.setName("jPanelParametrosReportesAccionesTipoVisual"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoVisual = new JButtonMe();
		this.jButtonRecargarInformacionTipoVisual.setText("Recargar");
		this.jButtonRecargarInformacionTipoVisual.setToolTipText("Recargar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoVisual,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoVisual = new JButtonMe();
		this.jButtonProcesarInformacionTipoVisual.setText("Procesar");
		this.jButtonProcesarInformacionTipoVisual.setToolTipText("Procesar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoVisual.setVisible(false);
			
		this.jButtonProcesarInformacionTipoVisual.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVisual.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVisual.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVisual.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoVisual.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVisual.setText("TIPO");       
		this.jComboBoxTiposReportesTipoVisual.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVisual.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoVisual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoVisual.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoVisual.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoVisual.setText("Accion");
		this.jComboBoxTiposRelacionesTipoVisual.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVisual.setText("Accion");
		this.jComboBoxTiposAccionesTipoVisual.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoVisual.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoVisual.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoVisual=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoVisual.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVisual.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVisual.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoVisual = new JLabelMe();
		
		this.jLabelAccionesTipoVisual.setText("Acciones");		
		this.jLabelAccionesTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoVisual = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoVisual.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoVisual.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoVisual = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoVisual.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoVisual.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoVisual = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoVisual.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoVisual.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoVisual = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoVisual.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoVisual.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoVisual = new JButtonMe();
		//this.jButtonAnterioresTipoVisual.setText("<<");
        this.jButtonAnterioresTipoVisual.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoVisual,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoVisual = new JButtonMe();
		//this.jButtonSiguientesTipoVisual.setText(">>");
        this.jButtonSiguientesTipoVisual.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoVisual,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoVisual = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoVisual.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoVisual.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoVisual,"nuevoguardarcambios_button","Nue",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoVisual";
		inputMap = this.jButtonNuevoGuardarCambiosTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoVisual"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoVisual";
		inputMap = this.jButtonRecargarInformacionTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoVisual"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoVisual";
		inputMap = this.jButtonSiguientesTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoVisual"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoVisual";
		inputMap = this.jButtonAnterioresTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoVisual"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoVisual();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoVisual.setMinimumSize(new Dimension(this.getWidth(),TipoVisualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVisualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVisual.setMaximumSize(new Dimension(this.getWidth(),TipoVisualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVisualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVisual.setPreferredSize(new Dimension(this.getWidth(),TipoVisualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVisualBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoVisual = new GridBagLayout();

			this.jPanelPaginacionTipoVisual.setLayout(gridaBagLayoutPaginacionTipoVisual);						
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = 0;
			this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoVisual.add(this.jButtonAnterioresTipoVisual, this.gridBagConstraintsTipoVisual);
					
						
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVisual.gridy = 0;
			
			this.jPanelPaginacionTipoVisual.add(this.jButtonNuevoGuardarCambiosTipoVisual, this.gridBagConstraintsTipoVisual);
						
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVisual.gridy = 0;
			this.jPanelPaginacionTipoVisual.add(this.jButtonSiguientesTipoVisual, this.gridBagConstraintsTipoVisual);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = 1;
			this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVisual.add(this.jButtonNuevoTipoVisual, this.gridBagConstraintsTipoVisual);
						
			
			
			if(!this.tipovisualSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoVisual = new GridBagConstraints();
				this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoVisual.gridy = 1;
				this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoVisual.add(this.jButtonGuardarCambiosTablaTipoVisual, this.gridBagConstraintsTipoVisual);
			}
			
			
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = 1;
			this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVisual.add(this.jButtonDuplicarTipoVisual, this.gridBagConstraintsTipoVisual);
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = 1;
			this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVisual.add(this.jButtonCopiarTipoVisual, this.gridBagConstraintsTipoVisual);
		
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = 1;
			this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVisual.add(this.jButtonVerFormTipoVisual, this.gridBagConstraintsTipoVisual);
		
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = 1;
			this.gridBagConstraintsTipoVisual.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoVisual.add(this.jButtonCerrarTipoVisual, this.gridBagConstraintsTipoVisual);
		
		
		
		this.jButtonRecargarInformacionTipoVisual.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVisual.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVisual.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoVisual.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVisual.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVisual.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoVisual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVisual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVisual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoVisual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVisual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVisual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoVisual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVisual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVisual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoVisual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVisual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVisual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoVisual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVisual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVisual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoVisual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVisual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVisual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoVisual.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVisual.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVisual.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoVisual.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVisual.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVisual.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoVisual.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVisual.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVisual.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoVisual.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVisual.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVisual.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoVisual = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoVisual = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoVisual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoVisual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoVisual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoVisual = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoVisual.setLayout(gridaBagParametrosReportesTipoVisual);
			this.jPanelParametrosReportesAccionesTipoVisual.setLayout(gridaBagParametrosReportesAccionesTipoVisual);
			
			
			this.jPanelParametrosAuxiliar1TipoVisual.setLayout(gridaBagParametrosAuxiliar1TipoVisual);
			this.jPanelParametrosAuxiliar2TipoVisual.setLayout(gridaBagParametrosAuxiliar2TipoVisual);
			this.jPanelParametrosAuxiliar3TipoVisual.setLayout(gridaBagParametrosAuxiliar3TipoVisual);
			this.jPanelParametrosAuxiliar4TipoVisual.setLayout(gridaBagParametrosAuxiliar4TipoVisual);
			//this.jPanelParametrosAuxiliar5TipoVisual.setLayout(gridaBagParametrosAuxiliar2TipoVisual);			
			
			
			
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVisual.add(this.jButtonRecargarInformacionTipoVisual, this.gridBagConstraintsTipoVisual);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVisual.add(this.jComboBoxTiposPaginacionTipoVisual, this.gridBagConstraintsTipoVisual);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVisual.add(this.jCheckBoxConAltoMaximoTablaTipoVisual, this.gridBagConstraintsTipoVisual);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVisual.add(this.jComboBoxTiposArchivosReportesTipoVisual, this.gridBagConstraintsTipoVisual);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVisual.add(this.jPanelParametrosAuxiliar1TipoVisual, this.gridBagConstraintsTipoVisual);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVisual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoVisual.add(this.jComboBoxTiposReportesTipoVisual, this.gridBagConstraintsTipoVisual);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVisual.add(this.jPanelParametrosAuxiliar4TipoVisual, this.gridBagConstraintsTipoVisual);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVisual.add(this.jComboBoxTiposReportesTipoVisual, this.gridBagConstraintsTipoVisual);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVisual.add(this.jCheckBoxGenerarReporteTipoVisual, this.gridBagConstraintsTipoVisual);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVisual.add(this.jPanelParametrosAuxiliar2TipoVisual, this.gridBagConstraintsTipoVisual);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVisual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVisual.add(this.jLabelAccionesTipoVisual, this.gridBagConstraintsTipoVisual);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoVisual = new GridBagConstraints();
				this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoVisual.add(this.jButtonAbrirOrderByTipoVisual, this.gridBagConstraintsTipoVisual);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVisual.add(this.jComboBoxTiposSeleccionarTipoVisual, this.gridBagConstraintsTipoVisual);			
			
			
			/*
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVisual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVisual.add(this.jCheckBoxSeleccionarTodosTipoVisual, this.gridBagConstraintsTipoVisual);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVisual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVisual.add(this.jCheckBoxSeleccionarTodosTipoVisual, this.gridBagConstraintsTipoVisual);															
				
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVisual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVisual.add(this.jCheckBoxSeleccionadosTipoVisual, this.gridBagConstraintsTipoVisual);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVisual.add(this.jPanelParametrosAuxiliar3TipoVisual, this.gridBagConstraintsTipoVisual);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVisual.add(this.jComboBoxTiposRelacionesTipoVisual, this.gridBagConstraintsTipoVisual);
				
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVisual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVisual.add(this.jComboBoxTiposAccionesTipoVisual, this.gridBagConstraintsTipoVisual);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoVisual = new GridBagLayout();

			this.jScrollPanelDatosTipoVisual.setLayout(gridaBagLayoutDatosTipoVisual);
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = 0;
			this.gridBagConstraintsTipoVisual.gridx = 0;
			
			this.jScrollPanelDatosTipoVisual.add(this.jTableDatosTipoVisual, this.gridBagConstraintsTipoVisual);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoVisual.setViewportView(this.jTableDatosTipoVisual);
		this.jTableDatosTipoVisual.setFillsViewportHeight(true);
		this.jTableDatosTipoVisual.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoVisual= new GridBagLayout();
		this.jPanelAccionesTipoVisual.setLayout(gridaBagLayoutAccionesTipoVisual);
		
		
		/*	
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = 0;
		this.gridBagConstraintsTipoVisual.gridx = 0;
			
		this.jPanelAccionesTipoVisual.add(this.jButtonNuevoTipoVisual, this.gridBagConstraintsTipoVisual);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoVisual= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoVisual.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoVisual.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoVisual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoVisual.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoVisual.setLayout(gridaBagLayoutBusquedaPorNombreTipoVisual);

		gridBagConstraintsTipoVisual = new GridBagConstraints();
		gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoVisual.gridy = 0;
		gridBagConstraintsTipoVisual.gridx = 0;
		jPanelBusquedaPorNombreTipoVisual.add(jLabelnombreBusquedaPorNombreTipoVisual, gridBagConstraintsTipoVisual);

		gridBagConstraintsTipoVisual = new GridBagConstraints();
		gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoVisual.gridy = 0;
		gridBagConstraintsTipoVisual.gridx = 1;
		jPanelBusquedaPorNombreTipoVisual.add(jTextAreanombreBusquedaPorNombreTipoVisual, gridBagConstraintsTipoVisual);

		gridBagConstraintsTipoVisual = new GridBagConstraints();
		gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoVisual.gridy = 1;
		gridBagConstraintsTipoVisual.gridx =1;
		jPanelBusquedaPorNombreTipoVisual.add(jButtonBusquedaPorNombreTipoVisual, gridBagConstraintsTipoVisual);

		jTabbedPaneBusquedasTipoVisual.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoVisual);
		jTabbedPaneBusquedasTipoVisual.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVisual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVisual);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();						
			this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVisual.gridx = 0;		
			//this.gridBagConstraintsTipoVisual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVisual.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoVisual, this.gridBagConstraintsTipoVisual);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoVisual.gridx = 0;		
		//this.gridBagConstraintsTipoVisual.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoVisual.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoVisual);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVisual.gridx = 0;		
			this.gridBagConstraintsTipoVisual.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoVisual.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoVisual, this.gridBagConstraintsTipoVisual);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoVisual, this.gridBagConstraintsTipoVisual);								
		
		
		/*
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoVisual, this.gridBagConstraintsTipoVisual);
		*/		
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVisual.gridx =0;
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVisual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVisual, this.gridBagConstraintsTipoVisual);
				
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoVisual, this.gridBagConstraintsTipoVisual);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoVisualJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoVisual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVisual = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoVisual.setLayout(gridaBagLayoutBusquedasParametrosTipoVisual);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoVisual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVisual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVisual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVisual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVisual, this.gridBagConstraintsTipoVisual);
			
			
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVisual, this.gridBagConstraintsTipoVisual);
		
			
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVisual, this.gridBagConstraintsTipoVisual);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoVisual;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoVisual() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoVisual = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoVisual.setName("jPanelReporteDinamicoTipoVisual"); 
		
		this.jPanelReporteDinamicoTipoVisual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVisual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVisual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoVisual.setLayout(gridaBagLayoutReporteDinamicoTipoVisual);
		
		
		this.jInternalFrameReporteDinamicoTipoVisual= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoVisual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVisual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoVisual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoVisual.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoVisual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoVisual.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoVisual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoVisual.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoVisual.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoVisual.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoVisual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVisual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVisual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoVisual = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoVisual.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoVisual.add(this.jLabelColumnasSelectReporteTipoVisual, this.gridBagConstraintsTipoVisual);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoVisual = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoVisual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoVisual.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoVisual.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVisual.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVisual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoVisual=new JScrollPane(this.jListColumnasSelectReporteTipoVisual);
			
			this.jScrollColumnasSelectReporteTipoVisual.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVisual.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVisual.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoVisual.add(this.jListColumnasSelectReporteTipoVisual, this.gridBagConstraintsTipoVisual);
		this.jPanelReporteDinamicoTipoVisual.add(this.jScrollColumnasSelectReporteTipoVisual, this.gridBagConstraintsTipoVisual);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoVisual = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoVisual.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoVisual = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoVisual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoVisual.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoVisual.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVisual.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVisual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoVisual=new JScrollPane(this.jListRelacionesSelectReporteTipoVisual);
			
			this.jScrollRelacionesSelectReporteTipoVisual.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVisual.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVisual.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoVisual = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoVisual = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoVisual = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoVisual = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoVisual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoVisual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVisual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVisual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoVisual = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVisual.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVisual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVisual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVisual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoVisual = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoVisual.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVisual.add(this.jLabelGenerarExcelReporteDinamicoTipoVisual, this.gridBagConstraintsTipoVisual);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoVisual = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoVisual.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoVisual,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoVisual.setToolTipText("Generar EXCEL"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		//this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoVisual.add(this.jButtonGenerarExcelReporteDinamicoTipoVisual, this.gridBagConstraintsTipoVisual);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVisual.add(this.jComboBoxTiposReportesDinamicoTipoVisual, this.gridBagConstraintsTipoVisual);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoVisual = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoVisual.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVisual.add(this.jLabelTiposArchivoReporteDinamicoTipoVisual, this.gridBagConstraintsTipoVisual);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVisual.add(this.jComboBoxTiposArchivosReportesDinamicoTipoVisual, this.gridBagConstraintsTipoVisual);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoVisual = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoVisual.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoVisual,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoVisual.setToolTipText("Generar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVisual.add(this.jButtonGenerarReporteDinamicoTipoVisual, this.gridBagConstraintsTipoVisual);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoVisual = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoVisual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoVisual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoVisual.setToolTipText("Cancelar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVisual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVisual.add(this.jButtonCerrarReporteDinamicoTipoVisual, this.gridBagConstraintsTipoVisual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoVisual = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoVisual= new JScrollPane(jPanelReporteDinamicoTipoVisual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoVisual.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVisual.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVisual.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoVisual.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoVisual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoVisual.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoVisual);
		this.jInternalFrameReporteDinamicoTipoVisual.getContentPane().add(this.jScrollPanelReporteDinamicoTipoVisual, this.gridBagConstraintsTipoVisual);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoVisual() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoVisual = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoVisual.setName("jPanelImportacionTipoVisual"); 
		
		this.jPanelImportacionTipoVisual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVisual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVisual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoVisual.setLayout(gridaBagLayoutImportacionTipoVisual);
		
		
		this.jInternalFrameImportacionTipoVisual= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoVisual= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoVisual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVisual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoVisual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVisual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVisual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoVisual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVisual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVisual.setResizable(true);
	    this.jInternalFrameImportacionTipoVisual.setClosable(true);
	    this.jInternalFrameImportacionTipoVisual.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoVisual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVisual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVisual.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoVisual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVisual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVisual.setResizable(true);
	    this.jInternalFrameImportacionTipoVisual.setClosable(true);
	    this.jInternalFrameImportacionTipoVisual.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoVisual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVisual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVisual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoVisual = new JLabelMe();

		this.jLabelArchivoImportacionTipoVisual.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVisual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVisual.add(this.jLabelArchivoImportacionTipoVisual, this.gridBagConstraintsTipoVisual);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoVisual = new JFileChooser();		
		this.jFileChooserImportacionTipoVisual.setToolTipText("ESCOGER ARCHIVO"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoVisual = new JButtonMe();
		this.jButtonAbrirImportacionTipoVisual.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoVisual,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoVisual.setToolTipText("Generar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVisual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVisual.add(this.jButtonAbrirImportacionTipoVisual, this.gridBagConstraintsTipoVisual);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoVisual = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoVisual.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVisual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVisual.add(this.jLabelPathArchivoImportacionTipoVisual, this.gridBagConstraintsTipoVisual);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoVisual=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoVisual.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVisual.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVisual.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVisual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVisual.add(this.jTextFieldPathArchivoImportacionTipoVisual, this.gridBagConstraintsTipoVisual);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoVisual = new JButtonMe();
		this.jButtonGenerarImportacionTipoVisual.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoVisual,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoVisual.setToolTipText("Generar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVisual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVisual.add(this.jButtonGenerarImportacionTipoVisual, this.gridBagConstraintsTipoVisual);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoVisual = new JButtonMe();
		this.jButtonCerrarImportacionTipoVisual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoVisual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoVisual.setToolTipText("Cancelar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVisual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVisual.add(this.jButtonCerrarImportacionTipoVisual, this.gridBagConstraintsTipoVisual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoVisual = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoVisual= new JScrollPane(jPanelImportacionTipoVisual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoVisual.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoVisual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoVisual.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoVisual);
		this.jInternalFrameImportacionTipoVisual.getContentPane().add(this.jScrollPanelImportacionTipoVisual, this.gridBagConstraintsTipoVisual);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoVisual(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoVisual = new JButtonMe();
			this.jButtonAbrirOrderByTipoVisual.setText("Orden");
			this.jButtonAbrirOrderByTipoVisual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVisual,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoVisual";
			inputMap = this.jButtonAbrirOrderByTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoVisual"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoVisual = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoVisual.setName("jPanelOrderByTipoVisual"); 
			
			this.jPanelOrderByTipoVisual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVisual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVisual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoVisual.setLayout(gridaBagLayoutOrderByTipoVisual);
			
			
			this.jTableDatosTipoVisualOrderBy = new JTableMe();        
			this.jTableDatosTipoVisualOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoVisualOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoVisualOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoVisualOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoVisualOrderBy.setViewportView(this.jTableDatosTipoVisualOrderBy);
			this.jTableDatosTipoVisualOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoVisualOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoVisual= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoVisual= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoVisual = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoVisual= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoVisual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoVisual.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoVisual.setTitle("Orden");
			this.jInternalFrameOrderByTipoVisual.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoVisual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoVisual.setResizable(true);
			this.jInternalFrameOrderByTipoVisual.setClosable(true);
			this.jInternalFrameOrderByTipoVisual.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoVisual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVisual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVisual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoVisual.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoVisual.ipady =150;
				
			this.jPanelOrderByTipoVisual.add(jScrollPanelDatosTipoVisualOrderBy, this.gridBagConstraintsTipoVisual);//this.jTableDatosTipoVisualTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoVisual = new JButtonMe();
			this.jButtonCerrarOrderByTipoVisual.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoVisual,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoVisual.setToolTipText("Cancelar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoVisual.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoVisual.add(this.jButtonCerrarOrderByTipoVisual, this.gridBagConstraintsTipoVisual);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoVisual = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoVisual= new JScrollPane(jPanelOrderByTipoVisual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoVisual.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoVisual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoVisual.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoVisual);
			
			this.jInternalFrameOrderByTipoVisual.getContentPane().add(this.jScrollPanelOrderByTipoVisual, this.gridBagConstraintsTipoVisual);			
		
		} else {
			this.jButtonAbrirOrderByTipoVisual = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipovisualSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoVisual.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoVisual.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoVisual.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoVisual.getRowHeight();//TipoVisualConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoVisualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVisual.isSelected()) {
					iHeightTable=TipoVisualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoVisualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoVisualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoVisualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVisual.isSelected()) {
					iHeightTable=TipoVisualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoVisualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoVisualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoVisual.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVisual.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVisual.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoVisual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVisual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVisual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoVisual!=null && this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy()!=null) {
			//if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoVisual.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoVisual.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoVisual.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoVisual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVisual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVisual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipovisualLogic.getTipoVisuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovisuals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoVisual> TraerTipoVisualBeans(List<TipoVisual> tipovisuals,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoVisual tipovisual:tipovisuals) {
					
				if(!(TipoVisualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoVisualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipovisual.setsDetalleGeneralEntityReporte(TipoVisualConstantesFunciones.getTipoVisualDescripcion(tipovisual));
										
						
					
						
					
				} else  {
							
					//tipovisual.setsDetalleGeneralEntityReporte(tipovisual.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipovisualbeans.add(tipovisualbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipovisuals;
    }
	//PARA REPORTES FIN
}
