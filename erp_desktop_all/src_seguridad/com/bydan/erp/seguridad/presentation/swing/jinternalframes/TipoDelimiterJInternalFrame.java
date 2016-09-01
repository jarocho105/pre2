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
import com.bydan.erp.seguridad.util.TipoDelimiterConstantesFunciones;

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
public class TipoDelimiterJInternalFrame extends TipoDelimiterBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDelimiter;
	
	protected JMenuBar jmenuBarTipoDelimiter;
	
	protected JMenu jmenuTipoDelimiter;
	protected JMenu jmenuDatosTipoDelimiter;
	protected JMenu jmenuArchivoTipoDelimiter;
	protected JMenu jmenuAccionesTipoDelimiter;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDelimiter;	
	protected GridBagConstraints gridBagConstraintsTipoDelimiter;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDelimiterDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDelimiter;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDelimiter;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDelimiter;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoDelimiterSessionBean tipodelimiterSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDelimiter> tipodelimiters;		
	public List<TipoDelimiter> tipodelimitersEliminados;	
	public List<TipoDelimiter> tipodelimitersAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDelimiter;		
	protected JButton jButtonAbrirOrderByTipoDelimiter;
	
	
	//protected JPanel jPanelOrderByTipoDelimiter;
	//public JScrollPane jScrollPanelOrderByTipoDelimiter;	
	//protected JButton jButtonCerrarOrderByTipoDelimiter;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDelimiterLogic tipodelimiterLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDelimiter;
	public JScrollPane jScrollPanelDatosEdicionTipoDelimiter;
	public JScrollPane jScrollPanelDatosGeneralTipoDelimiter;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDelimiterOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDelimiter;
	//public JScrollPane jScrollPanelImportacionTipoDelimiter;
	
	
	
	protected JPanel jPanelAccionesTipoDelimiter;
	
    protected JPanel jPanelPaginacionTipoDelimiter;
    protected JPanel jPanelParametrosReportesTipoDelimiter;
	protected JPanel jPanelParametrosReportesAccionesTipoDelimiter;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDelimiter;
	protected JPanel jPanelParametrosAuxiliar2TipoDelimiter;
	protected JPanel jPanelParametrosAuxiliar3TipoDelimiter;
	protected JPanel jPanelParametrosAuxiliar4TipoDelimiter;
	//protected JPanel jPanelParametrosAuxiliar5TipoDelimiter;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDelimiter;
	//protected JPanel jPanelImportacionTipoDelimiter;
	
	
	public JTable jTableDatosTipoDelimiter;
	
	
	
	//public JTable jTableDatosTipoDelimiterOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDelimiter;
	protected JButton jButtonDuplicarTipoDelimiter;
	protected JButton jButtonCopiarTipoDelimiter;
	protected JButton jButtonVerFormTipoDelimiter;
	protected JButton jButtonNuevoRelacionesTipoDelimiter;
	protected JButton jButtonModificarTipoDelimiter;
	
    protected JButton jButtonGuardarCambiosTablaTipoDelimiter;
	protected JButton jButtonCerrarTipoDelimiter;
	
	
	protected JButton jButtonRecargarInformacionTipoDelimiter;
	protected JButton jButtonProcesarInformacionTipoDelimiter;
	
	
	protected JButton jButtonAnterioresTipoDelimiter;
	protected JButton jButtonSiguientesTipoDelimiter;
	protected JButton jButtonNuevoGuardarCambiosTipoDelimiter;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDelimiter;
	//protected JButton jButtonCerrarReporteDinamicoTipoDelimiter;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDelimiter;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDelimiter;
	//protected JButton jButtonGenerarImportacionTipoDelimiter;
	//protected JButton jButtonCerrarImportacionTipoDelimiter;
	//protected JFileChooser jFileChooserImportacionTipoDelimiter;
	//protected File fileImportacionTipoDelimiter;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDelimiter;
	protected JButton jButtonDuplicarToolBarTipoDelimiter;
	protected JButton jButtonNuevoRelacionesToolBarTipoDelimiter;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDelimiter;
	protected JButton jButtonCopiarToolBarTipoDelimiter;
	protected JButton jButtonVerFormToolBarTipoDelimiter;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDelimiter;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDelimiter;
	protected JButton jButtonCerrarToolBarTipoDelimiter;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDelimiter;
	protected JButton jButtonProcesarInformacionToolBarTipoDelimiter;
	protected JButton jButtonAnterioresToolBarTipoDelimiter;
	protected JButton jButtonSiguientesToolBarTipoDelimiter;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDelimiter;
	protected JButton jButtonAbrirOrderByToolBarTipoDelimiter;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDelimiter;
	protected JMenuItem jMenuItemDuplicarTipoDelimiter;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDelimiter;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDelimiter;
	protected JMenuItem jMenuItemCopiarTipoDelimiter;
	protected JMenuItem jMenuItemVerFormTipoDelimiter;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDelimiter;
	protected JMenuItem jMenuItemCerrarTipoDelimiter;
	protected JMenuItem jMenuItemDetalleCerrarTipoDelimiter;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDelimiter;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDelimiter;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDelimiter;
	protected JMenuItem jMenuItemProcesarInformacionTipoDelimiter;
	protected JMenuItem jMenuItemAnterioresTipoDelimiter;
	protected JMenuItem jMenuItemSiguientesTipoDelimiter;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDelimiter;
	protected JMenuItem jMenuItemAbrirOrderByTipoDelimiter;
	protected JMenuItem jMenuItemMostrarOcultarTipoDelimiter;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDelimiter;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDelimiter;
	protected JCheckBox jCheckBoxSeleccionadosTipoDelimiter;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDelimiter;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDelimiter;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDelimiter;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDelimiter;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDelimiter;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDelimiter;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDelimiter;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDelimiter;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDelimiter;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDelimiter;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDelimiter;
	protected JTextField jTextFieldValorCampoGeneralTipoDelimiter;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDelimiter;
	//public JList<Reporte> jListColumnasSelectReporteTipoDelimiter;
	//public JScrollPane jScrollColumnasSelectReporteTipoDelimiter;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDelimiter;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDelimiter;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDelimiter;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDelimiter;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDelimiter;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDelimiter;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDelimiter;
	
		
	//public JLabel jLabelArchivoImportacionTipoDelimiter;	
	//public JLabel jLabelPathArchivoImportacionTipoDelimiter;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDelimiter;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDelimiter;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDelimiter;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDelimiter;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDelimiter;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDelimiter;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDelimiter;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDelimiter;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDelimiter;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDelimiter;	
	
	
	
	
	
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
	public TipoDelimiterJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDelimiterJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDelimiterJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDelimiterJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDelimiter)	{
		this.jButtonRecargarInformacionTipoDelimiter = jButtonRecargarInformacionTipoDelimiter;
	}
	
	public JButton getjButtonProcesarInformacionTipoDelimiter() {
		return this.jButtonProcesarInformacionTipoDelimiter;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDelimiter)	{
		this.jButtonProcesarInformacionTipoDelimiter = jButtonProcesarInformacionTipoDelimiter;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDelimiter() {
		return this.jButtonRecargarInformacionTipoDelimiter;
	}
	
	
	public List<TipoDelimiter> gettipodelimiters() {
		return this.tipodelimiters;
	}

	public void settipodelimiters(List<TipoDelimiter> tipodelimiters) {
		this.tipodelimiters = tipodelimiters;
	}
	
	public List<TipoDelimiter> gettipodelimitersAux() {
		return this.tipodelimitersAux;
	}

	public void settipodelimitersAux(List<TipoDelimiter> tipodelimitersAux) {
		this.tipodelimitersAux = tipodelimitersAux;
	}
	
	public List<TipoDelimiter> gettipodelimitersEliminados() {
		return this.tipodelimitersEliminados;
	}

	public void setTipoDelimitersEliminados(List<TipoDelimiter> tipodelimitersEliminados) {
		this.tipodelimitersEliminados = tipodelimitersEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDelimiter() {
		return jComboBoxTiposSeleccionarTipoDelimiter;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDelimiter(
			JComboBox jComboBoxTiposSeleccionarTipoDelimiter) {
		this.jComboBoxTiposSeleccionarTipoDelimiter = jComboBoxTiposSeleccionarTipoDelimiter;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDelimiter .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDelimiter() {
		return jTextFieldValorCampoGeneralTipoDelimiter;
	}

	public void setjTextFieldValorCampoGeneralTipoDelimiter(
			JTextField jTextFieldValorCampoGeneralTipoDelimiter) {
		this.jTextFieldValorCampoGeneralTipoDelimiter = jTextFieldValorCampoGeneralTipoDelimiter;
	}

	public void setBorderResaltarValorCampoGeneralTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDelimiter .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDelimiter() {
		return this.jCheckBoxSeleccionarTodosTipoDelimiter;
	}

	public void setjCheckBoxSeleccionarTodosTipoDelimiter(
			JCheckBox jCheckBoxSeleccionarTodosTipoDelimiter) {
		this.jCheckBoxSeleccionarTodosTipoDelimiter = jCheckBoxSeleccionarTodosTipoDelimiter;
	}

	public void setBorderResaltarSeleccionarTodosTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDelimiter .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDelimiter() {
		return this.jCheckBoxSeleccionadosTipoDelimiter;
	}

	public void setjCheckBoxSeleccionadosTipoDelimiter(
			JCheckBox jCheckBoxSeleccionadosTipoDelimiter) {
		this.jCheckBoxSeleccionadosTipoDelimiter = jCheckBoxSeleccionadosTipoDelimiter;
	}
	
	public void setBorderResaltarSeleccionadosTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDelimiter .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDelimiter() {
		return this.jComboBoxTiposArchivosReportesTipoDelimiter;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDelimiter(
			JComboBox jComboBoxTiposArchivosReportesTipoDelimiter) {
		this.jComboBoxTiposArchivosReportesTipoDelimiter = jComboBoxTiposArchivosReportesTipoDelimiter;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDelimiter .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDelimiter() {
		return this.jComboBoxTiposReportesTipoDelimiter;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDelimiter(
			JComboBox jComboBoxTiposReportesTipoDelimiter) {
		this.jComboBoxTiposReportesTipoDelimiter = jComboBoxTiposReportesTipoDelimiter;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDelimiter() {
	//	return jComboBoxTiposReportesDinamicoTipoDelimiter;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDelimiter(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDelimiter) {
	//	this.jComboBoxTiposReportesDinamicoTipoDelimiter = jComboBoxTiposReportesDinamicoTipoDelimiter;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDelimiter() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDelimiter;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDelimiter(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDelimiter) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDelimiter = jComboBoxTiposArchivosReportesDinamicoTipoDelimiter;
	//}
	
	public void setBorderResaltarTiposReportesTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDelimiter .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDelimiter() {
		return this.jComboBoxTiposGraficosReportesTipoDelimiter;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDelimiter(
			JComboBox jComboBoxTiposGraficosReportesTipoDelimiter) {
		this.jComboBoxTiposGraficosReportesTipoDelimiter = jComboBoxTiposGraficosReportesTipoDelimiter;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDelimiter .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDelimiter() {
		return this.jComboBoxTiposPaginacionTipoDelimiter;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDelimiter(
			JComboBox jComboBoxTiposPaginacionTipoDelimiter) {
		this.jComboBoxTiposPaginacionTipoDelimiter = jComboBoxTiposPaginacionTipoDelimiter;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDelimiter .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDelimiter() {
		return this.jComboBoxTiposRelacionesTipoDelimiter;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDelimiter() {
		return this.jComboBoxTiposAccionesTipoDelimiter;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDelimiter(
			JComboBox jComboBoxTiposRelacionesTipoDelimiter) {
		this.jComboBoxTiposRelacionesTipoDelimiter = jComboBoxTiposRelacionesTipoDelimiter;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDelimiter(
			JComboBox jComboBoxTiposAccionesTipoDelimiter) {
		this.jComboBoxTiposAccionesTipoDelimiter = jComboBoxTiposAccionesTipoDelimiter;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDelimiter .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDelimiter() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDelimiter .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDelimiter() {
	//	return jCheckBoxConGraficoDinamicoTipoDelimiter;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDelimiter(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDelimiter) {
	//	this.jCheckBoxConGraficoDinamicoTipoDelimiter = jCheckBoxConGraficoDinamicoTipoDelimiter;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDelimiter() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDelimiter.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDelimiter .setBorder(borderResaltar);		
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
		this.tipodelimiterSessionBean=new TipoDelimiterSessionBean();
		
		this.tipodelimiterSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodelimiterSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodelimiterSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDelimiterJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDelimiterJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDelimiterJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDelimiterJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDelimiterJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Delimiter MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDelimiterJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDelimiter= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"nuevo","nuevo","Nuevo"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"duplicar","duplicar","Duplicar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"copiar","copiar","Copiar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"ver_form","ver_form","Ver"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"recargar","recargar","Recargar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDelimiter,this.jTtoolBarTipoDelimiter,
							"cerrar","cerrar","Salir"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDelimiter=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDelimiter;
			
				this.jButtonProcesarInformacionToolBarTipoDelimiter=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDelimiter;
				
		//protected JButton jButtonModificarToolBarTipoDelimiter;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDelimiter=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDelimiter=new JMenuMe("General");
		this.jmenuArchivoTipoDelimiter=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDelimiter=new JMenuMe("Acciones");
		this.jmenuDatosTipoDelimiter=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDelimiter= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDelimiter.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDelimiter,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDelimiter= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDelimiter.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDelimiter,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDelimiter= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDelimiter.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDelimiter,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDelimiter= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDelimiter.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDelimiter,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDelimiter= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDelimiter.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDelimiter,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDelimiter= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDelimiter.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDelimiter,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDelimiter= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDelimiter.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDelimiter,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDelimiter= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDelimiter.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDelimiter,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDelimiter= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDelimiter.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDelimiter,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDelimiter= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDelimiter.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDelimiter,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDelimiter= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDelimiter.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDelimiter,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDelimiter= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDelimiter.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDelimiter,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDelimiter= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDelimiter.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDelimiter,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDelimiter= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDelimiter.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDelimiter,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDelimiter= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDelimiter.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDelimiter,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDelimiter= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDelimiter.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDelimiter,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDelimiter= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDelimiter.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDelimiter,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDelimiter.add(this.jMenuItemCerrarTipoDelimiter);
			
			this.jmenuAccionesTipoDelimiter.add(this.jMenuItemNuevoTipoDelimiter);
			this.jmenuAccionesTipoDelimiter.add(this.jMenuItemNuevoGuardarCambiosTipoDelimiter);
			this.jmenuAccionesTipoDelimiter.add(this.jMenuItemNuevoRelacionesTipoDelimiter);
			this.jmenuAccionesTipoDelimiter.add(this.jMenuItemGuardarCambiosTablaTipoDelimiter);		
			this.jmenuAccionesTipoDelimiter.add(this.jMenuItemDuplicarTipoDelimiter);		
			this.jmenuAccionesTipoDelimiter.add(this.jMenuItemCopiarTipoDelimiter);		
			this.jmenuAccionesTipoDelimiter.add(this.jMenuItemVerFormTipoDelimiter);		
			
			this.jmenuDatosTipoDelimiter.add(this.jMenuItemRecargarInformacionTipoDelimiter);				
			this.jmenuDatosTipoDelimiter.add(this.jMenuItemAnterioresTipoDelimiter);				
			this.jmenuDatosTipoDelimiter.add(this.jMenuItemSiguientesTipoDelimiter);				
			this.jmenuDatosTipoDelimiter.add(this.jMenuItemAbrirOrderByTipoDelimiter);				
			this.jmenuDatosTipoDelimiter.add(this.jMenuItemMostrarOcultarTipoDelimiter);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDelimiter.add(this.jMenuItemGuardarCambiosTipoDelimiter);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDelimiter.add(this.jmenuArchivoTipoDelimiter);		
			this.jmenuBarTipoDelimiter.add(this.jmenuAccionesTipoDelimiter);		
			this.jmenuBarTipoDelimiter.add(this.jmenuDatosTipoDelimiter);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDelimiter);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDelimiter() {
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
			//this.jInternalFrameDetalleTipoDelimiter = new TipoDelimiterDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Delimiter DATOS");
			this.jInternalFrameDetalleFormTipoDelimiter = new TipoDelimiterDetalleFormJInternalFrame(jDesktopPane,this.tipodelimiterSessionBean.getConGuardarRelaciones(),this.tipodelimiterSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDelimiter = null;//new TipoDelimiterDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDelimiter= new GridBagLayout();
		
		
		this.jTableDatosTipoDelimiter = new JTableMe();      
		
		String sToolTipTipoDelimiter="";
		sToolTipTipoDelimiter=TipoDelimiterConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDelimiter+="(Seguridad.TipoDelimiter)";
		}
		
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDelimiter+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDelimiter.setToolTipText(sToolTipTipoDelimiter);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDelimiter);
		this.jTableDatosTipoDelimiter.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDelimiter.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDelimiter.setRowSelectionAllowed(true);
		this.jTableDatosTipoDelimiter.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDelimiter,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDelimiter = new JButtonMe();
		this.jButtonDuplicarTipoDelimiter = new JButtonMe();
		this.jButtonCopiarTipoDelimiter = new JButtonMe();
		this.jButtonVerFormTipoDelimiter = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDelimiter = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDelimiter = new JButtonMe();
		this.jButtonCerrarTipoDelimiter = new JButtonMe();
		
		this.jScrollPanelDatosTipoDelimiter = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDelimiter = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Delimiter";
		
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Delimiters" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDelimiter.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDelimiter.setToolTipText("Acciones");
        this.jPanelAccionesTipoDelimiter.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDelimiter=new ReporteDinamicoJInternalFrame(TipoDelimiterConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDelimiter();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDelimiter=new ImportacionJInternalFrame(TipoDelimiterConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDelimiter();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDelimiter = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDelimiter.setText("Orden");
		this.jButtonAbrirOrderByTipoDelimiter.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDelimiter,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDelimiter=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDelimiter,false,this);
			
			//this.cargarOrderByTipoDelimiter(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDelimiter=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDelimiter,true,this);
			
			//this.cargarOrderByTipoDelimiter(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDelimiter.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDelimiter.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDelimiter.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDelimiter.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDelimiter.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDelimiter.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDelimiter.setText("Nuevo");
		this.jButtonDuplicarTipoDelimiter.setText("Duplicar");
		this.jButtonCopiarTipoDelimiter.setText("Copiar");
		this.jButtonVerFormTipoDelimiter.setText("Ver");
		this.jButtonNuevoRelacionesTipoDelimiter.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDelimiter.setText("Guardar");
		this.jButtonCerrarTipoDelimiter.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDelimiter,"nuevo_button","Nuevo",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDelimiter,"duplicar_button","Duplicar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDelimiter,"copiar_button","Copiar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDelimiter,"ver_form","Ver",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDelimiter,"nuevorelaciones_button","Nuevo Rel",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDelimiter,"guardarcambiostabla_button","Guardar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDelimiter,"cerrar_button","Salir",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDelimiter.setToolTipText("Nuevo"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDelimiter.setToolTipText("Duplicar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDelimiter.setToolTipText("Copiar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDelimiter.setToolTipText("Ver"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDelimiter.setToolTipText("Nuevo Rel"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDelimiter.setToolTipText("Guardar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDelimiter.setToolTipText("Salir"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDelimiter";
		inputMap = this.jButtonNuevoTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDelimiter.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDelimiter"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDelimiter";
		inputMap = this.jButtonDuplicarTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDelimiter.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDelimiter"));
		
		//COPIAR
		sMapKey = "CopiarTipoDelimiter";
		inputMap = this.jButtonCopiarTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDelimiter.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDelimiter"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDelimiter";
		inputMap = this.jButtonVerFormTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDelimiter.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDelimiter"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDelimiter";
		inputMap = this.jButtonNuevoRelacionesTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDelimiter"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDelimiter";
		inputMap = this.jButtonModificarTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDelimiter"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDelimiter";
		inputMap = this.jButtonCerrarTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDelimiter"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDelimiter";
		inputMap = this.jButtonGuardarCambiosTablaTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDelimiter"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDelimiter= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDelimiter= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDelimiter= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDelimiter= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDelimiter= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDelimiter.setName("jPanelParametrosReportesTipoDelimiter"); 
		
		this.jPanelParametrosReportesAccionesTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDelimiter.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDelimiter.setName("jPanelParametrosReportesAccionesTipoDelimiter"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDelimiter = new JButtonMe();
		this.jButtonRecargarInformacionTipoDelimiter.setText("Recargar");
		this.jButtonRecargarInformacionTipoDelimiter.setToolTipText("Recargar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDelimiter,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDelimiter = new JButtonMe();
		this.jButtonProcesarInformacionTipoDelimiter.setText("Procesar");
		this.jButtonProcesarInformacionTipoDelimiter.setToolTipText("Procesar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDelimiter.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDelimiter.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDelimiter.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDelimiter.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDelimiter.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDelimiter.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDelimiter.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDelimiter.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDelimiter.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDelimiter.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDelimiter.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDelimiter.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDelimiter.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDelimiter.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDelimiter.setText("Accion");
		this.jComboBoxTiposAccionesTipoDelimiter.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDelimiter.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDelimiter.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDelimiter=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDelimiter.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDelimiter.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDelimiter.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDelimiter = new JLabelMe();
		
		this.jLabelAccionesTipoDelimiter.setText("Acciones");		
		this.jLabelAccionesTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDelimiter = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDelimiter.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDelimiter.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDelimiter = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDelimiter.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDelimiter.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDelimiter = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDelimiter.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDelimiter.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDelimiter = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDelimiter.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDelimiter.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDelimiter = new JButtonMe();
		//this.jButtonAnterioresTipoDelimiter.setText("<<");
        this.jButtonAnterioresTipoDelimiter.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDelimiter,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDelimiter = new JButtonMe();
		//this.jButtonSiguientesTipoDelimiter.setText(">>");
        this.jButtonSiguientesTipoDelimiter.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDelimiter,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDelimiter = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDelimiter.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDelimiter.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDelimiter,"nuevoguardarcambios_button","Nue",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDelimiter";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDelimiter"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDelimiter";
		inputMap = this.jButtonRecargarInformacionTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDelimiter"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDelimiter";
		inputMap = this.jButtonSiguientesTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDelimiter"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDelimiter";
		inputMap = this.jButtonAnterioresTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDelimiter"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDelimiter();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDelimiter.setMinimumSize(new Dimension(this.getWidth(),TipoDelimiterBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDelimiterBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDelimiter.setMaximumSize(new Dimension(this.getWidth(),TipoDelimiterBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDelimiterBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDelimiter.setPreferredSize(new Dimension(this.getWidth(),TipoDelimiterBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDelimiterBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDelimiter = new GridBagLayout();

			this.jPanelPaginacionTipoDelimiter.setLayout(gridaBagLayoutPaginacionTipoDelimiter);						
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = 0;
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDelimiter.add(this.jButtonAnterioresTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
					
						
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDelimiter.gridy = 0;
			
			this.jPanelPaginacionTipoDelimiter.add(this.jButtonNuevoGuardarCambiosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
						
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDelimiter.gridy = 0;
			this.jPanelPaginacionTipoDelimiter.add(this.jButtonSiguientesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = 1;
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDelimiter.add(this.jButtonNuevoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
						
			
			
			if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
				this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDelimiter.gridy = 1;
				this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDelimiter.add(this.jButtonGuardarCambiosTablaTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			}
			
			
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = 1;
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDelimiter.add(this.jButtonDuplicarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = 1;
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDelimiter.add(this.jButtonCopiarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = 1;
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDelimiter.add(this.jButtonVerFormTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = 1;
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDelimiter.add(this.jButtonCerrarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
		
		
		this.jButtonRecargarInformacionTipoDelimiter.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDelimiter.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDelimiter.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDelimiter.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDelimiter.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDelimiter.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDelimiter.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDelimiter.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDelimiter.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDelimiter.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDelimiter.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDelimiter.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDelimiter.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDelimiter.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDelimiter.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDelimiter.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDelimiter.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDelimiter.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDelimiter.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDelimiter.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDelimiter.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDelimiter.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDelimiter.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDelimiter.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDelimiter.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDelimiter.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDelimiter.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDelimiter.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDelimiter.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDelimiter.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDelimiter.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDelimiter.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDelimiter.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDelimiter.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDelimiter.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDelimiter.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDelimiter = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDelimiter = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDelimiter = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDelimiter = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDelimiter = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDelimiter = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDelimiter.setLayout(gridaBagParametrosReportesTipoDelimiter);
			this.jPanelParametrosReportesAccionesTipoDelimiter.setLayout(gridaBagParametrosReportesAccionesTipoDelimiter);
			
			
			this.jPanelParametrosAuxiliar1TipoDelimiter.setLayout(gridaBagParametrosAuxiliar1TipoDelimiter);
			this.jPanelParametrosAuxiliar2TipoDelimiter.setLayout(gridaBagParametrosAuxiliar2TipoDelimiter);
			this.jPanelParametrosAuxiliar3TipoDelimiter.setLayout(gridaBagParametrosAuxiliar3TipoDelimiter);
			this.jPanelParametrosAuxiliar4TipoDelimiter.setLayout(gridaBagParametrosAuxiliar4TipoDelimiter);
			//this.jPanelParametrosAuxiliar5TipoDelimiter.setLayout(gridaBagParametrosAuxiliar2TipoDelimiter);			
			
			
			
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDelimiter.add(this.jButtonRecargarInformacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDelimiter.add(this.jComboBoxTiposPaginacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDelimiter.add(this.jCheckBoxConAltoMaximoTablaTipoDelimiter, this.gridBagConstraintsTipoDelimiter);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDelimiter.add(this.jComboBoxTiposArchivosReportesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDelimiter.add(this.jPanelParametrosAuxiliar1TipoDelimiter, this.gridBagConstraintsTipoDelimiter);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDelimiter.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDelimiter.add(this.jComboBoxTiposReportesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDelimiter.add(this.jPanelParametrosAuxiliar4TipoDelimiter, this.gridBagConstraintsTipoDelimiter);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDelimiter.add(this.jComboBoxTiposReportesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDelimiter.add(this.jCheckBoxGenerarReporteTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDelimiter.add(this.jPanelParametrosAuxiliar2TipoDelimiter, this.gridBagConstraintsTipoDelimiter);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDelimiter.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDelimiter.add(this.jLabelAccionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
				this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDelimiter.add(this.jButtonAbrirOrderByTipoDelimiter, this.gridBagConstraintsTipoDelimiter);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDelimiter.add(this.jComboBoxTiposSeleccionarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);			
			
			
			/*
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDelimiter.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDelimiter.add(this.jCheckBoxSeleccionarTodosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDelimiter.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDelimiter.add(this.jCheckBoxSeleccionarTodosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);															
				
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDelimiter.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDelimiter.add(this.jCheckBoxSeleccionadosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDelimiter.add(this.jPanelParametrosAuxiliar3TipoDelimiter, this.gridBagConstraintsTipoDelimiter);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDelimiter.add(this.jComboBoxTiposRelacionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
				
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDelimiter.add(this.jComboBoxTiposAccionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDelimiter = new GridBagLayout();

			this.jScrollPanelDatosTipoDelimiter.setLayout(gridaBagLayoutDatosTipoDelimiter);
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = 0;
			this.gridBagConstraintsTipoDelimiter.gridx = 0;
			
			this.jScrollPanelDatosTipoDelimiter.add(this.jTableDatosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDelimiter.setViewportView(this.jTableDatosTipoDelimiter);
		this.jTableDatosTipoDelimiter.setFillsViewportHeight(true);
		this.jTableDatosTipoDelimiter.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDelimiter= new GridBagLayout();
		this.jPanelAccionesTipoDelimiter.setLayout(gridaBagLayoutAccionesTipoDelimiter);
		
		
		/*	
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = 0;
		this.gridBagConstraintsTipoDelimiter.gridx = 0;
			
		this.jPanelAccionesTipoDelimiter.add(this.jButtonNuevoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDelimiter = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDelimiter);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();						
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDelimiter.gridx = 0;		
			//this.gridBagConstraintsTipoDelimiter.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDelimiter.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDelimiter.gridx = 0;		
		//this.gridBagConstraintsTipoDelimiter.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDelimiter.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDelimiter);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);								
		
		
		/*
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		*/		
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDelimiter.gridx =0;
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDelimiter.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
				
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDelimiter= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDelimiter = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDelimiter.setLayout(gridaBagLayoutBusquedasParametrosTipoDelimiter);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDelimiter=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDelimiter.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDelimiter.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDelimiter.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			
			
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
			
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDelimiter;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDelimiter() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDelimiter = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDelimiter.setName("jPanelReporteDinamicoTipoDelimiter"); 
		
		this.jPanelReporteDinamicoTipoDelimiter.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDelimiter.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDelimiter.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDelimiter.setLayout(gridaBagLayoutReporteDinamicoTipoDelimiter);
		
		
		this.jInternalFrameReporteDinamicoTipoDelimiter= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDelimiter = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDelimiter= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDelimiter.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDelimiter.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDelimiter.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDelimiter.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDelimiter.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDelimiter.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDelimiter.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDelimiter.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDelimiter.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDelimiter.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDelimiter.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Delimiters"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDelimiter = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDelimiter.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDelimiter.add(this.jLabelColumnasSelectReporteTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDelimiter = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDelimiter.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDelimiter.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDelimiter.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDelimiter.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDelimiter.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDelimiter=new JScrollPane(this.jListColumnasSelectReporteTipoDelimiter);
			
			this.jScrollColumnasSelectReporteTipoDelimiter.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDelimiter.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDelimiter.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDelimiter.add(this.jListColumnasSelectReporteTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		this.jPanelReporteDinamicoTipoDelimiter.add(this.jScrollColumnasSelectReporteTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDelimiter = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDelimiter.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDelimiter = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDelimiter.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDelimiter.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDelimiter.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDelimiter.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDelimiter.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDelimiter=new JScrollPane(this.jListRelacionesSelectReporteTipoDelimiter);
			
			this.jScrollRelacionesSelectReporteTipoDelimiter.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDelimiter.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDelimiter.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoDelimiter = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDelimiter = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDelimiter = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDelimiter = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDelimiter.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDelimiter.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDelimiter.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDelimiter.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDelimiter = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDelimiter.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDelimiter.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDelimiter.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDelimiter.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDelimiter = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDelimiter.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDelimiter.add(this.jLabelGenerarExcelReporteDinamicoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDelimiter = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDelimiter.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDelimiter,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDelimiter.setToolTipText("Generar EXCEL"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		//this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDelimiter.add(this.jButtonGenerarExcelReporteDinamicoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDelimiter.add(this.jComboBoxTiposReportesDinamicoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDelimiter = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDelimiter.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDelimiter.add(this.jLabelTiposArchivoReporteDinamicoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDelimiter.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDelimiter = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDelimiter.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDelimiter,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDelimiter.setToolTipText("Generar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDelimiter.add(this.jButtonGenerarReporteDinamicoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDelimiter = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDelimiter.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDelimiter,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDelimiter.setToolTipText("Cancelar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDelimiter.add(this.jButtonCerrarReporteDinamicoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDelimiter = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDelimiter= new JScrollPane(jPanelReporteDinamicoTipoDelimiter,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDelimiter.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDelimiter.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDelimiter.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Delimiters"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDelimiter.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDelimiter.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDelimiter.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDelimiter);
		this.jInternalFrameReporteDinamicoTipoDelimiter.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDelimiter() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDelimiter = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDelimiter.setName("jPanelImportacionTipoDelimiter"); 
		
		this.jPanelImportacionTipoDelimiter.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDelimiter.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDelimiter.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDelimiter.setLayout(gridaBagLayoutImportacionTipoDelimiter);
		
		
		this.jInternalFrameImportacionTipoDelimiter= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDelimiter= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDelimiter = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDelimiter= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDelimiter.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDelimiter.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDelimiter.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDelimiter.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDelimiter.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDelimiter.setResizable(true);
	    this.jInternalFrameImportacionTipoDelimiter.setClosable(true);
	    this.jInternalFrameImportacionTipoDelimiter.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDelimiter.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDelimiter.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDelimiter.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDelimiter.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDelimiter.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDelimiter.setResizable(true);
	    this.jInternalFrameImportacionTipoDelimiter.setClosable(true);
	    this.jInternalFrameImportacionTipoDelimiter.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDelimiter.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDelimiter.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDelimiter.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Delimiters"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDelimiter = new JLabelMe();

		this.jLabelArchivoImportacionTipoDelimiter.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDelimiter.add(this.jLabelArchivoImportacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDelimiter = new JFileChooser();		
		this.jFileChooserImportacionTipoDelimiter.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDelimiter = new JButtonMe();
		this.jButtonAbrirImportacionTipoDelimiter.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDelimiter,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDelimiter.setToolTipText("Generar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDelimiter.add(this.jButtonAbrirImportacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDelimiter = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDelimiter.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDelimiter.add(this.jLabelPathArchivoImportacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDelimiter=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDelimiter.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDelimiter.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDelimiter.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDelimiter.add(this.jTextFieldPathArchivoImportacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDelimiter = new JButtonMe();
		this.jButtonGenerarImportacionTipoDelimiter.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDelimiter,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDelimiter.setToolTipText("Generar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDelimiter.add(this.jButtonGenerarImportacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDelimiter = new JButtonMe();
		this.jButtonCerrarImportacionTipoDelimiter.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDelimiter,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDelimiter.setToolTipText("Cancelar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDelimiter.add(this.jButtonCerrarImportacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDelimiter = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDelimiter= new JScrollPane(jPanelImportacionTipoDelimiter,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDelimiter.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDelimiter.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDelimiter.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDelimiter);
		this.jInternalFrameImportacionTipoDelimiter.getContentPane().add(this.jScrollPanelImportacionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDelimiter(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDelimiter = new JButtonMe();
			this.jButtonAbrirOrderByTipoDelimiter.setText("Orden");
			this.jButtonAbrirOrderByTipoDelimiter.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDelimiter,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDelimiter";
			inputMap = this.jButtonAbrirOrderByTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDelimiter"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDelimiter = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDelimiter.setName("jPanelOrderByTipoDelimiter"); 
			
			this.jPanelOrderByTipoDelimiter.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDelimiter.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDelimiter.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDelimiter.setLayout(gridaBagLayoutOrderByTipoDelimiter);
			
			
			this.jTableDatosTipoDelimiterOrderBy = new JTableMe();        
			this.jTableDatosTipoDelimiterOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDelimiterOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDelimiterOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDelimiterOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDelimiterOrderBy.setViewportView(this.jTableDatosTipoDelimiterOrderBy);
			this.jTableDatosTipoDelimiterOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDelimiterOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDelimiter= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDelimiter= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDelimiter = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDelimiter= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDelimiter.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDelimiter.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDelimiter.setTitle("Orden");
			this.jInternalFrameOrderByTipoDelimiter.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDelimiter.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDelimiter.setResizable(true);
			this.jInternalFrameOrderByTipoDelimiter.setClosable(true);
			this.jInternalFrameOrderByTipoDelimiter.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDelimiter.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDelimiter.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDelimiter.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Delimiters"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDelimiter.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDelimiter.ipady =150;
				
			this.jPanelOrderByTipoDelimiter.add(jScrollPanelDatosTipoDelimiterOrderBy, this.gridBagConstraintsTipoDelimiter);//this.jTableDatosTipoDelimiterTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDelimiter = new JButtonMe();
			this.jButtonCerrarOrderByTipoDelimiter.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDelimiter,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDelimiter.setToolTipText("Cancelar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDelimiter.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDelimiter.add(this.jButtonCerrarOrderByTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDelimiter = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDelimiter= new JScrollPane(jPanelOrderByTipoDelimiter,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDelimiter.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDelimiter.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDelimiter.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDelimiter);
			
			this.jInternalFrameOrderByTipoDelimiter.getContentPane().add(this.jScrollPanelOrderByTipoDelimiter, this.gridBagConstraintsTipoDelimiter);			
		
		} else {
			this.jButtonAbrirOrderByTipoDelimiter = new JButtonMe();
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
			&& this.tipodelimiterSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDelimiter.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDelimiter.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDelimiter.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDelimiter.getRowHeight();//TipoDelimiterConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDelimiterConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDelimiter.isSelected()) {
					iHeightTable=TipoDelimiterConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDelimiterConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDelimiterConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDelimiterConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDelimiter.isSelected()) {
					iHeightTable=TipoDelimiterConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDelimiterConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDelimiterConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDelimiter.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDelimiter.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDelimiter.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDelimiter.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDelimiter.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDelimiter.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDelimiter!=null && this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDelimiter.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDelimiter.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDelimiter.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDelimiter.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDelimiter.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDelimiter.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodelimiterLogic.getTipoDelimiters().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodelimiters.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDelimiter> TraerTipoDelimiterBeans(List<TipoDelimiter> tipodelimiters,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDelimiter tipodelimiter:tipodelimiters) {
					
				if(!(TipoDelimiterConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDelimiterConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodelimiter.setsDetalleGeneralEntityReporte(TipoDelimiterConstantesFunciones.getTipoDelimiterDescripcion(tipodelimiter));
										
						
					
						
					
				} else  {
							
					//tipodelimiter.setsDetalleGeneralEntityReporte(tipodelimiter.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodelimiterbeans.add(tipodelimiterbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodelimiters;
    }
	//PARA REPORTES FIN
}
