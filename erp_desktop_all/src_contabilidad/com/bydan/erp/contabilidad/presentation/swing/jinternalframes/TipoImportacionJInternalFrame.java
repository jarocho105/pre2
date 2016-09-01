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
import com.bydan.erp.contabilidad.util.TipoImportacionConstantesFunciones;

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
public class TipoImportacionJInternalFrame extends TipoImportacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoImportacion;
	
	protected JMenuBar jmenuBarTipoImportacion;
	
	protected JMenu jmenuTipoImportacion;
	protected JMenu jmenuDatosTipoImportacion;
	protected JMenu jmenuArchivoTipoImportacion;
	protected JMenu jmenuAccionesTipoImportacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoImportacion;	
	protected GridBagConstraints gridBagConstraintsTipoImportacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoImportacionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoImportacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoImportacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoImportacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoImportacionSessionBean tipoimportacionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoImportacion> tipoimportacions;		
	public List<TipoImportacion> tipoimportacionsEliminados;	
	public List<TipoImportacion> tipoimportacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoImportacion;		
	protected JButton jButtonAbrirOrderByTipoImportacion;
	
	
	//protected JPanel jPanelOrderByTipoImportacion;
	//public JScrollPane jScrollPanelOrderByTipoImportacion;	
	//protected JButton jButtonCerrarOrderByTipoImportacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoImportacionLogic tipoimportacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoImportacion;
	public JScrollPane jScrollPanelDatosEdicionTipoImportacion;
	public JScrollPane jScrollPanelDatosGeneralTipoImportacion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoImportacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoImportacion;
	//public JScrollPane jScrollPanelImportacionTipoImportacion;
	
	
	
	protected JPanel jPanelAccionesTipoImportacion;
	
    protected JPanel jPanelPaginacionTipoImportacion;
    protected JPanel jPanelParametrosReportesTipoImportacion;
	protected JPanel jPanelParametrosReportesAccionesTipoImportacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoImportacion;
	protected JPanel jPanelParametrosAuxiliar2TipoImportacion;
	protected JPanel jPanelParametrosAuxiliar3TipoImportacion;
	protected JPanel jPanelParametrosAuxiliar4TipoImportacion;
	//protected JPanel jPanelParametrosAuxiliar5TipoImportacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoImportacion;
	//protected JPanel jPanelImportacionTipoImportacion;
	
	
	public JTable jTableDatosTipoImportacion;
	
	
	
	//public JTable jTableDatosTipoImportacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoImportacion;
	protected JButton jButtonDuplicarTipoImportacion;
	protected JButton jButtonCopiarTipoImportacion;
	protected JButton jButtonVerFormTipoImportacion;
	protected JButton jButtonNuevoRelacionesTipoImportacion;
	protected JButton jButtonModificarTipoImportacion;
	
    protected JButton jButtonGuardarCambiosTablaTipoImportacion;
	protected JButton jButtonCerrarTipoImportacion;
	
	
	protected JButton jButtonRecargarInformacionTipoImportacion;
	protected JButton jButtonProcesarInformacionTipoImportacion;
	
	
	protected JButton jButtonAnterioresTipoImportacion;
	protected JButton jButtonSiguientesTipoImportacion;
	protected JButton jButtonNuevoGuardarCambiosTipoImportacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoImportacion;
	//protected JButton jButtonCerrarReporteDinamicoTipoImportacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoImportacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoImportacion;
	//protected JButton jButtonGenerarImportacionTipoImportacion;
	//protected JButton jButtonCerrarImportacionTipoImportacion;
	//protected JFileChooser jFileChooserImportacionTipoImportacion;
	//protected File fileImportacionTipoImportacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoImportacion;
	protected JButton jButtonDuplicarToolBarTipoImportacion;
	protected JButton jButtonNuevoRelacionesToolBarTipoImportacion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoImportacion;
	protected JButton jButtonCopiarToolBarTipoImportacion;
	protected JButton jButtonVerFormToolBarTipoImportacion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoImportacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoImportacion;
	protected JButton jButtonCerrarToolBarTipoImportacion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoImportacion;
	protected JButton jButtonProcesarInformacionToolBarTipoImportacion;
	protected JButton jButtonAnterioresToolBarTipoImportacion;
	protected JButton jButtonSiguientesToolBarTipoImportacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoImportacion;
	protected JButton jButtonAbrirOrderByToolBarTipoImportacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoImportacion;
	protected JMenuItem jMenuItemDuplicarTipoImportacion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoImportacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoImportacion;
	protected JMenuItem jMenuItemCopiarTipoImportacion;
	protected JMenuItem jMenuItemVerFormTipoImportacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoImportacion;
	protected JMenuItem jMenuItemCerrarTipoImportacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoImportacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoImportacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoImportacion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoImportacion;
	protected JMenuItem jMenuItemProcesarInformacionTipoImportacion;
	protected JMenuItem jMenuItemAnterioresTipoImportacion;
	protected JMenuItem jMenuItemSiguientesTipoImportacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoImportacion;
	protected JMenuItem jMenuItemAbrirOrderByTipoImportacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoImportacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoImportacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoImportacion;
	protected JCheckBox jCheckBoxSeleccionadosTipoImportacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoImportacion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoImportacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoImportacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoImportacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoImportacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoImportacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoImportacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoImportacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoImportacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoImportacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoImportacion;
	protected JTextField jTextFieldValorCampoGeneralTipoImportacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoImportacion;
	//public JList<Reporte> jListColumnasSelectReporteTipoImportacion;
	//public JScrollPane jScrollColumnasSelectReporteTipoImportacion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoImportacion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoImportacion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoImportacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoImportacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoImportacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoImportacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoImportacion;
	
		
	//public JLabel jLabelArchivoImportacionTipoImportacion;	
	//public JLabel jLabelPathArchivoImportacionTipoImportacion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoImportacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoImportacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoImportacion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoImportacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoImportacion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoImportacion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoImportacion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoImportacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoImportacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoImportacion;	
	
	
	
	
	
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
	public TipoImportacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImportacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImportacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImportacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoImportacion)	{
		this.jButtonRecargarInformacionTipoImportacion = jButtonRecargarInformacionTipoImportacion;
	}
	
	public JButton getjButtonProcesarInformacionTipoImportacion() {
		return this.jButtonProcesarInformacionTipoImportacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoImportacion)	{
		this.jButtonProcesarInformacionTipoImportacion = jButtonProcesarInformacionTipoImportacion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoImportacion() {
		return this.jButtonRecargarInformacionTipoImportacion;
	}
	
	
	public List<TipoImportacion> gettipoimportacions() {
		return this.tipoimportacions;
	}

	public void settipoimportacions(List<TipoImportacion> tipoimportacions) {
		this.tipoimportacions = tipoimportacions;
	}
	
	public List<TipoImportacion> gettipoimportacionsAux() {
		return this.tipoimportacionsAux;
	}

	public void settipoimportacionsAux(List<TipoImportacion> tipoimportacionsAux) {
		this.tipoimportacionsAux = tipoimportacionsAux;
	}
	
	public List<TipoImportacion> gettipoimportacionsEliminados() {
		return this.tipoimportacionsEliminados;
	}

	public void setTipoImportacionsEliminados(List<TipoImportacion> tipoimportacionsEliminados) {
		this.tipoimportacionsEliminados = tipoimportacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoImportacion() {
		return jComboBoxTiposSeleccionarTipoImportacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoImportacion(
			JComboBox jComboBoxTiposSeleccionarTipoImportacion) {
		this.jComboBoxTiposSeleccionarTipoImportacion = jComboBoxTiposSeleccionarTipoImportacion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoImportacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoImportacion() {
		return jTextFieldValorCampoGeneralTipoImportacion;
	}

	public void setjTextFieldValorCampoGeneralTipoImportacion(
			JTextField jTextFieldValorCampoGeneralTipoImportacion) {
		this.jTextFieldValorCampoGeneralTipoImportacion = jTextFieldValorCampoGeneralTipoImportacion;
	}

	public void setBorderResaltarValorCampoGeneralTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoImportacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoImportacion() {
		return this.jCheckBoxSeleccionarTodosTipoImportacion;
	}

	public void setjCheckBoxSeleccionarTodosTipoImportacion(
			JCheckBox jCheckBoxSeleccionarTodosTipoImportacion) {
		this.jCheckBoxSeleccionarTodosTipoImportacion = jCheckBoxSeleccionarTodosTipoImportacion;
	}

	public void setBorderResaltarSeleccionarTodosTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoImportacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoImportacion() {
		return this.jCheckBoxSeleccionadosTipoImportacion;
	}

	public void setjCheckBoxSeleccionadosTipoImportacion(
			JCheckBox jCheckBoxSeleccionadosTipoImportacion) {
		this.jCheckBoxSeleccionadosTipoImportacion = jCheckBoxSeleccionadosTipoImportacion;
	}
	
	public void setBorderResaltarSeleccionadosTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoImportacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoImportacion() {
		return this.jComboBoxTiposArchivosReportesTipoImportacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoImportacion(
			JComboBox jComboBoxTiposArchivosReportesTipoImportacion) {
		this.jComboBoxTiposArchivosReportesTipoImportacion = jComboBoxTiposArchivosReportesTipoImportacion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoImportacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoImportacion() {
		return this.jComboBoxTiposReportesTipoImportacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoImportacion(
			JComboBox jComboBoxTiposReportesTipoImportacion) {
		this.jComboBoxTiposReportesTipoImportacion = jComboBoxTiposReportesTipoImportacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoImportacion() {
	//	return jComboBoxTiposReportesDinamicoTipoImportacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoImportacion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoImportacion) {
	//	this.jComboBoxTiposReportesDinamicoTipoImportacion = jComboBoxTiposReportesDinamicoTipoImportacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoImportacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoImportacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoImportacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoImportacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoImportacion = jComboBoxTiposArchivosReportesDinamicoTipoImportacion;
	//}
	
	public void setBorderResaltarTiposReportesTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoImportacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoImportacion() {
		return this.jComboBoxTiposGraficosReportesTipoImportacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoImportacion(
			JComboBox jComboBoxTiposGraficosReportesTipoImportacion) {
		this.jComboBoxTiposGraficosReportesTipoImportacion = jComboBoxTiposGraficosReportesTipoImportacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoImportacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoImportacion() {
		return this.jComboBoxTiposPaginacionTipoImportacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoImportacion(
			JComboBox jComboBoxTiposPaginacionTipoImportacion) {
		this.jComboBoxTiposPaginacionTipoImportacion = jComboBoxTiposPaginacionTipoImportacion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoImportacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoImportacion() {
		return this.jComboBoxTiposRelacionesTipoImportacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoImportacion() {
		return this.jComboBoxTiposAccionesTipoImportacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoImportacion(
			JComboBox jComboBoxTiposRelacionesTipoImportacion) {
		this.jComboBoxTiposRelacionesTipoImportacion = jComboBoxTiposRelacionesTipoImportacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoImportacion(
			JComboBox jComboBoxTiposAccionesTipoImportacion) {
		this.jComboBoxTiposAccionesTipoImportacion = jComboBoxTiposAccionesTipoImportacion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoImportacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoImportacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoImportacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoImportacion() {
	//	return jCheckBoxConGraficoDinamicoTipoImportacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoImportacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoImportacion) {
	//	this.jCheckBoxConGraficoDinamicoTipoImportacion = jCheckBoxConGraficoDinamicoTipoImportacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoImportacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoImportacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoImportacion .setBorder(borderResaltar);		
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
		this.tipoimportacionSessionBean=new TipoImportacionSessionBean();
		
		this.tipoimportacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimportacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoimportacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoImportacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoImportacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoImportacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoImportacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoImportacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Importacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoImportacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoImportacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"nuevo","nuevo","Nuevo"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"duplicar","duplicar","Duplicar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"copiar","copiar","Copiar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"ver_form","ver_form","Ver"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"recargar","recargar","Recargar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoImportacion,this.jTtoolBarTipoImportacion,
							"cerrar","cerrar","Salir"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoImportacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoImportacion;
			
				this.jButtonProcesarInformacionToolBarTipoImportacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoImportacion;
				
		//protected JButton jButtonModificarToolBarTipoImportacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoImportacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoImportacion=new JMenuMe("General");
		this.jmenuArchivoTipoImportacion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoImportacion=new JMenuMe("Acciones");
		this.jmenuDatosTipoImportacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoImportacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoImportacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoImportacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoImportacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoImportacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoImportacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoImportacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoImportacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoImportacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoImportacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoImportacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoImportacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoImportacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoImportacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoImportacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoImportacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoImportacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoImportacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoImportacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoImportacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoImportacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoImportacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoImportacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoImportacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoImportacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoImportacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoImportacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoImportacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoImportacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoImportacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoImportacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoImportacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoImportacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoImportacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoImportacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoImportacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoImportacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoImportacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoImportacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoImportacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoImportacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoImportacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoImportacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoImportacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoImportacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoImportacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoImportacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoImportacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoImportacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoImportacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoImportacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoImportacion.add(this.jMenuItemCerrarTipoImportacion);
			
			this.jmenuAccionesTipoImportacion.add(this.jMenuItemNuevoTipoImportacion);
			this.jmenuAccionesTipoImportacion.add(this.jMenuItemNuevoGuardarCambiosTipoImportacion);
			this.jmenuAccionesTipoImportacion.add(this.jMenuItemNuevoRelacionesTipoImportacion);
			this.jmenuAccionesTipoImportacion.add(this.jMenuItemGuardarCambiosTablaTipoImportacion);		
			this.jmenuAccionesTipoImportacion.add(this.jMenuItemDuplicarTipoImportacion);		
			this.jmenuAccionesTipoImportacion.add(this.jMenuItemCopiarTipoImportacion);		
			this.jmenuAccionesTipoImportacion.add(this.jMenuItemVerFormTipoImportacion);		
			
			this.jmenuDatosTipoImportacion.add(this.jMenuItemRecargarInformacionTipoImportacion);				
			this.jmenuDatosTipoImportacion.add(this.jMenuItemAnterioresTipoImportacion);				
			this.jmenuDatosTipoImportacion.add(this.jMenuItemSiguientesTipoImportacion);				
			this.jmenuDatosTipoImportacion.add(this.jMenuItemAbrirOrderByTipoImportacion);				
			this.jmenuDatosTipoImportacion.add(this.jMenuItemMostrarOcultarTipoImportacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoImportacion.add(this.jMenuItemGuardarCambiosTipoImportacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoImportacion.add(this.jmenuArchivoTipoImportacion);		
			this.jmenuBarTipoImportacion.add(this.jmenuAccionesTipoImportacion);		
			this.jmenuBarTipoImportacion.add(this.jmenuDatosTipoImportacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoImportacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoImportacion() {
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
			//this.jInternalFrameDetalleTipoImportacion = new TipoImportacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Importacion DATOS");
			this.jInternalFrameDetalleFormTipoImportacion = new TipoImportacionDetalleFormJInternalFrame(jDesktopPane,this.tipoimportacionSessionBean.getConGuardarRelaciones(),this.tipoimportacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoImportacion = null;//new TipoImportacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoImportacion= new GridBagLayout();
		
		
		this.jTableDatosTipoImportacion = new JTableMe();      
		
		String sToolTipTipoImportacion="";
		sToolTipTipoImportacion=TipoImportacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoImportacion+="(Contabilidad.TipoImportacion)";
		}
		
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoImportacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoImportacion.setToolTipText(sToolTipTipoImportacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoImportacion);
		this.jTableDatosTipoImportacion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoImportacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoImportacion.setRowSelectionAllowed(true);
		this.jTableDatosTipoImportacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoImportacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoImportacion = new JButtonMe();
		this.jButtonDuplicarTipoImportacion = new JButtonMe();
		this.jButtonCopiarTipoImportacion = new JButtonMe();
		this.jButtonVerFormTipoImportacion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoImportacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoImportacion = new JButtonMe();
		this.jButtonCerrarTipoImportacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoImportacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoImportacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Importacion";
		
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Importacions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoImportacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoImportacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoImportacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoImportacion=new ReporteDinamicoJInternalFrame(TipoImportacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoImportacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoImportacion=new ImportacionJInternalFrame(TipoImportacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoImportacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoImportacion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoImportacion.setText("Orden");
		this.jButtonAbrirOrderByTipoImportacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoImportacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoImportacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImportacion,false,this);
			
			//this.cargarOrderByTipoImportacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoImportacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImportacion,true,this);
			
			//this.cargarOrderByTipoImportacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoImportacion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoImportacion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoImportacion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoImportacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoImportacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoImportacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoImportacion.setText("Nuevo");
		this.jButtonDuplicarTipoImportacion.setText("Duplicar");
		this.jButtonCopiarTipoImportacion.setText("Copiar");
		this.jButtonVerFormTipoImportacion.setText("Ver");
		this.jButtonNuevoRelacionesTipoImportacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoImportacion.setText("Guardar");
		this.jButtonCerrarTipoImportacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoImportacion,"nuevo_button","Nuevo",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoImportacion,"duplicar_button","Duplicar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoImportacion,"copiar_button","Copiar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoImportacion,"ver_form","Ver",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoImportacion,"nuevorelaciones_button","Nuevo Rel",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoImportacion,"guardarcambiostabla_button","Guardar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoImportacion,"cerrar_button","Salir",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoImportacion.setToolTipText("Nuevo"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoImportacion.setToolTipText("Duplicar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoImportacion.setToolTipText("Copiar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoImportacion.setToolTipText("Ver"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoImportacion.setToolTipText("Nuevo Rel"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoImportacion.setToolTipText("Guardar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoImportacion.setToolTipText("Salir"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoImportacion";
		inputMap = this.jButtonNuevoTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoImportacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoImportacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoImportacion";
		inputMap = this.jButtonDuplicarTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoImportacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoImportacion"));
		
		//COPIAR
		sMapKey = "CopiarTipoImportacion";
		inputMap = this.jButtonCopiarTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoImportacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoImportacion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoImportacion";
		inputMap = this.jButtonVerFormTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoImportacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoImportacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoImportacion";
		inputMap = this.jButtonNuevoRelacionesTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoImportacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoImportacion";
		inputMap = this.jButtonModificarTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoImportacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoImportacion";
		inputMap = this.jButtonCerrarTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoImportacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoImportacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoImportacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoImportacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoImportacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoImportacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoImportacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoImportacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoImportacion.setName("jPanelParametrosReportesTipoImportacion"); 
		
		this.jPanelParametrosReportesAccionesTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoImportacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoImportacion.setName("jPanelParametrosReportesAccionesTipoImportacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoImportacion = new JButtonMe();
		this.jButtonRecargarInformacionTipoImportacion.setText("Recargar");
		this.jButtonRecargarInformacionTipoImportacion.setToolTipText("Recargar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoImportacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoImportacion = new JButtonMe();
		this.jButtonProcesarInformacionTipoImportacion.setText("Procesar");
		this.jButtonProcesarInformacionTipoImportacion.setToolTipText("Procesar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoImportacion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoImportacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoImportacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoImportacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImportacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoImportacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImportacion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoImportacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImportacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoImportacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoImportacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoImportacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoImportacion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoImportacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoImportacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoImportacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoImportacion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoImportacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoImportacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoImportacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoImportacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoImportacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoImportacion = new JLabelMe();
		
		this.jLabelAccionesTipoImportacion.setText("Acciones");		
		this.jLabelAccionesTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoImportacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoImportacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoImportacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoImportacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoImportacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoImportacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoImportacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoImportacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoImportacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoImportacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoImportacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoImportacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoImportacion = new JButtonMe();
		//this.jButtonAnterioresTipoImportacion.setText("<<");
        this.jButtonAnterioresTipoImportacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoImportacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoImportacion = new JButtonMe();
		//this.jButtonSiguientesTipoImportacion.setText(">>");
        this.jButtonSiguientesTipoImportacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoImportacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoImportacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoImportacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoImportacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoImportacion,"nuevoguardarcambios_button","Nue",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoImportacion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoImportacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoImportacion";
		inputMap = this.jButtonRecargarInformacionTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoImportacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoImportacion";
		inputMap = this.jButtonSiguientesTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoImportacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoImportacion";
		inputMap = this.jButtonAnterioresTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoImportacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoImportacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoImportacion.setMinimumSize(new Dimension(this.getWidth(),TipoImportacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImportacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoImportacion.setMaximumSize(new Dimension(this.getWidth(),TipoImportacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImportacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoImportacion.setPreferredSize(new Dimension(this.getWidth(),TipoImportacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImportacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoImportacion = new GridBagLayout();

			this.jPanelPaginacionTipoImportacion.setLayout(gridaBagLayoutPaginacionTipoImportacion);						
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = 0;
			this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoImportacion.add(this.jButtonAnterioresTipoImportacion, this.gridBagConstraintsTipoImportacion);
					
						
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoImportacion.gridy = 0;
			
			this.jPanelPaginacionTipoImportacion.add(this.jButtonNuevoGuardarCambiosTipoImportacion, this.gridBagConstraintsTipoImportacion);
						
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoImportacion.gridy = 0;
			this.jPanelPaginacionTipoImportacion.add(this.jButtonSiguientesTipoImportacion, this.gridBagConstraintsTipoImportacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = 1;
			this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImportacion.add(this.jButtonNuevoTipoImportacion, this.gridBagConstraintsTipoImportacion);
						
			
			
			if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
				this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoImportacion.gridy = 1;
				this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoImportacion.add(this.jButtonGuardarCambiosTablaTipoImportacion, this.gridBagConstraintsTipoImportacion);
			}
			
			
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = 1;
			this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImportacion.add(this.jButtonDuplicarTipoImportacion, this.gridBagConstraintsTipoImportacion);
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = 1;
			this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImportacion.add(this.jButtonCopiarTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = 1;
			this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImportacion.add(this.jButtonVerFormTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = 1;
			this.gridBagConstraintsTipoImportacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoImportacion.add(this.jButtonCerrarTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
		
		
		this.jButtonRecargarInformacionTipoImportacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoImportacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoImportacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoImportacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoImportacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoImportacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoImportacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoImportacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoImportacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoImportacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoImportacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoImportacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoImportacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoImportacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoImportacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoImportacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoImportacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoImportacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoImportacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImportacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImportacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoImportacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoImportacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoImportacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoImportacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoImportacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoImportacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoImportacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoImportacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoImportacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoImportacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoImportacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoImportacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoImportacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoImportacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoImportacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoImportacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoImportacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoImportacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoImportacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoImportacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoImportacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoImportacion.setLayout(gridaBagParametrosReportesTipoImportacion);
			this.jPanelParametrosReportesAccionesTipoImportacion.setLayout(gridaBagParametrosReportesAccionesTipoImportacion);
			
			
			this.jPanelParametrosAuxiliar1TipoImportacion.setLayout(gridaBagParametrosAuxiliar1TipoImportacion);
			this.jPanelParametrosAuxiliar2TipoImportacion.setLayout(gridaBagParametrosAuxiliar2TipoImportacion);
			this.jPanelParametrosAuxiliar3TipoImportacion.setLayout(gridaBagParametrosAuxiliar3TipoImportacion);
			this.jPanelParametrosAuxiliar4TipoImportacion.setLayout(gridaBagParametrosAuxiliar4TipoImportacion);
			//this.jPanelParametrosAuxiliar5TipoImportacion.setLayout(gridaBagParametrosAuxiliar2TipoImportacion);			
			
			
			
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImportacion.add(this.jButtonRecargarInformacionTipoImportacion, this.gridBagConstraintsTipoImportacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImportacion.add(this.jComboBoxTiposPaginacionTipoImportacion, this.gridBagConstraintsTipoImportacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImportacion.add(this.jCheckBoxConAltoMaximoTablaTipoImportacion, this.gridBagConstraintsTipoImportacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImportacion.add(this.jComboBoxTiposArchivosReportesTipoImportacion, this.gridBagConstraintsTipoImportacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImportacion.add(this.jPanelParametrosAuxiliar1TipoImportacion, this.gridBagConstraintsTipoImportacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImportacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoImportacion.add(this.jComboBoxTiposReportesTipoImportacion, this.gridBagConstraintsTipoImportacion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImportacion.add(this.jPanelParametrosAuxiliar4TipoImportacion, this.gridBagConstraintsTipoImportacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImportacion.add(this.jComboBoxTiposReportesTipoImportacion, this.gridBagConstraintsTipoImportacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImportacion.add(this.jCheckBoxGenerarReporteTipoImportacion, this.gridBagConstraintsTipoImportacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImportacion.add(this.jPanelParametrosAuxiliar2TipoImportacion, this.gridBagConstraintsTipoImportacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImportacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImportacion.add(this.jLabelAccionesTipoImportacion, this.gridBagConstraintsTipoImportacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
				this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoImportacion.add(this.jButtonAbrirOrderByTipoImportacion, this.gridBagConstraintsTipoImportacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImportacion.add(this.jComboBoxTiposSeleccionarTipoImportacion, this.gridBagConstraintsTipoImportacion);			
			
			
			/*
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImportacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImportacion.add(this.jCheckBoxSeleccionarTodosTipoImportacion, this.gridBagConstraintsTipoImportacion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImportacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoImportacion.add(this.jCheckBoxSeleccionarTodosTipoImportacion, this.gridBagConstraintsTipoImportacion);															
				
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImportacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoImportacion.add(this.jCheckBoxSeleccionadosTipoImportacion, this.gridBagConstraintsTipoImportacion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImportacion.add(this.jPanelParametrosAuxiliar3TipoImportacion, this.gridBagConstraintsTipoImportacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImportacion.add(this.jComboBoxTiposRelacionesTipoImportacion, this.gridBagConstraintsTipoImportacion);
				
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImportacion.add(this.jComboBoxTiposAccionesTipoImportacion, this.gridBagConstraintsTipoImportacion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoImportacion = new GridBagLayout();

			this.jScrollPanelDatosTipoImportacion.setLayout(gridaBagLayoutDatosTipoImportacion);
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = 0;
			this.gridBagConstraintsTipoImportacion.gridx = 0;
			
			this.jScrollPanelDatosTipoImportacion.add(this.jTableDatosTipoImportacion, this.gridBagConstraintsTipoImportacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoImportacion.setViewportView(this.jTableDatosTipoImportacion);
		this.jTableDatosTipoImportacion.setFillsViewportHeight(true);
		this.jTableDatosTipoImportacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoImportacion= new GridBagLayout();
		this.jPanelAccionesTipoImportacion.setLayout(gridaBagLayoutAccionesTipoImportacion);
		
		
		/*	
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = 0;
		this.gridBagConstraintsTipoImportacion.gridx = 0;
			
		this.jPanelAccionesTipoImportacion.add(this.jButtonNuevoTipoImportacion, this.gridBagConstraintsTipoImportacion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoImportacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoImportacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoImportacion.gridx = 0;		
			//this.gridBagConstraintsTipoImportacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoImportacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoImportacion, this.gridBagConstraintsTipoImportacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoImportacion.gridx = 0;		
		//this.gridBagConstraintsTipoImportacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoImportacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoImportacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoImportacion, this.gridBagConstraintsTipoImportacion);								
		
		
		/*
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoImportacion, this.gridBagConstraintsTipoImportacion);
		*/		
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoImportacion.gridx =0;
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoImportacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoImportacion, this.gridBagConstraintsTipoImportacion);
				
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoImportacion, this.gridBagConstraintsTipoImportacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoImportacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoImportacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoImportacion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoImportacion.setLayout(gridaBagLayoutBusquedasParametrosTipoImportacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoImportacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoImportacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImportacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImportacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoImportacion, this.gridBagConstraintsTipoImportacion);
			
			
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
			
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoImportacion, this.gridBagConstraintsTipoImportacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoImportacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoImportacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoImportacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoImportacion.setName("jPanelReporteDinamicoTipoImportacion"); 
		
		this.jPanelReporteDinamicoTipoImportacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoImportacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoImportacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoImportacion.setLayout(gridaBagLayoutReporteDinamicoTipoImportacion);
		
		
		this.jInternalFrameReporteDinamicoTipoImportacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoImportacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoImportacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoImportacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoImportacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoImportacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoImportacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoImportacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoImportacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoImportacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoImportacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoImportacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoImportacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoImportacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Importacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoImportacion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoImportacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoImportacion.add(this.jLabelColumnasSelectReporteTipoImportacion, this.gridBagConstraintsTipoImportacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoImportacion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoImportacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoImportacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoImportacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoImportacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoImportacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoImportacion=new JScrollPane(this.jListColumnasSelectReporteTipoImportacion);
			
			this.jScrollColumnasSelectReporteTipoImportacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoImportacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoImportacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoImportacion.add(this.jListColumnasSelectReporteTipoImportacion, this.gridBagConstraintsTipoImportacion);
		this.jPanelReporteDinamicoTipoImportacion.add(this.jScrollColumnasSelectReporteTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoImportacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoImportacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoImportacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoImportacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoImportacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoImportacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoImportacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoImportacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoImportacion=new JScrollPane(this.jListRelacionesSelectReporteTipoImportacion);
			
			this.jScrollRelacionesSelectReporteTipoImportacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoImportacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoImportacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoImportacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoImportacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoImportacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoImportacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoImportacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoImportacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoImportacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoImportacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoImportacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoImportacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoImportacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoImportacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoImportacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoImportacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoImportacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoImportacion.add(this.jLabelGenerarExcelReporteDinamicoTipoImportacion, this.gridBagConstraintsTipoImportacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoImportacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoImportacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoImportacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoImportacion.setToolTipText("Generar EXCEL"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoImportacion.add(this.jButtonGenerarExcelReporteDinamicoTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImportacion.add(this.jComboBoxTiposReportesDinamicoTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoImportacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoImportacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoImportacion.add(this.jLabelTiposArchivoReporteDinamicoTipoImportacion, this.gridBagConstraintsTipoImportacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImportacion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoImportacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoImportacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoImportacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoImportacion.setToolTipText("Generar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImportacion.add(this.jButtonGenerarReporteDinamicoTipoImportacion, this.gridBagConstraintsTipoImportacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoImportacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoImportacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoImportacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoImportacion.setToolTipText("Cancelar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImportacion.add(this.jButtonCerrarReporteDinamicoTipoImportacion, this.gridBagConstraintsTipoImportacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoImportacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoImportacion= new JScrollPane(jPanelReporteDinamicoTipoImportacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoImportacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoImportacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoImportacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Importacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoImportacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoImportacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoImportacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoImportacion);
		this.jInternalFrameReporteDinamicoTipoImportacion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoImportacion, this.gridBagConstraintsTipoImportacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoImportacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoImportacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoImportacion.setName("jPanelImportacionTipoImportacion"); 
		
		this.jPanelImportacionTipoImportacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoImportacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoImportacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoImportacion.setLayout(gridaBagLayoutImportacionTipoImportacion);
		
		
		this.jInternalFrameImportacionTipoImportacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoImportacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoImportacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoImportacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoImportacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoImportacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoImportacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoImportacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoImportacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoImportacion.setResizable(true);
	    this.jInternalFrameImportacionTipoImportacion.setClosable(true);
	    this.jInternalFrameImportacionTipoImportacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoImportacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoImportacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoImportacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoImportacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoImportacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoImportacion.setResizable(true);
	    this.jInternalFrameImportacionTipoImportacion.setClosable(true);
	    this.jInternalFrameImportacionTipoImportacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoImportacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoImportacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoImportacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Importacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoImportacion = new JLabelMe();

		this.jLabelArchivoImportacionTipoImportacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoImportacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoImportacion.add(this.jLabelArchivoImportacionTipoImportacion, this.gridBagConstraintsTipoImportacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoImportacion = new JFileChooser();		
		this.jFileChooserImportacionTipoImportacion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoImportacion = new JButtonMe();
		this.jButtonAbrirImportacionTipoImportacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoImportacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoImportacion.setToolTipText("Generar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImportacion.add(this.jButtonAbrirImportacionTipoImportacion, this.gridBagConstraintsTipoImportacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoImportacion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoImportacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoImportacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoImportacion.add(this.jLabelPathArchivoImportacionTipoImportacion, this.gridBagConstraintsTipoImportacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoImportacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoImportacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoImportacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoImportacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImportacion.add(this.jTextFieldPathArchivoImportacionTipoImportacion, this.gridBagConstraintsTipoImportacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoImportacion = new JButtonMe();
		this.jButtonGenerarImportacionTipoImportacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoImportacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoImportacion.setToolTipText("Generar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImportacion.add(this.jButtonGenerarImportacionTipoImportacion, this.gridBagConstraintsTipoImportacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoImportacion = new JButtonMe();
		this.jButtonCerrarImportacionTipoImportacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoImportacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoImportacion.setToolTipText("Cancelar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImportacion.add(this.jButtonCerrarImportacionTipoImportacion, this.gridBagConstraintsTipoImportacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoImportacion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoImportacion= new JScrollPane(jPanelImportacionTipoImportacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoImportacion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoImportacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoImportacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoImportacion);
		this.jInternalFrameImportacionTipoImportacion.getContentPane().add(this.jScrollPanelImportacionTipoImportacion, this.gridBagConstraintsTipoImportacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoImportacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoImportacion = new JButtonMe();
			this.jButtonAbrirOrderByTipoImportacion.setText("Orden");
			this.jButtonAbrirOrderByTipoImportacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoImportacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoImportacion";
			inputMap = this.jButtonAbrirOrderByTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoImportacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoImportacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoImportacion.setName("jPanelOrderByTipoImportacion"); 
			
			this.jPanelOrderByTipoImportacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoImportacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoImportacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoImportacion.setLayout(gridaBagLayoutOrderByTipoImportacion);
			
			
			this.jTableDatosTipoImportacionOrderBy = new JTableMe();        
			this.jTableDatosTipoImportacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoImportacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoImportacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoImportacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoImportacionOrderBy.setViewportView(this.jTableDatosTipoImportacionOrderBy);
			this.jTableDatosTipoImportacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoImportacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoImportacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoImportacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoImportacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoImportacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoImportacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoImportacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoImportacion.setTitle("Orden");
			this.jInternalFrameOrderByTipoImportacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoImportacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoImportacion.setResizable(true);
			this.jInternalFrameOrderByTipoImportacion.setClosable(true);
			this.jInternalFrameOrderByTipoImportacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoImportacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoImportacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoImportacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Importacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoImportacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoImportacion.ipady =150;
				
			this.jPanelOrderByTipoImportacion.add(jScrollPanelDatosTipoImportacionOrderBy, this.gridBagConstraintsTipoImportacion);//this.jTableDatosTipoImportacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoImportacion = new JButtonMe();
			this.jButtonCerrarOrderByTipoImportacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoImportacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoImportacion.setToolTipText("Cancelar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoImportacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoImportacion.add(this.jButtonCerrarOrderByTipoImportacion, this.gridBagConstraintsTipoImportacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoImportacion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoImportacion= new JScrollPane(jPanelOrderByTipoImportacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoImportacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoImportacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoImportacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoImportacion);
			
			this.jInternalFrameOrderByTipoImportacion.getContentPane().add(this.jScrollPanelOrderByTipoImportacion, this.gridBagConstraintsTipoImportacion);			
		
		} else {
			this.jButtonAbrirOrderByTipoImportacion = new JButtonMe();
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
			&& this.tipoimportacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoImportacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoImportacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoImportacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoImportacion.getRowHeight();//TipoImportacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoImportacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoImportacion.isSelected()) {
					iHeightTable=TipoImportacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoImportacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoImportacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoImportacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoImportacion.isSelected()) {
					iHeightTable=TipoImportacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoImportacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoImportacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoImportacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoImportacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoImportacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoImportacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoImportacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoImportacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoImportacion!=null && this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoImportacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoImportacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoImportacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoImportacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoImportacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoImportacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoimportacionLogic.getTipoImportacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimportacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoImportacion> TraerTipoImportacionBeans(List<TipoImportacion> tipoimportacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoImportacion tipoimportacion:tipoimportacions) {
					
				if(!(TipoImportacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoImportacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoimportacion.setsDetalleGeneralEntityReporte(TipoImportacionConstantesFunciones.getTipoImportacionDescripcion(tipoimportacion));
										
						
					
						
					
				} else  {
							
					//tipoimportacion.setsDetalleGeneralEntityReporte(tipoimportacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoimportacionbeans.add(tipoimportacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoimportacions;
    }
	//PARA REPORTES FIN
}
