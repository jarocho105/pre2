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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
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
import com.bydan.erp.seguridad.util.TipoPeriodoConstantesFunciones;

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
public class TipoPeriodoJInternalFrame extends TipoPeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPeriodo;
	
	protected JMenuBar jmenuBarTipoPeriodo;
	
	protected JMenu jmenuTipoPeriodo;
	protected JMenu jmenuDatosTipoPeriodo;
	protected JMenu jmenuArchivoTipoPeriodo;
	protected JMenu jmenuAccionesTipoPeriodo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPeriodo;	
	protected GridBagConstraints gridBagConstraintsTipoPeriodo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPeriodoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPeriodo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPeriodo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPeriodo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoPeriodoSessionBean tipoperiodoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPeriodo> tipoperiodos;		
	public List<TipoPeriodo> tipoperiodosEliminados;	
	public List<TipoPeriodo> tipoperiodosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPeriodo;		
	protected JButton jButtonAbrirOrderByTipoPeriodo;
	
	
	//protected JPanel jPanelOrderByTipoPeriodo;
	//public JScrollPane jScrollPanelOrderByTipoPeriodo;	
	//protected JButton jButtonCerrarOrderByTipoPeriodo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPeriodoLogic tipoperiodoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPeriodo;
	public JScrollPane jScrollPanelDatosEdicionTipoPeriodo;
	public JScrollPane jScrollPanelDatosGeneralTipoPeriodo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPeriodoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPeriodo;
	//public JScrollPane jScrollPanelImportacionTipoPeriodo;
	
	
	
	protected JPanel jPanelAccionesTipoPeriodo;
	
    protected JPanel jPanelPaginacionTipoPeriodo;
    protected JPanel jPanelParametrosReportesTipoPeriodo;
	protected JPanel jPanelParametrosReportesAccionesTipoPeriodo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPeriodo;
	protected JPanel jPanelParametrosAuxiliar2TipoPeriodo;
	protected JPanel jPanelParametrosAuxiliar3TipoPeriodo;
	protected JPanel jPanelParametrosAuxiliar4TipoPeriodo;
	//protected JPanel jPanelParametrosAuxiliar5TipoPeriodo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPeriodo;
	//protected JPanel jPanelImportacionTipoPeriodo;
	
	
	public JTable jTableDatosTipoPeriodo;
	
	
	
	//public JTable jTableDatosTipoPeriodoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPeriodo;
	protected JButton jButtonDuplicarTipoPeriodo;
	protected JButton jButtonCopiarTipoPeriodo;
	protected JButton jButtonVerFormTipoPeriodo;
	protected JButton jButtonNuevoRelacionesTipoPeriodo;
	protected JButton jButtonModificarTipoPeriodo;
	
    protected JButton jButtonGuardarCambiosTablaTipoPeriodo;
	protected JButton jButtonCerrarTipoPeriodo;
	
	
	protected JButton jButtonRecargarInformacionTipoPeriodo;
	protected JButton jButtonProcesarInformacionTipoPeriodo;
	
	
	protected JButton jButtonAnterioresTipoPeriodo;
	protected JButton jButtonSiguientesTipoPeriodo;
	protected JButton jButtonNuevoGuardarCambiosTipoPeriodo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPeriodo;
	//protected JButton jButtonCerrarReporteDinamicoTipoPeriodo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPeriodo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPeriodo;
	//protected JButton jButtonGenerarImportacionTipoPeriodo;
	//protected JButton jButtonCerrarImportacionTipoPeriodo;
	//protected JFileChooser jFileChooserImportacionTipoPeriodo;
	//protected File fileImportacionTipoPeriodo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPeriodo;
	protected JButton jButtonDuplicarToolBarTipoPeriodo;
	protected JButton jButtonNuevoRelacionesToolBarTipoPeriodo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPeriodo;
	protected JButton jButtonCopiarToolBarTipoPeriodo;
	protected JButton jButtonVerFormToolBarTipoPeriodo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPeriodo;
	protected JButton jButtonCerrarToolBarTipoPeriodo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPeriodo;
	protected JButton jButtonProcesarInformacionToolBarTipoPeriodo;
	protected JButton jButtonAnterioresToolBarTipoPeriodo;
	protected JButton jButtonSiguientesToolBarTipoPeriodo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPeriodo;
	protected JButton jButtonAbrirOrderByToolBarTipoPeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPeriodo;
	protected JMenuItem jMenuItemDuplicarTipoPeriodo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPeriodo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPeriodo;
	protected JMenuItem jMenuItemCopiarTipoPeriodo;
	protected JMenuItem jMenuItemVerFormTipoPeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPeriodo;
	protected JMenuItem jMenuItemCerrarTipoPeriodo;
	protected JMenuItem jMenuItemDetalleCerrarTipoPeriodo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPeriodo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPeriodo;
	protected JMenuItem jMenuItemProcesarInformacionTipoPeriodo;
	protected JMenuItem jMenuItemAnterioresTipoPeriodo;
	protected JMenuItem jMenuItemSiguientesTipoPeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPeriodo;
	protected JMenuItem jMenuItemAbrirOrderByTipoPeriodo;
	protected JMenuItem jMenuItemMostrarOcultarTipoPeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPeriodo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPeriodo;
	protected JCheckBox jCheckBoxSeleccionadosTipoPeriodo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPeriodo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPeriodo;
	protected JTextField jTextFieldValorCampoGeneralTipoPeriodo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPeriodo;
	//public JList<Reporte> jListColumnasSelectReporteTipoPeriodo;
	//public JScrollPane jScrollColumnasSelectReporteTipoPeriodo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPeriodo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPeriodo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPeriodo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPeriodo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPeriodo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPeriodo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPeriodo;
	
		
	//public JLabel jLabelArchivoImportacionTipoPeriodo;	
	//public JLabel jLabelPathArchivoImportacionTipoPeriodo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPeriodo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPeriodo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPeriodo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPeriodo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPeriodo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPeriodo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPeriodo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPeriodo;	
	
	
	
	
	
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
	public TipoPeriodoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPeriodoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPeriodoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPeriodoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPeriodo)	{
		this.jButtonRecargarInformacionTipoPeriodo = jButtonRecargarInformacionTipoPeriodo;
	}
	
	public JButton getjButtonProcesarInformacionTipoPeriodo() {
		return this.jButtonProcesarInformacionTipoPeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPeriodo)	{
		this.jButtonProcesarInformacionTipoPeriodo = jButtonProcesarInformacionTipoPeriodo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPeriodo() {
		return this.jButtonRecargarInformacionTipoPeriodo;
	}
	
	
	public List<TipoPeriodo> gettipoperiodos() {
		return this.tipoperiodos;
	}

	public void settipoperiodos(List<TipoPeriodo> tipoperiodos) {
		this.tipoperiodos = tipoperiodos;
	}
	
	public List<TipoPeriodo> gettipoperiodosAux() {
		return this.tipoperiodosAux;
	}

	public void settipoperiodosAux(List<TipoPeriodo> tipoperiodosAux) {
		this.tipoperiodosAux = tipoperiodosAux;
	}
	
	public List<TipoPeriodo> gettipoperiodosEliminados() {
		return this.tipoperiodosEliminados;
	}

	public void setTipoPeriodosEliminados(List<TipoPeriodo> tipoperiodosEliminados) {
		this.tipoperiodosEliminados = tipoperiodosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPeriodo() {
		return jComboBoxTiposSeleccionarTipoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPeriodo(
			JComboBox jComboBoxTiposSeleccionarTipoPeriodo) {
		this.jComboBoxTiposSeleccionarTipoPeriodo = jComboBoxTiposSeleccionarTipoPeriodo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPeriodo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPeriodo() {
		return jTextFieldValorCampoGeneralTipoPeriodo;
	}

	public void setjTextFieldValorCampoGeneralTipoPeriodo(
			JTextField jTextFieldValorCampoGeneralTipoPeriodo) {
		this.jTextFieldValorCampoGeneralTipoPeriodo = jTextFieldValorCampoGeneralTipoPeriodo;
	}

	public void setBorderResaltarValorCampoGeneralTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPeriodo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPeriodo() {
		return this.jCheckBoxSeleccionarTodosTipoPeriodo;
	}

	public void setjCheckBoxSeleccionarTodosTipoPeriodo(
			JCheckBox jCheckBoxSeleccionarTodosTipoPeriodo) {
		this.jCheckBoxSeleccionarTodosTipoPeriodo = jCheckBoxSeleccionarTodosTipoPeriodo;
	}

	public void setBorderResaltarSeleccionarTodosTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPeriodo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPeriodo() {
		return this.jCheckBoxSeleccionadosTipoPeriodo;
	}

	public void setjCheckBoxSeleccionadosTipoPeriodo(
			JCheckBox jCheckBoxSeleccionadosTipoPeriodo) {
		this.jCheckBoxSeleccionadosTipoPeriodo = jCheckBoxSeleccionadosTipoPeriodo;
	}
	
	public void setBorderResaltarSeleccionadosTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPeriodo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPeriodo() {
		return this.jComboBoxTiposArchivosReportesTipoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPeriodo(
			JComboBox jComboBoxTiposArchivosReportesTipoPeriodo) {
		this.jComboBoxTiposArchivosReportesTipoPeriodo = jComboBoxTiposArchivosReportesTipoPeriodo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPeriodo() {
		return this.jComboBoxTiposReportesTipoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPeriodo(
			JComboBox jComboBoxTiposReportesTipoPeriodo) {
		this.jComboBoxTiposReportesTipoPeriodo = jComboBoxTiposReportesTipoPeriodo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPeriodo() {
	//	return jComboBoxTiposReportesDinamicoTipoPeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPeriodo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPeriodo) {
	//	this.jComboBoxTiposReportesDinamicoTipoPeriodo = jComboBoxTiposReportesDinamicoTipoPeriodo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPeriodo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPeriodo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPeriodo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPeriodo = jComboBoxTiposArchivosReportesDinamicoTipoPeriodo;
	//}
	
	public void setBorderResaltarTiposReportesTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPeriodo() {
		return this.jComboBoxTiposGraficosReportesTipoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPeriodo(
			JComboBox jComboBoxTiposGraficosReportesTipoPeriodo) {
		this.jComboBoxTiposGraficosReportesTipoPeriodo = jComboBoxTiposGraficosReportesTipoPeriodo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPeriodo() {
		return this.jComboBoxTiposPaginacionTipoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPeriodo(
			JComboBox jComboBoxTiposPaginacionTipoPeriodo) {
		this.jComboBoxTiposPaginacionTipoPeriodo = jComboBoxTiposPaginacionTipoPeriodo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPeriodo() {
		return this.jComboBoxTiposRelacionesTipoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPeriodo() {
		return this.jComboBoxTiposAccionesTipoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPeriodo(
			JComboBox jComboBoxTiposRelacionesTipoPeriodo) {
		this.jComboBoxTiposRelacionesTipoPeriodo = jComboBoxTiposRelacionesTipoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPeriodo(
			JComboBox jComboBoxTiposAccionesTipoPeriodo) {
		this.jComboBoxTiposAccionesTipoPeriodo = jComboBoxTiposAccionesTipoPeriodo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPeriodo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPeriodo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPeriodo() {
	//	return jCheckBoxConGraficoDinamicoTipoPeriodo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPeriodo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPeriodo) {
	//	this.jCheckBoxConGraficoDinamicoTipoPeriodo = jCheckBoxConGraficoDinamicoTipoPeriodo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPeriodo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPeriodo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPeriodo .setBorder(borderResaltar);		
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
		this.tipoperiodoSessionBean=new TipoPeriodoSessionBean();
		
		this.tipoperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoperiodoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Periodo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPeriodo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"nuevo","nuevo","Nuevo"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"duplicar","duplicar","Duplicar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"copiar","copiar","Copiar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"ver_form","ver_form","Ver"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"recargar","recargar","Recargar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPeriodo,this.jTtoolBarTipoPeriodo,
							"cerrar","cerrar","Salir"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPeriodo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPeriodo;
			
				this.jButtonProcesarInformacionToolBarTipoPeriodo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPeriodo;
				
		//protected JButton jButtonModificarToolBarTipoPeriodo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPeriodo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPeriodo=new JMenuMe("General");
		this.jmenuArchivoTipoPeriodo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPeriodo=new JMenuMe("Acciones");
		this.jmenuDatosTipoPeriodo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPeriodo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPeriodo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPeriodo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPeriodo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPeriodo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPeriodo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPeriodo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPeriodo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPeriodo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPeriodo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPeriodo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPeriodo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPeriodo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPeriodo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPeriodo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPeriodo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPeriodo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPeriodo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPeriodo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPeriodo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPeriodo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPeriodo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPeriodo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPeriodo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPeriodo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPeriodo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPeriodo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPeriodo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPeriodo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPeriodo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPeriodo.add(this.jMenuItemCerrarTipoPeriodo);
			
			this.jmenuAccionesTipoPeriodo.add(this.jMenuItemNuevoTipoPeriodo);
			this.jmenuAccionesTipoPeriodo.add(this.jMenuItemNuevoGuardarCambiosTipoPeriodo);
			this.jmenuAccionesTipoPeriodo.add(this.jMenuItemNuevoRelacionesTipoPeriodo);
			this.jmenuAccionesTipoPeriodo.add(this.jMenuItemGuardarCambiosTablaTipoPeriodo);		
			this.jmenuAccionesTipoPeriodo.add(this.jMenuItemDuplicarTipoPeriodo);		
			this.jmenuAccionesTipoPeriodo.add(this.jMenuItemCopiarTipoPeriodo);		
			this.jmenuAccionesTipoPeriodo.add(this.jMenuItemVerFormTipoPeriodo);		
			
			this.jmenuDatosTipoPeriodo.add(this.jMenuItemRecargarInformacionTipoPeriodo);				
			this.jmenuDatosTipoPeriodo.add(this.jMenuItemAnterioresTipoPeriodo);				
			this.jmenuDatosTipoPeriodo.add(this.jMenuItemSiguientesTipoPeriodo);				
			this.jmenuDatosTipoPeriodo.add(this.jMenuItemAbrirOrderByTipoPeriodo);				
			this.jmenuDatosTipoPeriodo.add(this.jMenuItemMostrarOcultarTipoPeriodo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPeriodo.add(this.jMenuItemGuardarCambiosTipoPeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPeriodo.add(this.jmenuArchivoTipoPeriodo);		
			this.jmenuBarTipoPeriodo.add(this.jmenuAccionesTipoPeriodo);		
			this.jmenuBarTipoPeriodo.add(this.jmenuDatosTipoPeriodo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPeriodo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPeriodo() {
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
			//this.jInternalFrameDetalleTipoPeriodo = new TipoPeriodoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Periodo DATOS");
			this.jInternalFrameDetalleFormTipoPeriodo = new TipoPeriodoDetalleFormJInternalFrame(jDesktopPane,this.tipoperiodoSessionBean.getConGuardarRelaciones(),this.tipoperiodoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPeriodo = null;//new TipoPeriodoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPeriodo= new GridBagLayout();
		
		
		this.jTableDatosTipoPeriodo = new JTableMe();      
		
		String sToolTipTipoPeriodo="";
		sToolTipTipoPeriodo=TipoPeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPeriodo+="(Seguridad.TipoPeriodo)";
		}
		
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPeriodo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPeriodo.setToolTipText(sToolTipTipoPeriodo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPeriodo);
		this.jTableDatosTipoPeriodo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPeriodo.setRowSelectionAllowed(true);
		this.jTableDatosTipoPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPeriodo = new JButtonMe();
		this.jButtonDuplicarTipoPeriodo = new JButtonMe();
		this.jButtonCopiarTipoPeriodo = new JButtonMe();
		this.jButtonVerFormTipoPeriodo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPeriodo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPeriodo = new JButtonMe();
		this.jButtonCerrarTipoPeriodo = new JButtonMe();
		
		this.jScrollPanelDatosTipoPeriodo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPeriodo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Periodo";
		
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Periodos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesTipoPeriodo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPeriodo=new ReporteDinamicoJInternalFrame(TipoPeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPeriodo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPeriodo=new ImportacionJInternalFrame(TipoPeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPeriodo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPeriodo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPeriodo.setText("Orden");
		this.jButtonAbrirOrderByTipoPeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPeriodo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPeriodo,false,this);
			
			//this.cargarOrderByTipoPeriodo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPeriodo,true,this);
			
			//this.cargarOrderByTipoPeriodo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPeriodo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPeriodo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPeriodo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPeriodo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPeriodo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPeriodo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPeriodo.setText("Nuevo");
		this.jButtonDuplicarTipoPeriodo.setText("Duplicar");
		this.jButtonCopiarTipoPeriodo.setText("Copiar");
		this.jButtonVerFormTipoPeriodo.setText("Ver");
		this.jButtonNuevoRelacionesTipoPeriodo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPeriodo.setText("Guardar");
		this.jButtonCerrarTipoPeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPeriodo,"nuevo_button","Nuevo",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPeriodo,"duplicar_button","Duplicar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPeriodo,"copiar_button","Copiar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPeriodo,"ver_form","Ver",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPeriodo,"nuevorelaciones_button","Nuevo Rel",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPeriodo,"guardarcambiostabla_button","Guardar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPeriodo,"cerrar_button","Salir",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPeriodo.setToolTipText("Nuevo"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPeriodo.setToolTipText("Duplicar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPeriodo.setToolTipText("Copiar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPeriodo.setToolTipText("Ver"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPeriodo.setToolTipText("Nuevo Rel"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPeriodo.setToolTipText("Guardar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPeriodo.setToolTipText("Salir"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPeriodo";
		inputMap = this.jButtonNuevoTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPeriodo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPeriodo";
		inputMap = this.jButtonDuplicarTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPeriodo"));
		
		//COPIAR
		sMapKey = "CopiarTipoPeriodo";
		inputMap = this.jButtonCopiarTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPeriodo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPeriodo";
		inputMap = this.jButtonVerFormTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPeriodo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPeriodo";
		inputMap = this.jButtonNuevoRelacionesTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPeriodo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPeriodo";
		inputMap = this.jButtonModificarTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPeriodo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPeriodo";
		inputMap = this.jButtonCerrarTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPeriodo";
		inputMap = this.jButtonGuardarCambiosTablaTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPeriodo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPeriodo.setName("jPanelParametrosReportesTipoPeriodo"); 
		
		this.jPanelParametrosReportesAccionesTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPeriodo.setName("jPanelParametrosReportesAccionesTipoPeriodo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPeriodo = new JButtonMe();
		this.jButtonRecargarInformacionTipoPeriodo.setText("Recargar");
		this.jButtonRecargarInformacionTipoPeriodo.setToolTipText("Recargar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPeriodo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPeriodo = new JButtonMe();
		this.jButtonProcesarInformacionTipoPeriodo.setText("Procesar");
		this.jButtonProcesarInformacionTipoPeriodo.setToolTipText("Procesar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPeriodo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPeriodo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPeriodo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPeriodo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPeriodo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPeriodo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPeriodo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPeriodo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPeriodo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPeriodo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPeriodo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPeriodo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPeriodo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPeriodo.setText("Accion");
		this.jComboBoxTiposAccionesTipoPeriodo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPeriodo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPeriodo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPeriodo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPeriodo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPeriodo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPeriodo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPeriodo = new JLabelMe();
		
		this.jLabelAccionesTipoPeriodo.setText("Acciones");		
		this.jLabelAccionesTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPeriodo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPeriodo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPeriodo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPeriodo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPeriodo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPeriodo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPeriodo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPeriodo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPeriodo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPeriodo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPeriodo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPeriodo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPeriodo = new JButtonMe();
		//this.jButtonAnterioresTipoPeriodo.setText("<<");
        this.jButtonAnterioresTipoPeriodo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPeriodo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPeriodo = new JButtonMe();
		//this.jButtonSiguientesTipoPeriodo.setText(">>");
        this.jButtonSiguientesTipoPeriodo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPeriodo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPeriodo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPeriodo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPeriodo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPeriodo,"nuevoguardarcambios_button","Nue",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPeriodo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPeriodo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPeriodo";
		inputMap = this.jButtonRecargarInformacionTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPeriodo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPeriodo";
		inputMap = this.jButtonSiguientesTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPeriodo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPeriodo";
		inputMap = this.jButtonAnterioresTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPeriodo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPeriodo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPeriodo.setMinimumSize(new Dimension(this.getWidth(),TipoPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPeriodo.setMaximumSize(new Dimension(this.getWidth(),TipoPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPeriodo.setPreferredSize(new Dimension(this.getWidth(),TipoPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPeriodo = new GridBagLayout();

			this.jPanelPaginacionTipoPeriodo.setLayout(gridaBagLayoutPaginacionTipoPeriodo);						
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = 0;
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPeriodo.add(this.jButtonAnterioresTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
					
						
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPeriodo.gridy = 0;
			
			this.jPanelPaginacionTipoPeriodo.add(this.jButtonNuevoGuardarCambiosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
						
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPeriodo.gridy = 0;
			this.jPanelPaginacionTipoPeriodo.add(this.jButtonSiguientesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = 1;
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPeriodo.add(this.jButtonNuevoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
						
			
			
			if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
				this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPeriodo.gridy = 1;
				this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPeriodo.add(this.jButtonGuardarCambiosTablaTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			}
			
			
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = 1;
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPeriodo.add(this.jButtonDuplicarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = 1;
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPeriodo.add(this.jButtonCopiarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = 1;
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPeriodo.add(this.jButtonVerFormTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = 1;
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPeriodo.add(this.jButtonCerrarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
		
		
		this.jButtonRecargarInformacionTipoPeriodo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPeriodo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPeriodo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPeriodo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPeriodo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPeriodo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPeriodo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPeriodo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPeriodo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPeriodo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPeriodo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPeriodo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPeriodo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPeriodo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPeriodo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPeriodo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPeriodo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPeriodo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPeriodo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPeriodo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPeriodo.setLayout(gridaBagParametrosReportesTipoPeriodo);
			this.jPanelParametrosReportesAccionesTipoPeriodo.setLayout(gridaBagParametrosReportesAccionesTipoPeriodo);
			
			
			this.jPanelParametrosAuxiliar1TipoPeriodo.setLayout(gridaBagParametrosAuxiliar1TipoPeriodo);
			this.jPanelParametrosAuxiliar2TipoPeriodo.setLayout(gridaBagParametrosAuxiliar2TipoPeriodo);
			this.jPanelParametrosAuxiliar3TipoPeriodo.setLayout(gridaBagParametrosAuxiliar3TipoPeriodo);
			this.jPanelParametrosAuxiliar4TipoPeriodo.setLayout(gridaBagParametrosAuxiliar4TipoPeriodo);
			//this.jPanelParametrosAuxiliar5TipoPeriodo.setLayout(gridaBagParametrosAuxiliar2TipoPeriodo);			
			
			
			
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPeriodo.add(this.jButtonRecargarInformacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPeriodo.add(this.jComboBoxTiposPaginacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPeriodo.add(this.jCheckBoxConAltoMaximoTablaTipoPeriodo, this.gridBagConstraintsTipoPeriodo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPeriodo.add(this.jComboBoxTiposArchivosReportesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPeriodo.add(this.jPanelParametrosAuxiliar1TipoPeriodo, this.gridBagConstraintsTipoPeriodo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPeriodo.add(this.jComboBoxTiposReportesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPeriodo.add(this.jPanelParametrosAuxiliar4TipoPeriodo, this.gridBagConstraintsTipoPeriodo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPeriodo.add(this.jComboBoxTiposReportesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPeriodo.add(this.jCheckBoxGenerarReporteTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPeriodo.add(this.jPanelParametrosAuxiliar2TipoPeriodo, this.gridBagConstraintsTipoPeriodo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPeriodo.add(this.jLabelAccionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
				this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPeriodo.add(this.jButtonAbrirOrderByTipoPeriodo, this.gridBagConstraintsTipoPeriodo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPeriodo.add(this.jComboBoxTiposSeleccionarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);			
			
			
			/*
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPeriodo.add(this.jCheckBoxSeleccionarTodosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPeriodo.add(this.jCheckBoxSeleccionarTodosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);															
				
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPeriodo.add(this.jCheckBoxSeleccionadosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPeriodo.add(this.jPanelParametrosAuxiliar3TipoPeriodo, this.gridBagConstraintsTipoPeriodo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPeriodo.add(this.jComboBoxTiposRelacionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
				
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPeriodo.add(this.jComboBoxTiposAccionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPeriodo = new GridBagLayout();

			this.jScrollPanelDatosTipoPeriodo.setLayout(gridaBagLayoutDatosTipoPeriodo);
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = 0;
			this.gridBagConstraintsTipoPeriodo.gridx = 0;
			
			this.jScrollPanelDatosTipoPeriodo.add(this.jTableDatosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPeriodo.setViewportView(this.jTableDatosTipoPeriodo);
		this.jTableDatosTipoPeriodo.setFillsViewportHeight(true);
		this.jTableDatosTipoPeriodo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPeriodo= new GridBagLayout();
		this.jPanelAccionesTipoPeriodo.setLayout(gridaBagLayoutAccionesTipoPeriodo);
		
		
		/*	
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = 0;
		this.gridBagConstraintsTipoPeriodo.gridx = 0;
			
		this.jPanelAccionesTipoPeriodo.add(this.jButtonNuevoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPeriodo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();						
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPeriodo.gridx = 0;		
			//this.gridBagConstraintsTipoPeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPeriodo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPeriodo.gridx = 0;		
		//this.gridBagConstraintsTipoPeriodo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPeriodo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPeriodo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);								
		
		
		/*
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		*/		
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPeriodo.gridx =0;
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
				
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPeriodo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPeriodo.setLayout(gridaBagLayoutBusquedasParametrosTipoPeriodo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			
			
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
			
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPeriodo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPeriodo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPeriodo.setName("jPanelReporteDinamicoTipoPeriodo"); 
		
		this.jPanelReporteDinamicoTipoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPeriodo.setLayout(gridaBagLayoutReporteDinamicoTipoPeriodo);
		
		
		this.jInternalFrameReporteDinamicoTipoPeriodo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPeriodo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPeriodo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPeriodo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPeriodo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Periodos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPeriodo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPeriodo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPeriodo.add(this.jLabelColumnasSelectReporteTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPeriodo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPeriodo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPeriodo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPeriodo=new JScrollPane(this.jListColumnasSelectReporteTipoPeriodo);
			
			this.jScrollColumnasSelectReporteTipoPeriodo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPeriodo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPeriodo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPeriodo.add(this.jListColumnasSelectReporteTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		this.jPanelReporteDinamicoTipoPeriodo.add(this.jScrollColumnasSelectReporteTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPeriodo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPeriodo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPeriodo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPeriodo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPeriodo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPeriodo=new JScrollPane(this.jListRelacionesSelectReporteTipoPeriodo);
			
			this.jScrollRelacionesSelectReporteTipoPeriodo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPeriodo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPeriodo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoPeriodo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPeriodo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPeriodo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPeriodo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPeriodo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPeriodo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPeriodo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPeriodo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPeriodo.add(this.jLabelGenerarExcelReporteDinamicoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPeriodo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPeriodo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPeriodo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPeriodo.setToolTipText("Generar EXCEL"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPeriodo.add(this.jButtonGenerarExcelReporteDinamicoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPeriodo.add(this.jComboBoxTiposReportesDinamicoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPeriodo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPeriodo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPeriodo.add(this.jLabelTiposArchivoReporteDinamicoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPeriodo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPeriodo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPeriodo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPeriodo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPeriodo.setToolTipText("Generar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPeriodo.add(this.jButtonGenerarReporteDinamicoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPeriodo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPeriodo.setToolTipText("Cancelar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPeriodo.add(this.jButtonCerrarReporteDinamicoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPeriodo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPeriodo= new JScrollPane(jPanelReporteDinamicoTipoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Periodos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPeriodo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPeriodo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPeriodo);
		this.jInternalFrameReporteDinamicoTipoPeriodo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPeriodo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPeriodo.setName("jPanelImportacionTipoPeriodo"); 
		
		this.jPanelImportacionTipoPeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPeriodo.setLayout(gridaBagLayoutImportacionTipoPeriodo);
		
		
		this.jInternalFrameImportacionTipoPeriodo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPeriodo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPeriodo.setResizable(true);
	    this.jInternalFrameImportacionTipoPeriodo.setClosable(true);
	    this.jInternalFrameImportacionTipoPeriodo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPeriodo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPeriodo.setResizable(true);
	    this.jInternalFrameImportacionTipoPeriodo.setClosable(true);
	    this.jInternalFrameImportacionTipoPeriodo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Periodos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPeriodo = new JLabelMe();

		this.jLabelArchivoImportacionTipoPeriodo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPeriodo.add(this.jLabelArchivoImportacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPeriodo = new JFileChooser();		
		this.jFileChooserImportacionTipoPeriodo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPeriodo = new JButtonMe();
		this.jButtonAbrirImportacionTipoPeriodo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPeriodo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPeriodo.setToolTipText("Generar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPeriodo.add(this.jButtonAbrirImportacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPeriodo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPeriodo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPeriodo.add(this.jLabelPathArchivoImportacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPeriodo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPeriodo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPeriodo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPeriodo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPeriodo.add(this.jTextFieldPathArchivoImportacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPeriodo = new JButtonMe();
		this.jButtonGenerarImportacionTipoPeriodo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPeriodo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPeriodo.setToolTipText("Generar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPeriodo.add(this.jButtonGenerarImportacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPeriodo = new JButtonMe();
		this.jButtonCerrarImportacionTipoPeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPeriodo.setToolTipText("Cancelar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPeriodo.add(this.jButtonCerrarImportacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPeriodo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPeriodo= new JScrollPane(jPanelImportacionTipoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPeriodo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPeriodo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPeriodo);
		this.jInternalFrameImportacionTipoPeriodo.getContentPane().add(this.jScrollPanelImportacionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPeriodo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPeriodo = new JButtonMe();
			this.jButtonAbrirOrderByTipoPeriodo.setText("Orden");
			this.jButtonAbrirOrderByTipoPeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPeriodo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPeriodo";
			inputMap = this.jButtonAbrirOrderByTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPeriodo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPeriodo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPeriodo.setName("jPanelOrderByTipoPeriodo"); 
			
			this.jPanelOrderByTipoPeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPeriodo.setLayout(gridaBagLayoutOrderByTipoPeriodo);
			
			
			this.jTableDatosTipoPeriodoOrderBy = new JTableMe();        
			this.jTableDatosTipoPeriodoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPeriodoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPeriodoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPeriodoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPeriodoOrderBy.setViewportView(this.jTableDatosTipoPeriodoOrderBy);
			this.jTableDatosTipoPeriodoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPeriodoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPeriodo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPeriodo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPeriodo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPeriodo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPeriodo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPeriodo.setTitle("Orden");
			this.jInternalFrameOrderByTipoPeriodo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPeriodo.setResizable(true);
			this.jInternalFrameOrderByTipoPeriodo.setClosable(true);
			this.jInternalFrameOrderByTipoPeriodo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Periodos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPeriodo.ipady =150;
				
			this.jPanelOrderByTipoPeriodo.add(jScrollPanelDatosTipoPeriodoOrderBy, this.gridBagConstraintsTipoPeriodo);//this.jTableDatosTipoPeriodoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPeriodo = new JButtonMe();
			this.jButtonCerrarOrderByTipoPeriodo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPeriodo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPeriodo.setToolTipText("Cancelar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPeriodo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPeriodo.add(this.jButtonCerrarOrderByTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPeriodo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPeriodo= new JScrollPane(jPanelOrderByTipoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPeriodo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPeriodo);
			
			this.jInternalFrameOrderByTipoPeriodo.getContentPane().add(this.jScrollPanelOrderByTipoPeriodo, this.gridBagConstraintsTipoPeriodo);			
		
		} else {
			this.jButtonAbrirOrderByTipoPeriodo = new JButtonMe();
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
			&& this.tipoperiodoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPeriodo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPeriodo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPeriodo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPeriodo.getRowHeight();//TipoPeriodoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPeriodo.isSelected()) {
					iHeightTable=TipoPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPeriodo.isSelected()) {
					iHeightTable=TipoPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPeriodo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPeriodo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPeriodo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPeriodo!=null && this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPeriodo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPeriodo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPeriodo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoperiodoLogic.getTipoPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoperiodos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPeriodo> TraerTipoPeriodoBeans(List<TipoPeriodo> tipoperiodos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPeriodo tipoperiodo:tipoperiodos) {
					
				if(!(TipoPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoperiodo.setsDetalleGeneralEntityReporte(TipoPeriodoConstantesFunciones.getTipoPeriodoDescripcion(tipoperiodo));
										
						
					
						
					
				} else  {
							
					//tipoperiodo.setsDetalleGeneralEntityReporte(tipoperiodo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoperiodobeans.add(tipoperiodobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoperiodos;
    }
	//PARA REPORTES FIN
}
