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
import com.bydan.erp.puntoventa.util.FormulaConstantesFunciones;

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
public class FormulaJInternalFrame extends FormulaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormula;
	
	protected JMenuBar jmenuBarFormula;
	
	protected JMenu jmenuFormula;
	protected JMenu jmenuDatosFormula;
	protected JMenu jmenuArchivoFormula;
	protected JMenu jmenuAccionesFormula;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormula;	
	protected GridBagConstraints gridBagConstraintsFormula;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormulaDetalleFormJInternalFrame jInternalFrameDetalleFormFormula;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormula;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormula;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoFormulaBeanSwingJInternalFrame tipoformulaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformula="";
	
	public FormulaSessionBean formulaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoFormulaSessionBean tipoformulaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Formula> formulas;		
	public List<Formula> formulasEliminados;	
	public List<Formula> formulasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormula;		
	protected JButton jButtonAbrirOrderByFormula;
	
	
	//protected JPanel jPanelOrderByFormula;
	//public JScrollPane jScrollPanelOrderByFormula;	
	//protected JButton jButtonCerrarOrderByFormula;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormulaLogic formulaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormula;
	public JScrollPane jScrollPanelDatosEdicionFormula;
	public JScrollPane jScrollPanelDatosGeneralFormula;
    
	
	
	//public JScrollPane jScrollPanelDatosFormulaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormula;
	//public JScrollPane jScrollPanelImportacionFormula;
	
	
	
	protected JPanel jPanelAccionesFormula;
	
    protected JPanel jPanelPaginacionFormula;
    protected JPanel jPanelParametrosReportesFormula;
	protected JPanel jPanelParametrosReportesAccionesFormula;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Formula;
	protected JPanel jPanelParametrosAuxiliar2Formula;
	protected JPanel jPanelParametrosAuxiliar3Formula;
	protected JPanel jPanelParametrosAuxiliar4Formula;
	//protected JPanel jPanelParametrosAuxiliar5Formula;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormula;
	//protected JPanel jPanelImportacionFormula;
	
	
	public JTable jTableDatosFormula;
	
	
	
	//public JTable jTableDatosFormulaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormula;
	protected JButton jButtonDuplicarFormula;
	protected JButton jButtonCopiarFormula;
	protected JButton jButtonVerFormFormula;
	protected JButton jButtonNuevoRelacionesFormula;
	protected JButton jButtonModificarFormula;
	
    protected JButton jButtonGuardarCambiosTablaFormula;
	protected JButton jButtonCerrarFormula;
	
	
	protected JButton jButtonRecargarInformacionFormula;
	protected JButton jButtonProcesarInformacionFormula;
	
	
	protected JButton jButtonAnterioresFormula;
	protected JButton jButtonSiguientesFormula;
	protected JButton jButtonNuevoGuardarCambiosFormula;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormula;
	//protected JButton jButtonCerrarReporteDinamicoFormula;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormula;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormula;
	//protected JButton jButtonGenerarImportacionFormula;
	//protected JButton jButtonCerrarImportacionFormula;
	//protected JFileChooser jFileChooserImportacionFormula;
	//protected File fileImportacionFormula;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormula;
	protected JButton jButtonDuplicarToolBarFormula;
	protected JButton jButtonNuevoRelacionesToolBarFormula;
	
	
	public JButton jButtonGuardarCambiosToolBarFormula;
	protected JButton jButtonCopiarToolBarFormula;
	protected JButton jButtonVerFormToolBarFormula;
	public JButton jButtonGuardarCambiosTablaToolBarFormula;
	protected JButton jButtonMostrarOcultarTablaToolBarFormula;
	protected JButton jButtonCerrarToolBarFormula;
	
	protected JButton jButtonRecargarInformacionToolBarFormula;
	protected JButton jButtonProcesarInformacionToolBarFormula;
	protected JButton jButtonAnterioresToolBarFormula;
	protected JButton jButtonSiguientesToolBarFormula;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormula;
	protected JButton jButtonAbrirOrderByToolBarFormula;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormula;
	protected JMenuItem jMenuItemDuplicarFormula;
	protected JMenuItem jMenuItemNuevoRelacionesFormula;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormula;
	protected JMenuItem jMenuItemCopiarFormula;
	protected JMenuItem jMenuItemVerFormFormula;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormula;
	protected JMenuItem jMenuItemCerrarFormula;
	protected JMenuItem jMenuItemDetalleCerrarFormula;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormula;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormula;
	
	protected JMenuItem jMenuItemRecargarInformacionFormula;
	protected JMenuItem jMenuItemProcesarInformacionFormula;
	protected JMenuItem jMenuItemAnterioresFormula;
	protected JMenuItem jMenuItemSiguientesFormula;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormula;
	protected JMenuItem jMenuItemAbrirOrderByFormula;
	protected JMenuItem jMenuItemMostrarOcultarFormula;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormula;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormula;
	protected JCheckBox jCheckBoxSeleccionadosFormula;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormula;
	protected JCheckBox jCheckBoxConGraficoReporteFormula;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormula;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormula;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormula;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormula;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormula;
	protected JTextField jTextFieldValorCampoGeneralFormula;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormula;
	//public JList<Reporte> jListColumnasSelectReporteFormula;
	//public JScrollPane jScrollColumnasSelectReporteFormula;
	
	//public JLabel jLabelRelacionesSelectReporteFormula;
	//public JList<Reporte> jListRelacionesSelectReporteFormula;
	//public JScrollPane jScrollRelacionesSelectReporteFormula;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormula;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormula;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormula;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormula;
	
		
	//public JLabel jLabelArchivoImportacionFormula;	
	//public JLabel jLabelPathArchivoImportacionFormula;
	//protected JTextField jTextFieldPathArchivoImportacionFormula;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormula;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormula;
	
	//public JLabel jLabelColumnaCategoriaValorFormula;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormula;
	
	//public JLabel jLabelColumnasValoresGraficoFormula;
	//public JList<Reporte> jListColumnasValoresGraficoFormula;
	//public JScrollPane jScrollColumnasValoresGraficoFormula;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormula;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormula;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormula;
	public JPanel jPanelFK_IdTipoFormulaFormula;
	public JButton jButtonFK_IdTipoFormulaFormula;
	
	public JPanel jPanelid_tipo_formulaFK_IdTipoFormulaFormula;
	public JLabel jLabelid_tipo_formulaFK_IdTipoFormulaFormula;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula;
	public JButton jButtonid_tipo_formulaFK_IdTipoFormulaFormula= new JButtonMe();
	public JButton jButtonid_tipo_formulaFK_IdTipoFormulaFormulaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_formulaFK_IdTipoFormulaFormulaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FormulaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormulaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormulaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormulaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormula)	{
		this.jButtonRecargarInformacionFormula = jButtonRecargarInformacionFormula;
	}
	
	public JButton getjButtonProcesarInformacionFormula() {
		return this.jButtonProcesarInformacionFormula;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormula)	{
		this.jButtonProcesarInformacionFormula = jButtonProcesarInformacionFormula;
	}
	
	
	public JButton getjButtonRecargarInformacionFormula() {
		return this.jButtonRecargarInformacionFormula;
	}
	
	
	public List<Formula> getformulas() {
		return this.formulas;
	}

	public void setformulas(List<Formula> formulas) {
		this.formulas = formulas;
	}
	
	public List<Formula> getformulasAux() {
		return this.formulasAux;
	}

	public void setformulasAux(List<Formula> formulasAux) {
		this.formulasAux = formulasAux;
	}
	
	public List<Formula> getformulasEliminados() {
		return this.formulasEliminados;
	}

	public void setFormulasEliminados(List<Formula> formulasEliminados) {
		this.formulasEliminados = formulasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormula() {
		return jComboBoxTiposSeleccionarFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormula(
			JComboBox jComboBoxTiposSeleccionarFormula) {
		this.jComboBoxTiposSeleccionarFormula = jComboBoxTiposSeleccionarFormula;
	}
	
	public void setBorderResaltarTiposSeleccionarFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormula .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormula() {
		return jTextFieldValorCampoGeneralFormula;
	}

	public void setjTextFieldValorCampoGeneralFormula(
			JTextField jTextFieldValorCampoGeneralFormula) {
		this.jTextFieldValorCampoGeneralFormula = jTextFieldValorCampoGeneralFormula;
	}

	public void setBorderResaltarValorCampoGeneralFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormula .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormula() {
		return this.jCheckBoxSeleccionarTodosFormula;
	}

	public void setjCheckBoxSeleccionarTodosFormula(
			JCheckBox jCheckBoxSeleccionarTodosFormula) {
		this.jCheckBoxSeleccionarTodosFormula = jCheckBoxSeleccionarTodosFormula;
	}

	public void setBorderResaltarSeleccionarTodosFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormula .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormula() {
		return this.jCheckBoxSeleccionadosFormula;
	}

	public void setjCheckBoxSeleccionadosFormula(
			JCheckBox jCheckBoxSeleccionadosFormula) {
		this.jCheckBoxSeleccionadosFormula = jCheckBoxSeleccionadosFormula;
	}
	
	public void setBorderResaltarSeleccionadosFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormula .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormula() {
		return this.jComboBoxTiposArchivosReportesFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormula(
			JComboBox jComboBoxTiposArchivosReportesFormula) {
		this.jComboBoxTiposArchivosReportesFormula = jComboBoxTiposArchivosReportesFormula;
	}

	public void setBorderResaltarTiposArchivosReportesFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormula .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormula() {
		return this.jComboBoxTiposReportesFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormula(
			JComboBox jComboBoxTiposReportesFormula) {
		this.jComboBoxTiposReportesFormula = jComboBoxTiposReportesFormula;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormula() {
	//	return jComboBoxTiposReportesDinamicoFormula;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormula(
	//		JComboBox jComboBoxTiposReportesDinamicoFormula) {
	//	this.jComboBoxTiposReportesDinamicoFormula = jComboBoxTiposReportesDinamicoFormula;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormula() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormula;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormula(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormula) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormula = jComboBoxTiposArchivosReportesDinamicoFormula;
	//}
	
	public void setBorderResaltarTiposReportesFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormula .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormula() {
		return this.jComboBoxTiposGraficosReportesFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormula(
			JComboBox jComboBoxTiposGraficosReportesFormula) {
		this.jComboBoxTiposGraficosReportesFormula = jComboBoxTiposGraficosReportesFormula;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormula .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormula() {
		return this.jComboBoxTiposPaginacionFormula;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormula(
			JComboBox jComboBoxTiposPaginacionFormula) {
		this.jComboBoxTiposPaginacionFormula = jComboBoxTiposPaginacionFormula;
	}
	
	public void setBorderResaltarTiposPaginacionFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormula .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormula() {
		return this.jComboBoxTiposRelacionesFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormula() {
		return this.jComboBoxTiposAccionesFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormula(
			JComboBox jComboBoxTiposRelacionesFormula) {
		this.jComboBoxTiposRelacionesFormula = jComboBoxTiposRelacionesFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormula(
			JComboBox jComboBoxTiposAccionesFormula) {
		this.jComboBoxTiposAccionesFormula = jComboBoxTiposAccionesFormula;
	}
	
	public void setBorderResaltarTiposRelacionesFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormula .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormula() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormula.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormula .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormula() {
	//	return jCheckBoxConGraficoDinamicoFormula;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormula(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormula) {
	//	this.jCheckBoxConGraficoDinamicoFormula = jCheckBoxConGraficoDinamicoFormula;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormula() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormula.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormula .setBorder(borderResaltar);		
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
		this.formulaSessionBean=new FormulaSessionBean();
		
		this.formulaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formulaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormulaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormulaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormulaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormulaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormulaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formula MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
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
		
		FormulaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormula= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormula,this.jTtoolBarFormula,
							"nuevo","nuevo","Nuevo"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormula,this.jTtoolBarFormula,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormula,this.jTtoolBarFormula,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormula,this.jTtoolBarFormula,
							"duplicar","duplicar","Duplicar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormula,this.jTtoolBarFormula,
							"copiar","copiar","Copiar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormula,this.jTtoolBarFormula,
							"ver_form","ver_form","Ver"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormula,this.jTtoolBarFormula,
							"recargar","recargar","Recargar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormula,this.jTtoolBarFormula,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormula,this.jTtoolBarFormula,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormula,this.jTtoolBarFormula,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormula,this.jTtoolBarFormula,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormula,this.jTtoolBarFormula,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormula,this.jTtoolBarFormula,
							"cerrar","cerrar","Salir"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormula=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormula;
			
				this.jButtonProcesarInformacionToolBarFormula=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormula;
				
		//protected JButton jButtonModificarToolBarFormula;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormula=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormula=new JMenuMe("General");
		this.jmenuArchivoFormula=new JMenuMe("Archivo");
		this.jmenuAccionesFormula=new JMenuMe("Acciones");
		this.jmenuDatosFormula=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormula= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormula.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormula,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormula= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormula.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormula,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormula= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormula.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormula,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormula= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormula.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormula,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormula= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormula.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormula,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormula= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormula.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormula,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormula= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormula.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormula,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormula= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormula.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormula,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormula= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormula.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormula,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormula= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormula.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormula,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormula= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormula.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormula,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormula= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormula.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormula,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormula= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormula.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormula,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormula= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormula.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormula,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormula= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormula.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormula,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormula= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormula.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormula,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormula= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormula.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormula,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormula.add(this.jMenuItemCerrarFormula);
			
			this.jmenuAccionesFormula.add(this.jMenuItemNuevoFormula);
			this.jmenuAccionesFormula.add(this.jMenuItemNuevoGuardarCambiosFormula);
			this.jmenuAccionesFormula.add(this.jMenuItemNuevoRelacionesFormula);
			this.jmenuAccionesFormula.add(this.jMenuItemGuardarCambiosTablaFormula);		
			this.jmenuAccionesFormula.add(this.jMenuItemDuplicarFormula);		
			this.jmenuAccionesFormula.add(this.jMenuItemCopiarFormula);		
			this.jmenuAccionesFormula.add(this.jMenuItemVerFormFormula);		
			
			this.jmenuDatosFormula.add(this.jMenuItemRecargarInformacionFormula);				
			this.jmenuDatosFormula.add(this.jMenuItemAnterioresFormula);				
			this.jmenuDatosFormula.add(this.jMenuItemSiguientesFormula);				
			this.jmenuDatosFormula.add(this.jMenuItemAbrirOrderByFormula);				
			this.jmenuDatosFormula.add(this.jMenuItemMostrarOcultarFormula);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormula.add(this.jMenuItemGuardarCambiosFormula);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormula.add(this.jmenuArchivoFormula);		
			this.jmenuBarFormula.add(this.jmenuAccionesFormula);		
			this.jmenuBarFormula.add(this.jmenuDatosFormula);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormula);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormula() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoFormulaFormula=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormulaFormula.setToolTipText("Buscar Por Tipo Formula ");
		this.jButtonFK_IdTipoFormulaFormula= new JButtonMe();
		this.jButtonFK_IdTipoFormulaFormula.setText("Buscar");
		this.jButtonFK_IdTipoFormulaFormula.setToolTipText("Buscar Por Tipo Formula ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormulaFormula,"buscar_button","Buscar Por Tipo Formula ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormulaFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_formulaFK_IdTipoFormulaFormula = new JLabelMe();
		jLabelid_tipo_formulaFK_IdTipoFormulaFormula.setText("Tipo Formula :");
		jLabelid_tipo_formulaFK_IdTipoFormulaFormula.setToolTipText("Tipo Formula");
		jLabelid_tipo_formulaFK_IdTipoFormulaFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_formulaFK_IdTipoFormulaFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_formulaFK_IdTipoFormulaFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_formulaFK_IdTipoFormulaFormula,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula= new JComboBoxMe();
		jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormula=new JTabbedPane();


		this.jTabbedPaneBusquedasFormula.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormula.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormula.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormula.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormula,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormula = new FormulaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formula DATOS");
			this.jInternalFrameDetalleFormFormula = new FormulaDetalleFormJInternalFrame(jDesktopPane,this.formulaSessionBean.getConGuardarRelaciones(),this.formulaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormula = null;//new FormulaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormula= new GridBagLayout();
		
		
		this.jTableDatosFormula = new JTableMe();      
		
		String sToolTipFormula="";
		sToolTipFormula=FormulaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormula+="(PuntoVenta.Formula)";
		}
		
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormula+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormula.setToolTipText(sToolTipFormula);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormula);
		this.jTableDatosFormula.setAutoCreateRowSorter(true);
		this.jTableDatosFormula.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormula.setRowSelectionAllowed(true);
		this.jTableDatosFormula.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormula,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormula = new JButtonMe();
		this.jButtonDuplicarFormula = new JButtonMe();
		this.jButtonCopiarFormula = new JButtonMe();
		this.jButtonVerFormFormula = new JButtonMe();
		this.jButtonNuevoRelacionesFormula = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormula = new JButtonMe();
		this.jButtonCerrarFormula = new JButtonMe();
		
		this.jScrollPanelDatosFormula = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormula = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formula";
		
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulas" + this.sPath));
		} else {
			this.jScrollPanelDatosFormula.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormula.setToolTipText("Acciones");
        this.jPanelAccionesFormula.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormula, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormula=new ReporteDinamicoJInternalFrame(FormulaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormula();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormula=new ImportacionJInternalFrame(FormulaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormula();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormula = new JButtonMe();
		
		this.jButtonAbrirOrderByFormula.setText("Orden");
		this.jButtonAbrirOrderByFormula.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormula,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormula=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormula,false,this);
			
			//this.cargarOrderByFormula(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormula=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormula,true,this);
			
			//this.cargarOrderByFormula(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormula.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosFormula.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosFormula.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosFormula.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormula.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormula.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormula.setText("Nuevo");
		this.jButtonDuplicarFormula.setText("Duplicar");
		this.jButtonCopiarFormula.setText("Copiar");
		this.jButtonVerFormFormula.setText("Ver");
		this.jButtonNuevoRelacionesFormula.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormula.setText("Guardar");
		this.jButtonCerrarFormula.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormula,"nuevo_button","Nuevo",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormula,"duplicar_button","Duplicar",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormula,"copiar_button","Copiar",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormula,"ver_form","Ver",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormula,"nuevorelaciones_button","Nuevo Rel",this.formulaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormula,"guardarcambiostabla_button","Guardar",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormula,"cerrar_button","Salir",this.formulaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormula, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormula.setToolTipText("Nuevo"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormula.setToolTipText("Duplicar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormula.setToolTipText("Copiar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormula.setToolTipText("Ver"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormula.setToolTipText("Nuevo Rel"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormula.setToolTipText("Guardar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormula.setToolTipText("Salir"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormula";
		inputMap = this.jButtonNuevoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormula"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormula";
		inputMap = this.jButtonDuplicarFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormula"));
		
		//COPIAR
		sMapKey = "CopiarFormula";
		inputMap = this.jButtonCopiarFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormula"));
		
		//VEr FORM
		sMapKey = "VerFormFormula";
		inputMap = this.jButtonVerFormFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormula"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormula";
		inputMap = this.jButtonNuevoRelacionesFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormula"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormula";
		inputMap = this.jButtonModificarFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormula"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormula";
		inputMap = this.jButtonCerrarFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormula"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormula";
		inputMap = this.jButtonGuardarCambiosTablaFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormula"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Formula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Formula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Formula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Formula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Formula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormula.setName("jPanelParametrosReportesFormula"); 
		
		this.jPanelParametrosReportesAccionesFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormula.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormula.setName("jPanelParametrosReportesAccionesFormula"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormula, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormula, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormula = new JButtonMe();
		this.jButtonRecargarInformacionFormula.setText("Recargar");
		this.jButtonRecargarInformacionFormula.setToolTipText("Recargar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormula,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormula = new JButtonMe();
		this.jButtonProcesarInformacionFormula.setText("Procesar");
		this.jButtonProcesarInformacionFormula.setToolTipText("Procesar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormula.setVisible(false);
			
		this.jButtonProcesarInformacionFormula.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormula.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormula.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormula = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormula.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormula.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormula = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormula.setText("TIPO");       
		this.jComboBoxTiposReportesFormula.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormula = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormula.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormula.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormula = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormula.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormula.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormula = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormula.setText("Accion");
		this.jComboBoxTiposRelacionesFormula.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormula = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormula.setText("Accion");
		this.jComboBoxTiposAccionesFormula.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormula = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormula.setText("Accion");
		this.jComboBoxTiposSeleccionarFormula.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormula=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormula.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormula.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormula.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormula = new JLabelMe();
		
		this.jLabelAccionesFormula.setText("Acciones");		
		this.jLabelAccionesFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormula = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormula.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormula.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormula = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormula.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormula.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormula = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormula.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormula.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormula = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormula.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormula.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormula = new JButtonMe();
		//this.jButtonAnterioresFormula.setText("<<");
        this.jButtonAnterioresFormula.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormula,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormula = new JButtonMe();
		//this.jButtonSiguientesFormula.setText(">>");
        this.jButtonSiguientesFormula.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormula,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormula = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormula.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormula.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormula,"nuevoguardarcambios_button","Nue",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormula";
		inputMap = this.jButtonNuevoGuardarCambiosFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormula"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormula";
		inputMap = this.jButtonRecargarInformacionFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormula"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormula";
		inputMap = this.jButtonSiguientesFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormula"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormula";
		inputMap = this.jButtonAnterioresFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormula"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormula();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormula.setMinimumSize(new Dimension(this.getWidth(),FormulaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormulaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormula.setMaximumSize(new Dimension(this.getWidth(),FormulaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormulaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormula.setPreferredSize(new Dimension(this.getWidth(),FormulaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormulaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormula = new GridBagLayout();

			this.jPanelPaginacionFormula.setLayout(gridaBagLayoutPaginacionFormula);						
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = 0;
			this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormula.add(this.jButtonAnterioresFormula, this.gridBagConstraintsFormula);
					
						
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormula.gridy = 0;
			
			this.jPanelPaginacionFormula.add(this.jButtonNuevoGuardarCambiosFormula, this.gridBagConstraintsFormula);
						
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormula.gridy = 0;
			this.jPanelPaginacionFormula.add(this.jButtonSiguientesFormula, this.gridBagConstraintsFormula);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = 1;
			this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormula.add(this.jButtonNuevoFormula, this.gridBagConstraintsFormula);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFormula = new GridBagConstraints();
				this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormula.gridy = 1;
				this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFormula.add(this.jButtonNuevoRelacionesFormula, this.gridBagConstraintsFormula);
			}
			
			
			if(!this.formulaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormula = new GridBagConstraints();
				this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormula.gridy = 1;
				this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormula.add(this.jButtonGuardarCambiosTablaFormula, this.gridBagConstraintsFormula);
			}
			
			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = 1;
			this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormula.add(this.jButtonDuplicarFormula, this.gridBagConstraintsFormula);
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = 1;
			this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormula.add(this.jButtonCopiarFormula, this.gridBagConstraintsFormula);
		
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = 1;
			this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormula.add(this.jButtonVerFormFormula, this.gridBagConstraintsFormula);
		
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = 1;
			this.gridBagConstraintsFormula.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormula.add(this.jButtonCerrarFormula, this.gridBagConstraintsFormula);
		
		
		
		this.jButtonRecargarInformacionFormula.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormula.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormula.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormula, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormula.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormula.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormula.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormula.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormula.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormula.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormula.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormula.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormula.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormula.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormula.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormula.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormula.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormula.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormula.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormula.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormula.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormula.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormula.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormula.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormula.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormula.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormula.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormula.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormula.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormula.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormula.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormula, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormula.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormula.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormula.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormula.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormula.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormula.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormula = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormula = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Formula = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Formula = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Formula = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Formula = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormula.setLayout(gridaBagParametrosReportesFormula);
			this.jPanelParametrosReportesAccionesFormula.setLayout(gridaBagParametrosReportesAccionesFormula);
			
			
			this.jPanelParametrosAuxiliar1Formula.setLayout(gridaBagParametrosAuxiliar1Formula);
			this.jPanelParametrosAuxiliar2Formula.setLayout(gridaBagParametrosAuxiliar2Formula);
			this.jPanelParametrosAuxiliar3Formula.setLayout(gridaBagParametrosAuxiliar3Formula);
			this.jPanelParametrosAuxiliar4Formula.setLayout(gridaBagParametrosAuxiliar4Formula);
			//this.jPanelParametrosAuxiliar5Formula.setLayout(gridaBagParametrosAuxiliar2Formula);			
			
			
			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormula.add(this.jButtonRecargarInformacionFormula, this.gridBagConstraintsFormula);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Formula.add(this.jComboBoxTiposPaginacionFormula, this.gridBagConstraintsFormula);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Formula.add(this.jCheckBoxConAltoMaximoTablaFormula, this.gridBagConstraintsFormula);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Formula.add(this.jComboBoxTiposArchivosReportesFormula, this.gridBagConstraintsFormula);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormula.add(this.jPanelParametrosAuxiliar1Formula, this.gridBagConstraintsFormula);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Formula.add(this.jComboBoxTiposReportesFormula, this.gridBagConstraintsFormula);																		
			
			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Formula.add(this.jComboBoxTiposGraficosReportesFormula, this.gridBagConstraintsFormula);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormula.add(this.jPanelParametrosAuxiliar4Formula, this.gridBagConstraintsFormula);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormula.add(this.jComboBoxTiposReportesFormula, this.gridBagConstraintsFormula);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormula.add(this.jCheckBoxGenerarReporteFormula, this.gridBagConstraintsFormula);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormula.add(this.jPanelParametrosAuxiliar2Formula, this.gridBagConstraintsFormula);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormula.add(this.jLabelAccionesFormula, this.gridBagConstraintsFormula);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormula = new GridBagConstraints();
				this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormula.add(this.jButtonAbrirOrderByFormula, this.gridBagConstraintsFormula);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormula.add(this.jComboBoxTiposSeleccionarFormula, this.gridBagConstraintsFormula);			
			
			
			/*
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormula.add(this.jCheckBoxSeleccionarTodosFormula, this.gridBagConstraintsFormula);
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormula.add(this.jCheckBoxConGraficoReporteFormula, this.gridBagConstraintsFormula);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Formula.add(this.jCheckBoxSeleccionarTodosFormula, this.gridBagConstraintsFormula);															
				
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Formula.add(this.jCheckBoxSeleccionadosFormula, this.gridBagConstraintsFormula);															
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormula.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Formula.add(this.jCheckBoxConGraficoReporteFormula, this.gridBagConstraintsFormula);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormula.add(this.jPanelParametrosAuxiliar3Formula, this.gridBagConstraintsFormula);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormula.add(this.jComboBoxTiposRelacionesFormula, this.gridBagConstraintsFormula);
				
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormula.add(this.jComboBoxTiposAccionesFormula, this.gridBagConstraintsFormula);
	
				
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormula.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormula.add(this.jTextFieldValorCampoGeneralFormula, this.gridBagConstraintsFormula);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormula = new GridBagLayout();

			this.jScrollPanelDatosFormula.setLayout(gridaBagLayoutDatosFormula);
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = 0;
			this.gridBagConstraintsFormula.gridx = 0;
			
			this.jScrollPanelDatosFormula.add(this.jTableDatosFormula, this.gridBagConstraintsFormula);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormula.setViewportView(this.jTableDatosFormula);
		this.jTableDatosFormula.setFillsViewportHeight(true);
		this.jTableDatosFormula.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormula= new GridBagLayout();
		this.jPanelAccionesFormula.setLayout(gridaBagLayoutAccionesFormula);
		
		
		/*	
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 0;
			
		this.jPanelAccionesFormula.add(this.jButtonNuevoFormula, this.gridBagConstraintsFormula);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoFormulaFormula= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormulaFormula.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormulaFormula.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormulaFormula.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormulaFormula.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormulaFormula.setLayout(gridaBagLayoutFK_IdTipoFormulaFormula);

		gridBagConstraintsFormula = new GridBagConstraints();
		gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormula.gridy = 0;
		gridBagConstraintsFormula.gridx = 0;
		jPanelFK_IdTipoFormulaFormula.add(jLabelid_tipo_formulaFK_IdTipoFormulaFormula, gridBagConstraintsFormula);

		gridBagConstraintsFormula = new GridBagConstraints();
		gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormula.gridy = 0;
		gridBagConstraintsFormula.gridx = 1;
		jPanelFK_IdTipoFormulaFormula.add(jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula, gridBagConstraintsFormula);

		gridBagConstraintsFormula = new GridBagConstraints();
		gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormula.gridy = 1;
		gridBagConstraintsFormula.gridx =1;
		jPanelFK_IdTipoFormulaFormula.add(jButtonFK_IdTipoFormulaFormula, gridBagConstraintsFormula);

		jTabbedPaneBusquedasFormula.addTab("1.-Por Tipo Formula ", jPanelFK_IdTipoFormulaFormula);
		jTabbedPaneBusquedasFormula.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormula = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormula);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formulaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormula = new GridBagConstraints();						
			this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormula.gridx = 0;		
			//this.gridBagConstraintsFormula.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormula.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormula, this.gridBagConstraintsFormula);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormula.gridx = 0;		
		//this.gridBagConstraintsFormula.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormula.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormula);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormula.gridx = 0;		
			this.gridBagConstraintsFormula.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormula.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormula, this.gridBagConstraintsFormula);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormula, this.gridBagConstraintsFormula);								
		
		
		/*
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormula, this.gridBagConstraintsFormula);
		*/		
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormula.gridx =0;
		this.gridBagConstraintsFormula.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormula.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormula, this.gridBagConstraintsFormula);
				
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormula, this.gridBagConstraintsFormula);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FormulaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormula= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormula = new GridBagLayout();
			this.jPanelBusquedasParametrosFormula.setLayout(gridaBagLayoutBusquedasParametrosFormula);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormula=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormula.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormula.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormula.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
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
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormula, this.gridBagConstraintsFormula);
			
			
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormula, this.gridBagConstraintsFormula);
		
			
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormula, this.gridBagConstraintsFormula);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormula;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormula() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormula = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormula.setName("jPanelReporteDinamicoFormula"); 
		
		this.jPanelReporteDinamicoFormula.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormula.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormula.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormula.setLayout(gridaBagLayoutReporteDinamicoFormula);
		
		
		this.jInternalFrameReporteDinamicoFormula= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormula = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormula= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormula.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormula.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormula.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormula.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormula.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormula.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormula.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormula.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormula.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormula.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormula.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormula = new JLabelMe();

		this.jLabelColumnasSelectReporteFormula.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormula.add(this.jLabelColumnasSelectReporteFormula, this.gridBagConstraintsFormula);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormula = new JList<Reporte>();
		this.jListColumnasSelectReporteFormula.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormula.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormula.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormula.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormula.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormula=new JScrollPane(this.jListColumnasSelectReporteFormula);
			
			this.jScrollColumnasSelectReporteFormula.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormula.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormula.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormula.add(this.jListColumnasSelectReporteFormula, this.gridBagConstraintsFormula);
		this.jPanelReporteDinamicoFormula.add(this.jScrollColumnasSelectReporteFormula, this.gridBagConstraintsFormula);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormula = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormula.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormula.add(this.jLabelRelacionesSelectReporteFormula, this.gridBagConstraintsFormula);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormula = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormula.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormula.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormula.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormula.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormula.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormula=new JScrollPane(this.jListRelacionesSelectReporteFormula);
			
			this.jScrollRelacionesSelectReporteFormula.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormula.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormula.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormula.add(this.jListRelacionesSelectReporteFormula, this.gridBagConstraintsFormula);
		this.jPanelReporteDinamicoFormula.add(this.jScrollRelacionesSelectReporteFormula, this.gridBagConstraintsFormula);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFormula = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormula = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormula = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormula = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormula.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormula.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormula.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormula.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormula = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormula.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormula.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormula.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormula.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormula = new JLabelMe();

		this.jLabelConGraficoDinamicoFormula.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormula.add(this.jLabelConGraficoDinamicoFormula, this.gridBagConstraintsFormula);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormula = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormula.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormula.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormula.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormula.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormula.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormula.add(this.jCheckBoxConGraficoDinamicoFormula, this.gridBagConstraintsFormula);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormula = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormula.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormula.add(this.jLabelColumnaCategoriaGraficoFormula, this.gridBagConstraintsFormula);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormula = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormula.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormula.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormula.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormula.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormula.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormula.add(this.jComboBoxColumnaCategoriaGraficoFormula, this.gridBagConstraintsFormula);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormula = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormula.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormula.add(this.jLabelColumnaCategoriaValorFormula, this.gridBagConstraintsFormula);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormula = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormula.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormula.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormula.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormula.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormula.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormula.add(this.jComboBoxColumnaCategoriaValorFormula, this.gridBagConstraintsFormula);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormula = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormula.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormula.add(this.jLabelColumnasValoresGraficoFormula, this.gridBagConstraintsFormula);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormula = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormula.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormula.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormula.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormula.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormula.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormula=new JScrollPane(this.jListColumnasValoresGraficoFormula);
			
			this.jScrollColumnasValoresGraficoFormula.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormula.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormula.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormula.add(this.jListColumnasSelectReporteFormula, this.gridBagConstraintsFormula);
		this.jPanelReporteDinamicoFormula.add(this.jScrollColumnasValoresGraficoFormula, this.gridBagConstraintsFormula);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormula = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormula.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormula.add(this.jLabelTiposGraficosReportesDinamicoFormula, this.gridBagConstraintsFormula);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormula = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormula.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormula.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormula.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormula.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormula.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormula.add(this.jComboBoxTiposGraficosReportesDinamicoFormula, this.gridBagConstraintsFormula);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormula = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormula.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormula.add(this.jLabelGenerarExcelReporteDinamicoFormula, this.gridBagConstraintsFormula);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormula = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormula.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormula,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormula.setToolTipText("Generar EXCEL"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormula.add(this.jButtonGenerarExcelReporteDinamicoFormula, this.gridBagConstraintsFormula);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormula.add(this.jComboBoxTiposReportesDinamicoFormula, this.gridBagConstraintsFormula);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormula = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormula.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormula.add(this.jLabelTiposArchivoReporteDinamicoFormula, this.gridBagConstraintsFormula);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormula.add(this.jComboBoxTiposArchivosReportesDinamicoFormula, this.gridBagConstraintsFormula);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormula = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormula.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormula,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormula.setToolTipText("Generar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormula.add(this.jButtonGenerarReporteDinamicoFormula, this.gridBagConstraintsFormula);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormula = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormula.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormula,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormula.setToolTipText("Cancelar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormula.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormula.add(this.jButtonCerrarReporteDinamicoFormula, this.gridBagConstraintsFormula);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormula = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormula= new JScrollPane(jPanelReporteDinamicoFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormula.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormula.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormula.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormula.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormula.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormula.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormula.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormula);
		this.jInternalFrameReporteDinamicoFormula.getContentPane().add(this.jScrollPanelReporteDinamicoFormula, this.gridBagConstraintsFormula);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormula() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormula = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormula.setName("jPanelImportacionFormula"); 
		
		this.jPanelImportacionFormula.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormula.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormula.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormula.setLayout(gridaBagLayoutImportacionFormula);
		
		
		this.jInternalFrameImportacionFormula= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormula= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormula = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormula= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormula.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormula.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormula.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormula.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormula.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormula.setResizable(true);
	    this.jInternalFrameImportacionFormula.setClosable(true);
	    this.jInternalFrameImportacionFormula.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormula.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormula.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormula.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormula.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormula.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormula.setResizable(true);
	    this.jInternalFrameImportacionFormula.setClosable(true);
	    this.jInternalFrameImportacionFormula.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormula.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormula.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormula.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormula = new JLabelMe();

		this.jLabelArchivoImportacionFormula.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormula.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormula.add(this.jLabelArchivoImportacionFormula, this.gridBagConstraintsFormula);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormula = new JFileChooser();		
		this.jFileChooserImportacionFormula.setToolTipText("ESCOGER ARCHIVO"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormula = new JButtonMe();
		this.jButtonAbrirImportacionFormula.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormula,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormula.setToolTipText("Generar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = iPosYImportacion;
		this.gridBagConstraintsFormula.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormula.add(this.jButtonAbrirImportacionFormula, this.gridBagConstraintsFormula);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormula = new JLabelMe();

		this.jLabelPathArchivoImportacionFormula.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormula.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormula.add(this.jLabelPathArchivoImportacionFormula, this.gridBagConstraintsFormula);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormula=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormula.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormula.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormula.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = iPosYImportacion;
		this.gridBagConstraintsFormula.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormula.add(this.jTextFieldPathArchivoImportacionFormula, this.gridBagConstraintsFormula);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormula = new JButtonMe();
		this.jButtonGenerarImportacionFormula.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormula,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormula.setToolTipText("Generar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = iPosYImportacion;
		this.gridBagConstraintsFormula.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormula.add(this.jButtonGenerarImportacionFormula, this.gridBagConstraintsFormula);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormula = new JButtonMe();
		this.jButtonCerrarImportacionFormula.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormula,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormula.setToolTipText("Cancelar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = iPosYImportacion;
		this.gridBagConstraintsFormula.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormula.add(this.jButtonCerrarImportacionFormula, this.gridBagConstraintsFormula);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormula = new GridBagLayout();
		
		this.jScrollPanelImportacionFormula= new JScrollPane(jPanelImportacionFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy =iPosYImportacion;
		this.gridBagConstraintsFormula.gridx =iPosXImportacion;
		this.gridBagConstraintsFormula.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormula.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormula.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormula);
		this.jInternalFrameImportacionFormula.getContentPane().add(this.jScrollPanelImportacionFormula, this.gridBagConstraintsFormula);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormula(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormula = new JButtonMe();
			this.jButtonAbrirOrderByFormula.setText("Orden");
			this.jButtonAbrirOrderByFormula.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormula,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormula";
			inputMap = this.jButtonAbrirOrderByFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormula"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormula = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormula.setName("jPanelOrderByFormula"); 
			
			this.jPanelOrderByFormula.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormula.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormula.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormula.setLayout(gridaBagLayoutOrderByFormula);
			
			
			this.jTableDatosFormulaOrderBy = new JTableMe();        
			this.jTableDatosFormulaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormulaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormulaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormulaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormulaOrderBy.setViewportView(this.jTableDatosFormulaOrderBy);
			this.jTableDatosFormulaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormulaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormula= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormula= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormula = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormula= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormula.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormula.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormula.setTitle("Orden");
			this.jInternalFrameOrderByFormula.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormula.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormula.setResizable(true);
			this.jInternalFrameOrderByFormula.setClosable(true);
			this.jInternalFrameOrderByFormula.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormula.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormula.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormula.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormula.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormula.ipady =150;
				
			this.jPanelOrderByFormula.add(jScrollPanelDatosFormulaOrderBy, this.gridBagConstraintsFormula);//this.jTableDatosFormulaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormula = new JButtonMe();
			this.jButtonCerrarOrderByFormula.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormula,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormula.setToolTipText("Cancelar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormula.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormula.add(this.jButtonCerrarOrderByFormula, this.gridBagConstraintsFormula);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormula = new GridBagLayout();
			
			this.jScrollPanelOrderByFormula= new JScrollPane(jPanelOrderByFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormula.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormula.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormula.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormula);
			
			this.jInternalFrameOrderByFormula.getContentPane().add(this.jScrollPanelOrderByFormula, this.gridBagConstraintsFormula);			
		
		} else {
			this.jButtonAbrirOrderByFormula = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formulaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormula.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormula.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormula.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormula.getRowHeight();//FormulaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormulaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormula.isSelected()) {
					iHeightTable=FormulaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormulaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormulaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormulaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormula.isSelected()) {
					iHeightTable=FormulaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormulaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormulaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormula.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormula.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormula.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormula.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormula.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormula.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormula!=null && this.jInternalFrameOrderByFormula.getjTableDatosOrderBy()!=null) {
			//if(!this.formulaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormula.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormula.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormula.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormula.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormula.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormula.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formulaLogic.getFormulas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Formula> TraerFormulaBeans(List<Formula> formulas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Formula formula:formulas) {
					
				if(!(FormulaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormulaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formula.setsDetalleGeneralEntityReporte(FormulaConstantesFunciones.getFormulaDescripcion(formula));
										
						
					
					

					if(formula.getTarjetaCreditoComisions()!=null && Funciones.existeClass(classes,TarjetaCredito.class)) {
						try{formula.settarjetacreditoComisionsDescripcionReporte(new JRBeanCollectionDataSource(TarjetaCreditoJInternalFrame.TraerTarjetaCreditoBeans(formula.getTarjetaCreditoComisions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//formula.setsDetalleGeneralEntityReporte(formula.getsDetalleGeneralEntityReporte());
										
				}
				
				//formulabeans.add(formulabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formulas;
    }
	//PARA REPORTES FIN
}
