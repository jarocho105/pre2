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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.TipoCalculoConstantesFunciones;

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
public class TipoCalculoJInternalFrame extends TipoCalculoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCalculo;
	
	protected JMenuBar jmenuBarTipoCalculo;
	
	protected JMenu jmenuTipoCalculo;
	protected JMenu jmenuDatosTipoCalculo;
	protected JMenu jmenuArchivoTipoCalculo;
	protected JMenu jmenuAccionesTipoCalculo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCalculo;	
	protected GridBagConstraints gridBagConstraintsTipoCalculo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCalculoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCalculo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCalculo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCalculo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCalculoSessionBean tipocalculoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCalculo> tipocalculos;		
	public List<TipoCalculo> tipocalculosEliminados;	
	public List<TipoCalculo> tipocalculosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCalculo;		
	protected JButton jButtonAbrirOrderByTipoCalculo;
	
	
	//protected JPanel jPanelOrderByTipoCalculo;
	//public JScrollPane jScrollPanelOrderByTipoCalculo;	
	//protected JButton jButtonCerrarOrderByTipoCalculo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCalculoLogic tipocalculoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCalculo;
	public JScrollPane jScrollPanelDatosEdicionTipoCalculo;
	public JScrollPane jScrollPanelDatosGeneralTipoCalculo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCalculoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCalculo;
	//public JScrollPane jScrollPanelImportacionTipoCalculo;
	
	
	
	protected JPanel jPanelAccionesTipoCalculo;
	
    protected JPanel jPanelPaginacionTipoCalculo;
    protected JPanel jPanelParametrosReportesTipoCalculo;
	protected JPanel jPanelParametrosReportesAccionesTipoCalculo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCalculo;
	protected JPanel jPanelParametrosAuxiliar2TipoCalculo;
	protected JPanel jPanelParametrosAuxiliar3TipoCalculo;
	protected JPanel jPanelParametrosAuxiliar4TipoCalculo;
	//protected JPanel jPanelParametrosAuxiliar5TipoCalculo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCalculo;
	//protected JPanel jPanelImportacionTipoCalculo;
	
	
	public JTable jTableDatosTipoCalculo;
	
	
	
	//public JTable jTableDatosTipoCalculoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCalculo;
	protected JButton jButtonDuplicarTipoCalculo;
	protected JButton jButtonCopiarTipoCalculo;
	protected JButton jButtonVerFormTipoCalculo;
	protected JButton jButtonNuevoRelacionesTipoCalculo;
	protected JButton jButtonModificarTipoCalculo;
	
    protected JButton jButtonGuardarCambiosTablaTipoCalculo;
	protected JButton jButtonCerrarTipoCalculo;
	
	
	protected JButton jButtonRecargarInformacionTipoCalculo;
	protected JButton jButtonProcesarInformacionTipoCalculo;
	
	
	protected JButton jButtonAnterioresTipoCalculo;
	protected JButton jButtonSiguientesTipoCalculo;
	protected JButton jButtonNuevoGuardarCambiosTipoCalculo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCalculo;
	//protected JButton jButtonCerrarReporteDinamicoTipoCalculo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCalculo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCalculo;
	//protected JButton jButtonGenerarImportacionTipoCalculo;
	//protected JButton jButtonCerrarImportacionTipoCalculo;
	//protected JFileChooser jFileChooserImportacionTipoCalculo;
	//protected File fileImportacionTipoCalculo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCalculo;
	protected JButton jButtonDuplicarToolBarTipoCalculo;
	protected JButton jButtonNuevoRelacionesToolBarTipoCalculo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCalculo;
	protected JButton jButtonCopiarToolBarTipoCalculo;
	protected JButton jButtonVerFormToolBarTipoCalculo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCalculo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCalculo;
	protected JButton jButtonCerrarToolBarTipoCalculo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCalculo;
	protected JButton jButtonProcesarInformacionToolBarTipoCalculo;
	protected JButton jButtonAnterioresToolBarTipoCalculo;
	protected JButton jButtonSiguientesToolBarTipoCalculo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCalculo;
	protected JButton jButtonAbrirOrderByToolBarTipoCalculo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCalculo;
	protected JMenuItem jMenuItemDuplicarTipoCalculo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCalculo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCalculo;
	protected JMenuItem jMenuItemCopiarTipoCalculo;
	protected JMenuItem jMenuItemVerFormTipoCalculo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCalculo;
	protected JMenuItem jMenuItemCerrarTipoCalculo;
	protected JMenuItem jMenuItemDetalleCerrarTipoCalculo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCalculo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCalculo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCalculo;
	protected JMenuItem jMenuItemProcesarInformacionTipoCalculo;
	protected JMenuItem jMenuItemAnterioresTipoCalculo;
	protected JMenuItem jMenuItemSiguientesTipoCalculo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCalculo;
	protected JMenuItem jMenuItemAbrirOrderByTipoCalculo;
	protected JMenuItem jMenuItemMostrarOcultarTipoCalculo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCalculo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCalculo;
	protected JCheckBox jCheckBoxSeleccionadosTipoCalculo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCalculo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCalculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCalculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCalculo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCalculo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCalculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCalculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCalculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCalculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCalculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCalculo;
	protected JTextField jTextFieldValorCampoGeneralTipoCalculo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCalculo;
	//public JList<Reporte> jListColumnasSelectReporteTipoCalculo;
	//public JScrollPane jScrollColumnasSelectReporteTipoCalculo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCalculo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCalculo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCalculo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCalculo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCalculo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCalculo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCalculo;
	
		
	//public JLabel jLabelArchivoImportacionTipoCalculo;	
	//public JLabel jLabelPathArchivoImportacionTipoCalculo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCalculo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCalculo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCalculo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCalculo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCalculo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCalculo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCalculo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCalculo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCalculo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCalculo;	
	
	
	
	
	
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
	public TipoCalculoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCalculo)	{
		this.jButtonRecargarInformacionTipoCalculo = jButtonRecargarInformacionTipoCalculo;
	}
	
	public JButton getjButtonProcesarInformacionTipoCalculo() {
		return this.jButtonProcesarInformacionTipoCalculo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCalculo)	{
		this.jButtonProcesarInformacionTipoCalculo = jButtonProcesarInformacionTipoCalculo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCalculo() {
		return this.jButtonRecargarInformacionTipoCalculo;
	}
	
	
	public List<TipoCalculo> gettipocalculos() {
		return this.tipocalculos;
	}

	public void settipocalculos(List<TipoCalculo> tipocalculos) {
		this.tipocalculos = tipocalculos;
	}
	
	public List<TipoCalculo> gettipocalculosAux() {
		return this.tipocalculosAux;
	}

	public void settipocalculosAux(List<TipoCalculo> tipocalculosAux) {
		this.tipocalculosAux = tipocalculosAux;
	}
	
	public List<TipoCalculo> gettipocalculosEliminados() {
		return this.tipocalculosEliminados;
	}

	public void setTipoCalculosEliminados(List<TipoCalculo> tipocalculosEliminados) {
		this.tipocalculosEliminados = tipocalculosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCalculo() {
		return jComboBoxTiposSeleccionarTipoCalculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCalculo(
			JComboBox jComboBoxTiposSeleccionarTipoCalculo) {
		this.jComboBoxTiposSeleccionarTipoCalculo = jComboBoxTiposSeleccionarTipoCalculo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCalculo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCalculo() {
		return jTextFieldValorCampoGeneralTipoCalculo;
	}

	public void setjTextFieldValorCampoGeneralTipoCalculo(
			JTextField jTextFieldValorCampoGeneralTipoCalculo) {
		this.jTextFieldValorCampoGeneralTipoCalculo = jTextFieldValorCampoGeneralTipoCalculo;
	}

	public void setBorderResaltarValorCampoGeneralTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCalculo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCalculo() {
		return this.jCheckBoxSeleccionarTodosTipoCalculo;
	}

	public void setjCheckBoxSeleccionarTodosTipoCalculo(
			JCheckBox jCheckBoxSeleccionarTodosTipoCalculo) {
		this.jCheckBoxSeleccionarTodosTipoCalculo = jCheckBoxSeleccionarTodosTipoCalculo;
	}

	public void setBorderResaltarSeleccionarTodosTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCalculo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCalculo() {
		return this.jCheckBoxSeleccionadosTipoCalculo;
	}

	public void setjCheckBoxSeleccionadosTipoCalculo(
			JCheckBox jCheckBoxSeleccionadosTipoCalculo) {
		this.jCheckBoxSeleccionadosTipoCalculo = jCheckBoxSeleccionadosTipoCalculo;
	}
	
	public void setBorderResaltarSeleccionadosTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCalculo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCalculo() {
		return this.jComboBoxTiposArchivosReportesTipoCalculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCalculo(
			JComboBox jComboBoxTiposArchivosReportesTipoCalculo) {
		this.jComboBoxTiposArchivosReportesTipoCalculo = jComboBoxTiposArchivosReportesTipoCalculo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCalculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCalculo() {
		return this.jComboBoxTiposReportesTipoCalculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCalculo(
			JComboBox jComboBoxTiposReportesTipoCalculo) {
		this.jComboBoxTiposReportesTipoCalculo = jComboBoxTiposReportesTipoCalculo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCalculo() {
	//	return jComboBoxTiposReportesDinamicoTipoCalculo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCalculo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCalculo) {
	//	this.jComboBoxTiposReportesDinamicoTipoCalculo = jComboBoxTiposReportesDinamicoTipoCalculo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCalculo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCalculo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCalculo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCalculo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCalculo = jComboBoxTiposArchivosReportesDinamicoTipoCalculo;
	//}
	
	public void setBorderResaltarTiposReportesTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCalculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCalculo() {
		return this.jComboBoxTiposGraficosReportesTipoCalculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCalculo(
			JComboBox jComboBoxTiposGraficosReportesTipoCalculo) {
		this.jComboBoxTiposGraficosReportesTipoCalculo = jComboBoxTiposGraficosReportesTipoCalculo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCalculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCalculo() {
		return this.jComboBoxTiposPaginacionTipoCalculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCalculo(
			JComboBox jComboBoxTiposPaginacionTipoCalculo) {
		this.jComboBoxTiposPaginacionTipoCalculo = jComboBoxTiposPaginacionTipoCalculo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCalculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCalculo() {
		return this.jComboBoxTiposRelacionesTipoCalculo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCalculo() {
		return this.jComboBoxTiposAccionesTipoCalculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCalculo(
			JComboBox jComboBoxTiposRelacionesTipoCalculo) {
		this.jComboBoxTiposRelacionesTipoCalculo = jComboBoxTiposRelacionesTipoCalculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCalculo(
			JComboBox jComboBoxTiposAccionesTipoCalculo) {
		this.jComboBoxTiposAccionesTipoCalculo = jComboBoxTiposAccionesTipoCalculo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCalculo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCalculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCalculo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCalculo() {
	//	return jCheckBoxConGraficoDinamicoTipoCalculo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCalculo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCalculo) {
	//	this.jCheckBoxConGraficoDinamicoTipoCalculo = jCheckBoxConGraficoDinamicoTipoCalculo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCalculo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCalculo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCalculo .setBorder(borderResaltar);		
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
		this.tipocalculoSessionBean=new TipoCalculoSessionBean();
		
		this.tipocalculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocalculoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCalculoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCalculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCalculoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCalculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCalculoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Calculo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCalculoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCalculo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"nuevo","nuevo","Nuevo"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"duplicar","duplicar","Duplicar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"copiar","copiar","Copiar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"ver_form","ver_form","Ver"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"recargar","recargar","Recargar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCalculo,this.jTtoolBarTipoCalculo,
							"cerrar","cerrar","Salir"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCalculo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCalculo;
			
				this.jButtonProcesarInformacionToolBarTipoCalculo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCalculo;
				
		//protected JButton jButtonModificarToolBarTipoCalculo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCalculo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCalculo=new JMenuMe("General");
		this.jmenuArchivoTipoCalculo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCalculo=new JMenuMe("Acciones");
		this.jmenuDatosTipoCalculo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCalculo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCalculo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCalculo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCalculo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCalculo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCalculo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCalculo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCalculo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCalculo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCalculo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCalculo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCalculo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCalculo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCalculo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCalculo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCalculo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCalculo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCalculo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCalculo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCalculo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCalculo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCalculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCalculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCalculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCalculo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCalculo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCalculo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCalculo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCalculo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCalculo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCalculo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCalculo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCalculo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCalculo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCalculo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCalculo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCalculo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCalculo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCalculo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCalculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCalculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCalculo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCalculo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCalculo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCalculo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCalculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCalculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCalculo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCalculo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCalculo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCalculo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCalculo.add(this.jMenuItemCerrarTipoCalculo);
			
			this.jmenuAccionesTipoCalculo.add(this.jMenuItemNuevoTipoCalculo);
			this.jmenuAccionesTipoCalculo.add(this.jMenuItemNuevoGuardarCambiosTipoCalculo);
			this.jmenuAccionesTipoCalculo.add(this.jMenuItemNuevoRelacionesTipoCalculo);
			this.jmenuAccionesTipoCalculo.add(this.jMenuItemGuardarCambiosTablaTipoCalculo);		
			this.jmenuAccionesTipoCalculo.add(this.jMenuItemDuplicarTipoCalculo);		
			this.jmenuAccionesTipoCalculo.add(this.jMenuItemCopiarTipoCalculo);		
			this.jmenuAccionesTipoCalculo.add(this.jMenuItemVerFormTipoCalculo);		
			
			this.jmenuDatosTipoCalculo.add(this.jMenuItemRecargarInformacionTipoCalculo);				
			this.jmenuDatosTipoCalculo.add(this.jMenuItemAnterioresTipoCalculo);				
			this.jmenuDatosTipoCalculo.add(this.jMenuItemSiguientesTipoCalculo);				
			this.jmenuDatosTipoCalculo.add(this.jMenuItemAbrirOrderByTipoCalculo);				
			this.jmenuDatosTipoCalculo.add(this.jMenuItemMostrarOcultarTipoCalculo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCalculo.add(this.jMenuItemGuardarCambiosTipoCalculo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCalculo.add(this.jmenuArchivoTipoCalculo);		
			this.jmenuBarTipoCalculo.add(this.jmenuAccionesTipoCalculo);		
			this.jmenuBarTipoCalculo.add(this.jmenuDatosTipoCalculo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCalculo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCalculo() {
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
			//this.jInternalFrameDetalleTipoCalculo = new TipoCalculoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Calculo DATOS");
			this.jInternalFrameDetalleFormTipoCalculo = new TipoCalculoDetalleFormJInternalFrame(jDesktopPane,this.tipocalculoSessionBean.getConGuardarRelaciones(),this.tipocalculoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCalculo = null;//new TipoCalculoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCalculo= new GridBagLayout();
		
		
		this.jTableDatosTipoCalculo = new JTableMe();      
		
		String sToolTipTipoCalculo="";
		sToolTipTipoCalculo=TipoCalculoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCalculo+="(Nomina.TipoCalculo)";
		}
		
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCalculo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCalculo.setToolTipText(sToolTipTipoCalculo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCalculo);
		this.jTableDatosTipoCalculo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCalculo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCalculo.setRowSelectionAllowed(true);
		this.jTableDatosTipoCalculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCalculo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCalculo = new JButtonMe();
		this.jButtonDuplicarTipoCalculo = new JButtonMe();
		this.jButtonCopiarTipoCalculo = new JButtonMe();
		this.jButtonVerFormTipoCalculo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCalculo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCalculo = new JButtonMe();
		this.jButtonCerrarTipoCalculo = new JButtonMe();
		
		this.jScrollPanelDatosTipoCalculo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCalculo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Calculo";
		
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCalculo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCalculo.setToolTipText("Acciones");
        this.jPanelAccionesTipoCalculo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCalculo=new ReporteDinamicoJInternalFrame(TipoCalculoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCalculo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCalculo=new ImportacionJInternalFrame(TipoCalculoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCalculo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCalculo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCalculo.setText("Orden");
		this.jButtonAbrirOrderByTipoCalculo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCalculo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCalculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalculo,false,this);
			
			//this.cargarOrderByTipoCalculo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCalculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalculo,true,this);
			
			//this.cargarOrderByTipoCalculo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCalculo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCalculo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCalculo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCalculo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCalculo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCalculo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCalculo.setText("Nuevo");
		this.jButtonDuplicarTipoCalculo.setText("Duplicar");
		this.jButtonCopiarTipoCalculo.setText("Copiar");
		this.jButtonVerFormTipoCalculo.setText("Ver");
		this.jButtonNuevoRelacionesTipoCalculo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCalculo.setText("Guardar");
		this.jButtonCerrarTipoCalculo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCalculo,"nuevo_button","Nuevo",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCalculo,"duplicar_button","Duplicar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCalculo,"copiar_button","Copiar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCalculo,"ver_form","Ver",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCalculo,"nuevorelaciones_button","Nuevo Rel",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCalculo,"guardarcambiostabla_button","Guardar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCalculo,"cerrar_button","Salir",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCalculo.setToolTipText("Nuevo"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCalculo.setToolTipText("Duplicar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCalculo.setToolTipText("Copiar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCalculo.setToolTipText("Ver"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCalculo.setToolTipText("Nuevo Rel"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCalculo.setToolTipText("Guardar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCalculo.setToolTipText("Salir"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCalculo";
		inputMap = this.jButtonNuevoTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCalculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCalculo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCalculo";
		inputMap = this.jButtonDuplicarTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCalculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCalculo"));
		
		//COPIAR
		sMapKey = "CopiarTipoCalculo";
		inputMap = this.jButtonCopiarTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCalculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCalculo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCalculo";
		inputMap = this.jButtonVerFormTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCalculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCalculo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCalculo";
		inputMap = this.jButtonNuevoRelacionesTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCalculo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCalculo";
		inputMap = this.jButtonModificarTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCalculo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCalculo";
		inputMap = this.jButtonCerrarTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCalculo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCalculo";
		inputMap = this.jButtonGuardarCambiosTablaTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCalculo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCalculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCalculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCalculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCalculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCalculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCalculo.setName("jPanelParametrosReportesTipoCalculo"); 
		
		this.jPanelParametrosReportesAccionesTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCalculo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCalculo.setName("jPanelParametrosReportesAccionesTipoCalculo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCalculo = new JButtonMe();
		this.jButtonRecargarInformacionTipoCalculo.setText("Recargar");
		this.jButtonRecargarInformacionTipoCalculo.setToolTipText("Recargar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCalculo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCalculo = new JButtonMe();
		this.jButtonProcesarInformacionTipoCalculo.setText("Procesar");
		this.jButtonProcesarInformacionTipoCalculo.setToolTipText("Procesar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCalculo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCalculo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCalculo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCalculo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalculo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCalculo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalculo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCalculo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalculo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCalculo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCalculo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCalculo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCalculo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCalculo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCalculo.setText("Accion");
		this.jComboBoxTiposAccionesTipoCalculo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCalculo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCalculo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCalculo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCalculo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCalculo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCalculo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCalculo = new JLabelMe();
		
		this.jLabelAccionesTipoCalculo.setText("Acciones");		
		this.jLabelAccionesTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCalculo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCalculo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCalculo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCalculo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCalculo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCalculo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCalculo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCalculo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCalculo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCalculo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCalculo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCalculo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCalculo = new JButtonMe();
		//this.jButtonAnterioresTipoCalculo.setText("<<");
        this.jButtonAnterioresTipoCalculo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCalculo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCalculo = new JButtonMe();
		//this.jButtonSiguientesTipoCalculo.setText(">>");
        this.jButtonSiguientesTipoCalculo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCalculo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCalculo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCalculo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCalculo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCalculo,"nuevoguardarcambios_button","Nue",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCalculo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCalculo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCalculo";
		inputMap = this.jButtonRecargarInformacionTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCalculo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCalculo";
		inputMap = this.jButtonSiguientesTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCalculo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCalculo";
		inputMap = this.jButtonAnterioresTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCalculo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCalculo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCalculo.setMinimumSize(new Dimension(this.getWidth(),TipoCalculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalculoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCalculo.setMaximumSize(new Dimension(this.getWidth(),TipoCalculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalculoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCalculo.setPreferredSize(new Dimension(this.getWidth(),TipoCalculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalculoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCalculo = new GridBagLayout();

			this.jPanelPaginacionTipoCalculo.setLayout(gridaBagLayoutPaginacionTipoCalculo);						
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = 0;
			this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCalculo.add(this.jButtonAnterioresTipoCalculo, this.gridBagConstraintsTipoCalculo);
					
						
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCalculo.gridy = 0;
			
			this.jPanelPaginacionTipoCalculo.add(this.jButtonNuevoGuardarCambiosTipoCalculo, this.gridBagConstraintsTipoCalculo);
						
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCalculo.gridy = 0;
			this.jPanelPaginacionTipoCalculo.add(this.jButtonSiguientesTipoCalculo, this.gridBagConstraintsTipoCalculo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = 1;
			this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalculo.add(this.jButtonNuevoTipoCalculo, this.gridBagConstraintsTipoCalculo);
						
			
			
			if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
				this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCalculo.gridy = 1;
				this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCalculo.add(this.jButtonGuardarCambiosTablaTipoCalculo, this.gridBagConstraintsTipoCalculo);
			}
			
			
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = 1;
			this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalculo.add(this.jButtonDuplicarTipoCalculo, this.gridBagConstraintsTipoCalculo);
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = 1;
			this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalculo.add(this.jButtonCopiarTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = 1;
			this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalculo.add(this.jButtonVerFormTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = 1;
			this.gridBagConstraintsTipoCalculo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCalculo.add(this.jButtonCerrarTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
		
		
		this.jButtonRecargarInformacionTipoCalculo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCalculo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCalculo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCalculo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCalculo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCalculo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCalculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCalculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCalculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCalculo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCalculo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCalculo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCalculo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCalculo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCalculo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCalculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCalculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCalculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCalculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCalculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCalculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCalculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCalculo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCalculo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCalculo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCalculo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCalculo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCalculo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCalculo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCalculo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCalculo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCalculo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCalculo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCalculo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCalculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCalculo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCalculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCalculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCalculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCalculo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCalculo.setLayout(gridaBagParametrosReportesTipoCalculo);
			this.jPanelParametrosReportesAccionesTipoCalculo.setLayout(gridaBagParametrosReportesAccionesTipoCalculo);
			
			
			this.jPanelParametrosAuxiliar1TipoCalculo.setLayout(gridaBagParametrosAuxiliar1TipoCalculo);
			this.jPanelParametrosAuxiliar2TipoCalculo.setLayout(gridaBagParametrosAuxiliar2TipoCalculo);
			this.jPanelParametrosAuxiliar3TipoCalculo.setLayout(gridaBagParametrosAuxiliar3TipoCalculo);
			this.jPanelParametrosAuxiliar4TipoCalculo.setLayout(gridaBagParametrosAuxiliar4TipoCalculo);
			//this.jPanelParametrosAuxiliar5TipoCalculo.setLayout(gridaBagParametrosAuxiliar2TipoCalculo);			
			
			
			
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalculo.add(this.jButtonRecargarInformacionTipoCalculo, this.gridBagConstraintsTipoCalculo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalculo.add(this.jComboBoxTiposPaginacionTipoCalculo, this.gridBagConstraintsTipoCalculo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalculo.add(this.jCheckBoxConAltoMaximoTablaTipoCalculo, this.gridBagConstraintsTipoCalculo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalculo.add(this.jComboBoxTiposArchivosReportesTipoCalculo, this.gridBagConstraintsTipoCalculo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculo.add(this.jPanelParametrosAuxiliar1TipoCalculo, this.gridBagConstraintsTipoCalculo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCalculo.add(this.jComboBoxTiposReportesTipoCalculo, this.gridBagConstraintsTipoCalculo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculo.add(this.jPanelParametrosAuxiliar4TipoCalculo, this.gridBagConstraintsTipoCalculo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculo.add(this.jComboBoxTiposReportesTipoCalculo, this.gridBagConstraintsTipoCalculo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalculo.add(this.jCheckBoxGenerarReporteTipoCalculo, this.gridBagConstraintsTipoCalculo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculo.add(this.jPanelParametrosAuxiliar2TipoCalculo, this.gridBagConstraintsTipoCalculo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalculo.add(this.jLabelAccionesTipoCalculo, this.gridBagConstraintsTipoCalculo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
				this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCalculo.add(this.jButtonAbrirOrderByTipoCalculo, this.gridBagConstraintsTipoCalculo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalculo.add(this.jComboBoxTiposSeleccionarTipoCalculo, this.gridBagConstraintsTipoCalculo);			
			
			
			/*
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalculo.add(this.jCheckBoxSeleccionarTodosTipoCalculo, this.gridBagConstraintsTipoCalculo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCalculo.add(this.jCheckBoxSeleccionarTodosTipoCalculo, this.gridBagConstraintsTipoCalculo);															
				
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCalculo.add(this.jCheckBoxSeleccionadosTipoCalculo, this.gridBagConstraintsTipoCalculo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculo.add(this.jPanelParametrosAuxiliar3TipoCalculo, this.gridBagConstraintsTipoCalculo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalculo.add(this.jComboBoxTiposRelacionesTipoCalculo, this.gridBagConstraintsTipoCalculo);
				
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalculo.add(this.jComboBoxTiposAccionesTipoCalculo, this.gridBagConstraintsTipoCalculo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCalculo = new GridBagLayout();

			this.jScrollPanelDatosTipoCalculo.setLayout(gridaBagLayoutDatosTipoCalculo);
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = 0;
			this.gridBagConstraintsTipoCalculo.gridx = 0;
			
			this.jScrollPanelDatosTipoCalculo.add(this.jTableDatosTipoCalculo, this.gridBagConstraintsTipoCalculo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCalculo.setViewportView(this.jTableDatosTipoCalculo);
		this.jTableDatosTipoCalculo.setFillsViewportHeight(true);
		this.jTableDatosTipoCalculo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCalculo= new GridBagLayout();
		this.jPanelAccionesTipoCalculo.setLayout(gridaBagLayoutAccionesTipoCalculo);
		
		
		/*	
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = 0;
		this.gridBagConstraintsTipoCalculo.gridx = 0;
			
		this.jPanelAccionesTipoCalculo.add(this.jButtonNuevoTipoCalculo, this.gridBagConstraintsTipoCalculo);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCalculo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCalculo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();						
			this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCalculo.gridx = 0;		
			//this.gridBagConstraintsTipoCalculo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCalculo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCalculo, this.gridBagConstraintsTipoCalculo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCalculo.gridx = 0;		
		//this.gridBagConstraintsTipoCalculo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCalculo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCalculo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCalculo, this.gridBagConstraintsTipoCalculo);								
		
		
		/*
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCalculo, this.gridBagConstraintsTipoCalculo);
		*/		
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCalculo.gridx =0;
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCalculo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCalculo, this.gridBagConstraintsTipoCalculo);
				
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCalculo, this.gridBagConstraintsTipoCalculo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoCalculoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCalculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCalculo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCalculo.setLayout(gridaBagLayoutBusquedasParametrosTipoCalculo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCalculo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCalculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCalculo, this.gridBagConstraintsTipoCalculo);
			
			
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
			
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCalculo, this.gridBagConstraintsTipoCalculo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCalculo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCalculo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCalculo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCalculo.setName("jPanelReporteDinamicoTipoCalculo"); 
		
		this.jPanelReporteDinamicoTipoCalculo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCalculo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCalculo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCalculo.setLayout(gridaBagLayoutReporteDinamicoTipoCalculo);
		
		
		this.jInternalFrameReporteDinamicoTipoCalculo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCalculo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCalculo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCalculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCalculo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCalculo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCalculo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCalculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCalculo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCalculo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCalculo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCalculo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCalculo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCalculo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCalculo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCalculo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCalculo.add(this.jLabelColumnasSelectReporteTipoCalculo, this.gridBagConstraintsTipoCalculo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCalculo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCalculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCalculo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCalculo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCalculo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCalculo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCalculo=new JScrollPane(this.jListColumnasSelectReporteTipoCalculo);
			
			this.jScrollColumnasSelectReporteTipoCalculo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCalculo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCalculo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCalculo.add(this.jListColumnasSelectReporteTipoCalculo, this.gridBagConstraintsTipoCalculo);
		this.jPanelReporteDinamicoTipoCalculo.add(this.jScrollColumnasSelectReporteTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCalculo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCalculo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCalculo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCalculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCalculo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCalculo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCalculo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCalculo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCalculo=new JScrollPane(this.jListRelacionesSelectReporteTipoCalculo);
			
			this.jScrollRelacionesSelectReporteTipoCalculo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCalculo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCalculo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCalculo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCalculo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCalculo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCalculo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCalculo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCalculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCalculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCalculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCalculo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCalculo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCalculo.add(this.jLabelGenerarExcelReporteDinamicoTipoCalculo, this.gridBagConstraintsTipoCalculo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCalculo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCalculo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCalculo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCalculo.setToolTipText("Generar EXCEL"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCalculo.add(this.jButtonGenerarExcelReporteDinamicoTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalculo.add(this.jComboBoxTiposReportesDinamicoTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCalculo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCalculo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCalculo.add(this.jLabelTiposArchivoReporteDinamicoTipoCalculo, this.gridBagConstraintsTipoCalculo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalculo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCalculo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCalculo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCalculo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCalculo.setToolTipText("Generar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalculo.add(this.jButtonGenerarReporteDinamicoTipoCalculo, this.gridBagConstraintsTipoCalculo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCalculo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCalculo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCalculo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCalculo.setToolTipText("Cancelar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalculo.add(this.jButtonCerrarReporteDinamicoTipoCalculo, this.gridBagConstraintsTipoCalculo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCalculo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCalculo= new JScrollPane(jPanelReporteDinamicoTipoCalculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCalculo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCalculo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCalculo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCalculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCalculo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCalculo);
		this.jInternalFrameReporteDinamicoTipoCalculo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCalculo, this.gridBagConstraintsTipoCalculo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCalculo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCalculo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCalculo.setName("jPanelImportacionTipoCalculo"); 
		
		this.jPanelImportacionTipoCalculo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCalculo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCalculo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCalculo.setLayout(gridaBagLayoutImportacionTipoCalculo);
		
		
		this.jInternalFrameImportacionTipoCalculo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCalculo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCalculo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCalculo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCalculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCalculo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCalculo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCalculo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCalculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCalculo.setResizable(true);
	    this.jInternalFrameImportacionTipoCalculo.setClosable(true);
	    this.jInternalFrameImportacionTipoCalculo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCalculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCalculo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCalculo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCalculo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCalculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCalculo.setResizable(true);
	    this.jInternalFrameImportacionTipoCalculo.setClosable(true);
	    this.jInternalFrameImportacionTipoCalculo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCalculo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCalculo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCalculo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCalculo = new JLabelMe();

		this.jLabelArchivoImportacionTipoCalculo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCalculo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCalculo.add(this.jLabelArchivoImportacionTipoCalculo, this.gridBagConstraintsTipoCalculo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCalculo = new JFileChooser();		
		this.jFileChooserImportacionTipoCalculo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCalculo = new JButtonMe();
		this.jButtonAbrirImportacionTipoCalculo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCalculo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCalculo.setToolTipText("Generar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalculo.add(this.jButtonAbrirImportacionTipoCalculo, this.gridBagConstraintsTipoCalculo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCalculo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCalculo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCalculo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCalculo.add(this.jLabelPathArchivoImportacionTipoCalculo, this.gridBagConstraintsTipoCalculo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCalculo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCalculo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCalculo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCalculo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalculo.add(this.jTextFieldPathArchivoImportacionTipoCalculo, this.gridBagConstraintsTipoCalculo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCalculo = new JButtonMe();
		this.jButtonGenerarImportacionTipoCalculo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCalculo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCalculo.setToolTipText("Generar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalculo.add(this.jButtonGenerarImportacionTipoCalculo, this.gridBagConstraintsTipoCalculo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCalculo = new JButtonMe();
		this.jButtonCerrarImportacionTipoCalculo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCalculo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCalculo.setToolTipText("Cancelar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalculo.add(this.jButtonCerrarImportacionTipoCalculo, this.gridBagConstraintsTipoCalculo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCalculo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCalculo= new JScrollPane(jPanelImportacionTipoCalculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCalculo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCalculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCalculo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCalculo);
		this.jInternalFrameImportacionTipoCalculo.getContentPane().add(this.jScrollPanelImportacionTipoCalculo, this.gridBagConstraintsTipoCalculo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCalculo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCalculo = new JButtonMe();
			this.jButtonAbrirOrderByTipoCalculo.setText("Orden");
			this.jButtonAbrirOrderByTipoCalculo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCalculo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCalculo";
			inputMap = this.jButtonAbrirOrderByTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCalculo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCalculo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCalculo.setName("jPanelOrderByTipoCalculo"); 
			
			this.jPanelOrderByTipoCalculo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCalculo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCalculo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCalculo.setLayout(gridaBagLayoutOrderByTipoCalculo);
			
			
			this.jTableDatosTipoCalculoOrderBy = new JTableMe();        
			this.jTableDatosTipoCalculoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCalculoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCalculoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCalculoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCalculoOrderBy.setViewportView(this.jTableDatosTipoCalculoOrderBy);
			this.jTableDatosTipoCalculoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCalculoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCalculo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCalculo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCalculo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCalculo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCalculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCalculo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCalculo.setTitle("Orden");
			this.jInternalFrameOrderByTipoCalculo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCalculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCalculo.setResizable(true);
			this.jInternalFrameOrderByTipoCalculo.setClosable(true);
			this.jInternalFrameOrderByTipoCalculo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCalculo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCalculo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCalculo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCalculo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCalculo.ipady =150;
				
			this.jPanelOrderByTipoCalculo.add(jScrollPanelDatosTipoCalculoOrderBy, this.gridBagConstraintsTipoCalculo);//this.jTableDatosTipoCalculoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCalculo = new JButtonMe();
			this.jButtonCerrarOrderByTipoCalculo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCalculo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCalculo.setToolTipText("Cancelar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCalculo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCalculo.add(this.jButtonCerrarOrderByTipoCalculo, this.gridBagConstraintsTipoCalculo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCalculo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCalculo= new JScrollPane(jPanelOrderByTipoCalculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCalculo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCalculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCalculo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCalculo);
			
			this.jInternalFrameOrderByTipoCalculo.getContentPane().add(this.jScrollPanelOrderByTipoCalculo, this.gridBagConstraintsTipoCalculo);			
		
		} else {
			this.jButtonAbrirOrderByTipoCalculo = new JButtonMe();
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
			&& this.tipocalculoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCalculo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCalculo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCalculo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCalculo.getRowHeight();//TipoCalculoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCalculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCalculo.isSelected()) {
					iHeightTable=TipoCalculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCalculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCalculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCalculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCalculo.isSelected()) {
					iHeightTable=TipoCalculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCalculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCalculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCalculo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCalculo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCalculo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCalculo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCalculo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCalculo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCalculo!=null && this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCalculo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCalculo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCalculo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCalculo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCalculo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCalculo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocalculoLogic.getTipoCalculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalculos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCalculo> TraerTipoCalculoBeans(List<TipoCalculo> tipocalculos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCalculo tipocalculo:tipocalculos) {
					
				if(!(TipoCalculoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCalculoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocalculo.setsDetalleGeneralEntityReporte(TipoCalculoConstantesFunciones.getTipoCalculoDescripcion(tipocalculo));
										
						
					
						
					
				} else  {
							
					//tipocalculo.setsDetalleGeneralEntityReporte(tipocalculo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocalculobeans.add(tipocalculobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocalculos;
    }
	//PARA REPORTES FIN
}
