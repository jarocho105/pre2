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


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


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
import com.bydan.erp.seguridad.util.TipoOperacionConstantesFunciones;

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
public class TipoOperacionJInternalFrame extends TipoOperacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoOperacion;
	
	protected JMenuBar jmenuBarTipoOperacion;
	
	protected JMenu jmenuTipoOperacion;
	protected JMenu jmenuDatosTipoOperacion;
	protected JMenu jmenuArchivoTipoOperacion;
	protected JMenu jmenuAccionesTipoOperacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoOperacion;	
	protected GridBagConstraints gridBagConstraintsTipoOperacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoOperacionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoOperacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoOperacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoOperacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoOperacionSessionBean tipooperacionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoOperacion> tipooperacions;		
	public List<TipoOperacion> tipooperacionsEliminados;	
	public List<TipoOperacion> tipooperacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoOperacion;		
	protected JButton jButtonAbrirOrderByTipoOperacion;
	
	
	//protected JPanel jPanelOrderByTipoOperacion;
	//public JScrollPane jScrollPanelOrderByTipoOperacion;	
	//protected JButton jButtonCerrarOrderByTipoOperacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoOperacionLogic tipooperacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoOperacion;
	public JScrollPane jScrollPanelDatosEdicionTipoOperacion;
	public JScrollPane jScrollPanelDatosGeneralTipoOperacion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoOperacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoOperacion;
	//public JScrollPane jScrollPanelImportacionTipoOperacion;
	
	
	
	protected JPanel jPanelAccionesTipoOperacion;
	
    protected JPanel jPanelPaginacionTipoOperacion;
    protected JPanel jPanelParametrosReportesTipoOperacion;
	protected JPanel jPanelParametrosReportesAccionesTipoOperacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoOperacion;
	protected JPanel jPanelParametrosAuxiliar2TipoOperacion;
	protected JPanel jPanelParametrosAuxiliar3TipoOperacion;
	protected JPanel jPanelParametrosAuxiliar4TipoOperacion;
	//protected JPanel jPanelParametrosAuxiliar5TipoOperacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoOperacion;
	//protected JPanel jPanelImportacionTipoOperacion;
	
	
	public JTable jTableDatosTipoOperacion;
	
	
	
	//public JTable jTableDatosTipoOperacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoOperacion;
	protected JButton jButtonDuplicarTipoOperacion;
	protected JButton jButtonCopiarTipoOperacion;
	protected JButton jButtonVerFormTipoOperacion;
	protected JButton jButtonNuevoRelacionesTipoOperacion;
	protected JButton jButtonModificarTipoOperacion;
	
    protected JButton jButtonGuardarCambiosTablaTipoOperacion;
	protected JButton jButtonCerrarTipoOperacion;
	
	
	protected JButton jButtonRecargarInformacionTipoOperacion;
	protected JButton jButtonProcesarInformacionTipoOperacion;
	
	
	protected JButton jButtonAnterioresTipoOperacion;
	protected JButton jButtonSiguientesTipoOperacion;
	protected JButton jButtonNuevoGuardarCambiosTipoOperacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoOperacion;
	//protected JButton jButtonCerrarReporteDinamicoTipoOperacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoOperacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoOperacion;
	//protected JButton jButtonGenerarImportacionTipoOperacion;
	//protected JButton jButtonCerrarImportacionTipoOperacion;
	//protected JFileChooser jFileChooserImportacionTipoOperacion;
	//protected File fileImportacionTipoOperacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoOperacion;
	protected JButton jButtonDuplicarToolBarTipoOperacion;
	protected JButton jButtonNuevoRelacionesToolBarTipoOperacion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoOperacion;
	protected JButton jButtonCopiarToolBarTipoOperacion;
	protected JButton jButtonVerFormToolBarTipoOperacion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoOperacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoOperacion;
	protected JButton jButtonCerrarToolBarTipoOperacion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoOperacion;
	protected JButton jButtonProcesarInformacionToolBarTipoOperacion;
	protected JButton jButtonAnterioresToolBarTipoOperacion;
	protected JButton jButtonSiguientesToolBarTipoOperacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoOperacion;
	protected JButton jButtonAbrirOrderByToolBarTipoOperacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoOperacion;
	protected JMenuItem jMenuItemDuplicarTipoOperacion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoOperacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoOperacion;
	protected JMenuItem jMenuItemCopiarTipoOperacion;
	protected JMenuItem jMenuItemVerFormTipoOperacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoOperacion;
	protected JMenuItem jMenuItemCerrarTipoOperacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoOperacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoOperacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoOperacion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoOperacion;
	protected JMenuItem jMenuItemProcesarInformacionTipoOperacion;
	protected JMenuItem jMenuItemAnterioresTipoOperacion;
	protected JMenuItem jMenuItemSiguientesTipoOperacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoOperacion;
	protected JMenuItem jMenuItemAbrirOrderByTipoOperacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoOperacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoOperacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoOperacion;
	protected JCheckBox jCheckBoxSeleccionadosTipoOperacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoOperacion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoOperacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoOperacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoOperacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoOperacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoOperacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoOperacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoOperacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoOperacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoOperacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoOperacion;
	protected JTextField jTextFieldValorCampoGeneralTipoOperacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoOperacion;
	//public JList<Reporte> jListColumnasSelectReporteTipoOperacion;
	//public JScrollPane jScrollColumnasSelectReporteTipoOperacion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoOperacion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoOperacion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoOperacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoOperacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoOperacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoOperacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoOperacion;
	
		
	//public JLabel jLabelArchivoImportacionTipoOperacion;	
	//public JLabel jLabelPathArchivoImportacionTipoOperacion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoOperacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoOperacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoOperacion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoOperacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoOperacion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoOperacion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoOperacion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoOperacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoOperacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoOperacion;	
	
	
	
	
	
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
	public TipoOperacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoOperacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoOperacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoOperacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoOperacion)	{
		this.jButtonRecargarInformacionTipoOperacion = jButtonRecargarInformacionTipoOperacion;
	}
	
	public JButton getjButtonProcesarInformacionTipoOperacion() {
		return this.jButtonProcesarInformacionTipoOperacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoOperacion)	{
		this.jButtonProcesarInformacionTipoOperacion = jButtonProcesarInformacionTipoOperacion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoOperacion() {
		return this.jButtonRecargarInformacionTipoOperacion;
	}
	
	
	public List<TipoOperacion> gettipooperacions() {
		return this.tipooperacions;
	}

	public void settipooperacions(List<TipoOperacion> tipooperacions) {
		this.tipooperacions = tipooperacions;
	}
	
	public List<TipoOperacion> gettipooperacionsAux() {
		return this.tipooperacionsAux;
	}

	public void settipooperacionsAux(List<TipoOperacion> tipooperacionsAux) {
		this.tipooperacionsAux = tipooperacionsAux;
	}
	
	public List<TipoOperacion> gettipooperacionsEliminados() {
		return this.tipooperacionsEliminados;
	}

	public void setTipoOperacionsEliminados(List<TipoOperacion> tipooperacionsEliminados) {
		this.tipooperacionsEliminados = tipooperacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoOperacion() {
		return jComboBoxTiposSeleccionarTipoOperacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoOperacion(
			JComboBox jComboBoxTiposSeleccionarTipoOperacion) {
		this.jComboBoxTiposSeleccionarTipoOperacion = jComboBoxTiposSeleccionarTipoOperacion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoOperacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoOperacion() {
		return jTextFieldValorCampoGeneralTipoOperacion;
	}

	public void setjTextFieldValorCampoGeneralTipoOperacion(
			JTextField jTextFieldValorCampoGeneralTipoOperacion) {
		this.jTextFieldValorCampoGeneralTipoOperacion = jTextFieldValorCampoGeneralTipoOperacion;
	}

	public void setBorderResaltarValorCampoGeneralTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoOperacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoOperacion() {
		return this.jCheckBoxSeleccionarTodosTipoOperacion;
	}

	public void setjCheckBoxSeleccionarTodosTipoOperacion(
			JCheckBox jCheckBoxSeleccionarTodosTipoOperacion) {
		this.jCheckBoxSeleccionarTodosTipoOperacion = jCheckBoxSeleccionarTodosTipoOperacion;
	}

	public void setBorderResaltarSeleccionarTodosTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoOperacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoOperacion() {
		return this.jCheckBoxSeleccionadosTipoOperacion;
	}

	public void setjCheckBoxSeleccionadosTipoOperacion(
			JCheckBox jCheckBoxSeleccionadosTipoOperacion) {
		this.jCheckBoxSeleccionadosTipoOperacion = jCheckBoxSeleccionadosTipoOperacion;
	}
	
	public void setBorderResaltarSeleccionadosTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoOperacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoOperacion() {
		return this.jComboBoxTiposArchivosReportesTipoOperacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoOperacion(
			JComboBox jComboBoxTiposArchivosReportesTipoOperacion) {
		this.jComboBoxTiposArchivosReportesTipoOperacion = jComboBoxTiposArchivosReportesTipoOperacion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoOperacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoOperacion() {
		return this.jComboBoxTiposReportesTipoOperacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoOperacion(
			JComboBox jComboBoxTiposReportesTipoOperacion) {
		this.jComboBoxTiposReportesTipoOperacion = jComboBoxTiposReportesTipoOperacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoOperacion() {
	//	return jComboBoxTiposReportesDinamicoTipoOperacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoOperacion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoOperacion) {
	//	this.jComboBoxTiposReportesDinamicoTipoOperacion = jComboBoxTiposReportesDinamicoTipoOperacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoOperacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoOperacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoOperacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoOperacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoOperacion = jComboBoxTiposArchivosReportesDinamicoTipoOperacion;
	//}
	
	public void setBorderResaltarTiposReportesTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoOperacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoOperacion() {
		return this.jComboBoxTiposGraficosReportesTipoOperacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoOperacion(
			JComboBox jComboBoxTiposGraficosReportesTipoOperacion) {
		this.jComboBoxTiposGraficosReportesTipoOperacion = jComboBoxTiposGraficosReportesTipoOperacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoOperacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoOperacion() {
		return this.jComboBoxTiposPaginacionTipoOperacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoOperacion(
			JComboBox jComboBoxTiposPaginacionTipoOperacion) {
		this.jComboBoxTiposPaginacionTipoOperacion = jComboBoxTiposPaginacionTipoOperacion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoOperacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoOperacion() {
		return this.jComboBoxTiposRelacionesTipoOperacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoOperacion() {
		return this.jComboBoxTiposAccionesTipoOperacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoOperacion(
			JComboBox jComboBoxTiposRelacionesTipoOperacion) {
		this.jComboBoxTiposRelacionesTipoOperacion = jComboBoxTiposRelacionesTipoOperacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoOperacion(
			JComboBox jComboBoxTiposAccionesTipoOperacion) {
		this.jComboBoxTiposAccionesTipoOperacion = jComboBoxTiposAccionesTipoOperacion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoOperacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoOperacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoOperacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoOperacion() {
	//	return jCheckBoxConGraficoDinamicoTipoOperacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoOperacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoOperacion) {
	//	this.jCheckBoxConGraficoDinamicoTipoOperacion = jCheckBoxConGraficoDinamicoTipoOperacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoOperacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoOperacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoOperacion .setBorder(borderResaltar);		
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
		this.tipooperacionSessionBean=new TipoOperacionSessionBean();
		
		this.tipooperacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipooperacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipooperacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoOperacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoOperacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoOperacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoOperacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoOperacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Operacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoOperacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoOperacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"nuevo","nuevo","Nuevo"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"duplicar","duplicar","Duplicar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"copiar","copiar","Copiar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"ver_form","ver_form","Ver"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"recargar","recargar","Recargar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoOperacion,this.jTtoolBarTipoOperacion,
							"cerrar","cerrar","Salir"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoOperacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoOperacion;
			
				this.jButtonProcesarInformacionToolBarTipoOperacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoOperacion;
				
		//protected JButton jButtonModificarToolBarTipoOperacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoOperacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoOperacion=new JMenuMe("General");
		this.jmenuArchivoTipoOperacion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoOperacion=new JMenuMe("Acciones");
		this.jmenuDatosTipoOperacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoOperacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoOperacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoOperacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoOperacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoOperacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoOperacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoOperacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoOperacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoOperacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoOperacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoOperacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoOperacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoOperacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoOperacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoOperacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoOperacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoOperacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoOperacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoOperacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoOperacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoOperacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoOperacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoOperacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoOperacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoOperacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoOperacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoOperacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoOperacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoOperacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoOperacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoOperacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoOperacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoOperacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoOperacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoOperacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoOperacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoOperacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoOperacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoOperacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoOperacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoOperacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoOperacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoOperacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoOperacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoOperacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoOperacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoOperacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoOperacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoOperacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoOperacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoOperacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoOperacion.add(this.jMenuItemCerrarTipoOperacion);
			
			this.jmenuAccionesTipoOperacion.add(this.jMenuItemNuevoTipoOperacion);
			this.jmenuAccionesTipoOperacion.add(this.jMenuItemNuevoGuardarCambiosTipoOperacion);
			this.jmenuAccionesTipoOperacion.add(this.jMenuItemNuevoRelacionesTipoOperacion);
			this.jmenuAccionesTipoOperacion.add(this.jMenuItemGuardarCambiosTablaTipoOperacion);		
			this.jmenuAccionesTipoOperacion.add(this.jMenuItemDuplicarTipoOperacion);		
			this.jmenuAccionesTipoOperacion.add(this.jMenuItemCopiarTipoOperacion);		
			this.jmenuAccionesTipoOperacion.add(this.jMenuItemVerFormTipoOperacion);		
			
			this.jmenuDatosTipoOperacion.add(this.jMenuItemRecargarInformacionTipoOperacion);				
			this.jmenuDatosTipoOperacion.add(this.jMenuItemAnterioresTipoOperacion);				
			this.jmenuDatosTipoOperacion.add(this.jMenuItemSiguientesTipoOperacion);				
			this.jmenuDatosTipoOperacion.add(this.jMenuItemAbrirOrderByTipoOperacion);				
			this.jmenuDatosTipoOperacion.add(this.jMenuItemMostrarOcultarTipoOperacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoOperacion.add(this.jMenuItemGuardarCambiosTipoOperacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoOperacion.add(this.jmenuArchivoTipoOperacion);		
			this.jmenuBarTipoOperacion.add(this.jmenuAccionesTipoOperacion);		
			this.jmenuBarTipoOperacion.add(this.jmenuDatosTipoOperacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoOperacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoOperacion() {
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
			//this.jInternalFrameDetalleTipoOperacion = new TipoOperacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Operacion DATOS");
			this.jInternalFrameDetalleFormTipoOperacion = new TipoOperacionDetalleFormJInternalFrame(jDesktopPane,this.tipooperacionSessionBean.getConGuardarRelaciones(),this.tipooperacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoOperacion = null;//new TipoOperacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoOperacion= new GridBagLayout();
		
		
		this.jTableDatosTipoOperacion = new JTableMe();      
		
		String sToolTipTipoOperacion="";
		sToolTipTipoOperacion=TipoOperacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoOperacion+="(Seguridad.TipoOperacion)";
		}
		
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoOperacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoOperacion.setToolTipText(sToolTipTipoOperacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoOperacion);
		this.jTableDatosTipoOperacion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoOperacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoOperacion.setRowSelectionAllowed(true);
		this.jTableDatosTipoOperacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoOperacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoOperacion = new JButtonMe();
		this.jButtonDuplicarTipoOperacion = new JButtonMe();
		this.jButtonCopiarTipoOperacion = new JButtonMe();
		this.jButtonVerFormTipoOperacion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoOperacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoOperacion = new JButtonMe();
		this.jButtonCerrarTipoOperacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoOperacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoOperacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Operacion";
		
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Operacions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoOperacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoOperacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoOperacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoOperacion=new ReporteDinamicoJInternalFrame(TipoOperacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoOperacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoOperacion=new ImportacionJInternalFrame(TipoOperacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoOperacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoOperacion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoOperacion.setText("Orden");
		this.jButtonAbrirOrderByTipoOperacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoOperacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoOperacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoOperacion,false,this);
			
			//this.cargarOrderByTipoOperacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoOperacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoOperacion,true,this);
			
			//this.cargarOrderByTipoOperacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoOperacion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoOperacion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoOperacion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoOperacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoOperacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoOperacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoOperacion.setText("Nuevo");
		this.jButtonDuplicarTipoOperacion.setText("Duplicar");
		this.jButtonCopiarTipoOperacion.setText("Copiar");
		this.jButtonVerFormTipoOperacion.setText("Ver");
		this.jButtonNuevoRelacionesTipoOperacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoOperacion.setText("Guardar");
		this.jButtonCerrarTipoOperacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoOperacion,"nuevo_button","Nuevo",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoOperacion,"duplicar_button","Duplicar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoOperacion,"copiar_button","Copiar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoOperacion,"ver_form","Ver",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoOperacion,"nuevorelaciones_button","Nuevo Rel",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoOperacion,"guardarcambiostabla_button","Guardar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoOperacion,"cerrar_button","Salir",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoOperacion.setToolTipText("Nuevo"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoOperacion.setToolTipText("Duplicar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoOperacion.setToolTipText("Copiar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoOperacion.setToolTipText("Ver"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoOperacion.setToolTipText("Nuevo Rel"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoOperacion.setToolTipText("Guardar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoOperacion.setToolTipText("Salir"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoOperacion";
		inputMap = this.jButtonNuevoTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoOperacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoOperacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoOperacion";
		inputMap = this.jButtonDuplicarTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoOperacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoOperacion"));
		
		//COPIAR
		sMapKey = "CopiarTipoOperacion";
		inputMap = this.jButtonCopiarTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoOperacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoOperacion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoOperacion";
		inputMap = this.jButtonVerFormTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoOperacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoOperacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoOperacion";
		inputMap = this.jButtonNuevoRelacionesTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoOperacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoOperacion";
		inputMap = this.jButtonModificarTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoOperacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoOperacion";
		inputMap = this.jButtonCerrarTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoOperacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoOperacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoOperacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoOperacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoOperacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoOperacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoOperacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoOperacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoOperacion.setName("jPanelParametrosReportesTipoOperacion"); 
		
		this.jPanelParametrosReportesAccionesTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoOperacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoOperacion.setName("jPanelParametrosReportesAccionesTipoOperacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoOperacion = new JButtonMe();
		this.jButtonRecargarInformacionTipoOperacion.setText("Recargar");
		this.jButtonRecargarInformacionTipoOperacion.setToolTipText("Recargar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoOperacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoOperacion = new JButtonMe();
		this.jButtonProcesarInformacionTipoOperacion.setText("Procesar");
		this.jButtonProcesarInformacionTipoOperacion.setToolTipText("Procesar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoOperacion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoOperacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoOperacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoOperacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoOperacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoOperacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoOperacion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoOperacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoOperacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoOperacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoOperacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoOperacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoOperacion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoOperacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoOperacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoOperacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoOperacion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoOperacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoOperacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoOperacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoOperacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoOperacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoOperacion = new JLabelMe();
		
		this.jLabelAccionesTipoOperacion.setText("Acciones");		
		this.jLabelAccionesTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoOperacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoOperacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoOperacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoOperacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoOperacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoOperacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoOperacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoOperacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoOperacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoOperacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoOperacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoOperacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoOperacion = new JButtonMe();
		//this.jButtonAnterioresTipoOperacion.setText("<<");
        this.jButtonAnterioresTipoOperacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoOperacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoOperacion = new JButtonMe();
		//this.jButtonSiguientesTipoOperacion.setText(">>");
        this.jButtonSiguientesTipoOperacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoOperacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoOperacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoOperacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoOperacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoOperacion,"nuevoguardarcambios_button","Nue",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoOperacion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoOperacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoOperacion";
		inputMap = this.jButtonRecargarInformacionTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoOperacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoOperacion";
		inputMap = this.jButtonSiguientesTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoOperacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoOperacion";
		inputMap = this.jButtonAnterioresTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoOperacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoOperacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoOperacion.setMinimumSize(new Dimension(this.getWidth(),TipoOperacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoOperacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoOperacion.setMaximumSize(new Dimension(this.getWidth(),TipoOperacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoOperacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoOperacion.setPreferredSize(new Dimension(this.getWidth(),TipoOperacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoOperacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoOperacion = new GridBagLayout();

			this.jPanelPaginacionTipoOperacion.setLayout(gridaBagLayoutPaginacionTipoOperacion);						
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = 0;
			this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoOperacion.add(this.jButtonAnterioresTipoOperacion, this.gridBagConstraintsTipoOperacion);
					
						
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoOperacion.gridy = 0;
			
			this.jPanelPaginacionTipoOperacion.add(this.jButtonNuevoGuardarCambiosTipoOperacion, this.gridBagConstraintsTipoOperacion);
						
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoOperacion.gridy = 0;
			this.jPanelPaginacionTipoOperacion.add(this.jButtonSiguientesTipoOperacion, this.gridBagConstraintsTipoOperacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = 1;
			this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoOperacion.add(this.jButtonNuevoTipoOperacion, this.gridBagConstraintsTipoOperacion);
						
			
			
			if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
				this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoOperacion.gridy = 1;
				this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoOperacion.add(this.jButtonGuardarCambiosTablaTipoOperacion, this.gridBagConstraintsTipoOperacion);
			}
			
			
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = 1;
			this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoOperacion.add(this.jButtonDuplicarTipoOperacion, this.gridBagConstraintsTipoOperacion);
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = 1;
			this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoOperacion.add(this.jButtonCopiarTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = 1;
			this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoOperacion.add(this.jButtonVerFormTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = 1;
			this.gridBagConstraintsTipoOperacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoOperacion.add(this.jButtonCerrarTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
		
		
		this.jButtonRecargarInformacionTipoOperacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoOperacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoOperacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoOperacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoOperacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoOperacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoOperacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoOperacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoOperacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoOperacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoOperacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoOperacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoOperacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoOperacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoOperacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoOperacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoOperacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoOperacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoOperacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoOperacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoOperacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoOperacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoOperacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoOperacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoOperacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoOperacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoOperacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoOperacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoOperacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoOperacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoOperacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoOperacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoOperacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoOperacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoOperacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoOperacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoOperacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoOperacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoOperacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoOperacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoOperacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoOperacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoOperacion.setLayout(gridaBagParametrosReportesTipoOperacion);
			this.jPanelParametrosReportesAccionesTipoOperacion.setLayout(gridaBagParametrosReportesAccionesTipoOperacion);
			
			
			this.jPanelParametrosAuxiliar1TipoOperacion.setLayout(gridaBagParametrosAuxiliar1TipoOperacion);
			this.jPanelParametrosAuxiliar2TipoOperacion.setLayout(gridaBagParametrosAuxiliar2TipoOperacion);
			this.jPanelParametrosAuxiliar3TipoOperacion.setLayout(gridaBagParametrosAuxiliar3TipoOperacion);
			this.jPanelParametrosAuxiliar4TipoOperacion.setLayout(gridaBagParametrosAuxiliar4TipoOperacion);
			//this.jPanelParametrosAuxiliar5TipoOperacion.setLayout(gridaBagParametrosAuxiliar2TipoOperacion);			
			
			
			
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoOperacion.add(this.jButtonRecargarInformacionTipoOperacion, this.gridBagConstraintsTipoOperacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoOperacion.add(this.jComboBoxTiposPaginacionTipoOperacion, this.gridBagConstraintsTipoOperacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoOperacion.add(this.jCheckBoxConAltoMaximoTablaTipoOperacion, this.gridBagConstraintsTipoOperacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoOperacion.add(this.jComboBoxTiposArchivosReportesTipoOperacion, this.gridBagConstraintsTipoOperacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoOperacion.add(this.jPanelParametrosAuxiliar1TipoOperacion, this.gridBagConstraintsTipoOperacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoOperacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoOperacion.add(this.jComboBoxTiposReportesTipoOperacion, this.gridBagConstraintsTipoOperacion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoOperacion.add(this.jPanelParametrosAuxiliar4TipoOperacion, this.gridBagConstraintsTipoOperacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoOperacion.add(this.jComboBoxTiposReportesTipoOperacion, this.gridBagConstraintsTipoOperacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoOperacion.add(this.jCheckBoxGenerarReporteTipoOperacion, this.gridBagConstraintsTipoOperacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoOperacion.add(this.jPanelParametrosAuxiliar2TipoOperacion, this.gridBagConstraintsTipoOperacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoOperacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoOperacion.add(this.jLabelAccionesTipoOperacion, this.gridBagConstraintsTipoOperacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
				this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoOperacion.add(this.jButtonAbrirOrderByTipoOperacion, this.gridBagConstraintsTipoOperacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoOperacion.add(this.jComboBoxTiposSeleccionarTipoOperacion, this.gridBagConstraintsTipoOperacion);			
			
			
			/*
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoOperacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoOperacion.add(this.jCheckBoxSeleccionarTodosTipoOperacion, this.gridBagConstraintsTipoOperacion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoOperacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoOperacion.add(this.jCheckBoxSeleccionarTodosTipoOperacion, this.gridBagConstraintsTipoOperacion);															
				
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoOperacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoOperacion.add(this.jCheckBoxSeleccionadosTipoOperacion, this.gridBagConstraintsTipoOperacion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoOperacion.add(this.jPanelParametrosAuxiliar3TipoOperacion, this.gridBagConstraintsTipoOperacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoOperacion.add(this.jComboBoxTiposRelacionesTipoOperacion, this.gridBagConstraintsTipoOperacion);
				
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoOperacion.add(this.jComboBoxTiposAccionesTipoOperacion, this.gridBagConstraintsTipoOperacion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoOperacion = new GridBagLayout();

			this.jScrollPanelDatosTipoOperacion.setLayout(gridaBagLayoutDatosTipoOperacion);
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = 0;
			this.gridBagConstraintsTipoOperacion.gridx = 0;
			
			this.jScrollPanelDatosTipoOperacion.add(this.jTableDatosTipoOperacion, this.gridBagConstraintsTipoOperacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoOperacion.setViewportView(this.jTableDatosTipoOperacion);
		this.jTableDatosTipoOperacion.setFillsViewportHeight(true);
		this.jTableDatosTipoOperacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoOperacion= new GridBagLayout();
		this.jPanelAccionesTipoOperacion.setLayout(gridaBagLayoutAccionesTipoOperacion);
		
		
		/*	
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = 0;
		this.gridBagConstraintsTipoOperacion.gridx = 0;
			
		this.jPanelAccionesTipoOperacion.add(this.jButtonNuevoTipoOperacion, this.gridBagConstraintsTipoOperacion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoOperacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoOperacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoOperacion.gridx = 0;		
			//this.gridBagConstraintsTipoOperacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoOperacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoOperacion, this.gridBagConstraintsTipoOperacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoOperacion.gridx = 0;		
		//this.gridBagConstraintsTipoOperacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoOperacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoOperacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoOperacion, this.gridBagConstraintsTipoOperacion);								
		
		
		/*
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoOperacion, this.gridBagConstraintsTipoOperacion);
		*/		
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoOperacion.gridx =0;
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoOperacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoOperacion, this.gridBagConstraintsTipoOperacion);
				
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoOperacion, this.gridBagConstraintsTipoOperacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoOperacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoOperacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoOperacion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoOperacion.setLayout(gridaBagLayoutBusquedasParametrosTipoOperacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoOperacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoOperacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoOperacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoOperacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoOperacion, this.gridBagConstraintsTipoOperacion);
			
			
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
			
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoOperacion, this.gridBagConstraintsTipoOperacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoOperacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoOperacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoOperacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoOperacion.setName("jPanelReporteDinamicoTipoOperacion"); 
		
		this.jPanelReporteDinamicoTipoOperacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoOperacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoOperacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoOperacion.setLayout(gridaBagLayoutReporteDinamicoTipoOperacion);
		
		
		this.jInternalFrameReporteDinamicoTipoOperacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoOperacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoOperacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoOperacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoOperacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoOperacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoOperacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoOperacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoOperacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoOperacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoOperacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoOperacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoOperacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoOperacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Operacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoOperacion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoOperacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoOperacion.add(this.jLabelColumnasSelectReporteTipoOperacion, this.gridBagConstraintsTipoOperacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoOperacion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoOperacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoOperacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoOperacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoOperacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoOperacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoOperacion=new JScrollPane(this.jListColumnasSelectReporteTipoOperacion);
			
			this.jScrollColumnasSelectReporteTipoOperacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoOperacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoOperacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoOperacion.add(this.jListColumnasSelectReporteTipoOperacion, this.gridBagConstraintsTipoOperacion);
		this.jPanelReporteDinamicoTipoOperacion.add(this.jScrollColumnasSelectReporteTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoOperacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoOperacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoOperacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoOperacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoOperacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoOperacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoOperacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoOperacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoOperacion=new JScrollPane(this.jListRelacionesSelectReporteTipoOperacion);
			
			this.jScrollRelacionesSelectReporteTipoOperacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoOperacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoOperacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoOperacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoOperacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoOperacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoOperacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoOperacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoOperacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoOperacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoOperacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoOperacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoOperacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoOperacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoOperacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoOperacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoOperacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoOperacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoOperacion.add(this.jLabelGenerarExcelReporteDinamicoTipoOperacion, this.gridBagConstraintsTipoOperacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoOperacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoOperacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoOperacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoOperacion.setToolTipText("Generar EXCEL"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoOperacion.add(this.jButtonGenerarExcelReporteDinamicoTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoOperacion.add(this.jComboBoxTiposReportesDinamicoTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoOperacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoOperacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoOperacion.add(this.jLabelTiposArchivoReporteDinamicoTipoOperacion, this.gridBagConstraintsTipoOperacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoOperacion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoOperacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoOperacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoOperacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoOperacion.setToolTipText("Generar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoOperacion.add(this.jButtonGenerarReporteDinamicoTipoOperacion, this.gridBagConstraintsTipoOperacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoOperacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoOperacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoOperacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoOperacion.setToolTipText("Cancelar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoOperacion.add(this.jButtonCerrarReporteDinamicoTipoOperacion, this.gridBagConstraintsTipoOperacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoOperacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoOperacion= new JScrollPane(jPanelReporteDinamicoTipoOperacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoOperacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoOperacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoOperacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Operacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoOperacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoOperacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoOperacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoOperacion);
		this.jInternalFrameReporteDinamicoTipoOperacion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoOperacion, this.gridBagConstraintsTipoOperacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoOperacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoOperacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoOperacion.setName("jPanelImportacionTipoOperacion"); 
		
		this.jPanelImportacionTipoOperacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoOperacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoOperacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoOperacion.setLayout(gridaBagLayoutImportacionTipoOperacion);
		
		
		this.jInternalFrameImportacionTipoOperacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoOperacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoOperacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoOperacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoOperacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoOperacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoOperacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoOperacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoOperacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoOperacion.setResizable(true);
	    this.jInternalFrameImportacionTipoOperacion.setClosable(true);
	    this.jInternalFrameImportacionTipoOperacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoOperacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoOperacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoOperacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoOperacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoOperacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoOperacion.setResizable(true);
	    this.jInternalFrameImportacionTipoOperacion.setClosable(true);
	    this.jInternalFrameImportacionTipoOperacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoOperacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoOperacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoOperacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Operacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoOperacion = new JLabelMe();

		this.jLabelArchivoImportacionTipoOperacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoOperacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoOperacion.add(this.jLabelArchivoImportacionTipoOperacion, this.gridBagConstraintsTipoOperacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoOperacion = new JFileChooser();		
		this.jFileChooserImportacionTipoOperacion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoOperacion = new JButtonMe();
		this.jButtonAbrirImportacionTipoOperacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoOperacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoOperacion.setToolTipText("Generar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoOperacion.add(this.jButtonAbrirImportacionTipoOperacion, this.gridBagConstraintsTipoOperacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoOperacion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoOperacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoOperacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoOperacion.add(this.jLabelPathArchivoImportacionTipoOperacion, this.gridBagConstraintsTipoOperacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoOperacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoOperacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoOperacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoOperacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoOperacion.add(this.jTextFieldPathArchivoImportacionTipoOperacion, this.gridBagConstraintsTipoOperacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoOperacion = new JButtonMe();
		this.jButtonGenerarImportacionTipoOperacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoOperacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoOperacion.setToolTipText("Generar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoOperacion.add(this.jButtonGenerarImportacionTipoOperacion, this.gridBagConstraintsTipoOperacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoOperacion = new JButtonMe();
		this.jButtonCerrarImportacionTipoOperacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoOperacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoOperacion.setToolTipText("Cancelar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoOperacion.add(this.jButtonCerrarImportacionTipoOperacion, this.gridBagConstraintsTipoOperacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoOperacion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoOperacion= new JScrollPane(jPanelImportacionTipoOperacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoOperacion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoOperacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoOperacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoOperacion);
		this.jInternalFrameImportacionTipoOperacion.getContentPane().add(this.jScrollPanelImportacionTipoOperacion, this.gridBagConstraintsTipoOperacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoOperacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoOperacion = new JButtonMe();
			this.jButtonAbrirOrderByTipoOperacion.setText("Orden");
			this.jButtonAbrirOrderByTipoOperacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoOperacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoOperacion";
			inputMap = this.jButtonAbrirOrderByTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoOperacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoOperacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoOperacion.setName("jPanelOrderByTipoOperacion"); 
			
			this.jPanelOrderByTipoOperacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoOperacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoOperacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoOperacion.setLayout(gridaBagLayoutOrderByTipoOperacion);
			
			
			this.jTableDatosTipoOperacionOrderBy = new JTableMe();        
			this.jTableDatosTipoOperacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoOperacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoOperacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoOperacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoOperacionOrderBy.setViewportView(this.jTableDatosTipoOperacionOrderBy);
			this.jTableDatosTipoOperacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoOperacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoOperacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoOperacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoOperacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoOperacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoOperacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoOperacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoOperacion.setTitle("Orden");
			this.jInternalFrameOrderByTipoOperacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoOperacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoOperacion.setResizable(true);
			this.jInternalFrameOrderByTipoOperacion.setClosable(true);
			this.jInternalFrameOrderByTipoOperacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoOperacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoOperacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoOperacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Operacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoOperacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoOperacion.ipady =150;
				
			this.jPanelOrderByTipoOperacion.add(jScrollPanelDatosTipoOperacionOrderBy, this.gridBagConstraintsTipoOperacion);//this.jTableDatosTipoOperacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoOperacion = new JButtonMe();
			this.jButtonCerrarOrderByTipoOperacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoOperacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoOperacion.setToolTipText("Cancelar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoOperacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoOperacion.add(this.jButtonCerrarOrderByTipoOperacion, this.gridBagConstraintsTipoOperacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoOperacion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoOperacion= new JScrollPane(jPanelOrderByTipoOperacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoOperacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoOperacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoOperacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoOperacion);
			
			this.jInternalFrameOrderByTipoOperacion.getContentPane().add(this.jScrollPanelOrderByTipoOperacion, this.gridBagConstraintsTipoOperacion);			
		
		} else {
			this.jButtonAbrirOrderByTipoOperacion = new JButtonMe();
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
			&& this.tipooperacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoOperacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoOperacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoOperacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoOperacion.getRowHeight();//TipoOperacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoOperacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoOperacion.isSelected()) {
					iHeightTable=TipoOperacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoOperacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoOperacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoOperacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoOperacion.isSelected()) {
					iHeightTable=TipoOperacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoOperacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoOperacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoOperacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoOperacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoOperacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoOperacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoOperacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoOperacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoOperacion!=null && this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoOperacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoOperacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoOperacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoOperacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoOperacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoOperacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipooperacionLogic.getTipoOperacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipooperacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoOperacion> TraerTipoOperacionBeans(List<TipoOperacion> tipooperacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoOperacion tipooperacion:tipooperacions) {
					
				if(!(TipoOperacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoOperacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipooperacion.setsDetalleGeneralEntityReporte(TipoOperacionConstantesFunciones.getTipoOperacionDescripcion(tipooperacion));
										
						
					
						
					
				} else  {
							
					//tipooperacion.setsDetalleGeneralEntityReporte(tipooperacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipooperacionbeans.add(tipooperacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipooperacions;
    }
	//PARA REPORTES FIN
}
