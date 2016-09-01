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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoPruebaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoPruebaJInternalFrame extends TipoPruebaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPrueba;
	
	protected JMenuBar jmenuBarTipoPrueba;
	
	protected JMenu jmenuTipoPrueba;
	protected JMenu jmenuDatosTipoPrueba;
	protected JMenu jmenuArchivoTipoPrueba;
	protected JMenu jmenuAccionesTipoPrueba;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrueba;	
	protected GridBagConstraints gridBagConstraintsTipoPrueba;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPruebaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPrueba;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPrueba;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPrueba;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoPruebaSessionBean tipopruebaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPrueba> tipopruebas;		
	public List<TipoPrueba> tipopruebasEliminados;	
	public List<TipoPrueba> tipopruebasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPrueba;		
	protected JButton jButtonAbrirOrderByTipoPrueba;
	
	
	//protected JPanel jPanelOrderByTipoPrueba;
	//public JScrollPane jScrollPanelOrderByTipoPrueba;	
	//protected JButton jButtonCerrarOrderByTipoPrueba;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPruebaLogic tipopruebaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPrueba;
	public JScrollPane jScrollPanelDatosEdicionTipoPrueba;
	public JScrollPane jScrollPanelDatosGeneralTipoPrueba;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPruebaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPrueba;
	//public JScrollPane jScrollPanelImportacionTipoPrueba;
	
	
	
	protected JPanel jPanelAccionesTipoPrueba;
	
    protected JPanel jPanelPaginacionTipoPrueba;
    protected JPanel jPanelParametrosReportesTipoPrueba;
	protected JPanel jPanelParametrosReportesAccionesTipoPrueba;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPrueba;
	protected JPanel jPanelParametrosAuxiliar2TipoPrueba;
	protected JPanel jPanelParametrosAuxiliar3TipoPrueba;
	protected JPanel jPanelParametrosAuxiliar4TipoPrueba;
	//protected JPanel jPanelParametrosAuxiliar5TipoPrueba;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPrueba;
	//protected JPanel jPanelImportacionTipoPrueba;
	
	
	public JTable jTableDatosTipoPrueba;
	
	
	
	//public JTable jTableDatosTipoPruebaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPrueba;
	protected JButton jButtonDuplicarTipoPrueba;
	protected JButton jButtonCopiarTipoPrueba;
	protected JButton jButtonVerFormTipoPrueba;
	protected JButton jButtonNuevoRelacionesTipoPrueba;
	protected JButton jButtonModificarTipoPrueba;
	
    protected JButton jButtonGuardarCambiosTablaTipoPrueba;
	protected JButton jButtonCerrarTipoPrueba;
	
	
	protected JButton jButtonRecargarInformacionTipoPrueba;
	protected JButton jButtonProcesarInformacionTipoPrueba;
	
	
	protected JButton jButtonAnterioresTipoPrueba;
	protected JButton jButtonSiguientesTipoPrueba;
	protected JButton jButtonNuevoGuardarCambiosTipoPrueba;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPrueba;
	//protected JButton jButtonCerrarReporteDinamicoTipoPrueba;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPrueba;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPrueba;
	//protected JButton jButtonGenerarImportacionTipoPrueba;
	//protected JButton jButtonCerrarImportacionTipoPrueba;
	//protected JFileChooser jFileChooserImportacionTipoPrueba;
	//protected File fileImportacionTipoPrueba;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrueba;
	protected JButton jButtonDuplicarToolBarTipoPrueba;
	protected JButton jButtonNuevoRelacionesToolBarTipoPrueba;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPrueba;
	protected JButton jButtonCopiarToolBarTipoPrueba;
	protected JButton jButtonVerFormToolBarTipoPrueba;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPrueba;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrueba;
	protected JButton jButtonCerrarToolBarTipoPrueba;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPrueba;
	protected JButton jButtonProcesarInformacionToolBarTipoPrueba;
	protected JButton jButtonAnterioresToolBarTipoPrueba;
	protected JButton jButtonSiguientesToolBarTipoPrueba;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPrueba;
	protected JButton jButtonAbrirOrderByToolBarTipoPrueba;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrueba;
	protected JMenuItem jMenuItemDuplicarTipoPrueba;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPrueba;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPrueba;
	protected JMenuItem jMenuItemCopiarTipoPrueba;
	protected JMenuItem jMenuItemVerFormTipoPrueba;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrueba;
	protected JMenuItem jMenuItemCerrarTipoPrueba;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrueba;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPrueba;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrueba;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPrueba;
	protected JMenuItem jMenuItemProcesarInformacionTipoPrueba;
	protected JMenuItem jMenuItemAnterioresTipoPrueba;
	protected JMenuItem jMenuItemSiguientesTipoPrueba;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrueba;
	protected JMenuItem jMenuItemAbrirOrderByTipoPrueba;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrueba;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrueba;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPrueba;
	protected JCheckBox jCheckBoxSeleccionadosTipoPrueba;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPrueba;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPrueba;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPrueba;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPrueba;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrueba;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPrueba;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPrueba;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPrueba;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrueba;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrueba;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPrueba;
	protected JTextField jTextFieldValorCampoGeneralTipoPrueba;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPrueba;
	//public JList<Reporte> jListColumnasSelectReporteTipoPrueba;
	//public JScrollPane jScrollColumnasSelectReporteTipoPrueba;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPrueba;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPrueba;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPrueba;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPrueba;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPrueba;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPrueba;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPrueba;
	
		
	//public JLabel jLabelArchivoImportacionTipoPrueba;	
	//public JLabel jLabelPathArchivoImportacionTipoPrueba;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPrueba;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPrueba;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPrueba;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPrueba;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPrueba;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPrueba;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPrueba;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPrueba;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPrueba;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPrueba;	
	
	
	
	
	
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
	public TipoPruebaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPruebaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPruebaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPruebaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPrueba)	{
		this.jButtonRecargarInformacionTipoPrueba = jButtonRecargarInformacionTipoPrueba;
	}
	
	public JButton getjButtonProcesarInformacionTipoPrueba() {
		return this.jButtonProcesarInformacionTipoPrueba;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrueba)	{
		this.jButtonProcesarInformacionTipoPrueba = jButtonProcesarInformacionTipoPrueba;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPrueba() {
		return this.jButtonRecargarInformacionTipoPrueba;
	}
	
	
	public List<TipoPrueba> gettipopruebas() {
		return this.tipopruebas;
	}

	public void settipopruebas(List<TipoPrueba> tipopruebas) {
		this.tipopruebas = tipopruebas;
	}
	
	public List<TipoPrueba> gettipopruebasAux() {
		return this.tipopruebasAux;
	}

	public void settipopruebasAux(List<TipoPrueba> tipopruebasAux) {
		this.tipopruebasAux = tipopruebasAux;
	}
	
	public List<TipoPrueba> gettipopruebasEliminados() {
		return this.tipopruebasEliminados;
	}

	public void setTipoPruebasEliminados(List<TipoPrueba> tipopruebasEliminados) {
		this.tipopruebasEliminados = tipopruebasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPrueba() {
		return jComboBoxTiposSeleccionarTipoPrueba;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPrueba(
			JComboBox jComboBoxTiposSeleccionarTipoPrueba) {
		this.jComboBoxTiposSeleccionarTipoPrueba = jComboBoxTiposSeleccionarTipoPrueba;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPrueba .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPrueba() {
		return jTextFieldValorCampoGeneralTipoPrueba;
	}

	public void setjTextFieldValorCampoGeneralTipoPrueba(
			JTextField jTextFieldValorCampoGeneralTipoPrueba) {
		this.jTextFieldValorCampoGeneralTipoPrueba = jTextFieldValorCampoGeneralTipoPrueba;
	}

	public void setBorderResaltarValorCampoGeneralTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPrueba .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPrueba() {
		return this.jCheckBoxSeleccionarTodosTipoPrueba;
	}

	public void setjCheckBoxSeleccionarTodosTipoPrueba(
			JCheckBox jCheckBoxSeleccionarTodosTipoPrueba) {
		this.jCheckBoxSeleccionarTodosTipoPrueba = jCheckBoxSeleccionarTodosTipoPrueba;
	}

	public void setBorderResaltarSeleccionarTodosTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPrueba .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPrueba() {
		return this.jCheckBoxSeleccionadosTipoPrueba;
	}

	public void setjCheckBoxSeleccionadosTipoPrueba(
			JCheckBox jCheckBoxSeleccionadosTipoPrueba) {
		this.jCheckBoxSeleccionadosTipoPrueba = jCheckBoxSeleccionadosTipoPrueba;
	}
	
	public void setBorderResaltarSeleccionadosTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPrueba .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPrueba() {
		return this.jComboBoxTiposArchivosReportesTipoPrueba;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPrueba(
			JComboBox jComboBoxTiposArchivosReportesTipoPrueba) {
		this.jComboBoxTiposArchivosReportesTipoPrueba = jComboBoxTiposArchivosReportesTipoPrueba;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPrueba .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPrueba() {
		return this.jComboBoxTiposReportesTipoPrueba;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPrueba(
			JComboBox jComboBoxTiposReportesTipoPrueba) {
		this.jComboBoxTiposReportesTipoPrueba = jComboBoxTiposReportesTipoPrueba;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPrueba() {
	//	return jComboBoxTiposReportesDinamicoTipoPrueba;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPrueba(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPrueba) {
	//	this.jComboBoxTiposReportesDinamicoTipoPrueba = jComboBoxTiposReportesDinamicoTipoPrueba;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPrueba() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPrueba;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPrueba(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrueba) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPrueba = jComboBoxTiposArchivosReportesDinamicoTipoPrueba;
	//}
	
	public void setBorderResaltarTiposReportesTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPrueba .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPrueba() {
		return this.jComboBoxTiposGraficosReportesTipoPrueba;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPrueba(
			JComboBox jComboBoxTiposGraficosReportesTipoPrueba) {
		this.jComboBoxTiposGraficosReportesTipoPrueba = jComboBoxTiposGraficosReportesTipoPrueba;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPrueba .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPrueba() {
		return this.jComboBoxTiposPaginacionTipoPrueba;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPrueba(
			JComboBox jComboBoxTiposPaginacionTipoPrueba) {
		this.jComboBoxTiposPaginacionTipoPrueba = jComboBoxTiposPaginacionTipoPrueba;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPrueba .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPrueba() {
		return this.jComboBoxTiposRelacionesTipoPrueba;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrueba() {
		return this.jComboBoxTiposAccionesTipoPrueba;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrueba(
			JComboBox jComboBoxTiposRelacionesTipoPrueba) {
		this.jComboBoxTiposRelacionesTipoPrueba = jComboBoxTiposRelacionesTipoPrueba;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrueba(
			JComboBox jComboBoxTiposAccionesTipoPrueba) {
		this.jComboBoxTiposAccionesTipoPrueba = jComboBoxTiposAccionesTipoPrueba;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPrueba .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPrueba() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPrueba .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPrueba() {
	//	return jCheckBoxConGraficoDinamicoTipoPrueba;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPrueba(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPrueba) {
	//	this.jCheckBoxConGraficoDinamicoTipoPrueba = jCheckBoxConGraficoDinamicoTipoPrueba;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPrueba() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPrueba.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPrueba .setBorder(borderResaltar);		
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
		this.tipopruebaSessionBean=new TipoPruebaSessionBean();
		
		this.tipopruebaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopruebaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopruebaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPruebaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPruebaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPruebaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPruebaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPruebaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prueba MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPruebaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPrueba= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"nuevo","nuevo","Nuevo"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"duplicar","duplicar","Duplicar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"copiar","copiar","Copiar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"ver_form","ver_form","Ver"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"recargar","recargar","Recargar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPrueba,this.jTtoolBarTipoPrueba,
							"cerrar","cerrar","Salir"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPrueba=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPrueba;
			
				this.jButtonProcesarInformacionToolBarTipoPrueba=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPrueba;
				
		//protected JButton jButtonModificarToolBarTipoPrueba;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPrueba=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPrueba=new JMenuMe("General");
		this.jmenuArchivoTipoPrueba=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPrueba=new JMenuMe("Acciones");
		this.jmenuDatosTipoPrueba=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrueba= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrueba.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrueba,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPrueba= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPrueba.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPrueba,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPrueba= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPrueba.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPrueba,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPrueba= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrueba.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrueba,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPrueba= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPrueba.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPrueba,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPrueba= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPrueba.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPrueba,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPrueba= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPrueba.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPrueba,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrueba= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrueba.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrueba,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPrueba= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPrueba.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPrueba,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPrueba= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPrueba.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPrueba,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPrueba= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPrueba.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPrueba,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPrueba= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPrueba.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPrueba,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPrueba= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPrueba.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPrueba,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrueba= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrueba.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrueba,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPrueba= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPrueba.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPrueba,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrueba= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrueba.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrueba,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPrueba= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPrueba.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPrueba,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPrueba.add(this.jMenuItemCerrarTipoPrueba);
			
			this.jmenuAccionesTipoPrueba.add(this.jMenuItemNuevoTipoPrueba);
			this.jmenuAccionesTipoPrueba.add(this.jMenuItemNuevoGuardarCambiosTipoPrueba);
			this.jmenuAccionesTipoPrueba.add(this.jMenuItemNuevoRelacionesTipoPrueba);
			this.jmenuAccionesTipoPrueba.add(this.jMenuItemGuardarCambiosTablaTipoPrueba);		
			this.jmenuAccionesTipoPrueba.add(this.jMenuItemDuplicarTipoPrueba);		
			this.jmenuAccionesTipoPrueba.add(this.jMenuItemCopiarTipoPrueba);		
			this.jmenuAccionesTipoPrueba.add(this.jMenuItemVerFormTipoPrueba);		
			
			this.jmenuDatosTipoPrueba.add(this.jMenuItemRecargarInformacionTipoPrueba);				
			this.jmenuDatosTipoPrueba.add(this.jMenuItemAnterioresTipoPrueba);				
			this.jmenuDatosTipoPrueba.add(this.jMenuItemSiguientesTipoPrueba);				
			this.jmenuDatosTipoPrueba.add(this.jMenuItemAbrirOrderByTipoPrueba);				
			this.jmenuDatosTipoPrueba.add(this.jMenuItemMostrarOcultarTipoPrueba);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPrueba.add(this.jMenuItemGuardarCambiosTipoPrueba);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPrueba.add(this.jmenuArchivoTipoPrueba);		
			this.jmenuBarTipoPrueba.add(this.jmenuAccionesTipoPrueba);		
			this.jmenuBarTipoPrueba.add(this.jmenuDatosTipoPrueba);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPrueba);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPrueba() {
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
			//this.jInternalFrameDetalleTipoPrueba = new TipoPruebaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Prueba DATOS");
			this.jInternalFrameDetalleFormTipoPrueba = new TipoPruebaDetalleFormJInternalFrame(jDesktopPane,this.tipopruebaSessionBean.getConGuardarRelaciones(),this.tipopruebaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPrueba = null;//new TipoPruebaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrueba= new GridBagLayout();
		
		
		this.jTableDatosTipoPrueba = new JTableMe();      
		
		String sToolTipTipoPrueba="";
		sToolTipTipoPrueba=TipoPruebaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrueba+="(Nomina.TipoPrueba)";
		}
		
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrueba+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPrueba.setToolTipText(sToolTipTipoPrueba);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPrueba);
		this.jTableDatosTipoPrueba.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPrueba.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPrueba.setRowSelectionAllowed(true);
		this.jTableDatosTipoPrueba.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPrueba,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPrueba = new JButtonMe();
		this.jButtonDuplicarTipoPrueba = new JButtonMe();
		this.jButtonCopiarTipoPrueba = new JButtonMe();
		this.jButtonVerFormTipoPrueba = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPrueba = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPrueba = new JButtonMe();
		this.jButtonCerrarTipoPrueba = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrueba = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPrueba = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prueba";
		
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pruebas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrueba.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrueba.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrueba.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPrueba=new ReporteDinamicoJInternalFrame(TipoPruebaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPrueba();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPrueba=new ImportacionJInternalFrame(TipoPruebaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPrueba();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPrueba = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPrueba.setText("Orden");
		this.jButtonAbrirOrderByTipoPrueba.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrueba,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrueba=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrueba,false,this);
			
			//this.cargarOrderByTipoPrueba(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrueba=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrueba,true,this);
			
			//this.cargarOrderByTipoPrueba(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPrueba.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPrueba.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPrueba.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPrueba.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrueba.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrueba.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPrueba.setText("Nuevo");
		this.jButtonDuplicarTipoPrueba.setText("Duplicar");
		this.jButtonCopiarTipoPrueba.setText("Copiar");
		this.jButtonVerFormTipoPrueba.setText("Ver");
		this.jButtonNuevoRelacionesTipoPrueba.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPrueba.setText("Guardar");
		this.jButtonCerrarTipoPrueba.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrueba,"nuevo_button","Nuevo",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPrueba,"duplicar_button","Duplicar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPrueba,"copiar_button","Copiar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPrueba,"ver_form","Ver",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPrueba,"nuevorelaciones_button","Nuevo Rel",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrueba,"guardarcambiostabla_button","Guardar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrueba,"cerrar_button","Salir",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPrueba.setToolTipText("Nuevo"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPrueba.setToolTipText("Duplicar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPrueba.setToolTipText("Copiar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPrueba.setToolTipText("Ver"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPrueba.setToolTipText("Nuevo Rel"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPrueba.setToolTipText("Guardar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrueba.setToolTipText("Salir"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrueba";
		inputMap = this.jButtonNuevoTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrueba.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrueba"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPrueba";
		inputMap = this.jButtonDuplicarTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPrueba.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPrueba"));
		
		//COPIAR
		sMapKey = "CopiarTipoPrueba";
		inputMap = this.jButtonCopiarTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPrueba.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPrueba"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPrueba";
		inputMap = this.jButtonVerFormTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPrueba.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPrueba"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPrueba";
		inputMap = this.jButtonNuevoRelacionesTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPrueba"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPrueba";
		inputMap = this.jButtonModificarTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPrueba"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPrueba";
		inputMap = this.jButtonCerrarTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrueba"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrueba";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrueba"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPrueba= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPrueba= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPrueba= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPrueba= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPrueba= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPrueba.setName("jPanelParametrosReportesTipoPrueba"); 
		
		this.jPanelParametrosReportesAccionesTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPrueba.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPrueba.setName("jPanelParametrosReportesAccionesTipoPrueba"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPrueba = new JButtonMe();
		this.jButtonRecargarInformacionTipoPrueba.setText("Recargar");
		this.jButtonRecargarInformacionTipoPrueba.setToolTipText("Recargar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPrueba,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPrueba = new JButtonMe();
		this.jButtonProcesarInformacionTipoPrueba.setText("Procesar");
		this.jButtonProcesarInformacionTipoPrueba.setToolTipText("Procesar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPrueba.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPrueba.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrueba.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrueba.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrueba.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPrueba.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrueba.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPrueba.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrueba.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPrueba.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPrueba.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPrueba.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPrueba.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPrueba.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrueba.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrueba.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPrueba.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPrueba.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPrueba=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPrueba.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrueba.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrueba.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPrueba = new JLabelMe();
		
		this.jLabelAccionesTipoPrueba.setText("Acciones");		
		this.jLabelAccionesTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPrueba = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPrueba.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPrueba.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPrueba = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPrueba.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPrueba.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPrueba = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPrueba.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPrueba.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPrueba = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPrueba.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPrueba.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPrueba = new JButtonMe();
		//this.jButtonAnterioresTipoPrueba.setText("<<");
        this.jButtonAnterioresTipoPrueba.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPrueba,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPrueba = new JButtonMe();
		//this.jButtonSiguientesTipoPrueba.setText(">>");
        this.jButtonSiguientesTipoPrueba.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPrueba,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPrueba = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPrueba.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPrueba.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPrueba,"nuevoguardarcambios_button","Nue",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPrueba";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPrueba"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPrueba";
		inputMap = this.jButtonRecargarInformacionTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPrueba"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPrueba";
		inputMap = this.jButtonSiguientesTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPrueba"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPrueba";
		inputMap = this.jButtonAnterioresTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPrueba"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPrueba();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPrueba.setMinimumSize(new Dimension(this.getWidth(),TipoPruebaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPruebaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrueba.setMaximumSize(new Dimension(this.getWidth(),TipoPruebaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPruebaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrueba.setPreferredSize(new Dimension(this.getWidth(),TipoPruebaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPruebaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPrueba = new GridBagLayout();

			this.jPanelPaginacionTipoPrueba.setLayout(gridaBagLayoutPaginacionTipoPrueba);						
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = 0;
			this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPrueba.add(this.jButtonAnterioresTipoPrueba, this.gridBagConstraintsTipoPrueba);
					
						
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrueba.gridy = 0;
			
			this.jPanelPaginacionTipoPrueba.add(this.jButtonNuevoGuardarCambiosTipoPrueba, this.gridBagConstraintsTipoPrueba);
						
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrueba.gridy = 0;
			this.jPanelPaginacionTipoPrueba.add(this.jButtonSiguientesTipoPrueba, this.gridBagConstraintsTipoPrueba);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = 1;
			this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrueba.add(this.jButtonNuevoTipoPrueba, this.gridBagConstraintsTipoPrueba);
						
			
			
			if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
				this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPrueba.gridy = 1;
				this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPrueba.add(this.jButtonGuardarCambiosTablaTipoPrueba, this.gridBagConstraintsTipoPrueba);
			}
			
			
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = 1;
			this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrueba.add(this.jButtonDuplicarTipoPrueba, this.gridBagConstraintsTipoPrueba);
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = 1;
			this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrueba.add(this.jButtonCopiarTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = 1;
			this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrueba.add(this.jButtonVerFormTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = 1;
			this.gridBagConstraintsTipoPrueba.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPrueba.add(this.jButtonCerrarTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
		
		
		this.jButtonRecargarInformacionTipoPrueba.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrueba.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrueba.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPrueba.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrueba.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrueba.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPrueba.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrueba.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrueba.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPrueba.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrueba.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrueba.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPrueba.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrueba.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrueba.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPrueba.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrueba.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrueba.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPrueba.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrueba.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrueba.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPrueba.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrueba.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrueba.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPrueba.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrueba.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrueba.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPrueba.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrueba.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrueba.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPrueba.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrueba.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrueba.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPrueba.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrueba.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrueba.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPrueba = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPrueba = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPrueba = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPrueba = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPrueba = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPrueba = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPrueba.setLayout(gridaBagParametrosReportesTipoPrueba);
			this.jPanelParametrosReportesAccionesTipoPrueba.setLayout(gridaBagParametrosReportesAccionesTipoPrueba);
			
			
			this.jPanelParametrosAuxiliar1TipoPrueba.setLayout(gridaBagParametrosAuxiliar1TipoPrueba);
			this.jPanelParametrosAuxiliar2TipoPrueba.setLayout(gridaBagParametrosAuxiliar2TipoPrueba);
			this.jPanelParametrosAuxiliar3TipoPrueba.setLayout(gridaBagParametrosAuxiliar3TipoPrueba);
			this.jPanelParametrosAuxiliar4TipoPrueba.setLayout(gridaBagParametrosAuxiliar4TipoPrueba);
			//this.jPanelParametrosAuxiliar5TipoPrueba.setLayout(gridaBagParametrosAuxiliar2TipoPrueba);			
			
			
			
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrueba.add(this.jButtonRecargarInformacionTipoPrueba, this.gridBagConstraintsTipoPrueba);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrueba.add(this.jComboBoxTiposPaginacionTipoPrueba, this.gridBagConstraintsTipoPrueba);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrueba.add(this.jCheckBoxConAltoMaximoTablaTipoPrueba, this.gridBagConstraintsTipoPrueba);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrueba.add(this.jComboBoxTiposArchivosReportesTipoPrueba, this.gridBagConstraintsTipoPrueba);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrueba.add(this.jPanelParametrosAuxiliar1TipoPrueba, this.gridBagConstraintsTipoPrueba);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrueba.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPrueba.add(this.jComboBoxTiposReportesTipoPrueba, this.gridBagConstraintsTipoPrueba);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrueba.add(this.jPanelParametrosAuxiliar4TipoPrueba, this.gridBagConstraintsTipoPrueba);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrueba.add(this.jComboBoxTiposReportesTipoPrueba, this.gridBagConstraintsTipoPrueba);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrueba.add(this.jCheckBoxGenerarReporteTipoPrueba, this.gridBagConstraintsTipoPrueba);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrueba.add(this.jPanelParametrosAuxiliar2TipoPrueba, this.gridBagConstraintsTipoPrueba);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrueba.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrueba.add(this.jLabelAccionesTipoPrueba, this.gridBagConstraintsTipoPrueba);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
				this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPrueba.add(this.jButtonAbrirOrderByTipoPrueba, this.gridBagConstraintsTipoPrueba);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrueba.add(this.jComboBoxTiposSeleccionarTipoPrueba, this.gridBagConstraintsTipoPrueba);			
			
			
			/*
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrueba.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrueba.add(this.jCheckBoxSeleccionarTodosTipoPrueba, this.gridBagConstraintsTipoPrueba);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrueba.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrueba.add(this.jCheckBoxSeleccionarTodosTipoPrueba, this.gridBagConstraintsTipoPrueba);															
				
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrueba.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrueba.add(this.jCheckBoxSeleccionadosTipoPrueba, this.gridBagConstraintsTipoPrueba);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrueba.add(this.jPanelParametrosAuxiliar3TipoPrueba, this.gridBagConstraintsTipoPrueba);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrueba.add(this.jComboBoxTiposAccionesTipoPrueba, this.gridBagConstraintsTipoPrueba);
	
				
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrueba.add(this.jTextFieldValorCampoGeneralTipoPrueba, this.gridBagConstraintsTipoPrueba);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPrueba = new GridBagLayout();

			this.jScrollPanelDatosTipoPrueba.setLayout(gridaBagLayoutDatosTipoPrueba);
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = 0;
			this.gridBagConstraintsTipoPrueba.gridx = 0;
			
			this.jScrollPanelDatosTipoPrueba.add(this.jTableDatosTipoPrueba, this.gridBagConstraintsTipoPrueba);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPrueba.setViewportView(this.jTableDatosTipoPrueba);
		this.jTableDatosTipoPrueba.setFillsViewportHeight(true);
		this.jTableDatosTipoPrueba.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPrueba= new GridBagLayout();
		this.jPanelAccionesTipoPrueba.setLayout(gridaBagLayoutAccionesTipoPrueba);
		
		
		/*	
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = 0;
		this.gridBagConstraintsTipoPrueba.gridx = 0;
			
		this.jPanelAccionesTipoPrueba.add(this.jButtonNuevoTipoPrueba, this.gridBagConstraintsTipoPrueba);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrueba = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrueba);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrueba.gridx = 0;		
			//this.gridBagConstraintsTipoPrueba.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrueba.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPrueba, this.gridBagConstraintsTipoPrueba);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPrueba.gridx = 0;		
		//this.gridBagConstraintsTipoPrueba.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPrueba.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPrueba);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPrueba, this.gridBagConstraintsTipoPrueba);								
		
		
		/*
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPrueba, this.gridBagConstraintsTipoPrueba);
		*/		
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrueba.gridx =0;
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrueba.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrueba, this.gridBagConstraintsTipoPrueba);
				
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPrueba, this.gridBagConstraintsTipoPrueba);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoPruebaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPrueba= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrueba = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPrueba.setLayout(gridaBagLayoutBusquedasParametrosTipoPrueba);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPrueba=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrueba.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrueba.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrueba.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrueba, this.gridBagConstraintsTipoPrueba);
			
			
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
			
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrueba, this.gridBagConstraintsTipoPrueba);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPrueba;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPrueba() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPrueba = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPrueba.setName("jPanelReporteDinamicoTipoPrueba"); 
		
		this.jPanelReporteDinamicoTipoPrueba.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrueba.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrueba.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPrueba.setLayout(gridaBagLayoutReporteDinamicoTipoPrueba);
		
		
		this.jInternalFrameReporteDinamicoTipoPrueba= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPrueba = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrueba= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPrueba.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPrueba.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPrueba.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPrueba.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPrueba.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPrueba.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPrueba.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPrueba.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPrueba.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrueba.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrueba.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pruebas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPrueba = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPrueba.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrueba.add(this.jLabelColumnasSelectReporteTipoPrueba, this.gridBagConstraintsTipoPrueba);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPrueba = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPrueba.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPrueba.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPrueba.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrueba.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrueba.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPrueba=new JScrollPane(this.jListColumnasSelectReporteTipoPrueba);
			
			this.jScrollColumnasSelectReporteTipoPrueba.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrueba.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrueba.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPrueba.add(this.jListColumnasSelectReporteTipoPrueba, this.gridBagConstraintsTipoPrueba);
		this.jPanelReporteDinamicoTipoPrueba.add(this.jScrollColumnasSelectReporteTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPrueba = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPrueba.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPrueba = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPrueba.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPrueba.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPrueba.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrueba.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrueba.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPrueba=new JScrollPane(this.jListRelacionesSelectReporteTipoPrueba);
			
			this.jScrollRelacionesSelectReporteTipoPrueba.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrueba.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrueba.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoPrueba = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPrueba = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPrueba = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPrueba = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPrueba.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPrueba.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrueba.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrueba.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrueba = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrueba.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrueba.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrueba.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrueba.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPrueba = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPrueba.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrueba.add(this.jLabelGenerarExcelReporteDinamicoTipoPrueba, this.gridBagConstraintsTipoPrueba);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrueba = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPrueba.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPrueba,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPrueba.setToolTipText("Generar EXCEL"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPrueba.add(this.jButtonGenerarExcelReporteDinamicoTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrueba.add(this.jComboBoxTiposReportesDinamicoTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPrueba = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPrueba.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrueba.add(this.jLabelTiposArchivoReporteDinamicoTipoPrueba, this.gridBagConstraintsTipoPrueba);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrueba.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPrueba = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPrueba.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPrueba,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPrueba.setToolTipText("Generar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrueba.add(this.jButtonGenerarReporteDinamicoTipoPrueba, this.gridBagConstraintsTipoPrueba);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPrueba = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPrueba.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPrueba,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPrueba.setToolTipText("Cancelar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrueba.add(this.jButtonCerrarReporteDinamicoTipoPrueba, this.gridBagConstraintsTipoPrueba);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPrueba = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPrueba= new JScrollPane(jPanelReporteDinamicoTipoPrueba,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPrueba.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrueba.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrueba.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pruebas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrueba.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPrueba.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPrueba.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPrueba);
		this.jInternalFrameReporteDinamicoTipoPrueba.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPrueba, this.gridBagConstraintsTipoPrueba);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPrueba() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPrueba = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPrueba.setName("jPanelImportacionTipoPrueba"); 
		
		this.jPanelImportacionTipoPrueba.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrueba.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrueba.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPrueba.setLayout(gridaBagLayoutImportacionTipoPrueba);
		
		
		this.jInternalFrameImportacionTipoPrueba= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPrueba= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPrueba = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrueba= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPrueba.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrueba.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrueba.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPrueba.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrueba.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrueba.setResizable(true);
	    this.jInternalFrameImportacionTipoPrueba.setClosable(true);
	    this.jInternalFrameImportacionTipoPrueba.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPrueba.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrueba.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrueba.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPrueba.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrueba.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrueba.setResizable(true);
	    this.jInternalFrameImportacionTipoPrueba.setClosable(true);
	    this.jInternalFrameImportacionTipoPrueba.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPrueba.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrueba.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrueba.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pruebas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPrueba = new JLabelMe();

		this.jLabelArchivoImportacionTipoPrueba.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrueba.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrueba.add(this.jLabelArchivoImportacionTipoPrueba, this.gridBagConstraintsTipoPrueba);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPrueba = new JFileChooser();		
		this.jFileChooserImportacionTipoPrueba.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPrueba = new JButtonMe();
		this.jButtonAbrirImportacionTipoPrueba.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPrueba,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPrueba.setToolTipText("Generar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrueba.add(this.jButtonAbrirImportacionTipoPrueba, this.gridBagConstraintsTipoPrueba);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPrueba = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPrueba.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrueba.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrueba.add(this.jLabelPathArchivoImportacionTipoPrueba, this.gridBagConstraintsTipoPrueba);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPrueba=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPrueba.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrueba.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrueba.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrueba.add(this.jTextFieldPathArchivoImportacionTipoPrueba, this.gridBagConstraintsTipoPrueba);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPrueba = new JButtonMe();
		this.jButtonGenerarImportacionTipoPrueba.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPrueba,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPrueba.setToolTipText("Generar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrueba.add(this.jButtonGenerarImportacionTipoPrueba, this.gridBagConstraintsTipoPrueba);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPrueba = new JButtonMe();
		this.jButtonCerrarImportacionTipoPrueba.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPrueba,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPrueba.setToolTipText("Cancelar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrueba.add(this.jButtonCerrarImportacionTipoPrueba, this.gridBagConstraintsTipoPrueba);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPrueba = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPrueba= new JScrollPane(jPanelImportacionTipoPrueba,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPrueba.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPrueba.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPrueba.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPrueba);
		this.jInternalFrameImportacionTipoPrueba.getContentPane().add(this.jScrollPanelImportacionTipoPrueba, this.gridBagConstraintsTipoPrueba);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPrueba(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPrueba = new JButtonMe();
			this.jButtonAbrirOrderByTipoPrueba.setText("Orden");
			this.jButtonAbrirOrderByTipoPrueba.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrueba,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPrueba";
			inputMap = this.jButtonAbrirOrderByTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPrueba"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPrueba = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPrueba.setName("jPanelOrderByTipoPrueba"); 
			
			this.jPanelOrderByTipoPrueba.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrueba.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrueba.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPrueba.setLayout(gridaBagLayoutOrderByTipoPrueba);
			
			
			this.jTableDatosTipoPruebaOrderBy = new JTableMe();        
			this.jTableDatosTipoPruebaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPruebaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPruebaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPruebaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPruebaOrderBy.setViewportView(this.jTableDatosTipoPruebaOrderBy);
			this.jTableDatosTipoPruebaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPruebaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPrueba= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPrueba= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPrueba = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPrueba= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPrueba.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPrueba.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPrueba.setTitle("Orden");
			this.jInternalFrameOrderByTipoPrueba.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPrueba.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPrueba.setResizable(true);
			this.jInternalFrameOrderByTipoPrueba.setClosable(true);
			this.jInternalFrameOrderByTipoPrueba.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPrueba.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrueba.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrueba.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pruebas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPrueba.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPrueba.ipady =150;
				
			this.jPanelOrderByTipoPrueba.add(jScrollPanelDatosTipoPruebaOrderBy, this.gridBagConstraintsTipoPrueba);//this.jTableDatosTipoPruebaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPrueba = new JButtonMe();
			this.jButtonCerrarOrderByTipoPrueba.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPrueba,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPrueba.setToolTipText("Cancelar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPrueba.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPrueba.add(this.jButtonCerrarOrderByTipoPrueba, this.gridBagConstraintsTipoPrueba);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPrueba = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPrueba= new JScrollPane(jPanelOrderByTipoPrueba,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPrueba.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPrueba.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPrueba.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPrueba);
			
			this.jInternalFrameOrderByTipoPrueba.getContentPane().add(this.jScrollPanelOrderByTipoPrueba, this.gridBagConstraintsTipoPrueba);			
		
		} else {
			this.jButtonAbrirOrderByTipoPrueba = new JButtonMe();
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
			&& this.tipopruebaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPrueba.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPrueba.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPrueba.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPrueba.getRowHeight();//TipoPruebaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPruebaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrueba.isSelected()) {
					iHeightTable=TipoPruebaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPruebaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPruebaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPruebaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrueba.isSelected()) {
					iHeightTable=TipoPruebaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPruebaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPruebaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPrueba.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrueba.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrueba.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPrueba.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrueba.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrueba.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPrueba!=null && this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy()!=null) {
			//if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPrueba.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPrueba.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPrueba.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPrueba.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrueba.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrueba.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipopruebaLogic.getTipoPruebas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopruebas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPrueba> TraerTipoPruebaBeans(List<TipoPrueba> tipopruebas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPrueba tipoprueba:tipopruebas) {
					
				if(!(TipoPruebaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPruebaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprueba.setsDetalleGeneralEntityReporte(TipoPruebaConstantesFunciones.getTipoPruebaDescripcion(tipoprueba));
										
						
					
						
					
				} else  {
							
					//tipoprueba.setsDetalleGeneralEntityReporte(tipoprueba.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipopruebabeans.add(tipopruebabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipopruebas;
    }
	//PARA REPORTES FIN
}
