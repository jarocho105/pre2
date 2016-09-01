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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.EstadoPeriodoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class EstadoPeriodoJInternalFrame extends EstadoPeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoPeriodo;
	
	protected JMenuBar jmenuBarEstadoPeriodo;
	
	protected JMenu jmenuEstadoPeriodo;
	protected JMenu jmenuDatosEstadoPeriodo;
	protected JMenu jmenuArchivoEstadoPeriodo;
	protected JMenu jmenuAccionesEstadoPeriodo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPeriodo;	
	protected GridBagConstraints gridBagConstraintsEstadoPeriodo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoPeriodoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoPeriodo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoPeriodo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoPeriodo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPeriodoSessionBean estadoperiodoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoPeriodo> estadoperiodos;		
	public List<EstadoPeriodo> estadoperiodosEliminados;	
	public List<EstadoPeriodo> estadoperiodosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoPeriodo;		
	protected JButton jButtonAbrirOrderByEstadoPeriodo;
	
	
	//protected JPanel jPanelOrderByEstadoPeriodo;
	//public JScrollPane jScrollPanelOrderByEstadoPeriodo;	
	//protected JButton jButtonCerrarOrderByEstadoPeriodo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoPeriodoLogic estadoperiodoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoPeriodo;
	public JScrollPane jScrollPanelDatosEdicionEstadoPeriodo;
	public JScrollPane jScrollPanelDatosGeneralEstadoPeriodo;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoPeriodoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoPeriodo;
	//public JScrollPane jScrollPanelImportacionEstadoPeriodo;
	
	
	
	protected JPanel jPanelAccionesEstadoPeriodo;
	
    protected JPanel jPanelPaginacionEstadoPeriodo;
    protected JPanel jPanelParametrosReportesEstadoPeriodo;
	protected JPanel jPanelParametrosReportesAccionesEstadoPeriodo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoPeriodo;
	protected JPanel jPanelParametrosAuxiliar2EstadoPeriodo;
	protected JPanel jPanelParametrosAuxiliar3EstadoPeriodo;
	protected JPanel jPanelParametrosAuxiliar4EstadoPeriodo;
	//protected JPanel jPanelParametrosAuxiliar5EstadoPeriodo;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoPeriodo;
	//protected JPanel jPanelImportacionEstadoPeriodo;
	
	
	public JTable jTableDatosEstadoPeriodo;
	
	
	
	//public JTable jTableDatosEstadoPeriodoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoPeriodo;
	protected JButton jButtonDuplicarEstadoPeriodo;
	protected JButton jButtonCopiarEstadoPeriodo;
	protected JButton jButtonVerFormEstadoPeriodo;
	protected JButton jButtonNuevoRelacionesEstadoPeriodo;
	protected JButton jButtonModificarEstadoPeriodo;
	
    protected JButton jButtonGuardarCambiosTablaEstadoPeriodo;
	protected JButton jButtonCerrarEstadoPeriodo;
	
	
	protected JButton jButtonRecargarInformacionEstadoPeriodo;
	protected JButton jButtonProcesarInformacionEstadoPeriodo;
	
	
	protected JButton jButtonAnterioresEstadoPeriodo;
	protected JButton jButtonSiguientesEstadoPeriodo;
	protected JButton jButtonNuevoGuardarCambiosEstadoPeriodo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoPeriodo;
	//protected JButton jButtonCerrarReporteDinamicoEstadoPeriodo;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoPeriodo;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoPeriodo;
	//protected JButton jButtonGenerarImportacionEstadoPeriodo;
	//protected JButton jButtonCerrarImportacionEstadoPeriodo;
	//protected JFileChooser jFileChooserImportacionEstadoPeriodo;
	//protected File fileImportacionEstadoPeriodo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPeriodo;
	protected JButton jButtonDuplicarToolBarEstadoPeriodo;
	protected JButton jButtonNuevoRelacionesToolBarEstadoPeriodo;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoPeriodo;
	protected JButton jButtonCopiarToolBarEstadoPeriodo;
	protected JButton jButtonVerFormToolBarEstadoPeriodo;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoPeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPeriodo;
	protected JButton jButtonCerrarToolBarEstadoPeriodo;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoPeriodo;
	protected JButton jButtonProcesarInformacionToolBarEstadoPeriodo;
	protected JButton jButtonAnterioresToolBarEstadoPeriodo;
	protected JButton jButtonSiguientesToolBarEstadoPeriodo;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoPeriodo;
	protected JButton jButtonAbrirOrderByToolBarEstadoPeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPeriodo;
	protected JMenuItem jMenuItemDuplicarEstadoPeriodo;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoPeriodo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoPeriodo;
	protected JMenuItem jMenuItemCopiarEstadoPeriodo;
	protected JMenuItem jMenuItemVerFormEstadoPeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPeriodo;
	protected JMenuItem jMenuItemCerrarEstadoPeriodo;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPeriodo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoPeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPeriodo;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoPeriodo;
	protected JMenuItem jMenuItemProcesarInformacionEstadoPeriodo;
	protected JMenuItem jMenuItemAnterioresEstadoPeriodo;
	protected JMenuItem jMenuItemSiguientesEstadoPeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPeriodo;
	protected JMenuItem jMenuItemAbrirOrderByEstadoPeriodo;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPeriodo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoPeriodo;
	protected JCheckBox jCheckBoxSeleccionadosEstadoPeriodo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoPeriodo;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoPeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoPeriodo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoPeriodo;
	protected JTextField jTextFieldValorCampoGeneralEstadoPeriodo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoPeriodo;
	//public JList<Reporte> jListColumnasSelectReporteEstadoPeriodo;
	//public JScrollPane jScrollColumnasSelectReporteEstadoPeriodo;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoPeriodo;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoPeriodo;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoPeriodo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoPeriodo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoPeriodo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoPeriodo;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoPeriodo;
	
		
	//public JLabel jLabelArchivoImportacionEstadoPeriodo;	
	//public JLabel jLabelPathArchivoImportacionEstadoPeriodo;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoPeriodo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoPeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoPeriodo;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoPeriodo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoPeriodo;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoPeriodo;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoPeriodo;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoPeriodo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoPeriodo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoPeriodo;	
	
	
	
	
	
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
	public EstadoPeriodoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPeriodoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPeriodoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPeriodoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoPeriodo)	{
		this.jButtonRecargarInformacionEstadoPeriodo = jButtonRecargarInformacionEstadoPeriodo;
	}
	
	public JButton getjButtonProcesarInformacionEstadoPeriodo() {
		return this.jButtonProcesarInformacionEstadoPeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPeriodo)	{
		this.jButtonProcesarInformacionEstadoPeriodo = jButtonProcesarInformacionEstadoPeriodo;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoPeriodo() {
		return this.jButtonRecargarInformacionEstadoPeriodo;
	}
	
	
	public List<EstadoPeriodo> getestadoperiodos() {
		return this.estadoperiodos;
	}

	public void setestadoperiodos(List<EstadoPeriodo> estadoperiodos) {
		this.estadoperiodos = estadoperiodos;
	}
	
	public List<EstadoPeriodo> getestadoperiodosAux() {
		return this.estadoperiodosAux;
	}

	public void setestadoperiodosAux(List<EstadoPeriodo> estadoperiodosAux) {
		this.estadoperiodosAux = estadoperiodosAux;
	}
	
	public List<EstadoPeriodo> getestadoperiodosEliminados() {
		return this.estadoperiodosEliminados;
	}

	public void setEstadoPeriodosEliminados(List<EstadoPeriodo> estadoperiodosEliminados) {
		this.estadoperiodosEliminados = estadoperiodosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoPeriodo() {
		return jComboBoxTiposSeleccionarEstadoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoPeriodo(
			JComboBox jComboBoxTiposSeleccionarEstadoPeriodo) {
		this.jComboBoxTiposSeleccionarEstadoPeriodo = jComboBoxTiposSeleccionarEstadoPeriodo;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoPeriodo() {
		return jTextFieldValorCampoGeneralEstadoPeriodo;
	}

	public void setjTextFieldValorCampoGeneralEstadoPeriodo(
			JTextField jTextFieldValorCampoGeneralEstadoPeriodo) {
		this.jTextFieldValorCampoGeneralEstadoPeriodo = jTextFieldValorCampoGeneralEstadoPeriodo;
	}

	public void setBorderResaltarValorCampoGeneralEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoPeriodo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoPeriodo() {
		return this.jCheckBoxSeleccionarTodosEstadoPeriodo;
	}

	public void setjCheckBoxSeleccionarTodosEstadoPeriodo(
			JCheckBox jCheckBoxSeleccionarTodosEstadoPeriodo) {
		this.jCheckBoxSeleccionarTodosEstadoPeriodo = jCheckBoxSeleccionarTodosEstadoPeriodo;
	}

	public void setBorderResaltarSeleccionarTodosEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoPeriodo() {
		return this.jCheckBoxSeleccionadosEstadoPeriodo;
	}

	public void setjCheckBoxSeleccionadosEstadoPeriodo(
			JCheckBox jCheckBoxSeleccionadosEstadoPeriodo) {
		this.jCheckBoxSeleccionadosEstadoPeriodo = jCheckBoxSeleccionadosEstadoPeriodo;
	}
	
	public void setBorderResaltarSeleccionadosEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoPeriodo() {
		return this.jComboBoxTiposArchivosReportesEstadoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoPeriodo(
			JComboBox jComboBoxTiposArchivosReportesEstadoPeriodo) {
		this.jComboBoxTiposArchivosReportesEstadoPeriodo = jComboBoxTiposArchivosReportesEstadoPeriodo;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoPeriodo() {
		return this.jComboBoxTiposReportesEstadoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoPeriodo(
			JComboBox jComboBoxTiposReportesEstadoPeriodo) {
		this.jComboBoxTiposReportesEstadoPeriodo = jComboBoxTiposReportesEstadoPeriodo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoPeriodo() {
	//	return jComboBoxTiposReportesDinamicoEstadoPeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoPeriodo(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoPeriodo) {
	//	this.jComboBoxTiposReportesDinamicoEstadoPeriodo = jComboBoxTiposReportesDinamicoEstadoPeriodo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoPeriodo() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoPeriodo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo = jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo;
	//}
	
	public void setBorderResaltarTiposReportesEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoPeriodo() {
		return this.jComboBoxTiposGraficosReportesEstadoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoPeriodo(
			JComboBox jComboBoxTiposGraficosReportesEstadoPeriodo) {
		this.jComboBoxTiposGraficosReportesEstadoPeriodo = jComboBoxTiposGraficosReportesEstadoPeriodo;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoPeriodo() {
		return this.jComboBoxTiposPaginacionEstadoPeriodo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoPeriodo(
			JComboBox jComboBoxTiposPaginacionEstadoPeriodo) {
		this.jComboBoxTiposPaginacionEstadoPeriodo = jComboBoxTiposPaginacionEstadoPeriodo;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoPeriodo() {
		return this.jComboBoxTiposRelacionesEstadoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPeriodo() {
		return this.jComboBoxTiposAccionesEstadoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPeriodo(
			JComboBox jComboBoxTiposRelacionesEstadoPeriodo) {
		this.jComboBoxTiposRelacionesEstadoPeriodo = jComboBoxTiposRelacionesEstadoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPeriodo(
			JComboBox jComboBoxTiposAccionesEstadoPeriodo) {
		this.jComboBoxTiposAccionesEstadoPeriodo = jComboBoxTiposAccionesEstadoPeriodo;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoPeriodo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoPeriodo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoPeriodo() {
	//	return jCheckBoxConGraficoDinamicoEstadoPeriodo;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoPeriodo(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoPeriodo) {
	//	this.jCheckBoxConGraficoDinamicoEstadoPeriodo = jCheckBoxConGraficoDinamicoEstadoPeriodo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoPeriodo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoPeriodo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoPeriodo .setBorder(borderResaltar);		
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
		this.estadoperiodoSessionBean=new EstadoPeriodoSessionBean();
		
		this.estadoperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoperiodoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Periodo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoPeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoPeriodo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"nuevo","nuevo","Nuevo"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"duplicar","duplicar","Duplicar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"copiar","copiar","Copiar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"ver_form","ver_form","Ver"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"recargar","recargar","Recargar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoPeriodo,this.jTtoolBarEstadoPeriodo,
							"cerrar","cerrar","Salir"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoPeriodo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoPeriodo;
			
				this.jButtonProcesarInformacionToolBarEstadoPeriodo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoPeriodo;
				
		//protected JButton jButtonModificarToolBarEstadoPeriodo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoPeriodo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoPeriodo=new JMenuMe("General");
		this.jmenuArchivoEstadoPeriodo=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoPeriodo=new JMenuMe("Acciones");
		this.jmenuDatosEstadoPeriodo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoPeriodo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoPeriodo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoPeriodo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoPeriodo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoPeriodo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoPeriodo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoPeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoPeriodo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoPeriodo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoPeriodo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoPeriodo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoPeriodo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoPeriodo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoPeriodo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoPeriodo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoPeriodo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoPeriodo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoPeriodo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoPeriodo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoPeriodo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoPeriodo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoPeriodo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoPeriodo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoPeriodo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoPeriodo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoPeriodo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoPeriodo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoPeriodo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoPeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoPeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoPeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoPeriodo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoPeriodo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoPeriodo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoPeriodo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoPeriodo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoPeriodo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoPeriodo.add(this.jMenuItemCerrarEstadoPeriodo);
			
			this.jmenuAccionesEstadoPeriodo.add(this.jMenuItemNuevoEstadoPeriodo);
			this.jmenuAccionesEstadoPeriodo.add(this.jMenuItemNuevoGuardarCambiosEstadoPeriodo);
			this.jmenuAccionesEstadoPeriodo.add(this.jMenuItemNuevoRelacionesEstadoPeriodo);
			this.jmenuAccionesEstadoPeriodo.add(this.jMenuItemGuardarCambiosTablaEstadoPeriodo);		
			this.jmenuAccionesEstadoPeriodo.add(this.jMenuItemDuplicarEstadoPeriodo);		
			this.jmenuAccionesEstadoPeriodo.add(this.jMenuItemCopiarEstadoPeriodo);		
			this.jmenuAccionesEstadoPeriodo.add(this.jMenuItemVerFormEstadoPeriodo);		
			
			this.jmenuDatosEstadoPeriodo.add(this.jMenuItemRecargarInformacionEstadoPeriodo);				
			this.jmenuDatosEstadoPeriodo.add(this.jMenuItemAnterioresEstadoPeriodo);				
			this.jmenuDatosEstadoPeriodo.add(this.jMenuItemSiguientesEstadoPeriodo);				
			this.jmenuDatosEstadoPeriodo.add(this.jMenuItemAbrirOrderByEstadoPeriodo);				
			this.jmenuDatosEstadoPeriodo.add(this.jMenuItemMostrarOcultarEstadoPeriodo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoPeriodo.add(this.jMenuItemGuardarCambiosEstadoPeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoPeriodo.add(this.jmenuArchivoEstadoPeriodo);		
			this.jmenuBarEstadoPeriodo.add(this.jmenuAccionesEstadoPeriodo);		
			this.jmenuBarEstadoPeriodo.add(this.jmenuDatosEstadoPeriodo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoPeriodo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoPeriodo() {
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
			//this.jInternalFrameDetalleEstadoPeriodo = new EstadoPeriodoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Periodo DATOS");
			this.jInternalFrameDetalleFormEstadoPeriodo = new EstadoPeriodoDetalleFormJInternalFrame(jDesktopPane,this.estadoperiodoSessionBean.getConGuardarRelaciones(),this.estadoperiodoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoPeriodo = null;//new EstadoPeriodoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPeriodo= new GridBagLayout();
		
		
		this.jTableDatosEstadoPeriodo = new JTableMe();      
		
		String sToolTipEstadoPeriodo="";
		sToolTipEstadoPeriodo=EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPeriodo+="(Contabilidad.EstadoPeriodo)";
		}
		
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPeriodo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoPeriodo.setToolTipText(sToolTipEstadoPeriodo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoPeriodo);
		this.jTableDatosEstadoPeriodo.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoPeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoPeriodo.setRowSelectionAllowed(true);
		this.jTableDatosEstadoPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoPeriodo = new JButtonMe();
		this.jButtonDuplicarEstadoPeriodo = new JButtonMe();
		this.jButtonCopiarEstadoPeriodo = new JButtonMe();
		this.jButtonVerFormEstadoPeriodo = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoPeriodo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoPeriodo = new JButtonMe();
		this.jButtonCerrarEstadoPeriodo = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPeriodo = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoPeriodo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Periodo";
		
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Periodos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPeriodo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoPeriodo=new ReporteDinamicoJInternalFrame(EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoPeriodo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoPeriodo=new ImportacionJInternalFrame(EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoPeriodo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoPeriodo = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoPeriodo.setText("Orden");
		this.jButtonAbrirOrderByEstadoPeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPeriodo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPeriodo,false,this);
			
			//this.cargarOrderByEstadoPeriodo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPeriodo,true,this);
			
			//this.cargarOrderByEstadoPeriodo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoPeriodo.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoPeriodo.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoPeriodo.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoPeriodo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPeriodo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPeriodo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoPeriodo.setText("Nuevo");
		this.jButtonDuplicarEstadoPeriodo.setText("Duplicar");
		this.jButtonCopiarEstadoPeriodo.setText("Copiar");
		this.jButtonVerFormEstadoPeriodo.setText("Ver");
		this.jButtonNuevoRelacionesEstadoPeriodo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoPeriodo.setText("Guardar");
		this.jButtonCerrarEstadoPeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPeriodo,"nuevo_button","Nuevo",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoPeriodo,"duplicar_button","Duplicar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoPeriodo,"copiar_button","Copiar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoPeriodo,"ver_form","Ver",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoPeriodo,"nuevorelaciones_button","Nuevo Rel",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPeriodo,"guardarcambiostabla_button","Guardar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPeriodo,"cerrar_button","Salir",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoPeriodo.setToolTipText("Nuevo"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoPeriodo.setToolTipText("Duplicar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoPeriodo.setToolTipText("Copiar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoPeriodo.setToolTipText("Ver"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoPeriodo.setToolTipText("Nuevo Rel"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoPeriodo.setToolTipText("Guardar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPeriodo.setToolTipText("Salir"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPeriodo";
		inputMap = this.jButtonNuevoEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPeriodo"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoPeriodo";
		inputMap = this.jButtonDuplicarEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoPeriodo"));
		
		//COPIAR
		sMapKey = "CopiarEstadoPeriodo";
		inputMap = this.jButtonCopiarEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoPeriodo"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoPeriodo";
		inputMap = this.jButtonVerFormEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoPeriodo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoPeriodo";
		inputMap = this.jButtonNuevoRelacionesEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoPeriodo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoPeriodo";
		inputMap = this.jButtonModificarEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoPeriodo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoPeriodo";
		inputMap = this.jButtonCerrarEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPeriodo";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPeriodo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoPeriodo.setName("jPanelParametrosReportesEstadoPeriodo"); 
		
		this.jPanelParametrosReportesAccionesEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoPeriodo.setName("jPanelParametrosReportesAccionesEstadoPeriodo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoPeriodo = new JButtonMe();
		this.jButtonRecargarInformacionEstadoPeriodo.setText("Recargar");
		this.jButtonRecargarInformacionEstadoPeriodo.setToolTipText("Recargar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoPeriodo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoPeriodo = new JButtonMe();
		this.jButtonProcesarInformacionEstadoPeriodo.setText("Procesar");
		this.jButtonProcesarInformacionEstadoPeriodo.setToolTipText("Procesar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoPeriodo.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoPeriodo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPeriodo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPeriodo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPeriodo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoPeriodo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPeriodo.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoPeriodo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPeriodo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoPeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoPeriodo.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoPeriodo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoPeriodo.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoPeriodo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPeriodo.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPeriodo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoPeriodo.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoPeriodo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoPeriodo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoPeriodo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPeriodo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPeriodo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoPeriodo = new JLabelMe();
		
		this.jLabelAccionesEstadoPeriodo.setText("Acciones");		
		this.jLabelAccionesEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoPeriodo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoPeriodo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoPeriodo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoPeriodo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoPeriodo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoPeriodo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoPeriodo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoPeriodo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoPeriodo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoPeriodo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoPeriodo.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoPeriodo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoPeriodo = new JButtonMe();
		//this.jButtonAnterioresEstadoPeriodo.setText("<<");
        this.jButtonAnterioresEstadoPeriodo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoPeriodo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoPeriodo = new JButtonMe();
		//this.jButtonSiguientesEstadoPeriodo.setText(">>");
        this.jButtonSiguientesEstadoPeriodo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoPeriodo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoPeriodo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoPeriodo.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoPeriodo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoPeriodo,"nuevoguardarcambios_button","Nue",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoPeriodo";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoPeriodo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoPeriodo";
		inputMap = this.jButtonRecargarInformacionEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoPeriodo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoPeriodo";
		inputMap = this.jButtonSiguientesEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoPeriodo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoPeriodo";
		inputMap = this.jButtonAnterioresEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoPeriodo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoPeriodo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoPeriodo.setMinimumSize(new Dimension(this.getWidth(),EstadoPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPeriodo.setMaximumSize(new Dimension(this.getWidth(),EstadoPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPeriodo.setPreferredSize(new Dimension(this.getWidth(),EstadoPeriodoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPeriodoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoPeriodo = new GridBagLayout();

			this.jPanelPaginacionEstadoPeriodo.setLayout(gridaBagLayoutPaginacionEstadoPeriodo);						
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = 0;
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoPeriodo.add(this.jButtonAnterioresEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
					
						
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPeriodo.gridy = 0;
			
			this.jPanelPaginacionEstadoPeriodo.add(this.jButtonNuevoGuardarCambiosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
						
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPeriodo.gridy = 0;
			this.jPanelPaginacionEstadoPeriodo.add(this.jButtonSiguientesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = 1;
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPeriodo.add(this.jButtonNuevoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
						
			
			
			if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
				this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPeriodo.gridy = 1;
				this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoPeriodo.add(this.jButtonGuardarCambiosTablaEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			}
			
			
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = 1;
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPeriodo.add(this.jButtonDuplicarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = 1;
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPeriodo.add(this.jButtonCopiarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = 1;
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPeriodo.add(this.jButtonVerFormEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = 1;
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoPeriodo.add(this.jButtonCerrarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
		
		
		this.jButtonRecargarInformacionEstadoPeriodo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPeriodo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPeriodo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoPeriodo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPeriodo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPeriodo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoPeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoPeriodo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPeriodo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPeriodo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoPeriodo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPeriodo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPeriodo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoPeriodo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPeriodo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPeriodo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoPeriodo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPeriodo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPeriodo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoPeriodo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPeriodo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPeriodo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoPeriodo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoPeriodo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoPeriodo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoPeriodo.setLayout(gridaBagParametrosReportesEstadoPeriodo);
			this.jPanelParametrosReportesAccionesEstadoPeriodo.setLayout(gridaBagParametrosReportesAccionesEstadoPeriodo);
			
			
			this.jPanelParametrosAuxiliar1EstadoPeriodo.setLayout(gridaBagParametrosAuxiliar1EstadoPeriodo);
			this.jPanelParametrosAuxiliar2EstadoPeriodo.setLayout(gridaBagParametrosAuxiliar2EstadoPeriodo);
			this.jPanelParametrosAuxiliar3EstadoPeriodo.setLayout(gridaBagParametrosAuxiliar3EstadoPeriodo);
			this.jPanelParametrosAuxiliar4EstadoPeriodo.setLayout(gridaBagParametrosAuxiliar4EstadoPeriodo);
			//this.jPanelParametrosAuxiliar5EstadoPeriodo.setLayout(gridaBagParametrosAuxiliar2EstadoPeriodo);			
			
			
			
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jButtonRecargarInformacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPeriodo.add(this.jComboBoxTiposPaginacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPeriodo.add(this.jCheckBoxConAltoMaximoTablaEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPeriodo.add(this.jComboBoxTiposArchivosReportesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jPanelParametrosAuxiliar1EstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoPeriodo.add(this.jComboBoxTiposReportesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jPanelParametrosAuxiliar4EstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jComboBoxTiposReportesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jCheckBoxGenerarReporteEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jPanelParametrosAuxiliar2EstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jLabelAccionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
				this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoPeriodo.add(this.jButtonAbrirOrderByEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jComboBoxTiposSeleccionarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);			
			
			
			/*
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPeriodo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jCheckBoxSeleccionarTodosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPeriodo.add(this.jCheckBoxSeleccionarTodosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);															
				
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPeriodo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPeriodo.add(this.jCheckBoxSeleccionadosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jPanelParametrosAuxiliar3EstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jComboBoxTiposRelacionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
				
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPeriodo.add(this.jComboBoxTiposAccionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoPeriodo = new GridBagLayout();

			this.jScrollPanelDatosEstadoPeriodo.setLayout(gridaBagLayoutDatosEstadoPeriodo);
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = 0;
			this.gridBagConstraintsEstadoPeriodo.gridx = 0;
			
			this.jScrollPanelDatosEstadoPeriodo.add(this.jTableDatosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoPeriodo.setViewportView(this.jTableDatosEstadoPeriodo);
		this.jTableDatosEstadoPeriodo.setFillsViewportHeight(true);
		this.jTableDatosEstadoPeriodo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoPeriodo= new GridBagLayout();
		this.jPanelAccionesEstadoPeriodo.setLayout(gridaBagLayoutAccionesEstadoPeriodo);
		
		
		/*	
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;
			
		this.jPanelAccionesEstadoPeriodo.add(this.jButtonNuevoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPeriodo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPeriodo.gridx = 0;		
			//this.gridBagConstraintsEstadoPeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPeriodo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;		
		//this.gridBagConstraintsEstadoPeriodo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoPeriodo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoPeriodo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);								
		
		
		/*
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		*/		
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPeriodo.gridx =0;
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
				
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoPeriodo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPeriodo = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoPeriodo.setLayout(gridaBagLayoutBusquedasParametrosEstadoPeriodo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoPeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			
			
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
			
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoPeriodo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoPeriodo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoPeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoPeriodo.setName("jPanelReporteDinamicoEstadoPeriodo"); 
		
		this.jPanelReporteDinamicoEstadoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoPeriodo.setLayout(gridaBagLayoutReporteDinamicoEstadoPeriodo);
		
		
		this.jInternalFrameReporteDinamicoEstadoPeriodo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoPeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoPeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoPeriodo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoPeriodo.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoPeriodo.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoPeriodo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Periodos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoPeriodo = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoPeriodo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPeriodo.add(this.jLabelColumnasSelectReporteEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoPeriodo = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoPeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoPeriodo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPeriodo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoPeriodo=new JScrollPane(this.jListColumnasSelectReporteEstadoPeriodo);
			
			this.jScrollColumnasSelectReporteEstadoPeriodo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPeriodo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPeriodo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPeriodo.add(this.jListColumnasSelectReporteEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		this.jPanelReporteDinamicoEstadoPeriodo.add(this.jScrollColumnasSelectReporteEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoPeriodo = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoPeriodo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoPeriodo = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoPeriodo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoPeriodo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoPeriodo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPeriodo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPeriodo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoPeriodo=new JScrollPane(this.jListRelacionesSelectReporteEstadoPeriodo);
			
			this.jScrollRelacionesSelectReporteEstadoPeriodo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPeriodo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPeriodo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoPeriodo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoPeriodo = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoPeriodo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoPeriodo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoPeriodo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoPeriodo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoPeriodo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPeriodo.add(this.jLabelGenerarExcelReporteDinamicoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPeriodo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoPeriodo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoPeriodo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoPeriodo.setToolTipText("Generar EXCEL"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoPeriodo.add(this.jButtonGenerarExcelReporteDinamicoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPeriodo.add(this.jComboBoxTiposReportesDinamicoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoPeriodo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoPeriodo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPeriodo.add(this.jLabelTiposArchivoReporteDinamicoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPeriodo.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoPeriodo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoPeriodo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoPeriodo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoPeriodo.setToolTipText("Generar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPeriodo.add(this.jButtonGenerarReporteDinamicoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoPeriodo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoPeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoPeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoPeriodo.setToolTipText("Cancelar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPeriodo.add(this.jButtonCerrarReporteDinamicoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoPeriodo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoPeriodo= new JScrollPane(jPanelReporteDinamicoEstadoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoPeriodo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPeriodo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPeriodo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Periodos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPeriodo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoPeriodo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoPeriodo);
		this.jInternalFrameReporteDinamicoEstadoPeriodo.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoPeriodo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoPeriodo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoPeriodo.setName("jPanelImportacionEstadoPeriodo"); 
		
		this.jPanelImportacionEstadoPeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoPeriodo.setLayout(gridaBagLayoutImportacionEstadoPeriodo);
		
		
		this.jInternalFrameImportacionEstadoPeriodo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoPeriodo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoPeriodo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPeriodo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPeriodo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoPeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPeriodo.setResizable(true);
	    this.jInternalFrameImportacionEstadoPeriodo.setClosable(true);
	    this.jInternalFrameImportacionEstadoPeriodo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPeriodo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPeriodo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoPeriodo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPeriodo.setResizable(true);
	    this.jInternalFrameImportacionEstadoPeriodo.setClosable(true);
	    this.jInternalFrameImportacionEstadoPeriodo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoPeriodo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPeriodo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPeriodo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Periodos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoPeriodo = new JLabelMe();

		this.jLabelArchivoImportacionEstadoPeriodo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPeriodo.add(this.jLabelArchivoImportacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoPeriodo = new JFileChooser();		
		this.jFileChooserImportacionEstadoPeriodo.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoPeriodo = new JButtonMe();
		this.jButtonAbrirImportacionEstadoPeriodo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoPeriodo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoPeriodo.setToolTipText("Generar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPeriodo.add(this.jButtonAbrirImportacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoPeriodo = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoPeriodo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPeriodo.add(this.jLabelPathArchivoImportacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoPeriodo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoPeriodo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPeriodo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPeriodo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPeriodo.add(this.jTextFieldPathArchivoImportacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoPeriodo = new JButtonMe();
		this.jButtonGenerarImportacionEstadoPeriodo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoPeriodo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoPeriodo.setToolTipText("Generar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPeriodo.add(this.jButtonGenerarImportacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoPeriodo = new JButtonMe();
		this.jButtonCerrarImportacionEstadoPeriodo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoPeriodo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoPeriodo.setToolTipText("Cancelar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPeriodo.add(this.jButtonCerrarImportacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoPeriodo = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoPeriodo= new JScrollPane(jPanelImportacionEstadoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoPeriodo.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoPeriodo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoPeriodo);
		this.jInternalFrameImportacionEstadoPeriodo.getContentPane().add(this.jScrollPanelImportacionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoPeriodo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoPeriodo = new JButtonMe();
			this.jButtonAbrirOrderByEstadoPeriodo.setText("Orden");
			this.jButtonAbrirOrderByEstadoPeriodo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPeriodo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoPeriodo";
			inputMap = this.jButtonAbrirOrderByEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoPeriodo"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoPeriodo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoPeriodo.setName("jPanelOrderByEstadoPeriodo"); 
			
			this.jPanelOrderByEstadoPeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoPeriodo.setLayout(gridaBagLayoutOrderByEstadoPeriodo);
			
			
			this.jTableDatosEstadoPeriodoOrderBy = new JTableMe();        
			this.jTableDatosEstadoPeriodoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoPeriodoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoPeriodoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoPeriodoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoPeriodoOrderBy.setViewportView(this.jTableDatosEstadoPeriodoOrderBy);
			this.jTableDatosEstadoPeriodoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoPeriodoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoPeriodo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoPeriodo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoPeriodo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoPeriodo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoPeriodo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoPeriodo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoPeriodo.setTitle("Orden");
			this.jInternalFrameOrderByEstadoPeriodo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoPeriodo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoPeriodo.setResizable(true);
			this.jInternalFrameOrderByEstadoPeriodo.setClosable(true);
			this.jInternalFrameOrderByEstadoPeriodo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoPeriodo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPeriodo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPeriodo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Periodos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoPeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoPeriodo.ipady =150;
				
			this.jPanelOrderByEstadoPeriodo.add(jScrollPanelDatosEstadoPeriodoOrderBy, this.gridBagConstraintsEstadoPeriodo);//this.jTableDatosEstadoPeriodoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoPeriodo = new JButtonMe();
			this.jButtonCerrarOrderByEstadoPeriodo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoPeriodo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoPeriodo.setToolTipText("Cancelar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoPeriodo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoPeriodo.add(this.jButtonCerrarOrderByEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoPeriodo = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoPeriodo= new JScrollPane(jPanelOrderByEstadoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoPeriodo.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoPeriodo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoPeriodo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoPeriodo);
			
			this.jInternalFrameOrderByEstadoPeriodo.getContentPane().add(this.jScrollPanelOrderByEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);			
		
		} else {
			this.jButtonAbrirOrderByEstadoPeriodo = new JButtonMe();
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
			&& this.estadoperiodoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoPeriodo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoPeriodo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoPeriodo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoPeriodo.getRowHeight();//EstadoPeriodoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPeriodo.isSelected()) {
					iHeightTable=EstadoPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPeriodo.isSelected()) {
					iHeightTable=EstadoPeriodoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPeriodoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoPeriodo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPeriodo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPeriodo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoPeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoPeriodo!=null && this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoPeriodo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoPeriodo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoPeriodo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoPeriodo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPeriodo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPeriodo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoperiodoLogic.getEstadoPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoperiodos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoPeriodo> TraerEstadoPeriodoBeans(List<EstadoPeriodo> estadoperiodos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoPeriodo estadoperiodo:estadoperiodos) {
					
				if(!(EstadoPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoperiodo.setsDetalleGeneralEntityReporte(EstadoPeriodoConstantesFunciones.getEstadoPeriodoDescripcion(estadoperiodo));
										
					estadoperiodo.setes_defecto_descripcion(EstadoPeriodoConstantesFunciones.getes_defectoDescripcion(estadoperiodo));	
					
						
					
				} else  {
							
					//estadoperiodo.setsDetalleGeneralEntityReporte(estadoperiodo.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoperiodobeans.add(estadoperiodobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoperiodos;
    }
	//PARA REPORTES FIN
}
