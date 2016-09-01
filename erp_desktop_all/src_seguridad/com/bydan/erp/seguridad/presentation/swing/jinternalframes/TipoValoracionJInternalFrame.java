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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.seguridad.util.TipoValoracionConstantesFunciones;

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
public class TipoValoracionJInternalFrame extends TipoValoracionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoValoracion;
	
	protected JMenuBar jmenuBarTipoValoracion;
	
	protected JMenu jmenuTipoValoracion;
	protected JMenu jmenuDatosTipoValoracion;
	protected JMenu jmenuArchivoTipoValoracion;
	protected JMenu jmenuAccionesTipoValoracion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoValoracion;	
	protected GridBagConstraints gridBagConstraintsTipoValoracion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoValoracionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoValoracion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoValoracion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoValoracion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoValoracionSessionBean tipovaloracionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoValoracion> tipovaloracions;		
	public List<TipoValoracion> tipovaloracionsEliminados;	
	public List<TipoValoracion> tipovaloracionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoValoracion;		
	protected JButton jButtonAbrirOrderByTipoValoracion;
	
	
	//protected JPanel jPanelOrderByTipoValoracion;
	//public JScrollPane jScrollPanelOrderByTipoValoracion;	
	//protected JButton jButtonCerrarOrderByTipoValoracion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoValoracionLogic tipovaloracionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoValoracion;
	public JScrollPane jScrollPanelDatosEdicionTipoValoracion;
	public JScrollPane jScrollPanelDatosGeneralTipoValoracion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoValoracionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoValoracion;
	//public JScrollPane jScrollPanelImportacionTipoValoracion;
	
	
	
	protected JPanel jPanelAccionesTipoValoracion;
	
    protected JPanel jPanelPaginacionTipoValoracion;
    protected JPanel jPanelParametrosReportesTipoValoracion;
	protected JPanel jPanelParametrosReportesAccionesTipoValoracion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoValoracion;
	protected JPanel jPanelParametrosAuxiliar2TipoValoracion;
	protected JPanel jPanelParametrosAuxiliar3TipoValoracion;
	protected JPanel jPanelParametrosAuxiliar4TipoValoracion;
	//protected JPanel jPanelParametrosAuxiliar5TipoValoracion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoValoracion;
	//protected JPanel jPanelImportacionTipoValoracion;
	
	
	public JTable jTableDatosTipoValoracion;
	
	
	
	//public JTable jTableDatosTipoValoracionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoValoracion;
	protected JButton jButtonDuplicarTipoValoracion;
	protected JButton jButtonCopiarTipoValoracion;
	protected JButton jButtonVerFormTipoValoracion;
	protected JButton jButtonNuevoRelacionesTipoValoracion;
	protected JButton jButtonModificarTipoValoracion;
	
    protected JButton jButtonGuardarCambiosTablaTipoValoracion;
	protected JButton jButtonCerrarTipoValoracion;
	
	
	protected JButton jButtonRecargarInformacionTipoValoracion;
	protected JButton jButtonProcesarInformacionTipoValoracion;
	
	
	protected JButton jButtonAnterioresTipoValoracion;
	protected JButton jButtonSiguientesTipoValoracion;
	protected JButton jButtonNuevoGuardarCambiosTipoValoracion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoValoracion;
	//protected JButton jButtonCerrarReporteDinamicoTipoValoracion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoValoracion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoValoracion;
	//protected JButton jButtonGenerarImportacionTipoValoracion;
	//protected JButton jButtonCerrarImportacionTipoValoracion;
	//protected JFileChooser jFileChooserImportacionTipoValoracion;
	//protected File fileImportacionTipoValoracion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoValoracion;
	protected JButton jButtonDuplicarToolBarTipoValoracion;
	protected JButton jButtonNuevoRelacionesToolBarTipoValoracion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoValoracion;
	protected JButton jButtonCopiarToolBarTipoValoracion;
	protected JButton jButtonVerFormToolBarTipoValoracion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoValoracion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoValoracion;
	protected JButton jButtonCerrarToolBarTipoValoracion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoValoracion;
	protected JButton jButtonProcesarInformacionToolBarTipoValoracion;
	protected JButton jButtonAnterioresToolBarTipoValoracion;
	protected JButton jButtonSiguientesToolBarTipoValoracion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoValoracion;
	protected JButton jButtonAbrirOrderByToolBarTipoValoracion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoValoracion;
	protected JMenuItem jMenuItemDuplicarTipoValoracion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoValoracion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoValoracion;
	protected JMenuItem jMenuItemCopiarTipoValoracion;
	protected JMenuItem jMenuItemVerFormTipoValoracion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoValoracion;
	protected JMenuItem jMenuItemCerrarTipoValoracion;
	protected JMenuItem jMenuItemDetalleCerrarTipoValoracion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoValoracion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoValoracion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoValoracion;
	protected JMenuItem jMenuItemProcesarInformacionTipoValoracion;
	protected JMenuItem jMenuItemAnterioresTipoValoracion;
	protected JMenuItem jMenuItemSiguientesTipoValoracion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoValoracion;
	protected JMenuItem jMenuItemAbrirOrderByTipoValoracion;
	protected JMenuItem jMenuItemMostrarOcultarTipoValoracion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoValoracion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoValoracion;
	protected JCheckBox jCheckBoxSeleccionadosTipoValoracion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoValoracion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoValoracion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoValoracion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoValoracion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoValoracion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoValoracion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoValoracion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoValoracion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoValoracion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoValoracion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoValoracion;
	protected JTextField jTextFieldValorCampoGeneralTipoValoracion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoValoracion;
	//public JList<Reporte> jListColumnasSelectReporteTipoValoracion;
	//public JScrollPane jScrollColumnasSelectReporteTipoValoracion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoValoracion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoValoracion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoValoracion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoValoracion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoValoracion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoValoracion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoValoracion;
	
		
	//public JLabel jLabelArchivoImportacionTipoValoracion;	
	//public JLabel jLabelPathArchivoImportacionTipoValoracion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoValoracion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoValoracion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoValoracion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoValoracion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoValoracion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoValoracion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoValoracion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoValoracion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoValoracion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoValoracion;	
	
	
	
	
	
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
	public TipoValoracionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValoracionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValoracionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValoracionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoValoracion)	{
		this.jButtonRecargarInformacionTipoValoracion = jButtonRecargarInformacionTipoValoracion;
	}
	
	public JButton getjButtonProcesarInformacionTipoValoracion() {
		return this.jButtonProcesarInformacionTipoValoracion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoValoracion)	{
		this.jButtonProcesarInformacionTipoValoracion = jButtonProcesarInformacionTipoValoracion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoValoracion() {
		return this.jButtonRecargarInformacionTipoValoracion;
	}
	
	
	public List<TipoValoracion> gettipovaloracions() {
		return this.tipovaloracions;
	}

	public void settipovaloracions(List<TipoValoracion> tipovaloracions) {
		this.tipovaloracions = tipovaloracions;
	}
	
	public List<TipoValoracion> gettipovaloracionsAux() {
		return this.tipovaloracionsAux;
	}

	public void settipovaloracionsAux(List<TipoValoracion> tipovaloracionsAux) {
		this.tipovaloracionsAux = tipovaloracionsAux;
	}
	
	public List<TipoValoracion> gettipovaloracionsEliminados() {
		return this.tipovaloracionsEliminados;
	}

	public void setTipoValoracionsEliminados(List<TipoValoracion> tipovaloracionsEliminados) {
		this.tipovaloracionsEliminados = tipovaloracionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoValoracion() {
		return jComboBoxTiposSeleccionarTipoValoracion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoValoracion(
			JComboBox jComboBoxTiposSeleccionarTipoValoracion) {
		this.jComboBoxTiposSeleccionarTipoValoracion = jComboBoxTiposSeleccionarTipoValoracion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoValoracion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoValoracion() {
		return jTextFieldValorCampoGeneralTipoValoracion;
	}

	public void setjTextFieldValorCampoGeneralTipoValoracion(
			JTextField jTextFieldValorCampoGeneralTipoValoracion) {
		this.jTextFieldValorCampoGeneralTipoValoracion = jTextFieldValorCampoGeneralTipoValoracion;
	}

	public void setBorderResaltarValorCampoGeneralTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoValoracion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoValoracion() {
		return this.jCheckBoxSeleccionarTodosTipoValoracion;
	}

	public void setjCheckBoxSeleccionarTodosTipoValoracion(
			JCheckBox jCheckBoxSeleccionarTodosTipoValoracion) {
		this.jCheckBoxSeleccionarTodosTipoValoracion = jCheckBoxSeleccionarTodosTipoValoracion;
	}

	public void setBorderResaltarSeleccionarTodosTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoValoracion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoValoracion() {
		return this.jCheckBoxSeleccionadosTipoValoracion;
	}

	public void setjCheckBoxSeleccionadosTipoValoracion(
			JCheckBox jCheckBoxSeleccionadosTipoValoracion) {
		this.jCheckBoxSeleccionadosTipoValoracion = jCheckBoxSeleccionadosTipoValoracion;
	}
	
	public void setBorderResaltarSeleccionadosTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoValoracion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoValoracion() {
		return this.jComboBoxTiposArchivosReportesTipoValoracion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoValoracion(
			JComboBox jComboBoxTiposArchivosReportesTipoValoracion) {
		this.jComboBoxTiposArchivosReportesTipoValoracion = jComboBoxTiposArchivosReportesTipoValoracion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoValoracion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoValoracion() {
		return this.jComboBoxTiposReportesTipoValoracion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoValoracion(
			JComboBox jComboBoxTiposReportesTipoValoracion) {
		this.jComboBoxTiposReportesTipoValoracion = jComboBoxTiposReportesTipoValoracion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoValoracion() {
	//	return jComboBoxTiposReportesDinamicoTipoValoracion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoValoracion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoValoracion) {
	//	this.jComboBoxTiposReportesDinamicoTipoValoracion = jComboBoxTiposReportesDinamicoTipoValoracion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoValoracion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoValoracion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoValoracion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoValoracion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoValoracion = jComboBoxTiposArchivosReportesDinamicoTipoValoracion;
	//}
	
	public void setBorderResaltarTiposReportesTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoValoracion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoValoracion() {
		return this.jComboBoxTiposGraficosReportesTipoValoracion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoValoracion(
			JComboBox jComboBoxTiposGraficosReportesTipoValoracion) {
		this.jComboBoxTiposGraficosReportesTipoValoracion = jComboBoxTiposGraficosReportesTipoValoracion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoValoracion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoValoracion() {
		return this.jComboBoxTiposPaginacionTipoValoracion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoValoracion(
			JComboBox jComboBoxTiposPaginacionTipoValoracion) {
		this.jComboBoxTiposPaginacionTipoValoracion = jComboBoxTiposPaginacionTipoValoracion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoValoracion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoValoracion() {
		return this.jComboBoxTiposRelacionesTipoValoracion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoValoracion() {
		return this.jComboBoxTiposAccionesTipoValoracion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoValoracion(
			JComboBox jComboBoxTiposRelacionesTipoValoracion) {
		this.jComboBoxTiposRelacionesTipoValoracion = jComboBoxTiposRelacionesTipoValoracion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoValoracion(
			JComboBox jComboBoxTiposAccionesTipoValoracion) {
		this.jComboBoxTiposAccionesTipoValoracion = jComboBoxTiposAccionesTipoValoracion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoValoracion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoValoracion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoValoracion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoValoracion() {
	//	return jCheckBoxConGraficoDinamicoTipoValoracion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoValoracion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoValoracion) {
	//	this.jCheckBoxConGraficoDinamicoTipoValoracion = jCheckBoxConGraficoDinamicoTipoValoracion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoValoracion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoValoracion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoValoracion .setBorder(borderResaltar);		
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
		this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
		
		this.tipovaloracionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovaloracionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovaloracionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoValoracionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Valoracion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoValoracionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoValoracion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"nuevo","nuevo","Nuevo"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"duplicar","duplicar","Duplicar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"copiar","copiar","Copiar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"ver_form","ver_form","Ver"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"recargar","recargar","Recargar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoValoracion,this.jTtoolBarTipoValoracion,
							"cerrar","cerrar","Salir"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoValoracion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoValoracion;
			
				this.jButtonProcesarInformacionToolBarTipoValoracion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoValoracion;
				
		//protected JButton jButtonModificarToolBarTipoValoracion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoValoracion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoValoracion=new JMenuMe("General");
		this.jmenuArchivoTipoValoracion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoValoracion=new JMenuMe("Acciones");
		this.jmenuDatosTipoValoracion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoValoracion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoValoracion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoValoracion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoValoracion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoValoracion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoValoracion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoValoracion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoValoracion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoValoracion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoValoracion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoValoracion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoValoracion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoValoracion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoValoracion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoValoracion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoValoracion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoValoracion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoValoracion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoValoracion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoValoracion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoValoracion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoValoracion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoValoracion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoValoracion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoValoracion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoValoracion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoValoracion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoValoracion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoValoracion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoValoracion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoValoracion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoValoracion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoValoracion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoValoracion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoValoracion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoValoracion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoValoracion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoValoracion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoValoracion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoValoracion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoValoracion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoValoracion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoValoracion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoValoracion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoValoracion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoValoracion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoValoracion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoValoracion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoValoracion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoValoracion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoValoracion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoValoracion.add(this.jMenuItemCerrarTipoValoracion);
			
			this.jmenuAccionesTipoValoracion.add(this.jMenuItemNuevoTipoValoracion);
			this.jmenuAccionesTipoValoracion.add(this.jMenuItemNuevoGuardarCambiosTipoValoracion);
			this.jmenuAccionesTipoValoracion.add(this.jMenuItemNuevoRelacionesTipoValoracion);
			this.jmenuAccionesTipoValoracion.add(this.jMenuItemGuardarCambiosTablaTipoValoracion);		
			this.jmenuAccionesTipoValoracion.add(this.jMenuItemDuplicarTipoValoracion);		
			this.jmenuAccionesTipoValoracion.add(this.jMenuItemCopiarTipoValoracion);		
			this.jmenuAccionesTipoValoracion.add(this.jMenuItemVerFormTipoValoracion);		
			
			this.jmenuDatosTipoValoracion.add(this.jMenuItemRecargarInformacionTipoValoracion);				
			this.jmenuDatosTipoValoracion.add(this.jMenuItemAnterioresTipoValoracion);				
			this.jmenuDatosTipoValoracion.add(this.jMenuItemSiguientesTipoValoracion);				
			this.jmenuDatosTipoValoracion.add(this.jMenuItemAbrirOrderByTipoValoracion);				
			this.jmenuDatosTipoValoracion.add(this.jMenuItemMostrarOcultarTipoValoracion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoValoracion.add(this.jMenuItemGuardarCambiosTipoValoracion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoValoracion.add(this.jmenuArchivoTipoValoracion);		
			this.jmenuBarTipoValoracion.add(this.jmenuAccionesTipoValoracion);		
			this.jmenuBarTipoValoracion.add(this.jmenuDatosTipoValoracion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoValoracion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoValoracion() {
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
			//this.jInternalFrameDetalleTipoValoracion = new TipoValoracionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Valoracion DATOS");
			this.jInternalFrameDetalleFormTipoValoracion = new TipoValoracionDetalleFormJInternalFrame(jDesktopPane,this.tipovaloracionSessionBean.getConGuardarRelaciones(),this.tipovaloracionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoValoracion = null;//new TipoValoracionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoValoracion= new GridBagLayout();
		
		
		this.jTableDatosTipoValoracion = new JTableMe();      
		
		String sToolTipTipoValoracion="";
		sToolTipTipoValoracion=TipoValoracionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoValoracion+="(Seguridad.TipoValoracion)";
		}
		
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoValoracion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoValoracion.setToolTipText(sToolTipTipoValoracion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoValoracion);
		this.jTableDatosTipoValoracion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoValoracion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoValoracion.setRowSelectionAllowed(true);
		this.jTableDatosTipoValoracion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoValoracion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoValoracion = new JButtonMe();
		this.jButtonDuplicarTipoValoracion = new JButtonMe();
		this.jButtonCopiarTipoValoracion = new JButtonMe();
		this.jButtonVerFormTipoValoracion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoValoracion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoValoracion = new JButtonMe();
		this.jButtonCerrarTipoValoracion = new JButtonMe();
		
		this.jScrollPanelDatosTipoValoracion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoValoracion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Valoracion";
		
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valoracions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoValoracion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoValoracion.setToolTipText("Acciones");
        this.jPanelAccionesTipoValoracion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoValoracion=new ReporteDinamicoJInternalFrame(TipoValoracionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoValoracion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoValoracion=new ImportacionJInternalFrame(TipoValoracionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoValoracion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoValoracion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoValoracion.setText("Orden");
		this.jButtonAbrirOrderByTipoValoracion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoValoracion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoValoracion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoValoracion,false,this);
			
			//this.cargarOrderByTipoValoracion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoValoracion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoValoracion,true,this);
			
			//this.cargarOrderByTipoValoracion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoValoracion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoValoracion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoValoracion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoValoracion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoValoracion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoValoracion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoValoracion.setText("Nuevo");
		this.jButtonDuplicarTipoValoracion.setText("Duplicar");
		this.jButtonCopiarTipoValoracion.setText("Copiar");
		this.jButtonVerFormTipoValoracion.setText("Ver");
		this.jButtonNuevoRelacionesTipoValoracion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoValoracion.setText("Guardar");
		this.jButtonCerrarTipoValoracion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoValoracion,"nuevo_button","Nuevo",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoValoracion,"duplicar_button","Duplicar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoValoracion,"copiar_button","Copiar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoValoracion,"ver_form","Ver",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoValoracion,"nuevorelaciones_button","Nuevo Rel",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoValoracion,"guardarcambiostabla_button","Guardar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoValoracion,"cerrar_button","Salir",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoValoracion.setToolTipText("Nuevo"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoValoracion.setToolTipText("Duplicar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoValoracion.setToolTipText("Copiar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoValoracion.setToolTipText("Ver"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoValoracion.setToolTipText("Nuevo Rel"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoValoracion.setToolTipText("Guardar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoValoracion.setToolTipText("Salir"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoValoracion";
		inputMap = this.jButtonNuevoTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoValoracion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoValoracion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoValoracion";
		inputMap = this.jButtonDuplicarTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoValoracion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoValoracion"));
		
		//COPIAR
		sMapKey = "CopiarTipoValoracion";
		inputMap = this.jButtonCopiarTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoValoracion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoValoracion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoValoracion";
		inputMap = this.jButtonVerFormTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoValoracion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoValoracion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoValoracion";
		inputMap = this.jButtonNuevoRelacionesTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoValoracion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoValoracion";
		inputMap = this.jButtonModificarTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoValoracion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoValoracion";
		inputMap = this.jButtonCerrarTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoValoracion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoValoracion";
		inputMap = this.jButtonGuardarCambiosTablaTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoValoracion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoValoracion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoValoracion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoValoracion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoValoracion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoValoracion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoValoracion.setName("jPanelParametrosReportesTipoValoracion"); 
		
		this.jPanelParametrosReportesAccionesTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoValoracion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoValoracion.setName("jPanelParametrosReportesAccionesTipoValoracion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoValoracion = new JButtonMe();
		this.jButtonRecargarInformacionTipoValoracion.setText("Recargar");
		this.jButtonRecargarInformacionTipoValoracion.setToolTipText("Recargar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoValoracion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoValoracion = new JButtonMe();
		this.jButtonProcesarInformacionTipoValoracion.setText("Procesar");
		this.jButtonProcesarInformacionTipoValoracion.setToolTipText("Procesar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoValoracion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoValoracion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoValoracion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoValoracion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoValoracion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoValoracion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoValoracion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoValoracion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoValoracion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoValoracion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoValoracion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoValoracion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoValoracion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoValoracion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoValoracion.setText("Accion");
		this.jComboBoxTiposAccionesTipoValoracion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoValoracion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoValoracion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoValoracion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoValoracion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoValoracion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoValoracion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoValoracion = new JLabelMe();
		
		this.jLabelAccionesTipoValoracion.setText("Acciones");		
		this.jLabelAccionesTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoValoracion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoValoracion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoValoracion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoValoracion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoValoracion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoValoracion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoValoracion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoValoracion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoValoracion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoValoracion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoValoracion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoValoracion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoValoracion = new JButtonMe();
		//this.jButtonAnterioresTipoValoracion.setText("<<");
        this.jButtonAnterioresTipoValoracion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoValoracion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoValoracion = new JButtonMe();
		//this.jButtonSiguientesTipoValoracion.setText(">>");
        this.jButtonSiguientesTipoValoracion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoValoracion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoValoracion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoValoracion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoValoracion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoValoracion,"nuevoguardarcambios_button","Nue",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoValoracion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoValoracion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoValoracion";
		inputMap = this.jButtonRecargarInformacionTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoValoracion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoValoracion";
		inputMap = this.jButtonSiguientesTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoValoracion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoValoracion";
		inputMap = this.jButtonAnterioresTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoValoracion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoValoracion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoValoracion.setMinimumSize(new Dimension(this.getWidth(),TipoValoracionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoValoracionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoValoracion.setMaximumSize(new Dimension(this.getWidth(),TipoValoracionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoValoracionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoValoracion.setPreferredSize(new Dimension(this.getWidth(),TipoValoracionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoValoracionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoValoracion = new GridBagLayout();

			this.jPanelPaginacionTipoValoracion.setLayout(gridaBagLayoutPaginacionTipoValoracion);						
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = 0;
			this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoValoracion.add(this.jButtonAnterioresTipoValoracion, this.gridBagConstraintsTipoValoracion);
					
						
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoValoracion.gridy = 0;
			
			this.jPanelPaginacionTipoValoracion.add(this.jButtonNuevoGuardarCambiosTipoValoracion, this.gridBagConstraintsTipoValoracion);
						
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoValoracion.gridy = 0;
			this.jPanelPaginacionTipoValoracion.add(this.jButtonSiguientesTipoValoracion, this.gridBagConstraintsTipoValoracion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = 1;
			this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoValoracion.add(this.jButtonNuevoTipoValoracion, this.gridBagConstraintsTipoValoracion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
				this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoValoracion.gridy = 1;
				this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoValoracion.add(this.jButtonNuevoRelacionesTipoValoracion, this.gridBagConstraintsTipoValoracion);
			}
			
			
			if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
				this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoValoracion.gridy = 1;
				this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoValoracion.add(this.jButtonGuardarCambiosTablaTipoValoracion, this.gridBagConstraintsTipoValoracion);
			}
			
			
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = 1;
			this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoValoracion.add(this.jButtonDuplicarTipoValoracion, this.gridBagConstraintsTipoValoracion);
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = 1;
			this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoValoracion.add(this.jButtonCopiarTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = 1;
			this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoValoracion.add(this.jButtonVerFormTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = 1;
			this.gridBagConstraintsTipoValoracion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoValoracion.add(this.jButtonCerrarTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
		
		
		this.jButtonRecargarInformacionTipoValoracion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoValoracion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoValoracion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoValoracion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoValoracion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoValoracion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoValoracion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoValoracion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoValoracion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoValoracion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoValoracion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoValoracion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoValoracion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoValoracion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoValoracion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoValoracion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoValoracion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoValoracion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoValoracion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoValoracion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoValoracion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoValoracion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoValoracion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoValoracion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoValoracion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoValoracion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoValoracion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoValoracion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoValoracion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoValoracion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoValoracion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoValoracion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoValoracion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoValoracion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoValoracion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoValoracion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoValoracion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoValoracion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoValoracion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoValoracion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoValoracion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoValoracion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoValoracion.setLayout(gridaBagParametrosReportesTipoValoracion);
			this.jPanelParametrosReportesAccionesTipoValoracion.setLayout(gridaBagParametrosReportesAccionesTipoValoracion);
			
			
			this.jPanelParametrosAuxiliar1TipoValoracion.setLayout(gridaBagParametrosAuxiliar1TipoValoracion);
			this.jPanelParametrosAuxiliar2TipoValoracion.setLayout(gridaBagParametrosAuxiliar2TipoValoracion);
			this.jPanelParametrosAuxiliar3TipoValoracion.setLayout(gridaBagParametrosAuxiliar3TipoValoracion);
			this.jPanelParametrosAuxiliar4TipoValoracion.setLayout(gridaBagParametrosAuxiliar4TipoValoracion);
			//this.jPanelParametrosAuxiliar5TipoValoracion.setLayout(gridaBagParametrosAuxiliar2TipoValoracion);			
			
			
			
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValoracion.add(this.jButtonRecargarInformacionTipoValoracion, this.gridBagConstraintsTipoValoracion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoValoracion.add(this.jComboBoxTiposPaginacionTipoValoracion, this.gridBagConstraintsTipoValoracion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoValoracion.add(this.jCheckBoxConAltoMaximoTablaTipoValoracion, this.gridBagConstraintsTipoValoracion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoValoracion.add(this.jComboBoxTiposArchivosReportesTipoValoracion, this.gridBagConstraintsTipoValoracion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValoracion.add(this.jPanelParametrosAuxiliar1TipoValoracion, this.gridBagConstraintsTipoValoracion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoValoracion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoValoracion.add(this.jComboBoxTiposReportesTipoValoracion, this.gridBagConstraintsTipoValoracion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValoracion.add(this.jPanelParametrosAuxiliar4TipoValoracion, this.gridBagConstraintsTipoValoracion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValoracion.add(this.jComboBoxTiposReportesTipoValoracion, this.gridBagConstraintsTipoValoracion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoValoracion.add(this.jCheckBoxGenerarReporteTipoValoracion, this.gridBagConstraintsTipoValoracion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValoracion.add(this.jPanelParametrosAuxiliar2TipoValoracion, this.gridBagConstraintsTipoValoracion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoValoracion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoValoracion.add(this.jLabelAccionesTipoValoracion, this.gridBagConstraintsTipoValoracion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
				this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoValoracion.add(this.jButtonAbrirOrderByTipoValoracion, this.gridBagConstraintsTipoValoracion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValoracion.add(this.jComboBoxTiposSeleccionarTipoValoracion, this.gridBagConstraintsTipoValoracion);			
			
			
			/*
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoValoracion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoValoracion.add(this.jCheckBoxSeleccionarTodosTipoValoracion, this.gridBagConstraintsTipoValoracion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoValoracion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoValoracion.add(this.jCheckBoxSeleccionarTodosTipoValoracion, this.gridBagConstraintsTipoValoracion);															
				
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoValoracion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoValoracion.add(this.jCheckBoxSeleccionadosTipoValoracion, this.gridBagConstraintsTipoValoracion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValoracion.add(this.jPanelParametrosAuxiliar3TipoValoracion, this.gridBagConstraintsTipoValoracion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValoracion.add(this.jComboBoxTiposRelacionesTipoValoracion, this.gridBagConstraintsTipoValoracion);
				
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValoracion.add(this.jComboBoxTiposAccionesTipoValoracion, this.gridBagConstraintsTipoValoracion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoValoracion = new GridBagLayout();

			this.jScrollPanelDatosTipoValoracion.setLayout(gridaBagLayoutDatosTipoValoracion);
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = 0;
			this.gridBagConstraintsTipoValoracion.gridx = 0;
			
			this.jScrollPanelDatosTipoValoracion.add(this.jTableDatosTipoValoracion, this.gridBagConstraintsTipoValoracion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoValoracion.setViewportView(this.jTableDatosTipoValoracion);
		this.jTableDatosTipoValoracion.setFillsViewportHeight(true);
		this.jTableDatosTipoValoracion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoValoracion= new GridBagLayout();
		this.jPanelAccionesTipoValoracion.setLayout(gridaBagLayoutAccionesTipoValoracion);
		
		
		/*	
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = 0;
		this.gridBagConstraintsTipoValoracion.gridx = 0;
			
		this.jPanelAccionesTipoValoracion.add(this.jButtonNuevoTipoValoracion, this.gridBagConstraintsTipoValoracion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoValoracion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoValoracion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();						
			this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoValoracion.gridx = 0;		
			//this.gridBagConstraintsTipoValoracion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoValoracion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoValoracion, this.gridBagConstraintsTipoValoracion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoValoracion.gridx = 0;		
		//this.gridBagConstraintsTipoValoracion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoValoracion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoValoracion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoValoracion, this.gridBagConstraintsTipoValoracion);								
		
		
		/*
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoValoracion, this.gridBagConstraintsTipoValoracion);
		*/		
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoValoracion.gridx =0;
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoValoracion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoValoracion, this.gridBagConstraintsTipoValoracion);
				
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoValoracion, this.gridBagConstraintsTipoValoracion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoValoracionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoValoracion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoValoracion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoValoracion.setLayout(gridaBagLayoutBusquedasParametrosTipoValoracion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoValoracion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoValoracion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoValoracion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoValoracion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoValoracion, this.gridBagConstraintsTipoValoracion);
			
			
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
			
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoValoracion, this.gridBagConstraintsTipoValoracion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoValoracion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoValoracion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoValoracion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoValoracion.setName("jPanelReporteDinamicoTipoValoracion"); 
		
		this.jPanelReporteDinamicoTipoValoracion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoValoracion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoValoracion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoValoracion.setLayout(gridaBagLayoutReporteDinamicoTipoValoracion);
		
		
		this.jInternalFrameReporteDinamicoTipoValoracion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoValoracion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoValoracion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoValoracion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoValoracion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoValoracion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoValoracion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoValoracion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoValoracion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoValoracion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoValoracion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoValoracion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoValoracion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoValoracion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valoracions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoValoracion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoValoracion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoValoracion.add(this.jLabelColumnasSelectReporteTipoValoracion, this.gridBagConstraintsTipoValoracion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoValoracion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoValoracion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoValoracion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoValoracion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoValoracion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoValoracion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoValoracion=new JScrollPane(this.jListColumnasSelectReporteTipoValoracion);
			
			this.jScrollColumnasSelectReporteTipoValoracion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoValoracion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoValoracion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoValoracion.add(this.jListColumnasSelectReporteTipoValoracion, this.gridBagConstraintsTipoValoracion);
		this.jPanelReporteDinamicoTipoValoracion.add(this.jScrollColumnasSelectReporteTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoValoracion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoValoracion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoValoracion.add(this.jLabelRelacionesSelectReporteTipoValoracion, this.gridBagConstraintsTipoValoracion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoValoracion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoValoracion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoValoracion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoValoracion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoValoracion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoValoracion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoValoracion=new JScrollPane(this.jListRelacionesSelectReporteTipoValoracion);
			
			this.jScrollRelacionesSelectReporteTipoValoracion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoValoracion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoValoracion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoValoracion.add(this.jListRelacionesSelectReporteTipoValoracion, this.gridBagConstraintsTipoValoracion);
		this.jPanelReporteDinamicoTipoValoracion.add(this.jScrollRelacionesSelectReporteTipoValoracion, this.gridBagConstraintsTipoValoracion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoValoracion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoValoracion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoValoracion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoValoracion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoValoracion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoValoracion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoValoracion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoValoracion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoValoracion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoValoracion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoValoracion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoValoracion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoValoracion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoValoracion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoValoracion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoValoracion.add(this.jLabelGenerarExcelReporteDinamicoTipoValoracion, this.gridBagConstraintsTipoValoracion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoValoracion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoValoracion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoValoracion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoValoracion.setToolTipText("Generar EXCEL"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		//this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoValoracion.add(this.jButtonGenerarExcelReporteDinamicoTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoValoracion.add(this.jComboBoxTiposReportesDinamicoTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoValoracion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoValoracion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoValoracion.add(this.jLabelTiposArchivoReporteDinamicoTipoValoracion, this.gridBagConstraintsTipoValoracion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoValoracion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoValoracion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoValoracion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoValoracion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoValoracion.setToolTipText("Generar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoValoracion.add(this.jButtonGenerarReporteDinamicoTipoValoracion, this.gridBagConstraintsTipoValoracion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoValoracion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoValoracion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoValoracion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoValoracion.setToolTipText("Cancelar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoValoracion.add(this.jButtonCerrarReporteDinamicoTipoValoracion, this.gridBagConstraintsTipoValoracion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoValoracion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoValoracion= new JScrollPane(jPanelReporteDinamicoTipoValoracion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoValoracion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoValoracion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoValoracion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valoracions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoValoracion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoValoracion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoValoracion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoValoracion);
		this.jInternalFrameReporteDinamicoTipoValoracion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoValoracion, this.gridBagConstraintsTipoValoracion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoValoracion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoValoracion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoValoracion.setName("jPanelImportacionTipoValoracion"); 
		
		this.jPanelImportacionTipoValoracion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoValoracion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoValoracion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoValoracion.setLayout(gridaBagLayoutImportacionTipoValoracion);
		
		
		this.jInternalFrameImportacionTipoValoracion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoValoracion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoValoracion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoValoracion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoValoracion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoValoracion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoValoracion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoValoracion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoValoracion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoValoracion.setResizable(true);
	    this.jInternalFrameImportacionTipoValoracion.setClosable(true);
	    this.jInternalFrameImportacionTipoValoracion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoValoracion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoValoracion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoValoracion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoValoracion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoValoracion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoValoracion.setResizable(true);
	    this.jInternalFrameImportacionTipoValoracion.setClosable(true);
	    this.jInternalFrameImportacionTipoValoracion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoValoracion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoValoracion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoValoracion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valoracions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoValoracion = new JLabelMe();

		this.jLabelArchivoImportacionTipoValoracion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoValoracion.add(this.jLabelArchivoImportacionTipoValoracion, this.gridBagConstraintsTipoValoracion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoValoracion = new JFileChooser();		
		this.jFileChooserImportacionTipoValoracion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoValoracion = new JButtonMe();
		this.jButtonAbrirImportacionTipoValoracion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoValoracion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoValoracion.setToolTipText("Generar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoValoracion.add(this.jButtonAbrirImportacionTipoValoracion, this.gridBagConstraintsTipoValoracion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoValoracion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoValoracion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoValoracion.add(this.jLabelPathArchivoImportacionTipoValoracion, this.gridBagConstraintsTipoValoracion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoValoracion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoValoracion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoValoracion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoValoracion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoValoracion.add(this.jTextFieldPathArchivoImportacionTipoValoracion, this.gridBagConstraintsTipoValoracion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoValoracion = new JButtonMe();
		this.jButtonGenerarImportacionTipoValoracion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoValoracion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoValoracion.setToolTipText("Generar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoValoracion.add(this.jButtonGenerarImportacionTipoValoracion, this.gridBagConstraintsTipoValoracion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoValoracion = new JButtonMe();
		this.jButtonCerrarImportacionTipoValoracion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoValoracion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoValoracion.setToolTipText("Cancelar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoValoracion.add(this.jButtonCerrarImportacionTipoValoracion, this.gridBagConstraintsTipoValoracion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoValoracion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoValoracion= new JScrollPane(jPanelImportacionTipoValoracion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoValoracion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoValoracion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoValoracion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoValoracion);
		this.jInternalFrameImportacionTipoValoracion.getContentPane().add(this.jScrollPanelImportacionTipoValoracion, this.gridBagConstraintsTipoValoracion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoValoracion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoValoracion = new JButtonMe();
			this.jButtonAbrirOrderByTipoValoracion.setText("Orden");
			this.jButtonAbrirOrderByTipoValoracion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoValoracion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoValoracion";
			inputMap = this.jButtonAbrirOrderByTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoValoracion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoValoracion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoValoracion.setName("jPanelOrderByTipoValoracion"); 
			
			this.jPanelOrderByTipoValoracion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoValoracion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoValoracion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoValoracion.setLayout(gridaBagLayoutOrderByTipoValoracion);
			
			
			this.jTableDatosTipoValoracionOrderBy = new JTableMe();        
			this.jTableDatosTipoValoracionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoValoracionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoValoracionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoValoracionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoValoracionOrderBy.setViewportView(this.jTableDatosTipoValoracionOrderBy);
			this.jTableDatosTipoValoracionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoValoracionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoValoracion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoValoracion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoValoracion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoValoracion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoValoracion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoValoracion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoValoracion.setTitle("Orden");
			this.jInternalFrameOrderByTipoValoracion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoValoracion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoValoracion.setResizable(true);
			this.jInternalFrameOrderByTipoValoracion.setClosable(true);
			this.jInternalFrameOrderByTipoValoracion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoValoracion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoValoracion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoValoracion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valoracions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoValoracion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoValoracion.ipady =150;
				
			this.jPanelOrderByTipoValoracion.add(jScrollPanelDatosTipoValoracionOrderBy, this.gridBagConstraintsTipoValoracion);//this.jTableDatosTipoValoracionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoValoracion = new JButtonMe();
			this.jButtonCerrarOrderByTipoValoracion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoValoracion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoValoracion.setToolTipText("Cancelar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoValoracion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoValoracion.add(this.jButtonCerrarOrderByTipoValoracion, this.gridBagConstraintsTipoValoracion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoValoracion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoValoracion= new JScrollPane(jPanelOrderByTipoValoracion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoValoracion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoValoracion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoValoracion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoValoracion);
			
			this.jInternalFrameOrderByTipoValoracion.getContentPane().add(this.jScrollPanelOrderByTipoValoracion, this.gridBagConstraintsTipoValoracion);			
		
		} else {
			this.jButtonAbrirOrderByTipoValoracion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipovaloracionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoValoracion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoValoracion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoValoracion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoValoracion.getRowHeight();//TipoValoracionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoValoracionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoValoracion.isSelected()) {
					iHeightTable=TipoValoracionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoValoracionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoValoracionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoValoracionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoValoracion.isSelected()) {
					iHeightTable=TipoValoracionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoValoracionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoValoracionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoValoracion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoValoracion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoValoracion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoValoracion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoValoracion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoValoracion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoValoracion!=null && this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoValoracion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoValoracion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoValoracion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoValoracion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoValoracion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoValoracion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipovaloracionLogic.getTipoValoracions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovaloracions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoValoracion> TraerTipoValoracionBeans(List<TipoValoracion> tipovaloracions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoValoracion tipovaloracion:tipovaloracions) {
					
				if(!(TipoValoracionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoValoracionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipovaloracion.setsDetalleGeneralEntityReporte(TipoValoracionConstantesFunciones.getTipoValoracionDescripcion(tipovaloracion));
										
						
					
					

					if(tipovaloracion.getReferenciaBancarias()!=null && Funciones.existeClass(classes,ReferenciaBancaria.class)) {
						try{tipovaloracion.setreferenciabancariasDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaBancariaJInternalFrame.TraerReferenciaBancariaBeans(tipovaloracion.getReferenciaBancarias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipovaloracion.getLunaSistemaSolars()!=null && Funciones.existeClass(classes,LunaSistemaSolar.class)) {
						try{tipovaloracion.setlunasistemasolarsDescripcionReporte(new JRBeanCollectionDataSource(LunaSistemaSolarJInternalFrame.TraerLunaSistemaSolarBeans(tipovaloracion.getLunaSistemaSolars(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipovaloracion.getPlanetaSistemaSolars()!=null && Funciones.existeClass(classes,PlanetaSistemaSolar.class)) {
						try{tipovaloracion.setplanetasistemasolarsDescripcionReporte(new JRBeanCollectionDataSource(PlanetaSistemaSolarJInternalFrame.TraerPlanetaSistemaSolarBeans(tipovaloracion.getPlanetaSistemaSolars(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipovaloracion.getReferenciaComercials()!=null && Funciones.existeClass(classes,ReferenciaComercial.class)) {
						try{tipovaloracion.setreferenciacomercialsDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaComercialJInternalFrame.TraerReferenciaComercialBeans(tipovaloracion.getReferenciaComercials(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipovaloracion.setsDetalleGeneralEntityReporte(tipovaloracion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipovaloracionbeans.add(tipovaloracionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipovaloracions;
    }
	//PARA REPORTES FIN
}
