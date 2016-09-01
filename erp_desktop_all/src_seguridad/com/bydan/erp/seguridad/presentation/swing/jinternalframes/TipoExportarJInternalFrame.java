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
import com.bydan.erp.seguridad.util.TipoExportarConstantesFunciones;

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
public class TipoExportarJInternalFrame extends TipoExportarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoExportar;
	
	protected JMenuBar jmenuBarTipoExportar;
	
	protected JMenu jmenuTipoExportar;
	protected JMenu jmenuDatosTipoExportar;
	protected JMenu jmenuArchivoTipoExportar;
	protected JMenu jmenuAccionesTipoExportar;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoExportar;	
	protected GridBagConstraints gridBagConstraintsTipoExportar;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoExportarDetalleFormJInternalFrame jInternalFrameDetalleFormTipoExportar;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoExportar;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoExportar;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoExportarSessionBean tipoexportarSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoExportar> tipoexportars;		
	public List<TipoExportar> tipoexportarsEliminados;	
	public List<TipoExportar> tipoexportarsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoExportar;		
	protected JButton jButtonAbrirOrderByTipoExportar;
	
	
	//protected JPanel jPanelOrderByTipoExportar;
	//public JScrollPane jScrollPanelOrderByTipoExportar;	
	//protected JButton jButtonCerrarOrderByTipoExportar;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoExportarLogic tipoexportarLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoExportar;
	public JScrollPane jScrollPanelDatosEdicionTipoExportar;
	public JScrollPane jScrollPanelDatosGeneralTipoExportar;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoExportarOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoExportar;
	//public JScrollPane jScrollPanelImportacionTipoExportar;
	
	
	
	protected JPanel jPanelAccionesTipoExportar;
	
    protected JPanel jPanelPaginacionTipoExportar;
    protected JPanel jPanelParametrosReportesTipoExportar;
	protected JPanel jPanelParametrosReportesAccionesTipoExportar;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoExportar;
	protected JPanel jPanelParametrosAuxiliar2TipoExportar;
	protected JPanel jPanelParametrosAuxiliar3TipoExportar;
	protected JPanel jPanelParametrosAuxiliar4TipoExportar;
	//protected JPanel jPanelParametrosAuxiliar5TipoExportar;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoExportar;
	//protected JPanel jPanelImportacionTipoExportar;
	
	
	public JTable jTableDatosTipoExportar;
	
	
	
	//public JTable jTableDatosTipoExportarOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoExportar;
	protected JButton jButtonDuplicarTipoExportar;
	protected JButton jButtonCopiarTipoExportar;
	protected JButton jButtonVerFormTipoExportar;
	protected JButton jButtonNuevoRelacionesTipoExportar;
	protected JButton jButtonModificarTipoExportar;
	
    protected JButton jButtonGuardarCambiosTablaTipoExportar;
	protected JButton jButtonCerrarTipoExportar;
	
	
	protected JButton jButtonRecargarInformacionTipoExportar;
	protected JButton jButtonProcesarInformacionTipoExportar;
	
	
	protected JButton jButtonAnterioresTipoExportar;
	protected JButton jButtonSiguientesTipoExportar;
	protected JButton jButtonNuevoGuardarCambiosTipoExportar;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoExportar;
	//protected JButton jButtonCerrarReporteDinamicoTipoExportar;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoExportar;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoExportar;
	//protected JButton jButtonGenerarImportacionTipoExportar;
	//protected JButton jButtonCerrarImportacionTipoExportar;
	//protected JFileChooser jFileChooserImportacionTipoExportar;
	//protected File fileImportacionTipoExportar;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoExportar;
	protected JButton jButtonDuplicarToolBarTipoExportar;
	protected JButton jButtonNuevoRelacionesToolBarTipoExportar;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoExportar;
	protected JButton jButtonCopiarToolBarTipoExportar;
	protected JButton jButtonVerFormToolBarTipoExportar;
	public JButton jButtonGuardarCambiosTablaToolBarTipoExportar;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoExportar;
	protected JButton jButtonCerrarToolBarTipoExportar;
	
	protected JButton jButtonRecargarInformacionToolBarTipoExportar;
	protected JButton jButtonProcesarInformacionToolBarTipoExportar;
	protected JButton jButtonAnterioresToolBarTipoExportar;
	protected JButton jButtonSiguientesToolBarTipoExportar;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoExportar;
	protected JButton jButtonAbrirOrderByToolBarTipoExportar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoExportar;
	protected JMenuItem jMenuItemDuplicarTipoExportar;
	protected JMenuItem jMenuItemNuevoRelacionesTipoExportar;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoExportar;
	protected JMenuItem jMenuItemCopiarTipoExportar;
	protected JMenuItem jMenuItemVerFormTipoExportar;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoExportar;
	protected JMenuItem jMenuItemCerrarTipoExportar;
	protected JMenuItem jMenuItemDetalleCerrarTipoExportar;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoExportar;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoExportar;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoExportar;
	protected JMenuItem jMenuItemProcesarInformacionTipoExportar;
	protected JMenuItem jMenuItemAnterioresTipoExportar;
	protected JMenuItem jMenuItemSiguientesTipoExportar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoExportar;
	protected JMenuItem jMenuItemAbrirOrderByTipoExportar;
	protected JMenuItem jMenuItemMostrarOcultarTipoExportar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoExportar;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoExportar;
	protected JCheckBox jCheckBoxSeleccionadosTipoExportar;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoExportar;
	protected JCheckBox jCheckBoxConGraficoReporteTipoExportar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoExportar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoExportar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoExportar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoExportar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoExportar;
	protected JTextField jTextFieldValorCampoGeneralTipoExportar;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoExportar;
	//public JList<Reporte> jListColumnasSelectReporteTipoExportar;
	//public JScrollPane jScrollColumnasSelectReporteTipoExportar;
	
	//public JLabel jLabelRelacionesSelectReporteTipoExportar;
	//public JList<Reporte> jListRelacionesSelectReporteTipoExportar;
	//public JScrollPane jScrollRelacionesSelectReporteTipoExportar;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoExportar;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoExportar;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoExportar;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoExportar;
	
		
	//public JLabel jLabelArchivoImportacionTipoExportar;	
	//public JLabel jLabelPathArchivoImportacionTipoExportar;
	//protected JTextField jTextFieldPathArchivoImportacionTipoExportar;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoExportar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoExportar;
	
	//public JLabel jLabelColumnaCategoriaValorTipoExportar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoExportar;
	
	//public JLabel jLabelColumnasValoresGraficoTipoExportar;
	//public JList<Reporte> jListColumnasValoresGraficoTipoExportar;
	//public JScrollPane jScrollColumnasValoresGraficoTipoExportar;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoExportar;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoExportar;	
	
	
	
	
	
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
	public TipoExportarJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoExportarJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoExportarJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoExportarJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoExportar)	{
		this.jButtonRecargarInformacionTipoExportar = jButtonRecargarInformacionTipoExportar;
	}
	
	public JButton getjButtonProcesarInformacionTipoExportar() {
		return this.jButtonProcesarInformacionTipoExportar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoExportar)	{
		this.jButtonProcesarInformacionTipoExportar = jButtonProcesarInformacionTipoExportar;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoExportar() {
		return this.jButtonRecargarInformacionTipoExportar;
	}
	
	
	public List<TipoExportar> gettipoexportars() {
		return this.tipoexportars;
	}

	public void settipoexportars(List<TipoExportar> tipoexportars) {
		this.tipoexportars = tipoexportars;
	}
	
	public List<TipoExportar> gettipoexportarsAux() {
		return this.tipoexportarsAux;
	}

	public void settipoexportarsAux(List<TipoExportar> tipoexportarsAux) {
		this.tipoexportarsAux = tipoexportarsAux;
	}
	
	public List<TipoExportar> gettipoexportarsEliminados() {
		return this.tipoexportarsEliminados;
	}

	public void setTipoExportarsEliminados(List<TipoExportar> tipoexportarsEliminados) {
		this.tipoexportarsEliminados = tipoexportarsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoExportar() {
		return jComboBoxTiposSeleccionarTipoExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoExportar(
			JComboBox jComboBoxTiposSeleccionarTipoExportar) {
		this.jComboBoxTiposSeleccionarTipoExportar = jComboBoxTiposSeleccionarTipoExportar;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoExportar .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoExportar() {
		return jTextFieldValorCampoGeneralTipoExportar;
	}

	public void setjTextFieldValorCampoGeneralTipoExportar(
			JTextField jTextFieldValorCampoGeneralTipoExportar) {
		this.jTextFieldValorCampoGeneralTipoExportar = jTextFieldValorCampoGeneralTipoExportar;
	}

	public void setBorderResaltarValorCampoGeneralTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoExportar .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoExportar() {
		return this.jCheckBoxSeleccionarTodosTipoExportar;
	}

	public void setjCheckBoxSeleccionarTodosTipoExportar(
			JCheckBox jCheckBoxSeleccionarTodosTipoExportar) {
		this.jCheckBoxSeleccionarTodosTipoExportar = jCheckBoxSeleccionarTodosTipoExportar;
	}

	public void setBorderResaltarSeleccionarTodosTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoExportar .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoExportar() {
		return this.jCheckBoxSeleccionadosTipoExportar;
	}

	public void setjCheckBoxSeleccionadosTipoExportar(
			JCheckBox jCheckBoxSeleccionadosTipoExportar) {
		this.jCheckBoxSeleccionadosTipoExportar = jCheckBoxSeleccionadosTipoExportar;
	}
	
	public void setBorderResaltarSeleccionadosTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoExportar .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoExportar() {
		return this.jComboBoxTiposArchivosReportesTipoExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoExportar(
			JComboBox jComboBoxTiposArchivosReportesTipoExportar) {
		this.jComboBoxTiposArchivosReportesTipoExportar = jComboBoxTiposArchivosReportesTipoExportar;
	}

	public void setBorderResaltarTiposArchivosReportesTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoExportar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoExportar() {
		return this.jComboBoxTiposReportesTipoExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoExportar(
			JComboBox jComboBoxTiposReportesTipoExportar) {
		this.jComboBoxTiposReportesTipoExportar = jComboBoxTiposReportesTipoExportar;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoExportar() {
	//	return jComboBoxTiposReportesDinamicoTipoExportar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoExportar(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoExportar) {
	//	this.jComboBoxTiposReportesDinamicoTipoExportar = jComboBoxTiposReportesDinamicoTipoExportar;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoExportar() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoExportar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoExportar(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoExportar) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoExportar = jComboBoxTiposArchivosReportesDinamicoTipoExportar;
	//}
	
	public void setBorderResaltarTiposReportesTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoExportar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoExportar() {
		return this.jComboBoxTiposGraficosReportesTipoExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoExportar(
			JComboBox jComboBoxTiposGraficosReportesTipoExportar) {
		this.jComboBoxTiposGraficosReportesTipoExportar = jComboBoxTiposGraficosReportesTipoExportar;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoExportar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoExportar() {
		return this.jComboBoxTiposPaginacionTipoExportar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoExportar(
			JComboBox jComboBoxTiposPaginacionTipoExportar) {
		this.jComboBoxTiposPaginacionTipoExportar = jComboBoxTiposPaginacionTipoExportar;
	}
	
	public void setBorderResaltarTiposPaginacionTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoExportar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoExportar() {
		return this.jComboBoxTiposRelacionesTipoExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoExportar() {
		return this.jComboBoxTiposAccionesTipoExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoExportar(
			JComboBox jComboBoxTiposRelacionesTipoExportar) {
		this.jComboBoxTiposRelacionesTipoExportar = jComboBoxTiposRelacionesTipoExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoExportar(
			JComboBox jComboBoxTiposAccionesTipoExportar) {
		this.jComboBoxTiposAccionesTipoExportar = jComboBoxTiposAccionesTipoExportar;
	}
	
	public void setBorderResaltarTiposRelacionesTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoExportar .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoExportar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoExportar.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoExportar .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoExportar() {
	//	return jCheckBoxConGraficoDinamicoTipoExportar;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoExportar(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoExportar) {
	//	this.jCheckBoxConGraficoDinamicoTipoExportar = jCheckBoxConGraficoDinamicoTipoExportar;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoExportar() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoExportar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoExportar .setBorder(borderResaltar);		
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
		this.tipoexportarSessionBean=new TipoExportarSessionBean();
		
		this.tipoexportarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoexportarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoexportarSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoExportarJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoExportarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoExportarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoExportarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoExportarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Exportar MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoExportarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoExportar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"nuevo","nuevo","Nuevo"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"duplicar","duplicar","Duplicar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"copiar","copiar","Copiar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"ver_form","ver_form","Ver"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"recargar","recargar","Recargar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoExportar,this.jTtoolBarTipoExportar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoExportar,this.jTtoolBarTipoExportar,
							"cerrar","cerrar","Salir"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoExportar=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoExportar;
			
				this.jButtonProcesarInformacionToolBarTipoExportar=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoExportar;
				
		//protected JButton jButtonModificarToolBarTipoExportar;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoExportar=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoExportar=new JMenuMe("General");
		this.jmenuArchivoTipoExportar=new JMenuMe("Archivo");
		this.jmenuAccionesTipoExportar=new JMenuMe("Acciones");
		this.jmenuDatosTipoExportar=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoExportar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoExportar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoExportar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoExportar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoExportar.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoExportar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoExportar= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoExportar.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoExportar,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoExportar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoExportar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoExportar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoExportar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoExportar.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoExportar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoExportar= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoExportar.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoExportar,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoExportar= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoExportar.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoExportar,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoExportar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoExportar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoExportar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoExportar= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoExportar.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoExportar,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoExportar= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoExportar.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoExportar,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoExportar= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoExportar.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoExportar,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoExportar= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoExportar.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoExportar,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoExportar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoExportar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoExportar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoExportar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoExportar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoExportar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoExportar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoExportar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoExportar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoExportar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoExportar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoExportar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoExportar= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoExportar.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoExportar,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoExportar.add(this.jMenuItemCerrarTipoExportar);
			
			this.jmenuAccionesTipoExportar.add(this.jMenuItemNuevoTipoExportar);
			this.jmenuAccionesTipoExportar.add(this.jMenuItemNuevoGuardarCambiosTipoExportar);
			this.jmenuAccionesTipoExportar.add(this.jMenuItemNuevoRelacionesTipoExportar);
			this.jmenuAccionesTipoExportar.add(this.jMenuItemGuardarCambiosTablaTipoExportar);		
			this.jmenuAccionesTipoExportar.add(this.jMenuItemDuplicarTipoExportar);		
			this.jmenuAccionesTipoExportar.add(this.jMenuItemCopiarTipoExportar);		
			this.jmenuAccionesTipoExportar.add(this.jMenuItemVerFormTipoExportar);		
			
			this.jmenuDatosTipoExportar.add(this.jMenuItemRecargarInformacionTipoExportar);				
			this.jmenuDatosTipoExportar.add(this.jMenuItemAnterioresTipoExportar);				
			this.jmenuDatosTipoExportar.add(this.jMenuItemSiguientesTipoExportar);				
			this.jmenuDatosTipoExportar.add(this.jMenuItemAbrirOrderByTipoExportar);				
			this.jmenuDatosTipoExportar.add(this.jMenuItemMostrarOcultarTipoExportar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoExportar.add(this.jMenuItemGuardarCambiosTipoExportar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoExportar.add(this.jmenuArchivoTipoExportar);		
			this.jmenuBarTipoExportar.add(this.jmenuAccionesTipoExportar);		
			this.jmenuBarTipoExportar.add(this.jmenuDatosTipoExportar);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoExportar);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoExportar() {
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
			//this.jInternalFrameDetalleTipoExportar = new TipoExportarDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Exportar DATOS");
			this.jInternalFrameDetalleFormTipoExportar = new TipoExportarDetalleFormJInternalFrame(jDesktopPane,this.tipoexportarSessionBean.getConGuardarRelaciones(),this.tipoexportarSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoExportar = null;//new TipoExportarDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoExportar= new GridBagLayout();
		
		
		this.jTableDatosTipoExportar = new JTableMe();      
		
		String sToolTipTipoExportar="";
		sToolTipTipoExportar=TipoExportarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoExportar+="(Seguridad.TipoExportar)";
		}
		
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoExportar+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoExportar.setToolTipText(sToolTipTipoExportar);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoExportar);
		this.jTableDatosTipoExportar.setAutoCreateRowSorter(true);
		this.jTableDatosTipoExportar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoExportar.setRowSelectionAllowed(true);
		this.jTableDatosTipoExportar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoExportar,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoExportar = new JButtonMe();
		this.jButtonDuplicarTipoExportar = new JButtonMe();
		this.jButtonCopiarTipoExportar = new JButtonMe();
		this.jButtonVerFormTipoExportar = new JButtonMe();
		this.jButtonNuevoRelacionesTipoExportar = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoExportar = new JButtonMe();
		this.jButtonCerrarTipoExportar = new JButtonMe();
		
		this.jScrollPanelDatosTipoExportar = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoExportar = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Exportar";
		
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Exportars" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoExportar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoExportar.setToolTipText("Acciones");
        this.jPanelAccionesTipoExportar.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoExportar=new ReporteDinamicoJInternalFrame(TipoExportarConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoExportar();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoExportar=new ImportacionJInternalFrame(TipoExportarConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoExportar();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoExportar = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoExportar.setText("Orden");
		this.jButtonAbrirOrderByTipoExportar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoExportar,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoExportar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoExportar,false,this);
			
			//this.cargarOrderByTipoExportar(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoExportar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoExportar,true,this);
			
			//this.cargarOrderByTipoExportar(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoExportar.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoExportar.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoExportar.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoExportar.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoExportar.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoExportar.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoExportar.setText("Nuevo");
		this.jButtonDuplicarTipoExportar.setText("Duplicar");
		this.jButtonCopiarTipoExportar.setText("Copiar");
		this.jButtonVerFormTipoExportar.setText("Ver");
		this.jButtonNuevoRelacionesTipoExportar.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoExportar.setText("Guardar");
		this.jButtonCerrarTipoExportar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoExportar,"nuevo_button","Nuevo",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoExportar,"duplicar_button","Duplicar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoExportar,"copiar_button","Copiar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoExportar,"ver_form","Ver",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoExportar,"nuevorelaciones_button","Nuevo Rel",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoExportar,"guardarcambiostabla_button","Guardar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoExportar,"cerrar_button","Salir",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoExportar.setToolTipText("Nuevo"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoExportar.setToolTipText("Duplicar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoExportar.setToolTipText("Copiar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoExportar.setToolTipText("Ver"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoExportar.setToolTipText("Nuevo Rel"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoExportar.setToolTipText("Guardar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoExportar.setToolTipText("Salir"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoExportar";
		inputMap = this.jButtonNuevoTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoExportar"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoExportar";
		inputMap = this.jButtonDuplicarTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoExportar"));
		
		//COPIAR
		sMapKey = "CopiarTipoExportar";
		inputMap = this.jButtonCopiarTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoExportar"));
		
		//VEr FORM
		sMapKey = "VerFormTipoExportar";
		inputMap = this.jButtonVerFormTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoExportar"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoExportar";
		inputMap = this.jButtonNuevoRelacionesTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoExportar"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoExportar";
		inputMap = this.jButtonModificarTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoExportar"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoExportar";
		inputMap = this.jButtonCerrarTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoExportar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoExportar";
		inputMap = this.jButtonGuardarCambiosTablaTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoExportar"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoExportar.setName("jPanelParametrosReportesTipoExportar"); 
		
		this.jPanelParametrosReportesAccionesTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoExportar.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoExportar.setName("jPanelParametrosReportesAccionesTipoExportar"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoExportar = new JButtonMe();
		this.jButtonRecargarInformacionTipoExportar.setText("Recargar");
		this.jButtonRecargarInformacionTipoExportar.setToolTipText("Recargar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoExportar,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoExportar = new JButtonMe();
		this.jButtonProcesarInformacionTipoExportar.setText("Procesar");
		this.jButtonProcesarInformacionTipoExportar.setToolTipText("Procesar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoExportar.setVisible(false);
			
		this.jButtonProcesarInformacionTipoExportar.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoExportar.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoExportar.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoExportar.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoExportar.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoExportar.setText("TIPO");       
		this.jComboBoxTiposReportesTipoExportar.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoExportar.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoExportar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoExportar.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoExportar.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoExportar.setText("Accion");
		this.jComboBoxTiposRelacionesTipoExportar.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoExportar.setText("Accion");
		this.jComboBoxTiposAccionesTipoExportar.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoExportar.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoExportar.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoExportar=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoExportar.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoExportar.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoExportar.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoExportar = new JLabelMe();
		
		this.jLabelAccionesTipoExportar.setText("Acciones");		
		this.jLabelAccionesTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoExportar = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoExportar.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoExportar.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoExportar = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoExportar.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoExportar.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoExportar = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoExportar.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoExportar.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoExportar = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoExportar.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoExportar.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoExportar = new JButtonMe();
		//this.jButtonAnterioresTipoExportar.setText("<<");
        this.jButtonAnterioresTipoExportar.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoExportar,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoExportar = new JButtonMe();
		//this.jButtonSiguientesTipoExportar.setText(">>");
        this.jButtonSiguientesTipoExportar.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoExportar,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoExportar = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoExportar.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoExportar.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoExportar,"nuevoguardarcambios_button","Nue",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoExportar";
		inputMap = this.jButtonNuevoGuardarCambiosTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoExportar"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoExportar";
		inputMap = this.jButtonRecargarInformacionTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoExportar"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoExportar";
		inputMap = this.jButtonSiguientesTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoExportar"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoExportar";
		inputMap = this.jButtonAnterioresTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoExportar"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoExportar();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoExportar.setMinimumSize(new Dimension(this.getWidth(),TipoExportarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoExportarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoExportar.setMaximumSize(new Dimension(this.getWidth(),TipoExportarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoExportarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoExportar.setPreferredSize(new Dimension(this.getWidth(),TipoExportarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoExportarBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoExportar = new GridBagLayout();

			this.jPanelPaginacionTipoExportar.setLayout(gridaBagLayoutPaginacionTipoExportar);						
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = 0;
			this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoExportar.add(this.jButtonAnterioresTipoExportar, this.gridBagConstraintsTipoExportar);
					
						
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoExportar.gridy = 0;
			
			this.jPanelPaginacionTipoExportar.add(this.jButtonNuevoGuardarCambiosTipoExportar, this.gridBagConstraintsTipoExportar);
						
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoExportar.gridy = 0;
			this.jPanelPaginacionTipoExportar.add(this.jButtonSiguientesTipoExportar, this.gridBagConstraintsTipoExportar);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = 1;
			this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoExportar.add(this.jButtonNuevoTipoExportar, this.gridBagConstraintsTipoExportar);
						
			
			
			if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoExportar = new GridBagConstraints();
				this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoExportar.gridy = 1;
				this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoExportar.add(this.jButtonGuardarCambiosTablaTipoExportar, this.gridBagConstraintsTipoExportar);
			}
			
			
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = 1;
			this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoExportar.add(this.jButtonDuplicarTipoExportar, this.gridBagConstraintsTipoExportar);
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = 1;
			this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoExportar.add(this.jButtonCopiarTipoExportar, this.gridBagConstraintsTipoExportar);
		
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = 1;
			this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoExportar.add(this.jButtonVerFormTipoExportar, this.gridBagConstraintsTipoExportar);
		
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = 1;
			this.gridBagConstraintsTipoExportar.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoExportar.add(this.jButtonCerrarTipoExportar, this.gridBagConstraintsTipoExportar);
		
		
		
		this.jButtonRecargarInformacionTipoExportar.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoExportar.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoExportar.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoExportar.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoExportar.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoExportar.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoExportar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoExportar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoExportar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoExportar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoExportar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoExportar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoExportar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoExportar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoExportar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoExportar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoExportar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoExportar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoExportar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoExportar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoExportar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoExportar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoExportar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoExportar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoExportar.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoExportar.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoExportar.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoExportar.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoExportar.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoExportar.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoExportar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoExportar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoExportar.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoExportar.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoExportar.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoExportar.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoExportar = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoExportar = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoExportar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoExportar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoExportar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoExportar = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoExportar.setLayout(gridaBagParametrosReportesTipoExportar);
			this.jPanelParametrosReportesAccionesTipoExportar.setLayout(gridaBagParametrosReportesAccionesTipoExportar);
			
			
			this.jPanelParametrosAuxiliar1TipoExportar.setLayout(gridaBagParametrosAuxiliar1TipoExportar);
			this.jPanelParametrosAuxiliar2TipoExportar.setLayout(gridaBagParametrosAuxiliar2TipoExportar);
			this.jPanelParametrosAuxiliar3TipoExportar.setLayout(gridaBagParametrosAuxiliar3TipoExportar);
			this.jPanelParametrosAuxiliar4TipoExportar.setLayout(gridaBagParametrosAuxiliar4TipoExportar);
			//this.jPanelParametrosAuxiliar5TipoExportar.setLayout(gridaBagParametrosAuxiliar2TipoExportar);			
			
			
			
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoExportar.add(this.jButtonRecargarInformacionTipoExportar, this.gridBagConstraintsTipoExportar);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoExportar.add(this.jComboBoxTiposPaginacionTipoExportar, this.gridBagConstraintsTipoExportar);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoExportar.add(this.jCheckBoxConAltoMaximoTablaTipoExportar, this.gridBagConstraintsTipoExportar);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoExportar.add(this.jComboBoxTiposArchivosReportesTipoExportar, this.gridBagConstraintsTipoExportar);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoExportar.add(this.jPanelParametrosAuxiliar1TipoExportar, this.gridBagConstraintsTipoExportar);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoExportar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoExportar.add(this.jComboBoxTiposReportesTipoExportar, this.gridBagConstraintsTipoExportar);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoExportar.add(this.jPanelParametrosAuxiliar4TipoExportar, this.gridBagConstraintsTipoExportar);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoExportar.add(this.jComboBoxTiposReportesTipoExportar, this.gridBagConstraintsTipoExportar);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoExportar.add(this.jCheckBoxGenerarReporteTipoExportar, this.gridBagConstraintsTipoExportar);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoExportar.add(this.jPanelParametrosAuxiliar2TipoExportar, this.gridBagConstraintsTipoExportar);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoExportar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoExportar.add(this.jLabelAccionesTipoExportar, this.gridBagConstraintsTipoExportar);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoExportar = new GridBagConstraints();
				this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoExportar.add(this.jButtonAbrirOrderByTipoExportar, this.gridBagConstraintsTipoExportar);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoExportar.add(this.jComboBoxTiposSeleccionarTipoExportar, this.gridBagConstraintsTipoExportar);			
			
			
			/*
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoExportar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoExportar.add(this.jCheckBoxSeleccionarTodosTipoExportar, this.gridBagConstraintsTipoExportar);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoExportar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoExportar.add(this.jCheckBoxSeleccionarTodosTipoExportar, this.gridBagConstraintsTipoExportar);															
				
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoExportar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoExportar.add(this.jCheckBoxSeleccionadosTipoExportar, this.gridBagConstraintsTipoExportar);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoExportar.add(this.jPanelParametrosAuxiliar3TipoExportar, this.gridBagConstraintsTipoExportar);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoExportar.add(this.jComboBoxTiposRelacionesTipoExportar, this.gridBagConstraintsTipoExportar);
				
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoExportar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoExportar.add(this.jComboBoxTiposAccionesTipoExportar, this.gridBagConstraintsTipoExportar);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoExportar = new GridBagLayout();

			this.jScrollPanelDatosTipoExportar.setLayout(gridaBagLayoutDatosTipoExportar);
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = 0;
			this.gridBagConstraintsTipoExportar.gridx = 0;
			
			this.jScrollPanelDatosTipoExportar.add(this.jTableDatosTipoExportar, this.gridBagConstraintsTipoExportar);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoExportar.setViewportView(this.jTableDatosTipoExportar);
		this.jTableDatosTipoExportar.setFillsViewportHeight(true);
		this.jTableDatosTipoExportar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoExportar= new GridBagLayout();
		this.jPanelAccionesTipoExportar.setLayout(gridaBagLayoutAccionesTipoExportar);
		
		
		/*	
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = 0;
		this.gridBagConstraintsTipoExportar.gridx = 0;
			
		this.jPanelAccionesTipoExportar.add(this.jButtonNuevoTipoExportar, this.gridBagConstraintsTipoExportar);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoExportar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoExportar);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();						
			this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoExportar.gridx = 0;		
			//this.gridBagConstraintsTipoExportar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoExportar.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoExportar, this.gridBagConstraintsTipoExportar);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoExportar.gridx = 0;		
		//this.gridBagConstraintsTipoExportar.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoExportar.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoExportar);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoExportar, this.gridBagConstraintsTipoExportar);								
		
		
		/*
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoExportar, this.gridBagConstraintsTipoExportar);
		*/		
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoExportar.gridx =0;
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoExportar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoExportar, this.gridBagConstraintsTipoExportar);
				
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoExportar, this.gridBagConstraintsTipoExportar);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoExportarJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoExportar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoExportar = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoExportar.setLayout(gridaBagLayoutBusquedasParametrosTipoExportar);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoExportar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoExportar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoExportar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoExportar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoExportar, this.gridBagConstraintsTipoExportar);
			
			
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoExportar, this.gridBagConstraintsTipoExportar);
		
			
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoExportar, this.gridBagConstraintsTipoExportar);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoExportar;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoExportar() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoExportar = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoExportar.setName("jPanelReporteDinamicoTipoExportar"); 
		
		this.jPanelReporteDinamicoTipoExportar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoExportar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoExportar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoExportar.setLayout(gridaBagLayoutReporteDinamicoTipoExportar);
		
		
		this.jInternalFrameReporteDinamicoTipoExportar= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoExportar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoExportar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoExportar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoExportar.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoExportar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoExportar.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoExportar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoExportar.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoExportar.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoExportar.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoExportar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoExportar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoExportar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Exportars"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoExportar = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoExportar.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoExportar.add(this.jLabelColumnasSelectReporteTipoExportar, this.gridBagConstraintsTipoExportar);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoExportar = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoExportar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoExportar.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoExportar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoExportar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoExportar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoExportar=new JScrollPane(this.jListColumnasSelectReporteTipoExportar);
			
			this.jScrollColumnasSelectReporteTipoExportar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoExportar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoExportar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoExportar.add(this.jListColumnasSelectReporteTipoExportar, this.gridBagConstraintsTipoExportar);
		this.jPanelReporteDinamicoTipoExportar.add(this.jScrollColumnasSelectReporteTipoExportar, this.gridBagConstraintsTipoExportar);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoExportar = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoExportar.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoExportar = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoExportar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoExportar.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoExportar.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoExportar.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoExportar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoExportar=new JScrollPane(this.jListRelacionesSelectReporteTipoExportar);
			
			this.jScrollRelacionesSelectReporteTipoExportar.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoExportar.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoExportar.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoExportar = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoExportar = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoExportar = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoExportar = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoExportar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoExportar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoExportar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoExportar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoExportar = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoExportar.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoExportar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoExportar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoExportar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoExportar = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoExportar.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoExportar.add(this.jLabelGenerarExcelReporteDinamicoTipoExportar, this.gridBagConstraintsTipoExportar);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoExportar = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoExportar.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoExportar,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoExportar.setToolTipText("Generar EXCEL"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		//this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoExportar.add(this.jButtonGenerarExcelReporteDinamicoTipoExportar, this.gridBagConstraintsTipoExportar);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoExportar.add(this.jComboBoxTiposReportesDinamicoTipoExportar, this.gridBagConstraintsTipoExportar);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoExportar = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoExportar.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoExportar.add(this.jLabelTiposArchivoReporteDinamicoTipoExportar, this.gridBagConstraintsTipoExportar);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoExportar.add(this.jComboBoxTiposArchivosReportesDinamicoTipoExportar, this.gridBagConstraintsTipoExportar);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoExportar = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoExportar.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoExportar,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoExportar.setToolTipText("Generar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoExportar.add(this.jButtonGenerarReporteDinamicoTipoExportar, this.gridBagConstraintsTipoExportar);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoExportar = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoExportar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoExportar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoExportar.setToolTipText("Cancelar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoExportar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoExportar.add(this.jButtonCerrarReporteDinamicoTipoExportar, this.gridBagConstraintsTipoExportar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoExportar = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoExportar= new JScrollPane(jPanelReporteDinamicoTipoExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoExportar.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoExportar.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoExportar.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Exportars"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoExportar.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoExportar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoExportar.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoExportar);
		this.jInternalFrameReporteDinamicoTipoExportar.getContentPane().add(this.jScrollPanelReporteDinamicoTipoExportar, this.gridBagConstraintsTipoExportar);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoExportar() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoExportar = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoExportar.setName("jPanelImportacionTipoExportar"); 
		
		this.jPanelImportacionTipoExportar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoExportar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoExportar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoExportar.setLayout(gridaBagLayoutImportacionTipoExportar);
		
		
		this.jInternalFrameImportacionTipoExportar= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoExportar= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoExportar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoExportar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoExportar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoExportar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoExportar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoExportar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoExportar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoExportar.setResizable(true);
	    this.jInternalFrameImportacionTipoExportar.setClosable(true);
	    this.jInternalFrameImportacionTipoExportar.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoExportar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoExportar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoExportar.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoExportar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoExportar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoExportar.setResizable(true);
	    this.jInternalFrameImportacionTipoExportar.setClosable(true);
	    this.jInternalFrameImportacionTipoExportar.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoExportar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoExportar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoExportar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Exportars"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoExportar = new JLabelMe();

		this.jLabelArchivoImportacionTipoExportar.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoExportar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoExportar.add(this.jLabelArchivoImportacionTipoExportar, this.gridBagConstraintsTipoExportar);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoExportar = new JFileChooser();		
		this.jFileChooserImportacionTipoExportar.setToolTipText("ESCOGER ARCHIVO"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoExportar = new JButtonMe();
		this.jButtonAbrirImportacionTipoExportar.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoExportar,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoExportar.setToolTipText("Generar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoExportar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoExportar.add(this.jButtonAbrirImportacionTipoExportar, this.gridBagConstraintsTipoExportar);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoExportar = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoExportar.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoExportar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoExportar.add(this.jLabelPathArchivoImportacionTipoExportar, this.gridBagConstraintsTipoExportar);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoExportar=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoExportar.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoExportar.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoExportar.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoExportar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoExportar.add(this.jTextFieldPathArchivoImportacionTipoExportar, this.gridBagConstraintsTipoExportar);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoExportar = new JButtonMe();
		this.jButtonGenerarImportacionTipoExportar.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoExportar,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoExportar.setToolTipText("Generar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoExportar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoExportar.add(this.jButtonGenerarImportacionTipoExportar, this.gridBagConstraintsTipoExportar);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoExportar = new JButtonMe();
		this.jButtonCerrarImportacionTipoExportar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoExportar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoExportar.setToolTipText("Cancelar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoExportar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoExportar.add(this.jButtonCerrarImportacionTipoExportar, this.gridBagConstraintsTipoExportar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoExportar = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoExportar= new JScrollPane(jPanelImportacionTipoExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoExportar.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoExportar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoExportar.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoExportar);
		this.jInternalFrameImportacionTipoExportar.getContentPane().add(this.jScrollPanelImportacionTipoExportar, this.gridBagConstraintsTipoExportar);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoExportar(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoExportar = new JButtonMe();
			this.jButtonAbrirOrderByTipoExportar.setText("Orden");
			this.jButtonAbrirOrderByTipoExportar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoExportar,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoExportar";
			inputMap = this.jButtonAbrirOrderByTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoExportar"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoExportar = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoExportar.setName("jPanelOrderByTipoExportar"); 
			
			this.jPanelOrderByTipoExportar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoExportar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoExportar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoExportar.setLayout(gridaBagLayoutOrderByTipoExportar);
			
			
			this.jTableDatosTipoExportarOrderBy = new JTableMe();        
			this.jTableDatosTipoExportarOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoExportarOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoExportarOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoExportarOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoExportarOrderBy.setViewportView(this.jTableDatosTipoExportarOrderBy);
			this.jTableDatosTipoExportarOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoExportarOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoExportar= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoExportar= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoExportar = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoExportar= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoExportar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoExportar.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoExportar.setTitle("Orden");
			this.jInternalFrameOrderByTipoExportar.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoExportar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoExportar.setResizable(true);
			this.jInternalFrameOrderByTipoExportar.setClosable(true);
			this.jInternalFrameOrderByTipoExportar.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoExportar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoExportar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoExportar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Exportars"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoExportar.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoExportar.ipady =150;
				
			this.jPanelOrderByTipoExportar.add(jScrollPanelDatosTipoExportarOrderBy, this.gridBagConstraintsTipoExportar);//this.jTableDatosTipoExportarTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoExportar = new JButtonMe();
			this.jButtonCerrarOrderByTipoExportar.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoExportar,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoExportar.setToolTipText("Cancelar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoExportar.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoExportar.add(this.jButtonCerrarOrderByTipoExportar, this.gridBagConstraintsTipoExportar);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoExportar = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoExportar= new JScrollPane(jPanelOrderByTipoExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoExportar.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoExportar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoExportar.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoExportar);
			
			this.jInternalFrameOrderByTipoExportar.getContentPane().add(this.jScrollPanelOrderByTipoExportar, this.gridBagConstraintsTipoExportar);			
		
		} else {
			this.jButtonAbrirOrderByTipoExportar = new JButtonMe();
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
			&& this.tipoexportarSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoExportar.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoExportar.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoExportar.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoExportar.getRowHeight();//TipoExportarConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoExportarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoExportar.isSelected()) {
					iHeightTable=TipoExportarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoExportarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoExportarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoExportarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoExportar.isSelected()) {
					iHeightTable=TipoExportarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoExportarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoExportarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoExportar.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoExportar.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoExportar.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoExportar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoExportar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoExportar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoExportar!=null && this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoExportar.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoExportar.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoExportar.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoExportar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoExportar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoExportar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoexportarLogic.getTipoExportars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoexportars.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoExportar> TraerTipoExportarBeans(List<TipoExportar> tipoexportars,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoExportar tipoexportar:tipoexportars) {
					
				if(!(TipoExportarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoExportarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoexportar.setsDetalleGeneralEntityReporte(TipoExportarConstantesFunciones.getTipoExportarDescripcion(tipoexportar));
										
						
					
						
					
				} else  {
							
					//tipoexportar.setsDetalleGeneralEntityReporte(tipoexportar.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoexportarbeans.add(tipoexportarbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoexportars;
    }
	//PARA REPORTES FIN
}
