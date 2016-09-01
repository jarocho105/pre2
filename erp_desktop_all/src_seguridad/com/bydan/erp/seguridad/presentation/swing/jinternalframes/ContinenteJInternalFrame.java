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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.seguridad.util.ContinenteConstantesFunciones;

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
public class ContinenteJInternalFrame extends ContinenteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarContinente;
	
	protected JMenuBar jmenuBarContinente;
	
	protected JMenu jmenuContinente;
	protected JMenu jmenuDatosContinente;
	protected JMenu jmenuArchivoContinente;
	protected JMenu jmenuAccionesContinente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutContinente;	
	protected GridBagConstraints gridBagConstraintsContinente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ContinenteDetalleFormJInternalFrame jInternalFrameDetalleFormContinente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoContinente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionContinente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ContinenteSessionBean continenteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Continente> continentes;		
	public List<Continente> continentesEliminados;	
	public List<Continente> continentesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByContinente;		
	protected JButton jButtonAbrirOrderByContinente;
	
	
	//protected JPanel jPanelOrderByContinente;
	//public JScrollPane jScrollPanelOrderByContinente;	
	//protected JButton jButtonCerrarOrderByContinente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ContinenteLogic continenteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosContinente;
	public JScrollPane jScrollPanelDatosEdicionContinente;
	public JScrollPane jScrollPanelDatosGeneralContinente;
    
	
	
	//public JScrollPane jScrollPanelDatosContinenteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoContinente;
	//public JScrollPane jScrollPanelImportacionContinente;
	
	
	
	protected JPanel jPanelAccionesContinente;
	
    protected JPanel jPanelPaginacionContinente;
    protected JPanel jPanelParametrosReportesContinente;
	protected JPanel jPanelParametrosReportesAccionesContinente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Continente;
	protected JPanel jPanelParametrosAuxiliar2Continente;
	protected JPanel jPanelParametrosAuxiliar3Continente;
	protected JPanel jPanelParametrosAuxiliar4Continente;
	//protected JPanel jPanelParametrosAuxiliar5Continente;
	
	
	
	//protected JPanel jPanelReporteDinamicoContinente;
	//protected JPanel jPanelImportacionContinente;
	
	
	public JTable jTableDatosContinente;
	
	
	
	//public JTable jTableDatosContinenteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoContinente;
	protected JButton jButtonDuplicarContinente;
	protected JButton jButtonCopiarContinente;
	protected JButton jButtonVerFormContinente;
	protected JButton jButtonNuevoRelacionesContinente;
	protected JButton jButtonModificarContinente;
	
    protected JButton jButtonGuardarCambiosTablaContinente;
	protected JButton jButtonCerrarContinente;
	
	
	protected JButton jButtonRecargarInformacionContinente;
	protected JButton jButtonProcesarInformacionContinente;
	
	
	protected JButton jButtonAnterioresContinente;
	protected JButton jButtonSiguientesContinente;
	protected JButton jButtonNuevoGuardarCambiosContinente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoContinente;
	//protected JButton jButtonCerrarReporteDinamicoContinente;
	//protected JButton jButtonGenerarExcelReporteDinamicoContinente;	
	
	
	
	//protected JButton jButtonAbrirImportacionContinente;
	//protected JButton jButtonGenerarImportacionContinente;
	//protected JButton jButtonCerrarImportacionContinente;
	//protected JFileChooser jFileChooserImportacionContinente;
	//protected File fileImportacionContinente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarContinente;
	protected JButton jButtonDuplicarToolBarContinente;
	protected JButton jButtonNuevoRelacionesToolBarContinente;
	
	
	public JButton jButtonGuardarCambiosToolBarContinente;
	protected JButton jButtonCopiarToolBarContinente;
	protected JButton jButtonVerFormToolBarContinente;
	public JButton jButtonGuardarCambiosTablaToolBarContinente;
	protected JButton jButtonMostrarOcultarTablaToolBarContinente;
	protected JButton jButtonCerrarToolBarContinente;
	
	protected JButton jButtonRecargarInformacionToolBarContinente;
	protected JButton jButtonProcesarInformacionToolBarContinente;
	protected JButton jButtonAnterioresToolBarContinente;
	protected JButton jButtonSiguientesToolBarContinente;
	protected JButton jButtonNuevoGuardarCambiosToolBarContinente;
	protected JButton jButtonAbrirOrderByToolBarContinente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoContinente;
	protected JMenuItem jMenuItemDuplicarContinente;
	protected JMenuItem jMenuItemNuevoRelacionesContinente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosContinente;
	protected JMenuItem jMenuItemCopiarContinente;
	protected JMenuItem jMenuItemVerFormContinente;
	protected JMenuItem jMenuItemGuardarCambiosTablaContinente;
	protected JMenuItem jMenuItemCerrarContinente;
	protected JMenuItem jMenuItemDetalleCerrarContinente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByContinente;
	protected JMenuItem jMenuItemDetalleMostarOcultarContinente;
	
	protected JMenuItem jMenuItemRecargarInformacionContinente;
	protected JMenuItem jMenuItemProcesarInformacionContinente;
	protected JMenuItem jMenuItemAnterioresContinente;
	protected JMenuItem jMenuItemSiguientesContinente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosContinente;
	protected JMenuItem jMenuItemAbrirOrderByContinente;
	protected JMenuItem jMenuItemMostrarOcultarContinente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesContinente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosContinente;
	protected JCheckBox jCheckBoxSeleccionadosContinente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaContinente;
	protected JCheckBox jCheckBoxConGraficoReporteContinente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesContinente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesContinente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoContinente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoContinente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesContinente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionContinente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesContinente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesContinente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarContinente;
	protected JTextField jTextFieldValorCampoGeneralContinente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteContinente;
	//public JList<Reporte> jListColumnasSelectReporteContinente;
	//public JScrollPane jScrollColumnasSelectReporteContinente;
	
	//public JLabel jLabelRelacionesSelectReporteContinente;
	//public JList<Reporte> jListRelacionesSelectReporteContinente;
	//public JScrollPane jScrollRelacionesSelectReporteContinente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoContinente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoContinente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoContinente;
	//public JLabel jLabelTiposArchivoReporteDinamicoContinente;
	
		
	//public JLabel jLabelArchivoImportacionContinente;	
	//public JLabel jLabelPathArchivoImportacionContinente;
	//protected JTextField jTextFieldPathArchivoImportacionContinente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoContinente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoContinente;
	
	//public JLabel jLabelColumnaCategoriaValorContinente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorContinente;
	
	//public JLabel jLabelColumnasValoresGraficoContinente;
	//public JList<Reporte> jListColumnasValoresGraficoContinente;
	//public JScrollPane jScrollColumnasValoresGraficoContinente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoContinente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoContinente;	
	
	
	
	
	
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
	public ContinenteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContinenteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContinenteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContinenteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionContinente)	{
		this.jButtonRecargarInformacionContinente = jButtonRecargarInformacionContinente;
	}
	
	public JButton getjButtonProcesarInformacionContinente() {
		return this.jButtonProcesarInformacionContinente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionContinente)	{
		this.jButtonProcesarInformacionContinente = jButtonProcesarInformacionContinente;
	}
	
	
	public JButton getjButtonRecargarInformacionContinente() {
		return this.jButtonRecargarInformacionContinente;
	}
	
	
	public List<Continente> getcontinentes() {
		return this.continentes;
	}

	public void setcontinentes(List<Continente> continentes) {
		this.continentes = continentes;
	}
	
	public List<Continente> getcontinentesAux() {
		return this.continentesAux;
	}

	public void setcontinentesAux(List<Continente> continentesAux) {
		this.continentesAux = continentesAux;
	}
	
	public List<Continente> getcontinentesEliminados() {
		return this.continentesEliminados;
	}

	public void setContinentesEliminados(List<Continente> continentesEliminados) {
		this.continentesEliminados = continentesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarContinente() {
		return jComboBoxTiposSeleccionarContinente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarContinente(
			JComboBox jComboBoxTiposSeleccionarContinente) {
		this.jComboBoxTiposSeleccionarContinente = jComboBoxTiposSeleccionarContinente;
	}
	
	public void setBorderResaltarTiposSeleccionarContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarContinente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralContinente() {
		return jTextFieldValorCampoGeneralContinente;
	}

	public void setjTextFieldValorCampoGeneralContinente(
			JTextField jTextFieldValorCampoGeneralContinente) {
		this.jTextFieldValorCampoGeneralContinente = jTextFieldValorCampoGeneralContinente;
	}

	public void setBorderResaltarValorCampoGeneralContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralContinente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosContinente() {
		return this.jCheckBoxSeleccionarTodosContinente;
	}

	public void setjCheckBoxSeleccionarTodosContinente(
			JCheckBox jCheckBoxSeleccionarTodosContinente) {
		this.jCheckBoxSeleccionarTodosContinente = jCheckBoxSeleccionarTodosContinente;
	}

	public void setBorderResaltarSeleccionarTodosContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosContinente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosContinente() {
		return this.jCheckBoxSeleccionadosContinente;
	}

	public void setjCheckBoxSeleccionadosContinente(
			JCheckBox jCheckBoxSeleccionadosContinente) {
		this.jCheckBoxSeleccionadosContinente = jCheckBoxSeleccionadosContinente;
	}
	
	public void setBorderResaltarSeleccionadosContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosContinente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesContinente() {
		return this.jComboBoxTiposArchivosReportesContinente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesContinente(
			JComboBox jComboBoxTiposArchivosReportesContinente) {
		this.jComboBoxTiposArchivosReportesContinente = jComboBoxTiposArchivosReportesContinente;
	}

	public void setBorderResaltarTiposArchivosReportesContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesContinente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesContinente() {
		return this.jComboBoxTiposReportesContinente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesContinente(
			JComboBox jComboBoxTiposReportesContinente) {
		this.jComboBoxTiposReportesContinente = jComboBoxTiposReportesContinente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoContinente() {
	//	return jComboBoxTiposReportesDinamicoContinente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoContinente(
	//		JComboBox jComboBoxTiposReportesDinamicoContinente) {
	//	this.jComboBoxTiposReportesDinamicoContinente = jComboBoxTiposReportesDinamicoContinente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoContinente() {
	//	return jComboBoxTiposArchivosReportesDinamicoContinente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoContinente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoContinente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoContinente = jComboBoxTiposArchivosReportesDinamicoContinente;
	//}
	
	public void setBorderResaltarTiposReportesContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesContinente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesContinente() {
		return this.jComboBoxTiposGraficosReportesContinente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesContinente(
			JComboBox jComboBoxTiposGraficosReportesContinente) {
		this.jComboBoxTiposGraficosReportesContinente = jComboBoxTiposGraficosReportesContinente;
	}
	
	public void setBorderResaltarTiposGraficosReportesContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesContinente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionContinente() {
		return this.jComboBoxTiposPaginacionContinente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionContinente(
			JComboBox jComboBoxTiposPaginacionContinente) {
		this.jComboBoxTiposPaginacionContinente = jComboBoxTiposPaginacionContinente;
	}
	
	public void setBorderResaltarTiposPaginacionContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionContinente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesContinente() {
		return this.jComboBoxTiposRelacionesContinente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesContinente() {
		return this.jComboBoxTiposAccionesContinente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesContinente(
			JComboBox jComboBoxTiposRelacionesContinente) {
		this.jComboBoxTiposRelacionesContinente = jComboBoxTiposRelacionesContinente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesContinente(
			JComboBox jComboBoxTiposAccionesContinente) {
		this.jComboBoxTiposAccionesContinente = jComboBoxTiposAccionesContinente;
	}
	
	public void setBorderResaltarTiposRelacionesContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesContinente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesContinente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContinente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesContinente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoContinente() {
	//	return jCheckBoxConGraficoDinamicoContinente;
	//}

	//public void setjCheckBoxConGraficoDinamicoContinente(
	//		JCheckBox jCheckBoxConGraficoDinamicoContinente) {
	//	this.jCheckBoxConGraficoDinamicoContinente = jCheckBoxConGraficoDinamicoContinente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoContinente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarContinente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoContinente .setBorder(borderResaltar);		
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
		this.continenteSessionBean=new ContinenteSessionBean();
		
		this.continenteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.continenteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.continenteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ContinenteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ContinenteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ContinenteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ContinenteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ContinenteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Continente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
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
		
		ContinenteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarContinente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarContinente,this.jTtoolBarContinente,
							"nuevo","nuevo","Nuevo"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarContinente,this.jTtoolBarContinente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarContinente,this.jTtoolBarContinente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarContinente,this.jTtoolBarContinente,
							"duplicar","duplicar","Duplicar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarContinente,this.jTtoolBarContinente,
							"copiar","copiar","Copiar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarContinente,this.jTtoolBarContinente,
							"ver_form","ver_form","Ver"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContinente,this.jTtoolBarContinente,
							"recargar","recargar","Recargar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContinente,this.jTtoolBarContinente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContinente,this.jTtoolBarContinente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarContinente,this.jTtoolBarContinente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarContinente,this.jTtoolBarContinente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarContinente,this.jTtoolBarContinente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarContinente,this.jTtoolBarContinente,
							"cerrar","cerrar","Salir"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarContinente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarContinente;
			
				this.jButtonProcesarInformacionToolBarContinente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarContinente;
				
		//protected JButton jButtonModificarToolBarContinente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarContinente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuContinente=new JMenuMe("General");
		this.jmenuArchivoContinente=new JMenuMe("Archivo");
		this.jmenuAccionesContinente=new JMenuMe("Acciones");
		this.jmenuDatosContinente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoContinente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoContinente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoContinente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarContinente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarContinente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarContinente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesContinente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesContinente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesContinente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosContinente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosContinente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosContinente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarContinente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarContinente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarContinente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormContinente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormContinente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormContinente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaContinente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaContinente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaContinente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarContinente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarContinente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarContinente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionContinente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionContinente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionContinente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionContinente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionContinente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionContinente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresContinente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresContinente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresContinente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesContinente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesContinente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesContinente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByContinente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByContinente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByContinente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarContinente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarContinente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarContinente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByContinente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByContinente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByContinente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarContinente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarContinente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarContinente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosContinente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosContinente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosContinente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoContinente.add(this.jMenuItemCerrarContinente);
			
			this.jmenuAccionesContinente.add(this.jMenuItemNuevoContinente);
			this.jmenuAccionesContinente.add(this.jMenuItemNuevoGuardarCambiosContinente);
			this.jmenuAccionesContinente.add(this.jMenuItemNuevoRelacionesContinente);
			this.jmenuAccionesContinente.add(this.jMenuItemGuardarCambiosTablaContinente);		
			this.jmenuAccionesContinente.add(this.jMenuItemDuplicarContinente);		
			this.jmenuAccionesContinente.add(this.jMenuItemCopiarContinente);		
			this.jmenuAccionesContinente.add(this.jMenuItemVerFormContinente);		
			
			this.jmenuDatosContinente.add(this.jMenuItemRecargarInformacionContinente);				
			this.jmenuDatosContinente.add(this.jMenuItemAnterioresContinente);				
			this.jmenuDatosContinente.add(this.jMenuItemSiguientesContinente);				
			this.jmenuDatosContinente.add(this.jMenuItemAbrirOrderByContinente);				
			this.jmenuDatosContinente.add(this.jMenuItemMostrarOcultarContinente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesContinente.add(this.jMenuItemGuardarCambiosContinente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoContinente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesContinente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosContinente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarContinente.add(this.jmenuArchivoContinente);		
			this.jmenuBarContinente.add(this.jmenuAccionesContinente);		
			this.jmenuBarContinente.add(this.jmenuDatosContinente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarContinente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasContinente() {
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
			//this.jInternalFrameDetalleContinente = new ContinenteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Continente DATOS");
			this.jInternalFrameDetalleFormContinente = new ContinenteDetalleFormJInternalFrame(jDesktopPane,this.continenteSessionBean.getConGuardarRelaciones(),this.continenteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormContinente = null;//new ContinenteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutContinente= new GridBagLayout();
		
		
		this.jTableDatosContinente = new JTableMe();      
		
		String sToolTipContinente="";
		sToolTipContinente=ContinenteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipContinente+="(Seguridad.Continente)";
		}
		
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			sToolTipContinente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosContinente.setToolTipText(sToolTipContinente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosContinente);
		this.jTableDatosContinente.setAutoCreateRowSorter(true);
		this.jTableDatosContinente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosContinente.setRowSelectionAllowed(true);
		this.jTableDatosContinente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosContinente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoContinente = new JButtonMe();
		this.jButtonDuplicarContinente = new JButtonMe();
		this.jButtonCopiarContinente = new JButtonMe();
		this.jButtonVerFormContinente = new JButtonMe();
		this.jButtonNuevoRelacionesContinente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaContinente = new JButtonMe();
		this.jButtonCerrarContinente = new JButtonMe();
		
		this.jScrollPanelDatosContinente = new JScrollPane();   
        this.jScrollPanelDatosGeneralContinente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Continente";
		
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Continentes" + this.sPath));
		} else {
			this.jScrollPanelDatosContinente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesContinente.setToolTipText("Acciones");
        this.jPanelAccionesContinente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralContinente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosContinente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoContinente=new ReporteDinamicoJInternalFrame(ContinenteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoContinente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionContinente=new ImportacionJInternalFrame(ContinenteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionContinente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByContinente = new JButtonMe();
		
		this.jButtonAbrirOrderByContinente.setText("Orden");
		this.jButtonAbrirOrderByContinente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByContinente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByContinente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContinente,false,this);
			
			//this.cargarOrderByContinente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByContinente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContinente,true,this);
			
			//this.cargarOrderByContinente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosContinente.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosContinente.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosContinente.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosContinente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosContinente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosContinente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoContinente.setText("Nuevo");
		this.jButtonDuplicarContinente.setText("Duplicar");
		this.jButtonCopiarContinente.setText("Copiar");
		this.jButtonVerFormContinente.setText("Ver");
		this.jButtonNuevoRelacionesContinente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaContinente.setText("Guardar");
		this.jButtonCerrarContinente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoContinente,"nuevo_button","Nuevo",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarContinente,"duplicar_button","Duplicar",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarContinente,"copiar_button","Copiar",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormContinente,"ver_form","Ver",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesContinente,"nuevorelaciones_button","Nuevo Rel",this.continenteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaContinente,"guardarcambiostabla_button","Guardar",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarContinente,"cerrar_button","Salir",this.continenteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesContinente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoContinente.setToolTipText("Nuevo"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarContinente.setToolTipText("Duplicar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarContinente.setToolTipText("Copiar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormContinente.setToolTipText("Ver"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesContinente.setToolTipText("Nuevo Rel"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaContinente.setToolTipText("Guardar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarContinente.setToolTipText("Salir"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoContinente";
		inputMap = this.jButtonNuevoContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoContinente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoContinente"));
		
		//DUPLICAR
		sMapKey = "DuplicarContinente";
		inputMap = this.jButtonDuplicarContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarContinente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarContinente"));
		
		//COPIAR
		sMapKey = "CopiarContinente";
		inputMap = this.jButtonCopiarContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarContinente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarContinente"));
		
		//VEr FORM
		sMapKey = "VerFormContinente";
		inputMap = this.jButtonVerFormContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormContinente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormContinente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesContinente";
		inputMap = this.jButtonNuevoRelacionesContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesContinente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarContinente";
		inputMap = this.jButtonModificarContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarContinente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarContinente";
		inputMap = this.jButtonCerrarContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarContinente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaContinente";
		inputMap = this.jButtonGuardarCambiosTablaContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaContinente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Continente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Continente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Continente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Continente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Continente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesContinente.setName("jPanelParametrosReportesContinente"); 
		
		this.jPanelParametrosReportesAccionesContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesContinente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesContinente.setName("jPanelParametrosReportesAccionesContinente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesContinente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesContinente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionContinente = new JButtonMe();
		this.jButtonRecargarInformacionContinente.setText("Recargar");
		this.jButtonRecargarInformacionContinente.setToolTipText("Recargar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionContinente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionContinente = new JButtonMe();
		this.jButtonProcesarInformacionContinente.setText("Procesar");
		this.jButtonProcesarInformacionContinente.setToolTipText("Procesar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionContinente.setVisible(false);
			
		this.jButtonProcesarInformacionContinente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionContinente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionContinente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesContinente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContinente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesContinente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesContinente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContinente.setText("TIPO");       
		this.jComboBoxTiposReportesContinente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesContinente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContinente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesContinente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionContinente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionContinente.setText("Paginacion");
		this.jComboBoxTiposPaginacionContinente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesContinente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesContinente.setText("Accion");
		this.jComboBoxTiposRelacionesContinente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesContinente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesContinente.setText("Accion");
		this.jComboBoxTiposAccionesContinente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarContinente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarContinente.setText("Accion");
		this.jComboBoxTiposSeleccionarContinente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralContinente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralContinente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralContinente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralContinente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesContinente = new JLabelMe();
		
		this.jLabelAccionesContinente.setText("Acciones");		
		this.jLabelAccionesContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosContinente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosContinente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosContinente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosContinente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosContinente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosContinente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaContinente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaContinente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaContinente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteContinente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteContinente.setText("Graf.");
		this.jCheckBoxConGraficoReporteContinente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresContinente = new JButtonMe();
		//this.jButtonAnterioresContinente.setText("<<");
        this.jButtonAnterioresContinente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresContinente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesContinente = new JButtonMe();
		//this.jButtonSiguientesContinente.setText(">>");
        this.jButtonSiguientesContinente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesContinente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosContinente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosContinente.setText("Nue");
        this.jButtonNuevoGuardarCambiosContinente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosContinente,"nuevoguardarcambios_button","Nue",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosContinente";
		inputMap = this.jButtonNuevoGuardarCambiosContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosContinente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionContinente";
		inputMap = this.jButtonRecargarInformacionContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionContinente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesContinente";
		inputMap = this.jButtonSiguientesContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesContinente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresContinente";
		inputMap = this.jButtonAnterioresContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresContinente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasContinente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesContinente.setMinimumSize(new Dimension(this.getWidth(),ContinenteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContinenteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesContinente.setMaximumSize(new Dimension(this.getWidth(),ContinenteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContinenteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesContinente.setPreferredSize(new Dimension(this.getWidth(),ContinenteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContinenteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionContinente = new GridBagLayout();

			this.jPanelPaginacionContinente.setLayout(gridaBagLayoutPaginacionContinente);						
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = 0;
			this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionContinente.add(this.jButtonAnterioresContinente, this.gridBagConstraintsContinente);
					
						
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsContinente.gridy = 0;
			
			this.jPanelPaginacionContinente.add(this.jButtonNuevoGuardarCambiosContinente, this.gridBagConstraintsContinente);
						
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsContinente.gridy = 0;
			this.jPanelPaginacionContinente.add(this.jButtonSiguientesContinente, this.gridBagConstraintsContinente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = 1;
			this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContinente.add(this.jButtonNuevoContinente, this.gridBagConstraintsContinente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsContinente = new GridBagConstraints();
				this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsContinente.gridy = 1;
				this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionContinente.add(this.jButtonNuevoRelacionesContinente, this.gridBagConstraintsContinente);
			}
			
			
			if(!this.continenteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsContinente = new GridBagConstraints();
				this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsContinente.gridy = 1;
				this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionContinente.add(this.jButtonGuardarCambiosTablaContinente, this.gridBagConstraintsContinente);
			}
			
			
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = 1;
			this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContinente.add(this.jButtonDuplicarContinente, this.gridBagConstraintsContinente);
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = 1;
			this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContinente.add(this.jButtonCopiarContinente, this.gridBagConstraintsContinente);
		
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = 1;
			this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContinente.add(this.jButtonVerFormContinente, this.gridBagConstraintsContinente);
		
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = 1;
			this.gridBagConstraintsContinente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionContinente.add(this.jButtonCerrarContinente, this.gridBagConstraintsContinente);
		
		
		
		this.jButtonRecargarInformacionContinente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionContinente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionContinente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionContinente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesContinente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesContinente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesContinente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesContinente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesContinente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesContinente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesContinente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesContinente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesContinente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionContinente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionContinente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionContinente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesContinente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesContinente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesContinente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesContinente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContinente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContinente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarContinente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarContinente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarContinente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaContinente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaContinente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaContinente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteContinente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteContinente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteContinente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteContinente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosContinente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosContinente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosContinente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosContinente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosContinente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosContinente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesContinente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesContinente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Continente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Continente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Continente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Continente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesContinente.setLayout(gridaBagParametrosReportesContinente);
			this.jPanelParametrosReportesAccionesContinente.setLayout(gridaBagParametrosReportesAccionesContinente);
			
			
			this.jPanelParametrosAuxiliar1Continente.setLayout(gridaBagParametrosAuxiliar1Continente);
			this.jPanelParametrosAuxiliar2Continente.setLayout(gridaBagParametrosAuxiliar2Continente);
			this.jPanelParametrosAuxiliar3Continente.setLayout(gridaBagParametrosAuxiliar3Continente);
			this.jPanelParametrosAuxiliar4Continente.setLayout(gridaBagParametrosAuxiliar4Continente);
			//this.jPanelParametrosAuxiliar5Continente.setLayout(gridaBagParametrosAuxiliar2Continente);			
			
			
			
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContinente.add(this.jButtonRecargarInformacionContinente, this.gridBagConstraintsContinente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Continente.add(this.jComboBoxTiposPaginacionContinente, this.gridBagConstraintsContinente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Continente.add(this.jCheckBoxConAltoMaximoTablaContinente, this.gridBagConstraintsContinente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Continente.add(this.jComboBoxTiposArchivosReportesContinente, this.gridBagConstraintsContinente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContinente.add(this.jPanelParametrosAuxiliar1Continente, this.gridBagConstraintsContinente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContinente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Continente.add(this.jComboBoxTiposReportesContinente, this.gridBagConstraintsContinente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContinente.add(this.jPanelParametrosAuxiliar4Continente, this.gridBagConstraintsContinente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContinente.add(this.jComboBoxTiposReportesContinente, this.gridBagConstraintsContinente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContinente.add(this.jCheckBoxGenerarReporteContinente, this.gridBagConstraintsContinente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContinente.add(this.jPanelParametrosAuxiliar2Continente, this.gridBagConstraintsContinente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContinente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContinente.add(this.jLabelAccionesContinente, this.gridBagConstraintsContinente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsContinente = new GridBagConstraints();
				this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesContinente.add(this.jButtonAbrirOrderByContinente, this.gridBagConstraintsContinente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContinente.add(this.jComboBoxTiposSeleccionarContinente, this.gridBagConstraintsContinente);			
			
			
			/*
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContinente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContinente.add(this.jCheckBoxSeleccionarTodosContinente, this.gridBagConstraintsContinente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContinente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Continente.add(this.jCheckBoxSeleccionarTodosContinente, this.gridBagConstraintsContinente);															
				
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContinente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Continente.add(this.jCheckBoxSeleccionadosContinente, this.gridBagConstraintsContinente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContinente.add(this.jPanelParametrosAuxiliar3Continente, this.gridBagConstraintsContinente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContinente.add(this.jComboBoxTiposRelacionesContinente, this.gridBagConstraintsContinente);
				
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContinente.add(this.jComboBoxTiposAccionesContinente, this.gridBagConstraintsContinente);
	
				
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContinente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContinente.add(this.jTextFieldValorCampoGeneralContinente, this.gridBagConstraintsContinente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosContinente = new GridBagLayout();

			this.jScrollPanelDatosContinente.setLayout(gridaBagLayoutDatosContinente);
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = 0;
			this.gridBagConstraintsContinente.gridx = 0;
			
			this.jScrollPanelDatosContinente.add(this.jTableDatosContinente, this.gridBagConstraintsContinente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosContinente.setViewportView(this.jTableDatosContinente);
		this.jTableDatosContinente.setFillsViewportHeight(true);
		this.jTableDatosContinente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesContinente= new GridBagLayout();
		this.jPanelAccionesContinente.setLayout(gridaBagLayoutAccionesContinente);
		
		
		/*	
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = 0;
		this.gridBagConstraintsContinente.gridx = 0;
			
		this.jPanelAccionesContinente.add(this.jButtonNuevoContinente, this.gridBagConstraintsContinente);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutContinente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutContinente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.continenteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsContinente = new GridBagConstraints();						
			this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContinente.gridx = 0;		
			//this.gridBagConstraintsContinente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsContinente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarContinente, this.gridBagConstraintsContinente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsContinente.gridx = 0;		
		//this.gridBagConstraintsContinente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsContinente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsContinente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesContinente, this.gridBagConstraintsContinente);								
		
		
		/*
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesContinente, this.gridBagConstraintsContinente);
		*/		
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsContinente.gridx =0;
		this.gridBagConstraintsContinente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsContinente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosContinente, this.gridBagConstraintsContinente);
				
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionContinente, this.gridBagConstraintsContinente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ContinenteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosContinente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosContinente = new GridBagLayout();
			this.jPanelBusquedasParametrosContinente.setLayout(gridaBagLayoutBusquedasParametrosContinente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralContinente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralContinente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContinente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContinente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposContinente, this.gridBagConstraintsContinente);
			
			
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosContinente, this.gridBagConstraintsContinente);
		
			
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesContinente, this.gridBagConstraintsContinente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralContinente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoContinente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoContinente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoContinente.setName("jPanelReporteDinamicoContinente"); 
		
		this.jPanelReporteDinamicoContinente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoContinente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoContinente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoContinente.setLayout(gridaBagLayoutReporteDinamicoContinente);
		
		
		this.jInternalFrameReporteDinamicoContinente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoContinente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteContinente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoContinente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoContinente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoContinente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoContinente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoContinente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoContinente.setResizable(true);
	    this.jInternalFrameReporteDinamicoContinente.setClosable(true);
	    this.jInternalFrameReporteDinamicoContinente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoContinente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoContinente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoContinente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Continentes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteContinente = new JLabelMe();

		this.jLabelColumnasSelectReporteContinente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoContinente.add(this.jLabelColumnasSelectReporteContinente, this.gridBagConstraintsContinente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteContinente = new JList<Reporte>();
		this.jListColumnasSelectReporteContinente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteContinente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteContinente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteContinente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteContinente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteContinente=new JScrollPane(this.jListColumnasSelectReporteContinente);
			
			this.jScrollColumnasSelectReporteContinente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteContinente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteContinente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoContinente.add(this.jListColumnasSelectReporteContinente, this.gridBagConstraintsContinente);
		this.jPanelReporteDinamicoContinente.add(this.jScrollColumnasSelectReporteContinente, this.gridBagConstraintsContinente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteContinente = new JLabelMe();

		this.jLabelRelacionesSelectReporteContinente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoContinente.add(this.jLabelRelacionesSelectReporteContinente, this.gridBagConstraintsContinente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteContinente = new JList<Reporte>();
		this.jListRelacionesSelectReporteContinente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteContinente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteContinente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteContinente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteContinente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteContinente=new JScrollPane(this.jListRelacionesSelectReporteContinente);
			
			this.jScrollRelacionesSelectReporteContinente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteContinente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteContinente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoContinente.add(this.jListRelacionesSelectReporteContinente, this.gridBagConstraintsContinente);
		this.jPanelReporteDinamicoContinente.add(this.jScrollRelacionesSelectReporteContinente, this.gridBagConstraintsContinente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoContinente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoContinente = new JComboBoxMe();
		this.jListColumnasValoresGraficoContinente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoContinente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoContinente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoContinente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoContinente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoContinente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoContinente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoContinente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoContinente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoContinente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoContinente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoContinente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoContinente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoContinente.add(this.jLabelGenerarExcelReporteDinamicoContinente, this.gridBagConstraintsContinente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoContinente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoContinente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoContinente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoContinente.setToolTipText("Generar EXCEL"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsContinente = new GridBagConstraints();
		//this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoContinente.add(this.jButtonGenerarExcelReporteDinamicoContinente, this.gridBagConstraintsContinente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContinente.add(this.jComboBoxTiposReportesDinamicoContinente, this.gridBagConstraintsContinente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoContinente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoContinente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoContinente.add(this.jLabelTiposArchivoReporteDinamicoContinente, this.gridBagConstraintsContinente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContinente.add(this.jComboBoxTiposArchivosReportesDinamicoContinente, this.gridBagConstraintsContinente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoContinente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoContinente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoContinente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoContinente.setToolTipText("Generar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContinente.add(this.jButtonGenerarReporteDinamicoContinente, this.gridBagConstraintsContinente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoContinente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoContinente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoContinente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoContinente.setToolTipText("Cancelar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContinente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContinente.add(this.jButtonCerrarReporteDinamicoContinente, this.gridBagConstraintsContinente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalContinente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoContinente= new JScrollPane(jPanelReporteDinamicoContinente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoContinente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoContinente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoContinente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Continentes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsContinente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsContinente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoContinente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoContinente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalContinente);
		this.jInternalFrameReporteDinamicoContinente.getContentPane().add(this.jScrollPanelReporteDinamicoContinente, this.gridBagConstraintsContinente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionContinente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionContinente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionContinente.setName("jPanelImportacionContinente"); 
		
		this.jPanelImportacionContinente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionContinente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionContinente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionContinente.setLayout(gridaBagLayoutImportacionContinente);
		
		
		this.jInternalFrameImportacionContinente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionContinente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionContinente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteContinente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionContinente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionContinente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionContinente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionContinente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionContinente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionContinente.setResizable(true);
	    this.jInternalFrameImportacionContinente.setClosable(true);
	    this.jInternalFrameImportacionContinente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionContinente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionContinente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionContinente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionContinente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionContinente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionContinente.setResizable(true);
	    this.jInternalFrameImportacionContinente.setClosable(true);
	    this.jInternalFrameImportacionContinente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionContinente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionContinente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionContinente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Continentes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionContinente = new JLabelMe();

		this.jLabelArchivoImportacionContinente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = iPosYImportacion;		
		this.gridBagConstraintsContinente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionContinente.add(this.jLabelArchivoImportacionContinente, this.gridBagConstraintsContinente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionContinente = new JFileChooser();		
		this.jFileChooserImportacionContinente.setToolTipText("ESCOGER ARCHIVO"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionContinente = new JButtonMe();
		this.jButtonAbrirImportacionContinente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionContinente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionContinente.setToolTipText("Generar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = iPosYImportacion;
		this.gridBagConstraintsContinente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContinente.add(this.jButtonAbrirImportacionContinente, this.gridBagConstraintsContinente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionContinente = new JLabelMe();

		this.jLabelPathArchivoImportacionContinente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = iPosYImportacion;		
		this.gridBagConstraintsContinente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionContinente.add(this.jLabelPathArchivoImportacionContinente, this.gridBagConstraintsContinente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionContinente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionContinente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionContinente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionContinente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = iPosYImportacion;
		this.gridBagConstraintsContinente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContinente.add(this.jTextFieldPathArchivoImportacionContinente, this.gridBagConstraintsContinente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionContinente = new JButtonMe();
		this.jButtonGenerarImportacionContinente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionContinente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionContinente.setToolTipText("Generar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = iPosYImportacion;
		this.gridBagConstraintsContinente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContinente.add(this.jButtonGenerarImportacionContinente, this.gridBagConstraintsContinente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionContinente = new JButtonMe();
		this.jButtonCerrarImportacionContinente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionContinente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionContinente.setToolTipText("Cancelar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = iPosYImportacion;
		this.gridBagConstraintsContinente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContinente.add(this.jButtonCerrarImportacionContinente, this.gridBagConstraintsContinente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalContinente = new GridBagLayout();
		
		this.jScrollPanelImportacionContinente= new JScrollPane(jPanelImportacionContinente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy =iPosYImportacion;
		this.gridBagConstraintsContinente.gridx =iPosXImportacion;
		this.gridBagConstraintsContinente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionContinente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionContinente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalContinente);
		this.jInternalFrameImportacionContinente.getContentPane().add(this.jScrollPanelImportacionContinente, this.gridBagConstraintsContinente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByContinente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByContinente = new JButtonMe();
			this.jButtonAbrirOrderByContinente.setText("Orden");
			this.jButtonAbrirOrderByContinente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByContinente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByContinente";
			inputMap = this.jButtonAbrirOrderByContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByContinente"));
		
		
			GridBagLayout gridaBagLayoutOrderByContinente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByContinente.setName("jPanelOrderByContinente"); 
			
			this.jPanelOrderByContinente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByContinente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByContinente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByContinente.setLayout(gridaBagLayoutOrderByContinente);
			
			
			this.jTableDatosContinenteOrderBy = new JTableMe();        
			this.jTableDatosContinenteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosContinenteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosContinenteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosContinenteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosContinenteOrderBy.setViewportView(this.jTableDatosContinenteOrderBy);
			this.jTableDatosContinenteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosContinenteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByContinente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByContinente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByContinente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteContinente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByContinente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByContinente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByContinente.setTitle("Orden");
			this.jInternalFrameOrderByContinente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByContinente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByContinente.setResizable(true);
			this.jInternalFrameOrderByContinente.setClosable(true);
			this.jInternalFrameOrderByContinente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByContinente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByContinente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByContinente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Continentes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsContinente.gridx =iPosXOrderBy;
			this.gridBagConstraintsContinente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsContinente.ipady =150;
				
			this.jPanelOrderByContinente.add(jScrollPanelDatosContinenteOrderBy, this.gridBagConstraintsContinente);//this.jTableDatosContinenteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByContinente = new JButtonMe();
			this.jButtonCerrarOrderByContinente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByContinente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByContinente.setToolTipText("Cancelar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsContinente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByContinente.add(this.jButtonCerrarOrderByContinente, this.gridBagConstraintsContinente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalContinente = new GridBagLayout();
			
			this.jScrollPanelOrderByContinente= new JScrollPane(jPanelOrderByContinente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy =iPosYOrderBy;
			this.gridBagConstraintsContinente.gridx =iPosXOrderBy;
			this.gridBagConstraintsContinente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByContinente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByContinente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalContinente);
			
			this.jInternalFrameOrderByContinente.getContentPane().add(this.jScrollPanelOrderByContinente, this.gridBagConstraintsContinente);			
		
		} else {
			this.jButtonAbrirOrderByContinente = new JButtonMe();
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
			&& this.continenteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosContinente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosContinente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosContinente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosContinente.getRowHeight();//ContinenteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ContinenteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaContinente.isSelected()) {
					iHeightTable=ContinenteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ContinenteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ContinenteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ContinenteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaContinente.isSelected()) {
					iHeightTable=ContinenteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ContinenteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ContinenteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosContinente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosContinente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosContinente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosContinente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosContinente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosContinente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByContinente!=null && this.jInternalFrameOrderByContinente.getjTableDatosOrderBy()!=null) {
			//if(!this.continenteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByContinente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByContinente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByContinente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosContinente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosContinente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosContinente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=continenteLogic.getContinentes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=continentes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Continente> TraerContinenteBeans(List<Continente> continentes,ArrayList<Classe> classes)throws Exception {
		try {
			for(Continente continente:continentes) {
					
				if(!(ContinenteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ContinenteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					continente.setsDetalleGeneralEntityReporte(ContinenteConstantesFunciones.getContinenteDescripcion(continente));
										
						
					
					

					if(continente.getPaiss()!=null && Funciones.existeClass(classes,Pais.class)) {
						try{continente.setpaissDescripcionReporte(new JRBeanCollectionDataSource(PaisJInternalFrame.TraerPaisBeans(continente.getPaiss(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//continente.setsDetalleGeneralEntityReporte(continente.getsDetalleGeneralEntityReporte());
										
				}
				
				//continentebeans.add(continentebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return continentes;
    }
	//PARA REPORTES FIN
}
