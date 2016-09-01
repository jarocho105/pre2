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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.GeneraCreditosConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class GeneraCreditosJInternalFrame extends GeneraCreditosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGeneraCreditos;
	
	protected JMenuBar jmenuBarGeneraCreditos;
	
	protected JMenu jmenuGeneraCreditos;
	protected JMenu jmenuDatosGeneraCreditos;
	protected JMenu jmenuArchivoGeneraCreditos;
	protected JMenu jmenuAccionesGeneraCreditos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGeneraCreditos;	
	protected GridBagConstraints gridBagConstraintsGeneraCreditos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GeneraCreditosDetalleFormJInternalFrame jInternalFrameDetalleFormGeneraCreditos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGeneraCreditos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGeneraCreditos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public GeneraCreditosSessionBean generacreditosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GeneraCreditos> generacreditoss;		
	public List<GeneraCreditos> generacreditossEliminados;	
	public List<GeneraCreditos> generacreditossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGeneraCreditos;		
	protected JButton jButtonAbrirOrderByGeneraCreditos;
	
	
	//protected JPanel jPanelOrderByGeneraCreditos;
	//public JScrollPane jScrollPanelOrderByGeneraCreditos;	
	//protected JButton jButtonCerrarOrderByGeneraCreditos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GeneraCreditosLogic generacreditosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGeneraCreditos;
	public JScrollPane jScrollPanelDatosEdicionGeneraCreditos;
	public JScrollPane jScrollPanelDatosGeneralGeneraCreditos;
    
	
	
	//public JScrollPane jScrollPanelDatosGeneraCreditosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGeneraCreditos;
	//public JScrollPane jScrollPanelImportacionGeneraCreditos;
	
	
	
	protected JPanel jPanelAccionesGeneraCreditos;
	
    protected JPanel jPanelPaginacionGeneraCreditos;
    protected JPanel jPanelParametrosReportesGeneraCreditos;
	protected JPanel jPanelParametrosReportesAccionesGeneraCreditos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GeneraCreditos;
	protected JPanel jPanelParametrosAuxiliar2GeneraCreditos;
	protected JPanel jPanelParametrosAuxiliar3GeneraCreditos;
	protected JPanel jPanelParametrosAuxiliar4GeneraCreditos;
	//protected JPanel jPanelParametrosAuxiliar5GeneraCreditos;
	
	
	
	//protected JPanel jPanelReporteDinamicoGeneraCreditos;
	//protected JPanel jPanelImportacionGeneraCreditos;
	
	
	public JTable jTableDatosGeneraCreditos;
	
	
	
	//public JTable jTableDatosGeneraCreditosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGeneraCreditos;
	protected JButton jButtonDuplicarGeneraCreditos;
	protected JButton jButtonCopiarGeneraCreditos;
	protected JButton jButtonVerFormGeneraCreditos;
	protected JButton jButtonNuevoRelacionesGeneraCreditos;
	protected JButton jButtonModificarGeneraCreditos;
	
    protected JButton jButtonGuardarCambiosTablaGeneraCreditos;
	protected JButton jButtonCerrarGeneraCreditos;
	
	
	protected JButton jButtonRecargarInformacionGeneraCreditos;
	protected JButton jButtonProcesarInformacionGeneraCreditos;
	
	
	protected JButton jButtonAnterioresGeneraCreditos;
	protected JButton jButtonSiguientesGeneraCreditos;
	protected JButton jButtonNuevoGuardarCambiosGeneraCreditos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGeneraCreditos;
	//protected JButton jButtonCerrarReporteDinamicoGeneraCreditos;
	//protected JButton jButtonGenerarExcelReporteDinamicoGeneraCreditos;	
	
	
	
	//protected JButton jButtonAbrirImportacionGeneraCreditos;
	//protected JButton jButtonGenerarImportacionGeneraCreditos;
	//protected JButton jButtonCerrarImportacionGeneraCreditos;
	//protected JFileChooser jFileChooserImportacionGeneraCreditos;
	//protected File fileImportacionGeneraCreditos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGeneraCreditos;
	protected JButton jButtonDuplicarToolBarGeneraCreditos;
	protected JButton jButtonNuevoRelacionesToolBarGeneraCreditos;
	
	
	public JButton jButtonGuardarCambiosToolBarGeneraCreditos;
	protected JButton jButtonCopiarToolBarGeneraCreditos;
	protected JButton jButtonVerFormToolBarGeneraCreditos;
	public JButton jButtonGuardarCambiosTablaToolBarGeneraCreditos;
	protected JButton jButtonMostrarOcultarTablaToolBarGeneraCreditos;
	protected JButton jButtonCerrarToolBarGeneraCreditos;
	
	protected JButton jButtonRecargarInformacionToolBarGeneraCreditos;
	protected JButton jButtonProcesarInformacionToolBarGeneraCreditos;
	protected JButton jButtonAnterioresToolBarGeneraCreditos;
	protected JButton jButtonSiguientesToolBarGeneraCreditos;
	protected JButton jButtonNuevoGuardarCambiosToolBarGeneraCreditos;
	protected JButton jButtonAbrirOrderByToolBarGeneraCreditos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGeneraCreditos;
	protected JMenuItem jMenuItemDuplicarGeneraCreditos;
	protected JMenuItem jMenuItemNuevoRelacionesGeneraCreditos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGeneraCreditos;
	protected JMenuItem jMenuItemCopiarGeneraCreditos;
	protected JMenuItem jMenuItemVerFormGeneraCreditos;
	protected JMenuItem jMenuItemGuardarCambiosTablaGeneraCreditos;
	protected JMenuItem jMenuItemCerrarGeneraCreditos;
	protected JMenuItem jMenuItemDetalleCerrarGeneraCreditos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGeneraCreditos;
	protected JMenuItem jMenuItemDetalleMostarOcultarGeneraCreditos;
	
	protected JMenuItem jMenuItemRecargarInformacionGeneraCreditos;
	protected JMenuItem jMenuItemProcesarInformacionGeneraCreditos;
	protected JMenuItem jMenuItemAnterioresGeneraCreditos;
	protected JMenuItem jMenuItemSiguientesGeneraCreditos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGeneraCreditos;
	protected JMenuItem jMenuItemAbrirOrderByGeneraCreditos;
	protected JMenuItem jMenuItemMostrarOcultarGeneraCreditos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGeneraCreditos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGeneraCreditos;
	protected JCheckBox jCheckBoxSeleccionadosGeneraCreditos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGeneraCreditos;
	protected JCheckBox jCheckBoxConGraficoReporteGeneraCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGeneraCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGeneraCreditos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGeneraCreditos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGeneraCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGeneraCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGeneraCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGeneraCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGeneraCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGeneraCreditos;
	protected JTextField jTextFieldValorCampoGeneralGeneraCreditos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGeneraCreditos;
	//public JList<Reporte> jListColumnasSelectReporteGeneraCreditos;
	//public JScrollPane jScrollColumnasSelectReporteGeneraCreditos;
	
	//public JLabel jLabelRelacionesSelectReporteGeneraCreditos;
	//public JList<Reporte> jListRelacionesSelectReporteGeneraCreditos;
	//public JScrollPane jScrollRelacionesSelectReporteGeneraCreditos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGeneraCreditos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGeneraCreditos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGeneraCreditos;
	//public JLabel jLabelTiposArchivoReporteDinamicoGeneraCreditos;
	
		
	//public JLabel jLabelArchivoImportacionGeneraCreditos;	
	//public JLabel jLabelPathArchivoImportacionGeneraCreditos;
	//protected JTextField jTextFieldPathArchivoImportacionGeneraCreditos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGeneraCreditos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGeneraCreditos;
	
	//public JLabel jLabelColumnaCategoriaValorGeneraCreditos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGeneraCreditos;
	
	//public JLabel jLabelColumnasValoresGraficoGeneraCreditos;
	//public JList<Reporte> jListColumnasValoresGraficoGeneraCreditos;
	//public JScrollPane jScrollColumnasValoresGraficoGeneraCreditos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGeneraCreditos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGeneraCreditos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGeneraCreditos;
	public JPanel jPanelBusquedaGeneraCreditosGeneraCreditos;
	public JButton jButtonBusquedaGeneraCreditosGeneraCreditos;
	
	public JPanel jPanelIdIdBusquedaGeneraCreditosGeneraCreditos;
	public JLabel jLabelidBusquedaGeneraCreditosGeneraCreditos;
	public JTextFieldMe jLabelidGeneraCreditosBusquedaGeneraCreditos;
	public JButton jButtonidBusquedaGeneraCreditosGeneraCreditosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public GeneraCreditosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GeneraCreditosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GeneraCreditosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GeneraCreditosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGeneraCreditos)	{
		this.jButtonRecargarInformacionGeneraCreditos = jButtonRecargarInformacionGeneraCreditos;
	}
	
	public JButton getjButtonProcesarInformacionGeneraCreditos() {
		return this.jButtonProcesarInformacionGeneraCreditos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGeneraCreditos)	{
		this.jButtonProcesarInformacionGeneraCreditos = jButtonProcesarInformacionGeneraCreditos;
	}
	
	
	public JButton getjButtonRecargarInformacionGeneraCreditos() {
		return this.jButtonRecargarInformacionGeneraCreditos;
	}
	
	
	public List<GeneraCreditos> getgeneracreditoss() {
		return this.generacreditoss;
	}

	public void setgeneracreditoss(List<GeneraCreditos> generacreditoss) {
		this.generacreditoss = generacreditoss;
	}
	
	public List<GeneraCreditos> getgeneracreditossAux() {
		return this.generacreditossAux;
	}

	public void setgeneracreditossAux(List<GeneraCreditos> generacreditossAux) {
		this.generacreditossAux = generacreditossAux;
	}
	
	public List<GeneraCreditos> getgeneracreditossEliminados() {
		return this.generacreditossEliminados;
	}

	public void setGeneraCreditossEliminados(List<GeneraCreditos> generacreditossEliminados) {
		this.generacreditossEliminados = generacreditossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGeneraCreditos() {
		return jComboBoxTiposSeleccionarGeneraCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGeneraCreditos(
			JComboBox jComboBoxTiposSeleccionarGeneraCreditos) {
		this.jComboBoxTiposSeleccionarGeneraCreditos = jComboBoxTiposSeleccionarGeneraCreditos;
	}
	
	public void setBorderResaltarTiposSeleccionarGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGeneraCreditos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGeneraCreditos() {
		return jTextFieldValorCampoGeneralGeneraCreditos;
	}

	public void setjTextFieldValorCampoGeneralGeneraCreditos(
			JTextField jTextFieldValorCampoGeneralGeneraCreditos) {
		this.jTextFieldValorCampoGeneralGeneraCreditos = jTextFieldValorCampoGeneralGeneraCreditos;
	}

	public void setBorderResaltarValorCampoGeneralGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGeneraCreditos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGeneraCreditos() {
		return this.jCheckBoxSeleccionarTodosGeneraCreditos;
	}

	public void setjCheckBoxSeleccionarTodosGeneraCreditos(
			JCheckBox jCheckBoxSeleccionarTodosGeneraCreditos) {
		this.jCheckBoxSeleccionarTodosGeneraCreditos = jCheckBoxSeleccionarTodosGeneraCreditos;
	}

	public void setBorderResaltarSeleccionarTodosGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGeneraCreditos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGeneraCreditos() {
		return this.jCheckBoxSeleccionadosGeneraCreditos;
	}

	public void setjCheckBoxSeleccionadosGeneraCreditos(
			JCheckBox jCheckBoxSeleccionadosGeneraCreditos) {
		this.jCheckBoxSeleccionadosGeneraCreditos = jCheckBoxSeleccionadosGeneraCreditos;
	}
	
	public void setBorderResaltarSeleccionadosGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGeneraCreditos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGeneraCreditos() {
		return this.jComboBoxTiposArchivosReportesGeneraCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGeneraCreditos(
			JComboBox jComboBoxTiposArchivosReportesGeneraCreditos) {
		this.jComboBoxTiposArchivosReportesGeneraCreditos = jComboBoxTiposArchivosReportesGeneraCreditos;
	}

	public void setBorderResaltarTiposArchivosReportesGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGeneraCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGeneraCreditos() {
		return this.jComboBoxTiposReportesGeneraCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGeneraCreditos(
			JComboBox jComboBoxTiposReportesGeneraCreditos) {
		this.jComboBoxTiposReportesGeneraCreditos = jComboBoxTiposReportesGeneraCreditos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGeneraCreditos() {
	//	return jComboBoxTiposReportesDinamicoGeneraCreditos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGeneraCreditos(
	//		JComboBox jComboBoxTiposReportesDinamicoGeneraCreditos) {
	//	this.jComboBoxTiposReportesDinamicoGeneraCreditos = jComboBoxTiposReportesDinamicoGeneraCreditos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGeneraCreditos() {
	//	return jComboBoxTiposArchivosReportesDinamicoGeneraCreditos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGeneraCreditos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGeneraCreditos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGeneraCreditos = jComboBoxTiposArchivosReportesDinamicoGeneraCreditos;
	//}
	
	public void setBorderResaltarTiposReportesGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGeneraCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGeneraCreditos() {
		return this.jComboBoxTiposGraficosReportesGeneraCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGeneraCreditos(
			JComboBox jComboBoxTiposGraficosReportesGeneraCreditos) {
		this.jComboBoxTiposGraficosReportesGeneraCreditos = jComboBoxTiposGraficosReportesGeneraCreditos;
	}
	
	public void setBorderResaltarTiposGraficosReportesGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGeneraCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGeneraCreditos() {
		return this.jComboBoxTiposPaginacionGeneraCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGeneraCreditos(
			JComboBox jComboBoxTiposPaginacionGeneraCreditos) {
		this.jComboBoxTiposPaginacionGeneraCreditos = jComboBoxTiposPaginacionGeneraCreditos;
	}
	
	public void setBorderResaltarTiposPaginacionGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGeneraCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGeneraCreditos() {
		return this.jComboBoxTiposRelacionesGeneraCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGeneraCreditos() {
		return this.jComboBoxTiposAccionesGeneraCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGeneraCreditos(
			JComboBox jComboBoxTiposRelacionesGeneraCreditos) {
		this.jComboBoxTiposRelacionesGeneraCreditos = jComboBoxTiposRelacionesGeneraCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGeneraCreditos(
			JComboBox jComboBoxTiposAccionesGeneraCreditos) {
		this.jComboBoxTiposAccionesGeneraCreditos = jComboBoxTiposAccionesGeneraCreditos;
	}
	
	public void setBorderResaltarTiposRelacionesGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGeneraCreditos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGeneraCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGeneraCreditos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGeneraCreditos() {
	//	return jCheckBoxConGraficoDinamicoGeneraCreditos;
	//}

	//public void setjCheckBoxConGraficoDinamicoGeneraCreditos(
	//		JCheckBox jCheckBoxConGraficoDinamicoGeneraCreditos) {
	//	this.jCheckBoxConGraficoDinamicoGeneraCreditos = jCheckBoxConGraficoDinamicoGeneraCreditos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGeneraCreditos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGeneraCreditos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGeneraCreditos .setBorder(borderResaltar);		
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
		this.generacreditosSessionBean=new GeneraCreditosSessionBean();
		
		this.generacreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.generacreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.generacreditosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GeneraCreditosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GeneraCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GeneraCreditosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GeneraCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GeneraCreditosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Genera Creditos MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
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
		
		GeneraCreditosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGeneraCreditos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"nuevo","nuevo","Nuevo"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"duplicar","duplicar","Duplicar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"copiar","copiar","Copiar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"ver_form","ver_form","Ver"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"recargar","recargar","Buscar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGeneraCreditos,this.jTtoolBarGeneraCreditos,
							"cerrar","cerrar","Salir"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGeneraCreditos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGeneraCreditos;
			
				this.jButtonProcesarInformacionToolBarGeneraCreditos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGeneraCreditos;
				
		//protected JButton jButtonModificarToolBarGeneraCreditos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGeneraCreditos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGeneraCreditos=new JMenuMe("General");
		this.jmenuArchivoGeneraCreditos=new JMenuMe("Archivo");
		this.jmenuAccionesGeneraCreditos=new JMenuMe("Acciones");
		this.jmenuDatosGeneraCreditos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGeneraCreditos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGeneraCreditos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGeneraCreditos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGeneraCreditos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGeneraCreditos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGeneraCreditos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGeneraCreditos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGeneraCreditos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGeneraCreditos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGeneraCreditos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGeneraCreditos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGeneraCreditos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGeneraCreditos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGeneraCreditos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGeneraCreditos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGeneraCreditos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGeneraCreditos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGeneraCreditos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGeneraCreditos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGeneraCreditos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGeneraCreditos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGeneraCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGeneraCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGeneraCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGeneraCreditos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGeneraCreditos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGeneraCreditos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGeneraCreditos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGeneraCreditos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGeneraCreditos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGeneraCreditos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGeneraCreditos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGeneraCreditos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGeneraCreditos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGeneraCreditos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGeneraCreditos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGeneraCreditos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGeneraCreditos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGeneraCreditos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGeneraCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGeneraCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGeneraCreditos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGeneraCreditos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGeneraCreditos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGeneraCreditos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGeneraCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGeneraCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGeneraCreditos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGeneraCreditos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGeneraCreditos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGeneraCreditos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGeneraCreditos.add(this.jMenuItemCerrarGeneraCreditos);
			
			this.jmenuAccionesGeneraCreditos.add(this.jMenuItemNuevoGeneraCreditos);
			this.jmenuAccionesGeneraCreditos.add(this.jMenuItemNuevoGuardarCambiosGeneraCreditos);
			this.jmenuAccionesGeneraCreditos.add(this.jMenuItemNuevoRelacionesGeneraCreditos);
			this.jmenuAccionesGeneraCreditos.add(this.jMenuItemGuardarCambiosTablaGeneraCreditos);		
			this.jmenuAccionesGeneraCreditos.add(this.jMenuItemDuplicarGeneraCreditos);		
			this.jmenuAccionesGeneraCreditos.add(this.jMenuItemCopiarGeneraCreditos);		
			this.jmenuAccionesGeneraCreditos.add(this.jMenuItemVerFormGeneraCreditos);		
			
			this.jmenuDatosGeneraCreditos.add(this.jMenuItemRecargarInformacionGeneraCreditos);				
			this.jmenuDatosGeneraCreditos.add(this.jMenuItemAnterioresGeneraCreditos);				
			this.jmenuDatosGeneraCreditos.add(this.jMenuItemSiguientesGeneraCreditos);				
			this.jmenuDatosGeneraCreditos.add(this.jMenuItemAbrirOrderByGeneraCreditos);				
			this.jmenuDatosGeneraCreditos.add(this.jMenuItemMostrarOcultarGeneraCreditos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGeneraCreditos.add(this.jMenuItemGuardarCambiosGeneraCreditos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGeneraCreditos.add(this.jmenuArchivoGeneraCreditos);		
			this.jmenuBarGeneraCreditos.add(this.jmenuAccionesGeneraCreditos);		
			this.jmenuBarGeneraCreditos.add(this.jmenuDatosGeneraCreditos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGeneraCreditos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGeneraCreditos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaGeneraCreditosGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaGeneraCreditosGeneraCreditos.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaGeneraCreditosGeneraCreditos= new JButtonMe();
		this.jButtonBusquedaGeneraCreditosGeneraCreditos.setText("Buscar");
		this.jButtonBusquedaGeneraCreditosGeneraCreditos.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaGeneraCreditosGeneraCreditos,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaGeneraCreditosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaGeneraCreditosGeneraCreditos = new JLabelMe();
		jLabelidBusquedaGeneraCreditosGeneraCreditos.setText(" :");
		jLabelidBusquedaGeneraCreditosGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-13),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaGeneraCreditosGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-13),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaGeneraCreditosGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-13),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaGeneraCreditosGeneraCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidGeneraCreditosBusquedaGeneraCreditos= new JTextFieldMe();
		jLabelidGeneraCreditosBusquedaGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGeneraCreditosBusquedaGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGeneraCreditosBusquedaGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidGeneraCreditosBusquedaGeneraCreditos.setVisible(false);




		this.jTabbedPaneBusquedasGeneraCreditos=new JTabbedPane();


		this.jTabbedPaneBusquedasGeneraCreditos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasGeneraCreditos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasGeneraCreditos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGeneraCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGeneraCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGeneraCreditos = new GeneraCreditosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Genera Creditos DATOS");
			this.jInternalFrameDetalleFormGeneraCreditos = new GeneraCreditosDetalleFormJInternalFrame(jDesktopPane,this.generacreditosSessionBean.getConGuardarRelaciones(),this.generacreditosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGeneraCreditos = null;//new GeneraCreditosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGeneraCreditos= new GridBagLayout();
		
		
		this.jTableDatosGeneraCreditos = new JTableMe();      
		
		String sToolTipGeneraCreditos="";
		sToolTipGeneraCreditos=GeneraCreditosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGeneraCreditos+="(Nomina.GeneraCreditos)";
		}
		
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			sToolTipGeneraCreditos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGeneraCreditos.setToolTipText(sToolTipGeneraCreditos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGeneraCreditos);
		this.jTableDatosGeneraCreditos.setAutoCreateRowSorter(true);
		this.jTableDatosGeneraCreditos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGeneraCreditos.setRowSelectionAllowed(true);
		this.jTableDatosGeneraCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGeneraCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGeneraCreditos = new JButtonMe();
		this.jButtonDuplicarGeneraCreditos = new JButtonMe();
		this.jButtonCopiarGeneraCreditos = new JButtonMe();
		this.jButtonVerFormGeneraCreditos = new JButtonMe();
		this.jButtonNuevoRelacionesGeneraCreditos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGeneraCreditos = new JButtonMe();
		this.jButtonCerrarGeneraCreditos = new JButtonMe();
		
		this.jScrollPanelDatosGeneraCreditos = new JScrollPane();   
        this.jScrollPanelDatosGeneralGeneraCreditos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Genera Creditos";
		
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Genera Creditoses" + this.sPath));
		} else {
			this.jScrollPanelDatosGeneraCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGeneraCreditos.setToolTipText("Acciones");
        this.jPanelAccionesGeneraCreditos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGeneraCreditos=new ReporteDinamicoJInternalFrame(GeneraCreditosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGeneraCreditos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGeneraCreditos=new ImportacionJInternalFrame(GeneraCreditosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGeneraCreditos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGeneraCreditos = new JButtonMe();
		
		this.jButtonAbrirOrderByGeneraCreditos.setText("Orden");
		this.jButtonAbrirOrderByGeneraCreditos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGeneraCreditos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGeneraCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGeneraCreditos,false,this);
			
			//this.cargarOrderByGeneraCreditos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGeneraCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGeneraCreditos,true,this);
			
			//this.cargarOrderByGeneraCreditos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGeneraCreditos.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosGeneraCreditos.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosGeneraCreditos.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosGeneraCreditos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGeneraCreditos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGeneraCreditos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGeneraCreditos.setText("Nuevo");
		this.jButtonDuplicarGeneraCreditos.setText("Duplicar");
		this.jButtonCopiarGeneraCreditos.setText("Copiar");
		this.jButtonVerFormGeneraCreditos.setText("Ver");
		this.jButtonNuevoRelacionesGeneraCreditos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGeneraCreditos.setText("Guardar");
		this.jButtonCerrarGeneraCreditos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGeneraCreditos,"nuevo_button","Nuevo",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGeneraCreditos,"duplicar_button","Duplicar",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGeneraCreditos,"copiar_button","Copiar",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGeneraCreditos,"ver_form","Ver",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGeneraCreditos,"nuevorelaciones_button","Nuevo Rel",this.generacreditosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGeneraCreditos,"guardarcambiostabla_button","Guardar",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGeneraCreditos,"cerrar_button","Salir",this.generacreditosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGeneraCreditos.setToolTipText("Nuevo"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGeneraCreditos.setToolTipText("Duplicar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGeneraCreditos.setToolTipText("Copiar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGeneraCreditos.setToolTipText("Ver"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGeneraCreditos.setToolTipText("Nuevo Rel"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGeneraCreditos.setToolTipText("Guardar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGeneraCreditos.setToolTipText("Salir"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGeneraCreditos";
		inputMap = this.jButtonNuevoGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGeneraCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGeneraCreditos"));
		
		//DUPLICAR
		sMapKey = "DuplicarGeneraCreditos";
		inputMap = this.jButtonDuplicarGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGeneraCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGeneraCreditos"));
		
		//COPIAR
		sMapKey = "CopiarGeneraCreditos";
		inputMap = this.jButtonCopiarGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGeneraCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGeneraCreditos"));
		
		//VEr FORM
		sMapKey = "VerFormGeneraCreditos";
		inputMap = this.jButtonVerFormGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGeneraCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGeneraCreditos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGeneraCreditos";
		inputMap = this.jButtonNuevoRelacionesGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGeneraCreditos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGeneraCreditos";
		inputMap = this.jButtonModificarGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGeneraCreditos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGeneraCreditos";
		inputMap = this.jButtonCerrarGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGeneraCreditos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGeneraCreditos";
		inputMap = this.jButtonGuardarCambiosTablaGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGeneraCreditos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GeneraCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GeneraCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GeneraCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GeneraCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GeneraCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGeneraCreditos.setName("jPanelParametrosReportesGeneraCreditos"); 
		
		this.jPanelParametrosReportesAccionesGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGeneraCreditos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGeneraCreditos.setName("jPanelParametrosReportesAccionesGeneraCreditos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGeneraCreditos = new JButtonMe();
		this.jButtonRecargarInformacionGeneraCreditos.setText("Buscar");
		this.jButtonRecargarInformacionGeneraCreditos.setToolTipText("Buscar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGeneraCreditos,"recargar_button","Buscar");		
		
		
		
		
		this.jButtonProcesarInformacionGeneraCreditos = new JButtonMe();
		this.jButtonProcesarInformacionGeneraCreditos.setText("Procesar");
		this.jButtonProcesarInformacionGeneraCreditos.setToolTipText("Procesar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGeneraCreditos.setVisible(false);
			
		this.jButtonProcesarInformacionGeneraCreditos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGeneraCreditos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGeneraCreditos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGeneraCreditos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGeneraCreditos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGeneraCreditos.setText("TIPO");       
		this.jComboBoxTiposReportesGeneraCreditos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGeneraCreditos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGeneraCreditos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGeneraCreditos.setText("Paginacion");
		this.jComboBoxTiposPaginacionGeneraCreditos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGeneraCreditos.setText("Accion");
		this.jComboBoxTiposRelacionesGeneraCreditos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGeneraCreditos.setText("Accion");
		this.jComboBoxTiposAccionesGeneraCreditos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGeneraCreditos.setText("Accion");
		this.jComboBoxTiposSeleccionarGeneraCreditos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGeneraCreditos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGeneraCreditos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGeneraCreditos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGeneraCreditos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGeneraCreditos = new JLabelMe();
		
		this.jLabelAccionesGeneraCreditos.setText("Acciones");		
		this.jLabelAccionesGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGeneraCreditos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGeneraCreditos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGeneraCreditos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGeneraCreditos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGeneraCreditos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGeneraCreditos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGeneraCreditos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGeneraCreditos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGeneraCreditos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGeneraCreditos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGeneraCreditos.setText("Graf.");
		this.jCheckBoxConGraficoReporteGeneraCreditos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGeneraCreditos = new JButtonMe();
		//this.jButtonAnterioresGeneraCreditos.setText("<<");
        this.jButtonAnterioresGeneraCreditos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGeneraCreditos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGeneraCreditos = new JButtonMe();
		//this.jButtonSiguientesGeneraCreditos.setText(">>");
        this.jButtonSiguientesGeneraCreditos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGeneraCreditos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGeneraCreditos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGeneraCreditos.setText("Nue");
        this.jButtonNuevoGuardarCambiosGeneraCreditos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGeneraCreditos,"nuevoguardarcambios_button","Nue",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGeneraCreditos";
		inputMap = this.jButtonNuevoGuardarCambiosGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGeneraCreditos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGeneraCreditos";
		inputMap = this.jButtonRecargarInformacionGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGeneraCreditos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGeneraCreditos";
		inputMap = this.jButtonSiguientesGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGeneraCreditos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGeneraCreditos";
		inputMap = this.jButtonAnterioresGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGeneraCreditos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGeneraCreditos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGeneraCreditos.setMinimumSize(new Dimension(this.getWidth(),GeneraCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GeneraCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGeneraCreditos.setMaximumSize(new Dimension(this.getWidth(),GeneraCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GeneraCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGeneraCreditos.setPreferredSize(new Dimension(this.getWidth(),GeneraCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GeneraCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGeneraCreditos = new GridBagLayout();

			this.jPanelPaginacionGeneraCreditos.setLayout(gridaBagLayoutPaginacionGeneraCreditos);						
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = 0;
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonAnterioresGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
					
						
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGeneraCreditos.gridy = 0;
			
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonNuevoGuardarCambiosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
						
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGeneraCreditos.gridy = 0;
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonSiguientesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = 1;
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonNuevoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
						
			
			
			if(!this.generacreditosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
				this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGeneraCreditos.gridy = 1;
				this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGeneraCreditos.add(this.jButtonGuardarCambiosTablaGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			}
			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = 1;
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonProcesarInformacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = 1;
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonDuplicarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = 1;
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonCopiarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = 1;
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonVerFormGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = 1;
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGeneraCreditos.add(this.jButtonCerrarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		
		
		this.jButtonRecargarInformacionGeneraCreditos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGeneraCreditos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGeneraCreditos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGeneraCreditos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGeneraCreditos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGeneraCreditos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGeneraCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGeneraCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGeneraCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGeneraCreditos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGeneraCreditos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGeneraCreditos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGeneraCreditos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGeneraCreditos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGeneraCreditos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGeneraCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGeneraCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGeneraCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGeneraCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGeneraCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGeneraCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGeneraCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGeneraCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGeneraCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGeneraCreditos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGeneraCreditos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGeneraCreditos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGeneraCreditos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGeneraCreditos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGeneraCreditos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGeneraCreditos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGeneraCreditos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGeneraCreditos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGeneraCreditos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGeneraCreditos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGeneraCreditos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGeneraCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGeneraCreditos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GeneraCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GeneraCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GeneraCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GeneraCreditos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGeneraCreditos.setLayout(gridaBagParametrosReportesGeneraCreditos);
			this.jPanelParametrosReportesAccionesGeneraCreditos.setLayout(gridaBagParametrosReportesAccionesGeneraCreditos);
			
			
			this.jPanelParametrosAuxiliar1GeneraCreditos.setLayout(gridaBagParametrosAuxiliar1GeneraCreditos);
			this.jPanelParametrosAuxiliar2GeneraCreditos.setLayout(gridaBagParametrosAuxiliar2GeneraCreditos);
			this.jPanelParametrosAuxiliar3GeneraCreditos.setLayout(gridaBagParametrosAuxiliar3GeneraCreditos);
			this.jPanelParametrosAuxiliar4GeneraCreditos.setLayout(gridaBagParametrosAuxiliar4GeneraCreditos);
			//this.jPanelParametrosAuxiliar5GeneraCreditos.setLayout(gridaBagParametrosAuxiliar2GeneraCreditos);			
			
			
			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGeneraCreditos.add(this.jButtonRecargarInformacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GeneraCreditos.add(this.jComboBoxTiposPaginacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GeneraCreditos.add(this.jCheckBoxConAltoMaximoTablaGeneraCreditos, this.gridBagConstraintsGeneraCreditos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GeneraCreditos.add(this.jComboBoxTiposArchivosReportesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGeneraCreditos.add(this.jPanelParametrosAuxiliar1GeneraCreditos, this.gridBagConstraintsGeneraCreditos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GeneraCreditos.add(this.jComboBoxTiposReportesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);																		
			
			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4GeneraCreditos.add(this.jComboBoxTiposGraficosReportesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGeneraCreditos.add(this.jPanelParametrosAuxiliar4GeneraCreditos, this.gridBagConstraintsGeneraCreditos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGeneraCreditos.add(this.jComboBoxTiposReportesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGeneraCreditos.add(this.jCheckBoxGenerarReporteGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGeneraCreditos.add(this.jPanelParametrosAuxiliar2GeneraCreditos, this.gridBagConstraintsGeneraCreditos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGeneraCreditos.add(this.jLabelAccionesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGeneraCreditos.add(this.jComboBoxTiposSeleccionarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);			
			
			
			/*
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGeneraCreditos.add(this.jCheckBoxSeleccionarTodosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGeneraCreditos.add(this.jCheckBoxConGraficoReporteGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GeneraCreditos.add(this.jCheckBoxSeleccionarTodosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);															
				
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GeneraCreditos.add(this.jCheckBoxSeleccionadosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);															
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGeneraCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GeneraCreditos.add(this.jCheckBoxConGraficoReporteGeneraCreditos, this.gridBagConstraintsGeneraCreditos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGeneraCreditos.add(this.jPanelParametrosAuxiliar3GeneraCreditos, this.gridBagConstraintsGeneraCreditos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGeneraCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGeneraCreditos.add(this.jComboBoxTiposAccionesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGeneraCreditos = new GridBagLayout();

			this.jScrollPanelDatosGeneraCreditos.setLayout(gridaBagLayoutDatosGeneraCreditos);
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = 0;
			this.gridBagConstraintsGeneraCreditos.gridx = 0;
			
			this.jScrollPanelDatosGeneraCreditos.add(this.jTableDatosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGeneraCreditos.setViewportView(this.jTableDatosGeneraCreditos);
		this.jTableDatosGeneraCreditos.setFillsViewportHeight(true);
		this.jTableDatosGeneraCreditos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGeneraCreditos= new GridBagLayout();
		this.jPanelAccionesGeneraCreditos.setLayout(gridaBagLayoutAccionesGeneraCreditos);
		
		
		/*	
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 0;
			
		this.jPanelAccionesGeneraCreditos.add(this.jButtonNuevoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaGeneraCreditosGeneraCreditos= new GridBagLayout();
		gridaBagLayoutBusquedaGeneraCreditosGeneraCreditos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaGeneraCreditosGeneraCreditos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaGeneraCreditosGeneraCreditos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaGeneraCreditosGeneraCreditos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaGeneraCreditosGeneraCreditos.setLayout(gridaBagLayoutBusquedaGeneraCreditosGeneraCreditos);

		gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGeneraCreditos.gridy = 0;
		gridBagConstraintsGeneraCreditos.gridx = 0;
		jPanelBusquedaGeneraCreditosGeneraCreditos.add(jLabelidBusquedaGeneraCreditosGeneraCreditos, gridBagConstraintsGeneraCreditos);

		gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGeneraCreditos.gridy = 0;
		gridBagConstraintsGeneraCreditos.gridx = 1;
		jPanelBusquedaGeneraCreditosGeneraCreditos.add(jLabelidGeneraCreditosBusquedaGeneraCreditos, gridBagConstraintsGeneraCreditos);

		gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGeneraCreditos.gridy = 1;
		gridBagConstraintsGeneraCreditos.gridx =1;
		jPanelBusquedaGeneraCreditosGeneraCreditos.add(jButtonBusquedaGeneraCreditosGeneraCreditos, gridBagConstraintsGeneraCreditos);

		jTabbedPaneBusquedasGeneraCreditos.addTab("Procesar", jPanelBusquedaGeneraCreditosGeneraCreditos);
		jTabbedPaneBusquedasGeneraCreditos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGeneraCreditos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGeneraCreditos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();						
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGeneraCreditos.gridx = 0;		
			//this.gridBagConstraintsGeneraCreditos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGeneraCreditos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGeneraCreditos.gridx = 0;		
		//this.gridBagConstraintsGeneraCreditos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGeneraCreditos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGeneraCreditos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGeneraCreditos.gridx = 0;		
			this.gridBagConstraintsGeneraCreditos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGeneraCreditos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGeneraCreditos, this.gridBagConstraintsGeneraCreditos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);								
		
		
		/*
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		*/		
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGeneraCreditos.gridx =0;
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGeneraCreditos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
				
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGeneraCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGeneraCreditos = new GridBagLayout();
			this.jPanelBusquedasParametrosGeneraCreditos.setLayout(gridaBagLayoutBusquedasParametrosGeneraCreditos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGeneraCreditos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGeneraCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGeneraCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGeneraCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			
			
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
			
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		*/
		
			
     	//pack();
		
		
		
		this.jButtonRecargarInformacionGeneraCreditos.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralGeneraCreditos.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosGeneraCreditos.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarGeneraCreditos.setVisible(false);
		this.jButtonRecargarInformacionToolBarGeneraCreditos.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosGeneraCreditos.setVisible(false);
		this.jMenuItemRecargarInformacionGeneraCreditos.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralGeneraCreditos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGeneraCreditos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGeneraCreditos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGeneraCreditos.setName("jPanelReporteDinamicoGeneraCreditos"); 
		
		this.jPanelReporteDinamicoGeneraCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGeneraCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGeneraCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGeneraCreditos.setLayout(gridaBagLayoutReporteDinamicoGeneraCreditos);
		
		
		this.jInternalFrameReporteDinamicoGeneraCreditos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGeneraCreditos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGeneraCreditos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGeneraCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGeneraCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGeneraCreditos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGeneraCreditos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGeneraCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGeneraCreditos.setResizable(true);
	    this.jInternalFrameReporteDinamicoGeneraCreditos.setClosable(true);
	    this.jInternalFrameReporteDinamicoGeneraCreditos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGeneraCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGeneraCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGeneraCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Genera Creditoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGeneraCreditos = new JLabelMe();

		this.jLabelColumnasSelectReporteGeneraCreditos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jLabelColumnasSelectReporteGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGeneraCreditos = new JList<Reporte>();
		this.jListColumnasSelectReporteGeneraCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGeneraCreditos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGeneraCreditos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGeneraCreditos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGeneraCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGeneraCreditos=new JScrollPane(this.jListColumnasSelectReporteGeneraCreditos);
			
			this.jScrollColumnasSelectReporteGeneraCreditos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGeneraCreditos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGeneraCreditos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGeneraCreditos.add(this.jListColumnasSelectReporteGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jScrollColumnasSelectReporteGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGeneraCreditos = new JLabelMe();

		this.jLabelRelacionesSelectReporteGeneraCreditos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGeneraCreditos = new JList<Reporte>();
		this.jListRelacionesSelectReporteGeneraCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGeneraCreditos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGeneraCreditos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGeneraCreditos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGeneraCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGeneraCreditos=new JScrollPane(this.jListRelacionesSelectReporteGeneraCreditos);
			
			this.jScrollRelacionesSelectReporteGeneraCreditos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGeneraCreditos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGeneraCreditos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoGeneraCreditos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGeneraCreditos = new JComboBoxMe();
		this.jListColumnasValoresGraficoGeneraCreditos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGeneraCreditos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGeneraCreditos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGeneraCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGeneraCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGeneraCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGeneraCreditos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGeneraCreditos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGeneraCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGeneraCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGeneraCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoGeneraCreditos = new JLabelMe();

		this.jLabelConGraficoDinamicoGeneraCreditos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jLabelConGraficoDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoGeneraCreditos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoGeneraCreditos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoGeneraCreditos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoGeneraCreditos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGeneraCreditos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGeneraCreditos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jCheckBoxConGraficoDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoGeneraCreditos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoGeneraCreditos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jLabelColumnaCategoriaGraficoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGeneraCreditos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoGeneraCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoGeneraCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGeneraCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGeneraCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jComboBoxColumnaCategoriaGraficoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorGeneraCreditos = new JLabelMe();

		this.jLabelColumnaCategoriaValorGeneraCreditos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jLabelColumnaCategoriaValorGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorGeneraCreditos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorGeneraCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorGeneraCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGeneraCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGeneraCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jComboBoxColumnaCategoriaValorGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoGeneraCreditos = new JLabelMe();

		this.jLabelColumnasValoresGraficoGeneraCreditos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jLabelColumnasValoresGraficoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoGeneraCreditos = new JList<Reporte>();
		this.jListColumnasValoresGraficoGeneraCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoGeneraCreditos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoGeneraCreditos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGeneraCreditos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGeneraCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoGeneraCreditos=new JScrollPane(this.jListColumnasValoresGraficoGeneraCreditos);
			
			this.jScrollColumnasValoresGraficoGeneraCreditos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGeneraCreditos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGeneraCreditos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoGeneraCreditos.add(this.jListColumnasSelectReporteGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jScrollColumnasValoresGraficoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoGeneraCreditos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoGeneraCreditos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jLabelTiposGraficosReportesDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGeneraCreditos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoGeneraCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoGeneraCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGeneraCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGeneraCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jComboBoxTiposGraficosReportesDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGeneraCreditos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGeneraCreditos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jLabelGenerarExcelReporteDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGeneraCreditos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGeneraCreditos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGeneraCreditos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGeneraCreditos.setToolTipText("Generar EXCEL"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGeneraCreditos.add(this.jButtonGenerarExcelReporteDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jComboBoxTiposReportesDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGeneraCreditos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGeneraCreditos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jLabelTiposArchivoReporteDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jComboBoxTiposArchivosReportesDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGeneraCreditos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGeneraCreditos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGeneraCreditos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGeneraCreditos.setToolTipText("Generar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jButtonGenerarReporteDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGeneraCreditos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGeneraCreditos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGeneraCreditos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGeneraCreditos.setToolTipText("Cancelar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGeneraCreditos.add(this.jButtonCerrarReporteDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGeneraCreditos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGeneraCreditos= new JScrollPane(jPanelReporteDinamicoGeneraCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGeneraCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGeneraCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGeneraCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Genera Creditoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGeneraCreditos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGeneraCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGeneraCreditos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGeneraCreditos);
		this.jInternalFrameReporteDinamicoGeneraCreditos.getContentPane().add(this.jScrollPanelReporteDinamicoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGeneraCreditos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGeneraCreditos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGeneraCreditos.setName("jPanelImportacionGeneraCreditos"); 
		
		this.jPanelImportacionGeneraCreditos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGeneraCreditos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGeneraCreditos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGeneraCreditos.setLayout(gridaBagLayoutImportacionGeneraCreditos);
		
		
		this.jInternalFrameImportacionGeneraCreditos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGeneraCreditos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGeneraCreditos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGeneraCreditos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGeneraCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGeneraCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGeneraCreditos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGeneraCreditos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGeneraCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGeneraCreditos.setResizable(true);
	    this.jInternalFrameImportacionGeneraCreditos.setClosable(true);
	    this.jInternalFrameImportacionGeneraCreditos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGeneraCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGeneraCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGeneraCreditos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGeneraCreditos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGeneraCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGeneraCreditos.setResizable(true);
	    this.jInternalFrameImportacionGeneraCreditos.setClosable(true);
	    this.jInternalFrameImportacionGeneraCreditos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGeneraCreditos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGeneraCreditos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGeneraCreditos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Genera Creditoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGeneraCreditos = new JLabelMe();

		this.jLabelArchivoImportacionGeneraCreditos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYImportacion;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGeneraCreditos.add(this.jLabelArchivoImportacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGeneraCreditos = new JFileChooser();		
		this.jFileChooserImportacionGeneraCreditos.setToolTipText("ESCOGER ARCHIVO"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGeneraCreditos = new JButtonMe();
		this.jButtonAbrirImportacionGeneraCreditos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGeneraCreditos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGeneraCreditos.setToolTipText("Generar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGeneraCreditos.add(this.jButtonAbrirImportacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGeneraCreditos = new JLabelMe();

		this.jLabelPathArchivoImportacionGeneraCreditos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYImportacion;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGeneraCreditos.add(this.jLabelPathArchivoImportacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGeneraCreditos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGeneraCreditos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGeneraCreditos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGeneraCreditos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGeneraCreditos.add(this.jTextFieldPathArchivoImportacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGeneraCreditos = new JButtonMe();
		this.jButtonGenerarImportacionGeneraCreditos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGeneraCreditos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGeneraCreditos.setToolTipText("Generar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGeneraCreditos.add(this.jButtonGenerarImportacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGeneraCreditos = new JButtonMe();
		this.jButtonCerrarImportacionGeneraCreditos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGeneraCreditos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGeneraCreditos.setToolTipText("Cancelar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGeneraCreditos.add(this.jButtonCerrarImportacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGeneraCreditos = new GridBagLayout();
		
		this.jScrollPanelImportacionGeneraCreditos= new JScrollPane(jPanelImportacionGeneraCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy =iPosYImportacion;
		this.gridBagConstraintsGeneraCreditos.gridx =iPosXImportacion;
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGeneraCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGeneraCreditos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGeneraCreditos);
		this.jInternalFrameImportacionGeneraCreditos.getContentPane().add(this.jScrollPanelImportacionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGeneraCreditos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGeneraCreditos = new JButtonMe();
			this.jButtonAbrirOrderByGeneraCreditos.setText("Orden");
			this.jButtonAbrirOrderByGeneraCreditos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGeneraCreditos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGeneraCreditos";
			inputMap = this.jButtonAbrirOrderByGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGeneraCreditos"));
		
		
			GridBagLayout gridaBagLayoutOrderByGeneraCreditos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGeneraCreditos.setName("jPanelOrderByGeneraCreditos"); 
			
			this.jPanelOrderByGeneraCreditos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGeneraCreditos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGeneraCreditos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGeneraCreditos.setLayout(gridaBagLayoutOrderByGeneraCreditos);
			
			
			this.jTableDatosGeneraCreditosOrderBy = new JTableMe();        
			this.jTableDatosGeneraCreditosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGeneraCreditosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGeneraCreditosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGeneraCreditosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGeneraCreditosOrderBy.setViewportView(this.jTableDatosGeneraCreditosOrderBy);
			this.jTableDatosGeneraCreditosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGeneraCreditosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGeneraCreditos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGeneraCreditos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGeneraCreditos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGeneraCreditos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGeneraCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGeneraCreditos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGeneraCreditos.setTitle("Orden");
			this.jInternalFrameOrderByGeneraCreditos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGeneraCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGeneraCreditos.setResizable(true);
			this.jInternalFrameOrderByGeneraCreditos.setClosable(true);
			this.jInternalFrameOrderByGeneraCreditos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGeneraCreditos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGeneraCreditos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGeneraCreditos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Genera Creditoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGeneraCreditos.gridx =iPosXOrderBy;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGeneraCreditos.ipady =150;
				
			this.jPanelOrderByGeneraCreditos.add(jScrollPanelDatosGeneraCreditosOrderBy, this.gridBagConstraintsGeneraCreditos);//this.jTableDatosGeneraCreditosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGeneraCreditos = new JButtonMe();
			this.jButtonCerrarOrderByGeneraCreditos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGeneraCreditos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGeneraCreditos.setToolTipText("Cancelar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGeneraCreditos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGeneraCreditos.add(this.jButtonCerrarOrderByGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGeneraCreditos = new GridBagLayout();
			
			this.jScrollPanelOrderByGeneraCreditos= new JScrollPane(jPanelOrderByGeneraCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.gridy =iPosYOrderBy;
			this.gridBagConstraintsGeneraCreditos.gridx =iPosXOrderBy;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGeneraCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGeneraCreditos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGeneraCreditos);
			
			this.jInternalFrameOrderByGeneraCreditos.getContentPane().add(this.jScrollPanelOrderByGeneraCreditos, this.gridBagConstraintsGeneraCreditos);			
		
		} else {
			this.jButtonAbrirOrderByGeneraCreditos = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.generacreditosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosGeneraCreditos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGeneraCreditos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGeneraCreditos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosGeneraCreditos.getRowHeight();//GeneraCreditosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GeneraCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGeneraCreditos.isSelected()) {
					iHeightTable=GeneraCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GeneraCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GeneraCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GeneraCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGeneraCreditos.isSelected()) {
					iHeightTable=GeneraCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GeneraCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GeneraCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGeneraCreditos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGeneraCreditos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGeneraCreditos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGeneraCreditos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGeneraCreditos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGeneraCreditos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGeneraCreditos!=null && this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy()!=null) {
			//if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGeneraCreditos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGeneraCreditos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGeneraCreditos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGeneraCreditos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGeneraCreditos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGeneraCreditos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=generacreditosLogic.getGeneraCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=generacreditoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GeneraCreditos> TraerGeneraCreditosBeans(List<GeneraCreditos> generacreditoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(GeneraCreditos generacreditos:generacreditoss) {
					
				if(!(GeneraCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GeneraCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					generacreditos.setsDetalleGeneralEntityReporte(GeneraCreditosConstantesFunciones.getGeneraCreditosDescripcion(generacreditos));
										
						
					
						
					
				} else  {
							
					//generacreditos.setsDetalleGeneralEntityReporte(generacreditos.getsDetalleGeneralEntityReporte());
										
				}
				
				//generacreditosbeans.add(generacreditosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return generacreditoss;
    }
	//PARA REPORTES FIN
}
