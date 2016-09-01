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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TipoFormulaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TipoFormulaJInternalFrame extends TipoFormulaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFormula;
	
	protected JMenuBar jmenuBarTipoFormula;
	
	protected JMenu jmenuTipoFormula;
	protected JMenu jmenuDatosTipoFormula;
	protected JMenu jmenuArchivoTipoFormula;
	protected JMenu jmenuAccionesTipoFormula;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFormula;	
	protected GridBagConstraints gridBagConstraintsTipoFormula;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFormulaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFormula;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFormula;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFormula;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFormulaSessionBean tipoformulaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFormula> tipoformulas;		
	public List<TipoFormula> tipoformulasEliminados;	
	public List<TipoFormula> tipoformulasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFormula;		
	protected JButton jButtonAbrirOrderByTipoFormula;
	
	
	//protected JPanel jPanelOrderByTipoFormula;
	//public JScrollPane jScrollPanelOrderByTipoFormula;	
	//protected JButton jButtonCerrarOrderByTipoFormula;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFormulaLogic tipoformulaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFormula;
	public JScrollPane jScrollPanelDatosEdicionTipoFormula;
	public JScrollPane jScrollPanelDatosGeneralTipoFormula;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFormulaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFormula;
	//public JScrollPane jScrollPanelImportacionTipoFormula;
	
	
	
	protected JPanel jPanelAccionesTipoFormula;
	
    protected JPanel jPanelPaginacionTipoFormula;
    protected JPanel jPanelParametrosReportesTipoFormula;
	protected JPanel jPanelParametrosReportesAccionesTipoFormula;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFormula;
	protected JPanel jPanelParametrosAuxiliar2TipoFormula;
	protected JPanel jPanelParametrosAuxiliar3TipoFormula;
	protected JPanel jPanelParametrosAuxiliar4TipoFormula;
	//protected JPanel jPanelParametrosAuxiliar5TipoFormula;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFormula;
	//protected JPanel jPanelImportacionTipoFormula;
	
	
	public JTable jTableDatosTipoFormula;
	
	
	
	//public JTable jTableDatosTipoFormulaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFormula;
	protected JButton jButtonDuplicarTipoFormula;
	protected JButton jButtonCopiarTipoFormula;
	protected JButton jButtonVerFormTipoFormula;
	protected JButton jButtonNuevoRelacionesTipoFormula;
	protected JButton jButtonModificarTipoFormula;
	
    protected JButton jButtonGuardarCambiosTablaTipoFormula;
	protected JButton jButtonCerrarTipoFormula;
	
	
	protected JButton jButtonRecargarInformacionTipoFormula;
	protected JButton jButtonProcesarInformacionTipoFormula;
	
	
	protected JButton jButtonAnterioresTipoFormula;
	protected JButton jButtonSiguientesTipoFormula;
	protected JButton jButtonNuevoGuardarCambiosTipoFormula;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFormula;
	//protected JButton jButtonCerrarReporteDinamicoTipoFormula;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFormula;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFormula;
	//protected JButton jButtonGenerarImportacionTipoFormula;
	//protected JButton jButtonCerrarImportacionTipoFormula;
	//protected JFileChooser jFileChooserImportacionTipoFormula;
	//protected File fileImportacionTipoFormula;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFormula;
	protected JButton jButtonDuplicarToolBarTipoFormula;
	protected JButton jButtonNuevoRelacionesToolBarTipoFormula;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFormula;
	protected JButton jButtonCopiarToolBarTipoFormula;
	protected JButton jButtonVerFormToolBarTipoFormula;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFormula;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFormula;
	protected JButton jButtonCerrarToolBarTipoFormula;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFormula;
	protected JButton jButtonProcesarInformacionToolBarTipoFormula;
	protected JButton jButtonAnterioresToolBarTipoFormula;
	protected JButton jButtonSiguientesToolBarTipoFormula;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFormula;
	protected JButton jButtonAbrirOrderByToolBarTipoFormula;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFormula;
	protected JMenuItem jMenuItemDuplicarTipoFormula;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFormula;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFormula;
	protected JMenuItem jMenuItemCopiarTipoFormula;
	protected JMenuItem jMenuItemVerFormTipoFormula;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFormula;
	protected JMenuItem jMenuItemCerrarTipoFormula;
	protected JMenuItem jMenuItemDetalleCerrarTipoFormula;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFormula;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFormula;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFormula;
	protected JMenuItem jMenuItemProcesarInformacionTipoFormula;
	protected JMenuItem jMenuItemAnterioresTipoFormula;
	protected JMenuItem jMenuItemSiguientesTipoFormula;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFormula;
	protected JMenuItem jMenuItemAbrirOrderByTipoFormula;
	protected JMenuItem jMenuItemMostrarOcultarTipoFormula;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFormula;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFormula;
	protected JCheckBox jCheckBoxSeleccionadosTipoFormula;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFormula;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFormula;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFormula;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFormula;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFormula;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFormula;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFormula;
	protected JTextField jTextFieldValorCampoGeneralTipoFormula;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFormula;
	//public JList<Reporte> jListColumnasSelectReporteTipoFormula;
	//public JScrollPane jScrollColumnasSelectReporteTipoFormula;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFormula;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFormula;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFormula;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFormula;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFormula;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFormula;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFormula;
	
		
	//public JLabel jLabelArchivoImportacionTipoFormula;	
	//public JLabel jLabelPathArchivoImportacionTipoFormula;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFormula;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFormula;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFormula;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFormula;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFormula;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFormula;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFormula;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFormula;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFormula;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFormula;	
	
	
	
	
	
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
	public TipoFormulaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormulaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormulaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormulaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFormula)	{
		this.jButtonRecargarInformacionTipoFormula = jButtonRecargarInformacionTipoFormula;
	}
	
	public JButton getjButtonProcesarInformacionTipoFormula() {
		return this.jButtonProcesarInformacionTipoFormula;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFormula)	{
		this.jButtonProcesarInformacionTipoFormula = jButtonProcesarInformacionTipoFormula;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFormula() {
		return this.jButtonRecargarInformacionTipoFormula;
	}
	
	
	public List<TipoFormula> gettipoformulas() {
		return this.tipoformulas;
	}

	public void settipoformulas(List<TipoFormula> tipoformulas) {
		this.tipoformulas = tipoformulas;
	}
	
	public List<TipoFormula> gettipoformulasAux() {
		return this.tipoformulasAux;
	}

	public void settipoformulasAux(List<TipoFormula> tipoformulasAux) {
		this.tipoformulasAux = tipoformulasAux;
	}
	
	public List<TipoFormula> gettipoformulasEliminados() {
		return this.tipoformulasEliminados;
	}

	public void setTipoFormulasEliminados(List<TipoFormula> tipoformulasEliminados) {
		this.tipoformulasEliminados = tipoformulasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFormula() {
		return jComboBoxTiposSeleccionarTipoFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFormula(
			JComboBox jComboBoxTiposSeleccionarTipoFormula) {
		this.jComboBoxTiposSeleccionarTipoFormula = jComboBoxTiposSeleccionarTipoFormula;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFormula .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFormula() {
		return jTextFieldValorCampoGeneralTipoFormula;
	}

	public void setjTextFieldValorCampoGeneralTipoFormula(
			JTextField jTextFieldValorCampoGeneralTipoFormula) {
		this.jTextFieldValorCampoGeneralTipoFormula = jTextFieldValorCampoGeneralTipoFormula;
	}

	public void setBorderResaltarValorCampoGeneralTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFormula .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFormula() {
		return this.jCheckBoxSeleccionarTodosTipoFormula;
	}

	public void setjCheckBoxSeleccionarTodosTipoFormula(
			JCheckBox jCheckBoxSeleccionarTodosTipoFormula) {
		this.jCheckBoxSeleccionarTodosTipoFormula = jCheckBoxSeleccionarTodosTipoFormula;
	}

	public void setBorderResaltarSeleccionarTodosTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFormula .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFormula() {
		return this.jCheckBoxSeleccionadosTipoFormula;
	}

	public void setjCheckBoxSeleccionadosTipoFormula(
			JCheckBox jCheckBoxSeleccionadosTipoFormula) {
		this.jCheckBoxSeleccionadosTipoFormula = jCheckBoxSeleccionadosTipoFormula;
	}
	
	public void setBorderResaltarSeleccionadosTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFormula .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFormula() {
		return this.jComboBoxTiposArchivosReportesTipoFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFormula(
			JComboBox jComboBoxTiposArchivosReportesTipoFormula) {
		this.jComboBoxTiposArchivosReportesTipoFormula = jComboBoxTiposArchivosReportesTipoFormula;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFormula .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFormula() {
		return this.jComboBoxTiposReportesTipoFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFormula(
			JComboBox jComboBoxTiposReportesTipoFormula) {
		this.jComboBoxTiposReportesTipoFormula = jComboBoxTiposReportesTipoFormula;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFormula() {
	//	return jComboBoxTiposReportesDinamicoTipoFormula;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFormula(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFormula) {
	//	this.jComboBoxTiposReportesDinamicoTipoFormula = jComboBoxTiposReportesDinamicoTipoFormula;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFormula() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFormula;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFormula(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFormula) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFormula = jComboBoxTiposArchivosReportesDinamicoTipoFormula;
	//}
	
	public void setBorderResaltarTiposReportesTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFormula .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFormula() {
		return this.jComboBoxTiposGraficosReportesTipoFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFormula(
			JComboBox jComboBoxTiposGraficosReportesTipoFormula) {
		this.jComboBoxTiposGraficosReportesTipoFormula = jComboBoxTiposGraficosReportesTipoFormula;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFormula .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFormula() {
		return this.jComboBoxTiposPaginacionTipoFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFormula(
			JComboBox jComboBoxTiposPaginacionTipoFormula) {
		this.jComboBoxTiposPaginacionTipoFormula = jComboBoxTiposPaginacionTipoFormula;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFormula .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFormula() {
		return this.jComboBoxTiposRelacionesTipoFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFormula() {
		return this.jComboBoxTiposAccionesTipoFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFormula(
			JComboBox jComboBoxTiposRelacionesTipoFormula) {
		this.jComboBoxTiposRelacionesTipoFormula = jComboBoxTiposRelacionesTipoFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFormula(
			JComboBox jComboBoxTiposAccionesTipoFormula) {
		this.jComboBoxTiposAccionesTipoFormula = jComboBoxTiposAccionesTipoFormula;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFormula .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFormula .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFormula() {
	//	return jCheckBoxConGraficoDinamicoTipoFormula;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFormula(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFormula) {
	//	this.jCheckBoxConGraficoDinamicoTipoFormula = jCheckBoxConGraficoDinamicoTipoFormula;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFormula() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFormula.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFormula .setBorder(borderResaltar);		
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
		this.tipoformulaSessionBean=new TipoFormulaSessionBean();
		
		this.tipoformulaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformulaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoformulaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFormulaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFormulaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFormulaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFormulaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFormulaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Formula MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFormulaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFormula= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"nuevo","nuevo","Nuevo"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"duplicar","duplicar","Duplicar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"copiar","copiar","Copiar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"ver_form","ver_form","Ver"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"recargar","recargar","Recargar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFormula,this.jTtoolBarTipoFormula,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFormula,this.jTtoolBarTipoFormula,
							"cerrar","cerrar","Salir"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFormula=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFormula;
			
				this.jButtonProcesarInformacionToolBarTipoFormula=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFormula;
				
		//protected JButton jButtonModificarToolBarTipoFormula;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFormula=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFormula=new JMenuMe("General");
		this.jmenuArchivoTipoFormula=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFormula=new JMenuMe("Acciones");
		this.jmenuDatosTipoFormula=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFormula= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFormula.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFormula,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFormula= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFormula.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFormula,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFormula= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFormula.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFormula,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFormula= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFormula.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFormula,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFormula= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFormula.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFormula,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFormula= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFormula.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFormula,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFormula= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFormula.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFormula,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFormula= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFormula.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFormula,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFormula= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFormula.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFormula,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFormula= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFormula.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFormula,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFormula= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFormula.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFormula,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFormula= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFormula.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFormula,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFormula= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFormula.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFormula,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFormula= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFormula.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFormula,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFormula= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFormula.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFormula,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFormula= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFormula.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFormula,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFormula= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFormula.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFormula,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFormula.add(this.jMenuItemCerrarTipoFormula);
			
			this.jmenuAccionesTipoFormula.add(this.jMenuItemNuevoTipoFormula);
			this.jmenuAccionesTipoFormula.add(this.jMenuItemNuevoGuardarCambiosTipoFormula);
			this.jmenuAccionesTipoFormula.add(this.jMenuItemNuevoRelacionesTipoFormula);
			this.jmenuAccionesTipoFormula.add(this.jMenuItemGuardarCambiosTablaTipoFormula);		
			this.jmenuAccionesTipoFormula.add(this.jMenuItemDuplicarTipoFormula);		
			this.jmenuAccionesTipoFormula.add(this.jMenuItemCopiarTipoFormula);		
			this.jmenuAccionesTipoFormula.add(this.jMenuItemVerFormTipoFormula);		
			
			this.jmenuDatosTipoFormula.add(this.jMenuItemRecargarInformacionTipoFormula);				
			this.jmenuDatosTipoFormula.add(this.jMenuItemAnterioresTipoFormula);				
			this.jmenuDatosTipoFormula.add(this.jMenuItemSiguientesTipoFormula);				
			this.jmenuDatosTipoFormula.add(this.jMenuItemAbrirOrderByTipoFormula);				
			this.jmenuDatosTipoFormula.add(this.jMenuItemMostrarOcultarTipoFormula);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFormula.add(this.jMenuItemGuardarCambiosTipoFormula);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFormula.add(this.jmenuArchivoTipoFormula);		
			this.jmenuBarTipoFormula.add(this.jmenuAccionesTipoFormula);		
			this.jmenuBarTipoFormula.add(this.jmenuDatosTipoFormula);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFormula);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFormula() {
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
			//this.jInternalFrameDetalleTipoFormula = new TipoFormulaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Formula DATOS");
			this.jInternalFrameDetalleFormTipoFormula = new TipoFormulaDetalleFormJInternalFrame(jDesktopPane,this.tipoformulaSessionBean.getConGuardarRelaciones(),this.tipoformulaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFormula = null;//new TipoFormulaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFormula= new GridBagLayout();
		
		
		this.jTableDatosTipoFormula = new JTableMe();      
		
		String sToolTipTipoFormula="";
		sToolTipTipoFormula=TipoFormulaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFormula+="(PuntoVenta.TipoFormula)";
		}
		
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFormula+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFormula.setToolTipText(sToolTipTipoFormula);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFormula);
		this.jTableDatosTipoFormula.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFormula.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFormula.setRowSelectionAllowed(true);
		this.jTableDatosTipoFormula.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFormula,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFormula = new JButtonMe();
		this.jButtonDuplicarTipoFormula = new JButtonMe();
		this.jButtonCopiarTipoFormula = new JButtonMe();
		this.jButtonVerFormTipoFormula = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFormula = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFormula = new JButtonMe();
		this.jButtonCerrarTipoFormula = new JButtonMe();
		
		this.jScrollPanelDatosTipoFormula = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFormula = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Formula";
		
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formulas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFormula.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFormula.setToolTipText("Acciones");
        this.jPanelAccionesTipoFormula.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFormula=new ReporteDinamicoJInternalFrame(TipoFormulaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFormula();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFormula=new ImportacionJInternalFrame(TipoFormulaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFormula();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFormula = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFormula.setText("Orden");
		this.jButtonAbrirOrderByTipoFormula.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFormula,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFormula=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormula,false,this);
			
			//this.cargarOrderByTipoFormula(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFormula=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormula,true,this);
			
			//this.cargarOrderByTipoFormula(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFormula.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFormula.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFormula.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoFormula.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFormula.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFormula.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFormula.setText("Nuevo");
		this.jButtonDuplicarTipoFormula.setText("Duplicar");
		this.jButtonCopiarTipoFormula.setText("Copiar");
		this.jButtonVerFormTipoFormula.setText("Ver");
		this.jButtonNuevoRelacionesTipoFormula.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFormula.setText("Guardar");
		this.jButtonCerrarTipoFormula.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFormula,"nuevo_button","Nuevo",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFormula,"duplicar_button","Duplicar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFormula,"copiar_button","Copiar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFormula,"ver_form","Ver",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFormula,"nuevorelaciones_button","Nuevo Rel",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFormula,"guardarcambiostabla_button","Guardar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFormula,"cerrar_button","Salir",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFormula.setToolTipText("Nuevo"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFormula.setToolTipText("Duplicar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFormula.setToolTipText("Copiar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFormula.setToolTipText("Ver"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFormula.setToolTipText("Nuevo Rel"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFormula.setToolTipText("Guardar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFormula.setToolTipText("Salir"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFormula";
		inputMap = this.jButtonNuevoTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFormula"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFormula";
		inputMap = this.jButtonDuplicarTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFormula"));
		
		//COPIAR
		sMapKey = "CopiarTipoFormula";
		inputMap = this.jButtonCopiarTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFormula"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFormula";
		inputMap = this.jButtonVerFormTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFormula"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFormula";
		inputMap = this.jButtonNuevoRelacionesTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFormula"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFormula";
		inputMap = this.jButtonModificarTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFormula"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFormula";
		inputMap = this.jButtonCerrarTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFormula"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFormula";
		inputMap = this.jButtonGuardarCambiosTablaTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFormula"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFormula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFormula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFormula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFormula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFormula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFormula.setName("jPanelParametrosReportesTipoFormula"); 
		
		this.jPanelParametrosReportesAccionesTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFormula.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFormula.setName("jPanelParametrosReportesAccionesTipoFormula"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFormula = new JButtonMe();
		this.jButtonRecargarInformacionTipoFormula.setText("Recargar");
		this.jButtonRecargarInformacionTipoFormula.setToolTipText("Recargar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFormula,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFormula = new JButtonMe();
		this.jButtonProcesarInformacionTipoFormula.setText("Procesar");
		this.jButtonProcesarInformacionTipoFormula.setToolTipText("Procesar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFormula.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFormula.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFormula.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFormula.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormula.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFormula.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormula.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFormula.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormula.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFormula.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFormula.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFormula.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFormula.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFormula.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFormula.setText("Accion");
		this.jComboBoxTiposAccionesTipoFormula.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFormula.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFormula.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFormula=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFormula.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFormula.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFormula.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFormula = new JLabelMe();
		
		this.jLabelAccionesTipoFormula.setText("Acciones");		
		this.jLabelAccionesTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFormula = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFormula.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFormula.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFormula = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFormula.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFormula.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFormula = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFormula.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFormula.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFormula = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFormula.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFormula.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFormula = new JButtonMe();
		//this.jButtonAnterioresTipoFormula.setText("<<");
        this.jButtonAnterioresTipoFormula.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFormula,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFormula = new JButtonMe();
		//this.jButtonSiguientesTipoFormula.setText(">>");
        this.jButtonSiguientesTipoFormula.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFormula,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFormula = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFormula.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFormula.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFormula,"nuevoguardarcambios_button","Nue",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFormula";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFormula"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFormula";
		inputMap = this.jButtonRecargarInformacionTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFormula"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFormula";
		inputMap = this.jButtonSiguientesTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFormula"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFormula";
		inputMap = this.jButtonAnterioresTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFormula"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFormula();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFormula.setMinimumSize(new Dimension(this.getWidth(),TipoFormulaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormulaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFormula.setMaximumSize(new Dimension(this.getWidth(),TipoFormulaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormulaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFormula.setPreferredSize(new Dimension(this.getWidth(),TipoFormulaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormulaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFormula = new GridBagLayout();

			this.jPanelPaginacionTipoFormula.setLayout(gridaBagLayoutPaginacionTipoFormula);						
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = 0;
			this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFormula.add(this.jButtonAnterioresTipoFormula, this.gridBagConstraintsTipoFormula);
					
						
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFormula.gridy = 0;
			
			this.jPanelPaginacionTipoFormula.add(this.jButtonNuevoGuardarCambiosTipoFormula, this.gridBagConstraintsTipoFormula);
						
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFormula.gridy = 0;
			this.jPanelPaginacionTipoFormula.add(this.jButtonSiguientesTipoFormula, this.gridBagConstraintsTipoFormula);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = 1;
			this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormula.add(this.jButtonNuevoTipoFormula, this.gridBagConstraintsTipoFormula);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoFormula = new GridBagConstraints();
				this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFormula.gridy = 1;
				this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoFormula.add(this.jButtonNuevoRelacionesTipoFormula, this.gridBagConstraintsTipoFormula);
			}
			
			
			if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFormula = new GridBagConstraints();
				this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFormula.gridy = 1;
				this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFormula.add(this.jButtonGuardarCambiosTablaTipoFormula, this.gridBagConstraintsTipoFormula);
			}
			
			
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = 1;
			this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormula.add(this.jButtonDuplicarTipoFormula, this.gridBagConstraintsTipoFormula);
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = 1;
			this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormula.add(this.jButtonCopiarTipoFormula, this.gridBagConstraintsTipoFormula);
		
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = 1;
			this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormula.add(this.jButtonVerFormTipoFormula, this.gridBagConstraintsTipoFormula);
		
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = 1;
			this.gridBagConstraintsTipoFormula.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFormula.add(this.jButtonCerrarTipoFormula, this.gridBagConstraintsTipoFormula);
		
		
		
		this.jButtonRecargarInformacionTipoFormula.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFormula.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFormula.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFormula.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFormula.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFormula.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFormula.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFormula.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFormula.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFormula.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFormula.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFormula.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFormula.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFormula.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFormula.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFormula.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFormula.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFormula.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFormula.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormula.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormula.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFormula.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFormula.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFormula.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFormula.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFormula.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFormula.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFormula.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFormula.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFormula.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFormula.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFormula.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFormula.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFormula.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFormula.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFormula.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFormula = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFormula = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFormula = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFormula = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFormula = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFormula = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFormula.setLayout(gridaBagParametrosReportesTipoFormula);
			this.jPanelParametrosReportesAccionesTipoFormula.setLayout(gridaBagParametrosReportesAccionesTipoFormula);
			
			
			this.jPanelParametrosAuxiliar1TipoFormula.setLayout(gridaBagParametrosAuxiliar1TipoFormula);
			this.jPanelParametrosAuxiliar2TipoFormula.setLayout(gridaBagParametrosAuxiliar2TipoFormula);
			this.jPanelParametrosAuxiliar3TipoFormula.setLayout(gridaBagParametrosAuxiliar3TipoFormula);
			this.jPanelParametrosAuxiliar4TipoFormula.setLayout(gridaBagParametrosAuxiliar4TipoFormula);
			//this.jPanelParametrosAuxiliar5TipoFormula.setLayout(gridaBagParametrosAuxiliar2TipoFormula);			
			
			
			
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormula.add(this.jButtonRecargarInformacionTipoFormula, this.gridBagConstraintsTipoFormula);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormula.add(this.jComboBoxTiposPaginacionTipoFormula, this.gridBagConstraintsTipoFormula);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormula.add(this.jCheckBoxConAltoMaximoTablaTipoFormula, this.gridBagConstraintsTipoFormula);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormula.add(this.jComboBoxTiposArchivosReportesTipoFormula, this.gridBagConstraintsTipoFormula);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormula.add(this.jPanelParametrosAuxiliar1TipoFormula, this.gridBagConstraintsTipoFormula);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormula.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFormula.add(this.jComboBoxTiposReportesTipoFormula, this.gridBagConstraintsTipoFormula);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormula.add(this.jPanelParametrosAuxiliar4TipoFormula, this.gridBagConstraintsTipoFormula);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormula.add(this.jComboBoxTiposReportesTipoFormula, this.gridBagConstraintsTipoFormula);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormula.add(this.jCheckBoxGenerarReporteTipoFormula, this.gridBagConstraintsTipoFormula);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormula.add(this.jPanelParametrosAuxiliar2TipoFormula, this.gridBagConstraintsTipoFormula);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormula.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormula.add(this.jLabelAccionesTipoFormula, this.gridBagConstraintsTipoFormula);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFormula = new GridBagConstraints();
				this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFormula.add(this.jButtonAbrirOrderByTipoFormula, this.gridBagConstraintsTipoFormula);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormula.add(this.jComboBoxTiposSeleccionarTipoFormula, this.gridBagConstraintsTipoFormula);			
			
			
			/*
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormula.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormula.add(this.jCheckBoxSeleccionarTodosTipoFormula, this.gridBagConstraintsTipoFormula);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormula.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFormula.add(this.jCheckBoxSeleccionarTodosTipoFormula, this.gridBagConstraintsTipoFormula);															
				
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormula.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFormula.add(this.jCheckBoxSeleccionadosTipoFormula, this.gridBagConstraintsTipoFormula);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormula.add(this.jPanelParametrosAuxiliar3TipoFormula, this.gridBagConstraintsTipoFormula);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormula.add(this.jComboBoxTiposRelacionesTipoFormula, this.gridBagConstraintsTipoFormula);
				
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormula.add(this.jComboBoxTiposAccionesTipoFormula, this.gridBagConstraintsTipoFormula);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFormula = new GridBagLayout();

			this.jScrollPanelDatosTipoFormula.setLayout(gridaBagLayoutDatosTipoFormula);
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = 0;
			this.gridBagConstraintsTipoFormula.gridx = 0;
			
			this.jScrollPanelDatosTipoFormula.add(this.jTableDatosTipoFormula, this.gridBagConstraintsTipoFormula);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFormula.setViewportView(this.jTableDatosTipoFormula);
		this.jTableDatosTipoFormula.setFillsViewportHeight(true);
		this.jTableDatosTipoFormula.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFormula= new GridBagLayout();
		this.jPanelAccionesTipoFormula.setLayout(gridaBagLayoutAccionesTipoFormula);
		
		
		/*	
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = 0;
		this.gridBagConstraintsTipoFormula.gridx = 0;
			
		this.jPanelAccionesTipoFormula.add(this.jButtonNuevoTipoFormula, this.gridBagConstraintsTipoFormula);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFormula = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFormula);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();						
			this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormula.gridx = 0;		
			//this.gridBagConstraintsTipoFormula.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFormula.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFormula, this.gridBagConstraintsTipoFormula);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFormula.gridx = 0;		
		//this.gridBagConstraintsTipoFormula.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFormula.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFormula);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFormula, this.gridBagConstraintsTipoFormula);								
		
		
		/*
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFormula, this.gridBagConstraintsTipoFormula);
		*/		
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFormula.gridx =0;
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFormula.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFormula, this.gridBagConstraintsTipoFormula);
				
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFormula, this.gridBagConstraintsTipoFormula);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoFormulaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFormula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFormula = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFormula.setLayout(gridaBagLayoutBusquedasParametrosTipoFormula);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFormula=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFormula.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormula.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormula.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFormula, this.gridBagConstraintsTipoFormula);
			
			
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFormula, this.gridBagConstraintsTipoFormula);
		
			
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFormula, this.gridBagConstraintsTipoFormula);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFormula;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFormula() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFormula = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFormula.setName("jPanelReporteDinamicoTipoFormula"); 
		
		this.jPanelReporteDinamicoTipoFormula.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFormula.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFormula.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFormula.setLayout(gridaBagLayoutReporteDinamicoTipoFormula);
		
		
		this.jInternalFrameReporteDinamicoTipoFormula= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFormula = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFormula= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFormula.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFormula.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFormula.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFormula.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFormula.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFormula.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFormula.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFormula.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFormula.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFormula.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFormula.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formulas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFormula = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFormula.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFormula.add(this.jLabelColumnasSelectReporteTipoFormula, this.gridBagConstraintsTipoFormula);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFormula = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFormula.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFormula.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFormula.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFormula.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFormula.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFormula=new JScrollPane(this.jListColumnasSelectReporteTipoFormula);
			
			this.jScrollColumnasSelectReporteTipoFormula.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFormula.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFormula.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFormula.add(this.jListColumnasSelectReporteTipoFormula, this.gridBagConstraintsTipoFormula);
		this.jPanelReporteDinamicoTipoFormula.add(this.jScrollColumnasSelectReporteTipoFormula, this.gridBagConstraintsTipoFormula);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFormula = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFormula.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFormula.add(this.jLabelRelacionesSelectReporteTipoFormula, this.gridBagConstraintsTipoFormula);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFormula = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFormula.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFormula.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFormula.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFormula.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFormula.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFormula=new JScrollPane(this.jListRelacionesSelectReporteTipoFormula);
			
			this.jScrollRelacionesSelectReporteTipoFormula.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFormula.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFormula.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFormula.add(this.jListRelacionesSelectReporteTipoFormula, this.gridBagConstraintsTipoFormula);
		this.jPanelReporteDinamicoTipoFormula.add(this.jScrollRelacionesSelectReporteTipoFormula, this.gridBagConstraintsTipoFormula);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoFormula = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFormula = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFormula = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFormula = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFormula.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFormula.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFormula.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFormula.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormula = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormula.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormula.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormula.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormula.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFormula = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFormula.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFormula.add(this.jLabelGenerarExcelReporteDinamicoTipoFormula, this.gridBagConstraintsTipoFormula);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFormula = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFormula.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFormula,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFormula.setToolTipText("Generar EXCEL"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFormula.add(this.jButtonGenerarExcelReporteDinamicoTipoFormula, this.gridBagConstraintsTipoFormula);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormula.add(this.jComboBoxTiposReportesDinamicoTipoFormula, this.gridBagConstraintsTipoFormula);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFormula = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFormula.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFormula.add(this.jLabelTiposArchivoReporteDinamicoTipoFormula, this.gridBagConstraintsTipoFormula);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormula.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFormula, this.gridBagConstraintsTipoFormula);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFormula = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFormula.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFormula,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFormula.setToolTipText("Generar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormula.add(this.jButtonGenerarReporteDinamicoTipoFormula, this.gridBagConstraintsTipoFormula);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFormula = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFormula.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFormula,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFormula.setToolTipText("Cancelar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormula.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormula.add(this.jButtonCerrarReporteDinamicoTipoFormula, this.gridBagConstraintsTipoFormula);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFormula = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFormula= new JScrollPane(jPanelReporteDinamicoTipoFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFormula.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFormula.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFormula.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formulas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormula.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFormula.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFormula.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFormula);
		this.jInternalFrameReporteDinamicoTipoFormula.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFormula, this.gridBagConstraintsTipoFormula);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFormula() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFormula = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFormula.setName("jPanelImportacionTipoFormula"); 
		
		this.jPanelImportacionTipoFormula.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFormula.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFormula.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFormula.setLayout(gridaBagLayoutImportacionTipoFormula);
		
		
		this.jInternalFrameImportacionTipoFormula= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFormula= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFormula = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFormula= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFormula.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFormula.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFormula.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFormula.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFormula.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFormula.setResizable(true);
	    this.jInternalFrameImportacionTipoFormula.setClosable(true);
	    this.jInternalFrameImportacionTipoFormula.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFormula.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFormula.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFormula.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFormula.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFormula.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFormula.setResizable(true);
	    this.jInternalFrameImportacionTipoFormula.setClosable(true);
	    this.jInternalFrameImportacionTipoFormula.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFormula.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFormula.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFormula.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formulas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFormula = new JLabelMe();

		this.jLabelArchivoImportacionTipoFormula.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFormula.add(this.jLabelArchivoImportacionTipoFormula, this.gridBagConstraintsTipoFormula);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFormula = new JFileChooser();		
		this.jFileChooserImportacionTipoFormula.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFormula = new JButtonMe();
		this.jButtonAbrirImportacionTipoFormula.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFormula,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFormula.setToolTipText("Generar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormula.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormula.add(this.jButtonAbrirImportacionTipoFormula, this.gridBagConstraintsTipoFormula);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFormula = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFormula.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFormula.add(this.jLabelPathArchivoImportacionTipoFormula, this.gridBagConstraintsTipoFormula);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFormula=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFormula.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFormula.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFormula.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormula.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormula.add(this.jTextFieldPathArchivoImportacionTipoFormula, this.gridBagConstraintsTipoFormula);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFormula = new JButtonMe();
		this.jButtonGenerarImportacionTipoFormula.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFormula,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFormula.setToolTipText("Generar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormula.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormula.add(this.jButtonGenerarImportacionTipoFormula, this.gridBagConstraintsTipoFormula);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFormula = new JButtonMe();
		this.jButtonCerrarImportacionTipoFormula.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFormula,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFormula.setToolTipText("Cancelar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormula.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormula.add(this.jButtonCerrarImportacionTipoFormula, this.gridBagConstraintsTipoFormula);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFormula = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFormula= new JScrollPane(jPanelImportacionTipoFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFormula.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFormula.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFormula.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFormula);
		this.jInternalFrameImportacionTipoFormula.getContentPane().add(this.jScrollPanelImportacionTipoFormula, this.gridBagConstraintsTipoFormula);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFormula(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFormula = new JButtonMe();
			this.jButtonAbrirOrderByTipoFormula.setText("Orden");
			this.jButtonAbrirOrderByTipoFormula.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFormula,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFormula";
			inputMap = this.jButtonAbrirOrderByTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFormula"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFormula = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFormula.setName("jPanelOrderByTipoFormula"); 
			
			this.jPanelOrderByTipoFormula.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFormula.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFormula.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFormula.setLayout(gridaBagLayoutOrderByTipoFormula);
			
			
			this.jTableDatosTipoFormulaOrderBy = new JTableMe();        
			this.jTableDatosTipoFormulaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFormulaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFormulaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFormulaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFormulaOrderBy.setViewportView(this.jTableDatosTipoFormulaOrderBy);
			this.jTableDatosTipoFormulaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFormulaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFormula= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFormula= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFormula = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFormula= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFormula.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFormula.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFormula.setTitle("Orden");
			this.jInternalFrameOrderByTipoFormula.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFormula.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFormula.setResizable(true);
			this.jInternalFrameOrderByTipoFormula.setClosable(true);
			this.jInternalFrameOrderByTipoFormula.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFormula.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFormula.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFormula.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formulas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFormula.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFormula.ipady =150;
				
			this.jPanelOrderByTipoFormula.add(jScrollPanelDatosTipoFormulaOrderBy, this.gridBagConstraintsTipoFormula);//this.jTableDatosTipoFormulaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFormula = new JButtonMe();
			this.jButtonCerrarOrderByTipoFormula.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFormula,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFormula.setToolTipText("Cancelar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFormula.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFormula.add(this.jButtonCerrarOrderByTipoFormula, this.gridBagConstraintsTipoFormula);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFormula = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFormula= new JScrollPane(jPanelOrderByTipoFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFormula.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFormula.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFormula.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFormula);
			
			this.jInternalFrameOrderByTipoFormula.getContentPane().add(this.jScrollPanelOrderByTipoFormula, this.gridBagConstraintsTipoFormula);			
		
		} else {
			this.jButtonAbrirOrderByTipoFormula = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoformulaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFormula.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFormula.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFormula.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFormula.getRowHeight();//TipoFormulaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFormulaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFormula.isSelected()) {
					iHeightTable=TipoFormulaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFormulaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFormulaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFormulaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFormula.isSelected()) {
					iHeightTable=TipoFormulaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFormulaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFormulaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFormula.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFormula.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFormula.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFormula.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFormula.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFormula.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFormula!=null && this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFormula.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFormula.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFormula.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFormula.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFormula.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFormula.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoformulaLogic.getTipoFormulas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformulas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFormula> TraerTipoFormulaBeans(List<TipoFormula> tipoformulas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFormula tipoformula:tipoformulas) {
					
				if(!(TipoFormulaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFormulaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoformula.setsDetalleGeneralEntityReporte(TipoFormulaConstantesFunciones.getTipoFormulaDescripcion(tipoformula));
										
						
					
					

					if(tipoformula.getFormulas()!=null && Funciones.existeClass(classes,Formula.class)) {
						try{tipoformula.setformulasDescripcionReporte(new JRBeanCollectionDataSource(FormulaJInternalFrame.TraerFormulaBeans(tipoformula.getFormulas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoformula.setsDetalleGeneralEntityReporte(tipoformula.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoformulabeans.add(tipoformulabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoformulas;
    }
	//PARA REPORTES FIN
}
